public class Programs {
    public static void main(String[] args) {
        DevFabric devFabric = new PhpDevFabric();
        Dev dev = devFabric.dev();
        dev.WriteCod();

//        devFabric("php").dev().WriteCod();
    }

//    static DevFabric devFabric(String s) {
//        if (s.equalsIgnoreCase("java"))
//            return new JavaDevFabric();
//        else if (s.equalsIgnoreCase("c++"))
//            return new CppDevFabric();
//        else if (s.equalsIgnoreCase("php"))
//            return new PhpDevFabric();
//        else throw new RuntimeException(s + " not found");
//    }
}
