class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='(' || ch =='['||ch =='{'){
                stk.push(ch);
            }
            else if(ch==')'){
                if(stk.size()==0){
                    return false;
                }
                else if(stk.peek()!='('){
                    return false;
                }else{
                    stk.pop();
                }
            }
            else if(ch=='}'){
                if(stk.size()==0){
                    return false;
                }
                else if(stk.peek()!='{'){
                    return false;
                }else{
                    stk.pop();
                }
            }
             else if(ch==']'){
                if(stk.size()==0){
                    return false;
                }
                else if(stk.peek()!='['){
                    return false;
                }else{
                    stk.pop();
                }
            }
            
        }
        if(stk.size()>0){
            return false;
        }
        else{
            return true;
        }

    }
}