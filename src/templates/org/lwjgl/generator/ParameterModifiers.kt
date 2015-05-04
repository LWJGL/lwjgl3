package org.lwjgl.generator

// General

/** Marks the function parameter or return value as const. */
val const = object: QualifiedTypeModifier() {
	override val isSpecial = false
	override fun validate(qtype: QualifiedType) {
		if ( qtype.nativeType !is PointerType )
			throw IllegalArgumentException("The const modifier can only be applied on pointer types.")

		if ( qtype is Parameter && qtype.paramType != ParameterType.IN )
			throw IllegalArgumentException("The const modifier can only be applied on input parameters.")
	}
}

// Parameter

val virtual = object: ParameterModifier() {
	override val isSpecial = false
}

private trait AutoSizeFactor {
	fun expression(): String
	fun expressionInv(): String
}

private class AutoSizeFactorShift(
	val left: Boolean,
	val expression: String
): AutoSizeFactor {
	override fun expression() = getExpression(left)
	override fun expressionInv() = getExpression(!left)

	private fun getExpression(left: Boolean) = if ( left ) "<< $expression" else ">> $expression"
}

private class AutoSizeFactorScale(
	val multiply: Boolean,
	val expression: String
): AutoSizeFactor {
	override fun expression() = getExpression(multiply)
	override fun expressionInv() = getExpression(!multiply)

	private fun getExpression(multiply: Boolean) = if ( multiply ) "* $expression" else "/ $expression"
}

/** Marks the parameter to be replaced with .remaining() on the buffer parameter specified by reference. */
class AutoSize(
	override val reference: String,
	vararg val dependent: String,
	/** When true, there exists a parameter that specifies the element type, so ignore any toBytes() call. */
	val autoTyped: Boolean = false
): ParameterModifier(), ReferenceModifier {
	companion object: ModifierKey<AutoSize>

	override val isSpecial = true

	/** If not null, the expression will be appended to the parameter. */
	var factor: AutoSizeFactor? = null
	/** If true, the parameter expects a size in bytes, so proper scaling will be applied based on the referenced buffer type. */
	var toBytes: Boolean = false
		set(toBytes: Boolean) {
			if ( !autoTyped )
				$toBytes = toBytes
		}

	fun shl(value: Int) = shl("$value")
	fun shl(expression: String): AutoSize {
		this.factor = AutoSizeFactorShift(true, expression)
		return this
	}

	fun shr(value: Int) = shr("$value")
	fun shr(expression: String): AutoSize {
		this.factor = AutoSizeFactorShift(false, expression)
		return this
	}

	fun times(value: Int) = times("$value")
	fun times(expression: String): AutoSize {
		this.factor = AutoSizeFactorScale(true, expression)
		return this
	}

	fun div(value: Int) = div("$value")
	fun div(expression: String): AutoSize {
		this.factor = AutoSizeFactorScale(false, expression)
		return this
	}

	fun hasReference(reference: String) = this.reference == reference || dependent.any { it == reference }

	override fun validate(param: Parameter) {
		when ( param.paramType ) {
			ParameterType.IN -> if ( when ( param.nativeType.mapping ) {
				PrimitiveMapping.SHORT,
				PrimitiveMapping.INT,
				PrimitiveMapping.PTR -> false
				else -> true
			} )
				throw IllegalArgumentException("IN parameters with the AutoSize modifier must be integer primitive types.")
			ParameterType.INOUT -> {
				if ( param.nativeType !is PointerType || when ( param.nativeType.mapping ) {
					PointerMapping.DATA_INT,
					PointerMapping.DATA_POINTER -> false
					else -> true
				} )
					throw IllegalArgumentException("INOUT parameters with the AutoSize modifier must be integer pointer types.")
			}
			else ->
				throw IllegalArgumentException("The AutoSize modifier can only be applied on IN or INOUT parameters.")
		}
	}
}

val autoSizeResult = object: ParameterModifier() {
	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.paramType === ParameterType.IN )
			when ( param.nativeType.mapping ) {
				PrimitiveMapping.INT,
				PrimitiveMapping.PTR -> {
				}
				else                 -> {
					throw IllegalArgumentException("The autoSizeResult modifier on input parameters can only be applied on integer primitive types.")
				}
			}
		else if ( param.paramType === ParameterType.OUT )
			when ( param.nativeType.mapping ) {
				PointerMapping.DATA_INT,
				PointerMapping.DATA_POINTER -> {
				}
				else                        -> {
					throw IllegalArgumentException("The autoSizeResult modifier on output parameters can only be applied on integer pointer types.")
				}
			}
		else
			throw IllegalArgumentException("The autoSizeResult modifier cannot be used on in/out parameters.")
	}
}

/** Adds a capacity check to a buffer parameter. */
class Check(
	/** An integer expression to validate against the buffer capacity. */
	val expression: String,
	/** If the expression value is in bytes rather in elements (of the buffer type). */
	val bytes: Boolean = false,
	/** If true, the check will only be performed in debug mode. Useful for expensive checks. */
	val debug: Boolean = false
): ParameterModifier() {
	companion object: ModifierKey<Check>

	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The Check modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping === PointerMapping.OPAQUE_POINTER )
			throw IllegalArgumentException("The Check modifier cannot be applied on opaque pointer types.")
	}
}
fun Check(value: Int) = Check(Integer.toString(value))

class Nullable internal(val optional: Boolean): ParameterModifier() {
	companion object: ModifierKey<Nullable>

	override val isSpecial = optional
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The nullable modifier can only be applied on pointer types.")
	}
}
/** Marks a pointer parameter as nullable. */
val nullable = Nullable(false)
/** Marks a pointer parameter as optional. Similar to nullable, but the parameter either doesn't exist or it exists and is not null. */
val optional = Nullable(true)

/** Marks a buffer parameter as null-terminated. */
val nullTerminated = object: ParameterModifier() {
	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The NullTerminated modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping === PointerMapping.OPAQUE_POINTER )
			throw IllegalArgumentException("The NullTerminated modifier cannot be applied on opaque pointer types.")
	}
}

/** Marks a parameter to be replaced with an expression. */
class Expression(
	/** The expression to use instead of the parameter name. */
	val value: String,
	/** If true, the parameter will not be removed from the method signature. */
	val keepParam: Boolean = false
): ParameterModifier() {
	companion object: ModifierKey<Expression>

	override val isSpecial = true
}

/** Like AutoType, but with a hard-coded list of types. See glTexImage2D for an example. */
class MultiType(vararg val types: PointerMapping): ParameterModifier() {
	companion object: ModifierKey<MultiType>

	init {
		if ( types.isEmpty() )
			throw IllegalArgumentException("No buffer types specified.")

		if ( types.any { it.byteShift == null } )
			throw IllegalArgumentException("The MultiType modifier can only be applied with concrete PointerMappings.")
	}

	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The MultiType modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping === PointerMapping.OPAQUE_POINTER )
			throw IllegalArgumentException("The MultiType modifier cannot be applied on opaque pointer types.")
	}

}

/** Marks a char pointer parameter to become the return value of an alternative method. */
class Return(
	/** The parameter that returns the actual string size */
	val lengthParam: String?,
	/** An expression that defines the maxLength value. If defined an additional alternative method will be generated. */
	val maxLengthExpression: String? = null
): ParameterModifier() {
	companion object: ModifierKey<Return>

	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The returnValue modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping === PointerMapping.OPAQUE_POINTER )
			throw IllegalArgumentException("The returnValue modifier cannot be applied on opaque pointer types.")

		if ( param.paramType !== ParameterType.OUT )
			throw IllegalArgumentException("The returnValue modifier can only be applied on output parameters.")
	}
}
/** Used for simple return values. */
val returnValue = Return("", "")

/** Marks a buffer parameter to transform to a single element value in an alternative method. */
class SingleValue(val newName: String): ParameterModifier() {
	companion object: ModifierKey<SingleValue>

	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The SingleValue modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping === PointerMapping.OPAQUE_POINTER )
			throw IllegalArgumentException("The SingleValue modifier cannot be applied on opaque pointer types.")

		if ( param.paramType != ParameterType.IN )
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
): ParameterModifier() {
	companion object: ModifierKey<PointerArray>

	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType )
			throw IllegalArgumentException("The PointerArray modifier can only be applied on pointer types.")

		if ( param.nativeType.mapping != PointerMapping.DATA_POINTER )
			throw IllegalArgumentException("The PointerArray modifier can only be applied on pointer-to-pointer types.")

		if ( param.paramType != ParameterType.IN )
			throw IllegalArgumentException("The PointerArray modifier can only be applied on input parameters.")
	}
}

class Callback(val procClass: String, val storeInFunctions: Boolean = false): ParameterModifier() {
	companion object: ModifierKey<Callback>

	override val isSpecial = true
	override protected fun validate(param: Parameter) {
		if ( param.nativeType !is PointerType || param.nativeType.mapping != PointerMapping.OPAQUE_POINTER )
			throw IllegalArgumentException("The Callback modifier can only be applied on opaque pointer types.")

		if ( param.paramType != ParameterType.IN )
			throw IllegalArgumentException("The Callback modifier can only be applied on input parameters.")
	}
}

// ReturnValue

/** Marks a return value as a pointer that should be mapped (wrapped in a ByteBuffer of some capacity). */
class MapPointer(
	/** An expression that defines the ByteBuffer capacity. */
	val sizeExpression: String
): ReturnValueModifier() {
	companion object: ModifierKey<MapPointer>

	override val isSpecial = true
	override protected fun validate(returns: ReturnValue) {
		if ( returns.nativeType !is PointerType )
			throw IllegalArgumentException("The MapPointer modifier can only be applied on pointer types.")

		if ( returns.nativeType.mapping != PointerMapping.DATA )
			throw IllegalArgumentException("The MapPointer modifier can only be applied on void pointer types.")
	}
}

class Construct(
	val firstArg: String, // Makes the user specify at least one, else the modifier is pointless
	vararg val otherArgs: String
): ReturnValueModifier() {
	companion object: ModifierKey<Construct>

	override val isSpecial = true
	override protected fun validate(returns: ReturnValue) {
		if ( returns.nativeType !is ObjectType )
			throw IllegalArgumentException("The Construct modifier can only be applied on object types.")
	}
}

/** Returns the address of the return value, instead of the return value itself. */
val address = object: ReturnValueModifier() {
	override val isSpecial = false
	override protected fun validate(returns: ReturnValue) {
		if ( returns.nativeType.mapping != PointerMapping.OPAQUE_POINTER )
			throw IllegalArgumentException("The address modifier can only be applied on opaque pointer types.")
	}
}