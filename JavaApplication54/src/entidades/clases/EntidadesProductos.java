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
        try{
            
            products.add(product);//Fallaba porque el compare to de la entidad productos, contiene un error al programarlo
            System.out.println("Añadido");
        } catch(Exception e){
            System.out.println("ERROR");
            System.out.println(e.getMessage()); // Hay un error al cargar un producto a la entidad, supuestamente algo de casteo
        }
        
    }
    public void setProducts(TreeSet<Productos> products) {
        this.products = products;
    }
    
    //Buscador de productos por Rubro
    public TreeSet<Productos> getProductsByCategory(String type){
        TreeSet<Productos> objectsSelectedByCategory = new TreeSet<Productos>();    //Es un tree set que va a guardar los elementos que se recopilen con la categoria indicada
        for(Productos product : products){  //Se busca en los productos guardados 
                       
            if(product.getType().equalsIgnoreCase(type)){  //Cuando el producto tenga la categoria indicada por parametro
             
                objectsSelectedByCategory.add(product); //Le añade al treeSet antes mencionado el producto
            }
        }
        return objectsSelectedByCategory; //Se retorna el tree set con los valores recopilados
    }
    
    
    //Buscador de productos por Rango de precios
    //Buscador de productos por Nombre (Cargando por letra a letra)
    //Se puede crear un buscador general para los 3 tipos de busqueda
    
    
}
