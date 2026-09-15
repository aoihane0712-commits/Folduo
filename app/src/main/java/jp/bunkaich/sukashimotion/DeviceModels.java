package jp.bunkaich.sukashimotion;

/** Explicit candidates only; DualDisplayControl still validates advertised states. */
public final class DeviceModels {
    private DeviceModels() {}
    public static boolean allowed(String model) {
        return "SM-F966Z".equals(model) || "SM-F966Q".equals(model);
    }
}
