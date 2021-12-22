import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManager humanManager = new HumanManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Thêm một người");
            System.out.println("2. Sửa một ngưởi theo tên");
            System.out.println("3. Xóa một người theo tên");
            System.out.println("4. Hiển thị tất cả người");
            System.out.println("5. Hiển thị tất theo giới tính");
            System.out.println("7. Hiển thị tất cả người dưới 20 tuổi");
            System.out.println("8. Hiển thị tất cả người theo tên nhập vào");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Human human = humanManager.createHuman(scanner);
                    System.out.println();
                    humanManager.addHuman(human);
                    break;
                case 2:
                    System.out.println("Nhập vào tên muốn sửa");
                    String name = scanner.nextLine();
                    System.out.println(humanManager.humanUpdate(name));
                    break;
                case 3:
                    System.out.println("Nhập vào tên muốn xóa");
                    String nameDelete = scanner.nextLine();
                    System.out.println(humanManager.humanUpdate(nameDelete));
                    break;
                case 4:
                    humanManager.displayAllHuman();
                    break;
                case 5:
                    System.out.println("Nhập giới tính muốn hiện");
                    String gen = scanner.nextLine();
                   humanManager.displayByGender(gen);
                    break;
                case 6:
                    humanManager.displayByAge();
                    break;
                case 7:
                    System.out.println("Nhập vào tên muốn hiển thị");
                    String nameDisplay = scanner.nextLine();
                    ArrayList<Human> humans = new ArrayList<>();
                    System.out.println(humanManager.displayByName(nameDisplay));
                    break;
            }
        }while (choice!=0);
    }
}
