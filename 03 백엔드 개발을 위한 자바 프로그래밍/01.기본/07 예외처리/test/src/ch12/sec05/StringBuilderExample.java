package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF") // DEF
                .insert(0, "ABC") // ABCDEF
                .delete(3, 4) // ABCEF
                .toString(); // 문자열로 출력
        System.out.println(data);

    }
}
