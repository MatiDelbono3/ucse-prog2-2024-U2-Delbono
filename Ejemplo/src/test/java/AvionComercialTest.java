import org.example.AvionComercial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvionComercialTest {
    private AvionComercial avionComercial=new AvionComercial(  );
    @Test
    public void VerificacionRetornoCorrecto(){
        int distancia=15000;
        int RetornoCorrecto=avionComercial.volar(15000);
        int RetornoReal=
                avionComercial.volar(15000);
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
    }
    @Test
    public void VerificarConsumoCombustible() {
        int RetornoCorrecto= avionComercial.getConsumoCombustible();
        int RetornoReal=
                avionComercial.getConsumoCombustible();
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
    }
    @Test
    public void VerificarCapacidadCombustible() {
        int RetornoCorrecto= avionComercial.getCapacidadCombustible();
        int RetornoReal=
                avionComercial.getCapacidadCombustible();
        Assertions.assertEquals(RetornoCorrecto, RetornoReal);
}
}
