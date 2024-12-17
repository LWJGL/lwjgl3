/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ClangDocumentation {

    static { LibLLVM.initialize(); }

    /** Contains the function pointers loaded from {@code ClangIndex.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            Cursor_getParsedComment                   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_Cursor_getParsedComment"),
            Comment_getKind                           = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_Comment_getKind"),
            Comment_getNumChildren                    = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_Comment_getNumChildren"),
            Comment_getChild                          = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_Comment_getChild"),
            Comment_isWhitespace                      = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_Comment_isWhitespace"),
            InlineContentComment_hasTrailingNewline   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_InlineContentComment_hasTrailingNewline"),
            TextComment_getText                       = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_TextComment_getText"),
            InlineCommandComment_getCommandName       = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_InlineCommandComment_getCommandName"),
            InlineCommandComment_getRenderKind        = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_InlineCommandComment_getRenderKind"),
            InlineCommandComment_getNumArgs           = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_InlineCommandComment_getNumArgs"),
            InlineCommandComment_getArgText           = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_InlineCommandComment_getArgText"),
            HTMLTagComment_getTagName                 = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_HTMLTagComment_getTagName"),
            HTMLStartTagComment_isSelfClosing         = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_HTMLStartTagComment_isSelfClosing"),
            HTMLStartTag_getNumAttrs                  = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_HTMLStartTag_getNumAttrs"),
            HTMLStartTag_getAttrName                  = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_HTMLStartTag_getAttrName"),
            HTMLStartTag_getAttrValue                 = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_HTMLStartTag_getAttrValue"),
            BlockCommandComment_getCommandName        = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_BlockCommandComment_getCommandName"),
            BlockCommandComment_getNumArgs            = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_BlockCommandComment_getNumArgs"),
            BlockCommandComment_getArgText            = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_BlockCommandComment_getArgText"),
            BlockCommandComment_getParagraph          = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_BlockCommandComment_getParagraph"),
            ParamCommandComment_getParamName          = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ParamCommandComment_getParamName"),
            ParamCommandComment_isParamIndexValid     = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ParamCommandComment_isParamIndexValid"),
            ParamCommandComment_getParamIndex         = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ParamCommandComment_getParamIndex"),
            ParamCommandComment_isDirectionExplicit   = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ParamCommandComment_isDirectionExplicit"),
            ParamCommandComment_getDirection          = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_ParamCommandComment_getDirection"),
            TParamCommandComment_getParamName         = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_TParamCommandComment_getParamName"),
            TParamCommandComment_isParamPositionValid = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_TParamCommandComment_isParamPositionValid"),
            TParamCommandComment_getDepth             = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_TParamCommandComment_getDepth"),
            TParamCommandComment_getIndex             = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_TParamCommandComment_getIndex"),
            VerbatimBlockLineComment_getText          = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_VerbatimBlockLineComment_getText"),
            VerbatimLineComment_getText               = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_VerbatimLineComment_getText"),
            HTMLTagComment_getAsString                = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_HTMLTagComment_getAsString"),
            FullComment_getAsHTML                     = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_FullComment_getAsHTML"),
            FullComment_getAsXML                      = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_FullComment_getAsXML"),
            createAPISet                              = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_createAPISet"),
            disposeAPISet                             = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_disposeAPISet"),
            getSymbolGraphForUSR                      = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_getSymbolGraphForUSR"),
            getSymbolGraphForCursor                   = apiGetFunctionAddressOptional(ClangIndex.getLibrary(), "clang_getSymbolGraphForCursor");

    }

    public static final int
        CXComment_Null                 = 0,
        CXComment_Text                 = 1,
        CXComment_InlineCommand        = 2,
        CXComment_HTMLStartTag         = 3,
        CXComment_HTMLEndTag           = 4,
        CXComment_Paragraph            = 5,
        CXComment_BlockCommand         = 6,
        CXComment_ParamCommand         = 7,
        CXComment_TParamCommand        = 8,
        CXComment_VerbatimBlockCommand = 9,
        CXComment_VerbatimBlockLine    = 10,
        CXComment_VerbatimLine         = 11,
        CXComment_FullComment          = 12;

    public static final int
        CXCommentInlineCommandRenderKind_Normal     = 0,
        CXCommentInlineCommandRenderKind_Bold       = 1,
        CXCommentInlineCommandRenderKind_Monospaced = 2,
        CXCommentInlineCommandRenderKind_Emphasized = 3,
        CXCommentInlineCommandRenderKind_Anchor     = 4;

    public static final int
        CXCommentParamPassDirection_In    = 0,
        CXCommentParamPassDirection_Out   = 1,
        CXCommentParamPassDirection_InOut = 2;

    protected ClangDocumentation() {
        throw new UnsupportedOperationException();
    }

    // --- [ clang_Cursor_getParsedComment ] ---

    /** {@code CXComment clang_Cursor_getParsedComment(CXCursor C)} */
    public static native void nclang_Cursor_getParsedComment(long C, long __functionAddress, long __result);

    /** {@code CXComment clang_Cursor_getParsedComment(CXCursor C)} */
    public static void nclang_Cursor_getParsedComment(long C, long __result) {
        long __functionAddress = Functions.Cursor_getParsedComment;
        nclang_Cursor_getParsedComment(C, __functionAddress, __result);
    }

    /** {@code CXComment clang_Cursor_getParsedComment(CXCursor C)} */
    public static CXComment clang_Cursor_getParsedComment(CXCursor C, CXComment __result) {
        nclang_Cursor_getParsedComment(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Comment_getKind ] ---

    /** {@code enum CXCommentKind clang_Comment_getKind(CXComment Comment)} */
    public static native int nclang_Comment_getKind(long Comment, long __functionAddress);

    /** {@code enum CXCommentKind clang_Comment_getKind(CXComment Comment)} */
    public static int nclang_Comment_getKind(long Comment) {
        long __functionAddress = Functions.Comment_getKind;
        return nclang_Comment_getKind(Comment, __functionAddress);
    }

    /** {@code enum CXCommentKind clang_Comment_getKind(CXComment Comment)} */
    @NativeType("enum CXCommentKind")
    public static int clang_Comment_getKind(CXComment Comment) {
        return nclang_Comment_getKind(Comment.address());
    }

    // --- [ clang_Comment_getNumChildren ] ---

    /** {@code unsigned clang_Comment_getNumChildren(CXComment Comment)} */
    public static native int nclang_Comment_getNumChildren(long Comment, long __functionAddress);

    /** {@code unsigned clang_Comment_getNumChildren(CXComment Comment)} */
    public static int nclang_Comment_getNumChildren(long Comment) {
        long __functionAddress = Functions.Comment_getNumChildren;
        return nclang_Comment_getNumChildren(Comment, __functionAddress);
    }

    /** {@code unsigned clang_Comment_getNumChildren(CXComment Comment)} */
    @NativeType("unsigned")
    public static int clang_Comment_getNumChildren(CXComment Comment) {
        return nclang_Comment_getNumChildren(Comment.address());
    }

    // --- [ clang_Comment_getChild ] ---

    /** {@code CXComment clang_Comment_getChild(CXComment Comment, unsigned ChildIdx)} */
    public static native void nclang_Comment_getChild(long Comment, int ChildIdx, long __functionAddress, long __result);

    /** {@code CXComment clang_Comment_getChild(CXComment Comment, unsigned ChildIdx)} */
    public static void nclang_Comment_getChild(long Comment, int ChildIdx, long __result) {
        long __functionAddress = Functions.Comment_getChild;
        nclang_Comment_getChild(Comment, ChildIdx, __functionAddress, __result);
    }

    /** {@code CXComment clang_Comment_getChild(CXComment Comment, unsigned ChildIdx)} */
    public static CXComment clang_Comment_getChild(CXComment Comment, @NativeType("unsigned") int ChildIdx, CXComment __result) {
        nclang_Comment_getChild(Comment.address(), ChildIdx, __result.address());
        return __result;
    }

    // --- [ clang_Comment_isWhitespace ] ---

    /** {@code unsigned clang_Comment_isWhitespace(CXComment Comment)} */
    public static native int nclang_Comment_isWhitespace(long Comment, long __functionAddress);

    /** {@code unsigned clang_Comment_isWhitespace(CXComment Comment)} */
    public static int nclang_Comment_isWhitespace(long Comment) {
        long __functionAddress = Functions.Comment_isWhitespace;
        return nclang_Comment_isWhitespace(Comment, __functionAddress);
    }

    /** {@code unsigned clang_Comment_isWhitespace(CXComment Comment)} */
    @NativeType("unsigned")
    public static boolean clang_Comment_isWhitespace(CXComment Comment) {
        return nclang_Comment_isWhitespace(Comment.address()) != 0;
    }

    // --- [ clang_InlineContentComment_hasTrailingNewline ] ---

    /** {@code unsigned clang_InlineContentComment_hasTrailingNewline(CXComment Comment)} */
    public static native int nclang_InlineContentComment_hasTrailingNewline(long Comment, long __functionAddress);

    /** {@code unsigned clang_InlineContentComment_hasTrailingNewline(CXComment Comment)} */
    public static int nclang_InlineContentComment_hasTrailingNewline(long Comment) {
        long __functionAddress = Functions.InlineContentComment_hasTrailingNewline;
        return nclang_InlineContentComment_hasTrailingNewline(Comment, __functionAddress);
    }

    /** {@code unsigned clang_InlineContentComment_hasTrailingNewline(CXComment Comment)} */
    @NativeType("unsigned")
    public static boolean clang_InlineContentComment_hasTrailingNewline(CXComment Comment) {
        return nclang_InlineContentComment_hasTrailingNewline(Comment.address()) != 0;
    }

    // --- [ clang_TextComment_getText ] ---

    /** {@code CXString clang_TextComment_getText(CXComment Comment)} */
    public static native void nclang_TextComment_getText(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_TextComment_getText(CXComment Comment)} */
    public static void nclang_TextComment_getText(long Comment, long __result) {
        long __functionAddress = Functions.TextComment_getText;
        nclang_TextComment_getText(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_TextComment_getText(CXComment Comment)} */
    public static CXString clang_TextComment_getText(CXComment Comment, CXString __result) {
        nclang_TextComment_getText(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_InlineCommandComment_getCommandName ] ---

    /** {@code CXString clang_InlineCommandComment_getCommandName(CXComment Comment)} */
    public static native void nclang_InlineCommandComment_getCommandName(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_InlineCommandComment_getCommandName(CXComment Comment)} */
    public static void nclang_InlineCommandComment_getCommandName(long Comment, long __result) {
        long __functionAddress = Functions.InlineCommandComment_getCommandName;
        nclang_InlineCommandComment_getCommandName(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_InlineCommandComment_getCommandName(CXComment Comment)} */
    public static CXString clang_InlineCommandComment_getCommandName(CXComment Comment, CXString __result) {
        nclang_InlineCommandComment_getCommandName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_InlineCommandComment_getRenderKind ] ---

    /** {@code enum CXCommentInlineCommandRenderKind clang_InlineCommandComment_getRenderKind(CXComment Comment)} */
    public static native int nclang_InlineCommandComment_getRenderKind(long Comment, long __functionAddress);

    /** {@code enum CXCommentInlineCommandRenderKind clang_InlineCommandComment_getRenderKind(CXComment Comment)} */
    public static int nclang_InlineCommandComment_getRenderKind(long Comment) {
        long __functionAddress = Functions.InlineCommandComment_getRenderKind;
        return nclang_InlineCommandComment_getRenderKind(Comment, __functionAddress);
    }

    /** {@code enum CXCommentInlineCommandRenderKind clang_InlineCommandComment_getRenderKind(CXComment Comment)} */
    @NativeType("enum CXCommentInlineCommandRenderKind")
    public static int clang_InlineCommandComment_getRenderKind(CXComment Comment) {
        return nclang_InlineCommandComment_getRenderKind(Comment.address());
    }

    // --- [ clang_InlineCommandComment_getNumArgs ] ---

    /** {@code unsigned clang_InlineCommandComment_getNumArgs(CXComment Comment)} */
    public static native int nclang_InlineCommandComment_getNumArgs(long Comment, long __functionAddress);

    /** {@code unsigned clang_InlineCommandComment_getNumArgs(CXComment Comment)} */
    public static int nclang_InlineCommandComment_getNumArgs(long Comment) {
        long __functionAddress = Functions.InlineCommandComment_getNumArgs;
        return nclang_InlineCommandComment_getNumArgs(Comment, __functionAddress);
    }

    /** {@code unsigned clang_InlineCommandComment_getNumArgs(CXComment Comment)} */
    @NativeType("unsigned")
    public static int clang_InlineCommandComment_getNumArgs(CXComment Comment) {
        return nclang_InlineCommandComment_getNumArgs(Comment.address());
    }

    // --- [ clang_InlineCommandComment_getArgText ] ---

    /** {@code CXString clang_InlineCommandComment_getArgText(CXComment Comment, unsigned ArgIdx)} */
    public static native void nclang_InlineCommandComment_getArgText(long Comment, int ArgIdx, long __functionAddress, long __result);

    /** {@code CXString clang_InlineCommandComment_getArgText(CXComment Comment, unsigned ArgIdx)} */
    public static void nclang_InlineCommandComment_getArgText(long Comment, int ArgIdx, long __result) {
        long __functionAddress = Functions.InlineCommandComment_getArgText;
        nclang_InlineCommandComment_getArgText(Comment, ArgIdx, __functionAddress, __result);
    }

    /** {@code CXString clang_InlineCommandComment_getArgText(CXComment Comment, unsigned ArgIdx)} */
    public static CXString clang_InlineCommandComment_getArgText(CXComment Comment, @NativeType("unsigned") int ArgIdx, CXString __result) {
        nclang_InlineCommandComment_getArgText(Comment.address(), ArgIdx, __result.address());
        return __result;
    }

    // --- [ clang_HTMLTagComment_getTagName ] ---

    /** {@code CXString clang_HTMLTagComment_getTagName(CXComment Comment)} */
    public static native void nclang_HTMLTagComment_getTagName(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_HTMLTagComment_getTagName(CXComment Comment)} */
    public static void nclang_HTMLTagComment_getTagName(long Comment, long __result) {
        long __functionAddress = Functions.HTMLTagComment_getTagName;
        nclang_HTMLTagComment_getTagName(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_HTMLTagComment_getTagName(CXComment Comment)} */
    public static CXString clang_HTMLTagComment_getTagName(CXComment Comment, CXString __result) {
        nclang_HTMLTagComment_getTagName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_HTMLStartTagComment_isSelfClosing ] ---

    /** {@code unsigned clang_HTMLStartTagComment_isSelfClosing(CXComment Comment)} */
    public static native int nclang_HTMLStartTagComment_isSelfClosing(long Comment, long __functionAddress);

    /** {@code unsigned clang_HTMLStartTagComment_isSelfClosing(CXComment Comment)} */
    public static int nclang_HTMLStartTagComment_isSelfClosing(long Comment) {
        long __functionAddress = Functions.HTMLStartTagComment_isSelfClosing;
        return nclang_HTMLStartTagComment_isSelfClosing(Comment, __functionAddress);
    }

    /** {@code unsigned clang_HTMLStartTagComment_isSelfClosing(CXComment Comment)} */
    @NativeType("unsigned")
    public static boolean clang_HTMLStartTagComment_isSelfClosing(CXComment Comment) {
        return nclang_HTMLStartTagComment_isSelfClosing(Comment.address()) != 0;
    }

    // --- [ clang_HTMLStartTag_getNumAttrs ] ---

    /** {@code unsigned clang_HTMLStartTag_getNumAttrs(CXComment Comment)} */
    public static native int nclang_HTMLStartTag_getNumAttrs(long Comment, long __functionAddress);

    /** {@code unsigned clang_HTMLStartTag_getNumAttrs(CXComment Comment)} */
    public static int nclang_HTMLStartTag_getNumAttrs(long Comment) {
        long __functionAddress = Functions.HTMLStartTag_getNumAttrs;
        return nclang_HTMLStartTag_getNumAttrs(Comment, __functionAddress);
    }

    /** {@code unsigned clang_HTMLStartTag_getNumAttrs(CXComment Comment)} */
    @NativeType("unsigned")
    public static int clang_HTMLStartTag_getNumAttrs(CXComment Comment) {
        return nclang_HTMLStartTag_getNumAttrs(Comment.address());
    }

    // --- [ clang_HTMLStartTag_getAttrName ] ---

    /** {@code CXString clang_HTMLStartTag_getAttrName(CXComment Comment, unsigned AttrIdx)} */
    public static native void nclang_HTMLStartTag_getAttrName(long Comment, int AttrIdx, long __functionAddress, long __result);

    /** {@code CXString clang_HTMLStartTag_getAttrName(CXComment Comment, unsigned AttrIdx)} */
    public static void nclang_HTMLStartTag_getAttrName(long Comment, int AttrIdx, long __result) {
        long __functionAddress = Functions.HTMLStartTag_getAttrName;
        nclang_HTMLStartTag_getAttrName(Comment, AttrIdx, __functionAddress, __result);
    }

    /** {@code CXString clang_HTMLStartTag_getAttrName(CXComment Comment, unsigned AttrIdx)} */
    public static CXString clang_HTMLStartTag_getAttrName(CXComment Comment, @NativeType("unsigned") int AttrIdx, CXString __result) {
        nclang_HTMLStartTag_getAttrName(Comment.address(), AttrIdx, __result.address());
        return __result;
    }

    // --- [ clang_HTMLStartTag_getAttrValue ] ---

    /** {@code CXString clang_HTMLStartTag_getAttrValue(CXComment Comment, unsigned AttrIdx)} */
    public static native void nclang_HTMLStartTag_getAttrValue(long Comment, int AttrIdx, long __functionAddress, long __result);

    /** {@code CXString clang_HTMLStartTag_getAttrValue(CXComment Comment, unsigned AttrIdx)} */
    public static void nclang_HTMLStartTag_getAttrValue(long Comment, int AttrIdx, long __result) {
        long __functionAddress = Functions.HTMLStartTag_getAttrValue;
        nclang_HTMLStartTag_getAttrValue(Comment, AttrIdx, __functionAddress, __result);
    }

    /** {@code CXString clang_HTMLStartTag_getAttrValue(CXComment Comment, unsigned AttrIdx)} */
    public static CXString clang_HTMLStartTag_getAttrValue(CXComment Comment, @NativeType("unsigned") int AttrIdx, CXString __result) {
        nclang_HTMLStartTag_getAttrValue(Comment.address(), AttrIdx, __result.address());
        return __result;
    }

    // --- [ clang_BlockCommandComment_getCommandName ] ---

    /** {@code CXString clang_BlockCommandComment_getCommandName(CXComment Comment)} */
    public static native void nclang_BlockCommandComment_getCommandName(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_BlockCommandComment_getCommandName(CXComment Comment)} */
    public static void nclang_BlockCommandComment_getCommandName(long Comment, long __result) {
        long __functionAddress = Functions.BlockCommandComment_getCommandName;
        nclang_BlockCommandComment_getCommandName(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_BlockCommandComment_getCommandName(CXComment Comment)} */
    public static CXString clang_BlockCommandComment_getCommandName(CXComment Comment, CXString __result) {
        nclang_BlockCommandComment_getCommandName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_BlockCommandComment_getNumArgs ] ---

    /** {@code unsigned clang_BlockCommandComment_getNumArgs(CXComment Comment)} */
    public static native int nclang_BlockCommandComment_getNumArgs(long Comment, long __functionAddress);

    /** {@code unsigned clang_BlockCommandComment_getNumArgs(CXComment Comment)} */
    public static int nclang_BlockCommandComment_getNumArgs(long Comment) {
        long __functionAddress = Functions.BlockCommandComment_getNumArgs;
        return nclang_BlockCommandComment_getNumArgs(Comment, __functionAddress);
    }

    /** {@code unsigned clang_BlockCommandComment_getNumArgs(CXComment Comment)} */
    @NativeType("unsigned")
    public static int clang_BlockCommandComment_getNumArgs(CXComment Comment) {
        return nclang_BlockCommandComment_getNumArgs(Comment.address());
    }

    // --- [ clang_BlockCommandComment_getArgText ] ---

    /** {@code CXString clang_BlockCommandComment_getArgText(CXComment Comment, unsigned ArgIdx)} */
    public static native void nclang_BlockCommandComment_getArgText(long Comment, int ArgIdx, long __functionAddress, long __result);

    /** {@code CXString clang_BlockCommandComment_getArgText(CXComment Comment, unsigned ArgIdx)} */
    public static void nclang_BlockCommandComment_getArgText(long Comment, int ArgIdx, long __result) {
        long __functionAddress = Functions.BlockCommandComment_getArgText;
        nclang_BlockCommandComment_getArgText(Comment, ArgIdx, __functionAddress, __result);
    }

    /** {@code CXString clang_BlockCommandComment_getArgText(CXComment Comment, unsigned ArgIdx)} */
    public static CXString clang_BlockCommandComment_getArgText(CXComment Comment, @NativeType("unsigned") int ArgIdx, CXString __result) {
        nclang_BlockCommandComment_getArgText(Comment.address(), ArgIdx, __result.address());
        return __result;
    }

    // --- [ clang_BlockCommandComment_getParagraph ] ---

    /** {@code CXComment clang_BlockCommandComment_getParagraph(CXComment Comment)} */
    public static native void nclang_BlockCommandComment_getParagraph(long Comment, long __functionAddress, long __result);

    /** {@code CXComment clang_BlockCommandComment_getParagraph(CXComment Comment)} */
    public static void nclang_BlockCommandComment_getParagraph(long Comment, long __result) {
        long __functionAddress = Functions.BlockCommandComment_getParagraph;
        nclang_BlockCommandComment_getParagraph(Comment, __functionAddress, __result);
    }

    /** {@code CXComment clang_BlockCommandComment_getParagraph(CXComment Comment)} */
    public static CXComment clang_BlockCommandComment_getParagraph(CXComment Comment, CXComment __result) {
        nclang_BlockCommandComment_getParagraph(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_ParamCommandComment_getParamName ] ---

    /** {@code CXString clang_ParamCommandComment_getParamName(CXComment Comment)} */
    public static native void nclang_ParamCommandComment_getParamName(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_ParamCommandComment_getParamName(CXComment Comment)} */
    public static void nclang_ParamCommandComment_getParamName(long Comment, long __result) {
        long __functionAddress = Functions.ParamCommandComment_getParamName;
        nclang_ParamCommandComment_getParamName(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_ParamCommandComment_getParamName(CXComment Comment)} */
    public static CXString clang_ParamCommandComment_getParamName(CXComment Comment, CXString __result) {
        nclang_ParamCommandComment_getParamName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_ParamCommandComment_isParamIndexValid ] ---

    /** {@code unsigned clang_ParamCommandComment_isParamIndexValid(CXComment Comment)} */
    public static native int nclang_ParamCommandComment_isParamIndexValid(long Comment, long __functionAddress);

    /** {@code unsigned clang_ParamCommandComment_isParamIndexValid(CXComment Comment)} */
    public static int nclang_ParamCommandComment_isParamIndexValid(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_isParamIndexValid;
        return nclang_ParamCommandComment_isParamIndexValid(Comment, __functionAddress);
    }

    /** {@code unsigned clang_ParamCommandComment_isParamIndexValid(CXComment Comment)} */
    @NativeType("unsigned")
    public static boolean clang_ParamCommandComment_isParamIndexValid(CXComment Comment) {
        return nclang_ParamCommandComment_isParamIndexValid(Comment.address()) != 0;
    }

    // --- [ clang_ParamCommandComment_getParamIndex ] ---

    /** {@code unsigned clang_ParamCommandComment_getParamIndex(CXComment Comment)} */
    public static native int nclang_ParamCommandComment_getParamIndex(long Comment, long __functionAddress);

    /** {@code unsigned clang_ParamCommandComment_getParamIndex(CXComment Comment)} */
    public static int nclang_ParamCommandComment_getParamIndex(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_getParamIndex;
        return nclang_ParamCommandComment_getParamIndex(Comment, __functionAddress);
    }

    /** {@code unsigned clang_ParamCommandComment_getParamIndex(CXComment Comment)} */
    @NativeType("unsigned")
    public static int clang_ParamCommandComment_getParamIndex(CXComment Comment) {
        return nclang_ParamCommandComment_getParamIndex(Comment.address());
    }

    // --- [ clang_ParamCommandComment_isDirectionExplicit ] ---

    /** {@code unsigned clang_ParamCommandComment_isDirectionExplicit(CXComment Comment)} */
    public static native int nclang_ParamCommandComment_isDirectionExplicit(long Comment, long __functionAddress);

    /** {@code unsigned clang_ParamCommandComment_isDirectionExplicit(CXComment Comment)} */
    public static int nclang_ParamCommandComment_isDirectionExplicit(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_isDirectionExplicit;
        return nclang_ParamCommandComment_isDirectionExplicit(Comment, __functionAddress);
    }

    /** {@code unsigned clang_ParamCommandComment_isDirectionExplicit(CXComment Comment)} */
    @NativeType("unsigned")
    public static boolean clang_ParamCommandComment_isDirectionExplicit(CXComment Comment) {
        return nclang_ParamCommandComment_isDirectionExplicit(Comment.address()) != 0;
    }

    // --- [ clang_ParamCommandComment_getDirection ] ---

    /** {@code enum CXCommentParamPassDirection clang_ParamCommandComment_getDirection(CXComment Comment)} */
    public static native int nclang_ParamCommandComment_getDirection(long Comment, long __functionAddress);

    /** {@code enum CXCommentParamPassDirection clang_ParamCommandComment_getDirection(CXComment Comment)} */
    public static int nclang_ParamCommandComment_getDirection(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_getDirection;
        return nclang_ParamCommandComment_getDirection(Comment, __functionAddress);
    }

    /** {@code enum CXCommentParamPassDirection clang_ParamCommandComment_getDirection(CXComment Comment)} */
    @NativeType("enum CXCommentParamPassDirection")
    public static int clang_ParamCommandComment_getDirection(CXComment Comment) {
        return nclang_ParamCommandComment_getDirection(Comment.address());
    }

    // --- [ clang_TParamCommandComment_getParamName ] ---

    /** {@code CXString clang_TParamCommandComment_getParamName(CXComment Comment)} */
    public static native void nclang_TParamCommandComment_getParamName(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_TParamCommandComment_getParamName(CXComment Comment)} */
    public static void nclang_TParamCommandComment_getParamName(long Comment, long __result) {
        long __functionAddress = Functions.TParamCommandComment_getParamName;
        nclang_TParamCommandComment_getParamName(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_TParamCommandComment_getParamName(CXComment Comment)} */
    public static CXString clang_TParamCommandComment_getParamName(CXComment Comment, CXString __result) {
        nclang_TParamCommandComment_getParamName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_TParamCommandComment_isParamPositionValid ] ---

    /** {@code unsigned clang_TParamCommandComment_isParamPositionValid(CXComment Comment)} */
    public static native int nclang_TParamCommandComment_isParamPositionValid(long Comment, long __functionAddress);

    /** {@code unsigned clang_TParamCommandComment_isParamPositionValid(CXComment Comment)} */
    public static int nclang_TParamCommandComment_isParamPositionValid(long Comment) {
        long __functionAddress = Functions.TParamCommandComment_isParamPositionValid;
        return nclang_TParamCommandComment_isParamPositionValid(Comment, __functionAddress);
    }

    /** {@code unsigned clang_TParamCommandComment_isParamPositionValid(CXComment Comment)} */
    @NativeType("unsigned")
    public static boolean clang_TParamCommandComment_isParamPositionValid(CXComment Comment) {
        return nclang_TParamCommandComment_isParamPositionValid(Comment.address()) != 0;
    }

    // --- [ clang_TParamCommandComment_getDepth ] ---

    /** {@code unsigned clang_TParamCommandComment_getDepth(CXComment Comment)} */
    public static native int nclang_TParamCommandComment_getDepth(long Comment, long __functionAddress);

    /** {@code unsigned clang_TParamCommandComment_getDepth(CXComment Comment)} */
    public static int nclang_TParamCommandComment_getDepth(long Comment) {
        long __functionAddress = Functions.TParamCommandComment_getDepth;
        return nclang_TParamCommandComment_getDepth(Comment, __functionAddress);
    }

    /** {@code unsigned clang_TParamCommandComment_getDepth(CXComment Comment)} */
    @NativeType("unsigned")
    public static int clang_TParamCommandComment_getDepth(CXComment Comment) {
        return nclang_TParamCommandComment_getDepth(Comment.address());
    }

    // --- [ clang_TParamCommandComment_getIndex ] ---

    /** {@code unsigned clang_TParamCommandComment_getIndex(CXComment Comment, unsigned Depth)} */
    public static native int nclang_TParamCommandComment_getIndex(long Comment, int Depth, long __functionAddress);

    /** {@code unsigned clang_TParamCommandComment_getIndex(CXComment Comment, unsigned Depth)} */
    public static int nclang_TParamCommandComment_getIndex(long Comment, int Depth) {
        long __functionAddress = Functions.TParamCommandComment_getIndex;
        return nclang_TParamCommandComment_getIndex(Comment, Depth, __functionAddress);
    }

    /** {@code unsigned clang_TParamCommandComment_getIndex(CXComment Comment, unsigned Depth)} */
    @NativeType("unsigned")
    public static int clang_TParamCommandComment_getIndex(CXComment Comment, @NativeType("unsigned") int Depth) {
        return nclang_TParamCommandComment_getIndex(Comment.address(), Depth);
    }

    // --- [ clang_VerbatimBlockLineComment_getText ] ---

    /** {@code CXString clang_VerbatimBlockLineComment_getText(CXComment Comment)} */
    public static native void nclang_VerbatimBlockLineComment_getText(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_VerbatimBlockLineComment_getText(CXComment Comment)} */
    public static void nclang_VerbatimBlockLineComment_getText(long Comment, long __result) {
        long __functionAddress = Functions.VerbatimBlockLineComment_getText;
        nclang_VerbatimBlockLineComment_getText(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_VerbatimBlockLineComment_getText(CXComment Comment)} */
    public static CXString clang_VerbatimBlockLineComment_getText(CXComment Comment, CXString __result) {
        nclang_VerbatimBlockLineComment_getText(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_VerbatimLineComment_getText ] ---

    /** {@code CXString clang_VerbatimLineComment_getText(CXComment Comment)} */
    public static native void nclang_VerbatimLineComment_getText(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_VerbatimLineComment_getText(CXComment Comment)} */
    public static void nclang_VerbatimLineComment_getText(long Comment, long __result) {
        long __functionAddress = Functions.VerbatimLineComment_getText;
        nclang_VerbatimLineComment_getText(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_VerbatimLineComment_getText(CXComment Comment)} */
    public static CXString clang_VerbatimLineComment_getText(CXComment Comment, CXString __result) {
        nclang_VerbatimLineComment_getText(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_HTMLTagComment_getAsString ] ---

    /** {@code CXString clang_HTMLTagComment_getAsString(CXComment Comment)} */
    public static native void nclang_HTMLTagComment_getAsString(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_HTMLTagComment_getAsString(CXComment Comment)} */
    public static void nclang_HTMLTagComment_getAsString(long Comment, long __result) {
        long __functionAddress = Functions.HTMLTagComment_getAsString;
        nclang_HTMLTagComment_getAsString(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_HTMLTagComment_getAsString(CXComment Comment)} */
    public static CXString clang_HTMLTagComment_getAsString(CXComment Comment, CXString __result) {
        nclang_HTMLTagComment_getAsString(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_FullComment_getAsHTML ] ---

    /** {@code CXString clang_FullComment_getAsHTML(CXComment Comment)} */
    public static native void nclang_FullComment_getAsHTML(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_FullComment_getAsHTML(CXComment Comment)} */
    public static void nclang_FullComment_getAsHTML(long Comment, long __result) {
        long __functionAddress = Functions.FullComment_getAsHTML;
        nclang_FullComment_getAsHTML(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_FullComment_getAsHTML(CXComment Comment)} */
    public static CXString clang_FullComment_getAsHTML(CXComment Comment, CXString __result) {
        nclang_FullComment_getAsHTML(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_FullComment_getAsXML ] ---

    /** {@code CXString clang_FullComment_getAsXML(CXComment Comment)} */
    public static native void nclang_FullComment_getAsXML(long Comment, long __functionAddress, long __result);

    /** {@code CXString clang_FullComment_getAsXML(CXComment Comment)} */
    public static void nclang_FullComment_getAsXML(long Comment, long __result) {
        long __functionAddress = Functions.FullComment_getAsXML;
        nclang_FullComment_getAsXML(Comment, __functionAddress, __result);
    }

    /** {@code CXString clang_FullComment_getAsXML(CXComment Comment)} */
    public static CXString clang_FullComment_getAsXML(CXComment Comment, CXString __result) {
        nclang_FullComment_getAsXML(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_createAPISet ] ---

    /** {@code enum CXErrorCode clang_createAPISet(CXTranslationUnit tu, CXAPISet * out_api)} */
    public static int nclang_createAPISet(long tu, long out_api) {
        long __functionAddress = Functions.createAPISet;
        if (CHECKS) {
            check(__functionAddress);
            check(tu);
        }
        return invokePPI(tu, out_api, __functionAddress);
    }

    /** {@code enum CXErrorCode clang_createAPISet(CXTranslationUnit tu, CXAPISet * out_api)} */
    @NativeType("enum CXErrorCode")
    public static int clang_createAPISet(@NativeType("CXTranslationUnit") long tu, @NativeType("CXAPISet *") PointerBuffer out_api) {
        if (CHECKS) {
            check(out_api, 1);
        }
        return nclang_createAPISet(tu, memAddress(out_api));
    }

    // --- [ clang_disposeAPISet ] ---

    /** {@code void clang_disposeAPISet(CXAPISet api)} */
    public static void clang_disposeAPISet(@NativeType("CXAPISet") long api) {
        long __functionAddress = Functions.disposeAPISet;
        if (CHECKS) {
            check(__functionAddress);
            check(api);
        }
        invokePV(api, __functionAddress);
    }

    // --- [ clang_getSymbolGraphForUSR ] ---

    /** {@code CXString clang_getSymbolGraphForUSR(char const * usr, CXAPISet api)} */
    public static native void nclang_getSymbolGraphForUSR(long usr, long api, long __functionAddress, long __result);

    /** {@code CXString clang_getSymbolGraphForUSR(char const * usr, CXAPISet api)} */
    public static void nclang_getSymbolGraphForUSR(long usr, long api, long __result) {
        long __functionAddress = Functions.getSymbolGraphForUSR;
        if (CHECKS) {
            check(__functionAddress);
            check(api);
        }
        nclang_getSymbolGraphForUSR(usr, api, __functionAddress, __result);
    }

    /** {@code CXString clang_getSymbolGraphForUSR(char const * usr, CXAPISet api)} */
    public static CXString clang_getSymbolGraphForUSR(@NativeType("char const *") ByteBuffer usr, @NativeType("CXAPISet") long api, CXString __result) {
        if (CHECKS) {
            checkNT1(usr);
        }
        nclang_getSymbolGraphForUSR(memAddress(usr), api, __result.address());
        return __result;
    }

    /** {@code CXString clang_getSymbolGraphForUSR(char const * usr, CXAPISet api)} */
    public static CXString clang_getSymbolGraphForUSR(@NativeType("char const *") CharSequence usr, @NativeType("CXAPISet") long api, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(usr, true);
            long usrEncoded = stack.getPointerAddress();
            nclang_getSymbolGraphForUSR(usrEncoded, api, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getSymbolGraphForCursor ] ---

    /** {@code CXString clang_getSymbolGraphForCursor(CXCursor cursor)} */
    public static native void nclang_getSymbolGraphForCursor(long cursor, long __functionAddress, long __result);

    /** {@code CXString clang_getSymbolGraphForCursor(CXCursor cursor)} */
    public static void nclang_getSymbolGraphForCursor(long cursor, long __result) {
        long __functionAddress = Functions.getSymbolGraphForCursor;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_getSymbolGraphForCursor(cursor, __functionAddress, __result);
    }

    /** {@code CXString clang_getSymbolGraphForCursor(CXCursor cursor)} */
    public static CXString clang_getSymbolGraphForCursor(CXCursor cursor, CXString __result) {
        nclang_getSymbolGraphForCursor(cursor.address(), __result.address());
        return __result;
    }

}