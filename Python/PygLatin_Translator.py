print 'Welcome to the PygLatin translator!'

pyg = "ay"

original = raw_input("Enter a word:")                                   # Prompts user for input
if len(original) > 0 and original.isalpha():                            # If no input occurs... (.isalpha ensures that only an alphabetical value is used)
    word = original.lower()
    first = word[0]
    new_word = word[1:] + first + pyg
    print new_word
else:
    print "You can't leave this empty or use numeric characters."       # ...Then this will be printed
