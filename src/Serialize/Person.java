package Serialize;

import java.io.Serializable;

public class Person implements Serializable {

    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }

public String toString() {
        return id+":"+ name;
}

    public Person(int id, String name) {
        this.id=id;
        this.name=name;
    }



}


