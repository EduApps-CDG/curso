package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.*;
import android.content.*;

public class Exercicio2Activity extends Activity {
	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exercicio_dos);
		
		//inicializa componentes
		final EditText nome = findViewById(R.id.NOME);
		final EditText email = findViewById(R.id.EMAIL);
		final EditText senha = findViewById(R.id.SENHA);
		final EditText[] nota = {
			findViewById(R.id.NOTA1),
			findViewById(R.id.NOTA2),
			findViewById(R.id.NOTA3),
			findViewById(R.id.NOTA4)
		};
		final RadioGroup sexo = findViewById(R.id.SEXO);
		final RadioGroup curso = findViewById(R.id.CURSO);
		final RadioGroup turno = findViewById(R.id.TURNO);
		
		Button caculo = findViewById(R.id.CALCULAR);
		
		//OnClick do botão para calcular a nota
		caculo.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View p1) {
				//Pega todas as variáveis
				String NOME = nome.getText().toString();
				String EMAIL = email.getText().toString();
				String SENHA = senha.getText().toString();
				double NOTA = (
					Double.parseDouble(nota[0].getText().toString()) +
					Double.parseDouble(nota[1].getText().toString()) +
					Double.parseDouble(nota[2].getText().toString()) +
					Double.parseDouble(nota[3].getText().toString())
				) / 4.0;
				RadioButton fezSexo = findViewById(sexo.getCheckedRadioButtonId());
				RadioButton fezCurso = findViewById(curso.getCheckedRadioButtonId());
				RadioButton fezTurno = findViewById(turno.getCheckedRadioButtonId());
				String SEXO = fezSexo.getText().toString();
				String CURSO = fezCurso.getText().toString();
				String TURNO = fezTurno.getText().toString();
				
				// Inicia uma nova Atividade da Resposta:
				Intent i = new Intent(p1.getContext(), Resultado2Activity.class);
				
				//envia valores para a nova Atividade
				i.putExtra("aluno.nome",NOME);
				i.putExtra("aluno.email",EMAIL);
				i.putExtra("aluno.senha",SENHA);
				i.putExtra("aluno.nota",NOTA);
				i.putExtra("aluno.sexo",SEXO);
				i.putExtra("aluno.curso",CURSO);
				i.putExtra("aluno.turno",TURNO);
				
				startActivity(i);
			}
		});
	}
	
}
