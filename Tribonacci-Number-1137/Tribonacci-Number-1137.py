def tribonacci(n):
    if n == 0:
        return 0
    elif n == 1 or n == 2:
        return 1
    else:
        firstTerm = 0
        secondTerm = 1
        thirdTerm = 1

        for i in range(n):
            forthTerm = firstTerm + secondTerm + thirdTerm

            firstTerm = secondTerm
            secondTerm = thirdTerm
            thirdTerm = forthTerm
        
        return firstTerm
    
print(tribonacci(25))
