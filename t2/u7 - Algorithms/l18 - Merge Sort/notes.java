/* Merge Sort
- typically written recursively 
- take an array and divide into smaller and smaller pieces, then merge them into order

Example:
56 34 55 12 88 37 45 21
56 34 | 55 12 | 88 37 | 45 21
56 | 34 | 55 | 12 | 88 | 37 | 45 | 21
- treat each as tiny arrays
- then merge
34 56 | 12 55 | 37 88 | 21 45
- merge the first two arrays by comparing first element in each array (comparing a[0] and b[0])
- then move pointer in the array with the smaller element (comparing a[0] and b[1], or a[1] and b[0])
- repeat (comparing a[1] and b[1], a[0] and b[2], a[2] and b[0])
12 34 55 56 | 21 37 45 88

*/