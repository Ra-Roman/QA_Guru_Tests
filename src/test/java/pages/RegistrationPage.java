package pages;

import pages.components.CalendarComponent;
import pages.components.ModalkaComponents;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    ModalkaComponents modalkaComponents = new ModalkaComponents();

    private final String titleText = "Student Registration Form";
    public RegistrationPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(titleText));
        executeJavaScript("$('footer').remove()");
        return this;
    }
    public RegistrationPage setFirstName(String value){
        $("#firstName").setValue(value);
        return this;
    }
    public RegistrationPage setLastName(String value){
        $("#lastName").setValue(value);
        return this;
    }
    public RegistrationPage setEmail(String value){
        $("#userEmail").setValue(value);
        return this;
    }
    public RegistrationPage setGender(String value){
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }
    public RegistrationPage setNumber(String value){
        $("#userNumber").setValue(value);
        return this;
    }
    public RegistrationPage setBirthDay(String day, String month, String year){
        calendarComponent.setDate( day,  month,  year);
        return this;
    }
    public RegistrationPage setSubject(String value){
        $("#subjectsInput").setValue(value).pressEnter();
        return this;
    }
    public RegistrationPage setHobbie(String value){
        $("#hobbiesWrapper").$(byText(value)).click();
        return this;
    }
    public RegistrationPage setImg(String value){
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }
    public RegistrationPage setCurrentAddress(String value){
        $("#currentAddress").setValue(value);
        return this;
    }
    public RegistrationPage setStateCity(String state, String city){
        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();
        return this;
    }
    public RegistrationPage setClickSubmit(){
        $("#submit").click();
        return this;
    }
    public RegistrationPage setModalka(){
        modalkaComponents.openModalka();
        return this;
    }
    public RegistrationPage setResultModalka (String key, String value){
        modalkaComponents.verifyResults(key, value);


        return this;
        }


}
