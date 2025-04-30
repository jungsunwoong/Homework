package ch09.sec06.exam01;

public class ButtonExample {
    public static void main(String[] args) {
        class Click implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("OK 버튼 클릭");
            }
        }
    }
}
