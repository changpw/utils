import com.cpw.exception.MyException;

public class Exception  {


    String name="hello";
    public void getException()  throws java.lang.Exception {
        if ("hello".equals(name)){
            throw new MyException("hello \n MyException");

        }else if("hello1".equals(name)){
            throw new RuntimeException("Hello:RuntimeException");
        }else {
            throw new java.lang.Exception("Hello:Exception");
        }

    }
}
