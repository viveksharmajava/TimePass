package sample.test;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;





public class TrainingSessionUtil {
	
	public static void main(String []args)
	{
		
		Calendar startCal = Calendar.getInstance();
	    Calendar endCal = Calendar.getInstance();
	    Date date = new Date();
		 System.out.println("days of month="+date.getDay());
		 date.setDate(1);
		 System.out.println("days of month="+date.getDay());
	    
		 getSchedule(startCal,endCal,1,0);
	}
	
	
	@SuppressWarnings("deprecation")
	static Date[] getSchedule(Calendar startCal ,Calendar endCal, int weekNo,int day){
		
		 Date [] dates =null; 
		 Date date = new Date();
		 
		 Date endDate = new Date();
		 endDate.setMonth(8);
		 date.setDate(1);
		 int monthFirstDay =date.getDay() ;
		  int dayCount =0;
		  int m = date.getMonth();
		  int endMonth= endDate.getMonth();
		  for( int i =m ;i<= endMonth;i++)
		  {
			  if (date.getDay() == day){//fistday of month
					
				  System.out.println("first day of month");
				  
				 }else{
					 //2 - 0; 
					
					  int k= monthFirstDay;
					
					  while(k!=day){
						  dayCount++;
						  k++;
						  if(k >6) k=0;
						  
					  }
						  
					  }
					
			    	int dateOfEachMonth = 0;
					for (int w =0 ;w<weekNo*7 ;w+=7 ){
						
						dateOfEachMonth = dayCount+w;
						
					}
					date.setDate(dateOfEachMonth);
					System.out.println(" final date="+date.getDate()+"\t and day="+date.getDay());
					System.out.println(" month="+date.getMonth());
					date.setMonth(i);
				 }
		

		 
		 
		 
		 
		
		return dates;
	}
}

enum DaysName{
	SUNDAY(0,"Sunday"),
	MONDAY(1,"Monday"),TUESDAY(2,"Tuesday"),WEDNESDAY(3,"Wednesday"),THURSDAY(4,"Thursday"),FRIDAY(5,"Friday"),SATURDAY(6,"Saturday");
	
	private String name ;
	private int  intVal;
	
	private DaysName(int intVal,String name){
		this.name=name;
		this.intVal=intVal;
	}

	public String getName() {
		return name;
	}

	

	public int getIntVal() {
		return intVal;
	}

	
	public static DaysName getDaysName(int intVal){
		DaysName daysName=null;
		if(intVal >=0 && intVal<=6){
			DaysName []daysArr = DaysName.values();
			for(int i=0;i<=daysArr.length;i++){
				if(daysArr[i].getIntVal()== intVal);
				daysName= daysArr[i];
				break;
			}
		}
		
		return daysName;
	}
	
}
