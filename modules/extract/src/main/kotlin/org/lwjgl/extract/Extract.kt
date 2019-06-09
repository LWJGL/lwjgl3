/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.extract

import org.lwjgl.llvm.*
import org.lwjgl.llvm.ClangIndex.*
import org.lwjgl.system.MemoryStack.*
import org.lwjgl.system.MemoryUtil.*
import java.io.*
import java.nio.file.*

internal class Options(
    val compilerArgs: List<String>,
    val mainFileOnly: Boolean,
    val ignoreSystemHeaders: Boolean,
    val ignoreErrors: Boolean,
    val parseAllComments: Boolean,
    val parseTypes: Boolean,
    val parseStructs: Boolean,
    val parseConstants: Boolean,
    val parseFunctions: Boolean
)

internal class Header(
    val module: String,
    val prefixConstant: String,
    val prefixMethod: String,
    includePaths: List<Path>,
    val path: Path
) {
    val includePaths = sequenceOf(path.parent)
        .plus(includePaths)
        .mapTo(ArrayList()) {
            it.toAbsolutePath()
        }

    internal fun shouldParse(cursor: CXCursor, options: Options) = stackPush().use { stack ->
        val location = clang_getCursorLocation(cursor, CXSourceLocation.mallocStack(stack))

        if (options.mainFileOnly || (includePaths.isEmpty() && options.ignoreSystemHeaders)) {
            clang_Location_isFromMainFile(location)
        } else if (options.ignoreSystemHeaders) {
            val pp = stack.mallocPointer(1)
            clang_getFileLocation(location, pp, null, null, null)
            pp[0] != NULL && Paths.get(clang_getFileName(pp[0], stack.str).str)
                .toAbsolutePath()
                .let { path ->
                    includePaths.any { path.startsWith(it) }
                }
        } else {
            true
        }
    }
}

internal class CompilationError(message: String) : RuntimeException(message)

internal class ExtractionContext(val header: Header, val options: Options, errors: PrintStream) {

    private val index = clang_createIndex(false, false)
    private val sources = HashMap<String, String>()

    val tu = stackPush().use { stack ->
        val pp = stack.mallocPointer(1)
        val err = clang_parseTranslationUnit2(
            index,
            header.path.toString(),
            stack.pointers(
                *header.includePaths.asSequence().map { "-I$it" }
                    .plus(options.compilerArgs.asSequence())
                    .plus(if (options.parseAllComments) sequenceOf("-fparse-all-comments") else emptySequence())
                    .mapTo(ArrayList()) { stack.ASCII(it) }
                    .toTypedArray()
            ),
            null,
            CXTranslationUnit_DetailedPreprocessingRecord,
            pp
        )
        if (err != CXError_Success) {
            throw IllegalStateException("Failed to parse header. Error code: $err")
        }
        pp[0]
    }.let { tu ->
        val diagnostics = clang_getDiagnosticSetFromTU(tu)
        try {
            if (printDiagnostics(diagnostics, errors) && !options.ignoreErrors) {
                free(tu)
                throw CompilationError("Detected errors in translation unit")
            }
        } finally {
            clang_disposeDiagnosticSet(diagnostics)
        }
        tu
    }

    internal fun free() {
        free(tu)
    }

    private fun free(tu: Long) {
        clang_disposeTranslationUnit(tu)
        clang_disposeIndex(index)
    }

    private fun printDiagnostics(diagnostics: Long, errors: PrintStream): Boolean {
        var hasError = false
        for (i in 0 until clang_getNumDiagnosticsInSet(diagnostics)) {
            stackPush().use { stack ->
                val diagnostic = clang_getDiagnosticInSet(diagnostics, i)

                if (CXDiagnostic_Error <= clang_getDiagnosticSeverity(diagnostic)) {
                    hasError = true
                }

                errors.println(
                    clang_formatDiagnostic(
                        diagnostic,
                        CXDiagnostic_DisplaySourceLocation or
                        CXDiagnostic_DisplayColumn or
                        CXDiagnostic_DisplayOption or
                        CXDiagnostic_DisplayCategoryName,
                        stack.str
                    ).str
                )

                val childDiagnostics = clang_getChildDiagnostics(diagnostic)
                if (childDiagnostics != NULL) {
                    hasError = hasError or printDiagnostics(childDiagnostics, errors)
                }

                clang_disposeDiagnostic(diagnostic)
            }
        }
        return hasError
    }

    internal fun getSource(cursor: CXCursor): String {
        return stackPush().use { stack ->
            val start = stack.mallocInt(1)
            val end = stack.mallocInt(1)

            val loc = CXSourceLocation.mallocStack(stack)

            clang_getCursorExtent(cursor, CXSourceRange.mallocStack(stack)).let { range ->
                clang_getSpellingLocation(clang_getRangeStart(range, loc), null, null, null, start)
                clang_getSpellingLocation(clang_getRangeEnd(range, loc), null, null, null, end)
            }

            stack.mallocPointer(1)
                .let { pp ->
                    clang_getFileLocation(loc, pp, null, null, null)
                    pp[0]
                }
                .let { file ->
                    sources
                        .getOrPut(clang_getFileName(file, stack.str).str) {
                            memUTF8(clang_getFileContents(clang_Cursor_getTranslationUnit(cursor), file)!!)
                        }
                        .substring(start[0], end[0])
                }
        }
    }
}

internal const val t = "    "

internal fun parse(
    header: Header,
    options: Options,
    output: PrintStream,
    errors: PrintStream
) {
    val context = try {
        ExtractionContext(header, options, errors)
    } catch (e: CompilationError) {
        return
    }

    val structDeclarations = HashMap<String, Struct>()
    val enumDeclarations = HashMap<String, Enum>()

    val handles = ArrayList<String>()
    val typedefs = ArrayList<String>()
    val aggregateTypes = LinkedHashMap<String, Any>() // struct/union/function
    val constants = ArrayList<String>()
    val enums = LinkedHashMap<String, Enum>()
    val functions = ArrayList<String>()

    fun structTypedef(cursor: CXCursor, name: String) {
        val declarationName = cursor.spelling
        val declaration = structDeclarations[declarationName]
        if (declaration == null) {
            TODO()
        }
        aggregateTypes.remove(declarationName)
        aggregateTypes[name] = Struct(name, true, declaration.documentation, declaration.kind, declaration.members)
    }

    fun enumTypedef(cursor: CXCursor, name: String) {
        val declarationName = cursor.spelling
        val declaration = enumDeclarations[declarationName]
        if (declaration == null) {
            TODO()
        }
        enums.remove(declarationName)
        enums[name] = Enum(name, true, declaration.doc, declaration.constants)
    }

    stackPush().use { stack ->
        clang_visitChildren(clang_getTranslationUnitCursor(context.tu, CXCursor.mallocStack(stack))) { cursor, _ ->
            if (!header.shouldParse(cursor, options)) {
                return@clang_visitChildren CXChildVisit_Continue
            }

            stack.push().use { frame ->
                val kind = clang_getCursorKind(cursor)

                when (kind) {
                    CXCursor_EnumDecl        -> {
                        if (options.parseConstants) {
                            cursor.spelling.let { name ->
                                cursor.parseEnum(context, name, false).let {
                                    enumDeclarations[name] = it
                                    enums[name] = it
                                }
                            }
                        }
                    }
                    CXCursor_StructDecl,
                    CXCursor_UnionDecl       -> {
                        if (options.parseStructs) {
                            cursor.spelling.let { name ->
                                cursor.parseStruct(context, name, false, handles).let {
                                    if (it != null) {
                                        structDeclarations[name] = it
                                        aggregateTypes[name] = it
                                    }
                                }
                            }
                        }
                    }
                    CXCursor_TypedefDecl     -> {
                        val name = cursor.spelling
                        val underlyingType = clang_getTypedefDeclUnderlyingType(cursor, CXType.mallocStack(frame))
                        when (underlyingType.kind()) {
                            CXType_Elaborated -> {
                                clang_visitChildren(cursor) { child, _ ->
                                    when (clang_getCursorKind(child)) {
                                        CXCursor_EnumDecl  -> {
                                            if (options.parseConstants) {
                                                enumTypedef(child, name)
                                            }
                                        }
                                        CXCursor_StructDecl,
                                        CXCursor_UnionDecl -> {
                                            if (structDeclarations.containsKey(child.spelling)) {
                                                if (options.parseStructs) {
                                                    structTypedef(child, name)
                                                }
                                            } else if (options.parseTypes) {
                                                typedefs.add(parseSimpleType(name, name, "opaque"))
                                            }
                                        }
                                        CXCursor_TypeRef   -> {
                                            when (clang_getCursorType(child, CXType.mallocStack(frame)).kind()) {
                                                CXType_Enum   -> {
                                                    if (options.parseConstants) {
                                                        enumTypedef(clang_getCursorReferenced(child, CXCursor.mallocStack(frame)), name)
                                                    }
                                                }
                                                CXType_Record -> {
                                                    val record = clang_getCursorReferenced(child, CXCursor.mallocStack(frame))
                                                    if (structDeclarations.containsKey(record.spelling)) {
                                                        if (options.parseStructs) {
                                                            structTypedef(record, name)
                                                        }
                                                    } else if (options.parseTypes) {
                                                        typedefs.add(parseSimpleType(name, name, "opaque"))
                                                    }
                                                }
                                                else          -> {
                                                    if (options.parseTypes) {
                                                        typedefs.add(parseTypedef(name, underlyingType))
                                                    }
                                                }
                                            }
                                        }
                                        else               -> TODO()
                                    }
                                    CXChildVisit_Continue
                                }
                            }
                            CXType_Pointer    -> {
                                val pointee = clang_getPointeeType(underlyingType, CXType.mallocStack(frame))
                                when (pointee.kind()) {
                                    CXType_Void,
                                    CXType_Elaborated,
                                    CXType_Typedef       -> {
                                        if (options.parseTypes) {
                                            handles.add(parseSimpleType(name, name, "handle"))
                                        }
                                    }
                                    CXType_FunctionNoProto,
                                    CXType_FunctionProto -> {
                                        if (options.parseTypes) {
                                            aggregateTypes[name] = cursor.parseCallback(header, pointee, name)
                                        }
                                    }
                                    else                 -> {
                                        if (options.parseTypes) {
                                            typedefs.add(parseTypedef(name, pointee))
                                        }
                                    }
                                }
                            }
                            else              -> {
                                if (options.parseTypes) {
                                    typedefs.add(parseTypedef(name, underlyingType))
                                }
                            }
                        }
                    }
                    CXCursor_FunctionDecl    -> {
                        // TODO: filter by clang_Cursor_getStorageClass
                        if (options.parseFunctions) {
                            functions.add(cursor.parseFunction(header))
                        }
                    }
                    CXCursor_MacroDefinition -> {
                        if (options.parseConstants && !clang_Cursor_isMacroFunctionLike(cursor)) {
                            cursor.parseMacro(context, constants)
                        }
                    }
                    CXCursor_InclusionDirective,
                    CXCursor_MacroExpansion  -> {
                    }
                    CXCursor_VarDecl         -> {
                        errors.println("----------[ SKIPPED ]----------")
                        dump(cursor, errors)
                        errors.println("-------------------------------")
                    }
                    else                     -> {
                        dump(cursor)
                        TODO()
                    }
                }
                Unit
            }
            CXChildVisit_Continue
        }
    }

    if (handles.isNotEmpty()) {
        handles
            .sorted()
            .forEach {
                output.println(it)
            }
        output.println()
    }

    if (typedefs.isNotEmpty()) {
        typedefs
            .sorted()
            .forEach {
                output.println(it)
            }
        output.println()
    }

    if (enums.isNotEmpty()) {
        enums
            .mapNotNull { (_, enum) -> if (enum.name.isNotEmpty()) enum.getTypedef() else null }
            .sorted()
            .forEach {
                output.println(it)
            }
        output.println()
    }

    if (aggregateTypes.isNotEmpty()) {
        aggregateTypes.forEach { (_, type) ->
            output.println(if (type is Struct) type.getDeclaration(context) else type.toString())
            output.println()
        }
    }

    if (constants.isNotEmpty()) {
        constants.forEach {
            output.println(it)
        }
        output.println()
    }

    if (enums.isNotEmpty()) {
        enums.forEach { (_, enum) ->
            output.println(enum.getDeclaration(context))
            output.println()
        }
    }

    if (functions.isNotEmpty()) {
        functions.forEach {
            output.println(it)
            output.println()
        }
    }

    output.flush()

    context.free()
}
