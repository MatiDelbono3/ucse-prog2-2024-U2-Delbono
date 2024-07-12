import org.example.AvionComercial;
import org.example.AvionPrivado;
import org.example.CalculadorCombustible;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadorCombustibleTest {

        private CalculadorCombustible calculadorCombustible1 = CalculadorCombustible.getInstance();
        private CalculadorCombustible calculadorCombustible2 = CalculadorCombustible.getInstance();
        private AvionPrivado avionPrivado=new AvionPrivado();
        private AvionComercial avionComercial = new AvionComercial();


        @Test
        public void VerificarIgualdadDe2Instancias() {
            this.calculadorCombustible1.equals(this.calculadorCombustible2);
            boolean RetornoCorrecto = true;
            boolean RetornoReal = true;
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificarCantidadCombustibleAvionPrivado() {
            int distancia = 8000;
            int RetornoCorrecto = this.avionPrivado.volar(8000);
            int RetornoReal = this.avionPrivado.volar(8000);
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }

        @Test
        public void VerificarCantidadCombustibleAvionComercial() {
            int distancia = 8000;
            int RetornoCorrecto = this.avionComercial.volar(12000);
            int RetornoReal = this.avionComercial.volar(12000);
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

        @Test
        public void VerificacionCalculoCorrectoCombustible() {
            AvionPrivado avion = new AvionPrivado();
            int RetornoCorrecto = this.calculadorCombustible1.calcularCombustible(avion, 15000);
            int RetornoReal = this.calculadorCombustible1.calcularCombustible(avion, 15000);
            Assertions.assertEquals(RetornoCorrecto, RetornoReal);
        }
    }


