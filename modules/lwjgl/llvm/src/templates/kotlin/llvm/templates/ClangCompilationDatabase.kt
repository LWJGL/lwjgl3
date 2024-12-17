/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val ClangCompilationDatabase = "ClangCompilationDatabase".nativeClass(
    Module.LLVM,
    prefixConstant = "CX",
    prefixMethod = "clang_",
    binding = CLANG_BINDING_DELEGATE
) {
    nativeImport("clang-c/CXCompilationDatabase.h")

   EnumConstant(
        "CompilationDatabase_NoError".enum("0"),
        "CompilationDatabase_CanNotLoadDatabase".enum
    )

    CXCompilationDatabase(
        "CompilationDatabase_fromDirectory",

        charASCII.const.p("BuildDir"),
        Check(1)..CXCompilationDatabase_Error.p("ErrorCode")
    )

    void(
        "CompilationDatabase_dispose",

        CXCompilationDatabase("database")
    )

    CXCompileCommands(
        "CompilationDatabase_getCompileCommands",

        CXCompilationDatabase("database"),
        charASCII.const.p("CompleteFileName")
    )

    CXCompileCommands(
        "CompilationDatabase_getAllCompileCommands",

        CXCompilationDatabase("database")
    )

    void(
        "CompileCommands_dispose",

        CXCompileCommands("commands")
    )

    unsigned_int(
        "CompileCommands_getSize",

        CXCompileCommands("commands")
    )

    CXCompileCommand(
        "CompileCommands_getCommand",

        CXCompileCommands("commands"),
        unsigned_int("I")
    )

    CXString(
        "CompileCommand_getDirectory",

        CXCompileCommand("command")
    )

    CXString(
        "CompileCommand_getFilename",

        CXCompileCommand("command")
    )

    unsigned_int(
        "CompileCommand_getNumArgs",

        CXCompileCommand("command")
    )

    CXString(
        "CompileCommand_getArg",

        CXCompileCommand("command"),
        unsigned_int("I")
    )

    unsigned_int(
        "CompileCommand_getNumMappedSources",

        CXCompileCommand("command")
    )

    CXString(
        "CompileCommand_getMappedSourcePath",

        CXCompileCommand("command"),
        unsigned_int("I")
    )

    CXString(
        "CompileCommand_getMappedSourceContent",

        CXCompileCommand("command"),
        unsigned_int("I")
    )
}