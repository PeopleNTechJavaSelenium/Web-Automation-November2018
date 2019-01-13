package tabledata;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestTable extends CommonAPI {

    @Test
    public void readCell(){
        List<WebElement> listOfWebElement = getListOfWebElementsByCss(".w3-table-all.notranslate tr");
        List<String> cells = getListOfString(listOfWebElement);
        for(String st:cells){
            System.out.println(st);
        }
        //String cell = getTextByCss(".w3-table-all.notranslate tr:nth-child(4) td:nth-child(2)");
        System.out.println(cells);
    }
}
