package in.lakshmi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection {
public static void main(String[] args) throws Exception {
	Class clz = Class.forName("in.lakshmi.ReflectStudent");
	Object ob = clz.newInstance();
	Field field = clz.getDeclaredField("age");
    field.setAccessible(true);
    field.set(ob, 10);
    ReflectStudent rs= (ReflectStudent)ob;
    rs.getAge();
    System.out.println(rs.getAge());
	Field[] fields = clz.getDeclaredFields();
	for (Field f : fields) {
		System.out.println(f.getName());
	}
  Method[] methods = clz.getDeclaredMethods();
  for(Method m : methods) {
	  System.out.println(m.getName());
  }

  Method method = clz.getDeclaredMethod("getAge");
  method.invoke(ob, null);
}
}
