public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        String name_tr = name.trim();
        int count = 0;

        for (int i =0; i < name_tr.length(); i++ ) {
            if (Character.toString(name_tr.charAt(i)).equals(" ")) {
                count ++;
            }
        }

        return name_tr.length() >= 3 & name_tr.length() < 19 & count == 1;
    }
}
