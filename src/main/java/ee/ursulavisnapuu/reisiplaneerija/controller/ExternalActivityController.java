package ee.ursulavisnapuu.reisiplaneerija.controller;

import ee.ursulavisnapuu.reisiplaneerija.dto.ActivityResponse;
import ee.ursulavisnapuu.reisiplaneerija.model.Activity;
import ee.ursulavisnapuu.reisiplaneerija.service.AmadeusService;
import ee.ursulavisnapuu.reisiplaneerija.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/external-activities")
public class ExternalActivityController {

    private final AmadeusService amadeusService;
    private final ActivityService activityService;

    public ExternalActivityController(AmadeusService amadeusService, ActivityService activityService) {
        this.amadeusService = amadeusService;
        this.activityService = activityService;
        System.out.println(">>> ExternalActivityController käivitati!");
    }

    @GetMapping
    public String getActivitiesByLocation(@RequestParam double lat, @RequestParam double lon) {
        return amadeusService.getActivitiesByGeo(lat, lon);
    }

    @GetMapping("/clean")
    public List<ActivityResponse> getCleanActivities(@RequestParam double lat, @RequestParam double lon) {
        return amadeusService.getParsedActivities(lat, lon);
    }

    @PostMapping("/save")
    public List<Activity> fetchAndSaveActivities(@RequestParam double lat, @RequestParam double lon) {
        List<ActivityResponse> externalActivities = amadeusService.getParsedActivities(lat, lon);
        return activityService.saveAllFromResponse(externalActivities);
    }
}
