package sigit.i.mywidgetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.paperdb.Paper;

public class MainActivity extends AppCompatActivity {

    Button btnSimpan;
    EditText edtCreated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpan = (Button)findViewById(R.id.btn_save);
        edtCreated = (EditText)findViewById(R.id.edt_created);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paper.book().write("created", edtCreated.getText().toString());

                Toast.makeText(MainActivity.this, "Save Succesfully!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
