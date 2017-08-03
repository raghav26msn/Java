package com.org.beanio;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.beanio.BeanReader;
import org.beanio.StreamFactory;

public class BeanIoMain
{  
    public void readCSVFileUsingBeanIo()
    {
        StreamFactory factory = StreamFactory.newInstance();
        factory.loadResource("track2.xml");
        
        //read it from the classpath : src/main/resources
        InputStream in = this.getClass().getResourceAsStream("input.csv");
        BeanReader reader = factory.createReader("tracks", new InputStreamReader(in));
        Object record = null;
        BX bx = new BX();
        while (( record = reader.read()) != null)
        {
            if ("generalShipmentInformation".equals(reader.getRecordName()))
            {
            	bx = (BX) record;
            	System.out.println(bx);
            }
        }
    }
    
    public static void main(String[] args)
    {
        new BeanIoMain().readCSVFileUsingBeanIo();
    }
}
