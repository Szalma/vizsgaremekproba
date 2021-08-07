package vizsgaremek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DataList {

    WebDriver driver;
    private final By ABOUT_US =By.xpath("//*[@id=\"block_various_links_footer\"]/ul/li[8]/a");
    private final By PAGES =By.xpath("//*[@id=\"listpage_content\"]/div[2]/div/ul");
    private final By PAGE =By.xpath(".//li//a");

    public DataList(WebDriver driver){
        this.driver=driver;
    }

    public void clickAboutUs(){
       driver.findElement(ABOUT_US).click();
    }

    public boolean creatDataList(String title ) {
            boolean result=false;
            List<WebElement> list=driver.findElements(PAGES);
            for (WebElement element : list) {
                WebElement link =element.findElement(PAGE);
                if (link.getText().toLowerCase().contains(title.toLowerCase())){
                    link.click();
                    result=true;
                }
        }return result;
    }
}
