public class While {
    public static void main(String[] args) {
        int i = 200000;
        while (i <= 350000){
            System.out.println("Номер билета: " + i);
            if (i == 205000) {
                i = 345000;
                System.out.println("===================");
            } else i = i + 100;
        }
    }
}
