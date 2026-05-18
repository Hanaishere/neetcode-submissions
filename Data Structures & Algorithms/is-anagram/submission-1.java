class Solution {
    public boolean isAnagram(String s, String t) {
        char st[] = s.toCharArray();
        char ts[] = t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(ts);
        int i =0 ,j =0;
        if(st.length != ts.length)
        {
            return false;
        }
        while(i < st.length && j <ts.length)
        {
            if(st[i] != ts[j])
            {
                return false;
            }
            i++ ;j++;
        }
        return true;
    }
}
