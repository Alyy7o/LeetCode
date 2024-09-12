import numpy as np
def searchInsert(nums, target):
    low, high = 0, len(nums) - 1

    while low <= high:
        mid = (low + high) // 2 
        
        if nums[mid] == target:
            return mid
        
        elif nums[mid] < target:
            low = mid + 1 
            
        else:
            high = mid - 1 
    
    return low


list = [3,6,7,8,10]
nums = np.array(list)
print(searchInsert(nums, 0))