package challanges.rank.hacker.problem_solving;
//Complete the pageCount function in the editor below.
//
//pageCount has the following parameter(s):
//
//    int n: the number of pages in the book
//    int p: the page number to turn to
//
//Returns
//
//    int: the minimum number of pages to turn
//
//Input Format
//
//The first line contains an integer n, the number of pages in the book.
//The second line contains an integer, p , the page to turn to.

public class DrawingBook {
    static int pageCount(int n, int p) {
        int howMuchMoves = 0;
        int howMuchMovesBackwards = 0;
        for (int i = 1; i <= n; i += 2) {
            if (i == p || (i - 1) == p) {
                break;
            }
            howMuchMoves++;
        }
        for (int i = n; i >= 1; i -= 2) {
            if (i == p || (i - 1) == p) {
                break;
            }
            howMuchMovesBackwards++;

        }
        System.out.println(Math.min(howMuchMoves, howMuchMovesBackwards));
        return Math.min(howMuchMoves, howMuchMovesBackwards);
    }

    public static void main(String[] args) {
        int n = 6;
        int p = 2;

        pageCount(n, p);
    }
}
