/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecr.data;
import ecr.pojos.Profile;
import java.util.List;

/**
 *
 * @author EVER CARLOS ROJAS
 */
public interface ProfileMapper {
 List<Profile>getAll();
 void insertCreate(Profile profile);
}
