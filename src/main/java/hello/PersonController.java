package hello;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("/person")
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @GetMapping("/")
    public String start() {
        return "Currently Empty";
    }

    @GetMapping("/{id}/")
    public String findPerson(@PathVariable String id) {
        return personRepository.findById(Long.valueOf(id)).toString();
    }
}
