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
    public void addProducts(Productos product){
        products.add(product);
        
    }
    public void removeProducts(Productos product){
        products.remove(product);
    }
    
    public void setProducts(TreeSet<Productos> products) {
        this.products = products;
    }
    
    //Buscador de productos por Rubro
    public TreeSet<Productos> getProductsByCategory(String type){
        TreeSet<Productos> objectsSelectedByCategory = new TreeSet<>();    //Es un tree set que va a guardar los elementos que se recopilen con la categoria indicada
        for(Productos product : products){  //Se busca en los productos guardados 
                       
            if(product.getType().equalsIgnoreCase(type)){  //Cuando el producto tenga la categoria indicada por parametro
             
                objectsSelectedByCategory.add(product); //Le añade al treeSet antes mencionado el producto
            }
        }
        return objectsSelectedByCategory; //Se retorna el tree set con los valores recopilados
    }
    
    
    //Buscador de productos por Rango de precios
    //Buscador de productos por Nombre (Cargando por letra a letra)
   
    //Copié el codigo de Maximo...
    public TreeSet<Productos> browByName(String name){
        TreeSet<Productos> nameLooked = new TreeSet<>();
        
        for (Productos prod: products){
            
            if(prod.getName().toLowerCase().startsWith(name)){
                
                nameLooked.add(prod);
               
            }
        }
        return nameLooked;
    }
    
    public Productos browseByCode(int code) {
        for(Productos itProd: products){
            if(itProd.getCode() == code){
                 return itProd;  
            }
        }
        return null;
    }
    
    public TreeSet<Productos> buscaPrecio (int precioLow, int precioHigh ) {
        TreeSet<Productos> prodPorPrecio = new TreeSet();
        for(Productos itProd : products){
            if(itProd.getPrice() > precioLow && itProd.getPrice() < precioHigh){
                prodPorPrecio.add(itProd);
            }
        }
        return prodPorPrecio;
    }
    
    //Se puede crear un buscador general para los 3 tipos de busqueda
    
    
}
