import java.text.SimpleDateFormat;
import java.util.Date;

public class timeString2 {
    public static void main(String[] args) {
    long nowtime=System.currentTimeMillis();
        //获取从1970年1月1日到现在的毫秒数
        System.out.println(nowtime);//1656485313740
        //统计一个方法的耗时
        long begin=System.currentTimeMillis();
        print();
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
        System.out.println("**************************");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
        Date date=new Date(246203);//时间上小时会加8 从1970.1.1 开始过去246203毫秒
        System.out.println(sdf.format(date));
        Date date2=new Date(System.currentTimeMillis()-1000*60*60*24);
        System.out.println(sdf.format(date2));
    }
    public static void print(){
        for (int i = 0; i < 10000000; i++) {
          //  System.out.println("i="+i);
        }
    }
}
