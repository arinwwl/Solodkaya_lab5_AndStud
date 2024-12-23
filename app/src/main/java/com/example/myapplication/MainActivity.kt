package com.example.myapplication
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R


class MainActivity : AppCompatActivity() {

    private lateinit var floorNumberEditText: EditText
    private lateinit var elevatorCheckBox: CheckBox
    private lateinit var normalElevatorRadioButton: RadioButton
    private lateinit var cargoElevatorRadioButton: RadioButton
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        floorNumberEditText = findViewById(R.id.floorNumberEditText)
        elevatorCheckBox = findViewById(R.id.elevatorCheckBox)
        normalElevatorRadioButton = findViewById(R.id.normalElevatorRadioButton)
        cargoElevatorRadioButton = findViewById(R.id.cargoElevatorRadioButton)
        saveButton = findViewById(R.id.saveButton)

        findViewById<Button>(R.id.inputButton).setOnClickListener {

        }

        findViewById<Button>(R.id.quitButton).setOnClickListener()
        {
            finish()
        }

        saveButton.setOnClickListener {
            val floorNumber = floorNumberEditText.text.toString()
            val hasElevator = elevatorCheckBox.isChecked
            val elevatorType = if (normalElevatorRadioButton.isChecked) "Обычный" else "Грузовой"

        }
    }
}
