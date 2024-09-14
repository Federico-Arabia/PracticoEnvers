package Main;

import Entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-unit");

        EntityManager em = emf.createEntityManager();


        try {

            em.getTransaction().begin();

           /* Factura factura1 = Factura.builder().build();

            factura1.setFecha("05/05/2002");
            factura1.setNumero(55);

            Domicilio domicilio = Domicilio.builder()
                    .nombreCalle("Viamonte")
                    .numero(322)
                    .build();
            Cliente cliente1 = Cliente.builder()
                    .nombre("Federico")
                    .apellido("Arabia")
                    .dni(44185937)
                    .build();
            cliente1.setDomicilio(domicilio);
            factura1.setCliente(cliente1);

            Categoria Panaderia = Categoria.builder()
                    .denominacion("Panaderia")
                    .build();
            Categoria Limpieza = Categoria.builder()
                    .denominacion("Limpieza")
                    .build();


            Articulo art1 = Articulo.builder()
                    .cantidad(500)
                    .denominacion("Pan Lactal")
                    .precio(1875)
                    .build();
            Articulo art2 = Articulo.builder()
                    .cantidad(500)
                    .denominacion("Magistral")
                    .precio(2500)
                    .build();

            art1.getCategorias().add(Panaderia);
            art2.getCategorias().add(Limpieza);
            Limpieza.getArticulos().add(art2);
            Panaderia.getArticulos().add(art1);


            DetalleFactura detalle1 = DetalleFactura.builder().build();

            detalle1.setArticulo(art1);
            detalle1.setCantidad(20);
            detalle1.setSubTotal(80);

            //art1.getDetalles().add(detalle1);
            factura1.getDetalles().add(detalle1);
            //detalle1.setFactura(factura1);

            DetalleFactura detalle2 = DetalleFactura.builder().build();

            detalle2.setArticulo(art2);
            detalle2.setCantidad(54);
            detalle2.setSubTotal(157);

            //art2.getDetalles().add(detalle2);
            factura1.getDetalles().add(detalle2);
            //detalle2.setFactura(factura1);

            factura1.setTotal(120);


            */
            Factura factura1=em.find(Factura.class, 1L);
            //factura1.setNumero(667);

            em.persist(factura1);

            em.flush();

            em.getTransaction().commit();

        } catch (Exception e) {

            em.getTransaction().rollback();

        }
        em.close();
        emf.close();
    }
}