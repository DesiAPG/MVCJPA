package com.example.mvcjpa.controllers;

import com.example.mvcjpa.models.dao.IClientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClientController {

    @Autowired
    @Qualifier("clientDAOJPA")
    private IClientDAO clientDAO;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("title", "Client list");
        model.addAttribute("clients", clientDAO.findAll());
        return "list";
    }
}
