package com.mycompany.myapp;
import android.app.*;
import android.os.*;
import java.util.*;
import android.widget.*;
import android.graphics.*;

public class Resultado2Activity extends Activity {
	/**
	 * lista de caracteristicas para gerar, eu quis botar
	 * por diversão. "Se for fazer algo, faça com ânimo".
	 */
	String[] características = {
		"desajeitada",
		"caprichada",
		"debochada",
		"cruel",
		"depressiva",
		"incompetente",
		"grosseira",
		"insuportável",
		"nojento"
	};
	String[] feitos = {
		"com uma salsicha na mão",
		"pensando em desistir da vida",
		"honrando a sua polenta",
		"defendendo práticas sexuais de necrofilia",
		"chorando",
		"comendo porcaria"
	};
	String[] objetos = {
		"seu feto",
		"sua bunda",
		"seu celular",
		"seu cachorro",
		"seu pau",
		"seu namorado",
		"sua mesa",
		"sua batata",
		"sua banana",
		"sua motoca",
		"sua perna",
		"sua linguiça",
		"seu cabelo",
		"sua casa",
		"sua salsicha",
		"seu olho",
		"sua farofa",
		"sua cabeça"
	};
	String[] objetos2 = {
		"o feto",
		"a bunda",
		"o celular",
		"o cachorro",
		"o pau",
		"o namorado",
		"a mesa",
		"a batata",
		"a banana",
		"a motoca",
		"a perna",
		"a linguiça",
		"o cabelo",
		"a casa",
		"a salsicha",
		"o olho",
		"a farofa",
		"a cabeça",
		"o Seu Madruga",
		"a extratosfera",
		"o Papa",
		"a Rainha da Inglaterra",
		"a União Soviética",
		"a Alemanha Nazista",
		"o Hitler",
		"o gordinho saliente",
		"o Gabriel (Sperb)",
		"o presidente"
	};
	String[] verbos = {
		"quebrou",
		"melou",
		"melecou",
		"abriu",
		"molhou",
		"caiu",
		"morreu",
		"pariu",
		"cresceu",
		"dobrou",
		"voou",
		"estourou",
		"fugiu",
		"renunciou",
		"derreteu"
	};
	
	String[] afazeres = {
		"cair na gandaia com ",
		"governar ",
		"assassinar ",
		"abastecer ",
		"entristecer ",
		"comer ",
		"destruir ",
		"engravidar ",
		"fazer panquecas com ",
		"fazer picadinho d",
		"abaixar as calças d",
		"roubar "
	};
	
	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resultado_dos);
		
		//Recebe os valores da outra Atividade
		Bundle e = getIntent().getExtras();
		
		String nome = e.getString("aluno.nome");
		String email = e.getString("aluno.email");
		String senha = e.getString("aluno.senha");
		String sexo = e.getString("aluno.sexo");
		String curso = e.getString("aluno.curso");
		String turno = e.getString("aluno.turno");
		double nota = e.getDouble("aluno.nota",0);
		
		//variáves opicionais (que eu quis botar)
		int característicaX = new Random().ints(1,0, características.length-1).findFirst().getAsInt();
		int feitoX = new Random().ints(1,0, feitos.length-1).findFirst().getAsInt();
		int objetoX = new Random().ints(1,0, objetos.length-1).findFirst().getAsInt();
		int objetoY = new Random().ints(1,0, objetos2.length-1).findFirst().getAsInt();
		int verboX = new Random().ints(1,0, verbos.length-1).findFirst().getAsInt();
		int afazerX = new Random().ints(1,0, verbos.length-1).findFirst().getAsInt();
		
		String característica = características[característicaX];
		String feito = feitos[feitoX];
		String objeto = objetos[objetoX];
		String objeto2 = objetos2[objetoY];
		String verbo = verbos[verboX];
		String afazer = afazeres[afazerX];
		
		//se o aluno for eu...
		if (nome.toLowerCase().contains("eduardo")) {
			sexo = "Masculo";
			curso = "Informática";
			característica = "charmosa";
			feito = "sendo carinhoso";
			objeto = "seu computador";
			verbo = "quebrou";
			afazer = "fazer seu ";
			objeto2 = "curso";
			nota = 10;
		}
		
		//define o resultado
		String resultado = 
			"Via do Aluno\n" +
			"==========================\n" +
			email + '\n' +
			senha + '\n' +
			"Genero " + sexo.toLowerCase() + '\n' +
			curso + " (" + turno.toLowerCase() + ")\n" +
			"==========================\n" +
			"Parecer do Aluno:\n" +
			"==========================\n" +
			"O Aluno " + nome + " é uma pessoa " + característica + ", " +
			"está sempre " + feito + "!\n\n" +
			
			"Como " + objeto + " " + verbo + ", não pode mais " + afazer + objeto2 + ".\n" +
			"==========================\n" +
			"Nota: " + nota;
		
		//imprime o resultado
		TextView r = findViewById(R.id.RESULTADO);
		LinearLayout l = findViewById(R.id.BG);
		
		r.setText(resultado);
		if (nota > 5) {
			l.setBackgroundColor(Color.GREEN);
		} else {
			l.setBackgroundColor(Color.RED);
		}
	}
	
}
