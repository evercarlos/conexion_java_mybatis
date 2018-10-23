/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author EVER CARLOS ROJAS
 */
public class MyBatisUtil {
    private String resource = "ecr.config.pruebaSql.xml";
    private SqlSession session = null;
    
    public SqlSession getSession(){
        try{
            Reader reader= Resources.getResourceAsReader(resource);
            /* obteniendo la conexion */
            SqlSessionFactory sqlMaper= new SqlSessionFactoryBuilder().build(reader);
            session= sqlMaper.openSession();/* abriendo la session*/
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return session;
     }
}
