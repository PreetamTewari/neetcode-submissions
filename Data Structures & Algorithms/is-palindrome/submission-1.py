class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1

        while(l < r):
            while(l < r and not self.isAlphaNumeric(s[l])):
                l += 1
            while(l < r and not self.isAlphaNumeric(s[r])):
                r -= 1

            if(s[l].lower() != s[r].lower()):
                return False
            l += 1
            r -= 1

        return True


    def isAlphaNumeric(self, ch):
        return ('A' <= ch <= 'Z' or
                'a' <= ch <= 'z' or
                '0' <= ch <= '9'
        )