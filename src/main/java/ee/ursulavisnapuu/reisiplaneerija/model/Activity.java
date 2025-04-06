package ee.ursulavisnapuu.reisiplaneerija.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private LocalDateTime time;

    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    // Getterid ja setterid

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public LocalDateTime getTime() { return time; }
    public void setTime(LocalDateTime time) { this.time = time; }

    public Trip getTrip() { return trip; }
    public void setTrip(Trip trip) { this.trip = trip; }
}
