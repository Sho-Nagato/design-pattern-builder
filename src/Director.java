public class Director {
    private Builder builder;

    Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.makeTitle("タイトル");
        builder.makeString("文章");
    }
}
