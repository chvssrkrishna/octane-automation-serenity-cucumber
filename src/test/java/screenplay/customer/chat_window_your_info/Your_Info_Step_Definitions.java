package screenplay.customer.chat_window_your_info;

import io.cucumber.java.en.Then;
import model.Context;
import model.CustomerContactInfo;
import net.serenitybdd.screenplay.Actor;
import screenplay.generic.file_reader.Environment_File_Reader_Step_Definitions;
import screenplay.customer.chat_window_your_info.tasks.Submit;
import screenplay.generic.data_faker.tasks.Fake_Customer;

public class Your_Info_Step_Definitions extends Environment_File_Reader_Step_Definitions {

    @Then("{actor} submit contact information")
    public void submitContactInformation(Actor actor) {
        CustomerContactInfo customerContactInfo = Fake_Customer.contactInfo();
        actor.remember(Context.CUSTOMER_CONTACT_INFO, customerContactInfo);
        actor.attemptsTo(Submit.contactInfo(customerContactInfo));
        //sytem.out.println("Customer Name : "+((ContactInfo) actor.recall(Context.CONTACT_INFO)).getFirstName());
    }
}
