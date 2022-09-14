package Interface;

import java.util.List;

import Hero.BaseHero;

public interface Action {
    
    void info(); // Вот здесь как раз можно и воидовский метод, ибо его задача - просто показать нам результат после действия
                            // и использоваться эти данные нигде не предполагается в таком виде.

    void step(List<BaseHero> warriors); 

    
} 
