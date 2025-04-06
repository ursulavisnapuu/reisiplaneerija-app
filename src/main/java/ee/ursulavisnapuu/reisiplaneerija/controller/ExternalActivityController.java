package ee.ursulavisnapuu.reisiplaneerija.controller;

import ee.ursulavisnapuu.reisiplaneerija.service.AmadeusService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/external-activities")
public class ExternalActivityController {

    private final AmadeusService amadeusService;

    public ExternalActivityController(AmadeusService amadeusService) {
        this.amadeusService = amadeusService;
        System.out.println(">>> ExternalActivityController käivitati!");
    }

    @GetMapping
    public String getActivitiesByLocation(
            @RequestParam double lat,
            @RequestParam double lon
    ) {
        return amadeusService.getActivitiesByGeo(lat, lon);
    }
}
