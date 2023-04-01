package test;

import gb.list.gbArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class gbArrayListTest {
    @Test
    void getTest() {
        gbArrayList<String> strings = new gbArrayList<>();
        strings.add("1");
        assertEquals("1", strings.get(0));
    }

    @Test
    void getNegativeTest() {
        gbArrayList<String> strings = new gbArrayList<>();
        strings.add("1");
        Assertions.assertNotEquals("2", strings.get(0));
    }

    @Test
    void addTest(){
        gbArrayList<Integer> integers = new gbArrayList<>();
        integers.add(2);
        Assertions.assertEquals(2, integers.get(0));
    }

    @Test
    void removeTest() {
        gbArrayList<Integer> integers = new gbArrayList<>();
        integers.add(11);
        integers.add(12);
        integers.add(13);
        integers.remove(1);
        Assertions.assertEquals(2, (integers.size()));
    }
    @Test
    void removeNegativeTest() {
        gbArrayList<Integer> integers = new gbArrayList<>();
        integers.add(11);
        integers.add(12);
        integers.add(13);
        integers.remove(1);
        Assertions.assertNotEquals(3, (integers.size()));
    }
    @Test
    void sizeTest() {
        gbArrayList<Integer> integers = new gbArrayList<>();
        integers.add(11);
        integers.add(21);
        integers.add(13);
        Assertions.assertEquals(3, integers.size());
    }
    @Test
    void sizeNegativeTest() {
        gbArrayList<Integer> integers = new gbArrayList<>();
        integers.add(11);
        integers.add(21);
        integers.add(13);
        Assertions.assertNotEquals(4, integers.size());
    }
}
