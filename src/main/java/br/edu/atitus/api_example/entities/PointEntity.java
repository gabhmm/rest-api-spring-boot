package br.edu.atitus.api_example.entities;

import jakarta.persistence.*;

import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "tb_point")
public class PointEntity  {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @Column (length = 250,nullable = false)
    private String name;
    
    @Column(length = 250,nullable = false)
    private String description;

    @Column(columnDefinition = "decimal(17,14)",nullable = false)
    private double latitude;

    @Column(columnDefinition = "decimal(17,14)",nullable = false)
    private double longitude;
    
    @Column(nullable = true)
    private LocalTime openHour;
    
    @Column(nullable = true)
    private LocalTime closeHour;

    @JoinColumn(name = "iduser")
    @ManyToOne
    private UserEntity user;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public LocalTime getOpenHour() {
		return openHour;
	}

	public void setOpenHour(LocalTime openHour) {
		this.openHour = openHour;
	}

	public LocalTime getCloseHour() {
		return closeHour;
	}

	public void setCloseHour(LocalTime closeHour) {
		this.closeHour = closeHour;
	}

	public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
