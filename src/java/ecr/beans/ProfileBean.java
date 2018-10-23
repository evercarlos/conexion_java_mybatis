/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecr.beans;

import config.MyBatisUtil;
import ecr.pojos.Profile;
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
    
    public String save(){
        profile.setId(-1);
        SqlSession session= new MyBatisUtil().getSession();
        if(session!=null){
            
        }else{
            
        }
        return "index";
        
    }
  
    public List<Profile> getAll(){
        List<Profile> list_= null;
        SqlSession session= new MyBatisUtil().getSession();
        if(session!=null){
            try{
                session.selectList("Profile.getAll");
            }finally{
                session.close();
            }
        }else{
            System.out.println("ERROR");
        }
        return list_;
        
    }
  
}
