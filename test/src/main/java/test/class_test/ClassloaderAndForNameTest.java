package test.class_test;

/**
 * Class.forName和classloader的区别
 * <p>
 * Created by lxk on 2017/2/21
 */
public class ClassloaderAndForNameTest {
  public static void main(String[] args) {
    String wholeNameLine = "test.class_test.Line";
    String wholeNamePoint = "test.class_test.Point";
    System.out.println("下面是测试Classloader的效果");
    testClassloader(wholeNameLine, wholeNamePoint);
    System.out.println("----------------------------------");
    System.out.println("下面是测试Class.forName的效果");
    testForName(wholeNameLine, wholeNamePoint);

  }

  /**
   * classloader
   */
  private static void testClassloader(String wholeNameLine, String wholeNamePoint) {
    Class<?> line;
    Class<?> point;
    ClassLoader loader = ClassLoader.getSystemClassLoader();
    try {
      line = loader.loadClass(wholeNameLine);
      point = loader.loadClass(wholeNamePoint);
      //demo = ClassloaderAndForNameTest.class.getClassLoader().loadClass(wholeNamePoint);//这个也是可以的
      System.out.println("line   " + line.getName());
      System.out.println("point   " + point.getName());
      //只有在 newInstance 才会去执行 static 块。
      Object o = point.newInstance();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /**
   * Class.forName
   */
  private static void testForName(String wholeNameLine, String wholeNamePoint) {

    try {
      Class line = Class.forName(wholeNameLine);
      Class point = Class.forName(wholeNamePoint);
      System.out.println("line   " + line.getName());
      System.out.println("point   " + point.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
