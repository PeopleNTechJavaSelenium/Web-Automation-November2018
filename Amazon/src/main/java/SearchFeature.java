
import base.CommonAPI;
import org.openqa.selenium.By;

public class SearchFeature extends CommonAPI{

    public void searchMenu(){
        typeOnElementNEnter("#twotabsearchtextbox","books");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","honey");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","iPhone");

    }
}
