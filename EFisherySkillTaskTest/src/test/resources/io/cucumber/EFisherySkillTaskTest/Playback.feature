
Feature: Playback function on Youtube Music
				
  Scenario Outline: Play, Pause, and Skip the songs
    Given user on the homepage
    When user click one of the songs in the homepage
    And user click at next song
    And user click at previous song
    And user pause the selected song by clicking the pause button
    Then the song will be played, paused, skipped forward and skipped backwards
