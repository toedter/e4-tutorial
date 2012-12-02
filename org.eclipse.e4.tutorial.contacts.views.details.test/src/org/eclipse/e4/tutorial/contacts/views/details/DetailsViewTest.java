package org.eclipse.e4.tutorial.contacts.views.details;

import static org.junit.Assert.assertEquals;

import org.eclipse.e4.tutorial.contacts.model.Contact;
import org.eclipse.e4.tutorial.contacts.model.simple.SimpleContact;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.junit.Test;

public class DetailsViewTest {

	@Test
	public void shouldSetContactSelection() {
		Composite parent = new Shell();
		DetailsView detailsView = new DetailsView(parent);

		Contact contact = new SimpleContact("Kai", "Tödter", "kai@toedter.com");
		detailsView.setSelection(contact);

		assertEquals("Kai", detailsView.getFirstNameText().getText());
		assertEquals("Tödter", detailsView.getLastNameText().getText());
		assertEquals("kai@toedter.com", detailsView.getEmailText().getText());
	}

}
