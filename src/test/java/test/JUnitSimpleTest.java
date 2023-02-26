package test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
    void obiSearchFile (
            String articul,
            String name
    ) {
        $("#search-field").setValue(articul).pressEnter();
        $("._3LdDm").shouldHave(text(name));
        System.out.println("Найден товар " + name);
        sleep(3000);
    }
    @ValueSource (
            strings ={"4895140", "3958998"}
    )
    @ParameterizedTest (name = "Поиск товара по артикулу {0}, найденный товар называется {1}")
    @Tags({@Tag ("Bogatyr"),@Tag("Vampyr")})
    void obiSearchValue (String articul) {
        $("#search-field").setValue(articul).pressEnter();
        $("._3LdDm").shouldHave(text("Перфоратор"));
        System.out.println("Найден товар " +articul);
        sleep(3000);
    }
    @CsvSource({
            "5050378, Дрель аккумуляторная",
            "3958998, Перфоратор ИНТЕРСКОЛ"
    })
    @ParameterizedTest (name = "Поиск товара по артикулу {0}, найденный товар называется {1}")
    @Tags({@Tag ("Bogatyr"),@Tag("Vampyr")})
    void obiSearchCsv (
            String articul,
            String name
    ) {
        $("#search-field").setValue(articul).pressEnter();
        $("._3LdDm").shouldHave(text(name));
        System.out.println("Найден товар " + name);
        sleep(3000);
    }
}

