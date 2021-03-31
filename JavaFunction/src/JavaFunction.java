public class JavaFunction {

    /*public boolean matches(String text, String regex) {
  return Pattern.compile(regex).matcher(text).matches();*/
 public static void main (String [] args){

            String text = "Time doesn’t heal wounds\n" +
                    "to make you forget.\n" +
                    "It doesn’t heal wounds to\n" +
                    "erase the memories.\n" +
                    "Time leaves you with a scar\n" +
                    "to remind you of how you fought through it.\n" +
                    "Time leaves you with a scar\n" +
                    "to remind you of how you bled\n" +
                    "\n" +
                    "and how you survived.\n" +
                    "\n" +
                    "You survived.";
            String regex = "You survived";

            System.out.println(matches(text,regex));


        }
        public static boolean matches(String text, String regex){

            if (text.contains(regex)){
                return true;
            }else
                return false;
        }

    }

