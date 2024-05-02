package pageobjects;

import org.testng.annotations.Test;

public class TranslateTest extends BaseClass {


        @Test
        public void testTranslation() {
            TranslatePage.enterText("Hello, how are you?");
            String sinhalaTranslation = TranslatePage.getTranslation("si");
            String tamilTranslation = TranslatePage.getTranslation("ta");

            // Assert the translations
            assert sinhalaTranslation.equals("හායි, කොහොමද ඔබ?");
            assert tamilTranslation.equals("ஹலோ, நீங்கள் எப்படி உள்ளீர்கள்?");
        }
}
