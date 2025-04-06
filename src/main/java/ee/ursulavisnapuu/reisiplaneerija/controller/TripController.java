package ee.ursulavisnapuu.reisiplaneerija.controller;

import ee.ursulavisnapuu.reisiplaneerija.model.Trip;
import ee.ursulavisnapuu.reisiplaneerija.service.TripService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trips")
public class TripController {

    private final TripService tripService;

    public TripController(TripService tripService) {
        this.tripService = tripService;
    }

    @GetMapping
    public List<Trip> getTrips() {
        return tripService.getAllTrips();
    }

    @PostMapping
    public Trip addTrip(@RequestBody Trip trip) {
        return tripService.saveTrip(trip);
    }
}
