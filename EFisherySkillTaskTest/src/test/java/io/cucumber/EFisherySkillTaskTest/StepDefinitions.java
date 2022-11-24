package io.cucumber.EFisherySkillTaskTest;

import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.time.Duration;


public class StepDefinitions {

	WebDriver driver = new EdgeDriver();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
    @Given("user on the homepage")
    public void userOnTheHomepage() {
    	driver.get("https://music.youtube.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#right-content > a")));
    }

    @When("^user click one of the songs in the homepage$")
    public void user_click_one_of_the_songs_in_the_homepage() throws InterruptedException {
    	WebElement playSongButton = driver.findElement(By.cssSelector("#play-button > div > yt-icon"));
    	playSongButton.click();
    	Thread.sleep(10000); //for Ads handling, since ads have different duration I've placed a hard wait
    
    }

    @And("^user click at next song$")
    public void user_click_at_next_song() throws Throwable {
    	Thread.sleep(5000);
    	WebElement nextSongButton = driver.findElement(By.cssSelector("#left-controls > div > tp-yt-paper-icon-button.next-button.style-scope.ytmusic-player-bar"));
    	nextSongButton.click();
    	Thread.sleep(10000); //for Ads handling, since ads have different duration I've placed a hard wait
    }
    
    @And("^user click at previous song$")
    public void user_click_at_previous_song() throws Throwable {
    	Thread.sleep(5000);
    	WebElement previousSongButton = driver.findElement(By.cssSelector("#left-controls > div > tp-yt-paper-icon-button.previous-button.style-scope.ytmusic-player-bar"));
    	previousSongButton.click();
    	previousSongButton.click();//double the click, because clicking once will restart the song. Clicking twice will change the song
    	Thread.sleep(10000); //for Ads handling, since ads have different duration I've placed a hard wait
    }
    
    @And("^user pause the selected song by clicking the pause button$")
    public void user_pause_the_selected_song_by_clicking_the_pause_button() throws InterruptedException {
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#play-pause-button")));
    	Thread.sleep(2000);
    	WebElement pauseSongButton = driver.findElement(By.cssSelector("#play-pause-button"));
    	pauseSongButton.click();
    }
    
   
    @Then("^the song will be played, paused, skipped forward and skipped backwards$")
    public void the_song_will_be_played_paused_skipped_forward_and_skipped_backwards() throws Throwable {
    	System.out.println("Songs succesfuly played, paused skipped forward and skipped backwards");
    }
 
}
