package arraylistmethods;

import java.util.List;
import java.util.ArrayList;
import utilitymethods.Utility;
import exceptions.InvalidInputException;

//Coding to the interface in Java

public class ArrayListMethods
{
	public <E> List<E> createArrayList()
	{
		return new ArrayList<E>();
	}
	
	public <E> int getSize(List<E> list) throws InvalidInputException
	{
		Utility.checkNull(list);
		return list.size();
	}
	
	public <E> List<E> addElement(List<E> list, E element) throws InvalidInputException
	{
		Utility.checkNull(list);
		list.add(element);
		return list;
	}
	
	public <E> int getIndex(List<E> list, E element) throws InvalidInputException
	{
		Utility.checkNull(list);
		return list.indexOf(element);
	}
	
	public <E> E getElement(List<E> list, int index) throws InvalidInputException
	{
		Utility.checkNull(list);
		Utility.checkRequiredLength(index, getSize(list));
		return list.get(index);
	}
	
	public <E> int getLastIndex(List<E> list, E element) throws InvalidInputException
	{
		Utility.checkNull(list);
		return list.lastIndexOf(element);
	}
	
	public <E> List<E> insertElement(List<E> list, int index, E element) throws InvalidInputException
	{
		Utility.checkNull(list);
		list.add(index, element);
		return list;
	}
	
	public <E> List<E> addElementsFromRange(List<E> list1, List<E> list2, int fromIndex, int toIndex) throws InvalidInputException
	{
		Utility.checkNull(list1);
		Utility.checkNull(list2);
		Utility.checkRequiredLength(fromIndex, toIndex);
		Utility.checkRequiredLength(toIndex, getSize(list2) + 1);
		addCollection(list1, list2.subList(fromIndex, toIndex));
		return list1;
	}
	
	public <E> List<E> addCollection(List<E> list1, List<E> list2) throws InvalidInputException
	{
		Utility.checkNull(list1);
		Utility.checkNull(list2);
		list1.addAll(list2);
		return list1;
	}
	
	public <E> List<E> removeElement(List<E> list, E element) throws InvalidInputException
	{
		Utility.checkNull(list);
		list.remove(element);
		return list;
	}
	
	public <E> List<E> removeElementsFrom(List<E> list1, List<E> list2) throws InvalidInputException
	{
		Utility.checkNull(list1);
		Utility.checkNull(list2);
		list1.removeAll(list2);
		return list1;
	}
	
	public <E> List<E> retainElementsFrom(List<E> list1, List<E> list2) throws InvalidInputException
	{
		Utility.checkNull(list2);
		Utility.checkNull(list1);
		list1.retainAll(list2);
		return list1;
	}
	
	public <E> List<E> removeAllElements(List<E> list) throws InvalidInputException
	{
		Utility.checkNull(list);
		list.clear();
		return list;
	}
	
	public <E> boolean isPresent(List<E> list, E element) throws InvalidInputException
	{
		Utility.checkNull(list);
		return list.contains(element);
	}
}
