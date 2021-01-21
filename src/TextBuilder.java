public class TextBuilder extends Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        sb.append("-----TEXT形式-----\n");
        sb.append(title);
        sb.append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append(str);
        sb.append("\n");
        sb.append("-----TEXT形式-----");
    }

    public String getResult() {
        return sb.toString();
    }
}
