import java.util.ArrayList;
import java.util.Scanner;

public class HumanManager {
    private ArrayList<Human> humans;
    private Scanner scanner = new Scanner(System.in);

    public HumanManager() {
        this.humans = new ArrayList<>();
    }

    public void displayAllHuman() {
        for (Human h : humans) {
            System.out.println(h);
        }
    }

    public void addHuman(Human human) {
        humans.add(human);
    }

    public Human humanUpdate(String name) {
        Human humanUpdate = null;
        for (Human human : humans) {
            if (human.getName() == name) {
                humanUpdate = human;
                break;
            }
        }
        if (humanUpdate != null) {
            System.out.println("Nhập tên mới: ");
            String n = scanner.nextLine();
            humanUpdate.setName(n);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            humanUpdate.setAge(age);
            System.out.println("Nhập giới tính mới: ");
            String gen = scanner.nextLine();
            humanUpdate.setGender(gen);
            return humanUpdate;
        }
        return null;
    }

    public ArrayList<Human> displayByName(String name) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getName().equals(name)) {
                human.add(h);
            }
        }
        return human;

    }

    public ArrayList<Human> displayByGender(String gender) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {

            if (h.getGender().equals(gender)) {
                human.add(h);
            }
        }
        return human;
    }

    public ArrayList<Human> displayByAge() {

        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getAge() < 20) {
                human.add(h);
            }
        }
        return human;
    }

    public Human createHuman(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi ");
        int age = scanner.nextInt();
        System.out.println("Nhập vào giới tính: ");
        String gen = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        String add = scanner.nextLine();
        return new Human(name, age, gen, add);

    }

}
