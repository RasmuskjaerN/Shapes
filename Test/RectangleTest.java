import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    //create a test object
    Rectangle rect = new Rectangle(4.0, 6.0, 2, 3);

    @org.junit.jupiter.api.Test
    void circumfernce() {
        assertEquals(rect.circumference(), 20);
    }
}
