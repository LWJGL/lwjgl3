/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.extract

import org.lwjgl.llvm.*
import org.lwjgl.llvm.ClangDocumentation.*
import org.lwjgl.llvm.ClangIndex.*
import org.lwjgl.system.*
import org.lwjgl.system.MemoryStack.*
import org.lwjgl.system.MemoryUtil.*

internal fun parseSimpleType(name: String, nativeName: String, type: String) = "val $name = \"$nativeName\".$type"

internal fun parseTypedef(nativeName: String, type: CXType) = "val $nativeName = typedef(${type.lwjgl}, \"$nativeName\")"

@UseExperimental(ExperimentalUnsignedTypes::class)
private fun parseConstant(header: Header, nativeName: String, value: String, doc: Documentation?): String {
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
    } else if (value.length == 18 && value.startsWith("0x") && value.toULongOrNull(16) != null) {
        type = "Long"
        v = value
    } else if (value.length == 10 && value.startsWith("0x") && value.toUIntOrNull(16) != null) {
        type = "Int"
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

    return "$t${type}Constant(${doc?.format("", "$t$t", "\n$t$t") ?: "\"\""}, \"$name\"..$v)${if (noPrefix) ".noPrefix()" else ""}"
}

private fun parseStringConstant(header: Header, nativeName: String, value: String, doc: Documentation?): String {
    val noPrefix = !nativeName.startsWith(header.prefixConstant)

    val name = if (noPrefix) nativeName else nativeName.substring(header.prefixConstant.length)

    return "${t}StringConstant(${doc?.format("", "$t$t", "\n$t$t") ?: "\"\""}, \"$name\"..$value)${if (noPrefix) ".noPrefix()" else ""}"
}

private val COLLAPSE_REGEX = "\\n\\s*".toRegex()

internal class EnumConstant(
    val name: String,
    val value: String,
    val doc: Documentation
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
    val doc: Documentation,
    val constants: List<EnumConstant>
) {
    fun getTypedef(): String = parseSimpleType(name, if (typedef) name else "enum $name", "enumType")

    fun getDeclaration(context: ExtractionContext): String {
        val noPrefix = constants.any { !it.name.startsWith(context.header.prefixConstant) }

        val typeDoc = if (name.isNotEmpty()) "({@code ${if (typedef) "" else "enum "}$name})" else ""
        val enumDoc = if (typeDoc.isEmpty())
            doc.format("$t$t")
        else if (doc.doc.isEmpty())
            "\"${typeDoc.substring(1, typeDoc.lastIndex)}\""
        else
            doc.doc.let { text ->
                if (text.contains('\n')) {
                    text.indexOf('.').let {
                        // try to insert after brief description
                        if (it != -1) {
                            "${text.substring(0, it + 1)} $typeDoc${text.substring(it + 1)}"
                        } else {
                            "$text\n\n$typeDoc"
                        }
                    }.formatDocumentation("$t$t")
                } else {
                    "$text\n\n$typeDoc".formatDocumentation("$t$t")
                }
            }

        return """    EnumConstant(
        $enumDoc,

        ${constants
            .mapIndexed { index, it ->
                val renderValue = if (it.value.startsWith("0x") && it.value.length != 10) {
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
                    if (it.value.startsWith("0x") && it.value.length == 10)
                        ", ${it.value}"
                    else
                        ", \"${it.value}\""
                } else {
                    ""
                }

                val n = "\"${if (noPrefix) it.name else it.name.substring(context.header.prefixConstant.length)}\""
                val doc = it.doc.doc
                if (doc.isEmpty() && v.isEmpty()) {
                    "$n.enum"
                } else if (!doc.contains('\n') && "$t$t".length + n.length + 7 + doc.length + 1 + v.length + (if (index == constants.lastIndex) 1 else 2) < 160) {
                    "$n.enum(\"${it.doc.doc}\"$v)"
                } else {
                    "$n.enum(\n$t$t$t${doc.formatDocumentation("$t$t$t,", "$t$t$t")}${if (v.isEmpty()) "" else ",\n$t$t$t${v.substring(2)}"}\n$t$t)"
                }
            }
            .joinToString(",\n$t$t")}
    )${if (noPrefix) ".noPrefix()" else ""}"""
    }
}

internal fun CXCursor.parseEnum(context: ExtractionContext, name: String, typedef: Boolean): Enum {
    val constants = ArrayList<EnumConstant>()

    clang_visitChildren(this) { enumConstantDecl, _ ->
        val constantName = enumConstantDecl.spelling

        val doc = stackPush().use { stack ->
            clang_Cursor_getParsedComment(enumConstantDecl, CXComment.mallocStack(stack)).parse()
        }

        val size = constants.size
        clang_visitChildren(enumConstantDecl) { enumValue, _ ->
            constants.add(
                EnumConstant(
                    constantName,
                    context.getSource(enumValue).replace(COLLAPSE_REGEX, " ").let {
                        if (it.endsWith("U")) it.substring(0, it.lastIndex) else it
                    },
                    doc
                )
            )
            CXChildVisit_Continue
        }
        if (constants.size == size) {
            constants.add(
                EnumConstant(
                    constantName,
                    clang_getEnumConstantDeclUnsignedValue(enumConstantDecl).toString(),
                    doc
                    //parseExpression(tu, source, enumValue)
                )
            )
        }
        CXChildVisit_Continue
    }

    stackPush().use { stack ->
        val doc = clang_Cursor_getParsedComment(this, CXComment.mallocStack(stack))
            .parse()

        return Enum(name, typedef, doc, constants)
    }
}

internal class Struct(
    private val name: String,
    private val typedef: Boolean,
    internal val documentation: String,
    internal val kind: String,
    internal val members: String
) {
    fun getDeclaration(context: ExtractionContext): String {
        return """val $name = $kind(Module.${context.header.module}, "$name"${
        if (typedef) "" else ", nativeName = \"struct $name\""
        }) {
    documentation =${if (documentation.startsWith('\n')) "" else " "}$documentation

    $members
}"""
    }
}

internal fun CXCursor.parseStruct(context: ExtractionContext, name: String, typedef: Boolean, handles: ArrayList<String>) =
    stackPush().use { frame  ->
        val structType = clang_getCursorType(this, CXType.mallocStack(frame))
        parseStructMembers(context, structType, name, handles, t).let { members ->
            if (members.isEmpty()) {
                null
            } else {
                stackPush().use { stack ->
                    val doc = clang_Cursor_getParsedComment(this, CXComment.mallocStack(stack))
                        .parse()
                        .doc
                        .formatDocumentation("${t}documentation = ", "$t$t", "\n$t$t")
                    Struct(name, typedef, doc, if (clang_getCursorKind(this) == CXCursor_UnionDecl) "union" else "struct", members)
                }
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

    clang_visitChildren(this) { fieldDecl, _ ->
        if (fieldDecl.kind() == CXCursor_UnexposedAttr) {
            attributes.add(context.getSource(fieldDecl))
        } else {
            stackPush().push().use { stack ->
                val name = fieldDecl.spelling
                val doc = clang_Cursor_getParsedComment(fieldDecl, CXComment.mallocStack(stack)).parse()

                val type = clang_getCursorType(fieldDecl, CXType.mallocStack(stack))
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
                        }, name, doc, indent
                    ))
                    CXType_Record        -> {
                        val (recordType, recordName) = clang_getCursorType(fieldDecl, CXType.mallocStack(stack))
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
                                    clang_getCursorType(fieldDecl, CXType.mallocStack(stack)).spelling,
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
                                val pointee = clang_getPointeeType(type, CXType.mallocStack(stack))
                                if (pointee.kind() == CXType_FunctionProto) {
                                    fieldDecl.anonymousFunctionProto(
                                        stack, pointee, indent, context.header.module, name,
                                        "Instances of this interface may be set to the {@code $name} field of the ##${if (structName.isNotEmpty()) structName else "FIXME"} struct."
                                    )
                                } else if (clang_equalTypes(structType, clang_getCanonicalType(pointee, CXType.mallocStack(stack)))) {
                                    // recursive struct definition
                                    "${if (clang_getCursorKind(clang_getTypeDeclaration(structType, CXCursor.mallocStack(stack))) == CXCursor_UnionDecl)
                                        "union" else "struct"}(Module.${context.header.module}, \"$structName\").p"
                                } else {
                                    type.lwjgl
                                }
                            }, name, doc, indent
                        ))
                    }
                    CXType_ConstantArray -> {
                        members.add(
                            structMember(
                                clang_getElementType(type, CXType.mallocStack(stack)).lwjgl.arrayDimension(clang_getArraySize(type)),
                                name,
                                doc,
                                indent
                            )
                        )
                    }
                    else                 -> members.add(structMember(type.lwjgl, name, doc, indent))
                }
                Unit
            }
        }
        CXChildVisit_Continue
    }

    return "${attributes.joinToString("\n", postfix = if (attributes.isEmpty()) "" else "\n$indent") { "// $it" }}${members.joinToString("\n$indent")}"
}

private fun structMember(type: String, name: String, doc: Documentation, indent: String): String {
    val memberDoc = doc.doc.let { memberDoc ->
        if (memberDoc.isEmpty()) {
            ""
        } else {
            memberDoc.toString().trim().let {
                "${it[0].toLowerCase()}${it.substring(1, if (it.endsWith('.') && it.indexOf('.') == it.lastIndex) it.lastIndex else it.length)}"
            }
        }
    }

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

    return if (!memberDoc.contains('\n') && elementType.lastIndexOf('\n').let {
            if (it == -1)
                elementType.length + indent.length
            else
                elementType.length - it
        } + 2 + name.length + 4 + memberDoc.length + 2 + arrayDimensions.length < 160)
        "$elementType(\"$name\", \"$memberDoc\")$arrayDimensions"
    else {
        "$elementType(\n$indent$t\"$name\",\n$indent$t${memberDoc.formatDocumentation("$indent$t")}\n$indent)$arrayDimensions"
    }
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
    clang_visitChildren(this) { cursor, _ ->
        if (clang_getCursorKind(cursor) == CXCursor_ParmDecl) {
            val cp = CXCursor.mallocStack(stack)
            memCopy(cursor, cp)
            args.add(cp)
        }
        CXChildVisit_Continue
    }

    val doc = clang_Cursor_getParsedComment(this, CXComment.mallocStack(stack)).parse()
    val docIndent = "$indent$t$t"

    return """Module.$module.callback {
$indent    ${clang_getResultType(proto, CXType.mallocStack(stack)).lwjgl}(
$indent        /*FIXME:*/"$name",
$indent        ${doc.format(docIndent)}${getFunctionArguments(module, proto, name, doc, docIndent, args)}${doc.formatReturnDoc()}
$indent    ) {
$indent        documentation = "$documentation"
$indent    }
$indent}"""
}

internal fun CXCursor.parseCallback(header: Header, type: CXType, name: String): String = stackPush().use { stack ->
    val args = ArrayList<CXCursor>(clang_getNumArgTypes(type))
    clang_visitChildren(this) { cursor, _ ->
        if (clang_getCursorKind(cursor) == CXCursor_ParmDecl) {
            val cp = CXCursor.mallocStack(stack)
            memCopy(cursor, cp)
            args.add(cp)
        }
        CXChildVisit_Continue
    }

    val doc = clang_Cursor_getParsedComment(this, CXComment.mallocStack(stack)).parse()

    """val $name = Module.${header.module}.callback {
    ${clang_getResultType(type, CXType.mallocStack(stack)).lwjgl}(
        "$name",
        ${doc.format("$t$t")}${getFunctionArguments(header.module, type, name, doc, "$t$t", args)},

        nativeType = "$name"${doc.formatReturnDoc()}
    ) {
        documentation = "Instances of this interface may be passed to the #FIXME() method."
    }
}"""
}

internal fun CXCursor.parseFunction(header: Header): String = stackPush().use { stack ->
    val nativeName = this.spelling
    val name = if (header.prefixMethod.isNotEmpty() && nativeName.startsWith(header.prefixMethod)) {
        nativeName.substring(header.prefixMethod.length)
    } else {
        nativeName
    }
    val type = clang_getCursorType(this, CXType.mallocStack(stack))
    val args = ArrayList<CXCursor>()
    clang_visitChildren(this) { cursor, _ ->
        if (clang_getCursorKind(cursor) == CXCursor_ParmDecl) {
            val cp = CXCursor.mallocStack(stack)
            memCopy(cursor, cp)
            args.add(cp)
        }
        CXChildVisit_Continue
    }

    val doc = clang_Cursor_getParsedComment(this, CXComment.mallocStack(stack)).parse()

    """    ${clang_getResultType(type, CXType.mallocStack(stack)).lwjgl}(
        "$name",
        ${doc.format("$t$t")}${getFunctionArguments(header.module, type, name, doc, "$t$t", args)}${doc.formatReturnDoc()}${
    if (header.prefixMethod.isNotEmpty() && nativeName == name) ",\n\n$t${t}noPrefix = true" else ""}
    )""" // TODO: seeAlso
}

private fun getFunctionArguments(
    module: String,
    functionType: CXType,
    functionName: String,
    doc: Documentation,
    indent: String,
    args: ArrayList<CXCursor>
) = if (args.isEmpty())
    ",\n\n${indent}void()"
else
    args.indices.joinToString(",\n$indent", prefix = ",\n\n$indent") { i ->
        stackPush().use { frame ->
            val argType = clang_getArgType(functionType, i, CXType.mallocStack(frame))
            val argSpelling = args[i].spelling
            val argName = argSpelling.let {
                if (it.isNotEmpty()) "\"$it\"" else "/*FIXME:*/\"\""
            }
            val paramDoc = doc.params[argSpelling]
                .let {
                    if (it != null || doc.paramList.size <= i) {
                        it
                    } else {
                        doc.paramList[i]
                    }
                }
                .let { paramDoc ->
                    if (paramDoc == null)
                        ""
                    else
                        doc.formatParamDoc(paramDoc)
                }

            val type = when (argType.kind()) {
                CXType_ConstantArray -> {
                    "Check(${clang_getArraySize(argType)})..${argType.lwjgl}"
                }
                CXType_Pointer       -> {
                    val pointee = clang_getPointeeType(argType, CXType.mallocStack(frame))
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
            formatFunctionArgument(type, argName, paramDoc, indent, i == args.lastIndex)
        }
    }

private fun formatFunctionArgument(type: String, name: String, doc: String, indent: String, last: Boolean): String =
    if (!doc.contains('\n') && type.lastIndexOf('\n').let {
            if (it == -1)
                type.length + indent.length
            else
                type.length - it
        } + 1 + name.length + 3 + doc.length + (if (last) 2 else 3) < 160) {
        "$type($name, \"$doc\")"
    } else {
        "$type(\n$indent$t$name,\n$indent$t${doc.formatDocumentation("$indent$t")}\n$indent)"
    }

internal fun CXCursor.parseMacro(
    context: ExtractionContext,
    constants: ArrayList<String>
) {
    stackPush().use { stack ->
        val tokens = stack.mallocPointer(1).let { pp ->
            val numTokens = stack.mallocInt(1)
            clang_tokenize(context.tu, clang_getCursorExtent(this, CXSourceRange.mallocStack(stack)), pp, numTokens)
            CXToken.create(pp[0], numTokens[0])
        }

        try {
            val token = tokens.asSequence()
                .drop(1)
                .filter {
                    clang_getTokenKind(it) != CXToken_Punctuation || when (clang_getTokenSpelling(context.tu, it, stack.str).str) {
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
                    CXToken_Identifier -> constants.add(parseConstant(context.header, name, spelling, null))
                    CXToken_Literal    -> constants.add(
                        if (spelling.startsWith('\"')) {
                            parseStringConstant(context.header, name, spelling, null)
                        } else {
                            parseConstant(context.header, name, spelling, null)
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
    clang_visitChildren(this) { child, _ ->
        result = predicate(child)
        traversal
    }
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
            CXType_Pointer         -> "${clang_getPointeeType(this, CXType.mallocStack(stack)).lwjgl}.p"
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
            CXType_ConstantArray   -> clang_getElementType(this, CXType.mallocStack(stack)).lwjgl.arrayDimension(clang_getArraySize(this))
            //CXType_Vector ->
            CXType_IncompleteArray -> "${clang_getElementType(this, CXType.mallocStack(stack)).lwjgl}.p"
            //CXType_VariableArray ->
            //CXType_DependentSizedArray ->
            //CXType_MemberPointer ->
            CXType_Elaborated      -> {
                clang_Type_getNamedType(this, CXType.mallocStack(stack)).lwjgl
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