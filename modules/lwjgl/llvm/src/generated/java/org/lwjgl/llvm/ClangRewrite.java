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

public class ClangRewrite {

    static { LibLLVM.initialize(); }

    /** Contains the function pointers loaded from {@code ClangIndex.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            create                = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_CXRewriter_create"),
            insertTextBefore      = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_CXRewriter_insertTextBefore"),
            replaceText           = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_CXRewriter_replaceText"),
            removeText            = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_CXRewriter_removeText"),
            overwriteChangedFiles = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_CXRewriter_overwriteChangedFiles"),
            writeMainFileToStdOut = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_CXRewriter_writeMainFileToStdOut"),
            dispose               = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_CXRewriter_dispose");

    }

    protected ClangRewrite() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_CXRewriter_create ] ---

    /** {@code CXRewriter clang_CXRewriter_create(CXTranslationUnit TU)} */
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

    /** {@code void clang_CXRewriter_insertTextBefore(CXRewriter Rew, CXSourceLocation Loc, char const * Insert)} */
    public static native void nclang_CXRewriter_insertTextBefore(long Rew, long Loc, long Insert, long __functionAddress);

    /** {@code void clang_CXRewriter_insertTextBefore(CXRewriter Rew, CXSourceLocation Loc, char const * Insert)} */
    public static void nclang_CXRewriter_insertTextBefore(long Rew, long Loc, long Insert) {
        long __functionAddress = Functions.insertTextBefore;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        nclang_CXRewriter_insertTextBefore(Rew, Loc, Insert, __functionAddress);
    }

    /** {@code void clang_CXRewriter_insertTextBefore(CXRewriter Rew, CXSourceLocation Loc, char const * Insert)} */
    public static void clang_CXRewriter_insertTextBefore(@NativeType("CXRewriter") long Rew, CXSourceLocation Loc, @NativeType("char const *") ByteBuffer Insert) {
        if (CHECKS) {
            checkNT1(Insert);
        }
        nclang_CXRewriter_insertTextBefore(Rew, Loc.address(), memAddress(Insert));
    }

    /** {@code void clang_CXRewriter_insertTextBefore(CXRewriter Rew, CXSourceLocation Loc, char const * Insert)} */
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

    /** {@code void clang_CXRewriter_replaceText(CXRewriter Rew, CXSourceRange ToBeReplaced, char const * Replacement)} */
    public static native void nclang_CXRewriter_replaceText(long Rew, long ToBeReplaced, long Replacement, long __functionAddress);

    /** {@code void clang_CXRewriter_replaceText(CXRewriter Rew, CXSourceRange ToBeReplaced, char const * Replacement)} */
    public static void nclang_CXRewriter_replaceText(long Rew, long ToBeReplaced, long Replacement) {
        long __functionAddress = Functions.replaceText;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        nclang_CXRewriter_replaceText(Rew, ToBeReplaced, Replacement, __functionAddress);
    }

    /** {@code void clang_CXRewriter_replaceText(CXRewriter Rew, CXSourceRange ToBeReplaced, char const * Replacement)} */
    public static void clang_CXRewriter_replaceText(@NativeType("CXRewriter") long Rew, CXSourceRange ToBeReplaced, @NativeType("char const *") ByteBuffer Replacement) {
        if (CHECKS) {
            checkNT1(Replacement);
        }
        nclang_CXRewriter_replaceText(Rew, ToBeReplaced.address(), memAddress(Replacement));
    }

    /** {@code void clang_CXRewriter_replaceText(CXRewriter Rew, CXSourceRange ToBeReplaced, char const * Replacement)} */
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

    /** {@code void clang_CXRewriter_removeText(CXRewriter Rew, CXSourceRange ToBeRemoved)} */
    public static native void nclang_CXRewriter_removeText(long Rew, long ToBeRemoved, long __functionAddress);

    /** {@code void clang_CXRewriter_removeText(CXRewriter Rew, CXSourceRange ToBeRemoved)} */
    public static void nclang_CXRewriter_removeText(long Rew, long ToBeRemoved) {
        long __functionAddress = Functions.removeText;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        nclang_CXRewriter_removeText(Rew, ToBeRemoved, __functionAddress);
    }

    /** {@code void clang_CXRewriter_removeText(CXRewriter Rew, CXSourceRange ToBeRemoved)} */
    public static void clang_CXRewriter_removeText(@NativeType("CXRewriter") long Rew, CXSourceRange ToBeRemoved) {
        nclang_CXRewriter_removeText(Rew, ToBeRemoved.address());
    }

    // --- [ clang_CXRewriter_overwriteChangedFiles ] ---

    /** {@code int clang_CXRewriter_overwriteChangedFiles(CXRewriter Rew)} */
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

    /** {@code void clang_CXRewriter_writeMainFileToStdOut(CXRewriter Rew)} */
    public static void clang_CXRewriter_writeMainFileToStdOut(@NativeType("CXRewriter") long Rew) {
        long __functionAddress = Functions.writeMainFileToStdOut;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        invokePV(Rew, __functionAddress);
    }

    // --- [ clang_CXRewriter_dispose ] ---

    /** {@code void clang_CXRewriter_dispose(CXRewriter Rew)} */
    public static void clang_CXRewriter_dispose(@NativeType("CXRewriter") long Rew) {
        long __functionAddress = Functions.dispose;
        if (CHECKS) {
            check(__functionAddress);
            check(Rew);
        }
        invokePV(Rew, __functionAddress);
    }

}