# Challenge Summary
<!-- Description of the challenge -->
This challange is about sorting an array using Insertion Sort algorithm.You need to review the pseudocode , then trace the algorithm.

## Whiteboard Process
<!-- Embedded whiteboard image -->
![Insertion Sort](img/codeChallenge26.png)

[Insertion Sort BLOG.md](BLOG.md)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

The insertion sort is a sorting method which is most effective on an array of limited size. This sort compares an element within the array to the next value and checks to see if it is greater than that element and moves the current element to the checked elements position (if the checked element is less than the current).

Time and Space:

Time: O(n^2)

Space: O(1)

## Solution
<!-- Show how to run your code, and examples of it in action -->
[insertion sort](app/src/main/java/sorting/App.java)

[insertion sort Test](app/src/test/java/sorting/AppTest.java)

How to run the App: clone the repo from GitHub and open the project folder inside your IDE then open file.then build it ,you can run the app by `./gradlew` run,and run the test by `./gradlew` test.
