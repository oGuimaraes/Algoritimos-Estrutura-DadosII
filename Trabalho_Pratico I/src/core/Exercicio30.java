package core;

import javax.swing.JOptionPane;

import structures.CDicionario;

public class Exercicio30 {

	public static void main(String[] args) {

		CDicionario dicionario;
		dicionario = new CDicionario();

		dicionario.adiciona("www.google.com", "172.217.5.110");
		dicionario.adiciona("www.pucminas.br", "200.229.32.27");
		dicionario.adiciona("www.gmail.com", "216.58.192.5");
		dicionario.adiciona("www.youtube.com", "172.217.0.46");
		dicionario.adiciona("www.capes.gov.br", "200.130.18.222");
		dicionario.adiciona("www.yahoo.com", "98.138.219.231");
		dicionario.adiciona("www.microsoft.com", "40.76.4.15");
		dicionario.adiciona("www.twitter.com", "104.244.42.1");
		dicionario.adiciona("www.brasil.gov.br", "170.246.252.243");
		dicionario.adiciona("www.wikipedia.com", "198.35.26.96");
		dicionario.adiciona("www.amazon.com", "172.231.14.116");
		dicionario.adiciona("research.microsoft.com", "13.67.218.189");
		dicionario.adiciona("www.facebook.com", "157.240.22.35");
		dicionario.adiciona("www.whitehouse.gov", "172.231.33.117");
		dicionario.adiciona("www.answers.com", "151.101.188.203");
		dicionario.adiciona("www.uol.com.br", "54.239.132.31");
		dicionario.adiciona("www.hotmail.com", "204.79.197.212");
		dicionario.adiciona("www.cplusplus.com", "167.114.170.15");
		dicionario.adiciona("www.nyt.com", "151.101.189.164");
		dicionario.adiciona("www.apple.com", "172.230.107.90");
		dicionario.adiciona("www.terra.com", "208.70.188.57");
		dicionario.adiciona("www.globo.com", "186.192.81.5");
		dicionario.adiciona("www.stackoverflow.com", "151.101.193.69");
		dicionario.adiciona("www.devmedia.com.br", "187.85.74.81");
		dicionario.adiciona("www.github.com", "192.30.255.113");
		dicionario.adiciona("www.onedrive.live.com", "2.17.196.247");

		String key = JOptionPane.showInputDialog("Digite uma chave:");
		JOptionPane.showMessageDialog(null, "Site: " + key + "\n" +
											"IP: " + dicionario.recebeValor(key));

	}
	
	// Copiar ClelulaDicionario e CDicionario;

}
