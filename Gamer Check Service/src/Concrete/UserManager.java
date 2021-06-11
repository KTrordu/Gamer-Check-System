package Concrete;

import java.util.ArrayList;
import java.util.Scanner;

import Abstract.IUser;
import Entities.User;

public class UserManager implements IUser{

    CitizenCheckManager citizenCheckManager = new CitizenCheckManager();

    @Override
    public void addUser(User user, ArrayList<User> users) {
        boolean result = citizenCheckManager.checkIfRealPerson(user);

        if(result){
            users.add(user);
        }
        else{
            System.out.println("This is not a real person.");
        }
    }

    @Override
    public void updateUser(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("New Name : ");
        String firstName = scanner.nextLine();

        System.out.print("New Surname : ");
        String lastName = scanner.nextLine();

        System.out.print("New Password : ");
        String password = scanner.nextLine();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);

        System.out.println(user.getFullName() + " has successfully updated.");
    }

    @Override
    public void deleteUser(User user, ArrayList<User> users) {
        users.remove(user);
        System.out.println("User has successfully removed from the system.");
    }

    @Override
    public void register(User user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name : ");
        String firstName = scanner.nextLine();

        System.out.print("Surname : ");
        String lastName = scanner.nextLine();

        System.out.print("Password : ");
        String password = scanner.nextLine();

        System.out.print("Budget : ");
        double budget = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Nationality ID Number : ");
        String nationalityId = scanner.nextLine();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setBudget(budget);
        user.setNationalityId(nationalityId);
    }

}
