package Spiski_1;

public class Main {
    public static void main(String[] args) {
        Group kvbo = new Group();
        for (int i=0;i<=2;i++){
            kvbo = Group.insert(kvbo);
        }
        kvbo.printList(kvbo);
    }
}
