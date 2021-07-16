def nextPermutations(myList):
    #list lenght
    listLen = len(myList)
    #initial index of the permutation list
    index = -1
    #checks if whether a permutation is possible 
    for i in range(listLen - 1):
        if myList[i] < myList[i + 1]:
            index = i
    #returns a sorted list if the arrangement is not possible
    if index == -1:
        #sorting the list 
        myList.sort()
        #returning of the sorted list
        return myList 
    #else rearrange the list accordingly   
    else:   
        for j in range(listLen -1, index, -1):
            #checking the list from the value of the index
            if myList[j] > myList[index]:
                #updating the next permutation list
                myList[index], myList[j] = myList[j], myList[index]
                nextPermutationList = myList[:index+1] + list(reversed(myList[index+1:]))
                break
    #returning the next permutation list fount
    return nextPermutationList

if __name__ == '__main__':
    #list to be checked
    myList = [1,2,3]
    #next permutation function call 
    permutation = nextPermutations(myList)
    print(permutation)