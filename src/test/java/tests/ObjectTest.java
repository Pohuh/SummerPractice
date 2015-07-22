package tests;

import model.Table;
import model.dao.impl.TableDaoImpl;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Pohuh on 21.07.2015.
 */
public class ObjectTest {
    @Test
    public void testObj() {
        assertNotNull("Такой записи не существует", new Table("Test", "USD")); // Если null - тест завален
        assertNotNull("Записи не существует", new Table(900,900,"lol")); // Если null - тест завален
    }

}
