package org.lwjgl.generator

import java.util.*

class DependsOn(override val reference: String, val postfix: String? = null) : FunctionModifier(), ReferenceModifier {
	companion object : ModifierKey<DependsOn>

	override val isSpecial = false
}

class Reuse(override val reference: String) : FunctionModifier(), ReferenceModifier {
	companion object : ModifierKey<Reuse>

	override val isSpecial = true
}

/**
 * Can be used to mark a function as optional. FunctionProviders should ignore such functions if they're missing.
 * This is useful for functions that have been added long after the initial release of a particular extension, or
 * as a workaround for buggy drivers.
 */
object IgnoreMissing : FunctionModifier() {
	override val isSpecial = false
}

/** Defines an expression that should be passed to the getInstance() method. */
class Capabilities(
	/** The expression to pass to the getInstance() method. */
	val expression: String,
	/** If defined, is a statement that will be printed before the getInstance() call. */
	val statement: String? = null,
	/** If true, getInstance() will not be called and the expression will be assigned to the FUNCTION_ADDRESS variable directly. */
	val override: Boolean = false
) : FunctionModifier() {
	companion object : ModifierKey<Capabilities>

	override val isSpecial = true
}

class Code(
	val javaInit: List<Code.Statement> = Code.NO_STATEMENTS,

	val javaBeforeNative: List<Code.Statement> = Code.NO_STATEMENTS,
	val javaAfterNative: List<Code.Statement> = Code.NO_STATEMENTS,
	val javaFinally: List<Code.Statement> = Code.NO_STATEMENTS,

	val nativeBeforeCall: String? = null,
	val nativeCall: String? = null,
	val nativeAfterCall: String? = null
) : FunctionModifier() {
	companion object : ModifierKey<Code> {
		// Used to avoid null checks
		private val NO_STATEMENTS: List<Statement> = ArrayList(0)
		val NO_CODE = Code()
	}

	data class Statement(
		val code: String,
		val applyTo: ApplyTo = ApplyTo.BOTH
	)

	override val isSpecial: Boolean get() =
	Code.NO_STATEMENTS !== javaInit ||
	Code.NO_STATEMENTS !== javaBeforeNative ||
	Code.NO_STATEMENTS !== javaAfterNative ||
	Code.NO_STATEMENTS !== javaFinally

	fun hasStatements(statements: List<Code.Statement>, applyTo: ApplyTo) =
		if ( statements === NO_STATEMENTS ) false else statements.any { it.applyTo === ApplyTo.BOTH || it.applyTo === applyTo }

	fun getStatements(statements: List<Code.Statement>, applyTo: ApplyTo) =
		if ( statements === NO_STATEMENTS ) statements else statements.filter { it.applyTo === ApplyTo.BOTH || it.applyTo === applyTo }

	private fun List<Code.Statement>.append(other: List<Code.Statement>) =
		if ( this === Code.NO_STATEMENTS && other === Code.NO_STATEMENTS ) Code.NO_STATEMENTS else this + other

	private fun String?.append(other: String?) =
		if ( this == null )
			other
		else if ( other == null )
			this
		else
			"$this\n$other"

	fun append(
		javaInit: List<Code.Statement> = Code.NO_STATEMENTS,

		javaBeforeNative: List<Code.Statement> = Code.NO_STATEMENTS,
		javaAfterNative: List<Code.Statement> = Code.NO_STATEMENTS,
		javaFinally: List<Code.Statement> = Code.NO_STATEMENTS,

		nativeBeforeCall: String? = null,
		nativeCall: String? = null,
		nativeAfterCall: String? = null
	) = Code(
		this.javaInit append javaInit,

		this.javaBeforeNative append javaBeforeNative,
		this.javaAfterNative append javaAfterNative,
		this.javaFinally append javaFinally,

		this.nativeBeforeCall append nativeBeforeCall,
		this.nativeCall append nativeCall,
		this.nativeAfterCall append nativeAfterCall
	)
}

fun statement(code: String, applyTo: ApplyTo = ApplyTo.BOTH): List<Code.Statement> = arrayListOf(Code.Statement(code, applyTo))

/** Marks a function without arguments as a macro. */
object Macro : FunctionModifier() {
	override val isSpecial = false

	protected override fun validate(func: NativeClassFunction) {
		if ( func.getNativeParams().any() )
			throw IllegalArgumentException("The macro modifier can only be applied on functions with no arguments.")
	}
}

class AccessModifier(val access: Access) : FunctionModifier() {
	companion object : ModifierKey<AccessModifier>

	override val isSpecial = false
}

/** Makes the generated methods private. */
val private = AccessModifier(Access.PUBLIC)
/** Makes the generated methods package private. */
val internal = AccessModifier(Access.INTERNAL)

class NativeName(val name: String) : FunctionModifier() {
	companion object : ModifierKey<NativeName>

	override val isSpecial = false
}