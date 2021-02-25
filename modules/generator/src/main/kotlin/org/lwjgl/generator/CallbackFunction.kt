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
) : GeneratorTarget(module, className) {

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

    private val NativeType.libffi
        get(): String = when (this) {
            is PointerType<*> -> "ffi_type_pointer"
            is IntegerType    -> when (mapping) {
                PrimitiveMapping.BYTE    -> if (this.unsigned) "ffi_type_uint8" else "ffi_type_sint8"
                PrimitiveMapping.SHORT   -> if (this.unsigned) "ffi_type_uint16" else "ffi_type_sint16"
                PrimitiveMapping.INT     -> if (this.unsigned) "ffi_type_uint32" else "ffi_type_sint32"
                PrimitiveMapping.LONG    -> if (this.unsigned) "ffi_type_uint64" else "ffi_type_sint64"
                PrimitiveMapping.CLONG   -> if (this.unsigned) "ffi_type_ulong" else "ffi_type_slong"
                PrimitiveMapping.POINTER -> "ffi_type_pointer"
                else                     -> throw IllegalArgumentException("Unsupported callback native type: $this")
            }
            is PrimitiveType  -> when (mapping) {
                PrimitiveMapping.BOOLEAN  -> "ffi_type_uint8"
                PrimitiveMapping.BOOLEAN4 -> "ffi_type_uint32"
                PrimitiveMapping.FLOAT    -> "ffi_type_float"
                PrimitiveMapping.DOUBLE   -> "ffi_type_double"
                else                      -> throw IllegalArgumentException("Unsupported callback native type: $this")
            }
            is StructType     -> if (this.definition.nativeLayout)
                throw IllegalArgumentException("Unsupported struct type with native layout: $this")
            else
                "apiCreate${if (this.definition.union) "Union" else "Struct"}(${
                    this.definition.members.joinToString(", ") { member ->
                        member.nativeType.libffi.let {
                            if (member is StructMemberArray) {
                                "apiCreateArray($it, ${member.size})"
                            } else {
                                it
                            }
                        }
                    }
                })"
            is VoidType       -> "ffi_type_void"
            else              -> throw IllegalArgumentException("Unsupported native type: $this")
        }

    private val NativeType.memGetType
        get() = if (isPointer) "Address" else when (mapping) {
            PrimitiveMapping.BOOLEAN -> "Byte"
            PrimitiveMapping.CLONG   -> "CLong"
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
        super(CIF);
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
        public ${if (returns is StructType) "void" else returns.nativeMethodType} invoke(${signature.asSequence()
            .map {
                "${if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean"
                else if (it.nativeType is StructType)
                    it.nativeType.definition.className
                else
                    it.nativeType.nativeMethodType} ${it.name}"
            }
            .let { if (returns is StructType) it + "${returns.javaMethodType} $RESULT" else it }
            .joinToString(", ")}) {
            ${if (returns.mapping !== TypeMapping.VOID && returns !is StructType) "return " else ""}delegate.invoke(${signature.asSequence()
                .map { it.name }
                .let { if (returns is StructType) it + RESULT else it }
                .joinToString(", ")
            });
        }

    }

}""")
    }

    internal fun PrintWriter.generateInterface() {
        print(HEADER)
        println("package $packageName;\n")

        println("import org.lwjgl.system.*;")
        println("import org.lwjgl.system.libffi.*;\n")
        println("import static org.lwjgl.system.APIUtil.*;")
        if (signature.isNotEmpty()) {
            println("import static org.lwjgl.system.MemoryUtil.*;")
            println("import static org.lwjgl.system.libffi.LibFFI.*;")
        }
        println()

        generateDocumentation(false)
        print("""@FunctionalInterface
@NativeType("$nativeType")
${access.modifier}interface ${className}I extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        ${if (module.callingConvention === CallingConvention.STDCALL) "apiStdcall()" else "FFI_DEFAULT_ABI"},
        ${returns.libffi},
        ${signature.joinToString(", ") { it.nativeType.libffi }}
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        """)
        if (returns.mapping !== TypeMapping.VOID && returns !is StructType) {
            print("${returns.nativeMethodType} $RESULT = ")
        }
        print("""invoke(${if (signature.none() && returns !is StructType) "" else signature.asSequence()
            .mapIndexed { i, it ->
                val arg = "memGetAddress(args${
                    when (i) {
                        0    -> ""
                        1    -> " + POINTER_SIZE"
                        else -> " + $i * POINTER_SIZE"
                    }
                })"
                if (it.nativeType is StructType) {
                    "${it.nativeType.definition.className}.create($arg)"
                } else {
                    "memGet${it.nativeType.memGetType}($arg)${if (it.nativeType.mapping === PrimitiveMapping.BOOLEAN || it.nativeType.mapping === PrimitiveMapping.BOOLEAN4) " != 0" else ""}"
                }
            }
            .let { if (returns is StructType) it + "${returns.javaMethodType}.create(ret)" else it }
            .joinToString(",\n$t$t$t", prefix = "\n$t$t$t", postfix = "\n$t$t")
        });""");
        if (returns.mapping !== TypeMapping.VOID && returns !is StructType) {
            print("\n$t${t}apiClosureRet${if (returns.isPointer) "P" else if (returns.mapping === PrimitiveMapping.LONG) "L" else ""}(ret, $RESULT);")
        }
        print("""
    }
""")
        val doc = functionDoc(this@CallbackFunction)
        if (doc.isNotEmpty()) {
            println()
            print(doc)
        }
        print("""
    ${if (returns is StructType) "void" else returns.annotate(returns.nativeMethodType)} invoke(${signature.asSequence()
            .map { "${it.nativeType.annotate(if (it.nativeType.mapping == PrimitiveMapping.BOOLEAN4) "boolean" else if (it.nativeType is StructType) it.nativeType.definition.className else it.nativeType.nativeMethodType)} ${it.name}" }
            .let { if (returns is StructType) it + "${returns.annotate(returns.javaMethodType)} $RESULT" else it }
            .joinToString(", ")});

}""")
    }
}

internal class CallbackInterface(
    val callback: CallbackFunction
) : GeneratorTarget(callback.module, "${callback.className}I") {
    override fun PrintWriter.generateJava() = callback.run {
        this@generateJava.generateInterface()
    }
}