package com.frost.customcomponent

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class CustomEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?= null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
    ): LinearLayout(context, attrs, defStyle, defStyleRes){

    private var layout: TextInputLayout
    private var text: EditText
    private var note: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.custom_edit_text, this, true)
        layout = findViewById(R.id.input_layout)
        text = findViewById(R.id.text_input)
        note = findViewById(R.id.notes)
    }

    fun setEditText(title: String, hint: String){
        layout.hint = title
        text.hint = hint
    }

    fun isEmpty() = text.text.isBlank()

    fun setError(message: String) {
        note.text = message
        note.setTextColor(resources.getColor(R.color.colorTransactionNegative))
    }


}