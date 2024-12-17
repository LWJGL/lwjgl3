/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jni;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

import java.lang.reflect.*;

public class JNINativeInterface {

    static { Library.initialize(); }

    public static final int
        JNI_VERSION_1_1 = 0x10001,
        JNI_VERSION_1_2 = 0x10002,
        JNI_VERSION_1_4 = 0x10004,
        JNI_VERSION_1_6 = 0x10006,
        JNI_VERSION_1_8 = 0x10008,
        JNI_VERSION_9   = 0x90000,
        JNI_VERSION_10  = 0xA0000,
        JNI_VERSION_19  = 0x130000,
        JNI_VERSION_20  = 0x140000,
        JNI_VERSION_21  = 0x150000,
        JNI_VERSION_24  = 0x180000;

    public static final int
        JNIInvalidRefType    = 0,
        JNILocalRefType      = 1,
        JNIGlobalRefType     = 2,
        JNIWeakGlobalRefType = 3;

    public static final int
        JNI_FALSE = 0,
        JNI_TRUE  = 1;

    public static final int
        JNI_OK        = 0,
        JNI_ERR       = (-1),
        JNI_EDETACHED = (-2),
        JNI_EVERSION  = (-3),
        JNI_ENOMEM    = (-4),
        JNI_EEXIST    = (-5),
        JNI_EINVAL    = (-6);

    public static final int
        JNI_COMMIT = 1,
        JNI_ABORT  = 2;

    protected JNINativeInterface() {
        throw new UnsupportedOperationException();
    }

    // --- [ GetVersion ] ---

    /** {@code jint GetVersion(void)} */
    @NativeType("jint")
    public static native int GetVersion();

    // --- [ FromReflectedMethod ] ---

    /** {@code jmethodID FromReflectedMethod(jobject method)} */
    @NativeType("jmethodID")
    public static native long FromReflectedMethod(@NativeType("jobject") Method method);

    // --- [ FromReflectedField ] ---

    /** {@code jfieldID FromReflectedField(jobject field)} */
    @NativeType("jfieldID")
    public static native long FromReflectedField(@NativeType("jobject") Field field);

    // --- [ ToReflectedMethod ] ---

    /** {@code jobject ToReflectedMethod(jclass cls, jmethodID methodID, jboolean isStatic)} */
    public static native @Nullable Method nToReflectedMethod(Class<?> cls, long methodID, boolean isStatic);

    /** {@code jobject ToReflectedMethod(jclass cls, jmethodID methodID, jboolean isStatic)} */
    @NativeType("jobject")
    public static @Nullable Method ToReflectedMethod(@NativeType("jclass") Class<?> cls, @NativeType("jmethodID") long methodID, @NativeType("jboolean") boolean isStatic) {
        if (CHECKS) {
            check(methodID);
        }
        return nToReflectedMethod(cls, methodID, isStatic);
    }

    // --- [ ToReflectedField ] ---

    /** {@code jobject ToReflectedField(jclass cls, jfieldID fieldID, jboolean isStatic)} */
    public static native @Nullable Field nToReflectedField(Class<?> cls, long fieldID, boolean isStatic);

    /** {@code jobject ToReflectedField(jclass cls, jfieldID fieldID, jboolean isStatic)} */
    @NativeType("jobject")
    public static @Nullable Field ToReflectedField(@NativeType("jclass") Class<?> cls, @NativeType("jfieldID") long fieldID, @NativeType("jboolean") boolean isStatic) {
        if (CHECKS) {
            check(fieldID);
        }
        return nToReflectedField(cls, fieldID, isStatic);
    }

    // --- [ NewGlobalRef ] ---

    /** {@code void * NewGlobalRef(jobject obj)} */
    @NativeType("void *")
    public static native long NewGlobalRef(@NativeType("jobject") Object obj);

    // --- [ DeleteGlobalRef ] ---

    /** {@code void DeleteGlobalRef(void * globalRef)} */
    public static native void nDeleteGlobalRef(long globalRef);

    /** {@code void DeleteGlobalRef(void * globalRef)} */
    public static void DeleteGlobalRef(@NativeType("void *") long globalRef) {
        if (CHECKS) {
            check(globalRef);
        }
        nDeleteGlobalRef(globalRef);
    }

    // --- [ GetBooleanArrayElements ] ---

    /** {@code jboolean * GetBooleanArrayElements(jbooleanArray array, jboolean * isCopy)} */
    public static native long nGetBooleanArrayElements(byte[] array, long isCopy);

    /** {@code jboolean * GetBooleanArrayElements(jbooleanArray array, jboolean * isCopy)} */
    @NativeType("jboolean *")
    public static @Nullable ByteBuffer GetBooleanArrayElements(@NativeType("jbooleanArray") byte[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetBooleanArrayElements(array, memAddressSafe(isCopy));
        return memByteBufferSafe(__result, array.length);
    }

    // --- [ ReleaseBooleanArrayElements ] ---

    /** {@code void ReleaseBooleanArrayElements(jbooleanArray array, jboolean * elems, jint mode)} */
    public static native void nReleaseBooleanArrayElements(byte[] array, long elems, int mode);

    /** {@code void ReleaseBooleanArrayElements(jbooleanArray array, jboolean * elems, jint mode)} */
    public static void ReleaseBooleanArrayElements(@NativeType("jbooleanArray") byte[] array, @NativeType("jboolean *") ByteBuffer elems, @NativeType("jint") int mode) {
        nReleaseBooleanArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetByteArrayElements ] ---

    /** {@code jbyte * GetByteArrayElements(jbyteArray array, jboolean * isCopy)} */
    public static native long nGetByteArrayElements(byte[] array, long isCopy);

    /** {@code jbyte * GetByteArrayElements(jbyteArray array, jboolean * isCopy)} */
    @NativeType("jbyte *")
    public static @Nullable ByteBuffer GetByteArrayElements(@NativeType("jbyteArray") byte[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetByteArrayElements(array, memAddressSafe(isCopy));
        return memByteBufferSafe(__result, array.length);
    }

    // --- [ ReleaseByteArrayElements ] ---

    /** {@code void ReleaseByteArrayElements(jbyteArray array, jbyte * elems, jint mode)} */
    public static native void nReleaseByteArrayElements(byte[] array, long elems, int mode);

    /** {@code void ReleaseByteArrayElements(jbyteArray array, jbyte * elems, jint mode)} */
    public static void ReleaseByteArrayElements(@NativeType("jbyteArray") byte[] array, @NativeType("jbyte *") ByteBuffer elems, @NativeType("jint") int mode) {
        nReleaseByteArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetCharArrayElements ] ---

    /** {@code jchar * GetCharArrayElements(jcharArray array, jboolean * isCopy)} */
    public static native long nGetCharArrayElements(char[] array, long isCopy);

    /** {@code jchar * GetCharArrayElements(jcharArray array, jboolean * isCopy)} */
    @NativeType("jchar *")
    public static @Nullable ShortBuffer GetCharArrayElements(@NativeType("jcharArray") char[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetCharArrayElements(array, memAddressSafe(isCopy));
        return memShortBufferSafe(__result, array.length);
    }

    // --- [ ReleaseCharArrayElements ] ---

    /** {@code void ReleaseCharArrayElements(jcharArray array, jchar * elems, jint mode)} */
    public static native void nReleaseCharArrayElements(char[] array, long elems, int mode);

    /** {@code void ReleaseCharArrayElements(jcharArray array, jchar * elems, jint mode)} */
    public static void ReleaseCharArrayElements(@NativeType("jcharArray") char[] array, @NativeType("jchar *") ShortBuffer elems, @NativeType("jint") int mode) {
        nReleaseCharArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetShortArrayElements ] ---

    /** {@code jshort * GetShortArrayElements(jshortArray array, jboolean * isCopy)} */
    public static native long nGetShortArrayElements(short[] array, long isCopy);

    /** {@code jshort * GetShortArrayElements(jshortArray array, jboolean * isCopy)} */
    @NativeType("jshort *")
    public static @Nullable ShortBuffer GetShortArrayElements(@NativeType("jshortArray") short[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetShortArrayElements(array, memAddressSafe(isCopy));
        return memShortBufferSafe(__result, array.length);
    }

    // --- [ ReleaseShortArrayElements ] ---

    /** {@code void ReleaseShortArrayElements(jshortArray array, jshort * elems, jint mode)} */
    public static native void nReleaseShortArrayElements(short[] array, long elems, int mode);

    /** {@code void ReleaseShortArrayElements(jshortArray array, jshort * elems, jint mode)} */
    public static void ReleaseShortArrayElements(@NativeType("jshortArray") short[] array, @NativeType("jshort *") ShortBuffer elems, @NativeType("jint") int mode) {
        nReleaseShortArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetIntArrayElements ] ---

    /** {@code jint * GetIntArrayElements(jintArray array, jboolean * isCopy)} */
    public static native long nGetIntArrayElements(int[] array, long isCopy);

    /** {@code jint * GetIntArrayElements(jintArray array, jboolean * isCopy)} */
    @NativeType("jint *")
    public static @Nullable IntBuffer GetIntArrayElements(@NativeType("jintArray") int[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetIntArrayElements(array, memAddressSafe(isCopy));
        return memIntBufferSafe(__result, array.length);
    }

    // --- [ ReleaseIntArrayElements ] ---

    /** {@code void ReleaseIntArrayElements(jintArray array, jint * elems, jint mode)} */
    public static native void nReleaseIntArrayElements(int[] array, long elems, int mode);

    /** {@code void ReleaseIntArrayElements(jintArray array, jint * elems, jint mode)} */
    public static void ReleaseIntArrayElements(@NativeType("jintArray") int[] array, @NativeType("jint *") IntBuffer elems, @NativeType("jint") int mode) {
        nReleaseIntArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetLongArrayElements ] ---

    /** {@code jlong * GetLongArrayElements(jlongArray array, jboolean * isCopy)} */
    public static native long nGetLongArrayElements(long[] array, long isCopy);

    /** {@code jlong * GetLongArrayElements(jlongArray array, jboolean * isCopy)} */
    @NativeType("jlong *")
    public static @Nullable LongBuffer GetLongArrayElements(@NativeType("jlongArray") long[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetLongArrayElements(array, memAddressSafe(isCopy));
        return memLongBufferSafe(__result, array.length);
    }

    // --- [ ReleaseLongArrayElements ] ---

    /** {@code void ReleaseLongArrayElements(jlongArray array, jlong * elems, jint mode)} */
    public static native void nReleaseLongArrayElements(long[] array, long elems, int mode);

    /** {@code void ReleaseLongArrayElements(jlongArray array, jlong * elems, jint mode)} */
    public static void ReleaseLongArrayElements(@NativeType("jlongArray") long[] array, @NativeType("jlong *") LongBuffer elems, @NativeType("jint") int mode) {
        nReleaseLongArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetFloatArrayElements ] ---

    /** {@code jfloat * GetFloatArrayElements(jfloatArray array, jboolean * isCopy)} */
    public static native long nGetFloatArrayElements(float[] array, long isCopy);

    /** {@code jfloat * GetFloatArrayElements(jfloatArray array, jboolean * isCopy)} */
    @NativeType("jfloat *")
    public static @Nullable FloatBuffer GetFloatArrayElements(@NativeType("jfloatArray") float[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetFloatArrayElements(array, memAddressSafe(isCopy));
        return memFloatBufferSafe(__result, array.length);
    }

    // --- [ ReleaseFloatArrayElements ] ---

    /** {@code void ReleaseFloatArrayElements(jfloatArray array, jfloat * elems, jint mode)} */
    public static native void nReleaseFloatArrayElements(float[] array, long elems, int mode);

    /** {@code void ReleaseFloatArrayElements(jfloatArray array, jfloat * elems, jint mode)} */
    public static void ReleaseFloatArrayElements(@NativeType("jfloatArray") float[] array, @NativeType("jfloat *") FloatBuffer elems, @NativeType("jint") int mode) {
        nReleaseFloatArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetDoubleArrayElements ] ---

    /** {@code jdouble * GetDoubleArrayElements(jdoubleArray array, jboolean * isCopy)} */
    public static native long nGetDoubleArrayElements(double[] array, long isCopy);

    /** {@code jdouble * GetDoubleArrayElements(jdoubleArray array, jboolean * isCopy)} */
    @NativeType("jdouble *")
    public static @Nullable DoubleBuffer GetDoubleArrayElements(@NativeType("jdoubleArray") double[] array, @NativeType("jboolean *") @Nullable ByteBuffer isCopy) {
        if (CHECKS) {
            checkSafe(isCopy, 1);
        }
        long __result = nGetDoubleArrayElements(array, memAddressSafe(isCopy));
        return memDoubleBufferSafe(__result, array.length);
    }

    // --- [ ReleaseDoubleArrayElements ] ---

    /** {@code void ReleaseDoubleArrayElements(jdoubleArray array, jdouble * elems, jint mode)} */
    public static native void nReleaseDoubleArrayElements(double[] array, long elems, int mode);

    /** {@code void ReleaseDoubleArrayElements(jdoubleArray array, jdouble * elems, jint mode)} */
    public static void ReleaseDoubleArrayElements(@NativeType("jdoubleArray") double[] array, @NativeType("jdouble *") DoubleBuffer elems, @NativeType("jint") int mode) {
        nReleaseDoubleArrayElements(array, memAddress(elems), mode);
    }

    // --- [ GetBooleanArrayRegion ] ---

    /** {@code void GetBooleanArrayRegion(jbooleanArray array, jsize start, jsize len, jboolean * buf)} */
    public static native void nGetBooleanArrayRegion(byte[] array, int start, int len, long buf);

    /** {@code void GetBooleanArrayRegion(jbooleanArray array, jsize start, jsize len, jboolean * buf)} */
    public static void GetBooleanArrayRegion(@NativeType("jbooleanArray") byte[] array, @NativeType("jsize") int start, @NativeType("jboolean *") ByteBuffer buf) {
        nGetBooleanArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetBooleanArrayRegion ] ---

    /** {@code void SetBooleanArrayRegion(jbooleanArray array, jsize start, jsize len, jboolean const * buf)} */
    public static native void nSetBooleanArrayRegion(byte[] array, int start, int len, long buf);

    /** {@code void SetBooleanArrayRegion(jbooleanArray array, jsize start, jsize len, jboolean const * buf)} */
    public static void SetBooleanArrayRegion(@NativeType("jbooleanArray") byte[] array, @NativeType("jsize") int start, @NativeType("jboolean const *") ByteBuffer buf) {
        nSetBooleanArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ GetByteArrayRegion ] ---

    /** {@code void GetByteArrayRegion(jbyteArray array, jsize start, jsize len, jbyte * buf)} */
    public static native void nGetByteArrayRegion(byte[] array, int start, int len, long buf);

    /** {@code void GetByteArrayRegion(jbyteArray array, jsize start, jsize len, jbyte * buf)} */
    public static void GetByteArrayRegion(@NativeType("jbyteArray") byte[] array, @NativeType("jsize") int start, @NativeType("jbyte *") ByteBuffer buf) {
        nGetByteArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetByteArrayRegion ] ---

    /** {@code void SetByteArrayRegion(jbyteArray array, jsize start, jsize len, jbyte const * buf)} */
    public static native void nSetByteArrayRegion(byte[] array, int start, int len, long buf);

    /** {@code void SetByteArrayRegion(jbyteArray array, jsize start, jsize len, jbyte const * buf)} */
    public static void SetByteArrayRegion(@NativeType("jbyteArray") byte[] array, @NativeType("jsize") int start, @NativeType("jbyte const *") ByteBuffer buf) {
        nSetByteArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ GetCharArrayRegion ] ---

    /** {@code void GetCharArrayRegion(jcharArray array, jsize start, jsize len, jchar * buf)} */
    public static native void nGetCharArrayRegion(char[] array, int start, int len, long buf);

    /** {@code void GetCharArrayRegion(jcharArray array, jsize start, jsize len, jchar * buf)} */
    public static void GetCharArrayRegion(@NativeType("jcharArray") char[] array, @NativeType("jsize") int start, @NativeType("jchar *") ShortBuffer buf) {
        nGetCharArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetCharArrayRegion ] ---

    /** {@code void SetCharArrayRegion(jcharArray array, jsize start, jsize len, jchar const * buf)} */
    public static native void nSetCharArrayRegion(char[] array, int start, int len, long buf);

    /** {@code void SetCharArrayRegion(jcharArray array, jsize start, jsize len, jchar const * buf)} */
    public static void SetCharArrayRegion(@NativeType("jcharArray") char[] array, @NativeType("jsize") int start, @NativeType("jchar const *") ShortBuffer buf) {
        nSetCharArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ GetShortArrayRegion ] ---

    /** {@code void GetShortArrayRegion(jshortArray array, jsize start, jsize len, jshort * buf)} */
    public static native void nGetShortArrayRegion(short[] array, int start, int len, long buf);

    /** {@code void GetShortArrayRegion(jshortArray array, jsize start, jsize len, jshort * buf)} */
    public static void GetShortArrayRegion(@NativeType("jshortArray") short[] array, @NativeType("jsize") int start, @NativeType("jshort *") ShortBuffer buf) {
        nGetShortArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetShortArrayRegion ] ---

    /** {@code void SetShortArrayRegion(jshortArray array, jsize start, jsize len, jshort const * buf)} */
    public static native void nSetShortArrayRegion(short[] array, int start, int len, long buf);

    /** {@code void SetShortArrayRegion(jshortArray array, jsize start, jsize len, jshort const * buf)} */
    public static void SetShortArrayRegion(@NativeType("jshortArray") short[] array, @NativeType("jsize") int start, @NativeType("jshort const *") ShortBuffer buf) {
        nSetShortArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ GetIntArrayRegion ] ---

    /** {@code void GetIntArrayRegion(jintArray array, jsize start, jsize len, jint * buf)} */
    public static native void nGetIntArrayRegion(int[] array, int start, int len, long buf);

    /** {@code void GetIntArrayRegion(jintArray array, jsize start, jsize len, jint * buf)} */
    public static void GetIntArrayRegion(@NativeType("jintArray") int[] array, @NativeType("jsize") int start, @NativeType("jint *") IntBuffer buf) {
        nGetIntArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetIntArrayRegion ] ---

    /** {@code void SetIntArrayRegion(jintArray array, jsize start, jsize len, jint const * buf)} */
    public static native void nSetIntArrayRegion(int[] array, int start, int len, long buf);

    /** {@code void SetIntArrayRegion(jintArray array, jsize start, jsize len, jint const * buf)} */
    public static void SetIntArrayRegion(@NativeType("jintArray") int[] array, @NativeType("jsize") int start, @NativeType("jint const *") IntBuffer buf) {
        nSetIntArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ GetLongArrayRegion ] ---

    /** {@code void GetLongArrayRegion(jlongArray array, jsize start, jsize len, jlong * buf)} */
    public static native void nGetLongArrayRegion(long[] array, int start, int len, long buf);

    /** {@code void GetLongArrayRegion(jlongArray array, jsize start, jsize len, jlong * buf)} */
    public static void GetLongArrayRegion(@NativeType("jlongArray") long[] array, @NativeType("jsize") int start, @NativeType("jlong *") LongBuffer buf) {
        nGetLongArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetLongArrayRegion ] ---

    /** {@code void SetLongArrayRegion(jlongArray array, jsize start, jsize len, jlong const * buf)} */
    public static native void nSetLongArrayRegion(long[] array, int start, int len, long buf);

    /** {@code void SetLongArrayRegion(jlongArray array, jsize start, jsize len, jlong const * buf)} */
    public static void SetLongArrayRegion(@NativeType("jlongArray") long[] array, @NativeType("jsize") int start, @NativeType("jlong const *") LongBuffer buf) {
        nSetLongArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ GetFloatArrayRegion ] ---

    /** {@code void GetFloatArrayRegion(jfloatArray array, jsize start, jsize len, jfloat * buf)} */
    public static native void nGetFloatArrayRegion(float[] array, int start, int len, long buf);

    /** {@code void GetFloatArrayRegion(jfloatArray array, jsize start, jsize len, jfloat * buf)} */
    public static void GetFloatArrayRegion(@NativeType("jfloatArray") float[] array, @NativeType("jsize") int start, @NativeType("jfloat *") FloatBuffer buf) {
        nGetFloatArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetFloatArrayRegion ] ---

    /** {@code void SetFloatArrayRegion(jfloatArray array, jsize start, jsize len, jfloat const * buf)} */
    public static native void nSetFloatArrayRegion(float[] array, int start, int len, long buf);

    /** {@code void SetFloatArrayRegion(jfloatArray array, jsize start, jsize len, jfloat const * buf)} */
    public static void SetFloatArrayRegion(@NativeType("jfloatArray") float[] array, @NativeType("jsize") int start, @NativeType("jfloat const *") FloatBuffer buf) {
        nSetFloatArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ GetDoubleArrayRegion ] ---

    /** {@code void GetDoubleArrayRegion(jdoubleArray array, jsize start, jsize len, jdouble * buf)} */
    public static native void nGetDoubleArrayRegion(double[] array, int start, int len, long buf);

    /** {@code void GetDoubleArrayRegion(jdoubleArray array, jsize start, jsize len, jdouble * buf)} */
    public static void GetDoubleArrayRegion(@NativeType("jdoubleArray") double[] array, @NativeType("jsize") int start, @NativeType("jdouble *") DoubleBuffer buf) {
        nGetDoubleArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ SetDoubleArrayRegion ] ---

    /** {@code void SetDoubleArrayRegion(jdoubleArray array, jsize start, jsize len, jdouble const * buf)} */
    public static native void nSetDoubleArrayRegion(double[] array, int start, int len, long buf);

    /** {@code void SetDoubleArrayRegion(jdoubleArray array, jsize start, jsize len, jdouble const * buf)} */
    public static void SetDoubleArrayRegion(@NativeType("jdoubleArray") double[] array, @NativeType("jsize") int start, @NativeType("jdouble const *") DoubleBuffer buf) {
        nSetDoubleArrayRegion(array, start, buf.remaining(), memAddress(buf));
    }

    // --- [ RegisterNatives ] ---

    /** {@code jint RegisterNatives(jclass targetClass, JNINativeMethod const * methods, jint nMethods)} */
    public static native int nRegisterNatives(Class<?> targetClass, long methods, int nMethods);

    /** {@code jint RegisterNatives(jclass targetClass, JNINativeMethod const * methods, jint nMethods)} */
    @NativeType("jint")
    public static int RegisterNatives(@NativeType("jclass") Class<?> targetClass, @NativeType("JNINativeMethod const *") JNINativeMethod.Buffer methods) {
        if (CHECKS) {
            Struct.validate(methods.address(), methods.remaining(), JNINativeMethod.SIZEOF, JNINativeMethod::validate);
        }
        return nRegisterNatives(targetClass, methods.address(), methods.remaining());
    }

    // --- [ UnregisterNatives ] ---

    /** {@code jint UnregisterNatives(jclass targetClass)} */
    @NativeType("jint")
    public static native int UnregisterNatives(@NativeType("jclass") Class<?> targetClass);

    // --- [ GetJavaVM ] ---

    /** {@code jint GetJavaVM(JavaVM ** vm)} */
    public static native int nGetJavaVM(long vm);

    /** {@code jint GetJavaVM(JavaVM ** vm)} */
    @NativeType("jint")
    public static int GetJavaVM(@NativeType("JavaVM **") PointerBuffer vm) {
        if (CHECKS) {
            check(vm, 1);
        }
        return nGetJavaVM(memAddress(vm));
    }

    // --- [ GetStringRegion ] ---

    /** {@code void GetStringRegion(jstring str, jsize start, jsize len, jchar * buf)} */
    public static native void nGetStringRegion(String str, int start, int len, long buf);

    /** {@code void GetStringRegion(jstring str, jsize start, jsize len, jchar * buf)} */
    public static void GetStringRegion(@NativeType("jstring") String str, @NativeType("jsize") int start, @NativeType("jchar *") ByteBuffer buf) {
        nGetStringRegion(str, start, buf.remaining() >> 1, memAddress(buf));
    }

    // --- [ GetStringUTFRegion ] ---

    /** {@code void GetStringUTFRegion(jstring str, jsize start, jsize len, char * buf)} */
    public static native void nGetStringUTFRegion(String str, int start, int len, long buf);

    /** {@code void GetStringUTFRegion(jstring str, jsize start, jsize len, char * buf)} */
    public static void GetStringUTFRegion(@NativeType("jstring") String str, @NativeType("jsize") int start, @NativeType("jsize") int len, @NativeType("char *") ByteBuffer buf) {
        if (CHECKS) {
            check(buf, len);
        }
        nGetStringUTFRegion(str, start, len, memAddress(buf));
    }

    // --- [ NewWeakGlobalRef ] ---

    /** {@code void * NewWeakGlobalRef(jobject obj)} */
    @NativeType("void *")
    public static native long NewWeakGlobalRef(@NativeType("jobject") Object obj);

    // --- [ DeleteWeakGlobalRef ] ---

    /** {@code void DeleteWeakGlobalRef(void * weakGlobalRef)} */
    public static native void nDeleteWeakGlobalRef(long weakGlobalRef);

    /** {@code void DeleteWeakGlobalRef(void * weakGlobalRef)} */
    public static void DeleteWeakGlobalRef(@NativeType("void *") long weakGlobalRef) {
        if (CHECKS) {
            check(weakGlobalRef);
        }
        nDeleteWeakGlobalRef(weakGlobalRef);
    }

    // --- [ NewDirectByteBuffer ] ---

    /** {@code jobject NewDirectByteBuffer(void * address, jlong capacity)} */
    public static native @Nullable ByteBuffer nNewDirectByteBuffer(long address, long capacity);

    /** {@code jobject NewDirectByteBuffer(void * address, jlong capacity)} */
    @NativeType("jobject")
    public static @Nullable ByteBuffer NewDirectByteBuffer(@NativeType("void *") long address, @NativeType("jlong") long capacity) {
        if (CHECKS) {
            check(address);
        }
        return nNewDirectByteBuffer(address, capacity);
    }

    // --- [ GetDirectBufferAddress ] ---

    /** {@code void * GetDirectBufferAddress(jobject buf)} */
    @NativeType("void *")
    public static native long GetDirectBufferAddress(@NativeType("jobject") Buffer buf);

    // --- [ GetObjectRefType ] ---

    /** {@code jobjectRefType GetObjectRefType(jobject obj)} */
    @NativeType("jobjectRefType")
    public static native int GetObjectRefType(@NativeType("jobject") Object obj);

    // --- [ noop ] ---

    /** {@code void noop(void)} */
    public static native void noop();

}