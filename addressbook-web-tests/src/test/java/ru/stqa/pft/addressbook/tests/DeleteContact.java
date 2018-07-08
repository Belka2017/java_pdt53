package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class DeleteContact extends TestBase {

    @Test
    public void testDeleteContact(){
        app.getContactHelper().initHome();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("Ella", "Gololobova", "Moscow", "84956262626", "89052322323", "kot@mail.ru", "pol@mail.ru", "test1"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().aceptDelete();

    }
}
