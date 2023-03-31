import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CardTest {
    @Test
    void test() {
        Configuration.headless = true ;
        open("http://localhost:9999/");
    }
}
