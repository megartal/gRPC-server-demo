package au.com.brolly.grpcserverdemo;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrpcServerDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(GrpcServerDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Server server = ServerBuilder.forPort(8070)
                .addService(new UserServiceImpl())
                .build();

        server.start();
        server.awaitTermination();
    }
}
