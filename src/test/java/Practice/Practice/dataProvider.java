package Practice.Practice;

import java.io.IOException;
import java.util.ArrayList;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataProvider {
	
	excelUtility d= new excelUtility();

		@DataProvider
		public Object [][] getData() throws IOException{
		
		ArrayList form1data=d.getData("Form1");
		ArrayList form2data=d.getData("Form2");
		
	
		
		Object [][]users= new Object[2][11];
		users[0][0]=form1data.get(1);
		users[0][1]=form1data.get(2);
		users[0][2]=form1data.get(3);
		users[0][3]=form1data.get(4);
		users[0][4]=form1data.get(5);
		users[0][5]=form1data.get(6);
		users[0][6]=form1data.get(7);
		users[0][7]=form1data.get(8);
		users[0][8]=form1data.get(9);
		users[0][9]=form1data.get(10);
		users[0][10]=form1data.get(11);
		
		users[1][0]=form2data.get(1);
		users[1][1]=form2data.get(2);
		users[1][2]=form2data.get(3);
		users[1][3]=form2data.get(4);
		users[1][4]=form2data.get(5);
		users[1][5]=form2data.get(6);
		users[1][6]=form2data.get(7);
		users[1][7]=form2data.get(8);
		users[1][8]=form2data.get(9);
		users[1][9]=form2data.get(10);
		users[1][10]=form2data.get(11);
		
		return users;
		
	}
		
		@DataProvider
		public Object[] getSeachData() throws IOException{
		
		ArrayList searchtext=d.getData("SeachData");
		
		for(int i=0;i<searchtext.size();i++) {
			
	System.out.println(searchtext.get(i));
		}
		
		
		Object[]searchdata= new Object[1];
		searchdata[0]="Wireframes";
		
		
		return searchdata;
		
	}
	
}
