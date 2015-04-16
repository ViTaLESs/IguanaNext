package lib;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;


public class DataBaseData {
	//static Logger log = Logger.getLogger(DataBaseData.class);
	static WebDriver driver;
	static Database db;
	static Database db1;
	

	
	public String getSomeValue(String someData) throws SQLException, ClassNotFoundException, IOException{
		  
		  //log.info("someData = " + someData);
		  db = new Database("APPLICATIONNAME_DB","Oracle");
		  db1 = new Database("DB2", "MySQL"); 
		  String someValue1 = db.selectValue("select HASH,CREATE_DATE from cs_check_portal where " + someData + "");
		  return someValue1;
		  
	}
	
	
	
	
	
}


