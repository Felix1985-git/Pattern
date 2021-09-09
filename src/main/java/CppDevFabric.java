public class CppDevFabric implements DevFabric {
    @Override
    public Dev dev() {
        return new CppDev();
    }
}
