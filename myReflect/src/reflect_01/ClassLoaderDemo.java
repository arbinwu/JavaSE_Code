package reflect_01;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        /**
         *ClassLoader.getSystemClassLoader() 返回用于委派的系统类加载器
         */
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);          //AppClassLoader
        /**
         * ClassLoader getParent()  返回父类加载器进行委派
         */
        ClassLoader parent = c.getParent();
        System.out.println(parent);     //PlatformClassLoader

        //Bootstrap  JVM的内置类加载器
        ClassLoader classLoader = parent.getParent();
        System.out.println(classLoader);    //null
    }
}
