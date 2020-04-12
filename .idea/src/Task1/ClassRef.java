package Task1;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassRef {
    public static void main(String[] args) throws ClassNotFoundException {


        Class su27 = SU_27.class;

        SU_27 su_27 = new SU_27();
        Class cgetClass = su_27.getClass();


        System.out.println(su27);
        System.out.println("Class name with field properties = " + su_27);

        System.out.println("simple name = " + new Serializable() {
        }.getClass().getName());
        System.out.println("simple name = " + new Serializable() {
        }.getClass().getCanonicalName());

        System.out.println(int.class.getTypeName());

        //Модифікатори
        int modifiers = su27.getModifiers();
        System.out.println("Presence of abstract modifiers = " + Modifier.isAbstract(modifiers));
        System.out.println("Presence of private modifiers = " + Modifier.isPrivate(modifiers));
        System.out.println("Presence of final modifiers = " + Modifier.isFinal(modifiers));

        //Пакет
        Package p = su27.getPackage();
        System.out.println(p.getName());
        System.out.println(p);
        System.out.println(p.getSpecificationVendor());

        //Суперклас
        Class superClass = su27.getSuperclass();
        System.out.println(superClass);
        System.out.println(superClass.getSuperclass().getSimpleName());

        //Інтерфейси
        Class[] interfaces = su27.getInterfaces();
        System.out.println(Arrays.toString(interfaces));
        for (Class anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        //Конструктори
        Constructor[] constructors = su27.getConstructors();
        for (Constructor constructor : constructors) {
        }
        System.out.println("Number of constructors = " + constructors.length);


        //Поля
        Field[] fields = su27.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("Number of fields = " + fields.length);

        //Усі поля
        Field[] allFields = su27.getDeclaredFields();
        for (Field allField : allFields) {
            System.out.print("All fields = " + Arrays.asList(allField.getName()));
            System.out.println(allField.getType());
        }

        //Методи

        Method[] methods = su27.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Methods = " + method.getName().toString().toUpperCase());

        }


    }
}


