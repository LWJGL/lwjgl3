/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val ClangIndex = "ClangIndex".nativeClass(
    Module.LLVM,
    prefixConstant = "CX",
    prefixMethod = "clang_",
    binding = CLANG_BINDING
) {
    nativeImport("clang-c/Index.h")

    IntConstant(
        "",

        "CINDEX_VERSION_MAJOR".."0",
        "CINDEX_VERSION_MINOR".."50"
    ).noPrefix()

        EnumConstant(
        """
        Error codes returned by libclang routines. ({@code enum CXErrorCode})

        Zero ({@code CXError_Success}) is the only error code indicating success. Other error codes, including not yet assigned non-zero values, indicate
        errors.
        """,

        "Error_Success".enum("No error.", "0"),
        "Error_Failure".enum(
            """
            A generic error code, no further details are available.

            Errors of this kind can get their own specific error codes in future libclang versions.
            """
        ),
        "Error_Crashed".enum("libclang crashed while performing the requested operation."),
        "Error_InvalidArguments".enum("The function detected that the arguments violate the function contract."),
        "Error_ASTReadError".enum("An AST deserialization error has occurred.")
    )

    EnumConstant(
        """
        Describes the availability of a particular entity, which indicates whether the use of this entity will result in a warning or error due to it being
        deprecated or unavailable.

        ({@code enum CXAvailabilityKind})
        """,

        "Availability_Available".enum("The entity is available.", "0"),
        "Availability_Deprecated".enum("The entity is available, but has been deprecated (and its use is not recommended)."),
        "Availability_NotAvailable".enum("The entity is not available; any use of it will be an error."),
        "Availability_NotAccessible".enum("The entity is available, but not accessible; any use of it will be an error.")
    )

    EnumConstant(
        """
        Describes the exception specification of a cursor. ({@code enum CXCursor_ExceptionSpecificationKind})

        A negative value indicates that the cursor is not a function declaration.
        """,

        "Cursor_ExceptionSpecificationKind_None".enum("The cursor has no exception specification.", "0"),
        "Cursor_ExceptionSpecificationKind_DynamicNone".enum("The cursor has exception specification throw()"),
        "Cursor_ExceptionSpecificationKind_Dynamic".enum("The cursor has exception specification throw(T1, T2)"),
        "Cursor_ExceptionSpecificationKind_MSAny".enum("The cursor has exception specification throw(...)."),
        "Cursor_ExceptionSpecificationKind_BasicNoexcept".enum("The cursor has exception specification basic noexcept."),
        "Cursor_ExceptionSpecificationKind_ComputedNoexcept".enum("The cursor has exception specification computed noexcept."),
        "Cursor_ExceptionSpecificationKind_Unevaluated".enum("The exception specification has not yet been evaluated."),
        "Cursor_ExceptionSpecificationKind_Uninstantiated".enum("The exception specification has not yet been instantiated."),
        "Cursor_ExceptionSpecificationKind_Unparsed".enum("The exception specification has not been parsed yet.")
    )

    EnumConstant(
        "{@code CXGlobalOptFlags}",

        "GlobalOpt_None".enum("Used to indicate that no special CXIndex options are needed.", "0x0"),
        "GlobalOpt_ThreadBackgroundPriorityForIndexing".enum(
            """
            Used to indicate that threads that libclang creates for indexing purposes should use background priority.

            Affects #indexSourceFile(), #indexTranslationUnit(), #parseTranslationUnit(), #saveTranslationUnit().
            """,
            "0x1"
        ),
        "GlobalOpt_ThreadBackgroundPriorityForEditing".enum(
            """
            Used to indicate that threads that libclang creates for editing purposes should use background priority.

            Affects #reparseTranslationUnit(), #codeCompleteAt(), #annotateTokens()
            """,
            "0x2"
        ),
        "GlobalOpt_ThreadBackgroundPriorityForAll".enum(
            "Used to indicate that all threads that libclang creates should use background priority.",
            "CXGlobalOpt_ThreadBackgroundPriorityForIndexing | CXGlobalOpt_ThreadBackgroundPriorityForEditing"
        )
    )

    EnumConstant(
        """
        Describes the severity of a particular diagnostic.

        ({@code enum CXDiagnosticSeverity})
        """,

        "Diagnostic_Ignored".enum("A diagnostic that has been suppressed, e.g., by a command-line option.", "0"),
        "Diagnostic_Note".enum("This diagnostic is a note that should be attached to the previous (non-note) diagnostic."),
        "Diagnostic_Warning".enum("This diagnostic indicates suspicious code that may not be wrong."),
        "Diagnostic_Error".enum("This diagnostic indicates that the code is ill-formed."),
        "Diagnostic_Fatal".enum(
            "This diagnostic indicates that the code is ill-formed such that future parser recovery is unlikely to produce useful results."
        )
    )

    EnumConstant(
        """
        Describes the kind of error that occurred (if any) in a call to {@code clang_loadDiagnostics}.

        ({@code enum CXLoadDiag_Error})
        """,

        "LoadDiag_None".enum("Indicates that no error occurred.", "0"),
        "LoadDiag_Unknown".enum("Indicates that an unknown error occurred while attempting to deserialize diagnostics."),
        "LoadDiag_CannotLoad".enum("Indicates that the file containing the serialized diagnostics could not be opened."),
        "LoadDiag_InvalidFile".enum("Indicates that the serialized diagnostics file is invalid or corrupt.")
    )

    EnumConstant(
        """
        Options to control the display of diagnostics. ({@code enum CXDiagnosticDisplayOptions})

        The values in this enum are meant to be combined to customize the behavior of {@code clang_formatDiagnostic()}.
        """,

        "Diagnostic_DisplaySourceLocation".enum(
            """
            Display the source-location information where the diagnostic was located.

            When set, diagnostics will be prefixed by the file, line, and (optionally) column to which the diagnostic refers. For example,

            ${codeBlock("""
 test.c:28: warning: extra tokens at end of \#endif directive""")}

            This option corresponds to the clang flag {@code -fshow-source-location}.
            """,
            "0x01"
        ),
        "Diagnostic_DisplayColumn".enum(
            """
            If displaying the source-location information of the diagnostic, also include the column number.

            This option corresponds to the clang flag {@code -fshow-column}.
            """,
            "0x02"
        ),
        "Diagnostic_DisplaySourceRanges".enum(
            """
            If displaying the source-location information of the diagnostic, also include information about source ranges in a machine-parsable format.

            This option corresponds to the clang flag {@code -fdiagnostics-print-source-range-info}.
            """,
            "0x04"
        ),
        "Diagnostic_DisplayOption".enum(
            """
            Display the option name associated with this diagnostic, if any.

            The option name displayed (e.g., -Wconversion) will be placed in brackets after the diagnostic text. This option corresponds to the clang flag
            {@code -fdiagnostics-show-option}.
            """,
            "0x08"
        ),
        "Diagnostic_DisplayCategoryId".enum(
            """
            Display the category number associated with this diagnostic, if any.

            The category number is displayed within brackets after the diagnostic text. This option corresponds to the clang flag {@code
            -fdiagnostics-show-category=id}.
            """,
            "0x10"
        ),
        "Diagnostic_DisplayCategoryName".enum(
            """
            Display the category name associated with this diagnostic, if any.

            The category name is displayed within brackets after the diagnostic text. This option corresponds to the clang flag {@code
            -fdiagnostics-show-category=name}.
            """,
            "0x20"
        )
    )

    EnumConstant(
        """
        Flags that control the creation of translation units. ({@code enum CXTranslationUnit_Flags})

        The enumerators in this enumeration type are meant to be bitwise ORed together to specify which options should be used when constructing the
        translation unit.
        """,

        "TranslationUnit_None".enum("Used to indicate that no special translation-unit options are needed.", "0x0"),
        "TranslationUnit_DetailedPreprocessingRecord".enum(
            """
            Used to indicate that the parser should construct a "detailed" preprocessing record, including all macro definitions and instantiations.

            Constructing a detailed preprocessing record requires more memory and time to parse, since the information contained in the record is usually not
            retained. However, it can be useful for applications that require more detailed information about the behavior of the preprocessor.
            """,
            "0x01"
        ),
        "TranslationUnit_Incomplete".enum(
            """
            Used to indicate that the translation unit is incomplete.

            When a translation unit is considered "incomplete", semantic analysis that is typically performed at the end of the translation unit will be
            suppressed. For example, this suppresses the completion of tentative declarations in C and of instantiation of implicitly-instantiation function
            templates in C++. This option is typically used when parsing a header with the intent of producing a precompiled header.
            """,
            "0x02"
        ),
        "TranslationUnit_PrecompiledPreamble".enum(
            """
            Used to indicate that the translation unit should be built with an implicit precompiled header for the preamble.

            An implicit precompiled header is used as an optimization when a particular translation unit is likely to be reparsed many times when the sources
            aren't changing that often. In this case, an implicit precompiled header will be built containing all of the initial includes at the top of the
            main file (what we refer to as the "preamble" of the file). In subsequent parses, if the preamble or the files in it have not changed, {@code
            clang_reparseTranslationUnit()} will re-use the implicit precompiled header to improve parsing performance.
            """,
            "0x04"
        ),
        "TranslationUnit_CacheCompletionResults".enum(
            """
            Used to indicate that the translation unit should cache some code-completion results with each reparse of the source file.

            Caching of code-completion results is a performance optimization that introduces some overhead to reparsing but improves the performance of
            code-completion operations.
            """,
            "0x08"
        ),
        "TranslationUnit_ForSerialization".enum(
            """
            Used to indicate that the translation unit will be serialized with {@code clang_saveTranslationUnit}.

            This option is typically used when parsing a header with the intent of producing a precompiled header.
            """,
            "0x10"
        ),
        "TranslationUnit_CXXChainedPCH".enum(
            """
            DEPRECATED: Enabled chained precompiled preambles in C++.

            Note: this is a *temporary* option that is available only while we are testing C++ precompiled preamble support. It is deprecated.
            """,
            "0x20"
        ),
        "TranslationUnit_SkipFunctionBodies".enum(
            """
            Used to indicate that function/method bodies should be skipped while parsing.

            This option can be used to search for declarations/definitions while ignoring the usages.
            """,
            "0x40"
        ),
        "TranslationUnit_IncludeBriefCommentsInCodeCompletion".enum(
            "Used to indicate that brief documentation comments should be included into the set of code completions returned from this translation unit.",
            "0x80"
        ),
        "TranslationUnit_CreatePreambleOnFirstParse".enum(
            """
            Used to indicate that the precompiled preamble should be created on the first parse. Otherwise it will be created on the first reparse. This trades
            runtime on the first parse (serializing the preamble takes time) for reduced runtime on the second parse (can now reuse the preamble).
            """,
            "0x100"
        ),
        "TranslationUnit_KeepGoing".enum(
            """
            Do not stop processing when fatal errors are encountered.

            When fatal errors are encountered while parsing a translation unit, semantic analysis is typically stopped early when compiling code. A common
            source for fatal errors are unresolvable include files. For the purposes of an IDE, this is undesirable behavior and as much information as
            possible should be reported. Use this flag to enable this behavior.
            """,
            "0x200"
        ),
        "TranslationUnit_SingleFileParse".enum("Sets the preprocessor in a mode for parsing a single file only.", "0x400"),
        "TranslationUnit_LimitSkipFunctionBodiesToPreamble".enum(
            """
            Used in combination with CXTranslationUnit_SkipFunctionBodies to constrain the skipping of function bodies to the preamble.

            The function bodies of the main file are not skipped.
            """,
            "0x800"
        ),
        "TranslationUnit_IncludeAttributedTypes".enum("Used to indicate that attributed types should be included in CXType.", "0x1000"),
        "TranslationUnit_VisitImplicitAttributes".enum("Used to indicate that implicit attributes should be visited.", "0x2000")
    )

    EnumConstant(
        """
        Flags that control how translation units are saved. ({@code enum CXSaveTranslationUnit_Flags})

        The enumerators in this enumeration type are meant to be bitwise ORed together to specify which options should be used when saving the translation
        unit.
        """,

        "SaveTranslationUnit_None".enum("Used to indicate that no special saving options are needed.", "0x0")
    )

    EnumConstant(
        """
        Describes the kind of error that occurred (if any) in a call to {@code clang_saveTranslationUnit()}.

        ({@code enum CXSaveError})
        """,

        "SaveError_None".enum("Indicates that no error occurred while saving a translation unit.", "0"),
        "SaveError_Unknown".enum(
            """
            Indicates that an unknown error occurred while attempting to save the file.

            This error typically indicates that file I/O failed when attempting to write the file.
            """
        ),
        "SaveError_TranslationErrors".enum(
            """
            Indicates that errors during translation prevented this attempt to save the translation unit.

            Errors that prevent the translation unit from being saved can be extracted using {@code clang_getNumDiagnostics()} and {@code
            clang_getDiagnostic()}.
            """
        ),
        "SaveError_InvalidTU".enum("Indicates that the translation unit to be saved was somehow invalid (e.g., #NULL).")
    )

    EnumConstant(
        """
        Flags that control the reparsing of translation units. ({@code enum CXReparse_Flags})

        The enumerators in this enumeration type are meant to be bitwise ORed together to specify which options should be used when reparsing the translation
        unit.
        """,

        "Reparse_None".enum("Used to indicate that no special reparsing options are needed.", "0x0")
    )

    EnumConstant(
        """
        Categorizes how memory is being used by a translation unit.

        ({@code enum CXTUResourceUsageKind})
        """,

        "TUResourceUsage_AST".enum("", "1"),
        "TUResourceUsage_Identifiers".enum,
        "TUResourceUsage_Selectors".enum,
        "TUResourceUsage_GlobalCompletionResults".enum,
        "TUResourceUsage_SourceManagerContentCache".enum,
        "TUResourceUsage_AST_SideTables".enum,
        "TUResourceUsage_SourceManager_Membuffer_Malloc".enum,
        "TUResourceUsage_SourceManager_Membuffer_MMap".enum,
        "TUResourceUsage_ExternalASTSource_Membuffer_Malloc".enum,
        "TUResourceUsage_ExternalASTSource_Membuffer_MMap".enum,
        "TUResourceUsage_Preprocessor".enum,
        "TUResourceUsage_PreprocessingRecord".enum,
        "TUResourceUsage_SourceManager_DataStructures".enum,
        "TUResourceUsage_Preprocessor_HeaderSearch".enum,
        "TUResourceUsage_MEMORY_IN_BYTES_BEGIN".enum("", "CXTUResourceUsage_AST"),
        "TUResourceUsage_MEMORY_IN_BYTES_END".enum("", "CXTUResourceUsage_Preprocessor_HeaderSearch"),
        "TUResourceUsage_First".enum("", "CXTUResourceUsage_AST"),
        "TUResourceUsage_Last".enum("", "CXTUResourceUsage_Preprocessor_HeaderSearch")
    )

    EnumConstant(
        """
        Describes the kind of entity that a cursor refers to.

        ({@code enum CXCursorKind})
        """,

        "Cursor_UnexposedDecl".enum(
            """
            Declarations

            A declaration whose specific kind is not exposed via this interface.

            Unexposed declarations have the same operations as any other kind of declaration; one can extract their location information, spelling, find their
            definitions, etc. However, the specific kind of the declaration is not reported.
            """,
            "1"
        ),
        "Cursor_StructDecl".enum("A C or C++ struct."),
        "Cursor_UnionDecl".enum("A C or C++ union."),
        "Cursor_ClassDecl".enum("A C++ class."),
        "Cursor_EnumDecl".enum("An enumeration."),
        "Cursor_FieldDecl".enum("A field (in C) or non-static data member (in C++) in a struct, union, or C++ class."),
        "Cursor_EnumConstantDecl".enum("An enumerator constant."),
        "Cursor_FunctionDecl".enum("A function."),
        "Cursor_VarDecl".enum("A variable."),
        "Cursor_ParmDecl".enum("A function or method parameter."),
        "Cursor_ObjCInterfaceDecl".enum("An Objective-C @ interface."),
        "Cursor_ObjCCategoryDecl".enum("An Objective-C @ interface for a category."),
        "Cursor_ObjCProtocolDecl".enum("An Objective-C @ protocol declaration."),
        "Cursor_ObjCPropertyDecl".enum("An Objective-C @ property declaration."),
        "Cursor_ObjCIvarDecl".enum("An Objective-C instance variable."),
        "Cursor_ObjCInstanceMethodDecl".enum("An Objective-C instance method."),
        "Cursor_ObjCClassMethodDecl".enum("An Objective-C class method."),
        "Cursor_ObjCImplementationDecl".enum("An Objective-C @ implementation."),
        "Cursor_ObjCCategoryImplDecl".enum("An Objective-C @ implementation for a category."),
        "Cursor_TypedefDecl".enum("A typedef."),
        "Cursor_CXXMethod".enum("A C++ class method."),
        "Cursor_Namespace".enum("A C++ namespace."),
        "Cursor_LinkageSpec".enum("A linkage specification, e.g. 'extern \"C\"'."),
        "Cursor_Constructor".enum("A C++ constructor."),
        "Cursor_Destructor".enum("A C++ destructor."),
        "Cursor_ConversionFunction".enum("A C++ conversion function."),
        "Cursor_TemplateTypeParameter".enum("A C++ template type parameter."),
        "Cursor_NonTypeTemplateParameter".enum("A C++ non-type template parameter."),
        "Cursor_TemplateTemplateParameter".enum("A C++ template template parameter."),
        "Cursor_FunctionTemplate".enum("A C++ function template."),
        "Cursor_ClassTemplate".enum("A C++ class template."),
        "Cursor_ClassTemplatePartialSpecialization".enum("A C++ class template partial specialization."),
        "Cursor_NamespaceAlias".enum("A C++ namespace alias declaration."),
        "Cursor_UsingDirective".enum("A C++ using directive."),
        "Cursor_UsingDeclaration".enum("A C++ using declaration."),
        "Cursor_TypeAliasDecl".enum("A C++ alias declaration"),
        "Cursor_ObjCSynthesizeDecl".enum("An Objective-C @ synthesize definition."),
        "Cursor_ObjCDynamicDecl".enum("An Objective-C @ dynamic definition."),
        "Cursor_CXXAccessSpecifier".enum("An access specifier."),
        "Cursor_FirstDecl".enum("An access specifier.", "CXCursor_UnexposedDecl"),
        "Cursor_LastDecl".enum("An access specifier.", "CXCursor_CXXAccessSpecifier"),
        "Cursor_FirstRef".enum("Decl references", "40"),
        "Cursor_ObjCSuperClassRef".enum("", "40"),
        "Cursor_ObjCProtocolRef".enum,
        "Cursor_ObjCClassRef".enum,
        "Cursor_TypeRef".enum(
            """
            A reference to a type declaration.

            A type reference occurs anywhere where a type is named but not declared. For example, given:

            ${codeBlock("""
 typedef unsigned size_type;
 size_type size;""")}

            The typedef is a declaration of size_type (CXCursor_TypedefDecl), while the type of the variable "size" is referenced. The cursor referenced by the
            type of size is the typedef for size_type.
            """
        ),
        "Cursor_CXXBaseSpecifier".enum(
            """
            A reference to a type declaration.

            A type reference occurs anywhere where a type is named but not declared. For example, given:

            ${codeBlock("""
 typedef unsigned size_type;
 size_type size;""")}

            The typedef is a declaration of size_type (CXCursor_TypedefDecl), while the type of the variable "size" is referenced. The cursor referenced by the
            type of size is the typedef for size_type.
            """
        ),
        "Cursor_TemplateRef".enum(
            "A reference to a class template, function template, template template parameter, or class template partial specialization."
        ),
        "Cursor_NamespaceRef".enum("A reference to a namespace or namespace alias."),
        "Cursor_MemberRef".enum(
            "A reference to a member of a struct, union, or class that occurs in some non-expression context, e.g., a designated initializer."
        ),
        "Cursor_LabelRef".enum(
            """
            A reference to a labeled statement.

            This cursor kind is used to describe the jump to "start_over" in the goto statement in the following example:

            ${codeBlock("""
   start_over:
     ++counter;

     goto start_over;""")}

            A label reference cursor refers to a label statement.
            """
        ),
        "Cursor_OverloadedDeclRef".enum(
            """
            A reference to a set of overloaded functions or function templates that has not yet been resolved to a specific function or function template.

            An overloaded declaration reference cursor occurs in C++ templates where a dependent name refers to a function. For example:

            ${codeBlock("""
 template<typename T> void swap(T&, T&);

 struct X { ... };
 void swap(X&, X&);

 template<typename T>
 void reverse(T* first, T* last) {
   while (first < last - 1) {
     swap(*first, *--last);
     ++first;
   }
 }

 struct Y { };
 void swap(Y&, Y&);""")}

            Here, the identifier "swap" is associated with an overloaded declaration reference. In the template definition, "swap" refers to either of the two
            "swap" functions declared above, so both results will be available. At instantiation time, "swap" may also refer to other functions found via
            argument-dependent lookup (e.g., the "swap" function at the end of the example).

            The functions {@code clang_getNumOverloadedDecls()} and {@code clang_getOverloadedDecl()} can be used to retrieve the definitions referenced by
            this cursor.
            """
        ),
        "Cursor_VariableRef".enum("A reference to a variable that occurs in some non-expression context, e.g., a C++ lambda capture list."),
        "Cursor_LastRef".enum(
            "A reference to a variable that occurs in some non-expression context, e.g., a C++ lambda capture list.",
            "CXCursor_VariableRef"
        ),
        "Cursor_FirstInvalid".enum("Error conditions", "70"),
        "Cursor_InvalidFile".enum("Error conditions", "70"),
        "Cursor_NoDeclFound".enum("Error conditions"),
        "Cursor_NotImplemented".enum("Error conditions"),
        "Cursor_InvalidCode".enum("Error conditions"),
        "Cursor_LastInvalid".enum("Error conditions", "CXCursor_InvalidCode"),
        "Cursor_FirstExpr".enum("Expressions", "100"),
        "Cursor_UnexposedExpr".enum(
            """
            An expression whose specific kind is not exposed via this interface.

            Unexposed expressions have the same operations as any other kind of expression; one can extract their location information, spelling, children,
            etc. However, the specific kind of the expression is not reported.
            """,
            "100"
        ),
        "Cursor_DeclRefExpr".enum("An expression that refers to some value declaration, such as a function, variable, or enumerator."),
        "Cursor_MemberRefExpr".enum("An expression that refers to a member of a struct, union, class, Objective-C class, etc."),
        "Cursor_CallExpr".enum("An expression that calls a function."),
        "Cursor_ObjCMessageExpr".enum("An expression that sends a message to an Objective-C object or class."),
        "Cursor_BlockExpr".enum("An expression that represents a block literal."),
        "Cursor_IntegerLiteral".enum("An integer literal."),
        "Cursor_FloatingLiteral".enum("A floating point number literal."),
        "Cursor_ImaginaryLiteral".enum("An imaginary number literal."),
        "Cursor_StringLiteral".enum("A string literal."),
        "Cursor_CharacterLiteral".enum("A character literal."),
        "Cursor_ParenExpr".enum(
            """
            A parenthesized expression, e.g. "(1)".

            This AST node is only formed if full location information is requested.
            """
        ),
        "Cursor_UnaryOperator".enum("This represents the unary-expression's (except sizeof and alignof)."),
        "Cursor_ArraySubscriptExpr".enum("[C99 6.5.2.1] Array Subscripting."),
        "Cursor_BinaryOperator".enum("A builtin binary operation expression such as \"x + y\" or \"x &lt;= y\"."),
        "Cursor_CompoundAssignOperator".enum("Compound assignment such as \"+=\"."),
        "Cursor_ConditionalOperator".enum("The ?: ternary operator."),
        "Cursor_CStyleCastExpr".enum(
            """
            An explicit cast in C (C99 6.5.4) or a C-style cast in C++ (C++ [expr.cast]), which uses the syntax (Type)expr.

            For example: (int)f.
            """
        ),
        "Cursor_CompoundLiteralExpr".enum("[C99 6.5.2.5]"),
        "Cursor_InitListExpr".enum("Describes an C or C++ initializer list."),
        "Cursor_AddrLabelExpr".enum("The GNU address of label extension, representing {@code &&label}."),
        "Cursor_StmtExpr".enum("This is the GNU Statement Expression extension: ({int X=4; X;})"),
        "Cursor_GenericSelectionExpr".enum("Represents a C11 generic selection."),
        "Cursor_GNUNullExpr".enum(
            """
            Implements the GNU __null extension, which is a name for a null pointer constant that has integral type (e.g., int or long) and is the same size
            and alignment as a pointer.

            The __null extension is typically only used by system headers, which define #NULL as __null in C++ rather than using 0 (which is an integer that
            may not match the size of a pointer).
            """
        ),
        "Cursor_CXXStaticCastExpr".enum("C++'s static_cast &lt;&gt; expression."),
        "Cursor_CXXDynamicCastExpr".enum("C++'s dynamic_cast &lt;&gt; expression."),
        "Cursor_CXXReinterpretCastExpr".enum("C++'s reinterpret_cast &lt;&gt; expression."),
        "Cursor_CXXConstCastExpr".enum("C++'s const_cast &lt;&gt; expression."),
        "Cursor_CXXFunctionalCastExpr".enum(
            """
            Represents an explicit C++ type conversion that uses "functional" notion (C++ [expr.type.conv]).

            Example:

            ${codeBlock("""
   x = int(0.5);""")}
            """
        ),
        "Cursor_CXXTypeidExpr".enum("A C++ typeid expression (C++ [expr.typeid])."),
        "Cursor_CXXBoolLiteralExpr".enum("[C++ 2.13.5] C++ Boolean Literal."),
        "Cursor_CXXNullPtrLiteralExpr".enum("[C++0x 2.14.7] C++ Pointer Literal."),
        "Cursor_CXXThisExpr".enum("Represents the \"this\" expression in C++"),
        "Cursor_CXXThrowExpr".enum(
            """
            [C++ 15] C++ Throw Expression.

            This handles 'throw' and 'throw' assignment-expression. When assignment-expression isn't present, Op will be null.
            """
        ),
        "Cursor_CXXNewExpr".enum("A new expression for memory allocation and constructor calls, e.g: \"new CXXNewExpr(foo)\"."),
        "Cursor_CXXDeleteExpr".enum("A delete expression for memory deallocation and destructor calls, e.g. \"delete[] pArray\"."),
        "Cursor_UnaryExpr".enum("A unary expression. (noexcept, sizeof, or other traits)"),
        "Cursor_ObjCStringLiteral".enum("An Objective-C string literal i.e. \" foo\"."),
        "Cursor_ObjCEncodeExpr".enum("An Objective-C @ encode expression."),
        "Cursor_ObjCSelectorExpr".enum("An Objective-C @ selector expression."),
        "Cursor_ObjCProtocolExpr".enum("An Objective-C @ protocol expression."),
        "Cursor_ObjCBridgedCastExpr".enum(
            """
            An Objective-C "bridged" cast expression, which casts between Objective-C pointers and C pointers, transferring ownership in the process.

            ${codeBlock("""
   NSString *str = (__bridge_transfer NSString *)CFCreateString();""")}
            """
        ),
        "Cursor_PackExpansionExpr".enum(
            """
            Represents a C++0x pack expansion that produces a sequence of expressions.

            A pack expansion expression contains a pattern (which itself is an expression) followed by an ellipsis. For example:

            ${codeBlock("""
 template<typename F, typename ...Types>
 void forward(F f, Types &&...args) {
  f(static_cast<Types&&>(args)...);
 }""")}
            """
        ),
        "Cursor_SizeOfPackExpr".enum(
            """
            Represents an expression that computes the length of a parameter pack.

            ${codeBlock("""
 template<typename ...Types>
 struct count {
   static const unsigned value = sizeof...(Types);
 };""")}
            """
        ),
        "Cursor_LambdaExpr".enum(
            """
            Represents a C++ lambda expression that produces a local function object.

            ${codeBlock("""
 void abssort(float *x, unsigned N) {
   std::sort(x, x + N,
             [](float a, float b) {
               return std::abs(a) < std::abs(b);
             });
 }""")}
            """
        ),
        "Cursor_ObjCBoolLiteralExpr".enum("Objective-c Boolean Literal."),
        "Cursor_ObjCSelfExpr".enum("Represents the \"self\" expression in an Objective-C method."),
        "Cursor_OMPArraySectionExpr".enum("OpenMP 4.0 [2.4, Array Section]."),
        "Cursor_ObjCAvailabilityCheckExpr".enum("Represents an {@code @available (...)} check."),
        "Cursor_FixedPointLiteral".enum("Fixed point literal"),
        "Cursor_LastExpr".enum("Fixed point literal", "CXCursor_FixedPointLiteral"),
        "Cursor_FirstStmt".enum("Statements", "200"),
        "Cursor_UnexposedStmt".enum(
            """
            A statement whose specific kind is not exposed via this interface.

            Unexposed statements have the same operations as any other kind of statement; one can extract their location information, spelling, children, etc.
            However, the specific kind of the statement is not reported.
            """,
            "200"
        ),
        "Cursor_LabelStmt".enum(
            """
            A labelled statement in a function.

            This cursor kind is used to describe the "start_over:" label statement in the following example:

            ${codeBlock("""
   start_over:
     ++counter;""")}
            """
        ),
        "Cursor_CompoundStmt".enum(
            """
            A group of statements like { stmt stmt }.

            This cursor kind is used to describe compound statements, e.g. function bodies.
            """
        ),
        "Cursor_CaseStmt".enum("A case statement."),
        "Cursor_DefaultStmt".enum("A default statement."),
        "Cursor_IfStmt".enum("An if statement"),
        "Cursor_SwitchStmt".enum("A switch statement."),
        "Cursor_WhileStmt".enum("A while statement."),
        "Cursor_DoStmt".enum("A do statement."),
        "Cursor_ForStmt".enum("A for statement."),
        "Cursor_GotoStmt".enum("A goto statement."),
        "Cursor_IndirectGotoStmt".enum("An indirect goto statement."),
        "Cursor_ContinueStmt".enum("A continue statement."),
        "Cursor_BreakStmt".enum("A break statement."),
        "Cursor_ReturnStmt".enum("A return statement."),
        "Cursor_GCCAsmStmt".enum("A GCC inline assembly statement extension."),
        "Cursor_AsmStmt".enum("A GCC inline assembly statement extension.", "CXCursor_GCCAsmStmt"),
        "Cursor_ObjCAtTryStmt".enum("Objective-C's overall @ try- @ catch- @ finally statement.", "216"),
        "Cursor_ObjCAtCatchStmt".enum("Objective-C's @ catch statement."),
        "Cursor_ObjCAtFinallyStmt".enum("Objective-C's @ finally statement."),
        "Cursor_ObjCAtThrowStmt".enum("Objective-C's @ throw statement."),
        "Cursor_ObjCAtSynchronizedStmt".enum("Objective-C's @ synchronized statement."),
        "Cursor_ObjCAutoreleasePoolStmt".enum("Objective-C's autorelease pool statement."),
        "Cursor_ObjCForCollectionStmt".enum("Objective-C's collection statement."),
        "Cursor_CXXCatchStmt".enum("C++'s catch statement."),
        "Cursor_CXXTryStmt".enum("C++'s try statement."),
        "Cursor_CXXForRangeStmt".enum("C++'s for (* : *) statement."),
        "Cursor_SEHTryStmt".enum("Windows Structured Exception Handling's try statement."),
        "Cursor_SEHExceptStmt".enum("Windows Structured Exception Handling's except statement."),
        "Cursor_SEHFinallyStmt".enum("Windows Structured Exception Handling's finally statement."),
        "Cursor_MSAsmStmt".enum("A MS inline assembly statement extension."),
        "Cursor_NullStmt".enum(
            """
            The null statement ";": C99 6.8.3p3.

            This cursor kind is used to describe the null statement.
            """
        ),
        "Cursor_DeclStmt".enum("Adaptor class for mixing declarations with statements and expressions."),
        "Cursor_OMPParallelDirective".enum("OpenMP parallel directive."),
        "Cursor_OMPSimdDirective".enum("OpenMP SIMD directive."),
        "Cursor_OMPForDirective".enum("OpenMP for directive."),
        "Cursor_OMPSectionsDirective".enum("OpenMP sections directive."),
        "Cursor_OMPSectionDirective".enum("OpenMP section directive."),
        "Cursor_OMPSingleDirective".enum("OpenMP single directive."),
        "Cursor_OMPParallelForDirective".enum("OpenMP parallel for directive."),
        "Cursor_OMPParallelSectionsDirective".enum("OpenMP parallel sections directive."),
        "Cursor_OMPTaskDirective".enum("OpenMP task directive."),
        "Cursor_OMPMasterDirective".enum("OpenMP master directive."),
        "Cursor_OMPCriticalDirective".enum("OpenMP critical directive."),
        "Cursor_OMPTaskyieldDirective".enum("OpenMP taskyield directive."),
        "Cursor_OMPBarrierDirective".enum("OpenMP barrier directive."),
        "Cursor_OMPTaskwaitDirective".enum("OpenMP taskwait directive."),
        "Cursor_OMPFlushDirective".enum("OpenMP flush directive."),
        "Cursor_SEHLeaveStmt".enum("Windows Structured Exception Handling's leave statement."),
        "Cursor_OMPOrderedDirective".enum("OpenMP ordered directive."),
        "Cursor_OMPAtomicDirective".enum("OpenMP atomic directive."),
        "Cursor_OMPForSimdDirective".enum("OpenMP for SIMD directive."),
        "Cursor_OMPParallelForSimdDirective".enum("OpenMP parallel for SIMD directive."),
        "Cursor_OMPTargetDirective".enum("OpenMP target directive."),
        "Cursor_OMPTeamsDirective".enum("OpenMP teams directive."),
        "Cursor_OMPTaskgroupDirective".enum("OpenMP taskgroup directive."),
        "Cursor_OMPCancellationPointDirective".enum("OpenMP cancellation point directive."),
        "Cursor_OMPCancelDirective".enum("OpenMP cancel directive."),
        "Cursor_OMPTargetDataDirective".enum("OpenMP target data directive."),
        "Cursor_OMPTaskLoopDirective".enum("OpenMP taskloop directive."),
        "Cursor_OMPTaskLoopSimdDirective".enum("OpenMP taskloop simd directive."),
        "Cursor_OMPDistributeDirective".enum("OpenMP distribute directive."),
        "Cursor_OMPTargetEnterDataDirective".enum("OpenMP target enter data directive."),
        "Cursor_OMPTargetExitDataDirective".enum("OpenMP target exit data directive."),
        "Cursor_OMPTargetParallelDirective".enum("OpenMP target parallel directive."),
        "Cursor_OMPTargetParallelForDirective".enum("OpenMP target parallel for directive."),
        "Cursor_OMPTargetUpdateDirective".enum("OpenMP target update directive."),
        "Cursor_OMPDistributeParallelForDirective".enum("OpenMP distribute parallel for directive."),
        "Cursor_OMPDistributeParallelForSimdDirective".enum("OpenMP distribute parallel for simd directive."),
        "Cursor_OMPDistributeSimdDirective".enum("OpenMP distribute simd directive."),
        "Cursor_OMPTargetParallelForSimdDirective".enum("OpenMP target parallel for simd directive."),
        "Cursor_OMPTargetSimdDirective".enum("OpenMP target simd directive."),
        "Cursor_OMPTeamsDistributeDirective".enum("OpenMP teams distribute directive."),
        "Cursor_OMPTeamsDistributeSimdDirective".enum("OpenMP teams distribute simd directive."),
        "Cursor_OMPTeamsDistributeParallelForSimdDirective".enum("OpenMP teams distribute parallel for simd directive."),
        "Cursor_OMPTeamsDistributeParallelForDirective".enum("OpenMP teams distribute parallel for directive."),
        "Cursor_OMPTargetTeamsDirective".enum("OpenMP target teams directive."),
        "Cursor_OMPTargetTeamsDistributeDirective".enum("OpenMP target teams distribute directive."),
        "Cursor_OMPTargetTeamsDistributeParallelForDirective".enum("OpenMP target teams distribute parallel for directive."),
        "Cursor_OMPTargetTeamsDistributeParallelForSimdDirective".enum("OpenMP target teams distribute parallel for simd directive."),
        "Cursor_OMPTargetTeamsDistributeSimdDirective".enum("OpenMP target teams distribute simd directive."),
        "Cursor_LastStmt".enum("OpenMP target teams distribute simd directive.", "CXCursor_OMPTargetTeamsDistributeSimdDirective"),
        "Cursor_TranslationUnit".enum(
            """
            Cursor that represents the translation unit itself.

            The translation unit cursor exists primarily to act as the root cursor for traversing the contents of a translation unit.
            """,
            "300"
        ),
        "Cursor_FirstAttr".enum("Attributes", "400"),
        "Cursor_UnexposedAttr".enum("An attribute whose specific kind is not exposed via this interface.", "400"),
        "Cursor_IBActionAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_IBOutletAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_IBOutletCollectionAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_CXXFinalAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_CXXOverrideAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_AnnotateAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_AsmLabelAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_PackedAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_PureAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ConstAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_NoDuplicateAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_CUDAConstantAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_CUDADeviceAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_CUDAGlobalAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_CUDAHostAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_CUDASharedAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_VisibilityAttr".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_DLLExport".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_DLLImport".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_NSReturnsRetained".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_NSReturnsNotRetained".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_NSReturnsAutoreleased".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_NSConsumesSelf".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_NSConsumed".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCException".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCNSObject".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCIndependentClass".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCPreciseLifetime".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCReturnsInnerPointer".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCRequiresSuper".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCRootClass".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCSubclassingRestricted".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCExplicitProtocolImpl".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCDesignatedInitializer".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCRuntimeVisible".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_ObjCBoxable".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_FlagEnum".enum("An attribute whose specific kind is not exposed via this interface."),
        "Cursor_LastAttr".enum("An attribute whose specific kind is not exposed via this interface.", "CXCursor_FlagEnum"),
        "Cursor_PreprocessingDirective".enum("Preprocessing", "500"),
        "Cursor_MacroDefinition".enum("Preprocessing"),
        "Cursor_MacroExpansion".enum("Preprocessing"),
        "Cursor_MacroInstantiation".enum("Preprocessing", "CXCursor_MacroExpansion"),
        "Cursor_InclusionDirective".enum("Preprocessing", "503"),
        "Cursor_FirstPreprocessing".enum("Preprocessing", "CXCursor_PreprocessingDirective"),
        "Cursor_LastPreprocessing".enum("Preprocessing", "CXCursor_InclusionDirective"),
        "Cursor_ModuleImportDecl".enum(
            """
            Extra Declarations

            A module import declaration.
            """,
            "600"
        ),
        "Cursor_TypeAliasTemplateDecl".enum(
            """
            Extra Declarations

            A module import declaration.
            """
        ),
        "Cursor_StaticAssert".enum("A static_assert or _Static_assert node"),
        "Cursor_FriendDecl".enum("a friend declaration."),
        "Cursor_FirstExtraDecl".enum("a friend declaration.", "CXCursor_ModuleImportDecl"),
        "Cursor_LastExtraDecl".enum("a friend declaration.", "CXCursor_FriendDecl"),
        "Cursor_OverloadCandidate".enum("A code completion overload candidate.", "700")
    )

    EnumConstant(
        """
        Describe the linkage of the entity referred to by a cursor.

        ({@code enum CXLinkageKind})
        """,

        "Linkage_Invalid".enum("This value indicates that no linkage information is available for a provided CXCursor.", "0"),
        "Linkage_NoLinkage".enum(
            "This is the linkage for variables, parameters, and so on that have automatic storage.  This covers normal (non-extern) local variables."
        ),
        "Linkage_Internal".enum("This is the linkage for static variables and static functions."),
        "Linkage_UniqueExternal".enum("This is the linkage for entities with external linkage that live in C++ anonymous namespaces."),
        "Linkage_External".enum("This is the linkage for entities with true, external linkage.")
    )

    EnumConstant(
        "{@code enum CXVisibilityKind}",

        "Visibility_Invalid".enum("This value indicates that no visibility information is available for a provided CXCursor.", "0"),
        "Visibility_Hidden".enum("Symbol not seen by the linker."),
        "Visibility_Protected".enum("Symbol seen by the linker but resolves to a symbol inside this object."),
        "Visibility_Default".enum("Symbol seen by the linker and acts like a normal symbol.")
    )

    EnumConstant(
        """
        Describe the "language" of the entity referred to by a cursor.

        ({@code enum CXLanguageKind})
        """,

        "Language_Invalid".enum("", "0"),
        "Language_C".enum,
        "Language_ObjC".enum,
        "Language_CPlusPlus".enum
    )

    EnumConstant(
        """
        Describe the "thread-local storage (TLS) kind" of the declaration referred to by a cursor.

        ({@code enum CXTLSKind})
        """,

        "TLS_None".enum("", "0"),
        "TLS_Dynamic".enum,
        "TLS_Static".enum
    )

    EnumConstant(
        """
        Describes the kind of type

        ({@code enum CXTypeKind})
        """,

        "Type_Invalid".enum("Represents an invalid type (e.g., where no type is available).", "0"),
        "Type_Unexposed".enum("A type whose specific kind is not exposed via this interface."),
        "Type_Void".enum("Builtin types"),
        "Type_Bool".enum("Builtin types"),
        "Type_Char_U".enum("Builtin types"),
        "Type_UChar".enum("Builtin types"),
        "Type_Char16".enum("Builtin types"),
        "Type_Char32".enum("Builtin types"),
        "Type_UShort".enum("Builtin types"),
        "Type_UInt".enum("Builtin types"),
        "Type_ULong".enum("Builtin types"),
        "Type_ULongLong".enum("Builtin types"),
        "Type_UInt128".enum("Builtin types"),
        "Type_Char_S".enum("Builtin types"),
        "Type_SChar".enum("Builtin types"),
        "Type_WChar".enum("Builtin types"),
        "Type_Short".enum("Builtin types"),
        "Type_Int".enum("Builtin types"),
        "Type_Long".enum("Builtin types"),
        "Type_LongLong".enum("Builtin types"),
        "Type_Int128".enum("Builtin types"),
        "Type_Float".enum("Builtin types"),
        "Type_Double".enum("Builtin types"),
        "Type_LongDouble".enum("Builtin types"),
        "Type_NullPtr".enum("Builtin types"),
        "Type_Overload".enum("Builtin types"),
        "Type_Dependent".enum("Builtin types"),
        "Type_ObjCId".enum("Builtin types"),
        "Type_ObjCClass".enum("Builtin types"),
        "Type_ObjCSel".enum("Builtin types"),
        "Type_Float128".enum("Builtin types"),
        "Type_Half".enum("Builtin types"),
        "Type_Float16".enum("Builtin types"),
        "Type_ShortAccum".enum("Builtin types"),
        "Type_Accum".enum("Builtin types"),
        "Type_LongAccum".enum("Builtin types"),
        "Type_UShortAccum".enum("Builtin types"),
        "Type_UAccum".enum("Builtin types"),
        "Type_ULongAccum".enum("Builtin types"),
        "Type_FirstBuiltin".enum("Builtin types", "CXType_Void"),
        "Type_LastBuiltin".enum("Builtin types", "CXType_ULongAccum"),
        "Type_Complex".enum("Builtin types", "100"),
        "Type_Pointer".enum("Builtin types"),
        "Type_BlockPointer".enum("Builtin types"),
        "Type_LValueReference".enum("Builtin types"),
        "Type_RValueReference".enum("Builtin types"),
        "Type_Record".enum("Builtin types"),
        "Type_Enum".enum("Builtin types"),
        "Type_Typedef".enum("Builtin types"),
        "Type_ObjCInterface".enum("Builtin types"),
        "Type_ObjCObjectPointer".enum("Builtin types"),
        "Type_FunctionNoProto".enum("Builtin types"),
        "Type_FunctionProto".enum("Builtin types"),
        "Type_ConstantArray".enum("Builtin types"),
        "Type_Vector".enum("Builtin types"),
        "Type_IncompleteArray".enum("Builtin types"),
        "Type_VariableArray".enum("Builtin types"),
        "Type_DependentSizedArray".enum("Builtin types"),
        "Type_MemberPointer".enum("Builtin types"),
        "Type_Auto".enum("Builtin types"),
        "Type_Elaborated".enum(
            """
            Represents a type that was referred to using an elaborated type keyword.

            E.g., struct S, or via a qualified name, e.g., N::M::type, or both.
            """
        ),
        "Type_Pipe".enum("OpenCL PipeType."),
        "Type_OCLImage1dRO".enum("OpenCL builtin types."),
        "Type_OCLImage1dArrayRO".enum("OpenCL builtin types."),
        "Type_OCLImage1dBufferRO".enum("OpenCL builtin types."),
        "Type_OCLImage2dRO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayRO".enum("OpenCL builtin types."),
        "Type_OCLImage2dDepthRO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayDepthRO".enum("OpenCL builtin types."),
        "Type_OCLImage2dMSAARO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayMSAARO".enum("OpenCL builtin types."),
        "Type_OCLImage2dMSAADepthRO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayMSAADepthRO".enum("OpenCL builtin types."),
        "Type_OCLImage3dRO".enum("OpenCL builtin types."),
        "Type_OCLImage1dWO".enum("OpenCL builtin types."),
        "Type_OCLImage1dArrayWO".enum("OpenCL builtin types."),
        "Type_OCLImage1dBufferWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dDepthWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayDepthWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dMSAAWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayMSAAWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dMSAADepthWO".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayMSAADepthWO".enum("OpenCL builtin types."),
        "Type_OCLImage3dWO".enum("OpenCL builtin types."),
        "Type_OCLImage1dRW".enum("OpenCL builtin types."),
        "Type_OCLImage1dArrayRW".enum("OpenCL builtin types."),
        "Type_OCLImage1dBufferRW".enum("OpenCL builtin types."),
        "Type_OCLImage2dRW".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayRW".enum("OpenCL builtin types."),
        "Type_OCLImage2dDepthRW".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayDepthRW".enum("OpenCL builtin types."),
        "Type_OCLImage2dMSAARW".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayMSAARW".enum("OpenCL builtin types."),
        "Type_OCLImage2dMSAADepthRW".enum("OpenCL builtin types."),
        "Type_OCLImage2dArrayMSAADepthRW".enum("OpenCL builtin types."),
        "Type_OCLImage3dRW".enum("OpenCL builtin types."),
        "Type_OCLSampler".enum("OpenCL builtin types."),
        "Type_OCLEvent".enum("OpenCL builtin types."),
        "Type_OCLQueue".enum("OpenCL builtin types."),
        "Type_OCLReserveID".enum("OpenCL builtin types."),
        "Type_ObjCObject".enum,
        "Type_ObjCTypeParam".enum,
        "Type_Attributed".enum,
        "Type_OCLIntelSubgroupAVCMcePayload".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCImePayload".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCRefPayload".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCSicPayload".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCMceResult".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCImeResult".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCRefResult".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCSicResult".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCImeResultSingleRefStreamout".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCImeResultDualRefStreamout".enum("OpenCL builtin types."),
        "Type_OCLIntelSubgroupAVCImeSingleRefStreamin".enum("OpenCL builtin types."),

        "Type_OCLIntelSubgroupAVCImeDualRefStreamin".enum("OpenCL builtin types.")
    )

    EnumConstant(
        """
        Describes the calling convention of a function type

        ({@code enum CXCallingConv})
        """,

        "CallingConv_Default".enum("", "0"),
        "CallingConv_C".enum,
        "CallingConv_X86StdCall".enum,
        "CallingConv_X86FastCall".enum,
        "CallingConv_X86ThisCall".enum,
        "CallingConv_X86Pascal".enum,
        "CallingConv_AAPCS".enum,
        "CallingConv_AAPCS_VFP".enum,
        "CallingConv_X86RegCall".enum,
        "CallingConv_IntelOclBicc".enum,
        "CallingConv_Win64".enum,
        "CallingConv_X86_64Win64".enum("Alias for compatibility with older versions of API.", "CXCallingConv_Win64"),
        "CallingConv_X86_64SysV".enum("Alias for compatibility with older versions of API.", "11"),
        "CallingConv_X86VectorCall".enum("Alias for compatibility with older versions of API."),
        "CallingConv_Swift".enum("Alias for compatibility with older versions of API."),
        "CallingConv_PreserveMost".enum("Alias for compatibility with older versions of API."),
        "CallingConv_PreserveAll".enum("Alias for compatibility with older versions of API."),
        "CallingConv_Invalid".enum("Alias for compatibility with older versions of API.", "100"),
        "CallingConv_Unexposed".enum("Alias for compatibility with older versions of API.", "200")
    )

    EnumConstant(
        """
        Describes the kind of a template argument. ({@code enum CXTemplateArgumentKind})

        See the definition of llvm::clang::TemplateArgument::ArgKind for full element descriptions.
        """,

        "TemplateArgumentKind_Null".enum("", "0"),
        "TemplateArgumentKind_Type".enum,
        "TemplateArgumentKind_Declaration".enum,
        "TemplateArgumentKind_NullPtr".enum,
        "TemplateArgumentKind_Integral".enum,
        "TemplateArgumentKind_Template".enum,
        "TemplateArgumentKind_TemplateExpansion".enum,
        "TemplateArgumentKind_Expression".enum,
        "TemplateArgumentKind_Pack".enum,
        "TemplateArgumentKind_Invalid".enum("Indicates an error case, preventing the kind from being deduced.")
    )

    EnumConstant(
        "{@code enum CXTypeNullabilityKind}",

        "TypeNullability_NonNull".enum("Values of this type can never be null.", "0"),
        "TypeNullability_Nullable".enum("Values of this type can be null."),
        "TypeNullability_Unspecified".enum(
            """
            Whether values of this type can be null is (explicitly) unspecified. This captures a (fairly rare) case where we can't conclude anything about the
            nullability of the type even though it has been considered.
            """
        ),
        "TypeNullability_Invalid".enum("Nullability is not applicable to this type.")
    )

    EnumConstant(
        """
        List the possible error codes for {@code clang_Type_getSizeOf}, {@code clang_Type_getAlignOf}, {@code clang_Type_getOffsetOf} and {@code
        clang_Cursor_getOffsetOf}. ({@code enum CXTypeLayoutError})

        A value of this enumeration type can be returned if the target type is not a valid argument to sizeof, alignof or offsetof.
        """,

        "TypeLayoutError_Invalid".enum("Type is of kind CXType_Invalid.", "-1"),
        "TypeLayoutError_Incomplete".enum("The type is an incomplete Type.", "-2"),
        "TypeLayoutError_Dependent".enum("The type is a dependent Type.", "-3"),
        "TypeLayoutError_NotConstantSize".enum("The type is not a constant size type.", "-4"),
        "TypeLayoutError_InvalidFieldName".enum("The Field name is not valid for this record.", "-5")
    )

    EnumConstant(
        "{@code enum CXRefQualifierKind}",

        "RefQualifier_None".enum("No ref-qualifier was provided.", "0"),
        "RefQualifier_LValue".enum("An lvalue ref-qualifier was provided ({@code &})."),
        "RefQualifier_RValue".enum("An rvalue ref-qualifier was provided ({@code &&}).")
    )

    EnumConstant(
        """
        Represents the C++ access control level to a base class for a cursor with kind CX_CXXBaseSpecifier.

        ({@code enum CX_CXXAccessSpecifier})
        """,

        "_CXXInvalidAccessSpecifier".enum("", "0"),
        "_CXXPublic".enum,
        "_CXXProtected".enum,
        "_CXXPrivate".enum
    )

    EnumConstant(
        """
        Represents the storage classes as declared in the source. CX_SC_Invalid was added for the case that the passed cursor in not a declaration.

        ({@code enum CX_StorageClass})
        """,

        "_SC_Invalid".enum("", "0"),
        "_SC_None".enum,
        "_SC_Extern".enum,
        "_SC_Static".enum,
        "_SC_PrivateExtern".enum,
        "_SC_OpenCLWorkGroupLocal".enum,
        "_SC_Auto".enum,
        "_SC_Register".enum
    )

    EnumConstant(
        """
        Describes how the traversal of the children of a particular cursor should proceed after visiting a particular child cursor. ({@code enum
        CXChildVisitResult})

        A value of this enumeration type should be returned by each {@code CXCursorVisitor} to indicate how #visitChildren() proceed.
        """,

        "ChildVisit_Break".enum("Terminates the cursor traversal.", "0"),
        "ChildVisit_Continue".enum("Continues the cursor traversal with the next sibling of the cursor just visited, without visiting its children."),
        "ChildVisit_Recurse".enum("Recursively traverse the children of this cursor, using the same visitor and client data.")
    )

    EnumConstant(
        """
        Properties for the printing policy. ({@code enum CXPrintingPolicyProperty})

        See {@code clang::PrintingPolicy} for more information.
        """,

        "PrintingPolicy_Indentation".enum("", "0"),
        "PrintingPolicy_SuppressSpecifiers".enum,
        "PrintingPolicy_SuppressTagKeyword".enum,
        "PrintingPolicy_IncludeTagDefinition".enum,
        "PrintingPolicy_SuppressScope".enum,
        "PrintingPolicy_SuppressUnwrittenScope".enum,
        "PrintingPolicy_SuppressInitializers".enum,
        "PrintingPolicy_ConstantArraySizeAsWritten".enum,
        "PrintingPolicy_AnonymousTagLocations".enum,
        "PrintingPolicy_SuppressStrongLifetime".enum,
        "PrintingPolicy_SuppressLifetimeQualifiers".enum,
        "PrintingPolicy_SuppressTemplateArgsInCXXConstructors".enum,
        "PrintingPolicy_Bool".enum,
        "PrintingPolicy_Restrict".enum,
        "PrintingPolicy_Alignof".enum,
        "PrintingPolicy_UnderscoreAlignof".enum,
        "PrintingPolicy_UseVoidForZeroParams".enum,
        "PrintingPolicy_TerseOutput".enum,
        "PrintingPolicy_PolishForDeclaration".enum,
        "PrintingPolicy_Half".enum,
        "PrintingPolicy_MSWChar".enum,
        "PrintingPolicy_IncludeNewlines".enum,
        "PrintingPolicy_MSVCFormatting".enum,
        "PrintingPolicy_ConstantsAsWritten".enum,
        "PrintingPolicy_SuppressImplicitBase".enum,
        "PrintingPolicy_FullyQualifiedName".enum,
        "PrintingPolicy_LastProperty".enum("", "CXPrintingPolicy_FullyQualifiedName")
    )

    EnumConstant(
        """
        Property attributes for a {@code CXCursor_ObjCPropertyDecl}.

        ({@code CXObjCPropertyAttrKind})
        """,

        "ObjCPropertyAttr_noattr".enum("", "0x00"),
        "ObjCPropertyAttr_readonly".enum("", "0x01"),
        "ObjCPropertyAttr_getter".enum("", "0x02"),
        "ObjCPropertyAttr_assign".enum("", "0x04"),
        "ObjCPropertyAttr_readwrite".enum("", "0x08"),
        "ObjCPropertyAttr_retain".enum("", "0x10"),
        "ObjCPropertyAttr_copy".enum("", "0x20"),
        "ObjCPropertyAttr_nonatomic".enum("", "0x40"),
        "ObjCPropertyAttr_setter".enum("", "0x80"),
        "ObjCPropertyAttr_atomic".enum("", "0x100"),
        "ObjCPropertyAttr_weak".enum("", "0x200"),
        "ObjCPropertyAttr_strong".enum("", "0x400"),
        "ObjCPropertyAttr_unsafe_unretained".enum("", "0x800"),
        "ObjCPropertyAttr_class".enum("", "0x1000")
    )

    EnumConstant(
        """
        'Qualifiers' written next to the return and parameter types in Objective-C method declarations.

        ({@code CXObjCDeclQualifierKind})
        """,

        "ObjCDeclQualifier_None".enum("", "0x0"),
        "ObjCDeclQualifier_In".enum("", "0x1"),
        "ObjCDeclQualifier_Inout".enum("", "0x2"),
        "ObjCDeclQualifier_Out".enum("", "0x4"),
        "ObjCDeclQualifier_Bycopy".enum("", "0x8"),
        "ObjCDeclQualifier_Byref".enum("", "0x10"),
        "ObjCDeclQualifier_Oneway".enum("", "0x20")
    )

    EnumConstant(
        "{@code enum CXNameRefFlags}",

        "NameRange_WantQualifier".enum("Include the nested-name-specifier, e.g. Foo:: in x.Foo::y, in the range.", "0x1"),
        "NameRange_WantTemplateArgs".enum("Include the explicit template arguments, e.g. &lt;int&gt; in x.f&lt;int&gt;, in the range.", "0x2"),
        "NameRange_WantSinglePiece".enum(
            """
            If the name is non-contiguous, return the full spanning range.

            Non-contiguous names occur in Objective-C when a selector with two or more parameters is used, or in C++ when using an operator:

            ${codeBlock("""
 [object doSomething:here withValue:there]; // Objective-C
 return some_vector[1]; // C++""")}
            """,
            "0x4"
        )
    )

    EnumConstant(
        """
        Describes a kind of token.

        ({@code CXTokenKind})
        """,

        "Token_Punctuation".enum("A token that contains some kind of punctuation.", "0"),
        "Token_Keyword".enum("A language keyword."),
        "Token_Identifier".enum("An identifier (that is not a keyword)."),
        "Token_Literal".enum("A numeric, string, or character literal."),
        "Token_Comment".enum("A comment.")
    )

    EnumConstant(
        """
        Describes a single piece of text within a code-completion string. ({@code enum CXCompletionChunkKind})

        Each "chunk" within a code-completion string ({@code CXCompletionString}) is either a piece of text with a specific "kind" that describes how that text
        should be interpreted by the client or is another completion string.
        """,

        "CompletionChunk_Optional".enum(
            """
            A code-completion string that describes "optional" text that could be a part of the template (but is not required).

            The Optional chunk is the only kind of chunk that has a code-completion string for its representation, which is accessible via {@code
            clang_getCompletionChunkCompletionString()}. The code-completion string describes an additional part of the template that is completely optional.
            For example, optional chunks can be used to describe the placeholders for arguments that match up with defaulted function parameters, e.g. given:

            ${codeBlock("""
 void f(int x, float y = 3.14, double z = 2.71828);""")}

            The code-completion string for this function would contain:

            ${ul(
                "a TypedText chunk for \"f\".",
                "a LeftParen chunk for \"(\".",
                "a Placeholder chunk for \"int x\"",
                """
                an Optional chunk containing the remaining defaulted arguments, e.g.,

                ${ul(
                    "a Comma chunk for \",\"",
                    "a Placeholder chunk for \"float y\"",
                    """
                    an Optional chunk containing the last defaulted argument:

                    ${ul(
                        "a Comma chunk for \",\"",
                        "a Placeholder chunk for \"double z\""
                    )}
                    """
                )}
                """,
                "a RightParen chunk for \")\""
            )}

            There are many ways to handle Optional chunks. Two simple approaches are:

            ${ul(
                "Completely ignore optional chunks, in which case the template for the function \"f\" would only include the first parameter (\"int x\").",
                "Fully expand all optional chunks, in which case the template for the function \"f\" would have all of the parameters."
            )}
            """,
            "0"
        ),
        "CompletionChunk_TypedText".enum(
            """
            Text that a user would be expected to type to get this code-completion result.

            There will be exactly one "typed text" chunk in a semantic string, which will typically provide the spelling of a keyword or the name of a
            declaration that could be used at the current code point. Clients are expected to filter the code-completion results based on the text in this
            chunk.
            """
        ),
        "CompletionChunk_Text".enum(
            """
            Text that should be inserted as part of a code-completion result.

            A "text" chunk represents text that is part of the template to be inserted into user code should this particular code-completion result be
            selected.
            """
        ),
        "CompletionChunk_Placeholder".enum(
            """
            Placeholder text that should be replaced by the user.

            A "placeholder" chunk marks a place where the user should insert text into the code-completion template. For example, placeholders might mark the
            function parameters for a function declaration, to indicate that the user should provide arguments for each of those parameters. The actual text in
            a placeholder is a suggestion for the text to display before the user replaces the placeholder with real code.
            """
        ),
        "CompletionChunk_Informative".enum(
            """
            Informative text that should be displayed but never inserted as part of the template.

            An "informative" chunk contains annotations that can be displayed to help the user decide whether a particular code-completion result is the right
            option, but which is not part of the actual template to be inserted by code completion.
            """
        ),
        "CompletionChunk_CurrentParameter".enum(
            """
            Text that describes the current parameter when code-completion is referring to function call, message send, or template specialization.

            A "current parameter" chunk occurs when code-completion is providing information about a parameter corresponding to the argument at the
            code-completion point. For example, given a function

            ${codeBlock("""
 int add(int x, int y);""")}

            and the source code {@code add(}, where the code-completion point is after the "(", the code-completion string will contain a "current parameter"
            chunk for "int x", indicating that the current argument will initialize that parameter. After typing further, to {@code add(17}, (where the
            code-completion point is after the ","), the code-completion string will contain a "current parameter" chunk to "int y".
            """
        ),
        "CompletionChunk_LeftParen".enum("A left parenthesis ('('), used to initiate a function call or signal the beginning of a function parameter list."),
        "CompletionChunk_RightParen".enum("A right parenthesis (')'), used to finish a function call or signal the end of a function parameter list."),
        "CompletionChunk_LeftBracket".enum("A left bracket ('[')."),
        "CompletionChunk_RightBracket".enum("A right bracket (']')."),
        "CompletionChunk_LeftBrace".enum("A left brace ('{')."),
        "CompletionChunk_RightBrace".enum("A right brace ('}')."),
        "CompletionChunk_LeftAngle".enum("A left angle bracket (' &lt;')."),
        "CompletionChunk_RightAngle".enum("A right angle bracket ('&gt;')."),
        "CompletionChunk_Comma".enum("A comma separator (',')."),
        "CompletionChunk_ResultType".enum(
            """
            Text that specifies the result type of a given result.

            This special kind of informative chunk is not meant to be inserted into the text buffer. Rather, it is meant to illustrate the type that an
            expression using the given completion string would have.
            """
        ),
        "CompletionChunk_Colon".enum("A colon (':')."),
        "CompletionChunk_SemiColon".enum("A semicolon (';')."),
        "CompletionChunk_Equal".enum("An '=' sign."),
        "CompletionChunk_HorizontalSpace".enum("Horizontal space (' ')."),
        "CompletionChunk_VerticalSpace".enum("Vertical space ('\\n'), after which it is generally a good idea to perform indentation.")
    )

    EnumConstant(
        """
        Flags that can be passed to {@code clang_codeCompleteAt()} to modify its behavior. ({@code enum CXCodeComplete_Flags})

        The enumerators in this enumeration can be bitwise-OR'd together to provide multiple options to {@code clang_codeCompleteAt()}.
        """,

        "CodeComplete_IncludeMacros".enum("Whether to include macros within the set of code completions returned.", "0x01"),
        "CodeComplete_IncludeCodePatterns".enum(
            "Whether to include code patterns for language constructs within the set of code completions, e.g., for loops.",
            "0x02"
        ),
        "CodeComplete_IncludeBriefComments".enum("Whether to include brief documentation within the set of code completions returned.", "0x04"),
        "CodeComplete_SkipPreamble".enum(
            """
            Whether to speed up completion by omitting top- or namespace-level entities defined in the preamble. There's no guarantee any particular entity is
            omitted. This may be useful if the headers are indexed externally.
            """,
            "0x08"
        ),
        "CodeComplete_IncludeCompletionsWithFixIts".enum(
            "Whether to include completions with small fix-its, e.g. change '.' to '-&gt;' on member access, etc.",
            "0x10"
        )
    )

    EnumConstant(
        """
        Bits that represent the context under which completion is occurring. ({@code enum CXCompletionContext})

        The enumerators in this enumeration may be bitwise-OR'd together if multiple contexts are occurring simultaneously.
        """,

        "CompletionContext_Unexposed".enum(
            "The context for completions is unexposed, as only Clang results should be included. (This is equivalent to having no context bits set.)",
            "0"
        ),
        "CompletionContext_AnyType".enum("Completions for any possible type should be included in the results.", "1 << 0"),
        "CompletionContext_AnyValue".enum("Completions for any possible value (variables, function calls, etc.) should be included in the results.", "1 << 1"),
        "CompletionContext_ObjCObjectValue".enum("Completions for values that resolve to an Objective-C object should be included in the results.", "1 << 2"),
        "CompletionContext_ObjCSelectorValue".enum(
            "Completions for values that resolve to an Objective-C selector should be included in the results.",
            "1 << 3"
        ),
        "CompletionContext_CXXClassTypeValue".enum("Completions for values that resolve to a C++ class type should be included in the results.", "1 << 4"),
        "CompletionContext_DotMemberAccess".enum(
            "Completions for fields of the member being accessed using the dot operator should be included in the results.",
            "1 << 5"
        ),
        "CompletionContext_ArrowMemberAccess".enum(
            "Completions for fields of the member being accessed using the arrow operator should be included in the results.",
            "1 << 6"
        ),
        "CompletionContext_ObjCPropertyAccess".enum(
            "Completions for properties of the Objective-C object being accessed using the dot operator should be included in the results.",
            "1 << 7"
        ),
        "CompletionContext_EnumTag".enum("Completions for enum tags should be included in the results.", "1 << 8"),
        "CompletionContext_UnionTag".enum("Completions for union tags should be included in the results.", "1 << 9"),
        "CompletionContext_StructTag".enum("Completions for struct tags should be included in the results.", "1 << 10"),
        "CompletionContext_ClassTag".enum("Completions for C++ class names should be included in the results.", "1 << 11"),
        "CompletionContext_Namespace".enum("Completions for C++ namespaces and namespace aliases should be included in the results.", "1 << 12"),
        "CompletionContext_NestedNameSpecifier".enum("Completions for C++ nested name specifiers should be included in the results.", "1 << 13"),
        "CompletionContext_ObjCInterface".enum("Completions for Objective-C interfaces (classes) should be included in the results.", "1 << 14"),
        "CompletionContext_ObjCProtocol".enum("Completions for Objective-C protocols should be included in the results.", "1 << 15"),
        "CompletionContext_ObjCCategory".enum("Completions for Objective-C categories should be included in the results.", "1 << 16"),
        "CompletionContext_ObjCInstanceMessage".enum("Completions for Objective-C instance messages should be included in the results.", "1 << 17"),
        "CompletionContext_ObjCClassMessage".enum("Completions for Objective-C class messages should be included in the results.", "1 << 18"),
        "CompletionContext_ObjCSelectorName".enum("Completions for Objective-C selector names should be included in the results.", "1 << 19"),
        "CompletionContext_MacroName".enum("Completions for preprocessor macro names should be included in the results.", "1 << 20"),
        "CompletionContext_NaturalLanguage".enum("Natural language completions should be included in the results.", "1 << 21"),
        "CompletionContext_IncludedFile".enum("{@code \\#include} file completions should be included in the results.", "1 << 22"),
        "CompletionContext_Unknown".enum("The current context is unknown, so set all contexts.", "((1 << 23) - 1)")
    )

    EnumConstant(
        "{@code CXEvalResultKind}",

        "Eval_Int".enum("", "1"),
        "Eval_Float".enum,
        "Eval_ObjCStrLiteral".enum,
        "Eval_StrLiteral".enum,
        "Eval_CFStr".enum,
        "Eval_Other".enum,
        "Eval_UnExposed".enum("", "0")
    )

    EnumConstant(
        "{@code enum CXVisitorResult}",

        "Visit_Break".enum("", "0"),
        "Visit_Continue".enum
    )

    EnumConstant(
        "{@code CXResult}",

        "Result_Success".enum("Function returned successfully.", "0"),
        "Result_Invalid".enum("One of the parameters was invalid for the function."),
        "Result_VisitBreak".enum("The function was terminated by a callback (e.g. it returned CXVisit_Break)")
    )

    EnumConstant(
        "{@code CXIdxEntityKind}",

        "IdxEntity_Unexposed".enum("", "0"),
        "IdxEntity_Typedef".enum,
        "IdxEntity_Function".enum,
        "IdxEntity_Variable".enum,
        "IdxEntity_Field".enum,
        "IdxEntity_EnumConstant".enum,
        "IdxEntity_ObjCClass".enum,
        "IdxEntity_ObjCProtocol".enum,
        "IdxEntity_ObjCCategory".enum,
        "IdxEntity_ObjCInstanceMethod".enum,
        "IdxEntity_ObjCClassMethod".enum,
        "IdxEntity_ObjCProperty".enum,
        "IdxEntity_ObjCIvar".enum,
        "IdxEntity_Enum".enum,
        "IdxEntity_Struct".enum,
        "IdxEntity_Union".enum,
        "IdxEntity_CXXClass".enum,
        "IdxEntity_CXXNamespace".enum,
        "IdxEntity_CXXNamespaceAlias".enum,
        "IdxEntity_CXXStaticVariable".enum,
        "IdxEntity_CXXStaticMethod".enum,
        "IdxEntity_CXXInstanceMethod".enum,
        "IdxEntity_CXXConstructor".enum,
        "IdxEntity_CXXDestructor".enum,
        "IdxEntity_CXXConversionFunction".enum,
        "IdxEntity_CXXTypeAlias".enum,
        "IdxEntity_CXXInterface".enum
    )

    EnumConstant(
        "{@code CXIdxEntityLanguage}",

        "IdxEntityLang_None".enum("", "0"),
        "IdxEntityLang_C".enum,
        "IdxEntityLang_ObjC".enum,
        "IdxEntityLang_CXX".enum,
        "IdxEntityLang_Swift".enum
    )

    EnumConstant(
        """
        Extra C++ template information for an entity. This can apply to: CXIdxEntity_Function CXIdxEntity_CXXClass CXIdxEntity_CXXStaticMethod
        CXIdxEntity_CXXInstanceMethod CXIdxEntity_CXXConstructor CXIdxEntity_CXXConversionFunction CXIdxEntity_CXXTypeAlias

        ({@code CXIdxEntityCXXTemplateKind})
        """,

        "IdxEntity_NonTemplate".enum("", "0"),
        "IdxEntity_Template".enum,
        "IdxEntity_TemplatePartialSpecialization".enum,
        "IdxEntity_TemplateSpecialization".enum
    )

    EnumConstant(
        "{@code CXIdxAttrKind}",

        "IdxAttr_Unexposed".enum("", "0"),
        "IdxAttr_IBAction".enum,
        "IdxAttr_IBOutlet".enum,
        "IdxAttr_IBOutletCollection".enum
    )

    EnumConstant(
        "{@code CXIdxDeclInfoFlags}",

        "IdxDeclFlag_Skipped".enum("", "0x1")
    )

    EnumConstant(
        "{@code CXIdxObjCContainerKind}",

        "IdxObjCContainer_ForwardRef".enum("", "0"),
        "IdxObjCContainer_Interface".enum,
        "IdxObjCContainer_Implementation".enum
    )

    EnumConstant(
        """
        Data for IndexerCallbacks#indexEntityReference. ({@code CXIdxEntityRefKind})

        This may be deprecated in a future version as this duplicates the {@code CXSymbolRole_Implicit} bit in {@code CXSymbolRole}.
        """,

        "IdxEntityRef_Direct".enum("The entity is referenced directly in user's code.", "1"),
        "IdxEntityRef_Implicit".enum("An implicit reference, e.g. a reference of an Objective-C method via the dot syntax.")
    )

    EnumConstant(
        """
        Roles that are attributed to symbol occurrences. ({@code CXSymbolRole})

        Internal: this currently mirrors low 9 bits of clang::index::SymbolRole with higher bits zeroed. These high bits may be exposed in the future.
        """,

        "SymbolRole_None".enum("", "0"),
        "SymbolRole_Declaration".enum("", "1 << 0"),
        "SymbolRole_Definition".enum("", "1 << 1"),
        "SymbolRole_Reference".enum("", "1 << 2"),
        "SymbolRole_Read".enum("", "1 << 3"),
        "SymbolRole_Write".enum("", "1 << 4"),
        "SymbolRole_Call".enum("", "1 << 5"),
        "SymbolRole_Dynamic".enum("", "1 << 6"),
        "SymbolRole_AddressOf".enum("", "1 << 7"),
        "SymbolRole_Implicit".enum("", "1 << 8")
    )

    EnumConstant(
        "{@code CXIndexOptFlags}",

        "IndexOpt_None".enum("Used to indicate that no special indexing options are needed.", "0x0"),
        "IndexOpt_SuppressRedundantRefs".enum(
            """
            Used to indicate that IndexerCallbacks#indexEntityReference should be invoked for only one reference of an entity per source file that does not
            also include a declaration/definition of the entity.
            """,
            "0x1"
        ),
        "IndexOpt_IndexFunctionLocalSymbols".enum(
            "Function-local symbols should be indexed. If this is not set function-local symbols will be ignored.",
            "0x2"
        ),
        "IndexOpt_IndexImplicitTemplateInstantiations".enum(
            "Implicit function/class template instantiations should be indexed. If this is not set, implicit instantiations will be ignored.",
            "0x4"
        ),
        "IndexOpt_SuppressWarnings".enum("Suppress all compiler warnings when parsing for indexing.", "0x8"),
        "IndexOpt_SkipParsedBodiesInSession".enum(
            """
            Skip a function/method body that was already parsed during an indexing session associated with a {@code CXIndexAction} object. Bodies in system
            headers are always skipped.
            """,
            "0x10"
        )
    )

    charUTF8.const.p(
        "getCString",
        "Retrieve the character data associated with the given string.",

        CXString("string", "")
    )

    void(
        "disposeString",
        "Free the given string.",

        CXString("string", "")
    )

    void(
        "disposeStringSet",
        "Free the given string set.",

        Input..CXStringSet.p("set", "")
    )

    CXIndex(
        "createIndex",
        """
        Provides a shared context for creating translation units.

        It provides two options:

        ${ul(
            """
            {@code excludeDeclarationsFromPCH}: When non-zero, allows enumeration of "local" declarations (when loading any new translation units). A "local"
            declaration is one that belongs in the translation unit itself and not in a precompiled header that was used by the translation unit. If zero, all
            declarations will be enumerated.
            """
        )}

        Here is an example:

        ${codeBlock("""
   // excludeDeclsFromPCH = 1, displayDiagnostics=1
   Idx = clang_createIndex(1, 1);

   // IndexTest.pch was produced with the following command:
   // "clang -x c IndexTest.h -emit-ast -o IndexTest.pch"
   TU = clang_createTranslationUnit(Idx, "IndexTest.pch");

   // This will load all the symbols from 'IndexTest.pch'
   clang_visitChildren(clang_getTranslationUnitCursor(TU),
                       TranslationUnitVisitor, 0);
   clang_disposeTranslationUnit(TU);

   // This will load all the symbols from 'IndexTest.c', excluding symbols
   // from 'IndexTest.pch'.
   char *args[] = { "-Xclang", "-include-pch=IndexTest.pch" };
   TU = clang_createTranslationUnitFromSourceFile(Idx, "IndexTest.c", 2, args,
                                                  0, 0);
   clang_visitChildren(clang_getTranslationUnitCursor(TU),
                       TranslationUnitVisitor, 0);
   clang_disposeTranslationUnit(TU);""")}

        This process of creating the {@code pch}, loading it separately, and using it (via {@code -include-pch}) allows {@code excludeDeclsFromPCH} to remove
        redundant callbacks (which gives the indexer the same performance benefit as the compiler).
        """,

        intb("excludeDeclarationsFromPCH", ""),
        intb("displayDiagnostics", "")
    )

    void(
        "disposeIndex",
        """
        Destroy the given index.

        The index must not be destroyed until all of the translation units created within that index have been destroyed.
        """,

        CXIndex("index", "")
    )

    void(
        "CXIndex_setGlobalOptions",
        """
        Sets general options associated with a {@code CXIndex}.

        For example:

        ${codeBlock("""
 CXIndex idx = ...;
 clang_CXIndex_setGlobalOptions(idx,
     clang_CXIndex_getGlobalOptions(idx) |
     CXGlobalOpt_ThreadBackgroundPriorityForIndexing);""")}
        """,

        CXIndex("index", ""),
        unsigned("options", "a bitmask of options, a bitwise OR of {@code CXGlobalOpt_XXX} flags")
    )

    unsigned(
        "CXIndex_getGlobalOptions",
        "Gets the general options associated with a CXIndex.",

        CXIndex("index", ""),

        returnDoc = "a bitmask of options, a bitwise OR of {@code CXGlobalOpt_XXX} flags that are associated with the given {@code CXIndex} object"
    )

    IgnoreMissing..void(
        "CXIndex_setInvocationEmissionPathOption",
        """
        Sets the invocation emission path option in a {@code CXIndex}.

        The invocation emission path specifies a path which will contain log files for certain libclang invocations. A null value (default) implies that
        libclang invocations are not logged.
        """,

        CXIndex("index", ""),
        nullable..charUTF8.const.p("Path", "")
    )

    CXString(
        "getFileName",
        "Retrieve the complete file and path name of the given file.",

        CXFile("SFile", "")
    )

    time_t(
        "getFileTime",
        "Retrieve the last modification time of the given file.",

        CXFile("SFile", "")
    )

    int(
        "getFileUniqueID",
        "Retrieve the unique ID for the given {@code file}.",

        CXFile("file", "the file to get the ID for"),
        CXFileUniqueID.p("outID", "stores the returned CXFileUniqueID"),

        returnDoc = "if there was a failure getting the unique ID, returns non-zero, otherwise returns 0"
    )

    unsignedb(
        "isFileMultipleIncludeGuarded",
        """
        Determine whether the given header is guarded against multiple inclusions, either with the conventional \#ifndef/\#define/\#endif macro guards or with
        \#pragma once.
        """,

        CXTranslationUnit("tu", ""),
        CXFile("file", "")
    )

    CXFile(
        "getFile",
        "Retrieve a file handle within the given translation unit.",

        CXTranslationUnit("tu", "the translation unit"),
        charUTF8.const.p("file_name", "the name of the file"),

        returnDoc =
        "the file handle for the named file in the translation unit {@code tu}, or a #NULL file handle if the file was not a part of this translation unit"
    )

    IgnoreMissing..char.const.p(
        "getFileContents",
        "Retrieve the buffer associated with the given file.",

        CXTranslationUnit("tu", "the translation unit"),
        CXFile("file", "the file for which to retrieve the buffer"),
        AutoSizeResult..size_t.p("size", "[out] if non-#NULL, will be set to the size of the buffer"),

        returnDoc = "a pointer to the buffer in memory that holds the contents of {@code file}, or a #NULL pointer when the file is not loaded"
    )

    intb(
        "File_isEqual",
        "Returns non-zero if the {@code file1} and {@code file2} point to the same file, or they are both #NULL.",

        nullable..CXFile("file1", ""),
        nullable..CXFile("file2", "")
    )

    IgnoreMissing..CXString(
        "File_tryGetRealPathName",
        """
        Returns the real path name of {@code file}.

        An empty string may be returned. Use #getFileName() in that case.
        """,

        CXFile("file", "")
    )

    CXSourceLocation("getNullLocation", "Retrieve a #NULL (invalid) source location.", void())

    unsignedb(
        "equalLocations",
        "Determine whether two source locations, which must refer into the same translation unit, refer to exactly the same point in the source code.",

        CXSourceLocation("loc1", ""),
        CXSourceLocation("loc2", ""),

        returnDoc = "non-zero if the source locations refer to the same location, zero if they refer to different locations"
    )

    CXSourceLocation(
        "getLocation",
        "Retrieves the source location associated with a given file/line/column in a particular translation unit.",

        CXTranslationUnit("tu", ""),
        CXFile("file", ""),
        unsigned("line", ""),
        unsigned("column", "")
    )

    CXSourceLocation(
        "getLocationForOffset",
        "Retrieves the source location associated with a given character offset in a particular translation unit.",

        CXTranslationUnit("tu", ""),
        CXFile("file", ""),
        unsigned("offset", "")
    )

    intb(
        "Location_isInSystemHeader",
        "Returns non-zero if the given source location is in a system header.",

        CXSourceLocation("location", "")
    )

    intb(
        "Location_isFromMainFile",
        "Returns non-zero if the given source location is in the main file of the corresponding translation unit.",

        CXSourceLocation("location", "")
    )

    CXSourceRange("getNullRange", "Retrieve a #NULL (invalid) source range.", void())

    CXSourceRange(
        "getRange",
        "Retrieve a source range given the beginning and ending source locations.",

        CXSourceLocation("begin", ""),
        CXSourceLocation("end", "")
    )

    unsignedb(
        "equalRanges",
        "Determine whether two ranges are equivalent.",

        CXSourceRange("range1", ""),
        CXSourceRange("range2", ""),

        returnDoc = "non-zero if the ranges are the same, zero if they differ"
    )

    intb(
        "Range_isNull",
        "Returns non-zero if {@code range} is null.",

        CXSourceRange("range", "")
    )

    void(
        "getExpansionLocation",
        """
        Retrieve the file, line, column, and offset represented by the given source location.

        If the location refers into a macro expansion, retrieves the location of the macro expansion.
        """,

        CXSourceLocation("location", "the location within a source file that will be decomposed into its parts"),
        Check(1)..nullable..CXFile.p("file", "[out] if non-#NULL, will be set to the file to which the given source location points"),
        Check(1)..nullable..unsigned.p("line", "[out] if non-#NULL, will be set to the line to which the given source location points"),
        Check(1)..nullable..unsigned.p("column", "[out] if non-#NULL, will be set to the column to which the given source location points"),
        Check(1)..nullable..unsigned.p("offset", "[out] if non-#NULL, will be set to the offset into the buffer to which the given source location points")
    )

    void(
        "getPresumedLocation",
        """
        Retrieve the file, line and column represented by the given source location, as specified in a # line directive.

        Example: given the following source code in a file somefile.c

        ${codeBlock("""
 \#123 "dummy.c" 1

 static int func(void)
 {
     return 0;
 }""")}

        the location information returned by this function would be

        File: dummy.c Line: 124 Column: 12

        whereas clang_getExpansionLocation would have returned

        File: somefile.c Line: 3 Column: 12
        """,

        CXSourceLocation("location", "the location within a source file that will be decomposed into its parts"),
        Check(1)..nullable..CXString.p(
            "filename",
            """
            [out] if non-#NULL, will be set to the filename of the source location. Note that filenames returned will be for "virtual" files, which don't
            necessarily exist on the machine running clang - e.g. when parsing preprocessed output obtained from a different environment. If a non-#NULL value
            is passed in, remember to dispose of the returned value using {@code clang_disposeString()} once you've finished with it. For an invalid source
            location, an empty string is returned.
            """
        ),
        Check(1)..nullable..unsigned.p(
            "line",
            "[out] if non-#NULL, will be set to the line number of the source location. For an invalid source location, zero is returned."
        ),
        Check(1)..nullable..unsigned.p(
            "column",
            "[out] if non-#NULL, will be set to the column number of the source location. For an invalid source location, zero is returned."
        )
    )

    /*void(
        "getInstantiationLocation",
        """
        Legacy API to retrieve the file, line, column, and offset represented by the given source location.

        This interface has been replaced by the newer interface #clang_getExpansionLocation(). See that interface's documentation for details.
        """,

        CXSourceLocation("location", ""),
        CXFile.p("file", ""),
        unsigned.p("line", ""),
        unsigned.p("column", ""),
        unsigned.p("offset", "")
    )*/

    void(
        "getSpellingLocation",
        """
        Retrieve the file, line, column, and offset represented by the given source location.

        If the location refers into a macro instantiation, return where the location was originally spelled in the source file.
        """,

        CXSourceLocation("location", "the location within a source file that will be decomposed into its parts"),
        Check(1)..nullable..CXFile.p("file", "[out] if non-#NULL, will be set to the file to which the given source location points"),
        Check(1)..nullable..unsigned.p("line", "[out] if non-#NULL, will be set to the line to which the given source location points"),
        Check(1)..nullable..unsigned.p("column", "[out] if non-#NULL, will be set to the column to which the given source location points"),
        Check(1)..nullable..unsigned.p("offset", "[out] if non-#NULL, will be set to the offset into the buffer to which the given source location points")
    )

    void(
        "getFileLocation",
        """
        Retrieve the file, line, column, and offset represented by the given source location.

        If the location refers into a macro expansion, return where the macro was expanded or where the macro argument was written, if the location points at a
        macro argument.
        """,

        CXSourceLocation("location", "the location within a source file that will be decomposed into its parts"),
        Check(1)..nullable..CXFile.p("file", "[out] if non-#NULL, will be set to the file to which the given source location points"),
        Check(1)..nullable..unsigned.p("line", "[out] if non-#NULL, will be set to the line to which the given source location points"),
        Check(1)..nullable..unsigned.p("column", "[out] if non-#NULL, will be set to the column to which the given source location points"),
        Check(1)..nullable..unsigned.p("offset", "[out] if non-#NULL, will be set to the offset into the buffer to which the given source location points")
    )

    CXSourceLocation(
        "getRangeStart",
        "Retrieve a source location representing the first character within a source range.",

        CXSourceRange("range", "")
    )

    CXSourceLocation(
        "getRangeEnd",
        "Retrieve a source location representing the last character within a source range.",

        CXSourceRange("range", "")
    )

    CXSourceRangeList.p(
        "getSkippedRanges",
        """
        Retrieve all ranges that were skipped by the preprocessor.

        The preprocessor will skip lines when they are surrounded by an if/ifdef/ifndef directive whose condition does not evaluate to true.
        """,

        CXTranslationUnit("tu", ""),
        CXFile("file", "")
    )

    CXSourceRangeList.p(
        "getAllSkippedRanges",
        """
        Retrieve all ranges from all files that were skipped by the preprocessor.

        The preprocessor will skip lines when they are surrounded by an if/ifdef/ifndef directive whose condition does not evaluate to true.
        """,

        CXTranslationUnit("tu", "")
    )

    void(
        "disposeSourceRangeList",
        "Destroy the given {@code CXSourceRangeList}.",

        Input..CXSourceRangeList.p("ranges", "")
    )

    unsigned(
        "getNumDiagnosticsInSet",
        "Determine the number of diagnostics in a {@code CXDiagnosticSet}.",

        CXDiagnosticSet("Diags", "")
    )

    CXDiagnostic(
        "getDiagnosticInSet",
        "Retrieve a diagnostic associated with the given {@code CXDiagnosticSet}.",

        CXDiagnosticSet("Diags", "the {@code CXDiagnosticSet} to query"),
        unsigned("Index", "the zero-based diagnostic number to retrieve"),

        returnDoc = "the requested diagnostic. This diagnostic must be freed via a call to #disposeDiagnostic()."
    )

    CXDiagnosticSet(
        "loadDiagnostics",
        "Deserialize a set of diagnostics from a Clang diagnostics bitcode file.",

        charUTF8.const.p("file", "the name of the file to deserialize"),
        Check(1)..CXLoadDiag_Error.p("error", "a pointer to a enum value recording if there was a problem deserializing the diagnostics"),
        CXString.p("errorString", "a pointer to a ##CXString for recording the error string if the file was not successfully loaded"),

        returnDoc = "a loaded {@code CXDiagnosticSet} if successful, and #NULL otherwise. These diagnostics should be released using #disposeDiagnosticSet()."
    )

    void(
        "disposeDiagnosticSet",
        "Release a {@code CXDiagnosticSet} and all of its contained diagnostics.",

        CXDiagnosticSet("Diags", "")
    )

    CXDiagnosticSet(
        "getChildDiagnostics",
        """
        Retrieve the child diagnostics of a {@code CXDiagnostic}.

        This {@code CXDiagnosticSet} does not need to be released by #disposeDiagnosticSet().
        """,

        CXDiagnostic("D", "")
    )

    unsigned(
        "getNumDiagnostics",
        "Determine the number of diagnostics produced for the given translation unit.",

        CXTranslationUnit("Unit", "")
    )

    CXDiagnostic(
        "getDiagnostic",
        "Retrieve a diagnostic associated with the given translation unit.",

        CXTranslationUnit("Unit", "the translation unit to query"),
        unsigned("Index", "the zero-based diagnostic number to retrieve"),

        returnDoc = "the requested diagnostic. This diagnostic must be freed via a call to #disposeDiagnostic()."
    )

    CXDiagnosticSet(
        "getDiagnosticSetFromTU",
        "Retrieve the complete set of diagnostics associated with a translation unit.",

        CXTranslationUnit("Unit", "the translation unit to query")
    )

    void(
        "disposeDiagnostic",
        "Destroy a diagnostic.",

        CXDiagnostic("Diagnostic", "")
    )

    CXString(
        "formatDiagnostic",
        """
        Format the given diagnostic in a manner that is suitable for display.

        This routine will format the given diagnostic to a string, rendering the diagnostic according to the various options given. The
        #defaultDiagnosticDisplayOptions() function returns the set of options that most closely mimics the behavior of the clang compiler.
        """,

        CXDiagnostic("Diagnostic", "the diagnostic to print"),
        unsigned("Options", "a set of options that control the diagnostic display, created by combining {@code CXDiagnosticDisplayOptions} values"),

        returnDoc = "a new string containing for formatted diagnostic"
    )

    unsigned(
        "defaultDiagnosticDisplayOptions",
        "Retrieve the set of display options most similar to the default behavior of the clang compiler.",

        void(),

        returnDoc = "a set of display options suitable for use with #formatDiagnostic()"
    )

    CXDiagnosticSeverity(
        "getDiagnosticSeverity",
        "Determine the severity of the given diagnostic.",

        CXDiagnostic("Diagnostic", "")
    )

    CXSourceLocation(
        "getDiagnosticLocation",
        """
        Retrieve the source location of the given diagnostic.

        This location is where Clang would print the caret ('^') when displaying the diagnostic on the command line.
        """,

        CXDiagnostic("Diagnostic", "")
    )

    CXString(
        "getDiagnosticSpelling",
        "Retrieve the text of the given diagnostic.",

        CXDiagnostic("Diagnostic", "")
    )

    CXString(
        "getDiagnosticOption",
        "Retrieve the name of the command-line option that enabled this diagnostic.",

        CXDiagnostic("Diag", "the diagnostic to be queried"),
        nullable..CXString.p("Disable", "if non-#NULL, will be set to the option that disables this diagnostic (if any)"),

        returnDoc = "a string that contains the command-line option used to enable this warning, such as \"-Wconversion\" or \"-pedantic\""
    )

    unsigned(
        "getDiagnosticCategory",
        """
        Retrieve the category number for this diagnostic.

        Diagnostics can be categorized into groups along with other, related diagnostics (e.g., diagnostics under the same warning flag). This routine
        retrieves the category number for the given diagnostic.
        """,

        CXDiagnostic("Diagnostic", ""),

        returnDoc = "the number of the category that contains this diagnostic, or zero if this diagnostic is uncategorized"
    )

    /*CXString(
        "getDiagnosticCategoryName",
        "Retrieve the name of a particular diagnostic category.  This is now deprecated.  Use clang_getDiagnosticCategoryText() instead.",

        unsigned("Category", "a diagnostic category number, as returned by {@code clang_getDiagnosticCategory()}"),

        returnDoc = "the name of the given diagnostic category"
    )*/

    CXString(
        "getDiagnosticCategoryText",
        "Retrieve the diagnostic category text for a given diagnostic.",

        CXDiagnostic("Diagnostic", ""),

        returnDoc = "the text of the given diagnostic category"
    )

    unsigned(
        "getDiagnosticNumRanges",
        "Determine the number of source ranges associated with the given diagnostic.",

        CXDiagnostic("Diagnostic", "")
    )

    CXSourceRange(
        "getDiagnosticRange",
        """
        Retrieve a source range associated with the diagnostic.

        A diagnostic's source ranges highlight important elements in the source code. On the command line, Clang displays source ranges by underlining them
        with '~' characters.
        """,

        CXDiagnostic("Diagnostic", "the diagnostic whose range is being extracted"),
        unsigned("Range", "the zero-based index specifying which range to"),

        returnDoc = "the requested source range"
    )

    unsigned(
        "getDiagnosticNumFixIts",
        "Determine the number of fix-it hints associated with the given diagnostic.",

        CXDiagnostic("Diagnostic", "")
    )

    CXString(
        "getDiagnosticFixIt",
        """
        Retrieve the replacement information for a given fix-it.

        Fix-its are described in terms of a source range whose contents should be replaced by a string. This approach generalizes over three kinds of
        operations: removal of source code (the range covers the code to be removed and the replacement string is empty), replacement of source code (the range
        covers the code to be replaced and the replacement string provides the new code), and insertion (both the start and end of the range point at the
        insertion location, and the replacement string provides the text to insert).
        """,

        CXDiagnostic("Diagnostic", "the diagnostic whose fix-its are being queried"),
        unsigned("FixIt", "the zero-based index of the fix-it"),
        CXSourceRange.p(
            "ReplacementRange",
            """
            the source range whose contents will be replaced with the returned replacement string. Note that source ranges are half-open ranges [a, b), so the
            source code should be replaced from a and up to (but not including) b.
            """
        ),

        returnDoc = "a string containing text that should be replace the source code indicated by the {@code ReplacementRange}"
    )

    CXString(
        "getTranslationUnitSpelling",
        "Get the original translation unit source file name.",

        CXTranslationUnit("CTUnit", "")
    )

    CXTranslationUnit(
        "createTranslationUnitFromSourceFile",
        """
        Return the {@code CXTranslationUnit} for a given source file and the provided command line arguments one would pass to the compiler.

        Note: The {@code source_filename} argument is optional. If the caller provides a #NULL pointer, the name of the source file is expected to reside in
        the specified command line arguments.

        Note: When encountered in {@code clang_command_line_args}, the following options are ignored:

        ${ul(
            "'-c'",
            "'-emit-ast'",
            "'-fsyntax-only'",
            "'-o &lt;output file&gt;' (both '-o' and ' &lt;output file&gt;' are ignored)"
        )}
        """,

        CXIndex("CIdx", "the index object with which the translation unit will be associated"),
        nullable..charUTF8.const.p(
            "source_filename",
            "the name of the source file to load, or #NULL if the source file is included in {@code clang_command_line_args}"
        ),
        AutoSize("clang_command_line_args")..int("num_clang_command_line_args", "the number of command-line arguments in {@code clang_command_line_args}"),
        nullable..charUTF8.const.p.const.p(
            "clang_command_line_args",
            """
            the command-line arguments that would be passed to the {@code clang} executable if it were being invoked out-of-process. These command-line options
            will be parsed and will affect how the translation unit is parsed. Note that the following options are ignored: '-c', '-emit-ast', '-fsyntax-only'
            (which is the default), and '-o &lt;output file&gt;'.
            """
        ),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", "the number of unsaved file entries in {@code unsaved_files}"),
        Input..nullable..CXUnsavedFile.p(
            "unsaved_files",
            """
            the files that have not yet been saved to disk but may be required for code completion, including the contents of those files. The contents and
            name of these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their validity until
            the call to this function returns.
            """
        )
    )

    CXTranslationUnit(
        "createTranslationUnit",
        """
        Same as #createTranslationUnit2(), but returns the {@code CXTranslationUnit} instead of an error code. In case of an error this routine returns a
        #NULL {@code CXTranslationUnit}, without further detailed error codes.
        """,

        CXIndex("CIdx", ""),
        charUTF8.const.p("ast_filename", "")
    )

    CXErrorCode(
        "createTranslationUnit2",
        "Create a translation unit from an AST file ({@code -emit-ast}).",

        CXIndex("CIdx", ""),
        charUTF8.const.p("ast_filename", ""),
        Check(1)..CXTranslationUnit.p("out_TU", "a non-#NULL pointer to store the created {@code CXTranslationUnit}"),

        returnDoc = "zero on success, otherwise returns an error code"
    )

    unsigned(
        "defaultEditingTranslationUnitOptions",
        """
        Returns the set of flags that is suitable for parsing a translation unit that is being edited.

        The set of flags returned provide options for #parseTranslationUnit() to indicate that the translation unit is likely to be reparsed many times, either
        explicitly (via #reparseTranslationUnit()) or implicitly (e.g., by code completion (#codeCompleteAt()). The returned flag set contains an unspecified
        set of optimizations (e.g., the precompiled preamble) geared toward improving the performance of these routines. The set of optimizations enabled may
        change from one version to the next.
        """,

        void()
    )

    CXTranslationUnit(
        "parseTranslationUnit",
        """
        Same as #parseTranslationUnit2(), but returns the {@code CXTranslationUnit} instead of an error code. In case of an error this routine returns a #NULL
        {@code CXTranslationUnit}, without further detailed error codes.
        """,

        CXIndex("CIdx", ""),
        nullable..charUTF8.const.p("source_filename", ""),
        nullable..charUTF8.const.p.const.p("command_line_args", ""),
        AutoSize("command_line_args")..int("num_command_line_args", ""),
        Input..nullable..CXUnsavedFile.p("unsaved_files", ""),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", ""),
        unsigned("options", "")
    )

    CXErrorCode(
        "parseTranslationUnit2",
        """
        Parse the given source file and the translation unit corresponding to that file.

        This routine is the main entry point for the Clang C API, providing the ability to parse a source file into a translation unit that can then be queried
        by other functions in the API. This routine accepts a set of command-line arguments so that the compilation can be configured in the same way that the
        compiler is configured on the command line.
        """,

        CXIndex("CIdx", "the index object with which the translation unit will be associated"),
        nullable..charUTF8.const.p(
            "source_filename",
            "the name of the source file to load, or #NULL if the source file is included in {@code command_line_args}"),
        nullable..charUTF8.const.p.const.p(
            "command_line_args",
            """
            the command-line arguments that would be passed to the {@code clang} executable if it were being invoked out-of-process. These command-line options
            will be parsed and will affect how the translation unit is parsed. Note that the following options are ignored: '-c', '-emit-ast', '-fsyntax-only'
            (which is the default), and '-o &lt;output file&gt;'.
            """
        ),
        AutoSize("command_line_args")..int("num_command_line_args", "the number of command-line arguments in {@code command_line_args}"),
        Input..nullable..CXUnsavedFile.p(
            "unsaved_files",
            """
            the files that have not yet been saved to disk but may be required for parsing, including the contents of those files. The contents and name of
            these files (as specified by CXUnsavedFile) are copied when necessary, so the client only needs to guarantee their validity until the call to this
            function returns.
            """
        ),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", "the number of unsaved file entries in {@code unsaved_files}"),
        unsigned(
            "options",
            """
            a bitmask of options that affects how the translation unit is managed but not its compilation. This should be a bitwise OR of the
            CXTranslationUnit_XXX flags.
            """
        ),
        Check(1)..CXTranslationUnit.p(
            "out_TU",
            """
            a non-#NULL pointer to store the created {@code CXTranslationUnit}, describing the parsed code and containing any diagnostics produced by the
            compiler
            """
        ),

        returnDoc = "zero on success, otherwise returns an error code"
    )

    CXErrorCode(
        "parseTranslationUnit2FullArgv",
        """
        Same as #parseTranslationUnit2() but requires a full command line for {@code command_line_args} including {@code argv[0]}. This is useful if the
        standard library paths are relative to the binary.
        """,

        CXIndex("CIdx", ""),
        nullable..charUTF8.const.p("source_filename", ""),
        charUTF8.const.p.const.p("command_line_args", ""),
        AutoSize("command_line_args")..int("num_command_line_args", ""),
        nullable..CXUnsavedFile.p("unsaved_files", ""),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", ""),
        unsigned("options", ""),
        Check(1)..CXTranslationUnit.p("out_TU", "")
    )

    unsigned(
        "defaultSaveOptions",
        """
        Returns the set of flags that is suitable for saving a translation unit.

        The set of flags returned provide options for #saveTranslationUnit() by default. The returned flag set contains an unspecified set of options that save
        translation units with the most commonly-requested data.
        """,

        CXTranslationUnit("TU", "")
    )

    int(
        "saveTranslationUnit",
        """
        Saves a translation unit into a serialized representation of that translation unit on disk.

        Any translation unit that was parsed without error can be saved into a file. The translation unit can then be deserialized into a new {@code
        CXTranslationUnit} with #createTranslationUnit() or, if it is an incomplete translation unit that corresponds to a header, used as a precompiled header
        when parsing other translation units.
        """,

        CXTranslationUnit("TU", "the translation unit to save"),
        charUTF8.const.p("FileName", "the file to which the translation unit will be saved"),
        unsigned(
            "options",
            "a bitmask of options that affects how the translation unit is saved. This should be a bitwise OR of the {@code CXSaveTranslationUnit_XXX} flags."
        ),

        returnDoc =
        """
        a value that will match one of the enumerators of the {@code CXSaveError} enumeration. Zero (#SaveError_None) indicates that the translation unit was
        saved successfully, while a non-zero value indicates that a problem occurred.
        """
    )

    unsignedb(
        "suspendTranslationUnit",
        """
        Suspend a translation unit in order to free memory associated with it.

        A suspended translation unit uses significantly less memory but on the other side does not support any other calls than #reparseTranslationUnit() to
        resume it or #disposeTranslationUnit() to dispose it completely.
        """,

        CXTranslationUnit("TU", "")
    )

    void(
        "disposeTranslationUnit",
        "Destroy the specified CXTranslationUnit object.",

        CXTranslationUnit("TU", "")
    )

    unsigned(
        "defaultReparseOptions",
        """
        Returns the set of flags that is suitable for reparsing a translation unit.

        The set of flags returned provide options for {@code clang_reparseTranslationUnit()} by default. The returned flag set contains an unspecified set of
        optimizations geared toward common uses of reparsing. The set of optimizations enabled may change from one version to the next.
        """,

        CXTranslationUnit("TU", "")
    )

    int(
        "reparseTranslationUnit",
        """
        Reparse the source files that produced this translation unit.

        This routine can be used to re-parse the source files that originally created the given translation unit, for example because those source files have
        changed (either on disk or as passed via {@code unsaved_files}). The source code will be reparsed with the same command-line options as it was
        originally parsed.

        Reparsing a translation unit invalidates all cursors and source locations that refer into that translation unit. This makes reparsing a translation
        unit semantically equivalent to destroying the translation unit and then creating a new translation unit with the same command-line arguments. However,
        it may be more efficient to reparse a translation unit using this routine.
        """,

        CXTranslationUnit(
            "TU",
            """
            the translation unit whose contents will be re-parsed. The translation unit must originally have been built with {@code
            clang_createTranslationUnitFromSourceFile()}.
            """
        ),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", "the number of unsaved file entries in {@code unsaved_files}"),
        Input..nullable..CXUnsavedFile.p(
            "unsaved_files",
            """
            the files that have not yet been saved to disk but may be required for parsing, including the contents of those files. The contents and name of
            these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their validity until the call
            to this function returns.
            """
        ),
        unsigned(
            "options",
            """
            a bitset of options composed of the flags in {@code CXReparse_Flags}. The function #defaultReparseOptions() produces a default set of options
            recommended for most uses, based on the translation unit.
            """
        ),

        returnDoc =
        """
        0 if the sources could be reparsed. A non-zero error code will be returned if reparsing was impossible, such that the translation unit is invalid. In
        such cases, the only valid call for {@code TU} is #disposeTranslationUnit(). The error codes returned by this routine are described by the
        {@code CXErrorCode} enum.
        """
    )

    charUTF8.const.p(
        "getTUResourceUsageName",
        "Returns the human-readable null-terminated C string that represents the name of the memory category. This string should never be freed.",

        CXTUResourceUsageKind("kind", "")
    )

    CXTUResourceUsage(
        "getCXTUResourceUsage",
        "Return the memory usage of a translation unit.  This object should be released with #disposeCXTUResourceUsage().",

        CXTranslationUnit("TU", "")
    )

    void(
        "disposeCXTUResourceUsage",
        "",

        CXTUResourceUsage("usage", "")
    )

    CXTargetInfo(
        "getTranslationUnitTargetInfo",
        """
        Get target information for this translation unit.

        The {@code CXTargetInfo} object cannot outlive the {@code CXTranslationUnit} object.
        """,

        CXTranslationUnit("CTUnit", "")
    )

    void(
        "TargetInfo_dispose",
        "Destroy the {@code CXTargetInfo} object.",

        CXTargetInfo("Info", "")
    )

    CXString(
        "TargetInfo_getTriple",
        """
        Get the normalized target triple as a string.

        Returns the empty string in case of any error.
        """,

        CXTargetInfo("Info", "")
    )

    int(
        "TargetInfo_getPointerWidth",
        """
        Get the pointer width of the target in bits.

        Returns -1 in case of error.
        """,

        CXTargetInfo("Info", "")
    )

    CXCursor("getNullCursor", "Retrieve the #NULL cursor, which represents no entity.", void())

    CXCursor(
        "getTranslationUnitCursor",
        """
        Retrieve the cursor that represents the given translation unit.

        The translation unit cursor can be used to start traversing the various declarations within the given translation unit.
        """,

        CXTranslationUnit("TU", "")
    )

    unsignedb(
        "equalCursors",
        "Determine whether two cursors are equivalent.",

        CXCursor("A", ""),
        CXCursor("B", "")
    )

    intb(
        "Cursor_isNull",
        "Returns non-zero if {@code cursor} is null.",

        CXCursor("cursor", "")
    )

    unsigned(
        "hashCursor",
        "Compute a hash value for the given cursor.",

        CXCursor("cursor", "")
    )

    CXCursorKind(
        "getCursorKind",
        "Retrieve the kind of the given cursor.",

        CXCursor("cursor", "")
    )

    unsignedb(
        "isDeclaration",
        "Determine whether the given cursor kind represents a declaration.",

        CXCursorKind("kind", "")
    )

    IgnoreMissing..unsignedb(
        "isInvalidDeclaration",
        """
        Determine whether the given declaration is invalid.

        A declaration is invalid if it could not be parsed successfully.
        """,

        CXCursor("cursor", ""),

        returnDoc = "non-zero if the cursor represents a declaration and it is invalid, otherwise #NULL"
    )

    unsignedb(
        "isReference",
        """
        Determine whether the given cursor kind represents a simple reference.

        Note that other kinds of cursors (such as expressions) can also refer to other cursors. Use #getCursorReferenced() to determine whether a particular
        cursor refers to another entity.
        """,

        CXCursorKind("kind", "")
    )

    unsignedb(
        "isExpression",
        "Determine whether the given cursor kind represents an expression.",

        CXCursorKind("kind", "")
    )

    unsignedb(
        "isStatement",
        "Determine whether the given cursor kind represents a statement.",

        CXCursorKind("kind", "")
    )

    unsignedb(
        "isAttribute",
        "Determine whether the given cursor kind represents an attribute.",

        CXCursorKind("kind", "")
    )

    unsignedb(
        "Cursor_hasAttrs",
        "Determine whether the given cursor has any attributes.",

        CXCursor("C", "")
    )

    unsignedb(
        "isInvalid",
        "Determine whether the given cursor kind represents an invalid cursor.",

        CXCursorKind("kind", "")
    )

    unsignedb(
        "isTranslationUnit",
        "Determine whether the given cursor kind represents a translation unit.",

        CXCursorKind("kind", "")
    )

    unsignedb(
        "isPreprocessing",
        "Determine whether the given cursor represents a preprocessing element, such as a preprocessor directive or macro instantiation.",

        CXCursorKind("kind", "")
    )

    unsignedb(
        "isUnexposed",
        "Determine whether the given cursor represents a currently unexposed piece of the AST (e.g., CXCursor_UnexposedStmt).",

        CXCursorKind("kind", "")
    )

    CXLinkageKind(
        "getCursorLinkage",
        "Determine the linkage of the entity referred to by a given cursor.",

        CXCursor("cursor", "")
    )

    CXVisibilityKind(
        "getCursorVisibility",
        """
        Describe the visibility of the entity referred to by a cursor.

        This returns the default visibility if not explicitly specified by a visibility attribute. The default visibility may be changed by commandline
        arguments.
        """,

        CXCursor("cursor", "the cursor to query"),

        returnDoc = "the visibility of the cursor"
    )

    CXAvailabilityKind(
        "getCursorAvailability",
        "Determine the availability of the entity that this cursor refers to, taking the current target platform into account.",

        CXCursor("cursor", "the cursor to query"),

        returnDoc = "the availability of the cursor"
    )

    int(
        "getCursorPlatformAvailability",
        """
        Determine the availability of the entity that this cursor refers to on any platforms for which availability information is known.

        Note that the client is responsible for calling #disposeCXPlatformAvailability() to free each of the platform-availability structures returned. There
        are {@code min(N, availability_size)} such structures.
        """,

        CXCursor("cursor", "the cursor to query"),
        Check(1)..nullable..int.p("always_deprecated", "if non-#NULL, will be set to indicate whether the entity is deprecated on all platforms"),
        nullable..CXString.p(
            "deprecated_message",
            """
            if non-#NULL, will be set to the message text provided along with the unconditional deprecation of this entity. The client is responsible for
            deallocating this string.
            """
        ),
        Check(1)..nullable..int.p("always_unavailable", "if non-#NULL, will be set to indicate whether the entity is unavailable on all platforms"),
        nullable..CXString.p(
            "unavailable_message",
            """
            if non-#NULL, will be set to the message text provided along with the unconditional unavailability of this entity. The client is responsible for
            deallocating this string.
            """
        ),
        Check(1)..nullable..CXPlatformAvailability.p(
            "availability",
            """
            if non-#NULL, an array of {@code CXPlatformAvailability} instances that will be populated with platform availability information, up to either the
            number of platforms for which availability information is available (as returned by this function) or {@code availability_size}, whichever is
            smaller
            """
        ),
        AutoSize("availability")..int("availability_size", "the number of elements available in the {@code availability} array"),

        returnDoc = "the number of platforms (N) for which availability information is available (which is unrelated to {@code availability_size})"
    )

    void(
        "disposeCXPlatformAvailability",
        "Free the memory associated with a {@code CXPlatformAvailability} structure.",

        CXPlatformAvailability.p("availability", "")
    )

    CXLanguageKind(
        "getCursorLanguage",
        "Determine the \"language\" of the entity referred to by a given cursor.",

        CXCursor("cursor", "")
    )

    IgnoreMissing..CXTLSKind(
        "getCursorTLSKind",
        "Determine the \"thread-local storage (TLS) kind\" of the declaration referred to by a cursor.",

        CXCursor("cursor", "")
    )

    CXTranslationUnit(
        "Cursor_getTranslationUnit",
        "Returns the translation unit that a cursor originated from.",

        CXCursor("cursor", "")
    )

    CXCursorSet("createCXCursorSet", "Creates an empty CXCursorSet.", void())

    void(
        "disposeCXCursorSet",
        "Disposes a CXCursorSet and releases its associated memory.",

        CXCursorSet("cset", "")
    )

    unsignedb(
        "CXCursorSet_contains",
        "Queries a CXCursorSet to see if it contains a specific CXCursor.",

        CXCursorSet("cset", ""),
        CXCursor("cursor", ""),

        returnDoc = "non-zero if the set contains the specified cursor"
    )

    unsignedb(
        "CXCursorSet_insert",
        "Inserts a CXCursor into a CXCursorSet.",

        CXCursorSet("cset", ""),
        CXCursor("cursor", ""),

        returnDoc = "zero if the CXCursor was already in the set, and non-zero otherwise"
    )

    CXCursor(
        "getCursorSemanticParent",
        """
        Determine the semantic parent of the given cursor.

        The semantic parent of a cursor is the cursor that semantically contains the given {@code cursor}. For many declarations, the lexical and semantic
        parents are equivalent (the lexical parent is returned by #getCursorLexicalParent()). They diverge when declarations or definitions are provided
        out-of-line. For example:

        ${codeBlock("""
 class C {
  void f();
 };

 void C::f() { }""")}

        In the out-of-line definition of {@code C::f}, the semantic parent is the class {@code C}, of which this function is a member. The lexical parent is
        the place where the declaration actually occurs in the source code; in this case, the definition occurs in the translation unit. In general, the
        lexical parent for a given entity can change without affecting the semantics of the program, and the lexical parent of different declarations of the
        same entity may be different. Changing the semantic parent of a declaration, on the other hand, can have a major impact on semantics, and
        redeclarations of a particular entity should all have the same semantic context.

        In the example above, both declarations of {@code C::f} have {@code C} as their semantic context, while the lexical context of the first {@code C::f}
        is {@code C} and the lexical context of the second {@code C::f} is the translation unit.

        For global declarations, the semantic parent is the translation unit.
        """,

        CXCursor("cursor", "")
    )

    CXCursor(
        "getCursorLexicalParent",
        """
        Determine the lexical parent of the given cursor.

        The lexical parent of a cursor is the cursor in which the given {@code cursor} was actually written. For many declarations, the lexical and semantic
        parents are equivalent (the semantic parent is returned by #getCursorSemanticParent()). They diverge when declarations or definitions are provided
        out-of-line. For example:

        ${codeBlock("""
 class C {
  void f();
 };

 void C::f() { }""")}

        In the out-of-line definition of {@code C::f}, the semantic parent is the class {@code C}, of which this function is a member. The lexical parent is
        the place where the declaration actually occurs in the source code; in this case, the definition occurs in the translation unit. In general, the
        lexical parent for a given entity can change without affecting the semantics of the program, and the lexical parent of different declarations of the
        same entity may be different. Changing the semantic parent of a declaration, on the other hand, can have a major impact on semantics, and
        redeclarations of a particular entity should all have the same semantic context.

        In the example above, both declarations of {@code C::f} have {@code C} as their semantic context, while the lexical context of the first {@code C::f}
        is {@code C} and the lexical context of the second {@code C::f} is the translation unit.

        For declarations written in the global scope, the lexical parent is the translation unit.
        """,

        CXCursor("cursor", "")
    )

    void(
        "getOverriddenCursors",
        """
        Determine the set of methods that are overridden by the given method.

        In both Objective-C and C++, a method (aka virtual member function, in C++) can override a virtual method in a base class. For Objective-C, a method is
        said to override any method in the class's base class, its protocols, or its categories' protocols, that has the same selector and is of the same kind
        (class or instance). If no such method exists, the search continues to the class's superclass, its protocols, and its categories, and so on. A method
        from an Objective-C implementation is considered to override the same methods as its corresponding method in the interface.

        For C++, a virtual member function overrides any virtual member function with the same signature that occurs in its base classes. With multiple
        inheritance, a virtual member function can override several virtual member functions coming from different base classes.

        In all cases, this function determines the immediate overridden method, rather than all of the overridden methods. For example, if a method is
        originally declared in a class A, then overridden in B (which in inherits from A) and also in C (which inherited from B), then the only overridden
        method returned from this function when invoked on C's method will be B's method. The client may then invoke this function again, given the
        previously-found overridden methods, to map out the complete method-override set.
        """,

        CXCursor("cursor", "a cursor representing an Objective-C or C++ method. This routine will compute the set of methods that this method overrides."),
        Check(1)..CXCursor.p.p(
            "overridden",
            """
            a pointer whose pointee will be replaced with a pointer to an array of cursors, representing the set of overridden methods. If there are no
            overridden methods, the pointee will be set to #NULL. The pointee must be freed via a call to #disposeOverriddenCursors().
            """
        ),
        Check(1)..unsigned.p(
            "num_overridden",
            "a pointer to the number of overridden functions, will be set to the number of overridden functions in the array pointed to by {@code overridden}"
        )
    )

    void(
        "disposeOverriddenCursors",
        "Free the set of overridden cursors returned by {@code clang_getOverriddenCursors()}.",

        Unsafe..CXCursor.p("overridden", "")
    )

    CXFile(
        "getIncludedFile",
        "Retrieve the file that is included by the given inclusion directive cursor.",

        CXCursor("cursor", "")
    )

    CXCursor(
        "getCursor",
        """
        Map a source location to the cursor that describes the entity at that location in the source code.

        {@code clang_getCursor()} maps an arbitrary source location within a translation unit down to the most specific cursor that describes the entity at that
        location. For example, given an expression {@code x + y}, invoking {@code clang_getCursor()} with a source location pointing to "x" will return the
        cursor for "x"; similarly for "y". If the cursor points anywhere between "x" or "y" (e.g., on the + or the whitespace around it), clang_getCursor()
        will return a cursor referring to the "+" expression.
        """,

        CXTranslationUnit("TU", ""),
        CXSourceLocation("location", ""),

        returnDoc = "a cursor representing the entity at the given source location, or a #NULL cursor if no such entity can be found"
    )

    CXSourceLocation(
        "getCursorLocation",
        """
        Retrieve the physical location of the source constructor referenced by the given cursor.

        The location of a declaration is typically the location of the name of that declaration, where the name of that declaration would occur if it is
        unnamed, or some keyword that introduces that particular declaration. The location of a reference is where that reference occurs within the source
        code.
        """,

        CXCursor("cursor", "")
    )

    CXSourceRange(
        "getCursorExtent",
        """
        Retrieve the physical extent of the source construct referenced by the given cursor.

        The extent of a cursor starts with the file/line/column pointing at the first character within the source construct that the cursor refers to and ends
        with the last character within that source construct. For a declaration, the extent covers the declaration itself. For a reference, the extent covers
        the location of the reference (e.g., where the referenced entity was actually used).
        """,

        CXCursor("cursor", "")
    )

    CXType(
        "getCursorType",
        "Retrieve the type of a {@code CXCursor} (if any).",

        CXCursor("C", "")
    )

    CXString(
        "getTypeSpelling",
        """
        Pretty-print the underlying type using the rules of the language of the translation unit from which it came.

        If the type is invalid, an empty string is returned.
        """,

        CXType("CT", "")
    )

    CXType(
        "getTypedefDeclUnderlyingType",
        """
        Retrieve the underlying type of a typedef declaration.

        If the cursor does not reference a typedef declaration, an invalid type is returned.
        """,

        CXCursor("C", "")
    )

    CXType(
        "getEnumDeclIntegerType",
        """
        Retrieve the integer type of an enum declaration.

        If the cursor does not reference an enum declaration, an invalid type is returned.
        """,

        CXCursor("C", "")
    )

    long_long(
        "getEnumConstantDeclValue",
        """
        Retrieve the integer value of an enum constant declaration as a signed long long.

        If the cursor does not reference an enum constant declaration, {@code LLONG_MIN} is returned. Since this is also potentially a valid constant value,
        the kind of the cursor must be verified before calling this function.
        """,

        CXCursor("C", "")
    )

    unsigned_long_long(
        "getEnumConstantDeclUnsignedValue",
        """
        Retrieve the integer value of an enum constant declaration as an unsigned long long.

        If the cursor does not reference an enum constant declaration, {@code ULLONG_MAX} is returned. Since this is also potentially a valid constant value,
        the kind of the cursor must be verified before calling this function.
        """,

        CXCursor("C", "")
    )

    int(
        "getFieldDeclBitWidth",
        """
        Retrieve the bit width of a bit field declaration as an integer.

        If a cursor that is not a bit field declaration is passed in, -1 is returned.
        """,

        CXCursor("C", "")
    )

    int(
        "Cursor_getNumArguments",
        """
        Retrieve the number of non-variadic arguments associated with a given cursor.

        The number of arguments can be determined for calls as well as for declarations of functions or methods. For other cursors -1 is returned.
        """,

        CXCursor("C", "")
    )

    CXCursor(
        "Cursor_getArgument",
        """
        Retrieve the argument cursor of a function or method.

        The argument cursor can be determined for calls as well as for declarations of functions or methods. For other cursors and for invalid indices, an
        invalid cursor is returned.
        """,

        CXCursor("C", ""),
        unsigned("i", "")
    )

    int(
        "Cursor_getNumTemplateArguments",
        """
        Returns the number of template args of a function decl representing a template specialization.

        If the argument cursor cannot be converted into a template function declaration, -1 is returned.

        For example, for the following declaration and specialization:

        ${codeBlock("""
template <typename T, int kInt, bool kBool>
void foo() { ... }

template <>
void foo <float , -7, true>();""")}

        The value 3 would be returned from this call.
        """,

        CXCursor("C", "")
    )

    CXTemplateArgumentKind(
        "Cursor_getTemplateArgumentKind",
        """
        Retrieve the kind of the I'th template argument of the {@code CXCursor} {@code C}.

        If the argument {@code CXCursor} does not represent a {@code FunctionDecl}, an invalid template argument kind is returned.

        For example, for the following declaration and specialization:

        ${codeBlock("""
template <typename T, int kInt, bool kBool>
void foo() { ... }

template <>
void foo <float , -7, true>();""")}

        For I = 0, 1, and 2, {@code Type}, {@code Integral}, and {@code Integral} will be returned, respectively.
        """,

        CXCursor("C", ""),
        unsigned("I", "")
    )

    CXType(
        "Cursor_getTemplateArgumentType",
        """
        Retrieve a {@code CXType} representing the type of a {@code TemplateArgument} of a function decl representing a template specialization.

        If the argument {@code CXCursor does} not represent a {@code FunctionDecl} whose {@code I}'th template argument has a kind of
        {@code CXTemplateArgKind_Integral}, an invalid type is returned.

        For example, for the following declaration and specialization:

        ${codeBlock("""
template <typename T, int kInt, bool kBool>
void foo() { ... }

template <>
void foo <float , -7, true>();""")}

        If called with I = 0, "float", will be returned. Invalid types will be returned for I == 1 or 2.
        """,

        CXCursor("C", ""),
        unsigned("I", "")
    )

    long_long(
        "Cursor_getTemplateArgumentValue",
        """
        Retrieve the value of an {@code Integral} {@code TemplateArgument} (of a function decl representing a template specialization) as a {@code signed long
        long}.

        It is undefined to call this function on a {@code CXCursor} that does not represent a {@code FunctionDecl} or whose {@code I}'th template argument is
        not an integral value.

        For example, for the following declaration and specialization:

        ${codeBlock("""
template <typename T, int kInt, bool kBool>
void foo() { ... }

template <>
void foo <float , -7, true>();""")}

        If called with I = 1 or 2, -7 or true will be returned, respectively. For I == 0, this function's behavior is undefined.
        """,

        CXCursor("C", ""),
        unsigned("I", "")
    )

    unsigned_long_long(
        "Cursor_getTemplateArgumentUnsignedValue",
        """
        Retrieve the value of an {@code Integral} {@code TemplateArgument} (of a function decl representing a template specialization) as an {@code unsigned
        long long}.

        It is undefined to call this function on a {@code CXCursor} that does not represent a {@code FunctionDecl} or whose {@code I}'th template argument is
        not an integral value.

        For example, for the following declaration and specialization:

        ${codeBlock("""
template <typename T, int kInt, bool kBool>
void foo() { ... }

template <>
void foo <float , 2147483649, true>();""")}

        If called with I = 1 or 2, 2147483649 or true will be returned, respectively. For I == 0, this function's behavior is undefined.
        """,

        CXCursor("C", ""),
        unsigned("I", "")
    )

    unsignedb(
        "equalTypes",
        "Determine whether two {@code CXTypes} represent the same type.",

        CXType("A", ""),
        CXType("B", ""),

        returnDoc = "non-zero if the {@code CXTypes} represent the same type and zero otherwise"
    )

    CXType(
        "getCanonicalType",
        """
        Return the canonical type for a {@code CXType}.

        Clang's type system explicitly models typedefs and all the ways a specific type can be represented. The canonical type is the underlying type with all
        the "sugar" removed. For example, if 'T' is a typedef for 'int', the canonical type for 'T' would be 'int'.
        """,

        CXType("T", "")
    )

    unsignedb(
        "isConstQualifiedType",
        """
        Determine whether a {@code CXType} has the "const" qualifier set, without looking through typedefs that may have added "const" at a different level.
        """,

        CXType("T", "")
    )

    unsignedb(
        "Cursor_isMacroFunctionLike",
        "Determine whether a {@code CXCursor} that is a macro, is function like.",

        CXCursor("C", "")
    )

    unsignedb(
        "Cursor_isMacroBuiltin",
        "Determine whether a {@code CXCursor} that is a macro, is a builtin one.",

        CXCursor("C", "")
    )

    unsignedb(
        "Cursor_isFunctionInlined",
        "Determine whether a {@code CXCursor} that is a function declaration, is an inline declaration.",

        CXCursor("C", "")
    )

    unsignedb(
        "isVolatileQualifiedType",
        """
        Determine whether a {@code CXType} has the "volatile" qualifier set, without looking through typedefs that may have added "volatile" at a different
        level.
        """,

        CXType("T", "")
    )

    unsignedb(
        "isRestrictQualifiedType",
        """
        Determine whether a {@code CXType} has the "restrict" qualifier set, without looking through typedefs that may have added "restrict" at a different
        level.
        """,

        CXType("T", "")
    )

    unsigned(
        "getAddressSpace",
        "Returns the address space of the given type.",

        CXType("T", "")
    )

    CXString(
        "getTypedefName",
        "Returns the typedef name of the given type.",

        CXType("CT", "")
    )

    CXType(
        "getPointeeType",
        "For pointer types, returns the type of the pointee.",

        CXType("T", "")
    )

    CXCursor(
        "getTypeDeclaration",
        "Return the cursor for the declaration of the given type.",

        CXType("T", "")
    )

    CXString(
        "getDeclObjCTypeEncoding",
        "Returns the Objective-C type encoding for the specified declaration.",

        CXCursor("C", "")
    )

    CXString(
        "Type_getObjCEncoding",
        "Returns the Objective-C type encoding for the specified {@code CXType}.",

        CXType("type", "")
    )

    CXString(
        "getTypeKindSpelling",
        "Retrieve the spelling of a given {@code CXTypeKind}.",

        CXTypeKind("K", "")
    )

    CXCallingConv(
        "getFunctionTypeCallingConv",
        """
        Retrieve the calling convention associated with a function type.

        If a non-function type is passed in, #CallingConv_Invalid is returned.
        """,

        CXType("T", "")
    )

    CXType(
        "getResultType",
        """
        Retrieve the return type associated with a function type.

        If a non-function type is passed in, an invalid type is returned.
        """,

        CXType("T", "")
    )

    int(
        "getExceptionSpecificationType",
        """
        Retrieve the exception specification type associated with a function type. This is a value of type {@code CXCursor_ExceptionSpecificationKind}.

        If a non-function type is passed in, an error code of -1 is returned.
        """,

        CXType("T", "")
    )

    int(
        "getNumArgTypes",
        """
        Retrieve the number of non-variadic parameters associated with a function type.

        If a non-function type is passed in, -1 is returned.
        """,

        CXType("T", "")
    )

    CXType(
        "getArgType",
        """
        Retrieve the type of a parameter of a function type.

        If a non-function type is passed in or the function does not have enough parameters, an invalid type is returned.
        """,

        CXType("T", ""),
        unsigned("i", "")
    )

    IgnoreMissing..CXType(
        "Type_getObjCObjectBaseType",
        """
        Retrieves the base type of the {@code ObjCObjectType}.

        If the type is not an ObjC object, an invalid type is returned.
        """,

        CXType("T", "")
    )

    IgnoreMissing..unsigned(
        "Type_getNumObjCProtocolRefs",
        """
        Retrieve the number of protocol references associated with an ObjC object/id.

        If the type is not an ObjC object, 0 is returned.
        """,

        CXType("T", "")
    )

    IgnoreMissing..CXCursor(
        "Type_getObjCProtocolDecl",
        """
        Retrieve the decl for a protocol reference for an ObjC object/id.

        If the type is not an ObjC object or there are not enough protocol references, an invalid cursor is returned.
        """,

        CXType("T", ""),
        unsigned("i", "")
    )

    IgnoreMissing..unsigned(
        "Type_getNumObjCTypeArgs",
        """
        Retreive the number of type arguments associated with an ObjC object.

        If the type is not an ObjC object, 0 is returned.
        """,

        CXType("T", "")
    )

    IgnoreMissing..CXType(
        "Type_getObjCTypeArg",
        """
        Retrieve a type argument associated with an ObjC object.

        If the type is not an ObjC or the index is not valid, an invalid type is returned.
        """,

        CXType("T", ""),
        unsigned("i", "")
    )

    unsignedb(
        "isFunctionTypeVariadic",
        "Return 1 if the {@code CXType} is a variadic function type, and 0 otherwise.",

        CXType("T", "")
    )

    CXType(
        "getCursorResultType",
        """
        Retrieve the return type associated with a given cursor.

        This only returns a valid type if the cursor refers to a function or method.
        """,

        CXCursor("C", "")
    )

    int(
        "getCursorExceptionSpecificationType",
        """
        Retrieve the exception specification type associated with a given cursor. This is a value of type {@code CXCursor_ExceptionSpecificationKind}.

        This only returns a valid result if the cursor refers to a function or method.
        """,

        CXCursor("C", "")
    )

    unsignedb(
        "isPODType",
        "Return 1 if the {@code CXType} is a POD (plain old data) type, and 0 otherwise.",

        CXType("T", "")
    )

    CXType(
        "getElementType",
        """
        Return the element type of an array, complex, or vector type.

        If a type is passed in that is not an array, complex, or vector type, an invalid type is returned.
        """,

        CXType("T", "")
    )

    long_long(
        "getNumElements",
        """
        Return the number of elements of an array or vector type.

        If a type is passed in that is not an array or vector type, -1 is returned.
        """,

        CXType("T", "")
    )

    CXType(
        "getArrayElementType",
        """
        Return the element type of an array type.

        If a non-array type is passed in, an invalid type is returned.
        """,

        CXType("T", "")
    )

    long_long(
        "getArraySize",
        """
        Return the array size of a constant array.

        If a non-array type is passed in, -1 is returned.
        """,

        CXType("T", "")
    )

    CXType(
        "Type_getNamedType",
        """
        Retrieve the type named by the qualified-id.

        If a non-elaborated type is passed in, an invalid type is returned.
        """,

        CXType("T", "")
    )

    unsignedb(
        "Type_isTransparentTagTypedef",
        """
        Determine if a typedef is 'transparent' tag.

        A typedef is considered 'transparent' if it shares a name and spelling location with its underlying tag type, as is the case with the {@code NS_ENUM}
        macro.
        """,

        CXType("T", ""),

        returnDoc = "non-zero if transparent and zero otherwise"
    )

    IgnoreMissing..CXTypeNullabilityKind(
        "Type_getNullability",
        "Retrieve the nullability kind of a pointer type.",

        CXType("T", "")
    )

    long_long(
        "Type_getAlignOf",
        """
        Return the alignment of a type in bytes as per {@code C++[expr.alignof]} standard.

        If the type declaration is invalid, #TypeLayoutError_Invalid is returned. If the type declaration is an incomplete type, #TypeLayoutError_Incomplete is
        returned. If the type declaration is a dependent type, #TypeLayoutError_Dependent is returned. If the type declaration is not a constant size type,
        #TypeLayoutError_NotConstantSize is returned.
        """,

        CXType("T", "")
    )

    CXType(
        "Type_getClassType",
        """
        Return the class type of an member pointer type.

        If a non-member-pointer type is passed in, an invalid type is returned.
        """,

        CXType("T", "")
    )

    long_long(
        "Type_getSizeOf",
        """
        Return the size of a type in bytes as per {@code C++[expr.sizeof]} standard.

        If the type declaration is invalid, #TypeLayoutError_Invalid is returned. If the type declaration is an incomplete type, #TypeLayoutError_Incomplete is
        returned. If the type declaration is a dependent type, #TypeLayoutError_Dependent is returned.
        """,

        CXType("T", "")
    )

    long_long(
        "Type_getOffsetOf",
        """
        Return the offset of a field named {@code S} in a record of type {@code T} in bits as it would be returned by {@code __offsetof__} as per
        {@code C++11[18.2p4]}

        If the cursor is not a record field declaration, #TypeLayoutError_Invalid is returned. If the field's type declaration is an incomplete type,
        #TypeLayoutError_Incomplete is returned. If the field's type declaration is a dependent type, #TypeLayoutError_Dependent is returned. If the field's
        name {@code S} is not found, #TypeLayoutError_InvalidFieldName is returned.
        """,

        CXType("T", ""),
        charUTF8.const.p("S", "")
    )

    IgnoreMissing..CXType(
        "Type_getModifiedType",
        """
        Return the type that was modified by this attributed type.

        If the type is not an attributed type, an invalid type is returned.
        """,

        CXType("T", "")
    )

    long_long(
        "Cursor_getOffsetOfField",
        """
        Return the offset of the field represented by the Cursor.

        If the cursor is not a field declaration, -1 is returned. If the cursor semantic parent is not a record field declaration, #TypeLayoutError_Invalid is
        returned. If the field's type declaration is an incomplete type, #TypeLayoutError_Incomplete is returned. If the field's type declaration is a
        dependent type, #TypeLayoutError_Dependent is returned. If the field's name S is not found, #TypeLayoutError_InvalidFieldName is returned.
        """,

        CXCursor("C", "")
    )

    unsignedb(
        "Cursor_isAnonymous",
        "Determine whether the given cursor represents an anonymous record declaration.",

        CXCursor("C", "")
    )

    int(
        "Type_getNumTemplateArguments",
        "Returns the number of template arguments for given template specialization, or -1 if type {@code T} is not a template specialization.",

        CXType("T", "")
    )

    CXType(
        "Type_getTemplateArgumentAsType",
        """
        Returns the type template argument of a template class specialization at given index.

        This function only returns template type arguments and does not handle template template arguments or variadic packs.
        """,

        CXType("T", ""),
        unsigned("i", "")
    )

    CXRefQualifierKind(
        "Type_getCXXRefQualifier",
        """
        Retrieve the ref-qualifier kind of a function or method.

        The ref-qualifier is returned for C++ functions or methods. For other types or non-C++ declarations, #RefQualifier_None is returned.
        """,

        CXType("T", "")
    )

    unsignedb(
        "Cursor_isBitField",
        "Returns non-zero if the cursor specifies a Record member that is a bitfield.",

        CXCursor("C", "")
    )

    unsignedb(
        "isVirtualBase",
        "Returns 1 if the base class specified by the cursor with kind #Cursor_CXXBaseSpecifier is virtual.",

        CXCursor("cursor", "")
    )

    CX_CXXAccessSpecifier(
        "getCXXAccessSpecifier",
        """
        Returns the access control level for the referenced object.

        If the cursor refers to a C++ declaration, its access control level within its parent scope is returned. Otherwise, if the cursor refers to a base
        specifier or access specifier, the specifier itself is returned.
        """,

        CXCursor("cursor", "")
    )

    CX_StorageClass(
        "Cursor_getStorageClass",
        """
        Returns the storage class for a function or variable declaration.

        If the passed in Cursor is not a function or variable declaration, #_SC_Invalid is returned else the storage class.
        """,

        CXCursor("cursor", "")
    )

    unsigned(
        "getNumOverloadedDecls",
        "Determine the number of overloaded declarations referenced by a #Cursor_OverloadedDeclRef cursor.",

        CXCursor("cursor", "the cursor whose overloaded declarations are being queried"),

        returnDoc = "the number of overloaded declarations referenced by {@code cursor}. If it is not a {@code CXCursor_OverloadedDeclRef} cursor, returns 0."
    )

    CXCursor(
        "getOverloadedDecl",
        "Retrieve a cursor for one of the overloaded declarations referenced by a #Cursor_OverloadedDeclRef cursor.",

        CXCursor("cursor", "the cursor whose overloaded declarations are being queried"),
        unsigned("index", "the zero-based index into the set of overloaded declarations in the cursor"),

        returnDoc =
        """
        a cursor representing the declaration referenced by the given {@code cursor} at the specified {@code index}. If the cursor does not have an associated
        set of overloaded declarations, or if the index is out of bounds, returns #getNullCursor();
        """
    )

    CXType(
        "getIBOutletCollectionType",
        "For cursors representing an {@code iboutletcollection} attribute, this function returns the collection element type.",

        CXCursor("cursor", "")
    )

    unsignedb(
        "visitChildren",
        """
        Visit the children of a particular cursor.

        This function visits all the direct children of the given cursor, invoking the given {@code visitor} function with the cursors of each visited child.
        The traversal may be recursive, if the visitor returns #ChildVisit_Recurse. The traversal may also be ended prematurely, if the visitor returns
        #ChildVisit_Break.
        """,

        CXCursor(
            "parent",
            "the cursor whose child may be visited. All kinds of cursors can be visited, including invalid cursors (which, by definition, have no children)."
        ),
        CXCursorVisitor("visitor", "the visitor function that will be invoked for each child of {@code parent}"),
        nullable..CXClientData(
            "client_data",
            "pointer data supplied by the client, which will be passed to the visitor each time it is invoked"
        ),

        returnDoc = "a non-zero value if the traversal was terminated prematurely by the visitor returning #ChildVisit_Break"
    )

    CXString(
        "getCursorUSR",
        """
        Retrieve a Unified Symbol Resolution (USR) for the entity referenced by the given cursor.

        A Unified Symbol Resolution (USR) is a string that identifies a particular entity (function, class, variable, etc.) within a program. USRs can be
        compared across translation units to determine, e.g., when references in one translation refer to an entity defined in another translation unit.
        """,

        CXCursor("cursor", "")
    )

    CXString(
        "constructUSR_ObjCClass",
        "Construct a USR for a specified Objective-C class.",

        charUTF8.const.p("class_name", "")
    )

    CXString(
        "constructUSR_ObjCCategory",
        "Construct a USR for a specified Objective-C category.",

        charUTF8.const.p("class_name", ""),
        charUTF8.const.p("category_name", "")
    )

    CXString(
        "constructUSR_ObjCProtocol",
        "Construct a USR for a specified Objective-C protocol.",

        charUTF8.const.p("protocol_name", "")
    )

    CXString(
        "constructUSR_ObjCIvar",
        "Construct a USR for a specified Objective-C instance variable and the USR for its containing class.",

        charUTF8.const.p("name", ""),
        CXString("classUSR", "")
    )

    CXString(
        "constructUSR_ObjCMethod",
        "Construct a USR for a specified Objective-C method and the USR for its containing class.",

        charUTF8.const.p("name", ""),
        unsignedb("isInstanceMethod", ""),
        CXString("classUSR", "")
    )

    CXString(
        "constructUSR_ObjCProperty",
        "Construct a USR for a specified Objective-C property and the USR for its containing class.",

        charUTF8.const.p("property", ""),
        CXString("classUSR", "")
    )

    CXString(
        "getCursorSpelling",
        "Retrieve a name for the entity referenced by this cursor.",

        CXCursor("cursor", "")
    )

    CXSourceRange(
        "Cursor_getSpellingNameRange",
        """
        Retrieve a range for a piece that forms the cursors spelling name. Most of the times there is only one range for the complete spelling but for
        Objective-C methods and Objective-C message expressions, there are multiple pieces for each selector identifier.
        """,

        CXCursor("cursor", ""),
        unsigned(
            "pieceIndex",
            "the index of the spelling name piece. If this is greater than the actual number of pieces, it will return a #NULL (invalid) range."
        ),
        unsigned("options", "reserved")
    )

    IgnoreMissing..unsigned(
        "PrintingPolicy_getProperty",
        "Get a property value for the given printing policy.",

        CXPrintingPolicy("Policy", ""),
        CXPrintingPolicyProperty("Property", "")
    )

    IgnoreMissing..void(
        "PrintingPolicy_setProperty",
        "Set a property value for the given printing policy.",

        CXPrintingPolicy("Policy", ""),
        CXPrintingPolicyProperty("Property", ""),
        unsigned("Value", "")
    )

    IgnoreMissing..CXPrintingPolicy(
        "getCursorPrintingPolicy",
        """
        Retrieve the default policy for the cursor.

        The policy should be released after use with {@code clang_PrintingPolicy_dispose}.
        """,

        CXCursor("cursor", "")
    )

    IgnoreMissing..void(
        "PrintingPolicy_dispose",
        "Release a printing policy.",

        CXPrintingPolicy("Policy", "")
    )

    IgnoreMissing..CXString(
        "getCursorPrettyPrinted",
        "Pretty print declarations.",

        CXCursor("Cursor", "the cursor representing a declaration"),
        CXPrintingPolicy("Policy", "the policy to control the entities being printed. If #NULL, a default policy is used."),

        returnDoc = "the pretty printed declaration or the empty string for other cursors"
    )

    CXString(
        "getCursorDisplayName",
        """
        Retrieve the display name for the entity referenced by this cursor.

        The display name contains extra information that helps identify the cursor, such as the parameters of a function or template or the arguments of a
        class template specialization.
        """,

        CXCursor("cursor", "")
    )

    CXCursor(
        "getCursorReferenced",
        """
        For a cursor that is a reference, retrieve a cursor representing the entity that it references.

        Reference cursors refer to other entities in the AST. For example, an Objective-C superclass reference cursor refers to an Objective-C class. This
        function produces the cursor for the Objective-C class from the cursor for the superclass reference. If the input cursor is a declaration or
        definition, it returns that declaration or definition unchanged. Otherwise, returns the #NULL cursor.
        """,

        CXCursor("cursor", "")
    )

    CXCursor(
        "getCursorDefinition",
        """
        For a cursor that is either a reference to or a declaration of some entity, retrieve a cursor that describes the definition of that entity.

        Some entities can be declared multiple times within a translation unit, but only one of those declarations can also be a definition. For example,
        given:

        ${codeBlock("""
  int f(int, int);
  int g(int x, int y) { return f(x, y); }
  int f(int a, int b) { return a + b; }
  int f(int, int);""")}

        there are three declarations of the function "f", but only the second one is a definition. The {@code clang_getCursorDefinition()} function will take
        any cursor pointing to a declaration of "f" (the first or fourth lines of the example) or a cursor referenced that uses "f" (the call to "f' inside
        "g") and will return a declaration cursor pointing to the definition (the second "f" declaration).

        If given a cursor for which there is no corresponding definition, e.g., because there is no definition of that entity within this translation unit,
        returns a #NULL cursor.
        """,

        CXCursor("cursor", "")
    )

    unsignedb(
        "isCursorDefinition",
        "Determine whether the declaration pointed to by this cursor is also a definition of that entity.",

        CXCursor("cursor", "")
    )

    CXCursor(
        "getCanonicalCursor",
        """
        Retrieve the canonical cursor corresponding to the given cursor.

        In the C family of languages, many kinds of entities can be declared several times within a single translation unit. For example, a structure type can
        be forward-declared (possibly multiple times) and later defined:

        ${codeBlock("""
 struct X;
 struct X;
 struct X {
   int member;
 };""")}

        The declarations and the definition of {@code X} are represented by three different cursors, all of which are declarations of the same underlying
        entity. One of these cursor is considered the "canonical" cursor, which is effectively the representative for the underlying entity. One can determine
        if two cursors are declarations of the same underlying entity by comparing their canonical cursors.
        """,

        CXCursor("cursor", ""),

        returnDoc = "the canonical cursor for the entity referred to by the given cursor"
    )

    int(
        "Cursor_getObjCSelectorIndex",
        """
        If the cursor points to a selector identifier in an Objective-C method or message expression, this returns the selector index.

        After getting a cursor with #getCursor(), this can be called to determine if the location points to a selector identifier.
        """,

        CXCursor("cursor", ""),

        returnDoc =
        "the selector index if the cursor is an Objective-C method or message expression and the cursor is pointing to a selector identifier, or -1 otherwise"
    )

    intb(
        "Cursor_isDynamicCall",
        """
        Given a cursor pointing to a C++ method call or an Objective-C message, returns non-zero if the method/message is "dynamic", meaning:

        For a C++ method: the call is virtual. For an Objective-C message: the receiver is an object instance, not 'super' or a specific class.

        If the method/message is "static" or the cursor does not point to a method/message, it will return zero.
        """,

        CXCursor("C", "")
    )

    CXType(
        "Cursor_getReceiverType",
        "Given a cursor pointing to an Objective-C message or property reference, or C++ method call, returns the {@code CXType} of the receiver.",

        CXCursor("C", "")
    )

    unsigned(
        "Cursor_getObjCPropertyAttributes",
        """
        Given a cursor that represents a property declaration, return the associated property attributes. The bits are formed from {@code
        CXObjCPropertyAttrKind}.
        """,

        CXCursor("C", ""),
        unsigned("reserved", "reserved for future use, pass 0")
    )

    IgnoreMissing..CXString(
        "Cursor_getObjCPropertyGetterName",
        "Given a cursor that represents a property declaration, return the name of the method that implements the getter.",

        CXCursor("C", "")
    )

    IgnoreMissing..CXString(
        "Cursor_getObjCPropertySetterName",
        "Given a cursor that represents a property declaration, return the name of the method that implements the setter, if any.",

        CXCursor("C", "")
    )

    unsigned(
        "Cursor_getObjCDeclQualifiers",
        """
        Given a cursor that represents an Objective-C method or parameter declaration, return the associated Objective-C qualifiers for the return type or the
        parameter respectively. The bits are formed from CXObjCDeclQualifierKind.
        """,

        CXCursor("C", "")
    )

    unsignedb(
        "Cursor_isObjCOptional",
        """
        Given a cursor that represents an Objective-C method or property declaration, return non-zero if the declaration was affected by "@optional". Returns
        zero if the cursor is not such a declaration or it is "@required".
        """,

        CXCursor("C", "")
    )

    unsignedb(
        "Cursor_isVariadic",
        "Returns non-zero if the given cursor is a variadic function or method.",

        CXCursor("C", "")
    )

    unsignedb(
        "Cursor_isExternalSymbol",
        "Returns non-zero if the given cursor points to a symbol marked with external_source_symbol attribute.",

        CXCursor("C", ""),
        Check(1)..nullable..CXString.p("language", "if non-#NULL, and the attribute is present, will be set to the 'language' string from the attribute"),
        Check(1)..nullable..CXString.p("definedIn", "if non-#NULL, and the attribute is present, will be set to the 'definedIn' string from the attribute"),
        Check(1)..nullable..unsigned.p(
            "isGenerated",
            "if non-#NULL, and the attribute is present, will be set to non-zero if the 'generated_declaration' is set in the attribute"
        )
    )

    CXSourceRange(
        "Cursor_getCommentRange",
        """
        Given a cursor that represents a declaration, return the associated comment's source range. The range may include multiple consecutive comments with
        whitespace in between.
        """,

        CXCursor("C", "")
    )

    CXString(
        "Cursor_getRawCommentText",
        "Given a cursor that represents a declaration, return the associated comment text, including comment markers.",

        CXCursor("C", "")
    )

    CXString(
        "Cursor_getBriefCommentText",
        """
        Given a cursor that represents a documentable entity (e.g., declaration), return the associated; otherwise return the

        first paragraph.
        """,

        CXCursor("C", "")
    )

    CXString(
        "Cursor_getMangling",
        "Retrieve the {@code CXString} representing the mangled name of the cursor.",

        CXCursor("cursor", "")
    )

    CXStringSet.p(
        "Cursor_getCXXManglings",
        "Retrieve the {@code CXString}s representing the mangled symbols of the C++ constructor or destructor at the cursor.",

        CXCursor("cursor", "")
    )

    IgnoreMissing..CXStringSet.p(
        "Cursor_getObjCManglings",
        "Retrieve the {@code CXString}s representing the mangled symbols of the ObjC class interface or implementation at the cursor.",

        CXCursor("cursor", "")
    )

    CXModule(
        "Cursor_getModule",
        "Given a #Cursor_ModuleImportDecl cursor, return the associated module.",

        CXCursor("C", "")
    )

    CXModule(
        "getModuleForFile",
        "Given a {@code CXFile} header file, return the module that contains it, if one exists.",

        CXTranslationUnit("TU", ""),
        CXFile("file", "")
    )

    CXFile(
        "Module_getASTFile",
        "",

        CXModule("Module", "a module object"),

        returnDoc = "the module file where the provided module object came from"
    )

    CXModule(
        "Module_getParent",
        "",

        CXModule("Module", "a module object"),

        returnDoc = "the parent of a sub-module or #NULL if the given module is top-level, e.g. for 'std.vector' it will return the 'std' module."
    )

    CXString(
        "Module_getName",
        "",

        CXModule("Module", "a module object"),

        returnDoc = "the name of the module, e.g. for the 'std.vector' sub-module it will return \"vector\"."
    )

    CXString(
        "Module_getFullName",
        "",

        CXModule("Module", "a module object"),

        returnDoc = "the full name of the module, e.g. \"std.vector\"."
    )

    intb(
        "Module_isSystem",
        "",

        CXModule("Module", "a module object"),

        returnDoc = "non-zero if the module is a system one"
    )

    unsigned(
        "Module_getNumTopLevelHeaders",
        "",

        CXTranslationUnit("TU", ""),
        CXModule("Module", "a module object"),

        returnDoc = "the number of top level headers associated with this module"
    )

    CXFile(
        "Module_getTopLevelHeader",
        "",

        CXTranslationUnit("TU", ""),
        CXModule("Module", "a module object"),
        unsigned("Index", "top level header index (zero-based)"),

        returnDoc = "the specified top level header associated with the module"
    )

    unsignedb(
        "CXXConstructor_isConvertingConstructor",
        "Determine if a C++ constructor is a converting constructor.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXConstructor_isCopyConstructor",
        "Determine if a C++ constructor is a copy constructor.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXConstructor_isDefaultConstructor",
        "Determine if a C++ constructor is the default constructor.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXConstructor_isMoveConstructor",
        "Determine if a C++ constructor is a move constructor.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXField_isMutable",
        "Determine if a C++ field is declared 'mutable'.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXMethod_isDefaulted",
        "Determine if a C++ method is declared '= default'.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXMethod_isPureVirtual",
        "Determine if a C++ member function or member function template is pure virtual.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXMethod_isStatic",
        "Determine if a C++ member function or member function template is declared 'static'.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXMethod_isVirtual",
        """
        Determine if a C++ member function or member function template is explicitly declared 'virtual' or if it overrides a virtual method from one of the
        base classes.
        """,

        CXCursor("C", "")
    )

    IgnoreMissing..unsignedb(
        "CXXRecord_isAbstract",
        "Determine if a C++ record is abstract, i.e. whether a class or struct has a pure virtual member function.",

        CXCursor("C", "")
    )

    unsignedb(
        "EnumDecl_isScoped",
        "Determine if an enum declaration refers to a scoped enum.",

        CXCursor("C", "")
    )

    unsignedb(
        "CXXMethod_isConst",
        "Determine if a C++ member function or member function template is declared 'const'.",

        CXCursor("C", "")
    )

    CXCursorKind(
        "getTemplateCursorKind",
        """
        Given a cursor that represents a template, determine the cursor kind of the specializations would be generated by instantiating the template.

        This routine can be used to determine what flavor of function template, class template, or class template partial specialization is stored in the
        cursor. For example, it can describe whether a class template cursor is declared with "struct", "class" or "union".
        """,

        CXCursor("C", "the cursor to query. This cursor should represent a template declaration."),

        returnDoc =
        """
        the cursor kind of the specializations that would be generated by instantiating the template {@code C}. If {@code C} is not a template, returns
        #Cursor_NoDeclFound.
        """
    )

    CXCursor(
        "getSpecializedCursorTemplate",
        """
        Given a cursor that may represent a specialization or instantiation of a template, retrieve the cursor that represents the template that it specializes
        or from which it was instantiated.

        This routine determines the template involved both for explicit specializations of templates and for implicit instantiations of the template, both of
        which are referred to as "specializations". For a class template specialization (e.g., {@code std::vector<bool>}), this routine will return either the
        primary template ({@code std::vector}) or, if the specialization was instantiated from a class template partial specialization, the class template
        partial specialization. For a class template partial specialization and a function template specialization (including instantiations), this this
        routine will return the specialized template.

        For members of a class template (e.g., member functions, member classes, or static data members), returns the specialized or instantiated member.
        Although not strictly "templates" in the C++ language, members of class templates have the same notions of specializations and instantiations that
        templates do, so this routine treats them similarly.
        """,

        CXCursor("C", "a cursor that may be a specialization of a template or a member of a template"),

        returnDoc =
        """
        if the given cursor is a specialization or instantiation of a template or a member thereof, the template or member that it specializes or from which it
        was instantiated. Otherwise, returns a #NULL cursor.
        """
    )

    CXSourceRange(
        "getCursorReferenceNameRange",
        "Given a cursor that references something else, return the source range covering that reference.",

        CXCursor("C", "a cursor pointing to a member reference, a declaration reference, or an operator call"),
        unsigned(
            "NameFlags",
            "a bitset with three independent flags: #NameRange_WantQualifier, #NameRange_WantTemplateArgs, and #NameRange_WantSinglePiece"
        ),
        unsigned(
            "PieceIndex",
            """
            for contiguous names or when passing the flag #NameRange_WantSinglePiece, only one piece with index 0 is available. When the
            #NameRange_WantSinglePiece flag is not passed for a non-contiguous names, this index can be used to retrieve the individual pieces of the name.
            See also #NameRange_WantSinglePiece.
            """
        ),

        returnDoc =
        """
        the piece of the name pointed to by the given cursor. If there is no name, or if the {@code PieceIndex} is out-of-range, a null-cursor will be
        returned.
        """
    )

    IgnoreMissing..CXToken.p(
        "getToken",
        "Get the raw lexical token starting with the given location.",

        CXTranslationUnit("TU", "the translation unit whose text is being tokenized"),
        CXSourceLocation("Location", "the source location with which the token starts"),

        returnDoc =
        """
        the token starting with the given location or #NULL if no such token exist. The returned pointer must be freed with #disposeTokens() before the
        translation unit is destroyed.
        """
    )

    CXTokenKind(
        "getTokenKind",
        "Determine the kind of the given token.",

        CXToken("token", "")
    )

    CXString(
        "getTokenSpelling",
        """
        Determine the spelling of the given token.

        The spelling of a token is the textual representation of that token, e.g., the text of an identifier or keyword.
        """,

        CXTranslationUnit("TU", ""),
        CXToken("token", "")
    )

    CXSourceLocation(
        "getTokenLocation",
        "Retrieve the source location of the given token.",

        CXTranslationUnit("TU", ""),
        CXToken("token", "")
    )

    CXSourceRange(
        "getTokenExtent",
        "Retrieve a source range that covers the given token.",

        CXTranslationUnit("TU", ""),
        CXToken("token", "")
    )

    void(
        "tokenize",
        "Tokenize the source code described by the given range into raw lexical tokens.",

        CXTranslationUnit("TU", "the translation unit whose text is being tokenized"),
        CXSourceRange(
            "Range",
            "the source range in which text should be tokenized. All of the tokens produced by tokenization will fall within this source range,"
        ),
        Check(1)..CXToken.p.p(
            "Tokens",
            """
            this pointer will be set to point to the array of tokens that occur within the given source range. The returned pointer must be freed with
            #disposeTokens() before the translation unit is destroyed.
            """
        ),
        Check(1)..unsigned.p("NumTokens", "will be set to the number of tokens in the {@code *Tokens} array")
    )

    void(
        "annotateTokens",
        """
        Annotate the given set of tokens by providing cursors for each token that can be mapped to a specific entity within the abstract syntax tree.

        This token-annotation routine is equivalent to invoking #getCursor() for the source locations of each of the tokens. The cursors provided are filtered,
        so that only those cursors that have a direct correspondence to the token are accepted. For example, given a function call {@code f(x)},
        {@code clang_getCursor()} would provide the following cursors:

        ${ul(
            "when the cursor is over the 'f', a DeclRefExpr cursor referring to 'f'.",
            "when the cursor is over the '(' or the ')', a CallExpr referring to 'f'.",
            "when the cursor is over the 'x', a DeclRefExpr cursor referring to 'x'."
        )}

        Only the first and last of these cursors will occur within the annotate, since the tokens "f" and "x' directly refer to a function and a variable,
        respectively, but the parentheses are just a small part of the full syntax of the function call expression, which is not provided as an annotation.
        """,

        CXTranslationUnit("TU", "the translation unit that owns the given tokens"),
        Input..CXToken.p("Tokens", "the set of tokens to annotate"),
        AutoSize("Tokens", "Cursors")..unsigned("NumTokens", "the number of tokens in {@code Tokens}"),
        CXCursor.p("Cursors", "an array of {@code NumTokens} cursors, whose contents will be replaced with the cursors corresponding to each token")
    )

    void(
        "disposeTokens",
        "Free the given set of tokens.",

        CXTranslationUnit("TU", ""),
        Input..CXToken.p("Tokens", ""),
        AutoSize("Tokens")..unsigned("NumTokens", "")
    )

    CXString(
        "getCursorKindSpelling",
        "",

        CXCursorKind("Kind", "")
    )

    void(
        "getDefinitionSpellingAndExtent",
        "",

        CXCursor("cursor", ""),
        Check(1)..nullable..char.const.p.p("startBuf", ""),
        Check(1)..nullable..char.const.p.p("endBuf", ""),
        Check(1)..nullable..unsigned.p("startLine", ""),
        Check(1)..nullable..unsigned.p("startColumn", ""),
        Check(1)..nullable..unsigned.p("endLine", ""),
        Check(1)..nullable..unsigned.p("endColumn", "")
    )

    void("enableStackTraces", "", void())

    void(
        "executeOnThread",
        "",

        CXExecuteOnThread("fn", ""),
        nullable..opaque_p("user_data", ""),
        unsigned("stack_size", "")
    )

    CXCompletionChunkKind(
        "getCompletionChunkKind",
        "Determine the kind of a particular chunk within a completion string.",

        CXCompletionString("completion_string", "the completion string to query"),
        unsigned("chunk_number", "the 0-based index of the chunk in the completion string"),

        returnDoc = "the kind of the chunk at the index {@code chunk_number}"
    )

    CXString(
        "getCompletionChunkText",
        "Retrieve the text associated with a particular chunk within a completion string.",

        CXCompletionString("completion_string", "the completion string to query"),
        unsigned("chunk_number", "the 0-based index of the chunk in the completion string"),

        returnDoc = "the text associated with the chunk at index {@code chunk_number}"
    )

    CXCompletionString(
        "getCompletionChunkCompletionString",
        "Retrieve the completion string associated with a particular chunk within a completion string.",

        CXCompletionString("completion_string", "the completion string to query"),
        unsigned("chunk_number", "the 0-based index of the chunk in the completion string"),

        returnDoc = "the completion string associated with the chunk at index {@code chunk_number}"
    )

    unsigned(
        "getNumCompletionChunks",
        "Retrieve the number of chunks in the given code-completion string.",

        CXCompletionString("completion_string", "")
    )

    unsigned(
        "getCompletionPriority",
        """
        Determine the priority of this code completion.

        The priority of a code completion indicates how likely it is that this particular completion is the completion that the user will select. The priority
        is selected by various internal heuristics.
        """,

        CXCompletionString("completion_string", "the completion string to query"),

        returnDoc = "the priority of this completion string. Smaller values indicate higher-priority (more likely) completions."
    )

    CXAvailabilityKind(
        "getCompletionAvailability",
        "Determine the availability of the entity that this code-completion string refers to.",

        CXCompletionString("completion_string", "the completion string to query"),

        returnDoc = "the availability of the completion string"
    )

    unsigned(
        "getCompletionNumAnnotations",
        "Retrieve the number of annotations associated with the given completion string.",

        CXCompletionString("completion_string", "the completion string to query"),

        returnDoc = "the number of annotations associated with the given completion string"
    )

    CXString(
        "getCompletionAnnotation",
        "Retrieve the annotation associated with the given completion string.",

        CXCompletionString("completion_string", "the completion string to query"),
        unsigned("annotation_number", "the 0-based index of the annotation of the completion string"),

        returnDoc = "annotation string associated with the completion at index {@code annotation_number}, or a #NULL string if that annotation is not available"
    )

    CXString(
        "getCompletionParent",
        """
        Retrieve the parent context of the given completion string.

        The parent context of a completion string is the semantic parent of the declaration (if any) that the code completion represents. For example, a code
        completion for an Objective-C method would have the method's class or protocol as its context.
        """,

        CXCompletionString("completion_string", "the code completion string whose parent is being queried"),
        Check(1)..nullable..CXCursorKind.p("kind", "DEPRECATED: always set to #Cursor_NotImplemented if non-#NULL"),

        returnDoc = "the name of the completion parent, e.g., \"NSObject\" if the completion string represents a method in the {@code NSObject} class."
    )

    CXString(
        "getCompletionBriefComment",
        "Retrieve the brief documentation comment attached to the declaration that corresponds to the given completion string.",

        CXCompletionString("completion_string", "")
    )

    CXCompletionString(
        "getCursorCompletionString",
        "Retrieve a completion string for an arbitrary declaration or macro definition cursor.",

        CXCursor("cursor", "the cursor to query"),

        returnDoc = "a non-context-sensitive completion string for declaration and macro definition cursors, or #NULL for other kinds of cursors"
    )

    IgnoreMissing..unsigned(
        "getCompletionNumFixIts",
        """
        Retrieve the number of fix-its for the given completion index.

        Calling this makes sense only if #CodeComplete_IncludeCompletionsWithFixIts option was set.
        """,

        CXCodeCompleteResults.p("results", "the structure keeping all completion results"),
        unsigned("completion_index", "the index of the completion"),

        returnDoc = "the number of fix-its which must be applied before the completion at {@code completion_index} can be applied"
    )

    IgnoreMissing..CXString(
        "getCompletionFixIt",
        """
        Fix-its that <b>must</b> be applied before inserting the text for the corresponding completion.

        By default, #codeCompleteAt() only returns completions with empty fix-its. Extra completions with non-empty fix-its should be explicitly requested
        by setting #CodeComplete_IncludeCompletionsWithFixIts.

        For the clients to be able to compute position of the cursor after applying fix-its, the following conditions are guaranteed to hold for
        {@code replacement_range} of the stored fix-its:

        ${ul(
            """
            Ranges in the fix-its are guaranteed to never contain the completion point (or identifier under completion point, if any) inside them, except at
            the start or at the end of the range.
            """,
            """
            If a fix-it range starts or ends with completion point (or starts or ends after the identifier under completion point), it will contain at least
            one character. It allows to unambiguously recompute completion point after applying the fix-it.
            """
        )}

        The intuition is that provided fix-its change code around the identifier we complete, but are not allowed to touch the identifier itself or the
        completion point. One example of completions with corrections are the ones replacing '.' with '-&gt;' and vice versa:

        {@code std::unique_ptr<std::vector<int>> vec_ptr;} In 'vec_ptr.^', one of the completions is 'push_back', it requires replacing '.' with '-&gt;'. In
        'vec_ptr-&gt;^', one of the completions is 'release', it requires replacing '-&gt;' with '.'.
        """,

        CXCodeCompleteResults.p("results", "the structure keeping all completion results"),
        unsigned("completion_index", "the index of the completion"),
        unsigned("fixit_index", "the index of the fix-it for the completion at {@code completion_index}"),
        CXSourceRange.p("replacement_range", "the fix-it range that must be replaced before the completion at completion_index can be applied"),

        returnDoc = "the fix-it string that must replace the code at replacement_range before the completion at completion_index can be applied"
    )

    unsigned("defaultCodeCompleteOptions", "Returns a default set of code-completion options that can be passed to #codeCompleteAt().", void())

    CXCodeCompleteResults.p(
        "codeCompleteAt",
        """
        Perform code completion at a given location in a translation unit.

        This function performs code completion at a particular file, line, and column within source code, providing results that suggest potential code
        snippets based on the context of the completion. The basic model for code completion is that Clang will parse a complete source file, performing syntax
        checking up to the location where code-completion has been requested. At that point, a special code-completion token is passed to the parser, which
        recognizes this token and determines, based on the current location in the C/Objective-C/C++ grammar and the state of semantic analysis, what
        completions to provide. These completions are returned via a new {@code CXCodeCompleteResults} structure.

        Code completion itself is meant to be triggered by the client when the user types punctuation characters or whitespace, at which point the
        code-completion location will coincide with the cursor. For example, if {@code p} is a pointer, code-completion might be triggered after the "-" and
        then after the "&gt;" in {@code p->}. When the code-completion location is after the "&gt;", the completion results will provide, e.g., the members of
        the struct that "p" points to. The client is responsible for placing the cursor at the beginning of the token currently being typed, then filtering the
        results based on the contents of the token. For example, when code-completing for the expression {@code p->get}, the client should provide the location
        just after the "&gt;" (e.g., pointing at the "g") to this code-completion hook. Then, the client can filter the results based on the current token text
        ("get"), only showing those results that start with "get". The intent of this interface is to separate the relatively high-latency acquisition of
        code-completion results from the filtering of results on a per-character basis, which must have a lower latency.
        """,

        CXTranslationUnit(
            "TU",
            """
            the translation unit in which code-completion should occur. The source files for this translation unit need not be completely up-to-date (and the
            contents of those source files may be overridden via {@code unsaved_files}). Cursors referring into the translation unit may be invalidated by this
            invocation.
            """
        ),
        charUTF8.const.p(
            "complete_filename",
            "the name of the source file where code completion should be performed. This filename may be any file included in the translation unit."
        ),
        unsigned("complete_line", "the line at which code-completion should occur"),
        unsigned(
            "complete_column",
            """
            the column at which code-completion should occur. Note that the column should point just after the syntactic construct that initiated code
            completion, and not in the middle of a lexical token.
            """
        ),
        nullable..CXUnsavedFile.p(
            "unsaved_files",
            """
            the Files that have not yet been saved to disk but may be required for parsing or code completion, including the contents of those files. The
            contents and name of these files (as specified by {@code CXUnsavedFile}) are copied when necessary, so the client only needs to guarantee their
            validity until the call to this function returns.
            """
        ),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", "the number of unsaved file entries in {@code unsaved_files}"),
        unsigned(
            "options",
            """
            extra options that control the behavior of code completion, expressed as a bitwise OR of the enumerators of the {@code CXCodeComplete_Flags}
            enumeration. The #defaultCodeCompleteOptions() function returns a default set of code-completion options.
            """
        ),

        returnDoc =
        """
        if successful, a new {@code CXCodeCompleteResults} structure containing code-completion results, which should eventually be freed with
        #disposeCodeCompleteResults(). If code completion fails, returns #NULL.
        """
    )

    void(
        "sortCodeCompletionResults",
        "Sort the code-completion results in case-insensitive alphabetical order.",

        CXCompletionResult.p("Results", "the set of results to sort"),
        AutoSize("Results")..unsigned("NumResults", "the number of results in {@code Results}")
    )

    void(
        "disposeCodeCompleteResults",
        "Free the given set of code-completion results.",

        CXCodeCompleteResults.p("Results", "")
    )

    unsigned(
        "codeCompleteGetNumDiagnostics",
        "Determine the number of diagnostics produced prior to the location where code completion was performed.",

        CXCodeCompleteResults.p("Results", "")
    )

    CXDiagnostic(
        "codeCompleteGetDiagnostic",
        "Retrieve a diagnostic associated with the given code completion.",

        CXCodeCompleteResults.p("Results", "the code completion results to query"),
        unsigned("Index", "the zero-based diagnostic number to retrieve"),

        returnDoc = "the requested diagnostic. This diagnostic must be freed via a call to #disposeDiagnostic()."
    )

    unsigned_long_long(
        "codeCompleteGetContexts",
        "Determines what completions are appropriate for the context the given code completion.",

        CXCodeCompleteResults.p("Results", "the code completion results to query"),

        returnDoc = "the kinds of completions that are appropriate for use along with the given code completion results"
    )

    CXCursorKind(
        "codeCompleteGetContainerKind",
        """
        Returns the cursor kind for the container for the current code completion context. The container is only guaranteed to be set for contexts where a
        container exists (i.e. member accesses or Objective-C message sends); if there is not a container, this function will return #Cursor_InvalidCode.
        """,

        CXCodeCompleteResults.p("Results", "the code completion results to query"),
        Check(1)..unsigned.p(
            "IsIncomplete",
            """
            on return, this value will be false if Clang has complete information about the container. If Clang does not have complete information, this value
            will be true.
            """
        ),

        returnDoc = "the container kind, or #Cursor_InvalidCode if there is not a container"
    )

    CXString(
        "codeCompleteGetContainerUSR",
        """
        Returns the USR for the container for the current code completion context. If there is not a container for the current context, this function will
        return the empty string.
        """,

        CXCodeCompleteResults.p("Results", "the code completion results to query"),

        returnDoc = "the USR for the container"
    )

    CXString(
        "codeCompleteGetObjCSelector",
        """
        Returns the currently-entered selector for an Objective-C message send, formatted like "initWithFoo:bar:". Only guaranteed to return a non-empty string
        for #CompletionContext_ObjCInstanceMessage and #CompletionContext_ObjCClassMessage.
        """,

        CXCodeCompleteResults.p("Results", "the code completion results to query"),

        returnDoc = "the selector (or partial selector) that has been entered thus far for an Objective-C message send"
    )

    CXString(
        "getClangVersion",
        "Return a version string, suitable for showing to a user, but not intended to be parsed (the format is not guaranteed to be stable).",

        void()
    )

    void(
        "toggleCrashRecovery",
        "Enable/disable crash recovery.",

        unsignedb("isEnabled", "flag to indicate if crash recovery is enabled.  A non-zero value enables crash recovery, while 0 disables it.")
    )

    void(
        "getInclusions",
        """
        Visit the set of preprocessor inclusions in a translation unit. The visitor function is called with the provided data for every included file. This
        does not include headers included by the PCH file (unless one is inspecting the inclusions in the PCH file itself).
        """,

        CXTranslationUnit("tu", ""),
        CXInclusionVisitor("visitor", ""),
        nullable..CXClientData("client_data", "")
    )

    CXEvalResult(
        "Cursor_Evaluate",
        """
        If cursor is a statement declaration tries to evaluate the statement and if its variable, tries to evaluate its initializer, into its corresponding
        type.
        """,

        CXCursor("C", "")
    )

    CXEvalResultKind(
        "EvalResult_getKind",
        "Returns the kind of the evaluated result.",

        CXEvalResult("E", "")
    )

    int(
        "EvalResult_getAsInt",
        "Returns the evaluation result as integer if the kind is Int.",

        CXEvalResult("E", "")
    )

    long_long(
        "EvalResult_getAsLongLong",
        """
        Returns the evaluation result as a long long integer if the kind is Int. This prevents overflows that may happen if the result is returned with
        #EvalResult_getAsInt().
        """,

        CXEvalResult("E", "")
    )

    unsignedb(
        "EvalResult_isUnsignedInt",
        "Returns a non-zero value if the kind is Int and the evaluation result resulted in an unsigned integer.",

        CXEvalResult("E", "")
    )

    unsigned_long_long(
        "EvalResult_getAsUnsigned",
        "Returns the evaluation result as an unsigned integer if the kind is Int and #EvalResult_isUnsignedInt() is non-zero.",

        CXEvalResult("E", "")
    )

    double(
        "EvalResult_getAsDouble",
        "Returns the evaluation result as double if the kind is double.",

        CXEvalResult("E", "")
    )

    charUTF8.const.p(
        "EvalResult_getAsStr",
        """
        Returns the evaluation result as a constant string if the kind is other than Int or float. User must not free this pointer, instead call
        #EvalResult_dispose() on the {@code CXEvalResult} returned by #Cursor_Evaluate().
        """,

        CXEvalResult("E", "")
    )

    void(
        "EvalResult_dispose",
        "Disposes the created {@code Eval} memory.",

        CXEvalResult("E", "")
    )

    CXRemapping(
        "getRemappings",
        "Retrieve a remapping.",

        charUTF8.const.p("path", "the path that contains metadata about remappings"),

        returnDoc = "the requested remapping. This remapping must be freed via a call to #remap_dispose(). Can return #NULL if an error occurred."
    )

    CXRemapping(
        "getRemappingsFromFileList",
        "Retrieve a remapping.",

        charUTF8.const.p.p("filePaths", "pointer to an array of file paths containing remapping info"),
        AutoSize("filePaths")..unsigned("numFiles", "number of file paths"),

        returnDoc = "the requested remapping. This remapping must be freed via a call to #remap_dispose(). Can return #NULL if an error occurred."
    )

    unsigned(
        "remap_getNumFiles",
        "Determine the number of remappings.",

        CXRemapping("Remapping", "")
    )

    void(
        "remap_getFilenames",
        "Get the original and the associated filename from the remapping.",

        CXRemapping("Remapping", ""),
        unsigned("index", ""),
        nullable..CXString.p("original", "if non-#NULL, will be set to the original filename"),
        nullable..CXString.p("transformed", "if non-#NULL, will be set to the filename that the original is associated with")
    )

    void(
        "remap_dispose",
        "Dispose the remapping.",

        CXRemapping("Remapping", "")
    )

    CXResult(
        "findReferencesInFile",
        "Find references of a declaration in a specific file.",

        CXCursor("cursor", "pointing to a declaration or a reference of one"),
        CXFile("file", "to search for references"),
        CXCursorAndRangeVisitor(
            "visitor",
            """
            callback that will receive pairs of {@code CXCursor/CXSourceRange} for each reference found. The {@code CXSourceRange} will point inside the file;
            if the reference is inside a macro (and not a macro argument) the {@code CXSourceRange} will be invalid.
            """
        ),

        returnDoc = "one of the {@code CXResult} enumerators"
    )

    CXResult(
        "findIncludesInFile",
        "Find {@code \\#import/\\#include} directives in a specific file.",

        CXTranslationUnit("TU", "translation unit containing the file to query"),
        CXFile("file", "to search for {@code \\#import/\\#include} directives"),
        CXCursorAndRangeVisitor("visitor", "callback that will receive pairs of {@code CXCursor/CXSourceRange} for each directive found"),

        returnDoc = "one of the CXResult enumerators"
    )

    intb(
        "index_isEntityObjCContainerKind",
        "",

        CXIdxEntityKind("kind", "")
    )

    CXIdxObjCContainerDeclInfo.const.p(
        "index_getObjCContainerDeclInfo",
        "",

        CXIdxDeclInfo.const.p("info", "")
    )

    CXIdxObjCInterfaceDeclInfo.const.p(
        "index_getObjCInterfaceDeclInfo",
        "",

        CXIdxDeclInfo.const.p("info", "")
    )

    CXIdxObjCCategoryDeclInfo.const.p(
        "index_getObjCCategoryDeclInfo",
        "",

        CXIdxDeclInfo.const.p("info", "")
    )

    CXIdxObjCProtocolRefListInfo.const.p(
        "index_getObjCProtocolRefListInfo",
        "",

        CXIdxDeclInfo.const.p("info", "")
    )

    CXIdxObjCPropertyDeclInfo.const.p(
        "index_getObjCPropertyDeclInfo",
        "",

        CXIdxDeclInfo.const.p("info", "")
    )

    CXIdxIBOutletCollectionAttrInfo.const.p(
        "index_getIBOutletCollectionAttrInfo",
        "",

        CXIdxAttrInfo.const.p("info", "")
    )

    CXIdxCXXClassDeclInfo.const.p(
        "index_getCXXClassDeclInfo",
        "",

        CXIdxDeclInfo.const.p("info", "")
    )

    CXIdxClientContainer(
        "index_getClientContainer",
        "For retrieving a custom {@code CXIdxClientContainer} attached to a container.",

        CXIdxContainerInfo.const.p("info", "")
    )

    void(
        "index_setClientContainer",
        "For setting a custom {@code CXIdxClientContainer} attached to a container.",

        CXIdxContainerInfo.const.p("info", ""),
        CXIdxClientContainer("container", "")
    )

    CXIdxClientEntity(
        "index_getClientEntity",
        "For retrieving a custom {@code CXIdxClientEntity} attached to an entity.",

        CXIdxEntityInfo.const.p("info", "")
    )

    void(
        "index_setClientEntity",
        "For setting a custom {@code CXIdxClientEntity} attached to an entity.",

        CXIdxEntityInfo.const.p("info", ""),
        CXIdxClientEntity("entity", "")
    )

    CXIndexAction(
        "IndexAction_create",
        "An indexing action/session, to be applied to one or multiple translation units.",

        CXIndex("CIdx", "the index object with which the index action will be associated")
    )

    void(
        "IndexAction_dispose",
        """
        Destroy the given index action.

        The index action must not be destroyed until all of the translation units created within that index action have been destroyed.
        """,

        CXIndexAction("action", "")
    )

    int(
        "indexSourceFile",
        """
        Index the given source file and the translation unit corresponding to that file via callbacks implemented through ##IndexerCallbacks.

        The rest of the parameters are the same as #parseTranslationUnit().
        """,

        CXIndexAction("action", ""),
        nullable..CXClientData("client_data", "pointer data supplied by the client, which will be passed to the invoked callbacks"),
        IndexerCallbacks.p("index_callbacks", "pointer to indexing callbacks that the client implements"),
        unsigned("index_callbacks_size", "size of ##IndexerCallbacks structure that gets passed in {@code index_callbacks}"),
        unsigned(
            "index_options",
            "a bitmask of options that affects how indexing is performed. This should be a bitwise OR of the {@code CXIndexOpt_XXX} flags."
        ),
        charUTF8.const.p("source_filename", ""),
        nullable..charUTF8.const.p.const.p("command_line_args", ""),
        AutoSize("command_line_args")..int("num_command_line_args", ""),
        nullable..CXUnsavedFile.p("unsaved_files", ""),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", ""),
        Check(1)..nullable..CXTranslationUnit.p(
            "out_TU",
            "pointer to store a {@code CXTranslationUnit} that can be reused after indexing is finished. Set to #NULL if you do not require it."
        ),
        unsigned("TU_options", ""),

        returnDoc =
        """
        0 on success or if there were errors from which the compiler could recover. If there is a failure from which there is no recovery, returns a non-zero
        {@code CXErrorCode}.
        """
    )

    int(
        "indexSourceFileFullArgv",
        """
        Same as #indexSourceFile() but requires a full command line for {@code command_line_args} including {@code argv[0]}. This is useful if the standard
        library paths are relative to the binary.
        """,

        CXIndexAction("action", ""),
        nullable..CXClientData("client_data", ""),
        IndexerCallbacks.p("index_callbacks", ""),
        unsigned("index_callbacks_size", ""),
        unsigned("index_options", ""),
        charUTF8.const.p("source_filename", ""),
        charUTF8.const.p.const.p("command_line_args", ""),
        AutoSize("command_line_args")..int("num_command_line_args", ""),
        nullable..CXUnsavedFile.p("unsaved_files", ""),
        AutoSize("unsaved_files")..unsigned("num_unsaved_files", ""),
        Check(1)..nullable..CXTranslationUnit.p("out_TU", ""),
        unsigned("TU_options", "")
    )

    intb(
        "indexTranslationUnit",
        """
        Index the given translation unit via callbacks implemented through ##IndexerCallbacks.

        The order of callback invocations is not guaranteed to be the same as when indexing a source file. The high level order will be:

        ${ul(
            "Preprocessor callbacks invocations",
            "Declaration/reference callbacks invocations",
            "Diagnostic callback invocations"
        )}

        The parameters are the same as #indexSourceFile().
        """,

        CXIndexAction("action", ""),
        nullable..CXClientData("client_data", ""),
        IndexerCallbacks.p("index_callbacks", ""),
        unsigned("index_callbacks_size", ""),
        unsigned("index_options", ""),
        CXTranslationUnit("TU", ""),

        returnDoc = "if there is a failure from which there is no recovery, returns non-zero, otherwise returns 0"
    )

    void(
        "indexLoc_getFileLocation",
        """
        Retrieve the {@code CXIdxFile}, file, line, column, and offset represented by the given {@code CXIdxLoc}.

        If the location refers into a macro expansion, retrieves the location of the macro expansion and if it refers into a macro argument retrieves the
        location of the argument.
        """,

        CXIdxLoc("loc", ""),
        Check(1)..nullable..CXIdxClientFile.p("indexFile", ""),
        Check(1)..nullable..CXFile.p("file", ""),
        Check(1)..nullable..unsigned.p("line", ""),
        Check(1)..nullable..unsigned.p("column", ""),
        Check(1)..nullable..unsigned.p("offset", "")
    )

    CXSourceLocation(
        "indexLoc_getCXSourceLocation",
        "Retrieve the {@code CXSourceLocation} represented by the given {@code CXIdxLoc}.",

        CXIdxLoc("loc", "")
    )

    unsignedb(
        "Type_visitFields",
        """
        Visit the fields of a particular type.

        This function visits all the direct fields of the given cursor, invoking the given {@code visitor} function with the cursors of each visited field. The
        traversal may be ended prematurely, if the visitor returns #Visit_Break.
        """,

        CXType("T", "the record type whose field may be visited"),
        CXFieldVisitor("visitor", "the visitor function that will be invoked for each field of {@code T}"),
        nullable..CXClientData(
            "client_data",
            "pointer data supplied by the client, which will be passed to the visitor each time it is invoked"
        ),

        returnDoc = "a non-zero value if the traversal was terminated prematurely by the visitor returning #Visit_Break"
    )
}