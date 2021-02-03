package com.study.car.web.request.mapper

import com.study.car.domain.entity.CarModel
import com.study.car.web.request.RegisterCarRequest
import java.util.*

class RegisterCarRequestMapper {
    companion object{
        fun toCarModel(request: RegisterCarRequest): CarModel{
            return CarModel(0,
            request.brand,
            request.model,
            request.price,
            Date())
        }
    }
}