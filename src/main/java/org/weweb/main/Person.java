package org.weweb.main;

/**
 * Created by jackshen on 2017/8/26.
 */
class SuperPerson{
    private String info;
    public void setInfo(String info){
        this.info=info;
    }
    public String getInfo(){
        return info;
    }
    @Override
    public String toString() {
        System.out.println(getInfo());
        return "nihao super person";
    }
}
public class Person {

    public static void main(String[] args) {
        SuperPerson superPerson=new SuperPerson();
        superPerson.setInfo("hello world");
        System.out.println(superPerson);
    }
}
