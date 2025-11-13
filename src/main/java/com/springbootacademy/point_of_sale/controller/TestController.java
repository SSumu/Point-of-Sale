package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // These things are not changed. By applying the @RestController, this identifies as a restful api or a rest api. Then it will receive the function of the servlet. These things are not changed and this applies to the every controller. This applies to mention this as a controller.
//@CrossOrigin("https://www.google.com/") // This is mostly used for security purposes. We can give access only to the requests of frontend web link to enter into the controller. It is given by putting the web link inside the brackets. So this takes requests only from the link of the frontend related to the TestController.
// @CrossOrigin without the brackets means that take requests from any origin in to the controller. So we put this to get requests from a place where we want.
@CrossOrigin
@RequestMapping("api/v1/test") // Here we are going to create a unique link for a backend which will be called in the methods of the frontend (e.g.:- If it is a save, then the link related to save is called.). Data are sent from servlet to controllers through RequestMapping which is a type of HandlerMapping, and it is included in the controllers. Link is created inside the ""(inverted commas). There it mentioned as api because this is an api. v1 means version 1. After v1/, we can give any name but typically the initial name of the controller is given. So only these three annotations are used to create a controller. So this is the unique link for the controller. So if the above link in the running 8081 port in this localhost which is our localhost means our computer becomes a server is called, you will get to this TestController. It works even without the api/v1/ and only with the test but is a convention in any company.
public class TestController {

    // This is a method.
    public void getMyText(){
        String myText = "this is my first springboot app"; // This is a variable.
        System.out.println(myText);
    }
}

// @Annotation :- Something that gives additional information to the class.
// There can be only one frontend and several backends can be there like in microservices architecture in the project. We can give access only to the requests of frontend web link to enter into the controller.

// Every method in the backend has a unique link.