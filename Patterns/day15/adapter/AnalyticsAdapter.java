package day15.adapter;

public class AnalyticsAdapter implements AnalyticsService {
    private OldAnalytics oldAnalytics;

    public AnalyticsAdapter(OldAnalytics oldAnalytics) {
        this.oldAnalytics = oldAnalytics;
    }

    @Override
    public void trackEvent(String eventName, String userId) {
        oldAnalytics.logUserAction(eventName, userId);
    }
}
