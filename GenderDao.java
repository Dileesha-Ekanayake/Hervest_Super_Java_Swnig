import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GenderDao{

    public static Gender getById(int id){

        Gender gender = new Gender();

        try {

            String qry = "Select * from gender where id ="+id;
            ResultSet rslt = CommonDao.get(qry);
            
            rslt.next();
                gender.setId(rslt.getInt("id"));
                gender.setName( rslt.getObject("name").toString() );   
        }
            
        catch(SQLException e){
            System.out.println("Can't Connect as : "+ e.getMessage());
        
        }
        return gender;

    }   

    public static List<Gender> getAll(){

        List<Gender> genders = new ArrayList();

        try {

            String qry = "Select * from gender";
            ResultSet rslt = CommonDao.get(qry);
            
            while(rslt.next()){
                Gender gender = new Gender();

                gender.setId(rslt.getInt("id"));
                gender.setName( rslt.getObject("name").toString() ); 

                genders.add(gender);

            }  

        }

        catch(SQLException e){
            System.out.println("Can't Connect as : "+ e.getMessage());
            
        }
        return genders;

        

    }

}
    




