package constructor;

public class Nike extends Brand{
    String name;
    public Nike(String name, String brandType) {
        super(brandType);
        this.name = name;
    }

    public Nike(String name) {
        super("Shoe");
        this.name = name;
    }

    public static void main(String[] args) {
        Nike nike = new Nike("Jordan");
        System.out.println(nike.brandType);
        System.out.println(nike.name);

        nike = new Nike("Snikers", "Nike");
        System.out.println(nike.name);
        System.out.println(nike.brandType);
    }
}