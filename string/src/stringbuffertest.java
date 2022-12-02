public class stringbuffertest {
    public static void main(String[] args) {
        //大量字符串拼接  默认16位 可以自己赋初始值
        //string buffer //synchronized  在多线程环境下安全
        //string builder
        StringBuffer sb=new StringBuffer();
        sb.append(11);
        sb.append("a");
        sb.append(3.14);
        sb.append(100L);
        sb.append(true);
        System.out.println(sb);//11a3.14100true
    }
}
