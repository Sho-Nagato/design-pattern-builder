public class HtmlBuilder extends Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        sb.append("-----HTML形式-----\n");
        sb.append(title);
        sb.append("\n");
    }

    @Override
    public void makeString(String str) {
        sb.append(str);
        sb.append("\n");
        sb.append("-----HTML形式-----");
    }

    public String getResult() {
        return sb.toString();
    }
}
