import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyThread implements Runnable{
    private static int count=5;
    @Override
    public void run() {
        try {
            File file = new File("E:\\demo\\string\\src\\main\\resources\\application.properties");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = "" ;
            while ((s=bufferedReader.readLine())!=null){
//            System.out.println(s);
                String[] split = s.split(";");
                for (String str:
                        split) {
                    String[] split1 = str.split("=");
                    if(split1[0].equals("port")){
                        System.out.println(split1[1]);
                    }
                }

            }
            fileInputStream.close();
        }catch (java.lang.Exception e){
            System.out.println(e.getMessage());
        }
        System.out.print(count--+"\t");
    }
}
