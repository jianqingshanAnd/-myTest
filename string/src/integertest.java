public class integertest {
    public static void main(String[] args) {
        //把基本数据类型转化为object的子类
        //八种数据类型包装成包装类
       // dosome(11);
        myInt int1=new myInt(11);
        dosome(int1);

    }
    public static void dosome(Object obj){
        System.out.println("ssssss");
    }
}
//包装类  Java.long包有
class myInt{
    int a;
    public myInt() {
    }

    public myInt(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "myInt{" + "a=" + a + '}';
    }
}