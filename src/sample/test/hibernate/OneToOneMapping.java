package sample.test.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.timePass.util.HibernateUtils;

public class OneToOneMapping {
	public static void main(String[] args) {

		System.out.println("Hibernate one to one (Annotation)");
		Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Stock stock =null;
        // Insert record 
		/*

		 stock = new Stock();

		stock.setStockCode("7052");
		stock.setStockName("PADINI");

		StockDetail stockDetail = new StockDetail();
		stockDetail.setCompName("PADINI Holding Malaysia");
		stockDetail.setCompDesc("one stop shopping");
		stockDetail.setRemark("vinci vinci");
		stockDetail.setListedDate(new Date());

		stock.setStockDetail(stockDetail);
		stockDetail.setStock(stock);

		session.save(stock);
		*/
		
		//Fetch records
		/*
		
		stock =(Stock)session.get(Stock.class, 1050);
		System.out.println("stock name="+stock.getStockName()+"\t stock records Company="+stock.getStockDetail().getCompName());
	
		//TODO delete records
		session.delete(stock);*/
		stock = new Stock();
		stock.setStockName("PADINI");
		//session.delete(stock); //Note it won't delete record because stock name is not identifier (primary key
		Query query = session.createQuery("from Stock");
		List<Stock>  list= (List<Stock>)query.list();
		System.out.println(" list before deleting="+list);
		Iterator <Stock>stockIt = list.iterator();
		while(stockIt.hasNext()){
			session.delete((Stock)stockIt.next());
		}
	    session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}

}
