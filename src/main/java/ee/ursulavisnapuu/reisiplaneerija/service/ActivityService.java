package ee.ursulavisnapuu.reisiplaneerija.service;

import ee.ursulavisnapuu.reisiplaneerija.dto.ActivityResponse;
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

        public List<Activity> saveAllFromResponse(List<ActivityResponse> responses) {
        List<Activity> activities = responses.stream().map(response -> Activity.builder()
                .title(response.getTitle())
                .shortDescription(response.getShortDescription())
                .price(response.getPrice())
                .currency(response.getCurrency())
                .bookingLink(response.getBookingLink())
                .build()
        ).toList();

        return activityRepository.saveAll(activities);
    }
}
