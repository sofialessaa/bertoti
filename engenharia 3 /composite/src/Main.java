public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Item 1");
        Leaf leaf2 = new Leaf("Item 2");
        Leaf leaf3 = new Leaf("Item 3");
      
        Composite composite1 = new Composite("Menu 1");
        composite1.addComponent(leaf1);
        composite1.addComponent(leaf2);
      
        Composite composite2 = new Composite("Menu 2");
        composite2.addComponent(leaf3);
        composite2.addComponent(composite1);

        System.out.println("Estrutura da composição:");
        composite2.operation();
    }
}
