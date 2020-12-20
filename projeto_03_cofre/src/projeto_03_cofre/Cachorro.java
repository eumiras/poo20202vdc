package projeto_03_cofre;

import java.util.Scanner;

class Brinquedo{
	int felicidade;
	int energiaGasta;
	
	Brinquedo(int felicidade, int energia) {
		this.felicidade = felicidade;
		this.energiaGasta = energia;
	}
	public String toString() {
		return "felicidade dada: " + this.felicidade + "energia para ser destruido " + this.energiaGasta;
	}
}

public class Cachorro {
	int felicidade = 0;
	int energia = 10;
	int idade = 0;
	int lacinhos = 0;
	int lacinhomax = 10;
	Brinquedo brinquedosDestruidos = null;
	String nome;
	
	Cachorro(String nome, int idade){
		this.idade = idade;
		this.nome = nome;
	}
	
	void brincar () {
		if(energia == 0) {
			System.out.println("n�o vai dar n�o minha filha");
			return;
		}
		else {
			System.out.println("AAAAAA eu amo brincar :P");
			felicidade +=1;
			energia -=1;
			lacinhos -=1;
			idade +=1;
		}
	}
	
	void descansar (int horas) {
		energia += horas;
		felicidade += horas;
		idade +=1;
		System.out.println("hmmmm a mimir");
	}
	
	void enfeitar (int lacinho) {
		if (felicidade == 0) {
			System.out.println("EU VOU TE MORDEEEE");
		} else if (lacinho > 10){
			System.out.println("NAAOO CABEEEE");
		} else if ((this.lacinhos + lacinho) > lacinhomax){
			System.out.println("n�o tem mais espa�o!! n�o t� vendo??");
		} else {
			this.lacinhos += lacinho;
			System.out.println("vou deixar, mas s� um hein...");
		}
	}
	
	
	void brincarLoucamente () {
		if(idade > 15) {
			System.out.println("olha mo�a, n�o tenho mais idade pra isso");
			return;
		}
		lacinhos = 0;
		energia = 0;
		felicidade +=10;
		idade +=1;
		System.out.println("MODO TUUUURBOOOO");
	}
	
	void fazerAmigo (Cachorro other){
		if(this.felicidade > 5){
			this.felicidade += 5;
			other.felicidade += 5;
			System.out.println("yeyyy fiz um novo amigo!! brincando brincando :p");
		}
		else {
			System.out.println("to sem saco agora");
		}
	}
	
	void destruir(Brinquedo brinquedo) {
		if (brinquedosDestruidos != null) {
			System.out.println("Voc� j� destruiu um brinquedo");
			return;
		}
		brinquedosDestruidos = brinquedo;
		this.energia -= brinquedo.energiaGasta;
		this.felicidade += brinquedo.felicidade;
		System.out.println("Voc� quebrou o brinquedo!");
		System.out.println("um toy story morreu pra vc se divertir");
		brinquedo.energiaGasta = 0;
		brinquedo.felicidade = 0;
		
	}
	
	public String toString(){
		String saida = "Aqui v�o meus status!\n";
		saida += "meu nome: " + nome + "\n";
		saida += "minha energia: " + energia + "\n";
		saida += "meu n�vel de felicidade: " + felicidade + "\n";
		saida += "minha idade: " + idade + "\n";
		saida += "meus lacinhos: " + lacinhos + "\n";
		return saida;
	}
	
	//public String toString() {
	//	return "minha energia:" + energia + "meu n�vel de felicidade:" + felicidade;
	//}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("--- Bem vindo!!---");
		System.out.println("aqui vai o menu <3");
		System.out.println("Digite o que fazer em seguida:");
		System.out.println("adotar (nome idade) - adotar um cachorrinho");
		System.out.println("brincar -  vamos brincar e eu vou ficar bem feliz");
		System.out.println("descansar (horas) - vou ficar feliz tbm, mas dormindo");
		System.out.println("enfeitar (lacinhos) - vc coloca lacinhos em mim e eu te mordo");
		System.out.println("turbo - o que pode acontecer � um mist�rio...");
		System.out.println("conhecer (amigo) - conhecer outro cachorrinho");
		System.out.println("comprar (brinquedo) - vamos comprar um brinquedo");
		System.out.println("destruir (brinquedo) - destruir o brinquedo :P");
		Chachorro dog = new Cachorro(); 
		
		
		while(true) {
			String line = scanner.nextLine();
			String input[] = line.split(" ");
			if (input[0].equals("end")) {
				System.out.println("� isso. acabou. boa sortee...");
				break;
			}else if (input [0].equals("adotar")) {
				Cachorro dog = new Cachorro(input [1],Integer.parseInt(input[2])); 
				System.out.println(dog);
			}else if (input[0].equals("brincar")) {
				dog.brincar();
				System.out.println(dog);
			}else if (input[0].equals("descansar")) {
				int horas = Integer.parseInt(input[1]);
				dog.descansar(horas);
				System.out.println(dog);
			}else if (input [0].equals("enfeitar")) {
				int lacinho = Integer.parseInt(input[1]);
				dog.enfeitar(lacinho);
				System.out.println(dog);
			}else if (input [0].equals("turbo")) {
				dog.brincarLoucamente();
				System.out.println(dog);
			}
			
		}
		scanner.close();
	}
}

