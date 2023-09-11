package exercice1;

public class CreerUneClass {
    public static void Permuter(int v1, int v2){
        System.out.println(v1 + " : " + v2);
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println(v1 + " : " + v2);
    }
}
