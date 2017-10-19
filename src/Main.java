import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Creamos 3 objetos Animal
				Mamifero mamifero1 = new Mamifero("zorro",30,8);
				Mamifero mamifero2 = new Mamifero("vaca",23,4);
				Mamifero mamifero3 = new Mamifero("perrete",122,4);
				Aves aves1 = new Aves();
				Aves aves2 = new Aves();
				Animal perro = new Animal();
				Animal gato = new Animal();
				
				//Le damos unos valores para poder usarlos
				aves1.setNombre("yako");
				aves1.setPeso(23);
				aves2.setNombre("ruo");
				aves2.setPeso(67);
				perro.setNombre("yaki");
				perro.setPeso(44);
				gato.setNombre("chufi");
				gato.setPeso(99);
				
				//Creamos la lista y a�adimos esos animales al arrayList
				ArrayList<Animal> habitad = new ArrayList<Animal>();
				habitad.add(mamifero1);
				habitad.add(mamifero2);
				habitad.add(mamifero3);
				habitad.add(aves1);
				habitad.add(aves2);
				habitad.add(perro);
				habitad.add(gato);
			
				//Para poder usar un m�todo concreto de un Mam�fero, tenemos que forzar una conversi�n expl�cita del objeto gen�rico al concreto.
				Mamifero mamiferoLista = (Mamifero) habitad.get(2); //Si en lugar de coger el elemento con �ndice 2 (que es un mam�fero), cogemos el elemento 5 (que es un ave) provocar� una excepci�n y fallar�.
				mamiferoLista.amamantar();
				
				//Mostramos la lista completa, y gracias al polimorfismo, cada objeto, como tienen sobrescritos sus m�todos .toString(), se ejecuta el propio de cada uno, en lugar del toString de Animal
				System.out.println(habitad.toString());
				
				
			}

		}