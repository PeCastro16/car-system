package com.study.car.web.controller

import com.study.car.domain.entity.CarModel
import com.study.car.service.CarService
import com.study.car.web.request.RegisterCarRequest
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/car")
class CarController(private val carService: CarService){

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun registerCar(@RequestBody registerCarRequest: RegisterCarRequest) =
        carService.registerCar(registerCarRequest)

    @GetMapping
    fun getCars(): MutableList<CarModel> = carService.getCars()

}