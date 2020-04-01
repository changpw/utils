import com.cpw.entry.Person;

import java.time.LocalDate;

public class StringTest {
    public static void main(String[] args) {
//         String 是不可变对象
//        String str = "1232235";
//      不可变对象的解决方法
//        str=str.replace("2","5");
//        System.out.println(str);
//        str=String.join("-","123","135",str);
//        System.out.println(str);
//        equalsIgnoreCase
//        String str = "Hello";
//        boolean hello = str.equalsIgnoreCase("hello");
//        System.out.println(hello);
        int [] numbers = {2,5,6,7};
        String s = new String(numbers, 0, 4);
        System.out.println(s);
        LocalDate now = LocalDate.now();
        now = now.plusDays(1);
        System.out.println(now.toString());
        Color blue = Color.NoRMAL;
        System.out.println(blue.getMsg());
        Person person = Person.getInstance();
        Person person1 = Person.getInstance();
        System.out.println(person==person1);

    }

}
