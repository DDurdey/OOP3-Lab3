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
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	
	void insert(K key, V value) throws DuplicateKeyException;
=======

	void insert(K key, V value) throws DuplicateKeyException;


  /**
   * This method changes the value stored for a given key.
   * 
   * Preconditions: Make sure the key already exists in the dictionary.
   * Postconditions: If exists then, replace its old value with the new one.
   * 
   * @param key the key for which the value will be updated.
   * @return the value thats with the given key.
   * @throws IllegalArgumentException if the key is not foud.
   */

  void update(K key, V value);




>>>>>>> Stashed changes
}
