package lk.dmg.cache_demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "product")
public class Product implements Serializable {
    private Integer idproduct;
    private String price;
    private String name;

    @Id
    public Integer getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Integer idproduct) {
        this.idproduct = idproduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(idproduct, product.idproduct) &&
                Objects.equals(price, product.price) &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idproduct, price, name);
    }
}
