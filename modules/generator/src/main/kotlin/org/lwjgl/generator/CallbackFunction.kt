/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*

class CallbackFunction(
    packageName: String,
    className: String,
    val returns: NativeType,
    vararg val signature: Parameter
) : GeneratorTarget(packageName, className) {

    internal var functionDoc: (CallbackFunction) -> String = { "" }
    var additionalCode = ""

    private var stdcall = false
    fun useSystemCallConvention() {
        stdcall = true
    }

    private val signatureJava = signature.asSequence().map {
        "${if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean" else it.nativeType.nativeMethodType} ${it.name}"
    }.joinToString(", ")

    internal val NativeType.dyncall
        get() = when (this) {
            is PointerType   -> 'p'
            is PrimitiveType -> when (mapping) {
                PrimitiveMapping.BOOLEAN -> 'B'
                PrimitiveMapping.BYTE    -> 'c'
                PrimitiveMapping.SHORT   -> 's'
                PrimitiveMapping.BOOLEAN4,
                PrimitiveMapping.INT     -> 'i'
                PrimitiveMapping.LONG    -> 'l'
                PrimitiveMapping.POINTER -> 'p'
                PrimitiveMapping.FLOAT   -> 'f'
                PrimitiveMapping.DOUBLE  -> 'd'
                else                     -> throw IllegalArgumentException("Unsupported callback native type: $this")
            }
            else             -> if (mapping === TypeMapping.VOID) 'v' else throw IllegalArgumentException("Unsupported callback native type: $this")
        }

    private val NativeType.argType
        get() = if (this is PointerType || mapping === PrimitiveMapping.POINTER)
            "Pointer"
        else if (mapping === PrimitiveMapping.BOOLEAN)
            "Bool"
        else if (mapping === PrimitiveMapping.LONG)
            "LongLong"
        else
            (mapping as PrimitiveMapping).javaMethodName.upperCaseFirst

    override fun PrintWriter.generateJava() {
        print(HEADER)
        println("package $packageName;\n")

        print("""import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

""")
        preamble.printJava(this)

        val documentation = super.documentation
        if (documentation != null)
            println(processDocumentation(documentation.replace("Instances of this interface", "Instances of this class")).toJavaDoc(indentation = ""))
        print("""${access.modifier}abstract class $className extends Callback implements ${className}I {

    /** Creates a {@code $className} instance from the specified function pointer. */
    public static $className create(long functionPointer) {
        if (functionPointer == NULL) {
            return null;
        }

        ${className}I instance = Callback.get(functionPointer);
        return instance instanceof $className
            ? ($className)instance
            : new Container(functionPointer, instance);
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

    private $className(long functionPointer) {
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
        public ${returns.nativeMethodType} invoke($signatureJava) {
            ${if (returns.mapping != TypeMapping.VOID) "return " else ""}delegate.invoke(${signature.asSequence().map { it.name }.joinToString(", ")});
        }

    }

}""")
    }

    internal fun PrintWriter.generateInterface() {
        print(HEADER)
        println("package $packageName;\n")

        print("""import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

""")
        val documentation = super.documentation
        if (documentation != null)
            print(processDocumentation(documentation).toJavaDoc(indentation = ""))
        print("""
@FunctionalInterface
${access.modifier}interface ${className}I extends CallbackI.${returns.mapping.jniSignature} {

    String SIGNATURE = ${"\"(${signature.asSequence().map { it.nativeType.dyncall }.joinToString("")})${returns.dyncall}\"".let {
            if (stdcall) "Callback.__stdcall($it)" else it
        }};

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default ${returns.nativeMethodType} callback(long args) {
        """)
        if (returns.mapping != TypeMapping.VOID)
            print("return ")
        print("""invoke(
${signature.asSequence().map {
            "$t$t${t}dcbArg${it.nativeType.argType}(args)${if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN4) " != 0" else ""}"
        }.joinToString(",\n")}
        );
    }

""")
        print(functionDoc(this@CallbackFunction))
        print("""
    ${returns.nativeMethodType} invoke($signatureJava);

}""")
    }

}

private class CallbackInterface(
    val callback: CallbackFunction
) : GeneratorTarget(callback.packageName, "${callback.className}I") {
    override fun PrintWriter.generateJava() = callback.run {
        this@generateJava.generateInterface()
    }
}

fun String.callback(
    packageName: String,
    returns: NativeType,
    className: String,
    functionDoc: String,
    vararg signature: Parameter,
    returnDoc: String = "",
    see: Array<String>? = null,
    since: String = "",
    init: (CallbackFunction.() -> Unit)? = null
): CallbackType {
    val callback = CallbackFunction(packageName, className, returns, *signature)
    if (init != null)
        callback.init()
    callback.functionDoc = { it -> it.toJavaDoc(it.processDocumentation(functionDoc), it.signature.asSequence(), it.returns, returnDoc, see, since) }
    Generator.register(callback)
    Generator.register(CallbackInterface(callback))
    return CallbackType(callback, this)
}