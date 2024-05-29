import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLikedListTest {

    @Test
    void add() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");

        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals("Jack", list.get(0));
        Assertions.assertEquals("John", list.get(1));
        Assertions.assertEquals("Nick", list.get(2));
    }

    @Test
    @DisplayName("add after removing")
    void add1() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.remove(2);
        list.add("Ann");

        Assertions.assertEquals(3, list.size());
        Assertions.assertEquals("Jack", list.get(0));
        Assertions.assertEquals("John", list.get(1));
        Assertions.assertEquals("Ann", list.get(2));
    }

    @Test
    void get() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");

        Assertions.assertEquals("John", list.get(1));
    }

    @Test
    void size() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        Assertions.assertEquals(3, list.size());
    }

    @Test
    @DisplayName("size should be 0 if list is empty")
    void size1() {
        MyList list = new MyLikedList();
        Assertions.assertEquals(0, list.size());
    }

    @Test
    @DisplayName("regular remove")
    void remove() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.remove(1);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals("Jack", list.get(0));
        Assertions.assertEquals("Nick", list.get(1));
    }

    @Test
    @DisplayName("regular tail remove")
    void remove1() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.remove(2);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals("Jack", list.get(0));
        Assertions.assertEquals("John", list.get(1));
    }

    @Test
    @DisplayName("remove head remove")
    void remove2() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.remove(0);

        Assertions.assertEquals(2, list.size());
        Assertions.assertEquals("John", list.get(0));
        Assertions.assertEquals("Nick", list.get(1));
    }

    @Test
    @DisplayName("remove last remove")
    void remove3() {
        MyList list = new MyLikedList();
        list.add("Jack");
        list.add("John");
        list.add("Nick");
        list.remove(0);
        list.remove(0);
        list.remove(0);

        Assertions.assertEquals(0, list.size());
        Assertions.assertNull(list.get(0));
    }

    @Test
    void set() {
    }
}