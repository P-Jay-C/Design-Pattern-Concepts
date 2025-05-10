package day15.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        OldAnalytics oldAnalytics = new OldAnalytics();
        AnalyticsService analyticsService = new AnalyticsAdapter(oldAnalytics);

        analyticsService.trackEvent("Login", "user123");
        analyticsService.trackEvent("Purchase", "user456");
    }
}
