import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void newRectangleSideTest(){
        Rectangle TestRectangle=new Rectangle(1,1,3,3);
        assertEquals(2,TestRectangle.side1());
    }


}