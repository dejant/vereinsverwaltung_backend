package backend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Roommanager extends Person implements Serializable {

    @ManyToOne
    private Person person;

    @ManyToMany
    List<Room> rooms = new ArrayList<Room>();

    public Roommanager() {
    }
}
