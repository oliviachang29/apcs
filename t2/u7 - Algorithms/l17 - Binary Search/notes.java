/*
Binary Search
- Array must already be sorted for it to work
- Can use loops or recursion

Steps:
1. Find the middle of the set (low + high / 2)
Ex: 100 elements, first is 0, last is 99: 0 + 99 / 2 = 49.5 -> 49
2. Is this the value?
-> Too low -> search first half -> high = mid - 1
-> Too high -> search second half -> low = mid + 1
3. Repeat until find, or high < low (didn't find it)

Advantages: very fast
Disadvantages: more difficult to code, array must be sorted

*/