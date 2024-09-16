data class Jogo(
    val titulo: String,
    val capa: String
) {
    var descricao = ""
    override fun toString(): String {
        return "Meu Jogo:" +
                " \nTitulo: $titulo," +
                " \nCapa: $capa," +
                " \nDescricao: $descricao\n"
    }


}