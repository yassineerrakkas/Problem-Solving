class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(len(matrix)):
            if self.search(matrix[i],target) != -1 : return True
        return False
    def search(self, nums: List[int], target: int) -> int:
        l , r = 0, len(nums)-1
        while l <= r:   
            m = (r+l)//2
            if nums[m] == target: return m
            if nums[m] > target : r = m-1
            else : l = m + 1
        return -1