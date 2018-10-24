/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecr.beans;

import config.MyBatisUtil;
import ecr.pojos.Profile;
import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
/*import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped*/
public class ProfileBean {

  private  Profile profile;
  
  public ProfileBean(){
      profile = new Profile();
  }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    
    public String create(HashMap data){ /* averiguar sin hash */
        profile.setId(-1);/*cuando una table es autoincremental o serial*/
        SqlSession session= new MyBatisUtil().getSession();
        if(session!=null){
            try{
             session.insert("Profile.insertCreate",data);
             session.commit();
            }finally{
                session.close();
            }
        }else{
            System.out.println("ERROR");
        }
        
        return "index";
        
    }
  
    public List<Profile> getAll(HashMap params_){
        List<Profile> list_= null;
        SqlSession session= new MyBatisUtil().getSession();
        if(session!=null){
            try{
                list_=session.selectList("Profile.getAll",params_);
            }finally{
                session.close();
            }
        }else{
            System.out.println("ERROR");
        }
        return list_;
        
    }
    
      public Integer getCount(String q) {
        SqlSession session = new MyBatisUtil().getSession();
        HashMap hm = new HashMap();
        hm.put("c", q);
        try {
            return (int) session.selectOne("Profile.getCount", hm);
        } finally {
            session.close();
        }
    }
  
}
