numList = [2,7,11,15]
target = 9;

for num_1 in numList:
    for num_2 in numList:
        if num_2 + num_1 == target:
              print("[ ",numList.index(num_1)," , ",numList.index(num_2)," ]") 