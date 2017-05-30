This is a small example of how Test-driven development works.

The task is to implement a small program that can determine the type of a triangle. It should take the lengths of the triangle's three sides as input, and return whether the triangle is equilateral, isosceles or scalene.

The basic idea of TDD is to loop over the 3 following steps until you program is done:
1. Create a test and make it fail.
2. Make the test pass.
3. Refactor the code.

The unit tests include express the following requirements:
* We must be able to determine whether a triangle is equilateral, isosceles or scalene.
* The triangle must be a valid triangle (ie. the triangle inequality must hold.)