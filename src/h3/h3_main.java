package h3;

public class h3_main {
	public static void main(String[] args) {
		int i  = 22;
		int j = 89;
		int k = 0;
		
	   boolean b1 = false;
	   boolean b2 = false;
	   boolean b3 = false;
	   
	   
	   if (i>j) {
		   b1 = true;
	   }
	   if (i>200) {
		   
		   b2 = true;
		   
	   }
	   if (j>100) {
		   
		   b3 = true;
		   
	   }
	   
	   if (b1 == true) {
		   if (b2 = false) {
			   if (b3 == false) {
				   k = 1;
				   
				   
			   }
		   }
	   }
	   if (b1 == true) {
		   if (b2 = true) {
			   if (b3 == false) {
				   k = 2;
				   
				   
			   }
		   }
	   }
	   if (b1 == true) {
		   if (b2 = true) {
			   if (b3 == true) {
				   k = 3;
				   
				   
			   }
		   }
	   }
	   if (b1 == false) {
		   if (b2 = false) {
			   if (b3 == false) {
				   k = 4 ;
				   
				   
			   }
		   }
	   }
	   else {
		   k = -10;
		   
	   }
	}

}
