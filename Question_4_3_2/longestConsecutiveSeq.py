myList = [100 ,4 ,200 ,1 ,3 ,2,5]
myList.sort()
consecutives = []

for i in range(len(myList)):
    if myList[i] == myList[i - 1] + 1:
       consecutives.append(myList[i])
print(consecutives)