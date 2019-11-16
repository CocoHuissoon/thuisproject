package nl.chu.docker.dockerspring.resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @RequestMapping
    public String docker(Model model){
        return "index.html";
    }


}
