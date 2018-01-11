/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*

class CallbackFunction(
    packageName: String,
    className: String,
    val nativeType: String,
    val returns: NativeType,
    vararg val signature: Parameter
) : GeneratorTarget(packageName, className) {

    internal var functionDoc: (CallbackFunction) -> String = { "" }
    var additionalCode = ""

    private var stdcall = false
    fun useSystemCallConvention() {
        stdcall = true
    }

    private val NativeType.dyncall
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

        print("""import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

""")
        preamble.printJava(this)

        val documentation = super.documentation
        if (documentation != null)
            println(processDocumentation(documentation
                .replace("Instances of this interface", "Instances of this class"))
                .toJavaDoc(indentation = "", see = see, since = since))
        print("""${access.modifier}abstract class $className extends Callback implements ${className}I {

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

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@link #NULL}. */
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
        public ${returns.nativeMethodType} invoke(${signature.asSequence().joinToString(", ") {
            "${if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean" else it.nativeType.nativeMethodType} ${it.name}"
        }}) {
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
            print(processDocumentation(documentation).toJavaDoc(indentation = "", see = see, since = since))
        print("""
@FunctionalInterface
@NativeType("$nativeType")
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
        val doc = functionDoc(this@CallbackFunction)
        if (doc.isNotEmpty()) {
            println()
            print(doc)
        }
        print("""
    ${returns.annotate(returns.nativeMethodType, false)} invoke(${signature.asSequence().joinToString(", ") {
            "${it.nativeType.annotate(if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean" else it.nativeType.nativeMethodType, it.has(const))} ${it.name}"
        }});

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
    val callback = CallbackFunction(packageName, className, this, returns, *signature)
    if (init != null)
        callback.init()
    callback.functionDoc = { it -> it.toJavaDoc(it.processDocumentation(functionDoc), it.signature.asSequence(), it.returns, returnDoc, see, since) }
    Generator.register(callback)
    Generator.register(CallbackInterface(callback))
    return CallbackType(callback, this)
}