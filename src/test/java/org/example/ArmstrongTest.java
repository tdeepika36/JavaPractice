package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArmstrongTest{
    Armstrong obj=new Armstrong();


    @Test
    void isArmstrongOrNot(){
        assertEquals(true,obj.isArmstrong(153));
    }
    @Test
    void isArmsNegative(){

        assertEquals(false,obj.isArmstrong(-123));
    }
    @Test
    void isArmsFalse(){

        assertEquals(true,obj.isArmstrong(0));
    }
    @Test
    void isNotArmstrong(){

        assertEquals(false,obj.isArmstrong(1234));
    }

}