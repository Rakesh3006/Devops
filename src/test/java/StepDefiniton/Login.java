package StepDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class Login {
        @Given("Enter the login pwd to")
        public void enter_the_login_pwd_to() throws Exception {
            System.out.println("rakesh s");
            System.out.println("kosu");
            LoginSign.click_on_ok_to_continue();

        }



}
