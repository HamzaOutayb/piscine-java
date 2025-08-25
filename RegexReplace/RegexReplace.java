public class RegexReplace {
    public static String removeUnits(String s) {
        if (s == null)
            return null;
        boolean cm = s.matches("(\\d+cm)( |$).*");
        boolean euro = s.matches("(\\d+€)( |$).*");
        // System.out.println(cm);
        if (cm) {
            s = s.replaceAll("cm", "");
        }
        if (euro) {
            s = s.replaceAll("€", "");
        }
        return s;
    }

    public static String obfuscateEmail(String s) {
        String[] slice = s.split("@");
        String username = slice[0];
        String[] otherpart = (slice[1]).split("\\.");
        if (username.length() > 3) {
            StringBuilder maskedUsername = new StringBuilder(username);

            for (int i = 3; i < username.length(); i++) {
                maskedUsername.setCharAt(i, '*');
            }
            username = maskedUsername.toString();
        }

        if (otherpart.length == 2) {
            for (int i = 0; i < otherpart.length; i++) {
                
                StringBuilder domain = new StringBuilder(otherpart[i]);
                     if (i == otherpart.length-1 && otherpart[i].equals("com") || otherpart[i].equals(".org") || otherpart[i].equals(".net")){
                        continue;
                    }
                for (int j = 0; j < domain.length(); j++) {
                    domain.setCharAt(j, '*');
                }
                otherpart[i] = domain.toString();
            }
        } else if (otherpart.length == 3) {
            for (int i = 0; i < otherpart.length; i++) {
                StringBuilder domain = new StringBuilder(otherpart[i]);
                if (i != 1) {
                    if (i == otherpart.length-1 && otherpart[i].equals("com") || otherpart[i].equals(".org") || otherpart[i].equals(".net")){
                        continue;
                    }
                for (int j = 0; j < domain.length(); j++) {
                        domain.setCharAt(j, '*');
                    }
                }
                    otherpart[i] = domain.toString();
            }
        }
        return username + "@" + String.join(".", otherpart);
    }
}