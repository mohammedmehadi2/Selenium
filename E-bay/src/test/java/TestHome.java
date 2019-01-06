import Base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends CommonApi {
    SearchBox searchboxobject;
    @BeforeMethod
    public void initt(){
        searchboxobject = PageFactory.initElements(driver,SearchBox.class);
    }
    @Test(priority = 1)
    public void test1(){
        searchboxobject.searchbox();
    }
    @Test(priority = 2)
    public void yoe(){
        searchboxobject.motors();
    }
}
