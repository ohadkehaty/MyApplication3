package ohad.kehaty.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setName(){
        val textView: TextView = findViewById(R.id.tw1)
        val editText: EditText = findViewById(R.id.et1)
        val name: String = editText.getText().toString()
        textView.text = name
    }

    fun onButtonClick(){

        setName()
    }
}