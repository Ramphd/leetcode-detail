package algorithms.Q415_Add_Strings;

public class Solution {

    public static String addStrings(String num1, String num2) {
        int sizeNum1 = num1.length();
        int sizeNum2 = num2.length();
        int cur1 = sizeNum1 - 1;
        int cur2 = sizeNum2 - 1;
        int carrying = 0;
        StringBuilder ret = new StringBuilder();
        while (cur1 >= 0 || cur2 >= 0) {
            int intNum1 = cur1 >= 0 ? num1.charAt(cur1) - '0': 0;
            int intNum2 = cur2 >= 0 ? num2.charAt(cur2) - '0': 0;

            int tmp = intNum1 + intNum2 + carrying;

            carrying = tmp / 10;

            ret.append(tmp % 10);
            cur1 --;
            cur2 --;
        }

        if(carrying == 1) ret.append(1);

        return ret.reverse().toString();
    }

    public static void main(String[] args) {
        String s = addStrings("123", "7890");
        System.out.println(s);
    }
}