def romanToInt(str):
        roman = {
            "I" : 1,
            "V" : 5,
            "X" : 10,
            "L" : 50,
            "C" : 100,
            "D" : 500,
            "M" : 1000,
        }       

        total = 0
        for i in range( len(str) - 1 ):
            if(roman[str[i]] < roman[str[i+1]]):
                total -= roman[str[i]]
            else:
                total += roman[str[i]]
        return print(total + roman[str[-1]])
        

str = "MCMXIV"
romanToInt(str)