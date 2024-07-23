package com.example.calculatorappmidtermq1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class CalculatorFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_calculator, container, false)

        val editTextNumber1: EditText = view.findViewById(R.id.editTextNumber1)
        val editTextNumber2: EditText = view.findViewById(R.id.editTextNumber2)
        val buttonAdd: Button = view.findViewById(R.id.buttonAdd)
        val buttonSubtract: Button = view.findViewById(R.id.buttonSubtract)
        val buttonMultiply: Button = view.findViewById(R.id.buttonMultiply)
        val buttonDivide: Button = view.findViewById(R.id.buttonDivide)
        val textViewResult: TextView = view.findViewById(R.id.textViewResult)

        buttonAdd.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDouble()
            val num2 = editTextNumber2.text.toString().toDouble()
            textViewResult.text = "Result: ${performOperation(num1, num2, "add")}"
        }

        buttonSubtract.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDouble()
            val num2 = editTextNumber2.text.toString().toDouble()
            textViewResult.text = "Result: ${performOperation(num1, num2, "subtract")}"
        }

        buttonMultiply.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDouble()
            val num2 = editTextNumber2.text.toString().toDouble()
            textViewResult.text = "Result: ${performOperation(num1, num2, "multiply")}"
        }

        buttonDivide.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDouble()
            val num2 = editTextNumber2.text.toString().toDouble()
            textViewResult.text = "Result: ${performOperation(num1, num2, "divide")}"
        }

        return view
    }

    private fun performOperation(num1: Double, num2: Double, operation: String): Double {
        return when (operation) {
            "add" -> num1 + num2
            "subtract" -> num1 - num2
            "multiply" -> num1 * num2
            "divide" -> num1 / num2
            else -> 0.0
        }
    }
}
