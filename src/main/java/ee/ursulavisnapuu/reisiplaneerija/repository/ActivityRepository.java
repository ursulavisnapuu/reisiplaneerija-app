package ee.ursulavisnapuu.reisiplaneerija.repository;

import ee.ursulavisnapuu.reisiplaneerija.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
