# Recursion
This is when a function calls itself (or a lower version of itself) until a base case is reached.  
Written like: 
```Java
int fact(int n)
{
    if (n < = 1) // base case
        return 1;
    else    
        return n*fact(n-1);    
}
```
## Advantages
- Simpler code
- Natural representation
- Useful in divide and conquer

## Disadvantages
- Higher memory
- Stack overflow possible
- Slower
- Harder to debug
