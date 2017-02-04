package web.xsq.pojo;

public class City {
	
	private String id;
	private String cityID;
	private String cityName;
	private String father;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCityID() {
		return cityID;
	}
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cityID=" + cityID + ", cityName=" + cityName + ", father=" + father + "]";
	}
	
	
	
}
