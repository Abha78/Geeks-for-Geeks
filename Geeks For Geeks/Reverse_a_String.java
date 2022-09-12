class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n = str.length();
        int s=0 ;
        int e=n-1;
        //if(n==0){
          //  return "";
        //}
        char[] ch = str.toCharArray();
        while(s<e){
            char t = ch[s];
            ch[s] = ch[e];
            ch[e] = t;
            s++;
            e--;
        
        
    }
    return new String(ch);
}
}