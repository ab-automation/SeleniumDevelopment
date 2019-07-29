/**
 * @author abhishekkumar65
 *
 * 
 */
package resrAssuredTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

/**
 * @author abhishekkumar65
 *
 */
public class TestRestFul {
    
    @Test
    public void testGetCall() {
        Response response = RestAssured.get("https://www.makemytrip.com/");
        int responseCode = response.getStatusCode();
        
        System.out.println(response.asString());
        Assert.assertEquals(responseCode, 200);
    }

    @Test
    public void testDeleteCall() {
        Response response = RestAssured.delete("https://www.makemytrip.com/");
        System.out.println(response.asString());
    }
}
