import java.util.ArrayList;

public class Employee {
    private Integer id;
    private String name;
    private Boolean permament;
    private ArrayList<Address> addresses;
    private ArrayList<Integer> phoneNumbers;
    private ArrayList<String>cities;
    private String role;
    private ArrayList<Property> properties;

    public Employee() {
    }

    public Employee(Integer id, String name, Boolean permament, ArrayList<Address> addresses, ArrayList<Integer> phoneNumbers, ArrayList<String> cities, String role, ArrayList<Property> properties) {
        this.id = id;
        this.name = name;
        this.permament = permament;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
        this.cities = cities;
        this.role = role;
        this.properties = properties;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPermament() {
        return permament;
    }

    public void setPermament(Boolean permament) {
        this.permament = permament;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public ArrayList<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
}
