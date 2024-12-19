public class Challenge_1 {

    public static void main(String[] args) {

        myArrrayList listY = new myArrrayList();
        listY.add(0);
        listY.add(10);
        listY.add(20);
        listY.add(30);

        System.out.println( listY.getUsingMod(1));
        System.out.println( listY.getUsingMod(-2));
        System.out.println( listY.getUsingMod(40));


    }

}
