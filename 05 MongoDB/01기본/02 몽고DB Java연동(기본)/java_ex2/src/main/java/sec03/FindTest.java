package sec03;
import app.Database;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.Iterator;
public class FindTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");
        FindIterable<Document> doc = collection.find();

        //findIterable ==> mySQL jdb 에서 resultset에 해당
        //반복해서 꺼내주는 기능이 없음. -- > 외부 반복자를 만들어주어야 함.
        //Iterator
        Iterator itr = doc.iterator();
        while (itr.hasNext()) {
            System.out.println("==> findResultRow : "+itr.next());
        }


        Database.close();
    }
}