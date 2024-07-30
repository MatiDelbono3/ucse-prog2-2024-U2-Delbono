PRUEBAS DE COBERTURA:
![image](https://github.com/MatiDelbono3/ucse-prog2-2024-U2-Delbono/assets/88385683/2c08ea0e-b2d9-43f1-b41e-226d1ae2407b)

# Correcciones - Estado: A CORREGIR

## Necesarias para aprobar:

- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- Ejercicio 3 y 4: Debe poder ejecutarse en el main. Actualmente están realizados como métodos aislados. Hacer las
  correcciones necesarias para que se puedan ejecutar ambos.
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Incluir qué Modo de Benchmark utilizaron, por qué lo eligieron, análizar qué representan los resultados, cómo influye
  la tasa de errores, etc.

## Adicionales:
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.
- Los tests siempre deberían de ir en el mismo package y tener la misma estructura de carpetas que en main, por lo tanto
  en vez de ir en test/java deberían de ir dentro de test/java/org/example
- Se podrían optimizar los imports y formatear el código.
- La estructura de las carpetas podría separarse entre cada ejercicio de una manera más granular. Pordían separar entre
  ClasesATestear, Ejercicio3, Ejercicio4, Ejercicio2/PruebaBenchmark y colocar cada archivo en cada package
  correspondiente.
- En ésta misma linea, si hacen el refactor sugerido en el punto anterior, los tests siempre deberían de ir en el mismo
  package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir
  dentro de test/java/org/example/TestClasesATestear

