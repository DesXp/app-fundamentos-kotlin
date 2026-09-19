package pe.edu.cibertec.app_fundamentos_kotlin.funciones

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import pe.edu.cibertec.app_fundamentos_kotlin.MainActivity
import pe.edu.cibertec.app_fundamentos_kotlin.R
import pe.edu.cibertec.app_fundamentos_kotlin.databinding.ActivityHistoriaClinicaBinding
import pe.edu.cibertec.app_fundamentos_kotlin.databinding.ActivityMainBinding



class HistoriaClinicaActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityHistoriaClinicaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // setContentView(R.layout.activity_historia_clinica)

        binding = ActivityHistoriaClinicaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnIraCalculadora.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.btnIraCalculadora -> irVerCalculadora()

        }
    }
    fun irVerCalculadora() {

        startActivity(Intent(this, MainActivity::class.java))
    }
}