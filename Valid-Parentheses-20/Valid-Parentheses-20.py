def isValid(s):

        brackets = []

        for i in range(len(s)):
                if(s[i] == "(" or s[i] == "{" or s[i] == "["):
                         brackets.append(s[i])
                elif(s[i] == ")" or s[i] == "}" or s[i] == "]"):
                        if not brackets:
                                return print("false")
                        top = brackets.pop()
                        
                        if( s[i] == ")" and top != "("):
                                return print("false")
                        elif(s[i] == "}" and top != "{"):
                                return print("false")
                        elif(s[i] == "]" and top != "["):
                                return print("false")

        if not brackets:
                return print("true")
        else:
                return print("false")
                
a = "(){}}{"
isValid(a)
