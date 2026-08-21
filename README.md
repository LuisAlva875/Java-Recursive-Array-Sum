# Recursive Array Sum in Java

## Description

This project implements element-wise addition of two integer arrays using recursion in Java.

The program receives two integer arrays and processes them recursively from the first position to the last one. Each recursive call calculates the sum of the corresponding elements and stores the result in a third array.

This exercise demonstrates the use of recursion for traversing arrays and performing operations without using an iterative loop inside the recursive method.

## Objective

The main objective of this exercise is to practice recursive programming by implementing an element-wise addition operation between two arrays.

The program demonstrates:

- Recursive method calls.
- Base cases in recursive algorithms.
- Array indexing.
- Element-wise operations between arrays.
- Storage of intermediate results.
- Recursive traversal of an array.

## Algorithm

Given two arrays:

```text
arr1 = {5, 8, 9, 2}
arr2 = {5, 9, 2, 2}
```

the program calculates:

```text
5 + 5 = 10
8 + 9 = 17
9 + 2 = 11
2 + 2 = 4
```

The resulting array is:

```text
{10, 17, 11, 4}
```

The recursive method receives the two input arrays, the result array, and the current position.

At each call:

1. It checks whether the current position has reached the end of the array.
2. It calculates the sum of the elements at the current position.
3. It stores the result in the corresponding position of the result array.
4. It prints the calculated value.
5. It recursively calls itself with the next position.

The base case is reached when the current position is greater than or equal to the length of the first array.

## Recursive Method

The core of the project is the following method:

```java
public static void sumarValores(int[] arr1, int[] arr2, int[] sumas, int pos) {
    if (pos >= arr1.length) {
        return;
    }

    sumas[pos] = arr1[pos] + arr2[pos];

    System.out.print("[" + sumas[pos] + "]");

    sumarValores(arr1, arr2, sumas, pos + 1);
}
```

The recursive call advances the position by one until every element has been processed.

## Example Output

```text
Suma recursiva de arreglos:
[10][17][11][4]
ERRORES: 0
```

## Complexity

For arrays of length `n`, the recursive method processes each position exactly once.

- Time Complexity: `O(n)`
- Space Complexity: `O(n)` due to the recursion call stack and the result array.

## Project Structure

```text
Recursive-Array-Sum-Java/
│
├── src/
│   └── sumarecursiva/
│       └── SumaRecursiva.java
│
├── screenshots/
│   └── recursive-array-sum-output.png
│
├── README.md
└── LICENSE
```

## Technologies

- Java
- Object-oriented programming fundamentals
- Recursion
- Arrays

## Execution

Compile and run the `SumaRecursiva` class from a Java development environment such as NetBeans, IntelliJ IDEA, Eclipse, or from the command line.

The program does not require external libraries or additional dependencies.

## Author

Luis Alva

## License

This project is licensed under the MIT License.
