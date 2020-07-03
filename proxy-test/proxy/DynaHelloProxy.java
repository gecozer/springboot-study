package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class DynaHelloProxy implements InvocationHandler {
    private Object delegate;
    public Object bind(Object object){
        this.delegate = object;
        return Proxy.newProxyInstance(this.delegate.getClass().getClassLoader(),this.delegate.getClass().getInterfaces(),this);
    }
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result = null;
        result = method.invoke(this.delegate,objects);
        return result;
    }
}
