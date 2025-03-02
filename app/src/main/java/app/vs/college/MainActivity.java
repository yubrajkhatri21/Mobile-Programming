package app.vs.college;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton1, radioButton2, radioButton3;
    private Button login;
    private EditText editUsername, edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        login = findViewById(R.id.btnLogin);
        editUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);

        // Initialize RadioGroup and RadioButtons
        radioGroup = findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);

        // Handle radio button selection changes
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            if (checkedId == R.id.radioButton1) {
                Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.radioButton2) {
                Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show();
            } else if (checkedId == R.id.radioButton3) {
                Toast.makeText(this, "Option 3 selected", Toast.LENGTH_SHORT).show();
            }
        });

        // Handle login button click
        login.setOnClickListener(v -> {
            String username = editUsername.getText().toString();
            String password = edtPassword.getText().toString();

            // Add your login logic here
            Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show();
        });
    }
}