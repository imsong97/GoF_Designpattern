package singleton;

public class SettingObjJava {

    /**
     * when kotlin object class compile java, operate like this
     * SettingObj.kt
     */

    private SettingObjJava() { }

    private static class SettingObjProvider {
        private static final SettingObjJava INSTANCE = new SettingObjJava();
    }

    public static SettingObjJava getInstance() {
        return SettingObjProvider.INSTANCE;
    }
}
