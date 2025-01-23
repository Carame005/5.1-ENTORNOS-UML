class Curso(
    val nombre: String,
    val codigo: String
) {
    private val estudiantes = mutableListOf<Estudiante>()

    fun agregarAlumno(estudiante: Estudiante) {
        estudiantes.add(estudiante)
        println("Estudiante ${estudiante.nombre} inscrito en el curso $nombre.")
    }

    fun mostrarEstudiantes() {
        println("Estudiantes inscritos en el curso $nombre:")
        estudiantes.forEach { println("- ${it.nombre} (${it.dni})") }
    }
}

class Estudiante(
    val nombre: String,
    val dni: String
) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }
}

fun main() {
    val curso = Curso("Programación en Kotlin", "KOT101")

    val estudiante1 = Estudiante("Carlos Pérez", "12345678A")
    val estudiante2 = Estudiante("Ana López", "87654321B")

    estudiante1.inscribirse(curso)
    estudiante2.inscribirse(curso)

    curso.mostrarEstudiantes()
}