package karabola.RopePark.Location;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
@Data
public class City extends Location {

        @Id
        private Long Id;
        private String name;

        @ManyToOne
        private Region region;
}
