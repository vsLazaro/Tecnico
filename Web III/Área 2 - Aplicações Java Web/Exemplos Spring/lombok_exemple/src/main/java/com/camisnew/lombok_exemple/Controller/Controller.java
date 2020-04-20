package com.camisnew.lombok_exemple.Controller;

import com.camisnew.lombok_exemple.Model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Person person;

    @GetMapping("/")
    public String indexRoute() {
        return "Bem-vindo!";
    }

    @GetMapping("/pessoa")
    public Person personRoute() {
        return new Person("Helena");
    }
}
