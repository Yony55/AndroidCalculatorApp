package mx.tec.calculadora

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.notkamui.keval.Keval
import com.notkamui.keval.KevalZeroDivisionException
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import kotlin.concurrent.fixedRateTimer
import kotlin.math.round

fun isDecimal(x:String):Boolean{
    val decimalPoint = '.'
    val inString = x.indexOf(decimalPoint)
    if(inString == -1){
        return false
    } else{
        return true
    }
}

fun firstDigit(x: String): Boolean{
    val operatorArray = arrayOf('/', '*', '+', '-')
    val firstPos = x.first()
    val inArray = operatorArray.indexOf(firstPos)
    if(inArray == -1){
        return false
    } else{
        return true
    }
}

fun lastDigit(x: String): String{
    val operatorArray = arrayOf('/', '*', '+', '-', '.')
    val lastPos = x.last()
    val inArray = operatorArray.indexOf(lastPos)

    if(inArray == -1){
        return x
    } else{
        return x.dropLast(1)
    }
}

var onScreenRes = false
var isMathOperator = false
var lastMathOp = ""

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var strEvaluate: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnZero1 = findViewById<Button>(R.id.buttonZero)
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

    @SuppressLint("SetTextI18n")
    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.buttonZero -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonZero.text
                strEvaluate += buttonZero.text
                lastMathOp += buttonZero.text
                isMathOperator = false
            }
            R.id.buttonOne -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonOne.text
                strEvaluate += buttonOne.text
                lastMathOp += buttonOne.text
                isMathOperator = false
            }
            R.id.buttonTwo -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonTwo.text
                strEvaluate += buttonTwo.text
                lastMathOp += buttonTwo.text
                isMathOperator = false
            }
            R.id.buttonThree -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonThree.text
                strEvaluate += buttonThree.text
                lastMathOp += buttonThree.text
                isMathOperator = false
            }
            R.id.buttonFour -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonFour.text
                strEvaluate += buttonFour.text
                lastMathOp += buttonFour.text
                isMathOperator = false
            }
            R.id.buttonFive -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonFive.text
                strEvaluate += buttonFive.text
                lastMathOp += buttonFive.text
                isMathOperator = false
            }
            R.id.buttonSix -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonSix.text
                strEvaluate += buttonSix.text
                lastMathOp += buttonSix.text
                isMathOperator = false
            }
            R.id.buttonSeven -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonSeven.text
                strEvaluate += buttonSeven.text
                lastMathOp += buttonSeven.text
                isMathOperator = false
            }
            R.id.buttonEight -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonEight.text
                strEvaluate += buttonEight.text
                lastMathOp += buttonEight.text
                isMathOperator = false
            }
            R.id.buttonNine -> {
                if(onScreenRes){
                    strEvaluate = ""
                    textViewResult.text = ""
                    onScreenRes = false
                    lastMathOp = ""
                }
                textViewResult.text = textViewResult.text.toString() + buttonNine.text
                strEvaluate += buttonNine.text
                lastMathOp += buttonNine.text
                isMathOperator = false
            }
            R.id.buttonDecimal -> {
                if(onScreenRes){
                    textViewResult.text = ""
                    onScreenRes = false
                    strEvaluate = ""
                    println("2")
                }
                if(isDecimal(lastMathOp)){
                    println("No pasa nada")
                } else{
                    textViewResult.text = textViewResult.text.toString() + buttonDecimal.text
                    strEvaluate += buttonDecimal.text
                    lastMathOp += buttonDecimal.text
                }
            }
            R.id.buttonEqual -> {
                if (strEvaluate.isEmpty()){
                    println("No pasa nada.")
                } else {
                    strEvaluate = lastDigit(strEvaluate)
                    println(strEvaluate)
                    println(lastMathOp)
                    try {
                        if(onScreenRes && firstDigit(lastMathOp)){
                            strEvaluate += lastMathOp
                        }
                        var operationRes = Keval.eval(strEvaluate)
                        operationRes = String.format("%.4f", operationRes).toDouble()
                        textViewResult.text = operationRes.toString()
                        strEvaluate = operationRes.toString()
                        onScreenRes = true
                    } catch (exception: KevalZeroDivisionException) {
                        textViewResult.text = "Error"
                        onScreenRes = true
                    }
                }
            }
            R.id.buttonPlus -> {
                if(onScreenRes){
                    onScreenRes = false
                }
                if(!isMathOperator) {
                    textViewResult.text = textViewResult.text.toString() + buttonPlus.text
                    strEvaluate += buttonPlus.text
                    lastMathOp = ""
                    lastMathOp += buttonPlus.text
                    isMathOperator = true
                }
            }
            R.id.buttonMinus -> {
                if(onScreenRes){
                    onScreenRes = false
                }
                if(!isMathOperator) {
                    textViewResult.text = textViewResult.text.toString() + buttonMinus.text
                    strEvaluate += buttonMinus.text
                    lastMathOp = ""
                    lastMathOp += buttonMinus.text
                    isMathOperator = true
                }
            }
            R.id.buttonDiv -> {
                if(onScreenRes){
                    onScreenRes = false
                }
                if(!isMathOperator) {
                    textViewResult.text = textViewResult.text.toString() + buttonDiv.text
                    strEvaluate += buttonDiv.text
                    lastMathOp = ""
                    lastMathOp += buttonDiv.text
                    isMathOperator = true
                }
            }
            R.id.buttonMult -> {
                if(onScreenRes){
                    onScreenRes = false
                }
                if(!isMathOperator) {
                    textViewResult.text = textViewResult.text.toString() + buttonMult.text
                    strEvaluate += buttonMult.text
                    lastMathOp = ""
                    lastMathOp += buttonMult.text
                    isMathOperator = true
                }
            }
        }
    }
}