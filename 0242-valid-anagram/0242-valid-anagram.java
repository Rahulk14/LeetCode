class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] freqArray1 = new int[26];
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            freqArray1[ch-'a'] = freqArray1[ch-'a']+1;
        }

        int[] freqArray2 = new int[26];
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            freqArray2[ch-'a'] = freqArray2[ch-'a']+1;
        }

        for(int i = 0; i<freqArray1.length; i++){
            if(freqArray1[i] != freqArray2[i])
                return false;
        }
       
       return true;

    }
}