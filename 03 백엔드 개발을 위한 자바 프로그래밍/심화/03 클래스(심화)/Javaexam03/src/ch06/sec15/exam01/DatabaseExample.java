package ch06.sec15.exam01;



public class DatabaseExample {
    public static void main(String[] args) {

        Database db = Database.getInstance();
        db.connect();
        db.close();

    }

}
