package github;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.open;

public class HoverSolutions {
    @Test
    void HoverTest(){
        open("https://github.com");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".logged-out").shouldHave(text("Build like the best"));

        sleep(5000);



    }
}
