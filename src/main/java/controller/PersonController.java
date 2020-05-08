package controller;

import data.DTO.UserDTO;
import data.LocalStorage;

import java.util.ArrayList;
import java.util.List;


public class PersonController {
    private LocalStorage localStorage;

    public PersonController(){
        localStorage = new LocalStorage();
    }

    public void createUser(String name, String ini, String cpr, String password, List<String> list){
        localStorage.createUser(name,ini,cpr,password,list);
    }
}

