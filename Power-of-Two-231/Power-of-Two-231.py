class Solution:
    def isPowerOfTwo(self, n: int) -> bool:

        if n == 0 or n < 0:
            return False
        if n == 1:
            return True
        if n > 1:
            return n % 2 == 0 and self.isPowerOfTwo(n/2)
        else:
            return False
        
    print(isPowerOfTwo(8))

# Time: Log(n)
# space: Log(n)