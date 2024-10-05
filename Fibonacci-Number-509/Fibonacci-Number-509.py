def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        firstTerm = 0
        secondTerm = 1

        for i in range(n):
            thirdTerm = firstTerm + secondTerm

            firstTerm = secondTerm
            secondTerm = thirdTerm
        
        return firstTerm
    
print(fib(6))
