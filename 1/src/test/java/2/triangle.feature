Feature: assert Isosceles triangle.
Scenario: Calculating with the tree operations
Given I use the calculater1
When I enter "100" into one angle
And I enter "4" into one side
And I enter "40" into other side
Then the calculated result is "Obtuse Isosceles Triangle"

