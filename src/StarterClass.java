
import com.porter.dBase.*;
public class StarterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseConnection db = new DataBaseConnection();
		db.OpenDB("MyDB");
		//db.AddTable("TABLE2");
		db.AddColumn("TABLE2", "Name", "VARCHAR(25)");
	}

}
