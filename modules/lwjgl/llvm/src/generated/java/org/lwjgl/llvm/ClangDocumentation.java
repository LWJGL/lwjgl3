/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;

public class ClangDocumentation {

    /**
     * Describes the type of the comment AST node ( {@code CXComment}). A comment node can be considered block content (e. g., paragraph), inline content
     * (plain text) or neither (the root AST node).
     * 
     * <p>({@code enum CXCommentKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXComment_Null Comment_Null} - Null comment.  No AST node is constructed at the requested location because there is no text or a syntax error.</li>
     * <li>{@link #CXComment_Text Comment_Text} - Plain text.  Inline content.</li>
     * <li>{@link #CXComment_InlineCommand Comment_InlineCommand} - 
     * A command with word-like arguments that is considered inline content.
     * 
     * <p>For example: \c command.</p>
     * </li>
     * <li>{@link #CXComment_HTMLStartTag Comment_HTMLStartTag} - 
     * HTML start tag with attributes (name-value pairs). Considered inline content.
     * 
     * <p>For example:</p>
     * 
     * <pre><code>
     *  &lt;br&gt; &lt;br /&gt; &lt;a href="http://example.org/"&gt;</code></pre>
     * </li>
     * <li>{@link #CXComment_HTMLEndTag Comment_HTMLEndTag} - 
     * HTML end tag. Considered inline content.
     * 
     * <p>For example:</p>
     * 
     * <pre><code>
     *  &lt;/a&gt;</code></pre>
     * </li>
     * <li>{@link #CXComment_Paragraph Comment_Paragraph} - A paragraph, contains inline comment.  The paragraph itself is block content.</li>
     * <li>{@link #CXComment_BlockCommand Comment_BlockCommand} - 
     * A command that has zero or more word-like arguments (number of word-like arguments depends on command name) and a paragraph as an argument. Block
     * command is block content.
     * 
     * <p>Paragraph argument is also a child of the block command.</p>
     * 
     * <p>For example: has 0 word-like arguments and a paragraph argument.</p>
     * 
     * <p>AST nodes of special kinds that parser knows about (e. g.,\param command) have their own node kinds.</p>
     * </li>
     * <li>{@link #CXComment_ParamCommand Comment_ParamCommand} - 
     * A \param or \arg command that describes the function parameter (name, passing direction, description).
     * 
     * <p>For example: \param [in] ParamName description.</p>
     * </li>
     * <li>{@link #CXComment_TParamCommand Comment_TParamCommand} - 
     * A \tparam command that describes a template parameter (name and description).
     * 
     * <p>For example: \tparam T description.</p>
     * </li>
     * <li>{@link #CXComment_VerbatimBlockCommand Comment_VerbatimBlockCommand} - 
     * A verbatim block command (e. g., preformatted code). Verbatim block has an opening and a closing command and contains multiple lines of text (
     * {@link #CXComment_VerbatimBlockLine Comment_VerbatimBlockLine} child nodes).
     * 
     * <p>For example: \verbatim aaa \endverbatim</p>
     * </li>
     * <li>{@link #CXComment_VerbatimBlockLine Comment_VerbatimBlockLine} - A line of text that is contained within a CXComment_VerbatimBlockCommand node.</li>
     * <li>{@link #CXComment_VerbatimLine Comment_VerbatimLine} - 
     * A verbatim line command. Verbatim line has an opening command, a single line of text (up to the newline after the opening command) and has no
     * closing command.
     * </li>
     * <li>{@link #CXComment_FullComment Comment_FullComment} - A full comment attached to a declaration, contains block content.</li>
     * </ul>
     */
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

    /**
     * The most appropriate rendering mode for an inline command, chosen on command semantics in Doxygen.
     * 
     * <p>({@code enum CXCommentInlineCommandRenderKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCommentInlineCommandRenderKind_Normal CommentInlineCommandRenderKind_Normal} - Command argument should be rendered in a normal font.</li>
     * <li>{@link #CXCommentInlineCommandRenderKind_Bold CommentInlineCommandRenderKind_Bold} - Command argument should be rendered in a bold font.</li>
     * <li>{@link #CXCommentInlineCommandRenderKind_Monospaced CommentInlineCommandRenderKind_Monospaced} - Command argument should be rendered in a monospaced font.</li>
     * <li>{@link #CXCommentInlineCommandRenderKind_Emphasized CommentInlineCommandRenderKind_Emphasized} - Command argument should be rendered emphasized (typically italic font).</li>
     * </ul>
     */
    public static final int
        CXCommentInlineCommandRenderKind_Normal     = 0,
        CXCommentInlineCommandRenderKind_Bold       = 1,
        CXCommentInlineCommandRenderKind_Monospaced = 2,
        CXCommentInlineCommandRenderKind_Emphasized = 3;

    /**
     * Describes parameter passing direction for \param or \arg command.
     * 
     * <p>({@code enum CXCommentParamPassDirection})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCommentParamPassDirection_In CommentParamPassDirection_In} - The parameter is an input parameter.</li>
     * <li>{@link #CXCommentParamPassDirection_Out CommentParamPassDirection_Out} - The parameter is an output parameter.</li>
     * <li>{@link #CXCommentParamPassDirection_InOut CommentParamPassDirection_InOut} - The parameter is an input and output parameter.</li>
     * </ul>
     */
    public static final int
        CXCommentParamPassDirection_In    = 0,
        CXCommentParamPassDirection_Out   = 1,
        CXCommentParamPassDirection_InOut = 2;

    static { LibLLVM.initialize(); }

    protected ClangDocumentation() {
        throw new UnsupportedOperationException();
    }

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
            FullComment_getAsXML                      = apiGetFunctionAddress(ClangIndex.getLibrary(), "clang_FullComment_getAsXML");

    }

    // --- [ clang_Cursor_getParsedComment ] ---

    /** Unsafe version of: {@link #clang_Cursor_getParsedComment Cursor_getParsedComment} */
    public static native void nclang_Cursor_getParsedComment(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getParsedComment Cursor_getParsedComment} */
    public static void nclang_Cursor_getParsedComment(long C, long __result) {
        long __functionAddress = Functions.Cursor_getParsedComment;
        nclang_Cursor_getParsedComment(C, __functionAddress, __result);
    }

    /** Given a cursor that represents a documentable entity (e.g., declaration), return the associated parsed comment as a {@link #CXComment_FullComment Comment_FullComment} AST node. */
    public static CXComment clang_Cursor_getParsedComment(CXCursor C, CXComment __result) {
        nclang_Cursor_getParsedComment(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Comment_getKind ] ---

    /** Unsafe version of: {@link #clang_Comment_getKind Comment_getKind} */
    public static native int nclang_Comment_getKind(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_Comment_getKind Comment_getKind} */
    public static int nclang_Comment_getKind(long Comment) {
        long __functionAddress = Functions.Comment_getKind;
        return nclang_Comment_getKind(Comment, __functionAddress);
    }

    /**
     * @param Comment AST node of any kind
     *
     * @return the type of the AST node
     */
    @NativeType("enum CXCommentKind")
    public static int clang_Comment_getKind(CXComment Comment) {
        return nclang_Comment_getKind(Comment.address());
    }

    // --- [ clang_Comment_getNumChildren ] ---

    /** Unsafe version of: {@link #clang_Comment_getNumChildren Comment_getNumChildren} */
    public static native int nclang_Comment_getNumChildren(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_Comment_getNumChildren Comment_getNumChildren} */
    public static int nclang_Comment_getNumChildren(long Comment) {
        long __functionAddress = Functions.Comment_getNumChildren;
        return nclang_Comment_getNumChildren(Comment, __functionAddress);
    }

    /**
     * @param Comment AST node of any kind
     *
     * @return number of children of the AST node
     */
    @NativeType("unsigned")
    public static int clang_Comment_getNumChildren(CXComment Comment) {
        return nclang_Comment_getNumChildren(Comment.address());
    }

    // --- [ clang_Comment_getChild ] ---

    /** Unsafe version of: {@link #clang_Comment_getChild Comment_getChild} */
    public static native void nclang_Comment_getChild(long Comment, int ChildIdx, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Comment_getChild Comment_getChild} */
    public static void nclang_Comment_getChild(long Comment, int ChildIdx, long __result) {
        long __functionAddress = Functions.Comment_getChild;
        nclang_Comment_getChild(Comment, ChildIdx, __functionAddress, __result);
    }

    /**
     * @param Comment  AST node of any kind
     * @param ChildIdx child index (zero-based)
     * @param __result the specified child of the AST node
     */
    public static CXComment clang_Comment_getChild(CXComment Comment, @NativeType("unsigned") int ChildIdx, CXComment __result) {
        nclang_Comment_getChild(Comment.address(), ChildIdx, __result.address());
        return __result;
    }

    // --- [ clang_Comment_isWhitespace ] ---

    /** Unsafe version of: {@link #clang_Comment_isWhitespace Comment_isWhitespace} */
    public static native int nclang_Comment_isWhitespace(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_Comment_isWhitespace Comment_isWhitespace} */
    public static int nclang_Comment_isWhitespace(long Comment) {
        long __functionAddress = Functions.Comment_isWhitespace;
        return nclang_Comment_isWhitespace(Comment, __functionAddress);
    }

    /**
     * A {@link #CXComment_Paragraph Comment_Paragraph} node is considered whitespace if it contains only {@link #CXComment_Text Comment_Text} nodes that are empty or whitespace.
     * 
     * <p>Other AST nodes (except {@code CXComment_Paragraph} and {@code CXComment_Text}) are never considered whitespace.</p>
     *
     * @return non-zero if {@code Comment} is whitespace
     */
    @NativeType("unsigned")
    public static boolean clang_Comment_isWhitespace(CXComment Comment) {
        return nclang_Comment_isWhitespace(Comment.address()) != 0;
    }

    // --- [ clang_InlineContentComment_hasTrailingNewline ] ---

    /** Unsafe version of: {@link #clang_InlineContentComment_hasTrailingNewline InlineContentComment_hasTrailingNewline} */
    public static native int nclang_InlineContentComment_hasTrailingNewline(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_InlineContentComment_hasTrailingNewline InlineContentComment_hasTrailingNewline} */
    public static int nclang_InlineContentComment_hasTrailingNewline(long Comment) {
        long __functionAddress = Functions.InlineContentComment_hasTrailingNewline;
        return nclang_InlineContentComment_hasTrailingNewline(Comment, __functionAddress);
    }

    /** @return non-zero if {@code Comment} is inline content and has a newline immediately following it in the comment text. Newlines between paragraphs do not count. */
    @NativeType("unsigned")
    public static boolean clang_InlineContentComment_hasTrailingNewline(CXComment Comment) {
        return nclang_InlineContentComment_hasTrailingNewline(Comment.address()) != 0;
    }

    // --- [ clang_TextComment_getText ] ---

    /** Unsafe version of: {@link #clang_TextComment_getText TextComment_getText} */
    public static native void nclang_TextComment_getText(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_TextComment_getText TextComment_getText} */
    public static void nclang_TextComment_getText(long Comment, long __result) {
        long __functionAddress = Functions.TextComment_getText;
        nclang_TextComment_getText(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_Text Comment_Text} AST node
     * @param __result text contained in the AST node
     */
    public static CXString clang_TextComment_getText(CXComment Comment, CXString __result) {
        nclang_TextComment_getText(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_InlineCommandComment_getCommandName ] ---

    /** Unsafe version of: {@link #clang_InlineCommandComment_getCommandName InlineCommandComment_getCommandName} */
    public static native void nclang_InlineCommandComment_getCommandName(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_InlineCommandComment_getCommandName InlineCommandComment_getCommandName} */
    public static void nclang_InlineCommandComment_getCommandName(long Comment, long __result) {
        long __functionAddress = Functions.InlineCommandComment_getCommandName;
        nclang_InlineCommandComment_getCommandName(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_InlineCommand Comment_InlineCommand} AST node
     * @param __result name of the inline command
     */
    public static CXString clang_InlineCommandComment_getCommandName(CXComment Comment, CXString __result) {
        nclang_InlineCommandComment_getCommandName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_InlineCommandComment_getRenderKind ] ---

    /** Unsafe version of: {@link #clang_InlineCommandComment_getRenderKind InlineCommandComment_getRenderKind} */
    public static native int nclang_InlineCommandComment_getRenderKind(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_InlineCommandComment_getRenderKind InlineCommandComment_getRenderKind} */
    public static int nclang_InlineCommandComment_getRenderKind(long Comment) {
        long __functionAddress = Functions.InlineCommandComment_getRenderKind;
        return nclang_InlineCommandComment_getRenderKind(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_InlineCommand Comment_InlineCommand} AST node
     *
     * @return the most appropriate rendering mode, chosen on command semantics in Doxygen
     */
    @NativeType("enum CXCommentInlineCommandRenderKind")
    public static int clang_InlineCommandComment_getRenderKind(CXComment Comment) {
        return nclang_InlineCommandComment_getRenderKind(Comment.address());
    }

    // --- [ clang_InlineCommandComment_getNumArgs ] ---

    /** Unsafe version of: {@link #clang_InlineCommandComment_getNumArgs InlineCommandComment_getNumArgs} */
    public static native int nclang_InlineCommandComment_getNumArgs(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_InlineCommandComment_getNumArgs InlineCommandComment_getNumArgs} */
    public static int nclang_InlineCommandComment_getNumArgs(long Comment) {
        long __functionAddress = Functions.InlineCommandComment_getNumArgs;
        return nclang_InlineCommandComment_getNumArgs(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_InlineCommand Comment_InlineCommand} AST node
     *
     * @return number of command arguments
     */
    @NativeType("unsigned")
    public static int clang_InlineCommandComment_getNumArgs(CXComment Comment) {
        return nclang_InlineCommandComment_getNumArgs(Comment.address());
    }

    // --- [ clang_InlineCommandComment_getArgText ] ---

    /** Unsafe version of: {@link #clang_InlineCommandComment_getArgText InlineCommandComment_getArgText} */
    public static native void nclang_InlineCommandComment_getArgText(long Comment, int ArgIdx, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_InlineCommandComment_getArgText InlineCommandComment_getArgText} */
    public static void nclang_InlineCommandComment_getArgText(long Comment, int ArgIdx, long __result) {
        long __functionAddress = Functions.InlineCommandComment_getArgText;
        nclang_InlineCommandComment_getArgText(Comment, ArgIdx, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_InlineCommand Comment_InlineCommand} AST node
     * @param ArgIdx   argument index (zero-based)
     * @param __result text of the specified argument
     */
    public static CXString clang_InlineCommandComment_getArgText(CXComment Comment, @NativeType("unsigned") int ArgIdx, CXString __result) {
        nclang_InlineCommandComment_getArgText(Comment.address(), ArgIdx, __result.address());
        return __result;
    }

    // --- [ clang_HTMLTagComment_getTagName ] ---

    /** Unsafe version of: {@link #clang_HTMLTagComment_getTagName HTMLTagComment_getTagName} */
    public static native void nclang_HTMLTagComment_getTagName(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_HTMLTagComment_getTagName HTMLTagComment_getTagName} */
    public static void nclang_HTMLTagComment_getTagName(long Comment, long __result) {
        long __functionAddress = Functions.HTMLTagComment_getTagName;
        nclang_HTMLTagComment_getTagName(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_HTMLStartTag Comment_HTMLStartTag} or {@link #CXComment_HTMLEndTag Comment_HTMLEndTag} AST node
     * @param __result HTML tag name
     */
    public static CXString clang_HTMLTagComment_getTagName(CXComment Comment, CXString __result) {
        nclang_HTMLTagComment_getTagName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_HTMLStartTagComment_isSelfClosing ] ---

    /** Unsafe version of: {@link #clang_HTMLStartTagComment_isSelfClosing HTMLStartTagComment_isSelfClosing} */
    public static native int nclang_HTMLStartTagComment_isSelfClosing(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_HTMLStartTagComment_isSelfClosing HTMLStartTagComment_isSelfClosing} */
    public static int nclang_HTMLStartTagComment_isSelfClosing(long Comment) {
        long __functionAddress = Functions.HTMLStartTagComment_isSelfClosing;
        return nclang_HTMLStartTagComment_isSelfClosing(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_HTMLStartTag Comment_HTMLStartTag} AST node
     *
     * @return non-zero if tag is self-closing (for example, &lt;br /&gt; )
     */
    @NativeType("unsigned")
    public static boolean clang_HTMLStartTagComment_isSelfClosing(CXComment Comment) {
        return nclang_HTMLStartTagComment_isSelfClosing(Comment.address()) != 0;
    }

    // --- [ clang_HTMLStartTag_getNumAttrs ] ---

    /** Unsafe version of: {@link #clang_HTMLStartTag_getNumAttrs HTMLStartTag_getNumAttrs} */
    public static native int nclang_HTMLStartTag_getNumAttrs(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_HTMLStartTag_getNumAttrs HTMLStartTag_getNumAttrs} */
    public static int nclang_HTMLStartTag_getNumAttrs(long Comment) {
        long __functionAddress = Functions.HTMLStartTag_getNumAttrs;
        return nclang_HTMLStartTag_getNumAttrs(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_HTMLStartTag Comment_HTMLStartTag} AST node
     *
     * @return number of attributes (name-value pairs) attached to the start tag
     */
    @NativeType("unsigned")
    public static int clang_HTMLStartTag_getNumAttrs(CXComment Comment) {
        return nclang_HTMLStartTag_getNumAttrs(Comment.address());
    }

    // --- [ clang_HTMLStartTag_getAttrName ] ---

    /** Unsafe version of: {@link #clang_HTMLStartTag_getAttrName HTMLStartTag_getAttrName} */
    public static native void nclang_HTMLStartTag_getAttrName(long Comment, int AttrIdx, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_HTMLStartTag_getAttrName HTMLStartTag_getAttrName} */
    public static void nclang_HTMLStartTag_getAttrName(long Comment, int AttrIdx, long __result) {
        long __functionAddress = Functions.HTMLStartTag_getAttrName;
        nclang_HTMLStartTag_getAttrName(Comment, AttrIdx, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_HTMLStartTag Comment_HTMLStartTag} AST node
     * @param AttrIdx  attribute index (zero-based)
     * @param __result name of the specified attribute
     */
    public static CXString clang_HTMLStartTag_getAttrName(CXComment Comment, @NativeType("unsigned") int AttrIdx, CXString __result) {
        nclang_HTMLStartTag_getAttrName(Comment.address(), AttrIdx, __result.address());
        return __result;
    }

    // --- [ clang_HTMLStartTag_getAttrValue ] ---

    /** Unsafe version of: {@link #clang_HTMLStartTag_getAttrValue HTMLStartTag_getAttrValue} */
    public static native void nclang_HTMLStartTag_getAttrValue(long Comment, int AttrIdx, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_HTMLStartTag_getAttrValue HTMLStartTag_getAttrValue} */
    public static void nclang_HTMLStartTag_getAttrValue(long Comment, int AttrIdx, long __result) {
        long __functionAddress = Functions.HTMLStartTag_getAttrValue;
        nclang_HTMLStartTag_getAttrValue(Comment, AttrIdx, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_HTMLStartTag Comment_HTMLStartTag} AST node
     * @param AttrIdx  attribute index (zero-based)
     * @param __result value of the specified attribute
     */
    public static CXString clang_HTMLStartTag_getAttrValue(CXComment Comment, @NativeType("unsigned") int AttrIdx, CXString __result) {
        nclang_HTMLStartTag_getAttrValue(Comment.address(), AttrIdx, __result.address());
        return __result;
    }

    // --- [ clang_BlockCommandComment_getCommandName ] ---

    /** Unsafe version of: {@link #clang_BlockCommandComment_getCommandName BlockCommandComment_getCommandName} */
    public static native void nclang_BlockCommandComment_getCommandName(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_BlockCommandComment_getCommandName BlockCommandComment_getCommandName} */
    public static void nclang_BlockCommandComment_getCommandName(long Comment, long __result) {
        long __functionAddress = Functions.BlockCommandComment_getCommandName;
        nclang_BlockCommandComment_getCommandName(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_BlockCommand Comment_BlockCommand} AST node
     * @param __result name of the block command
     */
    public static CXString clang_BlockCommandComment_getCommandName(CXComment Comment, CXString __result) {
        nclang_BlockCommandComment_getCommandName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_BlockCommandComment_getNumArgs ] ---

    /** Unsafe version of: {@link #clang_BlockCommandComment_getNumArgs BlockCommandComment_getNumArgs} */
    public static native int nclang_BlockCommandComment_getNumArgs(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_BlockCommandComment_getNumArgs BlockCommandComment_getNumArgs} */
    public static int nclang_BlockCommandComment_getNumArgs(long Comment) {
        long __functionAddress = Functions.BlockCommandComment_getNumArgs;
        return nclang_BlockCommandComment_getNumArgs(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_BlockCommand Comment_BlockCommand} AST node
     *
     * @return number of word-like arguments
     */
    @NativeType("unsigned")
    public static int clang_BlockCommandComment_getNumArgs(CXComment Comment) {
        return nclang_BlockCommandComment_getNumArgs(Comment.address());
    }

    // --- [ clang_BlockCommandComment_getArgText ] ---

    /** Unsafe version of: {@link #clang_BlockCommandComment_getArgText BlockCommandComment_getArgText} */
    public static native void nclang_BlockCommandComment_getArgText(long Comment, int ArgIdx, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_BlockCommandComment_getArgText BlockCommandComment_getArgText} */
    public static void nclang_BlockCommandComment_getArgText(long Comment, int ArgIdx, long __result) {
        long __functionAddress = Functions.BlockCommandComment_getArgText;
        nclang_BlockCommandComment_getArgText(Comment, ArgIdx, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_BlockCommand Comment_BlockCommand} AST node
     * @param ArgIdx   argument index (zero-based)
     * @param __result text of the specified word-like argument
     */
    public static CXString clang_BlockCommandComment_getArgText(CXComment Comment, @NativeType("unsigned") int ArgIdx, CXString __result) {
        nclang_BlockCommandComment_getArgText(Comment.address(), ArgIdx, __result.address());
        return __result;
    }

    // --- [ clang_BlockCommandComment_getParagraph ] ---

    /** Unsafe version of: {@link #clang_BlockCommandComment_getParagraph BlockCommandComment_getParagraph} */
    public static native void nclang_BlockCommandComment_getParagraph(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_BlockCommandComment_getParagraph BlockCommandComment_getParagraph} */
    public static void nclang_BlockCommandComment_getParagraph(long Comment, long __result) {
        long __functionAddress = Functions.BlockCommandComment_getParagraph;
        nclang_BlockCommandComment_getParagraph(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_BlockCommand Comment_BlockCommand} or {@link #CXComment_VerbatimBlockCommand Comment_VerbatimBlockCommand} AST node
     * @param __result paragraph argument of the block command
     */
    public static CXComment clang_BlockCommandComment_getParagraph(CXComment Comment, CXComment __result) {
        nclang_BlockCommandComment_getParagraph(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_ParamCommandComment_getParamName ] ---

    /** Unsafe version of: {@link #clang_ParamCommandComment_getParamName ParamCommandComment_getParamName} */
    public static native void nclang_ParamCommandComment_getParamName(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_ParamCommandComment_getParamName ParamCommandComment_getParamName} */
    public static void nclang_ParamCommandComment_getParamName(long Comment, long __result) {
        long __functionAddress = Functions.ParamCommandComment_getParamName;
        nclang_ParamCommandComment_getParamName(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_ParamCommand Comment_ParamCommand} AST node
     * @param __result parameter name
     */
    public static CXString clang_ParamCommandComment_getParamName(CXComment Comment, CXString __result) {
        nclang_ParamCommandComment_getParamName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_ParamCommandComment_isParamIndexValid ] ---

    /** Unsafe version of: {@link #clang_ParamCommandComment_isParamIndexValid ParamCommandComment_isParamIndexValid} */
    public static native int nclang_ParamCommandComment_isParamIndexValid(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_ParamCommandComment_isParamIndexValid ParamCommandComment_isParamIndexValid} */
    public static int nclang_ParamCommandComment_isParamIndexValid(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_isParamIndexValid;
        return nclang_ParamCommandComment_isParamIndexValid(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_ParamCommand Comment_ParamCommand} AST node
     *
     * @return non-zero if the parameter that this AST node represents was found in the function prototype and {@link #clang_ParamCommandComment_getParamIndex ParamCommandComment_getParamIndex} function will
     *         return a meaningful value
     */
    @NativeType("unsigned")
    public static boolean clang_ParamCommandComment_isParamIndexValid(CXComment Comment) {
        return nclang_ParamCommandComment_isParamIndexValid(Comment.address()) != 0;
    }

    // --- [ clang_ParamCommandComment_getParamIndex ] ---

    /** Unsafe version of: {@link #clang_ParamCommandComment_getParamIndex ParamCommandComment_getParamIndex} */
    public static native int nclang_ParamCommandComment_getParamIndex(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_ParamCommandComment_getParamIndex ParamCommandComment_getParamIndex} */
    public static int nclang_ParamCommandComment_getParamIndex(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_getParamIndex;
        return nclang_ParamCommandComment_getParamIndex(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_ParamCommand Comment_ParamCommand} AST node
     *
     * @return zero-based parameter index in function prototype
     */
    @NativeType("unsigned")
    public static int clang_ParamCommandComment_getParamIndex(CXComment Comment) {
        return nclang_ParamCommandComment_getParamIndex(Comment.address());
    }

    // --- [ clang_ParamCommandComment_isDirectionExplicit ] ---

    /** Unsafe version of: {@link #clang_ParamCommandComment_isDirectionExplicit ParamCommandComment_isDirectionExplicit} */
    public static native int nclang_ParamCommandComment_isDirectionExplicit(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_ParamCommandComment_isDirectionExplicit ParamCommandComment_isDirectionExplicit} */
    public static int nclang_ParamCommandComment_isDirectionExplicit(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_isDirectionExplicit;
        return nclang_ParamCommandComment_isDirectionExplicit(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_ParamCommand Comment_ParamCommand} AST node
     *
     * @return non-zero if parameter passing direction was specified explicitly in the comment
     */
    @NativeType("unsigned")
    public static boolean clang_ParamCommandComment_isDirectionExplicit(CXComment Comment) {
        return nclang_ParamCommandComment_isDirectionExplicit(Comment.address()) != 0;
    }

    // --- [ clang_ParamCommandComment_getDirection ] ---

    /** Unsafe version of: {@link #clang_ParamCommandComment_getDirection ParamCommandComment_getDirection} */
    public static native int nclang_ParamCommandComment_getDirection(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_ParamCommandComment_getDirection ParamCommandComment_getDirection} */
    public static int nclang_ParamCommandComment_getDirection(long Comment) {
        long __functionAddress = Functions.ParamCommandComment_getDirection;
        return nclang_ParamCommandComment_getDirection(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_ParamCommand Comment_ParamCommand} AST node
     *
     * @return parameter passing direction
     */
    @NativeType("enum CXCommentParamPassDirection")
    public static int clang_ParamCommandComment_getDirection(CXComment Comment) {
        return nclang_ParamCommandComment_getDirection(Comment.address());
    }

    // --- [ clang_TParamCommandComment_getParamName ] ---

    /** Unsafe version of: {@link #clang_TParamCommandComment_getParamName TParamCommandComment_getParamName} */
    public static native void nclang_TParamCommandComment_getParamName(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_TParamCommandComment_getParamName TParamCommandComment_getParamName} */
    public static void nclang_TParamCommandComment_getParamName(long Comment, long __result) {
        long __functionAddress = Functions.TParamCommandComment_getParamName;
        nclang_TParamCommandComment_getParamName(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_TParamCommand Comment_TParamCommand} AST node
     * @param __result template parameter name
     */
    public static CXString clang_TParamCommandComment_getParamName(CXComment Comment, CXString __result) {
        nclang_TParamCommandComment_getParamName(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_TParamCommandComment_isParamPositionValid ] ---

    /** Unsafe version of: {@link #clang_TParamCommandComment_isParamPositionValid TParamCommandComment_isParamPositionValid} */
    public static native int nclang_TParamCommandComment_isParamPositionValid(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_TParamCommandComment_isParamPositionValid TParamCommandComment_isParamPositionValid} */
    public static int nclang_TParamCommandComment_isParamPositionValid(long Comment) {
        long __functionAddress = Functions.TParamCommandComment_isParamPositionValid;
        return nclang_TParamCommandComment_isParamPositionValid(Comment, __functionAddress);
    }

    /**
     * @param Comment a {@link #CXComment_TParamCommand Comment_TParamCommand} AST node
     *
     * @return non-zero if the parameter that this AST node represents was found in the template parameter list and {@link #clang_TParamCommandComment_getDepth TParamCommandComment_getDepth} and
     *         {@link #clang_TParamCommandComment_getIndex TParamCommandComment_getIndex} functions will return a meaningful value
     */
    @NativeType("unsigned")
    public static boolean clang_TParamCommandComment_isParamPositionValid(CXComment Comment) {
        return nclang_TParamCommandComment_isParamPositionValid(Comment.address()) != 0;
    }

    // --- [ clang_TParamCommandComment_getDepth ] ---

    /** Unsafe version of: {@link #clang_TParamCommandComment_getDepth TParamCommandComment_getDepth} */
    public static native int nclang_TParamCommandComment_getDepth(long Comment, long __functionAddress);

    /** Unsafe version of: {@link #clang_TParamCommandComment_getDepth TParamCommandComment_getDepth} */
    public static int nclang_TParamCommandComment_getDepth(long Comment) {
        long __functionAddress = Functions.TParamCommandComment_getDepth;
        return nclang_TParamCommandComment_getDepth(Comment, __functionAddress);
    }

    /**
     * For example,
     * 
     * <pre><code>
     *      template&lt;typename C, template&lt;typename T&gt; class TT&gt;
     *      void test(TT&lt;int&gt; aaa);</code></pre>
     * 
     * <p>for C and TT nesting depth is 0, for T nesting depth is 1.</p>
     *
     * @param Comment a {@link #CXComment_TParamCommand Comment_TParamCommand} AST node
     *
     * @return zero-based nesting depth of this parameter in the template parameter list
     */
    @NativeType("unsigned")
    public static int clang_TParamCommandComment_getDepth(CXComment Comment) {
        return nclang_TParamCommandComment_getDepth(Comment.address());
    }

    // --- [ clang_TParamCommandComment_getIndex ] ---

    /** Unsafe version of: {@link #clang_TParamCommandComment_getIndex TParamCommandComment_getIndex} */
    public static native int nclang_TParamCommandComment_getIndex(long Comment, int Depth, long __functionAddress);

    /** Unsafe version of: {@link #clang_TParamCommandComment_getIndex TParamCommandComment_getIndex} */
    public static int nclang_TParamCommandComment_getIndex(long Comment, int Depth) {
        long __functionAddress = Functions.TParamCommandComment_getIndex;
        return nclang_TParamCommandComment_getIndex(Comment, Depth, __functionAddress);
    }

    /**
     * For example,
     * 
     * <pre><code>
     *      template&lt;typename C, template&lt;typename T&gt; class TT&gt;
     *      void test(TT&lt;int&gt; aaa);</code></pre>
     * 
     * <p>for C and TT nesting depth is 0, so we can ask for index at depth 0: at depth 0 C's index is 0, TT's index is 1.</p>
     * 
     * <p>For T nesting depth is 1, so we can ask for index at depth 0 and 1: at depth 0 T's index is 1 (same as TT's), at depth 1 T's index is 0.</p>
     *
     * @param Comment a {@link #CXComment_TParamCommand Comment_TParamCommand} AST node
     *
     * @return zero-based parameter index in the template parameter list at a given nesting depth
     */
    @NativeType("unsigned")
    public static int clang_TParamCommandComment_getIndex(CXComment Comment, @NativeType("unsigned") int Depth) {
        return nclang_TParamCommandComment_getIndex(Comment.address(), Depth);
    }

    // --- [ clang_VerbatimBlockLineComment_getText ] ---

    /** Unsafe version of: {@link #clang_VerbatimBlockLineComment_getText VerbatimBlockLineComment_getText} */
    public static native void nclang_VerbatimBlockLineComment_getText(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_VerbatimBlockLineComment_getText VerbatimBlockLineComment_getText} */
    public static void nclang_VerbatimBlockLineComment_getText(long Comment, long __result) {
        long __functionAddress = Functions.VerbatimBlockLineComment_getText;
        nclang_VerbatimBlockLineComment_getText(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_VerbatimBlockLine Comment_VerbatimBlockLine} AST node
     * @param __result text contained in the AST node
     */
    public static CXString clang_VerbatimBlockLineComment_getText(CXComment Comment, CXString __result) {
        nclang_VerbatimBlockLineComment_getText(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_VerbatimLineComment_getText ] ---

    /** Unsafe version of: {@link #clang_VerbatimLineComment_getText VerbatimLineComment_getText} */
    public static native void nclang_VerbatimLineComment_getText(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_VerbatimLineComment_getText VerbatimLineComment_getText} */
    public static void nclang_VerbatimLineComment_getText(long Comment, long __result) {
        long __functionAddress = Functions.VerbatimLineComment_getText;
        nclang_VerbatimLineComment_getText(Comment, __functionAddress, __result);
    }

    /**
     * @param Comment  a {@link #CXComment_VerbatimLine Comment_VerbatimLine} AST node
     * @param __result text contained in the AST node
     */
    public static CXString clang_VerbatimLineComment_getText(CXComment Comment, CXString __result) {
        nclang_VerbatimLineComment_getText(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_HTMLTagComment_getAsString ] ---

    /** Unsafe version of: {@link #clang_HTMLTagComment_getAsString HTMLTagComment_getAsString} */
    public static native void nclang_HTMLTagComment_getAsString(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_HTMLTagComment_getAsString HTMLTagComment_getAsString} */
    public static void nclang_HTMLTagComment_getAsString(long Comment, long __result) {
        long __functionAddress = Functions.HTMLTagComment_getAsString;
        nclang_HTMLTagComment_getAsString(Comment, __functionAddress, __result);
    }

    /**
     * Convert an HTML tag AST node to string.
     *
     * @param Comment  a {@link #CXComment_HTMLStartTag Comment_HTMLStartTag} or {@link #CXComment_HTMLEndTag Comment_HTMLEndTag} AST node
     * @param __result string containing an HTML tag
     */
    public static CXString clang_HTMLTagComment_getAsString(CXComment Comment, CXString __result) {
        nclang_HTMLTagComment_getAsString(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_FullComment_getAsHTML ] ---

    /** Unsafe version of: {@link #clang_FullComment_getAsHTML FullComment_getAsHTML} */
    public static native void nclang_FullComment_getAsHTML(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_FullComment_getAsHTML FullComment_getAsHTML} */
    public static void nclang_FullComment_getAsHTML(long Comment, long __result) {
        long __functionAddress = Functions.FullComment_getAsHTML;
        nclang_FullComment_getAsHTML(Comment, __functionAddress, __result);
    }

    /**
     * Convert a given full parsed comment to an HTML fragment.
     * 
     * <p>Specific details of HTML layout are subject to change. Don't try to parse this HTML back into an AST, use other APIs instead.</p>
     * 
     * <p>Currently the following CSS classes are used:</p>
     * 
     * <ul>
     * <li>"para-brief" for \paragraph and equivalent commands;</li>
     * <li>"para-returns" for \returns paragraph and equivalent commands;</li>
     * <li>"word-returns" for the "Returns" word in \returns paragraph.</li>
     * </ul>
     * 
     * <p>Function argument documentation is rendered as a &lt;dl&gt; list with arguments sorted in function prototype order. CSS classes used:</p>
     * 
     * <ul>
     * <li>"param-name-index-NUMBER" for parameter name ( &lt;dt&gt; );</li>
     * <li>"param-descr-index-NUMBER" for parameter description ( &lt;dd&gt; );</li>
     * <li>"param-name-index-invalid" and "param-descr-index-invalid" are used if parameter index is invalid.</li>
     * </ul>
     * 
     * <p>Template parameter documentation is rendered as a &lt;dl&gt; list with parameters sorted in template parameter list order. CSS classes used:</p>
     * 
     * <ul>
     * <li>"tparam-name-index-NUMBER" for parameter name ( &lt;dt&gt; );</li>
     * <li>"tparam-descr-index-NUMBER" for parameter description ( &lt;dd&gt; );</li>
     * <li>"tparam-name-index-other" and "tparam-descr-index-other" are used for names inside template template parameters;</li>
     * <li>"tparam-name-index-invalid" and "tparam-descr-index-invalid" are used if parameter position is invalid.</li>
     * </ul>
     *
     * @param Comment  a {@link #CXComment_FullComment Comment_FullComment} AST node
     * @param __result string containing an HTML fragment
     */
    public static CXString clang_FullComment_getAsHTML(CXComment Comment, CXString __result) {
        nclang_FullComment_getAsHTML(Comment.address(), __result.address());
        return __result;
    }

    // --- [ clang_FullComment_getAsXML ] ---

    /** Unsafe version of: {@link #clang_FullComment_getAsXML FullComment_getAsXML} */
    public static native void nclang_FullComment_getAsXML(long Comment, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_FullComment_getAsXML FullComment_getAsXML} */
    public static void nclang_FullComment_getAsXML(long Comment, long __result) {
        long __functionAddress = Functions.FullComment_getAsXML;
        nclang_FullComment_getAsXML(Comment, __functionAddress, __result);
    }

    /**
     * Convert a given full parsed comment to an XML document.
     * 
     * <p>A Relax NG schema for the XML can be found in comment-xml-schema.rng file inside clang source tree.</p>
     *
     * @param Comment  a {@link #CXComment_FullComment Comment_FullComment} AST node
     * @param __result string containing an XML document
     */
    public static CXString clang_FullComment_getAsXML(CXComment Comment, CXString __result) {
        nclang_FullComment_getAsXML(Comment.address(), __result.address());
        return __result;
    }

}