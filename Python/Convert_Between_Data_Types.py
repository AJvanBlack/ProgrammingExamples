#Example 1
count = int(4.0)                                                       
print(count)
print(type(count))

#Example 2
house_number = 13                                                       
street_name = "Elm Street"
town_name = "Johannesburg"

address = str(house_number) + " " + street_name + ", " + town_name
print(address)

#Example 3
mon_sales = "121"                                                       
tues_sales = "105"
wed_sales = "110"
thurs_sales = "98"
fri_sales = "95"

total_sales = int(mon_sales) + int(tues_sales) + int(wed_sales) + int(thurs_sales) + int(fri_sales)

print("This week's total sales: " + str(total_sales))