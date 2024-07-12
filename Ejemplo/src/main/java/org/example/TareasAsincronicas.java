package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;


public class TareasAsincronicas {
    CompletableFuture<Integer>futuro1=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());
    CompletableFuture<Integer>futuro2=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());
    CompletableFuture<Integer>futuro3=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());
    CompletableFuture<Integer>futuro4=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());
    // Sumar el resultado de las tareas
    CompletableFuture<Void>SumaTareas=CompletableFuture.allOf(futuro1, futuro2, futuro3, futuro4);

    CompletableFuture<Void> sumFuturos=SumaTareas.thenRun(() ->{
                int Suma = futuro1.join() + futuro2.join() + futuro3.join() + futuro4.join();
                System.out.println("La Suma de los números generados es " + Suma);
         });




    //Generar los números y esperar
    private static int GenerarNumerosAleatoriosYEsperar()   {
            int NumeroAleatorio=ThreadLocalRandom.current().nextInt();
            try {
                TimeUnit.MILLISECONDS.sleep(NumeroAleatorio);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return NumeroAleatorio;
    }
    }






