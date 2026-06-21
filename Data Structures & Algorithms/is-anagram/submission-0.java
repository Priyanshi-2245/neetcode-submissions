class Solution {
    public boolean isAnagram(String s, String t) {
           if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> strings=new HashMap<>();
        HashMap<Character,Integer> stringt=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(!strings.containsKey(s.charAt(i))){
            strings.put(s.charAt(i),1);
            }
            else{
                strings.put(s.charAt(i),strings.get(s.charAt(i))+1);
            }
        }
        for (int i=0;i<t.length();i++){
            if(!stringt.containsKey(t.charAt(i))){
            stringt.put(t.charAt(i),1);
            }
            else{
                stringt.put(t.charAt(i),stringt.get(t.charAt(i))+1);
            }
        }
        return strings.equals(stringt);
    }
}
