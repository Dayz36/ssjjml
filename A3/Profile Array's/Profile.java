
public class Profile
{
    private BackEnd backEnd;
    // This could only be a string as we have multiple characters
    private String name;
    // There will be a limited amount of responses on this, so char is the best for
    // this String would also of worked
    private char sex;
    // Byte should be the only one... if someone over 127 is on this app, my hat
    // goes off to them, but you could use any other numerical primitive data type
    private byte age;
    // This could only be a string as we have multiple characters
    private String bio;
    // There will be a limited amount of responses on this, so char is the best for
    // thisString would also of worked
    private char sexualPreference;
    // This could only be a string as we have multiple characters
    // location as a char would not work as there could be so many duplications
    private String location;
    // This could only be a string as we have multiple characters
    private String reason;
    
    public Profile(String name, char sex, byte age, String bio, char sexualPreference, String location, String reason)
    {
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.bio = bio;
	this.sexualPreference = sexualPreference;
	this.location = location;
	this.reason = reason;
    }

    // The set methods
    public void setName(String name)
    {
	this.name = name;
    }

    public void setAge(byte age)
    {
	this.age = age;
    }

    public void setSex(char sex)
    {
	this.sex = sex;
    }

    public void setBio(String bio)
    {
	this.bio = bio;
    }

    public void setSexualP(char sexualPreference)
    {
	this.sexualPreference = sexualPreference;
    }

    public void setLocation(String location)
    {
	this.location = location;
    }

    public void setReason(String reason)
    {
	this.reason = reason;
    }

    // the Get methods
    public String getName()
    {
	return this.name;
    }

    public byte getAge()
    {
	return this.age;
    }

    public char getSex()
    {
	return this.sex;
    }

    public String getBio()
    {
	return this.bio;
    }

    public char getSexualP()
    {
	return this.sexualPreference;
    }

    public String getLocation()
    {
	return this.location;
    }

    public String getReason()
    {
	return this.reason;
    }
}
