/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.*

/** Deduplicates JNI signatures from bindings and generates the org.lwjgl.system.JNI class. */
object JNI : GeneratorTargetNative("org.lwjgl.system", "JNI") {

	private val signatures = TreeSet<Signature>()

	fun register(function: NativeClassFunction) = signatures.add(Signature(function))

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")
		print(
"""/**
 * This class contains native methods that can be used to call dynamically loaded functions. It is used internally by the LWJGL bindings, but can also be used
 * to call other dynamically loaded functions. Not all possible signatures are available, only those needed by the LWJGL bindings. To call a function that does
 * not have a matching JNI method, {@link org.lwjgl.system.libffi.LibFFI LibFFI} can used.
 *
 * <p>All JNI methods in this class take an extra parameter, called {@code __functionAddress}. This must be a valid pointer to a native function with a
 * matching signature. The C language does not support method overloading, so each method has a postfix that matches the
 * <a href="http://docs.oracle.com/javase/8/docs/technotes/guides/jni/spec/types.html#type_signatures">JNI type signature</a> it supports. Only the primitive
 * type signatures are used, plus a 'P' type that corresponds to a pointer value. Pointer values are mapped to Java longs, but are properly converted in native
 * code on 32bit architectures.</p>
 *
 * <p>Methods with the {@code invoke} prefix will invoke the native function with the default calling convention. Methods with the {@code call} prefix will
 * invoke the native function with the {@code __stdcall} calling convention on Windows and the default calling convention on other systems.</p>
 */
public final class JNI {

	private JNI() {}

""")
		signatures.forEach {
			print("\tpublic static native ${it.returnType.nativeMethodType.simpleName} ${it.signature}(long $FUNCTION_ADDRESS")
			if ( it.arguments.isNotEmpty() )
				print(it.arguments.withIndex().map { "${it.value.nativeMethodType.simpleName} param${it.index}" }.joinToString(", ", prefix = ", "))
			println(");")
		}
		println("\n}")
	}

	private val TypeMapping.isPointerType: Boolean get() = this === PrimitiveMapping.POINTER || this is PointerMapping
	private val TypeMapping.nativeType: String get() = if ( this.isPointerType ) "intptr_t" else this.jniFunctionType

	override fun PrintWriter.generateNative() {
		nativeDirective("""
#ifdef LWJGL_WINDOWS
	#define APIENTRY __stdcall
#else
	#define APIENTRY
#endif
""")

		print(HEADER)
		preamble.printNative(this)

		signatures.forEach {
			print("JNIEXPORT ${it.returnType.jniFunctionType} JNICALL Java_org_lwjgl_system_JNI_${it.signature}(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress")
			if ( it.arguments.isNotEmpty() )
				print(it.arguments.withIndex().map { "${it.value.jniFunctionType} param${it.index}" }.joinToString(", ", prefix = ", "))
			print(""") {
	UNUSED_PARAMS($JNIENV, clazz)
	""")
			if ( it.returnType !== TypeMapping.VOID ) {
				print("return ")
				if ( it.returnType.isPointerType )
					print("(jlong)")
			}
			print("((${it.returnType.nativeType} (${if ( it.callingConvention === CallingConvention.STDCALL ) "APIENTRY " else ""}*) (")
			print(it.arguments.map { it.nativeType }.joinToString(", "))
			print("))(intptr_t)__functionAddress)(")
			print(it.arguments.withIndex().map { if ( it.value.isPointerType ) "(intptr_t)param${it.index}" else "param${it.index}" }.joinToString(", "))
			println(""");
}
""")
		}

		println("\nEXTERN_C_EXIT")
	}
}

private class Signature constructor(
	val callingConvention: CallingConvention,
	val returnType: TypeMapping,
	val arguments: List<TypeMapping>
) : Comparable<Signature> {

	val signature = "${callingConvention.method}${arguments.map { it.jniSignature }.joinToString("")}${returnType.jniSignature}"

	constructor(function: NativeClassFunction) : this(
		function.nativeClass.binding!!.callingConvention,
		function.returns.nativeType.mapping,
		function.parameters.map { it.nativeType.mapping }
	)

	override fun equals(other: Any?) = other is Signature && this.signature == other.signature

	override fun hashCode(): Int = signature.hashCode()

	override fun toString() = signature

	override fun compareTo(other: Signature) = this.signature.compareTo(other.signature)
}