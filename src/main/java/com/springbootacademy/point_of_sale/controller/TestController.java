package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.*;

@RestController // These things are not changed. By applying the @RestController, this identifies as a restful api or a rest api. Then it will receive the function of the servlet. These things are not changed and this applies to the every controller. This applies to mention this as a controller.
//@CrossOrigin("https://www.google.com/") // This is mostly used for security purposes. We can give access only to the requests of frontend web link to enter into the controller. It is given by putting the web link inside the brackets. So this takes requests only from the link of the frontend related to the TestController.
// @CrossOrigin without the brackets means that take requests from any origin in to the controller. So we put this to get requests from a place where we want.
@CrossOrigin
@RequestMapping("api/v1/test") // Here we are going to create a unique link for a backend which will be called in the methods of the frontend (e.g.:- If it is a save, then the link related to save is called.). Data are sent from servlet to controllers through RequestMapping which is a type of HandlerMapping, and it is included in the controllers. Link is created inside the ""(inverted commas). There it mentioned as api because this is an api. v1 means version 1. After v1/, we can give any name but typically the initial name of the controller is given. So only these three annotations are used to create a controller. So this is the unique link for the controller. So if the above link in the running 8081 port in this localhost which is our localhost means our computer becomes a server is called, you will get to this TestController. It works even without the api/v1/ and only with the test but is a convention in any company.
// There is no functioning when it calls this line and comes to here.
// It reads only to here which is to TestController.
// Typically, there it does not put a / at the end of link.
public class TestController {

    // This is a method.
    // So we need to read this too to run the below method.
    // If we send a GET method, there it need to give this method a type that tells what will come from the http request. So to give the type that we have to put the annotation of @GetMapping.
    // So getMyText() is the GetMapping having in the controller in the path of api/v1/test.
//    @PostMapping // Use to hit something(data) to the database. Use PostMapping to send data to the database.
    @GetMapping(path = "/get-text-1") // Use to get something(data) from the database. Use GetMapping to receive data from the database. Here it goes with the path inside the brackets. But it is ok to give only with (""). This / must be here only unless there is no / at the end of the link in the brackets of RequestMapping("api/v1/test"). If we put more than one word after the /, there must have to put - among the words. This path is not necessary. But it is good to practise with the path because there are several paths in the future.
    public String getMyText(){
        String myText = "this is my first springboot app"; // This is a variable.
        System.out.println(myText);
        return myText;
    }

    // Every method has a unique link.

    @GetMapping("/get-text-2") // Use to get something(data) from the database. Use GetMapping to receive data from the database.
    public String getMyText1(){
        String myText = "this is my second springboot app"; // This is a variable.
        System.out.println(myText);
        return myText;
    }

    // So in this way each method has a unique link because last word in each path is different.
}

// @Annotation :- Something that gives additional information to the class.
// There can be only one frontend and several backends can be there like in microservices architecture in the project. We can give access only to the requests of frontend web link to enter into the controller.

// Every method in the backend has a unique link.