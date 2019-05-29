package backend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Materialmanager extends Person{

    @ManyToOne
    private Person person;

    @ManyToMany
    List<Material> material = new ArrayList<Material>();

    public Materialmanager() {
    }

}
