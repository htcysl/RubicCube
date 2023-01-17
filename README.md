# RubicCube
In this project, we have tried to solve 2x2x2 Rubik's cube.We defined the Cube as follows: front, right, back, left, top, top and bottom faces, 
and we showed the color of each face as arrays of size 4, combining these arrays to get a 6x4 array.

The project consists of the Rubik Cube class and the AlgoProject class where the 
tests are made.In the RubicCube class, each face color is defined as an enumerator.

A state of the class and two variables that will be the parent of each state are  defined.Test cases are getting the site https://rubiks-cube-solver.com/2x2/and 
we manually gave it to the constructor method.

The number of test cases from one to ten steps were obtained and tried. 

Two constructors methods are defined, one with and one without parameters.Then,in this class six methods are defined. They are as follows 
    frontQuadrupleClockWise()
    frontQuadrupleCounterClockWise()
    topQuadrupleClockWise()
    topQuadrupleCounterClockWise()
    rightQuadrupleClockWise()
    rightQuadrupleCounterClockWise()

We used these functions to create Children.In all these studies, BFS was used as the search algorithm. In addition to that algorithm, we created auxiliary functions. 
These are as follows:
    
   isGoal() 
   clone()
   hashCode()
   toString()
   getSolution(RubikCube obj)
   display(List<RubikCube> list)

In this project, the solution was tried to be reached by using different algorithms such as DFS and bidirectional search algorithms. DFS algorithm took a long time.
