package mx.tec.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.notkamui.keval.Keval
import com.notkamui.keval.KevalZeroDivisionException
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

var onScreenRes = false
class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var strEvaluate: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnZero = findViewById<Button>(R.id.buttonZero)
        val btnOne = findViewById<Button>(R.id.buttonOne)
        val btnTwo = findViewById<Button>(R.id.buttonTwo)
        val btnThree = findViewById<Button>(R.id.buttonThree)
        val btnFour = findViewById<Button>(R.id.buttonFour)
        val btnFive = findViewById<Button>(R.id.buttonFive)
        val btnSix = findViewById<Button>(R.id.buttonSix)
        val btnSeven = findViewById<Button>(R.id.buttonSeven)
        val btnEight = findViewById<Button>(R.id.buttonEight)
        val btnNine = findViewById<Button>(R.id.buttonNine)
        val btnDec = findViewById<Button>(R.id.buttonDecimal)
        val btnEq = findViewById<Button>(R.id.buttonEqual)
        val btnPlus = findViewById<Button>(R.id.buttonPlus)
        val btnMin = findViewById<Button>(R.id.buttonMinus)
        val btnDiv = findViewById<Button>(R.id.buttonDiv)
        val btnMult = findViewById<Button>(R.id.buttonMult)

        btnZero.setOnClickListener(this@MainActivity)
        btnOne.setOnClickListener(this@MainActivity)
        btnTwo.setOnClickListener(this@MainActivity)
        btnThree.setOnClickListener(this@MainActivity)
        btnFour.setOnClickListener(this@MainActivity)
        btnFive.setOnClickListener(this@MainActivity)
        btnSix.setOnClickListener(this@MainActivity)
        btnSeven.setOnClickListener(this@MainActivity)
        btnEight.setOnClickListener(this@MainActivity)
        btnNine.setOnClickListener(this@MainActivity)
        btnDec.setOnClickListener(this@MainActivity)
        btnEq.setOnClickListener(this@MainActivity)
        btnPlus.setOnClickListener(this@MainActivity)
        btnMin.setOnClickListener(this@MainActivity)
        btnDiv.setOnClickListener(this@MainActivity)
        btnMult.setOnClickListener(this@MainActivity)

        strEvaluate = ""
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.buttonZero -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonZero.text
                strEvaluate += buttonZero.text
            }
            R.id.buttonOne -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonOne.text
                strEvaluate += buttonOne.text
            }
            R.id.buttonTwo -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonTwo.text
                strEvaluate += buttonTwo.text

            }
            R.id.buttonThree -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonThree.text
                strEvaluate += buttonThree.text

            }
            R.id.buttonFour -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonFour.text
                strEvaluate += buttonFour.text

            }
            R.id.buttonFive -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonFive.text
                strEvaluate += buttonFive.text

            }
            R.id.buttonSix -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonSix.text
                strEvaluate += buttonSix.text

            }
            R.id.buttonSeven -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonSeven.text
                strEvaluate += buttonSeven.text
            }
            R.id.buttonEight -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonEight.text
                strEvaluate += buttonEight.text
            }
            R.id.buttonNine -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonNine.text
                strEvaluate += buttonNine.text
            }
            R.id.buttonDecimal -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonDecimal.text
                strEvaluate += buttonDecimal.text
            }
            R.id.buttonEqual -> {
                try {
                    val operationRes = Keval.eval(strEvaluate)
                    textViewResult.setText(operationRes.toString())
                    strEvaluate = ""
                    onScreenRes = true
                } catch (exception: KevalZeroDivisionException){
                    textViewResult.setText("Error")
                }
            }
            R.id.buttonPlus -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonPlus.text
                strEvaluate += buttonPlus.text
            }
            R.id.buttonMinus -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonMinus.text
                strEvaluate += buttonMinus.text
            }
            R.id.buttonDiv -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonDiv.text
                strEvaluate += buttonDiv.text
            }
            R.id.buttonMult -> {
                if(onScreenRes){
                    textViewResult.setText("")
                    onScreenRes = false
                }
                textViewResult.text = textViewResult.text.toString() + buttonMult.text
                strEvaluate += buttonMult.text
            }
        }
    }
}