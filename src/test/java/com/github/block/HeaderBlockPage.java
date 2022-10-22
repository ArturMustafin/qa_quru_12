package com.github.block;

import com.github.pages.EnterprisePage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class HeaderBlockPage {

    public HeaderBlockPage hoverCursor(String elementHeader) {
        $(byText(elementHeader)).hover();
        return this;
    }

    public EnterprisePage clickHeader(String nameHeaderMenu) {
        $(byText(nameHeaderMenu)).click();
        return page(EnterprisePage.class);
    }

}
