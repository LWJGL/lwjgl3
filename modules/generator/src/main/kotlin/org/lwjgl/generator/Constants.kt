/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.PrintWriter
import java.util.*
import kotlin.reflect.KClass

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
		if ( i < 0x80 ) it else "(byte)$it"
	}
}
val CharConstant = ConstantType(Char::class) { "'$it'" }
val ShortConstant = ConstantType(Short::class) {
	val i = it.toInt() and 0xFFFF
	"0x%X".format(i).let {
		if ( i < 0x8000 ) it else "(short)$it"
	}
}
val IntConstant = ConstantType(Int::class) { "0x%X".format(it) }
val LongConstant = ConstantType(Long::class) { "0x%XL".format(it) }
val FloatConstant = ConstantType(Float::class) { "%sf".format(it) }

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

	private fun getConstantName(name: String) = if ( noPrefix ) name else "${nativeClass.prefixConstant}$name"

	private val Constant<Int>.enumValue: Int get() = this.value.let {
		it ?: try {
			Integer.parseInt((this as ConstantExpression).expression)
		} catch(e: Exception) {
			Integer.MAX_VALUE
		}
	}

	internal fun generate(writer: PrintWriter) {
		if ( constantType === EnumConstant ) {
			// Increment/update the current enum value while iterating the enum constants.
			// Constants without documentation are added to the root block.
			// Constants with documentation go to their own block.

			val rootBlock = ArrayList<Constant<Int>>()
			val enumBlocks = ArrayList<ConstantBlock<Int>>()

			var value = 0
			var formatType = 1 // 0: hex, 1: decimal
			for (c in constants) {
				if ( c is ConstantExpression ) {
					@Suppress("UNCHECKED_CAST")
					rootBlock.add(c as ConstantExpression<Int>)
					continue
				}

				val ev = c.value as EnumValue
				(
					when {
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
							if ( formatType == 1 )
								ConstantExpression(c.name, Integer.toString(value++), false)
							else
								Constant(c.name, value++)
						}
					}
				).let {
					val doc = ev.documentation()
					if ( doc == null )
						rootBlock.add(it)
					else
						ConstantBlock(nativeClass, access, IntConstant, { doc }, it).let {
							it.noPrefix = noPrefix
							enumBlocks.add(it)
						}
				}
			}

			fun rootBlockBefore() =
				enumBlocks.isEmpty() || Math.abs(rootBlock[0].enumValue) <= Math.abs(enumBlocks[0].constants[0].enumValue)

			fun PrintWriter.generateRootBlock(rootBlock: ArrayList<Constant<Int>>) =
				ConstantBlock(nativeClass, access, IntConstant, this@ConstantBlock.documentation, *rootBlock.toArray(emptyArray())).let {
					it.noPrefix = noPrefix
					it.generate(this)
				}

			if ( rootBlock.isNotEmpty() && rootBlockBefore())
				writer.generateRootBlock(rootBlock)

			for (b in enumBlocks)
				b.generate(writer)

			if ( rootBlock.isNotEmpty() && !rootBlockBefore())
				writer.generateRootBlock(rootBlock)
		} else
			writer.generateBlock()
	}

	private fun PrintWriter.generateBlock() {
		println()
		val doc = documentation()
		if ( doc != null )
			println(doc)

		print("\t${access.modifier}static final ${constantType.javaType}")

		val indent: String
		if ( constants.size == 1 ) {
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
			if ( more )
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
		if ( constant is ConstantExpression ) {
			print(if ( constantType !== StringConstant || constant.unwrapped )
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