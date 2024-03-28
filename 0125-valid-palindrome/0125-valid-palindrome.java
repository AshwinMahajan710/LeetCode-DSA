// Better way check page no 2. array
class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}

 /*
 The brutal way..

 class Solution {
    public boolean isPalindrome(String s) {
        String new_str = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++)
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) || (s.charAt(i) >= 48 && s.charAt(i) <= 57))
                new_str += s.charAt(i);
        int start = 0;
        int end = new_str.length() - 1;
        while (start < end) {
            if (new_str.charAt(start) != new_str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}*/ 