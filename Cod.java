 import random
 import string
 def generate_password(length, use_upper, use_lower, use_numbers, use_special):
 characters = ""
 if use_upper:
 characters += string.ascii_uppercase
 if use_lower:
 characters += string.ascii_lowercase
 if use_numbers:
 characters += string.digits
 if use_special:
 characters += string.punctuation
 return ''.join(random.choice(characters) for _ in range(length))
# Example usage:
 print(generate_password(12, True, True, True, True))
