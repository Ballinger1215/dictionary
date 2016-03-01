package dictionary;

/**
 *
 * @author Mark
 */
public class Dictionary {

    dictionaryItem[] Items = new dictionaryItem[10];
    int numItems = 0;
    
    public static void main(String[] args) {
        
        Dictionary dictionary = new Dictionary();
        dictionary.add(new dictionaryItem("scop", "an old enlgish bard"));
        dictionary.add(new dictionaryItem("fragile", "easy to break"));
        dictionary.add(new dictionaryItem("Abibliophobia", "The fear of running out of reading material."));
        dictionary.add(new dictionaryItem("Batrachomyomachy", "Making a mountain out of a molehill."));
        System.out.println(dictionary);
        dictionary.remove("scop");
        System.out.println(dictionary);
        //dictionary.removeAll();

    }
    
    public String toString()
    {
        String str = "";
        for(int i = 0; i < numItems; i++)
        {
            str = str + Items[i] + "\n";
        }
        return str;
    }
    
    void add(dictionaryItem item){
        if(numItems == 10)
        {
            System.out.println("Dictionary is full");
        }
        
        Items[numItems] = item;
        numItems++;
        
    }
    
    void remove(String Key){
        for(int i = 0; i < numItems; i++)
            if(Items[i].Key == Key)
            {
                //clear out the item at the location of Key
                Items[i] = null;
                
                //move everything up
                for(int j = i; j < numItems-1; j++){
                    Items[j] = Items[j+1];
                }
                //get rid of one of the number of items
                numItems--;
                
                //were done so exit
                return;
            }
        //if we reach here, we did not find the key
        System.out.println("Tried to remove. Could not find the key: "+ Key + "\n");
    }
    
    String getValue(String Key){
        for(int i = 0; i < numItems; i++)
            if(Items[i].Key == Key)
            {
                return Items[i].Value;
            }
        return "Could not find value for key: " + Key;
    }
    
    void removeAll(String Key){
        for(int i = 0; i < numItems; i++)
        {
            Items[i] = null;
        }
        
        numItems = 0;
        
        System.out.println("Deleted all the items");
    }
    
    
}
