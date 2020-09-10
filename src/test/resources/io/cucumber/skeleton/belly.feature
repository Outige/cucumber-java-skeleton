Feature: Belly

  Scenario: a few cukes #1
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl

  # this will fail because cukes must be non-negative
  Scenario: a few cukes #2
    Given I have -10 cukes in my belly
    When I wait 3 hour
    Then my belly should growl