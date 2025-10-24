package utilities;

import exceptions.DuplicateKeyException;
import exceptions.KeyNotFoundException;

/**
 * DictionaryADT.java
 *
 * @author Daniel Durdey
 * @author Lyub Striletskyy
 * @author Edwin Wong
 * @author
 * 
 * @version 1.0
 * 
 * <p>
 * The <code>DictionaryADT</code> interface is designed to be used as a basis for 
 * the Dictionary data structure that will be developed in the CPRG304 F2025 class
 * at SAIT. 
 * </p>
 * 
 * @param <K,V> The key-value pairs this list holds.
 */

public interface DictionaryADT<K,V>
{
	/**
	 * Inserts a new key and value into the dictionary
	 * 
	 * Preconditions:
	 * 	key cannot be null and cannot exist in the dictionary already
	 * 	value cannot be null
	 * 
	 * Postconditions:
	 * 	The new key and value pair are now in the dictionary
	 * 
	 * @param key - must be a unique key
	 * @param value - the value to be paired with the key
	 * @throws DuplicateKeyException - for if the key already exists in the dictionary
	 */
	
	void insert(K key, V value) throws DuplicateKeyException;

	
	/**
     * Removes a key and its associated value from the dictionary
     * 
     * Preconditions:
     * 	key cannot be null
     * 	key must exist in the dictionary
     * 
     * Postconditions:
     * 	The key and value pair are removed from the dictionary
     * 	The size of the dictionary is decreased by one
     * 
     * @param key - the key to be removed from the dictionary
     * @return the value that was associated with the removed key
     * @throws KeyNotFoundException - for if the key does not exist in the dictionary
     */
    V remove(K key) throws KeyNotFoundException;
}
