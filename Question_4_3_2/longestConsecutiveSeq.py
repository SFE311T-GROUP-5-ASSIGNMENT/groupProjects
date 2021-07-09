def longestConsecutive(listOfNums):
    
    listOfNums.sort()
    consecutives = []
    count = 0

    for i in range(len(listOfNums)):
        if (listOfNums[i] - listOfNums[i-1]) == 1 or (listOfNums[i] - listOfNums[i-1]) == -1 or listOfNums[i] <= listOfNums[i-1] and listOfNums[i] != listOfNums[i-1]  :
            consecutives.append(listOfNums[i])
            count = count + 1
    return count

myList = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
longestCount = longestConsecutive(myList)
print(f'The count of the longest consecutive values is {longestCount}')