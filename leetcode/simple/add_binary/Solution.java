package add_binary;

public class Solution {

    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();

        System.out.println(a);
        System.out.println(b);

        int aLength = a.length();
        int bLength = b.length();

        char flag = '0';
        while(aLength != 0 || bLength != 0){
            System.out.print("alength: ");
            System.out.println(aLength);
            System.out.print("blength: ");
            System.out.println(bLength);

            char aNum = '0';
            char bNum = '0';
            if (aLength != 0) {
                aNum = a.charAt(--aLength);
            }
            if (bLength != 0) {
                bNum = b.charAt(--bLength);
            }

            if (aNum == '1' && bNum == '1') {
                sb.append(flag);
                flag = '1';
            }
            else if (aNum == '1' || bNum == '1') {
                if (flag == '1') {
                    sb.append('0');
                    flag = '1';
                }
                else {
                    flag = '0';
                    sb.append('1');
                }
            }
            else {
                sb.append(flag);
                flag = '0';
            }

            System.out.println(sb.toString());
        }

        if (flag == '1') sb.append('1');

        return sb.reverse().toString();
    }
}
