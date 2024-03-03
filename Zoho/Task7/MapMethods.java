package mapmethods;

import java.util.Map;
import java.util.HashMap;
import utilitymethods.Utility;
import exceptions.InvalidInputException;

public class MapMethods
{
	public <K, V> Map<K, V> createMap()
	{
		return new HashMap<K, V>();
	}
	
	public <K, V> int getSize(Map<K, V> hash) throws InvalidInputException
	{
		Utility.checkNull(hash);
		return hash.size();
	}
	
	public <K, V> void addPairs(Map<K, V> hash, K key, V value) throws InvalidInputException
	{
		Utility.checkNull(hash);
		hash.put(key, value);
	}
	
	public <K, V> boolean isKeyPresent(Map<K, V> hash, K key) throws InvalidInputException
	{
		Utility.checkNull(hash);
		return hash.containsKey(key);
	}
		
	public <K, V> boolean isValuePresent(Map<K, V> hash, V value) throws InvalidInputException
	{
		Utility.checkNull(hash);
		return hash.containsValue(value);
	}
	
	public <K, V> void updateAll(Map<K, V> hash, V value) throws InvalidInputException
	{
		Utility.checkNull(hash);
		for (Map.Entry<K, V> x: hash.entrySet())
		{
			x.setValue(value);
		}
	}
	
	public <K, V> V getValue(Map<K, V> hash, K key) throws InvalidInputException
	{
			return hash.get(key);
	}
	
	public <K, V> V getValueOrDefault(Map<K, V> hash, K key, V value) throws InvalidInputException
	{
			return hash.getOrDefault(key, value);
	}
		
	public <K, V> boolean isKeyValuePresent(Map<K, V> hash, K key, V value) throws InvalidInputException
	{
		V rslt = getValue(hash, key);
		Utility.checkNull(rslt);
		return isKeyPresent(hash, key) && rslt.equals(value);
	}
	
	public <K, V> void removeKey(Map<K, V> hash, K key) throws InvalidInputException
	{
		Utility.checkNull(hash);
		hash.remove(key);
	}
	
	public <K, V> void removeKeyValue(Map<K, V> hash, K key, V value) throws InvalidInputException
	{
		if (isKeyValuePresent(hash, key, value))
		{
			hash.remove(key, value);
		}
	}
	
	public <K, V> void replaceValue(Map<K, V> hash, K key, V value)  throws InvalidInputException
	{
		Utility.checkNull(hash);
        hash.replace(key, value);
    }
	
	public <K, V> void replaceKeyValue(Map<K, V> hash, K key, V value, V newValue) throws InvalidInputException
	{
		if (isKeyValuePresent(hash, key, value))
		{
			hash.replace(key, newValue);
		}
	}

	public <K, V> void copyMap(Map<K, V> hash1, Map<K, V> hash2) throws InvalidInputException
	{
		Utility.checkNull(hash1);
		Utility.checkNull(hash2);
		hash2.putAll(hash1);
		clearMap(hash1);
	}
	
	public <K, V> void clearMap(Map<K, V> hash) throws InvalidInputException
	{
		Utility.checkNull(hash);
		hash.clear();
	}
}
