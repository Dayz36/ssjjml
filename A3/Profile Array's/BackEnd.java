import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BackEnd
{ // byte and short would work, but this is to be a global app, unsure by
  // popularity I have made it an int
  // now I have made the below public on purpose. I wish to send it back to the
  // front end as this will give them their password to log into the correct
  // dashboards I either had to break your rule of the back end talking to the
  // front (VIA a getter and setter)
    public int numRecords;
    private int maxNumRecords;
    private Profile[] Profiles;

    public BackEnd()
    {
	this.maxNumRecords = 50;
	this.numRecords = 0;
	this.Profiles = new Profile[this.maxNumRecords];
    }

    public boolean addNewProfile(String name, char sex, byte age, String bio, char sexualPreference, String location,
	    String reason)
    {
	boolean added = false;
	if (this.numRecords < this.maxNumRecords)
	{
	    this.Profiles[this.numRecords] = new Profile(name, sex, age, bio, sexualPreference, location, reason);
	    // +=1 also works
	    this.numRecords++;

	}
	return added;
    }

   
    
    public String[] getAllData(int password)
    {
	// string is the only thing that can return multiple strings
	String[] allData = new String[this.numRecords];
	
	    String currentProfile = "";
	    currentProfile += this.Profiles[password].getName() + "\t";
	    currentProfile += this.Profiles[password].getSex() + "\t";
	    currentProfile += this.Profiles[password].getAge() + "\t";
	    currentProfile += this.Profiles[password].getBio() + "\t";
	    currentProfile += this.Profiles[password].getSexualP() + "\t";
	    currentProfile += this.Profiles[password].getLocation()+ "\t";
	    currentProfile += this.Profiles[password].getReason();
	    // incremental of the counter both of the below would work
	    // i++ && i = i +1
	    allData[password] = currentProfile;
	    
	return allData;
    }
}
