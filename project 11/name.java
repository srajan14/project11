import java.util.ArrayList;
class name {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>();
        System.out.println(name);
        name.add("raju");
        name.add("ramu");
    System.out.println(name);
    if ((name.isEmpty())) {
        System.out.println("array is empty");
        
    }
    else{
        System.out.println("array is not empty");
    }
    name.add("raju");
    name.add("ramu");
    System.out.println(" the size of array "+name.size());
    }
}