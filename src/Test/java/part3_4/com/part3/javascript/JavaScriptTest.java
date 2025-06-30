package part3_4.com.part3.javascript;

import org.testng.annotations.Test;
import part3_4.com.base.BaseTest;

public class JavaScriptTest extends BaseTest {
    @Test
    public void testScrollingToElement() {
        // navigate home page
        homePage.goToForms();
    }
}
