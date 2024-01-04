class Solution(object):
    def isPalindrome(self, s):
#         if isalpa is True, convert to lowercase
        candi = []
        for char in s:
            if char.isalnum():
                candi.append(char.lower())
        
        i, j = 0, len(candi) - 1
        while (i < j):
            if candi[i] != candi[j]:
                return False
            i += 1
            j -= 1
            
        return True
        