public class TimeCalc {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java TimeCalc1 <hh:mm> <minutesToAdd>");
            return;
        }

        String time = args[0];        
        int minutesToAdd = Integer.parseInt(args[1]); 

        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = totalMinutes / 60;

        int newHours = totalHours % 24;               
        int newMinutes = totalMinutes % 60; 

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Minutes to add: " + minutesToAdd);
        System.out.println("New hours: " + newHours);
        System.out.println("New minutes: " + newMinutes);
    }
}
