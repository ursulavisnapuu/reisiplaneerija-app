package ee.ursulavisnapuu.reisiplaneerija.repository;

import ee.ursulavisnapuu.reisiplaneerija.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long> {
}
