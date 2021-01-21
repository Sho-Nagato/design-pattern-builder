public class Main {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.exit(0);
        }

        if (args[0].equals("text")) {
            // TEXT形式の文章を作成
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());
        } else if (args[0].equals("html")) {
            // HTML形式の文章を作成
            HtmlBuilder htmlBuilder = new HtmlBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            System.out.println(htmlBuilder.getResult());
        } else {
            System.exit(0);
        }
    }
}
