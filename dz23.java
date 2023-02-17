public class Main {
	static int kolDeti = 11;
	static int kolPension = 5;
	static int kolVzros = 9;
	public static void main(String[] args) {

		System.out.println("Стоимость билетов для группы из 9 взрослых, 11 детей и 5 пенсионеров: "+stoim());
		
	}
	static int stoim(){
			Bilet ob = new Bilet();
			int stoimDeti = ob.deti(kolDeti);
			int stoimVzros = ob.vzros(kolVzros);
			int stoimPension = ob.pension(kolPension);
			return stoimDeti + stoimVzros + stoimPension;
	}
}

class Bilet{
	static int skidkaVzros = 0;
	static int skidkaPension = 30;
	static int skidkaDeti = 50;
	static int zena = 70;
	static int stoimBilet(int zena1, int skidka){
		return zena1-zena1*skidka/100;
	}
	static int pension(int n){
		return stoimBilet(zena, skidkaPension)*n;
	}
	static int deti(int n){
		return stoimBilet(zena, skidkaDeti)*n;
	}
	static int vzros(int n){
		return stoimBilet(zena, skidkaVzros)*n;
	}
}