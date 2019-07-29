/**
 * @author abhishekkumar65
 *
 * 
 */
package resrAssuredTests;

import org.json.simple.JSONObject;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

/**
 * @author abhishekkumar65
 *
 */
public class PracticeClass {

    
    @Test
    public void getCall() {
        RestAssured.baseURI ="http://restapi.demoqa.com";
        RestAssured.basePath = "utilities/weather/city/";
        
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET,"bangalore");
        String responseData = response.asString();
       /* System.out.println(responseData);
        
        System.out.println(response.getStatusCode());
        System.out.println(response.getContentType());
        System.out.println(response.getStatusLine());
        System.out.println(response.getTime());
        System.out.println(response.getSessionId());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody().asString());
        System.out.println(response.htmlPath().toString());*/
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.get());
        System.out.println(jsonPath.get("City"));
    }
    
    
    @Test
    public void postCall() {
        RestAssured.baseURI ="http://restapi.demoqa.com";
        //RestAssured.basePath = "/customer/register";
        RequestSpecification httpRequest = RestAssured.given();
        JSONObject reqParms = new JSONObject();
        reqParms.put("FirstName", "jff");
        reqParms.put("LastName", "TfstfbvN");
        reqParms.put("UserName", "jhd55jggjhj");
        reqParms.put("Password", "8765ng43g4567");
        reqParms.put("Email", "sd446h@hghjk.com");
        httpRequest.body(reqParms.toJSONString());
       // Response response = httpRequest.post("/customer/register");
        Response response = httpRequest.post("http://restapi.demoqa.com/customer/register");
        //response.prettyPeek();
        
        //response.prettyPrint();
        //System.out.println(response.asString());
        //System.out.println(response.getBody().prettyPrint());
        
        ResponseBody body = response.getBody();
        System.out.println(body.asString());
    }
}
