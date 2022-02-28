package com.bringoz.driversproj;

import javax.persistence.*;

enum Status {
	PENDING,
	ACTIVE,
	INACTIVE;
}

@Entity // This tells Hibernate to make a table out of this class
public class Driver {
	//A driver model should store the following data: personal information (such as name, age,
	//address), driver status, working hours and current location.
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private Integer age;

	private String address;

	@Column(columnDefinition = "ENUM('ACTIVE', 'INACTIVE')")
	@Enumerated(EnumType.STRING)
	private Status status;

	private Integer startWorkingHour;

	private Integer endWorkingHour;

	private Float latitude;

	private Float longitude;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getStartWorkingHour() {
		return startWorkingHour;
	}

	public void setStartWorkingHour(Integer startWorkingHour) {
		this.startWorkingHour = startWorkingHour;
	}

	public Integer getEndWorkingHour() {
		return endWorkingHour;
	}

	public void setEndWorkingHour(Integer endWorkingHour) {
		this.endWorkingHour = endWorkingHour;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
}
