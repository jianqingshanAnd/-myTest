import java.text.DecimalFormat;

/*关于数字的格式化*/
public class num1 {
    public static void main(String[] args) {
        //#表示任意数字  ，逗号代表千分位 .点代表小数点 0 0代表不够时补零
        DecimalFormat df1=new DecimalFormat("#####,###.##");
        DecimalFormat df2=new DecimalFormat("#####,###.00000");
        String s1= df1.format(12345687.12);
        String s2= df2.format(12345687.12);
        System.out.println(s1);
        System.out.println(s2);
    }
}
