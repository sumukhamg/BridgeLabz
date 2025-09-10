public class CustomPasswordEncoder {
    public static void main(String[] args) {
        String str = "Java1234";
        System.out.println("result: " + getModefiedString(str));
    }

    static String getModefiedString(String str) {
        str = str.toUpperCase();
        String eve = "24680", vow = "AEIOU";
        char[] chArray = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (eve.indexOf(chArray[i]) != -1) {
                chArray[i] = '*';
            } else if (vow.indexOf(chArray[i]) != -1)
                chArray[i] = '@';
        }

        return new String(chArray);

    }
}
