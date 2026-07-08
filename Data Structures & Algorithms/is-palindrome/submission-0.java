class Solution {
    public boolean isPalindrome(String s) {
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)){
                n++;
            }
        }
        char[] str = new char[n];
        int i=0;
        for (char ch : s.toCharArray()) {
            if  (Character.isLetterOrDigit(ch)){
                str[i]= Character.toLowerCase(ch);
                i++;
            }
        }
        String act = Arrays.toString(str);
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        String rev =Arrays.toString(str);
        if (act.equals(rev)) {
            return true;
        }
        return false;
    }
}
