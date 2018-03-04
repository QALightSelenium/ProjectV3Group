package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditApparatPage extends ParentPage {
    @FindBy(id="apparat_apparatNumber")
    private WebElement inputApparatNumber;
    @FindBy(id="apparat_apparatComment")
    private WebElement inputApparatComment;
    @FindBy(name="add")
    private WebElement buttonSozdat;

    public EditApparatPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterTextInToInputApparatNumber(String apparatNumber) {
        actionsWithWebElements.InputToTextField(inputApparatNumber,apparatNumber);

    }

    public void enterTextInToInputApparatComment(String apparatComment) {
        actionsWithWebElements.InputToTextField(inputApparatComment, apparatComment);
    }

    public void clickOnSozdatButton() {
        actionsWithWebElements.ClickToElements(buttonSozdat);
    }
}
