package data;

import data.DTO.UserDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalStorage {
    static List<String> roles = new ArrayList<>(Arrays.asList("Pharmaceut"));
   private static UserDTO userDTO = new UserDTO(2,"Bubbi","Bub","123456-7890","1234",roles);
   private List<UserDTO> list;

   public UserDTO getUserDTO(String username){
       return userDTO;
   }
}
