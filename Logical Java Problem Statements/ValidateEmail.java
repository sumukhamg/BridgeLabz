public class ValidateEmail {
    public static void main(String[] args) {
        String str = "test@gmail.com";
        String email = "@gmail.com";
        if (str.indexOf(email) >= 1)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
