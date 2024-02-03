/*
Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório aprenda-kotlin-com-exemplos. Nesse contexto, iremos abstrair o seguinte domínio de aplicação:

A DIO possui Formacoes incríveis que têm como objetivo oferecer um conjunto de ConteudosEducacionais voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. Formacoes possuem algumas características importantes, como nome, nivel e seus respectivos conteudosEducacionais. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de matricular um ou mais Alunos.
*/


// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome.")
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val formacaoKotlin = Formacao("Formação Desenvolvedor Kotlin", Nivel.INTERMEDIARIO, ListOf(
        ConteudoEducacional("Princípios e Fundamentos da linguagem Kotlin")
        ConteudoEducacional("POO em Kotlin")
    ))

    val formacaoJava = Formacao("Formação Desenvolvedor Java", Nivel.AVANCADO, ListOf(
        ConteudoEducacional("Princípios e Fundamentos da linguagem Java")
        ConteudoEducacional("POO em Java")
    ))

    val aluno1 = Usuario("Ana", "ana@email.com", LocalDate.of(1992, 7, 3))
    val aluno2 = Usuario("Carlos", "carlos@email.com", LocalDate.of(1988, 12, 8))
    val aluno3 = Usuario("Sérgio", "sergio@email.com", LocalDate.of(1985, 2, 12))

    formacaoKotlin.matricular(aluno1)
    formacaoJava.matricular(aluno2)
    formacaoJava.matricular(aluno3)
}
