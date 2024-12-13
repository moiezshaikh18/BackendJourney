class Person{
    
    private String name;
    private int age;
    private String id;
    
    
    public Person(String name,int age,String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }
        Person per = (Person) obj;
       return per.name.equals(name) &&
        per.age == age && 
        per.id.equals(id);
    }
    
    public int hashCode(){
        return Objects.hash(name,age,id);
    }
    
    public String toString(){
        return " Name:"+ name+ " Age:"+age+" ID:"+id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getId(){
        return id;
    }
    
    public String setName(String name){
        return name;
    }
    
    public int setAge(int age){
        return age;
    }
    
    public String setId(String id){
        return id;
    }
}




class EqualsExample{
    public static void main (String[] args) {
        Person person = new Person("Moiz",31,"001");
        Person person1 = new Person("Moiz",30,"001");
        
        if(person.equals(person1)){
            System.out.println("equals");
        }else{
            System.out.println("Not equals");
        }
        
        

    }
}




