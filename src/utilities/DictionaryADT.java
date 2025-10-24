package utilities;

/**
 * DictionaryADT.java
 *
 * @author your name
 * @version major.minor revision number starting at 1.0	
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

      void update(K key, V value);

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


}
