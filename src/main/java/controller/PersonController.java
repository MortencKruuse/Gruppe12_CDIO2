package controller;

import data.DTO.UserDTO;
import data.LocalStorage;
import java.util.List;


public class PersonController {
    private LocalStorage localStorage;

    public PersonController() {
        localStorage = new LocalStorage();
    }

    public void createUser(String name, String ini, String cpr, String password, String role) {
        localStorage.createUser(name, ini, cpr, password, role);
    }
    public void deleteUser(int id) {
        localStorage.deleteUser(id);
    }

    public List<UserDTO> getUsers(){
        return localStorage.getUserDTO();
    }
}

