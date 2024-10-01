class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        permutations = [[]]
        for n in nums:
            new_perms = []
            for p in permutations:
                for i in range(len(p)+1):
                    copy = p.copy()
                    copy.insert(i,n)
                    new_perms.append(copy)
            permutations = new_perms
        return permutations