package valid_brackets;


public class Solution {

    public boolean isValid(String s) {

        int length = s.length();
        if (length == 1) return false;
        if (length == 0) return true;
        int p = 0;
        char[] res = new char[length];

        for(int i = 0; i < length; i++){
            char at = s.charAt(i);
            if (at == '(' || at == '[' || at == '{') {
                res[p++] = at;
            }
            else {
                if (p == 0) return false;
                if (!isReverse(res[--p],at)) {
                    return false;
                }
            }

        }

        if (p != 0) return false;
        return true;
    }

    public boolean isReverse(char a, char b) {
        if (a == '(' && b == ')') return true;
        if (a == '{' && b == '}') return true;
        if (a == '[' && b == ']') return true;


        return false;
    }

}
