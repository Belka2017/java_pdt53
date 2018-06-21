package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class AddContactTests extends TestBase {

    @Test
    public void testAddContact() {
        app.getContactHelper().gotoAddNewContact();
        app.getContactHelper().fillNewContactForm(new ContactData("Ella", "Gololobova", "Moscow", "84956262626", "89052322323", "kot@mail.ru", "pol@mail.ru"));
        app.getContactHelper().submitNewContact();
        app.getContactHelper().returnToHomePage();
    }

}
