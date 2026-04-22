class string {
    public static void main(String[] args) {
    //     String str = "Hellooouuuuu";
    //     System.out.println(str);

    // //! DEFAULT CONSTRUCTOR
    //     String obj = new String();
    //     System.out.println(obj);

    // //! PARAMETERIZED CONSTRUCTOR
    //     String o1 = new String("Hello");
    //     System.out.println(o1);
    
    // //! COPY CONSTRUCTOR
    //     String o2 = new String(o1);
    //     System.out.println(o2);


    //     char arr[] = {'j', 'a', 'v', 'a'};
    //     String o3 = new String(arr);
    //     System.out.println(o3);

    //     byte b[] = {65,66,67};
    //     String o4 = new String(b);
    //     System.out.println(o4);



    //! STRING METHODS

    // String str = "   Hellouuu   ";
    // String str2 = "World";
    // System.out.println(str.length());
    // System.out.println(str.charAt(0));
    // System.out.println(str.isBlank());
    // System.out.println(str.isEmpty());
    // System.out.println(str.startsWith("H"));
    // System.out.println(str.endsWith("o"));
    // System.out.println(str.equals(str2));
    // System.out.println(str.equalsIgnoreCase(str2));
    // System.out.println(str.indexOf('e'));
    // System.out.println(str);
    // System.out.println(str.trim());
    

    //? STRING BUILDER

    StringBuilder str = new StringBuilder("Hello");
    System.out.println(str);
    str.append("123");
    System.out.println(str);
    str.replace(0, 0, null);
    System.out.println(str);
    
    }

}
