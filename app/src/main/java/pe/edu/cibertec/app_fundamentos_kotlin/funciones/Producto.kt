package pe.edu.cibertec.app_fundamentos_kotlin.funciones
/*
@Getter
@Setter
public class Producto {
    private String codigo;
    private String nombre;

}
 */
data class Producto(val codigo: String, val nombre: String, val precio: Double)
