package karabola.RopePark.Location;


import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
@Data
public class Region extends Location {

    @Id
    private Long Id;
    private String name;
}