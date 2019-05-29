package backend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Member extends Person implements Serializable {

    @ManyToOne
    private Person person;

    @ManyToMany
    List<Team> teams = new ArrayList<Team>();

    public Member() {
    }

}
