package classpackage;
 class Personner{
	static String id;
	static String name=null;
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
	String Name=null;
   
	int arress;
	String time;
	String id;
	String palce;
	String teacher;
	String [] a= {"java","java web","ps"};
	public Course(String name) {
		
		this.Name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name;
	}
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
	public void xuanke(String name){
		Students students=new Students();
		students.getName();
		students.setId("2020322094");
		students.setName("Mr张");
		String bh;
		bh=students.getId();
	    if(students.getId()=="2020322094") {
	    	arress=301;time="8:00";
	    	System.out.println("学生姓名："+students.getName());
	    	System.out.println("学生选的课 ："+a[0]);
	    	System.out.println("上课时间："+time);
		System.out.println("上课地点："+arress+"教室");
	    	
	    }else  {
	    	System.out.println("你输入的课程有误");
	    }
	}
	public void duike(String name) {
		Students students=new Students();
		students.getName();
		students.setId("2020322094");
		students.setName("Mr张");
		String bh;
		bh=students.getId();
		if(students.getId()=="2020322094") {
			System.out.println("学生姓名："+students.getName());
			System.out.println("你选的课已不存在，请重新选课");
		}
	}
	
	
	
}

