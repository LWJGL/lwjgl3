/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.jni

import org.lwjgl.generator.*

val JNI_PACKAGE = "org.lwjgl.system.jni"

fun config() {
    packageInfo(
        JNI_PACKAGE,
        "Contains bindings to the Java Native Interface (JNI)."
    )
}

val jboolean = IntegerType("jboolean", PrimitiveMapping.BOOLEAN)
val jbyte = IntegerType("jbyte", PrimitiveMapping.BYTE)
val jchar = CharType("jchar", CharMapping.UTF16)
val jshort = IntegerType("jshort", PrimitiveMapping.SHORT)
val jint = IntegerType("jint", PrimitiveMapping.INT)
val jlong = IntegerType("jlong", PrimitiveMapping.LONG)

val jfloat = IntegerType("jfloat", PrimitiveMapping.FLOAT)
val jdouble = IntegerType("jdouble", PrimitiveMapping.DOUBLE)

val jbooleanArray = JObjectType("jbooleanArray", ByteArray::class)
val jbyteArray = JObjectType("jbyteArray", ByteArray::class)
val jcharArray = JObjectType("jcharArray", CharArray::class)
val jshortArray = JObjectType("jshortArray", ShortArray::class)
val jintArray = JObjectType("jintArray", IntArray::class)
val jlongArray = JObjectType("jlongArray", LongArray::class)
val jfloatArray = JObjectType("jfloatArray", FloatArray::class)
val jdoubleArray = JObjectType("jdoubleArray", DoubleArray::class)

val jsize = typedef(jint, "jsize")

val jclass = JObjectType("jclass", Class::class)
val jmethodID = "jmethodID".opaque_p
val jfieldID = "jfieldID".opaque_p

val jobject = Any::class.jobject
val jobject_p = "jobject".opaque_p

val jobjectRefType = "jobjectRefType".enumType

val jstring = JObjectType("jstring", String::class)

val java_lang_reflect_Method = java.lang.reflect.Method::class.jobject
val java_lang_reflect_Field = java.lang.reflect.Field::class.jobject
val java_nio_Buffer = java.nio.Buffer::class.jobject
val java_nio_ByteBuffer = java.nio.ByteBuffer::class.jobject

val JavaVM = "JavaVM".opaque_p

val JNINativeMethod_p = struct(JNI_PACKAGE, "JNINativeMethod") {
    documentation = ""

    charUTF8_p.member("name", "")
    charUTF8_p.member("signature", "")
    opaque_p.member("fnPtr", "")
}.p