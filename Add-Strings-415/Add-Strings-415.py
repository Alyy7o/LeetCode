def addStrings(num1, num2):

    number1 = 0
    for char in num1:
        digit = ord(char) - ord('0')
        number1 = number1 * 10 + digit

    number2 = 0
    for char in num2:
        digit = ord(char) - ord('0')
        number2 = number2 * 10 + digit

    a = number1 + number2 

    if a == 0:
        return "0"

    result = ""

    while a > 0:
        digit = a % 10
        char = chr(digit + 48)
        result = char + result
        a //= 10

    return result

print(addStrings("11", "123"))