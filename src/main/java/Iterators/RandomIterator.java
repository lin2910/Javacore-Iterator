package Iterators;
import java.util.Iterator;

public class RandomIterator implements Iterator<Integer> {
    Randoms randoms;
    private final int addConst; // Переменные добавлены для упрощения вычисления
    private final int randomConst;  // Чтобы не вычислять одни и те же значения на каждом шаге итератора

    public RandomIterator(Randoms randoms) {
        this.randoms = randoms;
        addConst = randoms.min + 1;
        randomConst = randoms.max - randoms.min;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randoms.random.nextInt(randomConst) + addConst;
    }
}
