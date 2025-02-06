/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.extract

import org.lwjgl.llvm.*
import org.lwjgl.llvm.ClangIndex.*
import org.lwjgl.system.*
import org.lwjgl.system.MemoryStack.*
import org.lwjgl.system.MemoryUtil.*

internal fun parseSimpleType(name: String, nativeName: String, type: String) = "val $name = \"$nativeName\".$type"

internal fun parseTypedef(nativeName: String, type: CXType) = "val $nativeName = typedef(${type.lwjgl}, \"$nativeName\")"

@OptIn(ExperimentalUnsignedTypes::class)
private fun parseConstant(header: Header, nativeName: String, value: String): String {
    val noPrefix = !nativeName.startsWith(header.prefixConstant)

    val name = if (noPrefix) nativeName else nativeName.substring(header.prefixConstant.length)
    val type: String
    val v: String
    if (value.any { it.isLetter() }) {
        if (value.toDoubleOrNull() != null) {
            if (value.toDouble().toString() == value.toFloatOrNull()?.toString()) {
                type = "Float"
                v = value
            } else {
                type = "Double"
                v = value
            }
        } else if (value.endsWith("ULL") && value.substring(0, value.length - 3).toULongOrNull() != null) {
            type = "Long"
            v = "/*FIXME:*/\"${value.substring(0, value.length - 3)}\""
        } else if (value.endsWith("LL") && value.substring(0, value.length - 2).toLongOrNull() != null) {
            type = "Long"
            v = value.substring(0, value.length - 2)
        } else if (value.endsWith("U") && value.substring(0, value.length - 1).toUIntOrNull() != null) {
            type = "Int"
            v = "/*FIXME:*/\"${value.substring(0, value.length - 1)}\""
        } else if (value.endsWith("L") && value.substring(0, value.length - 1).toIntOrNull() != null) {
            type = "Int"
            v = value.substring(0, value.length - 1)
        } else {
            type = "Int"
            v = "/*FIXME?*/\"$value\""
        }
    } else if (value.startsWith("0x") && value.toUIntOrNull(16) != null) {
        type = "Int"
        v = value
    } else if (value.startsWith("0x") && value.toULongOrNull(16) != null) {
        type = "Long"
        v = value
    } else if (value.toIntOrNull() != null) {
        type = "Int"
        v = "\"$value\""
    } else if (value.toUIntOrNull() != null) {
        type = "Int"
        v = "/*FIXME:*/\"$value\""
    } else if (value.toLongOrNull() != null) {
        type = "Long"
        v = "\"$value\""
    } else if (value.toULongOrNull() != null) {
        type = "Long"
        v = "/*FIXME:*/\"$value\""
    } else if (value.toDoubleOrNull() != null) {
        if (value.toDouble().toString() == value.toFloatOrNull()?.toString()) {
            type = "Float"
            v = value
        } else {
            type = "Double"
            v = value
        }
    } else {
        System.err.println(name)
        System.err.println(value)
        TODO()
    }

    return "$t${type}Constant(\"$name\"..$v)${if (noPrefix) ".noPrefix()" else ""}"
}

private fun parseStringConstant(header: Header, nativeName: String, value: String): String {
    val noPrefix = !nativeName.startsWith(header.prefixConstant)

    val name = if (noPrefix) nativeName else nativeName.substring(header.prefixConstant.length)

    return "${t}StringConstant(\"$name\"..$value)${if (noPrefix) ".noPrefix()" else ""}"
}

private val COLLAPSE_REGEX = "\\n\\s*".toRegex()

internal class EnumConstant(
    val name: String,
    val value: String
) {
    fun toIntOrNull() =
        if (value.startsWith("0x")) {
            value.substring(2).toIntOrNull(16)
        } else {
            value.toIntOrNull(10)
        }
}

internal class Enum(
    val name: String,
    private val typedef: Boolean,
    val constants: List<EnumConstant>
) {
    fun getTypedef(): String = parseSimpleType(name, if (typedef) name else "enum $name", "enumType")

    fun getDeclaration(context: ExtractionContext): String {
        val noPrefix = constants.any { !it.name.startsWith(context.header.prefixConstant) }

        return """    EnumConstant(
        ${constants
            .mapIndexed { index, it ->
                val renderValue = if (it.value.startsWith("0x") && it.value[2] == '0') {
                    true
                } else if (index == 0) {
                    !it.value.startsWith("0x") || it.toIntOrNull() != 0
                } else {
                    it.toIntOrNull().let { curr ->
                        val prev = constants[index - 1].toIntOrNull()
                        curr == null || prev == null || curr != prev + 1
                    }
                }

                val v = if (renderValue) {
                    if (it.value.startsWith("0x") && it.value[2] != '0')
                        it.value
                    else
                        "\"${it.value}\""
                } else {
                    ""
                }

                val n = "\"${if (noPrefix) it.name else it.name.substring(context.header.prefixConstant.length)}\""
                "$n.enum${if (v.isEmpty()) "" else "($v)"}"
            }
            .joinToString(",\n$t$t")}
    )${if (noPrefix) ".noPrefix()" else ""}"""
    }
}

internal fun CXCursor.parseEnum(context: ExtractionContext, name: String, typedef: Boolean): Enum {
    val constants = ArrayList<EnumConstant>()

    CXCursorVisitor.create { enumConstantDecl, _, _ ->
        val constantName = enumConstantDecl.spelling

        val size = constants.size
        CXCursorVisitor.create { enumValue, _, _ ->
            constants.add(
                EnumConstant(
                    constantName,
                    context.getSource(enumValue).replace(COLLAPSE_REGEX, " ").let {
                        if (it.endsWith("U")) it.substring(0, it.lastIndex) else it
                    }
                )
            )
            CXChildVisit_Continue
        }.use { clang_visitChildren(enumConstantDecl, it, NULL) }
        if (constants.size == size) {
            constants.add(
                EnumConstant(
                    constantName,
                    clang_getEnumConstantDeclUnsignedValue(enumConstantDecl).toString()
                    //parseExpression(tu, source, enumValue)
                )
            )
        }
        CXChildVisit_Continue
    }.use { clang_visitChildren(this, it, NULL) }

    return Enum(name, typedef, constants)
}

internal class Struct(
    private val name: String,
    private val typedef: Boolean,
    internal val kind: String,
    internal val members: String
) {
    fun getDeclaration(context: ExtractionContext): String {
        return """val $name = $kind(Module.${context.header.module}, "$name"${
        if (typedef) "" else ", nativeName = \"struct $name\""
        }) {
    $members
}"""
    }
}

internal fun CXCursor.parseStruct(context: ExtractionContext, name: String, typedef: Boolean, handles: ArrayList<String>) =
    stackPush().use { frame  ->
        val structType = clang_getCursorType(this, CXType.malloc(frame))
        parseStructMembers(context, structType, name, handles, t).let { members ->
            if (members.isEmpty()) {
                null
            } else {
                Struct(name, typedef, if (clang_getCursorKind(this) == CXCursor_UnionDecl) "union" else "struct", members)
            }
        }
    }

private fun CXCursor.parseStructMembers(
    context: ExtractionContext,
    structType: CXType,
    structName: String,
    handles: ArrayList<String>,
    indent: String
): String {
    val attributes = ArrayList<String>()
    val members = ArrayList<String>()

    CXCursorVisitor.create { fieldDecl, _, _ ->
        if (fieldDecl.kind() == CXCursor_UnexposedAttr) {
            attributes.add(context.getSource(fieldDecl))
        } else {
            stackPush().push().use { stack ->
                val name = fieldDecl.spelling

                val type = clang_getCursorType(fieldDecl, CXType.malloc(stack))
                when (type.kind()) {
                    CXType_Elaborated    -> members.add(structMember(
                        if (fieldDecl.hasChild { c ->
                                when (clang_getCursorKind(c)) {
                                    CXCursor_StructDecl,
                                    CXCursor_UnionDecl -> true
                                    else               -> false
                                }
                            }
                        ) {
                            members.removeAt(members.lastIndex)
                        } else {
                            type.lwjgl
                        }, name
                    ))
                    CXType_Record        -> {
                        val (recordType, recordName) = clang_getCursorType(fieldDecl, CXType.malloc(stack))
                            .spelling
                            .split(' ')

                        if (recordType != "struct" && recordType != "union") {
                            System.err.println(recordType)
                            TODO()
                        }

                        if (fieldDecl.hasChild(CXChildVisit_Break) { true }) {
                            members.add(
                                "$recordType${if (clang_Cursor_isAnonymous(fieldDecl))
                                    ""
                                else
                                    "(Module.${context.header.module}, \"$recordName\")"
                                } {\n$indent$t${fieldDecl
                                    .parseStructMembers(context, structType, structName, handles, "$indent$t")
                                }\n$indent}"
                            )
                        } else if (context.options.parseTypes) {
                            handles.add(
                                parseSimpleType(
                                    fieldDecl.spelling,
                                    clang_getCursorType(fieldDecl, CXType.malloc(stack)).spelling,
                                    "handle"
                                )
                            )
                        }
                    }
                    CXType_Pointer       -> {
                        members.add(structMember(
                            if (fieldDecl.hasChild { c ->
                                    when (clang_getCursorKind(c)) {
                                        CXCursor_StructDecl,
                                        CXCursor_UnionDecl -> true
                                        else               -> false
                                    }
                                }
                            ) {
                                "${members.removeAt(members.lastIndex)}.p"
                            } else {
                                val pointee = clang_getPointeeType(type, CXType.malloc(stack))
                                if (pointee.kind() == CXType_FunctionProto) {
                                    fieldDecl.anonymousFunctionProto(
                                        stack, pointee, indent, context.header.module, name,
                                        "Instances of this interface may be set to the {@code $name} field of the ##${if (structName.isNotEmpty()) structName else "FIXME"} struct."
                                    )
                                } else if (clang_equalTypes(structType, clang_getCanonicalType(pointee, CXType.malloc(stack)))) {
                                    // recursive struct definition
                                    "${if (clang_getCursorKind(clang_getTypeDeclaration(structType, CXCursor.malloc(stack))) == CXCursor_UnionDecl)
                                        "union" else "struct"}(Module.${context.header.module}, \"$structName\").p"
                                } else {
                                    type.lwjgl
                                }
                            }, name
                        ))
                    }
                    CXType_ConstantArray -> {
                        members.add(
                            structMember(clang_getElementType(type, CXType.malloc(stack)).lwjgl.arrayDimension(clang_getArraySize(type)), name)
                        )
                    }
                    else                 -> members.add(structMember(type.lwjgl, name, clang_getFieldDeclBitWidth(fieldDecl)))
                }
                Unit
            }
        }
        CXChildVisit_Continue
    }.use { clang_visitChildren(this, it, NULL) }

    return "${attributes.joinToString("\n", postfix = if (attributes.isEmpty()) "" else "\n$indent") { "// $it" }}${members.joinToString("\n$indent")}"
}

private fun structMember(type: String, name: String, bitWidth: Int = -1): String {
    val elementType: String
    val arrayDimensions: String

    val arrayIndex = type.indexOf('[')
    if (arrayIndex == -1) {
        elementType = type
        arrayDimensions = ""
    } else {
        elementType = type.substring(0, arrayIndex)
        arrayDimensions = type.substring(arrayIndex)
    }

    return "$elementType(\"$name\"${if (bitWidth == -1) "" else ", bits = $bitWidth"})$arrayDimensions"
}

private fun CXCursor.anonymousFunctionProto(
    stack: MemoryStack,
    proto: CXType,
    indent: String,
    module: String,
    name: String = "",
    documentation: String = "Instances of this interface may be passed to the #FIXME() method."
): String {
    val args = ArrayList<CXCursor>(clang_getNumArgTypes(proto))
    CXCursorVisitor.create { cursor, _, _ ->
        if (clang_getCursorKind(cursor) == CXCursor_ParmDecl) {
            val cp = CXCursor.malloc(stack)
            memCopy(cursor, cp)
            args.add(cp)
        }
        CXChildVisit_Continue
    }.use { clang_visitChildren(this, it, NULL) }

    val docIndent = "$indent$t$t"

    return """Module.$module.callback {
$indent    ${clang_getResultType(proto, CXType.malloc(stack)).lwjgl}(
$indent        /*FIXME:*/"$name"${getFunctionArguments(module, proto, name, docIndent, args)}
$indent    ) {
$indent        documentation = "$documentation"
$indent    }
$indent}"""
}

internal fun CXCursor.parseCallback(header: Header, type: CXType, name: String): String = stackPush().use { stack ->
    val args = ArrayList<CXCursor>(clang_getNumArgTypes(type))
    CXCursorVisitor.create { cursor, _, _ ->
        if (clang_getCursorKind(cursor) == CXCursor_ParmDecl) {
            val cp = CXCursor.malloc(stack)
            memCopy(cursor, cp)
            args.add(cp)
        }
        CXChildVisit_Continue
    }.use { clang_visitChildren(this, it, NULL) }

    """val $name = Module.${header.module}.callback {
    ${clang_getResultType(type, CXType.malloc(stack)).lwjgl}(
        "$name"${getFunctionArguments(header.module, type, name, "$t$t", args)},

        nativeType = "$name"
    )
}"""
}

internal fun CXCursor.parseFunction(header: Header): String = stackPush().use { stack ->
    val nativeName = this.spelling
    val name = if (header.prefixMethod.isNotEmpty() && nativeName.startsWith(header.prefixMethod)) {
        nativeName.substring(header.prefixMethod.length)
    } else {
        nativeName
    }
    val type = clang_getCursorType(this, CXType.malloc(stack))
    val args = ArrayList<CXCursor>()
    CXCursorVisitor.create { cursor, _, _ ->
        if (clang_getCursorKind(cursor) == CXCursor_ParmDecl) {
            val cp = CXCursor.malloc(stack)
            memCopy(cursor, cp)
            args.add(cp)
        }
        CXChildVisit_Continue
    }.use { clang_visitChildren(this, it, NULL) }

    """    ${clang_getResultType(type, CXType.malloc(stack)).lwjgl}(
        "$name"${getFunctionArguments(header.module, type, name, "$t$t", args)}${
    if (header.prefixMethod.isNotEmpty() && nativeName == name) ",\n\n$t${t}noPrefix = true" else ""}
    )""" // TODO: seeAlso
}

private fun getFunctionArguments(
    module: String,
    functionType: CXType,
    functionName: String,
    indent: String,
    args: ArrayList<CXCursor>
) = if (args.isEmpty())
    ",\n\n${indent}void()"
else
    args.indices.joinToString(",\n$indent", prefix = ",\n\n$indent") { i ->
        stackPush().use { frame ->
            val argType = clang_getArgType(functionType, i, CXType.malloc(frame))
            val argSpelling = args[i].spelling
            val argName = argSpelling.let {
                if (it.isNotEmpty()) "\"$it\"" else "/*FIXME:*/\"\""
            }

            val type = when (argType.kind()) {
                CXType_ConstantArray -> {
                    "Check(${clang_getArraySize(argType)})..${argType.lwjgl}"
                }
                CXType_Pointer       -> {
                    val pointee = clang_getPointeeType(argType, CXType.malloc(frame))
                    if (pointee.kind() == CXType_FunctionProto) {
                        args[i].anonymousFunctionProto(
                            frame, pointee, indent, module, functionName,
                            "Instances of this interface may be passed to the #$functionName() method."
                        )
                    } else {
                        argType.lwjgl
                    }
                }
                else                 -> argType.lwjgl
            }
            "$type($argName)"
        }
    }

internal fun CXCursor.parseMacro(
    context: ExtractionContext,
    constants: ArrayList<String>
) {
    stackPush().use { stack ->
        val tokens = stack.mallocPointer(1).let { pp ->
            val numTokens = stack.mallocInt(1)
            clang_tokenize(context.tu, clang_getCursorExtent(this, CXSourceRange.malloc(stack)), pp, numTokens)
            CXToken.create(pp[0], numTokens[0])
        }

        try {
            var negative = false
            val token = tokens.asSequence()
                .drop(1)
                .filter {
                    val kind = clang_getTokenKind(it)
                    if (kind == CXToken_Punctuation) {
                        if (clang_getTokenSpelling(context.tu, it, stack.str).str == "-") {
                            negative = true
                        }
                        return@filter false
                    }
                    when (clang_getTokenSpelling(context.tu, it, stack.str).str) {
                        "(", ")" -> false
                        else     -> true
                    }
                }
                .singleOrNull {
                    when (clang_getTokenKind(it)) {
                        CXToken_Identifier,
                        CXToken_Literal -> true
                        else            -> false
                    }
                }

            if (token != null) {
                val name = this.spelling
                val spelling = clang_getTokenSpelling(context.tu, token, stack.str).str
                when (clang_getTokenKind(token)) {
                    CXToken_Identifier -> constants.add(parseConstant(context.header, name, spelling))
                    CXToken_Literal    -> constants.add(
                        if (spelling.startsWith('\"')) {
                            parseStringConstant(context.header, name, spelling)
                        } else {
                            parseConstant(context.header, name, if (negative) "-$spelling" else spelling)
                        }
                    )
                }
            }
        } finally {
            clang_disposeTokens(context.tu, tokens)
        }
    }
}

private fun CXCursor.hasChild(traversal: Int = CXChildVisit_Continue, predicate: (CXCursor) -> Boolean): Boolean {
    var result = false
    CXCursorVisitor.create { child, _, _ ->
        result = predicate(child)
        traversal
    }.use { clang_visitChildren(this, it, NULL) }
    return result
}

private val CXType.lwjgl: String
    get() = stackPush().use { stack ->
        when (val kind = kind()) {
            CXType_Void,
            CXType_Bool,
            CXType_Char_U,
            CXType_UChar,
            CXType_Char16,
            CXType_Char32,
            CXType_UShort,
            CXType_UInt,
            CXType_ULong,
            CXType_ULongLong,
                //CXType_UInt128 ->
            CXType_Char_S,
            CXType_SChar,
            CXType_WChar,
            CXType_Short,
            CXType_Int,
            CXType_Long,
            CXType_LongLong,
                //CXType_Int128 ->
            CXType_Float,
            CXType_Double
                //CXType_LongDouble ->
                //CXType_NullPtr ->
                //CXType_Overload ->
                //CXType_Dependent ->
                                   -> this.spelling
                .replace("unsigned ", "unsigned_")
                .replace("signed ", "")
                .replace("long ", "long_")
            CXType_Pointer         -> "${clang_getPointeeType(this, CXType.malloc(stack)).lwjgl}.p"
            //CXType_BlockPointer ->
            CXType_Record          -> {
                this.spelling.let {
                    it.substring(it.indexOf(' ') + 1)
                }
            }
            CXType_Enum            -> this.spelling.let {
                if (it.startsWith("enum "))
                    it.substring("enum ".length)
                else
                    it
            }
            CXType_Typedef         -> clang_getTypedefName(this, stack.str).str
            //CXType_FunctionNoProto ->
            //CXType_FunctionProto ->
            // TODO: curand.h - typedef unsigned int curandDirectionVectors32_t[32];
            CXType_ConstantArray   -> clang_getElementType(this, CXType.malloc(stack)).lwjgl.arrayDimension(clang_getArraySize(this))
            //CXType_Vector ->
            CXType_IncompleteArray -> "${clang_getElementType(this, CXType.malloc(stack)).lwjgl}.p"
            //CXType_VariableArray ->
            //CXType_DependentSizedArray ->
            //CXType_MemberPointer ->
            CXType_Elaborated      -> {
                clang_Type_getNamedType(this, CXType.malloc(stack)).lwjgl
            }
            else                   -> {
                println(this.spelling)
                println(clang_getTypeKindSpelling(kind, stack.str).str)
                TODO()
            }
        }
    }
        .let {
            if (it.startsWith("const ")) {
                it.substring("const ".length)
            } else {
                it
            }
        }
        .let {
            if (clang_isConstQualifiedType(this)) {
                "$it.const"
            } else {
                it
            }
        }

private fun String.arrayDimension(size: Long) = this.indexOf('[').let {
    if (it == -1) {
        "$this[$size]"
    } else {
        // types are visited depth-first, so the new dimension must be prepended
        "${this.substring(0, it)}[$size]${this.substring(it)}"
    }
}