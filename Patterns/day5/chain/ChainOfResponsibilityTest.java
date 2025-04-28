package day5.chain;

public class ChainOfResponsibilityTest {
    public static void main(String[] args) {
        Handler level1  = new Level1Support();
        Handler level2  = new Level2Support();
        Handler level3  = new Level3Support();

        level1.setNext(level2);
        level2.setNext(level3);

        level1.handleRequest(1);
        level1.handleRequest(2);
        level1.handleRequest(3);
        level1.handleRequest(4);


    }

}
