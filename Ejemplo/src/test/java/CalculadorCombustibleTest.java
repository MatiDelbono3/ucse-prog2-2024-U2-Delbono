import org.example.AvionComercial;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadorCombustibleTest {

        private CalculadorCombustible instanciaCalculador;
        private AvionPrivado avionPrivado=new AvionPrivado();
        private AvionComercial avionComercial = new AvionComercial();
        @BeforeEach
        public void Setup(){
             instanciaCalculador=CalculadorCombustible.getInstance();
        }

        @Test
        public void VerificarIgualdadDe2Instancias() {
            CalculadorCombustible segundaInstancia=CalculadorCombustible.getInstance();
            Assertions.assertEquals(instanciaCalculador, segundaInstancia);
        }

        @Test
        public void VerificarCantidadCombustibleAvionPrivado() {
            int distancia = 8000;
            int RetornoCorrecto = instanciaCalculador.calcularCombustible(avionPrivado, distancia);
            int RetornoReal = this.avionPrivado.volar(8000);
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificarCantidadCombustibleAvionComercial() {
            int distancia = 8000;
            int RetornoCorrecto = instanciaCalculador.calcularCombustible(avionPrivado, distancia);
            int RetornoReal = this.avionComercial.volar(distancia);
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificarCapacidadCombustibleAvionPrivado() {
            int RetornoCorrecto = this.avionPrivado.getConsumoCombustible();
            int RetornoReal = this.avionPrivado.getCapacidadCombustible();
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificarCapacidadCombustibleAvionComercial() {
            int RetornoCorrecto = this.avionComercial.getCapacidadCombustible();
            int RetornoReal = this.avionComercial.getCapacidadCombustible();
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificarConsumoCombustibleAvionComercial() {
            int RetornoCorrecto = this.avionComercial.getConsumoCombustible();
            int RetornoReal = this.avionComercial.getConsumoCombustible();
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificarConsumoCombustibleAvionPrivado() {
            int RetornoCorrecto = this.avionPrivado.getConsumoCombustible();
            int RetornoReal = this.avionPrivado.getConsumoCombustible();
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificacionRetornoInstancia() {
            CalculadorCombustible RetornoCorrecto = CalculadorCombustible.getInstance();
            CalculadorCombustible RetornoReal = CalculadorCombustible.getInstance();
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

}


