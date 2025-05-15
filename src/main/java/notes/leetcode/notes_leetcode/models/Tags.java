package notes.leetcode.notes_leetcode.models;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.Setter;

public enum Tags {
    ARRAY("Array"),
    STRING("String"),
    HASH_TABLE("Hash Table"),
    DYNAMIC_PROGRAMMING("Dynamic Programming"),
    MATH("Math"),
    SORTING("Sorting"),
    GREEDY("Greedy"),
    DEPTH_FIRST_SEARCH("Depth-First Search"),
    BINARY_SEARCH("Binary Search"),
    DATABASE("Database"),
    MATRIX("Matrix"),
    TREE("Tree"),
    BREADTH_FIRST_SEARCH("Breadth-First Search"),
    BIT_MANIPULATION("Bit Manipulation"),
    TWO_POINTERS("Two Pointers"),
    PREFIX_SUM("Prefix Sum"),
    HEAP_PRIORITY_QUEUE("Heap (Priority Queue)"),
    SIMULATION("Simulation"),
    BINARY_TREE("Binary Tree"),
    STACK("Stack"),
    GRAPH("Graph"),
    COUNTING("Counting"),
    SLIDING_WINDOW("Sliding Window"),
    DESIGN("Design"),
    ENUMERATION("Enumeration"),
    BACKTRACKING("Backtracking"),
    UNION_FIND("Union Find"),
    LINKED_LIST("Linked List"),
    ORDERED_SET("Ordered Set"),
    NUMBER_THEORY("Number Theory"),
    MONOTONIC_STACK("Monotonic Stack"),
    SEGMENT_TREE("Segment Tree"),
    TRIE("Trie"),
    COMBINATORICS("Combinatorics"),
    BITMASK("Bitmask"),
    QUEUE("Queue"),
    DIVIDE_AND_CONQUER("Divide and Conquer"),
    RECURSION("Recursion"),
    BINARY_INDEXED_TREE("Binary Indexed Tree"),
    MEMOIZATION("Memoization"),
    HASH_FUNCTION("Hash Function"),
    GEOMETRY("Geometry"),
    BINARY_SEARCH_TREE("Binary Search Tree"),
    STRING_MATCHING("String Matching"),
    TOPOLOGICAL_SORT("Topological Sort"),
    SHORTEST_PATH("Shortest Path"),
    ROLLING_HASH("Rolling Hash"),
    GAME_THEORY("Game Theory"),
    INTERACTIVE("Interactive"),
    DATA_STREAM("Data Stream"),
    MONOTONIC_QUEUE("Monotonic Queue"),
    BRAINTEASER("Brainteaser"),
    DOUBLY_LINKED_LIST("Doubly-Linked List"),
    RANDOMIZED("Randomized"),
    MERGE_SORT("Merge Sort"),
    COUNTING_SORT("Counting Sort"),
    ITERATOR("Iterator"),
    CONCURRENCY("Concurrency"),
    PROBABILITY_AND_STATISTICS("Probability and Statistics"),
    QUICKSELECT("Quickselect"),
    SUFFIX_ARRAY("Suffix Array"),
    LINE_SWEEP("Line Sweep"),
    BUCKET_SORT("Bucket Sort"),
    MINIMUM_SPANNING_TREE("Minimum Spanning Tree"),
    SHELL("Shell"),
    RESERVOIR_SAMPLING("Reservoir Sampling"),
    STRONGLY_CONNECTED_COMPONENT("Strongly Connected Component"),
    EULERIAN_CIRCUIT("Eulerian Circuit"),
    RADIX_SORT("Radix Sort"),
    REJECTION_SAMPLING("Rejection Sampling");

    private final String tag;

    Tags(String tag) {this.tag = tag;}

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(tag);
    }
}
