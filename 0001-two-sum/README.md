# Two Sum

## Difficulty

Easy

## Topics

- Array
- HashMap

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

## Example

### Example 1

**Input:**

`nums = [2,7,11,15]`  
`target = 9`

**Output:**

`[0,1]`

**Explanation:**

`nums[0] + nums[1] = 2 + 7 = 9`

### Example 2

**Input:**

`nums = [3,2,4]`  
`target = 6`

**Output:**

`[1,2]`

**Explanation:**

`nums[1] + nums[2] = 2 + 4 = 6`

## Approach

I use a **HashMap** to store each number along with its index while traversing the array.

For every element `nums[i]`, I calculate the required **complement**:

`complement = target - nums[i]`

I then check whether this complement is already present in the **HashMap**.

- If the complement exists, I have found the required pair, so I return the stored index of the complement along with the current index.
- If the complement does not exist, I store the current number and its index in the HashMap.

This allows the solution to find the required pair in a **single traversal** of the array.

## Algorithm

1. Create a **HashMap** to store numbers and their indices.
2. Traverse the array from left to right.
3. Calculate the **complement** using `target - nums[i]`.
4. Check whether the complement exists in the HashMap.
5. If it exists, return the stored index of the complement and the current index.
6. If it does not exist, store the current number and its index in the HashMap.
7. If no valid pair is found, return an empty array.

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Language

**Java**
