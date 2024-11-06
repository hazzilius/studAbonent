public class Main {
    public static void main(String[] args) {
        Abonent[] abonents = {
                new Abonent(0, "Иванов", "Иван", "Иванович", "Ул. Пушкина-Колотушкина 12/б", 45, "1234 1234 1234 4321", 434),
                new Abonent(1, "Петров", "Петр", "Петрович", "Ул. Пушкина-Колотушкина 13/а", 623, "1234 1234 1234 4321", 12000),
                new Abonent(2, "Сидоров", "Сидор", "Сидорович", "Ул. Пушкина-Колотушкина 14/а", 523, "1234 1234 1234 4321", 2),
                new Abonent(3, "Николаев", "Никола", "Николаевич", "Ул. им. Сталина 243", 120, "1234 1234 1234 4321", 43),
                new Abonent(4, "Семенов", "Семен", "Семенович", "Ул. Пушкина-Колотушкина 111/а", 31, "1234 1234 1234 4321", 8),
        };

        int maxMinutes = 350;

        System.out.println("Время переговоров превышает " + maxMinutes + " минут у: ");
        for (int i = 0; i < abonents.length; i++){
            if (abonents[i].getminutesPassedInCall() > maxMinutes){
                System.out.println(abonents[i]);
            }
        }
    }
}