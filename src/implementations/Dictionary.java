package implementations;

import java.util.ArrayList;
import exceptions.DuplicateKeyException;

import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;
	
	public Dictionary () {
		keys = new ArrayList<>();
		values = new ArrayList<>();
	}

	// constructor with initial size
	public Dictionary(int size) {
		int cap = size > 0 ? size : DEFAULT_SIZE;
		keys = new ArrayList<>(cap);
		values = new ArrayList<>(cap);
	}
	
	@Override
	public void create(int size) {
		int cap = size > 0 ? size : DEFAULT_SIZE;
		keys = new ArrayList<>(cap);
		values = new ArrayList<>(cap);
	}
	
	@Override
	public boolean insert(K key,V value) throws DuplicateKeyException {
		if (key == null || value == null)
			throw new IllegalArgumentException("Key and Value must contain values!");
		if (keys.contains(key))
			throw new DuplicateKeyException("Duplicate Key: " + key.toString());
		
		keys.add(key);
		values.add(value);
		return true;
	}


	@Override
    public V remove(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null!");
            
        int index = keys.indexOf(key);
        if (index == -1)
            return null;
            
        keys.remove(index);
        return values.remove(index);
    }


	public int size() {
        return keys.size();
    }
    
    public boolean isEmpty() {
        return keys.isEmpty();
    }
    
    @Override
    public boolean update(K key, V value) {
        if (key == null || value == null)
            throw new IllegalArgumentException("Key and Value must contain values!");
        int index = keys.indexOf(key);
        if (index == -1)
            return false;
        values.set(index, value);
        return true;
    }
    
    @Override
    public V lookup(K key) {
        if (key == null)
            throw new IllegalArgumentException("Key cannot be null!");
        int index = keys.indexOf(key);
        if (index == -1)
            return null;
        return values.get(index);
    }
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (int i = 0; i < keys.size(); i++) {
			sb.append(keys.get(i)).append("=").append(values.get(i));
			if (i < keys.size() - 1)
				sb.append(", ");
		}
		
		sb.append("}");
		return sb.toString();
	}
}