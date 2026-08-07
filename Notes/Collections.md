# Collections
- Arrays: Fixed number of elements of same type, accessed by index.
- JCF (Java Collections Framework) exists for this purpose alone, to allow us to create objects that can be manipulated with ease.
- These are dynamic and come with built-in methods for common operations.
- The top most part of JFC is the iterable interface, which allows objects to be looped through using enhanced for each.
- After that is the collection interface, which has basic operations like adding, removing, checking size, clearing elements.
- After this, we have: List, Set, and Queue.
- Lists are ordered collections which allow duplicates.
- Sets are unordered collections that do not allow duplicates.
- Queues are collections designed to hold elements before processing.
- Maps are also present, which are not a subtype of collection, but still part of JFC, and they store key value pairs, with each key being unique.

## Lists
- ArrayList: dynamic array, offers fast random access but slow insertion and deletion in the middle.
- LinkedList: doubly linked list, random access is slow but insertion and deletion is quick.
- Vector: ArrayList but threadsafe (considered outdated)

## Sets
- HashSet: unordered and the most basic set.
- LinkedHashSet: ordered HashSet.
- TreeSet: elements are sorted using a balanced binary search tree, but at the cost of speed.

## Queue
- FIFO
- Dequeue: both ends
- PriorityQueue: heap-ordered

## Maps
- HashMap: fast lookups with no guarantee of order.
- LinkedHashMap: maintains order of insertion.
- TreeMap: sorted in ascending order.

## Collections Utility Class
The framework has a helper class called Collections, which allows common tasks to be performed, like sorting, revering, shuffling, maximum, or minimum etc.

## Internal Workings
- Hash based collections use a hashtable for faster insertion and lookup.
- Tree based collections use Red-Black trees to sort everything.
- ArrayList uses a resizable array internally, doubling the capacity
- LinkedList uses nodes
