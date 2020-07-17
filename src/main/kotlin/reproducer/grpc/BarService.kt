package reproducer.grpc

import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@Singleton
class BarService(private val fooStub: ExecutorServiceGrpc.ExecutorServiceBlockingStub): ExecutorServiceGrpc.ExecutorServiceImplBase() {

    override fun send(request: ExecutorRequest, responseObserver: StreamObserver<ExecutorReply>) {
        fooStub.toString()
        responseObserver.onCompleted()
    }
}
