package pe.edu.cibertec.app_fundamentos_kotlin.funciones

class Fundamentos {

    /*
    public void mensaje(){
        String nombreCurso;
    }
     */
    fun mensaje(){
        var nombreCurso: String
        var credito: Int
        var precio: Double
        var estado: Boolean
        // Operadores matemáticos
        credito = 1 + 5 // - * / %
        //Operadores de comparación
        // < > == <> !=
        if(credito > 3){

        }else if(credito == 5){

        }else {

        }
        var dia  = 3
        //final String nombre = "Luis"
        val nombreAlumno = "Julio Iglesias"
        var nombreDia : String
        nombreDia = when(dia){
            1 -> "Lunes"
            2 -> "Martes"
            3 -> "Miercoles"
            else -> "No existe"
        }

    }

    fun registroNotas(codigoAlumno: String, nota: Int) : Boolean {

        /*
        for(int i =0; i < 10; i++){
        }
        for(Producto producto : listProducto){
        }
         */
        for(i in 1..10){

        }
        /*
        for(producto in listProductos){

        }
        while (true){

        }
        do {

        }while (true)*/
        return true
    }

}