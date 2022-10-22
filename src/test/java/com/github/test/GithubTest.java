package com.github.test;

import com.github.BaseTest;
import com.github.block.HeaderBlockPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GithubTest extends BaseTest {

    @Test
    void checkWebSiteTestEnterpriseTest() {
        open("/", HeaderBlockPage.class)
                .hoverCursor("Solutions")
                .clickHeader("Enterprise")
                .checkWebSite();
    }

}
