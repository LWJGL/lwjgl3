/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.jni.templates

import org.lwjgl.generator.*
import core.jni.*

val JNINativeInterface = "JNINativeInterface".nativeClass(Module.CORE_JNI, prefix = "JNI", prefixMethod = "") {
    javaImport("java.lang.reflect.*")
    IntConstant(
        "VERSION_1_1"..0x00010001,
        "VERSION_1_2"..0x00010002,
        "VERSION_1_4"..0x00010004,
        "VERSION_1_6"..0x00010006,
        "VERSION_1_8"..0x00010008,
        "VERSION_9"..0x00090000,
        "VERSION_10"..0x000A0000,
        "VERSION_19"..0x00130000,
        "VERSION_20"..0x00140000,
        "VERSION_21"..0x00150000,
        "VERSION_24"..0x00180000
    )

    EnumConstant(
        "JNIInvalidRefType".."0",
        "JNILocalRefType".."1",
        "JNIGlobalRefType".."2",
        "JNIWeakGlobalRefType".."3"
    ).noPrefix()

    IntConstant(
        "FALSE".."0",
        "TRUE".."1"
    )

    EnumConstant(
        "OK".enum("0"),
        "ERR".enum("(-1)"),
        "EDETACHED".enum("(-2)"),
        "EVERSION".enum("(-3)"),
        "ENOMEM".enum("(-4)"),
        "EEXIST".enum("(-5)"),
        "EINVAL".enum("(-6)")
    )

    IntConstant(
        "COMMIT".."1",
        "ABORT".."2"
    )

    jint(
        "GetVersion",

        JNI_ENV
    )

    jmethodID(
        "FromReflectedMethod",

        JNI_ENV,
        java_lang_reflect_Method("method")
    )

    jfieldID(
        "FromReflectedField",

        JNI_ENV,
        java_lang_reflect_Field("field")
    )

    java_lang_reflect_Method(
        "ToReflectedMethod",

        JNI_ENV,
        jclass("cls"),
        jmethodID("methodID"),
        jboolean("isStatic")
    )

    java_lang_reflect_Field(
        "ToReflectedField",

        JNI_ENV,
        jclass("cls"),
        jfieldID("fieldID"),
        jboolean("isStatic")
    )

    opaque_p(
        "NewGlobalRef",

        JNI_ENV,
        jobject("obj")
    )

    void(
        "DeleteGlobalRef",

        JNI_ENV,
        opaque_p("globalRef")
    )

    fun ArrayElementsRoutines(name: String, elementType: PrimitiveType, arrayType: JObjectType) {
        elementType.p(
            "Get${name}ArrayElements",

            JNI_ENV,
            AutoSizeResult("\$original.length")..arrayType("array"),
            Check(1)..nullable..jboolean.p("isCopy")
        )

        OffHeapOnly..void(
            "Release${name}ArrayElements",

            JNI_ENV,
            arrayType("array"),
            Unsafe..elementType.p("elems"),
            jint("mode")
        )
    }

    ArrayElementsRoutines("Boolean", jboolean, jbooleanArray)
    ArrayElementsRoutines("Byte", jbyte, jbyteArray)
    ArrayElementsRoutines("Char", IntegerType("jchar", PrimitiveMapping.SHORT, unsigned = true), jcharArray)
    ArrayElementsRoutines("Short", jshort, jshortArray)
    ArrayElementsRoutines("Int", jint, jintArray)
    ArrayElementsRoutines("Long", jlong, jlongArray)
    ArrayElementsRoutines("Float", jfloat, jfloatArray)
    ArrayElementsRoutines("Double", jdouble, jdoubleArray)

    fun ArrayRegionRoutines(name: String, elementType: PrimitiveType, arrayType: JObjectType) {
        OffHeapOnly..void(
            "Get${name}ArrayRegion",

            JNI_ENV,
            arrayType("array"),
            jsize("start"),
            AutoSize("buf")..jsize("len"),
            elementType.p("buf")
        )

        OffHeapOnly..void(
            "Set${name}ArrayRegion",

            JNI_ENV,
            arrayType("array"),
            jsize("start"),
            AutoSize("buf")..jsize("len"),
            elementType.const.p("buf")
        )
    }

    ArrayRegionRoutines("Boolean", jboolean, jbooleanArray)
    ArrayRegionRoutines("Byte", jbyte, jbyteArray)
    ArrayRegionRoutines("Char", IntegerType("jchar", PrimitiveMapping.SHORT, unsigned = true), jcharArray)
    ArrayRegionRoutines("Short", jshort, jshortArray)
    ArrayRegionRoutines("Int", jint, jintArray)
    ArrayRegionRoutines("Long", jlong, jlongArray)
    ArrayRegionRoutines("Float", jfloat, jfloatArray)
    ArrayRegionRoutines("Double", jdouble, jdoubleArray)

    jint(
        "RegisterNatives",

        JNI_ENV,
        jclass("targetClass"),
        JNINativeMethod.const.p("methods"),
        AutoSize("methods")..jint("nMethods")
    )

    jint(
        "UnregisterNatives",

        JNI_ENV,
        jclass("targetClass")
    )

    jint(
        "GetJavaVM",

        JNI_ENV,
        Check(1)..JavaVM.p.p("vm")
    )

    void(
        "GetStringRegion",

        JNI_ENV,
        jstring("str"),
        jsize("start"),
        AutoSize("buf")..jsize("len"),
        jchar.p("buf")
    )

    void(
        "GetStringUTFRegion",

        JNI_ENV,
        jstring("str"),
        jsize("start"),
        jsize("len"),
        Check("len")..char.p("buf")
    )

    opaque_p(
        "NewWeakGlobalRef",

        JNI_ENV,
        jobject("obj")
    )

    void(
        "DeleteWeakGlobalRef",

        JNI_ENV,
        opaque_p("weakGlobalRef")
    )

    java_nio_ByteBuffer(
        "NewDirectByteBuffer",

        JNI_ENV,
        opaque_p("address"),
        jlong("capacity")
    )

    opaque_p(
        "GetDirectBufferAddress",

        JNI_ENV,
        java_nio_Buffer("buf")
    )

    jobjectRefType(
        "GetObjectRefType",

        JNI_ENV,
        jobject("obj")
    )

    Code(nativeCall = "")..void(
        "noop",
        void()
    )
}