package org.weweb.customtag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


/**
 * Created by jackshen on 2017/9/2.
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    //Element对应的类
    protected Class getBeanClass(Element element){
        return User.class;
    }
    //从element中解析对应的元素

    @Override
    protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
        String userName=element.getAttribute("userName");
        String email=element.getAttribute("email");
        String id=element.getAttribute("id");
        System.out.println(userName+"\t"+email);
        //将提取的数据放入到BeanDefinitionBuilder中，待到完成所有bean的解析后统一注册到beanFactory中
        if(StringUtils.hasText(userName)){
            builder.addPropertyValue("userName",userName);
        }
        if(StringUtils.hasText(email)){
            builder.addPropertyValue("email",email);
        }
        if(StringUtils.hasText(id)){
            builder.addPropertyValue("id",id);
        }
    }
}
