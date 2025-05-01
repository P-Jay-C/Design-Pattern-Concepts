package day8.momento;

public class TextDocument {

    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Momento save() {
        return new Momento(content);
    }

    public void restore(Momento momento) {
        this.content = momento.getContent();
    }

}
