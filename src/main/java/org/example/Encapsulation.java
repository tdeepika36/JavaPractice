class Demo{
    private String name;
    private int id;
    Demo(int id){
        this.id=id;
        System.out.println(id);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
}
class Encapsulation{
    public static void main(String args[])
    {
        Demo obj=new Demo(5);
        obj.setName("Java");
        System.out.println(obj.getName());
    }
}