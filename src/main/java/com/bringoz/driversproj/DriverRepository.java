package com.bringoz.driversproj;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface DriverRepository extends CrudRepository<Driver, Integer> {
    @Query( "select o from Driver o where status = 'ACTIVE'")
    ArrayList<Driver> getActiveDrivers();

    @Query( "select o from Driver o where :fromHour >= startWorkingHour and :toHour <= endWorkingHour")
    ArrayList<Driver> getDriversInTimeWindow(Integer fromHour, Integer toHour);
}
