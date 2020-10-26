package classpackage;
 class Personner{
	static String id;
	static String name;
	static String sex;
	public Personner(String id,String name,String sex) {
		this.id=id;
		this.name=name;
		this.sex=sex;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
public class Students extends Personner{
	public Students(String id, String name, String sex) {
		super(id, name, sex);	
	}
	public Students() {
		super(id, name, sex);
	}
	

	String classs;

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}
	
}
class Teacher extends Personner{
	public Teacher(String id, String name, String sex) {
		super(id, name, sex);
	}
	public Teacher() {
		super(id, name, sex);
	}
	String  instruction;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}
class Course  {
	String Name;
    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	String id;
	String palce;
	String teacher;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPalce() {
		return palce;
	}
	public void setPalce(String palce) {
		this.palce = palce;
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	
	
}

