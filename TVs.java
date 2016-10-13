package estore;

public class TVs extends Electronics {

	private String batterylife;
	public String getBatterylife() {
		return batterylife;
	}
	public void setBatterylife(String batterylife) {
		this.batterylife = batterylife;
	}
	
	public String getRemote() {
		return remote;
	}
	
	public void setRemote(String remote) {
		this.remote = remote;
	}
	
	private String remote;
	
public  void warrantyTV()
                            {
	                          int warranty=6;
	                          System.out.println("warranty of tv is :" +warranty);
   
                             }
public void tvtax()
	                         {
		                       super.Tax();
	                          }
}