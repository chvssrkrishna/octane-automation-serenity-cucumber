package screenplay.generic.navigation;

import screenplay.generic.file_reader.Environment_File_Reader_Step_Definitions;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import screenplay.generic.navigation.tasks.NavigateTo;

public class NavigateStepDefinitions extends Environment_File_Reader_Step_Definitions {
    @Given("{actor} launch customer home page of dealer {string}")
    public void launchCustomerHomePage(Actor actor,String dealer) {
        actor.wasAbleTo(NavigateTo.theCustomerHomePage(getCustomerUrl(dealer)));
    }

}