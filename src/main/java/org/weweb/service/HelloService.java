package org.weweb.service;

/**
 * Created by jackshen on 2017/8/26.
 */
public class HelloService {
    private DemoService demoService;

    public HelloService() {
    }

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    public HelloService(DemoService demoService) {
        this.demoService = demoService;
    }

    public void say(String info){
        System.out.println("Hello:"+info);
    }
    public void printHello(){
        demoService.print();
    }
}
