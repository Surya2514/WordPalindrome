public class Palindrome {

    public static void main(String[] as)
    {
        String firstWord = "Nitin";
        if (checkPalindrome(firstWord.toLowerCase()))
        {
            System.out.println(firstWord + " is a palindrome word");
        }
        else
        {
            System.out.println(firstWord + " is not a palindrome word");
        }

        String secondWord = "djjate";
        if (checkPalindrome(secondWord.toLowerCase()))
        {
            System.out.println(secondWord + " is a palindrome word");
        }
        else
        {
            System.out.println(secondWord + " is not a palindrome word");
        }
    }

    public static boolean checkPalindrome(String value)
    {
        int firstIndex = 0;
        int lastIndex = value.length() -1;

        while (firstIndex < lastIndex) {

            if (value.charAt(firstIndex) != value.charAt(lastIndex))
                return false;

            firstIndex++;
            lastIndex--;
        }

        return true;
    }
}
