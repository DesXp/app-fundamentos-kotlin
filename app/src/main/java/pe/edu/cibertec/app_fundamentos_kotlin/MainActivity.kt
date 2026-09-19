package pe.edu.cibertec.app_fundamentos_kotlin

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.edu.cibertec.app_fundamentos_kotlin.databinding.ActivityMainBinding
import pe.edu.cibertec.app_fundamentos_kotlin.funciones.HistoriaClinicaActivity
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding // agregado en clase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // agregado en clase
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Hasta aquí

        // SE ELIMINA ESTA PARTE setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btncalcular.setOnClickListener(this)
        // binding.btnCancelar.setOnClickListener(this)
        binding.btnirhistoria.setOnClickListener(this)



    }

    // agregado en clase
    fun calcularValorImc():Double {
        val peso = binding.etpeso.text.toString().toDouble()
        val talla = binding.ettalla.text.toString().toDouble()
        val tallaMetros = talla / 100
        return peso / (tallaMetros * tallaMetros)
    }

    fun calcularDiagnosticoImc(valorImc : Double) : String{
        return when {
            valorImc < 18.5 -> "Bajo de peso (necesitas alimentarte mejor)"
            valorImc < 25.5 -> "Peso normal (Sigue así)"
            valorImc < 30.0 -> "Sobrepeso (Cuida tu dieta)"
            valorImc < 35.0 -> "Obesidad Grado I"
            valorImc < 40.0 -> "Obesidad Grado II"
            else -> "Obesidad mórbida"
        }
    }

    override fun onClick(p0: View) {

        // Si tuvieramos más de un botón
        when(p0.id){
            R.id.btncalcular -> calcularIMC()
            R.id.btnirhistoria -> irVerHistoria()
            //R.id.btncancelar -> cancelarOperacion()
        }
    }

    fun calcularIMC(){
        val valorImc = calcularValorImc()
        val diagnostico = calcularDiagnosticoImc(valorImc)
        val valorImcFormateado = String.format("%.2f", valorImc)
        binding.tvresultado.text = "Su valor IMC es $valorImcFormateado, ud. se encuentra $diagnostico"
    }

    fun irVerHistoria() {

        startActivity(Intent(this, HistoriaClinicaActivity::class.java))
    } // Instancia de la actividad hacia donde vamos a ir
}