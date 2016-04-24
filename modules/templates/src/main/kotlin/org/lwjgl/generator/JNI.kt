/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.concurrent.ConcurrentHashMap

/** Deduplicates JNI signatures from bindings and generates the org.lwjgl.system.JNI class. */
object JNI : GeneratorTargetNative("org.lwjgl.system", "JNI") {

	private val signatures = ConcurrentHashMap<Signature, Unit>()
	private val signaturesArray = ConcurrentHashMap<SignatureArray, Unit>()

	init {
		signatures.put(Signature(
			CallingConvention.DEFAULT, TypeMapping.VOID, listOf(PointerMapping.OPAQUE_POINTER, PointerMapping.OPAQUE_POINTER, PrimitiveMapping.BOOLEAN)
		), Unit)
	}

	private val sortedSignatures by lazy { signatures.keys.sorted() }
	private val sortedSignaturesArray by lazy { signaturesArray.keys.sorted() }

	fun register(function: NativeClassFunction) = signatures.put(Signature(function), Unit)
	fun registerArray(function: NativeClassFunction) = signaturesArray.put(SignatureArray(function), Unit)

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")
		print(
"""/**
 * This class contains native methods that can be used to call dynamically loaded functions. It is used internally by the LWJGL bindings, but can also be used
 * to call other dynamically loaded functions. Not all possible signatures are available, only those needed by the LWJGL bindings. To call a function that does
 * not have a matching JNI method, {@link org.lwjgl.system.dyncall.DynCall DynCall} can used.
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

	static {
		Library.initialize();
	}

	private JNI() {}

	// Pointer API

""")
		sortedSignatures.forEach {
			print("\tpublic static native ${it.returnType.nativeMethodType.simpleName} ${it.signature}(long $FUNCTION_ADDRESS")
			if ( it.arguments.isNotEmpty() )
				print(it.arguments.withIndex().map { "${it.value.nativeMethodType.simpleName} param${it.index}" }.joinToString(", ", prefix = ", "))
			println(");")
		}

		println("\n\t// Array API\n")

		sortedSignaturesArray.forEach {
			print("\tpublic static native ${it.returnType.nativeMethodType.simpleName} ${it.signature}(long $FUNCTION_ADDRESS")
			if ( it.arguments.isNotEmpty() )
				print(it.arguments.withIndex().map { if ( it.value.isArray ) "${(it.value as PointerMapping).primitive}[] param${it.index}" else "${it.value.nativeMethodType.simpleName} param${it.index}" }.joinToString(", ", prefix = ", "))
			println(");")
		}
		println("\n}")
	}

	private val TypeMapping.isPointerType: Boolean get() = this === PrimitiveMapping.POINTER || this is PointerMapping
	private val TypeMapping.nativeType: String get() = if ( this.isPointerType ) "intptr_t" else this.jniFunctionType

	private val TypeMapping.jniFunctionTypeArray: String get() = if ( this.isArray ) "j${(this as PointerMapping).primitive}Array" else this.jniFunctionType
	private fun TypeMapping.jniFunctionTypeArrayCritical(index: Int) = if ( this.isArray ) "jint length$index, j${(this as PointerMapping).primitive}*" else this.jniFunctionType

	override fun PrintWriter.generateNative() {
		nativeDirective("""
#ifdef LWJGL_WINDOWS
	#define APIENTRY __stdcall
	__pragma(warning(disable : 4711))
#else
	#define APIENTRY
#endif
""")

		print(HEADER)
		preamble.printNative(this)

		println("""#define _p_ ,
#define ARITY0(type, signature, expression) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress) { \
	UNUSED_PARAMS($JNIENV, clazz) \
	expression; \
}

#define ARITYn(type, signature, params, expression) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress, params) { \
	UNUSED_PARAMS($JNIENV, clazz) \
	expression; \
}
""")
		/* DISABLED JavaCritical: no measurable benefit for primitive-only methods.
		// ARITY0
		JNIEXPORT type JNICALL JavaCritical_org_lwjgl_system_JNI_##signature(jlong __functionAddress) { \
			expression; \
		}
		// ARITYn
		JNIEXPORT type JNICALL JavaCritical_org_lwjgl_system_JNI_##signature(jlong __functionAddress, params) { \
			expression; \
		}
		*/
		sortedSignatures.forEach {
			print("ARITY${if ( it.arguments.isEmpty() ) "0" else "n"}(${it.returnType.jniFunctionType}, ${it.signatureNative}")
			if ( it.arguments.isNotEmpty() )
				print(it.arguments.withIndex().map { "${it.value.jniFunctionType} param${it.index}" }.joinToString(" _p_ ", prefix = ", "))
			print(", ")
			if ( it.returnType !== TypeMapping.VOID ) {
				print("return ")
				if ( it.returnType.isPointerType )
					print("(jlong)")
			}
			print("((${it.returnType.nativeType} (${if ( it.callingConvention === CallingConvention.STDCALL ) "APIENTRY " else ""}*) (")
			print(it.arguments.map { it.nativeType }.joinToString(", "))
			print("))(intptr_t)__functionAddress)(")
			print(it.arguments.withIndex().map { if ( it.value.isPointerType ) "(intptr_t)param${it.index}" else "param${it.index}" }.joinToString(", "))
			println("))")
		}

		println()

		sortedSignaturesArray.forEach {
			println(
"""JNIEXPORT ${it.returnType.jniFunctionType} JNICALL Java_org_lwjgl_system_JNI_${it.signatureArray}(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress${
if ( it.arguments.isEmpty() ) "" else it.arguments.withIndex().map { "${it.value.jniFunctionTypeArray} param${it.index}" }.joinToString(", ", prefix = ", ")
}) {
	UNUSED_PARAMS($JNIENV, clazz)
	${it.arguments.asSequence()
	.withIndex()
	.mapNotNull { if ( !it.value.isArray ) null else "j${(it.value as PointerMapping).primitive} *paramArray${it.index} = (*$JNIENV)->GetPrimitiveArrayCritical($JNIENV, param${it.index}, 0);" }
	.joinToString("\n\t")}
	${if ( it.returnType === TypeMapping.VOID ) "" else "${it.returnType.jniFunctionType} __result = "}Java_org_lwjgl_system_JNI_${it.signatureNative}($JNIENV, clazz, __functionAddress, ${it.arguments.withIndex().map { if ( it.value.isArray ) "(intptr_t)paramArray${it.index}" else "param${it.index}" }.joinToString(", ")});
	${it.arguments.asSequence()
	.withIndex()
	.sortedByDescending { it.index }
	.mapNotNull { if ( !it.value.isArray ) null else "(*$JNIENV)->ReleasePrimitiveArrayCritical($JNIENV, param${it.index}, paramArray${it.index}, 0);" }
	.joinToString("\n\t")}${if ( it.returnType === TypeMapping.VOID ) "" else """
	return __result;"""}
}""")

			println(
"""JNIEXPORT ${it.returnType.jniFunctionType} JNICALL JavaCritical_org_lwjgl_system_JNI_${it.signatureArray}(jlong __functionAddress${
if ( it.arguments.isEmpty() ) "" else it.arguments.withIndex().map { "${it.value.jniFunctionTypeArrayCritical(it.index)} param${it.index}" }.joinToString(", ", prefix = ", ")
}) {
	${it.arguments.asSequence().withIndex().filter { it.value.isArray }.map { "UNUSED_PARAM(length${it.index})" }.joinToString("\n\t")}
	${if ( it.returnType === TypeMapping.VOID ) "" else "return "}Java_org_lwjgl_system_JNI_${it.signatureNative}(NULL, NULL, __functionAddress, ${it.arguments.withIndex().map { if ( it.value.isArray ) "(intptr_t)param${it.index}" else "param${it.index}" }.joinToString(", ")});
}""")
		}

		println("\nEXTERN_C_EXIT")
	}
}

open class Signature constructor(
	val callingConvention: CallingConvention,
	val returnType: TypeMapping,
	val arguments: List<TypeMapping>
) : Comparable<Signature> {

	val key = "${callingConvention.method}${arguments.map { it.jniSignature }.joinToString("")}${returnType.jniSignature}"

	private val paramSignatureStrict = arguments.map { it.jniSignatureStrict }.joinToString("")

	val signature = "${callingConvention.method}${arguments.map { it.jniSignatureJava }.joinToString("")}${returnType.jniSignature}"
	val signatureNative = "${signature}__J$paramSignatureStrict"

	constructor(function: NativeClassFunction) : this(
		function.nativeClass.binding!!.callingConvention,
		function.returns.nativeType.mapping,
		function.parameters.map { it.nativeType.mapping }
	)

	override fun equals(other: Any?) = other is Signature && this.signatureNative == other.signatureNative

	override fun hashCode(): Int = signatureNative.hashCode()

	override fun compareTo(other: Signature): Int {
		if (this.callingConvention !== other.callingConvention)
			return this.callingConvention.ordinal.compareTo(other.callingConvention.ordinal)

		return returnType.jniSignature.compareTo(other.returnType.jniSignature).let {
			if (it != 0)
				it
			else
				this.paramSignatureStrict.compareTo(other.paramSignatureStrict)
		}
	}

}

class SignatureArray constructor(
	callingConvention: CallingConvention,
	returnType: TypeMapping,
	arguments: List<TypeMapping>
) : Signature(callingConvention, returnType, arguments) {

	private val paramSignatureStrict = arguments.map { if (it.isArray) it.jniSignatureArray else it.jniSignatureStrict }.joinToString("")

	val signatureArray = "${signature}__J$paramSignatureStrict"

	constructor(function: NativeClassFunction) : this(
		function.nativeClass.binding!!.callingConvention,
		function.returns.nativeType.mapping,
		function.parameters.map { it.nativeType.mapping }
	)

	override fun equals(other: Any?) = other is SignatureArray && this.signatureArray == other.signatureArray

	override fun hashCode(): Int = signatureArray.hashCode()

	override fun compareTo(other: Signature): Int {
		if (this.callingConvention !== other.callingConvention)
			return this.callingConvention.ordinal.compareTo(other.callingConvention.ordinal)

		return returnType.jniSignature.compareTo(other.returnType.jniSignature).let {
			if (it != 0)
				it
			else
				this.paramSignatureStrict.compareTo((other as SignatureArray).paramSignatureStrict)
		}
	}

}