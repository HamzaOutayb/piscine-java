public class RegexReplace {
    public static String removeUnits(String s) {
        if (s == null)
            return null;
        boolean cm = s.matches("(\\d+cm)( |$).*");
        boolean euro = s.matches("(\\d+€)( |$).*");
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

        if (username.contains("-") || username.contains(".") || username.contains("_")) {
            StringBuilder maskedUsername = new StringBuilder(username);
            boolean delete = false;
            for (int i = 0; i < maskedUsername.length(); i++) {
                char c = maskedUsername.charAt(i);
                if (delete) {
                    System.err.println(c);
                    maskedUsername.setCharAt(i, '*');
                }
                if (c == '.' || c == '-' || c == '_') {
                delete = true;
                }
            }
            username = maskedUsername.toString();
        } else if (username.length() > 3) {
            StringBuilder maskedUsername = new StringBuilder(username);

            for (int i = 3; i < username.length(); i++) {
                maskedUsername.setCharAt(i, '*');
            }

            username = maskedUsername.toString();
        }
        String domain = slice[1];

        String[] dParts = domain.split("\\.");
        if (dParts.length == 3) {
            domain = "*******." + dParts[1] + ".***";
        } else if (dParts.length == 2) {
            String tld = dParts[1];
            if (tld.equals("com") || tld.equals("org") || tld.equals("net")) {
                domain = "*******." + tld;
            } else {
                domain = "*******.**";
            }
        } else {
            if (dParts.length > 2) {
                domain = "*******." + dParts[1] + ".***";
            } else {
                domain = "*******." + (dParts.length == 1 ? "**" : dParts[dParts.length - 1]);
            }
        }
        return username + "@" + domain;
    }

}