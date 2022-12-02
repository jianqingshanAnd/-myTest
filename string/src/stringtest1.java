import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class stringtest1 {
    public static void main(String[] args) {
        String s1="你好";
        String s2=new String("你好");
        String s3="你好";
        System.out.print(s1.equals(s2));//true
        System.out.println(s1==s2);//FLASE
        /*
        * ==判断的是地址之类的
        * */
//        System.out.println(s1.hashCode()+"@"+s1.getClass());
//        System.out.println(s2.hashCode());
//        System.out.print(s3.hashCode());
        byte[] by={97,98,99};
        String s4=new String(by);
        System.out.println(s4);//abc
        //返回对应下表的值
        char c1="qwertyuiop".charAt(4);
        System.out.println(c1);//t
        /*比较两个字符集
         按字典顺序比较两个字符串。 比较是基于字符串中每个字符的Unicode值。
        由该String对象表示的字符序列按字典顺序与由参数字符串表示的字符序列进行比较。
        如果String对象按字典顺序排列在参数字符串之前，结果为负整数。 结果是一个正整数，如果String对象按字典顺序跟随参数字符串。
        如果字符串相等，结果为零;
        compareTo返回0 ，当equals(Object)方法将返回true 。
         */
        int result="asdf".compareTo("asd");
        System.out.println(result);//结果1
        //当且仅当此字符串包含指定的字符串序列时才返回true
        boolean b1="hello,world".contains("hello");
        System.out.println(b1);//ture
        //判断该字符串是否以某个字符串的结尾
        boolean b4="hello,world".startsWith("hello");//true
        System.out.println(b4);
        //判断该字符串是否是以传入的参数结尾
        boolean b2="hello,world".endsWith(",world");
        System.out.println(b2);//ture
        //忽略大小写 比较两个字符串是否相等
        boolean b3="ABc".equalsIgnoreCase("abc");
        System.out.println(b3);//true
        //将字符串转换为小写
        System.out.println("DFASDsada".toLowerCase(Locale.ROOT));//dfasdsada
        //将字符串转换为小写
        System.out.println("DFASDsada".toUpperCase(Locale.ROOT));//DFASDSADA
        System.out.println("*******************************************");
        //将字符串对象转化为byte数组
        byte[] by1="sdfsuipf".getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < by1.length; i++) {
            System.out.print(by1[i]+"  ");//115  100  102  115  117  105  112  102
        }
        System.out.println();
        //将字符串转化为char数组
        char[] chars="我是谁".toCharArray();//我    是    谁
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+"    ");
        }
        System.out.println();
        //判断某个字符串第一次出现的下标
        System.out.println("awwewzxcv".indexOf("ewzx"));//3
        //判断某个字符串最后一次出现的下标
        System.out.println("sasasasdasderfg".lastIndexOf("sas"));//4
        //判断字符串是否为空字符串 不是null
        String s5="123a";
        String s6=new String();
        System.out.println(s5.isEmpty());//false
        System.out.println(s6.isEmpty());//true
        //输出字符串长度  这个是方法 而数组的是属性
        System.out.println(s5.length());
        System.out.println("*************************");
        String str="qwertyuiop";
        //截取字符串到结束
        System.out.println(str.substring(3));//rtyuiop
        //截取一部分字符串 左闭右开
        System.out.println(str.substring(3,5));//rt
        //替换字符串中的一部分内容
        String newStr="我今天学习了string".replace("string","String");
        System.out.println(newStr);//我今天学习了String
        //拆分字符串 以-为分隔符拆分
        String[] ss1="wadaw-ada-fggd-rgdgdg".split("-");
        for (int i = 0; i < ss1.length; i++) {
            System.out.print(ss1[i]+"  ");
        }
        //wadaw  ada  fggd  rgdgdg
        System.out.println("------------------------");
        //去除字符串前后空白 不能去除中间的空白
        System.out.println("    qw  1  2     ".trim());//qw  1  2
        /*
        string中只有一个静态方法 不需要new对象
        valueof
        将非字符串转换为字符串
        */
        String s7=String.valueOf(123456);
        String s8=String.valueOf(true);
        System.out.println(s7+"   "+s8);//123456   true

    }
}
