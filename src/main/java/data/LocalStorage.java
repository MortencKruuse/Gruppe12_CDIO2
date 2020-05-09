package data;

import data.DTO.UserDTO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocalStorage {
    public static int id = 0;
   private List<UserDTO> list;

   public LocalStorage(){
       list = new ArrayList<>();
       //TODO: 08-05-2020  Sejr lav createfile her
   }


   public void createUser(String name, String ini, String cpr, String password, String role){
       UserDTO newUser = new UserDTO(id,name,ini,cpr,password,role);
       list.add(newUser);
       id++;
   }

    private void createFile(String file_user_properties, ArrayList<String> user_ArrayList)
            throws IOException {
        FileWriter writer = new FileWriter(file_user_properties + ".txt");
        int size = user_ArrayList.size();
        for (int i=0;i<size;i++) {
            String str = user_ArrayList.get(i).toString();
            writer.write(str);
            if(i < size-1)
                writer.write("\n");
        }
        writer.close();
    }
    public List<UserDTO> getUserDTO(){
       return list;
    }
}