package basic._1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student st1 = new Student("abc", "123");
		Student st2 = new Student("def", "456");
		Student st3 = new Student("ghi", "789");
		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("continue? y/n");
		
		while (true) {
			String input = scan.next();
			if ("y".equals(input)) {
				System.out.println("start");
				String name = scan.next();
				boolean flag = false;
				
				for (Student stu: list) {
					if (stu.getName().equals(name)) {
						System.out.println("name:"+stu.getName()+"; no:"+stu.getNo());
						flag = true;
					}
				}
				
				if (!flag) {
					System.out.println("not exist");
				}
				
				System.out.println("continue? y/n");
				
			}
			else if ("n".equals(input)) {
				
				scan.close();
				break;
			}
		}
		
		
	}
}
