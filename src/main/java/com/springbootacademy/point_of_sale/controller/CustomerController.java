package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// These things are not changed. By applying the @RestController, this identifies as a restful api or a rest api. Then it will receive the function of the servlet. These things are not changed and this applies to the every controller. This applies to mention this as a controller.
//@CrossOrigin("https://www.google.com/") // This is mostly used for security purposes. We can give access only to the requests of frontend web link to enter into the controller. It is given by putting the web link inside the brackets. So this takes requests only from the link of the frontend related to the TestController.
// @CrossOrigin without the brackets means that take requests from any origin in to the controller. So we put this to get requests from a place where we want.
@CrossOrigin
// Above things are not changed.
@RequestMapping("api/v1/customer") // Link for the CustomerController. Keeping the TestControllers' methods of getMyText() and getMyText1() inside the CustomerController class is not a problem because the link is changed along the way.
public class CustomerController {
    @GetMapping(path = "/get-text-1") // Use to get something(data) from the database. Use GetMapping to receive data from the database. Here it goes with the path inside the brackets. But it is ok to give only with (""). This / must be here only unless there is no / at the end of the link in the brackets of RequestMapping("api/v1/test"). If we put more than one word after the /, there must have to put - among the words. This path is not necessary. But it is good to practise with the path because there are several paths in the future.
    public String getMyText(){
        String myText = "customer 1"; // This is a variable.
        System.out.println(myText);
        return myText;
    }

    // Every method has a unique link.
    // Link must be changed in somewhere.

    @GetMapping("/get-text-2") // Use to get something(data) from the database. Use GetMapping to receive data from the database.
    public String getMyText1(){
        String myText = "customer 2"; // This is a variable.
        System.out.println(myText);
        return myText;
    }
}
