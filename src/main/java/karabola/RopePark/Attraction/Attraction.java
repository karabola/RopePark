package karabola.RopePark.Attraction;


import karabola.RopePark.Location.City;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
@Data
public class Attraction {

        @Id
        private Long Id;// klucz
        private String name;


        // budujemy relacje
        @ManyToOne
        private City city;

    }
