package observer_pattern.java

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

class PropertyChangeInJava {

    private class User : PropertyChangeListener {
        override fun propertyChange(evt: PropertyChangeEvent) {
            println(evt.oldValue)
            println(evt.newValue)
        }
    }

    private class Subject {
        val support: PropertyChangeSupport = PropertyChangeSupport(this)

        fun addObserver(observer: PropertyChangeListener?) {
            support.addPropertyChangeListener(observer)
        }

        fun removeObserver(observer: PropertyChangeListener?) {
            support.removePropertyChangeListener(observer)
        }

        fun add(message: String?) {
            support.firePropertyChange("eventName", null, message) // event publish
        }
    }

    fun main() {
        val subject = Subject()
        val observer = User()
        subject.addObserver(observer)
        subject.add("property change in java")
        subject.removeObserver(observer)
        subject.add("removed this message")
    }
}