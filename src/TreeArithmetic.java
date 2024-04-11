import java.util.ArrayList;
import java.util.Scanner;
public class TreeArithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your expression (only 3 operations with integers. ex: 4 5 + 2 3 + *):");
        String expression = scanner.nextLine();




        BinaryTreeNode node1 = new BinaryTreeNode(null);
        BinaryTreeNode node2 = new BinaryTreeNode(null);
        BinaryTreeNode node3 = new BinaryTreeNode(null);
        BinaryTreeNode node4 = new BinaryTreeNode(null);
        BinaryTreeNode node5 = new BinaryTreeNode(null);
        BinaryTreeNode node6 = new BinaryTreeNode(null);
        BinaryTreeNode node7 = new BinaryTreeNode(null);

        node1.setLeft(node2);
        node1.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);
        node3.setRight(node7);

        node4.setValue(TreeArithmetic.findInteger(expression));
        expression = expression.split(" ",2)[1];
        node5.setValue(TreeArithmetic.findInteger(expression));
        expression = expression.split(" ",2)[1];

        node2.setValue(TreeArithmetic.findOperator(expression));
        expression = expression.split(" ",2)[1];

        node6.setValue(TreeArithmetic.findInteger(expression));
        expression = expression.split(" ",2)[1];
        node7.setValue(TreeArithmetic.findInteger(expression));
        expression = expression.split(" ",2)[1];

        node3.setValue(TreeArithmetic.findOperator(expression));
        expression = expression.split(" ",2)[1];

        node1.setValue(TreeArithmetic.findOperator(expression));

        BinaryTreeNode[] list = {node1, node2, node3, node4, node5, node6, node7};

        System.out.println("\nThis is the binary tree");
        printTree(list);


        if (node2.getValue().equals('+')){
            node2.setValue(TreeArithmetic.add(node2));
        }else if (node2.getValue().equals('-')) {
            node2.setValue(TreeArithmetic.subtract(node2));
        }else if (node2.getValue().equals('*')) {
            node2.setValue(TreeArithmetic.multiply(node2));
        }else if (node2.getValue().equals('/')) {
            node2.setValue(TreeArithmetic.divide(node2));
        }else if (node2.getValue().equals('%')) {
            node2.setValue(TreeArithmetic.modulus(node2));
        }

        if (node3.getValue().equals('+')){
            node3.setValue(TreeArithmetic.add(node3));
        }else if (node3.getValue().equals('-')) {
            node3.setValue(TreeArithmetic.subtract(node3));
        }else if (node3.getValue().equals('*')) {
            node3.setValue(TreeArithmetic.multiply(node3));
        }else if (node3.getValue().equals('/')) {
            node3.setValue(TreeArithmetic.divide(node3));
        }else if (node3.getValue().equals('%')) {
            node3.setValue(TreeArithmetic.modulus(node3));
        }

        if (node1.getValue().equals('+')){
            node1.setValue(TreeArithmetic.add(node1));
        }else if (node1.getValue().equals('-')) {
            node1.setValue(TreeArithmetic.subtract(node1));
        }else if (node1.getValue().equals('*')) {
            node1.setValue(TreeArithmetic.multiply(node1));
        }else if (node1.getValue().equals('/')) {
            node1.setValue(TreeArithmetic.divide(node1));
        }else if (node1.getValue().equals('%')) {
            node1.setValue(TreeArithmetic.modulus(node1));
        }

        System.out.println("\nThe result is: " + node1.getValue());


    }

    public static int findInteger( String input) {
        for (int i = 0; i < input.length(); i++) {

            ArrayList<Integer> currNumber = new ArrayList<>();
            int x = 0;
            while (true) {
                if (i + x < input.length() && (input.charAt(i + x) == '1' || input.charAt(i + x) == '2' || input.charAt(i + x) == '3' || input.charAt(i + x) == '4' || input.charAt(i + x) == '5' || input.charAt(i + x) == '6' || input.charAt(i + x) == '7' || input.charAt(i + x) == '8' || input.charAt(i + x) == '9' || input.charAt(i + x) == '0')) {
                    currNumber.add(Integer.parseInt(String.valueOf(input.charAt(i + x))));
                } else {
                    break;
                }
                x++;
            }
            i = i + x;

            if (currNumber.size() > 0) {
                int tempNumber = 0;
                int power = 0;
                for (int j = currNumber.size() - 1; j >= 0; j--) {
                    tempNumber += (int) (currNumber.get(j) * Math.pow(10, power));
                    power++;
                }

                return tempNumber;
            }
        }
        return -1;
    }

    public static char findOperator(String input) {
        return input.charAt(0);
    }

    public static void printTree(BinaryTreeNode[] list){
        System.out.println("       "+list[0].getValue());
        System.out.println("    "+list[1].getValue()+"     "+list[2].getValue());
        System.out.println("  "+list[3].getValue()+"  "+list[4].getValue()+"  "+list[5].getValue()+"  "+list[6].getValue());

    }

    public static int add(BinaryTreeNode node) {
        return (int)node.getLeft().getValue() + (int)node.getRight().getValue();
    }
    public static int subtract(BinaryTreeNode node) {
        return (int)node.getLeft().getValue() - (int)node.getRight().getValue();
    }
    public static int multiply(BinaryTreeNode node) {
        return (int)node.getLeft().getValue() * (int)node.getRight().getValue();
    }
    public static int divide(BinaryTreeNode node) {
        return (int)node.getLeft().getValue() / (int)node.getRight().getValue();
    }
    public static int modulus(BinaryTreeNode node) {
        return (int)node.getLeft().getValue() % (int)node.getRight().getValue();
    }


}