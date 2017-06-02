package mybatis.service;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import java23.mybatis.infc.IServiceBook;
import java23.mybatis.model.ModelBook;

import static org.junit.Assert.*;

public class ServiceBookTest {

    private static IServiceBook service =null;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
               
        try {
         // classpath를 이용한 설정 파일 로딩 
            ApplicationContext context = new ClassPathXmlApplicationContext("java23/mybatis/ApplicationContext.xml");
                    
        // file을 이용한 설정 파일 로딩
        // java.io.File log4jfile = new java.io.File("file:src/main/resources/ApplicationContext.xml");
                    //ApplicationContext context = new
        //                  ClassPathXmlApplicationContext(log4jfile.getAbsolutePath());
            
          service =context.getBean("servicebook",IServiceBook.class);
            
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
     }

    @Test
    public void selectAll() throws Exception {
        ModelBook book=new ModelBook();
        List<ModelBook> result= service.SelectAll(book);
        assertSame(result.size(),4);

    }
    
    @Test
    public void selectLike() throws Exception {
        ModelBook book=new ModelBook();
        book.setBookname("SQL");
        List<ModelBook> result =service.SelectLike(book);
        assertSame(result.size(),2);
    }

    @Test
    public void selectEqual() throws Exception {
        ModelBook book=new ModelBook();
        book.setBookname("First SQL");
        List<ModelBook> result= service.SelectEqual(book);
        assertSame(result.size(),1);
    }

    @Test
    public void getMaxbookid() throws Exception {

    }

    @Test
    public void getCount() throws Exception {

    }

    @Test
    public void Insert() throws Exception {
        ModelBook book=new ModelBook();
        book.setBookname("test");
        int result= service.Insert(book);
        assertSame(result, 1);
        }

    @Test
    public void update() throws Exception {
        ModelBook wherebook=new ModelBook();
        wherebook.setBookname("test");
        
        ModelBook setbook=new ModelBook();
        setbook.setBookname("test.20170525");
        
        int result=service.Update(wherebook,setbook);
    }

    @Test
    public void delete() throws Exception {
        ModelBook book=new ModelBook();
        book.setBookname("test");
        int result=service.Delete(book);
        assertSame(result, 1);
    }

    @Test
    public void selectDynamic() throws Exception {

    }

}