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
        """
        Error codes for Compilation Database

        ({@code CXCompilationDatabase_Error})
        """,

        "CompilationDatabase_NoError".enum("No error occurred", "0"),
        "CompilationDatabase_CanNotLoadDatabase".enum("Database can not be loaded")
    )

    CXCompilationDatabase(
        "CompilationDatabase_fromDirectory",
        """
        Creates a compilation database from the database found in directory buildDir. For example, CMake can output a compile_commands.json which can be used
        to build the database.

        It must be freed by {@code clang_CompilationDatabase_dispose}.
        """,

        charASCII.const.p("BuildDir", ""),
        Check(1)..CXCompilationDatabase_Error.p("ErrorCode", "")
    )

    void(
        "CompilationDatabase_dispose",
        "Free the given compilation database",

        CXCompilationDatabase("database", "")
    )

    CXCompileCommands(
        "CompilationDatabase_getCompileCommands",
        "Find the compile commands used for a file. The compile commands must be freed by {@code clang_CompileCommands_dispose}.",

        CXCompilationDatabase("database", ""),
        charASCII.const.p("CompleteFileName", "")
    )

    CXCompileCommands(
        "CompilationDatabase_getAllCompileCommands",
        "Get all the compile commands in the given compilation database.",

        CXCompilationDatabase("database", "")
    )

    void(
        "CompileCommands_dispose",
        "Free the given CompileCommands",

        CXCompileCommands("commands", "")
    )

    unsigned_int(
        "CompileCommands_getSize",
        "Get the number of CompileCommand we have for a file",

        CXCompileCommands("commands", "")
    )

    CXCompileCommand(
        "CompileCommands_getCommand",
        """
        Get the I'th CompileCommand for a file

        Note : 0 &lt;= i &lt;clang_CompileCommands_getSize(CXCompileCommands)
        """,

        CXCompileCommands("commands", ""),
        unsigned_int("I", "")
    )

    CXString(
        "CompileCommand_getDirectory",
        "Get the working directory where the CompileCommand was executed from",

        CXCompileCommand("command", "")
    )

    CXString(
        "CompileCommand_getFilename",
        "Get the filename associated with the CompileCommand.",

        CXCompileCommand("command", "")
    )

    unsigned_int(
        "CompileCommand_getNumArgs",
        "Get the number of arguments in the compiler invocation.",

        CXCompileCommand("command", "")
    )

    CXString(
        "CompileCommand_getArg",
        """
        Get the I'th argument value in the compiler invocations

        Invariant :

        ${ul(
            "argument 0 is the compiler executable"
        )}
        """,

        CXCompileCommand("command", ""),
        unsigned_int("I", "")
    )

    unsigned_int(
        "CompileCommand_getNumMappedSources",
        "Get the number of source mappings for the compiler invocation.",

        CXCompileCommand("command", "")
    )

    CXString(
        "CompileCommand_getMappedSourcePath",
        "Get the I'th mapped source path for the compiler invocation.",

        CXCompileCommand("command", ""),
        unsigned_int("I", "")
    )

    CXString(
        "CompileCommand_getMappedSourceContent",
        "Get the I'th mapped source content for the compiler invocation.",

        CXCompileCommand("command", ""),
        unsigned_int("I", "")
    )
}