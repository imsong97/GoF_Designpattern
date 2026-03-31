package observer_pattern.java

import java.util.Observable
import java.util.Observer

/**
 * Java 9 이후에는 java.util.concurrent.Flow, PropertyChangeListener API 사용 권장
 * */
class ObservableInJava {

    private class User : Observer {
        override fun update(o: Observable, arg: Any) {
            println(arg)
        }
    }

    private class Subject : Observable() {
        fun add(message: String?) {
            setChanged() // 미호출 시 notifyObservers() 호출해도 Observer에게 알림이 가지 않음, 상태가 바뀔 때 마다 호출
            notifyObservers(message)
        }
    }

    fun main() {
        val subject = Subject()
        val user = User()

        subject.addObserver(user)
        subject.add("Observable in java")
    }
}