/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.concurrent.ConcurrentHashMap

/** Deduplicates JNI signatures from bindings and generates the org.lwjgl.system.JNI class. */
object JNI : GeneratorTargetNative("org.lwjgl.system", "JNI") {

	private val signatures = ConcurrentHashMap<Signature, Unit>()
	private val signaturesArray = ConcurrentHashMap<SignatureArray, Unit>()

	init {
		signatures.put(Signature(CallingConvention.DEFAULT, void, listOf(voidptr, voidptr, bool)), Unit)
	}

	private val sortedSignatures by lazy { signatures.keys.sorted() }
	private val sortedSignaturesArray by lazy { signaturesArray.keys.sorted() }

	internal fun register(function: NativeClassFunction) = signatures.put(Signature(function), Unit)
	internal fun registerArray(function: NativeClassFunction) = signaturesArray.put(SignatureArray(function), Unit)

	override fun PrintWriter.generateJava() {
		print(HEADER)
		println("package $packageName;\n")
		print(
			"""
			This class contains native methods that can be used to call dynamically loaded functions. It is used internally by the LWJGL bindings, but can also
			be used to call other dynamically loaded functions. Not all possible signatures are available, only those needed by the LWJGL bindings. To call a
			function that does not have a matching JNI method, {@link org.lwjgl.system.dyncall.DynCall DynCall} can used.

			All JNI methods in this class take an extra parameter, called {@code __functionAddress}. This must be a valid pointer to a native function with a
			matching signature. Due to overloading, method names are partially mangled:
			${ul(
				"""
				{@code call} or {@code invoke}

				Methods with the {@code invoke} prefix will invoke the native function with the default calling convention. Methods with the {@code call}
				prefix will invoke the native function with the {@code __stdcall} calling convention on Windows and the default calling convention on other
				systems.
				""",
				"""
				a {@code J} or a {@code P} for each {@code long} parameter

				{@code J} parameters represent 64-bit integer values. {@code P} parameters represent pointer addresses. A pointer address is a 32-bit value on
				32-bit architectures and a 64-bit value on 64-bit architectures.
				""",
				"the return value <a href=\"http://docs.oracle.com/javase/8/docs/technotes/guides/jni/spec/types.html#type_signatures\">JNI type signature</a>"
			)}
			""".toJavaDoc(indentation = "")
		)
		print("""
public final class JNI {

	static {
		Library.initialize();
	}

	private JNI() {}

	// Pointer API

""")
		sortedSignatures.forEach {
			print("\tpublic static native ${it.returnType.nativeMethodType} ${it.signature}(long $FUNCTION_ADDRESS")
			if ( it.arguments.isNotEmpty() )
				print(it.arguments.asSequence().mapIndexed { i, param -> "${param.nativeMethodType} param$i" }.joinToString(", ", prefix = ", "))
			println(");")
		}

		println("\n\t// Array API\n")

		sortedSignaturesArray.forEach {
			print("\tpublic static native ${it.returnType.nativeMethodType} ${it.signature}(long $FUNCTION_ADDRESS")
			if ( it.arguments.isNotEmpty() )
				print(it.arguments.asSequence().mapIndexed { i, param -> if ( param is ArrayType ) "${(param.mapping as PointerMapping).primitive}[] param$i" else "${param.nativeMethodType} param$i" }.joinToString(", ", prefix = ", "))
			println(");")
		}
		println("\n}")
	}

	private val NativeType.nativeType: String get() = if ( this.isPointer ) "intptr_t" else this.jniFunctionType

	private val NativeType.jniFunctionTypeArray: String get() = if ( this is ArrayType ) "j${(this.mapping as PointerMapping).primitive}Array" else this.jniFunctionType
	private fun NativeType.jniFunctionTypeArrayCritical(index: Int) = if (this is ArrayType ) "jint length$index, j${(this.mapping as PointerMapping).primitive}*" else this.jniFunctionType

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
				print(it.arguments.asSequence().mapIndexed { i, param -> "${param.jniFunctionType} param$i" }.joinToString(" _p_ ", prefix = ", "))
			print(", ")
			if ( it.returnType.mapping !== TypeMapping.VOID ) {
				print("return ")
				if ( it.returnType.isPointer )
					print("(jlong)")
			}
			print("((${it.returnType.nativeType} (${if ( it.callingConvention === CallingConvention.STDCALL ) "APIENTRY " else ""}*) (")
			print(it.arguments.asSequence().map { it.nativeType }.joinToString(", "))
			print("))(intptr_t)__functionAddress)(")
			print(it.arguments.asSequence().mapIndexed { i, param -> if ( param.isPointer ) "(intptr_t)param$i" else "param$i" }.joinToString(", "))
			println("))")
		}

		println()

		sortedSignaturesArray.forEach {
			println(
"""JNIEXPORT ${it.returnType.jniFunctionType} JNICALL Java_org_lwjgl_system_JNI_${it.signatureArray}(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress${
if ( it.arguments.isEmpty() ) "" else it.arguments.mapIndexed { i, param -> "${param.jniFunctionTypeArray} param$i" }.joinToString(", ", prefix = ", ")
}) {
	UNUSED_PARAMS($JNIENV, clazz)
	${it.arguments.asSequence()
	.mapIndexedNotNull { i, param -> if ( param !is ArrayType ) null else "j${(param.mapping as PointerMapping).primitive} *paramArray$i = param$i == NULL ? NULL : (*$JNIENV)->GetPrimitiveArrayCritical($JNIENV, param$i, 0);" }
	.joinToString("\n\t")}
	${if ( it.returnType.mapping === TypeMapping.VOID ) "" else "${it.returnType.jniFunctionType} __result = "}Java_org_lwjgl_system_JNI_${it.signatureNative}($JNIENV, clazz, __functionAddress, ${it.arguments.mapIndexed { i, param -> if ( param is ArrayType ) "(intptr_t)paramArray$i" else "param$i" }.joinToString(", ")});
	${it.arguments.asSequence()
	.withIndex()
	.sortedByDescending { it.index }
	.mapNotNull { if ( it.value !is ArrayType ) null else "if ( param${it.index} != NULL ) (*$JNIENV)->ReleasePrimitiveArrayCritical($JNIENV, param${it.index}, paramArray${it.index}, 0);" }
	.joinToString("\n\t")}${if ( it.returnType.mapping === TypeMapping.VOID ) "" else """
	return __result;"""}
}""")

			println(
"""JNIEXPORT ${it.returnType.jniFunctionType} JNICALL JavaCritical_org_lwjgl_system_JNI_${it.signatureArray}(jlong __functionAddress${
if ( it.arguments.isEmpty() ) "" else it.arguments.asSequence().mapIndexed { i, param -> "${param.jniFunctionTypeArrayCritical(i)} param$i" }.joinToString(", ", prefix = ", ")
}) {
	${it.arguments.asSequence().mapIndexedNotNull { i, param -> if ( param !is ArrayType ) null else "UNUSED_PARAM(length$i)" }.joinToString("\n\t")}
	${if ( it.returnType.mapping === TypeMapping.VOID ) "" else "return "}Java_org_lwjgl_system_JNI_${it.signatureNative}(NULL, NULL, __functionAddress, ${it.arguments.mapIndexed { i, param -> if ( param is ArrayType ) "(intptr_t)param$i" else "param$i" }.joinToString(", ")});
}""")
		}

		println("\nEXTERN_C_EXIT")
	}
}

private val NativeType.jniSignature: String get() = this.mapping.jniSignature

private open class Signature constructor(
	val callingConvention: CallingConvention,
	val returnType: NativeType,
	val arguments: List<NativeType>
) : Comparable<Signature> {

	val key = "${callingConvention.method}${arguments.asSequence().map { it.jniSignature }.joinToString("")}${returnType.jniSignature}"

	private val paramSignatureStrict = arguments.asSequence().map { it.mapping.jniSignatureStrict }.joinToString("")

	val signature = "${callingConvention.method}${arguments.asSequence().map { it.mapping.jniSignatureJava }.joinToString("")}${returnType.jniSignature}"
	val signatureNative = "${signature}__J$paramSignatureStrict"

	constructor(function: NativeClassFunction) : this(
		function.nativeClass.binding!!.callingConvention,
		function.returns.nativeType,
		function.parameters.map { it.nativeType }
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

private class SignatureArray constructor(
	callingConvention: CallingConvention,
	returnType: NativeType,
	arguments: List<NativeType>
) : Signature(callingConvention, returnType, arguments) {

	private val paramSignatureStrict = arguments.asSequence().map { if (it is ArrayType) it.mapping.jniSignatureArray else it.mapping.jniSignatureStrict }.joinToString("")

	val signatureArray = "${signature}__J$paramSignatureStrict"

	constructor(function: NativeClassFunction) : this(
		function.nativeClass.binding!!.callingConvention,
		function.returns.nativeType,
		function.parameters.map { it.nativeType }
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