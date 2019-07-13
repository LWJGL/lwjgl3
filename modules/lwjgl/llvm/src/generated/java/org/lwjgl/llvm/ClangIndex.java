/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class ClangIndex {

    public static final int
        CINDEX_VERSION_MAJOR = 0,
        CINDEX_VERSION_MINOR = 50;

    /**
     * Error codes returned by libclang routines. ({@code enum CXErrorCode})
     * 
     * <p>Zero ({@code CXError_Success}) is the only error code indicating success. Other error codes, including not yet assigned non-zero values, indicate
     * errors.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXError_Success Error_Success} - No error.</li>
     * <li>{@link #CXError_Failure Error_Failure} - 
     * A generic error code, no further details are available.
     * 
     * <p>Errors of this kind can get their own specific error codes in future libclang versions.</p>
     * </li>
     * <li>{@link #CXError_Crashed Error_Crashed} - libclang crashed while performing the requested operation.</li>
     * <li>{@link #CXError_InvalidArguments Error_InvalidArguments} - The function detected that the arguments violate the function contract.</li>
     * <li>{@link #CXError_ASTReadError Error_ASTReadError} - An AST deserialization error has occurred.</li>
     * </ul>
     */
    public static final int
        CXError_Success          = 0,
        CXError_Failure          = 1,
        CXError_Crashed          = 2,
        CXError_InvalidArguments = 3,
        CXError_ASTReadError     = 4;

    /**
     * Describes the availability of a particular entity, which indicates whether the use of this entity will result in a warning or error due to it being
     * deprecated or unavailable.
     * 
     * <p>({@code enum CXAvailabilityKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXAvailability_Available Availability_Available} - The entity is available.</li>
     * <li>{@link #CXAvailability_Deprecated Availability_Deprecated} - The entity is available, but has been deprecated (and its use is not recommended).</li>
     * <li>{@link #CXAvailability_NotAvailable Availability_NotAvailable} - The entity is not available; any use of it will be an error.</li>
     * <li>{@link #CXAvailability_NotAccessible Availability_NotAccessible} - The entity is available, but not accessible; any use of it will be an error.</li>
     * </ul>
     */
    public static final int
        CXAvailability_Available     = 0,
        CXAvailability_Deprecated    = 1,
        CXAvailability_NotAvailable  = 2,
        CXAvailability_NotAccessible = 3;

    /**
     * Describes the exception specification of a cursor. ({@code enum CXCursor_ExceptionSpecificationKind})
     * 
     * <p>A negative value indicates that the cursor is not a function declaration.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_None Cursor_ExceptionSpecificationKind_None} - The cursor has no exception specification.</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_DynamicNone Cursor_ExceptionSpecificationKind_DynamicNone} - The cursor has exception specification throw()</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_Dynamic Cursor_ExceptionSpecificationKind_Dynamic} - The cursor has exception specification throw(T1, T2)</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_MSAny Cursor_ExceptionSpecificationKind_MSAny} - The cursor has exception specification throw(...).</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_BasicNoexcept Cursor_ExceptionSpecificationKind_BasicNoexcept} - The cursor has exception specification basic noexcept.</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_ComputedNoexcept Cursor_ExceptionSpecificationKind_ComputedNoexcept} - The cursor has exception specification computed noexcept.</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_Unevaluated Cursor_ExceptionSpecificationKind_Unevaluated} - The exception specification has not yet been evaluated.</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_Uninstantiated Cursor_ExceptionSpecificationKind_Uninstantiated} - The exception specification has not yet been instantiated.</li>
     * <li>{@link #CXCursor_ExceptionSpecificationKind_Unparsed Cursor_ExceptionSpecificationKind_Unparsed} - The exception specification has not been parsed yet.</li>
     * </ul>
     */
    public static final int
        CXCursor_ExceptionSpecificationKind_None             = 0,
        CXCursor_ExceptionSpecificationKind_DynamicNone      = 1,
        CXCursor_ExceptionSpecificationKind_Dynamic          = 2,
        CXCursor_ExceptionSpecificationKind_MSAny            = 3,
        CXCursor_ExceptionSpecificationKind_BasicNoexcept    = 4,
        CXCursor_ExceptionSpecificationKind_ComputedNoexcept = 5,
        CXCursor_ExceptionSpecificationKind_Unevaluated      = 6,
        CXCursor_ExceptionSpecificationKind_Uninstantiated   = 7,
        CXCursor_ExceptionSpecificationKind_Unparsed         = 8;

    /**
     * {@code CXGlobalOptFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXGlobalOpt_None GlobalOpt_None} - Used to indicate that no special CXIndex options are needed.</li>
     * <li>{@link #CXGlobalOpt_ThreadBackgroundPriorityForIndexing GlobalOpt_ThreadBackgroundPriorityForIndexing} - 
     * Used to indicate that threads that libclang creates for indexing purposes should use background priority.
     * 
     * <p>Affects {@link #clang_indexSourceFile indexSourceFile}, {@link #clang_indexTranslationUnit indexTranslationUnit}, {@link #clang_parseTranslationUnit parseTranslationUnit}, {@link #clang_saveTranslationUnit saveTranslationUnit}.</p>
     * </li>
     * <li>{@link #CXGlobalOpt_ThreadBackgroundPriorityForEditing GlobalOpt_ThreadBackgroundPriorityForEditing} - 
     * Used to indicate that threads that libclang creates for editing purposes should use background priority.
     * 
     * <p>Affects {@link #clang_reparseTranslationUnit reparseTranslationUnit}, {@link #clang_codeCompleteAt codeCompleteAt}, {@link #clang_annotateTokens annotateTokens}</p>
     * </li>
     * <li>{@link #CXGlobalOpt_ThreadBackgroundPriorityForAll GlobalOpt_ThreadBackgroundPriorityForAll} - Used to indicate that all threads that libclang creates should use background priority.</li>
     * </ul>
     */
    public static final int
        CXGlobalOpt_None                                = 0x0,
        CXGlobalOpt_ThreadBackgroundPriorityForIndexing = 0x1,
        CXGlobalOpt_ThreadBackgroundPriorityForEditing  = 0x2,
        CXGlobalOpt_ThreadBackgroundPriorityForAll      = CXGlobalOpt_ThreadBackgroundPriorityForIndexing | CXGlobalOpt_ThreadBackgroundPriorityForEditing;

    /**
     * Describes the severity of a particular diagnostic.
     * 
     * <p>({@code enum CXDiagnosticSeverity})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXDiagnostic_Ignored Diagnostic_Ignored} - A diagnostic that has been suppressed, e.g., by a command-line option.</li>
     * <li>{@link #CXDiagnostic_Note Diagnostic_Note} - This diagnostic is a note that should be attached to the previous (non-note) diagnostic.</li>
     * <li>{@link #CXDiagnostic_Warning Diagnostic_Warning} - This diagnostic indicates suspicious code that may not be wrong.</li>
     * <li>{@link #CXDiagnostic_Error Diagnostic_Error} - This diagnostic indicates that the code is ill-formed.</li>
     * <li>{@link #CXDiagnostic_Fatal Diagnostic_Fatal} - This diagnostic indicates that the code is ill-formed such that future parser recovery is unlikely to produce useful results.</li>
     * </ul>
     */
    public static final int
        CXDiagnostic_Ignored = 0,
        CXDiagnostic_Note    = 1,
        CXDiagnostic_Warning = 2,
        CXDiagnostic_Error   = 3,
        CXDiagnostic_Fatal   = 4;

    /**
     * Describes the kind of error that occurred (if any) in a call to {@code clang_loadDiagnostics}.
     * 
     * <p>({@code enum CXLoadDiag_Error})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXLoadDiag_None LoadDiag_None} - Indicates that no error occurred.</li>
     * <li>{@link #CXLoadDiag_Unknown LoadDiag_Unknown} - Indicates that an unknown error occurred while attempting to deserialize diagnostics.</li>
     * <li>{@link #CXLoadDiag_CannotLoad LoadDiag_CannotLoad} - Indicates that the file containing the serialized diagnostics could not be opened.</li>
     * <li>{@link #CXLoadDiag_InvalidFile LoadDiag_InvalidFile} - Indicates that the serialized diagnostics file is invalid or corrupt.</li>
     * </ul>
     */
    public static final int
        CXLoadDiag_None        = 0,
        CXLoadDiag_Unknown     = 1,
        CXLoadDiag_CannotLoad  = 2,
        CXLoadDiag_InvalidFile = 3;

    /**
     * Options to control the display of diagnostics. ({@code enum CXDiagnosticDisplayOptions})
     * 
     * <p>The values in this enum are meant to be combined to customize the behavior of {@code clang_formatDiagnostic()}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXDiagnostic_DisplaySourceLocation Diagnostic_DisplaySourceLocation} - 
     * Display the source-location information where the diagnostic was located.
     * 
     * <p>When set, diagnostics will be prefixed by the file, line, and (optionally) column to which the diagnostic refers. For example,</p>
     * 
     * <pre><code>
     *  test.c:28: warning: extra tokens at end of #endif directive</code></pre>
     * 
     * <p>This option corresponds to the clang flag {@code -fshow-source-location}.</p>
     * </li>
     * <li>{@link #CXDiagnostic_DisplayColumn Diagnostic_DisplayColumn} - 
     * If displaying the source-location information of the diagnostic, also include the column number.
     * 
     * <p>This option corresponds to the clang flag {@code -fshow-column}.</p>
     * </li>
     * <li>{@link #CXDiagnostic_DisplaySourceRanges Diagnostic_DisplaySourceRanges} - 
     * If displaying the source-location information of the diagnostic, also include information about source ranges in a machine-parsable format.
     * 
     * <p>This option corresponds to the clang flag {@code -fdiagnostics-print-source-range-info}.</p>
     * </li>
     * <li>{@link #CXDiagnostic_DisplayOption Diagnostic_DisplayOption} - 
     * Display the option name associated with this diagnostic, if any.
     * 
     * <p>The option name displayed (e.g., -Wconversion) will be placed in brackets after the diagnostic text. This option corresponds to the clang flag
     * {@code -fdiagnostics-show-option}.</p>
     * </li>
     * <li>{@link #CXDiagnostic_DisplayCategoryId Diagnostic_DisplayCategoryId} - 
     * Display the category number associated with this diagnostic, if any.
     * 
     * <p>The category number is displayed within brackets after the diagnostic text. This option corresponds to the clang flag {@code
     * -fdiagnostics-show-category=id}.</p>
     * </li>
     * <li>{@link #CXDiagnostic_DisplayCategoryName Diagnostic_DisplayCategoryName} - 
     * Display the category name associated with this diagnostic, if any.
     * 
     * <p>The category name is displayed within brackets after the diagnostic text. This option corresponds to the clang flag {@code
     * -fdiagnostics-show-category=name}.</p>
     * </li>
     * </ul>
     */
    public static final int
        CXDiagnostic_DisplaySourceLocation = 0x01,
        CXDiagnostic_DisplayColumn         = 0x02,
        CXDiagnostic_DisplaySourceRanges   = 0x04,
        CXDiagnostic_DisplayOption         = 0x08,
        CXDiagnostic_DisplayCategoryId     = 0x10,
        CXDiagnostic_DisplayCategoryName   = 0x20;

    /**
     * Flags that control the creation of translation units. ({@code enum CXTranslationUnit_Flags})
     * 
     * <p>The enumerators in this enumeration type are meant to be bitwise ORed together to specify which options should be used when constructing the
     * translation unit.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXTranslationUnit_None TranslationUnit_None} - Used to indicate that no special translation-unit options are needed.</li>
     * <li>{@link #CXTranslationUnit_DetailedPreprocessingRecord TranslationUnit_DetailedPreprocessingRecord} - 
     * Used to indicate that the parser should construct a "detailed" preprocessing record, including all macro definitions and instantiations.
     * 
     * <p>Constructing a detailed preprocessing record requires more memory and time to parse, since the information contained in the record is usually not
     * retained. However, it can be useful for applications that require more detailed information about the behavior of the preprocessor.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_Incomplete TranslationUnit_Incomplete} - 
     * Used to indicate that the translation unit is incomplete.
     * 
     * <p>When a translation unit is considered "incomplete", semantic analysis that is typically performed at the end of the translation unit will be
     * suppressed. For example, this suppresses the completion of tentative declarations in C and of instantiation of implicitly-instantiation function
     * templates in C++. This option is typically used when parsing a header with the intent of producing a precompiled header.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_PrecompiledPreamble TranslationUnit_PrecompiledPreamble} - 
     * Used to indicate that the translation unit should be built with an implicit precompiled header for the preamble.
     * 
     * <p>An implicit precompiled header is used as an optimization when a particular translation unit is likely to be reparsed many times when the sources
     * aren't changing that often. In this case, an implicit precompiled header will be built containing all of the initial includes at the top of the
     * main file (what we refer to as the "preamble" of the file). In subsequent parses, if the preamble or the files in it have not changed, {@code
     * clang_reparseTranslationUnit()} will re-use the implicit precompiled header to improve parsing performance.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_CacheCompletionResults TranslationUnit_CacheCompletionResults} - 
     * Used to indicate that the translation unit should cache some code-completion results with each reparse of the source file.
     * 
     * <p>Caching of code-completion results is a performance optimization that introduces some overhead to reparsing but improves the performance of
     * code-completion operations.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_ForSerialization TranslationUnit_ForSerialization} - 
     * Used to indicate that the translation unit will be serialized with {@code clang_saveTranslationUnit}.
     * 
     * <p>This option is typically used when parsing a header with the intent of producing a precompiled header.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_CXXChainedPCH TranslationUnit_CXXChainedPCH} - 
     * DEPRECATED: Enabled chained precompiled preambles in C++.
     * 
     * <p>Note: this is a *temporary* option that is available only while we are testing C++ precompiled preamble support. It is deprecated.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_SkipFunctionBodies TranslationUnit_SkipFunctionBodies} - 
     * Used to indicate that function/method bodies should be skipped while parsing.
     * 
     * <p>This option can be used to search for declarations/definitions while ignoring the usages.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_IncludeBriefCommentsInCodeCompletion TranslationUnit_IncludeBriefCommentsInCodeCompletion} - Used to indicate that brief documentation comments should be included into the set of code completions returned from this translation unit.</li>
     * <li>{@link #CXTranslationUnit_CreatePreambleOnFirstParse TranslationUnit_CreatePreambleOnFirstParse} - 
     * Used to indicate that the precompiled preamble should be created on the first parse. Otherwise it will be created on the first reparse. This trades
     * runtime on the first parse (serializing the preamble takes time) for reduced runtime on the second parse (can now reuse the preamble).
     * </li>
     * <li>{@link #CXTranslationUnit_KeepGoing TranslationUnit_KeepGoing} - 
     * Do not stop processing when fatal errors are encountered.
     * 
     * <p>When fatal errors are encountered while parsing a translation unit, semantic analysis is typically stopped early when compiling code. A common
     * source for fatal errors are unresolvable include files. For the purposes of an IDE, this is undesirable behavior and as much information as
     * possible should be reported. Use this flag to enable this behavior.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_SingleFileParse TranslationUnit_SingleFileParse} - Sets the preprocessor in a mode for parsing a single file only.</li>
     * <li>{@link #CXTranslationUnit_LimitSkipFunctionBodiesToPreamble TranslationUnit_LimitSkipFunctionBodiesToPreamble} - 
     * Used in combination with CXTranslationUnit_SkipFunctionBodies to constrain the skipping of function bodies to the preamble.
     * 
     * <p>The function bodies of the main file are not skipped.</p>
     * </li>
     * <li>{@link #CXTranslationUnit_IncludeAttributedTypes TranslationUnit_IncludeAttributedTypes} - Used to indicate that attributed types should be included in CXType.</li>
     * <li>{@link #CXTranslationUnit_VisitImplicitAttributes TranslationUnit_VisitImplicitAttributes} - Used to indicate that implicit attributes should be visited.</li>
     * </ul>
     */
    public static final int
        CXTranslationUnit_None                                 = 0x0,
        CXTranslationUnit_DetailedPreprocessingRecord          = 0x01,
        CXTranslationUnit_Incomplete                           = 0x02,
        CXTranslationUnit_PrecompiledPreamble                  = 0x04,
        CXTranslationUnit_CacheCompletionResults               = 0x08,
        CXTranslationUnit_ForSerialization                     = 0x10,
        CXTranslationUnit_CXXChainedPCH                        = 0x20,
        CXTranslationUnit_SkipFunctionBodies                   = 0x40,
        CXTranslationUnit_IncludeBriefCommentsInCodeCompletion = 0x80,
        CXTranslationUnit_CreatePreambleOnFirstParse           = 0x100,
        CXTranslationUnit_KeepGoing                            = 0x200,
        CXTranslationUnit_SingleFileParse                      = 0x400,
        CXTranslationUnit_LimitSkipFunctionBodiesToPreamble    = 0x800,
        CXTranslationUnit_IncludeAttributedTypes               = 0x1000,
        CXTranslationUnit_VisitImplicitAttributes              = 0x2000;

    /**
     * Flags that control how translation units are saved. ({@code enum CXSaveTranslationUnit_Flags})
     * 
     * <p>The enumerators in this enumeration type are meant to be bitwise ORed together to specify which options should be used when saving the translation
     * unit.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXSaveTranslationUnit_None SaveTranslationUnit_None} - Used to indicate that no special saving options are needed.</li>
     * </ul>
     */
    public static final int CXSaveTranslationUnit_None = 0x0;

    /**
     * Describes the kind of error that occurred (if any) in a call to {@code clang_saveTranslationUnit()}.
     * 
     * <p>({@code enum CXSaveError})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXSaveError_None SaveError_None} - Indicates that no error occurred while saving a translation unit.</li>
     * <li>{@link #CXSaveError_Unknown SaveError_Unknown} - 
     * Indicates that an unknown error occurred while attempting to save the file.
     * 
     * <p>This error typically indicates that file I/O failed when attempting to write the file.</p>
     * </li>
     * <li>{@link #CXSaveError_TranslationErrors SaveError_TranslationErrors} - 
     * Indicates that errors during translation prevented this attempt to save the translation unit.
     * 
     * <p>Errors that prevent the translation unit from being saved can be extracted using {@code clang_getNumDiagnostics()} and {@code
     * clang_getDiagnostic()}.</p>
     * </li>
     * <li>{@link #CXSaveError_InvalidTU SaveError_InvalidTU} - Indicates that the translation unit to be saved was somehow invalid (e.g., {@code NULL}).</li>
     * </ul>
     */
    public static final int
        CXSaveError_None              = 0,
        CXSaveError_Unknown           = 1,
        CXSaveError_TranslationErrors = 2,
        CXSaveError_InvalidTU         = 3;

    /**
     * Flags that control the reparsing of translation units. ({@code enum CXReparse_Flags})
     * 
     * <p>The enumerators in this enumeration type are meant to be bitwise ORed together to specify which options should be used when reparsing the translation
     * unit.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXReparse_None Reparse_None} - Used to indicate that no special reparsing options are needed.</li>
     * </ul>
     */
    public static final int CXReparse_None = 0x0;

    /**
     * Categorizes how memory is being used by a translation unit.
     * 
     * <p>({@code enum CXTUResourceUsageKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXTUResourceUsage_AST TUResourceUsage_AST}</li>
     * <li>{@link #CXTUResourceUsage_Identifiers TUResourceUsage_Identifiers}</li>
     * <li>{@link #CXTUResourceUsage_Selectors TUResourceUsage_Selectors}</li>
     * <li>{@link #CXTUResourceUsage_GlobalCompletionResults TUResourceUsage_GlobalCompletionResults}</li>
     * <li>{@link #CXTUResourceUsage_SourceManagerContentCache TUResourceUsage_SourceManagerContentCache}</li>
     * <li>{@link #CXTUResourceUsage_AST_SideTables TUResourceUsage_AST_SideTables}</li>
     * <li>{@link #CXTUResourceUsage_SourceManager_Membuffer_Malloc TUResourceUsage_SourceManager_Membuffer_Malloc}</li>
     * <li>{@link #CXTUResourceUsage_SourceManager_Membuffer_MMap TUResourceUsage_SourceManager_Membuffer_MMap}</li>
     * <li>{@link #CXTUResourceUsage_ExternalASTSource_Membuffer_Malloc TUResourceUsage_ExternalASTSource_Membuffer_Malloc}</li>
     * <li>{@link #CXTUResourceUsage_ExternalASTSource_Membuffer_MMap TUResourceUsage_ExternalASTSource_Membuffer_MMap}</li>
     * <li>{@link #CXTUResourceUsage_Preprocessor TUResourceUsage_Preprocessor}</li>
     * <li>{@link #CXTUResourceUsage_PreprocessingRecord TUResourceUsage_PreprocessingRecord}</li>
     * <li>{@link #CXTUResourceUsage_SourceManager_DataStructures TUResourceUsage_SourceManager_DataStructures}</li>
     * <li>{@link #CXTUResourceUsage_Preprocessor_HeaderSearch TUResourceUsage_Preprocessor_HeaderSearch}</li>
     * <li>{@link #CXTUResourceUsage_MEMORY_IN_BYTES_BEGIN TUResourceUsage_MEMORY_IN_BYTES_BEGIN}</li>
     * <li>{@link #CXTUResourceUsage_MEMORY_IN_BYTES_END TUResourceUsage_MEMORY_IN_BYTES_END}</li>
     * <li>{@link #CXTUResourceUsage_First TUResourceUsage_First}</li>
     * <li>{@link #CXTUResourceUsage_Last TUResourceUsage_Last}</li>
     * </ul>
     */
    public static final int
        CXTUResourceUsage_AST                                = 1,
        CXTUResourceUsage_Identifiers                        = 2,
        CXTUResourceUsage_Selectors                          = 3,
        CXTUResourceUsage_GlobalCompletionResults            = 4,
        CXTUResourceUsage_SourceManagerContentCache          = 5,
        CXTUResourceUsage_AST_SideTables                     = 6,
        CXTUResourceUsage_SourceManager_Membuffer_Malloc     = 7,
        CXTUResourceUsage_SourceManager_Membuffer_MMap       = 8,
        CXTUResourceUsage_ExternalASTSource_Membuffer_Malloc = 9,
        CXTUResourceUsage_ExternalASTSource_Membuffer_MMap   = 10,
        CXTUResourceUsage_Preprocessor                       = 11,
        CXTUResourceUsage_PreprocessingRecord                = 12,
        CXTUResourceUsage_SourceManager_DataStructures       = 13,
        CXTUResourceUsage_Preprocessor_HeaderSearch          = 14,
        CXTUResourceUsage_MEMORY_IN_BYTES_BEGIN              = CXTUResourceUsage_AST,
        CXTUResourceUsage_MEMORY_IN_BYTES_END                = CXTUResourceUsage_Preprocessor_HeaderSearch,
        CXTUResourceUsage_First                              = CXTUResourceUsage_AST,
        CXTUResourceUsage_Last                               = CXTUResourceUsage_Preprocessor_HeaderSearch;

    /**
     * Describes the kind of entity that a cursor refers to.
     * 
     * <p>({@code enum CXCursorKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCursor_UnexposedDecl Cursor_UnexposedDecl} - 
     * Declarations
     * 
     * <p>A declaration whose specific kind is not exposed via this interface.</p>
     * 
     * <p>Unexposed declarations have the same operations as any other kind of declaration; one can extract their location information, spelling, find their
     * definitions, etc. However, the specific kind of the declaration is not reported.</p>
     * </li>
     * <li>{@link #CXCursor_StructDecl Cursor_StructDecl} - A C or C++ struct.</li>
     * <li>{@link #CXCursor_UnionDecl Cursor_UnionDecl} - A C or C++ union.</li>
     * <li>{@link #CXCursor_ClassDecl Cursor_ClassDecl} - A C++ class.</li>
     * <li>{@link #CXCursor_EnumDecl Cursor_EnumDecl} - An enumeration.</li>
     * <li>{@link #CXCursor_FieldDecl Cursor_FieldDecl} - A field (in C) or non-static data member (in C++) in a struct, union, or C++ class.</li>
     * <li>{@link #CXCursor_EnumConstantDecl Cursor_EnumConstantDecl} - An enumerator constant.</li>
     * <li>{@link #CXCursor_FunctionDecl Cursor_FunctionDecl} - A function.</li>
     * <li>{@link #CXCursor_VarDecl Cursor_VarDecl} - A variable.</li>
     * <li>{@link #CXCursor_ParmDecl Cursor_ParmDecl} - A function or method parameter.</li>
     * <li>{@link #CXCursor_ObjCInterfaceDecl Cursor_ObjCInterfaceDecl} - An Objective-C @ interface.</li>
     * <li>{@link #CXCursor_ObjCCategoryDecl Cursor_ObjCCategoryDecl} - An Objective-C @ interface for a category.</li>
     * <li>{@link #CXCursor_ObjCProtocolDecl Cursor_ObjCProtocolDecl} - An Objective-C @ protocol declaration.</li>
     * <li>{@link #CXCursor_ObjCPropertyDecl Cursor_ObjCPropertyDecl} - An Objective-C @ property declaration.</li>
     * <li>{@link #CXCursor_ObjCIvarDecl Cursor_ObjCIvarDecl} - An Objective-C instance variable.</li>
     * <li>{@link #CXCursor_ObjCInstanceMethodDecl Cursor_ObjCInstanceMethodDecl} - An Objective-C instance method.</li>
     * <li>{@link #CXCursor_ObjCClassMethodDecl Cursor_ObjCClassMethodDecl} - An Objective-C class method.</li>
     * <li>{@link #CXCursor_ObjCImplementationDecl Cursor_ObjCImplementationDecl} - An Objective-C @ implementation.</li>
     * <li>{@link #CXCursor_ObjCCategoryImplDecl Cursor_ObjCCategoryImplDecl} - An Objective-C @ implementation for a category.</li>
     * <li>{@link #CXCursor_TypedefDecl Cursor_TypedefDecl} - A typedef.</li>
     * <li>{@link #CXCursor_CXXMethod Cursor_CXXMethod} - A C++ class method.</li>
     * <li>{@link #CXCursor_Namespace Cursor_Namespace} - A C++ namespace.</li>
     * <li>{@link #CXCursor_LinkageSpec Cursor_LinkageSpec} - A linkage specification, e.g. 'extern "C"'.</li>
     * <li>{@link #CXCursor_Constructor Cursor_Constructor} - A C++ constructor.</li>
     * <li>{@link #CXCursor_Destructor Cursor_Destructor} - A C++ destructor.</li>
     * <li>{@link #CXCursor_ConversionFunction Cursor_ConversionFunction} - A C++ conversion function.</li>
     * <li>{@link #CXCursor_TemplateTypeParameter Cursor_TemplateTypeParameter} - A C++ template type parameter.</li>
     * <li>{@link #CXCursor_NonTypeTemplateParameter Cursor_NonTypeTemplateParameter} - A C++ non-type template parameter.</li>
     * <li>{@link #CXCursor_TemplateTemplateParameter Cursor_TemplateTemplateParameter} - A C++ template template parameter.</li>
     * <li>{@link #CXCursor_FunctionTemplate Cursor_FunctionTemplate} - A C++ function template.</li>
     * <li>{@link #CXCursor_ClassTemplate Cursor_ClassTemplate} - A C++ class template.</li>
     * <li>{@link #CXCursor_ClassTemplatePartialSpecialization Cursor_ClassTemplatePartialSpecialization} - A C++ class template partial specialization.</li>
     * <li>{@link #CXCursor_NamespaceAlias Cursor_NamespaceAlias} - A C++ namespace alias declaration.</li>
     * <li>{@link #CXCursor_UsingDirective Cursor_UsingDirective} - A C++ using directive.</li>
     * <li>{@link #CXCursor_UsingDeclaration Cursor_UsingDeclaration} - A C++ using declaration.</li>
     * <li>{@link #CXCursor_TypeAliasDecl Cursor_TypeAliasDecl} - A C++ alias declaration</li>
     * <li>{@link #CXCursor_ObjCSynthesizeDecl Cursor_ObjCSynthesizeDecl} - An Objective-C @ synthesize definition.</li>
     * <li>{@link #CXCursor_ObjCDynamicDecl Cursor_ObjCDynamicDecl} - An Objective-C @ dynamic definition.</li>
     * <li>{@link #CXCursor_CXXAccessSpecifier Cursor_CXXAccessSpecifier} - An access specifier.</li>
     * <li>{@link #CXCursor_FirstDecl Cursor_FirstDecl} - An access specifier.</li>
     * <li>{@link #CXCursor_LastDecl Cursor_LastDecl} - An access specifier.</li>
     * <li>{@link #CXCursor_FirstRef Cursor_FirstRef} - Decl references</li>
     * <li>{@link #CXCursor_ObjCSuperClassRef Cursor_ObjCSuperClassRef}</li>
     * <li>{@link #CXCursor_ObjCProtocolRef Cursor_ObjCProtocolRef}</li>
     * <li>{@link #CXCursor_ObjCClassRef Cursor_ObjCClassRef}</li>
     * <li>{@link #CXCursor_TypeRef Cursor_TypeRef} - 
     * A reference to a type declaration.
     * 
     * <p>A type reference occurs anywhere where a type is named but not declared. For example, given:</p>
     * 
     * <pre><code>
     *  typedef unsigned size_type;
     *  size_type size;</code></pre>
     * 
     * <p>The typedef is a declaration of size_type (CXCursor_TypedefDecl), while the type of the variable "size" is referenced. The cursor referenced by the
     * type of size is the typedef for size_type.</p>
     * </li>
     * <li>{@link #CXCursor_CXXBaseSpecifier Cursor_CXXBaseSpecifier} - 
     * A reference to a type declaration.
     * 
     * <p>A type reference occurs anywhere where a type is named but not declared. For example, given:</p>
     * 
     * <pre><code>
     *  typedef unsigned size_type;
     *  size_type size;</code></pre>
     * 
     * <p>The typedef is a declaration of size_type (CXCursor_TypedefDecl), while the type of the variable "size" is referenced. The cursor referenced by the
     * type of size is the typedef for size_type.</p>
     * </li>
     * <li>{@link #CXCursor_TemplateRef Cursor_TemplateRef} - A reference to a class template, function template, template template parameter, or class template partial specialization.</li>
     * <li>{@link #CXCursor_NamespaceRef Cursor_NamespaceRef} - A reference to a namespace or namespace alias.</li>
     * <li>{@link #CXCursor_MemberRef Cursor_MemberRef} - A reference to a member of a struct, union, or class that occurs in some non-expression context, e.g., a designated initializer.</li>
     * <li>{@link #CXCursor_LabelRef Cursor_LabelRef} - 
     * A reference to a labeled statement.
     * 
     * <p>This cursor kind is used to describe the jump to "start_over" in the goto statement in the following example:</p>
     * 
     * <pre><code>
     *    start_over:
     *      ++counter;
     * 
     *      goto start_over;</code></pre>
     * 
     * <p>A label reference cursor refers to a label statement.</p>
     * </li>
     * <li>{@link #CXCursor_OverloadedDeclRef Cursor_OverloadedDeclRef} - 
     * A reference to a set of overloaded functions or function templates that has not yet been resolved to a specific function or function template.
     * 
     * <p>An overloaded declaration reference cursor occurs in C++ templates where a dependent name refers to a function. For example:</p>
     * 
     * <pre><code>
     *  template&lt;typename T&gt; void swap(T&amp;, T&amp;);
     * 
     *  struct X { ... };
     *  void swap(X&amp;, X&amp;);
     * 
     *  template&lt;typename T&gt;
     *  void reverse(T* first, T* last) {
     *    while (first &lt; last - 1) {
     *      swap(*first, *--last);
     *      ++first;
     *    }
     *  }
     * 
     *  struct Y { };
     *  void swap(Y&amp;, Y&amp;);</code></pre>
     * 
     * <p>Here, the identifier "swap" is associated with an overloaded declaration reference. In the template definition, "swap" refers to either of the two
     * "swap" functions declared above, so both results will be available. At instantiation time, "swap" may also refer to other functions found via
     * argument-dependent lookup (e.g., the "swap" function at the end of the example).</p>
     * 
     * <p>The functions {@code clang_getNumOverloadedDecls()} and {@code clang_getOverloadedDecl()} can be used to retrieve the definitions referenced by
     * this cursor.</p>
     * </li>
     * <li>{@link #CXCursor_VariableRef Cursor_VariableRef} - A reference to a variable that occurs in some non-expression context, e.g., a C++ lambda capture list.</li>
     * <li>{@link #CXCursor_LastRef Cursor_LastRef} - A reference to a variable that occurs in some non-expression context, e.g., a C++ lambda capture list.</li>
     * <li>{@link #CXCursor_FirstInvalid Cursor_FirstInvalid} - Error conditions</li>
     * <li>{@link #CXCursor_InvalidFile Cursor_InvalidFile} - Error conditions</li>
     * <li>{@link #CXCursor_NoDeclFound Cursor_NoDeclFound} - Error conditions</li>
     * <li>{@link #CXCursor_NotImplemented Cursor_NotImplemented} - Error conditions</li>
     * <li>{@link #CXCursor_InvalidCode Cursor_InvalidCode} - Error conditions</li>
     * <li>{@link #CXCursor_LastInvalid Cursor_LastInvalid} - Error conditions</li>
     * <li>{@link #CXCursor_FirstExpr Cursor_FirstExpr} - Expressions</li>
     * <li>{@link #CXCursor_UnexposedExpr Cursor_UnexposedExpr} - 
     * An expression whose specific kind is not exposed via this interface.
     * 
     * <p>Unexposed expressions have the same operations as any other kind of expression; one can extract their location information, spelling, children,
     * etc. However, the specific kind of the expression is not reported.</p>
     * </li>
     * <li>{@link #CXCursor_DeclRefExpr Cursor_DeclRefExpr} - An expression that refers to some value declaration, such as a function, variable, or enumerator.</li>
     * <li>{@link #CXCursor_MemberRefExpr Cursor_MemberRefExpr} - An expression that refers to a member of a struct, union, class, Objective-C class, etc.</li>
     * <li>{@link #CXCursor_CallExpr Cursor_CallExpr} - An expression that calls a function.</li>
     * <li>{@link #CXCursor_ObjCMessageExpr Cursor_ObjCMessageExpr} - An expression that sends a message to an Objective-C object or class.</li>
     * <li>{@link #CXCursor_BlockExpr Cursor_BlockExpr} - An expression that represents a block literal.</li>
     * <li>{@link #CXCursor_IntegerLiteral Cursor_IntegerLiteral} - An integer literal.</li>
     * <li>{@link #CXCursor_FloatingLiteral Cursor_FloatingLiteral} - A floating point number literal.</li>
     * <li>{@link #CXCursor_ImaginaryLiteral Cursor_ImaginaryLiteral} - An imaginary number literal.</li>
     * <li>{@link #CXCursor_StringLiteral Cursor_StringLiteral} - A string literal.</li>
     * <li>{@link #CXCursor_CharacterLiteral Cursor_CharacterLiteral} - A character literal.</li>
     * <li>{@link #CXCursor_ParenExpr Cursor_ParenExpr} - 
     * A parenthesized expression, e.g. "(1)".
     * 
     * <p>This AST node is only formed if full location information is requested.</p>
     * </li>
     * <li>{@link #CXCursor_UnaryOperator Cursor_UnaryOperator} - This represents the unary-expression's (except sizeof and alignof).</li>
     * <li>{@link #CXCursor_ArraySubscriptExpr Cursor_ArraySubscriptExpr} - [C99 6.5.2.1] Array Subscripting.</li>
     * <li>{@link #CXCursor_BinaryOperator Cursor_BinaryOperator} - A builtin binary operation expression such as "x + y" or "x &lt;= y".</li>
     * <li>{@link #CXCursor_CompoundAssignOperator Cursor_CompoundAssignOperator} - Compound assignment such as "+=".</li>
     * <li>{@link #CXCursor_ConditionalOperator Cursor_ConditionalOperator} - The ?: ternary operator.</li>
     * <li>{@link #CXCursor_CStyleCastExpr Cursor_CStyleCastExpr} - 
     * An explicit cast in C (C99 6.5.4) or a C-style cast in C++ (C++ [expr.cast]), which uses the syntax (Type)expr.
     * 
     * <p>For example: (int)f.</p>
     * </li>
     * <li>{@link #CXCursor_CompoundLiteralExpr Cursor_CompoundLiteralExpr} - [C99 6.5.2.5]</li>
     * <li>{@link #CXCursor_InitListExpr Cursor_InitListExpr} - Describes an C or C++ initializer list.</li>
     * <li>{@link #CXCursor_AddrLabelExpr Cursor_AddrLabelExpr} - The GNU address of label extension, representing {@code &&label}.</li>
     * <li>{@link #CXCursor_StmtExpr Cursor_StmtExpr} - This is the GNU Statement Expression extension: ({int X=4; X;})</li>
     * <li>{@link #CXCursor_GenericSelectionExpr Cursor_GenericSelectionExpr} - Represents a C11 generic selection.</li>
     * <li>{@link #CXCursor_GNUNullExpr Cursor_GNUNullExpr} - 
     * Implements the GNU __null extension, which is a name for a null pointer constant that has integral type (e.g., int or long) and is the same size
     * and alignment as a pointer.
     * 
     * <p>The __null extension is typically only used by system headers, which define {@code NULL} as __null in C++ rather than using 0 (which is an integer that
     * may not match the size of a pointer).</p>
     * </li>
     * <li>{@link #CXCursor_CXXStaticCastExpr Cursor_CXXStaticCastExpr} - C++'s static_cast &lt;&gt; expression.</li>
     * <li>{@link #CXCursor_CXXDynamicCastExpr Cursor_CXXDynamicCastExpr} - C++'s dynamic_cast &lt;&gt; expression.</li>
     * <li>{@link #CXCursor_CXXReinterpretCastExpr Cursor_CXXReinterpretCastExpr} - C++'s reinterpret_cast &lt;&gt; expression.</li>
     * <li>{@link #CXCursor_CXXConstCastExpr Cursor_CXXConstCastExpr} - C++'s const_cast &lt;&gt; expression.</li>
     * <li>{@link #CXCursor_CXXFunctionalCastExpr Cursor_CXXFunctionalCastExpr} - 
     * Represents an explicit C++ type conversion that uses "functional" notion (C++ [expr.type.conv]).
     * 
     * <p>Example:</p>
     * 
     * <pre><code>
     *    x = int(0.5);</code></pre>
     * </li>
     * <li>{@link #CXCursor_CXXTypeidExpr Cursor_CXXTypeidExpr} - A C++ typeid expression (C++ [expr.typeid]).</li>
     * <li>{@link #CXCursor_CXXBoolLiteralExpr Cursor_CXXBoolLiteralExpr} - [C++ 2.13.5] C++ Boolean Literal.</li>
     * <li>{@link #CXCursor_CXXNullPtrLiteralExpr Cursor_CXXNullPtrLiteralExpr} - [C++0x 2.14.7] C++ Pointer Literal.</li>
     * <li>{@link #CXCursor_CXXThisExpr Cursor_CXXThisExpr} - Represents the "this" expression in C++</li>
     * <li>{@link #CXCursor_CXXThrowExpr Cursor_CXXThrowExpr} - 
     * [C++ 15] C++ Throw Expression.
     * 
     * <p>This handles 'throw' and 'throw' assignment-expression. When assignment-expression isn't present, Op will be null.</p>
     * </li>
     * <li>{@link #CXCursor_CXXNewExpr Cursor_CXXNewExpr} - A new expression for memory allocation and constructor calls, e.g: "new CXXNewExpr(foo)".</li>
     * <li>{@link #CXCursor_CXXDeleteExpr Cursor_CXXDeleteExpr} - A delete expression for memory deallocation and destructor calls, e.g. "delete[] pArray".</li>
     * <li>{@link #CXCursor_UnaryExpr Cursor_UnaryExpr} - A unary expression. (noexcept, sizeof, or other traits)</li>
     * <li>{@link #CXCursor_ObjCStringLiteral Cursor_ObjCStringLiteral} - An Objective-C string literal i.e. " foo".</li>
     * <li>{@link #CXCursor_ObjCEncodeExpr Cursor_ObjCEncodeExpr} - An Objective-C @ encode expression.</li>
     * <li>{@link #CXCursor_ObjCSelectorExpr Cursor_ObjCSelectorExpr} - An Objective-C @ selector expression.</li>
     * <li>{@link #CXCursor_ObjCProtocolExpr Cursor_ObjCProtocolExpr} - An Objective-C @ protocol expression.</li>
     * <li>{@link #CXCursor_ObjCBridgedCastExpr Cursor_ObjCBridgedCastExpr} - 
     * An Objective-C "bridged" cast expression, which casts between Objective-C pointers and C pointers, transferring ownership in the process.
     * 
     * <pre><code>
     *    NSString *str = (__bridge_transfer NSString *)CFCreateString();</code></pre>
     * </li>
     * <li>{@link #CXCursor_PackExpansionExpr Cursor_PackExpansionExpr} - 
     * Represents a C++0x pack expansion that produces a sequence of expressions.
     * 
     * <p>A pack expansion expression contains a pattern (which itself is an expression) followed by an ellipsis. For example:</p>
     * 
     * <pre><code>
     *  template&lt;typename F, typename ...Types&gt;
     *  void forward(F f, Types &amp;&amp;...args) {
     *   f(static_cast&lt;Types&amp;&amp;&gt;(args)...);
     *  }</code></pre>
     * </li>
     * <li>{@link #CXCursor_SizeOfPackExpr Cursor_SizeOfPackExpr} - 
     * Represents an expression that computes the length of a parameter pack.
     * 
     * <pre><code>
     *  template&lt;typename ...Types&gt;
     *  struct count {
     *    static const unsigned value = sizeof...(Types);
     *  };</code></pre>
     * </li>
     * <li>{@link #CXCursor_LambdaExpr Cursor_LambdaExpr} - 
     * Represents a C++ lambda expression that produces a local function object.
     * 
     * <pre><code>
     *  void abssort(float *x, unsigned N) {
     *    std::sort(x, x + N,
     *              [](float a, float b) {
     *                return std::abs(a) &lt; std::abs(b);
     *              });
     *  }</code></pre>
     * </li>
     * <li>{@link #CXCursor_ObjCBoolLiteralExpr Cursor_ObjCBoolLiteralExpr} - Objective-c Boolean Literal.</li>
     * <li>{@link #CXCursor_ObjCSelfExpr Cursor_ObjCSelfExpr} - Represents the "self" expression in an Objective-C method.</li>
     * <li>{@link #CXCursor_OMPArraySectionExpr Cursor_OMPArraySectionExpr} - OpenMP 4.0 [2.4, Array Section].</li>
     * <li>{@link #CXCursor_ObjCAvailabilityCheckExpr Cursor_ObjCAvailabilityCheckExpr} - Represents an {@code @available (...)} check.</li>
     * <li>{@link #CXCursor_FixedPointLiteral Cursor_FixedPointLiteral} - Fixed point literal</li>
     * <li>{@link #CXCursor_LastExpr Cursor_LastExpr} - Fixed point literal</li>
     * <li>{@link #CXCursor_FirstStmt Cursor_FirstStmt} - Statements</li>
     * <li>{@link #CXCursor_UnexposedStmt Cursor_UnexposedStmt} - 
     * A statement whose specific kind is not exposed via this interface.
     * 
     * <p>Unexposed statements have the same operations as any other kind of statement; one can extract their location information, spelling, children, etc.
     * However, the specific kind of the statement is not reported.</p>
     * </li>
     * <li>{@link #CXCursor_LabelStmt Cursor_LabelStmt} - 
     * A labelled statement in a function.
     * 
     * <p>This cursor kind is used to describe the "start_over:" label statement in the following example:</p>
     * 
     * <pre><code>
     *    start_over:
     *      ++counter;</code></pre>
     * </li>
     * <li>{@link #CXCursor_CompoundStmt Cursor_CompoundStmt} - 
     * A group of statements like { stmt stmt }.
     * 
     * <p>This cursor kind is used to describe compound statements, e.g. function bodies.</p>
     * </li>
     * <li>{@link #CXCursor_CaseStmt Cursor_CaseStmt} - A case statement.</li>
     * <li>{@link #CXCursor_DefaultStmt Cursor_DefaultStmt} - A default statement.</li>
     * <li>{@link #CXCursor_IfStmt Cursor_IfStmt} - An if statement</li>
     * <li>{@link #CXCursor_SwitchStmt Cursor_SwitchStmt} - A switch statement.</li>
     * <li>{@link #CXCursor_WhileStmt Cursor_WhileStmt} - A while statement.</li>
     * <li>{@link #CXCursor_DoStmt Cursor_DoStmt} - A do statement.</li>
     * <li>{@link #CXCursor_ForStmt Cursor_ForStmt} - A for statement.</li>
     * <li>{@link #CXCursor_GotoStmt Cursor_GotoStmt} - A goto statement.</li>
     * <li>{@link #CXCursor_IndirectGotoStmt Cursor_IndirectGotoStmt} - An indirect goto statement.</li>
     * <li>{@link #CXCursor_ContinueStmt Cursor_ContinueStmt} - A continue statement.</li>
     * <li>{@link #CXCursor_BreakStmt Cursor_BreakStmt} - A break statement.</li>
     * <li>{@link #CXCursor_ReturnStmt Cursor_ReturnStmt} - A return statement.</li>
     * <li>{@link #CXCursor_GCCAsmStmt Cursor_GCCAsmStmt} - A GCC inline assembly statement extension.</li>
     * <li>{@link #CXCursor_AsmStmt Cursor_AsmStmt} - A GCC inline assembly statement extension.</li>
     * <li>{@link #CXCursor_ObjCAtTryStmt Cursor_ObjCAtTryStmt} - Objective-C's overall @ try- @ catch- @ finally statement.</li>
     * <li>{@link #CXCursor_ObjCAtCatchStmt Cursor_ObjCAtCatchStmt} - Objective-C's @ catch statement.</li>
     * <li>{@link #CXCursor_ObjCAtFinallyStmt Cursor_ObjCAtFinallyStmt} - Objective-C's @ finally statement.</li>
     * <li>{@link #CXCursor_ObjCAtThrowStmt Cursor_ObjCAtThrowStmt} - Objective-C's @ throw statement.</li>
     * <li>{@link #CXCursor_ObjCAtSynchronizedStmt Cursor_ObjCAtSynchronizedStmt} - Objective-C's @ synchronized statement.</li>
     * <li>{@link #CXCursor_ObjCAutoreleasePoolStmt Cursor_ObjCAutoreleasePoolStmt} - Objective-C's autorelease pool statement.</li>
     * <li>{@link #CXCursor_ObjCForCollectionStmt Cursor_ObjCForCollectionStmt} - Objective-C's collection statement.</li>
     * <li>{@link #CXCursor_CXXCatchStmt Cursor_CXXCatchStmt} - C++'s catch statement.</li>
     * <li>{@link #CXCursor_CXXTryStmt Cursor_CXXTryStmt} - C++'s try statement.</li>
     * <li>{@link #CXCursor_CXXForRangeStmt Cursor_CXXForRangeStmt} - C++'s for (* : *) statement.</li>
     * <li>{@link #CXCursor_SEHTryStmt Cursor_SEHTryStmt} - Windows Structured Exception Handling's try statement.</li>
     * <li>{@link #CXCursor_SEHExceptStmt Cursor_SEHExceptStmt} - Windows Structured Exception Handling's except statement.</li>
     * <li>{@link #CXCursor_SEHFinallyStmt Cursor_SEHFinallyStmt} - Windows Structured Exception Handling's finally statement.</li>
     * <li>{@link #CXCursor_MSAsmStmt Cursor_MSAsmStmt} - A MS inline assembly statement extension.</li>
     * <li>{@link #CXCursor_NullStmt Cursor_NullStmt} - 
     * The null statement ";": C99 6.8.3p3.
     * 
     * <p>This cursor kind is used to describe the null statement.</p>
     * </li>
     * <li>{@link #CXCursor_DeclStmt Cursor_DeclStmt} - Adaptor class for mixing declarations with statements and expressions.</li>
     * <li>{@link #CXCursor_OMPParallelDirective Cursor_OMPParallelDirective} - OpenMP parallel directive.</li>
     * <li>{@link #CXCursor_OMPSimdDirective Cursor_OMPSimdDirective} - OpenMP SIMD directive.</li>
     * <li>{@link #CXCursor_OMPForDirective Cursor_OMPForDirective} - OpenMP for directive.</li>
     * <li>{@link #CXCursor_OMPSectionsDirective Cursor_OMPSectionsDirective} - OpenMP sections directive.</li>
     * <li>{@link #CXCursor_OMPSectionDirective Cursor_OMPSectionDirective} - OpenMP section directive.</li>
     * <li>{@link #CXCursor_OMPSingleDirective Cursor_OMPSingleDirective} - OpenMP single directive.</li>
     * <li>{@link #CXCursor_OMPParallelForDirective Cursor_OMPParallelForDirective} - OpenMP parallel for directive.</li>
     * <li>{@link #CXCursor_OMPParallelSectionsDirective Cursor_OMPParallelSectionsDirective} - OpenMP parallel sections directive.</li>
     * <li>{@link #CXCursor_OMPTaskDirective Cursor_OMPTaskDirective} - OpenMP task directive.</li>
     * <li>{@link #CXCursor_OMPMasterDirective Cursor_OMPMasterDirective} - OpenMP master directive.</li>
     * <li>{@link #CXCursor_OMPCriticalDirective Cursor_OMPCriticalDirective} - OpenMP critical directive.</li>
     * <li>{@link #CXCursor_OMPTaskyieldDirective Cursor_OMPTaskyieldDirective} - OpenMP taskyield directive.</li>
     * <li>{@link #CXCursor_OMPBarrierDirective Cursor_OMPBarrierDirective} - OpenMP barrier directive.</li>
     * <li>{@link #CXCursor_OMPTaskwaitDirective Cursor_OMPTaskwaitDirective} - OpenMP taskwait directive.</li>
     * <li>{@link #CXCursor_OMPFlushDirective Cursor_OMPFlushDirective} - OpenMP flush directive.</li>
     * <li>{@link #CXCursor_SEHLeaveStmt Cursor_SEHLeaveStmt} - Windows Structured Exception Handling's leave statement.</li>
     * <li>{@link #CXCursor_OMPOrderedDirective Cursor_OMPOrderedDirective} - OpenMP ordered directive.</li>
     * <li>{@link #CXCursor_OMPAtomicDirective Cursor_OMPAtomicDirective} - OpenMP atomic directive.</li>
     * <li>{@link #CXCursor_OMPForSimdDirective Cursor_OMPForSimdDirective} - OpenMP for SIMD directive.</li>
     * <li>{@link #CXCursor_OMPParallelForSimdDirective Cursor_OMPParallelForSimdDirective} - OpenMP parallel for SIMD directive.</li>
     * <li>{@link #CXCursor_OMPTargetDirective Cursor_OMPTargetDirective} - OpenMP target directive.</li>
     * <li>{@link #CXCursor_OMPTeamsDirective Cursor_OMPTeamsDirective} - OpenMP teams directive.</li>
     * <li>{@link #CXCursor_OMPTaskgroupDirective Cursor_OMPTaskgroupDirective} - OpenMP taskgroup directive.</li>
     * <li>{@link #CXCursor_OMPCancellationPointDirective Cursor_OMPCancellationPointDirective} - OpenMP cancellation point directive.</li>
     * <li>{@link #CXCursor_OMPCancelDirective Cursor_OMPCancelDirective} - OpenMP cancel directive.</li>
     * <li>{@link #CXCursor_OMPTargetDataDirective Cursor_OMPTargetDataDirective} - OpenMP target data directive.</li>
     * <li>{@link #CXCursor_OMPTaskLoopDirective Cursor_OMPTaskLoopDirective} - OpenMP taskloop directive.</li>
     * <li>{@link #CXCursor_OMPTaskLoopSimdDirective Cursor_OMPTaskLoopSimdDirective} - OpenMP taskloop simd directive.</li>
     * <li>{@link #CXCursor_OMPDistributeDirective Cursor_OMPDistributeDirective} - OpenMP distribute directive.</li>
     * <li>{@link #CXCursor_OMPTargetEnterDataDirective Cursor_OMPTargetEnterDataDirective} - OpenMP target enter data directive.</li>
     * <li>{@link #CXCursor_OMPTargetExitDataDirective Cursor_OMPTargetExitDataDirective} - OpenMP target exit data directive.</li>
     * <li>{@link #CXCursor_OMPTargetParallelDirective Cursor_OMPTargetParallelDirective} - OpenMP target parallel directive.</li>
     * <li>{@link #CXCursor_OMPTargetParallelForDirective Cursor_OMPTargetParallelForDirective} - OpenMP target parallel for directive.</li>
     * <li>{@link #CXCursor_OMPTargetUpdateDirective Cursor_OMPTargetUpdateDirective} - OpenMP target update directive.</li>
     * <li>{@link #CXCursor_OMPDistributeParallelForDirective Cursor_OMPDistributeParallelForDirective} - OpenMP distribute parallel for directive.</li>
     * <li>{@link #CXCursor_OMPDistributeParallelForSimdDirective Cursor_OMPDistributeParallelForSimdDirective} - OpenMP distribute parallel for simd directive.</li>
     * <li>{@link #CXCursor_OMPDistributeSimdDirective Cursor_OMPDistributeSimdDirective} - OpenMP distribute simd directive.</li>
     * <li>{@link #CXCursor_OMPTargetParallelForSimdDirective Cursor_OMPTargetParallelForSimdDirective} - OpenMP target parallel for simd directive.</li>
     * <li>{@link #CXCursor_OMPTargetSimdDirective Cursor_OMPTargetSimdDirective} - OpenMP target simd directive.</li>
     * <li>{@link #CXCursor_OMPTeamsDistributeDirective Cursor_OMPTeamsDistributeDirective} - OpenMP teams distribute directive.</li>
     * <li>{@link #CXCursor_OMPTeamsDistributeSimdDirective Cursor_OMPTeamsDistributeSimdDirective} - OpenMP teams distribute simd directive.</li>
     * <li>{@link #CXCursor_OMPTeamsDistributeParallelForSimdDirective Cursor_OMPTeamsDistributeParallelForSimdDirective} - OpenMP teams distribute parallel for simd directive.</li>
     * <li>{@link #CXCursor_OMPTeamsDistributeParallelForDirective Cursor_OMPTeamsDistributeParallelForDirective} - OpenMP teams distribute parallel for directive.</li>
     * <li>{@link #CXCursor_OMPTargetTeamsDirective Cursor_OMPTargetTeamsDirective} - OpenMP target teams directive.</li>
     * <li>{@link #CXCursor_OMPTargetTeamsDistributeDirective Cursor_OMPTargetTeamsDistributeDirective} - OpenMP target teams distribute directive.</li>
     * <li>{@link #CXCursor_OMPTargetTeamsDistributeParallelForDirective Cursor_OMPTargetTeamsDistributeParallelForDirective} - OpenMP target teams distribute parallel for directive.</li>
     * <li>{@link #CXCursor_OMPTargetTeamsDistributeParallelForSimdDirective Cursor_OMPTargetTeamsDistributeParallelForSimdDirective} - OpenMP target teams distribute parallel for simd directive.</li>
     * <li>{@link #CXCursor_OMPTargetTeamsDistributeSimdDirective Cursor_OMPTargetTeamsDistributeSimdDirective} - OpenMP target teams distribute simd directive.</li>
     * <li>{@link #CXCursor_LastStmt Cursor_LastStmt} - OpenMP target teams distribute simd directive.</li>
     * <li>{@link #CXCursor_TranslationUnit Cursor_TranslationUnit} - 
     * Cursor that represents the translation unit itself.
     * 
     * <p>The translation unit cursor exists primarily to act as the root cursor for traversing the contents of a translation unit.</p>
     * </li>
     * <li>{@link #CXCursor_FirstAttr Cursor_FirstAttr} - Attributes</li>
     * <li>{@link #CXCursor_UnexposedAttr Cursor_UnexposedAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_IBActionAttr Cursor_IBActionAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_IBOutletAttr Cursor_IBOutletAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_IBOutletCollectionAttr Cursor_IBOutletCollectionAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_CXXFinalAttr Cursor_CXXFinalAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_CXXOverrideAttr Cursor_CXXOverrideAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_AnnotateAttr Cursor_AnnotateAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_AsmLabelAttr Cursor_AsmLabelAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_PackedAttr Cursor_PackedAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_PureAttr Cursor_PureAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ConstAttr Cursor_ConstAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_NoDuplicateAttr Cursor_NoDuplicateAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_CUDAConstantAttr Cursor_CUDAConstantAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_CUDADeviceAttr Cursor_CUDADeviceAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_CUDAGlobalAttr Cursor_CUDAGlobalAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_CUDAHostAttr Cursor_CUDAHostAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_CUDASharedAttr Cursor_CUDASharedAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_VisibilityAttr Cursor_VisibilityAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_DLLExport Cursor_DLLExport} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_DLLImport Cursor_DLLImport} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_NSReturnsRetained Cursor_NSReturnsRetained} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_NSReturnsNotRetained Cursor_NSReturnsNotRetained} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_NSReturnsAutoreleased Cursor_NSReturnsAutoreleased} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_NSConsumesSelf Cursor_NSConsumesSelf} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_NSConsumed Cursor_NSConsumed} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCException Cursor_ObjCException} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCNSObject Cursor_ObjCNSObject} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCIndependentClass Cursor_ObjCIndependentClass} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCPreciseLifetime Cursor_ObjCPreciseLifetime} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCReturnsInnerPointer Cursor_ObjCReturnsInnerPointer} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCRequiresSuper Cursor_ObjCRequiresSuper} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCRootClass Cursor_ObjCRootClass} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCSubclassingRestricted Cursor_ObjCSubclassingRestricted} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCExplicitProtocolImpl Cursor_ObjCExplicitProtocolImpl} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCDesignatedInitializer Cursor_ObjCDesignatedInitializer} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCRuntimeVisible Cursor_ObjCRuntimeVisible} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_ObjCBoxable Cursor_ObjCBoxable} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_FlagEnum Cursor_FlagEnum} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_LastAttr Cursor_LastAttr} - An attribute whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXCursor_PreprocessingDirective Cursor_PreprocessingDirective} - Preprocessing</li>
     * <li>{@link #CXCursor_MacroDefinition Cursor_MacroDefinition} - Preprocessing</li>
     * <li>{@link #CXCursor_MacroExpansion Cursor_MacroExpansion} - Preprocessing</li>
     * <li>{@link #CXCursor_MacroInstantiation Cursor_MacroInstantiation} - Preprocessing</li>
     * <li>{@link #CXCursor_InclusionDirective Cursor_InclusionDirective} - Preprocessing</li>
     * <li>{@link #CXCursor_FirstPreprocessing Cursor_FirstPreprocessing} - Preprocessing</li>
     * <li>{@link #CXCursor_LastPreprocessing Cursor_LastPreprocessing} - Preprocessing</li>
     * <li>{@link #CXCursor_ModuleImportDecl Cursor_ModuleImportDecl} - 
     * Extra Declarations
     * 
     * <p>A module import declaration.</p>
     * </li>
     * <li>{@link #CXCursor_TypeAliasTemplateDecl Cursor_TypeAliasTemplateDecl} - 
     * Extra Declarations
     * 
     * <p>A module import declaration.</p>
     * </li>
     * <li>{@link #CXCursor_StaticAssert Cursor_StaticAssert} - A static_assert or _Static_assert node</li>
     * <li>{@link #CXCursor_FriendDecl Cursor_FriendDecl} - a friend declaration.</li>
     * <li>{@link #CXCursor_FirstExtraDecl Cursor_FirstExtraDecl} - a friend declaration.</li>
     * <li>{@link #CXCursor_LastExtraDecl Cursor_LastExtraDecl} - a friend declaration.</li>
     * <li>{@link #CXCursor_OverloadCandidate Cursor_OverloadCandidate} - A code completion overload candidate.</li>
     * </ul>
     */
    public static final int
        CXCursor_UnexposedDecl                                    = 1,
        CXCursor_StructDecl                                       = 2,
        CXCursor_UnionDecl                                        = 3,
        CXCursor_ClassDecl                                        = 4,
        CXCursor_EnumDecl                                         = 5,
        CXCursor_FieldDecl                                        = 6,
        CXCursor_EnumConstantDecl                                 = 7,
        CXCursor_FunctionDecl                                     = 8,
        CXCursor_VarDecl                                          = 9,
        CXCursor_ParmDecl                                         = 10,
        CXCursor_ObjCInterfaceDecl                                = 11,
        CXCursor_ObjCCategoryDecl                                 = 12,
        CXCursor_ObjCProtocolDecl                                 = 13,
        CXCursor_ObjCPropertyDecl                                 = 14,
        CXCursor_ObjCIvarDecl                                     = 15,
        CXCursor_ObjCInstanceMethodDecl                           = 16,
        CXCursor_ObjCClassMethodDecl                              = 17,
        CXCursor_ObjCImplementationDecl                           = 18,
        CXCursor_ObjCCategoryImplDecl                             = 19,
        CXCursor_TypedefDecl                                      = 20,
        CXCursor_CXXMethod                                        = 21,
        CXCursor_Namespace                                        = 22,
        CXCursor_LinkageSpec                                      = 23,
        CXCursor_Constructor                                      = 24,
        CXCursor_Destructor                                       = 25,
        CXCursor_ConversionFunction                               = 26,
        CXCursor_TemplateTypeParameter                            = 27,
        CXCursor_NonTypeTemplateParameter                         = 28,
        CXCursor_TemplateTemplateParameter                        = 29,
        CXCursor_FunctionTemplate                                 = 30,
        CXCursor_ClassTemplate                                    = 31,
        CXCursor_ClassTemplatePartialSpecialization               = 32,
        CXCursor_NamespaceAlias                                   = 33,
        CXCursor_UsingDirective                                   = 34,
        CXCursor_UsingDeclaration                                 = 35,
        CXCursor_TypeAliasDecl                                    = 36,
        CXCursor_ObjCSynthesizeDecl                               = 37,
        CXCursor_ObjCDynamicDecl                                  = 38,
        CXCursor_CXXAccessSpecifier                               = 39,
        CXCursor_FirstDecl                                        = CXCursor_UnexposedDecl,
        CXCursor_LastDecl                                         = CXCursor_CXXAccessSpecifier,
        CXCursor_FirstRef                                         = 40,
        CXCursor_ObjCSuperClassRef                                = 40,
        CXCursor_ObjCProtocolRef                                  = 41,
        CXCursor_ObjCClassRef                                     = 42,
        CXCursor_TypeRef                                          = 43,
        CXCursor_CXXBaseSpecifier                                 = 44,
        CXCursor_TemplateRef                                      = 45,
        CXCursor_NamespaceRef                                     = 46,
        CXCursor_MemberRef                                        = 47,
        CXCursor_LabelRef                                         = 48,
        CXCursor_OverloadedDeclRef                                = 49,
        CXCursor_VariableRef                                      = 50,
        CXCursor_LastRef                                          = CXCursor_VariableRef,
        CXCursor_FirstInvalid                                     = 70,
        CXCursor_InvalidFile                                      = 70,
        CXCursor_NoDeclFound                                      = 71,
        CXCursor_NotImplemented                                   = 72,
        CXCursor_InvalidCode                                      = 73,
        CXCursor_LastInvalid                                      = CXCursor_InvalidCode,
        CXCursor_FirstExpr                                        = 100,
        CXCursor_UnexposedExpr                                    = 100,
        CXCursor_DeclRefExpr                                      = 101,
        CXCursor_MemberRefExpr                                    = 102,
        CXCursor_CallExpr                                         = 103,
        CXCursor_ObjCMessageExpr                                  = 104,
        CXCursor_BlockExpr                                        = 105,
        CXCursor_IntegerLiteral                                   = 106,
        CXCursor_FloatingLiteral                                  = 107,
        CXCursor_ImaginaryLiteral                                 = 108,
        CXCursor_StringLiteral                                    = 109,
        CXCursor_CharacterLiteral                                 = 110,
        CXCursor_ParenExpr                                        = 111,
        CXCursor_UnaryOperator                                    = 112,
        CXCursor_ArraySubscriptExpr                               = 113,
        CXCursor_BinaryOperator                                   = 114,
        CXCursor_CompoundAssignOperator                           = 115,
        CXCursor_ConditionalOperator                              = 116,
        CXCursor_CStyleCastExpr                                   = 117,
        CXCursor_CompoundLiteralExpr                              = 118,
        CXCursor_InitListExpr                                     = 119,
        CXCursor_AddrLabelExpr                                    = 120,
        CXCursor_StmtExpr                                         = 121,
        CXCursor_GenericSelectionExpr                             = 122,
        CXCursor_GNUNullExpr                                      = 123,
        CXCursor_CXXStaticCastExpr                                = 124,
        CXCursor_CXXDynamicCastExpr                               = 125,
        CXCursor_CXXReinterpretCastExpr                           = 126,
        CXCursor_CXXConstCastExpr                                 = 127,
        CXCursor_CXXFunctionalCastExpr                            = 128,
        CXCursor_CXXTypeidExpr                                    = 129,
        CXCursor_CXXBoolLiteralExpr                               = 130,
        CXCursor_CXXNullPtrLiteralExpr                            = 131,
        CXCursor_CXXThisExpr                                      = 132,
        CXCursor_CXXThrowExpr                                     = 133,
        CXCursor_CXXNewExpr                                       = 134,
        CXCursor_CXXDeleteExpr                                    = 135,
        CXCursor_UnaryExpr                                        = 136,
        CXCursor_ObjCStringLiteral                                = 137,
        CXCursor_ObjCEncodeExpr                                   = 138,
        CXCursor_ObjCSelectorExpr                                 = 139,
        CXCursor_ObjCProtocolExpr                                 = 140,
        CXCursor_ObjCBridgedCastExpr                              = 141,
        CXCursor_PackExpansionExpr                                = 142,
        CXCursor_SizeOfPackExpr                                   = 143,
        CXCursor_LambdaExpr                                       = 144,
        CXCursor_ObjCBoolLiteralExpr                              = 145,
        CXCursor_ObjCSelfExpr                                     = 146,
        CXCursor_OMPArraySectionExpr                              = 147,
        CXCursor_ObjCAvailabilityCheckExpr                        = 148,
        CXCursor_FixedPointLiteral                                = 149,
        CXCursor_LastExpr                                         = CXCursor_FixedPointLiteral,
        CXCursor_FirstStmt                                        = 200,
        CXCursor_UnexposedStmt                                    = 200,
        CXCursor_LabelStmt                                        = 201,
        CXCursor_CompoundStmt                                     = 202,
        CXCursor_CaseStmt                                         = 203,
        CXCursor_DefaultStmt                                      = 204,
        CXCursor_IfStmt                                           = 205,
        CXCursor_SwitchStmt                                       = 206,
        CXCursor_WhileStmt                                        = 207,
        CXCursor_DoStmt                                           = 208,
        CXCursor_ForStmt                                          = 209,
        CXCursor_GotoStmt                                         = 210,
        CXCursor_IndirectGotoStmt                                 = 211,
        CXCursor_ContinueStmt                                     = 212,
        CXCursor_BreakStmt                                        = 213,
        CXCursor_ReturnStmt                                       = 214,
        CXCursor_GCCAsmStmt                                       = 215,
        CXCursor_AsmStmt                                          = CXCursor_GCCAsmStmt,
        CXCursor_ObjCAtTryStmt                                    = 216,
        CXCursor_ObjCAtCatchStmt                                  = 217,
        CXCursor_ObjCAtFinallyStmt                                = 218,
        CXCursor_ObjCAtThrowStmt                                  = 219,
        CXCursor_ObjCAtSynchronizedStmt                           = 220,
        CXCursor_ObjCAutoreleasePoolStmt                          = 221,
        CXCursor_ObjCForCollectionStmt                            = 222,
        CXCursor_CXXCatchStmt                                     = 223,
        CXCursor_CXXTryStmt                                       = 224,
        CXCursor_CXXForRangeStmt                                  = 225,
        CXCursor_SEHTryStmt                                       = 226,
        CXCursor_SEHExceptStmt                                    = 227,
        CXCursor_SEHFinallyStmt                                   = 228,
        CXCursor_MSAsmStmt                                        = 229,
        CXCursor_NullStmt                                         = 230,
        CXCursor_DeclStmt                                         = 231,
        CXCursor_OMPParallelDirective                             = 232,
        CXCursor_OMPSimdDirective                                 = 233,
        CXCursor_OMPForDirective                                  = 234,
        CXCursor_OMPSectionsDirective                             = 235,
        CXCursor_OMPSectionDirective                              = 236,
        CXCursor_OMPSingleDirective                               = 237,
        CXCursor_OMPParallelForDirective                          = 238,
        CXCursor_OMPParallelSectionsDirective                     = 239,
        CXCursor_OMPTaskDirective                                 = 240,
        CXCursor_OMPMasterDirective                               = 241,
        CXCursor_OMPCriticalDirective                             = 242,
        CXCursor_OMPTaskyieldDirective                            = 243,
        CXCursor_OMPBarrierDirective                              = 244,
        CXCursor_OMPTaskwaitDirective                             = 245,
        CXCursor_OMPFlushDirective                                = 246,
        CXCursor_SEHLeaveStmt                                     = 247,
        CXCursor_OMPOrderedDirective                              = 248,
        CXCursor_OMPAtomicDirective                               = 249,
        CXCursor_OMPForSimdDirective                              = 250,
        CXCursor_OMPParallelForSimdDirective                      = 251,
        CXCursor_OMPTargetDirective                               = 252,
        CXCursor_OMPTeamsDirective                                = 253,
        CXCursor_OMPTaskgroupDirective                            = 254,
        CXCursor_OMPCancellationPointDirective                    = 255,
        CXCursor_OMPCancelDirective                               = 256,
        CXCursor_OMPTargetDataDirective                           = 257,
        CXCursor_OMPTaskLoopDirective                             = 258,
        CXCursor_OMPTaskLoopSimdDirective                         = 259,
        CXCursor_OMPDistributeDirective                           = 260,
        CXCursor_OMPTargetEnterDataDirective                      = 261,
        CXCursor_OMPTargetExitDataDirective                       = 262,
        CXCursor_OMPTargetParallelDirective                       = 263,
        CXCursor_OMPTargetParallelForDirective                    = 264,
        CXCursor_OMPTargetUpdateDirective                         = 265,
        CXCursor_OMPDistributeParallelForDirective                = 266,
        CXCursor_OMPDistributeParallelForSimdDirective            = 267,
        CXCursor_OMPDistributeSimdDirective                       = 268,
        CXCursor_OMPTargetParallelForSimdDirective                = 269,
        CXCursor_OMPTargetSimdDirective                           = 270,
        CXCursor_OMPTeamsDistributeDirective                      = 271,
        CXCursor_OMPTeamsDistributeSimdDirective                  = 272,
        CXCursor_OMPTeamsDistributeParallelForSimdDirective       = 273,
        CXCursor_OMPTeamsDistributeParallelForDirective           = 274,
        CXCursor_OMPTargetTeamsDirective                          = 275,
        CXCursor_OMPTargetTeamsDistributeDirective                = 276,
        CXCursor_OMPTargetTeamsDistributeParallelForDirective     = 277,
        CXCursor_OMPTargetTeamsDistributeParallelForSimdDirective = 278,
        CXCursor_OMPTargetTeamsDistributeSimdDirective            = 279,
        CXCursor_LastStmt                                         = CXCursor_OMPTargetTeamsDistributeSimdDirective,
        CXCursor_TranslationUnit                                  = 300,
        CXCursor_FirstAttr                                        = 400,
        CXCursor_UnexposedAttr                                    = 400,
        CXCursor_IBActionAttr                                     = 401,
        CXCursor_IBOutletAttr                                     = 402,
        CXCursor_IBOutletCollectionAttr                           = 403,
        CXCursor_CXXFinalAttr                                     = 404,
        CXCursor_CXXOverrideAttr                                  = 405,
        CXCursor_AnnotateAttr                                     = 406,
        CXCursor_AsmLabelAttr                                     = 407,
        CXCursor_PackedAttr                                       = 408,
        CXCursor_PureAttr                                         = 409,
        CXCursor_ConstAttr                                        = 410,
        CXCursor_NoDuplicateAttr                                  = 411,
        CXCursor_CUDAConstantAttr                                 = 412,
        CXCursor_CUDADeviceAttr                                   = 413,
        CXCursor_CUDAGlobalAttr                                   = 414,
        CXCursor_CUDAHostAttr                                     = 415,
        CXCursor_CUDASharedAttr                                   = 416,
        CXCursor_VisibilityAttr                                   = 417,
        CXCursor_DLLExport                                        = 418,
        CXCursor_DLLImport                                        = 419,
        CXCursor_NSReturnsRetained                                = 420,
        CXCursor_NSReturnsNotRetained                             = 421,
        CXCursor_NSReturnsAutoreleased                            = 422,
        CXCursor_NSConsumesSelf                                   = 423,
        CXCursor_NSConsumed                                       = 424,
        CXCursor_ObjCException                                    = 425,
        CXCursor_ObjCNSObject                                     = 426,
        CXCursor_ObjCIndependentClass                             = 427,
        CXCursor_ObjCPreciseLifetime                              = 428,
        CXCursor_ObjCReturnsInnerPointer                          = 429,
        CXCursor_ObjCRequiresSuper                                = 430,
        CXCursor_ObjCRootClass                                    = 431,
        CXCursor_ObjCSubclassingRestricted                        = 432,
        CXCursor_ObjCExplicitProtocolImpl                         = 433,
        CXCursor_ObjCDesignatedInitializer                        = 434,
        CXCursor_ObjCRuntimeVisible                               = 435,
        CXCursor_ObjCBoxable                                      = 436,
        CXCursor_FlagEnum                                         = 437,
        CXCursor_LastAttr                                         = CXCursor_FlagEnum,
        CXCursor_PreprocessingDirective                           = 500,
        CXCursor_MacroDefinition                                  = 501,
        CXCursor_MacroExpansion                                   = 502,
        CXCursor_MacroInstantiation                               = CXCursor_MacroExpansion,
        CXCursor_InclusionDirective                               = 503,
        CXCursor_FirstPreprocessing                               = CXCursor_PreprocessingDirective,
        CXCursor_LastPreprocessing                                = CXCursor_InclusionDirective,
        CXCursor_ModuleImportDecl                                 = 600,
        CXCursor_TypeAliasTemplateDecl                            = 601,
        CXCursor_StaticAssert                                     = 602,
        CXCursor_FriendDecl                                       = 603,
        CXCursor_FirstExtraDecl                                   = CXCursor_ModuleImportDecl,
        CXCursor_LastExtraDecl                                    = CXCursor_FriendDecl,
        CXCursor_OverloadCandidate                                = 700;

    /**
     * Describe the linkage of the entity referred to by a cursor.
     * 
     * <p>({@code enum CXLinkageKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXLinkage_Invalid Linkage_Invalid} - This value indicates that no linkage information is available for a provided CXCursor.</li>
     * <li>{@link #CXLinkage_NoLinkage Linkage_NoLinkage} - This is the linkage for variables, parameters, and so on that have automatic storage.  This covers normal (non-extern) local variables.</li>
     * <li>{@link #CXLinkage_Internal Linkage_Internal} - This is the linkage for static variables and static functions.</li>
     * <li>{@link #CXLinkage_UniqueExternal Linkage_UniqueExternal} - This is the linkage for entities with external linkage that live in C++ anonymous namespaces.</li>
     * <li>{@link #CXLinkage_External Linkage_External} - This is the linkage for entities with true, external linkage.</li>
     * </ul>
     */
    public static final int
        CXLinkage_Invalid        = 0,
        CXLinkage_NoLinkage      = 1,
        CXLinkage_Internal       = 2,
        CXLinkage_UniqueExternal = 3,
        CXLinkage_External       = 4;

    /**
     * {@code enum CXVisibilityKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXVisibility_Invalid Visibility_Invalid} - This value indicates that no visibility information is available for a provided CXCursor.</li>
     * <li>{@link #CXVisibility_Hidden Visibility_Hidden} - Symbol not seen by the linker.</li>
     * <li>{@link #CXVisibility_Protected Visibility_Protected} - Symbol seen by the linker but resolves to a symbol inside this object.</li>
     * <li>{@link #CXVisibility_Default Visibility_Default} - Symbol seen by the linker and acts like a normal symbol.</li>
     * </ul>
     */
    public static final int
        CXVisibility_Invalid   = 0,
        CXVisibility_Hidden    = 1,
        CXVisibility_Protected = 2,
        CXVisibility_Default   = 3;

    /**
     * Describe the "language" of the entity referred to by a cursor.
     * 
     * <p>({@code enum CXLanguageKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXLanguage_Invalid Language_Invalid}</li>
     * <li>{@link #CXLanguage_C Language_C}</li>
     * <li>{@link #CXLanguage_ObjC Language_ObjC}</li>
     * <li>{@link #CXLanguage_CPlusPlus Language_CPlusPlus}</li>
     * </ul>
     */
    public static final int
        CXLanguage_Invalid   = 0,
        CXLanguage_C         = 1,
        CXLanguage_ObjC      = 2,
        CXLanguage_CPlusPlus = 3;

    /**
     * Describe the "thread-local storage (TLS) kind" of the declaration referred to by a cursor.
     * 
     * <p>({@code enum CXTLSKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXTLS_None TLS_None}</li>
     * <li>{@link #CXTLS_Dynamic TLS_Dynamic}</li>
     * <li>{@link #CXTLS_Static TLS_Static}</li>
     * </ul>
     */
    public static final int
        CXTLS_None    = 0,
        CXTLS_Dynamic = 1,
        CXTLS_Static  = 2;

    /**
     * Describes the kind of type
     * 
     * <p>({@code enum CXTypeKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXType_Invalid Type_Invalid} - Represents an invalid type (e.g., where no type is available).</li>
     * <li>{@link #CXType_Unexposed Type_Unexposed} - A type whose specific kind is not exposed via this interface.</li>
     * <li>{@link #CXType_Void Type_Void} - Builtin types</li>
     * <li>{@link #CXType_Bool Type_Bool} - Builtin types</li>
     * <li>{@link #CXType_Char_U Type_Char_U} - Builtin types</li>
     * <li>{@link #CXType_UChar Type_UChar} - Builtin types</li>
     * <li>{@link #CXType_Char16 Type_Char16} - Builtin types</li>
     * <li>{@link #CXType_Char32 Type_Char32} - Builtin types</li>
     * <li>{@link #CXType_UShort Type_UShort} - Builtin types</li>
     * <li>{@link #CXType_UInt Type_UInt} - Builtin types</li>
     * <li>{@link #CXType_ULong Type_ULong} - Builtin types</li>
     * <li>{@link #CXType_ULongLong Type_ULongLong} - Builtin types</li>
     * <li>{@link #CXType_UInt128 Type_UInt128} - Builtin types</li>
     * <li>{@link #CXType_Char_S Type_Char_S} - Builtin types</li>
     * <li>{@link #CXType_SChar Type_SChar} - Builtin types</li>
     * <li>{@link #CXType_WChar Type_WChar} - Builtin types</li>
     * <li>{@link #CXType_Short Type_Short} - Builtin types</li>
     * <li>{@link #CXType_Int Type_Int} - Builtin types</li>
     * <li>{@link #CXType_Long Type_Long} - Builtin types</li>
     * <li>{@link #CXType_LongLong Type_LongLong} - Builtin types</li>
     * <li>{@link #CXType_Int128 Type_Int128} - Builtin types</li>
     * <li>{@link #CXType_Float Type_Float} - Builtin types</li>
     * <li>{@link #CXType_Double Type_Double} - Builtin types</li>
     * <li>{@link #CXType_LongDouble Type_LongDouble} - Builtin types</li>
     * <li>{@link #CXType_NullPtr Type_NullPtr} - Builtin types</li>
     * <li>{@link #CXType_Overload Type_Overload} - Builtin types</li>
     * <li>{@link #CXType_Dependent Type_Dependent} - Builtin types</li>
     * <li>{@link #CXType_ObjCId Type_ObjCId} - Builtin types</li>
     * <li>{@link #CXType_ObjCClass Type_ObjCClass} - Builtin types</li>
     * <li>{@link #CXType_ObjCSel Type_ObjCSel} - Builtin types</li>
     * <li>{@link #CXType_Float128 Type_Float128} - Builtin types</li>
     * <li>{@link #CXType_Half Type_Half} - Builtin types</li>
     * <li>{@link #CXType_Float16 Type_Float16} - Builtin types</li>
     * <li>{@link #CXType_ShortAccum Type_ShortAccum} - Builtin types</li>
     * <li>{@link #CXType_Accum Type_Accum} - Builtin types</li>
     * <li>{@link #CXType_LongAccum Type_LongAccum} - Builtin types</li>
     * <li>{@link #CXType_UShortAccum Type_UShortAccum} - Builtin types</li>
     * <li>{@link #CXType_UAccum Type_UAccum} - Builtin types</li>
     * <li>{@link #CXType_ULongAccum Type_ULongAccum} - Builtin types</li>
     * <li>{@link #CXType_FirstBuiltin Type_FirstBuiltin} - Builtin types</li>
     * <li>{@link #CXType_LastBuiltin Type_LastBuiltin} - Builtin types</li>
     * <li>{@link #CXType_Complex Type_Complex} - Builtin types</li>
     * <li>{@link #CXType_Pointer Type_Pointer} - Builtin types</li>
     * <li>{@link #CXType_BlockPointer Type_BlockPointer} - Builtin types</li>
     * <li>{@link #CXType_LValueReference Type_LValueReference} - Builtin types</li>
     * <li>{@link #CXType_RValueReference Type_RValueReference} - Builtin types</li>
     * <li>{@link #CXType_Record Type_Record} - Builtin types</li>
     * <li>{@link #CXType_Enum Type_Enum} - Builtin types</li>
     * <li>{@link #CXType_Typedef Type_Typedef} - Builtin types</li>
     * <li>{@link #CXType_ObjCInterface Type_ObjCInterface} - Builtin types</li>
     * <li>{@link #CXType_ObjCObjectPointer Type_ObjCObjectPointer} - Builtin types</li>
     * <li>{@link #CXType_FunctionNoProto Type_FunctionNoProto} - Builtin types</li>
     * <li>{@link #CXType_FunctionProto Type_FunctionProto} - Builtin types</li>
     * <li>{@link #CXType_ConstantArray Type_ConstantArray} - Builtin types</li>
     * <li>{@link #CXType_Vector Type_Vector} - Builtin types</li>
     * <li>{@link #CXType_IncompleteArray Type_IncompleteArray} - Builtin types</li>
     * <li>{@link #CXType_VariableArray Type_VariableArray} - Builtin types</li>
     * <li>{@link #CXType_DependentSizedArray Type_DependentSizedArray} - Builtin types</li>
     * <li>{@link #CXType_MemberPointer Type_MemberPointer} - Builtin types</li>
     * <li>{@link #CXType_Auto Type_Auto} - Builtin types</li>
     * <li>{@link #CXType_Elaborated Type_Elaborated} - 
     * Represents a type that was referred to using an elaborated type keyword.
     * 
     * <p>E.g., struct S, or via a qualified name, e.g., N::M::type, or both.</p>
     * </li>
     * <li>{@link #CXType_Pipe Type_Pipe} - OpenCL PipeType.</li>
     * <li>{@link #CXType_OCLImage1dRO Type_OCLImage1dRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dArrayRO Type_OCLImage1dArrayRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dBufferRO Type_OCLImage1dBufferRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dRO Type_OCLImage2dRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayRO Type_OCLImage2dArrayRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dDepthRO Type_OCLImage2dDepthRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayDepthRO Type_OCLImage2dArrayDepthRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dMSAARO Type_OCLImage2dMSAARO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayMSAARO Type_OCLImage2dArrayMSAARO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dMSAADepthRO Type_OCLImage2dMSAADepthRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayMSAADepthRO Type_OCLImage2dArrayMSAADepthRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage3dRO Type_OCLImage3dRO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dWO Type_OCLImage1dWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dArrayWO Type_OCLImage1dArrayWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dBufferWO Type_OCLImage1dBufferWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dWO Type_OCLImage2dWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayWO Type_OCLImage2dArrayWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dDepthWO Type_OCLImage2dDepthWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayDepthWO Type_OCLImage2dArrayDepthWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dMSAAWO Type_OCLImage2dMSAAWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayMSAAWO Type_OCLImage2dArrayMSAAWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dMSAADepthWO Type_OCLImage2dMSAADepthWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayMSAADepthWO Type_OCLImage2dArrayMSAADepthWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage3dWO Type_OCLImage3dWO} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dRW Type_OCLImage1dRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dArrayRW Type_OCLImage1dArrayRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage1dBufferRW Type_OCLImage1dBufferRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dRW Type_OCLImage2dRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayRW Type_OCLImage2dArrayRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dDepthRW Type_OCLImage2dDepthRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayDepthRW Type_OCLImage2dArrayDepthRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dMSAARW Type_OCLImage2dMSAARW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayMSAARW Type_OCLImage2dArrayMSAARW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dMSAADepthRW Type_OCLImage2dMSAADepthRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage2dArrayMSAADepthRW Type_OCLImage2dArrayMSAADepthRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLImage3dRW Type_OCLImage3dRW} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLSampler Type_OCLSampler} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLEvent Type_OCLEvent} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLQueue Type_OCLQueue} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLReserveID Type_OCLReserveID} - OpenCL builtin types.</li>
     * <li>{@link #CXType_ObjCObject Type_ObjCObject}</li>
     * <li>{@link #CXType_ObjCTypeParam Type_ObjCTypeParam}</li>
     * <li>{@link #CXType_Attributed Type_Attributed}</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCMcePayload Type_OCLIntelSubgroupAVCMcePayload} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCImePayload Type_OCLIntelSubgroupAVCImePayload} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCRefPayload Type_OCLIntelSubgroupAVCRefPayload} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCSicPayload Type_OCLIntelSubgroupAVCSicPayload} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCMceResult Type_OCLIntelSubgroupAVCMceResult} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCImeResult Type_OCLIntelSubgroupAVCImeResult} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCRefResult Type_OCLIntelSubgroupAVCRefResult} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCSicResult Type_OCLIntelSubgroupAVCSicResult} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCImeResultSingleRefStreamout Type_OCLIntelSubgroupAVCImeResultSingleRefStreamout} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCImeResultDualRefStreamout Type_OCLIntelSubgroupAVCImeResultDualRefStreamout} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCImeSingleRefStreamin Type_OCLIntelSubgroupAVCImeSingleRefStreamin} - OpenCL builtin types.</li>
     * <li>{@link #CXType_OCLIntelSubgroupAVCImeDualRefStreamin Type_OCLIntelSubgroupAVCImeDualRefStreamin} - OpenCL builtin types.</li>
     * </ul>
     */
    public static final int
        CXType_Invalid                                        = 0,
        CXType_Unexposed                                      = 1,
        CXType_Void                                           = 2,
        CXType_Bool                                           = 3,
        CXType_Char_U                                         = 4,
        CXType_UChar                                          = 5,
        CXType_Char16                                         = 6,
        CXType_Char32                                         = 7,
        CXType_UShort                                         = 8,
        CXType_UInt                                           = 9,
        CXType_ULong                                          = 10,
        CXType_ULongLong                                      = 11,
        CXType_UInt128                                        = 12,
        CXType_Char_S                                         = 13,
        CXType_SChar                                          = 14,
        CXType_WChar                                          = 15,
        CXType_Short                                          = 16,
        CXType_Int                                            = 17,
        CXType_Long                                           = 18,
        CXType_LongLong                                       = 19,
        CXType_Int128                                         = 20,
        CXType_Float                                          = 21,
        CXType_Double                                         = 22,
        CXType_LongDouble                                     = 23,
        CXType_NullPtr                                        = 24,
        CXType_Overload                                       = 25,
        CXType_Dependent                                      = 26,
        CXType_ObjCId                                         = 27,
        CXType_ObjCClass                                      = 28,
        CXType_ObjCSel                                        = 29,
        CXType_Float128                                       = 30,
        CXType_Half                                           = 31,
        CXType_Float16                                        = 32,
        CXType_ShortAccum                                     = 33,
        CXType_Accum                                          = 34,
        CXType_LongAccum                                      = 35,
        CXType_UShortAccum                                    = 36,
        CXType_UAccum                                         = 37,
        CXType_ULongAccum                                     = 38,
        CXType_FirstBuiltin                                   = CXType_Void,
        CXType_LastBuiltin                                    = CXType_ULongAccum,
        CXType_Complex                                        = 100,
        CXType_Pointer                                        = 101,
        CXType_BlockPointer                                   = 102,
        CXType_LValueReference                                = 103,
        CXType_RValueReference                                = 104,
        CXType_Record                                         = 105,
        CXType_Enum                                           = 106,
        CXType_Typedef                                        = 107,
        CXType_ObjCInterface                                  = 108,
        CXType_ObjCObjectPointer                              = 109,
        CXType_FunctionNoProto                                = 110,
        CXType_FunctionProto                                  = 111,
        CXType_ConstantArray                                  = 112,
        CXType_Vector                                         = 113,
        CXType_IncompleteArray                                = 114,
        CXType_VariableArray                                  = 115,
        CXType_DependentSizedArray                            = 116,
        CXType_MemberPointer                                  = 117,
        CXType_Auto                                           = 118,
        CXType_Elaborated                                     = 119,
        CXType_Pipe                                           = 120,
        CXType_OCLImage1dRO                                   = 121,
        CXType_OCLImage1dArrayRO                              = 122,
        CXType_OCLImage1dBufferRO                             = 123,
        CXType_OCLImage2dRO                                   = 124,
        CXType_OCLImage2dArrayRO                              = 125,
        CXType_OCLImage2dDepthRO                              = 126,
        CXType_OCLImage2dArrayDepthRO                         = 127,
        CXType_OCLImage2dMSAARO                               = 128,
        CXType_OCLImage2dArrayMSAARO                          = 129,
        CXType_OCLImage2dMSAADepthRO                          = 130,
        CXType_OCLImage2dArrayMSAADepthRO                     = 131,
        CXType_OCLImage3dRO                                   = 132,
        CXType_OCLImage1dWO                                   = 133,
        CXType_OCLImage1dArrayWO                              = 134,
        CXType_OCLImage1dBufferWO                             = 135,
        CXType_OCLImage2dWO                                   = 136,
        CXType_OCLImage2dArrayWO                              = 137,
        CXType_OCLImage2dDepthWO                              = 138,
        CXType_OCLImage2dArrayDepthWO                         = 139,
        CXType_OCLImage2dMSAAWO                               = 140,
        CXType_OCLImage2dArrayMSAAWO                          = 141,
        CXType_OCLImage2dMSAADepthWO                          = 142,
        CXType_OCLImage2dArrayMSAADepthWO                     = 143,
        CXType_OCLImage3dWO                                   = 144,
        CXType_OCLImage1dRW                                   = 145,
        CXType_OCLImage1dArrayRW                              = 146,
        CXType_OCLImage1dBufferRW                             = 147,
        CXType_OCLImage2dRW                                   = 148,
        CXType_OCLImage2dArrayRW                              = 149,
        CXType_OCLImage2dDepthRW                              = 150,
        CXType_OCLImage2dArrayDepthRW                         = 151,
        CXType_OCLImage2dMSAARW                               = 152,
        CXType_OCLImage2dArrayMSAARW                          = 153,
        CXType_OCLImage2dMSAADepthRW                          = 154,
        CXType_OCLImage2dArrayMSAADepthRW                     = 155,
        CXType_OCLImage3dRW                                   = 156,
        CXType_OCLSampler                                     = 157,
        CXType_OCLEvent                                       = 158,
        CXType_OCLQueue                                       = 159,
        CXType_OCLReserveID                                   = 160,
        CXType_ObjCObject                                     = 161,
        CXType_ObjCTypeParam                                  = 162,
        CXType_Attributed                                     = 163,
        CXType_OCLIntelSubgroupAVCMcePayload                  = 164,
        CXType_OCLIntelSubgroupAVCImePayload                  = 165,
        CXType_OCLIntelSubgroupAVCRefPayload                  = 166,
        CXType_OCLIntelSubgroupAVCSicPayload                  = 167,
        CXType_OCLIntelSubgroupAVCMceResult                   = 168,
        CXType_OCLIntelSubgroupAVCImeResult                   = 169,
        CXType_OCLIntelSubgroupAVCRefResult                   = 170,
        CXType_OCLIntelSubgroupAVCSicResult                   = 171,
        CXType_OCLIntelSubgroupAVCImeResultSingleRefStreamout = 172,
        CXType_OCLIntelSubgroupAVCImeResultDualRefStreamout   = 173,
        CXType_OCLIntelSubgroupAVCImeSingleRefStreamin        = 174,
        CXType_OCLIntelSubgroupAVCImeDualRefStreamin          = 175;

    /**
     * Describes the calling convention of a function type
     * 
     * <p>({@code enum CXCallingConv})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCallingConv_Default CallingConv_Default}</li>
     * <li>{@link #CXCallingConv_C CallingConv_C}</li>
     * <li>{@link #CXCallingConv_X86StdCall CallingConv_X86StdCall}</li>
     * <li>{@link #CXCallingConv_X86FastCall CallingConv_X86FastCall}</li>
     * <li>{@link #CXCallingConv_X86ThisCall CallingConv_X86ThisCall}</li>
     * <li>{@link #CXCallingConv_X86Pascal CallingConv_X86Pascal}</li>
     * <li>{@link #CXCallingConv_AAPCS CallingConv_AAPCS}</li>
     * <li>{@link #CXCallingConv_AAPCS_VFP CallingConv_AAPCS_VFP}</li>
     * <li>{@link #CXCallingConv_X86RegCall CallingConv_X86RegCall}</li>
     * <li>{@link #CXCallingConv_IntelOclBicc CallingConv_IntelOclBicc}</li>
     * <li>{@link #CXCallingConv_Win64 CallingConv_Win64}</li>
     * <li>{@link #CXCallingConv_X86_64Win64 CallingConv_X86_64Win64} - Alias for compatibility with older versions of API.</li>
     * <li>{@link #CXCallingConv_X86_64SysV CallingConv_X86_64SysV} - Alias for compatibility with older versions of API.</li>
     * <li>{@link #CXCallingConv_X86VectorCall CallingConv_X86VectorCall} - Alias for compatibility with older versions of API.</li>
     * <li>{@link #CXCallingConv_Swift CallingConv_Swift} - Alias for compatibility with older versions of API.</li>
     * <li>{@link #CXCallingConv_PreserveMost CallingConv_PreserveMost} - Alias for compatibility with older versions of API.</li>
     * <li>{@link #CXCallingConv_PreserveAll CallingConv_PreserveAll} - Alias for compatibility with older versions of API.</li>
     * <li>{@link #CXCallingConv_Invalid CallingConv_Invalid} - Alias for compatibility with older versions of API.</li>
     * <li>{@link #CXCallingConv_Unexposed CallingConv_Unexposed} - Alias for compatibility with older versions of API.</li>
     * </ul>
     */
    public static final int
        CXCallingConv_Default       = 0,
        CXCallingConv_C             = 1,
        CXCallingConv_X86StdCall    = 2,
        CXCallingConv_X86FastCall   = 3,
        CXCallingConv_X86ThisCall   = 4,
        CXCallingConv_X86Pascal     = 5,
        CXCallingConv_AAPCS         = 6,
        CXCallingConv_AAPCS_VFP     = 7,
        CXCallingConv_X86RegCall    = 8,
        CXCallingConv_IntelOclBicc  = 9,
        CXCallingConv_Win64         = 10,
        CXCallingConv_X86_64Win64   = CXCallingConv_Win64,
        CXCallingConv_X86_64SysV    = 11,
        CXCallingConv_X86VectorCall = 12,
        CXCallingConv_Swift         = 13,
        CXCallingConv_PreserveMost  = 14,
        CXCallingConv_PreserveAll   = 15,
        CXCallingConv_Invalid       = 100,
        CXCallingConv_Unexposed     = 200;

    /**
     * Describes the kind of a template argument. ({@code enum CXTemplateArgumentKind})
     * 
     * <p>See the definition of llvm::clang::TemplateArgument::ArgKind for full element descriptions.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXTemplateArgumentKind_Null TemplateArgumentKind_Null}</li>
     * <li>{@link #CXTemplateArgumentKind_Type TemplateArgumentKind_Type}</li>
     * <li>{@link #CXTemplateArgumentKind_Declaration TemplateArgumentKind_Declaration}</li>
     * <li>{@link #CXTemplateArgumentKind_NullPtr TemplateArgumentKind_NullPtr}</li>
     * <li>{@link #CXTemplateArgumentKind_Integral TemplateArgumentKind_Integral}</li>
     * <li>{@link #CXTemplateArgumentKind_Template TemplateArgumentKind_Template}</li>
     * <li>{@link #CXTemplateArgumentKind_TemplateExpansion TemplateArgumentKind_TemplateExpansion}</li>
     * <li>{@link #CXTemplateArgumentKind_Expression TemplateArgumentKind_Expression}</li>
     * <li>{@link #CXTemplateArgumentKind_Pack TemplateArgumentKind_Pack}</li>
     * <li>{@link #CXTemplateArgumentKind_Invalid TemplateArgumentKind_Invalid} - Indicates an error case, preventing the kind from being deduced.</li>
     * </ul>
     */
    public static final int
        CXTemplateArgumentKind_Null              = 0,
        CXTemplateArgumentKind_Type              = 1,
        CXTemplateArgumentKind_Declaration       = 2,
        CXTemplateArgumentKind_NullPtr           = 3,
        CXTemplateArgumentKind_Integral          = 4,
        CXTemplateArgumentKind_Template          = 5,
        CXTemplateArgumentKind_TemplateExpansion = 6,
        CXTemplateArgumentKind_Expression        = 7,
        CXTemplateArgumentKind_Pack              = 8,
        CXTemplateArgumentKind_Invalid           = 9;

    /**
     * {@code enum CXTypeNullabilityKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXTypeNullability_NonNull TypeNullability_NonNull} - Values of this type can never be null.</li>
     * <li>{@link #CXTypeNullability_Nullable TypeNullability_Nullable} - Values of this type can be null.</li>
     * <li>{@link #CXTypeNullability_Unspecified TypeNullability_Unspecified} - 
     * Whether values of this type can be null is (explicitly) unspecified. This captures a (fairly rare) case where we can't conclude anything about the
     * nullability of the type even though it has been considered.
     * </li>
     * <li>{@link #CXTypeNullability_Invalid TypeNullability_Invalid} - Nullability is not applicable to this type.</li>
     * </ul>
     */
    public static final int
        CXTypeNullability_NonNull     = 0,
        CXTypeNullability_Nullable    = 1,
        CXTypeNullability_Unspecified = 2,
        CXTypeNullability_Invalid     = 3;

    /**
     * List the possible error codes for {@code clang_Type_getSizeOf}, {@code clang_Type_getAlignOf}, {@code clang_Type_getOffsetOf} and {@code
     * clang_Cursor_getOffsetOf}. ({@code enum CXTypeLayoutError})
     * 
     * <p>A value of this enumeration type can be returned if the target type is not a valid argument to sizeof, alignof or offsetof.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXTypeLayoutError_Invalid TypeLayoutError_Invalid} - Type is of kind CXType_Invalid.</li>
     * <li>{@link #CXTypeLayoutError_Incomplete TypeLayoutError_Incomplete} - The type is an incomplete Type.</li>
     * <li>{@link #CXTypeLayoutError_Dependent TypeLayoutError_Dependent} - The type is a dependent Type.</li>
     * <li>{@link #CXTypeLayoutError_NotConstantSize TypeLayoutError_NotConstantSize} - The type is not a constant size type.</li>
     * <li>{@link #CXTypeLayoutError_InvalidFieldName TypeLayoutError_InvalidFieldName} - The Field name is not valid for this record.</li>
     * </ul>
     */
    public static final int
        CXTypeLayoutError_Invalid          = -1,
        CXTypeLayoutError_Incomplete       = -2,
        CXTypeLayoutError_Dependent        = -3,
        CXTypeLayoutError_NotConstantSize  = -4,
        CXTypeLayoutError_InvalidFieldName = -5;

    /**
     * {@code enum CXRefQualifierKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXRefQualifier_None RefQualifier_None} - No ref-qualifier was provided.</li>
     * <li>{@link #CXRefQualifier_LValue RefQualifier_LValue} - An lvalue ref-qualifier was provided ({@code &}).</li>
     * <li>{@link #CXRefQualifier_RValue RefQualifier_RValue} - An rvalue ref-qualifier was provided ({@code &&}).</li>
     * </ul>
     */
    public static final int
        CXRefQualifier_None   = 0,
        CXRefQualifier_LValue = 1,
        CXRefQualifier_RValue = 2;

    /**
     * Represents the C++ access control level to a base class for a cursor with kind CX_CXXBaseSpecifier.
     * 
     * <p>({@code enum CX_CXXAccessSpecifier})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CX_CXXInvalidAccessSpecifier _CXXInvalidAccessSpecifier}</li>
     * <li>{@link #CX_CXXPublic _CXXPublic}</li>
     * <li>{@link #CX_CXXProtected _CXXProtected}</li>
     * <li>{@link #CX_CXXPrivate _CXXPrivate}</li>
     * </ul>
     */
    public static final int
        CX_CXXInvalidAccessSpecifier = 0,
        CX_CXXPublic                 = 1,
        CX_CXXProtected              = 2,
        CX_CXXPrivate                = 3;

    /**
     * Represents the storage classes as declared in the source. CX_SC_Invalid was added for the case that the passed cursor in not a declaration.
     * 
     * <p>({@code enum CX_StorageClass})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CX_SC_Invalid _SC_Invalid}</li>
     * <li>{@link #CX_SC_None _SC_None}</li>
     * <li>{@link #CX_SC_Extern _SC_Extern}</li>
     * <li>{@link #CX_SC_Static _SC_Static}</li>
     * <li>{@link #CX_SC_PrivateExtern _SC_PrivateExtern}</li>
     * <li>{@link #CX_SC_OpenCLWorkGroupLocal _SC_OpenCLWorkGroupLocal}</li>
     * <li>{@link #CX_SC_Auto _SC_Auto}</li>
     * <li>{@link #CX_SC_Register _SC_Register}</li>
     * </ul>
     */
    public static final int
        CX_SC_Invalid              = 0,
        CX_SC_None                 = 1,
        CX_SC_Extern               = 2,
        CX_SC_Static               = 3,
        CX_SC_PrivateExtern        = 4,
        CX_SC_OpenCLWorkGroupLocal = 5,
        CX_SC_Auto                 = 6,
        CX_SC_Register             = 7;

    /**
     * Describes how the traversal of the children of a particular cursor should proceed after visiting a particular child cursor. ({@code enum
     * CXChildVisitResult})
     * 
     * <p>A value of this enumeration type should be returned by each {@code CXCursorVisitor} to indicate how {@link #clang_visitChildren visitChildren} proceed.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXChildVisit_Break ChildVisit_Break} - Terminates the cursor traversal.</li>
     * <li>{@link #CXChildVisit_Continue ChildVisit_Continue} - Continues the cursor traversal with the next sibling of the cursor just visited, without visiting its children.</li>
     * <li>{@link #CXChildVisit_Recurse ChildVisit_Recurse} - Recursively traverse the children of this cursor, using the same visitor and client data.</li>
     * </ul>
     */
    public static final int
        CXChildVisit_Break    = 0,
        CXChildVisit_Continue = 1,
        CXChildVisit_Recurse  = 2;

    /**
     * Properties for the printing policy. ({@code enum CXPrintingPolicyProperty})
     * 
     * <p>See {@code clang::PrintingPolicy} for more information.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXPrintingPolicy_Indentation PrintingPolicy_Indentation}</li>
     * <li>{@link #CXPrintingPolicy_SuppressSpecifiers PrintingPolicy_SuppressSpecifiers}</li>
     * <li>{@link #CXPrintingPolicy_SuppressTagKeyword PrintingPolicy_SuppressTagKeyword}</li>
     * <li>{@link #CXPrintingPolicy_IncludeTagDefinition PrintingPolicy_IncludeTagDefinition}</li>
     * <li>{@link #CXPrintingPolicy_SuppressScope PrintingPolicy_SuppressScope}</li>
     * <li>{@link #CXPrintingPolicy_SuppressUnwrittenScope PrintingPolicy_SuppressUnwrittenScope}</li>
     * <li>{@link #CXPrintingPolicy_SuppressInitializers PrintingPolicy_SuppressInitializers}</li>
     * <li>{@link #CXPrintingPolicy_ConstantArraySizeAsWritten PrintingPolicy_ConstantArraySizeAsWritten}</li>
     * <li>{@link #CXPrintingPolicy_AnonymousTagLocations PrintingPolicy_AnonymousTagLocations}</li>
     * <li>{@link #CXPrintingPolicy_SuppressStrongLifetime PrintingPolicy_SuppressStrongLifetime}</li>
     * <li>{@link #CXPrintingPolicy_SuppressLifetimeQualifiers PrintingPolicy_SuppressLifetimeQualifiers}</li>
     * <li>{@link #CXPrintingPolicy_SuppressTemplateArgsInCXXConstructors PrintingPolicy_SuppressTemplateArgsInCXXConstructors}</li>
     * <li>{@link #CXPrintingPolicy_Bool PrintingPolicy_Bool}</li>
     * <li>{@link #CXPrintingPolicy_Restrict PrintingPolicy_Restrict}</li>
     * <li>{@link #CXPrintingPolicy_Alignof PrintingPolicy_Alignof}</li>
     * <li>{@link #CXPrintingPolicy_UnderscoreAlignof PrintingPolicy_UnderscoreAlignof}</li>
     * <li>{@link #CXPrintingPolicy_UseVoidForZeroParams PrintingPolicy_UseVoidForZeroParams}</li>
     * <li>{@link #CXPrintingPolicy_TerseOutput PrintingPolicy_TerseOutput}</li>
     * <li>{@link #CXPrintingPolicy_PolishForDeclaration PrintingPolicy_PolishForDeclaration}</li>
     * <li>{@link #CXPrintingPolicy_Half PrintingPolicy_Half}</li>
     * <li>{@link #CXPrintingPolicy_MSWChar PrintingPolicy_MSWChar}</li>
     * <li>{@link #CXPrintingPolicy_IncludeNewlines PrintingPolicy_IncludeNewlines}</li>
     * <li>{@link #CXPrintingPolicy_MSVCFormatting PrintingPolicy_MSVCFormatting}</li>
     * <li>{@link #CXPrintingPolicy_ConstantsAsWritten PrintingPolicy_ConstantsAsWritten}</li>
     * <li>{@link #CXPrintingPolicy_SuppressImplicitBase PrintingPolicy_SuppressImplicitBase}</li>
     * <li>{@link #CXPrintingPolicy_FullyQualifiedName PrintingPolicy_FullyQualifiedName}</li>
     * <li>{@link #CXPrintingPolicy_LastProperty PrintingPolicy_LastProperty}</li>
     * </ul>
     */
    public static final int
        CXPrintingPolicy_Indentation                           = 0,
        CXPrintingPolicy_SuppressSpecifiers                    = 1,
        CXPrintingPolicy_SuppressTagKeyword                    = 2,
        CXPrintingPolicy_IncludeTagDefinition                  = 3,
        CXPrintingPolicy_SuppressScope                         = 4,
        CXPrintingPolicy_SuppressUnwrittenScope                = 5,
        CXPrintingPolicy_SuppressInitializers                  = 6,
        CXPrintingPolicy_ConstantArraySizeAsWritten            = 7,
        CXPrintingPolicy_AnonymousTagLocations                 = 8,
        CXPrintingPolicy_SuppressStrongLifetime                = 9,
        CXPrintingPolicy_SuppressLifetimeQualifiers            = 10,
        CXPrintingPolicy_SuppressTemplateArgsInCXXConstructors = 11,
        CXPrintingPolicy_Bool                                  = 12,
        CXPrintingPolicy_Restrict                              = 13,
        CXPrintingPolicy_Alignof                               = 14,
        CXPrintingPolicy_UnderscoreAlignof                     = 15,
        CXPrintingPolicy_UseVoidForZeroParams                  = 16,
        CXPrintingPolicy_TerseOutput                           = 17,
        CXPrintingPolicy_PolishForDeclaration                  = 18,
        CXPrintingPolicy_Half                                  = 19,
        CXPrintingPolicy_MSWChar                               = 20,
        CXPrintingPolicy_IncludeNewlines                       = 21,
        CXPrintingPolicy_MSVCFormatting                        = 22,
        CXPrintingPolicy_ConstantsAsWritten                    = 23,
        CXPrintingPolicy_SuppressImplicitBase                  = 24,
        CXPrintingPolicy_FullyQualifiedName                    = 25,
        CXPrintingPolicy_LastProperty                          = CXPrintingPolicy_FullyQualifiedName;

    /**
     * Property attributes for a {@code CXCursor_ObjCPropertyDecl}.
     * 
     * <p>({@code CXObjCPropertyAttrKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXObjCPropertyAttr_noattr ObjCPropertyAttr_noattr}</li>
     * <li>{@link #CXObjCPropertyAttr_readonly ObjCPropertyAttr_readonly}</li>
     * <li>{@link #CXObjCPropertyAttr_getter ObjCPropertyAttr_getter}</li>
     * <li>{@link #CXObjCPropertyAttr_assign ObjCPropertyAttr_assign}</li>
     * <li>{@link #CXObjCPropertyAttr_readwrite ObjCPropertyAttr_readwrite}</li>
     * <li>{@link #CXObjCPropertyAttr_retain ObjCPropertyAttr_retain}</li>
     * <li>{@link #CXObjCPropertyAttr_copy ObjCPropertyAttr_copy}</li>
     * <li>{@link #CXObjCPropertyAttr_nonatomic ObjCPropertyAttr_nonatomic}</li>
     * <li>{@link #CXObjCPropertyAttr_setter ObjCPropertyAttr_setter}</li>
     * <li>{@link #CXObjCPropertyAttr_atomic ObjCPropertyAttr_atomic}</li>
     * <li>{@link #CXObjCPropertyAttr_weak ObjCPropertyAttr_weak}</li>
     * <li>{@link #CXObjCPropertyAttr_strong ObjCPropertyAttr_strong}</li>
     * <li>{@link #CXObjCPropertyAttr_unsafe_unretained ObjCPropertyAttr_unsafe_unretained}</li>
     * <li>{@link #CXObjCPropertyAttr_class ObjCPropertyAttr_class}</li>
     * </ul>
     */
    public static final int
        CXObjCPropertyAttr_noattr            = 0x00,
        CXObjCPropertyAttr_readonly          = 0x01,
        CXObjCPropertyAttr_getter            = 0x02,
        CXObjCPropertyAttr_assign            = 0x04,
        CXObjCPropertyAttr_readwrite         = 0x08,
        CXObjCPropertyAttr_retain            = 0x10,
        CXObjCPropertyAttr_copy              = 0x20,
        CXObjCPropertyAttr_nonatomic         = 0x40,
        CXObjCPropertyAttr_setter            = 0x80,
        CXObjCPropertyAttr_atomic            = 0x100,
        CXObjCPropertyAttr_weak              = 0x200,
        CXObjCPropertyAttr_strong            = 0x400,
        CXObjCPropertyAttr_unsafe_unretained = 0x800,
        CXObjCPropertyAttr_class             = 0x1000;

    /**
     * 'Qualifiers' written next to the return and parameter types in Objective-C method declarations.
     * 
     * <p>({@code CXObjCDeclQualifierKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXObjCDeclQualifier_None ObjCDeclQualifier_None}</li>
     * <li>{@link #CXObjCDeclQualifier_In ObjCDeclQualifier_In}</li>
     * <li>{@link #CXObjCDeclQualifier_Inout ObjCDeclQualifier_Inout}</li>
     * <li>{@link #CXObjCDeclQualifier_Out ObjCDeclQualifier_Out}</li>
     * <li>{@link #CXObjCDeclQualifier_Bycopy ObjCDeclQualifier_Bycopy}</li>
     * <li>{@link #CXObjCDeclQualifier_Byref ObjCDeclQualifier_Byref}</li>
     * <li>{@link #CXObjCDeclQualifier_Oneway ObjCDeclQualifier_Oneway}</li>
     * </ul>
     */
    public static final int
        CXObjCDeclQualifier_None   = 0x0,
        CXObjCDeclQualifier_In     = 0x1,
        CXObjCDeclQualifier_Inout  = 0x2,
        CXObjCDeclQualifier_Out    = 0x4,
        CXObjCDeclQualifier_Bycopy = 0x8,
        CXObjCDeclQualifier_Byref  = 0x10,
        CXObjCDeclQualifier_Oneway = 0x20;

    /**
     * {@code enum CXNameRefFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXNameRange_WantQualifier NameRange_WantQualifier} - Include the nested-name-specifier, e.g. Foo:: in x.Foo::y, in the range.</li>
     * <li>{@link #CXNameRange_WantTemplateArgs NameRange_WantTemplateArgs} - Include the explicit template arguments, e.g. &lt;int&gt; in x.f&lt;int&gt;, in the range.</li>
     * <li>{@link #CXNameRange_WantSinglePiece NameRange_WantSinglePiece} - 
     * If the name is non-contiguous, return the full spanning range.
     * 
     * <p>Non-contiguous names occur in Objective-C when a selector with two or more parameters is used, or in C++ when using an operator:</p>
     * 
     * <pre><code>
     *  [object doSomething:here withValue:there]; // Objective-C
     *  return some_vector[1]; // C++</code></pre>
     * </li>
     * </ul>
     */
    public static final int
        CXNameRange_WantQualifier    = 0x1,
        CXNameRange_WantTemplateArgs = 0x2,
        CXNameRange_WantSinglePiece  = 0x4;

    /**
     * Describes a kind of token.
     * 
     * <p>({@code CXTokenKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXToken_Punctuation Token_Punctuation} - A token that contains some kind of punctuation.</li>
     * <li>{@link #CXToken_Keyword Token_Keyword} - A language keyword.</li>
     * <li>{@link #CXToken_Identifier Token_Identifier} - An identifier (that is not a keyword).</li>
     * <li>{@link #CXToken_Literal Token_Literal} - A numeric, string, or character literal.</li>
     * <li>{@link #CXToken_Comment Token_Comment} - A comment.</li>
     * </ul>
     */
    public static final int
        CXToken_Punctuation = 0,
        CXToken_Keyword     = 1,
        CXToken_Identifier  = 2,
        CXToken_Literal     = 3,
        CXToken_Comment     = 4;

    /**
     * Describes a single piece of text within a code-completion string. ({@code enum CXCompletionChunkKind})
     * 
     * <p>Each "chunk" within a code-completion string ({@code CXCompletionString}) is either a piece of text with a specific "kind" that describes how that text
     * should be interpreted by the client or is another completion string.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCompletionChunk_Optional CompletionChunk_Optional} - 
     * A code-completion string that describes "optional" text that could be a part of the template (but is not required).
     * 
     * <p>The Optional chunk is the only kind of chunk that has a code-completion string for its representation, which is accessible via {@code
     * clang_getCompletionChunkCompletionString()}. The code-completion string describes an additional part of the template that is completely optional.
     * For example, optional chunks can be used to describe the placeholders for arguments that match up with defaulted function parameters, e.g. given:</p>
     * 
     * <pre><code>
     *  void f(int x, float y = 3.14, double z = 2.71828);</code></pre>
     * 
     * <p>The code-completion string for this function would contain:</p>
     * 
     * <ul>
     * <li>a TypedText chunk for "f".</li>
     * <li>a LeftParen chunk for "(".</li>
     * <li>a Placeholder chunk for "int x"</li>
     * <li>an Optional chunk containing the remaining defaulted arguments, e.g.,
     * 
     * <ul>
     * <li>a Comma chunk for ","</li>
     * <li>a Placeholder chunk for "float y"</li>
     * <li>an Optional chunk containing the last defaulted argument:
     * 
     * <ul>
     * <li>a Comma chunk for ","</li>
     * <li>a Placeholder chunk for "double z"</li>
     * </ul></li>
     * </ul></li>
     * <li>a RightParen chunk for ")"</li>
     * </ul>
     * 
     * <p>There are many ways to handle Optional chunks. Two simple approaches are:</p>
     * 
     * <ul>
     * <li>Completely ignore optional chunks, in which case the template for the function "f" would only include the first parameter ("int x").</li>
     * <li>Fully expand all optional chunks, in which case the template for the function "f" would have all of the parameters.</li>
     * </ul>
     * </li>
     * <li>{@link #CXCompletionChunk_TypedText CompletionChunk_TypedText} - 
     * Text that a user would be expected to type to get this code-completion result.
     * 
     * <p>There will be exactly one "typed text" chunk in a semantic string, which will typically provide the spelling of a keyword or the name of a
     * declaration that could be used at the current code point. Clients are expected to filter the code-completion results based on the text in this
     * chunk.</p>
     * </li>
     * <li>{@link #CXCompletionChunk_Text CompletionChunk_Text} - 
     * Text that should be inserted as part of a code-completion result.
     * 
     * <p>A "text" chunk represents text that is part of the template to be inserted into user code should this particular code-completion result be
     * selected.</p>
     * </li>
     * <li>{@link #CXCompletionChunk_Placeholder CompletionChunk_Placeholder} - 
     * Placeholder text that should be replaced by the user.
     * 
     * <p>A "placeholder" chunk marks a place where the user should insert text into the code-completion template. For example, placeholders might mark the
     * function parameters for a function declaration, to indicate that the user should provide arguments for each of those parameters. The actual text in
     * a placeholder is a suggestion for the text to display before the user replaces the placeholder with real code.</p>
     * </li>
     * <li>{@link #CXCompletionChunk_Informative CompletionChunk_Informative} - 
     * Informative text that should be displayed but never inserted as part of the template.
     * 
     * <p>An "informative" chunk contains annotations that can be displayed to help the user decide whether a particular code-completion result is the right
     * option, but which is not part of the actual template to be inserted by code completion.</p>
     * </li>
     * <li>{@link #CXCompletionChunk_CurrentParameter CompletionChunk_CurrentParameter} - 
     * Text that describes the current parameter when code-completion is referring to function call, message send, or template specialization.
     * 
     * <p>A "current parameter" chunk occurs when code-completion is providing information about a parameter corresponding to the argument at the
     * code-completion point. For example, given a function</p>
     * 
     * <pre><code>
     *  int add(int x, int y);</code></pre>
     * 
     * <p>and the source code {@code add(}, where the code-completion point is after the "(", the code-completion string will contain a "current parameter"
     * chunk for "int x", indicating that the current argument will initialize that parameter. After typing further, to {@code add(17}, (where the
     * code-completion point is after the ","), the code-completion string will contain a "current parameter" chunk to "int y".</p>
     * </li>
     * <li>{@link #CXCompletionChunk_LeftParen CompletionChunk_LeftParen} - A left parenthesis ('('), used to initiate a function call or signal the beginning of a function parameter list.</li>
     * <li>{@link #CXCompletionChunk_RightParen CompletionChunk_RightParen} - A right parenthesis (')'), used to finish a function call or signal the end of a function parameter list.</li>
     * <li>{@link #CXCompletionChunk_LeftBracket CompletionChunk_LeftBracket} - A left bracket ('[').</li>
     * <li>{@link #CXCompletionChunk_RightBracket CompletionChunk_RightBracket} - A right bracket (']').</li>
     * <li>{@link #CXCompletionChunk_LeftBrace CompletionChunk_LeftBrace} - A left brace ('{').</li>
     * <li>{@link #CXCompletionChunk_RightBrace CompletionChunk_RightBrace} - A right brace ('}').</li>
     * <li>{@link #CXCompletionChunk_LeftAngle CompletionChunk_LeftAngle} - A left angle bracket (' &lt;').</li>
     * <li>{@link #CXCompletionChunk_RightAngle CompletionChunk_RightAngle} - A right angle bracket ('&gt;').</li>
     * <li>{@link #CXCompletionChunk_Comma CompletionChunk_Comma} - A comma separator (',').</li>
     * <li>{@link #CXCompletionChunk_ResultType CompletionChunk_ResultType} - 
     * Text that specifies the result type of a given result.
     * 
     * <p>This special kind of informative chunk is not meant to be inserted into the text buffer. Rather, it is meant to illustrate the type that an
     * expression using the given completion string would have.</p>
     * </li>
     * <li>{@link #CXCompletionChunk_Colon CompletionChunk_Colon} - A colon (':').</li>
     * <li>{@link #CXCompletionChunk_SemiColon CompletionChunk_SemiColon} - A semicolon (';').</li>
     * <li>{@link #CXCompletionChunk_Equal CompletionChunk_Equal} - An '=' sign.</li>
     * <li>{@link #CXCompletionChunk_HorizontalSpace CompletionChunk_HorizontalSpace} - Horizontal space (' ').</li>
     * <li>{@link #CXCompletionChunk_VerticalSpace CompletionChunk_VerticalSpace} - Vertical space ('\n'), after which it is generally a good idea to perform indentation.</li>
     * </ul>
     */
    public static final int
        CXCompletionChunk_Optional         = 0,
        CXCompletionChunk_TypedText        = 1,
        CXCompletionChunk_Text             = 2,
        CXCompletionChunk_Placeholder      = 3,
        CXCompletionChunk_Informative      = 4,
        CXCompletionChunk_CurrentParameter = 5,
        CXCompletionChunk_LeftParen        = 6,
        CXCompletionChunk_RightParen       = 7,
        CXCompletionChunk_LeftBracket      = 8,
        CXCompletionChunk_RightBracket     = 9,
        CXCompletionChunk_LeftBrace        = 10,
        CXCompletionChunk_RightBrace       = 11,
        CXCompletionChunk_LeftAngle        = 12,
        CXCompletionChunk_RightAngle       = 13,
        CXCompletionChunk_Comma            = 14,
        CXCompletionChunk_ResultType       = 15,
        CXCompletionChunk_Colon            = 16,
        CXCompletionChunk_SemiColon        = 17,
        CXCompletionChunk_Equal            = 18,
        CXCompletionChunk_HorizontalSpace  = 19,
        CXCompletionChunk_VerticalSpace    = 20;

    /**
     * Flags that can be passed to {@code clang_codeCompleteAt()} to modify its behavior. ({@code enum CXCodeComplete_Flags})
     * 
     * <p>The enumerators in this enumeration can be bitwise-OR'd together to provide multiple options to {@code clang_codeCompleteAt()}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCodeComplete_IncludeMacros CodeComplete_IncludeMacros} - Whether to include macros within the set of code completions returned.</li>
     * <li>{@link #CXCodeComplete_IncludeCodePatterns CodeComplete_IncludeCodePatterns} - Whether to include code patterns for language constructs within the set of code completions, e.g., for loops.</li>
     * <li>{@link #CXCodeComplete_IncludeBriefComments CodeComplete_IncludeBriefComments} - Whether to include brief documentation within the set of code completions returned.</li>
     * <li>{@link #CXCodeComplete_SkipPreamble CodeComplete_SkipPreamble} - 
     * Whether to speed up completion by omitting top- or namespace-level entities defined in the preamble. There's no guarantee any particular entity is
     * omitted. This may be useful if the headers are indexed externally.
     * </li>
     * <li>{@link #CXCodeComplete_IncludeCompletionsWithFixIts CodeComplete_IncludeCompletionsWithFixIts} - Whether to include completions with small fix-its, e.g. change '.' to '-&gt;' on member access, etc.</li>
     * </ul>
     */
    public static final int
        CXCodeComplete_IncludeMacros                = 0x01,
        CXCodeComplete_IncludeCodePatterns          = 0x02,
        CXCodeComplete_IncludeBriefComments         = 0x04,
        CXCodeComplete_SkipPreamble                 = 0x08,
        CXCodeComplete_IncludeCompletionsWithFixIts = 0x10;

    /**
     * Bits that represent the context under which completion is occurring. ({@code enum CXCompletionContext})
     * 
     * <p>The enumerators in this enumeration may be bitwise-OR'd together if multiple contexts are occurring simultaneously.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXCompletionContext_Unexposed CompletionContext_Unexposed} - The context for completions is unexposed, as only Clang results should be included. (This is equivalent to having no context bits set.)</li>
     * <li>{@link #CXCompletionContext_AnyType CompletionContext_AnyType} - Completions for any possible type should be included in the results.</li>
     * <li>{@link #CXCompletionContext_AnyValue CompletionContext_AnyValue} - Completions for any possible value (variables, function calls, etc.) should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCObjectValue CompletionContext_ObjCObjectValue} - Completions for values that resolve to an Objective-C object should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCSelectorValue CompletionContext_ObjCSelectorValue} - Completions for values that resolve to an Objective-C selector should be included in the results.</li>
     * <li>{@link #CXCompletionContext_CXXClassTypeValue CompletionContext_CXXClassTypeValue} - Completions for values that resolve to a C++ class type should be included in the results.</li>
     * <li>{@link #CXCompletionContext_DotMemberAccess CompletionContext_DotMemberAccess} - Completions for fields of the member being accessed using the dot operator should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ArrowMemberAccess CompletionContext_ArrowMemberAccess} - Completions for fields of the member being accessed using the arrow operator should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCPropertyAccess CompletionContext_ObjCPropertyAccess} - Completions for properties of the Objective-C object being accessed using the dot operator should be included in the results.</li>
     * <li>{@link #CXCompletionContext_EnumTag CompletionContext_EnumTag} - Completions for enum tags should be included in the results.</li>
     * <li>{@link #CXCompletionContext_UnionTag CompletionContext_UnionTag} - Completions for union tags should be included in the results.</li>
     * <li>{@link #CXCompletionContext_StructTag CompletionContext_StructTag} - Completions for struct tags should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ClassTag CompletionContext_ClassTag} - Completions for C++ class names should be included in the results.</li>
     * <li>{@link #CXCompletionContext_Namespace CompletionContext_Namespace} - Completions for C++ namespaces and namespace aliases should be included in the results.</li>
     * <li>{@link #CXCompletionContext_NestedNameSpecifier CompletionContext_NestedNameSpecifier} - Completions for C++ nested name specifiers should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCInterface CompletionContext_ObjCInterface} - Completions for Objective-C interfaces (classes) should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCProtocol CompletionContext_ObjCProtocol} - Completions for Objective-C protocols should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCCategory CompletionContext_ObjCCategory} - Completions for Objective-C categories should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCInstanceMessage CompletionContext_ObjCInstanceMessage} - Completions for Objective-C instance messages should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCClassMessage CompletionContext_ObjCClassMessage} - Completions for Objective-C class messages should be included in the results.</li>
     * <li>{@link #CXCompletionContext_ObjCSelectorName CompletionContext_ObjCSelectorName} - Completions for Objective-C selector names should be included in the results.</li>
     * <li>{@link #CXCompletionContext_MacroName CompletionContext_MacroName} - Completions for preprocessor macro names should be included in the results.</li>
     * <li>{@link #CXCompletionContext_NaturalLanguage CompletionContext_NaturalLanguage} - Natural language completions should be included in the results.</li>
     * <li>{@link #CXCompletionContext_IncludedFile CompletionContext_IncludedFile} - {@code #include} file completions should be included in the results.</li>
     * <li>{@link #CXCompletionContext_Unknown CompletionContext_Unknown} - The current context is unknown, so set all contexts.</li>
     * </ul>
     */
    public static final int
        CXCompletionContext_Unexposed           = 0,
        CXCompletionContext_AnyType             = 1 << 0,
        CXCompletionContext_AnyValue            = 1 << 1,
        CXCompletionContext_ObjCObjectValue     = 1 << 2,
        CXCompletionContext_ObjCSelectorValue   = 1 << 3,
        CXCompletionContext_CXXClassTypeValue   = 1 << 4,
        CXCompletionContext_DotMemberAccess     = 1 << 5,
        CXCompletionContext_ArrowMemberAccess   = 1 << 6,
        CXCompletionContext_ObjCPropertyAccess  = 1 << 7,
        CXCompletionContext_EnumTag             = 1 << 8,
        CXCompletionContext_UnionTag            = 1 << 9,
        CXCompletionContext_StructTag           = 1 << 10,
        CXCompletionContext_ClassTag            = 1 << 11,
        CXCompletionContext_Namespace           = 1 << 12,
        CXCompletionContext_NestedNameSpecifier = 1 << 13,
        CXCompletionContext_ObjCInterface       = 1 << 14,
        CXCompletionContext_ObjCProtocol        = 1 << 15,
        CXCompletionContext_ObjCCategory        = 1 << 16,
        CXCompletionContext_ObjCInstanceMessage = 1 << 17,
        CXCompletionContext_ObjCClassMessage    = 1 << 18,
        CXCompletionContext_ObjCSelectorName    = 1 << 19,
        CXCompletionContext_MacroName           = 1 << 20,
        CXCompletionContext_NaturalLanguage     = 1 << 21,
        CXCompletionContext_IncludedFile        = 1 << 22,
        CXCompletionContext_Unknown             = ((1 << 23) - 1);

    /**
     * {@code CXEvalResultKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXEval_Int Eval_Int}</li>
     * <li>{@link #CXEval_Float Eval_Float}</li>
     * <li>{@link #CXEval_ObjCStrLiteral Eval_ObjCStrLiteral}</li>
     * <li>{@link #CXEval_StrLiteral Eval_StrLiteral}</li>
     * <li>{@link #CXEval_CFStr Eval_CFStr}</li>
     * <li>{@link #CXEval_Other Eval_Other}</li>
     * <li>{@link #CXEval_UnExposed Eval_UnExposed}</li>
     * </ul>
     */
    public static final int
        CXEval_Int            = 1,
        CXEval_Float          = 2,
        CXEval_ObjCStrLiteral = 3,
        CXEval_StrLiteral     = 4,
        CXEval_CFStr          = 5,
        CXEval_Other          = 6,
        CXEval_UnExposed      = 0;

    /**
     * {@code enum CXVisitorResult}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXVisit_Break Visit_Break}</li>
     * <li>{@link #CXVisit_Continue Visit_Continue}</li>
     * </ul>
     */
    public static final int
        CXVisit_Break    = 0,
        CXVisit_Continue = 1;

    /**
     * {@code CXResult}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXResult_Success Result_Success} - Function returned successfully.</li>
     * <li>{@link #CXResult_Invalid Result_Invalid} - One of the parameters was invalid for the function.</li>
     * <li>{@link #CXResult_VisitBreak Result_VisitBreak} - The function was terminated by a callback (e.g. it returned CXVisit_Break)</li>
     * </ul>
     */
    public static final int
        CXResult_Success    = 0,
        CXResult_Invalid    = 1,
        CXResult_VisitBreak = 2;

    /**
     * {@code CXIdxEntityKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXIdxEntity_Unexposed IdxEntity_Unexposed}</li>
     * <li>{@link #CXIdxEntity_Typedef IdxEntity_Typedef}</li>
     * <li>{@link #CXIdxEntity_Function IdxEntity_Function}</li>
     * <li>{@link #CXIdxEntity_Variable IdxEntity_Variable}</li>
     * <li>{@link #CXIdxEntity_Field IdxEntity_Field}</li>
     * <li>{@link #CXIdxEntity_EnumConstant IdxEntity_EnumConstant}</li>
     * <li>{@link #CXIdxEntity_ObjCClass IdxEntity_ObjCClass}</li>
     * <li>{@link #CXIdxEntity_ObjCProtocol IdxEntity_ObjCProtocol}</li>
     * <li>{@link #CXIdxEntity_ObjCCategory IdxEntity_ObjCCategory}</li>
     * <li>{@link #CXIdxEntity_ObjCInstanceMethod IdxEntity_ObjCInstanceMethod}</li>
     * <li>{@link #CXIdxEntity_ObjCClassMethod IdxEntity_ObjCClassMethod}</li>
     * <li>{@link #CXIdxEntity_ObjCProperty IdxEntity_ObjCProperty}</li>
     * <li>{@link #CXIdxEntity_ObjCIvar IdxEntity_ObjCIvar}</li>
     * <li>{@link #CXIdxEntity_Enum IdxEntity_Enum}</li>
     * <li>{@link #CXIdxEntity_Struct IdxEntity_Struct}</li>
     * <li>{@link #CXIdxEntity_Union IdxEntity_Union}</li>
     * <li>{@link #CXIdxEntity_CXXClass IdxEntity_CXXClass}</li>
     * <li>{@link #CXIdxEntity_CXXNamespace IdxEntity_CXXNamespace}</li>
     * <li>{@link #CXIdxEntity_CXXNamespaceAlias IdxEntity_CXXNamespaceAlias}</li>
     * <li>{@link #CXIdxEntity_CXXStaticVariable IdxEntity_CXXStaticVariable}</li>
     * <li>{@link #CXIdxEntity_CXXStaticMethod IdxEntity_CXXStaticMethod}</li>
     * <li>{@link #CXIdxEntity_CXXInstanceMethod IdxEntity_CXXInstanceMethod}</li>
     * <li>{@link #CXIdxEntity_CXXConstructor IdxEntity_CXXConstructor}</li>
     * <li>{@link #CXIdxEntity_CXXDestructor IdxEntity_CXXDestructor}</li>
     * <li>{@link #CXIdxEntity_CXXConversionFunction IdxEntity_CXXConversionFunction}</li>
     * <li>{@link #CXIdxEntity_CXXTypeAlias IdxEntity_CXXTypeAlias}</li>
     * <li>{@link #CXIdxEntity_CXXInterface IdxEntity_CXXInterface}</li>
     * </ul>
     */
    public static final int
        CXIdxEntity_Unexposed             = 0,
        CXIdxEntity_Typedef               = 1,
        CXIdxEntity_Function              = 2,
        CXIdxEntity_Variable              = 3,
        CXIdxEntity_Field                 = 4,
        CXIdxEntity_EnumConstant          = 5,
        CXIdxEntity_ObjCClass             = 6,
        CXIdxEntity_ObjCProtocol          = 7,
        CXIdxEntity_ObjCCategory          = 8,
        CXIdxEntity_ObjCInstanceMethod    = 9,
        CXIdxEntity_ObjCClassMethod       = 10,
        CXIdxEntity_ObjCProperty          = 11,
        CXIdxEntity_ObjCIvar              = 12,
        CXIdxEntity_Enum                  = 13,
        CXIdxEntity_Struct                = 14,
        CXIdxEntity_Union                 = 15,
        CXIdxEntity_CXXClass              = 16,
        CXIdxEntity_CXXNamespace          = 17,
        CXIdxEntity_CXXNamespaceAlias     = 18,
        CXIdxEntity_CXXStaticVariable     = 19,
        CXIdxEntity_CXXStaticMethod       = 20,
        CXIdxEntity_CXXInstanceMethod     = 21,
        CXIdxEntity_CXXConstructor        = 22,
        CXIdxEntity_CXXDestructor         = 23,
        CXIdxEntity_CXXConversionFunction = 24,
        CXIdxEntity_CXXTypeAlias          = 25,
        CXIdxEntity_CXXInterface          = 26;

    /**
     * {@code CXIdxEntityLanguage}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXIdxEntityLang_None IdxEntityLang_None}</li>
     * <li>{@link #CXIdxEntityLang_C IdxEntityLang_C}</li>
     * <li>{@link #CXIdxEntityLang_ObjC IdxEntityLang_ObjC}</li>
     * <li>{@link #CXIdxEntityLang_CXX IdxEntityLang_CXX}</li>
     * <li>{@link #CXIdxEntityLang_Swift IdxEntityLang_Swift}</li>
     * </ul>
     */
    public static final int
        CXIdxEntityLang_None  = 0,
        CXIdxEntityLang_C     = 1,
        CXIdxEntityLang_ObjC  = 2,
        CXIdxEntityLang_CXX   = 3,
        CXIdxEntityLang_Swift = 4;

    /**
     * Extra C++ template information for an entity. This can apply to: CXIdxEntity_Function CXIdxEntity_CXXClass CXIdxEntity_CXXStaticMethod
     * CXIdxEntity_CXXInstanceMethod CXIdxEntity_CXXConstructor CXIdxEntity_CXXConversionFunction CXIdxEntity_CXXTypeAlias
     * 
     * <p>({@code CXIdxEntityCXXTemplateKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXIdxEntity_NonTemplate IdxEntity_NonTemplate}</li>
     * <li>{@link #CXIdxEntity_Template IdxEntity_Template}</li>
     * <li>{@link #CXIdxEntity_TemplatePartialSpecialization IdxEntity_TemplatePartialSpecialization}</li>
     * <li>{@link #CXIdxEntity_TemplateSpecialization IdxEntity_TemplateSpecialization}</li>
     * </ul>
     */
    public static final int
        CXIdxEntity_NonTemplate                   = 0,
        CXIdxEntity_Template                      = 1,
        CXIdxEntity_TemplatePartialSpecialization = 2,
        CXIdxEntity_TemplateSpecialization        = 3;

    /**
     * {@code CXIdxAttrKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXIdxAttr_Unexposed IdxAttr_Unexposed}</li>
     * <li>{@link #CXIdxAttr_IBAction IdxAttr_IBAction}</li>
     * <li>{@link #CXIdxAttr_IBOutlet IdxAttr_IBOutlet}</li>
     * <li>{@link #CXIdxAttr_IBOutletCollection IdxAttr_IBOutletCollection}</li>
     * </ul>
     */
    public static final int
        CXIdxAttr_Unexposed          = 0,
        CXIdxAttr_IBAction           = 1,
        CXIdxAttr_IBOutlet           = 2,
        CXIdxAttr_IBOutletCollection = 3;

    /** {@code CXIdxDeclInfoFlags} */
    public static final int CXIdxDeclFlag_Skipped = 0x1;

    /**
     * {@code CXIdxObjCContainerKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXIdxObjCContainer_ForwardRef IdxObjCContainer_ForwardRef}</li>
     * <li>{@link #CXIdxObjCContainer_Interface IdxObjCContainer_Interface}</li>
     * <li>{@link #CXIdxObjCContainer_Implementation IdxObjCContainer_Implementation}</li>
     * </ul>
     */
    public static final int
        CXIdxObjCContainer_ForwardRef     = 0,
        CXIdxObjCContainer_Interface      = 1,
        CXIdxObjCContainer_Implementation = 2;

    /**
     * Data for {@link IndexerCallbacks#indexEntityReference}. ({@code CXIdxEntityRefKind})
     * 
     * <p>This may be deprecated in a future version as this duplicates the {@code CXSymbolRole_Implicit} bit in {@code CXSymbolRole}.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXIdxEntityRef_Direct IdxEntityRef_Direct} - The entity is referenced directly in user's code.</li>
     * <li>{@link #CXIdxEntityRef_Implicit IdxEntityRef_Implicit} - An implicit reference, e.g. a reference of an Objective-C method via the dot syntax.</li>
     * </ul>
     */
    public static final int
        CXIdxEntityRef_Direct   = 1,
        CXIdxEntityRef_Implicit = 2;

    /**
     * Roles that are attributed to symbol occurrences. ({@code CXSymbolRole})
     * 
     * <p>Internal: this currently mirrors low 9 bits of clang::index::SymbolRole with higher bits zeroed. These high bits may be exposed in the future.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXSymbolRole_None SymbolRole_None}</li>
     * <li>{@link #CXSymbolRole_Declaration SymbolRole_Declaration}</li>
     * <li>{@link #CXSymbolRole_Definition SymbolRole_Definition}</li>
     * <li>{@link #CXSymbolRole_Reference SymbolRole_Reference}</li>
     * <li>{@link #CXSymbolRole_Read SymbolRole_Read}</li>
     * <li>{@link #CXSymbolRole_Write SymbolRole_Write}</li>
     * <li>{@link #CXSymbolRole_Call SymbolRole_Call}</li>
     * <li>{@link #CXSymbolRole_Dynamic SymbolRole_Dynamic}</li>
     * <li>{@link #CXSymbolRole_AddressOf SymbolRole_AddressOf}</li>
     * <li>{@link #CXSymbolRole_Implicit SymbolRole_Implicit}</li>
     * </ul>
     */
    public static final int
        CXSymbolRole_None        = 0,
        CXSymbolRole_Declaration = 1 << 0,
        CXSymbolRole_Definition  = 1 << 1,
        CXSymbolRole_Reference   = 1 << 2,
        CXSymbolRole_Read        = 1 << 3,
        CXSymbolRole_Write       = 1 << 4,
        CXSymbolRole_Call        = 1 << 5,
        CXSymbolRole_Dynamic     = 1 << 6,
        CXSymbolRole_AddressOf   = 1 << 7,
        CXSymbolRole_Implicit    = 1 << 8;

    /**
     * {@code CXIndexOptFlags}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CXIndexOpt_None IndexOpt_None} - Used to indicate that no special indexing options are needed.</li>
     * <li>{@link #CXIndexOpt_SuppressRedundantRefs IndexOpt_SuppressRedundantRefs} - 
     * Used to indicate that {@link IndexerCallbacks#indexEntityReference} should be invoked for only one reference of an entity per source file that does not
     * also include a declaration/definition of the entity.
     * </li>
     * <li>{@link #CXIndexOpt_IndexFunctionLocalSymbols IndexOpt_IndexFunctionLocalSymbols} - Function-local symbols should be indexed. If this is not set function-local symbols will be ignored.</li>
     * <li>{@link #CXIndexOpt_IndexImplicitTemplateInstantiations IndexOpt_IndexImplicitTemplateInstantiations} - Implicit function/class template instantiations should be indexed. If this is not set, implicit instantiations will be ignored.</li>
     * <li>{@link #CXIndexOpt_SuppressWarnings IndexOpt_SuppressWarnings} - Suppress all compiler warnings when parsing for indexing.</li>
     * <li>{@link #CXIndexOpt_SkipParsedBodiesInSession IndexOpt_SkipParsedBodiesInSession} - 
     * Skip a function/method body that was already parsed during an indexing session associated with a {@code CXIndexAction} object. Bodies in system
     * headers are always skipped.
     * </li>
     * </ul>
     */
    public static final int
        CXIndexOpt_None                                = 0x0,
        CXIndexOpt_SuppressRedundantRefs               = 0x1,
        CXIndexOpt_IndexFunctionLocalSymbols           = 0x2,
        CXIndexOpt_IndexImplicitTemplateInstantiations = 0x4,
        CXIndexOpt_SuppressWarnings                    = 0x8,
        CXIndexOpt_SkipParsedBodiesInSession           = 0x10;

    static { LibLLVM.initialize(); }

    protected ClangIndex() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary CLANG = Library.loadNative(ClangIndex.class, "org.lwjgl.llvm", Configuration.LLVM_CLANG_LIBRARY_NAME, "libclang");

    /** Contains the function pointers loaded from the CLANG {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            getCString                              = apiGetFunctionAddress(CLANG, "clang_getCString"),
            disposeString                           = apiGetFunctionAddress(CLANG, "clang_disposeString"),
            disposeStringSet                        = apiGetFunctionAddress(CLANG, "clang_disposeStringSet"),
            createIndex                             = apiGetFunctionAddress(CLANG, "clang_createIndex"),
            disposeIndex                            = apiGetFunctionAddress(CLANG, "clang_disposeIndex"),
            CXIndex_setGlobalOptions                = apiGetFunctionAddress(CLANG, "clang_CXIndex_setGlobalOptions"),
            CXIndex_getGlobalOptions                = apiGetFunctionAddress(CLANG, "clang_CXIndex_getGlobalOptions"),
            CXIndex_setInvocationEmissionPathOption = CLANG.getFunctionAddress("clang_CXIndex_setInvocationEmissionPathOption"),
            getFileName                             = apiGetFunctionAddress(CLANG, "clang_getFileName"),
            getFileTime                             = apiGetFunctionAddress(CLANG, "clang_getFileTime"),
            getFileUniqueID                         = apiGetFunctionAddress(CLANG, "clang_getFileUniqueID"),
            isFileMultipleIncludeGuarded            = apiGetFunctionAddress(CLANG, "clang_isFileMultipleIncludeGuarded"),
            getFile                                 = apiGetFunctionAddress(CLANG, "clang_getFile"),
            getFileContents                         = CLANG.getFunctionAddress("clang_getFileContents"),
            File_isEqual                            = apiGetFunctionAddress(CLANG, "clang_File_isEqual"),
            File_tryGetRealPathName                 = CLANG.getFunctionAddress("clang_File_tryGetRealPathName"),
            getNullLocation                         = apiGetFunctionAddress(CLANG, "clang_getNullLocation"),
            equalLocations                          = apiGetFunctionAddress(CLANG, "clang_equalLocations"),
            getLocation                             = apiGetFunctionAddress(CLANG, "clang_getLocation"),
            getLocationForOffset                    = apiGetFunctionAddress(CLANG, "clang_getLocationForOffset"),
            Location_isInSystemHeader               = apiGetFunctionAddress(CLANG, "clang_Location_isInSystemHeader"),
            Location_isFromMainFile                 = apiGetFunctionAddress(CLANG, "clang_Location_isFromMainFile"),
            getNullRange                            = apiGetFunctionAddress(CLANG, "clang_getNullRange"),
            getRange                                = apiGetFunctionAddress(CLANG, "clang_getRange"),
            equalRanges                             = apiGetFunctionAddress(CLANG, "clang_equalRanges"),
            Range_isNull                            = apiGetFunctionAddress(CLANG, "clang_Range_isNull"),
            getExpansionLocation                    = apiGetFunctionAddress(CLANG, "clang_getExpansionLocation"),
            getPresumedLocation                     = apiGetFunctionAddress(CLANG, "clang_getPresumedLocation"),
            getSpellingLocation                     = apiGetFunctionAddress(CLANG, "clang_getSpellingLocation"),
            getFileLocation                         = apiGetFunctionAddress(CLANG, "clang_getFileLocation"),
            getRangeStart                           = apiGetFunctionAddress(CLANG, "clang_getRangeStart"),
            getRangeEnd                             = apiGetFunctionAddress(CLANG, "clang_getRangeEnd"),
            getSkippedRanges                        = apiGetFunctionAddress(CLANG, "clang_getSkippedRanges"),
            getAllSkippedRanges                     = apiGetFunctionAddress(CLANG, "clang_getAllSkippedRanges"),
            disposeSourceRangeList                  = apiGetFunctionAddress(CLANG, "clang_disposeSourceRangeList"),
            getNumDiagnosticsInSet                  = apiGetFunctionAddress(CLANG, "clang_getNumDiagnosticsInSet"),
            getDiagnosticInSet                      = apiGetFunctionAddress(CLANG, "clang_getDiagnosticInSet"),
            loadDiagnostics                         = apiGetFunctionAddress(CLANG, "clang_loadDiagnostics"),
            disposeDiagnosticSet                    = apiGetFunctionAddress(CLANG, "clang_disposeDiagnosticSet"),
            getChildDiagnostics                     = apiGetFunctionAddress(CLANG, "clang_getChildDiagnostics"),
            getNumDiagnostics                       = apiGetFunctionAddress(CLANG, "clang_getNumDiagnostics"),
            getDiagnostic                           = apiGetFunctionAddress(CLANG, "clang_getDiagnostic"),
            getDiagnosticSetFromTU                  = apiGetFunctionAddress(CLANG, "clang_getDiagnosticSetFromTU"),
            disposeDiagnostic                       = apiGetFunctionAddress(CLANG, "clang_disposeDiagnostic"),
            formatDiagnostic                        = apiGetFunctionAddress(CLANG, "clang_formatDiagnostic"),
            defaultDiagnosticDisplayOptions         = apiGetFunctionAddress(CLANG, "clang_defaultDiagnosticDisplayOptions"),
            getDiagnosticSeverity                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticSeverity"),
            getDiagnosticLocation                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticLocation"),
            getDiagnosticSpelling                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticSpelling"),
            getDiagnosticOption                     = apiGetFunctionAddress(CLANG, "clang_getDiagnosticOption"),
            getDiagnosticCategory                   = apiGetFunctionAddress(CLANG, "clang_getDiagnosticCategory"),
            getDiagnosticCategoryText               = apiGetFunctionAddress(CLANG, "clang_getDiagnosticCategoryText"),
            getDiagnosticNumRanges                  = apiGetFunctionAddress(CLANG, "clang_getDiagnosticNumRanges"),
            getDiagnosticRange                      = apiGetFunctionAddress(CLANG, "clang_getDiagnosticRange"),
            getDiagnosticNumFixIts                  = apiGetFunctionAddress(CLANG, "clang_getDiagnosticNumFixIts"),
            getDiagnosticFixIt                      = apiGetFunctionAddress(CLANG, "clang_getDiagnosticFixIt"),
            getTranslationUnitSpelling              = apiGetFunctionAddress(CLANG, "clang_getTranslationUnitSpelling"),
            createTranslationUnitFromSourceFile     = apiGetFunctionAddress(CLANG, "clang_createTranslationUnitFromSourceFile"),
            createTranslationUnit                   = apiGetFunctionAddress(CLANG, "clang_createTranslationUnit"),
            createTranslationUnit2                  = apiGetFunctionAddress(CLANG, "clang_createTranslationUnit2"),
            defaultEditingTranslationUnitOptions    = apiGetFunctionAddress(CLANG, "clang_defaultEditingTranslationUnitOptions"),
            parseTranslationUnit                    = apiGetFunctionAddress(CLANG, "clang_parseTranslationUnit"),
            parseTranslationUnit2                   = apiGetFunctionAddress(CLANG, "clang_parseTranslationUnit2"),
            parseTranslationUnit2FullArgv           = apiGetFunctionAddress(CLANG, "clang_parseTranslationUnit2FullArgv"),
            defaultSaveOptions                      = apiGetFunctionAddress(CLANG, "clang_defaultSaveOptions"),
            saveTranslationUnit                     = apiGetFunctionAddress(CLANG, "clang_saveTranslationUnit"),
            suspendTranslationUnit                  = apiGetFunctionAddress(CLANG, "clang_suspendTranslationUnit"),
            disposeTranslationUnit                  = apiGetFunctionAddress(CLANG, "clang_disposeTranslationUnit"),
            defaultReparseOptions                   = apiGetFunctionAddress(CLANG, "clang_defaultReparseOptions"),
            reparseTranslationUnit                  = apiGetFunctionAddress(CLANG, "clang_reparseTranslationUnit"),
            getTUResourceUsageName                  = apiGetFunctionAddress(CLANG, "clang_getTUResourceUsageName"),
            getCXTUResourceUsage                    = apiGetFunctionAddress(CLANG, "clang_getCXTUResourceUsage"),
            disposeCXTUResourceUsage                = apiGetFunctionAddress(CLANG, "clang_disposeCXTUResourceUsage"),
            getTranslationUnitTargetInfo            = apiGetFunctionAddress(CLANG, "clang_getTranslationUnitTargetInfo"),
            TargetInfo_dispose                      = apiGetFunctionAddress(CLANG, "clang_TargetInfo_dispose"),
            TargetInfo_getTriple                    = apiGetFunctionAddress(CLANG, "clang_TargetInfo_getTriple"),
            TargetInfo_getPointerWidth              = apiGetFunctionAddress(CLANG, "clang_TargetInfo_getPointerWidth"),
            getNullCursor                           = apiGetFunctionAddress(CLANG, "clang_getNullCursor"),
            getTranslationUnitCursor                = apiGetFunctionAddress(CLANG, "clang_getTranslationUnitCursor"),
            equalCursors                            = apiGetFunctionAddress(CLANG, "clang_equalCursors"),
            Cursor_isNull                           = apiGetFunctionAddress(CLANG, "clang_Cursor_isNull"),
            hashCursor                              = apiGetFunctionAddress(CLANG, "clang_hashCursor"),
            getCursorKind                           = apiGetFunctionAddress(CLANG, "clang_getCursorKind"),
            isDeclaration                           = apiGetFunctionAddress(CLANG, "clang_isDeclaration"),
            isInvalidDeclaration                    = CLANG.getFunctionAddress("clang_isInvalidDeclaration"),
            isReference                             = apiGetFunctionAddress(CLANG, "clang_isReference"),
            isExpression                            = apiGetFunctionAddress(CLANG, "clang_isExpression"),
            isStatement                             = apiGetFunctionAddress(CLANG, "clang_isStatement"),
            isAttribute                             = apiGetFunctionAddress(CLANG, "clang_isAttribute"),
            Cursor_hasAttrs                         = apiGetFunctionAddress(CLANG, "clang_Cursor_hasAttrs"),
            isInvalid                               = apiGetFunctionAddress(CLANG, "clang_isInvalid"),
            isTranslationUnit                       = apiGetFunctionAddress(CLANG, "clang_isTranslationUnit"),
            isPreprocessing                         = apiGetFunctionAddress(CLANG, "clang_isPreprocessing"),
            isUnexposed                             = apiGetFunctionAddress(CLANG, "clang_isUnexposed"),
            getCursorLinkage                        = apiGetFunctionAddress(CLANG, "clang_getCursorLinkage"),
            getCursorVisibility                     = apiGetFunctionAddress(CLANG, "clang_getCursorVisibility"),
            getCursorAvailability                   = apiGetFunctionAddress(CLANG, "clang_getCursorAvailability"),
            getCursorPlatformAvailability           = apiGetFunctionAddress(CLANG, "clang_getCursorPlatformAvailability"),
            disposeCXPlatformAvailability           = apiGetFunctionAddress(CLANG, "clang_disposeCXPlatformAvailability"),
            getCursorLanguage                       = apiGetFunctionAddress(CLANG, "clang_getCursorLanguage"),
            getCursorTLSKind                        = CLANG.getFunctionAddress("clang_getCursorTLSKind"),
            Cursor_getTranslationUnit               = apiGetFunctionAddress(CLANG, "clang_Cursor_getTranslationUnit"),
            createCXCursorSet                       = apiGetFunctionAddress(CLANG, "clang_createCXCursorSet"),
            disposeCXCursorSet                      = apiGetFunctionAddress(CLANG, "clang_disposeCXCursorSet"),
            CXCursorSet_contains                    = apiGetFunctionAddress(CLANG, "clang_CXCursorSet_contains"),
            CXCursorSet_insert                      = apiGetFunctionAddress(CLANG, "clang_CXCursorSet_insert"),
            getCursorSemanticParent                 = apiGetFunctionAddress(CLANG, "clang_getCursorSemanticParent"),
            getCursorLexicalParent                  = apiGetFunctionAddress(CLANG, "clang_getCursorLexicalParent"),
            getOverriddenCursors                    = apiGetFunctionAddress(CLANG, "clang_getOverriddenCursors"),
            disposeOverriddenCursors                = apiGetFunctionAddress(CLANG, "clang_disposeOverriddenCursors"),
            getIncludedFile                         = apiGetFunctionAddress(CLANG, "clang_getIncludedFile"),
            getCursor                               = apiGetFunctionAddress(CLANG, "clang_getCursor"),
            getCursorLocation                       = apiGetFunctionAddress(CLANG, "clang_getCursorLocation"),
            getCursorExtent                         = apiGetFunctionAddress(CLANG, "clang_getCursorExtent"),
            getCursorType                           = apiGetFunctionAddress(CLANG, "clang_getCursorType"),
            getTypeSpelling                         = apiGetFunctionAddress(CLANG, "clang_getTypeSpelling"),
            getTypedefDeclUnderlyingType            = apiGetFunctionAddress(CLANG, "clang_getTypedefDeclUnderlyingType"),
            getEnumDeclIntegerType                  = apiGetFunctionAddress(CLANG, "clang_getEnumDeclIntegerType"),
            getEnumConstantDeclValue                = apiGetFunctionAddress(CLANG, "clang_getEnumConstantDeclValue"),
            getEnumConstantDeclUnsignedValue        = apiGetFunctionAddress(CLANG, "clang_getEnumConstantDeclUnsignedValue"),
            getFieldDeclBitWidth                    = apiGetFunctionAddress(CLANG, "clang_getFieldDeclBitWidth"),
            Cursor_getNumArguments                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getNumArguments"),
            Cursor_getArgument                      = apiGetFunctionAddress(CLANG, "clang_Cursor_getArgument"),
            Cursor_getNumTemplateArguments          = apiGetFunctionAddress(CLANG, "clang_Cursor_getNumTemplateArguments"),
            Cursor_getTemplateArgumentKind          = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentKind"),
            Cursor_getTemplateArgumentType          = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentType"),
            Cursor_getTemplateArgumentValue         = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentValue"),
            Cursor_getTemplateArgumentUnsignedValue = apiGetFunctionAddress(CLANG, "clang_Cursor_getTemplateArgumentUnsignedValue"),
            equalTypes                              = apiGetFunctionAddress(CLANG, "clang_equalTypes"),
            getCanonicalType                        = apiGetFunctionAddress(CLANG, "clang_getCanonicalType"),
            isConstQualifiedType                    = apiGetFunctionAddress(CLANG, "clang_isConstQualifiedType"),
            Cursor_isMacroFunctionLike              = apiGetFunctionAddress(CLANG, "clang_Cursor_isMacroFunctionLike"),
            Cursor_isMacroBuiltin                   = apiGetFunctionAddress(CLANG, "clang_Cursor_isMacroBuiltin"),
            Cursor_isFunctionInlined                = apiGetFunctionAddress(CLANG, "clang_Cursor_isFunctionInlined"),
            isVolatileQualifiedType                 = apiGetFunctionAddress(CLANG, "clang_isVolatileQualifiedType"),
            isRestrictQualifiedType                 = apiGetFunctionAddress(CLANG, "clang_isRestrictQualifiedType"),
            getAddressSpace                         = apiGetFunctionAddress(CLANG, "clang_getAddressSpace"),
            getTypedefName                          = apiGetFunctionAddress(CLANG, "clang_getTypedefName"),
            getPointeeType                          = apiGetFunctionAddress(CLANG, "clang_getPointeeType"),
            getTypeDeclaration                      = apiGetFunctionAddress(CLANG, "clang_getTypeDeclaration"),
            getDeclObjCTypeEncoding                 = apiGetFunctionAddress(CLANG, "clang_getDeclObjCTypeEncoding"),
            Type_getObjCEncoding                    = apiGetFunctionAddress(CLANG, "clang_Type_getObjCEncoding"),
            getTypeKindSpelling                     = apiGetFunctionAddress(CLANG, "clang_getTypeKindSpelling"),
            getFunctionTypeCallingConv              = apiGetFunctionAddress(CLANG, "clang_getFunctionTypeCallingConv"),
            getResultType                           = apiGetFunctionAddress(CLANG, "clang_getResultType"),
            getExceptionSpecificationType           = apiGetFunctionAddress(CLANG, "clang_getExceptionSpecificationType"),
            getNumArgTypes                          = apiGetFunctionAddress(CLANG, "clang_getNumArgTypes"),
            getArgType                              = apiGetFunctionAddress(CLANG, "clang_getArgType"),
            Type_getObjCObjectBaseType              = CLANG.getFunctionAddress("clang_Type_getObjCObjectBaseType"),
            Type_getNumObjCProtocolRefs             = CLANG.getFunctionAddress("clang_Type_getNumObjCProtocolRefs"),
            Type_getObjCProtocolDecl                = CLANG.getFunctionAddress("clang_Type_getObjCProtocolDecl"),
            Type_getNumObjCTypeArgs                 = CLANG.getFunctionAddress("clang_Type_getNumObjCTypeArgs"),
            Type_getObjCTypeArg                     = CLANG.getFunctionAddress("clang_Type_getObjCTypeArg"),
            isFunctionTypeVariadic                  = apiGetFunctionAddress(CLANG, "clang_isFunctionTypeVariadic"),
            getCursorResultType                     = apiGetFunctionAddress(CLANG, "clang_getCursorResultType"),
            getCursorExceptionSpecificationType     = apiGetFunctionAddress(CLANG, "clang_getCursorExceptionSpecificationType"),
            isPODType                               = apiGetFunctionAddress(CLANG, "clang_isPODType"),
            getElementType                          = apiGetFunctionAddress(CLANG, "clang_getElementType"),
            getNumElements                          = apiGetFunctionAddress(CLANG, "clang_getNumElements"),
            getArrayElementType                     = apiGetFunctionAddress(CLANG, "clang_getArrayElementType"),
            getArraySize                            = apiGetFunctionAddress(CLANG, "clang_getArraySize"),
            Type_getNamedType                       = apiGetFunctionAddress(CLANG, "clang_Type_getNamedType"),
            Type_isTransparentTagTypedef            = apiGetFunctionAddress(CLANG, "clang_Type_isTransparentTagTypedef"),
            Type_getNullability                     = CLANG.getFunctionAddress("clang_Type_getNullability"),
            Type_getAlignOf                         = apiGetFunctionAddress(CLANG, "clang_Type_getAlignOf"),
            Type_getClassType                       = apiGetFunctionAddress(CLANG, "clang_Type_getClassType"),
            Type_getSizeOf                          = apiGetFunctionAddress(CLANG, "clang_Type_getSizeOf"),
            Type_getOffsetOf                        = apiGetFunctionAddress(CLANG, "clang_Type_getOffsetOf"),
            Type_getModifiedType                    = CLANG.getFunctionAddress("clang_Type_getModifiedType"),
            Cursor_getOffsetOfField                 = apiGetFunctionAddress(CLANG, "clang_Cursor_getOffsetOfField"),
            Cursor_isAnonymous                      = apiGetFunctionAddress(CLANG, "clang_Cursor_isAnonymous"),
            Type_getNumTemplateArguments            = apiGetFunctionAddress(CLANG, "clang_Type_getNumTemplateArguments"),
            Type_getTemplateArgumentAsType          = apiGetFunctionAddress(CLANG, "clang_Type_getTemplateArgumentAsType"),
            Type_getCXXRefQualifier                 = apiGetFunctionAddress(CLANG, "clang_Type_getCXXRefQualifier"),
            Cursor_isBitField                       = apiGetFunctionAddress(CLANG, "clang_Cursor_isBitField"),
            isVirtualBase                           = apiGetFunctionAddress(CLANG, "clang_isVirtualBase"),
            getCXXAccessSpecifier                   = apiGetFunctionAddress(CLANG, "clang_getCXXAccessSpecifier"),
            Cursor_getStorageClass                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getStorageClass"),
            getNumOverloadedDecls                   = apiGetFunctionAddress(CLANG, "clang_getNumOverloadedDecls"),
            getOverloadedDecl                       = apiGetFunctionAddress(CLANG, "clang_getOverloadedDecl"),
            getIBOutletCollectionType               = apiGetFunctionAddress(CLANG, "clang_getIBOutletCollectionType"),
            visitChildren                           = apiGetFunctionAddress(CLANG, "clang_visitChildren"),
            getCursorUSR                            = apiGetFunctionAddress(CLANG, "clang_getCursorUSR"),
            constructUSR_ObjCClass                  = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCClass"),
            constructUSR_ObjCCategory               = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCCategory"),
            constructUSR_ObjCProtocol               = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCProtocol"),
            constructUSR_ObjCIvar                   = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCIvar"),
            constructUSR_ObjCMethod                 = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCMethod"),
            constructUSR_ObjCProperty               = apiGetFunctionAddress(CLANG, "clang_constructUSR_ObjCProperty"),
            getCursorSpelling                       = apiGetFunctionAddress(CLANG, "clang_getCursorSpelling"),
            Cursor_getSpellingNameRange             = apiGetFunctionAddress(CLANG, "clang_Cursor_getSpellingNameRange"),
            PrintingPolicy_getProperty              = CLANG.getFunctionAddress("clang_PrintingPolicy_getProperty"),
            PrintingPolicy_setProperty              = CLANG.getFunctionAddress("clang_PrintingPolicy_setProperty"),
            getCursorPrintingPolicy                 = CLANG.getFunctionAddress("clang_getCursorPrintingPolicy"),
            PrintingPolicy_dispose                  = CLANG.getFunctionAddress("clang_PrintingPolicy_dispose"),
            getCursorPrettyPrinted                  = CLANG.getFunctionAddress("clang_getCursorPrettyPrinted"),
            getCursorDisplayName                    = apiGetFunctionAddress(CLANG, "clang_getCursorDisplayName"),
            getCursorReferenced                     = apiGetFunctionAddress(CLANG, "clang_getCursorReferenced"),
            getCursorDefinition                     = apiGetFunctionAddress(CLANG, "clang_getCursorDefinition"),
            isCursorDefinition                      = apiGetFunctionAddress(CLANG, "clang_isCursorDefinition"),
            getCanonicalCursor                      = apiGetFunctionAddress(CLANG, "clang_getCanonicalCursor"),
            Cursor_getObjCSelectorIndex             = apiGetFunctionAddress(CLANG, "clang_Cursor_getObjCSelectorIndex"),
            Cursor_isDynamicCall                    = apiGetFunctionAddress(CLANG, "clang_Cursor_isDynamicCall"),
            Cursor_getReceiverType                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getReceiverType"),
            Cursor_getObjCPropertyAttributes        = apiGetFunctionAddress(CLANG, "clang_Cursor_getObjCPropertyAttributes"),
            Cursor_getObjCPropertyGetterName        = CLANG.getFunctionAddress("clang_Cursor_getObjCPropertyGetterName"),
            Cursor_getObjCPropertySetterName        = CLANG.getFunctionAddress("clang_Cursor_getObjCPropertySetterName"),
            Cursor_getObjCDeclQualifiers            = apiGetFunctionAddress(CLANG, "clang_Cursor_getObjCDeclQualifiers"),
            Cursor_isObjCOptional                   = apiGetFunctionAddress(CLANG, "clang_Cursor_isObjCOptional"),
            Cursor_isVariadic                       = apiGetFunctionAddress(CLANG, "clang_Cursor_isVariadic"),
            Cursor_isExternalSymbol                 = apiGetFunctionAddress(CLANG, "clang_Cursor_isExternalSymbol"),
            Cursor_getCommentRange                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getCommentRange"),
            Cursor_getRawCommentText                = apiGetFunctionAddress(CLANG, "clang_Cursor_getRawCommentText"),
            Cursor_getBriefCommentText              = apiGetFunctionAddress(CLANG, "clang_Cursor_getBriefCommentText"),
            Cursor_getMangling                      = apiGetFunctionAddress(CLANG, "clang_Cursor_getMangling"),
            Cursor_getCXXManglings                  = apiGetFunctionAddress(CLANG, "clang_Cursor_getCXXManglings"),
            Cursor_getObjCManglings                 = CLANG.getFunctionAddress("clang_Cursor_getObjCManglings"),
            Cursor_getModule                        = apiGetFunctionAddress(CLANG, "clang_Cursor_getModule"),
            getModuleForFile                        = apiGetFunctionAddress(CLANG, "clang_getModuleForFile"),
            Module_getASTFile                       = apiGetFunctionAddress(CLANG, "clang_Module_getASTFile"),
            Module_getParent                        = apiGetFunctionAddress(CLANG, "clang_Module_getParent"),
            Module_getName                          = apiGetFunctionAddress(CLANG, "clang_Module_getName"),
            Module_getFullName                      = apiGetFunctionAddress(CLANG, "clang_Module_getFullName"),
            Module_isSystem                         = apiGetFunctionAddress(CLANG, "clang_Module_isSystem"),
            Module_getNumTopLevelHeaders            = apiGetFunctionAddress(CLANG, "clang_Module_getNumTopLevelHeaders"),
            Module_getTopLevelHeader                = apiGetFunctionAddress(CLANG, "clang_Module_getTopLevelHeader"),
            CXXConstructor_isConvertingConstructor  = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isConvertingConstructor"),
            CXXConstructor_isCopyConstructor        = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isCopyConstructor"),
            CXXConstructor_isDefaultConstructor     = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isDefaultConstructor"),
            CXXConstructor_isMoveConstructor        = apiGetFunctionAddress(CLANG, "clang_CXXConstructor_isMoveConstructor"),
            CXXField_isMutable                      = apiGetFunctionAddress(CLANG, "clang_CXXField_isMutable"),
            CXXMethod_isDefaulted                   = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isDefaulted"),
            CXXMethod_isPureVirtual                 = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isPureVirtual"),
            CXXMethod_isStatic                      = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isStatic"),
            CXXMethod_isVirtual                     = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isVirtual"),
            CXXRecord_isAbstract                    = CLANG.getFunctionAddress("clang_CXXRecord_isAbstract"),
            EnumDecl_isScoped                       = apiGetFunctionAddress(CLANG, "clang_EnumDecl_isScoped"),
            CXXMethod_isConst                       = apiGetFunctionAddress(CLANG, "clang_CXXMethod_isConst"),
            getTemplateCursorKind                   = apiGetFunctionAddress(CLANG, "clang_getTemplateCursorKind"),
            getSpecializedCursorTemplate            = apiGetFunctionAddress(CLANG, "clang_getSpecializedCursorTemplate"),
            getCursorReferenceNameRange             = apiGetFunctionAddress(CLANG, "clang_getCursorReferenceNameRange"),
            getToken                                = CLANG.getFunctionAddress("clang_getToken"),
            getTokenKind                            = apiGetFunctionAddress(CLANG, "clang_getTokenKind"),
            getTokenSpelling                        = apiGetFunctionAddress(CLANG, "clang_getTokenSpelling"),
            getTokenLocation                        = apiGetFunctionAddress(CLANG, "clang_getTokenLocation"),
            getTokenExtent                          = apiGetFunctionAddress(CLANG, "clang_getTokenExtent"),
            tokenize                                = apiGetFunctionAddress(CLANG, "clang_tokenize"),
            annotateTokens                          = apiGetFunctionAddress(CLANG, "clang_annotateTokens"),
            disposeTokens                           = apiGetFunctionAddress(CLANG, "clang_disposeTokens"),
            getCursorKindSpelling                   = apiGetFunctionAddress(CLANG, "clang_getCursorKindSpelling"),
            getDefinitionSpellingAndExtent          = apiGetFunctionAddress(CLANG, "clang_getDefinitionSpellingAndExtent"),
            enableStackTraces                       = apiGetFunctionAddress(CLANG, "clang_enableStackTraces"),
            executeOnThread                         = apiGetFunctionAddress(CLANG, "clang_executeOnThread"),
            getCompletionChunkKind                  = apiGetFunctionAddress(CLANG, "clang_getCompletionChunkKind"),
            getCompletionChunkText                  = apiGetFunctionAddress(CLANG, "clang_getCompletionChunkText"),
            getCompletionChunkCompletionString      = apiGetFunctionAddress(CLANG, "clang_getCompletionChunkCompletionString"),
            getNumCompletionChunks                  = apiGetFunctionAddress(CLANG, "clang_getNumCompletionChunks"),
            getCompletionPriority                   = apiGetFunctionAddress(CLANG, "clang_getCompletionPriority"),
            getCompletionAvailability               = apiGetFunctionAddress(CLANG, "clang_getCompletionAvailability"),
            getCompletionNumAnnotations             = apiGetFunctionAddress(CLANG, "clang_getCompletionNumAnnotations"),
            getCompletionAnnotation                 = apiGetFunctionAddress(CLANG, "clang_getCompletionAnnotation"),
            getCompletionParent                     = apiGetFunctionAddress(CLANG, "clang_getCompletionParent"),
            getCompletionBriefComment               = apiGetFunctionAddress(CLANG, "clang_getCompletionBriefComment"),
            getCursorCompletionString               = apiGetFunctionAddress(CLANG, "clang_getCursorCompletionString"),
            getCompletionNumFixIts                  = CLANG.getFunctionAddress("clang_getCompletionNumFixIts"),
            getCompletionFixIt                      = CLANG.getFunctionAddress("clang_getCompletionFixIt"),
            defaultCodeCompleteOptions              = apiGetFunctionAddress(CLANG, "clang_defaultCodeCompleteOptions"),
            codeCompleteAt                          = apiGetFunctionAddress(CLANG, "clang_codeCompleteAt"),
            sortCodeCompletionResults               = apiGetFunctionAddress(CLANG, "clang_sortCodeCompletionResults"),
            disposeCodeCompleteResults              = apiGetFunctionAddress(CLANG, "clang_disposeCodeCompleteResults"),
            codeCompleteGetNumDiagnostics           = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetNumDiagnostics"),
            codeCompleteGetDiagnostic               = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetDiagnostic"),
            codeCompleteGetContexts                 = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetContexts"),
            codeCompleteGetContainerKind            = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetContainerKind"),
            codeCompleteGetContainerUSR             = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetContainerUSR"),
            codeCompleteGetObjCSelector             = apiGetFunctionAddress(CLANG, "clang_codeCompleteGetObjCSelector"),
            getClangVersion                         = apiGetFunctionAddress(CLANG, "clang_getClangVersion"),
            toggleCrashRecovery                     = apiGetFunctionAddress(CLANG, "clang_toggleCrashRecovery"),
            getInclusions                           = apiGetFunctionAddress(CLANG, "clang_getInclusions"),
            Cursor_Evaluate                         = apiGetFunctionAddress(CLANG, "clang_Cursor_Evaluate"),
            EvalResult_getKind                      = apiGetFunctionAddress(CLANG, "clang_EvalResult_getKind"),
            EvalResult_getAsInt                     = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsInt"),
            EvalResult_getAsLongLong                = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsLongLong"),
            EvalResult_isUnsignedInt                = apiGetFunctionAddress(CLANG, "clang_EvalResult_isUnsignedInt"),
            EvalResult_getAsUnsigned                = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsUnsigned"),
            EvalResult_getAsDouble                  = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsDouble"),
            EvalResult_getAsStr                     = apiGetFunctionAddress(CLANG, "clang_EvalResult_getAsStr"),
            EvalResult_dispose                      = apiGetFunctionAddress(CLANG, "clang_EvalResult_dispose"),
            getRemappings                           = apiGetFunctionAddress(CLANG, "clang_getRemappings"),
            getRemappingsFromFileList               = apiGetFunctionAddress(CLANG, "clang_getRemappingsFromFileList"),
            remap_getNumFiles                       = apiGetFunctionAddress(CLANG, "clang_remap_getNumFiles"),
            remap_getFilenames                      = apiGetFunctionAddress(CLANG, "clang_remap_getFilenames"),
            remap_dispose                           = apiGetFunctionAddress(CLANG, "clang_remap_dispose"),
            findReferencesInFile                    = apiGetFunctionAddress(CLANG, "clang_findReferencesInFile"),
            findIncludesInFile                      = apiGetFunctionAddress(CLANG, "clang_findIncludesInFile"),
            index_isEntityObjCContainerKind         = apiGetFunctionAddress(CLANG, "clang_index_isEntityObjCContainerKind"),
            index_getObjCContainerDeclInfo          = apiGetFunctionAddress(CLANG, "clang_index_getObjCContainerDeclInfo"),
            index_getObjCInterfaceDeclInfo          = apiGetFunctionAddress(CLANG, "clang_index_getObjCInterfaceDeclInfo"),
            index_getObjCCategoryDeclInfo           = apiGetFunctionAddress(CLANG, "clang_index_getObjCCategoryDeclInfo"),
            index_getObjCProtocolRefListInfo        = apiGetFunctionAddress(CLANG, "clang_index_getObjCProtocolRefListInfo"),
            index_getObjCPropertyDeclInfo           = apiGetFunctionAddress(CLANG, "clang_index_getObjCPropertyDeclInfo"),
            index_getIBOutletCollectionAttrInfo     = apiGetFunctionAddress(CLANG, "clang_index_getIBOutletCollectionAttrInfo"),
            index_getCXXClassDeclInfo               = apiGetFunctionAddress(CLANG, "clang_index_getCXXClassDeclInfo"),
            index_getClientContainer                = apiGetFunctionAddress(CLANG, "clang_index_getClientContainer"),
            index_setClientContainer                = apiGetFunctionAddress(CLANG, "clang_index_setClientContainer"),
            index_getClientEntity                   = apiGetFunctionAddress(CLANG, "clang_index_getClientEntity"),
            index_setClientEntity                   = apiGetFunctionAddress(CLANG, "clang_index_setClientEntity"),
            IndexAction_create                      = apiGetFunctionAddress(CLANG, "clang_IndexAction_create"),
            IndexAction_dispose                     = apiGetFunctionAddress(CLANG, "clang_IndexAction_dispose"),
            indexSourceFile                         = apiGetFunctionAddress(CLANG, "clang_indexSourceFile"),
            indexSourceFileFullArgv                 = apiGetFunctionAddress(CLANG, "clang_indexSourceFileFullArgv"),
            indexTranslationUnit                    = apiGetFunctionAddress(CLANG, "clang_indexTranslationUnit"),
            indexLoc_getFileLocation                = apiGetFunctionAddress(CLANG, "clang_indexLoc_getFileLocation"),
            indexLoc_getCXSourceLocation            = apiGetFunctionAddress(CLANG, "clang_indexLoc_getCXSourceLocation"),
            Type_visitFields                        = apiGetFunctionAddress(CLANG, "clang_Type_visitFields");

    }

    /** Returns the CLANG {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return CLANG;
    }

    // --- [ clang_getCString ] ---

    /** Unsafe version of: {@link #clang_getCString getCString} */
    public static long nclang_getCString(long string) {
        long __functionAddress = Functions.getCString;
        return invokePP(string, __functionAddress);
    }

    /** Retrieve the character data associated with the given string. */
    @Nullable
    @NativeType("char const *")
    public static String clang_getCString(CXString string) {
        long __result = nclang_getCString(string.address());
        return memUTF8Safe(__result);
    }

    // --- [ clang_disposeString ] ---

    /** Unsafe version of: {@link #clang_disposeString disposeString} */
    public static void nclang_disposeString(long string) {
        long __functionAddress = Functions.disposeString;
        invokePV(string, __functionAddress);
    }

    /** Free the given string. */
    public static void clang_disposeString(CXString string) {
        nclang_disposeString(string.address());
    }

    // --- [ clang_disposeStringSet ] ---

    /** Unsafe version of: {@link #clang_disposeStringSet disposeStringSet} */
    public static void nclang_disposeStringSet(long set) {
        long __functionAddress = Functions.disposeStringSet;
        invokePV(set, __functionAddress);
    }

    /** Free the given string set. */
    public static void clang_disposeStringSet(@NativeType("CXStringSet *") CXStringSet set) {
        nclang_disposeStringSet(set.address());
    }

    // --- [ clang_createIndex ] ---

    /**
     * Provides a shared context for creating translation units.
     * 
     * <p>It provides two options:</p>
     * 
     * <ul>
     * <li>{@code excludeDeclarationsFromPCH}: When non-zero, allows enumeration of "local" declarations (when loading any new translation units). A "local"
     * declaration is one that belongs in the translation unit itself and not in a precompiled header that was used by the translation unit. If zero, all
     * declarations will be enumerated.</li>
     * </ul>
     * 
     * <p>Here is an example:</p>
     * 
     * <pre><code>
     *    // excludeDeclsFromPCH = 1, displayDiagnostics=1
     *    Idx = clang_createIndex(1, 1);
     * 
     *    // IndexTest.pch was produced with the following command:
     *    // "clang -x c IndexTest.h -emit-ast -o IndexTest.pch"
     *    TU = clang_createTranslationUnit(Idx, "IndexTest.pch");
     * 
     *    // This will load all the symbols from 'IndexTest.pch'
     *    clang_visitChildren(clang_getTranslationUnitCursor(TU),
     *                        TranslationUnitVisitor, 0);
     *    clang_disposeTranslationUnit(TU);
     * 
     *    // This will load all the symbols from 'IndexTest.c', excluding symbols
     *    // from 'IndexTest.pch'.
     *    char *args[] = { "-Xclang", "-include-pch=IndexTest.pch" };
     *    TU = clang_createTranslationUnitFromSourceFile(Idx, "IndexTest.c", 2, args,
     *                                                   0, 0);
     *    clang_visitChildren(clang_getTranslationUnitCursor(TU),
     *                        TranslationUnitVisitor, 0);
     *    clang_disposeTranslationUnit(TU);</code></pre>
     * 
     * <p>This process of creating the {@code pch}, loading it separately, and using it (via {@code -include-pch}) allows {@code excludeDeclsFromPCH} to remove
     * redundant callbacks (which gives the indexer the same performance benefit as the compiler).</p>
     */
    @NativeType("CXIndex")
    public static long clang_createIndex(@NativeType("int") boolean excludeDeclarationsFromPCH, @NativeType("int") boolean displayDiagnostics) {
        long __functionAddress = Functions.createIndex;
        return invokeP(excludeDeclarationsFromPCH ? 1 : 0, displayDiagnostics ? 1 : 0, __functionAddress);
    }

    // --- [ clang_disposeIndex ] ---

    /**
     * Destroy the given index.
     * 
     * <p>The index must not be destroyed until all of the translation units created within that index have been destroyed.</p>
     */
    public static void clang_disposeIndex(@NativeType("CXIndex") long index) {
        long __functionAddress = Functions.disposeIndex;
        if (CHECKS) {
            check(index);
        }
        invokePV(index, __functionAddress);
    }

    // --- [ clang_CXIndex_setGlobalOptions ] ---

    /**
     * Sets general options associated with a {@code CXIndex}.
     * 
     * <p>For example:</p>
     * 
     * <pre><code>
     *  CXIndex idx = ...;
     *  clang_CXIndex_setGlobalOptions(idx,
     *      clang_CXIndex_getGlobalOptions(idx) |
     *      CXGlobalOpt_ThreadBackgroundPriorityForIndexing);</code></pre>
     *
     * @param options a bitmask of options, a bitwise OR of {@code CXGlobalOpt_XXX} flags
     */
    public static void clang_CXIndex_setGlobalOptions(@NativeType("CXIndex") long index, @NativeType("unsigned") int options) {
        long __functionAddress = Functions.CXIndex_setGlobalOptions;
        if (CHECKS) {
            check(index);
        }
        invokePV(index, options, __functionAddress);
    }

    // --- [ clang_CXIndex_getGlobalOptions ] ---

    /**
     * Gets the general options associated with a CXIndex.
     *
     * @return a bitmask of options, a bitwise OR of {@code CXGlobalOpt_XXX} flags that are associated with the given {@code CXIndex} object
     */
    @NativeType("unsigned")
    public static int clang_CXIndex_getGlobalOptions(@NativeType("CXIndex") long index) {
        long __functionAddress = Functions.CXIndex_getGlobalOptions;
        if (CHECKS) {
            check(index);
        }
        return invokePI(index, __functionAddress);
    }

    // --- [ clang_CXIndex_setInvocationEmissionPathOption ] ---

    /** Unsafe version of: {@link #clang_CXIndex_setInvocationEmissionPathOption CXIndex_setInvocationEmissionPathOption} */
    public static void nclang_CXIndex_setInvocationEmissionPathOption(long index, long Path) {
        long __functionAddress = Functions.CXIndex_setInvocationEmissionPathOption;
        if (CHECKS) {
            check(__functionAddress);
            check(index);
        }
        invokePPV(index, Path, __functionAddress);
    }

    /**
     * Sets the invocation emission path option in a {@code CXIndex}.
     * 
     * <p>The invocation emission path specifies a path which will contain log files for certain libclang invocations. A null value (default) implies that
     * libclang invocations are not logged.</p>
     */
    public static void clang_CXIndex_setInvocationEmissionPathOption(@NativeType("CXIndex") long index, @Nullable @NativeType("char const *") ByteBuffer Path) {
        if (CHECKS) {
            checkNT1Safe(Path);
        }
        nclang_CXIndex_setInvocationEmissionPathOption(index, memAddressSafe(Path));
    }

    /**
     * Sets the invocation emission path option in a {@code CXIndex}.
     * 
     * <p>The invocation emission path specifies a path which will contain log files for certain libclang invocations. A null value (default) implies that
     * libclang invocations are not logged.</p>
     */
    public static void clang_CXIndex_setInvocationEmissionPathOption(@NativeType("CXIndex") long index, @Nullable @NativeType("char const *") CharSequence Path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(Path, true);
            long PathEncoded = Path == null ? NULL : stack.getPointerAddress();
            nclang_CXIndex_setInvocationEmissionPathOption(index, PathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getFileName ] ---

    /** Unsafe version of: {@link #clang_getFileName getFileName} */
    public static native void nclang_getFileName(long SFile, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getFileName getFileName} */
    public static void nclang_getFileName(long SFile, long __result) {
        long __functionAddress = Functions.getFileName;
        if (CHECKS) {
            check(SFile);
        }
        nclang_getFileName(SFile, __functionAddress, __result);
    }

    /** Retrieve the complete file and path name of the given file. */
    public static CXString clang_getFileName(@NativeType("CXFile") long SFile, CXString __result) {
        nclang_getFileName(SFile, __result.address());
        return __result;
    }

    // --- [ clang_getFileTime ] ---

    /** Retrieve the last modification time of the given file. */
    @NativeType("time_t")
    public static long clang_getFileTime(@NativeType("CXFile") long SFile) {
        long __functionAddress = Functions.getFileTime;
        if (CHECKS) {
            check(SFile);
        }
        return invokePJ(SFile, __functionAddress);
    }

    // --- [ clang_getFileUniqueID ] ---

    /** Unsafe version of: {@link #clang_getFileUniqueID getFileUniqueID} */
    public static int nclang_getFileUniqueID(long file, long outID) {
        long __functionAddress = Functions.getFileUniqueID;
        if (CHECKS) {
            check(file);
        }
        return invokePPI(file, outID, __functionAddress);
    }

    /**
     * Retrieve the unique ID for the given {@code file}.
     *
     * @param file  the file to get the ID for
     * @param outID stores the returned CXFileUniqueID
     *
     * @return if there was a failure getting the unique ID, returns non-zero, otherwise returns 0
     */
    public static int clang_getFileUniqueID(@NativeType("CXFile") long file, @NativeType("CXFileUniqueID *") CXFileUniqueID outID) {
        return nclang_getFileUniqueID(file, outID.address());
    }

    // --- [ clang_isFileMultipleIncludeGuarded ] ---

    /**
     * Determine whether the given header is guarded against multiple inclusions, either with the conventional #ifndef/#define/#endif macro guards or with
     * #pragma once.
     */
    @NativeType("unsigned")
    public static boolean clang_isFileMultipleIncludeGuarded(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file) {
        long __functionAddress = Functions.isFileMultipleIncludeGuarded;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        return invokePPI(tu, file, __functionAddress) != 0;
    }

    // --- [ clang_getFile ] ---

    /** Unsafe version of: {@link #clang_getFile getFile} */
    public static long nclang_getFile(long tu, long file_name) {
        long __functionAddress = Functions.getFile;
        if (CHECKS) {
            check(tu);
        }
        return invokePPP(tu, file_name, __functionAddress);
    }

    /**
     * Retrieve a file handle within the given translation unit.
     *
     * @param tu        the translation unit
     * @param file_name the name of the file
     *
     * @return the file handle for the named file in the translation unit {@code tu}, or a {@code NULL} file handle if the file was not a part of this translation unit
     */
    @NativeType("CXFile")
    public static long clang_getFile(@NativeType("CXTranslationUnit") long tu, @NativeType("char const *") ByteBuffer file_name) {
        if (CHECKS) {
            checkNT1(file_name);
        }
        return nclang_getFile(tu, memAddress(file_name));
    }

    /**
     * Retrieve a file handle within the given translation unit.
     *
     * @param tu        the translation unit
     * @param file_name the name of the file
     *
     * @return the file handle for the named file in the translation unit {@code tu}, or a {@code NULL} file handle if the file was not a part of this translation unit
     */
    @NativeType("CXFile")
    public static long clang_getFile(@NativeType("CXTranslationUnit") long tu, @NativeType("char const *") CharSequence file_name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file_name, true);
            long file_nameEncoded = stack.getPointerAddress();
            return nclang_getFile(tu, file_nameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getFileContents ] ---

    /**
     * Unsafe version of: {@link #clang_getFileContents getFileContents}
     *
     * @param size [out] if non-{@code NULL}, will be set to the size of the buffer
     */
    public static long nclang_getFileContents(long tu, long file, long size) {
        long __functionAddress = Functions.getFileContents;
        if (CHECKS) {
            check(__functionAddress);
            check(tu);
            check(file);
        }
        return invokePPPP(tu, file, size, __functionAddress);
    }

    /**
     * Retrieve the buffer associated with the given file.
     *
     * @param tu   the translation unit
     * @param file the file for which to retrieve the buffer
     *
     * @return a pointer to the buffer in memory that holds the contents of {@code file}, or a {@code NULL} pointer when the file is not loaded
     */
    @Nullable
    @NativeType("char const *")
    public static ByteBuffer clang_getFileContents(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        PointerBuffer size = stack.callocPointer(1);
        try {
            long __result = nclang_getFileContents(tu, file, memAddress(size));
            return memByteBufferSafe(__result, (int)size.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_File_isEqual ] ---

    /** Returns non-zero if the {@code file1} and {@code file2} point to the same file, or they are both {@code NULL}. */
    @NativeType("int")
    public static boolean clang_File_isEqual(@NativeType("CXFile") long file1, @NativeType("CXFile") long file2) {
        long __functionAddress = Functions.File_isEqual;
        return invokePPI(file1, file2, __functionAddress) != 0;
    }

    // --- [ clang_File_tryGetRealPathName ] ---

    /** Unsafe version of: {@link #clang_File_tryGetRealPathName File_tryGetRealPathName} */
    public static native void nclang_File_tryGetRealPathName(long file, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_File_tryGetRealPathName File_tryGetRealPathName} */
    public static void nclang_File_tryGetRealPathName(long file, long __result) {
        long __functionAddress = Functions.File_tryGetRealPathName;
        if (CHECKS) {
            check(__functionAddress);
            check(file);
        }
        nclang_File_tryGetRealPathName(file, __functionAddress, __result);
    }

    /**
     * Returns the real path name of {@code file}.
     * 
     * <p>An empty string may be returned. Use {@link #clang_getFileName getFileName} in that case.</p>
     */
    public static CXString clang_File_tryGetRealPathName(@NativeType("CXFile") long file, CXString __result) {
        nclang_File_tryGetRealPathName(file, __result.address());
        return __result;
    }

    // --- [ clang_getNullLocation ] ---

    /** Unsafe version of: {@link #clang_getNullLocation getNullLocation} */
    public static native void nclang_getNullLocation(long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getNullLocation getNullLocation} */
    public static void nclang_getNullLocation(long __result) {
        long __functionAddress = Functions.getNullLocation;
        nclang_getNullLocation(__functionAddress, __result);
    }

    /** Retrieve a {@code NULL} (invalid) source location. */
    public static CXSourceLocation clang_getNullLocation(CXSourceLocation __result) {
        nclang_getNullLocation(__result.address());
        return __result;
    }

    // --- [ clang_equalLocations ] ---

    /** Unsafe version of: {@link #clang_equalLocations equalLocations} */
    public static int nclang_equalLocations(long loc1, long loc2) {
        long __functionAddress = Functions.equalLocations;
        return invokePPI(loc1, loc2, __functionAddress);
    }

    /**
     * Determine whether two source locations, which must refer into the same translation unit, refer to exactly the same point in the source code.
     *
     * @return non-zero if the source locations refer to the same location, zero if they refer to different locations
     */
    @NativeType("unsigned")
    public static boolean clang_equalLocations(CXSourceLocation loc1, CXSourceLocation loc2) {
        return nclang_equalLocations(loc1.address(), loc2.address()) != 0;
    }

    // --- [ clang_getLocation ] ---

    /** Unsafe version of: {@link #clang_getLocation getLocation} */
    public static native void nclang_getLocation(long tu, long file, int line, int column, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getLocation getLocation} */
    public static void nclang_getLocation(long tu, long file, int line, int column, long __result) {
        long __functionAddress = Functions.getLocation;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        nclang_getLocation(tu, file, line, column, __functionAddress, __result);
    }

    /** Retrieves the source location associated with a given file/line/column in a particular translation unit. */
    public static CXSourceLocation clang_getLocation(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file, @NativeType("unsigned") int line, @NativeType("unsigned") int column, CXSourceLocation __result) {
        nclang_getLocation(tu, file, line, column, __result.address());
        return __result;
    }

    // --- [ clang_getLocationForOffset ] ---

    /** Unsafe version of: {@link #clang_getLocationForOffset getLocationForOffset} */
    public static native void nclang_getLocationForOffset(long tu, long file, int offset, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getLocationForOffset getLocationForOffset} */
    public static void nclang_getLocationForOffset(long tu, long file, int offset, long __result) {
        long __functionAddress = Functions.getLocationForOffset;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        nclang_getLocationForOffset(tu, file, offset, __functionAddress, __result);
    }

    /** Retrieves the source location associated with a given character offset in a particular translation unit. */
    public static CXSourceLocation clang_getLocationForOffset(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file, @NativeType("unsigned") int offset, CXSourceLocation __result) {
        nclang_getLocationForOffset(tu, file, offset, __result.address());
        return __result;
    }

    // --- [ clang_Location_isInSystemHeader ] ---

    /** Unsafe version of: {@link #clang_Location_isInSystemHeader Location_isInSystemHeader} */
    public static int nclang_Location_isInSystemHeader(long location) {
        long __functionAddress = Functions.Location_isInSystemHeader;
        return invokePI(location, __functionAddress);
    }

    /** Returns non-zero if the given source location is in a system header. */
    @NativeType("int")
    public static boolean clang_Location_isInSystemHeader(CXSourceLocation location) {
        return nclang_Location_isInSystemHeader(location.address()) != 0;
    }

    // --- [ clang_Location_isFromMainFile ] ---

    /** Unsafe version of: {@link #clang_Location_isFromMainFile Location_isFromMainFile} */
    public static int nclang_Location_isFromMainFile(long location) {
        long __functionAddress = Functions.Location_isFromMainFile;
        return invokePI(location, __functionAddress);
    }

    /** Returns non-zero if the given source location is in the main file of the corresponding translation unit. */
    @NativeType("int")
    public static boolean clang_Location_isFromMainFile(CXSourceLocation location) {
        return nclang_Location_isFromMainFile(location.address()) != 0;
    }

    // --- [ clang_getNullRange ] ---

    /** Unsafe version of: {@link #clang_getNullRange getNullRange} */
    public static native void nclang_getNullRange(long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getNullRange getNullRange} */
    public static void nclang_getNullRange(long __result) {
        long __functionAddress = Functions.getNullRange;
        nclang_getNullRange(__functionAddress, __result);
    }

    /** Retrieve a {@code NULL} (invalid) source range. */
    public static CXSourceRange clang_getNullRange(CXSourceRange __result) {
        nclang_getNullRange(__result.address());
        return __result;
    }

    // --- [ clang_getRange ] ---

    /** Unsafe version of: {@link #clang_getRange getRange} */
    public static native void nclang_getRange(long begin, long end, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getRange getRange} */
    public static void nclang_getRange(long begin, long end, long __result) {
        long __functionAddress = Functions.getRange;
        nclang_getRange(begin, end, __functionAddress, __result);
    }

    /** Retrieve a source range given the beginning and ending source locations. */
    public static CXSourceRange clang_getRange(CXSourceLocation begin, CXSourceLocation end, CXSourceRange __result) {
        nclang_getRange(begin.address(), end.address(), __result.address());
        return __result;
    }

    // --- [ clang_equalRanges ] ---

    /** Unsafe version of: {@link #clang_equalRanges equalRanges} */
    public static int nclang_equalRanges(long range1, long range2) {
        long __functionAddress = Functions.equalRanges;
        return invokePPI(range1, range2, __functionAddress);
    }

    /**
     * Determine whether two ranges are equivalent.
     *
     * @return non-zero if the ranges are the same, zero if they differ
     */
    @NativeType("unsigned")
    public static boolean clang_equalRanges(CXSourceRange range1, CXSourceRange range2) {
        return nclang_equalRanges(range1.address(), range2.address()) != 0;
    }

    // --- [ clang_Range_isNull ] ---

    /** Unsafe version of: {@link #clang_Range_isNull Range_isNull} */
    public static int nclang_Range_isNull(long range) {
        long __functionAddress = Functions.Range_isNull;
        return invokePI(range, __functionAddress);
    }

    /** Returns non-zero if {@code range} is null. */
    @NativeType("int")
    public static boolean clang_Range_isNull(CXSourceRange range) {
        return nclang_Range_isNull(range.address()) != 0;
    }

    // --- [ clang_getExpansionLocation ] ---

    /** Unsafe version of: {@link #clang_getExpansionLocation getExpansionLocation} */
    public static void nclang_getExpansionLocation(long location, long file, long line, long column, long offset) {
        long __functionAddress = Functions.getExpansionLocation;
        invokePPPPPV(location, file, line, column, offset, __functionAddress);
    }

    /**
     * Retrieve the file, line, column, and offset represented by the given source location.
     * 
     * <p>If the location refers into a macro expansion, retrieves the location of the macro expansion.</p>
     *
     * @param location the location within a source file that will be decomposed into its parts
     * @param file     [out] if non-{@code NULL}, will be set to the file to which the given source location points
     * @param line     [out] if non-{@code NULL}, will be set to the line to which the given source location points
     * @param column   [out] if non-{@code NULL}, will be set to the column to which the given source location points
     * @param offset   [out] if non-{@code NULL}, will be set to the offset into the buffer to which the given source location points
     */
    public static void clang_getExpansionLocation(CXSourceLocation location, @Nullable @NativeType("CXFile *") PointerBuffer file, @Nullable @NativeType("unsigned *") IntBuffer line, @Nullable @NativeType("unsigned *") IntBuffer column, @Nullable @NativeType("unsigned *") IntBuffer offset) {
        if (CHECKS) {
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_getExpansionLocation(location.address(), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_getPresumedLocation ] ---

    /** Unsafe version of: {@link #clang_getPresumedLocation getPresumedLocation} */
    public static void nclang_getPresumedLocation(long location, long filename, long line, long column) {
        long __functionAddress = Functions.getPresumedLocation;
        invokePPPPV(location, filename, line, column, __functionAddress);
    }

    /**
     * Retrieve the file, line and column represented by the given source location, as specified in a # line directive.
     * 
     * <p>Example: given the following source code in a file somefile.c</p>
     * 
     * <pre><code>
     *  #123 "dummy.c" 1
     * 
     *  static int func(void)
     *  {
     *      return 0;
     *  }</code></pre>
     * 
     * <p>the location information returned by this function would be</p>
     * 
     * <p>File: dummy.c Line: 124 Column: 12</p>
     * 
     * <p>whereas clang_getExpansionLocation would have returned</p>
     * 
     * <p>File: somefile.c Line: 3 Column: 12</p>
     *
     * @param location the location within a source file that will be decomposed into its parts
     * @param filename [out] if non-{@code NULL}, will be set to the filename of the source location. Note that filenames returned will be for "virtual" files, which don't
     *                 necessarily exist on the machine running clang - e.g. when parsing preprocessed output obtained from a different environment. If a non-{@code NULL} value
     *                 is passed in, remember to dispose of the returned value using {@code clang_disposeString()} once you've finished with it. For an invalid source
     *                 location, an empty string is returned.
     * @param line     [out] if non-{@code NULL}, will be set to the line number of the source location. For an invalid source location, zero is returned.
     * @param column   [out] if non-{@code NULL}, will be set to the column number of the source location. For an invalid source location, zero is returned.
     */
    public static void clang_getPresumedLocation(CXSourceLocation location, @Nullable @NativeType("CXString *") CXString.Buffer filename, @Nullable @NativeType("unsigned *") IntBuffer line, @Nullable @NativeType("unsigned *") IntBuffer column) {
        if (CHECKS) {
            checkSafe(filename, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
        }
        nclang_getPresumedLocation(location.address(), memAddressSafe(filename), memAddressSafe(line), memAddressSafe(column));
    }

    // --- [ clang_getSpellingLocation ] ---

    /** Unsafe version of: {@link #clang_getSpellingLocation getSpellingLocation} */
    public static void nclang_getSpellingLocation(long location, long file, long line, long column, long offset) {
        long __functionAddress = Functions.getSpellingLocation;
        invokePPPPPV(location, file, line, column, offset, __functionAddress);
    }

    /**
     * Retrieve the file, line, column, and offset represented by the given source location.
     * 
     * <p>If the location refers into a macro instantiation, return where the location was originally spelled in the source file.</p>
     *
     * @param location the location within a source file that will be decomposed into its parts
     * @param file     [out] if non-{@code NULL}, will be set to the file to which the given source location points
     * @param line     [out] if non-{@code NULL}, will be set to the line to which the given source location points
     * @param column   [out] if non-{@code NULL}, will be set to the column to which the given source location points
     * @param offset   [out] if non-{@code NULL}, will be set to the offset into the buffer to which the given source location points
     */
    public static void clang_getSpellingLocation(CXSourceLocation location, @Nullable @NativeType("CXFile *") PointerBuffer file, @Nullable @NativeType("unsigned *") IntBuffer line, @Nullable @NativeType("unsigned *") IntBuffer column, @Nullable @NativeType("unsigned *") IntBuffer offset) {
        if (CHECKS) {
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_getSpellingLocation(location.address(), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_getFileLocation ] ---

    /** Unsafe version of: {@link #clang_getFileLocation getFileLocation} */
    public static void nclang_getFileLocation(long location, long file, long line, long column, long offset) {
        long __functionAddress = Functions.getFileLocation;
        invokePPPPPV(location, file, line, column, offset, __functionAddress);
    }

    /**
     * Retrieve the file, line, column, and offset represented by the given source location.
     * 
     * <p>If the location refers into a macro expansion, return where the macro was expanded or where the macro argument was written, if the location points at a
     * macro argument.</p>
     *
     * @param location the location within a source file that will be decomposed into its parts
     * @param file     [out] if non-{@code NULL}, will be set to the file to which the given source location points
     * @param line     [out] if non-{@code NULL}, will be set to the line to which the given source location points
     * @param column   [out] if non-{@code NULL}, will be set to the column to which the given source location points
     * @param offset   [out] if non-{@code NULL}, will be set to the offset into the buffer to which the given source location points
     */
    public static void clang_getFileLocation(CXSourceLocation location, @Nullable @NativeType("CXFile *") PointerBuffer file, @Nullable @NativeType("unsigned *") IntBuffer line, @Nullable @NativeType("unsigned *") IntBuffer column, @Nullable @NativeType("unsigned *") IntBuffer offset) {
        if (CHECKS) {
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_getFileLocation(location.address(), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_getRangeStart ] ---

    /** Unsafe version of: {@link #clang_getRangeStart getRangeStart} */
    public static native void nclang_getRangeStart(long range, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getRangeStart getRangeStart} */
    public static void nclang_getRangeStart(long range, long __result) {
        long __functionAddress = Functions.getRangeStart;
        nclang_getRangeStart(range, __functionAddress, __result);
    }

    /** Retrieve a source location representing the first character within a source range. */
    public static CXSourceLocation clang_getRangeStart(CXSourceRange range, CXSourceLocation __result) {
        nclang_getRangeStart(range.address(), __result.address());
        return __result;
    }

    // --- [ clang_getRangeEnd ] ---

    /** Unsafe version of: {@link #clang_getRangeEnd getRangeEnd} */
    public static native void nclang_getRangeEnd(long range, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getRangeEnd getRangeEnd} */
    public static void nclang_getRangeEnd(long range, long __result) {
        long __functionAddress = Functions.getRangeEnd;
        nclang_getRangeEnd(range, __functionAddress, __result);
    }

    /** Retrieve a source location representing the last character within a source range. */
    public static CXSourceLocation clang_getRangeEnd(CXSourceRange range, CXSourceLocation __result) {
        nclang_getRangeEnd(range.address(), __result.address());
        return __result;
    }

    // --- [ clang_getSkippedRanges ] ---

    /** Unsafe version of: {@link #clang_getSkippedRanges getSkippedRanges} */
    public static long nclang_getSkippedRanges(long tu, long file) {
        long __functionAddress = Functions.getSkippedRanges;
        if (CHECKS) {
            check(tu);
            check(file);
        }
        return invokePPP(tu, file, __functionAddress);
    }

    /**
     * Retrieve all ranges that were skipped by the preprocessor.
     * 
     * <p>The preprocessor will skip lines when they are surrounded by an if/ifdef/ifndef directive whose condition does not evaluate to true.</p>
     */
    @Nullable
    @NativeType("CXSourceRangeList *")
    public static CXSourceRangeList clang_getSkippedRanges(@NativeType("CXTranslationUnit") long tu, @NativeType("CXFile") long file) {
        long __result = nclang_getSkippedRanges(tu, file);
        return CXSourceRangeList.createSafe(__result);
    }

    // --- [ clang_getAllSkippedRanges ] ---

    /** Unsafe version of: {@link #clang_getAllSkippedRanges getAllSkippedRanges} */
    public static long nclang_getAllSkippedRanges(long tu) {
        long __functionAddress = Functions.getAllSkippedRanges;
        if (CHECKS) {
            check(tu);
        }
        return invokePP(tu, __functionAddress);
    }

    /**
     * Retrieve all ranges from all files that were skipped by the preprocessor.
     * 
     * <p>The preprocessor will skip lines when they are surrounded by an if/ifdef/ifndef directive whose condition does not evaluate to true.</p>
     */
    @Nullable
    @NativeType("CXSourceRangeList *")
    public static CXSourceRangeList clang_getAllSkippedRanges(@NativeType("CXTranslationUnit") long tu) {
        long __result = nclang_getAllSkippedRanges(tu);
        return CXSourceRangeList.createSafe(__result);
    }

    // --- [ clang_disposeSourceRangeList ] ---

    /** Unsafe version of: {@link #clang_disposeSourceRangeList disposeSourceRangeList} */
    public static void nclang_disposeSourceRangeList(long ranges) {
        long __functionAddress = Functions.disposeSourceRangeList;
        invokePV(ranges, __functionAddress);
    }

    /** Destroy the given {@code CXSourceRangeList}. */
    public static void clang_disposeSourceRangeList(@NativeType("CXSourceRangeList *") CXSourceRangeList ranges) {
        nclang_disposeSourceRangeList(ranges.address());
    }

    // --- [ clang_getNumDiagnosticsInSet ] ---

    /** Determine the number of diagnostics in a {@code CXDiagnosticSet}. */
    @NativeType("unsigned")
    public static int clang_getNumDiagnosticsInSet(@NativeType("CXDiagnosticSet") long Diags) {
        long __functionAddress = Functions.getNumDiagnosticsInSet;
        if (CHECKS) {
            check(Diags);
        }
        return invokePI(Diags, __functionAddress);
    }

    // --- [ clang_getDiagnosticInSet ] ---

    /**
     * Retrieve a diagnostic associated with the given {@code CXDiagnosticSet}.
     *
     * @param Diags the {@code CXDiagnosticSet} to query
     * @param Index the zero-based diagnostic number to retrieve
     *
     * @return the requested diagnostic. This diagnostic must be freed via a call to {@link #clang_disposeDiagnostic disposeDiagnostic}.
     */
    @NativeType("CXDiagnostic")
    public static long clang_getDiagnosticInSet(@NativeType("CXDiagnosticSet") long Diags, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.getDiagnosticInSet;
        if (CHECKS) {
            check(Diags);
        }
        return invokePP(Diags, Index, __functionAddress);
    }

    // --- [ clang_loadDiagnostics ] ---

    /** Unsafe version of: {@link #clang_loadDiagnostics loadDiagnostics} */
    public static long nclang_loadDiagnostics(long file, long error, long errorString) {
        long __functionAddress = Functions.loadDiagnostics;
        return invokePPPP(file, error, errorString, __functionAddress);
    }

    /**
     * Deserialize a set of diagnostics from a Clang diagnostics bitcode file.
     *
     * @param file        the name of the file to deserialize
     * @param error       a pointer to a enum value recording if there was a problem deserializing the diagnostics
     * @param errorString a pointer to a {@link CXString} for recording the error string if the file was not successfully loaded
     *
     * @return a loaded {@code CXDiagnosticSet} if successful, and {@code NULL} otherwise. These diagnostics should be released using {@link #clang_disposeDiagnosticSet disposeDiagnosticSet}.
     */
    @NativeType("CXDiagnosticSet")
    public static long clang_loadDiagnostics(@NativeType("char const *") ByteBuffer file, @NativeType("enum CXLoadDiag_Error *") IntBuffer error, @NativeType("CXString *") CXString errorString) {
        if (CHECKS) {
            checkNT1(file);
            check(error, 1);
        }
        return nclang_loadDiagnostics(memAddress(file), memAddress(error), errorString.address());
    }

    /**
     * Deserialize a set of diagnostics from a Clang diagnostics bitcode file.
     *
     * @param file        the name of the file to deserialize
     * @param error       a pointer to a enum value recording if there was a problem deserializing the diagnostics
     * @param errorString a pointer to a {@link CXString} for recording the error string if the file was not successfully loaded
     *
     * @return a loaded {@code CXDiagnosticSet} if successful, and {@code NULL} otherwise. These diagnostics should be released using {@link #clang_disposeDiagnosticSet disposeDiagnosticSet}.
     */
    @NativeType("CXDiagnosticSet")
    public static long clang_loadDiagnostics(@NativeType("char const *") CharSequence file, @NativeType("enum CXLoadDiag_Error *") IntBuffer error, @NativeType("CXString *") CXString errorString) {
        if (CHECKS) {
            check(error, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(file, true);
            long fileEncoded = stack.getPointerAddress();
            return nclang_loadDiagnostics(fileEncoded, memAddress(error), errorString.address());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_disposeDiagnosticSet ] ---

    /** Release a {@code CXDiagnosticSet} and all of its contained diagnostics. */
    public static void clang_disposeDiagnosticSet(@NativeType("CXDiagnosticSet") long Diags) {
        long __functionAddress = Functions.disposeDiagnosticSet;
        if (CHECKS) {
            check(Diags);
        }
        invokePV(Diags, __functionAddress);
    }

    // --- [ clang_getChildDiagnostics ] ---

    /**
     * Retrieve the child diagnostics of a {@code CXDiagnostic}.
     * 
     * <p>This {@code CXDiagnosticSet} does not need to be released by {@link #clang_disposeDiagnosticSet disposeDiagnosticSet}.</p>
     */
    @NativeType("CXDiagnosticSet")
    public static long clang_getChildDiagnostics(@NativeType("CXDiagnostic") long D) {
        long __functionAddress = Functions.getChildDiagnostics;
        if (CHECKS) {
            check(D);
        }
        return invokePP(D, __functionAddress);
    }

    // --- [ clang_getNumDiagnostics ] ---

    /** Determine the number of diagnostics produced for the given translation unit. */
    @NativeType("unsigned")
    public static int clang_getNumDiagnostics(@NativeType("CXTranslationUnit") long Unit) {
        long __functionAddress = Functions.getNumDiagnostics;
        if (CHECKS) {
            check(Unit);
        }
        return invokePI(Unit, __functionAddress);
    }

    // --- [ clang_getDiagnostic ] ---

    /**
     * Retrieve a diagnostic associated with the given translation unit.
     *
     * @param Unit  the translation unit to query
     * @param Index the zero-based diagnostic number to retrieve
     *
     * @return the requested diagnostic. This diagnostic must be freed via a call to {@link #clang_disposeDiagnostic disposeDiagnostic}.
     */
    @NativeType("CXDiagnostic")
    public static long clang_getDiagnostic(@NativeType("CXTranslationUnit") long Unit, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.getDiagnostic;
        if (CHECKS) {
            check(Unit);
        }
        return invokePP(Unit, Index, __functionAddress);
    }

    // --- [ clang_getDiagnosticSetFromTU ] ---

    /**
     * Retrieve the complete set of diagnostics associated with a translation unit.
     *
     * @param Unit the translation unit to query
     */
    @NativeType("CXDiagnosticSet")
    public static long clang_getDiagnosticSetFromTU(@NativeType("CXTranslationUnit") long Unit) {
        long __functionAddress = Functions.getDiagnosticSetFromTU;
        if (CHECKS) {
            check(Unit);
        }
        return invokePP(Unit, __functionAddress);
    }

    // --- [ clang_disposeDiagnostic ] ---

    /** Destroy a diagnostic. */
    public static void clang_disposeDiagnostic(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.disposeDiagnostic;
        if (CHECKS) {
            check(Diagnostic);
        }
        invokePV(Diagnostic, __functionAddress);
    }

    // --- [ clang_formatDiagnostic ] ---

    /** Unsafe version of: {@link #clang_formatDiagnostic formatDiagnostic} */
    public static native void nclang_formatDiagnostic(long Diagnostic, int Options, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_formatDiagnostic formatDiagnostic} */
    public static void nclang_formatDiagnostic(long Diagnostic, int Options, long __result) {
        long __functionAddress = Functions.formatDiagnostic;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_formatDiagnostic(Diagnostic, Options, __functionAddress, __result);
    }

    /**
     * Format the given diagnostic in a manner that is suitable for display.
     * 
     * <p>This routine will format the given diagnostic to a string, rendering the diagnostic according to the various options given. The
     * {@link #clang_defaultDiagnosticDisplayOptions defaultDiagnosticDisplayOptions} function returns the set of options that most closely mimics the behavior of the clang compiler.</p>
     *
     * @param Diagnostic the diagnostic to print
     * @param Options    a set of options that control the diagnostic display, created by combining {@code CXDiagnosticDisplayOptions} values
     * @param __result   a new string containing for formatted diagnostic
     */
    public static CXString clang_formatDiagnostic(@NativeType("CXDiagnostic") long Diagnostic, @NativeType("unsigned") int Options, CXString __result) {
        nclang_formatDiagnostic(Diagnostic, Options, __result.address());
        return __result;
    }

    // --- [ clang_defaultDiagnosticDisplayOptions ] ---

    /**
     * Retrieve the set of display options most similar to the default behavior of the clang compiler.
     *
     * @return a set of display options suitable for use with {@link #clang_formatDiagnostic formatDiagnostic}
     */
    @NativeType("unsigned")
    public static int clang_defaultDiagnosticDisplayOptions() {
        long __functionAddress = Functions.defaultDiagnosticDisplayOptions;
        return invokeI(__functionAddress);
    }

    // --- [ clang_getDiagnosticSeverity ] ---

    /** Determine the severity of the given diagnostic. */
    @NativeType("enum CXDiagnosticSeverity")
    public static int clang_getDiagnosticSeverity(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticSeverity;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticLocation ] ---

    /** Unsafe version of: {@link #clang_getDiagnosticLocation getDiagnosticLocation} */
    public static native void nclang_getDiagnosticLocation(long Diagnostic, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getDiagnosticLocation getDiagnosticLocation} */
    public static void nclang_getDiagnosticLocation(long Diagnostic, long __result) {
        long __functionAddress = Functions.getDiagnosticLocation;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticLocation(Diagnostic, __functionAddress, __result);
    }

    /**
     * Retrieve the source location of the given diagnostic.
     * 
     * <p>This location is where Clang would print the caret ('^') when displaying the diagnostic on the command line.</p>
     */
    public static CXSourceLocation clang_getDiagnosticLocation(@NativeType("CXDiagnostic") long Diagnostic, CXSourceLocation __result) {
        nclang_getDiagnosticLocation(Diagnostic, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticSpelling ] ---

    /** Unsafe version of: {@link #clang_getDiagnosticSpelling getDiagnosticSpelling} */
    public static native void nclang_getDiagnosticSpelling(long Diagnostic, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getDiagnosticSpelling getDiagnosticSpelling} */
    public static void nclang_getDiagnosticSpelling(long Diagnostic, long __result) {
        long __functionAddress = Functions.getDiagnosticSpelling;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticSpelling(Diagnostic, __functionAddress, __result);
    }

    /** Retrieve the text of the given diagnostic. */
    public static CXString clang_getDiagnosticSpelling(@NativeType("CXDiagnostic") long Diagnostic, CXString __result) {
        nclang_getDiagnosticSpelling(Diagnostic, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticOption ] ---

    /** Unsafe version of: {@link #clang_getDiagnosticOption getDiagnosticOption} */
    public static native void nclang_getDiagnosticOption(long Diag, long Disable, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getDiagnosticOption getDiagnosticOption} */
    public static void nclang_getDiagnosticOption(long Diag, long Disable, long __result) {
        long __functionAddress = Functions.getDiagnosticOption;
        if (CHECKS) {
            check(Diag);
        }
        nclang_getDiagnosticOption(Diag, Disable, __functionAddress, __result);
    }

    /**
     * Retrieve the name of the command-line option that enabled this diagnostic.
     *
     * @param Diag     the diagnostic to be queried
     * @param Disable  if non-{@code NULL}, will be set to the option that disables this diagnostic (if any)
     * @param __result a string that contains the command-line option used to enable this warning, such as "-Wconversion" or "-pedantic"
     */
    public static CXString clang_getDiagnosticOption(@NativeType("CXDiagnostic") long Diag, @Nullable @NativeType("CXString *") CXString Disable, CXString __result) {
        nclang_getDiagnosticOption(Diag, memAddressSafe(Disable), __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticCategory ] ---

    /**
     * Retrieve the category number for this diagnostic.
     * 
     * <p>Diagnostics can be categorized into groups along with other, related diagnostics (e.g., diagnostics under the same warning flag). This routine
     * retrieves the category number for the given diagnostic.</p>
     *
     * @return the number of the category that contains this diagnostic, or zero if this diagnostic is uncategorized
     */
    @NativeType("unsigned")
    public static int clang_getDiagnosticCategory(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticCategory;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticCategoryText ] ---

    /** Unsafe version of: {@link #clang_getDiagnosticCategoryText getDiagnosticCategoryText} */
    public static native void nclang_getDiagnosticCategoryText(long Diagnostic, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getDiagnosticCategoryText getDiagnosticCategoryText} */
    public static void nclang_getDiagnosticCategoryText(long Diagnostic, long __result) {
        long __functionAddress = Functions.getDiagnosticCategoryText;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticCategoryText(Diagnostic, __functionAddress, __result);
    }

    /**
     * Retrieve the diagnostic category text for a given diagnostic.
     *
     * @param __result the text of the given diagnostic category
     */
    public static CXString clang_getDiagnosticCategoryText(@NativeType("CXDiagnostic") long Diagnostic, CXString __result) {
        nclang_getDiagnosticCategoryText(Diagnostic, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticNumRanges ] ---

    /** Determine the number of source ranges associated with the given diagnostic. */
    @NativeType("unsigned")
    public static int clang_getDiagnosticNumRanges(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticNumRanges;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticRange ] ---

    /** Unsafe version of: {@link #clang_getDiagnosticRange getDiagnosticRange} */
    public static native void nclang_getDiagnosticRange(long Diagnostic, int Range, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getDiagnosticRange getDiagnosticRange} */
    public static void nclang_getDiagnosticRange(long Diagnostic, int Range, long __result) {
        long __functionAddress = Functions.getDiagnosticRange;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticRange(Diagnostic, Range, __functionAddress, __result);
    }

    /**
     * Retrieve a source range associated with the diagnostic.
     * 
     * <p>A diagnostic's source ranges highlight important elements in the source code. On the command line, Clang displays source ranges by underlining them
     * with '~' characters.</p>
     *
     * @param Diagnostic the diagnostic whose range is being extracted
     * @param Range      the zero-based index specifying which range to
     * @param __result   the requested source range
     */
    public static CXSourceRange clang_getDiagnosticRange(@NativeType("CXDiagnostic") long Diagnostic, @NativeType("unsigned") int Range, CXSourceRange __result) {
        nclang_getDiagnosticRange(Diagnostic, Range, __result.address());
        return __result;
    }

    // --- [ clang_getDiagnosticNumFixIts ] ---

    /** Determine the number of fix-it hints associated with the given diagnostic. */
    @NativeType("unsigned")
    public static int clang_getDiagnosticNumFixIts(@NativeType("CXDiagnostic") long Diagnostic) {
        long __functionAddress = Functions.getDiagnosticNumFixIts;
        if (CHECKS) {
            check(Diagnostic);
        }
        return invokePI(Diagnostic, __functionAddress);
    }

    // --- [ clang_getDiagnosticFixIt ] ---

    /** Unsafe version of: {@link #clang_getDiagnosticFixIt getDiagnosticFixIt} */
    public static native void nclang_getDiagnosticFixIt(long Diagnostic, int FixIt, long ReplacementRange, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getDiagnosticFixIt getDiagnosticFixIt} */
    public static void nclang_getDiagnosticFixIt(long Diagnostic, int FixIt, long ReplacementRange, long __result) {
        long __functionAddress = Functions.getDiagnosticFixIt;
        if (CHECKS) {
            check(Diagnostic);
        }
        nclang_getDiagnosticFixIt(Diagnostic, FixIt, ReplacementRange, __functionAddress, __result);
    }

    /**
     * Retrieve the replacement information for a given fix-it.
     * 
     * <p>Fix-its are described in terms of a source range whose contents should be replaced by a string. This approach generalizes over three kinds of
     * operations: removal of source code (the range covers the code to be removed and the replacement string is empty), replacement of source code (the range
     * covers the code to be replaced and the replacement string provides the new code), and insertion (both the start and end of the range point at the
     * insertion location, and the replacement string provides the text to insert).</p>
     *
     * @param Diagnostic       the diagnostic whose fix-its are being queried
     * @param FixIt            the zero-based index of the fix-it
     * @param ReplacementRange the source range whose contents will be replaced with the returned replacement string. Note that source ranges are half-open ranges [a, b), so the
     *                         source code should be replaced from a and up to (but not including) b.
     * @param __result         a string containing text that should be replace the source code indicated by the {@code ReplacementRange}
     */
    public static CXString clang_getDiagnosticFixIt(@NativeType("CXDiagnostic") long Diagnostic, @NativeType("unsigned") int FixIt, @NativeType("CXSourceRange *") CXSourceRange ReplacementRange, CXString __result) {
        nclang_getDiagnosticFixIt(Diagnostic, FixIt, ReplacementRange.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTranslationUnitSpelling ] ---

    /** Unsafe version of: {@link #clang_getTranslationUnitSpelling getTranslationUnitSpelling} */
    public static native void nclang_getTranslationUnitSpelling(long CTUnit, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTranslationUnitSpelling getTranslationUnitSpelling} */
    public static void nclang_getTranslationUnitSpelling(long CTUnit, long __result) {
        long __functionAddress = Functions.getTranslationUnitSpelling;
        if (CHECKS) {
            check(CTUnit);
        }
        nclang_getTranslationUnitSpelling(CTUnit, __functionAddress, __result);
    }

    /** Get the original translation unit source file name. */
    public static CXString clang_getTranslationUnitSpelling(@NativeType("CXTranslationUnit") long CTUnit, CXString __result) {
        nclang_getTranslationUnitSpelling(CTUnit, __result.address());
        return __result;
    }

    // --- [ clang_createTranslationUnitFromSourceFile ] ---

    /**
     * Unsafe version of: {@link #clang_createTranslationUnitFromSourceFile createTranslationUnitFromSourceFile}
     *
     * @param num_clang_command_line_args the number of command-line arguments in {@code clang_command_line_args}
     * @param num_unsaved_files           the number of unsaved file entries in {@code unsaved_files}
     */
    public static long nclang_createTranslationUnitFromSourceFile(long CIdx, long source_filename, int num_clang_command_line_args, long clang_command_line_args, int num_unsaved_files, long unsaved_files) {
        long __functionAddress = Functions.createTranslationUnitFromSourceFile;
        if (CHECKS) {
            check(CIdx);
            if (unsaved_files != NULL) { CXUnsavedFile.validate(unsaved_files, num_unsaved_files); }
        }
        return invokePPPPP(CIdx, source_filename, num_clang_command_line_args, clang_command_line_args, num_unsaved_files, unsaved_files, __functionAddress);
    }

    /**
     * Return the {@code CXTranslationUnit} for a given source file and the provided command line arguments one would pass to the compiler.
     * 
     * <p>Note: The {@code source_filename} argument is optional. If the caller provides a {@code NULL} pointer, the name of the source file is expected to reside in
     * the specified command line arguments.</p>
     * 
     * <p>Note: When encountered in {@code clang_command_line_args}, the following options are ignored:</p>
     * 
     * <ul>
     * <li>'-c'</li>
     * <li>'-emit-ast'</li>
     * <li>'-fsyntax-only'</li>
     * <li>'-o &lt;output file&gt;' (both '-o' and ' &lt;output file&gt;' are ignored)</li>
     * </ul>
     *
     * @param CIdx                    the index object with which the translation unit will be associated
     * @param source_filename         the name of the source file to load, or {@code NULL} if the source file is included in {@code clang_command_line_args}
     * @param clang_command_line_args the command-line arguments that would be passed to the {@code clang} executable if it were being invoked out-of-process. These command-line options
     *                                will be parsed and will affect how the translation unit is parsed. Note that the following options are ignored: '-c', '-emit-ast', '-fsyntax-only'
     *                                (which is the default), and '-o &lt;output file&gt;'.
     * @param unsaved_files           the files that have not yet been saved to disk but may be required for code completion, including the contents of those files. The contents and
     *                                name of these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their validity until
     *                                the call to this function returns.
     */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnitFromSourceFile(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") ByteBuffer source_filename, @Nullable @NativeType("char const * const *") PointerBuffer clang_command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
        }
        return nclang_createTranslationUnitFromSourceFile(CIdx, memAddressSafe(source_filename), remainingSafe(clang_command_line_args), memAddressSafe(clang_command_line_args), remainingSafe(unsaved_files), memAddressSafe(unsaved_files));
    }

    /**
     * Return the {@code CXTranslationUnit} for a given source file and the provided command line arguments one would pass to the compiler.
     * 
     * <p>Note: The {@code source_filename} argument is optional. If the caller provides a {@code NULL} pointer, the name of the source file is expected to reside in
     * the specified command line arguments.</p>
     * 
     * <p>Note: When encountered in {@code clang_command_line_args}, the following options are ignored:</p>
     * 
     * <ul>
     * <li>'-c'</li>
     * <li>'-emit-ast'</li>
     * <li>'-fsyntax-only'</li>
     * <li>'-o &lt;output file&gt;' (both '-o' and ' &lt;output file&gt;' are ignored)</li>
     * </ul>
     *
     * @param CIdx                    the index object with which the translation unit will be associated
     * @param source_filename         the name of the source file to load, or {@code NULL} if the source file is included in {@code clang_command_line_args}
     * @param clang_command_line_args the command-line arguments that would be passed to the {@code clang} executable if it were being invoked out-of-process. These command-line options
     *                                will be parsed and will affect how the translation unit is parsed. Note that the following options are ignored: '-c', '-emit-ast', '-fsyntax-only'
     *                                (which is the default), and '-o &lt;output file&gt;'.
     * @param unsaved_files           the files that have not yet been saved to disk but may be required for code completion, including the contents of those files. The contents and
     *                                name of these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their validity until
     *                                the call to this function returns.
     */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnitFromSourceFile(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") CharSequence source_filename, @Nullable @NativeType("char const * const *") PointerBuffer clang_command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_createTranslationUnitFromSourceFile(CIdx, source_filenameEncoded, remainingSafe(clang_command_line_args), memAddressSafe(clang_command_line_args), remainingSafe(unsaved_files), memAddressSafe(unsaved_files));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_createTranslationUnit ] ---

    /** Unsafe version of: {@link #clang_createTranslationUnit createTranslationUnit} */
    public static long nclang_createTranslationUnit(long CIdx, long ast_filename) {
        long __functionAddress = Functions.createTranslationUnit;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePPP(CIdx, ast_filename, __functionAddress);
    }

    /**
     * Same as {@link #clang_createTranslationUnit2 createTranslationUnit2}, but returns the {@code CXTranslationUnit} instead of an error code. In case of an error this routine returns a
     * {@code NULL} {@code CXTranslationUnit}, without further detailed error codes.
     */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnit(@NativeType("CXIndex") long CIdx, @NativeType("char const *") ByteBuffer ast_filename) {
        if (CHECKS) {
            checkNT1(ast_filename);
        }
        return nclang_createTranslationUnit(CIdx, memAddress(ast_filename));
    }

    /**
     * Same as {@link #clang_createTranslationUnit2 createTranslationUnit2}, but returns the {@code CXTranslationUnit} instead of an error code. In case of an error this routine returns a
     * {@code NULL} {@code CXTranslationUnit}, without further detailed error codes.
     */
    @NativeType("CXTranslationUnit")
    public static long clang_createTranslationUnit(@NativeType("CXIndex") long CIdx, @NativeType("char const *") CharSequence ast_filename) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ast_filename, true);
            long ast_filenameEncoded = stack.getPointerAddress();
            return nclang_createTranslationUnit(CIdx, ast_filenameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_createTranslationUnit2 ] ---

    /** Unsafe version of: {@link #clang_createTranslationUnit2 createTranslationUnit2} */
    public static int nclang_createTranslationUnit2(long CIdx, long ast_filename, long out_TU) {
        long __functionAddress = Functions.createTranslationUnit2;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePPPI(CIdx, ast_filename, out_TU, __functionAddress);
    }

    /**
     * Create a translation unit from an AST file ({@code -emit-ast}).
     *
     * @param out_TU a non-{@code NULL} pointer to store the created {@code CXTranslationUnit}
     *
     * @return zero on success, otherwise returns an error code
     */
    @NativeType("enum CXErrorCode")
    public static int clang_createTranslationUnit2(@NativeType("CXIndex") long CIdx, @NativeType("char const *") ByteBuffer ast_filename, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            checkNT1(ast_filename);
            check(out_TU, 1);
        }
        return nclang_createTranslationUnit2(CIdx, memAddress(ast_filename), memAddress(out_TU));
    }

    /**
     * Create a translation unit from an AST file ({@code -emit-ast}).
     *
     * @param out_TU a non-{@code NULL} pointer to store the created {@code CXTranslationUnit}
     *
     * @return zero on success, otherwise returns an error code
     */
    @NativeType("enum CXErrorCode")
    public static int clang_createTranslationUnit2(@NativeType("CXIndex") long CIdx, @NativeType("char const *") CharSequence ast_filename, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            check(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ast_filename, true);
            long ast_filenameEncoded = stack.getPointerAddress();
            return nclang_createTranslationUnit2(CIdx, ast_filenameEncoded, memAddress(out_TU));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_defaultEditingTranslationUnitOptions ] ---

    /**
     * Returns the set of flags that is suitable for parsing a translation unit that is being edited.
     * 
     * <p>The set of flags returned provide options for {@link #clang_parseTranslationUnit parseTranslationUnit} to indicate that the translation unit is likely to be reparsed many times, either
     * explicitly (via {@link #clang_reparseTranslationUnit reparseTranslationUnit}) or implicitly (e.g., by code completion ({@link #clang_codeCompleteAt codeCompleteAt}). The returned flag set contains an unspecified
     * set of optimizations (e.g., the precompiled preamble) geared toward improving the performance of these routines. The set of optimizations enabled may
     * change from one version to the next.</p>
     */
    @NativeType("unsigned")
    public static int clang_defaultEditingTranslationUnitOptions() {
        long __functionAddress = Functions.defaultEditingTranslationUnitOptions;
        return invokeI(__functionAddress);
    }

    // --- [ clang_parseTranslationUnit ] ---

    /** Unsafe version of: {@link #clang_parseTranslationUnit parseTranslationUnit} */
    public static long nclang_parseTranslationUnit(long CIdx, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, int options) {
        long __functionAddress = Functions.parseTranslationUnit;
        if (CHECKS) {
            check(CIdx);
            if (unsaved_files != NULL) { CXUnsavedFile.validate(unsaved_files, num_unsaved_files); }
        }
        return invokePPPPP(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, __functionAddress);
    }

    /**
     * Same as {@link #clang_parseTranslationUnit2 parseTranslationUnit2}, but returns the {@code CXTranslationUnit} instead of an error code. In case of an error this routine returns a {@code NULL}
     * {@code CXTranslationUnit}, without further detailed error codes.
     */
    @NativeType("CXTranslationUnit")
    public static long clang_parseTranslationUnit(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") ByteBuffer source_filename, @Nullable @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
        }
        return nclang_parseTranslationUnit(CIdx, memAddressSafe(source_filename), memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
    }

    /**
     * Same as {@link #clang_parseTranslationUnit2 parseTranslationUnit2}, but returns the {@code CXTranslationUnit} instead of an error code. In case of an error this routine returns a {@code NULL}
     * {@code CXTranslationUnit}, without further detailed error codes.
     */
    @NativeType("CXTranslationUnit")
    public static long clang_parseTranslationUnit(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") CharSequence source_filename, @Nullable @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_parseTranslationUnit(CIdx, source_filenameEncoded, memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_parseTranslationUnit2 ] ---

    /**
     * Unsafe version of: {@link #clang_parseTranslationUnit2 parseTranslationUnit2}
     *
     * @param num_command_line_args the number of command-line arguments in {@code command_line_args}
     * @param num_unsaved_files     the number of unsaved file entries in {@code unsaved_files}
     */
    public static int nclang_parseTranslationUnit2(long CIdx, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, int options, long out_TU) {
        long __functionAddress = Functions.parseTranslationUnit2;
        if (CHECKS) {
            check(CIdx);
            if (unsaved_files != NULL) { CXUnsavedFile.validate(unsaved_files, num_unsaved_files); }
        }
        return invokePPPPPI(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU, __functionAddress);
    }

    /**
     * Parse the given source file and the translation unit corresponding to that file.
     * 
     * <p>This routine is the main entry point for the Clang C API, providing the ability to parse a source file into a translation unit that can then be queried
     * by other functions in the API. This routine accepts a set of command-line arguments so that the compilation can be configured in the same way that the
     * compiler is configured on the command line.</p>
     *
     * @param CIdx              the index object with which the translation unit will be associated
     * @param source_filename   the name of the source file to load, or {@code NULL} if the source file is included in {@code command_line_args}
     * @param command_line_args the command-line arguments that would be passed to the {@code clang} executable if it were being invoked out-of-process. These command-line options
     *                          will be parsed and will affect how the translation unit is parsed. Note that the following options are ignored: '-c', '-emit-ast', '-fsyntax-only'
     *                          (which is the default), and '-o &lt;output file&gt;'.
     * @param unsaved_files     the files that have not yet been saved to disk but may be required for parsing, including the contents of those files. The contents and name of
     *                          these files (as specified by CXUnsavedFile) are copied when necessary, so the client only needs to guarantee their validity until the call to this
     *                          function returns.
     * @param options           a bitmask of options that affects how the translation unit is managed but not its compilation. This should be a bitwise OR of the
     *                          CXTranslationUnit_XXX flags.
     * @param out_TU            a non-{@code NULL} pointer to store the created {@code CXTranslationUnit}, describing the parsed code and containing any diagnostics produced by the
     *                          compiler
     *
     * @return zero on success, otherwise returns an error code
     */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") ByteBuffer source_filename, @Nullable @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
            check(out_TU, 1);
        }
        return nclang_parseTranslationUnit2(CIdx, memAddressSafe(source_filename), memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
    }

    /**
     * Parse the given source file and the translation unit corresponding to that file.
     * 
     * <p>This routine is the main entry point for the Clang C API, providing the ability to parse a source file into a translation unit that can then be queried
     * by other functions in the API. This routine accepts a set of command-line arguments so that the compilation can be configured in the same way that the
     * compiler is configured on the command line.</p>
     *
     * @param CIdx              the index object with which the translation unit will be associated
     * @param source_filename   the name of the source file to load, or {@code NULL} if the source file is included in {@code command_line_args}
     * @param command_line_args the command-line arguments that would be passed to the {@code clang} executable if it were being invoked out-of-process. These command-line options
     *                          will be parsed and will affect how the translation unit is parsed. Note that the following options are ignored: '-c', '-emit-ast', '-fsyntax-only'
     *                          (which is the default), and '-o &lt;output file&gt;'.
     * @param unsaved_files     the files that have not yet been saved to disk but may be required for parsing, including the contents of those files. The contents and name of
     *                          these files (as specified by CXUnsavedFile) are copied when necessary, so the client only needs to guarantee their validity until the call to this
     *                          function returns.
     * @param options           a bitmask of options that affects how the translation unit is managed but not its compilation. This should be a bitwise OR of the
     *                          CXTranslationUnit_XXX flags.
     * @param out_TU            a non-{@code NULL} pointer to store the created {@code CXTranslationUnit}, describing the parsed code and containing any diagnostics produced by the
     *                          compiler
     *
     * @return zero on success, otherwise returns an error code
     */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") CharSequence source_filename, @Nullable @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            check(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_parseTranslationUnit2(CIdx, source_filenameEncoded, memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_parseTranslationUnit2FullArgv ] ---

    /** Unsafe version of: {@link #clang_parseTranslationUnit2FullArgv parseTranslationUnit2FullArgv} */
    public static int nclang_parseTranslationUnit2FullArgv(long CIdx, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, int options, long out_TU) {
        long __functionAddress = Functions.parseTranslationUnit2FullArgv;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePPPPPI(CIdx, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, options, out_TU, __functionAddress);
    }

    /**
     * Same as {@link #clang_parseTranslationUnit2 parseTranslationUnit2} but requires a full command line for {@code command_line_args} including {@code argv[0]}. This is useful if the
     * standard library paths are relative to the binary.
     */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2FullArgv(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") ByteBuffer source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            checkNT1Safe(source_filename);
            check(out_TU, 1);
        }
        return nclang_parseTranslationUnit2FullArgv(CIdx, memAddressSafe(source_filename), memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
    }

    /**
     * Same as {@link #clang_parseTranslationUnit2 parseTranslationUnit2} but requires a full command line for {@code command_line_args} including {@code argv[0]}. This is useful if the
     * standard library paths are relative to the binary.
     */
    @NativeType("enum CXErrorCode")
    public static int clang_parseTranslationUnit2FullArgv(@NativeType("CXIndex") long CIdx, @Nullable @NativeType("char const *") CharSequence source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options, @NativeType("CXTranslationUnit *") PointerBuffer out_TU) {
        if (CHECKS) {
            check(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(source_filename, true);
            long source_filenameEncoded = source_filename == null ? NULL : stack.getPointerAddress();
            return nclang_parseTranslationUnit2FullArgv(CIdx, source_filenameEncoded, memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options, memAddress(out_TU));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_defaultSaveOptions ] ---

    /**
     * Returns the set of flags that is suitable for saving a translation unit.
     * 
     * <p>The set of flags returned provide options for {@link #clang_saveTranslationUnit saveTranslationUnit} by default. The returned flag set contains an unspecified set of options that save
     * translation units with the most commonly-requested data.</p>
     */
    @NativeType("unsigned")
    public static int clang_defaultSaveOptions(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.defaultSaveOptions;
        if (CHECKS) {
            check(TU);
        }
        return invokePI(TU, __functionAddress);
    }

    // --- [ clang_saveTranslationUnit ] ---

    /** Unsafe version of: {@link #clang_saveTranslationUnit saveTranslationUnit} */
    public static int nclang_saveTranslationUnit(long TU, long FileName, int options) {
        long __functionAddress = Functions.saveTranslationUnit;
        if (CHECKS) {
            check(TU);
        }
        return invokePPI(TU, FileName, options, __functionAddress);
    }

    /**
     * Saves a translation unit into a serialized representation of that translation unit on disk.
     * 
     * <p>Any translation unit that was parsed without error can be saved into a file. The translation unit can then be deserialized into a new {@code
     * CXTranslationUnit} with {@link #clang_createTranslationUnit createTranslationUnit} or, if it is an incomplete translation unit that corresponds to a header, used as a precompiled header
     * when parsing other translation units.</p>
     *
     * @param TU       the translation unit to save
     * @param FileName the file to which the translation unit will be saved
     * @param options  a bitmask of options that affects how the translation unit is saved. This should be a bitwise OR of the {@code CXSaveTranslationUnit_XXX} flags.
     *
     * @return a value that will match one of the enumerators of the {@code CXSaveError} enumeration. Zero ({@link #CXSaveError_None SaveError_None}) indicates that the translation unit was
     *         saved successfully, while a non-zero value indicates that a problem occurred.
     */
    public static int clang_saveTranslationUnit(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") ByteBuffer FileName, @NativeType("unsigned") int options) {
        if (CHECKS) {
            checkNT1(FileName);
        }
        return nclang_saveTranslationUnit(TU, memAddress(FileName), options);
    }

    /**
     * Saves a translation unit into a serialized representation of that translation unit on disk.
     * 
     * <p>Any translation unit that was parsed without error can be saved into a file. The translation unit can then be deserialized into a new {@code
     * CXTranslationUnit} with {@link #clang_createTranslationUnit createTranslationUnit} or, if it is an incomplete translation unit that corresponds to a header, used as a precompiled header
     * when parsing other translation units.</p>
     *
     * @param TU       the translation unit to save
     * @param FileName the file to which the translation unit will be saved
     * @param options  a bitmask of options that affects how the translation unit is saved. This should be a bitwise OR of the {@code CXSaveTranslationUnit_XXX} flags.
     *
     * @return a value that will match one of the enumerators of the {@code CXSaveError} enumeration. Zero ({@link #CXSaveError_None SaveError_None}) indicates that the translation unit was
     *         saved successfully, while a non-zero value indicates that a problem occurred.
     */
    public static int clang_saveTranslationUnit(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") CharSequence FileName, @NativeType("unsigned") int options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(FileName, true);
            long FileNameEncoded = stack.getPointerAddress();
            return nclang_saveTranslationUnit(TU, FileNameEncoded, options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_suspendTranslationUnit ] ---

    /**
     * Suspend a translation unit in order to free memory associated with it.
     * 
     * <p>A suspended translation unit uses significantly less memory but on the other side does not support any other calls than {@link #clang_reparseTranslationUnit reparseTranslationUnit} to
     * resume it or {@link #clang_disposeTranslationUnit disposeTranslationUnit} to dispose it completely.</p>
     */
    @NativeType("unsigned")
    public static boolean clang_suspendTranslationUnit(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.suspendTranslationUnit;
        if (CHECKS) {
            check(TU);
        }
        return invokePI(TU, __functionAddress) != 0;
    }

    // --- [ clang_disposeTranslationUnit ] ---

    /** Destroy the specified CXTranslationUnit object. */
    public static void clang_disposeTranslationUnit(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.disposeTranslationUnit;
        if (CHECKS) {
            check(TU);
        }
        invokePV(TU, __functionAddress);
    }

    // --- [ clang_defaultReparseOptions ] ---

    /**
     * Returns the set of flags that is suitable for reparsing a translation unit.
     * 
     * <p>The set of flags returned provide options for {@code clang_reparseTranslationUnit()} by default. The returned flag set contains an unspecified set of
     * optimizations geared toward common uses of reparsing. The set of optimizations enabled may change from one version to the next.</p>
     */
    @NativeType("unsigned")
    public static int clang_defaultReparseOptions(@NativeType("CXTranslationUnit") long TU) {
        long __functionAddress = Functions.defaultReparseOptions;
        if (CHECKS) {
            check(TU);
        }
        return invokePI(TU, __functionAddress);
    }

    // --- [ clang_reparseTranslationUnit ] ---

    /**
     * Unsafe version of: {@link #clang_reparseTranslationUnit reparseTranslationUnit}
     *
     * @param num_unsaved_files the number of unsaved file entries in {@code unsaved_files}
     */
    public static int nclang_reparseTranslationUnit(long TU, int num_unsaved_files, long unsaved_files, int options) {
        long __functionAddress = Functions.reparseTranslationUnit;
        if (CHECKS) {
            check(TU);
            if (unsaved_files != NULL) { CXUnsavedFile.validate(unsaved_files, num_unsaved_files); }
        }
        return invokePPI(TU, num_unsaved_files, unsaved_files, options, __functionAddress);
    }

    /**
     * Reparse the source files that produced this translation unit.
     * 
     * <p>This routine can be used to re-parse the source files that originally created the given translation unit, for example because those source files have
     * changed (either on disk or as passed via {@code unsaved_files}). The source code will be reparsed with the same command-line options as it was
     * originally parsed.</p>
     * 
     * <p>Reparsing a translation unit invalidates all cursors and source locations that refer into that translation unit. This makes reparsing a translation
     * unit semantically equivalent to destroying the translation unit and then creating a new translation unit with the same command-line arguments. However,
     * it may be more efficient to reparse a translation unit using this routine.</p>
     *
     * @param TU            the translation unit whose contents will be re-parsed. The translation unit must originally have been built with {@code
     *                      clang_createTranslationUnitFromSourceFile()}.
     * @param unsaved_files the files that have not yet been saved to disk but may be required for parsing, including the contents of those files. The contents and name of
     *                      these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their validity until the call
     *                      to this function returns.
     * @param options       a bitset of options composed of the flags in {@code CXReparse_Flags}. The function {@link #clang_defaultReparseOptions defaultReparseOptions} produces a default set of options
     *                      recommended for most uses, based on the translation unit.
     *
     * @return 0 if the sources could be reparsed. A non-zero error code will be returned if reparsing was impossible, such that the translation unit is invalid. In
     *         such cases, the only valid call for {@code TU} is {@link #clang_disposeTranslationUnit disposeTranslationUnit}. The error codes returned by this routine are described by the
     *         {@code CXErrorCode} enum.
     */
    public static int clang_reparseTranslationUnit(@NativeType("CXTranslationUnit") long TU, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options) {
        return nclang_reparseTranslationUnit(TU, remainingSafe(unsaved_files), memAddressSafe(unsaved_files), options);
    }

    // --- [ clang_getTUResourceUsageName ] ---

    /** Unsafe version of: {@link #clang_getTUResourceUsageName getTUResourceUsageName} */
    public static long nclang_getTUResourceUsageName(int kind) {
        long __functionAddress = Functions.getTUResourceUsageName;
        return invokeP(kind, __functionAddress);
    }

    /** Returns the human-readable null-terminated C string that represents the name of the memory category. This string should never be freed. */
    @Nullable
    @NativeType("char const *")
    public static String clang_getTUResourceUsageName(@NativeType("enum CXTUResourceUsageKind") int kind) {
        long __result = nclang_getTUResourceUsageName(kind);
        return memUTF8Safe(__result);
    }

    // --- [ clang_getCXTUResourceUsage ] ---

    /** Unsafe version of: {@link #clang_getCXTUResourceUsage getCXTUResourceUsage} */
    public static native void nclang_getCXTUResourceUsage(long TU, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCXTUResourceUsage getCXTUResourceUsage} */
    public static void nclang_getCXTUResourceUsage(long TU, long __result) {
        long __functionAddress = Functions.getCXTUResourceUsage;
        if (CHECKS) {
            check(TU);
        }
        nclang_getCXTUResourceUsage(TU, __functionAddress, __result);
    }

    /** Return the memory usage of a translation unit.  This object should be released with {@link #clang_disposeCXTUResourceUsage disposeCXTUResourceUsage}. */
    public static CXTUResourceUsage clang_getCXTUResourceUsage(@NativeType("CXTranslationUnit") long TU, CXTUResourceUsage __result) {
        nclang_getCXTUResourceUsage(TU, __result.address());
        return __result;
    }

    // --- [ clang_disposeCXTUResourceUsage ] ---

    public static void nclang_disposeCXTUResourceUsage(long usage) {
        long __functionAddress = Functions.disposeCXTUResourceUsage;
        invokePV(usage, __functionAddress);
    }

    public static void clang_disposeCXTUResourceUsage(CXTUResourceUsage usage) {
        nclang_disposeCXTUResourceUsage(usage.address());
    }

    // --- [ clang_getTranslationUnitTargetInfo ] ---

    /**
     * Get target information for this translation unit.
     * 
     * <p>The {@code CXTargetInfo} object cannot outlive the {@code CXTranslationUnit} object.</p>
     */
    @NativeType("CXTargetInfo")
    public static long clang_getTranslationUnitTargetInfo(@NativeType("CXTranslationUnit") long CTUnit) {
        long __functionAddress = Functions.getTranslationUnitTargetInfo;
        if (CHECKS) {
            check(CTUnit);
        }
        return invokePP(CTUnit, __functionAddress);
    }

    // --- [ clang_TargetInfo_dispose ] ---

    /** Destroy the {@code CXTargetInfo} object. */
    public static void clang_TargetInfo_dispose(@NativeType("CXTargetInfo") long Info) {
        long __functionAddress = Functions.TargetInfo_dispose;
        if (CHECKS) {
            check(Info);
        }
        invokePV(Info, __functionAddress);
    }

    // --- [ clang_TargetInfo_getTriple ] ---

    /** Unsafe version of: {@link #clang_TargetInfo_getTriple TargetInfo_getTriple} */
    public static native void nclang_TargetInfo_getTriple(long Info, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_TargetInfo_getTriple TargetInfo_getTriple} */
    public static void nclang_TargetInfo_getTriple(long Info, long __result) {
        long __functionAddress = Functions.TargetInfo_getTriple;
        if (CHECKS) {
            check(Info);
        }
        nclang_TargetInfo_getTriple(Info, __functionAddress, __result);
    }

    /**
     * Get the normalized target triple as a string.
     * 
     * <p>Returns the empty string in case of any error.</p>
     */
    public static CXString clang_TargetInfo_getTriple(@NativeType("CXTargetInfo") long Info, CXString __result) {
        nclang_TargetInfo_getTriple(Info, __result.address());
        return __result;
    }

    // --- [ clang_TargetInfo_getPointerWidth ] ---

    /**
     * Get the pointer width of the target in bits.
     * 
     * <p>Returns -1 in case of error.</p>
     */
    public static int clang_TargetInfo_getPointerWidth(@NativeType("CXTargetInfo") long Info) {
        long __functionAddress = Functions.TargetInfo_getPointerWidth;
        if (CHECKS) {
            check(Info);
        }
        return invokePI(Info, __functionAddress);
    }

    // --- [ clang_getNullCursor ] ---

    /** Unsafe version of: {@link #clang_getNullCursor getNullCursor} */
    public static native void nclang_getNullCursor(long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getNullCursor getNullCursor} */
    public static void nclang_getNullCursor(long __result) {
        long __functionAddress = Functions.getNullCursor;
        nclang_getNullCursor(__functionAddress, __result);
    }

    /** Retrieve the {@code NULL} cursor, which represents no entity. */
    public static CXCursor clang_getNullCursor(CXCursor __result) {
        nclang_getNullCursor(__result.address());
        return __result;
    }

    // --- [ clang_getTranslationUnitCursor ] ---

    /** Unsafe version of: {@link #clang_getTranslationUnitCursor getTranslationUnitCursor} */
    public static native void nclang_getTranslationUnitCursor(long TU, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTranslationUnitCursor getTranslationUnitCursor} */
    public static void nclang_getTranslationUnitCursor(long TU, long __result) {
        long __functionAddress = Functions.getTranslationUnitCursor;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTranslationUnitCursor(TU, __functionAddress, __result);
    }

    /**
     * Retrieve the cursor that represents the given translation unit.
     * 
     * <p>The translation unit cursor can be used to start traversing the various declarations within the given translation unit.</p>
     */
    public static CXCursor clang_getTranslationUnitCursor(@NativeType("CXTranslationUnit") long TU, CXCursor __result) {
        nclang_getTranslationUnitCursor(TU, __result.address());
        return __result;
    }

    // --- [ clang_equalCursors ] ---

    /** Unsafe version of: {@link #clang_equalCursors equalCursors} */
    public static int nclang_equalCursors(long A, long B) {
        long __functionAddress = Functions.equalCursors;
        return invokePPI(A, B, __functionAddress);
    }

    /** Determine whether two cursors are equivalent. */
    @NativeType("unsigned")
    public static boolean clang_equalCursors(CXCursor A, CXCursor B) {
        return nclang_equalCursors(A.address(), B.address()) != 0;
    }

    // --- [ clang_Cursor_isNull ] ---

    /** Unsafe version of: {@link #clang_Cursor_isNull Cursor_isNull} */
    public static int nclang_Cursor_isNull(long cursor) {
        long __functionAddress = Functions.Cursor_isNull;
        return invokePI(cursor, __functionAddress);
    }

    /** Returns non-zero if {@code cursor} is null. */
    @NativeType("int")
    public static boolean clang_Cursor_isNull(CXCursor cursor) {
        return nclang_Cursor_isNull(cursor.address()) != 0;
    }

    // --- [ clang_hashCursor ] ---

    /** Unsafe version of: {@link #clang_hashCursor hashCursor} */
    public static int nclang_hashCursor(long cursor) {
        long __functionAddress = Functions.hashCursor;
        return invokePI(cursor, __functionAddress);
    }

    /** Compute a hash value for the given cursor. */
    @NativeType("unsigned")
    public static int clang_hashCursor(CXCursor cursor) {
        return nclang_hashCursor(cursor.address());
    }

    // --- [ clang_getCursorKind ] ---

    /** Unsafe version of: {@link #clang_getCursorKind getCursorKind} */
    public static int nclang_getCursorKind(long cursor) {
        long __functionAddress = Functions.getCursorKind;
        return invokePI(cursor, __functionAddress);
    }

    /** Retrieve the kind of the given cursor. */
    @NativeType("enum CXCursorKind")
    public static int clang_getCursorKind(CXCursor cursor) {
        return nclang_getCursorKind(cursor.address());
    }

    // --- [ clang_isDeclaration ] ---

    /** Determine whether the given cursor kind represents a declaration. */
    @NativeType("unsigned")
    public static boolean clang_isDeclaration(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isDeclaration;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isInvalidDeclaration ] ---

    /** Unsafe version of: {@link #clang_isInvalidDeclaration isInvalidDeclaration} */
    public static int nclang_isInvalidDeclaration(long cursor) {
        long __functionAddress = Functions.isInvalidDeclaration;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(cursor, __functionAddress);
    }

    /**
     * Determine whether the given declaration is invalid.
     * 
     * <p>A declaration is invalid if it could not be parsed successfully.</p>
     *
     * @return non-zero if the cursor represents a declaration and it is invalid, otherwise {@code NULL}
     */
    @NativeType("unsigned")
    public static boolean clang_isInvalidDeclaration(CXCursor cursor) {
        return nclang_isInvalidDeclaration(cursor.address()) != 0;
    }

    // --- [ clang_isReference ] ---

    /**
     * Determine whether the given cursor kind represents a simple reference.
     * 
     * <p>Note that other kinds of cursors (such as expressions) can also refer to other cursors. Use {@link #clang_getCursorReferenced getCursorReferenced} to determine whether a particular
     * cursor refers to another entity.</p>
     */
    @NativeType("unsigned")
    public static boolean clang_isReference(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isReference;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isExpression ] ---

    /** Determine whether the given cursor kind represents an expression. */
    @NativeType("unsigned")
    public static boolean clang_isExpression(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isExpression;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isStatement ] ---

    /** Determine whether the given cursor kind represents a statement. */
    @NativeType("unsigned")
    public static boolean clang_isStatement(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isStatement;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isAttribute ] ---

    /** Determine whether the given cursor kind represents an attribute. */
    @NativeType("unsigned")
    public static boolean clang_isAttribute(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isAttribute;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_Cursor_hasAttrs ] ---

    /** Unsafe version of: {@link #clang_Cursor_hasAttrs Cursor_hasAttrs} */
    public static int nclang_Cursor_hasAttrs(long C) {
        long __functionAddress = Functions.Cursor_hasAttrs;
        return invokePI(C, __functionAddress);
    }

    /** Determine whether the given cursor has any attributes. */
    @NativeType("unsigned")
    public static boolean clang_Cursor_hasAttrs(CXCursor C) {
        return nclang_Cursor_hasAttrs(C.address()) != 0;
    }

    // --- [ clang_isInvalid ] ---

    /** Determine whether the given cursor kind represents an invalid cursor. */
    @NativeType("unsigned")
    public static boolean clang_isInvalid(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isInvalid;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isTranslationUnit ] ---

    /** Determine whether the given cursor kind represents a translation unit. */
    @NativeType("unsigned")
    public static boolean clang_isTranslationUnit(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isTranslationUnit;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isPreprocessing ] ---

    /** Determine whether the given cursor represents a preprocessing element, such as a preprocessor directive or macro instantiation. */
    @NativeType("unsigned")
    public static boolean clang_isPreprocessing(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isPreprocessing;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_isUnexposed ] ---

    /** Determine whether the given cursor represents a currently unexposed piece of the AST (e.g., CXCursor_UnexposedStmt). */
    @NativeType("unsigned")
    public static boolean clang_isUnexposed(@NativeType("enum CXCursorKind") int kind) {
        long __functionAddress = Functions.isUnexposed;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_getCursorLinkage ] ---

    /** Unsafe version of: {@link #clang_getCursorLinkage getCursorLinkage} */
    public static int nclang_getCursorLinkage(long cursor) {
        long __functionAddress = Functions.getCursorLinkage;
        return invokePI(cursor, __functionAddress);
    }

    /** Determine the linkage of the entity referred to by a given cursor. */
    @NativeType("enum CXLinkageKind")
    public static int clang_getCursorLinkage(CXCursor cursor) {
        return nclang_getCursorLinkage(cursor.address());
    }

    // --- [ clang_getCursorVisibility ] ---

    /** Unsafe version of: {@link #clang_getCursorVisibility getCursorVisibility} */
    public static int nclang_getCursorVisibility(long cursor) {
        long __functionAddress = Functions.getCursorVisibility;
        return invokePI(cursor, __functionAddress);
    }

    /**
     * Describe the visibility of the entity referred to by a cursor.
     * 
     * <p>This returns the default visibility if not explicitly specified by a visibility attribute. The default visibility may be changed by commandline
     * arguments.</p>
     *
     * @param cursor the cursor to query
     *
     * @return the visibility of the cursor
     */
    @NativeType("enum CXVisibilityKind")
    public static int clang_getCursorVisibility(CXCursor cursor) {
        return nclang_getCursorVisibility(cursor.address());
    }

    // --- [ clang_getCursorAvailability ] ---

    /** Unsafe version of: {@link #clang_getCursorAvailability getCursorAvailability} */
    public static int nclang_getCursorAvailability(long cursor) {
        long __functionAddress = Functions.getCursorAvailability;
        return invokePI(cursor, __functionAddress);
    }

    /**
     * Determine the availability of the entity that this cursor refers to, taking the current target platform into account.
     *
     * @param cursor the cursor to query
     *
     * @return the availability of the cursor
     */
    @NativeType("enum CXAvailabilityKind")
    public static int clang_getCursorAvailability(CXCursor cursor) {
        return nclang_getCursorAvailability(cursor.address());
    }

    // --- [ clang_getCursorPlatformAvailability ] ---

    /**
     * Unsafe version of: {@link #clang_getCursorPlatformAvailability getCursorPlatformAvailability}
     *
     * @param availability_size the number of elements available in the {@code availability} array
     */
    public static int nclang_getCursorPlatformAvailability(long cursor, long always_deprecated, long deprecated_message, long always_unavailable, long unavailable_message, long availability, int availability_size) {
        long __functionAddress = Functions.getCursorPlatformAvailability;
        return invokePPPPPPI(cursor, always_deprecated, deprecated_message, always_unavailable, unavailable_message, availability, availability_size, __functionAddress);
    }

    /**
     * Determine the availability of the entity that this cursor refers to on any platforms for which availability information is known.
     * 
     * <p>Note that the client is responsible for calling {@link #clang_disposeCXPlatformAvailability disposeCXPlatformAvailability} to free each of the platform-availability structures returned. There
     * are {@code min(N, availability_size)} such structures.</p>
     *
     * @param cursor              the cursor to query
     * @param always_deprecated   if non-{@code NULL}, will be set to indicate whether the entity is deprecated on all platforms
     * @param deprecated_message  if non-{@code NULL}, will be set to the message text provided along with the unconditional deprecation of this entity. The client is responsible for
     *                            deallocating this string.
     * @param always_unavailable  if non-{@code NULL}, will be set to indicate whether the entity is unavailable on all platforms
     * @param unavailable_message if non-{@code NULL}, will be set to the message text provided along with the unconditional unavailability of this entity. The client is responsible for
     *                            deallocating this string.
     * @param availability        if non-{@code NULL}, an array of {@code CXPlatformAvailability} instances that will be populated with platform availability information, up to either the
     *                            number of platforms for which availability information is available (as returned by this function) or {@code availability_size}, whichever is
     *                            smaller
     *
     * @return the number of platforms (N) for which availability information is available (which is unrelated to {@code availability_size})
     */
    public static int clang_getCursorPlatformAvailability(CXCursor cursor, @Nullable @NativeType("int *") IntBuffer always_deprecated, @Nullable @NativeType("CXString *") CXString deprecated_message, @Nullable @NativeType("int *") IntBuffer always_unavailable, @Nullable @NativeType("CXString *") CXString unavailable_message, @Nullable @NativeType("CXPlatformAvailability *") CXPlatformAvailability.Buffer availability) {
        if (CHECKS) {
            checkSafe(always_deprecated, 1);
            checkSafe(always_unavailable, 1);
            checkSafe(availability, 1);
        }
        return nclang_getCursorPlatformAvailability(cursor.address(), memAddressSafe(always_deprecated), memAddressSafe(deprecated_message), memAddressSafe(always_unavailable), memAddressSafe(unavailable_message), memAddressSafe(availability), remainingSafe(availability));
    }

    // --- [ clang_disposeCXPlatformAvailability ] ---

    /** Unsafe version of: {@link #clang_disposeCXPlatformAvailability disposeCXPlatformAvailability} */
    public static void nclang_disposeCXPlatformAvailability(long availability) {
        long __functionAddress = Functions.disposeCXPlatformAvailability;
        invokePV(availability, __functionAddress);
    }

    /** Free the memory associated with a {@code CXPlatformAvailability} structure. */
    public static void clang_disposeCXPlatformAvailability(@NativeType("CXPlatformAvailability *") CXPlatformAvailability availability) {
        nclang_disposeCXPlatformAvailability(availability.address());
    }

    // --- [ clang_getCursorLanguage ] ---

    /** Unsafe version of: {@link #clang_getCursorLanguage getCursorLanguage} */
    public static int nclang_getCursorLanguage(long cursor) {
        long __functionAddress = Functions.getCursorLanguage;
        return invokePI(cursor, __functionAddress);
    }

    /** Determine the "language" of the entity referred to by a given cursor. */
    @NativeType("enum CXLanguageKind")
    public static int clang_getCursorLanguage(CXCursor cursor) {
        return nclang_getCursorLanguage(cursor.address());
    }

    // --- [ clang_getCursorTLSKind ] ---

    /** Unsafe version of: {@link #clang_getCursorTLSKind getCursorTLSKind} */
    public static int nclang_getCursorTLSKind(long cursor) {
        long __functionAddress = Functions.getCursorTLSKind;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(cursor, __functionAddress);
    }

    /** Determine the "thread-local storage (TLS) kind" of the declaration referred to by a cursor. */
    @NativeType("enum CXTLSKind")
    public static int clang_getCursorTLSKind(CXCursor cursor) {
        return nclang_getCursorTLSKind(cursor.address());
    }

    // --- [ clang_Cursor_getTranslationUnit ] ---

    /** Unsafe version of: {@link #clang_Cursor_getTranslationUnit Cursor_getTranslationUnit} */
    public static long nclang_Cursor_getTranslationUnit(long cursor) {
        long __functionAddress = Functions.Cursor_getTranslationUnit;
        return invokePP(cursor, __functionAddress);
    }

    /** Returns the translation unit that a cursor originated from. */
    @NativeType("CXTranslationUnit")
    public static long clang_Cursor_getTranslationUnit(CXCursor cursor) {
        return nclang_Cursor_getTranslationUnit(cursor.address());
    }

    // --- [ clang_createCXCursorSet ] ---

    /** Creates an empty CXCursorSet. */
    @NativeType("CXCursorSet")
    public static long clang_createCXCursorSet() {
        long __functionAddress = Functions.createCXCursorSet;
        return invokeP(__functionAddress);
    }

    // --- [ clang_disposeCXCursorSet ] ---

    /** Disposes a CXCursorSet and releases its associated memory. */
    public static void clang_disposeCXCursorSet(@NativeType("CXCursorSet") long cset) {
        long __functionAddress = Functions.disposeCXCursorSet;
        if (CHECKS) {
            check(cset);
        }
        invokePV(cset, __functionAddress);
    }

    // --- [ clang_CXCursorSet_contains ] ---

    /** Unsafe version of: {@link #clang_CXCursorSet_contains CXCursorSet_contains} */
    public static int nclang_CXCursorSet_contains(long cset, long cursor) {
        long __functionAddress = Functions.CXCursorSet_contains;
        if (CHECKS) {
            check(cset);
        }
        return invokePPI(cset, cursor, __functionAddress);
    }

    /**
     * Queries a CXCursorSet to see if it contains a specific CXCursor.
     *
     * @return non-zero if the set contains the specified cursor
     */
    @NativeType("unsigned")
    public static boolean clang_CXCursorSet_contains(@NativeType("CXCursorSet") long cset, CXCursor cursor) {
        return nclang_CXCursorSet_contains(cset, cursor.address()) != 0;
    }

    // --- [ clang_CXCursorSet_insert ] ---

    /** Unsafe version of: {@link #clang_CXCursorSet_insert CXCursorSet_insert} */
    public static int nclang_CXCursorSet_insert(long cset, long cursor) {
        long __functionAddress = Functions.CXCursorSet_insert;
        if (CHECKS) {
            check(cset);
        }
        return invokePPI(cset, cursor, __functionAddress);
    }

    /**
     * Inserts a CXCursor into a CXCursorSet.
     *
     * @return zero if the CXCursor was already in the set, and non-zero otherwise
     */
    @NativeType("unsigned")
    public static boolean clang_CXCursorSet_insert(@NativeType("CXCursorSet") long cset, CXCursor cursor) {
        return nclang_CXCursorSet_insert(cset, cursor.address()) != 0;
    }

    // --- [ clang_getCursorSemanticParent ] ---

    /** Unsafe version of: {@link #clang_getCursorSemanticParent getCursorSemanticParent} */
    public static native void nclang_getCursorSemanticParent(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorSemanticParent getCursorSemanticParent} */
    public static void nclang_getCursorSemanticParent(long cursor, long __result) {
        long __functionAddress = Functions.getCursorSemanticParent;
        nclang_getCursorSemanticParent(cursor, __functionAddress, __result);
    }

    /**
     * Determine the semantic parent of the given cursor.
     * 
     * <p>The semantic parent of a cursor is the cursor that semantically contains the given {@code cursor}. For many declarations, the lexical and semantic
     * parents are equivalent (the lexical parent is returned by {@link #clang_getCursorLexicalParent getCursorLexicalParent}). They diverge when declarations or definitions are provided
     * out-of-line. For example:</p>
     * 
     * <pre><code>
     *  class C {
     *   void f();
     *  };
     * 
     *  void C::f() { }</code></pre>
     * 
     * <p>In the out-of-line definition of {@code C::f}, the semantic parent is the class {@code C}, of which this function is a member. The lexical parent is
     * the place where the declaration actually occurs in the source code; in this case, the definition occurs in the translation unit. In general, the
     * lexical parent for a given entity can change without affecting the semantics of the program, and the lexical parent of different declarations of the
     * same entity may be different. Changing the semantic parent of a declaration, on the other hand, can have a major impact on semantics, and
     * redeclarations of a particular entity should all have the same semantic context.</p>
     * 
     * <p>In the example above, both declarations of {@code C::f} have {@code C} as their semantic context, while the lexical context of the first {@code C::f}
     * is {@code C} and the lexical context of the second {@code C::f} is the translation unit.</p>
     * 
     * <p>For global declarations, the semantic parent is the translation unit.</p>
     */
    public static CXCursor clang_getCursorSemanticParent(CXCursor cursor, CXCursor __result) {
        nclang_getCursorSemanticParent(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorLexicalParent ] ---

    /** Unsafe version of: {@link #clang_getCursorLexicalParent getCursorLexicalParent} */
    public static native void nclang_getCursorLexicalParent(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorLexicalParent getCursorLexicalParent} */
    public static void nclang_getCursorLexicalParent(long cursor, long __result) {
        long __functionAddress = Functions.getCursorLexicalParent;
        nclang_getCursorLexicalParent(cursor, __functionAddress, __result);
    }

    /**
     * Determine the lexical parent of the given cursor.
     * 
     * <p>The lexical parent of a cursor is the cursor in which the given {@code cursor} was actually written. For many declarations, the lexical and semantic
     * parents are equivalent (the semantic parent is returned by {@link #clang_getCursorSemanticParent getCursorSemanticParent}). They diverge when declarations or definitions are provided
     * out-of-line. For example:</p>
     * 
     * <pre><code>
     *  class C {
     *   void f();
     *  };
     * 
     *  void C::f() { }</code></pre>
     * 
     * <p>In the out-of-line definition of {@code C::f}, the semantic parent is the class {@code C}, of which this function is a member. The lexical parent is
     * the place where the declaration actually occurs in the source code; in this case, the definition occurs in the translation unit. In general, the
     * lexical parent for a given entity can change without affecting the semantics of the program, and the lexical parent of different declarations of the
     * same entity may be different. Changing the semantic parent of a declaration, on the other hand, can have a major impact on semantics, and
     * redeclarations of a particular entity should all have the same semantic context.</p>
     * 
     * <p>In the example above, both declarations of {@code C::f} have {@code C} as their semantic context, while the lexical context of the first {@code C::f}
     * is {@code C} and the lexical context of the second {@code C::f} is the translation unit.</p>
     * 
     * <p>For declarations written in the global scope, the lexical parent is the translation unit.</p>
     */
    public static CXCursor clang_getCursorLexicalParent(CXCursor cursor, CXCursor __result) {
        nclang_getCursorLexicalParent(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getOverriddenCursors ] ---

    /** Unsafe version of: {@link #clang_getOverriddenCursors getOverriddenCursors} */
    public static void nclang_getOverriddenCursors(long cursor, long overridden, long num_overridden) {
        long __functionAddress = Functions.getOverriddenCursors;
        invokePPPV(cursor, overridden, num_overridden, __functionAddress);
    }

    /**
     * Determine the set of methods that are overridden by the given method.
     * 
     * <p>In both Objective-C and C++, a method (aka virtual member function, in C++) can override a virtual method in a base class. For Objective-C, a method is
     * said to override any method in the class's base class, its protocols, or its categories' protocols, that has the same selector and is of the same kind
     * (class or instance). If no such method exists, the search continues to the class's superclass, its protocols, and its categories, and so on. A method
     * from an Objective-C implementation is considered to override the same methods as its corresponding method in the interface.</p>
     * 
     * <p>For C++, a virtual member function overrides any virtual member function with the same signature that occurs in its base classes. With multiple
     * inheritance, a virtual member function can override several virtual member functions coming from different base classes.</p>
     * 
     * <p>In all cases, this function determines the immediate overridden method, rather than all of the overridden methods. For example, if a method is
     * originally declared in a class A, then overridden in B (which in inherits from A) and also in C (which inherited from B), then the only overridden
     * method returned from this function when invoked on C's method will be B's method. The client may then invoke this function again, given the
     * previously-found overridden methods, to map out the complete method-override set.</p>
     *
     * @param cursor         a cursor representing an Objective-C or C++ method. This routine will compute the set of methods that this method overrides.
     * @param overridden     a pointer whose pointee will be replaced with a pointer to an array of cursors, representing the set of overridden methods. If there are no
     *                       overridden methods, the pointee will be set to {@code NULL}. The pointee must be freed via a call to {@link #clang_disposeOverriddenCursors disposeOverriddenCursors}.
     * @param num_overridden a pointer to the number of overridden functions, will be set to the number of overridden functions in the array pointed to by {@code overridden}
     */
    public static void clang_getOverriddenCursors(CXCursor cursor, @NativeType("CXCursor **") PointerBuffer overridden, @NativeType("unsigned *") IntBuffer num_overridden) {
        if (CHECKS) {
            check(overridden, 1);
            check(num_overridden, 1);
        }
        nclang_getOverriddenCursors(cursor.address(), memAddress(overridden), memAddress(num_overridden));
    }

    // --- [ clang_disposeOverriddenCursors ] ---

    /** Unsafe version of: {@link #clang_disposeOverriddenCursors disposeOverriddenCursors} */
    public static void nclang_disposeOverriddenCursors(long overridden) {
        long __functionAddress = Functions.disposeOverriddenCursors;
        invokePV(overridden, __functionAddress);
    }

    /** Free the set of overridden cursors returned by {@code clang_getOverriddenCursors()}. */
    public static void clang_disposeOverriddenCursors(@NativeType("CXCursor *") CXCursor.Buffer overridden) {
        nclang_disposeOverriddenCursors(overridden.address());
    }

    // --- [ clang_getIncludedFile ] ---

    /** Unsafe version of: {@link #clang_getIncludedFile getIncludedFile} */
    public static long nclang_getIncludedFile(long cursor) {
        long __functionAddress = Functions.getIncludedFile;
        return invokePP(cursor, __functionAddress);
    }

    /** Retrieve the file that is included by the given inclusion directive cursor. */
    @NativeType("CXFile")
    public static long clang_getIncludedFile(CXCursor cursor) {
        return nclang_getIncludedFile(cursor.address());
    }

    // --- [ clang_getCursor ] ---

    /** Unsafe version of: {@link #clang_getCursor getCursor} */
    public static native void nclang_getCursor(long TU, long location, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursor getCursor} */
    public static void nclang_getCursor(long TU, long location, long __result) {
        long __functionAddress = Functions.getCursor;
        if (CHECKS) {
            check(TU);
        }
        nclang_getCursor(TU, location, __functionAddress, __result);
    }

    /**
     * Map a source location to the cursor that describes the entity at that location in the source code.
     * 
     * <p>{@code clang_getCursor()} maps an arbitrary source location within a translation unit down to the most specific cursor that describes the entity at that
     * location. For example, given an expression {@code x + y}, invoking {@code clang_getCursor()} with a source location pointing to "x" will return the
     * cursor for "x"; similarly for "y". If the cursor points anywhere between "x" or "y" (e.g., on the + or the whitespace around it), clang_getCursor()
     * will return a cursor referring to the "+" expression.</p>
     *
     * @param __result a cursor representing the entity at the given source location, or a {@code NULL} cursor if no such entity can be found
     */
    public static CXCursor clang_getCursor(@NativeType("CXTranslationUnit") long TU, CXSourceLocation location, CXCursor __result) {
        nclang_getCursor(TU, location.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorLocation ] ---

    /** Unsafe version of: {@link #clang_getCursorLocation getCursorLocation} */
    public static native void nclang_getCursorLocation(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorLocation getCursorLocation} */
    public static void nclang_getCursorLocation(long cursor, long __result) {
        long __functionAddress = Functions.getCursorLocation;
        nclang_getCursorLocation(cursor, __functionAddress, __result);
    }

    /**
     * Retrieve the physical location of the source constructor referenced by the given cursor.
     * 
     * <p>The location of a declaration is typically the location of the name of that declaration, where the name of that declaration would occur if it is
     * unnamed, or some keyword that introduces that particular declaration. The location of a reference is where that reference occurs within the source
     * code.</p>
     */
    public static CXSourceLocation clang_getCursorLocation(CXCursor cursor, CXSourceLocation __result) {
        nclang_getCursorLocation(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorExtent ] ---

    /** Unsafe version of: {@link #clang_getCursorExtent getCursorExtent} */
    public static native void nclang_getCursorExtent(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorExtent getCursorExtent} */
    public static void nclang_getCursorExtent(long cursor, long __result) {
        long __functionAddress = Functions.getCursorExtent;
        nclang_getCursorExtent(cursor, __functionAddress, __result);
    }

    /**
     * Retrieve the physical extent of the source construct referenced by the given cursor.
     * 
     * <p>The extent of a cursor starts with the file/line/column pointing at the first character within the source construct that the cursor refers to and ends
     * with the last character within that source construct. For a declaration, the extent covers the declaration itself. For a reference, the extent covers
     * the location of the reference (e.g., where the referenced entity was actually used).</p>
     */
    public static CXSourceRange clang_getCursorExtent(CXCursor cursor, CXSourceRange __result) {
        nclang_getCursorExtent(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorType ] ---

    /** Unsafe version of: {@link #clang_getCursorType getCursorType} */
    public static native void nclang_getCursorType(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorType getCursorType} */
    public static void nclang_getCursorType(long C, long __result) {
        long __functionAddress = Functions.getCursorType;
        nclang_getCursorType(C, __functionAddress, __result);
    }

    /** Retrieve the type of a {@code CXCursor} (if any). */
    public static CXType clang_getCursorType(CXCursor C, CXType __result) {
        nclang_getCursorType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypeSpelling ] ---

    /** Unsafe version of: {@link #clang_getTypeSpelling getTypeSpelling} */
    public static native void nclang_getTypeSpelling(long CT, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTypeSpelling getTypeSpelling} */
    public static void nclang_getTypeSpelling(long CT, long __result) {
        long __functionAddress = Functions.getTypeSpelling;
        nclang_getTypeSpelling(CT, __functionAddress, __result);
    }

    /**
     * Pretty-print the underlying type using the rules of the language of the translation unit from which it came.
     * 
     * <p>If the type is invalid, an empty string is returned.</p>
     */
    public static CXString clang_getTypeSpelling(CXType CT, CXString __result) {
        nclang_getTypeSpelling(CT.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypedefDeclUnderlyingType ] ---

    /** Unsafe version of: {@link #clang_getTypedefDeclUnderlyingType getTypedefDeclUnderlyingType} */
    public static native void nclang_getTypedefDeclUnderlyingType(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTypedefDeclUnderlyingType getTypedefDeclUnderlyingType} */
    public static void nclang_getTypedefDeclUnderlyingType(long C, long __result) {
        long __functionAddress = Functions.getTypedefDeclUnderlyingType;
        nclang_getTypedefDeclUnderlyingType(C, __functionAddress, __result);
    }

    /**
     * Retrieve the underlying type of a typedef declaration.
     * 
     * <p>If the cursor does not reference a typedef declaration, an invalid type is returned.</p>
     */
    public static CXType clang_getTypedefDeclUnderlyingType(CXCursor C, CXType __result) {
        nclang_getTypedefDeclUnderlyingType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getEnumDeclIntegerType ] ---

    /** Unsafe version of: {@link #clang_getEnumDeclIntegerType getEnumDeclIntegerType} */
    public static native void nclang_getEnumDeclIntegerType(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getEnumDeclIntegerType getEnumDeclIntegerType} */
    public static void nclang_getEnumDeclIntegerType(long C, long __result) {
        long __functionAddress = Functions.getEnumDeclIntegerType;
        nclang_getEnumDeclIntegerType(C, __functionAddress, __result);
    }

    /**
     * Retrieve the integer type of an enum declaration.
     * 
     * <p>If the cursor does not reference an enum declaration, an invalid type is returned.</p>
     */
    public static CXType clang_getEnumDeclIntegerType(CXCursor C, CXType __result) {
        nclang_getEnumDeclIntegerType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getEnumConstantDeclValue ] ---

    /** Unsafe version of: {@link #clang_getEnumConstantDeclValue getEnumConstantDeclValue} */
    public static long nclang_getEnumConstantDeclValue(long C) {
        long __functionAddress = Functions.getEnumConstantDeclValue;
        return invokePJ(C, __functionAddress);
    }

    /**
     * Retrieve the integer value of an enum constant declaration as a signed long long.
     * 
     * <p>If the cursor does not reference an enum constant declaration, {@code LLONG_MIN} is returned. Since this is also potentially a valid constant value,
     * the kind of the cursor must be verified before calling this function.</p>
     */
    @NativeType("long long")
    public static long clang_getEnumConstantDeclValue(CXCursor C) {
        return nclang_getEnumConstantDeclValue(C.address());
    }

    // --- [ clang_getEnumConstantDeclUnsignedValue ] ---

    /** Unsafe version of: {@link #clang_getEnumConstantDeclUnsignedValue getEnumConstantDeclUnsignedValue} */
    public static long nclang_getEnumConstantDeclUnsignedValue(long C) {
        long __functionAddress = Functions.getEnumConstantDeclUnsignedValue;
        return invokePJ(C, __functionAddress);
    }

    /**
     * Retrieve the integer value of an enum constant declaration as an unsigned long long.
     * 
     * <p>If the cursor does not reference an enum constant declaration, {@code ULLONG_MAX} is returned. Since this is also potentially a valid constant value,
     * the kind of the cursor must be verified before calling this function.</p>
     */
    @NativeType("unsigned long long")
    public static long clang_getEnumConstantDeclUnsignedValue(CXCursor C) {
        return nclang_getEnumConstantDeclUnsignedValue(C.address());
    }

    // --- [ clang_getFieldDeclBitWidth ] ---

    /** Unsafe version of: {@link #clang_getFieldDeclBitWidth getFieldDeclBitWidth} */
    public static int nclang_getFieldDeclBitWidth(long C) {
        long __functionAddress = Functions.getFieldDeclBitWidth;
        return invokePI(C, __functionAddress);
    }

    /**
     * Retrieve the bit width of a bit field declaration as an integer.
     * 
     * <p>If a cursor that is not a bit field declaration is passed in, -1 is returned.</p>
     */
    public static int clang_getFieldDeclBitWidth(CXCursor C) {
        return nclang_getFieldDeclBitWidth(C.address());
    }

    // --- [ clang_Cursor_getNumArguments ] ---

    /** Unsafe version of: {@link #clang_Cursor_getNumArguments Cursor_getNumArguments} */
    public static int nclang_Cursor_getNumArguments(long C) {
        long __functionAddress = Functions.Cursor_getNumArguments;
        return invokePI(C, __functionAddress);
    }

    /**
     * Retrieve the number of non-variadic arguments associated with a given cursor.
     * 
     * <p>The number of arguments can be determined for calls as well as for declarations of functions or methods. For other cursors -1 is returned.</p>
     */
    public static int clang_Cursor_getNumArguments(CXCursor C) {
        return nclang_Cursor_getNumArguments(C.address());
    }

    // --- [ clang_Cursor_getArgument ] ---

    /** Unsafe version of: {@link #clang_Cursor_getArgument Cursor_getArgument} */
    public static native void nclang_Cursor_getArgument(long C, int i, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getArgument Cursor_getArgument} */
    public static void nclang_Cursor_getArgument(long C, int i, long __result) {
        long __functionAddress = Functions.Cursor_getArgument;
        nclang_Cursor_getArgument(C, i, __functionAddress, __result);
    }

    /**
     * Retrieve the argument cursor of a function or method.
     * 
     * <p>The argument cursor can be determined for calls as well as for declarations of functions or methods. For other cursors and for invalid indices, an
     * invalid cursor is returned.</p>
     */
    public static CXCursor clang_Cursor_getArgument(CXCursor C, @NativeType("unsigned") int i, CXCursor __result) {
        nclang_Cursor_getArgument(C.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getNumTemplateArguments ] ---

    /** Unsafe version of: {@link #clang_Cursor_getNumTemplateArguments Cursor_getNumTemplateArguments} */
    public static int nclang_Cursor_getNumTemplateArguments(long C) {
        long __functionAddress = Functions.Cursor_getNumTemplateArguments;
        return invokePI(C, __functionAddress);
    }

    /**
     * Returns the number of template args of a function decl representing a template specialization.
     * 
     * <p>If the argument cursor cannot be converted into a template function declaration, -1 is returned.</p>
     * 
     * <p>For example, for the following declaration and specialization:</p>
     * 
     * <pre><code>
     * template &lt;typename T, int kInt, bool kBool&gt;
     * void foo() { ... }
     * 
     * template &lt;&gt;
     * void foo &lt;float , -7, true&gt;();</code></pre>
     * 
     * <p>The value 3 would be returned from this call.</p>
     */
    public static int clang_Cursor_getNumTemplateArguments(CXCursor C) {
        return nclang_Cursor_getNumTemplateArguments(C.address());
    }

    // --- [ clang_Cursor_getTemplateArgumentKind ] ---

    /** Unsafe version of: {@link #clang_Cursor_getTemplateArgumentKind Cursor_getTemplateArgumentKind} */
    public static int nclang_Cursor_getTemplateArgumentKind(long C, int I) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentKind;
        return invokePI(C, I, __functionAddress);
    }

    /**
     * Retrieve the kind of the I'th template argument of the {@code CXCursor} {@code C}.
     * 
     * <p>If the argument {@code CXCursor} does not represent a {@code FunctionDecl}, an invalid template argument kind is returned.</p>
     * 
     * <p>For example, for the following declaration and specialization:</p>
     * 
     * <pre><code>
     * template &lt;typename T, int kInt, bool kBool&gt;
     * void foo() { ... }
     * 
     * template &lt;&gt;
     * void foo &lt;float , -7, true&gt;();</code></pre>
     * 
     * <p>For I = 0, 1, and 2, {@code Type}, {@code Integral}, and {@code Integral} will be returned, respectively.</p>
     */
    @NativeType("enum CXTemplateArgumentKind")
    public static int clang_Cursor_getTemplateArgumentKind(CXCursor C, @NativeType("unsigned") int I) {
        return nclang_Cursor_getTemplateArgumentKind(C.address(), I);
    }

    // --- [ clang_Cursor_getTemplateArgumentType ] ---

    /** Unsafe version of: {@link #clang_Cursor_getTemplateArgumentType Cursor_getTemplateArgumentType} */
    public static native void nclang_Cursor_getTemplateArgumentType(long C, int I, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getTemplateArgumentType Cursor_getTemplateArgumentType} */
    public static void nclang_Cursor_getTemplateArgumentType(long C, int I, long __result) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentType;
        nclang_Cursor_getTemplateArgumentType(C, I, __functionAddress, __result);
    }

    /**
     * Retrieve a {@code CXType} representing the type of a {@code TemplateArgument} of a function decl representing a template specialization.
     * 
     * <p>If the argument {@code CXCursor does} not represent a {@code FunctionDecl} whose {@code I}'th template argument has a kind of
     * {@code CXTemplateArgKind_Integral}, an invalid type is returned.</p>
     * 
     * <p>For example, for the following declaration and specialization:</p>
     * 
     * <pre><code>
     * template &lt;typename T, int kInt, bool kBool&gt;
     * void foo() { ... }
     * 
     * template &lt;&gt;
     * void foo &lt;float , -7, true&gt;();</code></pre>
     * 
     * <p>If called with I = 0, "float", will be returned. Invalid types will be returned for I == 1 or 2.</p>
     */
    public static CXType clang_Cursor_getTemplateArgumentType(CXCursor C, @NativeType("unsigned") int I, CXType __result) {
        nclang_Cursor_getTemplateArgumentType(C.address(), I, __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getTemplateArgumentValue ] ---

    /** Unsafe version of: {@link #clang_Cursor_getTemplateArgumentValue Cursor_getTemplateArgumentValue} */
    public static long nclang_Cursor_getTemplateArgumentValue(long C, int I) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentValue;
        return invokePJ(C, I, __functionAddress);
    }

    /**
     * Retrieve the value of an {@code Integral} {@code TemplateArgument} (of a function decl representing a template specialization) as a {@code signed long
     * long}.
     * 
     * <p>It is undefined to call this function on a {@code CXCursor} that does not represent a {@code FunctionDecl} or whose {@code I}'th template argument is
     * not an integral value.</p>
     * 
     * <p>For example, for the following declaration and specialization:</p>
     * 
     * <pre><code>
     * template &lt;typename T, int kInt, bool kBool&gt;
     * void foo() { ... }
     * 
     * template &lt;&gt;
     * void foo &lt;float , -7, true&gt;();</code></pre>
     * 
     * <p>If called with I = 1 or 2, -7 or true will be returned, respectively. For I == 0, this function's behavior is undefined.</p>
     */
    @NativeType("long long")
    public static long clang_Cursor_getTemplateArgumentValue(CXCursor C, @NativeType("unsigned") int I) {
        return nclang_Cursor_getTemplateArgumentValue(C.address(), I);
    }

    // --- [ clang_Cursor_getTemplateArgumentUnsignedValue ] ---

    /** Unsafe version of: {@link #clang_Cursor_getTemplateArgumentUnsignedValue Cursor_getTemplateArgumentUnsignedValue} */
    public static long nclang_Cursor_getTemplateArgumentUnsignedValue(long C, int I) {
        long __functionAddress = Functions.Cursor_getTemplateArgumentUnsignedValue;
        return invokePJ(C, I, __functionAddress);
    }

    /**
     * Retrieve the value of an {@code Integral} {@code TemplateArgument} (of a function decl representing a template specialization) as an {@code unsigned
     * long long}.
     * 
     * <p>It is undefined to call this function on a {@code CXCursor} that does not represent a {@code FunctionDecl} or whose {@code I}'th template argument is
     * not an integral value.</p>
     * 
     * <p>For example, for the following declaration and specialization:</p>
     * 
     * <pre><code>
     * template &lt;typename T, int kInt, bool kBool&gt;
     * void foo() { ... }
     * 
     * template &lt;&gt;
     * void foo &lt;float , 2147483649, true&gt;();</code></pre>
     * 
     * <p>If called with I = 1 or 2, 2147483649 or true will be returned, respectively. For I == 0, this function's behavior is undefined.</p>
     */
    @NativeType("unsigned long long")
    public static long clang_Cursor_getTemplateArgumentUnsignedValue(CXCursor C, @NativeType("unsigned") int I) {
        return nclang_Cursor_getTemplateArgumentUnsignedValue(C.address(), I);
    }

    // --- [ clang_equalTypes ] ---

    /** Unsafe version of: {@link #clang_equalTypes equalTypes} */
    public static int nclang_equalTypes(long A, long B) {
        long __functionAddress = Functions.equalTypes;
        return invokePPI(A, B, __functionAddress);
    }

    /**
     * Determine whether two {@code CXTypes} represent the same type.
     *
     * @return non-zero if the {@code CXTypes} represent the same type and zero otherwise
     */
    @NativeType("unsigned")
    public static boolean clang_equalTypes(CXType A, CXType B) {
        return nclang_equalTypes(A.address(), B.address()) != 0;
    }

    // --- [ clang_getCanonicalType ] ---

    /** Unsafe version of: {@link #clang_getCanonicalType getCanonicalType} */
    public static native void nclang_getCanonicalType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCanonicalType getCanonicalType} */
    public static void nclang_getCanonicalType(long T, long __result) {
        long __functionAddress = Functions.getCanonicalType;
        nclang_getCanonicalType(T, __functionAddress, __result);
    }

    /**
     * Return the canonical type for a {@code CXType}.
     * 
     * <p>Clang's type system explicitly models typedefs and all the ways a specific type can be represented. The canonical type is the underlying type with all
     * the "sugar" removed. For example, if 'T' is a typedef for 'int', the canonical type for 'T' would be 'int'.</p>
     */
    public static CXType clang_getCanonicalType(CXType T, CXType __result) {
        nclang_getCanonicalType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_isConstQualifiedType ] ---

    /** Unsafe version of: {@link #clang_isConstQualifiedType isConstQualifiedType} */
    public static int nclang_isConstQualifiedType(long T) {
        long __functionAddress = Functions.isConstQualifiedType;
        return invokePI(T, __functionAddress);
    }

    /** Determine whether a {@code CXType} has the "const" qualifier set, without looking through typedefs that may have added "const" at a different level. */
    @NativeType("unsigned")
    public static boolean clang_isConstQualifiedType(CXType T) {
        return nclang_isConstQualifiedType(T.address()) != 0;
    }

    // --- [ clang_Cursor_isMacroFunctionLike ] ---

    /** Unsafe version of: {@link #clang_Cursor_isMacroFunctionLike Cursor_isMacroFunctionLike} */
    public static int nclang_Cursor_isMacroFunctionLike(long C) {
        long __functionAddress = Functions.Cursor_isMacroFunctionLike;
        return invokePI(C, __functionAddress);
    }

    /** Determine whether a {@code CXCursor} that is a macro, is function like. */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isMacroFunctionLike(CXCursor C) {
        return nclang_Cursor_isMacroFunctionLike(C.address()) != 0;
    }

    // --- [ clang_Cursor_isMacroBuiltin ] ---

    /** Unsafe version of: {@link #clang_Cursor_isMacroBuiltin Cursor_isMacroBuiltin} */
    public static int nclang_Cursor_isMacroBuiltin(long C) {
        long __functionAddress = Functions.Cursor_isMacroBuiltin;
        return invokePI(C, __functionAddress);
    }

    /** Determine whether a {@code CXCursor} that is a macro, is a builtin one. */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isMacroBuiltin(CXCursor C) {
        return nclang_Cursor_isMacroBuiltin(C.address()) != 0;
    }

    // --- [ clang_Cursor_isFunctionInlined ] ---

    /** Unsafe version of: {@link #clang_Cursor_isFunctionInlined Cursor_isFunctionInlined} */
    public static int nclang_Cursor_isFunctionInlined(long C) {
        long __functionAddress = Functions.Cursor_isFunctionInlined;
        return invokePI(C, __functionAddress);
    }

    /** Determine whether a {@code CXCursor} that is a function declaration, is an inline declaration. */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isFunctionInlined(CXCursor C) {
        return nclang_Cursor_isFunctionInlined(C.address()) != 0;
    }

    // --- [ clang_isVolatileQualifiedType ] ---

    /** Unsafe version of: {@link #clang_isVolatileQualifiedType isVolatileQualifiedType} */
    public static int nclang_isVolatileQualifiedType(long T) {
        long __functionAddress = Functions.isVolatileQualifiedType;
        return invokePI(T, __functionAddress);
    }

    /**
     * Determine whether a {@code CXType} has the "volatile" qualifier set, without looking through typedefs that may have added "volatile" at a different
     * level.
     */
    @NativeType("unsigned")
    public static boolean clang_isVolatileQualifiedType(CXType T) {
        return nclang_isVolatileQualifiedType(T.address()) != 0;
    }

    // --- [ clang_isRestrictQualifiedType ] ---

    /** Unsafe version of: {@link #clang_isRestrictQualifiedType isRestrictQualifiedType} */
    public static int nclang_isRestrictQualifiedType(long T) {
        long __functionAddress = Functions.isRestrictQualifiedType;
        return invokePI(T, __functionAddress);
    }

    /**
     * Determine whether a {@code CXType} has the "restrict" qualifier set, without looking through typedefs that may have added "restrict" at a different
     * level.
     */
    @NativeType("unsigned")
    public static boolean clang_isRestrictQualifiedType(CXType T) {
        return nclang_isRestrictQualifiedType(T.address()) != 0;
    }

    // --- [ clang_getAddressSpace ] ---

    /** Unsafe version of: {@link #clang_getAddressSpace getAddressSpace} */
    public static int nclang_getAddressSpace(long T) {
        long __functionAddress = Functions.getAddressSpace;
        return invokePI(T, __functionAddress);
    }

    /** Returns the address space of the given type. */
    @NativeType("unsigned")
    public static int clang_getAddressSpace(CXType T) {
        return nclang_getAddressSpace(T.address());
    }

    // --- [ clang_getTypedefName ] ---

    /** Unsafe version of: {@link #clang_getTypedefName getTypedefName} */
    public static native void nclang_getTypedefName(long CT, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTypedefName getTypedefName} */
    public static void nclang_getTypedefName(long CT, long __result) {
        long __functionAddress = Functions.getTypedefName;
        nclang_getTypedefName(CT, __functionAddress, __result);
    }

    /** Returns the typedef name of the given type. */
    public static CXString clang_getTypedefName(CXType CT, CXString __result) {
        nclang_getTypedefName(CT.address(), __result.address());
        return __result;
    }

    // --- [ clang_getPointeeType ] ---

    /** Unsafe version of: {@link #clang_getPointeeType getPointeeType} */
    public static native void nclang_getPointeeType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getPointeeType getPointeeType} */
    public static void nclang_getPointeeType(long T, long __result) {
        long __functionAddress = Functions.getPointeeType;
        nclang_getPointeeType(T, __functionAddress, __result);
    }

    /** For pointer types, returns the type of the pointee. */
    public static CXType clang_getPointeeType(CXType T, CXType __result) {
        nclang_getPointeeType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypeDeclaration ] ---

    /** Unsafe version of: {@link #clang_getTypeDeclaration getTypeDeclaration} */
    public static native void nclang_getTypeDeclaration(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTypeDeclaration getTypeDeclaration} */
    public static void nclang_getTypeDeclaration(long T, long __result) {
        long __functionAddress = Functions.getTypeDeclaration;
        nclang_getTypeDeclaration(T, __functionAddress, __result);
    }

    /** Return the cursor for the declaration of the given type. */
    public static CXCursor clang_getTypeDeclaration(CXType T, CXCursor __result) {
        nclang_getTypeDeclaration(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getDeclObjCTypeEncoding ] ---

    /** Unsafe version of: {@link #clang_getDeclObjCTypeEncoding getDeclObjCTypeEncoding} */
    public static native void nclang_getDeclObjCTypeEncoding(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getDeclObjCTypeEncoding getDeclObjCTypeEncoding} */
    public static void nclang_getDeclObjCTypeEncoding(long C, long __result) {
        long __functionAddress = Functions.getDeclObjCTypeEncoding;
        nclang_getDeclObjCTypeEncoding(C, __functionAddress, __result);
    }

    /** Returns the Objective-C type encoding for the specified declaration. */
    public static CXString clang_getDeclObjCTypeEncoding(CXCursor C, CXString __result) {
        nclang_getDeclObjCTypeEncoding(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_getObjCEncoding ] ---

    /** Unsafe version of: {@link #clang_Type_getObjCEncoding Type_getObjCEncoding} */
    public static native void nclang_Type_getObjCEncoding(long type, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getObjCEncoding Type_getObjCEncoding} */
    public static void nclang_Type_getObjCEncoding(long type, long __result) {
        long __functionAddress = Functions.Type_getObjCEncoding;
        nclang_Type_getObjCEncoding(type, __functionAddress, __result);
    }

    /** Returns the Objective-C type encoding for the specified {@code CXType}. */
    public static CXString clang_Type_getObjCEncoding(CXType type, CXString __result) {
        nclang_Type_getObjCEncoding(type.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTypeKindSpelling ] ---

    /** Unsafe version of: {@link #clang_getTypeKindSpelling getTypeKindSpelling} */
    public static native void nclang_getTypeKindSpelling(int K, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTypeKindSpelling getTypeKindSpelling} */
    public static void nclang_getTypeKindSpelling(int K, long __result) {
        long __functionAddress = Functions.getTypeKindSpelling;
        nclang_getTypeKindSpelling(K, __functionAddress, __result);
    }

    /** Retrieve the spelling of a given {@code CXTypeKind}. */
    public static CXString clang_getTypeKindSpelling(@NativeType("enum CXTypeKind") int K, CXString __result) {
        nclang_getTypeKindSpelling(K, __result.address());
        return __result;
    }

    // --- [ clang_getFunctionTypeCallingConv ] ---

    /** Unsafe version of: {@link #clang_getFunctionTypeCallingConv getFunctionTypeCallingConv} */
    public static int nclang_getFunctionTypeCallingConv(long T) {
        long __functionAddress = Functions.getFunctionTypeCallingConv;
        return invokePI(T, __functionAddress);
    }

    /**
     * Retrieve the calling convention associated with a function type.
     * 
     * <p>If a non-function type is passed in, {@link #CXCallingConv_Invalid CallingConv_Invalid} is returned.</p>
     */
    @NativeType("enum CXCallingConv")
    public static int clang_getFunctionTypeCallingConv(CXType T) {
        return nclang_getFunctionTypeCallingConv(T.address());
    }

    // --- [ clang_getResultType ] ---

    /** Unsafe version of: {@link #clang_getResultType getResultType} */
    public static native void nclang_getResultType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getResultType getResultType} */
    public static void nclang_getResultType(long T, long __result) {
        long __functionAddress = Functions.getResultType;
        nclang_getResultType(T, __functionAddress, __result);
    }

    /**
     * Retrieve the return type associated with a function type.
     * 
     * <p>If a non-function type is passed in, an invalid type is returned.</p>
     */
    public static CXType clang_getResultType(CXType T, CXType __result) {
        nclang_getResultType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getExceptionSpecificationType ] ---

    /** Unsafe version of: {@link #clang_getExceptionSpecificationType getExceptionSpecificationType} */
    public static int nclang_getExceptionSpecificationType(long T) {
        long __functionAddress = Functions.getExceptionSpecificationType;
        return invokePI(T, __functionAddress);
    }

    /**
     * Retrieve the exception specification type associated with a function type. This is a value of type {@code CXCursor_ExceptionSpecificationKind}.
     * 
     * <p>If a non-function type is passed in, an error code of -1 is returned.</p>
     */
    public static int clang_getExceptionSpecificationType(CXType T) {
        return nclang_getExceptionSpecificationType(T.address());
    }

    // --- [ clang_getNumArgTypes ] ---

    /** Unsafe version of: {@link #clang_getNumArgTypes getNumArgTypes} */
    public static int nclang_getNumArgTypes(long T) {
        long __functionAddress = Functions.getNumArgTypes;
        return invokePI(T, __functionAddress);
    }

    /**
     * Retrieve the number of non-variadic parameters associated with a function type.
     * 
     * <p>If a non-function type is passed in, -1 is returned.</p>
     */
    public static int clang_getNumArgTypes(CXType T) {
        return nclang_getNumArgTypes(T.address());
    }

    // --- [ clang_getArgType ] ---

    /** Unsafe version of: {@link #clang_getArgType getArgType} */
    public static native void nclang_getArgType(long T, int i, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getArgType getArgType} */
    public static void nclang_getArgType(long T, int i, long __result) {
        long __functionAddress = Functions.getArgType;
        nclang_getArgType(T, i, __functionAddress, __result);
    }

    /**
     * Retrieve the type of a parameter of a function type.
     * 
     * <p>If a non-function type is passed in or the function does not have enough parameters, an invalid type is returned.</p>
     */
    public static CXType clang_getArgType(CXType T, @NativeType("unsigned") int i, CXType __result) {
        nclang_getArgType(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Type_getObjCObjectBaseType ] ---

    /** Unsafe version of: {@link #clang_Type_getObjCObjectBaseType Type_getObjCObjectBaseType} */
    public static native void nclang_Type_getObjCObjectBaseType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getObjCObjectBaseType Type_getObjCObjectBaseType} */
    public static void nclang_Type_getObjCObjectBaseType(long T, long __result) {
        long __functionAddress = Functions.Type_getObjCObjectBaseType;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getObjCObjectBaseType(T, __functionAddress, __result);
    }

    /**
     * Retrieves the base type of the {@code ObjCObjectType}.
     * 
     * <p>If the type is not an ObjC object, an invalid type is returned.</p>
     */
    public static CXType clang_Type_getObjCObjectBaseType(CXType T, CXType __result) {
        nclang_Type_getObjCObjectBaseType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_getNumObjCProtocolRefs ] ---

    /** Unsafe version of: {@link #clang_Type_getNumObjCProtocolRefs Type_getNumObjCProtocolRefs} */
    public static int nclang_Type_getNumObjCProtocolRefs(long T) {
        long __functionAddress = Functions.Type_getNumObjCProtocolRefs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(T, __functionAddress);
    }

    /**
     * Retrieve the number of protocol references associated with an ObjC object/id.
     * 
     * <p>If the type is not an ObjC object, 0 is returned.</p>
     */
    @NativeType("unsigned")
    public static int clang_Type_getNumObjCProtocolRefs(CXType T) {
        return nclang_Type_getNumObjCProtocolRefs(T.address());
    }

    // --- [ clang_Type_getObjCProtocolDecl ] ---

    /** Unsafe version of: {@link #clang_Type_getObjCProtocolDecl Type_getObjCProtocolDecl} */
    public static native void nclang_Type_getObjCProtocolDecl(long T, int i, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getObjCProtocolDecl Type_getObjCProtocolDecl} */
    public static void nclang_Type_getObjCProtocolDecl(long T, int i, long __result) {
        long __functionAddress = Functions.Type_getObjCProtocolDecl;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getObjCProtocolDecl(T, i, __functionAddress, __result);
    }

    /**
     * Retrieve the decl for a protocol reference for an ObjC object/id.
     * 
     * <p>If the type is not an ObjC object or there are not enough protocol references, an invalid cursor is returned.</p>
     */
    public static CXCursor clang_Type_getObjCProtocolDecl(CXType T, @NativeType("unsigned") int i, CXCursor __result) {
        nclang_Type_getObjCProtocolDecl(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Type_getNumObjCTypeArgs ] ---

    /** Unsafe version of: {@link #clang_Type_getNumObjCTypeArgs Type_getNumObjCTypeArgs} */
    public static int nclang_Type_getNumObjCTypeArgs(long T) {
        long __functionAddress = Functions.Type_getNumObjCTypeArgs;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(T, __functionAddress);
    }

    /**
     * Retreive the number of type arguments associated with an ObjC object.
     * 
     * <p>If the type is not an ObjC object, 0 is returned.</p>
     */
    @NativeType("unsigned")
    public static int clang_Type_getNumObjCTypeArgs(CXType T) {
        return nclang_Type_getNumObjCTypeArgs(T.address());
    }

    // --- [ clang_Type_getObjCTypeArg ] ---

    /** Unsafe version of: {@link #clang_Type_getObjCTypeArg Type_getObjCTypeArg} */
    public static native void nclang_Type_getObjCTypeArg(long T, int i, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getObjCTypeArg Type_getObjCTypeArg} */
    public static void nclang_Type_getObjCTypeArg(long T, int i, long __result) {
        long __functionAddress = Functions.Type_getObjCTypeArg;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getObjCTypeArg(T, i, __functionAddress, __result);
    }

    /**
     * Retrieve a type argument associated with an ObjC object.
     * 
     * <p>If the type is not an ObjC or the index is not valid, an invalid type is returned.</p>
     */
    public static CXType clang_Type_getObjCTypeArg(CXType T, @NativeType("unsigned") int i, CXType __result) {
        nclang_Type_getObjCTypeArg(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_isFunctionTypeVariadic ] ---

    /** Unsafe version of: {@link #clang_isFunctionTypeVariadic isFunctionTypeVariadic} */
    public static int nclang_isFunctionTypeVariadic(long T) {
        long __functionAddress = Functions.isFunctionTypeVariadic;
        return invokePI(T, __functionAddress);
    }

    /** Return 1 if the {@code CXType} is a variadic function type, and 0 otherwise. */
    @NativeType("unsigned")
    public static boolean clang_isFunctionTypeVariadic(CXType T) {
        return nclang_isFunctionTypeVariadic(T.address()) != 0;
    }

    // --- [ clang_getCursorResultType ] ---

    /** Unsafe version of: {@link #clang_getCursorResultType getCursorResultType} */
    public static native void nclang_getCursorResultType(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorResultType getCursorResultType} */
    public static void nclang_getCursorResultType(long C, long __result) {
        long __functionAddress = Functions.getCursorResultType;
        nclang_getCursorResultType(C, __functionAddress, __result);
    }

    /**
     * Retrieve the return type associated with a given cursor.
     * 
     * <p>This only returns a valid type if the cursor refers to a function or method.</p>
     */
    public static CXType clang_getCursorResultType(CXCursor C, CXType __result) {
        nclang_getCursorResultType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorExceptionSpecificationType ] ---

    /** Unsafe version of: {@link #clang_getCursorExceptionSpecificationType getCursorExceptionSpecificationType} */
    public static int nclang_getCursorExceptionSpecificationType(long C) {
        long __functionAddress = Functions.getCursorExceptionSpecificationType;
        return invokePI(C, __functionAddress);
    }

    /**
     * Retrieve the exception specification type associated with a given cursor. This is a value of type {@code CXCursor_ExceptionSpecificationKind}.
     * 
     * <p>This only returns a valid result if the cursor refers to a function or method.</p>
     */
    public static int clang_getCursorExceptionSpecificationType(CXCursor C) {
        return nclang_getCursorExceptionSpecificationType(C.address());
    }

    // --- [ clang_isPODType ] ---

    /** Unsafe version of: {@link #clang_isPODType isPODType} */
    public static int nclang_isPODType(long T) {
        long __functionAddress = Functions.isPODType;
        return invokePI(T, __functionAddress);
    }

    /** Return 1 if the {@code CXType} is a POD (plain old data) type, and 0 otherwise. */
    @NativeType("unsigned")
    public static boolean clang_isPODType(CXType T) {
        return nclang_isPODType(T.address()) != 0;
    }

    // --- [ clang_getElementType ] ---

    /** Unsafe version of: {@link #clang_getElementType getElementType} */
    public static native void nclang_getElementType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getElementType getElementType} */
    public static void nclang_getElementType(long T, long __result) {
        long __functionAddress = Functions.getElementType;
        nclang_getElementType(T, __functionAddress, __result);
    }

    /**
     * Return the element type of an array, complex, or vector type.
     * 
     * <p>If a type is passed in that is not an array, complex, or vector type, an invalid type is returned.</p>
     */
    public static CXType clang_getElementType(CXType T, CXType __result) {
        nclang_getElementType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getNumElements ] ---

    /** Unsafe version of: {@link #clang_getNumElements getNumElements} */
    public static long nclang_getNumElements(long T) {
        long __functionAddress = Functions.getNumElements;
        return invokePJ(T, __functionAddress);
    }

    /**
     * Return the number of elements of an array or vector type.
     * 
     * <p>If a type is passed in that is not an array or vector type, -1 is returned.</p>
     */
    @NativeType("long long")
    public static long clang_getNumElements(CXType T) {
        return nclang_getNumElements(T.address());
    }

    // --- [ clang_getArrayElementType ] ---

    /** Unsafe version of: {@link #clang_getArrayElementType getArrayElementType} */
    public static native void nclang_getArrayElementType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getArrayElementType getArrayElementType} */
    public static void nclang_getArrayElementType(long T, long __result) {
        long __functionAddress = Functions.getArrayElementType;
        nclang_getArrayElementType(T, __functionAddress, __result);
    }

    /**
     * Return the element type of an array type.
     * 
     * <p>If a non-array type is passed in, an invalid type is returned.</p>
     */
    public static CXType clang_getArrayElementType(CXType T, CXType __result) {
        nclang_getArrayElementType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_getArraySize ] ---

    /** Unsafe version of: {@link #clang_getArraySize getArraySize} */
    public static long nclang_getArraySize(long T) {
        long __functionAddress = Functions.getArraySize;
        return invokePJ(T, __functionAddress);
    }

    /**
     * Return the array size of a constant array.
     * 
     * <p>If a non-array type is passed in, -1 is returned.</p>
     */
    @NativeType("long long")
    public static long clang_getArraySize(CXType T) {
        return nclang_getArraySize(T.address());
    }

    // --- [ clang_Type_getNamedType ] ---

    /** Unsafe version of: {@link #clang_Type_getNamedType Type_getNamedType} */
    public static native void nclang_Type_getNamedType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getNamedType Type_getNamedType} */
    public static void nclang_Type_getNamedType(long T, long __result) {
        long __functionAddress = Functions.Type_getNamedType;
        nclang_Type_getNamedType(T, __functionAddress, __result);
    }

    /**
     * Retrieve the type named by the qualified-id.
     * 
     * <p>If a non-elaborated type is passed in, an invalid type is returned.</p>
     */
    public static CXType clang_Type_getNamedType(CXType T, CXType __result) {
        nclang_Type_getNamedType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_isTransparentTagTypedef ] ---

    /** Unsafe version of: {@link #clang_Type_isTransparentTagTypedef Type_isTransparentTagTypedef} */
    public static int nclang_Type_isTransparentTagTypedef(long T) {
        long __functionAddress = Functions.Type_isTransparentTagTypedef;
        return invokePI(T, __functionAddress);
    }

    /**
     * Determine if a typedef is 'transparent' tag.
     * 
     * <p>A typedef is considered 'transparent' if it shares a name and spelling location with its underlying tag type, as is the case with the {@code NS_ENUM}
     * macro.</p>
     *
     * @return non-zero if transparent and zero otherwise
     */
    @NativeType("unsigned")
    public static boolean clang_Type_isTransparentTagTypedef(CXType T) {
        return nclang_Type_isTransparentTagTypedef(T.address()) != 0;
    }

    // --- [ clang_Type_getNullability ] ---

    /** Unsafe version of: {@link #clang_Type_getNullability Type_getNullability} */
    public static int nclang_Type_getNullability(long T) {
        long __functionAddress = Functions.Type_getNullability;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(T, __functionAddress);
    }

    /** Retrieve the nullability kind of a pointer type. */
    @NativeType("enum CXTypeNullabilityKind")
    public static int clang_Type_getNullability(CXType T) {
        return nclang_Type_getNullability(T.address());
    }

    // --- [ clang_Type_getAlignOf ] ---

    /** Unsafe version of: {@link #clang_Type_getAlignOf Type_getAlignOf} */
    public static long nclang_Type_getAlignOf(long T) {
        long __functionAddress = Functions.Type_getAlignOf;
        return invokePJ(T, __functionAddress);
    }

    /**
     * Return the alignment of a type in bytes as per {@code C++[expr.alignof]} standard.
     * 
     * <p>If the type declaration is invalid, {@link #CXTypeLayoutError_Invalid TypeLayoutError_Invalid} is returned. If the type declaration is an incomplete type, {@link #CXTypeLayoutError_Incomplete TypeLayoutError_Incomplete} is
     * returned. If the type declaration is a dependent type, {@link #CXTypeLayoutError_Dependent TypeLayoutError_Dependent} is returned. If the type declaration is not a constant size type,
     * {@link #CXTypeLayoutError_NotConstantSize TypeLayoutError_NotConstantSize} is returned.</p>
     */
    @NativeType("long long")
    public static long clang_Type_getAlignOf(CXType T) {
        return nclang_Type_getAlignOf(T.address());
    }

    // --- [ clang_Type_getClassType ] ---

    /** Unsafe version of: {@link #clang_Type_getClassType Type_getClassType} */
    public static native void nclang_Type_getClassType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getClassType Type_getClassType} */
    public static void nclang_Type_getClassType(long T, long __result) {
        long __functionAddress = Functions.Type_getClassType;
        nclang_Type_getClassType(T, __functionAddress, __result);
    }

    /**
     * Return the class type of an member pointer type.
     * 
     * <p>If a non-member-pointer type is passed in, an invalid type is returned.</p>
     */
    public static CXType clang_Type_getClassType(CXType T, CXType __result) {
        nclang_Type_getClassType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_getSizeOf ] ---

    /** Unsafe version of: {@link #clang_Type_getSizeOf Type_getSizeOf} */
    public static long nclang_Type_getSizeOf(long T) {
        long __functionAddress = Functions.Type_getSizeOf;
        return invokePJ(T, __functionAddress);
    }

    /**
     * Return the size of a type in bytes as per {@code C++[expr.sizeof]} standard.
     * 
     * <p>If the type declaration is invalid, {@link #CXTypeLayoutError_Invalid TypeLayoutError_Invalid} is returned. If the type declaration is an incomplete type, {@link #CXTypeLayoutError_Incomplete TypeLayoutError_Incomplete} is
     * returned. If the type declaration is a dependent type, {@link #CXTypeLayoutError_Dependent TypeLayoutError_Dependent} is returned.</p>
     */
    @NativeType("long long")
    public static long clang_Type_getSizeOf(CXType T) {
        return nclang_Type_getSizeOf(T.address());
    }

    // --- [ clang_Type_getOffsetOf ] ---

    /** Unsafe version of: {@link #clang_Type_getOffsetOf Type_getOffsetOf} */
    public static long nclang_Type_getOffsetOf(long T, long S) {
        long __functionAddress = Functions.Type_getOffsetOf;
        return invokePPJ(T, S, __functionAddress);
    }

    /**
     * Return the offset of a field named {@code S} in a record of type {@code T} in bits as it would be returned by {@code __offsetof__} as per
     * {@code C++11[18.2p4]}
     * 
     * <p>If the cursor is not a record field declaration, {@link #CXTypeLayoutError_Invalid TypeLayoutError_Invalid} is returned. If the field's type declaration is an incomplete type,
     * {@link #CXTypeLayoutError_Incomplete TypeLayoutError_Incomplete} is returned. If the field's type declaration is a dependent type, {@link #CXTypeLayoutError_Dependent TypeLayoutError_Dependent} is returned. If the field's
     * name {@code S} is not found, {@link #CXTypeLayoutError_InvalidFieldName TypeLayoutError_InvalidFieldName} is returned.</p>
     */
    @NativeType("long long")
    public static long clang_Type_getOffsetOf(CXType T, @NativeType("char const *") ByteBuffer S) {
        if (CHECKS) {
            checkNT1(S);
        }
        return nclang_Type_getOffsetOf(T.address(), memAddress(S));
    }

    /**
     * Return the offset of a field named {@code S} in a record of type {@code T} in bits as it would be returned by {@code __offsetof__} as per
     * {@code C++11[18.2p4]}
     * 
     * <p>If the cursor is not a record field declaration, {@link #CXTypeLayoutError_Invalid TypeLayoutError_Invalid} is returned. If the field's type declaration is an incomplete type,
     * {@link #CXTypeLayoutError_Incomplete TypeLayoutError_Incomplete} is returned. If the field's type declaration is a dependent type, {@link #CXTypeLayoutError_Dependent TypeLayoutError_Dependent} is returned. If the field's
     * name {@code S} is not found, {@link #CXTypeLayoutError_InvalidFieldName TypeLayoutError_InvalidFieldName} is returned.</p>
     */
    @NativeType("long long")
    public static long clang_Type_getOffsetOf(CXType T, @NativeType("char const *") CharSequence S) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(S, true);
            long SEncoded = stack.getPointerAddress();
            return nclang_Type_getOffsetOf(T.address(), SEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_Type_getModifiedType ] ---

    /** Unsafe version of: {@link #clang_Type_getModifiedType Type_getModifiedType} */
    public static native void nclang_Type_getModifiedType(long T, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getModifiedType Type_getModifiedType} */
    public static void nclang_Type_getModifiedType(long T, long __result) {
        long __functionAddress = Functions.Type_getModifiedType;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Type_getModifiedType(T, __functionAddress, __result);
    }

    /**
     * Return the type that was modified by this attributed type.
     * 
     * <p>If the type is not an attributed type, an invalid type is returned.</p>
     */
    public static CXType clang_Type_getModifiedType(CXType T, CXType __result) {
        nclang_Type_getModifiedType(T.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getOffsetOfField ] ---

    /** Unsafe version of: {@link #clang_Cursor_getOffsetOfField Cursor_getOffsetOfField} */
    public static long nclang_Cursor_getOffsetOfField(long C) {
        long __functionAddress = Functions.Cursor_getOffsetOfField;
        return invokePJ(C, __functionAddress);
    }

    /**
     * Return the offset of the field represented by the Cursor.
     * 
     * <p>If the cursor is not a field declaration, -1 is returned. If the cursor semantic parent is not a record field declaration, {@link #CXTypeLayoutError_Invalid TypeLayoutError_Invalid} is
     * returned. If the field's type declaration is an incomplete type, {@link #CXTypeLayoutError_Incomplete TypeLayoutError_Incomplete} is returned. If the field's type declaration is a
     * dependent type, {@link #CXTypeLayoutError_Dependent TypeLayoutError_Dependent} is returned. If the field's name S is not found, {@link #CXTypeLayoutError_InvalidFieldName TypeLayoutError_InvalidFieldName} is returned.</p>
     */
    @NativeType("long long")
    public static long clang_Cursor_getOffsetOfField(CXCursor C) {
        return nclang_Cursor_getOffsetOfField(C.address());
    }

    // --- [ clang_Cursor_isAnonymous ] ---

    /** Unsafe version of: {@link #clang_Cursor_isAnonymous Cursor_isAnonymous} */
    public static int nclang_Cursor_isAnonymous(long C) {
        long __functionAddress = Functions.Cursor_isAnonymous;
        return invokePI(C, __functionAddress);
    }

    /** Determine whether the given cursor represents an anonymous record declaration. */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isAnonymous(CXCursor C) {
        return nclang_Cursor_isAnonymous(C.address()) != 0;
    }

    // --- [ clang_Type_getNumTemplateArguments ] ---

    /** Unsafe version of: {@link #clang_Type_getNumTemplateArguments Type_getNumTemplateArguments} */
    public static int nclang_Type_getNumTemplateArguments(long T) {
        long __functionAddress = Functions.Type_getNumTemplateArguments;
        return invokePI(T, __functionAddress);
    }

    /** Returns the number of template arguments for given template specialization, or -1 if type {@code T} is not a template specialization. */
    public static int clang_Type_getNumTemplateArguments(CXType T) {
        return nclang_Type_getNumTemplateArguments(T.address());
    }

    // --- [ clang_Type_getTemplateArgumentAsType ] ---

    /** Unsafe version of: {@link #clang_Type_getTemplateArgumentAsType Type_getTemplateArgumentAsType} */
    public static native void nclang_Type_getTemplateArgumentAsType(long T, int i, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Type_getTemplateArgumentAsType Type_getTemplateArgumentAsType} */
    public static void nclang_Type_getTemplateArgumentAsType(long T, int i, long __result) {
        long __functionAddress = Functions.Type_getTemplateArgumentAsType;
        nclang_Type_getTemplateArgumentAsType(T, i, __functionAddress, __result);
    }

    /**
     * Returns the type template argument of a template class specialization at given index.
     * 
     * <p>This function only returns template type arguments and does not handle template template arguments or variadic packs.</p>
     */
    public static CXType clang_Type_getTemplateArgumentAsType(CXType T, @NativeType("unsigned") int i, CXType __result) {
        nclang_Type_getTemplateArgumentAsType(T.address(), i, __result.address());
        return __result;
    }

    // --- [ clang_Type_getCXXRefQualifier ] ---

    /** Unsafe version of: {@link #clang_Type_getCXXRefQualifier Type_getCXXRefQualifier} */
    public static int nclang_Type_getCXXRefQualifier(long T) {
        long __functionAddress = Functions.Type_getCXXRefQualifier;
        return invokePI(T, __functionAddress);
    }

    /**
     * Retrieve the ref-qualifier kind of a function or method.
     * 
     * <p>The ref-qualifier is returned for C++ functions or methods. For other types or non-C++ declarations, {@link #CXRefQualifier_None RefQualifier_None} is returned.</p>
     */
    @NativeType("enum CXRefQualifierKind")
    public static int clang_Type_getCXXRefQualifier(CXType T) {
        return nclang_Type_getCXXRefQualifier(T.address());
    }

    // --- [ clang_Cursor_isBitField ] ---

    /** Unsafe version of: {@link #clang_Cursor_isBitField Cursor_isBitField} */
    public static int nclang_Cursor_isBitField(long C) {
        long __functionAddress = Functions.Cursor_isBitField;
        return invokePI(C, __functionAddress);
    }

    /** Returns non-zero if the cursor specifies a Record member that is a bitfield. */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isBitField(CXCursor C) {
        return nclang_Cursor_isBitField(C.address()) != 0;
    }

    // --- [ clang_isVirtualBase ] ---

    /** Unsafe version of: {@link #clang_isVirtualBase isVirtualBase} */
    public static int nclang_isVirtualBase(long cursor) {
        long __functionAddress = Functions.isVirtualBase;
        return invokePI(cursor, __functionAddress);
    }

    /** Returns 1 if the base class specified by the cursor with kind {@link #CXCursor_CXXBaseSpecifier Cursor_CXXBaseSpecifier} is virtual. */
    @NativeType("unsigned")
    public static boolean clang_isVirtualBase(CXCursor cursor) {
        return nclang_isVirtualBase(cursor.address()) != 0;
    }

    // --- [ clang_getCXXAccessSpecifier ] ---

    /** Unsafe version of: {@link #clang_getCXXAccessSpecifier getCXXAccessSpecifier} */
    public static int nclang_getCXXAccessSpecifier(long cursor) {
        long __functionAddress = Functions.getCXXAccessSpecifier;
        return invokePI(cursor, __functionAddress);
    }

    /**
     * Returns the access control level for the referenced object.
     * 
     * <p>If the cursor refers to a C++ declaration, its access control level within its parent scope is returned. Otherwise, if the cursor refers to a base
     * specifier or access specifier, the specifier itself is returned.</p>
     */
    @NativeType("enum CX_CXXAccessSpecifier")
    public static int clang_getCXXAccessSpecifier(CXCursor cursor) {
        return nclang_getCXXAccessSpecifier(cursor.address());
    }

    // --- [ clang_Cursor_getStorageClass ] ---

    /** Unsafe version of: {@link #clang_Cursor_getStorageClass Cursor_getStorageClass} */
    public static int nclang_Cursor_getStorageClass(long cursor) {
        long __functionAddress = Functions.Cursor_getStorageClass;
        return invokePI(cursor, __functionAddress);
    }

    /**
     * Returns the storage class for a function or variable declaration.
     * 
     * <p>If the passed in Cursor is not a function or variable declaration, {@link #CX_SC_Invalid _SC_Invalid} is returned else the storage class.</p>
     */
    @NativeType("enum CX_StorageClass")
    public static int clang_Cursor_getStorageClass(CXCursor cursor) {
        return nclang_Cursor_getStorageClass(cursor.address());
    }

    // --- [ clang_getNumOverloadedDecls ] ---

    /** Unsafe version of: {@link #clang_getNumOverloadedDecls getNumOverloadedDecls} */
    public static int nclang_getNumOverloadedDecls(long cursor) {
        long __functionAddress = Functions.getNumOverloadedDecls;
        return invokePI(cursor, __functionAddress);
    }

    /**
     * Determine the number of overloaded declarations referenced by a {@link #CXCursor_OverloadedDeclRef Cursor_OverloadedDeclRef} cursor.
     *
     * @param cursor the cursor whose overloaded declarations are being queried
     *
     * @return the number of overloaded declarations referenced by {@code cursor}. If it is not a {@code CXCursor_OverloadedDeclRef} cursor, returns 0.
     */
    @NativeType("unsigned")
    public static int clang_getNumOverloadedDecls(CXCursor cursor) {
        return nclang_getNumOverloadedDecls(cursor.address());
    }

    // --- [ clang_getOverloadedDecl ] ---

    /** Unsafe version of: {@link #clang_getOverloadedDecl getOverloadedDecl} */
    public static native void nclang_getOverloadedDecl(long cursor, int index, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getOverloadedDecl getOverloadedDecl} */
    public static void nclang_getOverloadedDecl(long cursor, int index, long __result) {
        long __functionAddress = Functions.getOverloadedDecl;
        nclang_getOverloadedDecl(cursor, index, __functionAddress, __result);
    }

    /**
     * Retrieve a cursor for one of the overloaded declarations referenced by a {@link #CXCursor_OverloadedDeclRef Cursor_OverloadedDeclRef} cursor.
     *
     * @param cursor   the cursor whose overloaded declarations are being queried
     * @param index    the zero-based index into the set of overloaded declarations in the cursor
     * @param __result a cursor representing the declaration referenced by the given {@code cursor} at the specified {@code index}. If the cursor does not have an associated
     *                 set of overloaded declarations, or if the index is out of bounds, returns {@link #clang_getNullCursor getNullCursor};
     */
    public static CXCursor clang_getOverloadedDecl(CXCursor cursor, @NativeType("unsigned") int index, CXCursor __result) {
        nclang_getOverloadedDecl(cursor.address(), index, __result.address());
        return __result;
    }

    // --- [ clang_getIBOutletCollectionType ] ---

    /** Unsafe version of: {@link #clang_getIBOutletCollectionType getIBOutletCollectionType} */
    public static native void nclang_getIBOutletCollectionType(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getIBOutletCollectionType getIBOutletCollectionType} */
    public static void nclang_getIBOutletCollectionType(long cursor, long __result) {
        long __functionAddress = Functions.getIBOutletCollectionType;
        nclang_getIBOutletCollectionType(cursor, __functionAddress, __result);
    }

    /** For cursors representing an {@code iboutletcollection} attribute, this function returns the collection element type. */
    public static CXType clang_getIBOutletCollectionType(CXCursor cursor, CXType __result) {
        nclang_getIBOutletCollectionType(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_visitChildren ] ---

    /** Unsafe version of: {@link #clang_visitChildren visitChildren} */
    public static int nclang_visitChildren(long parent, long visitor, long client_data) {
        long __functionAddress = Functions.visitChildren;
        if (CHECKS) {
            check(client_data);
        }
        return invokePPPI(parent, visitor, client_data, __functionAddress);
    }

    /**
     * Visit the children of a particular cursor.
     * 
     * <p>This function visits all the direct children of the given cursor, invoking the given {@code visitor} function with the cursors of each visited child.
     * The traversal may be recursive, if the visitor returns {@link #CXChildVisit_Recurse ChildVisit_Recurse}. The traversal may also be ended prematurely, if the visitor returns
     * {@link #CXChildVisit_Break ChildVisit_Break}.</p>
     *
     * @param parent  the cursor whose child may be visited. All kinds of cursors can be visited, including invalid cursors (which, by definition, have no children).
     * @param visitor the visitor function that will be invoked for each child of {@code parent}
     *
     * @return a non-zero value if the traversal was terminated prematurely by the visitor returning {@link #CXChildVisit_Break ChildVisit_Break}
     */
    @NativeType("unsigned")
    public static boolean clang_visitChildren(CXCursor parent, @NativeType("enum CXChildVisitResult (*) (CXCursor, CXCursor, CXClientData)") CXCursorVisitorI visitor) {
        return nclang_visitChildren(parent.address(), CXCursorVisitor.DELEGATE, visitor.address()) != 0;
    }

    // --- [ clang_getCursorUSR ] ---

    /** Unsafe version of: {@link #clang_getCursorUSR getCursorUSR} */
    public static native void nclang_getCursorUSR(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorUSR getCursorUSR} */
    public static void nclang_getCursorUSR(long cursor, long __result) {
        long __functionAddress = Functions.getCursorUSR;
        nclang_getCursorUSR(cursor, __functionAddress, __result);
    }

    /**
     * Retrieve a Unified Symbol Resolution (USR) for the entity referenced by the given cursor.
     * 
     * <p>A Unified Symbol Resolution (USR) is a string that identifies a particular entity (function, class, variable, etc.) within a program. USRs can be
     * compared across translation units to determine, e.g., when references in one translation refer to an entity defined in another translation unit.</p>
     */
    public static CXString clang_getCursorUSR(CXCursor cursor, CXString __result) {
        nclang_getCursorUSR(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_constructUSR_ObjCClass ] ---

    /** Unsafe version of: {@link #clang_constructUSR_ObjCClass constructUSR_ObjCClass} */
    public static native void nclang_constructUSR_ObjCClass(long class_name, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_constructUSR_ObjCClass constructUSR_ObjCClass} */
    public static void nclang_constructUSR_ObjCClass(long class_name, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCClass;
        nclang_constructUSR_ObjCClass(class_name, __functionAddress, __result);
    }

    /** Construct a USR for a specified Objective-C class. */
    public static CXString clang_constructUSR_ObjCClass(@NativeType("char const *") ByteBuffer class_name, CXString __result) {
        if (CHECKS) {
            checkNT1(class_name);
        }
        nclang_constructUSR_ObjCClass(memAddress(class_name), __result.address());
        return __result;
    }

    /** Construct a USR for a specified Objective-C class. */
    public static CXString clang_constructUSR_ObjCClass(@NativeType("char const *") CharSequence class_name, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(class_name, true);
            long class_nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCClass(class_nameEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCCategory ] ---

    /** Unsafe version of: {@link #clang_constructUSR_ObjCCategory constructUSR_ObjCCategory} */
    public static native void nclang_constructUSR_ObjCCategory(long class_name, long category_name, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_constructUSR_ObjCCategory constructUSR_ObjCCategory} */
    public static void nclang_constructUSR_ObjCCategory(long class_name, long category_name, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCCategory;
        nclang_constructUSR_ObjCCategory(class_name, category_name, __functionAddress, __result);
    }

    /** Construct a USR for a specified Objective-C category. */
    public static CXString clang_constructUSR_ObjCCategory(@NativeType("char const *") ByteBuffer class_name, @NativeType("char const *") ByteBuffer category_name, CXString __result) {
        if (CHECKS) {
            checkNT1(class_name);
            checkNT1(category_name);
        }
        nclang_constructUSR_ObjCCategory(memAddress(class_name), memAddress(category_name), __result.address());
        return __result;
    }

    /** Construct a USR for a specified Objective-C category. */
    public static CXString clang_constructUSR_ObjCCategory(@NativeType("char const *") CharSequence class_name, @NativeType("char const *") CharSequence category_name, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(class_name, true);
            long class_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(category_name, true);
            long category_nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCCategory(class_nameEncoded, category_nameEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCProtocol ] ---

    /** Unsafe version of: {@link #clang_constructUSR_ObjCProtocol constructUSR_ObjCProtocol} */
    public static native void nclang_constructUSR_ObjCProtocol(long protocol_name, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_constructUSR_ObjCProtocol constructUSR_ObjCProtocol} */
    public static void nclang_constructUSR_ObjCProtocol(long protocol_name, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCProtocol;
        nclang_constructUSR_ObjCProtocol(protocol_name, __functionAddress, __result);
    }

    /** Construct a USR for a specified Objective-C protocol. */
    public static CXString clang_constructUSR_ObjCProtocol(@NativeType("char const *") ByteBuffer protocol_name, CXString __result) {
        if (CHECKS) {
            checkNT1(protocol_name);
        }
        nclang_constructUSR_ObjCProtocol(memAddress(protocol_name), __result.address());
        return __result;
    }

    /** Construct a USR for a specified Objective-C protocol. */
    public static CXString clang_constructUSR_ObjCProtocol(@NativeType("char const *") CharSequence protocol_name, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(protocol_name, true);
            long protocol_nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCProtocol(protocol_nameEncoded, __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCIvar ] ---

    /** Unsafe version of: {@link #clang_constructUSR_ObjCIvar constructUSR_ObjCIvar} */
    public static native void nclang_constructUSR_ObjCIvar(long name, long classUSR, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_constructUSR_ObjCIvar constructUSR_ObjCIvar} */
    public static void nclang_constructUSR_ObjCIvar(long name, long classUSR, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCIvar;
        nclang_constructUSR_ObjCIvar(name, classUSR, __functionAddress, __result);
    }

    /** Construct a USR for a specified Objective-C instance variable and the USR for its containing class. */
    public static CXString clang_constructUSR_ObjCIvar(@NativeType("char const *") ByteBuffer name, CXString classUSR, CXString __result) {
        if (CHECKS) {
            checkNT1(name);
        }
        nclang_constructUSR_ObjCIvar(memAddress(name), classUSR.address(), __result.address());
        return __result;
    }

    /** Construct a USR for a specified Objective-C instance variable and the USR for its containing class. */
    public static CXString clang_constructUSR_ObjCIvar(@NativeType("char const *") CharSequence name, CXString classUSR, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCIvar(nameEncoded, classUSR.address(), __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCMethod ] ---

    /** Unsafe version of: {@link #clang_constructUSR_ObjCMethod constructUSR_ObjCMethod} */
    public static native void nclang_constructUSR_ObjCMethod(long name, int isInstanceMethod, long classUSR, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_constructUSR_ObjCMethod constructUSR_ObjCMethod} */
    public static void nclang_constructUSR_ObjCMethod(long name, int isInstanceMethod, long classUSR, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCMethod;
        nclang_constructUSR_ObjCMethod(name, isInstanceMethod, classUSR, __functionAddress, __result);
    }

    /** Construct a USR for a specified Objective-C method and the USR for its containing class. */
    public static CXString clang_constructUSR_ObjCMethod(@NativeType("char const *") ByteBuffer name, @NativeType("unsigned") boolean isInstanceMethod, CXString classUSR, CXString __result) {
        if (CHECKS) {
            checkNT1(name);
        }
        nclang_constructUSR_ObjCMethod(memAddress(name), isInstanceMethod ? 1 : 0, classUSR.address(), __result.address());
        return __result;
    }

    /** Construct a USR for a specified Objective-C method and the USR for its containing class. */
    public static CXString clang_constructUSR_ObjCMethod(@NativeType("char const *") CharSequence name, @NativeType("unsigned") boolean isInstanceMethod, CXString classUSR, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCMethod(nameEncoded, isInstanceMethod ? 1 : 0, classUSR.address(), __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_constructUSR_ObjCProperty ] ---

    /** Unsafe version of: {@link #clang_constructUSR_ObjCProperty constructUSR_ObjCProperty} */
    public static native void nclang_constructUSR_ObjCProperty(long property, long classUSR, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_constructUSR_ObjCProperty constructUSR_ObjCProperty} */
    public static void nclang_constructUSR_ObjCProperty(long property, long classUSR, long __result) {
        long __functionAddress = Functions.constructUSR_ObjCProperty;
        nclang_constructUSR_ObjCProperty(property, classUSR, __functionAddress, __result);
    }

    /** Construct a USR for a specified Objective-C property and the USR for its containing class. */
    public static CXString clang_constructUSR_ObjCProperty(@NativeType("char const *") ByteBuffer property, CXString classUSR, CXString __result) {
        if (CHECKS) {
            checkNT1(property);
        }
        nclang_constructUSR_ObjCProperty(memAddress(property), classUSR.address(), __result.address());
        return __result;
    }

    /** Construct a USR for a specified Objective-C property and the USR for its containing class. */
    public static CXString clang_constructUSR_ObjCProperty(@NativeType("char const *") CharSequence property, CXString classUSR, CXString __result) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(property, true);
            long propertyEncoded = stack.getPointerAddress();
            nclang_constructUSR_ObjCProperty(propertyEncoded, classUSR.address(), __result.address());
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getCursorSpelling ] ---

    /** Unsafe version of: {@link #clang_getCursorSpelling getCursorSpelling} */
    public static native void nclang_getCursorSpelling(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorSpelling getCursorSpelling} */
    public static void nclang_getCursorSpelling(long cursor, long __result) {
        long __functionAddress = Functions.getCursorSpelling;
        nclang_getCursorSpelling(cursor, __functionAddress, __result);
    }

    /** Retrieve a name for the entity referenced by this cursor. */
    public static CXString clang_getCursorSpelling(CXCursor cursor, CXString __result) {
        nclang_getCursorSpelling(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getSpellingNameRange ] ---

    /** Unsafe version of: {@link #clang_Cursor_getSpellingNameRange Cursor_getSpellingNameRange} */
    public static native void nclang_Cursor_getSpellingNameRange(long cursor, int pieceIndex, int options, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getSpellingNameRange Cursor_getSpellingNameRange} */
    public static void nclang_Cursor_getSpellingNameRange(long cursor, int pieceIndex, int options, long __result) {
        long __functionAddress = Functions.Cursor_getSpellingNameRange;
        nclang_Cursor_getSpellingNameRange(cursor, pieceIndex, options, __functionAddress, __result);
    }

    /**
     * Retrieve a range for a piece that forms the cursors spelling name. Most of the times there is only one range for the complete spelling but for
     * Objective-C methods and Objective-C message expressions, there are multiple pieces for each selector identifier.
     *
     * @param pieceIndex the index of the spelling name piece. If this is greater than the actual number of pieces, it will return a {@code NULL} (invalid) range.
     * @param options    reserved
     */
    public static CXSourceRange clang_Cursor_getSpellingNameRange(CXCursor cursor, @NativeType("unsigned") int pieceIndex, @NativeType("unsigned") int options, CXSourceRange __result) {
        nclang_Cursor_getSpellingNameRange(cursor.address(), pieceIndex, options, __result.address());
        return __result;
    }

    // --- [ clang_PrintingPolicy_getProperty ] ---

    /** Get a property value for the given printing policy. */
    @NativeType("unsigned")
    public static int clang_PrintingPolicy_getProperty(@NativeType("CXPrintingPolicy") long Policy, @NativeType("enum CXPrintingPolicyProperty") int Property) {
        long __functionAddress = Functions.PrintingPolicy_getProperty;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        return invokePI(Policy, Property, __functionAddress);
    }

    // --- [ clang_PrintingPolicy_setProperty ] ---

    /** Set a property value for the given printing policy. */
    public static void clang_PrintingPolicy_setProperty(@NativeType("CXPrintingPolicy") long Policy, @NativeType("enum CXPrintingPolicyProperty") int Property, @NativeType("unsigned") int Value) {
        long __functionAddress = Functions.PrintingPolicy_setProperty;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        invokePV(Policy, Property, Value, __functionAddress);
    }

    // --- [ clang_getCursorPrintingPolicy ] ---

    /** Unsafe version of: {@link #clang_getCursorPrintingPolicy getCursorPrintingPolicy} */
    public static long nclang_getCursorPrintingPolicy(long cursor) {
        long __functionAddress = Functions.getCursorPrintingPolicy;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(cursor, __functionAddress);
    }

    /**
     * Retrieve the default policy for the cursor.
     * 
     * <p>The policy should be released after use with {@code clang_PrintingPolicy_dispose}.</p>
     */
    @NativeType("CXPrintingPolicy")
    public static long clang_getCursorPrintingPolicy(CXCursor cursor) {
        return nclang_getCursorPrintingPolicy(cursor.address());
    }

    // --- [ clang_PrintingPolicy_dispose ] ---

    /** Release a printing policy. */
    public static void clang_PrintingPolicy_dispose(@NativeType("CXPrintingPolicy") long Policy) {
        long __functionAddress = Functions.PrintingPolicy_dispose;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        invokePV(Policy, __functionAddress);
    }

    // --- [ clang_getCursorPrettyPrinted ] ---

    /** Unsafe version of: {@link #clang_getCursorPrettyPrinted getCursorPrettyPrinted} */
    public static native void nclang_getCursorPrettyPrinted(long Cursor, long Policy, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorPrettyPrinted getCursorPrettyPrinted} */
    public static void nclang_getCursorPrettyPrinted(long Cursor, long Policy, long __result) {
        long __functionAddress = Functions.getCursorPrettyPrinted;
        if (CHECKS) {
            check(__functionAddress);
            check(Policy);
        }
        nclang_getCursorPrettyPrinted(Cursor, Policy, __functionAddress, __result);
    }

    /**
     * Pretty print declarations.
     *
     * @param Cursor   the cursor representing a declaration
     * @param Policy   the policy to control the entities being printed. If {@code NULL}, a default policy is used.
     * @param __result the pretty printed declaration or the empty string for other cursors
     */
    public static CXString clang_getCursorPrettyPrinted(CXCursor Cursor, @NativeType("CXPrintingPolicy") long Policy, CXString __result) {
        nclang_getCursorPrettyPrinted(Cursor.address(), Policy, __result.address());
        return __result;
    }

    // --- [ clang_getCursorDisplayName ] ---

    /** Unsafe version of: {@link #clang_getCursorDisplayName getCursorDisplayName} */
    public static native void nclang_getCursorDisplayName(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorDisplayName getCursorDisplayName} */
    public static void nclang_getCursorDisplayName(long cursor, long __result) {
        long __functionAddress = Functions.getCursorDisplayName;
        nclang_getCursorDisplayName(cursor, __functionAddress, __result);
    }

    /**
     * Retrieve the display name for the entity referenced by this cursor.
     * 
     * <p>The display name contains extra information that helps identify the cursor, such as the parameters of a function or template or the arguments of a
     * class template specialization.</p>
     */
    public static CXString clang_getCursorDisplayName(CXCursor cursor, CXString __result) {
        nclang_getCursorDisplayName(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorReferenced ] ---

    /** Unsafe version of: {@link #clang_getCursorReferenced getCursorReferenced} */
    public static native void nclang_getCursorReferenced(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorReferenced getCursorReferenced} */
    public static void nclang_getCursorReferenced(long cursor, long __result) {
        long __functionAddress = Functions.getCursorReferenced;
        nclang_getCursorReferenced(cursor, __functionAddress, __result);
    }

    /**
     * For a cursor that is a reference, retrieve a cursor representing the entity that it references.
     * 
     * <p>Reference cursors refer to other entities in the AST. For example, an Objective-C superclass reference cursor refers to an Objective-C class. This
     * function produces the cursor for the Objective-C class from the cursor for the superclass reference. If the input cursor is a declaration or
     * definition, it returns that declaration or definition unchanged. Otherwise, returns the {@code NULL} cursor.</p>
     */
    public static CXCursor clang_getCursorReferenced(CXCursor cursor, CXCursor __result) {
        nclang_getCursorReferenced(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorDefinition ] ---

    /** Unsafe version of: {@link #clang_getCursorDefinition getCursorDefinition} */
    public static native void nclang_getCursorDefinition(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorDefinition getCursorDefinition} */
    public static void nclang_getCursorDefinition(long cursor, long __result) {
        long __functionAddress = Functions.getCursorDefinition;
        nclang_getCursorDefinition(cursor, __functionAddress, __result);
    }

    /**
     * For a cursor that is either a reference to or a declaration of some entity, retrieve a cursor that describes the definition of that entity.
     * 
     * <p>Some entities can be declared multiple times within a translation unit, but only one of those declarations can also be a definition. For example,
     * given:</p>
     * 
     * <pre><code>
     *   int f(int, int);
     *   int g(int x, int y) { return f(x, y); }
     *   int f(int a, int b) { return a + b; }
     *   int f(int, int);</code></pre>
     * 
     * <p>there are three declarations of the function "f", but only the second one is a definition. The {@code clang_getCursorDefinition()} function will take
     * any cursor pointing to a declaration of "f" (the first or fourth lines of the example) or a cursor referenced that uses "f" (the call to "f' inside
     * "g") and will return a declaration cursor pointing to the definition (the second "f" declaration).</p>
     * 
     * <p>If given a cursor for which there is no corresponding definition, e.g., because there is no definition of that entity within this translation unit,
     * returns a {@code NULL} cursor.</p>
     */
    public static CXCursor clang_getCursorDefinition(CXCursor cursor, CXCursor __result) {
        nclang_getCursorDefinition(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_isCursorDefinition ] ---

    /** Unsafe version of: {@link #clang_isCursorDefinition isCursorDefinition} */
    public static int nclang_isCursorDefinition(long cursor) {
        long __functionAddress = Functions.isCursorDefinition;
        return invokePI(cursor, __functionAddress);
    }

    /** Determine whether the declaration pointed to by this cursor is also a definition of that entity. */
    @NativeType("unsigned")
    public static boolean clang_isCursorDefinition(CXCursor cursor) {
        return nclang_isCursorDefinition(cursor.address()) != 0;
    }

    // --- [ clang_getCanonicalCursor ] ---

    /** Unsafe version of: {@link #clang_getCanonicalCursor getCanonicalCursor} */
    public static native void nclang_getCanonicalCursor(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCanonicalCursor getCanonicalCursor} */
    public static void nclang_getCanonicalCursor(long cursor, long __result) {
        long __functionAddress = Functions.getCanonicalCursor;
        nclang_getCanonicalCursor(cursor, __functionAddress, __result);
    }

    /**
     * Retrieve the canonical cursor corresponding to the given cursor.
     * 
     * <p>In the C family of languages, many kinds of entities can be declared several times within a single translation unit. For example, a structure type can
     * be forward-declared (possibly multiple times) and later defined:</p>
     * 
     * <pre><code>
     *  struct X;
     *  struct X;
     *  struct X {
     *    int member;
     *  };</code></pre>
     * 
     * <p>The declarations and the definition of {@code X} are represented by three different cursors, all of which are declarations of the same underlying
     * entity. One of these cursor is considered the "canonical" cursor, which is effectively the representative for the underlying entity. One can determine
     * if two cursors are declarations of the same underlying entity by comparing their canonical cursors.</p>
     *
     * @param __result the canonical cursor for the entity referred to by the given cursor
     */
    public static CXCursor clang_getCanonicalCursor(CXCursor cursor, CXCursor __result) {
        nclang_getCanonicalCursor(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCSelectorIndex ] ---

    /** Unsafe version of: {@link #clang_Cursor_getObjCSelectorIndex Cursor_getObjCSelectorIndex} */
    public static int nclang_Cursor_getObjCSelectorIndex(long cursor) {
        long __functionAddress = Functions.Cursor_getObjCSelectorIndex;
        return invokePI(cursor, __functionAddress);
    }

    /**
     * If the cursor points to a selector identifier in an Objective-C method or message expression, this returns the selector index.
     * 
     * <p>After getting a cursor with {@link #clang_getCursor getCursor}, this can be called to determine if the location points to a selector identifier.</p>
     *
     * @return the selector index if the cursor is an Objective-C method or message expression and the cursor is pointing to a selector identifier, or -1 otherwise
     */
    public static int clang_Cursor_getObjCSelectorIndex(CXCursor cursor) {
        return nclang_Cursor_getObjCSelectorIndex(cursor.address());
    }

    // --- [ clang_Cursor_isDynamicCall ] ---

    /** Unsafe version of: {@link #clang_Cursor_isDynamicCall Cursor_isDynamicCall} */
    public static int nclang_Cursor_isDynamicCall(long C) {
        long __functionAddress = Functions.Cursor_isDynamicCall;
        return invokePI(C, __functionAddress);
    }

    /**
     * Given a cursor pointing to a C++ method call or an Objective-C message, returns non-zero if the method/message is "dynamic", meaning:
     * 
     * <p>For a C++ method: the call is virtual. For an Objective-C message: the receiver is an object instance, not 'super' or a specific class.</p>
     * 
     * <p>If the method/message is "static" or the cursor does not point to a method/message, it will return zero.</p>
     */
    @NativeType("int")
    public static boolean clang_Cursor_isDynamicCall(CXCursor C) {
        return nclang_Cursor_isDynamicCall(C.address()) != 0;
    }

    // --- [ clang_Cursor_getReceiverType ] ---

    /** Unsafe version of: {@link #clang_Cursor_getReceiverType Cursor_getReceiverType} */
    public static native void nclang_Cursor_getReceiverType(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getReceiverType Cursor_getReceiverType} */
    public static void nclang_Cursor_getReceiverType(long C, long __result) {
        long __functionAddress = Functions.Cursor_getReceiverType;
        nclang_Cursor_getReceiverType(C, __functionAddress, __result);
    }

    /** Given a cursor pointing to an Objective-C message or property reference, or C++ method call, returns the {@code CXType} of the receiver. */
    public static CXType clang_Cursor_getReceiverType(CXCursor C, CXType __result) {
        nclang_Cursor_getReceiverType(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCPropertyAttributes ] ---

    /** Unsafe version of: {@link #clang_Cursor_getObjCPropertyAttributes Cursor_getObjCPropertyAttributes} */
    public static int nclang_Cursor_getObjCPropertyAttributes(long C, int reserved) {
        long __functionAddress = Functions.Cursor_getObjCPropertyAttributes;
        return invokePI(C, reserved, __functionAddress);
    }

    /**
     * Given a cursor that represents a property declaration, return the associated property attributes. The bits are formed from {@code
     * CXObjCPropertyAttrKind}.
     *
     * @param reserved reserved for future use, pass 0
     */
    @NativeType("unsigned")
    public static int clang_Cursor_getObjCPropertyAttributes(CXCursor C, @NativeType("unsigned") int reserved) {
        return nclang_Cursor_getObjCPropertyAttributes(C.address(), reserved);
    }

    // --- [ clang_Cursor_getObjCPropertyGetterName ] ---

    /** Unsafe version of: {@link #clang_Cursor_getObjCPropertyGetterName Cursor_getObjCPropertyGetterName} */
    public static native void nclang_Cursor_getObjCPropertyGetterName(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getObjCPropertyGetterName Cursor_getObjCPropertyGetterName} */
    public static void nclang_Cursor_getObjCPropertyGetterName(long C, long __result) {
        long __functionAddress = Functions.Cursor_getObjCPropertyGetterName;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Cursor_getObjCPropertyGetterName(C, __functionAddress, __result);
    }

    /** Given a cursor that represents a property declaration, return the name of the method that implements the getter. */
    public static CXString clang_Cursor_getObjCPropertyGetterName(CXCursor C, CXString __result) {
        nclang_Cursor_getObjCPropertyGetterName(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCPropertySetterName ] ---

    /** Unsafe version of: {@link #clang_Cursor_getObjCPropertySetterName Cursor_getObjCPropertySetterName} */
    public static native void nclang_Cursor_getObjCPropertySetterName(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getObjCPropertySetterName Cursor_getObjCPropertySetterName} */
    public static void nclang_Cursor_getObjCPropertySetterName(long C, long __result) {
        long __functionAddress = Functions.Cursor_getObjCPropertySetterName;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_Cursor_getObjCPropertySetterName(C, __functionAddress, __result);
    }

    /** Given a cursor that represents a property declaration, return the name of the method that implements the setter, if any. */
    public static CXString clang_Cursor_getObjCPropertySetterName(CXCursor C, CXString __result) {
        nclang_Cursor_getObjCPropertySetterName(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getObjCDeclQualifiers ] ---

    /** Unsafe version of: {@link #clang_Cursor_getObjCDeclQualifiers Cursor_getObjCDeclQualifiers} */
    public static int nclang_Cursor_getObjCDeclQualifiers(long C) {
        long __functionAddress = Functions.Cursor_getObjCDeclQualifiers;
        return invokePI(C, __functionAddress);
    }

    /**
     * Given a cursor that represents an Objective-C method or parameter declaration, return the associated Objective-C qualifiers for the return type or the
     * parameter respectively. The bits are formed from CXObjCDeclQualifierKind.
     */
    @NativeType("unsigned")
    public static int clang_Cursor_getObjCDeclQualifiers(CXCursor C) {
        return nclang_Cursor_getObjCDeclQualifiers(C.address());
    }

    // --- [ clang_Cursor_isObjCOptional ] ---

    /** Unsafe version of: {@link #clang_Cursor_isObjCOptional Cursor_isObjCOptional} */
    public static int nclang_Cursor_isObjCOptional(long C) {
        long __functionAddress = Functions.Cursor_isObjCOptional;
        return invokePI(C, __functionAddress);
    }

    /**
     * Given a cursor that represents an Objective-C method or property declaration, return non-zero if the declaration was affected by "@optional". Returns
     * zero if the cursor is not such a declaration or it is "@required".
     */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isObjCOptional(CXCursor C) {
        return nclang_Cursor_isObjCOptional(C.address()) != 0;
    }

    // --- [ clang_Cursor_isVariadic ] ---

    /** Unsafe version of: {@link #clang_Cursor_isVariadic Cursor_isVariadic} */
    public static int nclang_Cursor_isVariadic(long C) {
        long __functionAddress = Functions.Cursor_isVariadic;
        return invokePI(C, __functionAddress);
    }

    /** Returns non-zero if the given cursor is a variadic function or method. */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isVariadic(CXCursor C) {
        return nclang_Cursor_isVariadic(C.address()) != 0;
    }

    // --- [ clang_Cursor_isExternalSymbol ] ---

    /** Unsafe version of: {@link #clang_Cursor_isExternalSymbol Cursor_isExternalSymbol} */
    public static int nclang_Cursor_isExternalSymbol(long C, long language, long definedIn, long isGenerated) {
        long __functionAddress = Functions.Cursor_isExternalSymbol;
        return invokePPPPI(C, language, definedIn, isGenerated, __functionAddress);
    }

    /**
     * Returns non-zero if the given cursor points to a symbol marked with external_source_symbol attribute.
     *
     * @param language    if non-{@code NULL}, and the attribute is present, will be set to the 'language' string from the attribute
     * @param definedIn   if non-{@code NULL}, and the attribute is present, will be set to the 'definedIn' string from the attribute
     * @param isGenerated if non-{@code NULL}, and the attribute is present, will be set to non-zero if the 'generated_declaration' is set in the attribute
     */
    @NativeType("unsigned")
    public static boolean clang_Cursor_isExternalSymbol(CXCursor C, @Nullable @NativeType("CXString *") CXString.Buffer language, @Nullable @NativeType("CXString *") CXString.Buffer definedIn, @Nullable @NativeType("unsigned *") IntBuffer isGenerated) {
        if (CHECKS) {
            checkSafe(language, 1);
            checkSafe(definedIn, 1);
            checkSafe(isGenerated, 1);
        }
        return nclang_Cursor_isExternalSymbol(C.address(), memAddressSafe(language), memAddressSafe(definedIn), memAddressSafe(isGenerated)) != 0;
    }

    // --- [ clang_Cursor_getCommentRange ] ---

    /** Unsafe version of: {@link #clang_Cursor_getCommentRange Cursor_getCommentRange} */
    public static native void nclang_Cursor_getCommentRange(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getCommentRange Cursor_getCommentRange} */
    public static void nclang_Cursor_getCommentRange(long C, long __result) {
        long __functionAddress = Functions.Cursor_getCommentRange;
        nclang_Cursor_getCommentRange(C, __functionAddress, __result);
    }

    /**
     * Given a cursor that represents a declaration, return the associated comment's source range. The range may include multiple consecutive comments with
     * whitespace in between.
     */
    public static CXSourceRange clang_Cursor_getCommentRange(CXCursor C, CXSourceRange __result) {
        nclang_Cursor_getCommentRange(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getRawCommentText ] ---

    /** Unsafe version of: {@link #clang_Cursor_getRawCommentText Cursor_getRawCommentText} */
    public static native void nclang_Cursor_getRawCommentText(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getRawCommentText Cursor_getRawCommentText} */
    public static void nclang_Cursor_getRawCommentText(long C, long __result) {
        long __functionAddress = Functions.Cursor_getRawCommentText;
        nclang_Cursor_getRawCommentText(C, __functionAddress, __result);
    }

    /** Given a cursor that represents a declaration, return the associated comment text, including comment markers. */
    public static CXString clang_Cursor_getRawCommentText(CXCursor C, CXString __result) {
        nclang_Cursor_getRawCommentText(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getBriefCommentText ] ---

    /** Unsafe version of: {@link #clang_Cursor_getBriefCommentText Cursor_getBriefCommentText} */
    public static native void nclang_Cursor_getBriefCommentText(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getBriefCommentText Cursor_getBriefCommentText} */
    public static void nclang_Cursor_getBriefCommentText(long C, long __result) {
        long __functionAddress = Functions.Cursor_getBriefCommentText;
        nclang_Cursor_getBriefCommentText(C, __functionAddress, __result);
    }

    /**
     * Given a cursor that represents a documentable entity (e.g., declaration), return the associated; otherwise return the
     * 
     * <p>first paragraph.</p>
     */
    public static CXString clang_Cursor_getBriefCommentText(CXCursor C, CXString __result) {
        nclang_Cursor_getBriefCommentText(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getMangling ] ---

    /** Unsafe version of: {@link #clang_Cursor_getMangling Cursor_getMangling} */
    public static native void nclang_Cursor_getMangling(long cursor, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Cursor_getMangling Cursor_getMangling} */
    public static void nclang_Cursor_getMangling(long cursor, long __result) {
        long __functionAddress = Functions.Cursor_getMangling;
        nclang_Cursor_getMangling(cursor, __functionAddress, __result);
    }

    /** Retrieve the {@code CXString} representing the mangled name of the cursor. */
    public static CXString clang_Cursor_getMangling(CXCursor cursor, CXString __result) {
        nclang_Cursor_getMangling(cursor.address(), __result.address());
        return __result;
    }

    // --- [ clang_Cursor_getCXXManglings ] ---

    /** Unsafe version of: {@link #clang_Cursor_getCXXManglings Cursor_getCXXManglings} */
    public static long nclang_Cursor_getCXXManglings(long cursor) {
        long __functionAddress = Functions.Cursor_getCXXManglings;
        return invokePP(cursor, __functionAddress);
    }

    /** Retrieve the {@code CXString}s representing the mangled symbols of the C++ constructor or destructor at the cursor. */
    @Nullable
    @NativeType("CXStringSet *")
    public static CXStringSet clang_Cursor_getCXXManglings(CXCursor cursor) {
        long __result = nclang_Cursor_getCXXManglings(cursor.address());
        return CXStringSet.createSafe(__result);
    }

    // --- [ clang_Cursor_getObjCManglings ] ---

    /** Unsafe version of: {@link #clang_Cursor_getObjCManglings Cursor_getObjCManglings} */
    public static long nclang_Cursor_getObjCManglings(long cursor) {
        long __functionAddress = Functions.Cursor_getObjCManglings;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(cursor, __functionAddress);
    }

    /** Retrieve the {@code CXString}s representing the mangled symbols of the ObjC class interface or implementation at the cursor. */
    @Nullable
    @NativeType("CXStringSet *")
    public static CXStringSet clang_Cursor_getObjCManglings(CXCursor cursor) {
        long __result = nclang_Cursor_getObjCManglings(cursor.address());
        return CXStringSet.createSafe(__result);
    }

    // --- [ clang_Cursor_getModule ] ---

    /** Unsafe version of: {@link #clang_Cursor_getModule Cursor_getModule} */
    public static long nclang_Cursor_getModule(long C) {
        long __functionAddress = Functions.Cursor_getModule;
        return invokePP(C, __functionAddress);
    }

    /** Given a {@link #CXCursor_ModuleImportDecl Cursor_ModuleImportDecl} cursor, return the associated module. */
    @NativeType("CXModule")
    public static long clang_Cursor_getModule(CXCursor C) {
        return nclang_Cursor_getModule(C.address());
    }

    // --- [ clang_getModuleForFile ] ---

    /** Given a {@code CXFile} header file, return the module that contains it, if one exists. */
    @NativeType("CXModule")
    public static long clang_getModuleForFile(@NativeType("CXTranslationUnit") long TU, @NativeType("CXFile") long file) {
        long __functionAddress = Functions.getModuleForFile;
        if (CHECKS) {
            check(TU);
            check(file);
        }
        return invokePPP(TU, file, __functionAddress);
    }

    // --- [ clang_Module_getASTFile ] ---

    /**
     * @param Module a module object
     *
     * @return the module file where the provided module object came from
     */
    @NativeType("CXFile")
    public static long clang_Module_getASTFile(@NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_getASTFile;
        if (CHECKS) {
            check(Module);
        }
        return invokePP(Module, __functionAddress);
    }

    // --- [ clang_Module_getParent ] ---

    /**
     * @param Module a module object
     *
     * @return the parent of a sub-module or {@code NULL} if the given module is top-level, e.g. for 'std.vector' it will return the 'std' module.
     */
    @NativeType("CXModule")
    public static long clang_Module_getParent(@NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_getParent;
        if (CHECKS) {
            check(Module);
        }
        return invokePP(Module, __functionAddress);
    }

    // --- [ clang_Module_getName ] ---

    /** Unsafe version of: {@link #clang_Module_getName Module_getName} */
    public static native void nclang_Module_getName(long Module, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Module_getName Module_getName} */
    public static void nclang_Module_getName(long Module, long __result) {
        long __functionAddress = Functions.Module_getName;
        if (CHECKS) {
            check(Module);
        }
        nclang_Module_getName(Module, __functionAddress, __result);
    }

    /**
     * @param Module   a module object
     * @param __result the name of the module, e.g. for the 'std.vector' sub-module it will return "vector".
     */
    public static CXString clang_Module_getName(@NativeType("CXModule") long Module, CXString __result) {
        nclang_Module_getName(Module, __result.address());
        return __result;
    }

    // --- [ clang_Module_getFullName ] ---

    /** Unsafe version of: {@link #clang_Module_getFullName Module_getFullName} */
    public static native void nclang_Module_getFullName(long Module, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_Module_getFullName Module_getFullName} */
    public static void nclang_Module_getFullName(long Module, long __result) {
        long __functionAddress = Functions.Module_getFullName;
        if (CHECKS) {
            check(Module);
        }
        nclang_Module_getFullName(Module, __functionAddress, __result);
    }

    /**
     * @param Module   a module object
     * @param __result the full name of the module, e.g. "std.vector".
     */
    public static CXString clang_Module_getFullName(@NativeType("CXModule") long Module, CXString __result) {
        nclang_Module_getFullName(Module, __result.address());
        return __result;
    }

    // --- [ clang_Module_isSystem ] ---

    /**
     * @param Module a module object
     *
     * @return non-zero if the module is a system one
     */
    @NativeType("int")
    public static boolean clang_Module_isSystem(@NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_isSystem;
        if (CHECKS) {
            check(Module);
        }
        return invokePI(Module, __functionAddress) != 0;
    }

    // --- [ clang_Module_getNumTopLevelHeaders ] ---

    /**
     * @param Module a module object
     *
     * @return the number of top level headers associated with this module
     */
    @NativeType("unsigned")
    public static int clang_Module_getNumTopLevelHeaders(@NativeType("CXTranslationUnit") long TU, @NativeType("CXModule") long Module) {
        long __functionAddress = Functions.Module_getNumTopLevelHeaders;
        if (CHECKS) {
            check(TU);
            check(Module);
        }
        return invokePPI(TU, Module, __functionAddress);
    }

    // --- [ clang_Module_getTopLevelHeader ] ---

    /**
     * @param Module a module object
     * @param Index  top level header index (zero-based)
     *
     * @return the specified top level header associated with the module
     */
    @NativeType("CXFile")
    public static long clang_Module_getTopLevelHeader(@NativeType("CXTranslationUnit") long TU, @NativeType("CXModule") long Module, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.Module_getTopLevelHeader;
        if (CHECKS) {
            check(TU);
            check(Module);
        }
        return invokePPP(TU, Module, Index, __functionAddress);
    }

    // --- [ clang_CXXConstructor_isConvertingConstructor ] ---

    /** Unsafe version of: {@link #clang_CXXConstructor_isConvertingConstructor CXXConstructor_isConvertingConstructor} */
    public static int nclang_CXXConstructor_isConvertingConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isConvertingConstructor;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ constructor is a converting constructor. */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isConvertingConstructor(CXCursor C) {
        return nclang_CXXConstructor_isConvertingConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXConstructor_isCopyConstructor ] ---

    /** Unsafe version of: {@link #clang_CXXConstructor_isCopyConstructor CXXConstructor_isCopyConstructor} */
    public static int nclang_CXXConstructor_isCopyConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isCopyConstructor;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ constructor is a copy constructor. */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isCopyConstructor(CXCursor C) {
        return nclang_CXXConstructor_isCopyConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXConstructor_isDefaultConstructor ] ---

    /** Unsafe version of: {@link #clang_CXXConstructor_isDefaultConstructor CXXConstructor_isDefaultConstructor} */
    public static int nclang_CXXConstructor_isDefaultConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isDefaultConstructor;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ constructor is the default constructor. */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isDefaultConstructor(CXCursor C) {
        return nclang_CXXConstructor_isDefaultConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXConstructor_isMoveConstructor ] ---

    /** Unsafe version of: {@link #clang_CXXConstructor_isMoveConstructor CXXConstructor_isMoveConstructor} */
    public static int nclang_CXXConstructor_isMoveConstructor(long C) {
        long __functionAddress = Functions.CXXConstructor_isMoveConstructor;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ constructor is a move constructor. */
    @NativeType("unsigned")
    public static boolean clang_CXXConstructor_isMoveConstructor(CXCursor C) {
        return nclang_CXXConstructor_isMoveConstructor(C.address()) != 0;
    }

    // --- [ clang_CXXField_isMutable ] ---

    /** Unsafe version of: {@link #clang_CXXField_isMutable CXXField_isMutable} */
    public static int nclang_CXXField_isMutable(long C) {
        long __functionAddress = Functions.CXXField_isMutable;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ field is declared 'mutable'. */
    @NativeType("unsigned")
    public static boolean clang_CXXField_isMutable(CXCursor C) {
        return nclang_CXXField_isMutable(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isDefaulted ] ---

    /** Unsafe version of: {@link #clang_CXXMethod_isDefaulted CXXMethod_isDefaulted} */
    public static int nclang_CXXMethod_isDefaulted(long C) {
        long __functionAddress = Functions.CXXMethod_isDefaulted;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ method is declared '= default'. */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isDefaulted(CXCursor C) {
        return nclang_CXXMethod_isDefaulted(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isPureVirtual ] ---

    /** Unsafe version of: {@link #clang_CXXMethod_isPureVirtual CXXMethod_isPureVirtual} */
    public static int nclang_CXXMethod_isPureVirtual(long C) {
        long __functionAddress = Functions.CXXMethod_isPureVirtual;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ member function or member function template is pure virtual. */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isPureVirtual(CXCursor C) {
        return nclang_CXXMethod_isPureVirtual(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isStatic ] ---

    /** Unsafe version of: {@link #clang_CXXMethod_isStatic CXXMethod_isStatic} */
    public static int nclang_CXXMethod_isStatic(long C) {
        long __functionAddress = Functions.CXXMethod_isStatic;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ member function or member function template is declared 'static'. */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isStatic(CXCursor C) {
        return nclang_CXXMethod_isStatic(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isVirtual ] ---

    /** Unsafe version of: {@link #clang_CXXMethod_isVirtual CXXMethod_isVirtual} */
    public static int nclang_CXXMethod_isVirtual(long C) {
        long __functionAddress = Functions.CXXMethod_isVirtual;
        return invokePI(C, __functionAddress);
    }

    /**
     * Determine if a C++ member function or member function template is explicitly declared 'virtual' or if it overrides a virtual method from one of the
     * base classes.
     */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isVirtual(CXCursor C) {
        return nclang_CXXMethod_isVirtual(C.address()) != 0;
    }

    // --- [ clang_CXXRecord_isAbstract ] ---

    /** Unsafe version of: {@link #clang_CXXRecord_isAbstract CXXRecord_isAbstract} */
    public static int nclang_CXXRecord_isAbstract(long C) {
        long __functionAddress = Functions.CXXRecord_isAbstract;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ record is abstract, i.e. whether a class or struct has a pure virtual member function. */
    @NativeType("unsigned")
    public static boolean clang_CXXRecord_isAbstract(CXCursor C) {
        return nclang_CXXRecord_isAbstract(C.address()) != 0;
    }

    // --- [ clang_EnumDecl_isScoped ] ---

    /** Unsafe version of: {@link #clang_EnumDecl_isScoped EnumDecl_isScoped} */
    public static int nclang_EnumDecl_isScoped(long C) {
        long __functionAddress = Functions.EnumDecl_isScoped;
        return invokePI(C, __functionAddress);
    }

    /** Determine if an enum declaration refers to a scoped enum. */
    @NativeType("unsigned")
    public static boolean clang_EnumDecl_isScoped(CXCursor C) {
        return nclang_EnumDecl_isScoped(C.address()) != 0;
    }

    // --- [ clang_CXXMethod_isConst ] ---

    /** Unsafe version of: {@link #clang_CXXMethod_isConst CXXMethod_isConst} */
    public static int nclang_CXXMethod_isConst(long C) {
        long __functionAddress = Functions.CXXMethod_isConst;
        return invokePI(C, __functionAddress);
    }

    /** Determine if a C++ member function or member function template is declared 'const'. */
    @NativeType("unsigned")
    public static boolean clang_CXXMethod_isConst(CXCursor C) {
        return nclang_CXXMethod_isConst(C.address()) != 0;
    }

    // --- [ clang_getTemplateCursorKind ] ---

    /** Unsafe version of: {@link #clang_getTemplateCursorKind getTemplateCursorKind} */
    public static int nclang_getTemplateCursorKind(long C) {
        long __functionAddress = Functions.getTemplateCursorKind;
        return invokePI(C, __functionAddress);
    }

    /**
     * Given a cursor that represents a template, determine the cursor kind of the specializations would be generated by instantiating the template.
     * 
     * <p>This routine can be used to determine what flavor of function template, class template, or class template partial specialization is stored in the
     * cursor. For example, it can describe whether a class template cursor is declared with "struct", "class" or "union".</p>
     *
     * @param C the cursor to query. This cursor should represent a template declaration.
     *
     * @return the cursor kind of the specializations that would be generated by instantiating the template {@code C}. If {@code C} is not a template, returns
     *         {@link #CXCursor_NoDeclFound Cursor_NoDeclFound}.
     */
    @NativeType("enum CXCursorKind")
    public static int clang_getTemplateCursorKind(CXCursor C) {
        return nclang_getTemplateCursorKind(C.address());
    }

    // --- [ clang_getSpecializedCursorTemplate ] ---

    /** Unsafe version of: {@link #clang_getSpecializedCursorTemplate getSpecializedCursorTemplate} */
    public static native void nclang_getSpecializedCursorTemplate(long C, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getSpecializedCursorTemplate getSpecializedCursorTemplate} */
    public static void nclang_getSpecializedCursorTemplate(long C, long __result) {
        long __functionAddress = Functions.getSpecializedCursorTemplate;
        nclang_getSpecializedCursorTemplate(C, __functionAddress, __result);
    }

    /**
     * Given a cursor that may represent a specialization or instantiation of a template, retrieve the cursor that represents the template that it specializes
     * or from which it was instantiated.
     * 
     * <p>This routine determines the template involved both for explicit specializations of templates and for implicit instantiations of the template, both of
     * which are referred to as "specializations". For a class template specialization (e.g., {@code std::vector<bool>}), this routine will return either the
     * primary template ({@code std::vector}) or, if the specialization was instantiated from a class template partial specialization, the class template
     * partial specialization. For a class template partial specialization and a function template specialization (including instantiations), this this
     * routine will return the specialized template.</p>
     * 
     * <p>For members of a class template (e.g., member functions, member classes, or static data members), returns the specialized or instantiated member.
     * Although not strictly "templates" in the C++ language, members of class templates have the same notions of specializations and instantiations that
     * templates do, so this routine treats them similarly.</p>
     *
     * @param C        a cursor that may be a specialization of a template or a member of a template
     * @param __result if the given cursor is a specialization or instantiation of a template or a member thereof, the template or member that it specializes or from which it
     *                 was instantiated. Otherwise, returns a {@code NULL} cursor.
     */
    public static CXCursor clang_getSpecializedCursorTemplate(CXCursor C, CXCursor __result) {
        nclang_getSpecializedCursorTemplate(C.address(), __result.address());
        return __result;
    }

    // --- [ clang_getCursorReferenceNameRange ] ---

    /** Unsafe version of: {@link #clang_getCursorReferenceNameRange getCursorReferenceNameRange} */
    public static native void nclang_getCursorReferenceNameRange(long C, int NameFlags, int PieceIndex, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCursorReferenceNameRange getCursorReferenceNameRange} */
    public static void nclang_getCursorReferenceNameRange(long C, int NameFlags, int PieceIndex, long __result) {
        long __functionAddress = Functions.getCursorReferenceNameRange;
        nclang_getCursorReferenceNameRange(C, NameFlags, PieceIndex, __functionAddress, __result);
    }

    /**
     * Given a cursor that references something else, return the source range covering that reference.
     *
     * @param C          a cursor pointing to a member reference, a declaration reference, or an operator call
     * @param NameFlags  a bitset with three independent flags: {@link #CXNameRange_WantQualifier NameRange_WantQualifier}, {@link #CXNameRange_WantTemplateArgs NameRange_WantTemplateArgs}, and {@link #CXNameRange_WantSinglePiece NameRange_WantSinglePiece}
     * @param PieceIndex for contiguous names or when passing the flag {@link #CXNameRange_WantSinglePiece NameRange_WantSinglePiece}, only one piece with index 0 is available. When the
     *                   {@link #CXNameRange_WantSinglePiece NameRange_WantSinglePiece} flag is not passed for a non-contiguous names, this index can be used to retrieve the individual pieces of the name.
     *                   See also {@link #CXNameRange_WantSinglePiece NameRange_WantSinglePiece}.
     * @param __result   the piece of the name pointed to by the given cursor. If there is no name, or if the {@code PieceIndex} is out-of-range, a null-cursor will be
     *                   returned.
     */
    public static CXSourceRange clang_getCursorReferenceNameRange(CXCursor C, @NativeType("unsigned") int NameFlags, @NativeType("unsigned") int PieceIndex, CXSourceRange __result) {
        nclang_getCursorReferenceNameRange(C.address(), NameFlags, PieceIndex, __result.address());
        return __result;
    }

    // --- [ clang_getToken ] ---

    /** Unsafe version of: {@link #clang_getToken getToken} */
    public static long nclang_getToken(long TU, long Location) {
        long __functionAddress = Functions.getToken;
        if (CHECKS) {
            check(__functionAddress);
            check(TU);
        }
        return invokePPP(TU, Location, __functionAddress);
    }

    /**
     * Get the raw lexical token starting with the given location.
     *
     * @param TU       the translation unit whose text is being tokenized
     * @param Location the source location with which the token starts
     *
     * @return the token starting with the given location or {@code NULL} if no such token exist. The returned pointer must be freed with {@link #clang_disposeTokens disposeTokens} before the
     *         translation unit is destroyed.
     */
    @Nullable
    @NativeType("CXToken *")
    public static CXToken clang_getToken(@NativeType("CXTranslationUnit") long TU, CXSourceLocation Location) {
        long __result = nclang_getToken(TU, Location.address());
        return CXToken.createSafe(__result);
    }

    // --- [ clang_getTokenKind ] ---

    /** Unsafe version of: {@link #clang_getTokenKind getTokenKind} */
    public static int nclang_getTokenKind(long token) {
        long __functionAddress = Functions.getTokenKind;
        return invokePI(token, __functionAddress);
    }

    /** Determine the kind of the given token. */
    @NativeType("CXTokenKind")
    public static int clang_getTokenKind(CXToken token) {
        return nclang_getTokenKind(token.address());
    }

    // --- [ clang_getTokenSpelling ] ---

    /** Unsafe version of: {@link #clang_getTokenSpelling getTokenSpelling} */
    public static native void nclang_getTokenSpelling(long TU, long token, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTokenSpelling getTokenSpelling} */
    public static void nclang_getTokenSpelling(long TU, long token, long __result) {
        long __functionAddress = Functions.getTokenSpelling;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTokenSpelling(TU, token, __functionAddress, __result);
    }

    /**
     * Determine the spelling of the given token.
     * 
     * <p>The spelling of a token is the textual representation of that token, e.g., the text of an identifier or keyword.</p>
     */
    public static CXString clang_getTokenSpelling(@NativeType("CXTranslationUnit") long TU, CXToken token, CXString __result) {
        nclang_getTokenSpelling(TU, token.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTokenLocation ] ---

    /** Unsafe version of: {@link #clang_getTokenLocation getTokenLocation} */
    public static native void nclang_getTokenLocation(long TU, long token, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTokenLocation getTokenLocation} */
    public static void nclang_getTokenLocation(long TU, long token, long __result) {
        long __functionAddress = Functions.getTokenLocation;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTokenLocation(TU, token, __functionAddress, __result);
    }

    /** Retrieve the source location of the given token. */
    public static CXSourceLocation clang_getTokenLocation(@NativeType("CXTranslationUnit") long TU, CXToken token, CXSourceLocation __result) {
        nclang_getTokenLocation(TU, token.address(), __result.address());
        return __result;
    }

    // --- [ clang_getTokenExtent ] ---

    /** Unsafe version of: {@link #clang_getTokenExtent getTokenExtent} */
    public static native void nclang_getTokenExtent(long TU, long token, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getTokenExtent getTokenExtent} */
    public static void nclang_getTokenExtent(long TU, long token, long __result) {
        long __functionAddress = Functions.getTokenExtent;
        if (CHECKS) {
            check(TU);
        }
        nclang_getTokenExtent(TU, token, __functionAddress, __result);
    }

    /** Retrieve a source range that covers the given token. */
    public static CXSourceRange clang_getTokenExtent(@NativeType("CXTranslationUnit") long TU, CXToken token, CXSourceRange __result) {
        nclang_getTokenExtent(TU, token.address(), __result.address());
        return __result;
    }

    // --- [ clang_tokenize ] ---

    /** Unsafe version of: {@link #clang_tokenize tokenize} */
    public static void nclang_tokenize(long TU, long Range, long Tokens, long NumTokens) {
        long __functionAddress = Functions.tokenize;
        if (CHECKS) {
            check(TU);
        }
        invokePPPPV(TU, Range, Tokens, NumTokens, __functionAddress);
    }

    /**
     * Tokenize the source code described by the given range into raw lexical tokens.
     *
     * @param TU        the translation unit whose text is being tokenized
     * @param Range     the source range in which text should be tokenized. All of the tokens produced by tokenization will fall within this source range,
     * @param Tokens    this pointer will be set to point to the array of tokens that occur within the given source range. The returned pointer must be freed with
     *                  {@link #clang_disposeTokens disposeTokens} before the translation unit is destroyed.
     * @param NumTokens will be set to the number of tokens in the {@code *Tokens} array
     */
    public static void clang_tokenize(@NativeType("CXTranslationUnit") long TU, CXSourceRange Range, @NativeType("CXToken **") PointerBuffer Tokens, @NativeType("unsigned *") IntBuffer NumTokens) {
        if (CHECKS) {
            check(Tokens, 1);
            check(NumTokens, 1);
        }
        nclang_tokenize(TU, Range.address(), memAddress(Tokens), memAddress(NumTokens));
    }

    // --- [ clang_annotateTokens ] ---

    /**
     * Unsafe version of: {@link #clang_annotateTokens annotateTokens}
     *
     * @param NumTokens the number of tokens in {@code Tokens}
     */
    public static void nclang_annotateTokens(long TU, long Tokens, int NumTokens, long Cursors) {
        long __functionAddress = Functions.annotateTokens;
        if (CHECKS) {
            check(TU);
        }
        invokePPPV(TU, Tokens, NumTokens, Cursors, __functionAddress);
    }

    /**
     * Annotate the given set of tokens by providing cursors for each token that can be mapped to a specific entity within the abstract syntax tree.
     * 
     * <p>This token-annotation routine is equivalent to invoking {@link #clang_getCursor getCursor} for the source locations of each of the tokens. The cursors provided are filtered,
     * so that only those cursors that have a direct correspondence to the token are accepted. For example, given a function call {@code f(x)},
     * {@code clang_getCursor()} would provide the following cursors:</p>
     * 
     * <ul>
     * <li>when the cursor is over the 'f', a DeclRefExpr cursor referring to 'f'.</li>
     * <li>when the cursor is over the '(' or the ')', a CallExpr referring to 'f'.</li>
     * <li>when the cursor is over the 'x', a DeclRefExpr cursor referring to 'x'.</li>
     * </ul>
     * 
     * <p>Only the first and last of these cursors will occur within the annotate, since the tokens "f" and "x' directly refer to a function and a variable,
     * respectively, but the parentheses are just a small part of the full syntax of the function call expression, which is not provided as an annotation.</p>
     *
     * @param TU      the translation unit that owns the given tokens
     * @param Tokens  the set of tokens to annotate
     * @param Cursors an array of {@code NumTokens} cursors, whose contents will be replaced with the cursors corresponding to each token
     */
    public static void clang_annotateTokens(@NativeType("CXTranslationUnit") long TU, @NativeType("CXToken *") CXToken.Buffer Tokens, @NativeType("CXCursor *") CXCursor.Buffer Cursors) {
        if (CHECKS) {
            check(Cursors, Tokens.remaining());
        }
        nclang_annotateTokens(TU, Tokens.address(), Tokens.remaining(), Cursors.address());
    }

    // --- [ clang_disposeTokens ] ---

    /** Unsafe version of: {@link #clang_disposeTokens disposeTokens} */
    public static void nclang_disposeTokens(long TU, long Tokens, int NumTokens) {
        long __functionAddress = Functions.disposeTokens;
        if (CHECKS) {
            check(TU);
        }
        invokePPV(TU, Tokens, NumTokens, __functionAddress);
    }

    /** Free the given set of tokens. */
    public static void clang_disposeTokens(@NativeType("CXTranslationUnit") long TU, @NativeType("CXToken *") CXToken.Buffer Tokens) {
        nclang_disposeTokens(TU, Tokens.address(), Tokens.remaining());
    }

    // --- [ clang_getCursorKindSpelling ] ---

    public static native void nclang_getCursorKindSpelling(int Kind, long __functionAddress, long __result);

    public static void nclang_getCursorKindSpelling(int Kind, long __result) {
        long __functionAddress = Functions.getCursorKindSpelling;
        nclang_getCursorKindSpelling(Kind, __functionAddress, __result);
    }

    public static CXString clang_getCursorKindSpelling(@NativeType("enum CXCursorKind") int Kind, CXString __result) {
        nclang_getCursorKindSpelling(Kind, __result.address());
        return __result;
    }

    // --- [ clang_getDefinitionSpellingAndExtent ] ---

    public static void nclang_getDefinitionSpellingAndExtent(long cursor, long startBuf, long endBuf, long startLine, long startColumn, long endLine, long endColumn) {
        long __functionAddress = Functions.getDefinitionSpellingAndExtent;
        invokePPPPPPPV(cursor, startBuf, endBuf, startLine, startColumn, endLine, endColumn, __functionAddress);
    }

    public static void clang_getDefinitionSpellingAndExtent(CXCursor cursor, @Nullable @NativeType("char const **") PointerBuffer startBuf, @Nullable @NativeType("char const **") PointerBuffer endBuf, @Nullable @NativeType("unsigned *") IntBuffer startLine, @Nullable @NativeType("unsigned *") IntBuffer startColumn, @Nullable @NativeType("unsigned *") IntBuffer endLine, @Nullable @NativeType("unsigned *") IntBuffer endColumn) {
        if (CHECKS) {
            checkSafe(startBuf, 1);
            checkSafe(endBuf, 1);
            checkSafe(startLine, 1);
            checkSafe(startColumn, 1);
            checkSafe(endLine, 1);
            checkSafe(endColumn, 1);
        }
        nclang_getDefinitionSpellingAndExtent(cursor.address(), memAddressSafe(startBuf), memAddressSafe(endBuf), memAddressSafe(startLine), memAddressSafe(startColumn), memAddressSafe(endLine), memAddressSafe(endColumn));
    }

    // --- [ clang_enableStackTraces ] ---

    public static void clang_enableStackTraces() {
        long __functionAddress = Functions.enableStackTraces;
        invokeV(__functionAddress);
    }

    // --- [ clang_executeOnThread ] ---

    public static void nclang_executeOnThread(long fn, long user_data, int stack_size) {
        long __functionAddress = Functions.executeOnThread;
        invokePPV(fn, user_data, stack_size, __functionAddress);
    }

    public static void clang_executeOnThread(@NativeType("void (*) (void *)") CXExecuteOnThreadI fn, @NativeType("void *") long user_data, @NativeType("unsigned") int stack_size) {
        nclang_executeOnThread(fn.address(), user_data, stack_size);
    }

    // --- [ clang_getCompletionChunkKind ] ---

    /**
     * Determine the kind of a particular chunk within a completion string.
     *
     * @param completion_string the completion string to query
     * @param chunk_number      the 0-based index of the chunk in the completion string
     *
     * @return the kind of the chunk at the index {@code chunk_number}
     */
    @NativeType("enum CXCompletionChunkKind")
    public static int clang_getCompletionChunkKind(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int chunk_number) {
        long __functionAddress = Functions.getCompletionChunkKind;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, chunk_number, __functionAddress);
    }

    // --- [ clang_getCompletionChunkText ] ---

    /** Unsafe version of: {@link #clang_getCompletionChunkText getCompletionChunkText} */
    public static native void nclang_getCompletionChunkText(long completion_string, int chunk_number, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCompletionChunkText getCompletionChunkText} */
    public static void nclang_getCompletionChunkText(long completion_string, int chunk_number, long __result) {
        long __functionAddress = Functions.getCompletionChunkText;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionChunkText(completion_string, chunk_number, __functionAddress, __result);
    }

    /**
     * Retrieve the text associated with a particular chunk within a completion string.
     *
     * @param completion_string the completion string to query
     * @param chunk_number      the 0-based index of the chunk in the completion string
     * @param __result          the text associated with the chunk at index {@code chunk_number}
     */
    public static CXString clang_getCompletionChunkText(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int chunk_number, CXString __result) {
        nclang_getCompletionChunkText(completion_string, chunk_number, __result.address());
        return __result;
    }

    // --- [ clang_getCompletionChunkCompletionString ] ---

    /**
     * Retrieve the completion string associated with a particular chunk within a completion string.
     *
     * @param completion_string the completion string to query
     * @param chunk_number      the 0-based index of the chunk in the completion string
     *
     * @return the completion string associated with the chunk at index {@code chunk_number}
     */
    @NativeType("CXCompletionString")
    public static long clang_getCompletionChunkCompletionString(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int chunk_number) {
        long __functionAddress = Functions.getCompletionChunkCompletionString;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePP(completion_string, chunk_number, __functionAddress);
    }

    // --- [ clang_getNumCompletionChunks ] ---

    /** Retrieve the number of chunks in the given code-completion string. */
    @NativeType("unsigned")
    public static int clang_getNumCompletionChunks(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getNumCompletionChunks;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionPriority ] ---

    /**
     * Determine the priority of this code completion.
     * 
     * <p>The priority of a code completion indicates how likely it is that this particular completion is the completion that the user will select. The priority
     * is selected by various internal heuristics.</p>
     *
     * @param completion_string the completion string to query
     *
     * @return the priority of this completion string. Smaller values indicate higher-priority (more likely) completions.
     */
    @NativeType("unsigned")
    public static int clang_getCompletionPriority(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getCompletionPriority;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionAvailability ] ---

    /**
     * Determine the availability of the entity that this code-completion string refers to.
     *
     * @param completion_string the completion string to query
     *
     * @return the availability of the completion string
     */
    @NativeType("enum CXAvailabilityKind")
    public static int clang_getCompletionAvailability(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getCompletionAvailability;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionNumAnnotations ] ---

    /**
     * Retrieve the number of annotations associated with the given completion string.
     *
     * @param completion_string the completion string to query
     *
     * @return the number of annotations associated with the given completion string
     */
    @NativeType("unsigned")
    public static int clang_getCompletionNumAnnotations(@NativeType("CXCompletionString") long completion_string) {
        long __functionAddress = Functions.getCompletionNumAnnotations;
        if (CHECKS) {
            check(completion_string);
        }
        return invokePI(completion_string, __functionAddress);
    }

    // --- [ clang_getCompletionAnnotation ] ---

    /** Unsafe version of: {@link #clang_getCompletionAnnotation getCompletionAnnotation} */
    public static native void nclang_getCompletionAnnotation(long completion_string, int annotation_number, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCompletionAnnotation getCompletionAnnotation} */
    public static void nclang_getCompletionAnnotation(long completion_string, int annotation_number, long __result) {
        long __functionAddress = Functions.getCompletionAnnotation;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionAnnotation(completion_string, annotation_number, __functionAddress, __result);
    }

    /**
     * Retrieve the annotation associated with the given completion string.
     *
     * @param completion_string the completion string to query
     * @param annotation_number the 0-based index of the annotation of the completion string
     * @param __result          annotation string associated with the completion at index {@code annotation_number}, or a {@code NULL} string if that annotation is not available
     */
    public static CXString clang_getCompletionAnnotation(@NativeType("CXCompletionString") long completion_string, @NativeType("unsigned") int annotation_number, CXString __result) {
        nclang_getCompletionAnnotation(completion_string, annotation_number, __result.address());
        return __result;
    }

    // --- [ clang_getCompletionParent ] ---

    /** Unsafe version of: {@link #clang_getCompletionParent getCompletionParent} */
    public static native void nclang_getCompletionParent(long completion_string, long kind, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCompletionParent getCompletionParent} */
    public static void nclang_getCompletionParent(long completion_string, long kind, long __result) {
        long __functionAddress = Functions.getCompletionParent;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionParent(completion_string, kind, __functionAddress, __result);
    }

    /**
     * Retrieve the parent context of the given completion string.
     * 
     * <p>The parent context of a completion string is the semantic parent of the declaration (if any) that the code completion represents. For example, a code
     * completion for an Objective-C method would have the method's class or protocol as its context.</p>
     *
     * @param completion_string the code completion string whose parent is being queried
     * @param kind              DEPRECATED: always set to {@link #CXCursor_NotImplemented Cursor_NotImplemented} if non-{@code NULL}
     * @param __result          the name of the completion parent, e.g., "NSObject" if the completion string represents a method in the {@code NSObject} class.
     */
    public static CXString clang_getCompletionParent(@NativeType("CXCompletionString") long completion_string, @Nullable @NativeType("enum CXCursorKind *") IntBuffer kind, CXString __result) {
        if (CHECKS) {
            checkSafe(kind, 1);
        }
        nclang_getCompletionParent(completion_string, memAddressSafe(kind), __result.address());
        return __result;
    }

    // --- [ clang_getCompletionBriefComment ] ---

    /** Unsafe version of: {@link #clang_getCompletionBriefComment getCompletionBriefComment} */
    public static native void nclang_getCompletionBriefComment(long completion_string, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCompletionBriefComment getCompletionBriefComment} */
    public static void nclang_getCompletionBriefComment(long completion_string, long __result) {
        long __functionAddress = Functions.getCompletionBriefComment;
        if (CHECKS) {
            check(completion_string);
        }
        nclang_getCompletionBriefComment(completion_string, __functionAddress, __result);
    }

    /** Retrieve the brief documentation comment attached to the declaration that corresponds to the given completion string. */
    public static CXString clang_getCompletionBriefComment(@NativeType("CXCompletionString") long completion_string, CXString __result) {
        nclang_getCompletionBriefComment(completion_string, __result.address());
        return __result;
    }

    // --- [ clang_getCursorCompletionString ] ---

    /** Unsafe version of: {@link #clang_getCursorCompletionString getCursorCompletionString} */
    public static long nclang_getCursorCompletionString(long cursor) {
        long __functionAddress = Functions.getCursorCompletionString;
        return invokePP(cursor, __functionAddress);
    }

    /**
     * Retrieve a completion string for an arbitrary declaration or macro definition cursor.
     *
     * @param cursor the cursor to query
     *
     * @return a non-context-sensitive completion string for declaration and macro definition cursors, or {@code NULL} for other kinds of cursors
     */
    @NativeType("CXCompletionString")
    public static long clang_getCursorCompletionString(CXCursor cursor) {
        return nclang_getCursorCompletionString(cursor.address());
    }

    // --- [ clang_getCompletionNumFixIts ] ---

    /** Unsafe version of: {@link #clang_getCompletionNumFixIts getCompletionNumFixIts} */
    public static int nclang_getCompletionNumFixIts(long results, int completion_index) {
        long __functionAddress = Functions.getCompletionNumFixIts;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePI(results, completion_index, __functionAddress);
    }

    /**
     * Retrieve the number of fix-its for the given completion index.
     * 
     * <p>Calling this makes sense only if {@link #CXCodeComplete_IncludeCompletionsWithFixIts CodeComplete_IncludeCompletionsWithFixIts} option was set.</p>
     *
     * @param results          the structure keeping all completion results
     * @param completion_index the index of the completion
     *
     * @return the number of fix-its which must be applied before the completion at {@code completion_index} can be applied
     */
    @NativeType("unsigned")
    public static int clang_getCompletionNumFixIts(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults results, @NativeType("unsigned") int completion_index) {
        return nclang_getCompletionNumFixIts(results.address(), completion_index);
    }

    // --- [ clang_getCompletionFixIt ] ---

    /** Unsafe version of: {@link #clang_getCompletionFixIt getCompletionFixIt} */
    public static native void nclang_getCompletionFixIt(long results, int completion_index, int fixit_index, long replacement_range, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getCompletionFixIt getCompletionFixIt} */
    public static void nclang_getCompletionFixIt(long results, int completion_index, int fixit_index, long replacement_range, long __result) {
        long __functionAddress = Functions.getCompletionFixIt;
        if (CHECKS) {
            check(__functionAddress);
        }
        nclang_getCompletionFixIt(results, completion_index, fixit_index, replacement_range, __functionAddress, __result);
    }

    /**
     * Fix-its that <b>must</b> be applied before inserting the text for the corresponding completion.
     * 
     * <p>By default, {@link #clang_codeCompleteAt codeCompleteAt} only returns completions with empty fix-its. Extra completions with non-empty fix-its should be explicitly requested
     * by setting {@link #CXCodeComplete_IncludeCompletionsWithFixIts CodeComplete_IncludeCompletionsWithFixIts}.</p>
     * 
     * <p>For the clients to be able to compute position of the cursor after applying fix-its, the following conditions are guaranteed to hold for
     * {@code replacement_range} of the stored fix-its:</p>
     * 
     * <ul>
     * <li>Ranges in the fix-its are guaranteed to never contain the completion point (or identifier under completion point, if any) inside them, except at
     * the start or at the end of the range.</li>
     * <li>If a fix-it range starts or ends with completion point (or starts or ends after the identifier under completion point), it will contain at least
     * one character. It allows to unambiguously recompute completion point after applying the fix-it.</li>
     * </ul>
     * 
     * <p>The intuition is that provided fix-its change code around the identifier we complete, but are not allowed to touch the identifier itself or the
     * completion point. One example of completions with corrections are the ones replacing '.' with '-&gt;' and vice versa:</p>
     * 
     * <p>{@code std::unique_ptr<std::vector<int>> vec_ptr;} In 'vec_ptr.^', one of the completions is 'push_back', it requires replacing '.' with '-&gt;'. In
     * 'vec_ptr-&gt;^', one of the completions is 'release', it requires replacing '-&gt;' with '.'.</p>
     *
     * @param results           the structure keeping all completion results
     * @param completion_index  the index of the completion
     * @param fixit_index       the index of the fix-it for the completion at {@code completion_index}
     * @param replacement_range the fix-it range that must be replaced before the completion at completion_index can be applied
     * @param __result          the fix-it string that must replace the code at replacement_range before the completion at completion_index can be applied
     */
    public static CXString clang_getCompletionFixIt(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults results, @NativeType("unsigned") int completion_index, @NativeType("unsigned") int fixit_index, @NativeType("CXSourceRange *") CXSourceRange replacement_range, CXString __result) {
        nclang_getCompletionFixIt(results.address(), completion_index, fixit_index, replacement_range.address(), __result.address());
        return __result;
    }

    // --- [ clang_defaultCodeCompleteOptions ] ---

    /** Returns a default set of code-completion options that can be passed to {@link #clang_codeCompleteAt codeCompleteAt}. */
    @NativeType("unsigned")
    public static int clang_defaultCodeCompleteOptions() {
        long __functionAddress = Functions.defaultCodeCompleteOptions;
        return invokeI(__functionAddress);
    }

    // --- [ clang_codeCompleteAt ] ---

    /**
     * Unsafe version of: {@link #clang_codeCompleteAt codeCompleteAt}
     *
     * @param num_unsaved_files the number of unsaved file entries in {@code unsaved_files}
     */
    public static long nclang_codeCompleteAt(long TU, long complete_filename, int complete_line, int complete_column, long unsaved_files, int num_unsaved_files, int options) {
        long __functionAddress = Functions.codeCompleteAt;
        if (CHECKS) {
            check(TU);
        }
        return invokePPPP(TU, complete_filename, complete_line, complete_column, unsaved_files, num_unsaved_files, options, __functionAddress);
    }

    /**
     * Perform code completion at a given location in a translation unit.
     * 
     * <p>This function performs code completion at a particular file, line, and column within source code, providing results that suggest potential code
     * snippets based on the context of the completion. The basic model for code completion is that Clang will parse a complete source file, performing syntax
     * checking up to the location where code-completion has been requested. At that point, a special code-completion token is passed to the parser, which
     * recognizes this token and determines, based on the current location in the C/Objective-C/C++ grammar and the state of semantic analysis, what
     * completions to provide. These completions are returned via a new {@code CXCodeCompleteResults} structure.</p>
     * 
     * <p>Code completion itself is meant to be triggered by the client when the user types punctuation characters or whitespace, at which point the
     * code-completion location will coincide with the cursor. For example, if {@code p} is a pointer, code-completion might be triggered after the "-" and
     * then after the "&gt;" in {@code p->}. When the code-completion location is after the "&gt;", the completion results will provide, e.g., the members of
     * the struct that "p" points to. The client is responsible for placing the cursor at the beginning of the token currently being typed, then filtering the
     * results based on the contents of the token. For example, when code-completing for the expression {@code p->get}, the client should provide the location
     * just after the "&gt;" (e.g., pointing at the "g") to this code-completion hook. Then, the client can filter the results based on the current token text
     * ("get"), only showing those results that start with "get". The intent of this interface is to separate the relatively high-latency acquisition of
     * code-completion results from the filtering of results on a per-character basis, which must have a lower latency.</p>
     *
     * @param TU                the translation unit in which code-completion should occur. The source files for this translation unit need not be completely up-to-date (and the
     *                          contents of those source files may be overridden via {@code unsaved_files}). Cursors referring into the translation unit may be invalidated by this
     *                          invocation.
     * @param complete_filename the name of the source file where code completion should be performed. This filename may be any file included in the translation unit.
     * @param complete_line     the line at which code-completion should occur
     * @param complete_column   the column at which code-completion should occur. Note that the column should point just after the syntactic construct that initiated code
     *                          completion, and not in the middle of a lexical token.
     * @param unsaved_files     the Files that have not yet been saved to disk but may be required for parsing or code completion, including the contents of those files. The
     *                          contents and name of these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their
     *                          validity until the call to this function returns.
     * @param options           extra options that control the behavior of code completion, expressed as a bitwise OR of the enumerators of the {@code CXCodeComplete_Flags}
     *                          enumeration. The {@link #clang_defaultCodeCompleteOptions defaultCodeCompleteOptions} function returns a default set of code-completion options.
     *
     * @return if successful, a new {@code CXCodeCompleteResults} structure containing code-completion results, which should eventually be freed with
     *         {@link #clang_disposeCodeCompleteResults disposeCodeCompleteResults}. If code completion fails, returns {@code NULL}.
     */
    @Nullable
    @NativeType("CXCodeCompleteResults *")
    public static CXCodeCompleteResults clang_codeCompleteAt(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") ByteBuffer complete_filename, @NativeType("unsigned") int complete_line, @NativeType("unsigned") int complete_column, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options) {
        if (CHECKS) {
            checkNT1(complete_filename);
        }
        long __result = nclang_codeCompleteAt(TU, memAddress(complete_filename), complete_line, complete_column, memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
        return CXCodeCompleteResults.createSafe(__result);
    }

    /**
     * Perform code completion at a given location in a translation unit.
     * 
     * <p>This function performs code completion at a particular file, line, and column within source code, providing results that suggest potential code
     * snippets based on the context of the completion. The basic model for code completion is that Clang will parse a complete source file, performing syntax
     * checking up to the location where code-completion has been requested. At that point, a special code-completion token is passed to the parser, which
     * recognizes this token and determines, based on the current location in the C/Objective-C/C++ grammar and the state of semantic analysis, what
     * completions to provide. These completions are returned via a new {@code CXCodeCompleteResults} structure.</p>
     * 
     * <p>Code completion itself is meant to be triggered by the client when the user types punctuation characters or whitespace, at which point the
     * code-completion location will coincide with the cursor. For example, if {@code p} is a pointer, code-completion might be triggered after the "-" and
     * then after the "&gt;" in {@code p->}. When the code-completion location is after the "&gt;", the completion results will provide, e.g., the members of
     * the struct that "p" points to. The client is responsible for placing the cursor at the beginning of the token currently being typed, then filtering the
     * results based on the contents of the token. For example, when code-completing for the expression {@code p->get}, the client should provide the location
     * just after the "&gt;" (e.g., pointing at the "g") to this code-completion hook. Then, the client can filter the results based on the current token text
     * ("get"), only showing those results that start with "get". The intent of this interface is to separate the relatively high-latency acquisition of
     * code-completion results from the filtering of results on a per-character basis, which must have a lower latency.</p>
     *
     * @param TU                the translation unit in which code-completion should occur. The source files for this translation unit need not be completely up-to-date (and the
     *                          contents of those source files may be overridden via {@code unsaved_files}). Cursors referring into the translation unit may be invalidated by this
     *                          invocation.
     * @param complete_filename the name of the source file where code completion should be performed. This filename may be any file included in the translation unit.
     * @param complete_line     the line at which code-completion should occur
     * @param complete_column   the column at which code-completion should occur. Note that the column should point just after the syntactic construct that initiated code
     *                          completion, and not in the middle of a lexical token.
     * @param unsaved_files     the Files that have not yet been saved to disk but may be required for parsing or code completion, including the contents of those files. The
     *                          contents and name of these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their
     *                          validity until the call to this function returns.
     * @param options           extra options that control the behavior of code completion, expressed as a bitwise OR of the enumerators of the {@code CXCodeComplete_Flags}
     *                          enumeration. The {@link #clang_defaultCodeCompleteOptions defaultCodeCompleteOptions} function returns a default set of code-completion options.
     *
     * @return if successful, a new {@code CXCodeCompleteResults} structure containing code-completion results, which should eventually be freed with
     *         {@link #clang_disposeCodeCompleteResults disposeCodeCompleteResults}. If code completion fails, returns {@code NULL}.
     */
    @Nullable
    @NativeType("CXCodeCompleteResults *")
    public static CXCodeCompleteResults clang_codeCompleteAt(@NativeType("CXTranslationUnit") long TU, @NativeType("char const *") CharSequence complete_filename, @NativeType("unsigned") int complete_line, @NativeType("unsigned") int complete_column, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @NativeType("unsigned") int options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(complete_filename, true);
            long complete_filenameEncoded = stack.getPointerAddress();
            long __result = nclang_codeCompleteAt(TU, complete_filenameEncoded, complete_line, complete_column, memAddressSafe(unsaved_files), remainingSafe(unsaved_files), options);
            return CXCodeCompleteResults.createSafe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_sortCodeCompletionResults ] ---

    /**
     * Unsafe version of: {@link #clang_sortCodeCompletionResults sortCodeCompletionResults}
     *
     * @param NumResults the number of results in {@code Results}
     */
    public static void nclang_sortCodeCompletionResults(long Results, int NumResults) {
        long __functionAddress = Functions.sortCodeCompletionResults;
        invokePV(Results, NumResults, __functionAddress);
    }

    /**
     * Sort the code-completion results in case-insensitive alphabetical order.
     *
     * @param Results the set of results to sort
     */
    public static void clang_sortCodeCompletionResults(@NativeType("CXCompletionResult *") CXCompletionResult.Buffer Results) {
        nclang_sortCodeCompletionResults(Results.address(), Results.remaining());
    }

    // --- [ clang_disposeCodeCompleteResults ] ---

    /** Unsafe version of: {@link #clang_disposeCodeCompleteResults disposeCodeCompleteResults} */
    public static void nclang_disposeCodeCompleteResults(long Results) {
        long __functionAddress = Functions.disposeCodeCompleteResults;
        invokePV(Results, __functionAddress);
    }

    /** Free the given set of code-completion results. */
    public static void clang_disposeCodeCompleteResults(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results) {
        nclang_disposeCodeCompleteResults(Results.address());
    }

    // --- [ clang_codeCompleteGetNumDiagnostics ] ---

    /** Unsafe version of: {@link #clang_codeCompleteGetNumDiagnostics codeCompleteGetNumDiagnostics} */
    public static int nclang_codeCompleteGetNumDiagnostics(long Results) {
        long __functionAddress = Functions.codeCompleteGetNumDiagnostics;
        return invokePI(Results, __functionAddress);
    }

    /** Determine the number of diagnostics produced prior to the location where code completion was performed. */
    @NativeType("unsigned")
    public static int clang_codeCompleteGetNumDiagnostics(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results) {
        return nclang_codeCompleteGetNumDiagnostics(Results.address());
    }

    // --- [ clang_codeCompleteGetDiagnostic ] ---

    /** Unsafe version of: {@link #clang_codeCompleteGetDiagnostic codeCompleteGetDiagnostic} */
    public static long nclang_codeCompleteGetDiagnostic(long Results, int Index) {
        long __functionAddress = Functions.codeCompleteGetDiagnostic;
        return invokePP(Results, Index, __functionAddress);
    }

    /**
     * Retrieve a diagnostic associated with the given code completion.
     *
     * @param Results the code completion results to query
     * @param Index   the zero-based diagnostic number to retrieve
     *
     * @return the requested diagnostic. This diagnostic must be freed via a call to {@link #clang_disposeDiagnostic disposeDiagnostic}.
     */
    @NativeType("CXDiagnostic")
    public static long clang_codeCompleteGetDiagnostic(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, @NativeType("unsigned") int Index) {
        return nclang_codeCompleteGetDiagnostic(Results.address(), Index);
    }

    // --- [ clang_codeCompleteGetContexts ] ---

    /** Unsafe version of: {@link #clang_codeCompleteGetContexts codeCompleteGetContexts} */
    public static long nclang_codeCompleteGetContexts(long Results) {
        long __functionAddress = Functions.codeCompleteGetContexts;
        return invokePJ(Results, __functionAddress);
    }

    /**
     * Determines what completions are appropriate for the context the given code completion.
     *
     * @param Results the code completion results to query
     *
     * @return the kinds of completions that are appropriate for use along with the given code completion results
     */
    @NativeType("unsigned long long")
    public static long clang_codeCompleteGetContexts(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results) {
        return nclang_codeCompleteGetContexts(Results.address());
    }

    // --- [ clang_codeCompleteGetContainerKind ] ---

    /** Unsafe version of: {@link #clang_codeCompleteGetContainerKind codeCompleteGetContainerKind} */
    public static int nclang_codeCompleteGetContainerKind(long Results, long IsIncomplete) {
        long __functionAddress = Functions.codeCompleteGetContainerKind;
        return invokePPI(Results, IsIncomplete, __functionAddress);
    }

    /**
     * Returns the cursor kind for the container for the current code completion context. The container is only guaranteed to be set for contexts where a
     * container exists (i.e. member accesses or Objective-C message sends); if there is not a container, this function will return {@link #CXCursor_InvalidCode Cursor_InvalidCode}.
     *
     * @param Results      the code completion results to query
     * @param IsIncomplete on return, this value will be false if Clang has complete information about the container. If Clang does not have complete information, this value
     *                     will be true.
     *
     * @return the container kind, or {@link #CXCursor_InvalidCode Cursor_InvalidCode} if there is not a container
     */
    @NativeType("enum CXCursorKind")
    public static int clang_codeCompleteGetContainerKind(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, @NativeType("unsigned *") IntBuffer IsIncomplete) {
        if (CHECKS) {
            check(IsIncomplete, 1);
        }
        return nclang_codeCompleteGetContainerKind(Results.address(), memAddress(IsIncomplete));
    }

    // --- [ clang_codeCompleteGetContainerUSR ] ---

    /** Unsafe version of: {@link #clang_codeCompleteGetContainerUSR codeCompleteGetContainerUSR} */
    public static native void nclang_codeCompleteGetContainerUSR(long Results, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_codeCompleteGetContainerUSR codeCompleteGetContainerUSR} */
    public static void nclang_codeCompleteGetContainerUSR(long Results, long __result) {
        long __functionAddress = Functions.codeCompleteGetContainerUSR;
        nclang_codeCompleteGetContainerUSR(Results, __functionAddress, __result);
    }

    /**
     * Returns the USR for the container for the current code completion context. If there is not a container for the current context, this function will
     * return the empty string.
     *
     * @param Results  the code completion results to query
     * @param __result the USR for the container
     */
    public static CXString clang_codeCompleteGetContainerUSR(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, CXString __result) {
        nclang_codeCompleteGetContainerUSR(Results.address(), __result.address());
        return __result;
    }

    // --- [ clang_codeCompleteGetObjCSelector ] ---

    /** Unsafe version of: {@link #clang_codeCompleteGetObjCSelector codeCompleteGetObjCSelector} */
    public static native void nclang_codeCompleteGetObjCSelector(long Results, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_codeCompleteGetObjCSelector codeCompleteGetObjCSelector} */
    public static void nclang_codeCompleteGetObjCSelector(long Results, long __result) {
        long __functionAddress = Functions.codeCompleteGetObjCSelector;
        nclang_codeCompleteGetObjCSelector(Results, __functionAddress, __result);
    }

    /**
     * Returns the currently-entered selector for an Objective-C message send, formatted like "initWithFoo:bar:". Only guaranteed to return a non-empty string
     * for {@link #CXCompletionContext_ObjCInstanceMessage CompletionContext_ObjCInstanceMessage} and {@link #CXCompletionContext_ObjCClassMessage CompletionContext_ObjCClassMessage}.
     *
     * @param Results  the code completion results to query
     * @param __result the selector (or partial selector) that has been entered thus far for an Objective-C message send
     */
    public static CXString clang_codeCompleteGetObjCSelector(@NativeType("CXCodeCompleteResults *") CXCodeCompleteResults Results, CXString __result) {
        nclang_codeCompleteGetObjCSelector(Results.address(), __result.address());
        return __result;
    }

    // --- [ clang_getClangVersion ] ---

    /** Unsafe version of: {@link #clang_getClangVersion getClangVersion} */
    public static native void nclang_getClangVersion(long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_getClangVersion getClangVersion} */
    public static void nclang_getClangVersion(long __result) {
        long __functionAddress = Functions.getClangVersion;
        nclang_getClangVersion(__functionAddress, __result);
    }

    /** Return a version string, suitable for showing to a user, but not intended to be parsed (the format is not guaranteed to be stable). */
    public static CXString clang_getClangVersion(CXString __result) {
        nclang_getClangVersion(__result.address());
        return __result;
    }

    // --- [ clang_toggleCrashRecovery ] ---

    /**
     * Enable/disable crash recovery.
     *
     * @param isEnabled flag to indicate if crash recovery is enabled.  A non-zero value enables crash recovery, while 0 disables it.
     */
    public static void clang_toggleCrashRecovery(@NativeType("unsigned") boolean isEnabled) {
        long __functionAddress = Functions.toggleCrashRecovery;
        invokeV(isEnabled ? 1 : 0, __functionAddress);
    }

    // --- [ clang_getInclusions ] ---

    /** Unsafe version of: {@link #clang_getInclusions getInclusions} */
    public static void nclang_getInclusions(long tu, long visitor, long client_data) {
        long __functionAddress = Functions.getInclusions;
        if (CHECKS) {
            check(tu);
        }
        invokePPPV(tu, visitor, client_data, __functionAddress);
    }

    /**
     * Visit the set of preprocessor inclusions in a translation unit. The visitor function is called with the provided data for every included file. This
     * does not include headers included by the PCH file (unless one is inspecting the inclusions in the PCH file itself).
     */
    public static void clang_getInclusions(@NativeType("CXTranslationUnit") long tu, @NativeType("void (*) (CXFile, CXSourceLocation *, unsigned, CXClientData)") CXInclusionVisitorI visitor, @NativeType("CXClientData") long client_data) {
        nclang_getInclusions(tu, visitor.address(), client_data);
    }

    // --- [ clang_Cursor_Evaluate ] ---

    /** Unsafe version of: {@link #clang_Cursor_Evaluate Cursor_Evaluate} */
    public static long nclang_Cursor_Evaluate(long C) {
        long __functionAddress = Functions.Cursor_Evaluate;
        return invokePP(C, __functionAddress);
    }

    /**
     * If cursor is a statement declaration tries to evaluate the statement and if its variable, tries to evaluate its initializer, into its corresponding
     * type.
     */
    @NativeType("CXEvalResult")
    public static long clang_Cursor_Evaluate(CXCursor C) {
        return nclang_Cursor_Evaluate(C.address());
    }

    // --- [ clang_EvalResult_getKind ] ---

    /** Returns the kind of the evaluated result. */
    @NativeType("CXEvalResultKind")
    public static int clang_EvalResult_getKind(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getKind;
        if (CHECKS) {
            check(E);
        }
        return invokePI(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsInt ] ---

    /** Returns the evaluation result as integer if the kind is Int. */
    public static int clang_EvalResult_getAsInt(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsInt;
        if (CHECKS) {
            check(E);
        }
        return invokePI(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsLongLong ] ---

    /**
     * Returns the evaluation result as a long long integer if the kind is Int. This prevents overflows that may happen if the result is returned with
     * {@link #clang_EvalResult_getAsInt EvalResult_getAsInt}.
     */
    @NativeType("long long")
    public static long clang_EvalResult_getAsLongLong(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsLongLong;
        if (CHECKS) {
            check(E);
        }
        return invokePJ(E, __functionAddress);
    }

    // --- [ clang_EvalResult_isUnsignedInt ] ---

    /** Returns a non-zero value if the kind is Int and the evaluation result resulted in an unsigned integer. */
    @NativeType("unsigned")
    public static boolean clang_EvalResult_isUnsignedInt(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_isUnsignedInt;
        if (CHECKS) {
            check(E);
        }
        return invokePI(E, __functionAddress) != 0;
    }

    // --- [ clang_EvalResult_getAsUnsigned ] ---

    /** Returns the evaluation result as an unsigned integer if the kind is Int and {@link #clang_EvalResult_isUnsignedInt EvalResult_isUnsignedInt} is non-zero. */
    @NativeType("unsigned long long")
    public static long clang_EvalResult_getAsUnsigned(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsUnsigned;
        if (CHECKS) {
            check(E);
        }
        return invokePJ(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsDouble ] ---

    /** Returns the evaluation result as double if the kind is double. */
    public static double clang_EvalResult_getAsDouble(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_getAsDouble;
        if (CHECKS) {
            check(E);
        }
        return invokePD(E, __functionAddress);
    }

    // --- [ clang_EvalResult_getAsStr ] ---

    /** Unsafe version of: {@link #clang_EvalResult_getAsStr EvalResult_getAsStr} */
    public static long nclang_EvalResult_getAsStr(long E) {
        long __functionAddress = Functions.EvalResult_getAsStr;
        if (CHECKS) {
            check(E);
        }
        return invokePP(E, __functionAddress);
    }

    /**
     * Returns the evaluation result as a constant string if the kind is other than Int or float. User must not free this pointer, instead call
     * {@link #clang_EvalResult_dispose EvalResult_dispose} on the {@code CXEvalResult} returned by {@link #clang_Cursor_Evaluate Cursor_Evaluate}.
     */
    @Nullable
    @NativeType("char const *")
    public static String clang_EvalResult_getAsStr(@NativeType("CXEvalResult") long E) {
        long __result = nclang_EvalResult_getAsStr(E);
        return memUTF8Safe(__result);
    }

    // --- [ clang_EvalResult_dispose ] ---

    /** Disposes the created {@code Eval} memory. */
    public static void clang_EvalResult_dispose(@NativeType("CXEvalResult") long E) {
        long __functionAddress = Functions.EvalResult_dispose;
        if (CHECKS) {
            check(E);
        }
        invokePV(E, __functionAddress);
    }

    // --- [ clang_getRemappings ] ---

    /** Unsafe version of: {@link #clang_getRemappings getRemappings} */
    public static long nclang_getRemappings(long path) {
        long __functionAddress = Functions.getRemappings;
        return invokePP(path, __functionAddress);
    }

    /**
     * Retrieve a remapping.
     *
     * @param path the path that contains metadata about remappings
     *
     * @return the requested remapping. This remapping must be freed via a call to {@link #clang_remap_dispose remap_dispose}. Can return {@code NULL} if an error occurred.
     */
    @NativeType("CXRemapping")
    public static long clang_getRemappings(@NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nclang_getRemappings(memAddress(path));
    }

    /**
     * Retrieve a remapping.
     *
     * @param path the path that contains metadata about remappings
     *
     * @return the requested remapping. This remapping must be freed via a call to {@link #clang_remap_dispose remap_dispose}. Can return {@code NULL} if an error occurred.
     */
    @NativeType("CXRemapping")
    public static long clang_getRemappings(@NativeType("char const *") CharSequence path) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nclang_getRemappings(pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_getRemappingsFromFileList ] ---

    /**
     * Unsafe version of: {@link #clang_getRemappingsFromFileList getRemappingsFromFileList}
     *
     * @param numFiles number of file paths
     */
    public static long nclang_getRemappingsFromFileList(long filePaths, int numFiles) {
        long __functionAddress = Functions.getRemappingsFromFileList;
        return invokePP(filePaths, numFiles, __functionAddress);
    }

    /**
     * Retrieve a remapping.
     *
     * @param filePaths pointer to an array of file paths containing remapping info
     *
     * @return the requested remapping. This remapping must be freed via a call to {@link #clang_remap_dispose remap_dispose}. Can return {@code NULL} if an error occurred.
     */
    @NativeType("CXRemapping")
    public static long clang_getRemappingsFromFileList(@NativeType("char const **") PointerBuffer filePaths) {
        return nclang_getRemappingsFromFileList(memAddress(filePaths), filePaths.remaining());
    }

    // --- [ clang_remap_getNumFiles ] ---

    /** Determine the number of remappings. */
    @NativeType("unsigned")
    public static int clang_remap_getNumFiles(@NativeType("CXRemapping") long Remapping) {
        long __functionAddress = Functions.remap_getNumFiles;
        if (CHECKS) {
            check(Remapping);
        }
        return invokePI(Remapping, __functionAddress);
    }

    // --- [ clang_remap_getFilenames ] ---

    /** Unsafe version of: {@link #clang_remap_getFilenames remap_getFilenames} */
    public static void nclang_remap_getFilenames(long Remapping, int index, long original, long transformed) {
        long __functionAddress = Functions.remap_getFilenames;
        if (CHECKS) {
            check(Remapping);
        }
        invokePPPV(Remapping, index, original, transformed, __functionAddress);
    }

    /**
     * Get the original and the associated filename from the remapping.
     *
     * @param original    if non-{@code NULL}, will be set to the original filename
     * @param transformed if non-{@code NULL}, will be set to the filename that the original is associated with
     */
    public static void clang_remap_getFilenames(@NativeType("CXRemapping") long Remapping, @NativeType("unsigned") int index, @Nullable @NativeType("CXString *") CXString original, @Nullable @NativeType("CXString *") CXString transformed) {
        nclang_remap_getFilenames(Remapping, index, memAddressSafe(original), memAddressSafe(transformed));
    }

    // --- [ clang_remap_dispose ] ---

    /** Dispose the remapping. */
    public static void clang_remap_dispose(@NativeType("CXRemapping") long Remapping) {
        long __functionAddress = Functions.remap_dispose;
        if (CHECKS) {
            check(Remapping);
        }
        invokePV(Remapping, __functionAddress);
    }

    // --- [ clang_findReferencesInFile ] ---

    /** Unsafe version of: {@link #clang_findReferencesInFile findReferencesInFile} */
    public static int nclang_findReferencesInFile(long cursor, long file, long visitor) {
        long __functionAddress = Functions.findReferencesInFile;
        if (CHECKS) {
            check(file);
            CXCursorAndRangeVisitor.validate(visitor);
        }
        return invokePPPI(cursor, file, visitor, __functionAddress);
    }

    /**
     * Find references of a declaration in a specific file.
     *
     * @param cursor  pointing to a declaration or a reference of one
     * @param file    to search for references
     * @param visitor callback that will receive pairs of {@code CXCursor/CXSourceRange} for each reference found. The {@code CXSourceRange} will point inside the file;
     *                if the reference is inside a macro (and not a macro argument) the {@code CXSourceRange} will be invalid.
     *
     * @return one of the {@code CXResult} enumerators
     */
    @NativeType("CXResult")
    public static int clang_findReferencesInFile(CXCursor cursor, @NativeType("CXFile") long file, CXCursorAndRangeVisitor visitor) {
        return nclang_findReferencesInFile(cursor.address(), file, visitor.address());
    }

    // --- [ clang_findIncludesInFile ] ---

    /** Unsafe version of: {@link #clang_findIncludesInFile findIncludesInFile} */
    public static int nclang_findIncludesInFile(long TU, long file, long visitor) {
        long __functionAddress = Functions.findIncludesInFile;
        if (CHECKS) {
            check(TU);
            check(file);
            CXCursorAndRangeVisitor.validate(visitor);
        }
        return invokePPPI(TU, file, visitor, __functionAddress);
    }

    /**
     * Find {@code #import/#include} directives in a specific file.
     *
     * @param TU      translation unit containing the file to query
     * @param file    to search for {@code #import/#include} directives
     * @param visitor callback that will receive pairs of {@code CXCursor/CXSourceRange} for each directive found
     *
     * @return one of the CXResult enumerators
     */
    @NativeType("CXResult")
    public static int clang_findIncludesInFile(@NativeType("CXTranslationUnit") long TU, @NativeType("CXFile") long file, CXCursorAndRangeVisitor visitor) {
        return nclang_findIncludesInFile(TU, file, visitor.address());
    }

    // --- [ clang_index_isEntityObjCContainerKind ] ---

    @NativeType("int")
    public static boolean clang_index_isEntityObjCContainerKind(@NativeType("CXIdxEntityKind") int kind) {
        long __functionAddress = Functions.index_isEntityObjCContainerKind;
        return invokeI(kind, __functionAddress) != 0;
    }

    // --- [ clang_index_getObjCContainerDeclInfo ] ---

    public static long nclang_index_getObjCContainerDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCContainerDeclInfo;
        return invokePP(info, __functionAddress);
    }

    @Nullable
    @NativeType("CXIdxObjCContainerDeclInfo const *")
    public static CXIdxObjCContainerDeclInfo clang_index_getObjCContainerDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCContainerDeclInfo(info.address());
        return CXIdxObjCContainerDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCInterfaceDeclInfo ] ---

    public static long nclang_index_getObjCInterfaceDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCInterfaceDeclInfo;
        return invokePP(info, __functionAddress);
    }

    @Nullable
    @NativeType("CXIdxObjCInterfaceDeclInfo const *")
    public static CXIdxObjCInterfaceDeclInfo clang_index_getObjCInterfaceDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCInterfaceDeclInfo(info.address());
        return CXIdxObjCInterfaceDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCCategoryDeclInfo ] ---

    public static long nclang_index_getObjCCategoryDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCCategoryDeclInfo;
        return invokePP(info, __functionAddress);
    }

    @Nullable
    @NativeType("CXIdxObjCCategoryDeclInfo const *")
    public static CXIdxObjCCategoryDeclInfo clang_index_getObjCCategoryDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCCategoryDeclInfo(info.address());
        return CXIdxObjCCategoryDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCProtocolRefListInfo ] ---

    public static long nclang_index_getObjCProtocolRefListInfo(long info) {
        long __functionAddress = Functions.index_getObjCProtocolRefListInfo;
        return invokePP(info, __functionAddress);
    }

    @Nullable
    @NativeType("CXIdxObjCProtocolRefListInfo const *")
    public static CXIdxObjCProtocolRefListInfo clang_index_getObjCProtocolRefListInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCProtocolRefListInfo(info.address());
        return CXIdxObjCProtocolRefListInfo.createSafe(__result);
    }

    // --- [ clang_index_getObjCPropertyDeclInfo ] ---

    public static long nclang_index_getObjCPropertyDeclInfo(long info) {
        long __functionAddress = Functions.index_getObjCPropertyDeclInfo;
        return invokePP(info, __functionAddress);
    }

    @Nullable
    @NativeType("CXIdxObjCPropertyDeclInfo const *")
    public static CXIdxObjCPropertyDeclInfo clang_index_getObjCPropertyDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getObjCPropertyDeclInfo(info.address());
        return CXIdxObjCPropertyDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getIBOutletCollectionAttrInfo ] ---

    public static long nclang_index_getIBOutletCollectionAttrInfo(long info) {
        long __functionAddress = Functions.index_getIBOutletCollectionAttrInfo;
        return invokePP(info, __functionAddress);
    }

    @Nullable
    @NativeType("CXIdxIBOutletCollectionAttrInfo const *")
    public static CXIdxIBOutletCollectionAttrInfo clang_index_getIBOutletCollectionAttrInfo(@NativeType("CXIdxAttrInfo const *") CXIdxAttrInfo info) {
        long __result = nclang_index_getIBOutletCollectionAttrInfo(info.address());
        return CXIdxIBOutletCollectionAttrInfo.createSafe(__result);
    }

    // --- [ clang_index_getCXXClassDeclInfo ] ---

    public static long nclang_index_getCXXClassDeclInfo(long info) {
        long __functionAddress = Functions.index_getCXXClassDeclInfo;
        return invokePP(info, __functionAddress);
    }

    @Nullable
    @NativeType("CXIdxCXXClassDeclInfo const *")
    public static CXIdxCXXClassDeclInfo clang_index_getCXXClassDeclInfo(@NativeType("CXIdxDeclInfo const *") CXIdxDeclInfo info) {
        long __result = nclang_index_getCXXClassDeclInfo(info.address());
        return CXIdxCXXClassDeclInfo.createSafe(__result);
    }

    // --- [ clang_index_getClientContainer ] ---

    /** Unsafe version of: {@link #clang_index_getClientContainer index_getClientContainer} */
    public static long nclang_index_getClientContainer(long info) {
        long __functionAddress = Functions.index_getClientContainer;
        return invokePP(info, __functionAddress);
    }

    /** For retrieving a custom {@code CXIdxClientContainer} attached to a container. */
    @NativeType("CXIdxClientContainer")
    public static long clang_index_getClientContainer(@NativeType("CXIdxContainerInfo const *") CXIdxContainerInfo info) {
        return nclang_index_getClientContainer(info.address());
    }

    // --- [ clang_index_setClientContainer ] ---

    /** Unsafe version of: {@link #clang_index_setClientContainer index_setClientContainer} */
    public static void nclang_index_setClientContainer(long info, long container) {
        long __functionAddress = Functions.index_setClientContainer;
        if (CHECKS) {
            check(container);
        }
        invokePPV(info, container, __functionAddress);
    }

    /** For setting a custom {@code CXIdxClientContainer} attached to a container. */
    public static void clang_index_setClientContainer(@NativeType("CXIdxContainerInfo const *") CXIdxContainerInfo info, @NativeType("CXIdxClientContainer") long container) {
        nclang_index_setClientContainer(info.address(), container);
    }

    // --- [ clang_index_getClientEntity ] ---

    /** Unsafe version of: {@link #clang_index_getClientEntity index_getClientEntity} */
    public static long nclang_index_getClientEntity(long info) {
        long __functionAddress = Functions.index_getClientEntity;
        return invokePP(info, __functionAddress);
    }

    /** For retrieving a custom {@code CXIdxClientEntity} attached to an entity. */
    @NativeType("CXIdxClientEntity")
    public static long clang_index_getClientEntity(@NativeType("CXIdxEntityInfo const *") CXIdxEntityInfo info) {
        return nclang_index_getClientEntity(info.address());
    }

    // --- [ clang_index_setClientEntity ] ---

    /** Unsafe version of: {@link #clang_index_setClientEntity index_setClientEntity} */
    public static void nclang_index_setClientEntity(long info, long entity) {
        long __functionAddress = Functions.index_setClientEntity;
        if (CHECKS) {
            check(entity);
        }
        invokePPV(info, entity, __functionAddress);
    }

    /** For setting a custom {@code CXIdxClientEntity} attached to an entity. */
    public static void clang_index_setClientEntity(@NativeType("CXIdxEntityInfo const *") CXIdxEntityInfo info, @NativeType("CXIdxClientEntity") long entity) {
        nclang_index_setClientEntity(info.address(), entity);
    }

    // --- [ clang_IndexAction_create ] ---

    /**
     * An indexing action/session, to be applied to one or multiple translation units.
     *
     * @param CIdx the index object with which the index action will be associated
     */
    @NativeType("CXIndexAction")
    public static long clang_IndexAction_create(@NativeType("CXIndex") long CIdx) {
        long __functionAddress = Functions.IndexAction_create;
        if (CHECKS) {
            check(CIdx);
        }
        return invokePP(CIdx, __functionAddress);
    }

    // --- [ clang_IndexAction_dispose ] ---

    /**
     * Destroy the given index action.
     * 
     * <p>The index action must not be destroyed until all of the translation units created within that index action have been destroyed.</p>
     */
    public static void clang_IndexAction_dispose(@NativeType("CXIndexAction") long action) {
        long __functionAddress = Functions.IndexAction_dispose;
        if (CHECKS) {
            check(action);
        }
        invokePV(action, __functionAddress);
    }

    // --- [ clang_indexSourceFile ] ---

    /** Unsafe version of: {@link #clang_indexSourceFile indexSourceFile} */
    public static int nclang_indexSourceFile(long action, long client_data, long index_callbacks, int index_callbacks_size, int index_options, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, long out_TU, int TU_options) {
        long __functionAddress = Functions.indexSourceFile;
        if (CHECKS) {
            check(action);
        }
        return invokePPPPPPPI(action, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options, __functionAddress);
    }

    /**
     * Index the given source file and the translation unit corresponding to that file via callbacks implemented through {@link IndexerCallbacks}.
     * 
     * <p>The rest of the parameters are the same as {@link #clang_parseTranslationUnit parseTranslationUnit}.</p>
     *
     * @param client_data          pointer data supplied by the client, which will be passed to the invoked callbacks
     * @param index_callbacks      pointer to indexing callbacks that the client implements
     * @param index_callbacks_size size of {@link IndexerCallbacks} structure that gets passed in {@code index_callbacks}
     * @param index_options        a bitmask of options that affects how indexing is performed. This should be a bitwise OR of the {@code CXIndexOpt_XXX} flags.
     * @param out_TU               pointer to store a {@code CXTranslationUnit} that can be reused after indexing is finished. Set to {@code NULL} if you do not require it.
     *
     * @return 0 on success or if there were errors from which the compiler could recover. If there is a failure from which there is no recovery, returns a non-zero
     *         {@code CXErrorCode}.
     */
    public static int clang_indexSourceFile(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") ByteBuffer source_filename, @Nullable @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @Nullable @NativeType("CXTranslationUnit *") PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkNT1(source_filename);
            checkSafe(out_TU, 1);
        }
        return nclang_indexSourceFile(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, memAddress(source_filename), memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
    }

    /**
     * Index the given source file and the translation unit corresponding to that file via callbacks implemented through {@link IndexerCallbacks}.
     * 
     * <p>The rest of the parameters are the same as {@link #clang_parseTranslationUnit parseTranslationUnit}.</p>
     *
     * @param client_data          pointer data supplied by the client, which will be passed to the invoked callbacks
     * @param index_callbacks      pointer to indexing callbacks that the client implements
     * @param index_callbacks_size size of {@link IndexerCallbacks} structure that gets passed in {@code index_callbacks}
     * @param index_options        a bitmask of options that affects how indexing is performed. This should be a bitwise OR of the {@code CXIndexOpt_XXX} flags.
     * @param out_TU               pointer to store a {@code CXTranslationUnit} that can be reused after indexing is finished. Set to {@code NULL} if you do not require it.
     *
     * @return 0 on success or if there were errors from which the compiler could recover. If there is a failure from which there is no recovery, returns a non-zero
     *         {@code CXErrorCode}.
     */
    public static int clang_indexSourceFile(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") CharSequence source_filename, @Nullable @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @Nullable @NativeType("CXTranslationUnit *") PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkSafe(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(source_filename, true);
            long source_filenameEncoded = stack.getPointerAddress();
            return nclang_indexSourceFile(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, source_filenameEncoded, memAddressSafe(command_line_args), remainingSafe(command_line_args), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_indexSourceFileFullArgv ] ---

    /** Unsafe version of: {@link #clang_indexSourceFileFullArgv indexSourceFileFullArgv} */
    public static int nclang_indexSourceFileFullArgv(long action, long client_data, long index_callbacks, int index_callbacks_size, int index_options, long source_filename, long command_line_args, int num_command_line_args, long unsaved_files, int num_unsaved_files, long out_TU, int TU_options) {
        long __functionAddress = Functions.indexSourceFileFullArgv;
        if (CHECKS) {
            check(action);
        }
        return invokePPPPPPPI(action, client_data, index_callbacks, index_callbacks_size, index_options, source_filename, command_line_args, num_command_line_args, unsaved_files, num_unsaved_files, out_TU, TU_options, __functionAddress);
    }

    /**
     * Same as {@link #clang_indexSourceFile indexSourceFile} but requires a full command line for {@code command_line_args} including {@code argv[0]}. This is useful if the standard
     * library paths are relative to the binary.
     */
    public static int clang_indexSourceFileFullArgv(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") ByteBuffer source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @Nullable @NativeType("CXTranslationUnit *") PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkNT1(source_filename);
            checkSafe(out_TU, 1);
        }
        return nclang_indexSourceFileFullArgv(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, memAddress(source_filename), memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
    }

    /**
     * Same as {@link #clang_indexSourceFile indexSourceFile} but requires a full command line for {@code command_line_args} including {@code argv[0]}. This is useful if the standard
     * library paths are relative to the binary.
     */
    public static int clang_indexSourceFileFullArgv(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("char const *") CharSequence source_filename, @NativeType("char const * const *") PointerBuffer command_line_args, @Nullable @NativeType("struct CXUnsavedFile *") CXUnsavedFile.Buffer unsaved_files, @Nullable @NativeType("CXTranslationUnit *") PointerBuffer out_TU, @NativeType("unsigned") int TU_options) {
        if (CHECKS) {
            checkSafe(out_TU, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(source_filename, true);
            long source_filenameEncoded = stack.getPointerAddress();
            return nclang_indexSourceFileFullArgv(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, source_filenameEncoded, memAddress(command_line_args), command_line_args.remaining(), memAddressSafe(unsaved_files), remainingSafe(unsaved_files), memAddressSafe(out_TU), TU_options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clang_indexTranslationUnit ] ---

    /** Unsafe version of: {@link #clang_indexTranslationUnit indexTranslationUnit} */
    public static int nclang_indexTranslationUnit(long action, long client_data, long index_callbacks, int index_callbacks_size, int index_options, long TU) {
        long __functionAddress = Functions.indexTranslationUnit;
        if (CHECKS) {
            check(action);
            check(TU);
        }
        return invokePPPPI(action, client_data, index_callbacks, index_callbacks_size, index_options, TU, __functionAddress);
    }

    /**
     * Index the given translation unit via callbacks implemented through {@link IndexerCallbacks}.
     * 
     * <p>The order of callback invocations is not guaranteed to be the same as when indexing a source file. The high level order will be:</p>
     * 
     * <ul>
     * <li>Preprocessor callbacks invocations</li>
     * <li>Declaration/reference callbacks invocations</li>
     * <li>Diagnostic callback invocations</li>
     * </ul>
     * 
     * <p>The parameters are the same as {@link #clang_indexSourceFile indexSourceFile}.</p>
     *
     * @return if there is a failure from which there is no recovery, returns non-zero, otherwise returns 0
     */
    @NativeType("int")
    public static boolean clang_indexTranslationUnit(@NativeType("CXIndexAction") long action, @NativeType("CXClientData") long client_data, @NativeType("IndexerCallbacks *") IndexerCallbacks index_callbacks, @NativeType("unsigned") int index_callbacks_size, @NativeType("unsigned") int index_options, @NativeType("CXTranslationUnit") long TU) {
        return nclang_indexTranslationUnit(action, client_data, index_callbacks.address(), index_callbacks_size, index_options, TU) != 0;
    }

    // --- [ clang_indexLoc_getFileLocation ] ---

    /** Unsafe version of: {@link #clang_indexLoc_getFileLocation indexLoc_getFileLocation} */
    public static void nclang_indexLoc_getFileLocation(long loc, long indexFile, long file, long line, long column, long offset) {
        long __functionAddress = Functions.indexLoc_getFileLocation;
        invokePPPPPPV(loc, indexFile, file, line, column, offset, __functionAddress);
    }

    /**
     * Retrieve the {@code CXIdxFile}, file, line, column, and offset represented by the given {@code CXIdxLoc}.
     * 
     * <p>If the location refers into a macro expansion, retrieves the location of the macro expansion and if it refers into a macro argument retrieves the
     * location of the argument.</p>
     */
    public static void clang_indexLoc_getFileLocation(CXIdxLoc loc, @Nullable @NativeType("CXIdxClientFile *") PointerBuffer indexFile, @Nullable @NativeType("CXFile *") PointerBuffer file, @Nullable @NativeType("unsigned *") IntBuffer line, @Nullable @NativeType("unsigned *") IntBuffer column, @Nullable @NativeType("unsigned *") IntBuffer offset) {
        if (CHECKS) {
            checkSafe(indexFile, 1);
            checkSafe(file, 1);
            checkSafe(line, 1);
            checkSafe(column, 1);
            checkSafe(offset, 1);
        }
        nclang_indexLoc_getFileLocation(loc.address(), memAddressSafe(indexFile), memAddressSafe(file), memAddressSafe(line), memAddressSafe(column), memAddressSafe(offset));
    }

    // --- [ clang_indexLoc_getCXSourceLocation ] ---

    /** Unsafe version of: {@link #clang_indexLoc_getCXSourceLocation indexLoc_getCXSourceLocation} */
    public static native void nclang_indexLoc_getCXSourceLocation(long loc, long __functionAddress, long __result);

    /** Unsafe version of: {@link #clang_indexLoc_getCXSourceLocation indexLoc_getCXSourceLocation} */
    public static void nclang_indexLoc_getCXSourceLocation(long loc, long __result) {
        long __functionAddress = Functions.indexLoc_getCXSourceLocation;
        nclang_indexLoc_getCXSourceLocation(loc, __functionAddress, __result);
    }

    /** Retrieve the {@code CXSourceLocation} represented by the given {@code CXIdxLoc}. */
    public static CXSourceLocation clang_indexLoc_getCXSourceLocation(CXIdxLoc loc, CXSourceLocation __result) {
        nclang_indexLoc_getCXSourceLocation(loc.address(), __result.address());
        return __result;
    }

    // --- [ clang_Type_visitFields ] ---

    /** Unsafe version of: {@link #clang_Type_visitFields Type_visitFields} */
    public static int nclang_Type_visitFields(long T, long visitor, long client_data) {
        long __functionAddress = Functions.Type_visitFields;
        if (CHECKS) {
            check(client_data);
        }
        return invokePPPI(T, visitor, client_data, __functionAddress);
    }

    /**
     * Visit the fields of a particular type.
     * 
     * <p>This function visits all the direct fields of the given cursor, invoking the given {@code visitor} function with the cursors of each visited field. The
     * traversal may be ended prematurely, if the visitor returns {@link #CXVisit_Break Visit_Break}.</p>
     *
     * @param T       the record type whose field may be visited
     * @param visitor the visitor function that will be invoked for each field of {@code T}
     *
     * @return a non-zero value if the traversal was terminated prematurely by the visitor returning {@link #CXVisit_Break Visit_Break}
     */
    @NativeType("unsigned")
    public static boolean clang_Type_visitFields(CXType T, @NativeType("enum CXVisitorResult (*) (CXCursor, CXClientData)") CXFieldVisitorI visitor) {
        return nclang_Type_visitFields(T.address(), CXFieldVisitor.DELEGATE, visitor.address()) != 0;
    }

}