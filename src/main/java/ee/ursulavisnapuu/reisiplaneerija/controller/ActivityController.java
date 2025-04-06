package ee.ursulavisnapuu.reisiplaneerija.controller;

import ee.ursulavisnapuu.reisiplaneerija.model.Activity;
import ee.ursulavisnapuu.reisiplaneerija.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping
    public List<Activity> getActivities() {
        return activityService.getAllActivities();
    }

    @PostMapping
    public Activity addActivity(@RequestBody Activity activity) {
        return activityService.saveActivity(activity);
    }
}
