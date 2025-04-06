package ee.ursulavisnapuu.reisiplaneerija.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;

    private boolean archived = false;

    // Getterid ja setterid (võid kasutada ka Lombokit)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public boolean isArchived() { return archived; }
    public void setArchived(boolean archived) { this.archived = archived; }
}
