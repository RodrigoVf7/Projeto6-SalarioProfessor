package br.edu.fateczl.salarioprofessor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;


public class MainActivity extends AppCompatActivity {

    private EditText edtNome, edtMatricula, edtIdade, edtAnosInstituicao, edtSalarioBase, edtHorasAula, edtValorHora;
    private RadioButton rbTitular, rbHorista;
    private TextView txtResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capturar as views
        edtNome = findViewById(R.id.edtNome);
        edtMatricula = findViewById(R.id.edtMatricula);
        edtIdade = findViewById(R.id.edtIdade);
        edtAnosInstituicao = findViewById(R.id.edtAnosInstituicao);
        edtSalarioBase = findViewById(R.id.edtSalarioBase);
        edtHorasAula = findViewById(R.id.edtHorasAula);
        edtValorHora = findViewById(R.id.edtValorHora);
        rbTitular = findViewById(R.id.rbTitular);
        rbHorista = findViewById(R.id.rbHorista);
        txtResultado = findViewById(R.id.txtResultado);

        Button btnCalcular = findViewById(R.id.btnCalcular);

        // Evento de clique no botão Calcular
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = edtNome.getText().toString();
                String matricula = edtMatricula.getText().toString();
                int idade = Integer.parseInt(edtIdade.getText().toString());

                if (rbTitular.isChecked()) {
                    // Professor Titular
                    int anosInstituicao = Integer.parseInt(edtAnosInstituicao.getText().toString());
                    double salarioBase = Double.parseDouble(edtSalarioBase.getText().toString());

                    ProfessorTitular titular = new ProfessorTitular(nome, matricula, idade, anosInstituicao, salarioBase);
                    double salarioFinal = titular.calcSalario();
                    txtResultado.setText("Salário do Professor Titular: R$ " + salarioFinal);
                } else if (rbHorista.isChecked()) {
                    // Professor Horista
                    int horasAula = Integer.parseInt(edtHorasAula.getText().toString());
                    double valorHoraAula = Double.parseDouble(edtValorHora.getText().toString());

                    ProfessorHorista horista = new ProfessorHorista(nome, matricula, idade, horasAula, valorHoraAula);
                    double salarioFinal = horista.calcSalario();
                    txtResultado.setText("Salário do Professor Horista: R$ " + salarioFinal);
                }
            }
        });
    }
}
