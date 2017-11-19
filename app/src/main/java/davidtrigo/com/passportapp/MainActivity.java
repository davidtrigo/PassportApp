package davidtrigo.com.passportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    // Persistencia datos SharedPreference
    private final static String SHARED_PREFERENCES = "MisPreferencias";

    // Datos del formulario
    private String affair = "", message = "";
    private int spinnerSelection = 0;
    private boolean checkBoxState = false;

    // Views UI
    private EditText editName, editSurname;
    private Spinner spinnerCountries;
    private CheckBox chkUEcitizien;
    private Button btnSave, btnLoad, btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
        //Html.fromHtml() Para añadir html


//        Spinner spinner = findViewById(R.id.spinnerCountries);
//        spinner.setSelection(0);


    }

    private void initLayout() {

        editName = findViewById(R.id.editname);
        editSurname = findViewById(R.id.editsurname);
        spinnerCountries = findViewById(R.id.spinnerCountries);
        chkUEcitizien = findViewById(R.id.UEcitizien);

        btnSave = findViewById(R.id.btnSave);
        btnLoad = findViewById(R.id.btnLoad);
        btnDelete = findViewById(R.id.btnDelete);

//        btnSave.setOnClickListener(this);
//        btnLoad.setOnClickListener(this);
//        btnDelete.setOnClickListener(this);

    }
}
