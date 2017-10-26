package my.edu.tarc.lab12bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextWeight , editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWeight = (EditText) findViewById(R.id.editTextWeight);
        editTextHeight = (EditText) findViewById(R.id.editTextHeight);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);

    }
    public void CalculateBMI(View view){
        double weight ,height,BMI;

        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = (Double.parseDouble(editTextHeight.getText().toString()))/100;
        BMI = weight/(height*height);
        if (BMI <=18.5)
        {
            textViewResult.setText("Your are Under Weight");
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if (BMI >=25)
        {
            textViewResult.setText("Your are Over Weight");
            imageViewResult.setImageResource(R.drawable.over);
        }
        else
        {
            textViewResult.setText("Your are Normal");
            imageViewResult.setImageResource(R.drawable.normal);
        }


    }
}
