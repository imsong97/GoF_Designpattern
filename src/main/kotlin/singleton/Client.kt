package singleton

import java.lang.reflect.Constructor

fun main() {
    val a = Setting.getInstance("")

    val b_1 = SettingObj
    val b_2 = SettingObjJava.getInstance()
}

/**
 * way to break singleton instance
 * */
fun breakSingleton() {
    // reflection
    val a = Setting.getInstance("")
    val constructor: Constructor<Setting> = Setting::class.java.getDeclaredConstructor().apply {
        this.isAccessible = true
    }
    val b = constructor.newInstance() // different a and b

}