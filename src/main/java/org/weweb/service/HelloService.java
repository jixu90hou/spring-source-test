package org.weweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by jackshen on 2017/8/26.
 */
@Service
@Transactional
public class HelloService {
    @Autowired
    private DemoService demoService;
    public HelloService() {
        System.out.println("==============");
    }

   public HelloService(DemoService demoService) {
        this.demoService = demoService;
    }

    public void say(String info){
        System.out.println("Hello:"+info);
    }
    public void printHello(){
        System.out.println("demoService:"+demoService);
        demoService.print();
    }

}
