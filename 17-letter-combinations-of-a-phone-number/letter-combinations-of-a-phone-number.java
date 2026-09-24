import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] phone = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, phone, "", result);

        return result;
    }

    private void backtrack(int index, String digits,
                           String[] phone, String current,
                           List<String> result) {

        
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = phone[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {

     
            current += c;

          
            backtrack(index + 1, digits, phone, current, result);

            current = current.substring(0, current.length() - 1);
        }
    }
}