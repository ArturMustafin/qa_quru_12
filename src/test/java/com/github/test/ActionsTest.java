package com.github.test;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ActionsTest {

    @Test
    void actionsElementTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        actions()
                .moveToElement($("#column-a")).clickAndHold()
                .moveToElement($("#column-b")).release()
                .perform();

        $("#column-b").shouldHave(text("A"));

        sleep(2000);
    }

    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-b").shouldHave(text("A"));
    }

}
