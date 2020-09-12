Feature: As a hungry student I want to eat enough cakes so that my belly growls

  Scenario: Eat a few cukes #1
    Given If I eat 42 cukes
    And I wait 2 hours
    Then my belly should growl

  Scenario: Eat a few cukes #2
    Given If I eat 20 cukes
    And I wait 2 hours
    Then my belly should growl