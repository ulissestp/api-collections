package one.digitalinovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 1000.0)
    val pedro = Funcionario(nome = "Pedro", salario = 2000.0)
    val maria = Funcionario(nome = "Maria", salario = 4000.0)

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {println(it)  }
    println("--- Procura nome Maria ----")
    println(funcionarios.find { it.nome in "Maria" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario      
        """.trimIndent()

    }