package classpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Students a = new Students();
		Teacher b = new Teacher();
		Course c= new Course();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String mName = a.getName();
		String mid = a.getId();
		String mSex = a.getSex();
		a.setId("2020322094");
		a.setName("chuanyangzhang");
		a.setSex("man");
		mName = a.getName();
		mid = a.getId();
		mSex = a.getSex();
		String teacherid=b.getId();
		String teachername = b.getName();
		String teacherclass =b.getInstruction();
		b.setId("2020322094");
		b.setName("����ʦ");
		b.setInstruction("java�ڿ���ʦ");
		teachername = b.getName();
		teacherid=b.getId();
		teacherclass=b.getInstruction();
		String courseid =c.getId();
		String coursename =c.getName();
		String courseplace =c.getPalce();
		String courseteacher=c.getTeacher();
		c.setId("123");
		c.setName("��ɢ��ѧ");
		c.setPalce("��ѧ3-206��¥");
		c.setTeacher("κ��ʦ");
		courseid =c.getId();
		coursename =c.getName();
		courseplace =c.getPalce();
		courseteacher=c.getTeacher();
		System.out.println("ѧ��ѡ��ϵͳ");
		System.out.println("Serial id is : " + mid);
		System.out.println("Name is : " + mName);
		System.out.println("Gerder is :" + mSex);
		a.setClasss("java");
		String mClass = a.getClasss();
		System.out.println("elective is :" + mClass);
		System.out.println("lecture teacher code is :"+teacherid);
		System.out.println("lecture teacher is ��"+teachername);
		System.out.println("place location is :"+teacherclass);
		System.out.println("The course id :"+courseid);
		System.out.println("Course title :"+coursename);
		System.out.println("Course plance :"+courseplace);
		System.out.println("sclooltime is :"+df.format(new Date()));
		System.out.println("lecture teacher name is :"+courseteacher);

	
       
	}
}
