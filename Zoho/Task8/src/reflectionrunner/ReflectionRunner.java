package reflectionrunner;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionRunner
{
	public static void main(String[] a)
	{
		String name;
		int score;
		Scanner input = new Scanner(System.in);
		
		try 
		{
			Class<?> contestDetails = Class.forName("pojo.ContestDetails");

			Constructor<?> defaultConstructor = contestDetails.getDeclaredConstructor();
			Constructor<?> overridenConstructor = contestDetails.getConstructor(String.class, int.class);
			Method getName = contestDetails.getDeclaredMethod("getName");
		
			Method setName = contestDetails.getMethod("setName", String.class);
			
			System.out.println("Calling Default Constructor !");
			Object pojo1 = (Object) defaultConstructor.newInstance();
			System.out.println("Default Constructor Called !");

			System.out.println("Calling Overriden Constructor !");
			System.out.println("Enter Name: ");
			name = input.nextLine();
			System.out.println("Enter Score: ");
			score = input.nextInt();
			input.nextLine();
			
			Object pojo2 = (Object) overridenConstructor.newInstance(name, score);
			System.out.println("Overriden Constructor called !");

			System.out.println("Enter Name to call setName(): ");
			name = input.nextLine();
			setName.invoke(pojo1, name);
			System.out.println("setName() Method has been called !");
			
			String rslt = (String) getName.invoke(pojo1);
			System.out.println("The result of getName() Method:" + rslt);
		} 
		catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |  IllegalArgumentException | InvocationTargetException | IllegalAccessException e) 
		{
			System.out.println(e.getMessage());
		}
	}
}