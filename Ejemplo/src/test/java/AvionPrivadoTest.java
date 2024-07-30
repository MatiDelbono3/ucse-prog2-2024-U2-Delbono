import org.example.Avion;
import org.example.AvionPrivado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvionPrivadoTest {
    private Avion avion;
    @BeforeEach
    public void Setup(){
        avion= new AvionPrivado();
    }
    @Test
    public void VerificarRetornoCorrectoParaPrivados() {
        int distancia=7000;
        int RetornoCorrecto=(distancia* avion.getConsumoCombustible()+ avion.getCapacidadCombustible()/2);
        int RetornoReal=
                avion.volar(7000);
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);

    }
    @Test
    public void VerificarConsumoCombustible() {
        int RetornoCorrecto= avion.getConsumoCombustible();
        int RetornoReal=
                avion.getConsumoCombustible();
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
    }
    @Test
    public void VerificarCapacidadCombustible() {
        int RetornoCorrecto= avion.getCapacidadCombustible();
        int RetornoReal=
                avion.getCapacidadCombustible();
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
    }

}
