package sample.test.hibernate;

import java.util.Date;
import java.util.HashSet;

import org.hibernate.Session;

import com.timePass.util.HibernateUtils;

public class One2ManyMapping {
	public static void main(String[] args) {
		System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Stock stock =null;
		 stock = new Stock();

			stock.setStockCode("7054");
			stock.setStockName("PADINI2");

			StockDetail stockDetail = new StockDetail();
			stockDetail.setCompName("PADINI2 Holding Malaysia");
			stockDetail.setCompDesc("one stop shopping");
			stockDetail.setRemark("vinci vinci");
			stockDetail.setListedDate(new Date());

			stock.setStockDetail(stockDetail);
			stockDetail.setStock(stock);
			
			HashSet <StockDailyRecords> set = new HashSet<StockDailyRecords>();
			StockDailyRecords stockDailyRecords = new StockDailyRecords(stock, 10.12f, 12.20f, 2.08f, 1011L, new Date());
			set.add(stockDailyRecords);
			stockDailyRecords = new StockDailyRecords(stock, 10.12f, 12.20f, 2.08f, 1011L, new Date());
			set.add(stockDailyRecords);
			stockDailyRecords = new StockDailyRecords(stock, 10.12f, 12.20f, 2.08f, 1011L, new Date());
			set.add(stockDailyRecords);
		    //stock.setStockDailyRecords(set);
		    
		    session.save(stock);//IMPORT it won't insert into stock_daily_record even if you un-comment above line of code
		    //
		    stock.getStockDailyRecords().add(stockDailyRecords);
		    session.save(stockDailyRecords);
		    session.getTransaction().commit();
		    session.close();
		   // session.clear();
		   

	}

}
