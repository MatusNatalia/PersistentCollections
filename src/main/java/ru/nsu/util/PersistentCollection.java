package ru.nsu.util;

/**
 * Персистентная коллекция
 * @param <E> тип элементов
 */
public interface PersistentCollection<E> {

    /**
     * Возвращает размер текущей версии коллекции
     * @return размер текущей версии коллекции
     */
    int size();

    /**
     * Возвращает размер указанной версии коллекции
     * @param version версия коллекции
     * @return размер указанной версии коллекции
     */
    int size(int version);

    /**
     * Добавляет новый элемент в конец текущей версии коллекции
     * @param e новый элемент
     * @return true, если элемент был успешно добавлен
     */
    boolean add(E e);

    /**
     * Добавляет новый элемент в конец указанной версии коллекции
     * @param e новый элемент
     * @param version версия коллекции
     * @return true, если элемент был успешно добавлен
     */
    boolean add(E e, int version);

    /**
     * Добавляет новый элемент по индексу в текущей версии коллекции
     * @param e новый элемент
     * @param index индекс элемента
     * @return true, если элемент был успешно добавлен
     */
    boolean addAtIndex(int index, E e);

    /**
     * Добавляет новый элемент по индексу в указанной версии коллекции
     * @param e новый элемент
     * @param index индекс элемента
     * @param version версия коллекции
     * @return true, если элемент был успешно добавлен
     */
    boolean addAtIndex(int index, E e, int version);

    /**
     * Удаляет элемент из текущей версии коллекции
     * @param e удаляемый элемент
     * @return true, если элемент был успешно удалён
     */
    boolean remove(E e);

    /**
     * Удаляет элемент из указанной версии коллекции
     * @param e удаляемый элемент
     * @param version версия коллекции
     * @return true, если элемент был успешно удалён
     */
    boolean remove(E e, int version);

    /**
     * Удаляет элемент по индексу из текущей версии коллекции
     * @param index индекс элемента
     * @return true, если элемент был успешно удалён
     */
    boolean removeAtIndex(int index);

    /**
     * Удаляет элемент по индексу из указанной версии коллекции
     * @param index индекс элемента
     * @param version версия коллекции
     * @return true, если элемент был успешно удалён
     */
    boolean removeAtIndex(int index, int version);

    /**
     * Возвращает элемент по индексу из текущей версии коллекции
     * @param index индекс элемента
     * @return элемент по индексу из текущей версии коллекции
     */
    Object get(int index);

    /**
     * Возвращает элемент по индексу из указанной версии коллекции
     * @param index индекс элемента
     * @param version версия коллекции
     * @return элемент по индексу из указанной версии коллекции
     */
    Object get(int index, int version);

    /**
     * Изменяет элемент по индексу в текущей версии коллекции
     * @param e новый элемент
     * @param index индекс элемента
     * @return true, если элемент был успешно изменён
     */
    boolean set(int index, E e);

    /**
     * Изменяет элемент по индексу в указанной версии коллекции
     * @param e новый элемент
     * @param index индекс элемента
     * @param version версия коллекции
     * @return true, если элемент был успешно изменён
     */
    boolean set(int index, E e, int version);

    /**
     * Проверяет, что текущая версия коллекции пуста
     * @return true, если текущая версия коллекции пуста
     */
    boolean isEmpty();

    /**
     * Проверяет, что указанная версия коллекции пуста
     * @param version версия коллекции
     * @return true, если указанная версия коллекции пуста
     */
    boolean isEmpty(int version);

    /**
     * Проверяет, что текущая версия коллекции содержит указанный элемент
     * @param o элемент
     * @return true, если текущая версия коллекции содержит указанный элемент
     */
    boolean contains(Object o);

    /**
     * Проверяет, что указанная версия коллекции содержит указанный элемент
     * @param o элемент
     * @param version версия коллекции
     * @return true, если указанная версия коллекции содержит указанный элемент
     */
    boolean contains(Object o, int version);

    /**
     * Проверяет, что указанный элемент равен текущему
     * @param o элемент
     * @return true, если указанный элемент равен текущему
     */
    boolean equals(Object o);

    /**
     * Возвращает строковое представление текущей версии коллекции
     * @return строковое представление текущей версии коллекции
     */
    String toString();

    /**
     * Возвращает строковое представление указанной версии коллекции
     * @param version версия коллекции
     * @return строковое представление указанной версии коллекции
     */
    String toString(int version);

}