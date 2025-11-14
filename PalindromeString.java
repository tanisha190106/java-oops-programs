import java.util.Scanner;
class strPalindrome {
    String str;

    strPalindrome(String str) {
        this.str = str;
    }

    void rev() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");
        }
    }
}


class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        strPalindrome obj = new strPalindrome(s);
        obj.rev();
    }
}
