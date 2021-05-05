package com.contactsunny.poc.binarytree;

public class App {

    public static void main(String[] args) {

        System.out.println("Adding node 50");
        Node root = new Node(50);
        System.out.println(printTree(root));
        System.out.println("---------------------");

        int[] input = {25, 75, 40, 10, 80, 60};
        for (int element : input) {
            System.out.println("Adding node " + element);
            root.insert(new Node(element));
            System.out.println(printTree(root));
            System.out.println("---------------------");
        }

        System.out.println("Deleting 60");
        root = root.delete(60);
        System.out.println(printTree(root));
        System.out.println("---------------------");

        System.out.println("Deleting 75");
        root = root.delete(75);
        System.out.println(printTree(root));
        System.out.println("---------------------");

        System.out.println("Deleting 50");
        root = root.delete(50);
        System.out.println(printTree(root));
        System.out.println("---------------------");
    }

    public static String printTree(Node root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.getValue());

        String pointerRight = "└──";
        String pointerLeft = (root.getRight() != null) ? "├──" : "└──";

        printTree(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
        printTree(sb, "", pointerRight, root.getRight(), false);

        return sb.toString();
    }

    public static void printTree(StringBuilder sb, String padding, String pointer, Node node, boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

            printTree(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            printTree(sb, paddingForBoth, pointerRight, node.getRight(), false);
        }
    }
}
