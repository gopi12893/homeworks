package object;

public class Date 
{
	private int month;  //instance variables
	private int day;
	private int year;
		public Date(int m, int d, int y) 
		{
			month = m;
			day = d;
			year = y;
			                                // TODO Auto-generated constructor stub
		
		}
		public int getMonth()
		{                                   //getters
			return month;
		}
		public int getday()
		{                                   //getters
			return day;
		}
		public int getyear()
		{                                   //getters
			return year;
		}
	     public void setMonth(int m)
	     {                                 //setters
	    	 if(m >= 1 && m <= 12)
	    	 {
	    		 month = m;
	    	 }
	     }
	     public void setday(int d)
	     {                                 //setters
	    	 if(d >= 1 && d <= 30)
	    	 {
	    		day = d;
	    	 }
	     }
	     public void setyear(int y)
	     {                                 //setters
	    	 if(y >= 1 && y<= 2016)
	    	 {
	    		 year = y;
	    	 }
	     }
	     public String toString()
	     {
	    	String result = month + "/" + day + "/" + year;
	    	return result;
	     }
	     
	}