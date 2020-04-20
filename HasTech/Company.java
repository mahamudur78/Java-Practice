package HasTech;

public class Company {
  private String companyName, companyAddress;
  Company(){
  
  }
  Company(String companyName, String companyAddress){
      this.companyName = companyName;
      this.companyAddress = companyAddress;
  }
    
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    
    public String getCompanyName(){
        return companyName;
    }
    
    public void setcompanyAddress(String companyAddress){
        this.companyAddress =  companyAddress;
    }
    
    public String getcompanyAddress(){
        return companyAddress;
    }
    
    public void companyInfoDisplay(){
        System.out.println(companyName);
        System.out.println(companyAddress);
    }
            
}
