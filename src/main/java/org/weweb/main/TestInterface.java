package org.weweb.main;

/**
 * Created by wshen on 8/31/2017.
 */
class Data{
    private String name;

    public Data() {
    }

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
interface A{
    Data aa=new Data();
    void printA(Data aa);
}
interface B{
    Data bb=new Data();
    void printB(Data bb);
}
class AImpl implements A{

    @Override
    public void printA(Data aa) {
        System.out.println("AImpl "+aa.getName());
    }
    public void print(){
        System.out.println(aa);
    }
}
class BImpl implements B{

    @Override
    public void printB(Data bb) {
        System.out.println("BImpl "+bb.getName());
    }
}
class ABImpl implements A,B{

    @Override
    public void printA(Data aa) {
        System.out.println("ABImpl printA");
    }

    @Override
    public void printB(Data bb) {
        System.out.println("ABImpl printB");
    }
}
public class TestInterface {
    public static void main(String[] args) {
        ABImpl ab=new ABImpl();
        ab.printA(new Data("zhangsan"));
        ab.printB(new Data("lisi"));
        System.out.println(ab instanceof A);
        System.out.println(ab instanceof B);

        A a=ab;
        AImpl a1=new AImpl();

    }
}
