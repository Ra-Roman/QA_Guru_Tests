package test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class JUnitSimpleTest {

    @BeforeAll
    static void beforeAll(){
        open("https://obi.ru/");

    }
    @CsvFileSource (resources = "/testData.csv")
    @ParameterizedTest (name = "Поиск товара по артикулу {0}, найденный товар называется {1}")
    @Tags({@Tag ("Bogatyr"),@Tag("Vampyr")})
    void wikiSearch (
            String articul,
            String name
    ) {
        $("#search-field").setValue(articul).pressEnter();
        $("._3LdDm").shouldHave(text(name));
        System.out.println("Найден товар " + name);
        sleep(3000);
    }

}
