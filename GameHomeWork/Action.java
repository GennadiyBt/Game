public interface Action {
    int blow();
    int getHit(int damage);
    boolean status();
    int[] changePositions(int[] position); // Предполагается, что возможно изменение обеих координат в процессе перемещения.
    void returnCondition(); // Вот здесь как раз можно и воидовский метод, ибо его задача - просто показать нам результат после действия
                            // и использоваться эти данные нигде не предполагается в таком виде.
    
} 
