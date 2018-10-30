package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by XULE on 2018/10/27.
 */
public class cd {
    @org.testng.annotations.Test
    public  void t1(){

        Assert.assertEquals(1,7);
    }
    @Test
    public void t2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public  void t3(){
        Assert.assertEquals(1,5);
    }
    @Test
    public  void t4(){
        Assert.assertEquals(2,9);
    }
    @Test
    public  void t5(){
        Assert.assertEquals(2,9);
    }






}
