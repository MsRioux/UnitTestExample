import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestExampleTest
{

    @Test
    void testToString1()
    {
        UnitTestExample first = new UnitTestExample("Hello World", 4, 1000);
        assertEquals("Hello World 4 1000", first.toString());
    }

    @Test
    void testToString2()
    {
        UnitTestExample second = new UnitTestExample("11ll11", -2, 0);
        assertEquals("11ll11 -2 0", second.toString());
    }


    @Test
    void getSomeNum()
    {
        UnitTestExample third = new UnitTestExample("11ll11", -2, 0);
        assertEquals(-2, third.getSomeNum());
    }

    @Test
    void simpleIfNumsEqual1()
    {
        UnitTestExample fourth = new UnitTestExample("11ll11", -2, 0);
        assertEquals(false, fourth.simpleIfNumsEqual());
    }

    @Test
    void simpleIfNumsEqual2()
    {
        UnitTestExample fifth = new UnitTestExample(56, 56);
        assertEquals(true, fifth.simpleIfNumsEqual());
    }
}