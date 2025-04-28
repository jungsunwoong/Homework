package ch06.sec15.exam01;

public class Database {
    private static String connection = "MySQL";
    private static Database db = new Database(){};
    public static Database getInstance() {
        return db;
    }

    public static String connect() {
        System.out.println(connection + " 에 연결합니다.");
        System.out.println("데이터 베이스 : " + connection);
        return connection;
    }

    public static void close() {
        System.out.println(connection + " 을 닫습니다.");
    }
}
