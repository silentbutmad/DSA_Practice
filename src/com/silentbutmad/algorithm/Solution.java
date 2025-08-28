import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack();
        if(s==null)
        {
            return true;
        }
        for(char c: s.toCharArray())
        {
            switch(c)
            {
                case '{':
                    st.push('}');
                    break;

                case '(':
                    st.push(')') ;
                    break;

                case '[':
                    st.push(']');
                    break;

                default:
                    if(st.peek()==c)
                    {
                        st.pop();
                    }
                    else{
                        st.push(c);
                    }


            }

        }
        if(!st.empty())
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isValid("()"));

    }
}