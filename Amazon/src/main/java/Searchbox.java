import Base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchbox extends CommonApi {





    public void searchMenu(){
        typeonelementandenter("twotabsearchtextbox","Skateboard");
        navigateback();
        typeonelementandenter("twotabsearchtextbox","Iphone");
        navigateback();
        typeonelementandenter("twotabsearchtextbox","Gadget");
        navigateback();

    }

}
