package br.ifpe.atividade.Web4.controllers;

import br.ifpe.atividade.Web4.models.ProviderModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProviderController {

    @GetMapping("/provider")
    public String providerPage(){
        return "provider";
    }
    @PostMapping("/provider")
    public String providerToString(ProviderModel providerModel){
        System.out.println(providerModel.toString());
        return "home";
    }


}
