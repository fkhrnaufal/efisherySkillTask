# Tools Used
When creating this Automation Script, I've used:
 - Eclipse IDE
 - Cucumber Maven Dependencies
 - Selenium Java (JARs) files
 - Microsoft Edge Browser
 - Tidy Gherkin

# Preparation
1. On Eclipse IDE, create new Project
2. Choose Maven Project
3. Search for Cucumber on the Maven Archetype
4. Once the Project is created, create a new *lib* Folder by Right Clicking the Project > New > Folder > lib folder
5. Search for the downloaded Selenium JARs files in the computer
6. Add all Selenium JAR files (including the JAR files in lib folder) to the Project's *lib* folder (I've used all the JARs, just in case I need it)
7. Right Click again on the Project > Properties > Java Build Path > Library > Add JARs
8. Add the inserted JARs from the *lib* folder, click on Apply & Close

# Running the Tests
1. On the Project, open the feature file in the children folder of *src/test/resources > io > cucumber > EfisherySkillTaskTest* named Playback.feature. Playback test cases written using Gherkin is located in this file.
2.  Open the *StepDefinitions* file for checking the Automation script steps, based on the created Feature file. The test is created using Selenium Framework. 
3. Open the runner file, named RunCucumberTest. To run the test, click on the Play button on the toolbar, or by shortcut Ctrl+F11.
4. Microsoft Edge test browser should be opened, and the test will run using the opened browser.

# Dependencies

 - Cucumber
 - Selenium WebDriver 
 - Selenium EdgeDriver
 - Selenium ExpectedConditions
 - Selenium WebDriverWait
 - Selenium WebElement
 - Selenium By
 - Java Time Duration

# Result of the Automation

The automation script able to:
 - Runner file (_RunCucumberTest.java_) could run the Step Definitions file (_StepDefinitions_) according to the Playback Feature file (_Playback.feature_)
 - Any test results (whether it's running correctly or creating an error) could be shown on the Console
 - Open Microsoft Edge and Open Youtube Music page
 - Clicked on a song, which plays the song
 - Skip to the next song, and then return to the previous song
 - Pause the currently played song


## Test Case
I've decide to create an automated script for checking the function of Play, Pause, Skip Forward and Skip backward since it's the most used and most basic function of a Music Streaming site. It's important for the site to be able:

 - Play the selected song correctly, and without delay (besides the delay from network issues)
 - Pause the song without significant delay
 - Change to the next song on the list
 - Returns to the previously listened song

 

 

