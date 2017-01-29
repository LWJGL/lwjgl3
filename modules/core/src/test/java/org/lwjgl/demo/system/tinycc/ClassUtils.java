package org.lwjgl.demo.system.tinycc;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Utility methods to define a {@link Class} within the JVM.
 */
final class ClassUtils {

    private ClassUtils() {
    }

    /**
     * The "defineAnonymousClass" method in the Unsafe class to use the HotSpot anonymous class feature.
     */
    private static final MethodHandle defineAnonymousClass;

    /**
     * The "defineClass" method in the {@link ClassLoader} to define classes normally.
     */
    private static final MethodHandle defineClass;

    static {
        try {
            Method defineClassMethod = ClassLoader.class.getDeclaredMethod("defineClass", String.class, byte[].class, int.class, int.class);
            defineClassMethod.setAccessible(true);
            defineClass = MethodHandles.lookup().unreflect(defineClassMethod);
            MethodHandle defineAnonymousClassMH;
            try {
                Class<?> unsafeClass = ClassLoader.getSystemClassLoader().loadClass("sun.misc.Unsafe");
                Field theUnsafeField = unsafeClass.getDeclaredField("theUnsafe");
                theUnsafeField.setAccessible(true);
                Object unsafe = theUnsafeField.get(null);
                try {
                    /*
                     * Check if "defineAnonymousClass" is in the sun.misc.Unsafe class.
                     */
                    Method defineAnonymousClassMethod = unsafeClass.getDeclaredMethod("defineAnonymousClass", Class.class, byte[].class, Object[].class);
                    defineAnonymousClassMH = MethodHandles.lookup().unreflect(defineAnonymousClassMethod).bindTo(unsafe);
                } catch (NoSuchMethodException e) {
                    /* No defineAnonymousClass */
                    defineAnonymousClassMH = null;
                }
            } catch (ClassNotFoundException e) {
                /* No Unsafe :-( */
                defineAnonymousClassMH = null;
            }
            defineAnonymousClass = defineAnonymousClassMH;
        } catch (Exception e) {
            throw new AssertionError("Could not find method: ClassLoader.defineClass");
        }
    }

    /**
     * Define a class as an anonymous class (if supported by the JVM).
     * <p>
     * See <a href="https://blogs.oracle.com/jrose/entry/anonymous_classes_in_the_vm">anonymous classes in the VM</a> for more information.
     * 
     * @param hostClass
     *            the host class
     * @param bytecode
     *            the bytecode of the defined anonymous class
     * @param constantPoolPatch
     *            the constant pool patch; may be <code>null</code>
     * @return the defined {@link Class}
     */
    private static <T> Class<T> defineAnonymousClass(Class<?> hostClass, byte[] bytecode, Object[] constantPoolPatch) {
        if (defineAnonymousClass == null) {
            throw new RuntimeException("Anonymous classes not supported", null);
        }
        try {
	        //noinspection unchecked
	        return (Class<T>)defineAnonymousClass.invokeExact(hostClass, bytecode, constantPoolPatch);
        } catch (Throwable e) {
            throw new RuntimeException("Could not define anonymous class in JVM", e);
        }
    }

    /**
     * Define the class of the given <code>name</code> whose code is stored in the given <code>definition</code> byte array in the JVM via the given {@link ClassLoader}.
     * 
     * @param cl
     *            the {@link ClassLoader} used to define the class
     * @param name
     *            the name of the class (either API name or internal name; conversion is done automatically)
     * @param definition
     *            the definition as a byte array
     * @param offset
     *            the offset into the given byte array
     * @param length
     *            the number of bytes to take from the byte array
     * @return the defined {@link Class}
     */
    private static <T> Class<T> defineClass(ClassLoader cl, String name, byte[] definition, int offset, int length) {
        String apiName = name.replace('/', '.');
        try {
	        //noinspection unchecked
	        return (Class<T>)defineClass.invokeExact(cl, apiName, definition, offset, length);
        } catch (Throwable e) {
            throw new RuntimeException("Could not define class in JVM: " + name, e);
        }
    }

    /**
     * Define the class of the given <code>name</code> whose code is stored in the given <code>definition</code> byte array in the JVM via the given {@link ClassLoader}.
     * <p>
     * If <a href="https://blogs.oracle.com/jrose/entry/anonymous_classes_in_the_vm">HotSpot anonymous classes</a> is supported and the <code>hostClass</code> is not
     * <code>null</code>, that host will define the lifecycle and visibility of the anonymous class. In that case, the new class will not be defined via the given or any other
     * {@link ClassLoader} but will use a JVM-internal mechanism instead.
     * 
     * @see #defineClass(ClassLoader, Class, String, byte[], Object[])
     * 
     * @param cl
     *            the {@link ClassLoader} used to define the class
     * @param hostClass
     *            the host class whose linkage properties are shared with the generated class (if anonymous classes are used (feature of Hotspot)); may be <code>null</code>
     * @param name
     *            the name of the class (either API name or internal name; conversion is done automatically)
     * @param definition
     *            the definition as a byte array
     * @return the defined {@link Class}
     */
    public static <T> Class<T> defineClass(ClassLoader cl, Class<?> hostClass, String name, byte[] definition) {
        return defineClass(cl, hostClass, name, definition, null);
    }

    /**
     * Define the class of the given <code>name</code> whose code is stored in the given <code>definition</code> byte array in the JVM via the given {@link ClassLoader}.
     * <p>
     * If <a href="https://blogs.oracle.com/jrose/entry/anonymous_classes_in_the_vm">HotSpot anonymous classes</a> is supported and the <code>hostClass</code> is not
     * <code>null</code>, that host will define the lifecycle and visibility of the anonymous class. In that case, the new class will not be defined via the given or any other
     * {@link ClassLoader} but will use a JVM-internal mechanism instead.
     * 
     * @param cl
     *            the {@link ClassLoader} used to define the class
     * @param hostClass
     *            the host {@link Class} (ignored if anonymous classes are unsupported)
     * @param name
     *            the name
     * @param definition
     *            the definition as a byte array
     * @param constantPoolPatch
     *            not used yet
     * @return the defined {@link Class}
     */
    public static <T> Class<T> defineClass(ClassLoader cl, Class<?> hostClass, String name, byte[] definition, Object[] constantPoolPatch) {
        if (defineAnonymousClass != null && hostClass != null) {
            return defineAnonymousClass(hostClass, definition, constantPoolPatch);
        }
        return defineClass(cl, name, definition, 0, definition.length);
    }

}