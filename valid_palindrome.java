class Solution {
    public boolean isPalindrome(String s) {
        /* Method 1
        t.c O(n + n + n) = O(n)
        s.c O(1 + n) = O(n)
        */
        
        /*
        if(s == null || s.equals("")) return false;
        
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        //System.out.println(s);
        String reverseString = "";
        char[] sChar = s.toCharArray();
        for(int i = s.length() - 1; i >= 0; i--)
            reverseString = reverseString + sChar[i];
        //System.out.println(reverseString);
        if(reverseString.equals(s))
            return true;
        return false;
        */
        
        /*
        Method 2 with StringBuilder and StringBuffer
        StringBuilder is faster and takes less space than StringBuffer
        O(N)
        O(N)
        */
        /*
        if(s == null || s.equals("")) return false;
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        //System.out.println(s);
        //StringBuilder str = new StringBuilder(s);
        StringBuffer str = new StringBuffer(s);
        //System.out.println(str);
        if(str.reverse().toString().equals(s))
            return true;
        return false;
        */
        
        /*
        Two pointer approach
        O(N)
        O(1)
        */
        
        if(s.equals(" "))
            return true;
        int first = 0;
        int last = s.length() - 1;
        
        while(first <= last) {
            if(!Character.isLetterOrDigit(s.charAt(first))){
              first++;
              continue;
            }
                
            if(!Character.isLetterOrDigit(s.charAt(last))) {
               last--;
               continue;
            }
            //System.out.println(first + " " +s.charAt(first) + " "+s.charAt(last));    
            if( Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last)) ) {
                return false;
            }
               
            first++;
            last--;
        }
        return true;
    }
}