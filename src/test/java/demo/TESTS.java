package demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by XULE on 2018/10/25.
 */
public class TESTS {
    @Test
    public  void a(){
        Assert.assertEquals(1,2);
    }
    @Test
    public  void b(){
        Assert.assertEquals(1,1);
    }
    @Test
    public  void log(){
        Reporter.log("这是Test的report输出");
        throw new RuntimeException("这是我自己运行的异常");
    }

}
