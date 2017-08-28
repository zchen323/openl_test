package myOpenlTest;

import org.openl.rules.project.instantiation.SimpleProjectEngineFactory;
import org.openl.rules.project.instantiation.SimpleProjectEngineFactory.SimpleProjectEngineFactoryBuilder;

/**
 * This class shows how to execute OpenL Tablets methods using Java interface.
 * Looks really simple...
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if (System.getProperty("openl-cmd") != null) {
            run("openl");
        } else {
            run("src/main/openl");
        }
    }

    public static void run(String pathToOpenL) throws Exception {
        // Service - is generated interface from TemplateRules.xls using maven openl:generate goal.
        SimpleProjectEngineFactoryBuilder<Service> factoryBuilder = new SimpleProjectEngineFactoryBuilder<Service>();
        SimpleProjectEngineFactory<Service> factory = factoryBuilder.setProject(pathToOpenL)
                .setInterfaceClass(Service.class)
                .build();

        Service instance = factory.newInstance();
        String result = instance.hello(16);
        System.out.println(result);
    }
}
