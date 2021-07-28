package one.digitalinovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria)

    funcionarios.forEach {println(it)  }
    println("--- Procura nome Maria ----")
    println(funcionarios.find { it.nome in "Maria" })

    println("----Ordernar por salário------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("----agrupar por tipo de contratacao------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario      
        """.trimIndent()

    }