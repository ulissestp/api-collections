package one.digitalinovation.collections

fun main() {
        val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
        val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
        val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

        val funcionarios = mutableListOf(joao, maria)
        funcionarios.forEach { println(it) }

        println("-------list--------")
        funcionarios.add(pedro)
        funcionarios.forEach { println(it) }

        println("---------------")
        funcionarios.remove(joao)
        funcionarios.forEach { println(it) }

        println("-------set---------")
        val funcionarioSet = mutableSetOf(joao)
        funcionarioSet.forEach { println(it) }

        println("-------------------")
        funcionarioSet.add(pedro)
        funcionarioSet.add(maria)
        funcionarioSet.forEach { println(it) }

        println("--------------")
        funcionarioSet.remove(maria)
        funcionarioSet.forEach { println(it) }
}