package pe.edu.cibertec.app_fundamentos_kotlin.funciones

class Alumno : Persona() {

    override fun registrarAsistencia(codigo: String, horaEntrada: String): String {
        return "Marcando asistencia como Alumno"
    }
}