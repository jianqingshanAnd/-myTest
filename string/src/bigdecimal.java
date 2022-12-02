import java.math.BigDecimal;

/*
BigDecimal属于大数据 不属于基本类型 是一个引用数据类型
在java.math.BigDecimal;

* */
public class bigdecimal {
    public static void main(String[] args) {
        BigDecimal bd1=new BigDecimal(100);
        BigDecimal bd2=new BigDecimal(200);
        BigDecimal add1=bd1.add(bd2);//加
        BigDecimal divide1=bd1.divide(bd2);//除
        BigDecimal multiply1=bd1.multiply(bd2);//乘
        BigDecimal subtract1=bd1.subtract(bd2);//减
        System.out.println(add1);
        System.out.println(subtract1);

        System.out.println(multiply1);
        System.out.println(divide1);





    }
}
