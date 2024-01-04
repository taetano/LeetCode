class Solution(object):
    def isPalindrome(self, s):
#         if isalpa is True, convert to lowercase
        candi = []
        for char in s:
            if char.isalnum():
                candi.append(char.lower())
        
        while len(candi) > 1:
            if candi.pop(0) != candi.pop():
                return False
            
        return True
        