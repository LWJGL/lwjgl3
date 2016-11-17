/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*
import java.util.*
import kotlin.reflect.*

// Extension properties for numeric literals.
val Int.b: Byte get() = this.toByte()
val Int.s: Short get() = this.toShort()
val Long.i: Int get() = this.toInt()

open class ConstantType<T : Any>(
	val javaType: String,
	val print: (T) -> String
) {
	constructor(
		type: KClass<T>,
		print: (T) -> String
	) : this(type.java.simpleName, print)
}

val ByteConstant = ConstantType(Byte::class) {
	val i = it.toInt() and 0xFF
	"0x%X".format(i).let {
		if (i < 0x80) it else "(byte)$it"
	}
}
val CharConstant = ConstantType(Char::class) { "'$it'" }
val ShortConstant = ConstantType(Short::class) {
	val i = it.toInt() and 0xFFFF
	"0x%X".format(i).let {
		if (i < 0x8000) it else "(short)$it"
	}
}
val IntConstant = ConstantType(Int::class) { "0x%X".format(it) }
val LongConstant = ConstantType(Long::class) { "0x%XL".format(it) }
val FloatConstant = ConstantType(Float::class) { "%sf".format(it) }
val DoubleConstant = ConstantType(Double::class) { "%sd".format(it) }

val StringConstant = ConstantType(String::class) { "\"$it\"" }

open class EnumValue(
	val documentation: (() -> String?) = { null },
	val value: Int? = null
)

class EnumValueExpression(
	documentation: () -> String?,
	val expression: String
) : EnumValue(documentation, null)

val EnumConstant = ConstantType(EnumValue::class, { "0x%X".format(it) })

open class Constant<out T : Any>(val name: String, val value: T?)
internal class ConstantExpression<out T : Any>(
	name: String,
	val expression: String,
	// Used for StringConstants only, false: wrap in quotes, true: print as is
	val unwrapped: Boolean
) : Constant<T>(name, null)

class ConstantBlock<T : Any>(
	val nativeClass: NativeClass,
	var access: Access,
	val constantType: ConstantType<T>,
	val documentation: () -> String?,
	vararg val constants: Constant<T>
) {

	private var noPrefix = false

	fun noPrefix() {
		noPrefix = true
	}

	private fun getConstantName(name: String) = if (noPrefix) name else "${nativeClass.prefixConstant}$name"

	internal fun generate(writer: PrintWriter) {
		if (constantType === EnumConstant) {
			// Increment/update the current enum value while iterating the enum constants.
			// Constants without documentation are added to the root block.
			// Constants with documentation go to their own block.

			val rootBlock = ArrayList<Constant<Int>>()

			var value = 0
			var formatType = 1 // 0: hex, 1: decimal
			for (c in constants) {
				if (c is ConstantExpression) {
					@Suppress("UNCHECKED_CAST")
					rootBlock.add(c as ConstantExpression<Int>)
					continue
				}

				(c.value as EnumValue).let { ev ->
					rootBlock.add(when {
						ev is EnumValueExpression -> {
							try {
								value = Integer.parseInt(ev.expression) + 1 // decimal
								formatType = 1 // next values will be decimal
							} catch(e: NumberFormatException) {
								try {
									value = Integer.parseInt(ev.expression, 16) + 1 // hex
								} catch(e: Exception) {
									// ignore
								}
								formatType = 0 // next values will be hex
							}
							ConstantExpression(c.name, ev.expression, false)
						}
						ev.value != null          -> {
							value = ev.value + 1
							formatType = 0
							Constant(c.name, ev.value)
						}
						else                      -> {
							if (formatType == 1)
								ConstantExpression(c.name, Integer.toString(value++), false)
							else
								Constant(c.name, value++)
						}
					})
				}
			}

			ConstantBlock(nativeClass, access, IntConstant, documentation().let { doc ->
				constants.asSequence()
					.mapNotNull {
						(if (it is ConstantExpression)
							null
						else
							(it.value as EnumValue).documentation()
						).let { enumDoc ->
							val link = "#${getConstantName(it.name)}"
							if (enumDoc == null) {
								if ((doc != null && doc.contains(link)) || constants.size == 1)
									null
								else
									"<li>{@link $link ${it.name}}</li>"
							} else
								"<li>{@link $link ${it.name}} - $enumDoc</li>"
						}
					}
					.joinToString("\n\t\t\t")
					.let { enumDoc ->
						{
							if (enumDoc.isEmpty())
								doc
							else
								"""${if (doc == null) "" else "\t$doc\n\n"}
		<h5>Enum values:</h5>
		<ul>
			$enumDoc
		</ul>
		"""
						}
					}
			}, *rootBlock.toArray(emptyArray())).let {
				it.noPrefix = noPrefix
				it.generate(writer)
			}
		} else
			writer.generateBlock()
	}

	private fun PrintWriter.generateBlock() {
		println()
		val doc = documentation()
		if (doc != null)
			println(doc.toJavaDoc())

		print("\t${access.modifier}static final ${constantType.javaType}")

		val indent: String
		if (constants.size == 1) {
			indent = " "
		} else {
			print('\n')
			indent = "\t\t"
		}

		// Find maximum constant name length
		val alignment = constants.map {
			it.name.length
		}.fold(0) { left, right ->
			Math.max(left, right)
		}

		constants.forEachWithMore { it, more ->
			if (more)
				println(',')
			printConstant(it, indent, alignment)
		}
		println(";")
	}

	private fun PrintWriter.printConstant(constant: Constant<T>, indent: String, alignment: Int) {
		print("$indent${getConstantName(constant.name)}")
		for (i in 0..(alignment - constant.name.length - 1))
			print(' ')

		print(" = ")
		if (constant is ConstantExpression) {
			print(if (constantType !== StringConstant || constant.unwrapped)
				constant.expression
			else
				constantType.print(constant.expression)
			)
		} else
			print(constantType.print(constant.value!!))
	}

	val javaDocLinks: String get() = javaDocLinks { true }
	val javaDocLinksSkipCount: String get() = javaDocLinks { !it.name.endsWith("_COUNT") }

	fun javaDocLinks(predicate: (Constant<T>) -> Boolean) = constants.asSequence()
		.filter { predicate(it) }
		.map { "${nativeClass.className}#${it.name}" }
		.joinToString(" ")

}
