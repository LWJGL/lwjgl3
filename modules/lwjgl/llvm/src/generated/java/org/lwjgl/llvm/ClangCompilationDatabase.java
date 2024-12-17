/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ClangCompilationDatabase {

    static { LibLLVM.initialize(); }

    /** Contains the function pointers loaded from {@code ClangIndex.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            CompilationDatabase_fromDirectory         = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_fromDirectory"),
            CompilationDatabase_dispose               = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_dispose"),
            CompilationDatabase_getCompileCommands    = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_getCompileCommands"),
            CompilationDatabase_getAllCompileCommands = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompilationDatabase_getAllCompileCommands"),
            CompileCommands_dispose                   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommands_dispose"),
            CompileCommands_getSize                   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommands_getSize"),
            CompileCommands_getCommand                = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommands_getCommand"),
            CompileCommand_getDirectory               = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getDirectory"),
            CompileCommand_getFilename                = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getFilename"),
            CompileCommand_getNumArgs                 = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getNumArgs"),
            CompileCommand_getArg                     = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getArg"),
            CompileCommand_getNumMappedSources        = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getNumMappedSources"),
            CompileCommand_getMappedSourcePath        = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getMappedSourcePath"),
            CompileCommand_getMappedSourceContent     = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_CompileCommand_getMappedSourceContent");

    }

    public static final int
        CXCompilationDatabase_NoError            = 0,
        CXCompilationDatabase_CanNotLoadDatabase = 1;

    protected ClangCompilationDatabase() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_CompilationDatabase_fromDirectory ] ---

    /** {@code CXCompilationDatabase clang_CompilationDatabase_fromDirectory(char const * BuildDir, CXCompilationDatabase_Error * ErrorCode)} */
    public static long nclang_CompilationDatabase_fromDirectory(long BuildDir, long ErrorCode) {
        long __functionAddress = Functions.CompilationDatabase_fromDirectory;
        return invokePPP(BuildDir, ErrorCode, __functionAddress);
    }

    /** {@code CXCompilationDatabase clang_CompilationDatabase_fromDirectory(char const * BuildDir, CXCompilationDatabase_Error * ErrorCode)} */
    @NativeType("CXCompilationDatabase")
    public static long clang_CompilationDatabase_fromDirectory(@NativeType("char const *") ByteBuffer BuildDir, @NativeType("CXCompilationDatabase_Error *") IntBuffer ErrorCode) {
        if (CHECKS) {
            checkNT1(BuildDir);
            check(ErrorCode, 1);
        }
        return nclang_CompilationDatabase_fromDirectory(memAddress(BuildDir), memAddress(ErrorCode));
    }

    /** {@code CXCompilationDatabase clang_CompilationDatabase_fromDirectory(char const * BuildDir, CXCompilationDatabase_Error * ErrorCode)} */
    @NativeType("CXCompilationDatabase")
    public static long clang_CompilationDatabase_fromDirectory(@NativeType("char const *") CharSequence BuildDir, @NativeType("CXCompilationDatabase_Error *") IntBuffer ErrorCode) {
        if (CHECKS) {
            check(ErrorCode, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(BuildDir, true);
            long BuildDirEncoded = stack.getPointerAddress();
            return nclang_CompilationDatabase_fromDirectory(BuildDirEncoded, memAddress(ErrorCode));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_CompilationDatabase_dispose ] ---

    /** {@code void clang_CompilationDatabase_dispose(CXCompilationDatabase database)} */
    public static void clang_CompilationDatabase_dispose(@NativeType("CXCompilationDatabase") long database) {
        long __functionAddress = Functions.CompilationDatabase_dispose;
        if (CHECKS) {
            check(database);
        }
        invokePV(database, __functionAddress);
    }

    // --- [ clang_CompilationDatabase_getCompileCommands ] ---

    /** {@code CXCompileCommands clang_CompilationDatabase_getCompileCommands(CXCompilationDatabase database, char const * CompleteFileName)} */
    public static long nclang_CompilationDatabase_getCompileCommands(long database, long CompleteFileName) {
        long __functionAddress = Functions.CompilationDatabase_getCompileCommands;
        if (CHECKS) {
            check(database);
        }
        return invokePPP(database, CompleteFileName, __functionAddress);
    }

    /** {@code CXCompileCommands clang_CompilationDatabase_getCompileCommands(CXCompilationDatabase database, char const * CompleteFileName)} */
    @NativeType("CXCompileCommands")
    public static long clang_CompilationDatabase_getCompileCommands(@NativeType("CXCompilationDatabase") long database, @NativeType("char const *") ByteBuffer CompleteFileName) {
        if (CHECKS) {
            checkNT1(CompleteFileName);
        }
        return nclang_CompilationDatabase_getCompileCommands(database, memAddress(CompleteFileName));
    }

    /** {@code CXCompileCommands clang_CompilationDatabase_getCompileCommands(CXCompilationDatabase database, char const * CompleteFileName)} */
    @NativeType("CXCompileCommands")
    public static long clang_CompilationDatabase_getCompileCommands(@NativeType("CXCompilationDatabase") long database, @NativeType("char const *") CharSequence CompleteFileName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(CompleteFileName, true);
            long CompleteFileNameEncoded = stack.getPointerAddress();
            return nclang_CompilationDatabase_getCompileCommands(database, CompleteFileNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_CompilationDatabase_getAllCompileCommands ] ---

    /** {@code CXCompileCommands clang_CompilationDatabase_getAllCompileCommands(CXCompilationDatabase database)} */
    @NativeType("CXCompileCommands")
    public static long clang_CompilationDatabase_getAllCompileCommands(@NativeType("CXCompilationDatabase") long database) {
        long __functionAddress = Functions.CompilationDatabase_getAllCompileCommands;
        if (CHECKS) {
            check(database);
        }
        return invokePP(database, __functionAddress);
    }

    // --- [ clang_CompileCommands_dispose ] ---

    /** {@code void clang_CompileCommands_dispose(CXCompileCommands commands)} */
    public static void clang_CompileCommands_dispose(@NativeType("CXCompileCommands") long commands) {
        long __functionAddress = Functions.CompileCommands_dispose;
        if (CHECKS) {
            check(commands);
        }
        invokePV(commands, __functionAddress);
    }

    // --- [ clang_CompileCommands_getSize ] ---

    /** {@code unsigned int clang_CompileCommands_getSize(CXCompileCommands commands)} */
    @NativeType("unsigned int")
    public static int clang_CompileCommands_getSize(@NativeType("CXCompileCommands") long commands) {
        long __functionAddress = Functions.CompileCommands_getSize;
        if (CHECKS) {
            check(commands);
        }
        return invokePI(commands, __functionAddress);
    }

    // --- [ clang_CompileCommands_getCommand ] ---

    /** {@code CXCompileCommand clang_CompileCommands_getCommand(CXCompileCommands commands, unsigned int I)} */
    @NativeType("CXCompileCommand")
    public static long clang_CompileCommands_getCommand(@NativeType("CXCompileCommands") long commands, @NativeType("unsigned int") int I) {
        long __functionAddress = Functions.CompileCommands_getCommand;
        if (CHECKS) {
            check(commands);
        }
        return invokePP(commands, I, __functionAddress);
    }

    // --- [ clang_CompileCommand_getDirectory ] ---

    /** {@code CXString clang_CompileCommand_getDirectory(CXCompileCommand command)} */
    public static native void nclang_CompileCommand_getDirectory(long command, long __functionAddress, long __result);

    /** {@code CXString clang_CompileCommand_getDirectory(CXCompileCommand command)} */
    public static void nclang_CompileCommand_getDirectory(long command, long __result) {
        long __functionAddress = Functions.CompileCommand_getDirectory;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getDirectory(command, __functionAddress, __result);
    }

    /** {@code CXString clang_CompileCommand_getDirectory(CXCompileCommand command)} */
    public static CXString clang_CompileCommand_getDirectory(@NativeType("CXCompileCommand") long command, CXString __result) {
        nclang_CompileCommand_getDirectory(command, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getFilename ] ---

    /** {@code CXString clang_CompileCommand_getFilename(CXCompileCommand command)} */
    public static native void nclang_CompileCommand_getFilename(long command, long __functionAddress, long __result);

    /** {@code CXString clang_CompileCommand_getFilename(CXCompileCommand command)} */
    public static void nclang_CompileCommand_getFilename(long command, long __result) {
        long __functionAddress = Functions.CompileCommand_getFilename;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getFilename(command, __functionAddress, __result);
    }

    /** {@code CXString clang_CompileCommand_getFilename(CXCompileCommand command)} */
    public static CXString clang_CompileCommand_getFilename(@NativeType("CXCompileCommand") long command, CXString __result) {
        nclang_CompileCommand_getFilename(command, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getNumArgs ] ---

    /** {@code unsigned int clang_CompileCommand_getNumArgs(CXCompileCommand command)} */
    @NativeType("unsigned int")
    public static int clang_CompileCommand_getNumArgs(@NativeType("CXCompileCommand") long command) {
        long __functionAddress = Functions.CompileCommand_getNumArgs;
        if (CHECKS) {
            check(command);
        }
        return invokePI(command, __functionAddress);
    }

    // --- [ clang_CompileCommand_getArg ] ---

    /** {@code CXString clang_CompileCommand_getArg(CXCompileCommand command, unsigned int I)} */
    public static native void nclang_CompileCommand_getArg(long command, int I, long __functionAddress, long __result);

    /** {@code CXString clang_CompileCommand_getArg(CXCompileCommand command, unsigned int I)} */
    public static void nclang_CompileCommand_getArg(long command, int I, long __result) {
        long __functionAddress = Functions.CompileCommand_getArg;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getArg(command, I, __functionAddress, __result);
    }

    /** {@code CXString clang_CompileCommand_getArg(CXCompileCommand command, unsigned int I)} */
    public static CXString clang_CompileCommand_getArg(@NativeType("CXCompileCommand") long command, @NativeType("unsigned int") int I, CXString __result) {
        nclang_CompileCommand_getArg(command, I, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getNumMappedSources ] ---

    /** {@code unsigned int clang_CompileCommand_getNumMappedSources(CXCompileCommand command)} */
    @NativeType("unsigned int")
    public static int clang_CompileCommand_getNumMappedSources(@NativeType("CXCompileCommand") long command) {
        long __functionAddress = Functions.CompileCommand_getNumMappedSources;
        if (CHECKS) {
            check(command);
        }
        return invokePI(command, __functionAddress);
    }

    // --- [ clang_CompileCommand_getMappedSourcePath ] ---

    /** {@code CXString clang_CompileCommand_getMappedSourcePath(CXCompileCommand command, unsigned int I)} */
    public static native void nclang_CompileCommand_getMappedSourcePath(long command, int I, long __functionAddress, long __result);

    /** {@code CXString clang_CompileCommand_getMappedSourcePath(CXCompileCommand command, unsigned int I)} */
    public static void nclang_CompileCommand_getMappedSourcePath(long command, int I, long __result) {
        long __functionAddress = Functions.CompileCommand_getMappedSourcePath;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getMappedSourcePath(command, I, __functionAddress, __result);
    }

    /** {@code CXString clang_CompileCommand_getMappedSourcePath(CXCompileCommand command, unsigned int I)} */
    public static CXString clang_CompileCommand_getMappedSourcePath(@NativeType("CXCompileCommand") long command, @NativeType("unsigned int") int I, CXString __result) {
        nclang_CompileCommand_getMappedSourcePath(command, I, __result.address());
        return __result;
    }

    // --- [ clang_CompileCommand_getMappedSourceContent ] ---

    /** {@code CXString clang_CompileCommand_getMappedSourceContent(CXCompileCommand command, unsigned int I)} */
    public static native void nclang_CompileCommand_getMappedSourceContent(long command, int I, long __functionAddress, long __result);

    /** {@code CXString clang_CompileCommand_getMappedSourceContent(CXCompileCommand command, unsigned int I)} */
    public static void nclang_CompileCommand_getMappedSourceContent(long command, int I, long __result) {
        long __functionAddress = Functions.CompileCommand_getMappedSourceContent;
        if (CHECKS) {
            check(command);
        }
        nclang_CompileCommand_getMappedSourceContent(command, I, __functionAddress, __result);
    }

    /** {@code CXString clang_CompileCommand_getMappedSourceContent(CXCompileCommand command, unsigned int I)} */
    public static CXString clang_CompileCommand_getMappedSourceContent(@NativeType("CXCompileCommand") long command, @NativeType("unsigned int") int I, CXString __result) {
        nclang_CompileCommand_getMappedSourceContent(command, I, __result.address());
        return __result;
    }

}