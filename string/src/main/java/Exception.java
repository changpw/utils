import com.cpw.exception.MyException;

public class Exception  {


    String name="hellor";
    public void getException()  throws java.lang.Exception {
        if ("hello".equals(name)){
            throw new MyException("hello MyException");

        }else if("hello1".equals(name)){
            throw new RuntimeException("Hello:RuntimeException");
        }else {
            throw new java.lang.Exception("Hello:Exception");
        }

    }
}
