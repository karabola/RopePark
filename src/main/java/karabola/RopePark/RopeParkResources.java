package karabola.RopePark;



import karabola.RopePark.Attraction.Attraction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ropepark")
public class RopeParkResources {

    public RopeParkRepository ropeParkRepository;

    public RopeParkResources(RopeParkRepository ropeParkRepository) {
        this.ropeParkRepository = ropeParkRepository;
    }
    @GetMapping
    public Iterable<Attraction> ropepark(){
        return ropeParkRepository.findAll();
    }
}

