public class FamilyTree {

    public static void main(String[] args){
    BinaryTreeNode root = new BinaryTreeNode("Jake");
    BinaryTreeNode mom = new BinaryTreeNode("Helen");
    BinaryTreeNode dad = new BinaryTreeNode("Vadim");

    root.setLeft(mom);
    root.setRight(dad);

    BinaryTreeNode maternalGrandma = new BinaryTreeNode("Natasha");
    BinaryTreeNode maternalGrandpa = new BinaryTreeNode("Yura");

    mom.setLeft(maternalGrandma);
    mom.setRight(maternalGrandpa);

    BinaryTreeNode paternalGrandma = new BinaryTreeNode("Ella");
    BinaryTreeNode paternalGrandpa = new BinaryTreeNode("Misha");

    dad.setLeft(paternalGrandma);
    dad.setRight(paternalGrandpa);

        System.out.println("Hello World. My name is " + root.getValue());

        System.out.println("My mom's name is: " + root.getLeft().getValue());
        System.out.println("My dad's name is: " + root.getRight().getValue());

        System.out.println("My maternal grandmother's name is: " + mom.getLeft().getValue());
        System.out.println("My maternal grandfather's name is: " + mom.getRight().getValue());

        System.out.println("My paternal grandmother's name is: " + dad.getLeft().getValue());
        System.out.println("My paternal grandfather's name is: " + dad.getRight().getValue());





    }
}
