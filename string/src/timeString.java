import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
* java对日期类的处理
*/
public class timeString {
    public static void main(String[] args) throws ParseException {
        Date nowDate=new Date();
        System.out.println(nowDate);
        //重新格式化日期
        /*
        yyyy年 MM月 dd日 hh时 mm分 ss秒 SSS毫秒 EEE星期 a12小说技术计数的上下午
        */
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH：mm:ss SSS EEE a");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
        String nowtime=sdf.format(nowDate);
        System.out.println(nowtime);
        System.out.println(sdf2.format(nowDate));
        System.out.println("***********************************");
        /*
        将日期类字符串转化为日期类
        */
        String time="2008*08*08 02*02*02 333";
        SimpleDateFormat sdf3=new SimpleDateFormat("yyyy*MM*dd HH*mm*ss SSS");
        Date datetime=sdf3.parse(time);

        System.out.println(sdf2.format(datetime));
    }
}
