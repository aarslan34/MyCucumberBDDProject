package com.practice;//package com.practice;
//
//import io.restassured.http.ContentType;
//import org.testng.annotations.Test;
//
//import static io.restassured.RestAssured.*;
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.Matchers.hasSize;
//
//public class NaveenRest {
//
//    @Test
//    public void test1(){
//        given().accept(ContentType.JSON).
//                when().
//                        get("http://ergast.com/api/f1/2017/circuits.json").
//                then().
//                        assertThat().statusCode(200).and().
//                        body("MRData.CircuitTable.Circuits.circuitId", hasSize(20)).
//                and().assertThat().header("Content-Length", "4551");
//
//
//
//    }
//}
