import org.example.Avion;
import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    private Avion avion;
    @BeforeEach
    public void Setup(){
        avion=new AvionComercial();
    }
    @Test
    public void VerificacionRetornoCorrecto(){
        int distancia=100;
        int RetornoCorrecto=distancia* avion.getConsumoCombustible();
        int RetornoReal=
                avion.volar(10);
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
    }
    @Test
    public void VerificarConsumoCombustible() {
        int RetornoCorrecto=avion.getConsumoCombustible();
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
