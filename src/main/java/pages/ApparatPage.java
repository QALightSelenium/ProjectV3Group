package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApparatPage extends ParentPage
{
    @FindBy(xpath = ".//a[@href='http://v3.test.itpmgroup.com/dictionary/apparat/edit']")
    private WebElement buttonAdd;

    public ApparatPage(WebDriver webDriver)
    {
        super(webDriver);
    }

    public void cliclOnAddButton()
    {
        actionsWithWebElements.ClickToElements(buttonAdd);
    }

    public boolean isApparatInList(String apparatComment)
    {
        return actionsWithWebElements.isElementPresent(".//*[text()='" + apparatComment + "']");
    }
}
