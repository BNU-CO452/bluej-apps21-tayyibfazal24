
/**
 * Write a description of class Module here.
 *
 * @author Tayyib Fazal
 * @version 1
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;

    /**
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }
    public String getCode()
    {
        return code; 
    }
    public String getTitle()
    {
        return title;
    }
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    /**
     * This method will print the course details
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + "| " + title + 
                            " Credit:" + credit);
        System.out.println();  
    
    }
}
