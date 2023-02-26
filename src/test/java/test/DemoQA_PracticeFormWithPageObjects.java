package test;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class DemoQA_PracticeFormWithPageObjects extends TestBase{

    @Test
    void practiceForm () {
        String firstname = "Roman",
                lastname = "Alexeev",
                email = "alexeev@mail.ru",
                gender = "Male",
                number = "5551557896",
                day = "30",
                month = "March",
                year = "1990",
                subject = "Arts",
                hobbie = "Music",
                imgName = "1.png",
                imgResource = "img/1.png",
                address = "SPb",
                state = "Haryana",
                city = "Karnal";
        registrationPage.openPage()
                .setFirstName(firstname)
                .setLastName(lastname)
                .setEmail(email)
                .setGender(gender)
                .setNumber(number)
                .setBirthDay(day, month, year)
                .setSubject(subject)
                .setHobbie(hobbie)
                .setImg(imgResource)
                .setCurrentAddress(address)
                .setStateCity(state, city)
                .setClickSubmit()
                .setModalka()
                .setResultModalka("Student Name", firstname + " " + lastname)
                .setResultModalka("Student Email", email)
                .setResultModalka("Gender", gender)
                .setResultModalka("Mobile", number)
                .setResultModalka("Date of Birth", day + " " + month + "," + year)
                .setResultModalka("Subjects", subject)
                .setResultModalka("Hobbies", hobbie)
                .setResultModalka("Picture", imgName)
                .setResultModalka("Address", address)
                .setResultModalka("State and City", state + " " + city);
    }
}
