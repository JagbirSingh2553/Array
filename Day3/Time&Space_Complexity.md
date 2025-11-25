# Day 3 – Time & Space Complexity (Big-O Notation)

This document summarizes the foundational concepts of **Time and Space Complexity**, as practiced on **Day 3** of your DSA Learning Journey.

---

## 📌 What is Time Complexity?

Time Complexity measures **how the running time of an algorithm increases as the input size (n) increases**.

Big-O notation expresses the **growth rate**, not exact time.

### Common Examples:
```java
for (int i = 0; i < n; i++) { }     // O(n)
for (int i = 0; i < n; i++)
    for (int j = 0; j < n; j++) { } // O(n^2)

Arrays.sort(arr);                   // O(n log n)
```

---

## 📌 What is Space Complexity?

Space Complexity measures **how much extra memory** an algorithm uses.

### Examples:
```java
int x = 0;               // O(1)
int[] arr = new int[n];  // O(n)
int[][] grid = new int[n][n]; // O(n^2)
```

---

## ⭐ Why Big-O Ignores Constants

Big-O only cares about **growth**, not exact number of operations.

- O(2n) → O(n)  
- O(100n + 500) → O(n)  
- O(n + n) → O(n)  
- O(2n) is NOT faster than O(n) in Big-O terms — both are linear growth.

---

## 📈 Common Time Complexities you must know

| Big-O        | Meaning        | Example                          |
|--------------|----------------|----------------------------------|
| **O(1)**     | Constant       | Array access, HashMap get        |
| **O(log n)** | Logarithmic    | Binary Search                    |
| **O(n)**     | Linear         | Single Loop                      |
| **O(n log n)** | Log-linear   | Merge Sort, Arrays.sort()        |
| **O(n²)**    | Quadratic      | Nested Loops                     |

---

## ✔ Rules to Identify Complexity

### **Rule 1: Count loops**
- 1 loop → O(n)
- nested loops → O(n²)

### **Rule 2: Ignore constants**
- O(5n + 10) → O(n)

### **Rule 3: Separate loops = addition**
```java
for(){ }  // O(n)
for(){ }  // O(n)
Total → O(n + n) = O(n)
```

### **Rule 4: Nested loops = multiplication**
```java
for(){ 
   for(){ }
}
Total → O(n * n) = O(n²)
```

---

## 🧠 Time Complexities from Day 1 & Day 2 Problems

| Problem                    | Time     | Space |
|---------------------------|----------|--------|
| Reverse Array             | O(n)     | O(1)   |
| Second Largest            | O(n)     | O(1)   |
| Remove Duplicates Sorted | O(n)     | O(1)   |
| Sorted Squares            | O(n)     | O(n)   |
| Merge Sorted Array        | O(n+m)   | O(1)   |
| Valid Palindrome          | O(n)     | O(1)   |
| Move Zeroes               | O(n)     | O(1)   |

---

## 📝 Practice Questions

Guess the Time Complexity:

1.
```java
for (int i = 0; i < n; i++) { }
```
→ O(n)

2.
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) { }
}
```
→ O(n²)

3.
```java
Arrays.sort(arr);
```
→ O(n log n)

4.
```java
while (left < right) {
    left++;
    right--;
}
```
→ O(n)

5.
```java
for (int i = 0; i < n; i++) { }
for (int j = 0; j < m; j++) { }
```
→ O(n + m)

---

## 🎯 Summary

- Big-O focuses on *growth*, not exact operations  
- Constants don’t matter  
- Understanding complexity helps choose better algorithms  
- This forms the base for future topics like Sliding Window, HashMap, Binary Search, Trees, and DP  

---