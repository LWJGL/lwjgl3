/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.BufferUtils;
import org.lwjgl.system.tinycc.TinyCC;

import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains a simplified &lt;jni.h&gt; for use with TinyCC.
 *
 * <p>This header may be prepended to the source passed to {@link TinyCC#tcc_compile_string}. This avoids IO when compiling with {@code -nostdinc} and
 * {@code -nostdlib}.</p>
 */
public final class JNITinyHeader {

	/*
	 * Copyright (c) 1996, 2016, Oracle and/or its affiliates. All rights reserved.
	 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
	 *
	 * This code is free software; you can redistribute it and/or modify it
	 * under the terms of the GNU General Public License version 2 only, as
	 * published by the Free Software Foundation.  Oracle designates this
	 * particular file as subject to the "Classpath" exception as provided
	 * by Oracle in the LICENSE file that accompanied this code.
	 *
	 * This code is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
	 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
	 * version 2 for more details (a copy is included in the LICENSE file that
	 * accompanied this code).
	 *
	 * You should have received a copy of the GNU General Public License version
	 * 2 along with this work; if not, write to the Free Software Foundation,
	 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
	 *
	 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
	 * or visit www.oracle.com if you need additional information or have any
	 * questions.
	 */

	/*
	 * We used part of Netscape's Java Runtime Interface (JRI) as the starting
	 * point of our design and implementation.
	 */

	/******************************************************************************
	 * Java Runtime Interface
	 * Copyright (c) 1996 Netscape Communications Corporation. All rights reserved.
	 *****************************************************************************/

	private static final String JNI_MH_H;

	static {
		switch ( Platform.get() ) {
			case LINUX:
				JNI_MH_H =
					"#ifndef __has_attribute\n" +
						"  #define __has_attribute(x) 0\n" +
						"#endif\n" +
						"#if (defined(__GNUC__) && ((__GNUC__ > 4) || (__GNUC__ == 4) && (__GNUC_MINOR__ > 2))) || __has_attribute(visibility)\n" +
						"  #define JNIEXPORT     __attribute__((visibility(\"default\")))\n" +
						"  #define JNIIMPORT     __attribute__((visibility(\"default\")))\n" +
						"#else\n" +
						"  #define JNIEXPORT\n" +
						"  #define JNIIMPORT\n" +
						"#endif\n" +
						"\n" +
						"#define JNICALL\n" +
						"\n" +
						"typedef int jint;\n" +
						"#ifdef _LP64 /* 64-bit Solaris */\n" +
						"typedef long jlong;\n" +
						"#else\n" +
						"typedef long long jlong;\n" +
						"#endif\n" +
						"\n" +
						"typedef signed char jbyte;";
				break;
			case MACOSX:
				JNI_MH_H =
					"#define JNIEXPORT     __attribute__((visibility(\"default\")))\n" +
						"#define JNIIMPORT     __attribute__((visibility(\"default\")))\n" +
						"#define JNICALL\n" +
						"\n" +
						"typedef int jint;\n" +
						"#ifdef _LP64 /* 64-bit */\n" +
						"typedef long jlong;\n" +
						"#else\n" +
						"typedef long long jlong;\n" +
						"#endif\n" +
						"\n" +
						"typedef signed char jbyte;";
				break;
			case WINDOWS:
				JNI_MH_H =
					"#define __declspec(x) __attribute__((x))\n" +
						"#ifdef _WIN64\n" +
						"    #define __stdcall\n" +
						"#else\n" +
						"    #define __stdcall __attribute__((__stdcall__))\n" +
						"#endif\n" +
						"\n" +
						"#define JNIEXPORT __declspec(dllexport)\n" +
						"#define JNIIMPORT __declspec(dllimport)\n" +
						"#define JNICALL __stdcall\n" +
						"\n" +
						"#define __int8 char\n" +
						"#define __int16 short\n" +
						"#define __int32 int\n" +
						"#define __int64 long long\n" +
						"\n" +
						"typedef long jint;\n" +
						"typedef __int64 jlong;\n" +
						"typedef signed char jbyte;";
				break;
			default:
				throw new IllegalStateException();
		}
	}

	public static final String JNI_H =
		"#ifndef _JAVASOFT_JNI_H_\n" +
			"#define _JAVASOFT_JNI_H_\n" +
			"\n" +
			"typedef __SIZE_TYPE__ size_t;\n" +
			"typedef __PTRDIFF_TYPE__ ssize_t;\n" +
			"typedef __WCHAR_TYPE__ wchar_t;\n" +
			"typedef __PTRDIFF_TYPE__ ptrdiff_t;\n" +
			"typedef __PTRDIFF_TYPE__ intptr_t;\n" +
			"typedef __SIZE_TYPE__ uintptr_t;\n" +
			"\n" +
			"#ifndef __int8_t_defined\n" +
			"#define __int8_t_defined\n" +
			"typedef signed char int8_t;\n" +
			"typedef signed short int int16_t;\n" +
			"typedef signed int int32_t;\n" +
			"typedef signed long long int int64_t;\n" +
			"typedef unsigned char uint8_t;\n" +
			"typedef unsigned short int uint16_t;\n" +
			"typedef unsigned int uint32_t;\n" +
			"typedef unsigned long long int uint64_t;\n" +
			"#endif\n" +
			"\n" +
			"#ifndef NULL\n" +
			"#define NULL ((void*)0)\n" +
			"#endif\n" +
			"\n" +
			"#define offsetof(type, field) ((size_t)&((type *)0)->field)\n" +
			"\n" +
			"void *alloca(size_t size);\n" +
			"\n" +
			"#ifndef _JAVASOFT_JNI_MD_H_\n" +
			"#define _JAVASOFT_JNI_MD_H_\n" +
			"\n" +
			JNI_MH_H +
			"\n" +
			"#endif /* !_JAVASOFT_JNI_MD_H_ */\n" +
			"\n" +
			"#ifndef _STDARG_H\n" +
			"#define _STDARG_H\n" +
			"\n" +
			"#ifdef __x86_64__\n" +
			"#ifndef _WIN64\n" +
			"\n" +
			"typedef struct {\n" +
			"    unsigned int gp_offset;\n" +
			"    unsigned int fp_offset;\n" +
			"    union {\n" +
			"        unsigned int overflow_offset;\n" +
			"        char *overflow_arg_area;\n" +
			"    };\n" +
			"    char *reg_save_area;\n" +
			"} __va_list_struct;\n" +
			"\n" +
			"typedef __va_list_struct va_list[1];\n" +
			"\n" +
			"void __va_start(__va_list_struct *ap, void *fp);\n" +
			"void *__va_arg(__va_list_struct *ap, int arg_type, int size, int align);\n" +
			"\n" +
			"#define va_start(ap, last) __va_start(ap, __builtin_frame_address(0))\n" +
			"#define va_arg(ap, type)                                                \\\n" +
			"    (*(type *)(__va_arg(ap, __builtin_va_arg_types(type), sizeof(type), __alignof__(type))))\n" +
			"#define va_copy(dest, src) (*(dest) = *(src))\n" +
			"#define va_end(ap)\n" +
			"\n" +
			"#define _VA_LIST_T\n" +
			"\n" +
			"#else /* _WIN64 */\n" +
			"typedef char *va_list;\n" +
			"#define va_start(ap,last) __builtin_va_start(ap,last)\n" +
			"#define va_arg(ap, t) ((sizeof(t) > 8 || (sizeof(t) & (sizeof(t) - 1))) \\\n" +
			"\t? **(t **)((ap += 8) - 8) : *(t  *)((ap += 8) - 8))\n" +
			"#define va_copy(dest, src) ((dest) = (src))\n" +
			"#define va_end(ap)\n" +
			"#endif\n" +
			"\n" +
			"#elif __arm__\n" +
			"typedef char *va_list;\n" +
			"#define _tcc_alignof(type) ((int)&((struct {char c;type x;} *)0)->x)\n" +
			"#define _tcc_align(addr,type) (((unsigned)addr + _tcc_alignof(type) - 1) \\\n" +
			"                               & ~(_tcc_alignof(type) - 1))\n" +
			"#define va_start(ap,last) ap = ((char *)&(last)) + ((sizeof(last)+3)&~3)\n" +
			"#define va_arg(ap,type) (ap = (void *) ((_tcc_align(ap,type)+sizeof(type)+3) \\\n" +
			"                        &~3), *(type *)(ap - ((sizeof(type)+3)&~3)))\n" +
			"#define va_copy(dest, src) (dest) = (src)\n" +
			"#define va_end(ap)\n" +
			"\n" +
			"#elif defined(__aarch64__)\n" +
			"typedef struct {\n" +
			"    void *__stack;\n" +
			"    void *__gr_top;\n" +
			"    void *__vr_top;\n" +
			"    int   __gr_offs;\n" +
			"    int   __vr_offs;\n" +
			"} va_list;\n" +
			"#define va_start(ap, last) __va_start(ap, last)\n" +
			"#define va_arg(ap, type) __va_arg(ap, type)\n" +
			"#define va_end(ap)\n" +
			"#define va_copy(dest, src) ((dest) = (src))\n" +
			"\n" +
			"#else /* __i386__ */\n" +
			"typedef char *va_list;\n" +
			"#define va_start(ap,last) ap = ((char *)&(last)) + ((sizeof(last)+3)&~3)\n" +
			"#define va_arg(ap,type) (ap += (sizeof(type)+3)&~3, *(type *)(ap - ((sizeof(type)+3)&~3)))\n" +
			"#define va_copy(dest, src) (dest) = (src)\n" +
			"#define va_end(ap)\n" +
			"#endif\n" +
			"\n" +
			"typedef va_list __gnuc_va_list;\n" +
			"#define _VA_LIST_DEFINED\n" +
			"\n" +
			"#endif /* _STDARG_H */\n" +
			"\n" +
			"typedef unsigned char   jboolean;\n" +
			"typedef unsigned short  jchar;\n" +
			"typedef short           jshort;\n" +
			"typedef float           jfloat;\n" +
			"typedef double          jdouble;\n" +
			"\n" +
			"typedef jint            jsize;\n" +
			"\n" +
			"struct _jobject;\n" +
			"\n" +
			"typedef struct _jobject *jobject;\n" +
			"typedef jobject jclass;\n" +
			"typedef jobject jthrowable;\n" +
			"typedef jobject jstring;\n" +
			"typedef jobject jarray;\n" +
			"typedef jarray jbooleanArray;\n" +
			"typedef jarray jbyteArray;\n" +
			"typedef jarray jcharArray;\n" +
			"typedef jarray jshortArray;\n" +
			"typedef jarray jintArray;\n" +
			"typedef jarray jlongArray;\n" +
			"typedef jarray jfloatArray;\n" +
			"typedef jarray jdoubleArray;\n" +
			"typedef jarray jobjectArray;\n" +
			"\n" +
			"typedef jobject jweak;\n" +
			"\n" +
			"typedef union jvalue {\n" +
			"    jboolean z;\n" +
			"    jbyte    b;\n" +
			"    jchar    c;\n" +
			"    jshort   s;\n" +
			"    jint     i;\n" +
			"    jlong    j;\n" +
			"    jfloat   f;\n" +
			"    jdouble  d;\n" +
			"    jobject  l;\n" +
			"} jvalue;\n" +
			"\n" +
			"struct _jfieldID;\n" +
			"typedef struct _jfieldID *jfieldID;\n" +
			"\n" +
			"struct _jmethodID;\n" +
			"typedef struct _jmethodID *jmethodID;\n" +
			"\n" +
			"typedef enum _jobjectType {\n" +
			"     JNIInvalidRefType    = 0,\n" +
			"     JNILocalRefType      = 1,\n" +
			"     JNIGlobalRefType     = 2,\n" +
			"     JNIWeakGlobalRefType = 3\n" +
			"} jobjectRefType;\n" +
			"\n" +
			"#define JNI_FALSE 0\n" +
			"#define JNI_TRUE 1\n" +
			"\n" +
			"#define JNI_OK           0\n" +
			"#define JNI_ERR          (-1)\n" +
			"#define JNI_EDETACHED    (-2)\n" +
			"#define JNI_EVERSION     (-3)\n" +
			"#define JNI_ENOMEM       (-4)\n" +
			"#define JNI_EEXIST       (-5)\n" +
			"#define JNI_EINVAL       (-6)\n" +
			"\n" +
			"#define JNI_COMMIT 1\n" +
			"#define JNI_ABORT 2\n" +
			"\n" +
			"typedef struct {\n" +
			"    char *name;\n" +
			"    char *signature;\n" +
			"    void *fnPtr;\n" +
			"} JNINativeMethod;\n" +
			"\n" +
			"struct JNINativeInterface_;\n" +
			"typedef const struct JNINativeInterface_ *JNIEnv;\n" +
			"\n" +
			"struct JNIInvokeInterface_;\n" +
			"typedef const struct JNIInvokeInterface_ *JavaVM;\n" +
			"\n" +
			"struct JNINativeInterface_ {\n" +
			"    void *reserved0;\n" +
			"    void *reserved1;\n" +
			"    void *reserved2;\n" +
			"\n" +
			"    void *reserved3;\n" +
			"    jint (JNICALL *GetVersion)(JNIEnv *env);\n" +
			"\n" +
			"    jclass (JNICALL *DefineClass)(JNIEnv *env, const char *name, jobject loader, const jbyte *buf, jsize len);\n" +
			"    jclass (JNICALL *FindClass)(JNIEnv *env, const char *name);\n" +
			"\n" +
			"    jmethodID (JNICALL *FromReflectedMethod)(JNIEnv *env, jobject method);\n" +
			"    jfieldID (JNICALL *FromReflectedField)(JNIEnv *env, jobject field);\n" +
			"\n" +
			"    jobject (JNICALL *ToReflectedMethod)(JNIEnv *env, jclass cls, jmethodID methodID, jboolean isStatic);\n" +
			"\n" +
			"    jclass (JNICALL *GetSuperclass)(JNIEnv *env, jclass sub);\n" +
			"    jboolean (JNICALL *IsAssignableFrom)(JNIEnv *env, jclass sub, jclass sup);\n" +
			"\n" +
			"    jobject (JNICALL *ToReflectedField)(JNIEnv *env, jclass cls, jfieldID fieldID, jboolean isStatic);\n" +
			"\n" +
			"    jint (JNICALL *Throw)(JNIEnv *env, jthrowable obj);\n" +
			"    jint (JNICALL *ThrowNew)(JNIEnv *env, jclass clazz, const char *msg);\n" +
			"    jthrowable (JNICALL *ExceptionOccurred)(JNIEnv *env);\n" +
			"    void (JNICALL *ExceptionDescribe)(JNIEnv *env);\n" +
			"    void (JNICALL *ExceptionClear)(JNIEnv *env);\n" +
			"    void (JNICALL *FatalError)(JNIEnv *env, const char *msg);\n" +
			"\n" +
			"    jint (JNICALL *PushLocalFrame)(JNIEnv *env, jint capacity);\n" +
			"    jobject (JNICALL *PopLocalFrame)(JNIEnv *env, jobject result);\n" +
			"\n" +
			"    jobject (JNICALL *NewGlobalRef)(JNIEnv *env, jobject lobj);\n" +
			"    void (JNICALL *DeleteGlobalRef)(JNIEnv *env, jobject gref);\n" +
			"    void (JNICALL *DeleteLocalRef)(JNIEnv *env, jobject obj);\n" +
			"    jboolean (JNICALL *IsSameObject)(JNIEnv *env, jobject obj1, jobject obj2);\n" +
			"    jobject (JNICALL *NewLocalRef)(JNIEnv *env, jobject ref);\n" +
			"    jint (JNICALL *EnsureLocalCapacity)(JNIEnv *env, jint capacity);\n" +
			"\n" +
			"    jobject (JNICALL *AllocObject)(JNIEnv *env, jclass clazz);\n" +
			"    jobject (JNICALL *NewObject)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jobject (JNICALL *NewObjectV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jobject (JNICALL *NewObjectA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jclass (JNICALL *GetObjectClass)(JNIEnv *env, jobject obj);\n" +
			"    jboolean (JNICALL *IsInstanceOf)(JNIEnv *env, jobject obj, jclass clazz);\n" +
			"\n" +
			"    jmethodID (JNICALL *GetMethodID)(JNIEnv *env, jclass clazz, const char *name, const char *sig);\n" +
			"\n" +
			"    jobject (JNICALL *CallObjectMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jobject (JNICALL *CallObjectMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jobject (JNICALL *CallObjectMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue * args);\n" +
			"\n" +
			"    jboolean (JNICALL *CallBooleanMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jboolean (JNICALL *CallBooleanMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jboolean (JNICALL *CallBooleanMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue * args);\n" +
			"\n" +
			"    jbyte (JNICALL *CallByteMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jbyte (JNICALL *CallByteMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jbyte (JNICALL *CallByteMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jchar (JNICALL *CallCharMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jchar (JNICALL *CallCharMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jchar (JNICALL *CallCharMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jshort (JNICALL *CallShortMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jshort (JNICALL *CallShortMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jshort (JNICALL *CallShortMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jint (JNICALL *CallIntMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jint (JNICALL *CallIntMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jint (JNICALL *CallIntMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jlong (JNICALL *CallLongMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jlong (JNICALL *CallLongMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jlong (JNICALL *CallLongMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jfloat (JNICALL *CallFloatMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jfloat (JNICALL *CallFloatMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jfloat (JNICALL *CallFloatMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jdouble (JNICALL *CallDoubleMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    jdouble (JNICALL *CallDoubleMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    jdouble (JNICALL *CallDoubleMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    void (JNICALL *CallVoidMethod)(JNIEnv *env, jobject obj, jmethodID methodID, ...);\n" +
			"    void (JNICALL *CallVoidMethodV)(JNIEnv *env, jobject obj, jmethodID methodID, va_list args);\n" +
			"    void (JNICALL *CallVoidMethodA)(JNIEnv *env, jobject obj, jmethodID methodID, const jvalue * args);\n" +
			"\n" +
			"    jobject (JNICALL *CallNonvirtualObjectMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jobject (JNICALL *CallNonvirtualObjectMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jobject (JNICALL *CallNonvirtualObjectMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue * args);\n" +
			"\n" +
			"    jboolean (JNICALL *CallNonvirtualBooleanMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jboolean (JNICALL *CallNonvirtualBooleanMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jboolean (JNICALL *CallNonvirtualBooleanMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue * args);\n" +
			"\n" +
			"    jbyte (JNICALL *CallNonvirtualByteMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jbyte (JNICALL *CallNonvirtualByteMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jbyte (JNICALL *CallNonvirtualByteMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jchar (JNICALL *CallNonvirtualCharMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jchar (JNICALL *CallNonvirtualCharMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jchar (JNICALL *CallNonvirtualCharMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jshort (JNICALL *CallNonvirtualShortMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jshort (JNICALL *CallNonvirtualShortMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jshort (JNICALL *CallNonvirtualShortMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jint (JNICALL *CallNonvirtualIntMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jint (JNICALL *CallNonvirtualIntMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jint (JNICALL *CallNonvirtualIntMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jlong (JNICALL *CallNonvirtualLongMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jlong (JNICALL *CallNonvirtualLongMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jlong (JNICALL *CallNonvirtualLongMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jfloat (JNICALL *CallNonvirtualFloatMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jfloat (JNICALL *CallNonvirtualFloatMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jfloat (JNICALL *CallNonvirtualFloatMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jdouble (JNICALL *CallNonvirtualDoubleMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    jdouble (JNICALL *CallNonvirtualDoubleMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jdouble (JNICALL *CallNonvirtualDoubleMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    void (JNICALL *CallNonvirtualVoidMethod)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, ...);\n" +
			"    void (JNICALL *CallNonvirtualVoidMethodV)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    void (JNICALL *CallNonvirtualVoidMethodA)(JNIEnv *env, jobject obj, jclass clazz, jmethodID methodID, const jvalue * args);\n" +
			"\n" +
			"    jfieldID (JNICALL *GetFieldID)(JNIEnv *env, jclass clazz, const char *name, const char *sig);\n" +
			"\n" +
			"    jobject (JNICALL *GetObjectField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jboolean (JNICALL *GetBooleanField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jbyte (JNICALL *GetByteField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jchar (JNICALL *GetCharField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jshort (JNICALL *GetShortField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jint (JNICALL *GetIntField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jlong (JNICALL *GetLongField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jfloat (JNICALL *GetFloatField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"    jdouble (JNICALL *GetDoubleField)(JNIEnv *env, jobject obj, jfieldID fieldID);\n" +
			"\n" +
			"    void (JNICALL *SetObjectField)(JNIEnv *env, jobject obj, jfieldID fieldID, jobject val);\n" +
			"    void (JNICALL *SetBooleanField)(JNIEnv *env, jobject obj, jfieldID fieldID, jboolean val);\n" +
			"    void (JNICALL *SetByteField)(JNIEnv *env, jobject obj, jfieldID fieldID, jbyte val);\n" +
			"    void (JNICALL *SetCharField)(JNIEnv *env, jobject obj, jfieldID fieldID, jchar val);\n" +
			"    void (JNICALL *SetShortField)(JNIEnv *env, jobject obj, jfieldID fieldID, jshort val);\n" +
			"    void (JNICALL *SetIntField)(JNIEnv *env, jobject obj, jfieldID fieldID, jint val);\n" +
			"    void (JNICALL *SetLongField)(JNIEnv *env, jobject obj, jfieldID fieldID, jlong val);\n" +
			"    void (JNICALL *SetFloatField)(JNIEnv *env, jobject obj, jfieldID fieldID, jfloat val);\n" +
			"    void (JNICALL *SetDoubleField)(JNIEnv *env, jobject obj, jfieldID fieldID, jdouble val);\n" +
			"\n" +
			"    jmethodID (JNICALL *GetStaticMethodID)(JNIEnv *env, jclass clazz, const char *name, const char *sig);\n" +
			"\n" +
			"    jobject (JNICALL *CallStaticObjectMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jobject (JNICALL *CallStaticObjectMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jobject (JNICALL *CallStaticObjectMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jboolean (JNICALL *CallStaticBooleanMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jboolean (JNICALL *CallStaticBooleanMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jboolean (JNICALL *CallStaticBooleanMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jbyte (JNICALL *CallStaticByteMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jbyte (JNICALL *CallStaticByteMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jbyte (JNICALL *CallStaticByteMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jchar (JNICALL *CallStaticCharMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jchar (JNICALL *CallStaticCharMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jchar (JNICALL *CallStaticCharMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jshort (JNICALL *CallStaticShortMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jshort (JNICALL *CallStaticShortMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jshort (JNICALL *CallStaticShortMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jint (JNICALL *CallStaticIntMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jint (JNICALL *CallStaticIntMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jint (JNICALL *CallStaticIntMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jlong (JNICALL *CallStaticLongMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jlong (JNICALL *CallStaticLongMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jlong (JNICALL *CallStaticLongMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jfloat (JNICALL *CallStaticFloatMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jfloat (JNICALL *CallStaticFloatMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jfloat (JNICALL *CallStaticFloatMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    jdouble (JNICALL *CallStaticDoubleMethod)(JNIEnv *env, jclass clazz, jmethodID methodID, ...);\n" +
			"    jdouble (JNICALL *CallStaticDoubleMethodV)(JNIEnv *env, jclass clazz, jmethodID methodID, va_list args);\n" +
			"    jdouble (JNICALL *CallStaticDoubleMethodA)(JNIEnv *env, jclass clazz, jmethodID methodID, const jvalue *args);\n" +
			"\n" +
			"    void (JNICALL *CallStaticVoidMethod)(JNIEnv *env, jclass cls, jmethodID methodID, ...);\n" +
			"    void (JNICALL *CallStaticVoidMethodV)(JNIEnv *env, jclass cls, jmethodID methodID, va_list args);\n" +
			"    void (JNICALL *CallStaticVoidMethodA)(JNIEnv *env, jclass cls, jmethodID methodID, const jvalue * args);\n" +
			"\n" +
			"    jfieldID (JNICALL *GetStaticFieldID)(JNIEnv *env, jclass clazz, const char *name, const char *sig);\n" +
			"    jobject (JNICALL *GetStaticObjectField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jboolean (JNICALL *GetStaticBooleanField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jbyte (JNICALL *GetStaticByteField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jchar (JNICALL *GetStaticCharField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jshort (JNICALL *GetStaticShortField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jint (JNICALL *GetStaticIntField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jlong (JNICALL *GetStaticLongField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jfloat (JNICALL *GetStaticFloatField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"    jdouble (JNICALL *GetStaticDoubleField)(JNIEnv *env, jclass clazz, jfieldID fieldID);\n" +
			"\n" +
			"    void (JNICALL *SetStaticObjectField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jobject value);\n" +
			"    void (JNICALL *SetStaticBooleanField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jboolean value);\n" +
			"    void (JNICALL *SetStaticByteField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jbyte value);\n" +
			"    void (JNICALL *SetStaticCharField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jchar value);\n" +
			"    void (JNICALL *SetStaticShortField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jshort value);\n" +
			"    void (JNICALL *SetStaticIntField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jint value);\n" +
			"    void (JNICALL *SetStaticLongField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jlong value);\n" +
			"    void (JNICALL *SetStaticFloatField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jfloat value);\n" +
			"    void (JNICALL *SetStaticDoubleField)(JNIEnv *env, jclass clazz, jfieldID fieldID, jdouble value);\n" +
			"\n" +
			"    jstring (JNICALL *NewString)(JNIEnv *env, const jchar *unicode, jsize len);\n" +
			"    jsize (JNICALL *GetStringLength)(JNIEnv *env, jstring str);\n" +
			"    const jchar *(JNICALL *GetStringChars)(JNIEnv *env, jstring str, jboolean *isCopy);\n" +
			"    void (JNICALL *ReleaseStringChars)(JNIEnv *env, jstring str, const jchar *chars);\n" +
			"\n" +
			"    jstring (JNICALL *NewStringUTF)(JNIEnv *env, const char *utf);\n" +
			"    jsize (JNICALL *GetStringUTFLength)(JNIEnv *env, jstring str);\n" +
			"    const char* (JNICALL *GetStringUTFChars)(JNIEnv *env, jstring str, jboolean *isCopy);\n" +
			"    void (JNICALL *ReleaseStringUTFChars)(JNIEnv *env, jstring str, const char* chars);\n" +
			"\n" +
			"    jsize (JNICALL *GetArrayLength)(JNIEnv *env, jarray array);\n" +
			"\n" +
			"    jobjectArray (JNICALL *NewObjectArray)(JNIEnv *env, jsize len, jclass clazz, jobject init);\n" +
			"    jobject (JNICALL *GetObjectArrayElement)(JNIEnv *env, jobjectArray array, jsize index);\n" +
			"    void (JNICALL *SetObjectArrayElement)(JNIEnv *env, jobjectArray array, jsize index, jobject val);\n" +
			"\n" +
			"    jbooleanArray (JNICALL *NewBooleanArray)(JNIEnv *env, jsize len);\n" +
			"    jbyteArray (JNICALL *NewByteArray)(JNIEnv *env, jsize len);\n" +
			"    jcharArray (JNICALL *NewCharArray)(JNIEnv *env, jsize len);\n" +
			"    jshortArray (JNICALL *NewShortArray)(JNIEnv *env, jsize len);\n" +
			"    jintArray (JNICALL *NewIntArray)(JNIEnv *env, jsize len);\n" +
			"    jlongArray (JNICALL *NewLongArray)(JNIEnv *env, jsize len);\n" +
			"    jfloatArray (JNICALL *NewFloatArray)(JNIEnv *env, jsize len);\n" +
			"    jdoubleArray (JNICALL *NewDoubleArray)(JNIEnv *env, jsize len);\n" +
			"\n" +
			"    jboolean * (JNICALL *GetBooleanArrayElements)(JNIEnv *env, jbooleanArray array, jboolean *isCopy);\n" +
			"    jbyte * (JNICALL *GetByteArrayElements)(JNIEnv *env, jbyteArray array, jboolean *isCopy);\n" +
			"    jchar * (JNICALL *GetCharArrayElements)(JNIEnv *env, jcharArray array, jboolean *isCopy);\n" +
			"    jshort * (JNICALL *GetShortArrayElements)(JNIEnv *env, jshortArray array, jboolean *isCopy);\n" +
			"    jint * (JNICALL *GetIntArrayElements)(JNIEnv *env, jintArray array, jboolean *isCopy);\n" +
			"    jlong * (JNICALL *GetLongArrayElements)(JNIEnv *env, jlongArray array, jboolean *isCopy);\n" +
			"    jfloat * (JNICALL *GetFloatArrayElements)(JNIEnv *env, jfloatArray array, jboolean *isCopy);\n" +
			"    jdouble * (JNICALL *GetDoubleArrayElements)(JNIEnv *env, jdoubleArray array, jboolean *isCopy);\n" +
			"\n" +
			"    void (JNICALL *ReleaseBooleanArrayElements)(JNIEnv *env, jbooleanArray array, jboolean *elems, jint mode);\n" +
			"    void (JNICALL *ReleaseByteArrayElements)(JNIEnv *env, jbyteArray array, jbyte *elems, jint mode);\n" +
			"    void (JNICALL *ReleaseCharArrayElements)(JNIEnv *env, jcharArray array, jchar *elems, jint mode);\n" +
			"    void (JNICALL *ReleaseShortArrayElements)(JNIEnv *env, jshortArray array, jshort *elems, jint mode);\n" +
			"    void (JNICALL *ReleaseIntArrayElements)(JNIEnv *env, jintArray array, jint *elems, jint mode);\n" +
			"    void (JNICALL *ReleaseLongArrayElements)(JNIEnv *env, jlongArray array, jlong *elems, jint mode);\n" +
			"    void (JNICALL *ReleaseFloatArrayElements)(JNIEnv *env, jfloatArray array, jfloat *elems, jint mode);\n" +
			"    void (JNICALL *ReleaseDoubleArrayElements)(JNIEnv *env, jdoubleArray array, jdouble *elems, jint mode);\n" +
			"\n" +
			"    void (JNICALL *GetBooleanArrayRegion)(JNIEnv *env, jbooleanArray array, jsize start, jsize l, jboolean *buf);\n" +
			"    void (JNICALL *GetByteArrayRegion)(JNIEnv *env, jbyteArray array, jsize start, jsize len, jbyte *buf);\n" +
			"    void (JNICALL *GetCharArrayRegion)(JNIEnv *env, jcharArray array, jsize start, jsize len, jchar *buf);\n" +
			"    void (JNICALL *GetShortArrayRegion)(JNIEnv *env, jshortArray array, jsize start, jsize len, jshort *buf);\n" +
			"    void (JNICALL *GetIntArrayRegion)(JNIEnv *env, jintArray array, jsize start, jsize len, jint *buf);\n" +
			"    void (JNICALL *GetLongArrayRegion)(JNIEnv *env, jlongArray array, jsize start, jsize len, jlong *buf);\n" +
			"    void (JNICALL *GetFloatArrayRegion)(JNIEnv *env, jfloatArray array, jsize start, jsize len, jfloat *buf);\n" +
			"    void (JNICALL *GetDoubleArrayRegion)(JNIEnv *env, jdoubleArray array, jsize start, jsize len, jdouble *buf);\n" +
			"\n" +
			"    void (JNICALL *SetBooleanArrayRegion)(JNIEnv *env, jbooleanArray array, jsize start, jsize l, const jboolean *buf);\n" +
			"    void (JNICALL *SetByteArrayRegion)(JNIEnv *env, jbyteArray array, jsize start, jsize len, const jbyte *buf);\n" +
			"    void (JNICALL *SetCharArrayRegion)(JNIEnv *env, jcharArray array, jsize start, jsize len, const jchar *buf);\n" +
			"    void (JNICALL *SetShortArrayRegion)(JNIEnv *env, jshortArray array, jsize start, jsize len, const jshort *buf);\n" +
			"    void (JNICALL *SetIntArrayRegion)(JNIEnv *env, jintArray array, jsize start, jsize len, const jint *buf);\n" +
			"    void (JNICALL *SetLongArrayRegion)(JNIEnv *env, jlongArray array, jsize start, jsize len, const jlong *buf);\n" +
			"    void (JNICALL *SetFloatArrayRegion)(JNIEnv *env, jfloatArray array, jsize start, jsize len, const jfloat *buf);\n" +
			"    void (JNICALL *SetDoubleArrayRegion)(JNIEnv *env, jdoubleArray array, jsize start, jsize len, const jdouble *buf);\n" +
			"\n" +
			"    jint (JNICALL *RegisterNatives)(JNIEnv *env, jclass clazz, const JNINativeMethod *methods, jint nMethods);\n" +
			"    jint (JNICALL *UnregisterNatives)(JNIEnv *env, jclass clazz);\n" +
			"\n" +
			"    jint (JNICALL *MonitorEnter)(JNIEnv *env, jobject obj);\n" +
			"    jint (JNICALL *MonitorExit)(JNIEnv *env, jobject obj);\n" +
			"\n" +
			"    jint (JNICALL *GetJavaVM)(JNIEnv *env, JavaVM **vm);\n" +
			"\n" +
			"    void (JNICALL *GetStringRegion)(JNIEnv *env, jstring str, jsize start, jsize len, jchar *buf);\n" +
			"    void (JNICALL *GetStringUTFRegion)(JNIEnv *env, jstring str, jsize start, jsize len, char *buf);\n" +
			"\n" +
			"    void * (JNICALL *GetPrimitiveArrayCritical)(JNIEnv *env, jarray array, jboolean *isCopy);\n" +
			"    void (JNICALL *ReleasePrimitiveArrayCritical)(JNIEnv *env, jarray array, void *carray, jint mode);\n" +
			"\n" +
			"    const jchar * (JNICALL *GetStringCritical)(JNIEnv *env, jstring string, jboolean *isCopy);\n" +
			"    void (JNICALL *ReleaseStringCritical)(JNIEnv *env, jstring string, const jchar *cstring);\n" +
			"\n" +
			"    jweak (JNICALL *NewWeakGlobalRef)(JNIEnv *env, jobject obj);\n" +
			"    void (JNICALL *DeleteWeakGlobalRef)(JNIEnv *env, jweak ref);\n" +
			"\n" +
			"    jboolean (JNICALL *ExceptionCheck)(JNIEnv *env);\n" +
			"\n" +
			"    jobject (JNICALL *NewDirectByteBuffer)(JNIEnv* env, void* address, jlong capacity);\n" +
			"    void* (JNICALL *GetDirectBufferAddress)(JNIEnv* env, jobject buf);\n" +
			"    jlong (JNICALL *GetDirectBufferCapacity)(JNIEnv* env, jobject buf);\n" +
			"\n" +
			"    jobjectRefType (JNICALL *GetObjectRefType)(JNIEnv* env, jobject obj);\n" +
			"\n" +
			"    jobject (JNICALL *GetModule)(JNIEnv* env, jclass clazz);\n" +
			"};\n" +
			"\n" +
			"struct JNIEnv_ {\n" +
			"    const struct JNINativeInterface_ *functions;\n" +
			"};\n" +
			"\n" +
			"typedef struct JavaVMOption {\n" +
			"    char *optionString;\n" +
			"    void *extraInfo;\n" +
			"} JavaVMOption;\n" +
			"\n" +
			"typedef struct JavaVMInitArgs {\n" +
			"    jint version;\n" +
			"\n" +
			"    jint nOptions;\n" +
			"    JavaVMOption *options;\n" +
			"    jboolean ignoreUnrecognized;\n" +
			"} JavaVMInitArgs;\n" +
			"\n" +
			"typedef struct JavaVMAttachArgs {\n" +
			"    jint version;\n" +
			"\n" +
			"    char *name;\n" +
			"    jobject group;\n" +
			"} JavaVMAttachArgs;\n" +
			"\n" +
			"#define JDK1_2\n" +
			"#define JDK1_4\n" +
			"\n" +
			"struct JNIInvokeInterface_ {\n" +
			"    void *reserved0;\n" +
			"    void *reserved1;\n" +
			"    void *reserved2;\n" +
			"\n" +
			"    jint (JNICALL *DestroyJavaVM)(JavaVM *vm);\n" +
			"\n" +
			"    jint (JNICALL *AttachCurrentThread)(JavaVM *vm, void **penv, void *args);\n" +
			"\n" +
			"    jint (JNICALL *DetachCurrentThread)(JavaVM *vm);\n" +
			"\n" +
			"    jint (JNICALL *GetEnv)(JavaVM *vm, void **penv, jint version);\n" +
			"\n" +
			"    jint (JNICALL *AttachCurrentThreadAsDaemon)(JavaVM *vm, void **penv, void *args);\n" +
			"};\n" +
			"\n" +
			"struct JavaVM_ {\n" +
			"    const struct JNIInvokeInterface_ *functions;\n" +
			"};\n" +
			"\n" +
			"#define _JNI_IMPORT_OR_EXPORT_ JNIIMPORT\n" +
			"\n" +
			"_JNI_IMPORT_OR_EXPORT_ jint JNICALL\n" +
			"JNI_GetDefaultJavaVMInitArgs(void *args);\n" +
			"\n" +
			"_JNI_IMPORT_OR_EXPORT_ jint JNICALL\n" +
			"JNI_CreateJavaVM(JavaVM **pvm, void **penv, void *args);\n" +
			"\n" +
			"_JNI_IMPORT_OR_EXPORT_ jint JNICALL\n" +
			"JNI_GetCreatedJavaVMs(JavaVM **, jsize, jsize *);\n" +
			"\n" +
			"JNIEXPORT jint JNICALL\n" +
			"JNI_OnLoad(JavaVM *vm, void *reserved);\n" +
			"\n" +
			"JNIEXPORT void JNICALL\n" +
			"JNI_OnUnload(JavaVM *vm, void *reserved);\n" +
			"\n" +
			"#define JNI_VERSION_1_1 0x00010001\n" +
			"#define JNI_VERSION_1_2 0x00010002\n" +
			"#define JNI_VERSION_1_4 0x00010004\n" +
			"#define JNI_VERSION_1_6 0x00010006\n" +
			"#define JNI_VERSION_1_8 0x00010008\n" +
			"#define JNI_VERSION_9   0x00090000\n" +
			"\n" +
			"#endif /* !_JAVASOFT_JNI_H_ */\n";

	public static final ByteBuffer JNI_H_BYTES;

	static {
		memASCII(JNI_H, false, JNI_H_BYTES = BufferUtils.createByteBuffer(JNI_H.length()));
	}

	private JNITinyHeader() {
	}

	/**
	 * Returns a ByteBuffer that contains the encoded JNI header and the specified source.
	 *
	 * <p>The returned ByteBuffer must be explicitly deaLlocated.</p>
	 *
	 * @param source the input source
	 *
	 * @return the concatenated source
	 */
	public static ByteBuffer prependJNIHeader(String source) {
		return prependJNIHeader(
			source,
			memAlloc(JNI_H_BYTES.capacity() + source.length() + 1)
		);
	}

	/**
	 * Returns a ByteBuffer that contains the encoded JNI header and the specified source.
	 *
	 * @param source the input source
	 * @param stack  the stack on which to allocate the ByteBuffer. A stack frame must already be pushed.
	 *
	 * @return the concatenated source
	 */
	public static ByteBuffer prependJNIHeader(String source, MemoryStack stack) {
		return prependJNIHeader(
			source,
			stack.malloc(JNI_H_BYTES.capacity() + source.length() + 1)
		);
	}

	/**
	 * Encoded the JNI header and the specified source to the specified buffer.
	 *
	 * <p>The buffer must be large enough to contain both the JNI header and the specified source.</p>
	 *
	 * @param source the input source
	 * @param buffer the target buffer
	 *
	 * @return the concatenated source
	 */
	public static ByteBuffer prependJNIHeader(String source, ByteBuffer buffer) {
		if ( DEBUG )
			checkBuffer(source, buffer);

		memCopy(
			memAddress(JNI_H_BYTES),
			memAddress(buffer),
			JNI_H_BYTES.capacity()
		);

		memASCII(source, true, buffer, JNI_H_BYTES.capacity());

		return buffer;
	}

	private static void checkBuffer(String source, ByteBuffer buffer) {
		if ( DEBUG && buffer.remaining() < JNI_H_BYTES.capacity() + source.length() + 1 )
			throw new BufferOverflowException();
	}

}