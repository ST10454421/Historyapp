package history.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var searchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput: EditText
    private lateinit var clearButton: Button






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        searchButton= findViewById(R.id.searchButton)
        clearButton = findViewById(R.id.clearButton)
        ageInput = findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)

        searchButton.setOnClickListener{
//create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

//if age is not null and age is in the range between
            if (age != null && age in 20 .. 100) {
//when age is 30 display Thato else when is .. and so on
                val Historyfigure = when (age) {
                    41 -> "Shaka Zulu." +
                            "you are 41 years old which is the same as Shaka Zulu, who was the  dictactor of zulu nation who ruled through coercion and instilled fear in his people"
                    50 -> "Michael Jackson." +
                             "You are 50 years old which is the same as Micheal Jackson He was an American singer, song writter and a dancer."
                    56 -> "Adolf Hitler." +
                             "You are 56 which is the same as Adolf Hitler who was an Austrain-born German politician who was the dictactor of Nazi Germany from 1933 until his suicide in 1945"
                    60 -> "Maradona." +
                            "You are 60 years old which is the same as Maradona  who was an Argentine professional football player and manager, who is considered to be the greatest player of all time"
                    62-> "Martin Luther." +
                            "You are 62 years old which is the same as Martin Luther who was a German priest, theoligian,author and professor. He is one of the most influential figures in the history of Chrisrianity"
                    75 -> "Oliver Tambo," +
                            "You are 75 years old which is the same as Oliver Tambo who was the acting president od African National Congress. He initially wanted to study medicine, but at the time no tertiary medical school accepted black students in that field"
                    79 -> "Mahatma Gandhi," +
                            "You are 79 years which is the same as Mahatma Gandhi who was an indain lawyer and a political ethicist who is widely recognized as one of the twentieth century's greatest political and spiritual leaders"
                    82 -> "Pele," +
                             "You are 82 years which is the same as Pele who was an Brazilian  professional footballer who is the only player in history to win three world Cups"
                    95 -> "Nelson Mandela," +
                             "You are 95 years old which is the same as Nelson Mandela who was the first black president of South Africa "
                    96 -> "Robert Mugabe," +
                             "You are 96 years old which is the same as Robert Mugabe who was the Zimbabwean president"
                    else -> null
                }
                val message = if (Historyfigure != null) " The historical's name is $Historyfigure."
                else "No Historical found with the entered age."
                resultTextView.text = message
            } else{
                resultTextView.text = "Invalid input. PLease enter a valid age between 20 and 50."

            }
        }

        clearButton.setOnClickListener{
            ageInput.text.clear()
            resultTextView.text = ""
        }
    }
}