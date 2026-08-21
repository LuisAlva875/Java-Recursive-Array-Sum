# Recursive Sum of Arrays

## Description

This project demonstrates the use of recursion to perform element-by-element addition between two integer arrays.

The program receives two predefined arrays, calculates the sum of the elements at the same position recursively, and stores the results in a third array.

The recursive method processes one position at a time until all elements have been processed.

## Concepts Demonstrated

- Recursive methods
- Array traversal
- Element-by-element array operations
- Base cases in recursion
- Recursive calls with an index
- Result storage in a separate array
- Java methods and arrays

## How It Works

The program defines two integer arrays:

```text
arr1 = {5, 8, 9, 2}
arr2 = {5, 9, 2, 2}
```

A third array is created to store the results.

For each position, the program performs:

```text
sumas[pos] = arr1[pos] + arr2[pos]
```

The recursive method then calls itself with the next position:

```text
sumarValores(arr1, arr2, sumas, pos + 1)
```

The recursion stops when all elements of the arrays have been processed.

## Recursive Process

The element-by-element operation produces the following results:

```text
5 + 5 = 10
8 + 9 = 17
9 + 2 = 11
2 + 2 = 4
```

Therefore, the resulting array is:

```text
{10, 17, 11, 4}
```

## Execution / Output

The program produces the following console output:

```text
Suma recursiva de arreglos:
[10][17][11][4]
ERRORES: 0
```

### Execution Screenshot

![Recursive Sum execution](assets/images/recursive-sum-output.png)

The screenshot shows the complete execution of the program, including the calculated values and the final control message.

## Project Structure

```text
SumaRecursiva/
├── src/
│   └── sumarecursiva/
│       └── SumaRecursiva.java
├── assets/
│   └── images/
│       └── recursive-sum-output.png
└── README.md
```

## Technologies

- Java
- Recursion
- Arrays
- Procedural problem solving

## Author

Luis Alva
