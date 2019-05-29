package backend.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Trainer extends Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    // constructor
    //
    public Trainer() {
    }

    @Override
    public Long getID() {
        return ID;
    }

    @Override
    public void setID(Long ID) {
        this.ID = ID;
    }

}
