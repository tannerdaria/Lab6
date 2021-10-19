class Main {
  public static void main(String[] args) {
    Tree tree1 = new Tree();
    tree1.print();

    System.out.println("\n\n");

    Tree tree2 = new Tree();
    tree2.setName("maple");
    tree2.setType("broadleaf");
    tree2.setFall(true);
    tree2.setColor("red");
    tree2.print();

    System.out.println("\n\n");

    tree1.setName("spruce");
    tree1.setType("conifer");
    tree1.print();
  }
}