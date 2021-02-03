package com.study.car.domain.repository

import com.study.car.domain.entity.CarModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarRepository: JpaRepository<CarModel, Long>