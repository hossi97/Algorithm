package programmers.level_0.string;

/**
 * 문자열 뒤집기
 */
public class PG120822 {

    public String solution1(String my_string) {

        String str = "";

        for (int i = 0; i < my_string.length(); i++) {
            str += my_string.charAt(my_string.length() - i - 1);
        }

        return str;
    }

    public String solution2(String my_string) {

        StringBuilder sb = new StringBuilder();

        return sb.append(my_string).reverse().toString();
    }

    public String solution3(String my_string) {

        StringBuffer sb = new StringBuffer();

        return sb.append(my_string).reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println();
    }

}
