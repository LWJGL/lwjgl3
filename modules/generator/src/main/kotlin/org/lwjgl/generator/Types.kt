/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import org.lwjgl.*
import java.nio.*
import kotlin.reflect.*

/*
Type hierarchy:
---------------
- NativeType (interface: root)
- BaseType (abstract: root)
    * VoidType
    * OpaqueType (cannot be used directly, must be wrapped in PointerType)
    - DataType (interface: types that can be used as parameters or struct members)
        - ValueType (interface: passed by-value)
            * PrimitiveType
                * IntegerType
                * CharType
            * StructType (mapped to struct class)
        - ReferenceType (interface: passed by-reference)
            * JObjectType (only type passed as Java object to JNI)
            * PointerType (mapped to raw pointer or buffer)
                * ArrayType (mapped to java array)
                * CharSequenceType (mapped to String/CharSequence)
                * ObjectType (mapped to a Java class)
                    * CallbackType (mapped to callback interface)
                    * C++ classes (if we add support in the future)
*/
interface NativeType {
    /** The type used in the native API. */
    val name: String
    /** The type we map the native type to. */
    val mapping: TypeMapping

    val p : PointerType<out NativeType>
    val const : NativeType
}
// These interfaces simplify some implementation details and the DSL
interface DataType : NativeType
    interface ValueType : DataType
    interface ReferenceType : DataType

/** Base implementation of all concrete types */
abstract class BaseType internal constructor(
    override val name: String,
    override val mapping: TypeMapping
): NativeType {
    internal open val javaMethodType
        get() = if (mapping === PrimitiveMapping.BOOLEAN4) "boolean" else mapping.javaMethodName

    override fun toString() =
        "${this::class.java.simpleName}: $name | $jniFunctionType | $nativeMethodType | $javaMethodType"
}

class VoidType internal constructor(name: String) : BaseType(name, TypeMapping.VOID) {
    override val p by lazy { PointerType(name, PointerMapping.DATA_BYTE, elementType = this) }
    override val const by lazy { VoidType(this.name.const) }
}
val String.void: VoidType get() = VoidType(this)

// Specialization for primitives.
open class PrimitiveType(name: String, mapping: PrimitiveMapping) : BaseType(name, mapping), ValueType {
    override val mapping: PrimitiveMapping get() = super.mapping as PrimitiveMapping
    override val p: PointerType<out PrimitiveType> by lazy { PointerType(this.name, this.mapping.toPointer, elementType = this) }
    override val const by lazy { PrimitiveType(this.name.const, this.mapping) }
}

// Specialization for integers.
open class IntegerType(name: String, mapping: PrimitiveMapping, val unsigned: Boolean = false) : PrimitiveType(name, mapping) {
    override val p by lazy { PointerType(this.name, this.mapping.toPointer, elementType = this) }
    override val const by lazy { IntegerType(this.name.const, this.mapping, unsigned) }
}
val String.enumType get() = IntegerType(this, PrimitiveMapping.INT)

// Specialization for string characters.
class CharType(name: String, mapping: CharMapping) : PrimitiveType(name, mapping) {
    override val mapping: CharMapping get() = super.mapping as CharMapping

    /** Converts CharType to CharSequenceType. */
    override val p by lazy { CharSequenceType(this.name, PointerMapping.DATA_BYTE, elementType = this) }
    override val const by lazy { CharType(this.name.const, this.mapping) }
}

// Structs
class StructType internal constructor(
    /** The struct size in bytes. */
    val definition: Struct,
    /** The type used in the native API. */
    name: String = definition.nativeName
) : BaseType(name, PrimitiveMapping.POINTER), ValueType {
    override val javaMethodType
        get() = definition.className
    override val p by lazy { PointerType(this.name, PointerMapping.DATA_POINTER, elementType = this) }
    override val const by lazy { StructType(definition, this.name.const) }
}

// Java instance passed as jobject to native code
class JObjectType(name: String, type: KClass<*>) : BaseType(name, TypeMapping(name, type, type)), ReferenceType {
    override val p: PointerType<JObjectType> get() { throw UnsupportedOperationException() }
    override val const: NativeType get() { throw UnsupportedOperationException() }
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
), ReferenceType {
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
}
internal val NativeType.dereference get() = (if (this is PointerType<*>) this.elementType else this)
internal val NativeType.hasStructValidation
    get() = dereference.let { it is StructType && it.definition.validations.any() }

// Opaque types
class OpaqueType internal constructor(name: String) : BaseType(name, TypeMapping.VOID) {
    override val p by lazy { PointerType(this.name, PointerMapping.OPAQUE_POINTER, includesPointer = false, elementType = this) }
    override val const by lazy { OpaqueType(this.name.const) }
}
val String.opaque get() = OpaqueType(this)
val String.p get() = this.opaque.p
val String.handle get() = typedef(this.opaque.p, this)

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

// Arrays (automatically used for array overloads)
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
        else     -> throw IllegalStateException()
    }
}

// Objects (org.lwjgl.system.Pointer subclasses)
open class ObjectType(
    /** The Java wrapper class. */
    val className: String,
    /** The type used in the native API. */
    name: String = className,
    /** If true, the native typedef includes a pointer. */
    includesPointer: Boolean = true
) : PointerType<OpaqueType>(name, PointerMapping.OPAQUE_POINTER, includesPointer, elementType = name.opaque) {
    override val javaMethodType
        get() = className
    override val const by lazy { ObjectType(className, name.const) }
}

// Callbacks
class CallbackType internal constructor(
    val function: CallbackFunction,
    name: String = function.nativeType
) : ObjectType(function.className, name) {
    override val javaMethodType
        get() = "${super.javaMethodType}I"
    override val const by lazy { CallbackType(function, name.const) }
}

// typedefs
fun typedef(typedef: PrimitiveType, name: String) = PrimitiveType(name, typedef.mapping)
fun typedef(typedef: IntegerType, name: String) = IntegerType(name, typedef.mapping, typedef.unsigned)
fun <T: NativeType> typedef(typedef: PointerType<T>, name: String) = PointerType(name, typedef.mapping, true, typedef.elementType)
fun typedef(typedef: CharSequenceType, name: String) = CharSequenceType(name, typedef.mapping, true, typedef.elementType)

// --- [ TYPE MAPPINGS ] ---

open class TypeMapping(
    /** The JNI function argument type. */
    val jniFunctionType: String,
    /** The native method argument type. */
    val nativeMethodType: Class<*>,
    /** The Java method argument type. */
    protected val javaMethodType: Class<*>
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

}

open class PrimitiveMapping internal constructor(
    jniFunctionType: String,
    javaMethodType: KClass<*>,
    val bytes: Int,
    val toPointer: PointerMapping
) : TypeMapping(jniFunctionType, javaMethodType, javaMethodType) {

    companion object {
        val BOOLEAN = PrimitiveMapping("jboolean", Boolean::class, 1, PointerMapping.DATA_BOOLEAN)
        val BOOLEAN4 = PrimitiveMapping("jint", Int::class, 4, PointerMapping.DATA_INT)

        val BYTE = PrimitiveMapping("jbyte", Byte::class, 1, PointerMapping.DATA_BYTE)
        val SHORT = PrimitiveMapping("jshort", Short::class, 2, PointerMapping.DATA_SHORT)
        val INT = PrimitiveMapping("jint", Int::class, 4, PointerMapping.DATA_INT)
        val LONG = PrimitiveMapping("jlong", Long::class, 8, PointerMapping.DATA_LONG)

        // Integer type with enough precision to store a pointer
        val POINTER = PrimitiveMapping("jlong", Long::class, Int.MAX_VALUE /* should not be used */, PointerMapping.DATA_POINTER)

        val FLOAT = PrimitiveMapping("jfloat", Float::class, 4, PointerMapping.DATA_FLOAT)
        val DOUBLE = PrimitiveMapping("jdouble", Double::class, 8, PointerMapping.DATA_DOUBLE)
    }

}

class CharMapping(
    jniFunctionType: String,
    javaMethodType: KClass<*>,
    bytes: Int,
    toPointer: PointerMapping,
    val charset: String
) : PrimitiveMapping(jniFunctionType, javaMethodType, bytes, toPointer) {

    companion object {
        val ASCII = CharMapping("jbyte", Byte::class, 1, PointerMapping.DATA_BYTE, "ASCII")
        val UTF8 = CharMapping("jbyte", Byte::class, 1, PointerMapping.DATA_BYTE, "UTF8")
        val UTF16 = CharMapping("jchar", Char::class, 2, PointerMapping.DATA_SHORT, "UTF16")
    }

}

open class PointerMapping private constructor(
    javaMethodType: KClass<*>,
    val byteShift: String,
    internal val supportsArrayOverload: Boolean = false
) : TypeMapping("jlong", Long::class, javaMethodType) {

    private constructor(javaMethodType: KClass<*>, byteShift: Int) : this(javaMethodType, Integer.toString(byteShift), byteShift != 0)

    companion object {
        internal val OPAQUE_POINTER = PointerMapping(Long::class, "POINTER_SHIFT")

        val DATA_POINTER = PointerMapping(PointerBuffer::class, "POINTER_SHIFT")

        val DATA_BOOLEAN = PointerMapping(ByteBuffer::class, 0)
        val DATA_BYTE = PointerMapping(ByteBuffer::class, 0)
        val DATA_SHORT = PointerMapping(ShortBuffer::class, 1)
        val DATA_INT = PointerMapping(IntBuffer::class, 2)
        val DATA_LONG = PointerMapping(LongBuffer::class, 3)
        val DATA_FLOAT = PointerMapping(FloatBuffer::class, 2)
        val DATA_DOUBLE = PointerMapping(DoubleBuffer::class, 3)
    }

    internal val isMultiByte get() = this !== PointerMapping.OPAQUE_POINTER && byteShift != "0"

    internal val box = super.javaMethodName.substringBefore("Buffer")
    internal val primitive get() = when (this) {
        DATA_BOOLEAN -> "boolean"
        DATA_POINTER -> "long"
        else         -> box.toLowerCase()
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
internal val NativeType.jniSignature
    get() = if (mapping.nativeMethodType === Long::class.java && mapping !== PrimitiveMapping.LONG) "P" else jniSignatureStrict
internal val NativeType.jniSignatureJava
    get() = if (mapping.nativeMethodType === Long::class.java)
        if (mapping === PrimitiveMapping.LONG) "J" else "P"
    else
        ""

internal fun NativeType.annotation(type: String, arraySize: String? = null): String? {
    return if (type == name)
        null
    else
        "@NativeType(\"$name${if (arraySize == null) "" else "[$arraySize]"}\")"
}
internal fun NativeType.annotate(type: String, arraySize: String? = null) = annotation(type, arraySize).let {
    if (it == null)
        type
    else
        "$it $type"
}

internal val NativeType.castAddressToPointer
    get() = (this is PointerType<*> && this !is ArrayType<*>) || this is StructType

val NativeType.isPointer
    get() = this is PointerType<*> || this.mapping === PrimitiveMapping.POINTER

val NativeType.isPointerHandle
    get() = this is PointerType<*> && this.mapping === PointerMapping.OPAQUE_POINTER

internal val NativeType.isPointerData
    get() = this is PointerType<*> && this.mapping !== PointerMapping.OPAQUE_POINTER

internal val NativeType.isReference
    get() = this is ReferenceType && (this.mapping !== PointerMapping.OPAQUE_POINTER || this is ObjectType)

internal val NativeType.isPointerSize
    get() = this.mapping === PointerMapping.DATA_INT || this.mapping === PointerMapping.DATA_POINTER

internal val NativeType.isArray
    get() = this is PointerType<*> && this.mapping.supportsArrayOverload

