package search;

import base.CommonAPI;

public class SearchPage extends CommonAPI{

    public void searchMenu(){
        typeOnElementNEnter("#twotabsearchtextbox","books");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","honey");
        navigateBack();
        typeOnElementNEnter("#twotabsearchtextbox","iPhone");

    }
}
