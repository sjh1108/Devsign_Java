/* 
    * 2차원 평면에서 두 점으로 이루어진 직사각형 r이 있다. (Ch02_Rect.java 참조)
    * 1. 키보드로부터 점의 좌표를 입력받아 
    * 2. 직사각형 r 내부에 존재하는지, 
    * 3. 직사각형의 선 위에 존재하는지 판별하는 프로그램을 작성하라
 */

//TODO#1: Import Scanenr class
import java.util.Scanner;

public class Main{
    public static Ch02_Rect r = new Ch02_Rect();
    public static void main(String[] args){
        //TODO#2: Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        //TODO#3: Read two integers from the keyboard
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        //TODO#6 Call inRect, onLine method
        boolean inRect = inRect(x, y);
        boolean onLine = onLine(x, y);

        //TODO#7: Print the result
        if(inRect){
            System.out.println("In the rectangle");
        }else if(onLine){
            System.out.println("On the line");
        }

        //TODO#8: Close the Scanner
        scanner.close();
    }

    // TODO#4: Implement inRect method
    public static boolean inRect(int x, int y){
        if(x > r.x1 && x < r.x2 
            && y > r.y1 && y < r.y2){
            return true;
        }else{
            return false;
        }
    }

    // TODO#5: Implement onLine method
    public static boolean onLine(int x, int y){
        if(x == r.x1){
            if(y >= r.y1 && y <= r.y2){
                return true;
            }
        }
        if(x == r.x2){
            if(y >= r.y1 && y <= r.y2){
                return true;
            }
        }
        if(y == r.y1){
            if(x >= r.x1 && x <= r.x2){
                return true;
            }
        }
        if(y == r.y2){
            if(x >= r.x1 && x <= r.x2){
                return true;
            }
        }
        return false;
    }
}