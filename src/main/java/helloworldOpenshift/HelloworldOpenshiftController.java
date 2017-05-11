package helloworldOpenshift;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldOpenshiftController {


    @RequestMapping("hola")
    public String sayHello(){
        return ("Hola, SpringBoot on Openshift");
    }
}