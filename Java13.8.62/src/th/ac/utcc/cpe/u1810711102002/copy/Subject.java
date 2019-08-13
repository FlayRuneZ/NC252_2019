package th.ac.utcc.cpe.u1810711102002.copy;

public class Subject {
	
	private String code;
	private String name;
	private String grade;
	private float unit;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public float getUnit() {
		return unit;
	}
	public void setUnit(float unit) {
		this.unit = unit;
	}
	
	public String toString() {
		return "" +code + ","
					+"Name : "+ name +","
					+"Unit : "+ unit +","
					+"grade : "+ grade;
	}

}
