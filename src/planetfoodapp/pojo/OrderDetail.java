
package planetfoodapp.pojo;

/**
 *
 * @author Lenovo User
 */
public class OrderDetail {
    private String OrdId;
    private String ProdId;
    private double Quantity;
    private double Cost;

    public String getOrdId() {
        return OrdId;
    }

    public void setOrdId(String OrdId) {
        this.OrdId = OrdId;
    }

    public String getProdId() {
        return ProdId;
    }

    public void setProdId(String ProdId) {
        this.ProdId = ProdId;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double Quantity) {
        this.Quantity = Quantity;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }
   
 }
