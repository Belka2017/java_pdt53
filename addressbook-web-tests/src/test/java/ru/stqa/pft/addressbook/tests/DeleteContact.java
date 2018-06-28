package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase {

    @Test
    public void testDeleteContact(){
        app.getContactHelper().initHome();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().aceptDelete();

    }
}
