class Solution:
    def isPowerOfFour(self, n: int) -> bool:

        if n == 0 or n < 0:
            return False
        if n == 1:
            return True
        if n > 1:
            return n % 4 == 0 and self.isPowerOfFour(n/4)
        else:
            return False
        
    print(isPowerOfFour(16))

# Time: Log(n)
# space: Log(n)