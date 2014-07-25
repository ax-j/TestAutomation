import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

	private WebDriver driver;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getText() {

		return driver
				.findElement(
						By.xpath("html/body/div[2]/table/tbody/tr/td[2]/div[1]/div/span[1]"))
				.getText();
	}

}
