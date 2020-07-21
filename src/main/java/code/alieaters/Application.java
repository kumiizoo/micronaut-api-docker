package code.alieaters;
import com.aliyun.fc.runtime.Context;
import com.aliyun.fc.runtime.StreamRequestHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import io.micronaut.runtime.Micronaut;

public class Application implements StreamRequestHandler {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }

    @Override
    public void handleRequest(
            InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        outputStream.write(new String("hello world").getBytes());
    }
}
