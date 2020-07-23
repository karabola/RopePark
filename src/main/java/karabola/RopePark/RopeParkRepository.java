package karabola.RopePark;

import karabola.RopePark.Attraction.Attraction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RopeParkRepository extends CrudRepository<Attraction,Long> {
}
