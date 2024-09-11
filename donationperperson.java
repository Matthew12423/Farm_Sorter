package project0semisterlongproject.ideas;
/**
 * Main class being used is donationperperson
 */
public class donationperperson 
{
    private double money;
    private int clothes;
    private int seeds;
    private int other;
    private int groupsize;
/**
 * Method sets the starting/default number to 0.
*/
    public donationperperson()
    {
        this(0,0,0,0,0);
    }
/**
 * Method entries are money, clothes, seeds, others, and groupsize.
 * Each entry is set equal to a certain value/variable in the donations.
 * The donation perr person value is changed from default/starting number 0
 * to the value given in the setall.
 */
    public donationperperson(double money, int clothes, int seeds, int other,int groupsize)
    {
        this.money = money;
        this.clothes = clothes;
        this.seeds = seeds;
        this.other = other;
        this.groupsize = groupsize;
    }
/**
 * Method takes the same entries as the donationsperperson. Said entries are set to
 * a specific value that is retrieved from the get and set entry methods.
 */
    public void setall(double money, int clothes, int seeds, int other, int groupsize)
    {
        this.money = money;
        this.clothes = clothes;
        this.seeds = seeds;
        this.other = other;
        this.groupsize = groupsize;
    }
/**
 * Method grabs the varible for money and returns said value.
*/
    public double getMoney() 
    {
        return money;
    }
/**
 * Sets the money variable equal to the amount donated.
*/
    public void setMoney(double money) 
    {
        this.money = money;
    }
/**
 * Method grabs the varible for the clothes variable and returns said value
 */
    public int getClothes() 
    {
        return clothes;
    }
/**
 * Sets the clothes variable equal to the number of clothes donated by user.
 */
    public void setClothes(int clothes) 
    {
        this.clothes = clothes;
    }
/**
 * Method grabs the varible for seeds and returns said variable.
 */
    public int getSeeds() 
    {
        return seeds;
    }
/**
 * Method sets seed variable to the number of seeds donated by user.
 */
    public void setSeeds(int seeds) 
    {
        this.seeds = seeds;
    }
/**
 * Method grabs the varible for other items or items that do not belong to the other categories
 * and returns said variable
*/
    public int getOther() 
    {
        return other;
    }
/**
 * Method sets other varible equal to the entry for other.
 */
    public void setOther(int other) 
    {
        this.other = other;
    } 
/**
 * Method grabs the varible for groupsize and returns said variable.
 */
    public int getGroupsize() 
    {
        return groupsize;
    }
/**
 * Method sets groupsize variable equal to the entry of groupsize.
 */
    public void setGroupsize(int groupsize) 
    {
        this.groupsize = groupsize;
    }

    @Override
    public String toString() 
    {
        return "[money=" + money + ", clothes=" + clothes + ", seeds=" + seeds + ", other=" + other + ", groupsize=" + groupsize + "]";
    }
/**
 * Method prints the string of 
 */
    public void printString() 
    {
        System.out.println("[money=" + money + ", clothes=" + clothes + ", seeds=" + seeds + ", other=" + other+ ", groupsize=" + groupsize + "]");
    }

}