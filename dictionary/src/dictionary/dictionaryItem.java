package dictionary;

/**
 *
 * @author Mark
 */
public class dictionaryItem {
    public String Key;
    public String Value;
    
    public dictionaryItem(String key, String value)
    {
        Key = key;
        Value = value;
    }
    
    public String toString()
    {
        return Key + ": " + Value;
    }
}
