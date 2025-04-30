package ch05.sec04;
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int intArray[] = new int[1]; // null 은 주소가 없음 {} 로 빈 객체를 만들어야 한다
        intArray[0] = 10; // 주소가 없으므로 할당할 수 없음
        System.out.println(intArray[0]);
        String str = "Hello"; // 값이 없다
        System.out.println("총 문자 수: " + str.length() );
        // str 문자열은 값이 없기 때문에 길이가 나오지 않는다
    }
}