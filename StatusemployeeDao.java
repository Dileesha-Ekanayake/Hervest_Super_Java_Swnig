import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StatusemployeeDao{

    public static Statusemployee getById(int id){

        Statusemployee statusemployee = new Statusemployee();

        try {

            String qry = "Select * from statusemployee where id ="+id;
            ResultSet rslt = CommonDao.get(qry);
            

            rslt.next();
            statusemployee.setId(rslt.getInt("id"));
            statusemployee.setName( rslt.getObject("name").toString() );   
        }
            
        catch(SQLException e){
            System.out.println("Can't Connect as : "+ e.getMessage());
        
        }
        return statusemployee;

    }
    
    public static List<Statusemployee> getAll(){

        List<Statusemployee> statusemployees = new ArrayList();

        try {

            String qry = "Select * from statusemployee";
            ResultSet rslt = CommonDao.get(qry);
            
            while(rslt.next()){
                Statusemployee statusemployee = new Statusemployee();

                statusemployee.setId(rslt.getInt("id"));
                statusemployee.setName( rslt.getObject("name").toString() ); 

                statusemployees.add(statusemployee);

            }  

        }

        catch(SQLException e){
            System.out.println("Can't Connect as : "+ e.getMessage());
            
        }
        return statusemployees;

    }

}