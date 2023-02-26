package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DemoQAPracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void practiceForm() {
        String firstname = "Roman";
        String lastname = "Alexeev";
        String email = "alexeev@mail.ru";
        String number = "5551557896";
        String subject = "Arts";
        String address = "SPb";

        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");

        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue(firstname);
        $("#lastName").setValue(lastname);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue(number);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__year-select").selectOption("1990");
        $(".react-datepicker__day--030").click();
        $("#subjectsInput").setValue(subject).pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue(address);
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Karnal")).click();
        $("#submit").click();
        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".modal-content").shouldHave(text(firstname), text(lastname), text(email),
                text("Male"), text(number), text("30 March,1990"), text("Arts"), text("Music"),
                text("1.png"), text(subject), text(address), text("Haryana"), text("Karnal"));
    }
}
