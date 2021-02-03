package com.study.car.domain.entity

import org.springframework.data.annotation.CreatedDate
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "Car")
data class CarModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,

    var brand: String,

    var model: String,

    var price: Double,

    @CreatedDate
    var registerDate: Date

) {
    constructor() : this(0, "", "", 0.0, Date())
}
