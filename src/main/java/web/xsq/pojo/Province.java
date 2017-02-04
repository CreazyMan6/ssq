package web.xsq.pojo;

public class Province {

	private String id ;
	private String provinceID;
	private String provinceName;
	private String father;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProvinceID() {
		return provinceID;
	}
	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", provinceID=" + provinceID + ", provinceName=" + provinceName + ", father="
				+ father + "]";
	}


	
}
