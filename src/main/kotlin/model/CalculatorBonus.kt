package model

class CalculatorBonus {

    var total: Double = 0.0
        private set

    fun register(employer: Employer){
        this.total += employer.getBonus
    }

}