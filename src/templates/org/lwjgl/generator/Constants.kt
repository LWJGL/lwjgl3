/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.regex.Pattern

abstract class ConstantType<T>(
	val javaType: Class<T>
) {
	abstract fun print(value: T): String
	abstract fun nullValue(): T
}

val ByteConstant = object: ConstantType<Byte>(javaClass<Byte>()) {
	override fun print(value: Byte): String = "0x%X".format(value.toInt())
	override fun nullValue(): Byte = 0
}

val ShortConstant = object: ConstantType<Short>(javaClass<Short>()) {
	override fun print(value: Short): String = "0x%X".format(value.toInt())
	override fun nullValue(): Short = 0
}

val IntConstant = object: ConstantType<Int>(javaClass<Int>()) {
	override fun print(value: Int): String = "0x%X".format(value)
	override fun nullValue(): Int = 0
}

val LongConstant = object: ConstantType<Long>(javaClass<Long>()) {
	override fun print(value: Long): String = "0x%XL".format(value)
	override fun nullValue(): Long = 0.toLong()
}

val FloatConstant = object: ConstantType<Float>(javaClass<Float>()) {
	override fun print(value: Float): String = "%sf".format(value)
	override fun nullValue(): Float = 0.0
}

// Extension property for byte literals.
val Int.b: Byte
	get() = this.toByte()

// Extension property for short literals.
val Int.s: Short
	get() = this.toShort()

// Extension property for integer literals.
val Long.i: Int
	get() = this.toInt()

// Extension property for long literals.
val Int.L: Long
	get() = this.toLong()

// Extension property for float literals.
val Double.f: Float
	get() = this.toFloat()

public class ConstantBlock<T>(
	val nativeClass: NativeClass,
	val constantType: ConstantType<T>,
	val documentation: String,
	vararg val constants: Constant<T>
) {

	private var noPrefix = false

	public fun noPrefix(): Unit = noPrefix = true

	private fun getConstantName(name: String) = if ( noPrefix ) name else "${nativeClass.prefixConstant}$name"

	fun generate(writer: PrintWriter) {
		writer.generateBlock()
	}

	private fun PrintWriter.generateBlock() {
		println(documentation)

		println("\tpublic static final ${constantType.javaType.getSimpleName()}")

		// Find maximum constant name length
		val alignment = constants.map {
			it.name.size
		}.fold(0) {(left, right) ->
			Math.max(left, right)
		}

		for ( i in 0..constants.lastIndex - 1 ) {
			printConstant(constants[i], alignment)
			println(',')
		}
		printConstant(constants[constants.lastIndex], alignment)
		println(";\n")
	}

	private fun PrintWriter.printConstant(constant: Constant<T>, alignment: Int) {
		val (name, value) = constant

		print("\t\t${getConstantName(name)}")
		for ( i in 0..(alignment - name.size - 1) )
			print(' ')

		print(" = ")
		if ( constant is ConstantExpression<T> )
			print(constant.expression)
		else
			print(constantType.print(value!!))
	}

	public fun toJavaDocLinks(global: Boolean = false): Links {
		val builder = StringBuilder(constants.size * 32)

		printJavaDocLink(builder, constants[0], global)
		for ( i in 1..constants.lastIndex ) {
			builder append ", "
			printJavaDocLink(builder, constants[i], global)
		}

		return Links(builder.toString())
	}

	private fun <T> printJavaDocLink(builder: StringBuilder, constant: Constant<T>, global: Boolean = false) {
		builder append "{@link "
		if ( global )
			builder append nativeClass.className
		builder append '#'
		builder append getConstantName(constant.name)
		if ( !noPrefix ) {
			builder append ' '
			builder append constant.name
		}
		builder append '}'
	}

	class Links(val html: String) {
		fun plus(links: Links) = Links("$html, ${links.html}")
	}

}

fun String.toConstantLinks(prefix: String = ""): ConstantBlock.Links {
	val builder = StringBuilder(this.size * 2) // Rough estimate to reduce mallocs. TODO: validate

	val tokens = LINK_PATTERN.split(this.trim())
	for ( i in tokens.indices ) {
		if ( 0 < i ) builder append ", "

		val hash = tokens[i].indexOf('#')
		when {
			hash == -1 -> {
				builder append tokens[i]
			}
			tokens[i].startsWith("##") -> {
				builder append "see {@link "
				builder append tokens[i].substring(2)
				builder append '}'
			}
			else -> {
				val token = tokens[i].substring(hash + 1)

				builder append "{@link "
				if ( prefix.isEmpty() )
					builder append tokens[i]
				else {
					builder append tokens[i].substring(0, hash + 1)
					builder append prefix
					builder append token
				}
				builder append ' '
				builder append token
				builder append '}'
			}
		}
	}

	return ConstantBlock.Links(builder.toString())
}

private val LINK_PATTERN = Pattern.compile("\\s+", Pattern.MULTILINE)

public open data class Constant<T: Any>(val name: String, val value: T?)
public class ConstantExpression<T>(name: String, val expression: String): Constant<T>(name, null)

/** Adds a new constant. */
public fun <T> String._(value: T): Constant<T> =
	Constant<T>(this, value)

/** Adds a new constant whose value is a function of previously defined constants. */
public fun <T> String.expr(expression: String): ConstantExpression<T> =
	ConstantExpression<T>(this, expression)
