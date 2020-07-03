import proxy.DynaHelloProxy;
import service.IHello;
import service.impl.helloImpl;

public class mainCLass {
    public static void main(String[] args){
        DynaHelloProxy dynaHelloProxy = new DynaHelloProxy();
        helloImpl hello = new helloImpl();
        IHello iHello = (IHello) dynaHelloProxy.bind(hello);
        iHello.sayHello("xiaoli");
    }
}
