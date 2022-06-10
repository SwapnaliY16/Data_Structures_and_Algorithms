class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        s = String.valueOf(sChar);
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        t = String.valueOf(tChar);
        if(s.equals(t))
            return true;
        return false;
        */
        char[] ch = new char[26];
        for(char sChar : s.toCharArray())
            ch[sChar - 'a']++;
        
        char[] ch1 = new char[26];
        for(char tChar : t.toCharArray())
            ch1[tChar - 'a']++;
        
        s = String.valueOf(ch);
        t = String.valueOf(ch1);
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch1));
        
        if(s.equals(t))
            return true;
        return false;
        
    }
}