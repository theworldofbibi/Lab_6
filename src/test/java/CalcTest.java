// Nome: Gabrielle Baptista da Silva Fonseca - TIA: 31745547 //
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    Calc calculo;

    public CalcTest() {

        calculo = new Calc();

    }

    @Test
    public void testSomar() {
        System.out.println("TestSomar");
        assertEquals(2.0, calculo.somar(1.0, 1.0));
        assertEquals(10.2, calculo.somar(5.1, 5.1));
        assertEquals(32.5, calculo.somar(16.2, 16.3));
        assertNotEquals(2.0, calculo.somar(1.0, 2.0));
    }

    @Test
    public void testSubtrair() {
        System.out.println("TestSubtrair");
        assertEquals(2.0, calculo.subtrair(3.0, 1.0));
        assertEquals(10.2, calculo.subtrair(15.4, 5.2));
        assertEquals(32.5, calculo.subtrair(58.9, 26.4));
        assertNotEquals(6.0, calculo.subtrair(9.0, 3.1));
    }

    @Test
    public void testMultiplicar() {
        System.out.println("TestMultiplicar");
        assertEquals(2.0, calculo.multiplicar(2.0, 1.0));
        assertEquals(10.2, calculo.multiplicar(2.0, 5.1));
        assertEquals(32.6, calculo.multiplicar(8.15, 4.0));
        assertNotEquals(6.0, calculo.multiplicar(3.0, 2.1));
    }

    @Test
    public void testDividir() {
        System.out.println("TestDividir");
        assertEquals(2.0, calculo.dividir(4.0, 2.0));
        assertEquals(9.78, calculo.dividir(48.9, 5.0));
        assertEquals(48.3, calculo.dividir(170.982, 3.54));
        assertNotEquals(6.1, calculo.dividir(12.0, 2.0));
    }

}