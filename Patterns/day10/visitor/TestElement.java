package day10.visitor;

public class TestElement implements DocumentElement {

    private String content;

    public TestElement(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
