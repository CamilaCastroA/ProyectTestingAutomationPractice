Feature: validate email exists

  Scenario: Successful validate
    Given camila has a registered email
    When put email
    Then Do not register email again