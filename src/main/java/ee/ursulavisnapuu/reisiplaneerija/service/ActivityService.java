package ee.ursulavisnapuu.reisiplaneerija.service;

import ee.ursulavisnapuu.reisiplaneerija.model.Activity;
import ee.ursulavisnapuu.reisiplaneerija.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public Activity saveActivity(Activity activity) {
        return activityRepository.save(activity);
    }
}
