Feature: VirginGames GBP API Test

  Background: User is on Virgin Games API

  Scenario: Verify jackpotId is Roxor Progressives
    When User sends a request to get all GBP data
    Then Verify Jackpot id is Roxor Progressives

  Scenario: Verify pots 5th id is play-classic-wilds-progressive
    When User sends a request to get all GBP data
    Then Verify 5th id is play-classic-wilds-progressive

  Scenario: Verify currency is GBP
    When User sends a request to get all GBP data
    Then Verify currency is GBP

  Scenario: Verify currency is EUR
    When User sends a request to get all EUR data
    Then Verify currency is EUR

  Scenario: Verify EUR amount for 2nd index is EUR 65385.3
    When User sends a request to get all EUR data
    Then Verify EUR amount for 2nd index is EUR 65385.3