package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



//8208,371,153
public class Armstrong{

    private static final Logger LOGGER= LoggerFactory.getLogger(Armstrong.class);

    public boolean isArmstrong(int n){
        int length=0;
        int p=n;
        int q=n;
        LOGGER.info("given number {}",n);
        while(n>0)
        {
            n=n/10;
            length++;
        }
        int sum=0;
        LOGGER.info("length of number {}",length);

        while(p>0){
            int temp=0;
            temp=p%10;
            sum=(int)(sum+Math.pow(temp,length));
            p=p/10;
        }
        LOGGER.info("sum of digits,each raised to power of total number of digits {}",sum);
        LOGGER.info("checking if sum {} is equal to given number {}",sum,q);
        if(sum==q)
           return true;
        else
            return false;

    }
}