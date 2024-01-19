class Solution {
    public String reverseWords(String s) {
        String str="";
        String str2[]=s.split(" ");
        for(int i=str2.length-1; i>=0; i--)
        {
            str=str+str2[i]+" ";
        }
        str=str.replaceAll("\\s+", " ").trim();
        // str=str.trim();
        return str;
    }
}