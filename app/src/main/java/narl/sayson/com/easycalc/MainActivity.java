package narl.sayson.com.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.edit;


public class MainActivity extends AppCompatActivity {
    Button plusButton, minusButton, clearButton, multButton, divButton, exitButton;
    TextView midView;
    EditText txtNum1, txtNum2;

    double res;
    double Num1, Num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        midView = (TextView) findViewById(R.id.midView);
        txtNum1 = (EditText) findViewById(R.id.txtNum1);
        txtNum2 = (EditText) findViewById(R.id.txtNum2);

        plusButton = (Button) findViewById(R.id.plusButton);
        clearButton =(Button)findViewById(R.id.clearButton);
        exitButton=(Button)findViewById(R.id.exitButton);
        minusButton = (Button) findViewById(R.id.minusButton);
        multButton = (Button) findViewById(R.id.multbutton);
        divButton = (Button) findViewById(R.id.divButton);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNum1.getText().toString().equals("") || txtNum2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                } else {
                    Num1 = Double.parseDouble(txtNum1.getText().toString());
                    Num2 = Double.parseDouble(txtNum2.getText().toString());

                    res = Num1 + Num2;
                    midView.setText(String.format("%,.2f",res));

                }
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNum1.getText().toString().equals("") || txtNum2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                } else {
                    Num1 = Double.parseDouble(txtNum1.getText().toString());
                    Num2 = Double.parseDouble(txtNum2.getText().toString());

                    res = Num2 - Num1;
                    String.format("%,.2f",res);
                    midView.setText(String.format("%,.2f",res));
                }
            }
        });
clearButton.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v){
        txtNum1.setText("");
        txtNum2.setText("");
    }
});

        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNum1.getText().toString().equals("") || txtNum2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                } else {
                    Num1 = Double.parseDouble(txtNum1.getText().toString());
                    Num2 = Double.parseDouble(txtNum2.getText().toString());

                    res = Num1 * Num2;
                    String.format("%,.2f",res);
                    midView.setText(String.format("%,.2f",res));
                }
            }
        });
        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtNum1.getText().toString().equals("") || txtNum2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please enter a valid number", Toast.LENGTH_SHORT).show();
                } else {
                    Num1 = Double.parseDouble(txtNum1.getText().toString());
                    Num2 = Double.parseDouble(txtNum2.getText().toString());

                    res = Num2 / Num1;
                    String.format("%,.2f",res);
                    midView.setText(String.format("%,.2f",res));    
                }
            }
        });
        exitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }});

    }

}
