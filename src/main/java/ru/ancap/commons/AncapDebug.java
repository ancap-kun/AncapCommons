package ru.ancap.commons;

/**
 * Deprecated, use {@link ru.ancap.commons.debug} <br>
 * Will be removed with the time of next breaking-change update of AncapFramework
 */
@Deprecated(forRemoval = true)
public class AncapDebug {

    // Класс для того, чтобы оставлять дебаг мессаджи через метод, входящий в него и потом через средства Intellij IDEA
    // удалять все использования этого класса после завершения дебага

    public static void debug(Object object) {
        System.out.println(object);
    }
    
    public static void debug(Object object, Object... objects) {
        StringBuilder debug = new StringBuilder(object.toString());
        for (Object obj : objects) {
            debug.append(" \"").append(obj).append("\"");
        }
        debug(debug.toString());
    }

    public static void permanentDebug(Object object) {
        System.out.println(object);
    }

}
