package au.com.brolly.grpcserverdemo;

import io.grpc.stub.StreamObserver;

public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase{

    @Override
    public void createUser(UserDetail request, StreamObserver<user> responseObserver) {
        System.out.println(request);
        user response = user.newBuilder().setName(request.getName()).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
