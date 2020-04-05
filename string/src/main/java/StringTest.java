import com.cpw.entry.Person;
import com.cpw.exception.MyException;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class StringTest {
    public static void main(String[] args) throws CloneNotSupportedException {
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
//        int [] numbers = {2,5,6,7};
//        String s = new String(numbers, 0, 4);
//        System.out.println(s);
//        LocalDate now = LocalDate.now();
//        now = now.plusDays(1);
//        System.out.println(now.toString());
//        Color blue = Color.NoRMAL;
//        System.out.println(blue.getMsg());
//        Person person = Person.getInstance();
//        Person person1 = Person.getInstance();
//        System.out.println(person==person1);
//        Person person = new Person("zs", "12", "aaaa", "man",new Date());
//        Person clone = person.clone();
//        clone.setName("jk");
//        System.out.println(person.toString());
//        System.out.println(clone.toString());
//
//         String [] stringArray ={"1","200","153","8"};
//         stringArray= new String[0] ;
//        Arrays.sort(stringArray,(String s1,String s2)->  Integer.parseInt(s1)-(Integer.parseInt(s2)));
//        System.out.println(Arrays.toString(stringArray));
//        String s ;
//        try {
//             s = stringArray[0];
//            if(stringArray.length>0){
//                throw new MyException("数组长度大于0");
//            }else if (stringArray.length==0){
//                throw new RuntimeException("数组长度等于0");
//            }
//        }catch (MyException e){
//            System.out.println("length > 0"+e.getMessage());
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBoundsException"+e.getMessage());
//        }
//        MyThread myThread = new MyThread();
//        Thread a = new Thread(myThread, "A");
//        Thread b = new Thread(myThread, "B");
//        Thread c = new Thread(myThread, "C");
        for (int i =0 ; i<99;i++){
            MyThread myThread = new MyThread();
            Thread a = new Thread(myThread, "A"+i);
            a.start();
        }
//        a.start();
//        b.start();
//        c.start();


    }

}
