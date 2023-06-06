public class Statusemployee{

    private int id;
    private String name;

    Statusemployee(){ }

    public void setId(int id){ this.id = id; }
    public int getId(){ return id; }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    @Override
    public String toString(){
        return name;
    }

    public boolean equals(Statusemployee obj){
        return obj.id==this.id;
    }
        
}