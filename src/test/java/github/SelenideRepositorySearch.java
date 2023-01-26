package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class SelenideRepositorySearch {
    @Test
    void show() {
        // Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        // Перейдите в раздел Wiki проекта
        $("[id=wiki-tab]").click();
        // Раскрыть список
        $(".js-wiki-more-pages-link").click();
        // Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("[id=wiki-pages-box]").shouldHave(text("SoftAssertions"));
        // Откройте страницу SoftAssertions
        $("[id=wiki-pages-box]").$(byText("SoftAssertions")).click();
        // Проверьте что внутри есть пример кода для JUnit5
        $(".logged-out.env-production.page-responsive").shouldHave(text("Using JUnit5 extend test class"));
    }
}
