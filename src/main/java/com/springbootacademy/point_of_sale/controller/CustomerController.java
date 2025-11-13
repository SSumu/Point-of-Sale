package com.springbootacademy.point_of_sale.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
// These things are not changed. By applying the @RestController, this identifies as a restful api or a rest api. Then it will receive the function of the servlet. These things are not changed and this applies to the every controller. This applies to mention this as a controller.
//@CrossOrigin("https://www.google.com/") // This is mostly used for security purposes. We can give access only to the requests of frontend web link to enter into the controller. It is given by putting the web link inside the brackets. So this takes requests only from the link of the frontend related to the TestController.
// @CrossOrigin without the brackets means that take requests from any origin in to the controller. So we put this to get requests from a place where we want.
@CrossOrigin
// Above things are not changed.
public class CustomerController {
}
