/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.generator

import java.io.*
import kotlin.math.*
import kotlin.reflect.*

// Extension properties for numeric literals.
inline val Int.b get() = this.toByte()
inline val Int.s get() = this.toShort()
inline val Long.i get() = this.toInt()

open class ConstantType<T : Any>(
    val javaType: String,
    val print: (T) -> String
) {
    constructor(
        type: KClass<T>,
        print: (T) -> String
    ) : this(type.java.simpleName, print)
}

val ByteConstant = ConstantType(Byte::class) { value ->
    val i = value.toInt() and 0xFF
    "0x%X".format(i).let {
        if (i < 0x80) it else "(byte)$it"
    }
}
val CharConstant = ConstantType(Char::class) { "'$it'" }
val ShortConstant = ConstantType(Short::class) { value ->
    val i = value.toInt() and 0xFFFF
    "0x%X".format(i).let {
        if (i < 0x8000) it else "(short)$it"
    }
}
val IntConstant = ConstantType(Int::class) { "0x%X".format(it) }
val LongConstant = ConstantType(Long::class) { "0x%XL".format(it) }
val FloatConstant = ConstantType(Float::class) { "%sf".format(it) }
val DoubleConstant = ConstantType(Double::class) { "%sd".format(it) }

val StringConstant = ConstantType(String::class) { if (it.contains(" + \"")) it else "\"$it\"" }

abstract class EnumValue(val documentation: (() -> String?) = { null })

open class EnumIntValue(
    documentation: (() -> String?) = { null },
    val value: Int? = null
) : EnumValue(documentation)
class EnumIntValueExpression(
    documentation: () -> String?,
    val expression: String
) : EnumIntValue(documentation, null)
val EnumConstant = ConstantType(EnumIntValue::class) { "0x%X".format(it) }

// TODO: this is ugly, try new DSL?
open class EnumByteValue(
    documentation: (() -> String?) = { null },
    val value: Byte? = null
) : EnumValue(documentation)
class EnumByteValueExpression(
    documentation: () -> String?,
    val expression: String
) : EnumByteValue(documentation, null)
val EnumConstantByte = ConstantType(EnumByteValue::class) { "0x%X".format(it) }

open class EnumLongValue(
    documentation: (() -> String?) = { null },
    val value: Long? = null
) : EnumValue(documentation)
class EnumLongValueExpression(
    documentation: () -> String?,
    val expression: String
) : EnumLongValue(documentation, null)
val EnumConstantLong = ConstantType(EnumLongValue::class) { "0x%X".format(it) }

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
    private val constantType: ConstantType<T>,
    val documentation: () -> String,
    val see: Array<String>?,
    vararg val constants: Constant<T>
) {

    private var noPrefix = false

    fun noPrefix(): ConstantBlock<T> {
        noPrefix = true
        return this
    }

    private fun getConstantName(name: String) = if (noPrefix) name else "${nativeClass.prefixConstant}$name"

    internal fun getClassLink(name: String) = if (noPrefix && nativeClass.prefixConstant.isNotEmpty())
        "${nativeClass.className}#$name"
    else
        "${nativeClass.className}#${nativeClass.prefixConstant}$name"

    private fun generateEnumInt(rootBlock: ArrayList<Constant<Number>>) {
        var value = 0
        var formatType = 1 // 0: hex, 1: decimal
        for (c in constants) {
            if (c is ConstantExpression) {
                @Suppress("UNCHECKED_CAST")
                rootBlock.add(c as ConstantExpression<Int>)
                continue
            }

            (c.value as EnumIntValue).let { ev ->
                rootBlock.add(when {
                    ev is EnumIntValueExpression -> {
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
                            ConstantExpression(c.name, (value++).toString(), false)
                        else
                            Constant(c.name, value++)
                    }
                })
            }
        }
    }

    private fun generateEnumByte(rootBlock: ArrayList<Constant<Number>>) {
        var value = 0L
        var formatType = 1 // 0: hex, 1: decimal
        for (c in constants) {
            if (c is ConstantExpression) {
                @Suppress("UNCHECKED_CAST")
                rootBlock.add(c as ConstantExpression<Byte>)
                continue
            }

            (c.value as EnumByteValue).let { ev ->
                rootBlock.add(when {
                    ev is EnumByteValueExpression -> {
                        try {
                            value = java.lang.Byte.parseByte(ev.expression) + 1L // decimal
                            formatType = 1 // next values will be decimal
                        } catch(e: NumberFormatException) {
                            try {
                                value = java.lang.Byte.parseByte(ev.expression, 16) + 1L // hex
                            } catch(e: Exception) {
                                // ignore
                            }
                            formatType = 0 // next values will be hex
                        }
                        ConstantExpression(c.name, ev.expression, false)
                    }
                    ev.value != null          -> {
                        value = ev.value + 1L
                        formatType = 0
                        Constant(c.name, ev.value)
                    }
                    else                      -> {
                        if (formatType == 1)
                            ConstantExpression(c.name, (value++).toString(), false)
                        else
                            Constant(c.name, value++)
                    }
                })
            }
        }
    }

    private fun generateEnumLong(rootBlock: ArrayList<Constant<Number>>) {
        var value = 0L
        var formatType = 1 // 0: hex, 1: decimal
        for (c in constants) {
            if (c is ConstantExpression) {
                @Suppress("UNCHECKED_CAST")
                rootBlock.add(c as ConstantExpression<Long>)
                continue
            }

            (c.value as EnumLongValue).let { ev ->
                rootBlock.add(when {
                    ev is EnumLongValueExpression -> {
                        try {
                            value = java.lang.Long.parseLong(ev.expression) + 1L // decimal
                            formatType = 1 // next values will be decimal
                        } catch(e: NumberFormatException) {
                            try {
                                value = java.lang.Long.parseLong(ev.expression, 16) + 1L // hex
                            } catch(e: Exception) {
                                // ignore
                            }
                            formatType = 0 // next values will be hex
                        }
                        ConstantExpression(c.name, ev.expression, false)
                    }
                    ev.value != null          -> {
                        value = ev.value + 1L
                        formatType = 0
                        Constant(c.name, ev.value)
                    }
                    else                      -> {
                        if (formatType == 1)
                            ConstantExpression(c.name, (value++).toString(), false)
                        else
                            Constant(c.name, value++)
                    }
                })
            }
        }
    }

    internal fun generate(writer: PrintWriter) {
        if (constantType === EnumConstant || constantType === EnumConstantByte || constantType === EnumConstantLong) {
            // Increment/update the current enum value while iterating the enum constants.
            // Constants without documentation are added to the root block.
            // Constants with documentation go to their own block.

            val rootBlock = ArrayList<Constant<Number>>()

            val constantTypeRender = if (constantType === EnumConstant) {
                generateEnumInt(rootBlock)
                IntConstant
            } else if (constantType === EnumConstantByte) {
                generateEnumByte(rootBlock)
                ByteConstant
            } else {
                generateEnumLong(rootBlock)
                LongConstant
            }

            ConstantBlock(nativeClass, access, constantTypeRender, documentation().let { doc ->
                constants.asSequence()
                    .mapNotNull {
                        (if (it is ConstantExpression)
                            null
                        else
                            (it.value as EnumValue).documentation()
                        ).let { enumDoc ->
                            val link = "#${getConstantName(it.name)}"
                            if (enumDoc == null) {
                                if ((doc.contains(link)) || constants.size == 1)
                                    null
                                else
                                    "<li>{@link $link ${it.name}}</li>"
                            } else
                                "<li>{@link $link ${it.name}} - $enumDoc</li>"
                        }
                    }
                    .joinToString("\n$t$t$t")
                    .let { enumDoc ->
                        {
                            if (enumDoc.isEmpty())
                                doc
                            else
                                """${if (doc.isEmpty()) "" else "$t$doc\n\n"}
        <h5>Enum values:</h5>
        <ul>
            $enumDoc
        </ul>
        """
                        }
                    }
            }, see, *rootBlock.toArray(emptyArray())).let {
                it.noPrefix = noPrefix
                it.generate(writer)
            }
        } else {
            writer.generateBlock()
        }
    }

    private fun PrintWriter.generateBlock() {
        println()
        val doc = documentation()
        if (doc.isNotEmpty() || see != null)
            println(doc.toJavaDoc(see = see))

        print("$t${access.modifier}static final ${constantType.javaType}")

        val indent = if (constants.size == 1) {
            " "
        } else {
            print('\n')
            "$t$t"
        }

        // Find maximum constant name length
        val alignment = constants.map {
            it.name.length
        }.fold(0) { left, right ->
            max(left, right)
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
        for (i in 0 until alignment - constant.name.length)
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

    val javaDocLinks get() = javaDocLinks(null)
    val javaDocLinksSkipCount get() = javaDocLinks { !it.name.endsWith("_COUNT") }

    fun javaDocLinks(predicate: ((Constant<T>) -> Boolean)?) = constants.asSequence()
        .let { constants ->
            if (predicate == null) constants else constants.filter { predicate(it) }
        }
        .map { it.name }
        .joinToString(" #", prefix = "#")
}