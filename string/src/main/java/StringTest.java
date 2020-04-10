import com.alibaba.fastjson.JSONObject;
import com.cpw.entry.Person;
import com.cpw.exception.MyException;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class StringTest {
    public static void main(String[] args) throws java.lang.Exception {

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
//
//        String s ;
//
//        try {
//           Exception exception = new Exception();
//           exception.getException();
//        }catch (MyException e){
////            System.out.println("length > 0"+e.getMessage());
//            throw new Exception(e);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBoundsException"+e.getMessage());
//        }
////        MyThread myThread = new MyThread();
//        Thread a = new Thread(myThread, "A");
//        Thread b = new Thread(myThread, "B");
//        Thread c = new Thread(myThread, "C");
//        for (int i =0 ; i<99;i++){
//            MyThread myThread = new MyThread();
//            Thread a = new Thread(myThread, "A"+i);
//            a.start();
//        }
//        a.start();
//        b.start();
//        c.start();
//        new StringTest().getStaticValue();
//
//    }
//    public static void  getStaticValue(){
//         int age = 11;
//        id=1;
//        System.out.println(id
//        HashMap<String, List<Map<String, Object>>> stringListHashMap = new HashMap<>();
//        ArrayList<Map<String, Object>> maps = new ArrayList<>();
//        HashMap<String, Object> stringObjectHashMap1 = new HashMap<>();
//        stringObjectHashMap1.put("String","yupt");
//        maps.add(stringObjectHashMap1);
//        stringListHashMap.put("loop",maps);
//        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
//        stringObjectHashMap.put("loop",stringListHashMap);
//        Map<String, List<Map<String, Object>>> loop = (Map<String, List<Map<String, Object>>>) stringObjectHashMap.get("loop");
//        System.out.println(loop.toString());
//        try {
//            throw  new Exception("kkkkk");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//

        try {
            new Exception().getException();

        } catch (MyException e){
                System.out.println("hello MyException _catch");
                throw new java.lang.Exception(e);
        } catch (java.lang.Exception e) {
            System.out.println("catch Exception");
            throw new java.lang.Exception(e);
        }
    }

}
