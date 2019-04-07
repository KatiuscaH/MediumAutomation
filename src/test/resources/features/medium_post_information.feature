Feature: Verify information for medium post
  As a medium user
  I want to know the date and the read time of posts
  To decide if I read the post or not the post

    Scenario: Validate information
      Given the medium home page loaded
      When "Katty" search the post stored in a excel file
      Then the information about each post should be the same
