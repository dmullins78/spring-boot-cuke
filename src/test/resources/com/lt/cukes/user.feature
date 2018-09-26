Feature: Can find some users

  Scenario: Makes sure test returns Tommy
    Given a user "Tommy" with id 123 exists
    When I get a user with that id
    Then the service should return a 200 status code
    Then the service should return:
    """
    {
     "id":123,
     "name":"Tommy"
    }
    """

  Scenario: Makes sure test returns Billy
    Given a user "Billy" with id 456 exists
    When I get a user with that id
    Then the service should return a 200 status code
    Then the service should return:
    """
    {
     "id":456,
     "name":"Billy"
    }
    """