
public class Location {
	
	protected String city;
	protected double longitude; // 경도
	protected double latitude; // 위도
	
	public Location(String city, double longitude, double latitude) {
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) { 
		this.city = city;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLogitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
}

