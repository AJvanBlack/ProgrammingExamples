# Method 1:
from datetime import datetime
date_time = datetime.now()
print date_time


# Method 2:
from datetime import datetime
now = datetime.now()
print '%s-%s-%s' % (now.year, now.month, now.day)


# Method 3:
from datetime import datetime
now = datetime.now()
print '%s:%s:%s' % (now.hour, now.minute, now.second)


# -, /, and : can be used between %s placeholders to seperate values
# The date and time can be combined in order to be printed on the same line next to each other