public class PhpDevFabric implements DevFabric {
    @Override
    public Dev dev() {
        return new PhpDev();
    }
}
