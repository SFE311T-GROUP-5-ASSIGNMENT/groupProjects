from typing import Counter


#permutation function 
def longestConsecutive(listOfNums):
    #sorting the list
    listOfNums.sort()
    #initialising of the counter
    permutation_counter = 0
    
    #loop created to loop through the list of given values
    for i in range(len(listOfNums)):
        #checks for consecutive values then updates the counter when one is found
        if (listOfNums[i] - listOfNums[i-1]) == 1 or (listOfNums[i] - listOfNums[i-1]) == -1 or listOfNums[i] <= listOfNums[i-1] and listOfNums[i] != listOfNums[i-1]:
            #Updating the counter
            permutation_counter = permutation_counter + 1
    #returning the number of permutations found
    return permutation_counter

if __name__ == '__main__':
    #Permutation list to be checked
    myList = [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]
    #permutation function call
    longestCount = longestConsecutive(myList)
    #pringind out the number of permutations found
    print(f'The count of the longest consecutive values is {longestCount}')