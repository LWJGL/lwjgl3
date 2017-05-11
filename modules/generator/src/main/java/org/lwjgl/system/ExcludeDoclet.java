/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import com.sun.javadoc.*;
import com.sun.tools.doclets.standard.*;
import com.sun.tools.javadoc.*;

import java.lang.reflect.*;
import java.util.*;

/**
 * Custom Doclet that skips Javadoc generation for certain elements in auto-generated code that are only useful to "power-users", or would make the generated
 * Javadoc too noisy without any useful information. These include:
 *
 * <ul>
 * <li>Function address and struct layout fields.</li>
 * <li>Constructors in binding classes.</li>
 * <li>Unsafe methods.</li>
 * </ul>
 *
 * <p>Originally written by Chris Nokleberg and released in the public domain.</p>
 *
 * @see <a href="http://www.sixlegs.com/blog/java/exclude-javadoc-tag.html">Chris Nokleberg's Fizzy Weblog</a>
 */
public final class ExcludeDoclet {

    private ExcludeDoclet() {
    }

    public static void main(String[] args) {
        String name = ExcludeDoclet.class.getName();
        Main.execute(name, name, args);
    }

    public static LanguageVersion languageVersion() {
        return LanguageVersion.JAVA_1_5;
    }

    public static boolean validOptions(String[][] options, DocErrorReporter reporter) throws java.io.IOException {
        return Standard.validOptions(options, reporter);
    }

    public static int optionLength(String option) {
        return Standard.optionLength(option);
    }

    public static boolean start(RootDoc root) throws java.io.IOException {
        return Standard.start((RootDoc)process(root, RootDoc.class));
    }

    private static boolean isFunctionAddressField(FieldDoc field) {
        return !field.isStatic() &&
               field.isPublic() &&
               field.isFinal() &&
               field.type().isPrimitive() &&
               "Function address.".equals(field.commentText());
    }

    private static boolean isStructField(FieldDoc field) {
        ClassDoc superclass = field.containingClass().superclass();
        if (superclass == null || !superclass.isAbstract() || !"org.lwjgl.system.Struct".equals(superclass.qualifiedName())) {
            return false;
        }

        return field.isStatic() &&
               field.isPublic() &&
               field.isFinal() &&
               field.type().isPrimitive() &&
               !"SIZEOF".equals(field.name());
    }

    private static Object process(Object obj, Class<?> expect) {
        if (obj == null) {
            return null;
        }

        Class<?> cls = obj.getClass();
        if (cls.getName().startsWith("com.sun.")) {
            return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new ExcludeHandler(obj));
        } else if (obj instanceof Object[]) {
            Class<?> componentType = expect.getComponentType();
            if (componentType == null) {
                return obj;
            }

            Object[]     entries   = (Object[])obj;
            List<Object> processed = new ArrayList<>(entries.length);

            outer:
            for (Object entry : entries) {
                if (entry instanceof FieldDoc) {
                    FieldDoc field = (FieldDoc)entry;
                    if (isFunctionAddressField(field) || isStructField(field)) {
                        continue;
                    }

                    if (field.name().startsWith("BITS")) {
                        continue;
                    }
                } else if (entry instanceof MethodDoc) {
                    MethodDoc method = (MethodDoc)entry;
                    if (method.isStatic() && method.name().startsWith("n")) {
                        String realName = method.name().substring(1);
                        for (Object e : entries) {
                            if (e != entry && e instanceof MethodDoc && realName.equals(((MethodDoc)e).name())) {
                                continue outer;
                            }
                        }
                    }
                } else if (entry instanceof ConstructorDoc) {
                    ConstructorDoc constructor = (ConstructorDoc)entry;
                    if (constructor.commentText().isEmpty()) {
                        for (Object e : entries) {
                            if (e instanceof FieldDoc && isFunctionAddressField((FieldDoc)e)) // make sure we're in a binding class
                            {
                                continue outer;
                            }
                        }
                    }
                }

                processed.add(process(entry, componentType));
            }

            return processed.toArray((Object[])Array.newInstance(componentType, processed.size()));
        } else {
            return obj;
        }
    }

    private static class ExcludeHandler
        implements InvocationHandler {
        private Object target;

        ExcludeHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
            if (args != null) {
                String methodName = method.getName();
                if ("compareTo".equals(methodName) || "equals".equals(methodName) || "overrides".equals(methodName) || "subclassOf".equals(methodName)) {
                    args[0] = unwrap(args[0]);
                }
            }

            try {
                return process(method.invoke(target, args), method.getReturnType());
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        }

        private static Object unwrap(Object proxy) {
            if (proxy instanceof Proxy) {
                return ((ExcludeHandler)Proxy.getInvocationHandler(proxy)).target;
            }

            return proxy;
        }
    }

}