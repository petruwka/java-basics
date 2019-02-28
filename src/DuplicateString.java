public class DuplicateString {

    public static void main(String[] args) {

        String input = "asd";

        char[] chars = input.toCharArray();
        char[] resultChars = new char[chars.length * 2];

        int i = 0;
        for (char c : chars) {
            resultChars[i] = c;
            i++;
            resultChars[i] = c;
            i++;
        }


        String result = new String(resultChars);
        System.out.println(result);
    }
}
