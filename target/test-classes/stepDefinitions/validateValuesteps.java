package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validateValuesteps {

    public WebDriver driver;

    @Given("I am on the (.*) environment")
    public void iamOnTheEnvironment(String environment) {
        if (environment.equals("staging")) {
            driver = new ChromeDriver();
            driver.get("https://www.highcharts.com/demo/bar-basic");
        } else if (environment.equals("production")) {
            driver = new ChromeDriver();
            driver.get("https://www.highcharts.com/demo/bar-basic/brand-light");
        } else {
            throw new IllegalArgumentException("Unsuported Environment:" + environment);
        }
    }

    @When ("I check value population on africa in 1990 year should be as expected \"631\"")
    public void validateValueAfrica1990(){
        driver.findElement(By.xpath("//*[@aria-label=\"Africa, 631 millions. Year 1990.\"]")).getText().equals("Africa,631 millions. Year 1990.");
    }

    @Then ("I check value population on africa in 2000 year should be as expected \"814\"")
    public void validateValueAfrica2000(){
        driver.findElement(By.xpath("//*[@aria-label=\"Africa, 814 millions. Year 2000.\"]")).getText().equals("Africa, 814 millions. Year 2000.");
    }

    @Then ("I check value population on africa in 2010 year should be as expected \"1044\"")
    public void validateValueAfrica2010(){
        driver.findElement(By.xpath("//*[@aria-label=\"Africa, 1,044 millions. Year 2010.\"]")).getText().equals("Africa, 1,044 millions. Year 2010.");
    }

    @Then ("I check value population on africa in 2018 year should be as expected \"1276\"")
    public void validateValueAfrica2018(){
        driver.findElement(By.xpath("//*[@aria-label=\"Africa, 1,276 millions. Year 2018.\"]")).getText().equals("Africa, 1,276 millions. Year 2018..");
    }

    @Then ("I check value population on america in 1990 year should be as expected \"\"")
    public void validateValueAmerica1990(){
        driver.findElement(By.xpath("//*[@aria-label=\"America, 727 millions. Year 1990.\"]")).getText().equals(" ");
    }

    @Then ("I check value population on america in 2000 year should be as expected \"841\"")
    public void validateValueAmerica2000(){
        driver.findElement(By.xpath("//*[@aria-label=\"America, 841 millions. Year 2000.\"]")).getText().equals("Africa, 1,276 millions. Year 2018..");
    }

    @Then ("I check value population on america in 2010 year should be as expected \"\"")
    public void validateValueAmerica2010(){
        driver.findElement(By.xpath("America, 944 millions. Year 2010.\"]")).getText().equals("");
    }

    @Then ("I check value population on america in 2018 year should be as expected \"1077\"")
    public void validateValueAmerica2018(){
        driver.findElement(By.xpath("America, 1,007 millions. Year 2018.\"]")).getText().equals("America, 1,007 millions. Year 2018.");
    }

    @Then ("I check value population on asia in 1990 year should be as expected \"3202\"")
    public void validateValueAsia1990(){
        driver.findElement(By.xpath("Asia, 3,202 millions. Year 1990.\"]")).getText().equals("Asia, 3,202 millions. Year 1990.");
    }

    @Then ("I check value population on asia in 2000 year should be as expected \"3714\"")
    public void validateValueAsia2000(){
        driver.findElement(By.xpath("Asia, 3,714 millions. Year 2000.\"]")).getText().equals("Asia, 3,714 millions. Year 2000.");
    }

    @Then ("I check value population on asia in 2010 year should be as expected \"4170\"")
    public void validateValueAsia2010(){
        driver.findElement(By.xpath("Asia, 4,170 millions. Year 2010.\"]")).getText().equals("Asia, 4,170 millions. Year 2010.");
    }

    @Then ("I check value population on asia in 2018 year should be as expected \"4561\"")
    public void validateValueAsia2018(){
        driver.findElement(By.xpath("Asia, 4,561 millions. Year 2018.\"]")).getText().equals("Asia, 4,561 millions. Year 2018.");
    }

    @Then ("I check value population on europe in 1990 year should be as expected \"\"")
    public void validateValueEurope1990(){
        driver.findElement(By.xpath("Europe, 721 millions. Year 1990.\"]")).getText().equals("");
    }

    @Then ("I check value population on europe in 2000 year should be as expected \"726\"")
    public void validateValueEurope2000(){
        driver.findElement(By.xpath("Europe, 721 millions. Year 1990.\"]")).getText().equals("Europe, 721 millions. Year 1990.");
    }

    @Then ("I check value population on europe in 2010 year should be as expected \"\"")
    public void validateValueEurope2010(){
        driver.findElement(By.xpath("Europe, 735 millions. Year 2010.\"]")).getText().equals("");
    }

    @Then ("I check value population on europe in 2018 year should be as expected \"746\"")
    public void validateValueEurope2018(){
        driver.findElement(By.xpath("Europe, 746 millions. Year 2018.\"]")).getText().equals("Europe, 746 millions. Year 2018.");
    }

    @Then ("I check value population on oceania in 1990 year should be as expected \"26\"")
    public void validateValueOceania1990(){
        driver.findElement(By.xpath("Oceania, 26 millions. Year 1990.\"]")).getText().equals("Oceania, 26 millions. Year 1990.");
    }

    @Then ("I check value population on oceania in 2000 year should be as expected \"\"")
    public void validateValueOceania2000(){
        driver.findElement(By.xpath("Oceania, 31 millions. Year 2000.\"]")).getText().equals("Oceania, 31 millions. Year 2000.");
    }

    @Then ("I check value population on oceania in 2010 year should be as expected \"40\"")
    public void validateValueOceania2010(){
        driver.findElement(By.xpath("Oceania, 40 millions. Year 2010.\"]")).getText().equals("Oceania, 40 millions. Year 2010.");
    }

    @Then ("I check value population on oceania in 2018 year should be as expected \"\"")
    public void validateValueOceania2018(){
        driver.findElement(By.xpath("Oceania, 42 millions. Year 2018.\"]")).getText().equals("");
    }

}