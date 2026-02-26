package singleton

class Setting private constructor(name: String) {
    /**
     * easy singleton in Kotlin with none class parameter
     * by lazy -> default Synchronized
     */
//    companion object {
//        val instance: Setting by lazy { Setting() }
//    }

    /**
     * singleton with class parameter
     * Double-Checked Locking
     */
    companion object {
        @Volatile
        private var instance: Setting? = null

        fun getInstance(name: String): Setting  = instance ?: synchronized(this) {
            instance ?: Setting(name).also { instance = it }
        }
    }
}