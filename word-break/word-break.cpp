class Solution {
public:
    map<string,bool> mp;
    bool wordBreak(string s, vector<string>& wordDict) {
        if(find(wordDict.begin(),wordDict.end(),s)!=wordDict.end())return true;
        if(mp.find(s)!=mp.end())return mp.find(s)->second;
            
        for(int i=0;i<s.length();i++){
            string s1=s.substr(0,i);
            if(find(wordDict.begin(),wordDict.end(),s1)!=wordDict.end() && wordBreak(s.substr(i),wordDict)){
                mp.insert(pair<string,bool>(s,true));
                return true;
            }
        }
        
        mp.insert(pair<string,bool>(s,false));
        return false;
    }
};