class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size()!= t.size()){return false;}
        vector<char> charArray1(s.begin(), s.end());
        vector<char> charArray2(t.begin(), t.end());
        sort(charArray1.begin(),charArray1.end());
        sort(charArray2.begin(),charArray2.end());
        
        if (charArray1== charArray2){
            return 1;
        }else{
            return 0;
        }        
    }
};