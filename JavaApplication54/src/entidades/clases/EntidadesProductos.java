package entidades.clases;

import clases.principal.Productos;
import java.util.TreeSet;

public class EntidadesProductos {

    TreeSet<Productos> products;

    public EntidadesProductos() {
        this.products = new TreeSet();
    }

    public EntidadesProductos(TreeSet<Productos> products) {
        this.products = products;
    }

    public TreeSet<Productos> getProducts() {
        return products;
    }

    public void setProducts(TreeSet<Productos> products) {
        this.products = products;
    }
    
    //Buscador de productos por Rubro
    public Productos getProductsByCategory(String type){
        for(Productos product : products){
            if(product.getType() == type){
                return product;
            }
        }
        return null;
    }
    //Buscador de productos por Rango de precios
    //Buscador de productos por Nombre (Cargando por letra a letra)
    //Se puede crear un buscador general para los 3 tipos de busqueda
    
    
}
