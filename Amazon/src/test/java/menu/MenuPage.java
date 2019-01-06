//package menu;
//
//import base.CommonAPI;
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class MenuPage extends CommonAPI {
//    @Test
//    public void readMenuText(){
//        List<String> actualData = new ArrayList<>();
//        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
//        for(WebElement text:element){
//            actualData.add(text.getText());
//            System.out.println(text.getText());
//        }
//        //To Be implemented, to read from database
//        List<String> menuData = new ArrayList<>();
//        Assert.assertEquals(menuData,actualData);
//    }
//}
