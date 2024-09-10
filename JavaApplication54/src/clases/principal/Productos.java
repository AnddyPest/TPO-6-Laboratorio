package clases.principal;

import java.util.Objects;

public class Productos implements Comparable<Productos>{
    
    static int variableIncrement = 0; // variable estatica para darle a cada producto creado un ID unico
    int code;
    String name;
    String brand;
    String type;
    double price;
    int stock;
    
    public Productos(){
        variableIncrement++;
        this.code = variableIncrement;
    }

    public Productos(String name, String brand, String type, double price, int stock) {
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.stock = stock;
    }
    
    

    public int getCode() {
        return code;
    }  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.code;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + Objects.hashCode(this.brand);
        hash = 31 * hash + Objects.hashCode(this.type);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 31 * hash + this.stock;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Productos other = (Productos) obj;
        if (this.code == other.code) {
            return true;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.brand, other.brand)) {
            return false;
        }
        return Objects.equals(this.type, other.type);
    }

    
        //Este compare no me permitia añadir un objeto al tree set
//    @Override
//    public int compareTo(Integer o) {
//        return o.compareTo(code);
//    }
    @Override
    public int compareTo(Productos o) {
        return Integer.compare(code,o.getCode());
    }

    @Override
    public String toString() {
        return "Productos{" + "code=" + code + ", name=" + name + ", brand=" + brand + ", type=" + type + ", price=" + price + ", stock=" + stock + '}';
    }

}