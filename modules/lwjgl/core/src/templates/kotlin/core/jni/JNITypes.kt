/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.jni

import org.lwjgl.generator.*

val jboolean = IntegerType("jboolean", PrimitiveMapping.BOOLEAN)
val jbyte = IntegerType("jbyte", PrimitiveMapping.BYTE)
val jchar = CharType("jchar", CharMapping.UTF16)
val jshort = IntegerType("jshort", PrimitiveMapping.SHORT)
val jint = IntegerType("jint", PrimitiveMapping.INT)
val jlong = IntegerType("jlong", PrimitiveMapping.LONG)

val jfloat = PrimitiveType("jfloat", PrimitiveMapping.FLOAT)
val jdouble = PrimitiveType("jdouble", PrimitiveMapping.DOUBLE)

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
val jmethodID = "jmethodID".handle
val jfieldID = "jfieldID".handle

val jobject = Any::class.jobject
val jobject_p = "jobject".handle

val jobjectRefType = "jobjectRefType".enumType

val jstring = JObjectType("jstring", String::class)

val java_lang_reflect_Method = java.lang.reflect.Method::class.jobject
val java_lang_reflect_Field = java.lang.reflect.Field::class.jobject
val java_nio_Buffer = java.nio.Buffer::class.jobject
val java_nio_ByteBuffer = java.nio.ByteBuffer::class.jobject

val JavaVM = "JavaVM".handle

val JNINativeMethod = struct(Module.CORE_JNI, "JNINativeMethod") {
    documentation = ""

    charUTF8.p("name", "")
    charUTF8.p("signature", "")
    opaque_p("fnPtr", "")
}