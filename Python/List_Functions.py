# join - joins a list of strings with another string as a separator.
print(", ".join(["spam", "eggs", "ham"]))

# replace - replaces one substring in a string with another.
print("Hello ME".replace("ME", "world"))

# startswith and endswith - determine if there is a substring at the start and end of a string, respectively.
print("This is a sentence.".startswith("This"))
print("This is a sentence.".endswith("sentence."))

# To change the case of a string, you can use lower and upper.
print("This is a sentence.".upper())
print("AN ALL CAPS SENTENCE".lower())

# split is the opposite of join, turning a string with a certain separator into a list.
print("spam, eggs, ham".split(", "))
