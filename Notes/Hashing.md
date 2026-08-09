# Hashing
Hashing is nothing but the combination of pre-storing and fetching. (In native terms)  
Where:
1. Pre-Storing - pre-calculating information.
2. Fetching - selecting each query, fetch the value from the pre-calculated info.

The division method is used more often than the other possible methods for Hashing.  
In this method, we basically modulo each number by 10 and put it in a 0-9 array, in which each element is a linked list.
This could lead to collision, which is when modulo by 10 leads to the same index.  
