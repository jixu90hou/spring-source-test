package org.weweb.service;

import org.springframework.stereotype.Service;

/**
 * Created by jackshen on 2017/8/27.
 */
@Service
public class DemoService {
    public DemoService(){
        System.out.println("=======DemoService=======");
    }
    public void print(){
        System.out.println("========print demo service=======");
    }
}
