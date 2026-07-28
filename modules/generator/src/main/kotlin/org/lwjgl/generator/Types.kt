/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import org.lwjgl.*
import java.nio.*
import kotlin.reflect.*

/*
Type system (- interface * concrete):
---------------
- NativeType (root)
- BaseType (root)
    * VoidType
    * OpaqueType (cannot be used directly, must be wrapped in PointerType)
    - DataType (types with known layout that can be used as parameters or struct members)
        - ScalarType
            * PrimitiveType
                * IntegerType
                * CharType
            * PointerType (mapped to raw pointer)
        - AggregateType
            * CArrayType
            * StructType (mapped to struct class)
        - ReferenceType
            * JObjectType (only type passed as jobject to JNI)
            * PointerType (mapped to a java.nio buffer class)
                * ArrayType (mapped to java array)
                * CharSequenceType (mapped to String/CharSequence)
                * WrappedPointerType (mapped to a Java class)
                    * FunctionType (mapped to a callback interface)
                    * TODO: C++ classes
*/
interface NativeType {
    /** The type used in the native API. */
    val name: String
    /** The type we map the native type to. */
    val mapping: TypeMapping

    val p : PointerType<out NativeType>
    val const : NativeType

    /** Data type used for libffi calls. */
    val libffiType: String
    /** Data type to use when we don't have access to typedefs. */
    val abiType: String
    /** Used to build org.lwjgl.system.JNI method names. */
    val jniSignatureJava: String
}
// These interfaces simplify some implementation details and the DSL.
interface DataType : NativeType // (all types except void & opaque types, i.e. types with known data layout)
interface ScalarType : DataType // arithmetic & pointer types
interface AggregateType : DataType // arrays & structs/unions
interface ReferenceType : DataType // Mapped to a Java class in the Java API

/** Base implementation of all concrete types */
abstract class BaseType internal constructor(
    override val name: String,
    override val mapping: TypeMapping
): NativeType {
    internal open val javaMethodType
        get() = if (mapping.isPseudoBoolean()) "boolean" else mapping.javaMethodName

    override fun toString() =
        "${this::class.java.simpleName}: $name | $jniFunctionType | $nativeMethodType | $javaMethodType"
}

// void
class VoidType internal constructor(name: String) : BaseType(name, TypeMapping.VOID) {
    override val p by lazy { PointerType(name, PointerMapping.DATA_BYTE, elementType = this) }
    override val const by lazy { VoidType(this.name.const) }
    override val libffiType: String
        get() = "ffi_type_void"
    override val abiType: String
        get() = "void"
    override val jniSignatureJava: String
        get() = "V"
}
val String.void: VoidType get() = VoidType(this)

// Opaque types
class OpaqueType internal constructor(name: String) : BaseType(name, TypeMapping.VOID) {
    override val p by lazy { PointerType(this.name, PointerMapping.OPAQUE_POINTER, elementType = this) }
    override val const by lazy { OpaqueType(this.name.const) }
    override val libffiType: String
        get() = throw IllegalStateException(this.toString())
    override val abiType: String
        get() = throw IllegalStateException(this.toString())
    override val jniSignatureJava: String
        get() = throw IllegalStateException(this.toString())
}
val String.opaque get() = OpaqueType(this)
val String.handle get() = typedef(this.opaque.p, this)

// Specialization for primitives.
open class PrimitiveType(name: String, mapping: PrimitiveMapping) : BaseType(name, mapping), ScalarType {
    override val mapping: PrimitiveMapping get() = super.mapping as PrimitiveMapping
    override val p: PointerType<out PrimitiveType> by lazy { PointerType(this.name, this.mapping.toPointer, elementType = this) }
    override val const by lazy { PrimitiveType(this.name.const, this.mapping) }
    override val libffiType: String
        get() = when (mapping) {
            PrimitiveMapping.BOOLEAN  -> "ffi_type_uint8"
            PrimitiveMapping.BOOLEAN2 -> "ffi_type_uint16"
            PrimitiveMapping.BOOLEAN4 -> "ffi_type_uint32"
            PrimitiveMapping.POINTER  -> "ffi_type_pointer"
            PrimitiveMapping.FLOAT    -> "ffi_type_float"
            PrimitiveMapping.DOUBLE   -> "ffi_type_double"
            else                      -> throw IllegalStateException(this.toString())
        }
    override val abiType: String
        get() = when (mapping) {
            PrimitiveMapping.BOOLEAN  -> "jboolean"
            PrimitiveMapping.BOOLEAN2 -> "jshort"
            PrimitiveMapping.BOOLEAN4 -> "jint"
            PrimitiveMapping.FLOAT    -> "jfloat"
            PrimitiveMapping.DOUBLE   -> "jdouble"
            else                      -> throw IllegalStateException(this.toString())
        }
    override val jniSignatureJava: String
        get() = when (mapping) {
            PrimitiveMapping.BOOLEAN,
            PrimitiveMapping.BOOLEAN2,
            PrimitiveMapping.BOOLEAN4,
            PrimitiveMapping.FLOAT,
            PrimitiveMapping.DOUBLE -> ""
            else                    -> throw IllegalStateException(this.toString())
        }
}

// Specialization for integers.
open class IntegerType(name: String, mapping: PrimitiveMapping, val unsigned: Boolean = false) : PrimitiveType(name, mapping) {
    init {
        when (mapping) {
            PrimitiveMapping.BYTE,
            PrimitiveMapping.SHORT,
            PrimitiveMapping.INT,
            PrimitiveMapping.LONG,
            PrimitiveMapping.CLONG,
            PrimitiveMapping.POINTER -> {}
            else -> throw IllegalArgumentException("Invalid integer type mapping: $name -> $mapping")
        }
    }
    override val p by lazy { PointerType(this.name, this.mapping.toPointer, elementType = this) }
    override val const by lazy { IntegerType(this.name.const, this.mapping, unsigned) }
    override val libffiType: String
        get() = when (mapping) {
            PrimitiveMapping.BYTE    -> if (unsigned) "ffi_type_uint8" else "ffi_type_sint8"
            PrimitiveMapping.SHORT   -> if (unsigned) "ffi_type_uint16" else "ffi_type_sint16"
            PrimitiveMapping.INT     -> if (unsigned) "ffi_type_uint32" else "ffi_type_sint32"
            PrimitiveMapping.LONG    -> if (unsigned) "ffi_type_uint64" else "ffi_type_sint64"
            PrimitiveMapping.CLONG   -> if (unsigned) "ffi_type_ulong" else "ffi_type_slong"
            PrimitiveMapping.POINTER -> "ffi_type_pointer"
            else                     -> throw IllegalStateException(this.toString())
        }
    override val abiType: String
        get() = when (mapping) {
            PrimitiveMapping.BYTE    -> if (unsigned) "uint8_t" else "jbyte"
            PrimitiveMapping.SHORT   -> if (unsigned) "uint16_t" else "jshort"
            // 32/64-bit integers: no need to distinguish between signed/unsigned (they are ABI compatible)
            PrimitiveMapping.INT     -> "jint"
            PrimitiveMapping.LONG    -> "jlong"
            PrimitiveMapping.CLONG   -> "long"
            PrimitiveMapping.POINTER -> "uintptr_t"
            else                     -> throw IllegalStateException(this.toString())
        }
    override val jniSignatureJava: String
        get() = when (mapping) {
            // Most ABIs pass 8-bit & 16-bit parameters as 32-bit values.
            // An explicit cast is required to zero-extend the jbyte/jshort arguments.
            PrimitiveMapping.BYTE    -> if (unsigned) "U" else "B"
            PrimitiveMapping.SHORT   -> if (unsigned) "C" else "S"
            PrimitiveMapping.INT     -> ""
            PrimitiveMapping.LONG    -> "J"
            PrimitiveMapping.CLONG   -> "N"
            PrimitiveMapping.POINTER -> "P"
            else                     -> throw IllegalStateException(this.toString())
        }
}
val String.enumType get() = IntegerType(this, PrimitiveMapping.INT, unsigned = true)
fun String.enumType(type: IntegerType) = typedef(type, this)

// Specialization for string characters.
class CharType(name: String, mapping: CharMapping) : PrimitiveType(name, mapping) {
    override val mapping: CharMapping get() = super.mapping as CharMapping

    /** Converts CharType to CharSequenceType. */
    override val p by lazy { CharSequenceType(this.name, PointerMapping.DATA_BYTE, elementType = this) }
    override val const by lazy { CharType(this.name.const, this.mapping) }
    override val libffiType: String
        get() = when (mapping) {
            CharMapping.ASCII,
            CharMapping.UTF8  -> "ffi_type_uchar"
            CharMapping.UTF16 -> "ffi_type_ushort"
            else              -> throw IllegalStateException(this.toString())
        }
    override val abiType: String
        get() = when (mapping) {
            CharMapping.ASCII,
            CharMapping.UTF8  -> "uint8_t"
            CharMapping.UTF16 -> "uint16_t"
            else              -> throw IllegalStateException(this.toString())
        }
}

// Arrays
class CArrayType<T : DataType> internal constructor(
    name: String,
    val elementType: T,
    val dimensions: Array<String>
) : BaseType(name, elementType.mapping), AggregateType {
    /*override val p by lazy {
        PointerType("${elementType.name}(*)[$size]", PointerMapping.DATA_POINTER, elementType = this, includesPointer = true)
    }*/
    override val p: PointerType<out NativeType> get() { throw UnsupportedOperationException() }
    override val const: NativeType get() { throw UnsupportedOperationException() }
    override val libffiType: String
        get() = "apiCreateArray(${elementType.libffiType}, $size)" // TODO
    override val abiType: String
        get() = throw IllegalStateException(this.toString())
    override val jniSignatureJava: String
        get() = throw IllegalStateException(this.toString())

    val size: String get() = dimensions.joinToString(" * ")
    val def: String get() = dimensions.joinToString("") { "[$it]" }
}
operator fun <T : DataType> T.get(size: Int) = this[size.toString()]
operator fun <T : DataType> T.get(size: String) = CArrayType(this.name, this, arrayOf(size))
operator fun <T : DataType> CArrayType<T>.get(size: Int) = this[size.toString()]
operator fun <T : DataType> CArrayType<T>.get(size: String) = CArrayType(this.name, this.elementType, this.dimensions + size)

// Structs
class StructType internal constructor(
    /** The struct size in bytes. */
    val definition: Struct,
    /** The type used in the native API. */
    name: String = definition.nativeName
) : BaseType(name, PrimitiveMapping.POINTER), AggregateType {
    override val javaMethodType
        get() = definition.className
    override val p by lazy { PointerType(this.name, PointerMapping.DATA_POINTER, elementType = this) }
    override val const by lazy { StructType(definition, this.name.const) }
    override val libffiType: String
        get() = "apiCreate${if (definition.union) "Union" else "Struct"}(${definition.members.joinToString(", ") {
            if (it is StructMemberArray) {
                "apiCreateArray(${it.nativeType.libffiType}, ${it.size})"
            } else {
                it.nativeType.libffiType
            }
        }})"
    override val abiType: String
        get() = "uintptr_t"
    override val jniSignatureJava: String
        get() = "P"
}

// Java instance passed as jobject to native code
class JObjectType(name: String, type: KClass<*>) : BaseType(name, TypeMapping(name, type, type)), ReferenceType {
    override val p: PointerType<out NativeType> get() { throw UnsupportedOperationException() }
    override val const: NativeType get() { throw UnsupportedOperationException() }
    override val libffiType: String
        get() = throw IllegalStateException(this.toString())
    override val abiType: String
        get() = mapping.jniFunctionType
    override val jniSignatureJava: String
        get() = throw IllegalStateException(this.toString())
}
val KClass<*>.jobject: JObjectType get() = JObjectType("jobject", this)

// Pointers
open class PointerType<T : NativeType> internal constructor(
    /** The type used in the native API. */
    name: String,
    /** The type we map the native type to. */
    mapping: PointerMapping,
    /** If true, the nativeType typedef includes a pointer. */
    includesPointer: Boolean = false,
    /** Optional element type. */
    val elementType: T
) : BaseType(
    when {
        includesPointer    -> name
        name.endsWith('*') -> "$name*"
        else               -> "$name *"
    },
    mapping
), ScalarType, ReferenceType {
    override val mapping: PointerMapping get() = super.mapping as PointerMapping
    override val javaMethodType: String
        get() = if (elementType is StructType)
            elementType.definition.className
        else
            super.javaMethodType

    /** Returns `<element type> **` */
    override val p by lazy { PointerType(this.name, PointerMapping.DATA_POINTER, elementType = this) }
    /** Returns `<element type> * const` */
    override val const by lazy { PointerType(this.name.const, this.mapping, true, elementType) }
    override val libffiType: String
        get() = "ffi_type_pointer"
    override val abiType: String
        get() = "uintptr_t"
    override val jniSignatureJava: String
        get() = "P"
}
internal val NativeType.dereference get() = (if (this is PointerType<*>) this.elementType else this)
internal val NativeType.hasStructValidation
    get() = dereference.let { it is StructType && it.definition.validations.any() }

// Strings
class CharSequenceType internal constructor(
    /** The type used in the native API. */
    name: String,
    /** The type we map the native type to. */
    mapping: PointerMapping,
    /** If true, the native typedef includes a pointer. */
    includesPointer: Boolean = false,
    /** The element type. */
    elementType: CharType
) : PointerType<CharType>(name, mapping, includesPointer, elementType) {
    val charMapping get() = elementType.mapping
    override val const by lazy { CharSequenceType(this.name.const, this.mapping, true, elementType) }
}

// Java arrays (automatically used for array overloads)
class ArrayType<T : NativeType>(
    type: PointerType<T>,
    mapping: PointerMapping = type.mapping
) : PointerType<T>(
    type.name,
    mapping,
    true,
    type.elementType
) {
    internal val jniSignatureArray get() = when (this.mapping.primitive) {
        "byte"   -> "_3B"
        "double" -> "_3D"
        "float"  -> "_3F"
        "int"    -> "_3I"
        "long"   -> "_3J"
        "short"  -> "_3S"
        else     -> throw IllegalStateException(this.toString())
    }
}

// Pointers wrapped in Java classes
open class WrappedPointerType(
    /** The Java wrapper class. */
    val className: String,
    /** The type used in the native API. */
    name: String = className,
    /** If true, the native typedef includes a pointer. */
    includesPointer: Boolean = true
) : PointerType<OpaqueType>(name, PointerMapping.OPAQUE_POINTER, includesPointer, elementType = name.opaque) {
    override val javaMethodType
        get() = className
    override val const by lazy { WrappedPointerType(className, name.const) }
}

// Function types (callbacks)
class FunctionType internal constructor(
    val function: CallbackFunction,
    name: String = function.nativeType
) : WrappedPointerType(function.className, name) {
    override val javaMethodType
        get() = "${super.javaMethodType}I"
    override val const by lazy { FunctionType(function, name.const) }
}

// typedefs
fun typedef(@Suppress("unused") typedef: OpaqueType, name: String) = OpaqueType(name)
fun typedef(typedef: PrimitiveType, name: String) = PrimitiveType(name, typedef.mapping)
fun typedef(typedef: CharType, name: String) = CharType(name, typedef.mapping)
fun typedef(typedef: IntegerType, name: String) = IntegerType(name, typedef.mapping, typedef.unsigned)
fun <T: DataType> typedef(typedef: CArrayType<T>, name: String) = CArrayType(name, typedef.elementType, typedef.dimensions)
fun <T: NativeType> typedef(typedef: PointerType<T>, name: String) = PointerType(name, typedef.mapping, true, typedef.elementType)
fun typedef(typedef: CharSequenceType, name: String) = CharSequenceType(name, typedef.mapping, true, typedef.elementType)
fun typedef(typedef: FunctionType, name: String) = FunctionType(typedef.function, name)
fun typedef(typedef: StructType, name: String, className: String = name) = typedef.definition.copy(className, name).let {
    if (Generator.structs.contains(typedef.definition)) {
        Generator.register(it)
    }
    it.nativeType
}

// --- [ TYPE MAPPINGS ] ---

open class TypeMapping(
    /** The JNI function argument type. */
    val jniFunctionType: String,
    /** The native method argument type. */
    val nativeMethodType: Class<*>,
    /** The Java method argument type. */
    private val javaMethodType: Class<*>
) {

    constructor(
        /** The JNI function argument type. */
        jniFunctionType: String,
        /** The native method argument type. */
        nativeMethodClass: KClass<*>,
        /** The Java method argument type. */
        javaMethodClass: KClass<*>
    ) : this(jniFunctionType, nativeMethodClass.java, javaMethodClass.java)

    companion object {
        internal val VOID = TypeMapping("void", Void.TYPE, Void.TYPE)
    }

    private val Class<*>.javaName get() = this.typeParameters.let {
        if (it.isEmpty())
            this.simpleName
        else
            "${this.simpleName}<${it.indices.map { '?' }.joinToString(", ")}>"
    }

    internal val nativeMethodName get() = nativeMethodType.javaName
    internal val javaMethodName get() = javaMethodType.javaName

    internal fun isBoolean() =
        this === PrimitiveMapping.BOOLEAN ||
        this === PrimitiveMapping.BOOLEAN2 ||
        this === PrimitiveMapping.BOOLEAN4

    internal fun isPseudoBoolean() =
        this === PrimitiveMapping.BOOLEAN2 ||
        this === PrimitiveMapping.BOOLEAN4

    override fun toString(): String {
        return "${javaClass.javaName}(jniFunctionType=$jniFunctionType, nativeMethodType=$nativeMethodType, javaMethodType=$javaMethodType)"
    }
}

open class PrimitiveMapping internal constructor(
    jniFunctionType: String,
    javaMethodType: KClass<*>,
    val toPointer: PointerMapping,
    val bytes: Int,
    val bytesExpression: String = bytes.toString()
) : TypeMapping(jniFunctionType, javaMethodType, javaMethodType) {

    companion object {
        val BOOLEAN = PrimitiveMapping("jboolean", Boolean::class, PointerMapping.DATA_BOOLEAN, 1)
        val BOOLEAN2 = PrimitiveMapping("jshort", Short::class, PointerMapping.DATA_SHORT, 2)
        val BOOLEAN4 = PrimitiveMapping("jint", Int::class, PointerMapping.DATA_INT, 4)

        val BYTE = PrimitiveMapping("jbyte", Byte::class, PointerMapping.DATA_BYTE, 1)
        val SHORT = PrimitiveMapping("jshort", Short::class, PointerMapping.DATA_SHORT, 2)
        val INT = PrimitiveMapping("jint", Int::class, PointerMapping.DATA_INT, 4)
        val LONG = PrimitiveMapping("jlong", Long::class, PointerMapping.DATA_LONG, 8)

        val CLONG = PrimitiveMapping("jlong", Long::class, PointerMapping.DATA_CLONG, Int.MAX_VALUE /* should not be used */, "CLONG_SIZE")

        // Integer type with enough precision to store a pointer
        val POINTER = PrimitiveMapping("jlong", Long::class, PointerMapping.DATA_POINTER, Int.MAX_VALUE /* should not be used */, "POINTER_SIZE")

        val FLOAT = PrimitiveMapping("jfloat", Float::class, PointerMapping.DATA_FLOAT, 4)
        val DOUBLE = PrimitiveMapping("jdouble", Double::class, PointerMapping.DATA_DOUBLE, 8)
    }

}

class CharMapping(
    jniFunctionType: String,
    javaMethodType: KClass<*>,
    toPointer: PointerMapping,
    bytes: Int,
    val charset: String
) : PrimitiveMapping(jniFunctionType, javaMethodType, toPointer, bytes) {

    companion object {
        val ASCII = CharMapping("jbyte", Byte::class, PointerMapping.DATA_BYTE, 1, "ASCII")
        val UTF8 = CharMapping("jbyte", Byte::class, PointerMapping.DATA_BYTE, 1, "UTF8")
        val UTF16 = CharMapping("jchar", Char::class, PointerMapping.DATA_SHORT, 2, "UTF16")
    }

}

open class PointerMapping private constructor(
    javaMethodType: KClass<*>,
    val byteShift: String,
    val supportsArrayOverload: Boolean = false
) : TypeMapping("jlong", Long::class, javaMethodType) {

    private constructor(javaMethodType: KClass<*>, byteShift: Int) : this(javaMethodType, byteShift.toString(), byteShift != 0)

    companion object {
        internal val OPAQUE_POINTER = PointerMapping(Long::class, "POINTER_SHIFT")

        val DATA_POINTER = PointerMapping(PointerBuffer::class, "POINTER_SHIFT")
        val DATA_CLONG = PointerMapping(CLongBuffer::class, "CLONG_SHIFT")

        val DATA_BOOLEAN = PointerMapping(ByteBuffer::class, 0)
        val DATA_BYTE = PointerMapping(ByteBuffer::class, 0)
        val DATA_SHORT = PointerMapping(ShortBuffer::class, 1)
        val DATA_INT = PointerMapping(IntBuffer::class, 2)
        val DATA_LONG = PointerMapping(LongBuffer::class, 3)
        val DATA_FLOAT = PointerMapping(FloatBuffer::class, 2)
        val DATA_DOUBLE = PointerMapping(DoubleBuffer::class, 3)
    }

    internal val isMultiByte get() = this !== OPAQUE_POINTER && byteShift != "0"

    internal val box = super.javaMethodName.substringBefore("Buffer")
    internal val primitive get() = when (this) {
        DATA_BOOLEAN -> "boolean"
        DATA_CLONG   -> "long"
        DATA_POINTER -> "long"
        else         -> box.lowercase()
    }

    internal val mallocType get() = when (box) {
        "Byte" -> ""
        else   -> box
    }

}

// Generator utilities

private val String.const get() =
    if (endsWith(" const"))
        throw IllegalStateException("The const modifier cannot be applied multiple times consecutively")
    else
        "$this const"

internal val String.nullable: String get() {
    val input = this
    return buildString {
        if (input.contains("[]")) {
            append(input.substringBefore("[]"))
            append(" @Nullable []")
            append(substringAfter("[]", missingDelimiterValue = ""))
        } else {
            if (input.contains('.')) {
                append(input.substringBeforeLast('.'))
                append(".")
            }
            append("@Nullable ")
            append(input.substringAfterLast('.'))
        }
    }
}


/** The JNI function argument type. */
internal val NativeType.jniFunctionType
    get() = mapping.jniFunctionType

/** The native method argument type. */
internal val NativeType.nativeMethodType
    get() = mapping.nativeMethodName

/** The Java method argument type. */
internal val NativeType.javaMethodType
    get() = (this as BaseType).javaMethodType // weird because overridden by subtypes, but internal visibility is required

internal val NativeType.jniSignatureStrict
    get() = when (mapping.nativeMethodType) {
        Boolean::class.java -> "Z"
        Byte::class.java    -> "B"
        Char::class.java    -> "C"
        Double::class.java  -> "D"
        Float::class.java   -> "F"
        Int::class.java     -> "I"
        Long::class.java    -> "J"
        Short::class.java   -> "S"
        Void.TYPE           -> "V"
        else                -> "L${this.mapping.nativeMethodType.name};"
    }
internal val NativeType.jniSignature: String
    get() {
        val sig = jniSignatureJava
        return if (sig.isNotEmpty())
            sig
        else
            jniSignatureStrict
    }

internal fun NativeType.annotation(type: String) = if (type == name)
    null
else
    "@NativeType(\"$name${if (this !is CArrayType<*>) "" else this.def
    }\")"
internal fun NativeType.annotate(type: String) = annotation(type).let {
    if (it == null)
        type
    else
        "$it $type"
}

internal val NativeType.castAddressToPointer
    get() = (this is PointerType<*> && this !is ArrayType<*> && this !== va_list) || this is StructType

internal val NativeType.isPointer
    get() = this is PointerType<*> || this.mapping === PrimitiveMapping.POINTER

internal val NativeType.isPointerData
    get() = this is PointerType<*> && this.mapping !== PointerMapping.OPAQUE_POINTER

internal val NativeType.isReference
    get() = this is ReferenceType && (this.mapping !== PointerMapping.OPAQUE_POINTER || this is WrappedPointerType)

internal val NativeType.isPointerSize
    get() = this.mapping === PointerMapping.DATA_INT || this.mapping === PointerMapping.DATA_POINTER || this.mapping === PointerMapping.DATA_CLONG

internal val NativeType.isArray
    get() = this is PointerType<*> && this.mapping.supportsArrayOverload
