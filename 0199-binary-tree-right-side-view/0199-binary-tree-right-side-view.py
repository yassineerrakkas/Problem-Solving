# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        def dfs(root,ans,depth):
            if(root is None) : return
            if(len(ans) == depth): ans.append(root.val)
            dfs(root.right,ans,depth+1)
            dfs(root.left,ans,depth+1)
        ans = []
        depth = 0
        dfs(root,ans,depth)
        return ans
