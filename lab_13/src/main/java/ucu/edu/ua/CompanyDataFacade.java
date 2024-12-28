package ucu.edu.ua;

public class CompanyDataFacade {
    private final PDLReader pdlReader;
    private final WebScrapingReader webScrapingReader;
    private final BrandfetchReader brandfetchReader;

    public CompanyDataFacade() {
        this.pdlReader = new PDLReader();
        this.webScrapingReader = new WebScrapingReader();
        this.brandfetchReader = new BrandfetchReader();
    }

    public Company getCompanyInfo(String website) {
        String jsonResponse = pdlReader.getCompanyData(website);
        String name = pdlReader.parseCompanyName(jsonResponse);
        String description = webScrapingReader.fetchDescription(website);
        String logo = brandfetchReader.getLogo(website);

        return new Company(name, description, logo);
    }
}
