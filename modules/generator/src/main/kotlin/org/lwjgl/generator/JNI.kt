/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*
import java.util.concurrent.*

/** Deduplicates JNI signatures from bindings and generates the org.lwjgl.system.JNI class. */
object JNI : GeneratorTargetNative(Module.CORE, "JNI") {

    private val signatures = ConcurrentHashMap<Signature, Unit>()
    private val signaturesArray = ConcurrentHashMap<SignatureArray, Unit>()

    init {
        // Force generation of signatures that are not used by any binding, but are required for
        // bootstrapping or other internal functionality.

        // callP(GetStringi, GL_EXTENSIONS, i)
        signatures[Signature(CallingConvention.STDCALL, opaque_p, listOf(int, int))] = Unit
        // invokePPV(objc_msgSend, NSView, setWantsBestResolutionOpenGLSurface, true/false);
        signatures[Signature(CallingConvention.DEFAULT, void, listOf(opaque_p, opaque_p, bool))] = Unit
    }

    private val sortedSignatures by lazy(LazyThreadSafetyMode.NONE) { signatures.keys.sorted() }
    private val sortedSignaturesArray by lazy(LazyThreadSafetyMode.NONE) { signaturesArray.keys.sorted() }

    internal fun register(function: Func) = signatures.put(Signature(function), Unit)
    internal fun registerArray(function: Func) = signaturesArray.put(SignatureArray(function), Unit)

    internal fun register(function: CallbackFunction) = signatures.put(Signature(function), Unit)

    init {
        documentation =
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
                """
                the return value <a href="http://docs.oracle.com/javase/8/docs/technotes/guides/jni/spec/types.html\#type_signatures">JNI type signature</a>
                """
            )}
            """
		javaImport("javax.annotation.*")
    }

    override fun PrintWriter.generateJava() {
        generateJavaPreamble()
        print("""public final class JNI {

    static {
        Library.initialize();
    }

    private JNI() {}

    // Pointer API

""")
        sortedSignatures.forEach {
            print("${t}public static native ${it.returnType.nativeMethodType} ${it.signature}(long $FUNCTION_ADDRESS")
            if (it.arguments.isNotEmpty())
                print(it.arguments.asSequence().mapIndexed { i, param -> "${param.nativeMethodType} param$i" }.joinToString(", ", prefix = ", "))
            println(");")
        }

        println("\n$t// Array API\n")

        sortedSignaturesArray.forEach {
            print("${t}public static native ${it.returnType.nativeMethodType} ${it.signature}(long $FUNCTION_ADDRESS")
            if (it.arguments.isNotEmpty())
                print(it.arguments.asSequence().mapIndexed { i, param -> if (param is ArrayType<*>) "@Nullable ${param.mapping.primitive}[] param$i" else "${param.nativeMethodType} param$i" }.joinToString(", ", prefix = ", "))
            println(");")
        }
        println("\n}")
    }

    private val NativeType.nativeType get() = if (this.isPointer) "intptr_t" else this.jniFunctionType

    private val NativeType.jniFunctionTypeArray get() = if (this is ArrayType<*>) "j${this.mapping.primitive}Array" else this.jniFunctionType
    private fun NativeType.jniFunctionTypeArrayCritical(index: Int) = if (this is ArrayType<*>) "jint length$index, j${this.mapping.primitive}*" else this.jniFunctionType

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

        println("""#define ARITY0(type, signature, expression) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress) { \
    UNUSED_PARAMS($JNIENV, clazz) \
    expression; \
}

#define ARITYn(type, signature, expression, ...) \
JNIEXPORT type JNICALL Java_org_lwjgl_system_JNI_##signature(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress, __VA_ARGS__) { \
    UNUSED_PARAMS($JNIENV, clazz) \
    expression; \
}
""")
        sortedSignatures.forEach {
            print("ARITY${if (it.arguments.isEmpty()) "0" else "n"}(${it.returnType.jniFunctionType}, ${it.signatureNative}, ")
            if (it.returnType.mapping !== TypeMapping.VOID) {
                print("return ")
                if (it.returnType.isPointer)
                    print("(jlong)")
            }
            print("((${it.returnType.nativeType} (${if (it.callingConvention === CallingConvention.STDCALL) "APIENTRY " else ""}*) ")
            print(it.arguments.asSequence().map { arg -> arg.nativeType }.joinToString(", ", prefix = "(", postfix = ")"))
            print(")(intptr_t)__functionAddress)")
            print(it.arguments.asSequence().mapIndexed { i, param -> if (param.isPointer) "(intptr_t)param$i" else "param$i" }.joinToString(", ", prefix = "(", postfix = ")"))
            if (it.arguments.isNotEmpty())
                print(it.arguments.asSequence().mapIndexed { i, param -> "${param.jniFunctionType} param$i" }.joinToString(", ", prefix = ", "))
            println(")")
        }

        println()

        sortedSignaturesArray.forEach {
            println(
                """JNIEXPORT ${it.returnType.jniFunctionType} JNICALL Java_org_lwjgl_system_JNI_${it.signatureArray}(JNIEnv *$JNIENV, jclass clazz, jlong __functionAddress${
                if (it.arguments.isEmpty()) "" else it.arguments.mapIndexed { i, param -> "${param.jniFunctionTypeArray} param$i" }.joinToString(", ", prefix = ", ")
                }) {
    UNUSED_PARAMS($JNIENV, clazz)
    ${it.arguments.asSequence()
                    .mapIndexedNotNull { i, param -> if (param !is ArrayType<*>) null else "void *paramArray$i = param$i == NULL ? NULL : (*$JNIENV)->GetPrimitiveArrayCritical($JNIENV, param$i, 0);" }
                    .joinToString("\n$t")}
    ${if (it.returnType.mapping === TypeMapping.VOID) "" else "${it.returnType.jniFunctionType} __result = "}Java_org_lwjgl_system_JNI_${it.signatureNative}(NULL, NULL, __functionAddress, ${it.arguments.mapIndexed { i, param -> if (param is ArrayType<*>) "(intptr_t)paramArray$i" else "param$i" }.joinToString(", ")});
    ${it.arguments.asSequence()
                    .withIndex()
                    .sortedByDescending { arg -> arg.index }
                    .mapNotNull { arg -> if (arg.value !is ArrayType<*>) null else "if (param${arg.index} != NULL) { (*$JNIENV)->ReleasePrimitiveArrayCritical($JNIENV, param${arg.index}, paramArray${arg.index}, 0); }" }
                    .joinToString("\n$t")}${if (it.returnType.mapping === TypeMapping.VOID) "" else """
    return __result;"""}
}""")
            val workaroundJDK8167409 = 6 <= it.arguments.count() && it.arguments.any { type ->
                (type is PointerType<*> && type !is ArrayType<*>) || type.mapping.let { mapping -> mapping is PrimitiveMapping && 4 < mapping.bytes }
            }
            if (workaroundJDK8167409) println("#ifdef LWJGL_WINDOWS")
            println(
                """JNIEXPORT ${it.returnType.jniFunctionType} JNICALL JavaCritical_org_lwjgl_system_JNI_${it.signatureArray}(jlong __functionAddress${
                if (it.arguments.isEmpty()) "" else it.arguments.asSequence().mapIndexed { i, param -> "${param.jniFunctionTypeArrayCritical(i)} param$i" }.joinToString(", ", prefix = ", ")
                }) {
    ${it.arguments.asSequence().mapIndexedNotNull { i, param -> if (param !is ArrayType<*>) null else "UNUSED_PARAM(length$i)" }.joinToString("\n$t")}
    ${if (it.returnType.mapping === TypeMapping.VOID) "" else "return "}Java_org_lwjgl_system_JNI_${it.signatureNative}(NULL, NULL, __functionAddress, ${it.arguments.mapIndexed { i, param -> if (param is ArrayType<*>) "(intptr_t)param$i" else "param$i" }.joinToString(", ")});
}""")
            if (workaroundJDK8167409) println("#endif")
        }

        println("\nEXTERN_C_EXIT")
    }
}

private open class Signature constructor(
    val callingConvention: CallingConvention,
    val returnType: NativeType,
    val arguments: List<NativeType>
) : Comparable<Signature> {

    val key = "${callingConvention.method}${arguments.asSequence().map { it.jniSignature }.joinToString("")}${returnType.jniSignature}"

    private val paramSignatureStrict = arguments.asSequence().map { it.jniSignatureStrict }.joinToString("")

    val signature = "${callingConvention.method}${arguments.asSequence().map { it.jniSignatureJava }.joinToString("")}${returnType.jniSignature}"
    val signatureNative = "${signature}__J$paramSignatureStrict"

    constructor(function: Func) : this(
        function.nativeClass.callingConvention,
        function.returns.nativeType,
        function.parameters.asSequence()
            .filter { it !== EXPLICIT_FUNCTION_ADDRESS }
            .map { it.nativeType }
            .toList()
    )

    constructor(function: CallbackFunction) : this(
        function.module.callingConvention,
        function.returns,
        function.signature.asSequence()
            .map { it.nativeType }
            .toList()
    )

    override fun equals(other: Any?) = other is Signature && this.signatureNative == other.signatureNative

    override fun hashCode(): Int = signatureNative.hashCode()

    override fun compareTo(other: Signature): Int {
        this.callingConvention.ordinal.compareTo(other.callingConvention.ordinal).let { if (it != 0) return it }
        this.returnType.jniSignature.compareTo(other.returnType.jniSignature).let { if (it != 0) return it }

        val javaSignature0 = this.arguments.asSequence().map { it.jniSignatureJava }.joinToString("")
        val javaSignature1 = other.arguments.asSequence().map { it.jniSignatureJava }.joinToString("")

        javaSignature0.length.compareTo(javaSignature1.length).let { if (it != 0) return it }
        this.arguments.size.compareTo(other.arguments.size).let { if (it != 0) return it }
        javaSignature0.compareTo(javaSignature1).let { if (it != 0) return it }

        return this.signatureNative.compareTo(other.signatureNative)
    }

}

private class SignatureArray constructor(
    callingConvention: CallingConvention,
    returnType: NativeType,
    arguments: List<NativeType>
) : Signature(callingConvention, returnType, arguments) {

    private val paramSignatureStrict = arguments.asSequence().map { if (it is ArrayType<*>) it.jniSignatureArray else it.jniSignatureStrict }.joinToString("")

    val signatureArray = "${signature}__J$paramSignatureStrict"

    constructor(function: Func) : this(
        function.nativeClass.callingConvention,
        function.returns.nativeType,
        function.parameters.asSequence()
            .filter { it !== EXPLICIT_FUNCTION_ADDRESS }
            .map { it.nativeType }
            .toList()
    )

    override fun equals(other: Any?) = other is SignatureArray && this.signatureArray == other.signatureArray

    override fun hashCode(): Int = signatureArray.hashCode()

    override fun compareTo(other: Signature): Int {
        this.callingConvention.ordinal.compareTo(other.callingConvention.ordinal).let { if (it != 0) return it }
        this.returnType.jniSignature.compareTo(other.returnType.jniSignature).let { if (it != 0) return it }

        val javaSignature0 = this.arguments.asSequence().map { it.jniSignatureJava }.joinToString("")
        val javaSignature1 = other.arguments.asSequence().map { it.jniSignatureJava }.joinToString("")

        javaSignature0.length.compareTo(javaSignature1.length).let { if (it != 0) return it }
        this.arguments.size.compareTo(other.arguments.size).let { if (it != 0) return it }
        javaSignature0.compareTo(javaSignature1).let { if (it != 0) return it }

        return this.signatureArray.compareTo((other as SignatureArray).signatureArray)
    }

}