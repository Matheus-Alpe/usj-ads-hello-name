package br.edu.usj.ads.lpii.hellonamethymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloName {
    
    @PostMapping(value="olaPessoa")
    public ModelAndView postHelloName(@RequestParam String nome, @RequestParam String sobrenome) {
        ModelAndView modelAndView = new ModelAndView("resposta");
        
        String  msgTitulo = "Olá, " + nome + " " + sobrenome;
        String  bemVindo = "Seja bem vindo, " + nome + " " + sobrenome + "!";
        
        modelAndView.addObject("msgTitulo", msgTitulo);
        modelAndView.addObject("mensagem", bemVindo);

        return modelAndView;
    }
    
}
