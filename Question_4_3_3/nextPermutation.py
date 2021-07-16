def nextPermutations(myList):
    listLen = len(myList)
    index = -1
    for i in range(listLen - 1):
        if myList[i] < myList[i + 1]:
            index = i
    if index == -1:
        myList.sort()
        return myList    
    else:   
        for j in range(listLen -1, index, -1):
            if myList[j] > myList[index]:
                myList[index], myList[j] = myList[j], myList[index]
                nextPermutationList = myList[:index+1] + list(reversed(myList[index+1:]))
                break
    return nextPermutationList

myList = [1,2,3]
print(nextPermutations(myList))