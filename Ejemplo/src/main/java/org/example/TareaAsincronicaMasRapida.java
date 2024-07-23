package org.example;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class TareaAsincronicaMasRapida {
    CompletableFuture<Integer>futuro1=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());
    CompletableFuture<Integer>futuro2=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());
    CompletableFuture<Integer>futuro3=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());
    CompletableFuture<Integer>futuro4=CompletableFuture.supplyAsync(() -> GenerarNumerosAleatoriosYEsperar());

    //Generar los números y esperar
    private static int GenerarNumerosAleatoriosYEsperar()   {
        int NumeroAleatorio= ThreadLocalRandom.current().nextInt();
        try {
            TimeUnit.MILLISECONDS.sleep(NumeroAleatorio);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return NumeroAleatorio;
    }
    // MOSTRAR LA TAREA QUE TERMINA MAS RAPIDO
    CompletableFuture<Object> TareaMasRapida=CompletableFuture.anyOf(futuro1, futuro2, futuro3, futuro4);
    CompletableFuture<Void>MostrarTareaMasRapida=TareaMasRapida.thenRun(()->{
        try {
            System.out.println("La Tarea que termina más rápido es " +TareaMasRapida.get());
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }

    });
}

