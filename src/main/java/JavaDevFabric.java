public class JavaDevFabric implements DevFabric {
    @Override
    public Dev dev() {
        return new JavaDev();
    }
}
