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

package org.eclipse.e4.tutorial.contacts.views;

import javax.inject.Inject;

import org.eclipse.core.databinding.beans.BeansObservables;
import org.eclipse.core.databinding.observable.map.IObservableMap;
import org.eclipse.e4.tutorial.contacts.model.Contact;
import org.eclipse.e4.tutorial.contacts.model.ContactsRepository;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class ListView {

	private final TableViewer tableViewer;

	@Inject
	private ESelectionService selectionService;

	@Inject
	public ListView(Composite parent, ContactsRepository contactsRepository) {
		// Table composite (because of TableColumnLayout)
		final Composite tableComposite = new Composite(parent, SWT.NONE);
		tableComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true,
				true));
		final TableColumnLayout tableColumnLayout = new TableColumnLayout();
		tableComposite.setLayout(tableColumnLayout);

		// Table viewer
		tableViewer = new TableViewer(tableComposite, SWT.FULL_SELECTION);
		tableViewer.getTable().setHeaderVisible(true);

		// first name column
		final TableViewerColumn firstNameColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		firstNameColumn.getColumn().setText("First Name");
		tableColumnLayout.setColumnData(firstNameColumn.getColumn(),
				new ColumnWeightData(40));

		// last name column
		final TableViewerColumn lastNameColumn = new TableViewerColumn(
				tableViewer, SWT.NONE);
		lastNameColumn.getColumn().setText("Last Name");
		tableColumnLayout.setColumnData(lastNameColumn.getColumn(),
				new ColumnWeightData(40));

		ObservableListContentProvider contentProvider = new ObservableListContentProvider();

		tableViewer.setContentProvider(contentProvider);

		IObservableMap[] attributes = BeansObservables.observeMaps(
				contentProvider.getKnownElements(), Contact.class,
				new String[] { "firstName", "lastName" });
		tableViewer
				.setLabelProvider(new ObservableMapLabelProvider(attributes));

		tableViewer.setInput(contactsRepository.getAllContacts());

		GridLayoutFactory.fillDefaults().generateLayout(parent);

		tableViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {
					@Override
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection selection = (IStructuredSelection) event
								.getSelection();
						selectionService.setSelection(selection
								.getFirstElement());
					}
				});

	}
}
