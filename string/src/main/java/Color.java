/*
* 枚举实现错误码
* */
public enum Color {
    WARNMING(-1, "警告！！！"),
    ERROR(-2, "错误！！！"),
    NoRMAL(0, "正常！！！"),
    NOTFONUND(-3, "找不到！！！");
    private int id;
    private String msg;

    private Color(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }


    public String getMsg() {
        return msg;
    }
}
