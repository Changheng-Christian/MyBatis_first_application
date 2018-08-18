package com.hand.visitor;

import com.hand.mapper.VisitorMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VisitTset {

    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        VisitorMapper visitorMapper = (VisitorMapper) applicationContext.getBean("visitorBean");

        int countNum = (visitorMapper.addVisitor("Mike")) + 1;
        if (countNum == 0) {
            countNum=1;
        }
        System.out.println("Total number: " + countNum);
    }
}
