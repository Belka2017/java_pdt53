package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().initHome();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillNewContactForm(new ContactData("Ella", "Gololobova", "Moscow", "84956262626", "89052322323", "kot@mail.ru", "pol@mail.ru", null), false);
        app.getContactHelper().updateContact();
        app.getContactHelper().returnToHomePage();
    }
}
