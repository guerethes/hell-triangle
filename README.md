Hell Triangle
==================================
---------------
Given a triangle of numbers, find the maximum total from top to bottom.

Example:

```sh
   6    
  3 5   
 9 7 1  
4 6 8 4
```

 > In this triangle the maximum total is 6 + 5 + 7 + 8 = 26

An element can only be summed with one of the two nearest elements in the next row.
So the element 3 in row 2 can be summed with 9 and 7, but not with 1.

Requirements:
---------------
- Java 1.7+
- Maven 3.3.9 or later

Build:
---------------
```sh
> At the command prompt execute the following instruction:
    git clone https://github.com/guerethes/hell-triangle.git
> Open the source code on IntelliJ, eclipse or your favorite IDE and execute the test class (TriangleTest) using JUnit framework  

```