package training.springinaction_chapter3.tacos.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import training.springinaction_chapter3.tacos.Taco;

@Repository
public interface TacoRepository extends CrudRepository<Taco, Long> {

}
