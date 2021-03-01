package planetfoodapp.pojo;

public class Product {
     private String ProdId;
      private String CatId;
      private String ProdName;
      private Double ProdPrice;
      private String IsActive;

    public String getProdId() {
        return ProdId;
    }

    public void setProdId(String ProdId) {
        this.ProdId = ProdId;
    }

    public String getCatId() {
        return CatId;
    }

    public void setCatId(String CatId) {
        this.CatId = CatId;
    }

    public String getProdName() {
        return ProdName;
    }

    public void setProdName(String ProdName) {
        this.ProdName = ProdName;
    }

    public double getProdPrice() {
        return ProdPrice;
    }

    public void setProdPrice(double ProdPrice) {
        this.ProdPrice = ProdPrice;
    }

    public String getIsActive() {
        return IsActive;
    }

    public void setIsActive(String IsActive) {
        this.IsActive = IsActive;
    }
     
   
}
