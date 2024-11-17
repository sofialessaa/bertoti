class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component) {
        children.add(component);
    }

    public void removeComponent(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public void operation() {
        System.out.println("Composite: " + name);
        for (Component child : children) {
            child.operation();
        }
    }
}
