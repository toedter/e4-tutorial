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

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.tutorial.contacts.login.internal.LoginDialog;
import org.eclipse.e4.ui.internal.workbench.E4Workbench;
import org.eclipse.e4.ui.internal.workbench.swt.E4Application;
import org.eclipse.e4.ui.internal.workbench.swt.PartRenderingEngine;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;

public class Login {
	@PostContextCreate
	public void login(IEclipseContext context) {
		final Shell shell = new Shell(SWT.INHERIT_NONE);

		final LoginDialog dialog = new LoginDialog(shell);
		dialog.create();

		String cssTheme = "org.eclipse.e4.tutorial.contacts.themes.login";
		context.set(E4Application.THEME_ID, cssTheme);
		String cssURI = "css/login.css";
		context.set(E4Workbench.CSS_URI_ARG, cssURI);

		PartRenderingEngine.initializeStyling(shell.getDisplay(), context);

		if (dialog.open() != Window.OK) {
			System.exit(0);
		}
	}
}
