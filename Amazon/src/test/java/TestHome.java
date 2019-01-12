import org.testng.annotations.Test;
import reporting.TestLogger;


public class TestHome extends SearchFeature {

    @Test
    public void test1(){
        TestLogger.log("Browser is launched");
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchMenu();
    }
}
