import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTest {

    Move tackle = new Move("Tackle","Normal",40);
    @Test
    void getName() {
        assertEquals("Takle", tackle.getName());
    }
    @Test
    void getType() {
        assertEquals("Nomal", tackle.getType());
    }
}