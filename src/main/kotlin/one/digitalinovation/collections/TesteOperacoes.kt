package one.digitalinovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios) {
        println(salario)
    }

    println("----------------------")

    println("media salario: ${salarios.average()}")
    println("maior salario: ${salarios.maxOrNull()}")
    println("menor salario: ${salarios.minOrNull()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("-----Salários menor que 2500-------")
    salariosMaiorQue2500.forEach { println(it) }

    println("-----Salários no range-------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("-----Salário igual a 2250 e 500-------------")
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })
    println("-----------------------------------")
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}