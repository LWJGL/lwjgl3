/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*

class CallbackFunction internal constructor(
    module: Module,
    className: String,
    nativeType: String,
    val returns: NativeType,
    vararg val signature: Parameter
) : GeneratorTargetNative(module, className) {

    init {
        require(skipNative || signature.singleOrNull { it.has<UserData>() } != null) {
            "Callbacks with struct-by-value results or parameters must specify the user data parameter. [$className, module: ${module.java}]"
        }
    }

    private val javaSignature = signature.asSequence().filter { !it.has<UserData>() }

    internal var functionDoc: (CallbackFunction) -> String = { "" }
    var additionalCode = ""

    internal fun nativeType(name: String, separator: String = ", ", prefix: String = "", postfix: String = "") =
        "${returns.name} (*$name) (${if (signature.isEmpty()) "void" else signature.asSequence()
            .joinToString(separator, prefix = prefix, postfix = postfix) { param ->
                param.toNativeType(null).let {
                    if (it.endsWith('*')) {
                        "$it${param.name}"
                    } else {
                        "$it ${param.name}"
                    }
                }
            }
        })"

    internal val nativeType = if (nativeType === ANONYMOUS)
        "${returns.name} (*) (${if (signature.isEmpty()) "void" else signature.asSequence()
            .joinToString(", ") { it.toNativeType(null) }
        })"
    else
        nativeType

    private val NativeType.dyncall
        get() = when (this) {
            is PointerType<*> -> 'p'
            is PrimitiveType  -> when (mapping) {
                PrimitiveMapping.BOOLEAN -> 'B'
                PrimitiveMapping.BYTE    -> 'c'
                PrimitiveMapping.SHORT   -> 's'
                PrimitiveMapping.BOOLEAN4,
                PrimitiveMapping.INT     -> 'i'
                PrimitiveMapping.LONG    -> 'l'
                PrimitiveMapping.CLONG   -> 'j'
                PrimitiveMapping.POINTER -> 'p'
                PrimitiveMapping.FLOAT   -> 'f'
                PrimitiveMapping.DOUBLE  -> 'd'
                else                     -> throw IllegalArgumentException("Unsupported callback native type: $this")
            }
            is StructType     -> 'p'
            else              -> if (mapping === TypeMapping.VOID) 'v' else throw IllegalArgumentException("Unsupported callback native type: $this")
        }

    private val NativeType.argType
        get() = if (isPointer) "Pointer" else when (mapping) {
            PrimitiveMapping.BOOLEAN -> "Bool"
            PrimitiveMapping.LONG    -> "LongLong"
            PrimitiveMapping.CLONG   -> "Long"
            else                     -> (mapping as PrimitiveMapping).javaMethodName.upperCaseFirst
        }

    private fun PrintWriter.generateDocumentation(isClass: Boolean) {
        val documentation = if (module === Module.VULKAN)
            super.documentation
        else {
            val type =
                """
                <h3>Type</h3>

                ${codeBlock(nativeType("", ",\n$t", "\n$t", "\n"))}
                """

            super.documentation.let {
                if (it == null)
                    type
                else
                    "$it\n\n$type"
            }
        }
        if (documentation != null) {
            println(processDocumentation(documentation.let {
                if (isClass) {
                    it.replace("Instances of this interface", "Instances of this class")
                } else {
                    it
                }
            }).toJavaDoc(indentation = "", see = see, since = since))
        }
    }

    override fun PrintWriter.generateJava() {
        print(HEADER)
        println("package $packageName;\n")

        print("""import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

""")
        preamble.printJava(this)

        generateDocumentation(true)
        println("""${access.modifier}abstract class $className extends Callback implements ${className}I {""")
        if (!skipNative) {
            println("""
    public static final long DELEGATE = getDelegate();

    private static native long getDelegate();""")
        }
        print("""
    /**
     * Creates a {@code $className} instance from the specified function pointer.
     *
     * @return the new {@code $className}
     */
    public static $className create(long functionPointer) {
        ${className}I instance = Callback.get(functionPointer);
        return instance instanceof $className
            ? ($className)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static $className createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code $className} instance that delegates to the specified {@code ${className}I} instance. */
    public static $className create(${className}I instance) {
        return instance instanceof $className
            ? ($className)instance
            : new Container(instance.address(), instance);
    }

    protected $className() {
        super(SIGNATURE);
    }

    $className(long functionPointer) {
        super(functionPointer);
    }
""")
        if (additionalCode.isNotEmpty()) {
            print("\n$t")
            print(additionalCode.trim())
            println()
        }

        print("""
    private static final class Container extends $className {

        private final ${className}I delegate;

        Container(long functionPointer, ${className}I delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public ${returns.nativeMethodType} invoke(${javaSignature.joinToString(", ") {
                "${if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean"
                else if (it.nativeType is StructType)
                    it.nativeType.definition.className
                else
                    it.nativeType.nativeMethodType} ${it.name}"
            }}) {
            ${if (returns.mapping != TypeMapping.VOID) "return " else ""}delegate.invoke(${javaSignature.map { it.name }.joinToString(", ")});
        }

    }

}""")
    }

    internal fun PrintWriter.generateInterface() {
        print(HEADER)
        println("package $packageName;\n")

        println("import org.lwjgl.system.*;\n")
        if (signature.isNotEmpty()) {
            println("import static org.lwjgl.system.dyncall.DynCallback.*;\n")
        }

        generateDocumentation(false)
        print("""@FunctionalInterface
@NativeType("$nativeType")
${access.modifier}interface ${className}I extends CallbackI.${returns.jniSignature} {

    String SIGNATURE = ${"\"(${javaSignature.map { it.nativeType.dyncall }.joinToString("")})${returns.dyncall}\"".let {
            if (module.callingConvention === CallingConvention.STDCALL) "Callback.__stdcall($it)" else it
        }};

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default ${returns.nativeMethodType} callback(long args) {
        """)
        if (returns.mapping != TypeMapping.VOID)
            print("return ")
        print("""invoke(${if (javaSignature.none()) "" else javaSignature.joinToString(",\n", prefix = "\n", postfix = "\n$t$t") {
            val arg = "dcbArg${it.nativeType.argType}(args)${if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN4) " != 0" else ""}"
            "$t$t$t${if (it.nativeType is StructType) "${it.nativeType.definition.className}.create($arg)" else arg}"
        }});
    }
""")
        val doc = functionDoc(this@CallbackFunction)
        if (doc.isNotEmpty()) {
            println()
            print(doc)
        }
        print("""
    ${returns.annotate(returns.nativeMethodType)} invoke(${javaSignature.joinToString(", ") {
            "${it.nativeType.annotate(if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean" else if (it.nativeType is StructType) it.nativeType.definition.className else it.nativeType.nativeMethodType)} ${it.name}"
        }});

}""")
    }

    override val skipNative: Boolean
        get() = returns !is StructType && signature.none { it.nativeType is StructType }

    override fun PrintWriter.generateNative() {
        print(HEADER)
        preamble.printNative(this)

        println(
            """
static ${returns.jniFunctionType} delegate(${signature.asSequence().joinToString(", ") {
    "${it.nativeType.name} ${it.name}"
}}) {
    ${if (returns.mapping === TypeMapping.VOID) "" else "return "}((${returns.name} (*)(${javaSignature.joinToString(", ") {
        "${it.toNativeType(null)}${if (it.nativeType is StructType) " *" else ""}"
    }}))(uintptr_t)${signature.single { it.has<UserData>() }.name})(${javaSignature.joinToString(", ") {
        "${if (it.nativeType is StructType) "&" else ""}${it.name}"
    }});
}

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_${nativeFileNameJNI}_getDelegate(JNIEnv *$JNIENV, jclass clazz) {
    UNUSED_PARAMS($JNIENV, clazz)
    return (intptr_t)delegate;
}

EXTERN_C_EXIT""")
    }

}

internal class CallbackInterface(
    val callback: CallbackFunction
) : GeneratorTarget(callback.module, "${callback.className}I") {
    override fun PrintWriter.generateJava() = callback.run {
        this@generateJava.generateInterface()
    }
}