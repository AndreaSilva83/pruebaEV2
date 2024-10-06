package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appdeencuestarpida.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialización de widgets
        val buttonEnviar: Button = findViewById(R.id.buttonEnviar)

        buttonEnviar.setOnClickListener {
            val sentimientos = getSentimientos()
            val control = getControl()
            val estres = getEstres()
            val insomnio = getInsomnio()
            val apoyoSocial = getApoyoSocial()
            val soledad = getSoledad()
            val ayudaProfesional = getAyudaProfesional()
            val comodidad = getComodidad()
            val estrategias = getEstrategias()

            // Crear el resumen
            val resumen = """
                1. Cómo te sientes en general: $sentimientos
                2. Frecuencia de control: $control
                3. Sentimiento de estrés: $estres
                4. Frecuencia de insomnio: $insomnio
                5. Apoyo social: $apoyoSocial
                6. Frecuencia de soledad: $soledad
                7. Ayuda profesional: $ayudaProfesional
                8. Comodidad al hablar: $comodidad
                9. Estrategias para manejar el estrés: $estrategias
            """.trimIndent()

            // Mostrar el resumen
            Toast.makeText(this, resumen, Toast.LENGTH_LONG).show()
        }
    }

    private fun getSentimientos(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupSentimientos)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getControl(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupControl)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getEstres(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupEstres)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getInsomnio(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupInsomnio)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getApoyoSocial(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupApoyoSocial)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getSoledad(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupSoledad)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getAyudaProfesional(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupAyudaProfesional)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getComodidad(): String {
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupComodidad)
        val selectedId = radioGroup.checkedRadioButtonId
        val radioButton = findViewById<RadioButton>(selectedId)
        return radioButton?.text.toString()
    }

    private fun getEstrategias(): String {
        val estrategias = mutableListOf<String>()
        if (findViewById<CheckBox>(R.id.checkBoxEjercicio).isChecked) {
            estrategias.add("Ejercicio")
        }
        if (findViewById<CheckBox>(R.id.checkBoxMeditacion).isChecked) {
            estrategias.add("Meditación o mindfulness")
        }
        if (findViewById<CheckBox>(R.id.checkBoxHablar).isChecked) {
            estrategias.add("Hablar con amigos o familiares")
        }
        if (findViewById<CheckBox>(R.id.checkBoxCreatividad).isChecked) {
            estrategias.add("Hacer actividades creativas")
        }
        if (findViewById<CheckBox>(R.id.checkBoxOtros).isChecked) {
            estrategias.add("Otros (especificar)")
        }
        return estrategias.joinToString(", ")
    }
}

