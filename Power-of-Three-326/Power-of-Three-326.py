class Solution:
    def isPowerOfThree(self, n: int) -> bool:

        if n == 0 or n < 0:
            return False
        if n == 1:
            return True
        if n > 1:
            return n % 3 == 0 and self.isPowerOfThree(n/3)
        else:
            return False
        
    print(isPowerOfThree(9))

    # Time: Log(n)
    # space: Log(n)