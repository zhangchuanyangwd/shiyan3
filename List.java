package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class List {
public void show() {
	Students a=new Students();
	 Teacher b=new Teacher();
	 Course c=new Course("java�������");
	 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
	 a.setNumber("2020322081");	
		a.setName("baishaowei");
		a.setSex("boy");
		b.setNumber("2020322033");
		b.setName("����");
		b.setInstruction("java�ڿ���ʦ");
		c.setNumber("101");
		c.setPalce("��ѧ3-206��¥");
		c.setTeacher("����");
	 String mName = a.getName();
	 String mNumber = a.getNumber();
	String mSex = a.getSex();
	mName = a.getName();
	mNumber = a.getNumber();
	mSex = a.getSex();
	
	String teachernumber=b.getNumber();
	String teachername = b.getName();
	String teacherclass =b.getInstruction();
	teachername = b.getName();
	teachernumber=b.getNumber();
	teacherclass=b.getInstruction();
	String coursenumber =c.getNumber();
 
	String courseplace =c.getPalce();
	String courseteacher=c.getTeacher();
	coursenumber =c.getNumber();
	courseplace =c.getPalce();
	courseteacher=c.getTeacher();
	  System.out.println("ѧ��ѡ��ϵͳ");
	  System.out.println("Serial number is : " + mNumber);
	  System.out.println("Name is : " + mName);
	  System.out.println("Gerder is :" + mSex);
	  a.setClasss("java");
	  String mClass = a.getClasss();
	    System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teachernumber);
		System.out.println("lecture teacher is ��"+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course number :"+coursenumber);
        System.out.println("The course name :"+c);
		System.out.println("Course plance :"+courseplace);
		System.out.println("sclooltime is :"+df.format(new Date()));
		System.out.println("lecture teacher name is :"+courseteacher);
        System.out.println("------------------------------------------");
        c.xuanke(a.name);
        System.out.println("------------------------------------------");
	    c.duike(a.name);
    
}
}
