import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameListTest {
    @Test
    void should_return_all_names() {
        List<String> allNames = new NameList().allNames();

        assertEquals(2, allNames.size());
        assertEquals("Yan Yu", allNames.get(0));
        assertEquals("Wang Xiaofeng", allNames.get(1));
    }
}
