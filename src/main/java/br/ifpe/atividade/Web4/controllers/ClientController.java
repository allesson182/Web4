package br.ifpe.atividade.Web4.controllers;

import br.ifpe.atividade.Web4.models.ClientModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    @GetMapping("/client")
    public String client(){
        return "client";
    }
    @PostMapping("/client")
    public String clientToString(ClientModel client){
        System.out.println(client.toString());
        return "home";
    }

}
