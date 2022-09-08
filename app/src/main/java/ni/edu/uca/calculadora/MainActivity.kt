package ni.edu.uca.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ni.edu.uca.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciar()

    }

    private fun iniciar() {
        binding.btnSumar.setOnClickListener {
            val n1 = binding.etNum1.text.toString().toInt()
            val n2 = binding.etNum2.text.toString().toInt()
            val op = Operaciones(n1,n2)
            val suma = op.sumar()
            //frm.txt
            binding.tvResultado.text = suma.toString()
        }
    }
}