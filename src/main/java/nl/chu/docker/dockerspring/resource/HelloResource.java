package nl.chu.docker.dockerspring.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class HelloResource {

    @RequestMapping
    public String docker(){
        return "docker";
    }


}