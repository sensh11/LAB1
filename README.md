comments for solutions 
* Prob1 
The function Minimum(int[] arr, int n) recursively finds the minimum element in the array.
In the base case, if there is only one element in the array (when n equals 1), the function returns that element.
In the recursive case, it recursively finds the minimum element in the rest of the array (excluding the last element) and stores it in minInRest.
Then, it compares minInArr with the last element of the array (arr[n - 1]) and returns the smaller of the two using Math.min.

The time complexity of this recursive approach to find the minimum element in the array is O(n).

* Prob2
The function Average(int[] arr, int n) calculates the sum of elements in the array up to index n-1 recursively.
In the base case, if n is 0 (indicating that there are no elements in the array), it returns 0.
In the recursive case, it adds the value of the element at index n-1 to the sum of elements up to index n-1.
The recursion continues until it reaches the base case.

The time complexity of this recursive approach to find the average of elements in the array is O(n)

* Prob3
This function recursively checks whether a given number n is prime or not.
It starts with two base cases:
If n is less than or equal to 1, it returns false because 1 and any negative number are not prime.
If the divisor reaches 1, it returns true because if n is not divisible by any number up to n/2, it's prime.
It then checks if n is divisible by the current divisor. If it is, it returns false because n is not prime.
If n is not divisible by the current divisor, it recursively calls itself with n and the next divisor down to 1.
This function runs recursively until it either finds a divisor that divides n, in which case it returns false, or it reaches a divisor of 1, in which case it returns true.

 the time complexity O(n).

* Prob4
This is a recursive function to compute the factorial of a given number n.
It has a base case: if n is 0, it returns 1, as the factorial of 0 is defined to be 1.
Otherwise, it recursively calls itself with n-1 and multiplies the result by n.
The recursion continues until it reaches the base case.
When n reaches 0, it starts returning back, multiplying each return value by the current n, until it reaches the initial call.

time complexity of the Factorial function is O(n)

* Prob5
The fibonacci function calculates the nth Fibonacci number recursively.
It starts with two base cases: if n is 1 or 2, it returns 1 because the first two Fibonacci numbers are both 1.
For any other value of n, it recursively computes the Fibonacci number by summing the previous two Fibonacci numbers.
The main method calls the fibonacci function with n = 17 (or any other value you specify) and prints the result.

time complexity O(2^n)  because for each call to compute
the nth Fibonacci number, it makes two recursive calls

* Prob6
The power function takes two parameters: a base number "a" and an exponent "n".
If the exponent "n" is 0, the function returns 1
because any number raised to the power of 0 is 1.
Otherwise, the function recursively calculates the power of "a" by multiplying "a" with
the result of power(a, n - 1) (i.e., "a" raised to the power of "n - 1").
This recursion continues until the exponent reaches 0, at which point the base case is triggered, and the recursion stops.

time complexity of the function is O(n)

* Prob7
The reverseArray function takes an array arr, a start index start, and an end index end as parameters.
It has a base case where it stops recursion when the start index is greater than or equal to the end index.
In the recursive step, it swaps the elements at the start and end indices using a temporary variable.
It then recursively calls itself with updated start and end indices (start + 1 and end - 1) to reverse the remaining elements of the array.
In the main method, the reverseArray function is called with start index 0 and end index n-1 to reverse the entire array in-place.
Finally, it prints the reversed array

time complexity O(n)

* Prob8
The isDigits function checks whether a string "s" consists only of digits recursively.
It takes two parameters: the string "s" and an index indicating the current position in the string.
In the base case, if the index reaches the end of the string, the function returns true, indicating that all characters in the string are digits.
Otherwise, it checks if the character at the current index is a digit using the Character.isDigit() method.
If it's a digit, the function recursively calls itself with the next index.
If it encounters a non-digit character, it immediately returns false, indicating that the string contains non-digit characters.

time complexity O(n)

* Prob9
The function binom(int n, int k) calculates the binomial coefficient of n choose k.
In the base case, if k is equal to n or k is equal to 0, then the binomial coefficient is 1. This is because choosing all elements (k = n) or choosing none (k = 0) results in only one possibility.
In the recursive case, the binomial coefficient is calculated by summing the binomial coefficients of choosing k elements from (n-1) and choosing (k-1) elements from (n-1). This is based on the combinatorial identity of Pascal's triangle.
The recursion continues until it reaches one of the base cases.

The time complexity of this recursive approach to calculate the binomial coefficient is exponential, O(2^n).

* Prob10
The function gcd(int a, int b) takes two integers a and b as input.
In the base case, if b is 0, it means that a is the GCD of a and b, so we return a.
In the recursive case, we call the gcd function with b and the remainder of a divided by b. This is based on the property that GCD(a, b) is the same as GCD(b, a % b).
We continue this process until we reach the base case, where we have found the GCD.

