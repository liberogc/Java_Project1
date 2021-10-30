package principale;
import java.util.Scanner; // la classe Scanner deve essere importata
public class Home {
	public static void main(String[] args) {
		// pre-post incremento
		int matricola=1;
		int mat=1;
		matricola++;
		matricola++;  // matricola=3
		// unari
		mat=2;
		mat+=mat;
		mat+=mat; // 8
		// boxing unboxing
		Integer val=20;
		int val2=val;
		// wrapper
		System.out.println("Valore min e max "+Integer.max(100, 20));
		int numero=Integer.parseInt("12"); //restituisce un numeri int se passiamo una stringa valore
		Object obj=Integer.toString(20); // ritorna oggetto di 20
		System.out.println(Integer.bitCount(+1200)); // 4bit
		System.out.println(Integer.compare(40, 20)); // 1  0 -1 
		String nome="RossiMario";
		System.out.println(nome.length()); // conta i caratteri
		// casting
		char c='A';
		int valore = (int) c;
		System.out.println("ASCII "+valore);
		// utilizzo dll classe Scanner
		Scanner intext = new Scanner(System.in); // Istanza di classe si ottiene l' oggetto
		System.out.println("Digitare caratteri alfanumerici"); // messaggio su console prima di inserire
		// l' oggetto espone i metodi
		String testo=intext.nextLine(); // restituisce una stringa assegnata ad una variabile
		// la stringa  testo contiene i caratteri digitati da tastiera
		System.out.println(testo); // stampa ciò che è stato digitato
		//metodo nextint per gli interi
		System.out.println("Inserire un valore");
		int v=intext.nextInt(); // quest solleva una eccezione se si inseriscono caratteri, vedere try catch
	}
}
