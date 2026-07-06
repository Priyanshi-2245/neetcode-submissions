class Solution {

    public String encode(List<String> strs) {
       StringBuilder sb=new StringBuilder();
       for(String st:strs){
        sb.append(st.length());
        sb.append('#');
        sb.append(st);
       }
       String s=sb.toString();
       return s;
    }

    public List<String> decode(String str) {
         List<String> ret=new ArrayList<>();
         int i=0;
         while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int l=Integer.parseInt(str.substring(i,j));
            j++;
            String s=str.substring(j,j+l);
            ret.add(s);
            i=j+l;
         }
        return ret;
    }
}
