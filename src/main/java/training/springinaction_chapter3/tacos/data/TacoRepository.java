package training.springinaction_chapter3.tacos.data;

import training.springinaction_chapter3.tacos.Taco;

public interface TacoRepository {
    Taco save(Taco taco);
}
