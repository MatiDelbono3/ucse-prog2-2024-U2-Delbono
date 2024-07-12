import org.example.StreamBenchmark;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.stream.Collectors;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class StreamBenchmarkTest {
    List<Integer>Lista=new ArrayList<>();
    @Setup(Level.Trial)
    public void Setup(){
        Random random=new Random();
        int Capacidad=10000000;
        Lista=new ArrayList<>();
        for (int i=0; i <=Capacidad; i++){
            Lista.add(random.nextInt(1,50000));
        }

    }
    @Benchmark
    public void ResultadoStream(Blackhole bh) {
        for (int i=0; i<=Lista.size(); i++){
            List<Integer> resultSecuencial = Lista.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
            bh.consume(resultSecuencial);
        }
    }
        @Benchmark
        public void ResultadoParallelStream(Blackhole bh)  {
        List<Integer>resultParalelo=Lista.parallelStream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        bh.consume(resultParalelo);
    }
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(StreamBenchmarkTest.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(1)
                .build();

        new Runner(opt).run();
    }


}




