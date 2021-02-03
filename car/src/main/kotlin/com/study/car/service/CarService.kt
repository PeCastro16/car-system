package com.study.car.service

import com.study.car.domain.entity.CarModel
import com.study.car.domain.repository.CarRepository
import com.study.car.web.request.RegisterCarRequest
import com.study.car.web.request.mapper.RegisterCarRequestMapper.Companion.toCarModel
import org.springframework.stereotype.Service

@Service
class CarService(private val carRepository: CarRepository) {

    fun registerCar(registerCarRequest: RegisterCarRequest) = carRepository.save(toCarModel(registerCarRequest))

    fun getCars(): MutableList<CarModel> = carRepository.findAll()
}