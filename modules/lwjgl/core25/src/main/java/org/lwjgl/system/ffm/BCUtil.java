/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.ffm;

import java.lang.classfile.*;
import java.lang.constant.*;
import java.lang.foreign.*;
import java.lang.reflect.*;
import java.util.function.*;
import java.util.regex.*;

import static java.lang.classfile.ClassFile.*;
import static java.lang.constant.ConstantDescs.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.ffm.BCDescriptors.*;

final class BCUtil {

    static final int JAVA_VERSION;
    static {
        var javaVersion = System.getProperty("java.version");

        var matcher = Pattern
            .compile("^([1-9][0-9]*)(?:(?:\\.0)*\\.[1-9][0-9]*)*(?:-[a-zA-Z0-9]+)?")
            .matcher(javaVersion);

        if (!matcher.find()) {
            throw new IllegalStateException("Failed to parse java.version: " + javaVersion);
        }

        JAVA_VERSION = Integer.parseInt(matcher.group(1));
    }

    static final long NATIVE_THRESHOLD_FILL = powerOfPropertyOr("fill", 5);
    static final long NATIVE_THRESHOLD_COPY = powerOfPropertyOr("copy", 6);

    static final Linker.Option[] EMPTY_OPTIONS = new Linker.Option[0];

    private BCUtil() { }

    static final Object EMPTY_SLOT = new Object();

    static ClassBuilder startHiddenClass(ClassBuilder classBuilder) {
        return classBuilder
            .withVersion(latestMajorVersion(), latestMinorVersion())
            .withFlags(AccessFlag.PUBLIC, AccessFlag.FINAL)
            .withSuperclass(CD_Object)
            // public <init>() { super(); }
            .withMethod(INIT_NAME, MTD_void, ACC_PUBLIC, mb -> mb
                .withCode(cb -> cb
                    .aload(cb.receiverSlot())
                    .invokespecial(CD_Object, INIT_NAME, MTD_void, false)
                    .return_()));
    }

    static MethodTypeDesc getMethodTypeDesc(Method method) {
        return MethodTypeDesc.of(
            method.getReturnType().describeConstable().orElseThrow(),
            getParameterDescs(method)
        );
    }

    private static ClassDesc[] getParameterDescs(Method method) {
        var parameterTypes = method.getParameterTypes();
        var parameterDescs = new ClassDesc[parameterTypes.length];
        for (var p = 0; p < parameterTypes.length; p++) {
            parameterDescs[p] = parameterTypes[p].describeConstable().orElseThrow();
        }
        return parameterDescs;
    }

    private static ClassDesc[] getParameterDescsNative(Method method, BCReturnTransform returnTransform) {
        var parameterTypes = method.getParameterTypes();
        var parameterDescs = new ClassDesc[parameterTypes.length];
        for (var p = 0; p < parameterTypes.length; p++) {
            parameterDescs[p] = getClassDescNative(parameterTypes[p]);
        }
        return parameterDescs;
    }

    private static ClassDesc getClassDescNative(Class<?> type) {
        Class<?> nativeType;
        if (type == String.class) {
            nativeType = MemorySegment.class;
        } else {
            nativeType = type;
        }
        return nativeType.describeConstable().orElseThrow();
    }

    static String getNativeName(Class<?> type) {
        var nativeName = type.getAnnotation(FFMName.class);
        return nativeName != null
            ? nativeName.value()
            : type.getSimpleName();
    }

    static String getNativeName(Method method) {
        var nativeName = method.getAnnotation(FFMName.class);

        String name;
        if (nativeName != null) {
            name = nativeName.value();
        } else {
            name = method.getName();

            var nativePrefix = method.getDeclaringClass().getAnnotation(FFMPrefix.class);
            if (nativePrefix != null && !method.isAnnotationPresent(FFMNoPrefix.class)) {
                name = nativePrefix.value() + name;
            }
        }
        return name;
    }

    private static void checkFFMNullableOnPrimitive(AnnotatedElement element, Class<?> type) {
        if (DEBUG && !(element.isAnnotationPresent(FFMPointer.class) && type == long.class)) {
            throw new IllegalStateException("The FFMNullable annotation can be applied to @FFMPointer long types only");
        }
    }

    private static void checkFFMNullableOnReference(AnnotatedElement element) {
        if (DEBUG && element.isAnnotationPresent(FFMNullable.class)) {
            throw new IllegalStateException("The FFMNullable annotation can be applied to @FFMPointer long parameters only");
        }
    }

    private static final Pattern NULLABLE_PATTERN = Pattern.compile("null", Pattern.CASE_INSENSITIVE);
    private static void checkAnnotations(AnnotatedElement element, Class<? extends AnnotatedElement> type) {
        for (var annotation : element.getDeclaredAnnotations()) {
            var annotationType = annotation.annotationType();
            if (annotationType.getPackage() != FFM.class.getPackage()) {
                apiLog("Unsupported annotation found on " + type.getSimpleName().toLowerCase() + ": " + element);
                if (NULLABLE_PATTERN.matcher(annotationType.getSimpleName()).find()) {
                    apiLog("\tUse FFMConfigBuilder::withNullableAnnotation if applicable.");
                }
            }
        }
    }
    private static <T extends AnnotatedElement> void checkAnnotations(T element, Function<T, AnnotatedType> annotatedTypeProvider) {
        if (DEBUG) {
            var type = element.getClass();
            checkAnnotations(element, type);
            checkAnnotations(annotatedTypeProvider.apply(element), type);
        }
    }

    static <T extends AnnotatedElement> boolean isNullable(FFMConfig config, T element, Class<?> type, Function<T, AnnotatedType> annotatedTypeProvider) {
        if (type.isPrimitive()) {
            checkFFMNullableOnPrimitive(element, type);
            return element.isAnnotationPresent(FFMNullable.class);
        }

        var nullableAnnotation = config.nullableAnnotation;
        checkFFMNullableOnReference(element);

        if (nullableAnnotation != null) {
            return config.nullableAnnotationOnType
                ? annotatedTypeProvider.apply(element).isAnnotationPresent(nullableAnnotation)
                : element.isAnnotationPresent(nullableAnnotation);
        }

        checkAnnotations(element, annotatedTypeProvider);
        return false;
    }

    static boolean isNullable(FFMConfig config, Method method) {
        return isNullable(
            config,
            method,
            method.getReturnType(),
            Method::getAnnotatedReturnType
        );
    }

    static boolean isNullable(FFMConfig config, Parameter parameter) {
        return isNullable(
            config,
            parameter,
            parameter.getType(),
            Parameter::getAnnotatedType
        );
    }

    static <T extends CodeBuilder> T buildPointer64to32(T cb) {
        cb.l2i();
        return cb;
    }

    static <T extends CodeBuilder> T buildPointer32to64(T cb) {
        cb
            .i2l()
            .loadConstant(0xFFFF_FFFFL)
            .land();
        return cb;
    }

    static <T extends CodeBuilder> T buildGetString(T cb, Method method) {
        cb.lconst_0();
        buildCharsetInstance(cb, getCharset(method))
            .invokeinterface(CD_MemorySegment, "getString", MTD_String_long_Charset);
        return cb;
    }

    static <T extends CodeBuilder> T buildCharsetInstance(T cb, FFMCharset.Type type) {
        cb.getstatic(CD_StandardCharsets, type.charset, CD_Charset);
        /*if (STANDARD_CHARSETS.contains(charsetName)) {
            cb.getstatic(CD_StandardCharsets, charsetName, CD_Charset);
        } else {
            cb
                .ldc(cb.constantPool().stringEntry(charsetName).constantValue())
                .invokestatic(CD_Charset, "forName", MTD_Charset_forName);
        }*/
        return cb;
    }

    static <T extends CodeBuilder> T buildCharsetShift(T cb, FFMCharset.Type type, TypeKind kind) {
        var byteSize = (int)type.layout.byteSize();
        if (byteSize == 1) {
            return cb;
        }

        switch (byteSize) {
            case 2 -> cb.iconst_1();
            case 4 -> cb.iconst_2();
            default -> throw new AssertionError();
        }

        if (kind != TypeKind.LONG) {
            cb.ishl();
        } else {
            cb.lshl();
        }
        return cb;
    }

    static <T> DynamicConstantDesc<T> condyCData(ClassDesc constantType) {
        return DynamicConstantDesc.ofNamed(BSM_CLASS_DATA, DEFAULT_NAME, constantType);
    }

    static <T> DynamicConstantDesc<T> condyCDataAt(ClassDesc constantType, int index) {
        return DynamicConstantDesc.ofNamed(BSM_CLASS_DATA_AT, DEFAULT_NAME, constantType, (Integer)index);
    }

    static FFMCharset.Type getCharset(Method method) {
        var annotation = method.getAnnotation(FFMCharset.class);
        if (annotation == null) {
            annotation = method.getDeclaringClass().getAnnotation(FFMCharset.class);
        }
        return annotation != null ? annotation.value() : FFMCharset.DEFAULT;
    }

    static FFMCharset.Type getCharset(Parameter parameter) {
        var annotation = parameter.getAnnotation(FFMCharset.class);
        if (annotation == null) {
            annotation = parameter.getDeclaringExecutable().getDeclaringClass().getAnnotation(FFMCharset.class);
        }
        return annotation != null ? annotation.value() : FFMCharset.DEFAULT;
    }

    static boolean isPointerType(Parameter parameter, Class<?> type) {
        return type == MemorySegment.class || (type == long.class && parameter.isAnnotationPresent(FFMPointer.class));
    }

    private static String getParameterName(Parameter parameter, int index) {
        return parameter.isNamePresent()
            ? "<" + parameter.getName() + ">"
            : "#" + index;
    }
    static String getExceptionTextNULL(Parameter parameter, int index) {
        return parameter.getType().getSimpleName() + " argument " + getParameterName(parameter, index) + " cannot be NULL";
    }

    static void printModel(CompoundElement<?> model) {
        DEBUG_STREAM.println(model);
        printModel(model, 0);
    }
    private static void printModel(CompoundElement<?> model, int depth) {
        var indent = "\t".repeat(depth);
        var bci    = 0;
        for (var el : model) {
            if (el instanceof Instruction i) {
                DEBUG_STREAM.println(indent + bci + ": " + i);
                bci += i.sizeInBytes();
            } else {
                DEBUG_STREAM.println(indent + " ".repeat(Integer.toString(bci).length()) + "* " + el);
            }
            if (el instanceof CompoundElement<?> ce) {
                printModel(ce, depth + 1);
            }
        }
    }

    private static final String PROPERTY_PATH = "java.lang.foreign.native.threshold.power.";

    private static long powerOfPropertyOr(String name, int defaultPower) {
        int power = Integer.getInteger(PROPERTY_PATH + name, defaultPower);
        return 1L << Math.clamp(power, 0, Integer.SIZE - 2);
    }

}