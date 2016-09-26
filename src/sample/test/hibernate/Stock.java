package sample.test.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name="STOCK",uniqueConstraints={@UniqueConstraint(columnNames="STOCK_NAME"),@UniqueConstraint(columnNames="STOCK_CODE")})
public class Stock implements java.io.Serializable{
	
	private Integer stockId;
	private String stockName;
	private String stockCode;
	private StockDetail stockDetail;
	private Set<StockDailyRecords>  stockDailyRecords = new HashSet<StockDailyRecords>();
	public Stock() {
	}

	public Stock(String stockCode, String stockName) {
		this.stockCode = stockCode;
		this.stockName = stockName;
	}

	public Stock(String stockCode, String stockName, StockDetail stockDetail) {
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.stockDetail = stockDetail;
	}
	
	@Id
	@SequenceGenerator(name="stock_seq", sequenceName="stock_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="stock_seq")
	@Column(name="STOCK_ID",unique=true , nullable=false)
	public Integer getStockId(){
		return this.stockId;
	}
	
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	@Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
	public String getStockCode() {
		return this.stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	@Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	@OneToOne(fetch=FetchType.LAZY , mappedBy="stock",cascade=CascadeType.ALL)
	public StockDetail getStockDetail() {
		return this.stockDetail;
	}	
	public void setStockDetail(StockDetail stockDetail) {
		this.stockDetail = stockDetail;
	}

	@OneToMany(fetch=FetchType.LAZY ,mappedBy="stock")
	public Set<StockDailyRecords> getStockDailyRecords() {
		return stockDailyRecords;
	}

	public void setStockDailyRecords(Set<StockDailyRecords> stockDailyRecords) {
		this.stockDailyRecords = stockDailyRecords;
	}
	

}
