public class Main {
    public static <BonusMilesService> void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculete(price);
        System.out.println(miles);
    }
}
