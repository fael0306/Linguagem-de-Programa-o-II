import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExP1Teste {

	public static void main(String[] args) {
		
		Pessoa[] family = new Pessoa[Integer.parseInt(args[0])];
		
		family[0] = new Pessoa("Rafael","Manteiga", LocalDate.of(1999, 6, 3),63F,1.69F,'M');
		family[1] = new Pessoa("Carlos","Eduardo Balbino", LocalDate.of(1967, 5, 21),120F,1.71F,'M');
		family[2] = new Pessoa("Isabel","Cristina da Silva Manteiga", LocalDate.of(1963, 1, 12),80F,1.65F,'F');
		
		//Pessoa Rafael = new Pessoa("Rafael","Manteiga", LocalDate.of(1999, 6, 3),63,1.69F,'M');
		//Pessoa Carlos = new Pessoa("Carlos","Eduardo Balbino", LocalDate.of(1967, 5, 21),120,1.71F,'M');
		//Pessoa Isabel = new Pessoa("Isabel","Cristina da Silva Manteiga", LocalDate.of(1963, 1, 12),120,1.65F,'F');
		Scanner scanner = new Scanner(System.in);
		for(int a=0;a<=args.length;a++){
			
			System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            String dataNascimentoStr = scanner.next();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

            System.out.print("Peso: ");
            float peso = scanner.nextFloat();

            System.out.print("Altura: ");
            float altura = scanner.nextFloat();

            System.out.print("Gênero (M/F): ");
            char genero = scanner.next().charAt(0);

            Pessoa pessoa = new Pessoa(nome, sobrenome, dataNascimento, peso, altura, genero);
            family[a] = pessoa;
		}
		scanner.close();

		family[0].setMae(family[2]);
		family[0].setPai(family[1]);
		
		family[0].setstatus("jantando");
		family[1].setstatus("cozinhando");
		family[2].setstatus("dormindo");
		
		for(int i=0;i<=2;i++) {
		JOptionPane.showMessageDialog(null,family[i].toString());
		JOptionPane.showMessageDialog(null, family[i].status());
		}
		JOptionPane.showMessageDialog(null, "O "+family[0].getPai().getNome()+" é pai de"+ family[0].getNome());
		JOptionPane.showMessageDialog(null, "A "+family[0].getMae().getNome()+" é mãe de"+ family[0].getNome());
		
		Pessoa[] family2 = new Pessoa[3];
		
		family2[0] = new Pessoa("Cristiano","Júnior", LocalDate.of(1998, 1, 5),85,1.80F,'M');
		family2[1] = new Pessoa("Alicia","Neri", LocalDate.of(1998, 6, 20),50,1.65F,'F');
		family2[2] = new Pessoa("Ágatha","Neri", LocalDate.of(2021, 3, 21),2.5F,0.50F,'F');
		
		family2[2].setMae(family2[1]);
		family2[2].setPai(family2[0]);
		
		family2[0].setstatus("vendo TV");
		family2[1].setstatus("mexendo no computador");
		family2[2].setstatus("se alimentando");
		
		for(int k=0;k<=2;k++) {
		JOptionPane.showMessageDialog(null,family2[k].toString());
		JOptionPane.showMessageDialog(null, family2[k].status());
		}
		JOptionPane.showMessageDialog(null, "O "+family2[2].getPai().getNome()+" é pai de "+ family2[2].getNome());
		JOptionPane.showMessageDialog(null, "A "+family2[2].getMae().getNome()+" é mãe de "+ family2[2].getNome());
		
		JOptionPane.showMessageDialog(null, Pessoa.cont());
		
	}
}