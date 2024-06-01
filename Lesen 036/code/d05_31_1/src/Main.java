public class Main {
    public static void main(String[] args) {
        BuilderExample builderExample = new BuilderExample.Builder(1, 2)
                .param5(5)
                .param4(4)
                .build();


        System.out.println(builderExample);

        Item item1 = new Item.Builder("Jeans", 59.99)
                .size("M")
                .color("blue")
                .brand("Wrangler")
                .oneComponent("cotton-75%")
                .oneComponent("elastane-25%")
                .build();
        Item item2 = new Item.Builder("Butter", 2.90)
                .weight(250)
                .dateExpire("20.06.2024")
                .oneComponent("cream - 60%")
                .oneComponent("milk - 40%")
                .build();


        System.out.println(item1);
        System.out.println(item2);
    }
}