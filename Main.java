/* 
    * 0부터 100까지 숫자를 저장하는 배열을 선언하고,
    * 키보드로 부터 입력을 받아 해당 숫자가 소수인지 판별하는 프로그램을 작성하시오
 */

//TODO#1: Import Scanenr class
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //TODO#2: Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        //TODO#3: 0부터 100까지 숫자를 저장하는 배열 선언
        int[] numbers = new int[101];
        //TODO#4: 사용자로부터 입력을 받아 해당 숫자가 소수인지 판별
        System.out.println("0부터 100까지의 숫자를 입력하세요: ");
        int input = scanner.nextInt();

        //TODO#6: 소수인지 판별하는 메소드 호출 및 결과 출력
        boolean isPrime = isPrime(numbers, input);
        if(isPrime){
            System.out.println(input + "은 소수입니다.");
        }else{
            System.out.println(input + "은 소수가 아닙니다.");
        }

        //TODO#7: Scanner 객체 close
        scanner.close();
    }

    //TODO#5: 소수인지 판별하는 메소드 구현
    public static boolean isPrime(int[] numbers, int input){
        //TODO#5-1: 소수인지 판별하는 로직 구현
        if(input < 2){
            return false;
        }

        boolean flag = true;
        for(int i = 2; i <= Math.sqrt(input); i++){
            if(input % i == 0){
                flag = false;
            }
        }

        return flag;
    }
}