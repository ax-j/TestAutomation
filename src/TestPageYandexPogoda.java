import static org.junit.Assert.assertTrue;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestPageYandexPogoda {

	private FirefoxDriver driver;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get("http://pogoda.yandex.ru");
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void testSearch() {

		HomePage home = new HomePage(driver);
		ResultPage result = home.search("ενηΰ");
		assertTrue(result.getText().contains("ενηΰ"));
	}
}
