package org.weweb.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by jackshen on 2017/9/2.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
