
import com.porter.dBase.*;
public class StarterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseConnection db = new DataBaseConnection();
		try {
			db.OpenDB("MyDB");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
