package data;

import data.DTO.Person;

public class LocalStorage {
    public static Person morten  = new Person("Morten",21);

    public Person getMorten(){
        return morten;
    }

    public Person setMorten(Person person)
    {
        morten = person;
        return morten;
    }
}

