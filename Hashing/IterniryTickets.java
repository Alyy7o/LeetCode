import java.util.HashMap;

class IteniryTicket{
    public static String start(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            revMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Banglore"); 
        tickets.put("Bombay", "Delhi"); 
        tickets.put("Goa", "Chennai"); 
        tickets.put("Delhi", "Goa"); 

        String start = start(tickets);

        while(tickets.containsKey(start)){
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.print(start);

    }
}