//package test;
/*
 * @param none
 * @return void
 * @author Juncheng
 * @version 0.1
 */
public class Test
{
      //程序的主函数入门
	  public static void main(String args[])
	  {
	      //输出打印字符语句
	      int i = 10;
	      char czh = '\u9999';
		  double d = 5.123456789;
		  double f = 5.123456789f;

		  int f1 = 0x80000001;
		  float f2 = f1;
	  
	      System.out.println("Charzh: " + czh);
	      System.out.println("Double: " + d);
	      System.out.println("Float : " + f);
		  System.out.println("Double 的取值范围：" + Double.MAX_VALUE+"---->" + Double.MIN_VALUE);
		  System.out.println("Float 的取值范围：" + Float.MAX_VALUE+"---->" + Float.MIN_VALUE);
	      System.out.println("Float 1 : " + f2);
	  }
}
