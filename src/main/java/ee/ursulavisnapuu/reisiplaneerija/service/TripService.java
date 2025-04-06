package ee.ursulavisnapuu.reisiplaneerija.service;

import ee.ursulavisnapuu.reisiplaneerija.model.Trip;
import ee.ursulavisnapuu.reisiplaneerija.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    private final TripRepository tripRepository;

    public TripService(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    public Trip saveTrip(Trip trip) {
        return tripRepository.save(trip);
    }
}
