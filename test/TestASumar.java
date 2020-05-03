import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	@Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado );
    }
	
	@Test
    public void testCifraNegativa() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("-5");
        assertEquals("",resultado );
    }
	
	@Test
    public void testMayor9() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("1234");
        assertEquals("1+2+3+4 = 10", resultado );
    }


}
