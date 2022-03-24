public class Main {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(1,2.0,1);
        if (qe.getDiscriminant() > 0) {
            System.out.println("Nghiem 1 la " + qe.getRoot1());
            System.out.println("Nghiem 2 la " + qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("Nghiem duy nhat la " + qe.getRoot());
        } else {
            System.out.println("PT vo nghiem");
        }

    }



}
