package web.xsq.pojo;

public class Area {
	
	private String id;
	private String areaID;
	private String areaName;
	private String father;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAreaID() {
		return areaID;
	}
	public void setAreaID(String areaID) {
		this.areaID = areaID;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	@Override
	public String toString() {
		return "Area [id=" + id + ", areaID=" + areaID + ", areaName=" + areaName + ", father=" + father + "]";
	}
}
