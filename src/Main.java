public class Main {

    public static void main(String[] args) {
	// write your code here
        Programmist15 programmist15 = new Programmist15("Урмат", "Программист", "A.K.У");
        Danser15 danser15 = new Danser15("Аяна", "Бийчи","АДЕП");
        Singer15 singer15 = new Singer15("Айдар","Ырчы","Обон деген группанын  мучосу");
        System.out.println(programmist15.toString());
        programmist15.coding();
        System.out.println(" ");
        System.out.println(danser15.toString());
        danser15.danсing();
        System.out.println(" ");
        System.out.println(singer15.toString());
        singer15.singing();
        singer15.playGuitar();
    }
}
