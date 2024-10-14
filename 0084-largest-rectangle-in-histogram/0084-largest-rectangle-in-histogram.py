class Solution:
    def largestRectangleArea(self, heights: List[int]) -> int:
        stack = []
        res = 0
        for i in range(len(heights)):
            start = i
            while(stack and stack[-1][1] > heights[i]):
                s,h = stack.pop()
                res = max(res, h*(i-s))
                start = s
            stack.append((start,heights[i]))
        while(stack):
            s,h = stack.pop()
            res = max(res, h*(len(heights)-s))
        return res