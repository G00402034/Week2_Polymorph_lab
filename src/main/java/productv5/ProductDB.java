package productv5;

public class ProductDB {

    public static Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java"))
        {
           Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            p = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            p = myBook;
        }


        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            p = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            p = mySoftware;
        }

        if (productCode.equalsIgnoreCase("running away")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Running Away");
            myMusic.setPrice(12.40);
            myMusic.setArtist("John Paul");
            myMusic.setLabel("Warner Brothers");
            p =  myMusic;
        } else if (productCode.equalsIgnoreCase("boomerang")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("boomerang");
            myMusic.setPrice(11.40);
            myMusic.setArtist("sean johnstone");
            myMusic.setLabel("Atlantic records");
            p =  myMusic;
        } else if (productCode.equalsIgnoreCase("jeepers")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("jeepers");
            myMusic.setPrice(10.40);
            myMusic.setArtist("Paul Johnstone");
            myMusic.setLabel("DDG");
            p =  myMusic;
        }

        if (productCode.equalsIgnoreCase("Samsung")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Samsung t12");
            myTv.setPrice(1500);
            myTv.setScreen_size(56);
            myTv.setManufacturer("Samsung");
            p = myTv;
        } else if (productCode.equalsIgnoreCase("LG")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("LG supersonic");
            myTv.setPrice(1240);
            myTv.setScreen_size(12);
            myTv.setManufacturer("LG");
            p = myTv;
        } else if (productCode.equalsIgnoreCase("Panasonic")) {
            Tv myTv = new Tv();
            myTv.setCode(productCode);
            myTv.setDescription("Panasonic elevate");
            myTv.setPrice(2000);
            myTv.setScreen_size(70);
            myTv.setManufacturer("Panasonic");
            p = myTv;
        }
        return p;
    }
}

