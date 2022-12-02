import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 */
public class date {
    public static void main(String[] args) throws ParseException {
        //格式
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2=new SimpleDateFormat("YYYY-MM-dd");
        //字符
        String date="2021-12-31";
        //字符串转换为date
        Date parse1 = sdf1.parse(date);
        Date parse2 = sdf2.parse(date);
        System.out.println(parse1);
        //date转换为字符串
        String format1 = sdf1.format(parse1);
        String format2 = sdf1.format(parse2);

        Date parse = sdf1.parse(format1);
        System.out.println(parse);
        System.out.println(format1);
        System.out.println(format2);

    }
}
