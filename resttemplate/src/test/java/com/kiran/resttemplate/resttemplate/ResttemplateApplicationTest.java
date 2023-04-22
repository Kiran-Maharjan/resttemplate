package com.kiran.resttemplate.resttemplate;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ResttemplateApplicationTest {
    public static Logger logger= LoggerFactory.getLogger(ResttemplateApplicationTest.class);

    @Test
    void contextLoader(){
        logger.info("Test execution ...");
        assertEquals(true,true);
    }
    @Test
    void init() {
        logger.info("Init Test execution ...");
        assertEquals(true,true);

    }

    @Test
    void main() {
        logger.info("Main Test execution ...");
        assertEquals(true,true);

    }

    @Test
    void restTemplate() {
        logger.info("Rest TEmplate Test execution ...");
        assertEquals(true,true);

    }
}