package jp.bunkaich.sukashimotion;

import org.junit.Test;
import static org.junit.Assert.*;

public final class DeviceModelsTest {
    @Test public void allowOnlyTheTwoExplicitCandidates() {
        assertTrue(DeviceModels.allowed("SM-F966Z"));
        assertTrue(DeviceModels.allowed("SM-F966Q"));
        for (String model : new String[]{null, "", "SM-F966", "SM-F966B", "SM-F966Q-extra", "SM-F956Q"}) {
            assertFalse(DeviceModels.allowed(model));
        }
    }
}
