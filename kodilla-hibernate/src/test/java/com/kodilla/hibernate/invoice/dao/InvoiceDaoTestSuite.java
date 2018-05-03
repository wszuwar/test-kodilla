package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Dao.InvoiceDao;
import com.kodilla.hibernate.invoice.Dao.ItemDao;
import com.kodilla.hibernate.invoice.Dao.ProductDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    ItemDao itemDao;


    @Test
    public void testInoviceDaoSave() {
        //Given
        Product party1 = new Product("party1");
        Product party2 = new Product("party2");

        Item cocaCola = new Item(new BigDecimal(15), 1, new BigDecimal(15));
        Item beef = new Item(new BigDecimal(10), 2, new BigDecimal(20));
        Item chicken = new Item(new BigDecimal(55), 5, new BigDecimal(255));

        party1.getItem().add(cocaCola);
        party1.getItem().add(beef);
        party2.getItem().add(chicken);


        cocaCola.setProduct(party1);
        beef.setProduct(party1);
        chicken.setProduct(party2);


        Invoice invoice = new Invoice("777");
        invoice.getItems().add(cocaCola);
        invoice.getItems().add(chicken);
        invoice.getItems().add(beef);

        chicken.setInvoice(invoice);
        beef.setInvoice(invoice);
        cocaCola.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Assert.assertEquals(id, invoiceDao.findOne(id).getId());

        //CleanUp

        invoiceDao.delete(id);
        productDao.deleteAll();

    }

}
