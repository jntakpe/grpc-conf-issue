package reproducer.grpc

import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import javax.inject.Singleton

@Factory
class GrpcConfig {
    @Singleton
    fun userStub(@GrpcChannel("foo") channel: ManagedChannel): ExecutorServiceGrpc.ExecutorServiceBlockingStub {
        return ExecutorServiceGrpc.newBlockingStub(channel)
    }
}
