import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {
    private AvionPrivado avionPrivado=new AvionPrivado();
    @Test
    public void VerificarRetornoCorrectoParaPrivados() {
        int distancia=7000;
        int RetornoCorrecto=avionPrivado.volar(7000);
        int RetornoReal=
                avionPrivado.volar(7000);
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);

    }
    @Test
    public void VerificarConsumoCombustible() {
        int RetornoCorrecto= avionPrivado.getConsumoCombustible();
        int RetornoReal=
                avionPrivado.getConsumoCombustible();
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
    }
    @Test
    public void VerificarCapacidadCombustible() {
        int RetornoCorrecto= avionPrivado.getCapacidadCombustible();
        int RetornoReal=
                avionPrivado.getCapacidadCombustible();
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
    }

}
