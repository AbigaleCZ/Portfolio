import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveTest2 {

    Move ember = new Move("Ember","Fire",40);
    @Test
    void getName() {
        assertEquals("Ember",ember.getName());
    }

    @Test
    void getType() {
        assertEquals("Fire",ember.getType());
    }
}