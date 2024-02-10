package Lesson1;

// Структура, хранящая однотипные элементы Integer
// каждый элемент имеет позицию (0 .. )

public interface List301 {
    void add(Integer e) throws EmptyElementException;

    void delete(int index) throws IndexOutOfBoundsException;

    Integer pop();

    Integer get(int index) throws IndexOutOfBoundsException;

    // количество элементов
    int size();
}
