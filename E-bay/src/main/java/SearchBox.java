import Base.CommonApi;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends CommonApi {
    @FindBy(linkText = "Motors")
    WebElement motors;
    public void searchbox(){
        typeonelementandenter("gh-ac","Skateboard");
        navigateback();
        typeonelementandenter("gh-ac","Smartphone");
        navigateback();
        typeonelementandenter("gh-ac","gadget");
        navigateback();

    }
    public void motors(){
        motors.click();
    }
}
