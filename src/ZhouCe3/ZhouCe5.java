package ZhouCe3;

public class ZhouCe5 {
    public static void main(String[] args){
        ZhouCe5 hello = new ZhouCe5();

        hello.print();
        hello.print("a");
        hello.print(25);

    }
    public void print(){
        System.out.println("无参构造方法");
    }
    public void print(String name) {
        System.out.println("带有一个字符串参数的prin方法，参数值为："+name);
    }
    public void print(int ago) {
        System.out.println("带有一个整数型参数的prin方法，参数值为："+ago);
    }
}
