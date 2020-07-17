package reproducer.grpc

import io.micronaut.runtime.Micronaut.*

fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("reproducer.grpc")
		.start()
}

