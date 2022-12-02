/*
八种基本数据类型    包装类型
---------------------------
byte             java.lang.Byte
short            java.lang.Short
int              java.lang.Integer
long             java.lang.Long
float            java.lang.Float
double           java.lang.Double
boolean          java.lang.Boolean
char             java.lang.Character
*/
/*
string s1=string.valueof(100); 或者string s1=i2+""; int 转化为 string
integer.parseint("123");   string转化为int
int和integer 可以用自动拆箱 自动装箱
int 转为integer   integer.valueof(100);或者integer x=1000;
integer 转化为int intvalue();int y=x;
string转化为integer integer.valueof("1224");
integer 转化string  string.valueof(integer对象)



*/
public class integertest1 {
    public static void main(String[] args) {
        //装箱
        Integer i=new Integer(1234);
        //拆箱
        long b1=i.longValue();

        //自动装箱
        Integer a=100;
        //自动拆箱
        int a1=a;
        // 静态方法 将字符串转化为数字
        int a2=Integer.parseInt("123");
        Integer a3=Integer.valueOf("12344");
        System.out.println(a3);
        System.out.println(b1);
        System.out.println("int的最大值"+Integer.MAX_VALUE);
        System.out.println("int的最小值"+Integer.MIN_VALUE);
        System.out.println("byte的最大值"+Byte.MAX_VALUE);
        System.out.println("byte的最小值"+Byte.MIN_VALUE);
    }
}
