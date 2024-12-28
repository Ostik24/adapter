package ucu.edu.ua;

public class Company {
    private String name;
    private String description;
    private String logo;

    public Company(String name, String description, String logo) {
        this.name = name;
        this.description = description;
        this.logo = logo;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Company{name='" + name + "', description='" + description + "', logo='" + logo + "'}";
    }
}
