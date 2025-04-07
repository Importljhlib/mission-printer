package mission.View;

import java.util.Scanner;

public class PrinterView {
    private final Scanner scanner = new Scanner(System.in);

    public void printer_menu() {
        System.out.println("사용할 기능을 입력해주세요. 1) 출력, 2) 잉크 잔량 확인, 3) 잉크 교체, 4) 프로그램 종료");
    }

    public String input_text() {
        System.out.println("출력할 문자를 입력해주세요.");
        return scanner.nextLine();
    }

    public int input_size(){
        System.out.println("용지 크기를 입력해주세요.");
        return Integer.parseInt(scanner.nextLine());
    }

    public void print_ascii_art(String ascii){
        System.out.println(ascii);
    }

    public void print_ink(int ink_amount){
        System.out.println("잉크 잔량 : " + ink_amount + "/1000");
    }

    public void print_message(String message){
        System.out.println(message);
    }
}
