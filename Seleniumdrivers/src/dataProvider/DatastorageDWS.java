package dataProvider;

import org.testng.annotations.DataProvider;

public class DatastorageDWS {
	@DataProvider
	public String[][] register1() {
		String[][] data1= {{"virat","kohli","virat@gmail.com","virat@123","virat@123"},{"Dhoni","ms","dhoni@gmail.com","dhoni@123","dhoni@123"},{"Rohit","sharma","rohit@gmail.com","rohit@123","rohit@123"},{"sachin","T","sachin@gmail.com","sachin@123","sachin@123"}};
		return data1;
	}
	public String[][] register2(){
		String[][] data2= {{"Dhoni","ms","dhoni@gmail.com","dhoni@123","dhoni@123"}};
		return data2;
	}
	public String[][] register3(){
		String[][] data3= {{"Rohit","sharma","rohit@gmail.com","rohit@123","rohit@123"}};
		return data3;
	}
	public String[][] register4(){
		String[][] data4= {{"sachin","T","sachin@gmail.com","sachin@123","sachin@123"}};
		return data4;
	}
	
	
	
	
}
