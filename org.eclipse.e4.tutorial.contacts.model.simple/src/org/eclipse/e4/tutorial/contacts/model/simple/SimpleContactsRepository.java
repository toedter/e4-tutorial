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

package org.eclipse.e4.tutorial.contacts.model.simple;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.e4.tutorial.contacts.model.Contact;
import org.eclipse.e4.tutorial.contacts.model.ContactsRepository;

public class SimpleContactsRepository implements ContactsRepository {
	private final IObservableList contacts;
	
	public SimpleContactsRepository() {
		List<Contact> contactList = new ArrayList<Contact>();
		contactList.add(new SimpleContact("Kai", "Tödter", "kai@toedter.com"));
		contactList.add(new SimpleContact("Tom", "Schindl", "tom.schindl@bestsolution.at"));
		contactList.add(new SimpleContact("Lars", "Vogel", "lars.vogel@googlemail.com"));
		contacts = new WritableList(contactList, null);
	}

	@Override
	public void addContact(final Contact contact) {
		contacts.add(contact);
	}

	@Override
	public void removeContact(final Contact contact) {
		contacts.remove(contact);
	}

	@Override
	public IObservableList getAllContacts() {
		return contacts;
	}

}
