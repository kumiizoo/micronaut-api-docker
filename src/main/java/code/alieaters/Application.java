package code.alieaters;
import io.micronaut.function.aws.MicronautRequestHandler;

public class Application extends MicronautRequestHandler<Float, Integer> {
    @Override
    public Integer execute(Float input) {
        return null;
    }
}