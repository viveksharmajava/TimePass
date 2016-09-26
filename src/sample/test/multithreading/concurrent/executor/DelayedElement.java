package sample.test.multithreading.concurrent.executor;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedElement implements Delayed {
	
	private Long  delayTime =null;
	private String elementName =null;

	public Long getDelayTime() {
		return delayTime;
	}

	public void setDelayTime(Long delayTime) {
		this.delayTime = delayTime;
	}

	public String getElementName() {
		return elementName;
	}

	public void setElementName(String elementName) {
		this.elementName = elementName;
	}

	public DelayedElement(Long delayTime, String elementName) {
		super();
		this.delayTime = delayTime;
		this.elementName = elementName;
	}

	@Override
	public int compareTo(Delayed o) {
		DelayedElement delayElem= (DelayedElement)o;
		// TODO Auto-generated method stub
		return this.getDelayTime().compareTo(delayElem.getDelayTime());
	}

	@Override
	public long getDelay(TimeUnit unit) {
		// TODO Auto-generated method stub
		//unit.DAYS.t
		return 0;
	}

}
