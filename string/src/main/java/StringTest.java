import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.cpw.entry.Person;
import com.cpw.exception.MyException;
import lombok.ToString;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import javax.xml.transform.Source;
import java.io.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class StringTest {
    public static JSONArray jsonArray=new JSONArray() ;
    public  static JSONObject jsonTotleObject=new JSONObject();
    public static void main(String[] args) throws java.lang.Exception {
        MapConverJson();
//        readXMLFiles();
//        changeXMLPropertise();
//        System.out.println("Hello");
        String name="9602FTC100000118";
        System.out.println(name.length());
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,7));
        System.out.println(name.substring(7,15));
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
//            System.out.println("length > 0"+e.getMessage());
//            throw new MyException(e.getMessage(),e);
////            throw new java.lang.Exception(e);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("IndexOutOfBoundsException"+e.getMessage());
//        }catch (java.lang.Exception e){
//            System.out.println("Exception"+e.getMessage());
//        }
//        MyThread myThread = new MyThr ead();
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

//        try {
//            new Exception().getException();
//
//        } catch (MyException e){
//                System.out.println("hello MyException _catch");
//                throw new java.lang.Exception(e);
//        } catch (java.lang.Exception e) {
//            System.out.println("catch Exception");
//            throw new java.lang.Exception(e);
//        }
//        Person.JACK.getAge();
//        Person.TOM.getAge();
//        Person.Rose.getAge();
//        for (Person person:
//             Person.values()) {
//            System.out.println(person.ToString());
//        }
//        File file = new File("E:\\demo\\string\\src\\main\\resources\\application.properties");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String s = "" ;
//        while ((s=bufferedReader.readLine())!=null){
////            System.out.println(s);
//            String[] split = s.split(";");
//            for (String str:
//                 split) {
//                String[] split1 = str.split("=");
//                if(split1[0].equals("port")){
//                    System.out.println(split1[1]);
//                }
//            }
//
//        }
//        fileInputStream.close();
//        String path="";
//        System.out.println(path.lastIndexOf("/"));
//        String name=path.substring(path.lastIndexOf("/"));
//        System.out.println(name);
    }
//    enum Person{
//        JACK{
//            public void getAge(){
//                System.out.println("Jack is 18");
//            }
//        },
//        Rose,
//        TOM{
//            public void getAge(){
//                System.out.println("Tom is 20");
//            }
//        };
//        public void getAge(){
//            System.out.println("SomeOne is not defined age");
//        }
//        public String ToString(){
//            return ordinal()+"\tis\t"+name();
//        }
//    }
//        public static  void  readXMLFiles(){
//            File file = new File("E:\\demo\\string\\src\\main\\resources");
//            String[] fileNames = file.list();
//            for(String fileName : fileNames){
//                System.out.println(fileName);
//                if(fileName.indexOf("stm") !=-1){
//                    System.out.println("stm-->"+fileName);
//                    changeXMLPropertise(fileName);
//
//                }else {
//                    System.out.println(fileName);
//                }
//            }
//
//
//        }
//        public static  void  changeXMLPropertise(String fileName){
//
//            SAXReader saxReader = new SAXReader();
//            try {
//                Document read = saxReader.read(new File("E:\\demo\\string\\src\\main\\resources\\"+fileName));
//                Element rootElement = read.getRootElement();
//                List service = rootElement.elements("service");
//                Iterator iterator = service.iterator();
//                while (iterator.hasNext()){
//                    Element next = (Element) iterator.next();
//                    String name = next.attribute("name").getText();
//                    next.attribute("name").setText("dev"+name);
//                    System.out.println(next.attribute("name").getText());
//                    try {
//                        XMLWriter xmlWriter = new XMLWriter(new FileWriter("E:\\demo\\string\\src\\main\\resources\\"+fileName));
//                        xmlWriter.write(read);
//                        xmlWriter.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//            } catch (DocumentException e) {
//                e.printStackTrace();
//            }
//        }
//读文件并将数组和对象调用不同方法
    public  static  void  MapConverJson(){
        String filePath="./map.txt";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String s="";
            StringBuffer sb= new StringBuffer();
            while ((s=bufferedReader.readLine())!=null){
                sb.append(s);
            }
            //控制调用相应的方法
            if(false){
                conversStringJSON(sb.toString(),0);
                System.out.println("conversStringJSON");
            }else {
                System.out.println("getMapArr");
                getMapArr(sb.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    // 将map转换为json
    public static  void conversStringJSON(String mapString,int length) throws IOException {
        //输出map
        System.out.println(mapString);
        mapString.trim();
        HashMap<String, Object> stringHashMap = new HashMap<>();
        //将map去除首位的{}；
        if(mapString.startsWith("{")){
            mapString = mapString.substring(1, mapString.length() - 1);
            System.out.println("start with {"+mapString);
        }
        String[] pairJson = mapString.split(",");
        for(String str :pairJson){
            String[] split = str.split("=");
            stringHashMap.put(split[0].trim(),split[1].trim());
        }
        System.out.println(stringHashMap.toString());
        if(length>=1){
            JSONObject json = new JSONObject(stringHashMap);
            jsonArray.add(json);
            jsonTotleObject.put("LIST",jsonArray);
        }else {
            JSONObject json = new JSONObject(stringHashMap);
            jsonTotleObject.putAll(json);
        }

        System.out.println(jsonTotleObject.toJSONString());
        String jsonString=jsonTotleObject.toJSONString();
        writeJsonFile(jsonString);
    }
    //写文件
    public static  void writeJsonFile(String jsonString) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\demo\\string\\src\\main\\JsonText.json"));
        bufferedWriter.write(jsonString);
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    //获得数组的json数据
    public static void getMapArr(String arrString) throws IOException {
        String newArrString = arrString.substring(2, arrString.length() - 2).trim();
        //数组中的},{必须紧挨
        String[] split = newArrString.split("\\},\\{");
        for(String str:split){
            conversStringJSON(str,split.length);
        }


    }
}