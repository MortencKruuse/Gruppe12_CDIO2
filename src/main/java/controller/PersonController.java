package controller;

import data.DTO.UserDTO;
import data.LocalStorage;
import java.util.List;


public class PersonController {
    private LocalStorage localStorage;

    public PersonController() {
        localStorage = new LocalStorage();
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
        localStorage.createUser("Bubbers", "Boob", "12345678", "iLikBoobs","Admin");
    }

    public void createUser(String name, String ini, String cpr, String password, String role) {
        localStorage.createUser(name, ini, cpr, password, role);
    }
    public void deleteUser(int ID) {
        localStorage.deleteUser(ID);
    }

    public List<UserDTO> getUsers(){
        return localStorage.getUserDTO();
    }
}

