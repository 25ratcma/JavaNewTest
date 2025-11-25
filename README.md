[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/_haRoRWg)
# Group Assignment

READ THIS ENTIRE README FILE CAREFULLY BEFORE BEGINNING THE ASSIGNMENT.

Heads up!  Completing this assignment will require reading through documentation. This assignment cannot be completed by simply following step-by-step instructions. You will need to first understand the design patterns and then implement the required classes and methods based on the provided Java Docs and unit tests.

IT IS VERY LIKELY THIS ASSIGNMENT WILL TAKE LONGER THAN YOU EXPECT.  PLAN ACCORDINGLY.

This assignment will allow you to demonstrate your knowledge of the following topics:

* Classes holding constant values
* Object-oriented programming principles
* Interfaces
* Factory design patterns
* Enums
* Polymorphism
* Method overriding/overloading
* JavaDocs
* Packages
* Code portability
* Advanced techniques in code design
* Reading and understanding specifications
* Unit testing
* Abstract classes

---

## Group Participation

This assignment is very similar to the individual assignment.  In the first assignment your team (pretend it was a team) built out the noncommercial package.  In this assignment you and your new team (assigned group) will build out the commercial package. 

The framework is largely the same, but there are differences. The engine inside commercial vehicles are often manufactured by other companies (e.g. Cummins).  Below are some tasks that your group needs to complete in order to get credit for this assignment. 

1. Elect group members for the following positions:
  - Project Manager
    - Represents the group to the TA and course instructor.
    - This person will notify the TA and Instructor with ETA dates and milestones completed.
    - Will notify TA/Instructor of people not participating.
  - SCRUM Master
    - Organizes the group and makes sure everyone is on task.
    - This person will notify everyone when to pull in changes from merges.
    - Will make sure everyone participates.
  - Lead Software Developer
    - This person will be in charge of merging branches.
    - This person will also be the person that will supply the starting code for all members of the group.
    - This person will help others come up to speed on changes.
  - Technical Writer
    - This person will be in charge of creating the JavaDocs and creating the code blocks that are used for JavaDocs
    - This person should solicit feedback on documentation.
    - Developers should add inline comments, but this person will convert inline comments to meaningful and helpful code block comments for JavaDocs.
    - Should use IntelliJ JavaDocs feature (Generate Docs). 
  - TWO QA Engineers
    - These people will be in charge of adding unit tests to extend existing unit tests.
    - The existing unit tests should not be altered.  A new empty package exists for group unit tests to be added.
  - EVERYONE IN THE GROUP IS A SOFTWARE DEVELOPER.
    - In real life, the Project Manager, Technical writer, and SCRUM master may not be developers.
    - EVERYONE MUST COLLABORATE ON SLACK
2. Project manager will be the first to accept the assignment and will name the group `group_n` where `n` is the group number (PDF document).
3. SCRUM Master will notify everyone when the group has been created and that everyone should join (accept the assignment using the created group).
4. Lead software developer will push their completed work from the individual assignment to the group assignment repo.
5. SCRUM Master will notify all users to pull in the changes.
6. Everyone will review the lead's work and make sure they understand.
7. Work begins on creating the `commercial` package.
8. Group should use branches (new unit tests, commerical package, java doc updates, etc).
9. Lead will merge branches into `main` repo.
10. Once instructor unit tests pass, new unit tests (at least 20 files) have been created and passing, and everything merged into main the assignment is complete
11. Project manager will notify TA and Instructor the assignment is complete.

There will be several checkpoint and Blackboard assignments that will serve as milestones for the group.



## Product Owner Directive

As your Java instructor, I need to evaluate your ability to read code documentation and implement the required functionality in Java classes.  I need to make sure that you can follow the specifications and understand how to use derived classes, enums, interfaces, and abstract classes to implement factory design patterns.


## Acceptance Criteria

To receive full credit for this assignment, you must meet the following acceptance criteria:

* Create a file structure as shown in the vehicle_structure.txt file.
* A Java Docs folder has been created from the solution code.  You can find the generated Java Docs in the `docs` folder.
* Use the Java Docs to identify the missing packages, classes, methods, and interfaces that need to be implemented.
* You may not modify any unit tests.
* Your assignment is not considered complete until you have pushed your code to the GitHub repository and all unit tests pass in the GitHub workflow autograder.
* The GitHub workflow file must not be altered.  If it is altered, in any fashion, you will need to restart the assignment (delete the repository and reaccept the assignment again).  Otherwise, you will receive a grade of zero for the assignment. Altered workflow files get detected automatically.
* Running tests locally is not sufficient.  There is a chance that a refactoring attempt in IntelliJ may alter the code in the unit tests.  Please make sure you limit the scope of your refactoring to solution code only.
* The file full_output.txt contains the expected output when running the main driver class.  Your program must match this output exactly.
* String formatting, including spaces (tabs versus spaces), must match exactly.
* You are largely responsible for identifying the missing code based on the Java Docs and the provided unit tests.


## Collaboration Policy
You are encouraged to collaborate with your classmates on this assignment. However, you must adhere to the following collaboration policy:
* You may discuss general concepts and approaches to the assignment with your classmates.
* You may not share code snippets or solutions with your classmates.
* You must write your own code and ensure that it is entirely your own work.
* You may not seek help from any individual other than the TA and instructor.

## Suggested Approach
You consider the following approach to complete the assignment:
1. Open the Java Docs located in the `docs` folder to understand the structure and requirements of the classes and interfaces you need to implement. It is best viewed in a web browser. Right-click on the `index.html` file and choose "Open with" and select your web browser.
2. Review the provided unit tests to understand the expected behavior of the classes and methods you need to implement.  Do not modify any unit tests.
3. Start by creating the necessary packages and classes as indicated in the Java Docs. Even if you are not initially sure about the implementation details, creating the file/project/package structure will help you organize your work.
4. Implement the classes and methods step by step, referring back to the Java Docs and unit tests as needed.
5. Complete the HarleyDavidson class first. Then run the associated unit test class/file (unit test class labelled as `harleyTest`). 
6. Once the Harley Davidson package/class is complete and all associated unit tests pass, move on to create the other motorcycle class (BMW).
7. Once the motorcycle classes are complete, create the package/class for the trucks (Ford and Chevy).
8. Once all unit tests are passing locally, push your code to the GitHub repository.
9. Verify that all unit tests pass in the GitHub workflow autograder by checking the "Actions" tab in your GitHub repository. A green checkmark indicates that all tests have passed.

## Grading Criteria

This assignment is worth 100 points. Below is a breakdown of how points will be awarded:

* **10 points**: Accepting the assignment
* **20 points**: Making the first commit
* **70 points**: Passing all unit tests on the GitHub workflow autograder

No partial credit will be awarded for any of the categories listed above. As a result, there are only four possible grades for this assignment:

* **0 points**: Assignment was not accepted.
* **10 points**: Assignment was accepted.
* **30 points**: Assignment was accepted, and a commit was pushed to the repository.
* **100 points**: Assignment was accepted, commits were pushed to the GitHub repository, and all GitHub workflow autograder unit tests were passed (green checkmark).  
