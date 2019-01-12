
import base.CommonAPI;
import org.openqa.selenium.By;
import reporting.TestLogger;

public class SearchFeature extends CommonAPI{

    public void searchMenu(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElementNEnter("#twotabsearchtextbox","books");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","honey");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","iPhone");

    }
}
