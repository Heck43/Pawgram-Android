package tw.nekomimi.nekogram.helpers;

import android.app.Application;
import org.telegram.ui.ActionBar.BaseFragment;
import java.util.HashMap;

/**
 * Analytics and crash tracking completely disabled for Pawgram (Zero-Telemetry).
 */
public class AnalyticsHelper {
    public static boolean sendBugReport = false;
    public static boolean analyticsDisabled = true;
    public static String userId = "";

    public static void start(Application application) {
        analyticsDisabled = true;
        sendBugReport = false;
    }

    public static void trackFragmentLifecycle(String lifecycle, BaseFragment fragment) {
        // No-op
    }

    public static void trackEvent(String event, HashMap<String, String> map) {
        // No-op
    }

    public static boolean isSettingsAvailable() {
        return false;
    }

    public static void setAnalyticsDisabled() {
        analyticsDisabled = true;
    }

    public static void toggleSendBugReport() {
        sendBugReport = false;
    }
}
