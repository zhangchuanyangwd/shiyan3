 
## 2020322094 张传扬 计G202
# JAVA第二次实验：
1.实验内容
·要求：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。
从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每
名学生选仅选一门课程。
对象：	人员（编号、姓名、性别）
教师（ID、姓名、性别、所授课程）
			学生（学号、姓名、性别、所选课程）
			课程（课程名称、上课地点、时间、授课老师）

2.实验方法
首先创建一个personner类
创建对象（姓名，学号，性别）
用继承方法实现学生类老师类继承personner
实例化
   Students a=new Students();
	 Teacher b=new Teacher();
	 Course c=new Course("java程序设计");
 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");用SimpleDateFormat方法输出时间
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name;
	}
使用toString（）方法
通过调用函数
3.运行截图





4.实验结果
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。



5.实验感想
1.本次实验让我熟练构造方法实例化对象，方法的调用
2.熟练继承的用法
3.实验时有很多代码报错，还需要参考课本和度娘，还是运用不够熟练以后会加强复习多敲代码
4.再次对JAVA这门课程产生了浓厚的兴趣
