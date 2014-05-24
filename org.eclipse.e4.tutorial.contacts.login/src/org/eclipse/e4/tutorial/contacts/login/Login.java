/*******************************************************************************
 * Copyright (c) 2012 Kai Toedter and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Toedter - initial implementation
 ******************************************************************************/

package org.eclipse.e4.tutorial.contacts.login;

import javax.inject.Inject;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.tutorial.contacts.login.internal.LoginDialog;
import org.eclipse.e4.ui.internal.workbench.E4Workbench;
import org.eclipse.e4.ui.internal.workbench.swt.E4Application;
import org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.osgi.service.prefs.BackingStoreException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Login {
	private static Logger logger = LoggerFactory.getLogger(Login.class);

	@PostContextCreate
	public void login(IEclipseContext context,
			@Preference IEclipsePreferences preferences,
			@Preference(value = "user") String userPreference,
			@Preference(value = "password") String passwordPreference) {
		final Shell shell = new Shell(SWT.INHERIT_NONE);

		final LoginDialog dialog = new LoginDialog(shell);
		if (userPreference != null) {
			dialog.setUser(userPreference);
		}
		if (passwordPreference != null) {
			dialog.setPassword(passwordPreference);
		}
		dialog.create();

		String cssTheme = "org.eclipse.e4.tutorial.contacts.themes.login";
		context.set(E4Application.THEME_ID, cssTheme);
		String cssURI = "css/login2.css";
		context.set(E4Workbench.CSS_URI_ARG, cssURI);

		PartRenderingEngine.initializeStyling(shell.getDisplay(), context);

		if (dialog.open() != Window.OK) {
			// we don't have a workbench yet...
			System.exit(0);
		} else {
			preferences.put("user", dialog.getUser());
			preferences.put("password", dialog.getPassword());
			try {
				preferences.flush();
			} catch (BackingStoreException e) {
				logger.warn("Cannot store login preferences");
			}
		}
	}
}
