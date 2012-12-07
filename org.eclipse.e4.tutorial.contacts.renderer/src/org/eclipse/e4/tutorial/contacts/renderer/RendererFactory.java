/*******************************************************************************
 * Copyright (c) 2010 Kai Toedter and others.
 * 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Contributors:
 *     Kai Toedter - initial implementation
 ******************************************************************************/

package org.eclipse.e4.tutorial.contacts.renderer;

import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RendererFactory extends WorkbenchRendererFactory {
	
	private static Logger logger = LoggerFactory.getLogger(RendererFactory.class);
	@Override
	public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
		logger.debug("Rendering UI model element: " + uiElement.getClass());
		return super.getRenderer(uiElement, parent);
	}
}
