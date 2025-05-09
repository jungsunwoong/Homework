package ch15.sec02.exam03;

import ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> list = new LinkedList<>();

        list.add(new Board("제목1","내용1","글쓴이1"));
        list.add(new Board("제목2","내용2","글쓴이2"));
        list.add(new Board("제목3","내용3","글쓴이3"));
        list.add(new Board("제목4","내용4","글쓴이4"));
        list.add(new Board("제목5","내용5","글쓴이5"));

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        Board board = list.get(2);
        System.out.printf("%s\t%s\t%s",board.getSubject(),board.getContent(),board.getWriter());
        System.out.println();

        for(int i = 0; i<size; i++) {
            Board board2 = list.get(i);
            System.out.printf("%s\t%s\t%s\n",board2.getSubject(),board2.getContent(),board2.getWriter());
        }

        System.out.println();
        list.remove(2);
        list.remove(2);

        for(Board b : list) {
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }


    }
}
