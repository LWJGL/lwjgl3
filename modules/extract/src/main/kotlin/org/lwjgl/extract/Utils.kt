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
import java.io.*

internal val MemoryStack.str: CXString get() = CXString.mallocStack(this)
internal val CXString.str: String
    get() = try {
        clang_getCString(this)!!
    } finally {
        clang_disposeString(this)
    }

internal val CXCursor.spelling: String
    get() {
        return stackPush().use { stack ->
            clang_getCursorSpelling(this, CXString.mallocStack(stack)).str
        }
    }

internal val CXType.spelling: String
    get() {
        return stackPush().use { stack ->
            clang_getTypeSpelling(this, CXString.mallocStack(stack)).str
        }
    }

internal fun dump(root: CXCursor, stream: PrintStream = System.out) {
    stackPush().use { stack ->
        val pp = stack.mallocPointer(1)

        val location = clang_getCursorLocation(root, CXSourceLocation.mallocStack(stack))
        clang_getFileLocation(location, pp, null, null, null)

        val tu = clang_Cursor_getTranslationUnit(root)
        val file = pp[0]

        stream.println(root.text(memUTF8(clang_getFileContents(tu, file)!!)))

        dump(root, stream, 0)
    }
}

internal fun dump(root: CXCursor, stream: PrintStream, depth: Int) {
    stackPush().use { stack ->
        stream.printf(
            "$t|%sCursor %s of kind %s\n",
            " ".repeat(depth * 4),
            root.spelling,
            clang_getCursorKindSpelling(clang_getCursorKind(root), stack.str).str
        )
    }
    CXCursorVisitor.create { child, _, _ ->
        dump(child, stream, depth + 1)
        CXChildVisit_Continue
    }.use { clang_visitChildren(root, it, NULL) }
}

internal fun CXCursor.text(source: String): String {
    stackPush().use { stack ->
        val start = stack.mallocInt(1)
        val end = stack.mallocInt(1)

        val loc = CXSourceLocation.mallocStack(stack)

        val range = clang_getCursorExtent(this, CXSourceRange.mallocStack(stack))
        clang_getSpellingLocation(clang_getRangeStart(range, loc), null, null, null, start)
        clang_getSpellingLocation(clang_getRangeEnd(range, loc), null, null, null, end)

        return source.substring(start[0], end[0])
    }
}

// Use redefinition with EXACTLY_ONCE contract

/*private inline fun <T : AutoCloseable?, R> T.use(block: (T) -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    var exception: Throwable? = null
    try {
        return block(this)
    } catch (e: Throwable) {
        exception = e
        throw e
    } finally {
        this.closeFinally(exception)
    }
}

private fun AutoCloseable?.closeFinally(cause: Throwable?) = when {
    this == null  -> {
    }
    cause == null -> close()
    else          ->
        try {
            close()
        } catch (closeException: Throwable) {
            cause.addSuppressed(closeException)
        }
}*/
