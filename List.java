package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class List {
public void show() {
	Students a=new Students();
	 Teacher b=new Teacher();
	 Course c=new Course("java程序设计");
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//日期
	 a.setId("2020322094");	
		a.setName("zhangchuanyang");
		a.setSex("man");
		b.setId("2020322094");
		b.setName("Mr张");
		b.setInstruction("java老师");
		c.setId("123");
		c.setPalce("教学3-206号楼");
		c.setTeacher("张老师");
	String mName = a.getName();
	String mId = a.getId();
	String mSex = a.getSex();
	mName = a.getName();
	mId = a.getId();
	mSex = a.getSex();
	
	String teacherid=b.getId();
	String teachername = b.getName();
	String teacherclass =b.getInstruction();
	teachername = b.getName();
	teacherid=b.getId();
	teacherclass=b.getInstruction();
	String courseid =c.getId();
 
	String courseplace =c.getPalce();
	String courseteacher=c.getTeacher();
	courseid =c.getId();
	courseplace =c.getPalce();
	courseteacher=c.getTeacher();
	  System.out.println("学生选课系统");
	  System.out.println("Serial id is : " + mId);
	  System.out.println("Name is : " + mId);
	  System.out.println("Gerder is :" + mSex);
	  a.setClasss("java");
	  String mClass = a.getClasss();
	    System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teacherid);
		System.out.println("lecture teacher is ："+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course id :"+courseid);
        System.out.println("The course name :"+c);
		System.out.println("Course plance :"+courseplace);
		System.out.println("sclooltime is :"+df.format(new Date()));
		System.out.println("lecture teacher name is :"+courseteacher);
        System.out.println("--------------------------------------------------");
        c.xuanke(a.name);
        System.out.println("--------------------------------------------------");
	    c.duike(a.name);
    
}
}
