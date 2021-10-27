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

/** Requires Clang 12 or higher. */
public class ClangRewrite {

    static { LibLLVM.initialize(); }

    private static final SharedLibrary CLANG = Library.loadNative(ClangRewrite.class, "org.lwjgl.llvm", Configuration.LLVM_CLANG_LIBRARY_NAME, "clang", "libclang");

    /** Contains the function pointers loaded from the CLANG {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            create                = CLANG.getFunctionAddress("clang_CXRewriter_create"),
            insertTextBefore      = CLANG.getFunctionAddress("clang_CXRewriter_insertTextBefore"),
            replaceText           = CLANG.getFunctionAddress("clang_CXRewriter_replaceText"),
            removeText            = CLANG.getFunctionAddress("clang_CXRewriter_removeText"),
            overwriteChangedFiles = CLANG.getFunctionAddress("clang_CXRewriter_overwriteChangedFiles"),
            writeMainFileToStdOut = CLANG.getFunctionAddress("clang_CXRewriter_writeMainFileToStdOut"),
            dispose               = CLANG.getFunctionAddress("clang_CXRewriter_dispose");

    }

    /** Returns the CLANG {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return CLANG;
    }

    protected ClangRewrite() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_CXRewriter_create ] ---

    /** Create {@code CXRewriter}. */
    @NativeType("CXRewriter")
    public static long clang_CXRewriter_create(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.create;
        if (CHECKS) {
            check(__functionAddress);
            check(TU);
        }
        return invokePP(TU, __functionAddress);
    }

    // --- [ clang_CXRewriter_insertTextBefore ] ---

    /** Unsafe version of: {@link #clang_CXRewriter_insertTextBefore insertTextBefore} */
    public static native void nclang_CXRewriter_insertTextBefore(long Rew, long Loc, long Insert, long __functionAddress);

    /** Unsafe version of: {@link #clang_CXRewriter_insertTextBefore insertTextBefore} */
    public static void nclang_CXRewriter_insertTextBefore(long Rew, long Loc, long Insert) {
        long __functionAddress = Functions.insertTextBefore;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        nclang_CXRewriter_insertTextBefore(Rew, Loc, Insert, __functionAddress);
    }

    /** Insert the specified string at the specified location in the original buffer. */
    public static void clang_CXRewriter_insertTextBefore(@NativeType("CXRewriter") long Rew, CXSourceLocation Loc, @NativeType("char const *") ByteBuffer Insert) {
        if (CHECKS) {
            checkNT1(Insert);
        }
        nclang_CXRewriter_insertTextBefore(Rew, Loc.address(), memAddress(Insert));
    }

    /** Insert the specified string at the specified location in the original buffer. */
    public static void clang_CXRewriter_insertTextBefore(@NativeType("CXRewriter") long Rew, CXSourceLocation Loc, @NativeType("char const *") CharSequence Insert) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Insert, true);
            long InsertEncoded = stack.getPointerAddress();
            nclang_CXRewriter_insertTextBefore(Rew, Loc.address(), InsertEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_CXRewriter_replaceText ] ---

    /** Unsafe version of: {@link #clang_CXRewriter_replaceText replaceText} */
    public static native void nclang_CXRewriter_replaceText(long Rew, long ToBeReplaced, long Replacement, long __functionAddress);

    /** Unsafe version of: {@link #clang_CXRewriter_replaceText replaceText} */
    public static void nclang_CXRewriter_replaceText(long Rew, long ToBeReplaced, long Replacement) {
        long __functionAddress = Functions.replaceText;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        nclang_CXRewriter_replaceText(Rew, ToBeReplaced, Replacement, __functionAddress);
    }

    /** Replace the specified range of characters in the input with the specified replacement. */
    public static void clang_CXRewriter_replaceText(@NativeType("CXRewriter") long Rew, CXSourceRange ToBeReplaced, @NativeType("char const *") ByteBuffer Replacement) {
        if (CHECKS) {
            checkNT1(Replacement);
        }
        nclang_CXRewriter_replaceText(Rew, ToBeReplaced.address(), memAddress(Replacement));
    }

    /** Replace the specified range of characters in the input with the specified replacement. */
    public static void clang_CXRewriter_replaceText(@NativeType("CXRewriter") long Rew, CXSourceRange ToBeReplaced, @NativeType("char const *") CharSequence Replacement) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Replacement, true);
            long ReplacementEncoded = stack.getPointerAddress();
            nclang_CXRewriter_replaceText(Rew, ToBeReplaced.address(), ReplacementEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_CXRewriter_removeText ] ---

    /** Unsafe version of: {@link #clang_CXRewriter_removeText removeText} */
    public static native void nclang_CXRewriter_removeText(long Rew, long ToBeRemoved, long __functionAddress);

    /** Unsafe version of: {@link #clang_CXRewriter_removeText removeText} */
    public static void nclang_CXRewriter_removeText(long Rew, long ToBeRemoved) {
        long __functionAddress = Functions.removeText;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        nclang_CXRewriter_removeText(Rew, ToBeRemoved, __functionAddress);
    }

    /** Remove the specified range. */
    public static void clang_CXRewriter_removeText(@NativeType("CXRewriter") long Rew, CXSourceRange ToBeRemoved) {
        nclang_CXRewriter_removeText(Rew, ToBeRemoved.address());
    }

    // --- [ clang_CXRewriter_overwriteChangedFiles ] ---

    /**
     * Save all changed files to disk.
     *
     * @return 1 if any files were not saved successfully, returns 0 otherwise
     */
    @NativeType("int")
    public static boolean clang_CXRewriter_overwriteChangedFiles(@NativeType("CXRewriter") long Rew) {
        long __functionAddress = Functions.overwriteChangedFiles;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        return invokePI(Rew, __functionAddress) != 0;
    }

    // --- [ clang_CXRewriter_writeMainFileToStdOut ] ---

    /** Write out rewritten version of the main file to {@code stdout}. */
    public static void clang_CXRewriter_writeMainFileToStdOut(@NativeType("CXRewriter") long Rew) {
        long __functionAddress = Functions.writeMainFileToStdOut;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        invokePV(Rew, __functionAddress);
    }

    // --- [ clang_CXRewriter_dispose ] ---

    /** Free the given {@code CXRewriter}. */
    public static void clang_CXRewriter_dispose(@NativeType("CXRewriter") long Rew) {
        long __functionAddress = Functions.dispose;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        invokePV(Rew, __functionAddress);
    }

}