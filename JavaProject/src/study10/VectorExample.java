package study10;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();
        list.add(new Board("title", "content", "writer"));
        list.add(new Board("title", "content", "writer"));
        list.add(new Board("title", "content", "writer"));

        list.remove(2);
        for (Board board :
                list) {
            System.out.println(board.content + " " + board.subject + " " + board.writer);
        }

    }
}
