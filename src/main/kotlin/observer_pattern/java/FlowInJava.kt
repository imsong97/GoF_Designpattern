package observer_pattern.java

import java.util.concurrent.Flow
import java.util.concurrent.Flow.Publisher
import java.util.concurrent.Flow.Subscriber
import java.util.concurrent.SubmissionPublisher

class FlowInJava {

    private val publisher: Publisher<String> = SubmissionPublisher() // SubmissionPublisher - 비동기
//        private val publisher: Publisher<String> = Flow.Publisher { subscriber: Subscriber<in String> ->
//            subscriber.onSubscribe(object : Flow.Subscription {
//                override fun request(n: Long) {
//                    subscriber.onNext("Flow in Java")
//                    subscriber.onComplete()
//                }
//
//                override fun cancel() {
//
//                }
//            })
//        }

    private val subscriber: Subscriber<String?> = object : Subscriber<String?> {
        private var subscription: Flow.Subscription? = null

        override fun onSubscribe(subscription: Flow.Subscription) {
            println("onSubscribe()")
            // for SubmissionPublisher
            this.subscription = subscription
            this.subscription?.request(1)
        }

        override fun onNext(item: String?) {
            println("onNext()")
            println(item)
        }

        override fun onError(throwable: Throwable) {
            println("onError() : ${throwable.message}")
        }

        override fun onComplete() {
            println("onComplete()")
        }
    }

    fun main() {
        publisher.subscribe(subscriber)
        (publisher as SubmissionPublisher).submit("Flow in Java")

        println("main method")
    }
}