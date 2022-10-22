package com.github.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {

    public void checkWebSite(){
        $(".h1-mktg.mb-3").shouldHave(text("Build like the best"));
    }
}
