/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

// General

/** Marks the function parameter or return value as const. */
object const : FunctionModifier, ParameterModifier {
    override val isSpecial = false
    override fun validate(func: Func) {
        if (func.returns.nativeType !is PointerType)
            throw IllegalArgumentException("The const modifier can only be applied on functions with pointer return types.")
    }

    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType)
            throw IllegalArgumentException("The const modifier can only be applied on pointer parameters.")

        if (param.paramType != ParameterType.IN && param.nativeType.elementType !is PointerType)
            throw IllegalArgumentException("The const modifier can only be applied on input parameters.")
    }
}

// Parameter

object Virtual : ParameterModifier {
    override val isSpecial = false
}

object MapToInt : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType.mapping !== PrimitiveMapping.BYTE && param.nativeType.mapping !== PrimitiveMapping.SHORT)
            throw IllegalArgumentException("The MapToInt modifier can only be applied on byte or short parameters.")
    }
}

/** When present, the parameter transformation is stored to a local variable that can be referenced from custom code or checks. */
object UseVariable : ParameterModifier {
    override val isSpecial = false
}

class AutoSizeFactor(
    val operator: String,
    val operatorInv: String,
    val expression: String
) {
    companion object {
        fun div(expression: String) = AutoSizeFactor("/", "*", expression)
        fun mul(expression: String) = AutoSizeFactor("*", "/", expression)
        fun shl(expression: String) = AutoSizeFactor("<<", ">>", expression)
        fun shr(expression: String) = AutoSizeFactor(">>", "<<", expression)
    }

    fun scale(operand: String) = "$operand $operator $expression"
    fun scaleInv(operand: String) = "$operand $operatorInv $expression"
}

/** Marks the parameter to be replaced with .remaining() on the buffer parameter specified by reference. */
fun AutoSize(div: Int, reference: String, vararg dependent: String) =
    if (div < 1)
        throw IllegalArgumentException()
    else if (div == 1)
        AutoSize(reference, *dependent)
    else if (Integer.bitCount(div) == 1)
        AutoSizeShr(Integer.numberOfTrailingZeros(div).toString(), reference, *dependent)
    else
        AutoSizeDiv(div.toString(), reference, dependent = *dependent)

fun AutoSizeDiv(expression: String, reference: String, vararg dependent: String) =
    AutoSize(reference, *dependent, factor = AutoSizeFactor.div(expression))

fun AutoSizeMul(expression: String, reference: String, vararg dependent: String) =
    AutoSize(reference, *dependent, factor = AutoSizeFactor.mul(expression))

fun AutoSizeShr(expression: String, reference: String, vararg dependent: String) =
    AutoSize(reference, *dependent, factor = AutoSizeFactor.shr(expression))

fun AutoSizeShl(expression: String, reference: String, vararg dependent: String) =
    AutoSize(reference, *dependent, factor = AutoSizeFactor.shl(expression))

class AutoSize(
    override val reference: String,
    vararg val dependent: String,
    /** If not null, the expression will be appended to the parameter. */
    val factor: AutoSizeFactor? = null
) : ParameterModifier, ReferenceModifier {
    override val isSpecial = true

    override fun hasReference(reference: String) = this.reference == reference || dependent.any { it == reference }

    override fun validate(param: Parameter) {
        when (param.paramType) {
            ParameterType.IN    ->
                if (param.nativeType is PointerType) {
                    if (dependent.isNotEmpty())
                        throw IllegalArgumentException("IN pointer parameters with the AutoSize modifier cannot reference dependent parameters.")
                } else if (when (param.nativeType.mapping) {
                    PrimitiveMapping.BYTE,
                    PrimitiveMapping.SHORT,
                    PrimitiveMapping.INT,
                    PrimitiveMapping.LONG,
                    PrimitiveMapping.POINTER -> false
                    else                     -> true
                })
                    throw IllegalArgumentException("IN parameters with the AutoSize modifier must be integer primitive types.")
            ParameterType.INOUT -> {
                if (param.nativeType !is PointerType || when (param.nativeType.mapping) {
                    PointerMapping.DATA_INT,
                    PointerMapping.DATA_POINTER -> false
                    else                        -> true
                })
                    throw IllegalArgumentException("INOUT parameters with the AutoSize modifier must be integer pointer types.")
            }
            else                ->
                throw IllegalArgumentException("The AutoSize modifier can only be applied on IN or INOUT parameters.")
        }
    }
}

class AutoSizeResultParam(val expression: String?) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.paramType === ParameterType.IN) {
            if (param.nativeType.mapping.nativeMethodType.isPrimitive) {
                when (param.nativeType.mapping) {
                    PrimitiveMapping.INT,
                    PrimitiveMapping.POINTER -> {
                    }
                    else                     -> {
                        throw IllegalArgumentException("The AutoSizeResult modifier on input parameters can only be applied on integer primitive types.")
                    }
                }
            }
        } else if (param.paramType === ParameterType.OUT) {
            when (param.nativeType.mapping) {
                PointerMapping.DATA_INT,
                PointerMapping.DATA_POINTER -> {
                }
                else                        -> {
                    throw IllegalArgumentException("The AutoSizeResult modifier on output parameters can only be applied on integer pointer types.")
                }
            }

            if (param has nullable)
                throw IllegalArgumentException("The AutoSizeResult modifier cannot be applied on nullable parameters.")
        } else
            throw IllegalArgumentException("The AutoSizeResult modifier cannot be used on in/out parameters.")
    }
}

val AutoSizeResult = AutoSizeResultParam(null)
/* Custom expression. Use $original to inject the hardcoded expression */
fun AutoSizeResult(expression: String) = AutoSizeResultParam(expression)

/** Adds a capacity check to a buffer parameter. */
class Check(
    /** An integer expression to validate against the buffer capacity. */
    val expression: String,
    /** If true, the check will only be performed in debug mode. Useful for expensive checks. */
    val debug: Boolean = false
) : ParameterModifier {
    override val isSpecial = expression != "0"
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType)
            throw IllegalArgumentException("The Check modifier can only be applied on pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The Check modifier cannot be applied on opaque pointer types.")
    }
}

/** Factory method for Check modifiers with integer expressions. */
fun Check(value: Int) = Check(Integer.toString(value))

/** Should be used on pointer parameters whose size cannot be validated and may be unsafe. */
val Unsafe = Check("0")

class Nullable internal constructor(val optional: Boolean) : ParameterModifier {
    override val isSpecial = optional
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType)
            throw IllegalArgumentException("The nullable modifier can only be applied on pointer types.")
    }
}

/** Marks a pointer parameter as nullable. */
val nullable = Nullable(false)
/** Marks a pointer parameter as optional. Similar to nullable, but the parameter either doesn't exist or it exists and is not null. */
val optional = Nullable(true)

/** Marks a buffer parameter as terminated by the specified value. */
class Terminated(val value: String) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType)
            throw IllegalArgumentException("The NullTerminated modifier can only be applied on pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The NullTerminated modifier cannot be applied on opaque pointer types.")
    }
}

/** Marks a buffer parameter as null-terminated. */
val NullTerminated = Terminated("")

/** Marks a parameter to be replaced with an expression. */
class Expression(
    /** The expression to use instead of the parameter name. */
    val value: String,
    /** If true, the parameter will not be removed from the method signature. */
    val keepParam: Boolean = false
) : ParameterModifier {
    override val isSpecial = true
}

interface AutoTypeToken {
    val name: String
    val mapping: PointerMapping
    val className: String
}

/**
 * Replaces a parameter with specific type tokens and the referenced pointer parameter with the typed NIO buffer that corresponds to the token value. See
 * GL20#glVertexAttribPointer for an example.
 */
class AutoType(override val reference: String, vararg val types: AutoTypeToken) : ParameterModifier, ReferenceModifier {
    override val isSpecial = false

    init {
        if (types.isEmpty())
            throw IllegalArgumentException("No types specified.")
    }

    override fun validate(param: Parameter) {
        if (param.nativeType !is IntegerType || !param.nativeType.unsigned)
            throw IllegalArgumentException("The AutoType modifier can only be applied on unsigned integer parameters.")
    }
}

/** Like AutoType, but with a hard-coded list of types. See glTexImage2D for an example. */
class MultiType(
    vararg val types: PointerMapping,
    /** If true, a byte[] overload will be generated as well. */
    val byteArray: Boolean = false
) : ParameterModifier {
    init {
        if (types.isEmpty())
            throw IllegalArgumentException("No buffer types specified.")

        for (t in types) {
            if (t === PointerMapping.DATA_BYTE)
                throw IllegalArgumentException("The DATA_BYTE mapping cannot be used with the MultiType modifier.")

            if (t.byteShift == null)
                throw IllegalArgumentException("The MultiType modifier can only be applied with concrete PointerMappings.")
        }
    }

    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType)
            throw IllegalArgumentException("The MultiType modifier can only be applied on pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The MultiType modifier cannot be applied on opaque pointer types.")
    }

}

val MultiTypeAll = MultiType(
    PointerMapping.DATA_SHORT,
    PointerMapping.DATA_INT,
    PointerMapping.DATA_LONG,
    PointerMapping.DATA_FLOAT,
    PointerMapping.DATA_DOUBLE,
    PointerMapping.DATA_POINTER
)

/** Marks a pointer parameter to become the return value of an alternative method. */
class Return(
    /** The parameter that returns the actual buffer size */
    val lengthParam: String,
    /** An expression that defines the maximum length value. If defined, an additional alternative method will be generated. */
    val maxLengthExpression: String? = null,
    /** When true, any temporary buffers will be allocated on the heap. */
    val heapAllocate: Boolean = false,
    /** When true, the actual buffer size includes the null-termination. */
    val includesNT: Boolean = false
) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType is PointerType) {
            if (param.paramType !== ParameterType.OUT)
                throw IllegalArgumentException("The Return modifier can only be applied on output parameters.")

            if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
                throw IllegalArgumentException("The Return modifier cannot be applied on opaque pointer types.")

            if (this !== ReturnParam && param.nativeType !is CharSequenceType && !lengthParam.startsWith(RESULT))
                throw IllegalArgumentException("The Return modifier can only be applied on CharSequence parameters.")

            if (heapAllocate && param.nativeType !is CharSequenceType)
                throw IllegalArgumentException("The heapAllocate option can only be enabled with CharSequence parameters.")

            if (includesNT && param.nativeType !is CharSequenceType)
                throw IllegalArgumentException("The includesNT option can only be enabled with CharSequence parameters.")
        } else {
            if (this !== ReturnParam || param.nativeType !is StructType)
                throw IllegalArgumentException("The ReturnParam modifier can only be used on struct value parameters.")
        }
    }
}

/** Used for simple return values. */
val ReturnParam = Return("", null)

/** Marks a buffer parameter to transform to a single element value in an alternative method. */
class SingleValue(val newName: String) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType)
            throw IllegalArgumentException("The SingleValue modifier can only be applied on pointer types.")

        if (param.nativeType.mapping === PointerMapping.OPAQUE_POINTER)
            throw IllegalArgumentException("The SingleValue modifier cannot be applied on opaque pointer types.")

        if (param.paramType != ParameterType.IN)
            throw IllegalArgumentException("The SingleValue modifier can only be applied on input parameters.")
    }
}

/** Marks a pointer parameter as an array of pointers. */
class PointerArray(
    /** The array element type. */
    val elementType: PointerType,
    /** The single version parameter name. */
    val singleName: String,
    /** The parameter that defines the data legth of each element in the array. If null, the elements are assumed to be null-terminated. */
    val lengthsParam: String? = null
) : ParameterModifier {
    override val isSpecial = true
    override fun validate(param: Parameter) {
        if (param.nativeType !is PointerType)
            throw IllegalArgumentException("The PointerArray modifier can only be applied on pointer types.")

        if (param.nativeType.mapping != PointerMapping.DATA_POINTER)
            throw IllegalArgumentException("The PointerArray modifier can only be applied on pointer-to-pointer types.")

        if (param.paramType != ParameterType.IN)
            throw IllegalArgumentException("The PointerArray modifier can only be applied on input parameters.")
    }
}