package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @Test
    public void testAddContact() {
        gotoAddNewContact();
        fillNewContactForm(new ContactData("Ella", "Gololobova", "Moscow", "84956262626", "89052322323", "kot@mail.ru", "pol@mail.ru"));
        submitNewContact();
        returnToHomePage();
    }

}
