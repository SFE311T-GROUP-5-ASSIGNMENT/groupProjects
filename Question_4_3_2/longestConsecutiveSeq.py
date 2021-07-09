myList = [100,4,200,1,3,2,5]
myList.sort()
consecutives = []
count = 0

for i in range(len(myList)):
    #if myList[i - 1] <= myList[i]:
    if (myList[i] - myList[i-1]) == 1 or (myList[i] - myList[i-1]) == -1 or myList[i] <= myList[i-1]:
       consecutives.append(myList[i])
       count = count + 1
print(consecutives)