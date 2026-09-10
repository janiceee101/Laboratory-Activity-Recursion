# Laboratory Activity: Recursion

## Brief Description

This laboratory activity demonstrates the use of recursion through a Binary Search algorithm. The program accepts the number of elements, the elements of the array, and a target value from the user. The array is sorted in ascending order before performing the search.

The program displays the index of the target if it is found. If the target is not found, the program displays -1. The program also displays the values of low, high, mid, and arr[mid] during every recursive call.

## Programming Language

Java

## How to Compile and Run

1. Download or clone this repository.
2. Open a terminal or command prompt in the folder containing `Binary_Search.java`.
3. Compile the program using:

```text
javac Binary_Search.java
```

4. Run the program using:

```text
java Binary_Search
```

5. Enter the number of elements, the elements of the array, and the target value when prompted.

## Sample Input

```text
Enter number of elements: 7

Element 1: 70
Element 2: 20
Element 3: 50
Element 4: 10
Element 5: 40
Element 6: 30
Element 7: 60

Enter target value: 50
```

## Sample Output

```text
Sorted array: [10, 20, 30, 40, 50, 60, 70]

binarySearch: (0, 6, 50)
low=0, high=6, mid=3, arr[mid]=40

binarySearch: (4, 6, 50)
low=4, high=6, mid=5, arr[mid]=60

binarySearch: (4, 4, 50)
low=4, high=4, mid=4, arr[mid]=50

Element found at index: 4
```

## AI Disclosure

Generative AI was used as a learning and coding assistance tool for this laboratory activity. It was mainly used to help explain the recursive Binary Search algorithm, clarify the laboratory requirements, and provide guidance while modifying and reviewing the Java code. The explanations helped me better understand how the recursion, search intervals, and return values work. I tested the program myself, reviewed the code, and made sure that I understood how each part of the program works before submission.
