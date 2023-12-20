class string_numeric_check {
    public static void main(String[] args) {
        String s1="ten";
        boolean b=true;
        try {
            int i1=Integer.parseInt(s1);
        } catch (NumberFormatException e) {
            System.out.println(e);
            b=false;
        }
        if (b) {
            System.out.println("Numeric: "+s1);
        }
        else
        {
            System.out.println("Not numeric: "+s1);
        }

    }
}
