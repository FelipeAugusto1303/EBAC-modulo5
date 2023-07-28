package com.example.modulo5exercicio

class Veiculo {
    private var velocity: Long = 0
    private var acceleration: Long = 10
    var model: String = ""

    fun speedUp(): Unit {
        this.velocity += this.acceleration
    }

    fun speedDown(): Unit {
        if(this.velocity > 0){
           this.velocity -= this.acceleration
        }
        else{
            println("O carro está parado")
        }
    }

    fun getVelocity(): Long{
        return this.velocity
    }

    fun getModel(): Unit{
        println(this.model)
    }

}

fun main() {
    var fusca = Veiculo()
    fusca.model = "Fusca"
    fusca.getModel()

    println(fusca.getVelocity())
    fusca.speedUp()
    println(fusca.getVelocity())
    fusca.speedUp()
    println(fusca.getVelocity())
    fusca.speedUp()
    println(fusca.getVelocity())
    fusca.speedUp()
    println(fusca.getVelocity())
    fusca.speedDown()
    println(fusca.getVelocity())
    fusca.speedDown()
    println(fusca.getVelocity())
    fusca.speedDown()
    println(fusca.getVelocity())
    fusca.speedDown()
    println(fusca.getVelocity())
    fusca.speedDown()
    println(fusca.getVelocity())

}