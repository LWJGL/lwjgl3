/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LLVMDebugInfo {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            DebugMetadataVersion                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDebugMetadataVersion"),
            GetModuleDebugMetadataVersion              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetModuleDebugMetadataVersion"),
            StripModuleDebugInfo                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMStripModuleDebugInfo"),
            CreateDIBuilderDisallowUnresolved          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateDIBuilderDisallowUnresolved"),
            CreateDIBuilder                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMCreateDIBuilder"),
            DisposeDIBuilder                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeDIBuilder"),
            DIBuilderFinalize                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderFinalize"),
            DIBuilderFinalizeSubprogram                = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderFinalizeSubprogram"),
            DIBuilderCreateCompileUnit                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateCompileUnit"),
            DIBuilderCreateFile                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateFile"),
            DIBuilderCreateModule                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateModule"),
            DIBuilderCreateNameSpace                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateNameSpace"),
            DIBuilderCreateFunction                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateFunction"),
            DIBuilderCreateLexicalBlock                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateLexicalBlock"),
            DIBuilderCreateLexicalBlockFile            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateLexicalBlockFile"),
            DIBuilderCreateImportedModuleFromNamespace = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateImportedModuleFromNamespace"),
            DIBuilderCreateImportedModuleFromAlias     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateImportedModuleFromAlias"),
            DIBuilderCreateImportedModuleFromModule    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateImportedModuleFromModule"),
            DIBuilderCreateImportedDeclaration         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateImportedDeclaration"),
            DIBuilderCreateDebugLocation               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateDebugLocation"),
            DILocationGetLine                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDILocationGetLine"),
            DILocationGetColumn                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDILocationGetColumn"),
            DILocationGetScope                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDILocationGetScope"),
            DILocationGetInlinedAt                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDILocationGetInlinedAt"),
            DIScopeGetFile                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIScopeGetFile"),
            DIFileGetDirectory                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIFileGetDirectory"),
            DIFileGetFilename                          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIFileGetFilename"),
            DIFileGetSource                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIFileGetSource"),
            DIBuilderGetOrCreateTypeArray              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderGetOrCreateTypeArray"),
            DIBuilderCreateSubroutineType              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateSubroutineType"),
            DIBuilderCreateMacro                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderCreateMacro"),
            DIBuilderCreateTempMacroFile               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderCreateTempMacroFile"),
            DIBuilderCreateEnumerator                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderCreateEnumerator"),
            DIBuilderCreateEnumerationType             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateEnumerationType"),
            DIBuilderCreateUnionType                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateUnionType"),
            DIBuilderCreateArrayType                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateArrayType"),
            DIBuilderCreateVectorType                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateVectorType"),
            DIBuilderCreateUnspecifiedType             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateUnspecifiedType"),
            DIBuilderCreateBasicType                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateBasicType"),
            DIBuilderCreatePointerType                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreatePointerType"),
            DIBuilderCreateStructType                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateStructType"),
            DIBuilderCreateMemberType                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateMemberType"),
            DIBuilderCreateStaticMemberType            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateStaticMemberType"),
            DIBuilderCreateMemberPointerType           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateMemberPointerType"),
            DIBuilderCreateObjCIVar                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateObjCIVar"),
            DIBuilderCreateObjCProperty                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateObjCProperty"),
            DIBuilderCreateObjectPointerType           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateObjectPointerType"),
            DIBuilderCreateQualifiedType               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateQualifiedType"),
            DIBuilderCreateReferenceType               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateReferenceType"),
            DIBuilderCreateNullPtrType                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateNullPtrType"),
            DIBuilderCreateTypedef                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateTypedef"),
            DIBuilderCreateInheritance                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateInheritance"),
            DIBuilderCreateForwardDecl                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateForwardDecl"),
            DIBuilderCreateReplaceableCompositeType    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateReplaceableCompositeType"),
            DIBuilderCreateBitFieldMemberType          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateBitFieldMemberType"),
            DIBuilderCreateClassType                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateClassType"),
            DIBuilderCreateArtificialType              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateArtificialType"),
            DITypeGetName                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDITypeGetName"),
            DITypeGetSizeInBits                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDITypeGetSizeInBits"),
            DITypeGetOffsetInBits                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDITypeGetOffsetInBits"),
            DITypeGetAlignInBits                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDITypeGetAlignInBits"),
            DITypeGetLine                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDITypeGetLine"),
            DITypeGetFlags                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDITypeGetFlags"),
            DIBuilderGetOrCreateSubrange               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderGetOrCreateSubrange"),
            DIBuilderGetOrCreateArray                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderGetOrCreateArray"),
            DIBuilderCreateExpression                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateExpression"),
            DIBuilderCreateConstantValueExpression     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateConstantValueExpression"),
            DIBuilderCreateGlobalVariableExpression    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateGlobalVariableExpression"),
            GetDINodeTag                               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetDINodeTag"),
            DIGlobalVariableExpressionGetVariable      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIGlobalVariableExpressionGetVariable"),
            DIGlobalVariableExpressionGetExpression    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIGlobalVariableExpressionGetExpression"),
            DIVariableGetFile                          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIVariableGetFile"),
            DIVariableGetScope                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIVariableGetScope"),
            DIVariableGetLine                          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIVariableGetLine"),
            TemporaryMDNode                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMTemporaryMDNode"),
            DisposeTemporaryMDNode                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeTemporaryMDNode"),
            MetadataReplaceAllUsesWith                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMMetadataReplaceAllUsesWith"),
            DIBuilderCreateTempGlobalVariableFwdDecl   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateTempGlobalVariableFwdDecl"),
            DIBuilderInsertDeclareBefore               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDeclareBefore"),
            DIBuilderInsertDeclareAtEnd                = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDeclareAtEnd"),
            DIBuilderInsertDbgValueBefore              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDbgValueBefore"),
            DIBuilderInsertDbgValueAtEnd               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDbgValueAtEnd"),
            DIBuilderInsertDeclareRecordBefore         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDeclareRecordBefore"),
            DIBuilderInsertDeclareRecordAtEnd          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDeclareRecordAtEnd"),
            DIBuilderInsertDbgValueRecordBefore        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDbgValueRecordBefore"),
            DIBuilderInsertDbgValueRecordAtEnd         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDbgValueRecordAtEnd"),
            DIBuilderCreateAutoVariable                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateAutoVariable"),
            DIBuilderCreateParameterVariable           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateParameterVariable"),
            GetSubprogram                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSubprogram"),
            SetSubprogram                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSetSubprogram"),
            DISubprogramGetLine                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDISubprogramGetLine"),
            InstructionGetDebugLoc                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInstructionGetDebugLoc"),
            InstructionSetDebugLoc                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMInstructionSetDebugLoc"),
            DIBuilderCreateLabel                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderCreateLabel"),
            DIBuilderInsertLabelBefore                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertLabelBefore"),
            DIBuilderInsertLabelAtEnd                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDIBuilderInsertLabelAtEnd"),
            GetMetadataKind                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMGetMetadataKind");

    }

    public static final int
        LLVMDIFlagZero                = 0,
        LLVMDIFlagPrivate             = 1,
        LLVMDIFlagProtected           = 2,
        LLVMDIFlagPublic              = 3,
        LLVMDIFlagFwdDecl             = 1 << 2,
        LLVMDIFlagAppleBlock          = 1 << 3,
        LLVMDIFlagReservedBit4        = 1 << 4,
        LLVMDIFlagVirtual             = 1 << 5,
        LLVMDIFlagArtificial          = 1 << 6,
        LLVMDIFlagExplicit            = 1 << 7,
        LLVMDIFlagPrototyped          = 1 << 8,
        LLVMDIFlagObjcClassComplete   = 1 << 9,
        LLVMDIFlagObjectPointer       = 1 << 10,
        LLVMDIFlagVector              = 1 << 11,
        LLVMDIFlagStaticMember        = 1 << 12,
        LLVMDIFlagLValueReference     = 1 << 13,
        LLVMDIFlagRValueReference     = 1 << 14,
        LLVMDIFlagReserved            = 1 << 15,
        LLVMDIFlagSingleInheritance   = 1 << 16,
        LLVMDIFlagMultipleInheritance = 2 << 16,
        LLVMDIFlagVirtualInheritance  = 3 << 16,
        LLVMDIFlagIntroducedVirtual   = 1 << 18,
        LLVMDIFlagBitField            = 1 << 19,
        LLVMDIFlagNoReturn            = 1 << 20,
        LLVMDIFlagTypePassByValue     = 1 << 22,
        LLVMDIFlagTypePassByReference = 1 << 23,
        LLVMDIFlagEnumClass           = 1 << 24,
        LLVMDIFlagFixedEnum           = LLVMDIFlagEnumClass,
        LLVMDIFlagThunk               = 1 << 25,
        LLVMDIFlagNonTrivial          = 1 << 26,
        LLVMDIFlagBigEndian           = 1 << 27,
        LLVMDIFlagLittleEndian        = 1 << 28,
        LLVMDIFlagIndirectVirtualBase = (1 << 2) | (1 << 5),
        LLVMDIFlagAccessibility       = LLVMDIFlagPrivate | LLVMDIFlagProtected | LLVMDIFlagPublic,
        LLVMDIFlagPtrToMemberRep      = LLVMDIFlagSingleInheritance | LLVMDIFlagMultipleInheritance | LLVMDIFlagVirtualInheritance;

    public static final int
        LLVMDWARFSourceLanguageC89                 = 0,
        LLVMDWARFSourceLanguageC                   = 1,
        LLVMDWARFSourceLanguageAda83               = 2,
        LLVMDWARFSourceLanguageC_plus_plus         = 3,
        LLVMDWARFSourceLanguageCobol74             = 4,
        LLVMDWARFSourceLanguageCobol85             = 5,
        LLVMDWARFSourceLanguageFortran77           = 6,
        LLVMDWARFSourceLanguageFortran90           = 7,
        LLVMDWARFSourceLanguagePascal83            = 8,
        LLVMDWARFSourceLanguageModula2             = 9,
        LLVMDWARFSourceLanguageJava                = 10,
        LLVMDWARFSourceLanguageC99                 = 11,
        LLVMDWARFSourceLanguageAda95               = 12,
        LLVMDWARFSourceLanguageFortran95           = 13,
        LLVMDWARFSourceLanguagePLI                 = 14,
        LLVMDWARFSourceLanguageObjC                = 15,
        LLVMDWARFSourceLanguageObjC_plus_plus      = 16,
        LLVMDWARFSourceLanguageUPC                 = 17,
        LLVMDWARFSourceLanguageD                   = 18,
        LLVMDWARFSourceLanguagePython              = 19,
        LLVMDWARFSourceLanguageOpenCL              = 20,
        LLVMDWARFSourceLanguageGo                  = 21,
        LLVMDWARFSourceLanguageModula3             = 22,
        LLVMDWARFSourceLanguageHaskell             = 23,
        LLVMDWARFSourceLanguageC_plus_plus_03      = 24,
        LLVMDWARFSourceLanguageC_plus_plus_11      = 25,
        LLVMDWARFSourceLanguageOCaml               = 26,
        LLVMDWARFSourceLanguageRust                = 27,
        LLVMDWARFSourceLanguageC11                 = 28,
        LLVMDWARFSourceLanguageSwift               = 29,
        LLVMDWARFSourceLanguageJulia               = 30,
        LLVMDWARFSourceLanguageDylan               = 31,
        LLVMDWARFSourceLanguageC_plus_plus_14      = 32,
        LLVMDWARFSourceLanguageFortran03           = 33,
        LLVMDWARFSourceLanguageFortran08           = 34,
        LLVMDWARFSourceLanguageRenderScript        = 35,
        LLVMDWARFSourceLanguageBLISS               = 36,
        LLVMDWARFSourceLanguageKotlin              = 37,
        LLVMDWARFSourceLanguageZig                 = 38,
        LLVMDWARFSourceLanguageCrystal             = 39,
        LLVMDWARFSourceLanguageC_plus_plus_17      = 40,
        LLVMDWARFSourceLanguageC_plus_plus_20      = 41,
        LLVMDWARFSourceLanguageC17                 = 42,
        LLVMDWARFSourceLanguageFortran18           = 43,
        LLVMDWARFSourceLanguageAda2005             = 44,
        LLVMDWARFSourceLanguageAda2012             = 45,
        LLVMDWARFSourceLanguageHIP                 = 46,
        LLVMDWARFSourceLanguageAssembly            = 47,
        LLVMDWARFSourceLanguageC_sharp             = 48,
        LLVMDWARFSourceLanguageMojo                = 49,
        LLVMDWARFSourceLanguageGLSL                = 50,
        LLVMDWARFSourceLanguageGLSL_ES             = 51,
        LLVMDWARFSourceLanguageHLSL                = 52,
        LLVMDWARFSourceLanguageOpenCL_CPP          = 53,
        LLVMDWARFSourceLanguageCPP_for_OpenCL      = 54,
        LLVMDWARFSourceLanguageSYCL                = 55,
        LLVMDWARFSourceLanguageRuby                = 56,
        LLVMDWARFSourceLanguageMove                = 57,
        LLVMDWARFSourceLanguageHylo                = 58,
        LLVMDWARFSourceLanguageMetal               = 59,
        LLVMDWARFSourceLanguageMips_Assembler      = 60,
        LLVMDWARFSourceLanguageGOOGLE_RenderScript = 61,
        LLVMDWARFSourceLanguageBORLAND_Delphi      = 62;

    public static final int
        LLVMDWARFEmissionNone           = 0,
        LLVMDWARFEmissionFull           = 1,
        LLVMDWARFEmissionLineTablesOnly = 2;

    public static final int
        LLVMMDStringMetadataKind                     = 0,
        LLVMConstantAsMetadataMetadataKind           = 1,
        LLVMLocalAsMetadataMetadataKind              = 2,
        LLVMDistinctMDOperandPlaceholderMetadataKind = 3,
        LLVMMDTupleMetadataKind                      = 4,
        LLVMDILocationMetadataKind                   = 5,
        LLVMDIExpressionMetadataKind                 = 6,
        LLVMDIGlobalVariableExpressionMetadataKind   = 7,
        LLVMGenericDINodeMetadataKind                = 8,
        LLVMDISubrangeMetadataKind                   = 9,
        LLVMDIEnumeratorMetadataKind                 = 10,
        LLVMDIBasicTypeMetadataKind                  = 11,
        LLVMDIDerivedTypeMetadataKind                = 12,
        LLVMDICompositeTypeMetadataKind              = 13,
        LLVMDISubroutineTypeMetadataKind             = 14,
        LLVMDIFileMetadataKind                       = 15,
        LLVMDICompileUnitMetadataKind                = 16,
        LLVMDISubprogramMetadataKind                 = 17,
        LLVMDILexicalBlockMetadataKind               = 18,
        LLVMDILexicalBlockFileMetadataKind           = 19,
        LLVMDINamespaceMetadataKind                  = 20,
        LLVMDIModuleMetadataKind                     = 21,
        LLVMDITemplateTypeParameterMetadataKind      = 22,
        LLVMDITemplateValueParameterMetadataKind     = 23,
        LLVMDIGlobalVariableMetadataKind             = 24,
        LLVMDILocalVariableMetadataKind              = 25,
        LLVMDILabelMetadataKind                      = 26,
        LLVMDIObjCPropertyMetadataKind               = 27,
        LLVMDIImportedEntityMetadataKind             = 28,
        LLVMDIMacroMetadataKind                      = 29,
        LLVMDIMacroFileMetadataKind                  = 30,
        LLVMDICommonBlockMetadataKind                = 31,
        LLVMDIStringTypeMetadataKind                 = 32,
        LLVMDIGenericSubrangeMetadataKind            = 33,
        LLVMDIArgListMetadataKind                    = 34,
        LLVMDIAssignIDMetadataKind                   = 35;

    public static final int
        LLVMDWARFMacinfoRecordTypeDefine    = 0x01,
        LLVMDWARFMacinfoRecordTypeMacro     = 0x02,
        LLVMDWARFMacinfoRecordTypeStartFile = 0x03,
        LLVMDWARFMacinfoRecordTypeEndFile   = 0x04,
        LLVMDWARFMacinfoRecordTypeVendorExt = 0xff;

    protected LLVMDebugInfo() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMDebugMetadataVersion ] ---

    /** {@code unsigned int LLVMDebugMetadataVersion(void)} */
    @NativeType("unsigned int")
    public static int LLVMDebugMetadataVersion() {
        long __functionAddress = Functions.DebugMetadataVersion;
        return invokeI(__functionAddress);
    }

    // --- [ LLVMGetModuleDebugMetadataVersion ] ---

    /** {@code unsigned int LLVMGetModuleDebugMetadataVersion(LLVMModuleRef Module)} */
    @NativeType("unsigned int")
    public static int LLVMGetModuleDebugMetadataVersion(@NativeType("LLVMModuleRef") long Module) {
        long __functionAddress = Functions.GetModuleDebugMetadataVersion;
        if (CHECKS) {
            check(Module);
        }
        return invokePI(Module, __functionAddress);
    }

    // --- [ LLVMStripModuleDebugInfo ] ---

    /** {@code LLVMBool LLVMStripModuleDebugInfo(LLVMModuleRef Module)} */
    @NativeType("LLVMBool")
    public static boolean LLVMStripModuleDebugInfo(@NativeType("LLVMModuleRef") long Module) {
        long __functionAddress = Functions.StripModuleDebugInfo;
        if (CHECKS) {
            check(Module);
        }
        return invokePI(Module, __functionAddress) != 0;
    }

    // --- [ LLVMCreateDIBuilderDisallowUnresolved ] ---

    /** {@code LLVMDIBuilderRef LLVMCreateDIBuilderDisallowUnresolved(LLVMModuleRef M)} */
    @NativeType("LLVMDIBuilderRef")
    public static long LLVMCreateDIBuilderDisallowUnresolved(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateDIBuilderDisallowUnresolved;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMCreateDIBuilder ] ---

    /** {@code LLVMDIBuilderRef LLVMCreateDIBuilder(LLVMModuleRef M)} */
    @NativeType("LLVMDIBuilderRef")
    public static long LLVMCreateDIBuilder(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateDIBuilder;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMDisposeDIBuilder ] ---

    /** {@code void LLVMDisposeDIBuilder(LLVMDIBuilderRef Builder)} */
    public static void LLVMDisposeDIBuilder(@NativeType("LLVMDIBuilderRef") long Builder) {
        long __functionAddress = Functions.DisposeDIBuilder;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMDIBuilderFinalize ] ---

    /** {@code void LLVMDIBuilderFinalize(LLVMDIBuilderRef Builder)} */
    public static void LLVMDIBuilderFinalize(@NativeType("LLVMDIBuilderRef") long Builder) {
        long __functionAddress = Functions.DIBuilderFinalize;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMDIBuilderFinalizeSubprogram ] ---

    /** {@code void LLVMDIBuilderFinalizeSubprogram(LLVMDIBuilderRef Builder, LLVMMetadataRef Subprogram)} */
    public static void LLVMDIBuilderFinalizeSubprogram(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Subprogram) {
        long __functionAddress = Functions.DIBuilderFinalizeSubprogram;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Subprogram);
        }
        invokePPV(Builder, Subprogram, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateCompileUnit ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateCompileUnit(LLVMDIBuilderRef Builder, LLVMDWARFSourceLanguage Lang, LLVMMetadataRef FileRef, char const * Producer, size_t ProducerLen, LLVMBool isOptimized, char const * Flags, size_t FlagsLen, unsigned int RuntimeVer, char const * SplitName, size_t SplitNameLen, LLVMDWARFEmissionKind Kind, unsigned int DWOId, LLVMBool SplitDebugInlining, LLVMBool DebugInfoForProfiling, char const * SysRoot, size_t SysRootLen, char const * SDK, size_t SDKLen)} */
    public static long nLLVMDIBuilderCreateCompileUnit(long Builder, int Lang, long FileRef, long Producer, long ProducerLen, int isOptimized, long Flags, long FlagsLen, int RuntimeVer, long SplitName, long SplitNameLen, int Kind, int DWOId, int SplitDebugInlining, int DebugInfoForProfiling, long SysRoot, long SysRootLen, long SDK, long SDKLen) {
        long __functionAddress = Functions.DIBuilderCreateCompileUnit;
        if (CHECKS) {
            check(Builder);
            check(FileRef);
        }
        return invokePPPPPPPPPPPPP(Builder, Lang, FileRef, Producer, ProducerLen, isOptimized, Flags, FlagsLen, RuntimeVer, SplitName, SplitNameLen, Kind, DWOId, SplitDebugInlining, DebugInfoForProfiling, SysRoot, SysRootLen, SDK, SDKLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateCompileUnit(LLVMDIBuilderRef Builder, LLVMDWARFSourceLanguage Lang, LLVMMetadataRef FileRef, char const * Producer, size_t ProducerLen, LLVMBool isOptimized, char const * Flags, size_t FlagsLen, unsigned int RuntimeVer, char const * SplitName, size_t SplitNameLen, LLVMDWARFEmissionKind Kind, unsigned int DWOId, LLVMBool SplitDebugInlining, LLVMBool DebugInfoForProfiling, char const * SysRoot, size_t SysRootLen, char const * SDK, size_t SDKLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateCompileUnit(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMDWARFSourceLanguage") int Lang, @NativeType("LLVMMetadataRef") long FileRef, @NativeType("char const *") ByteBuffer Producer, @NativeType("LLVMBool") boolean isOptimized, @NativeType("char const *") ByteBuffer Flags, @NativeType("unsigned int") int RuntimeVer, @NativeType("char const *") ByteBuffer SplitName, @NativeType("LLVMDWARFEmissionKind") int Kind, @NativeType("unsigned int") int DWOId, @NativeType("LLVMBool") boolean SplitDebugInlining, @NativeType("LLVMBool") boolean DebugInfoForProfiling, @NativeType("char const *") ByteBuffer SysRoot, @NativeType("char const *") ByteBuffer SDK) {
        return nLLVMDIBuilderCreateCompileUnit(Builder, Lang, FileRef, memAddress(Producer), Producer.remaining(), isOptimized ? 1 : 0, memAddress(Flags), Flags.remaining(), RuntimeVer, memAddress(SplitName), SplitName.remaining(), Kind, DWOId, SplitDebugInlining ? 1 : 0, DebugInfoForProfiling ? 1 : 0, memAddress(SysRoot), SysRoot.remaining(), memAddress(SDK), SDK.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateCompileUnit(LLVMDIBuilderRef Builder, LLVMDWARFSourceLanguage Lang, LLVMMetadataRef FileRef, char const * Producer, size_t ProducerLen, LLVMBool isOptimized, char const * Flags, size_t FlagsLen, unsigned int RuntimeVer, char const * SplitName, size_t SplitNameLen, LLVMDWARFEmissionKind Kind, unsigned int DWOId, LLVMBool SplitDebugInlining, LLVMBool DebugInfoForProfiling, char const * SysRoot, size_t SysRootLen, char const * SDK, size_t SDKLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateCompileUnit(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMDWARFSourceLanguage") int Lang, @NativeType("LLVMMetadataRef") long FileRef, @NativeType("char const *") CharSequence Producer, @NativeType("LLVMBool") boolean isOptimized, @NativeType("char const *") CharSequence Flags, @NativeType("unsigned int") int RuntimeVer, @NativeType("char const *") CharSequence SplitName, @NativeType("LLVMDWARFEmissionKind") int Kind, @NativeType("unsigned int") int DWOId, @NativeType("LLVMBool") boolean SplitDebugInlining, @NativeType("LLVMBool") boolean DebugInfoForProfiling, @NativeType("char const *") CharSequence SysRoot, @NativeType("char const *") CharSequence SDK) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int ProducerEncodedLength = stack.nUTF8(Producer, false);
            long ProducerEncoded = stack.getPointerAddress();
            int FlagsEncodedLength = stack.nUTF8(Flags, false);
            long FlagsEncoded = stack.getPointerAddress();
            int SplitNameEncodedLength = stack.nUTF8(SplitName, false);
            long SplitNameEncoded = stack.getPointerAddress();
            int SysRootEncodedLength = stack.nUTF8(SysRoot, false);
            long SysRootEncoded = stack.getPointerAddress();
            int SDKEncodedLength = stack.nUTF8(SDK, false);
            long SDKEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateCompileUnit(Builder, Lang, FileRef, ProducerEncoded, ProducerEncodedLength, isOptimized ? 1 : 0, FlagsEncoded, FlagsEncodedLength, RuntimeVer, SplitNameEncoded, SplitNameEncodedLength, Kind, DWOId, SplitDebugInlining ? 1 : 0, DebugInfoForProfiling ? 1 : 0, SysRootEncoded, SysRootEncodedLength, SDKEncoded, SDKEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateFile ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateFile(LLVMDIBuilderRef Builder, char const * Filename, size_t FilenameLen, char const * Directory, size_t DirectoryLen)} */
    public static long nLLVMDIBuilderCreateFile(long Builder, long Filename, long FilenameLen, long Directory, long DirectoryLen) {
        long __functionAddress = Functions.DIBuilderCreateFile;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPPPP(Builder, Filename, FilenameLen, Directory, DirectoryLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateFile(LLVMDIBuilderRef Builder, char const * Filename, size_t FilenameLen, char const * Directory, size_t DirectoryLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateFile(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Filename, @NativeType("char const *") ByteBuffer Directory) {
        return nLLVMDIBuilderCreateFile(Builder, memAddress(Filename), Filename.remaining(), memAddress(Directory), Directory.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateFile(LLVMDIBuilderRef Builder, char const * Filename, size_t FilenameLen, char const * Directory, size_t DirectoryLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateFile(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") CharSequence Filename, @NativeType("char const *") CharSequence Directory) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int FilenameEncodedLength = stack.nUTF8(Filename, false);
            long FilenameEncoded = stack.getPointerAddress();
            int DirectoryEncodedLength = stack.nUTF8(Directory, false);
            long DirectoryEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateFile(Builder, FilenameEncoded, FilenameEncodedLength, DirectoryEncoded, DirectoryEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateModule ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateModule(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentScope, char const * Name, size_t NameLen, char const * ConfigMacros, size_t ConfigMacrosLen, char const * IncludePath, size_t IncludePathLen, char const * APINotesFile, size_t APINotesFileLen)} */
    public static long nLLVMDIBuilderCreateModule(long Builder, long ParentScope, long Name, long NameLen, long ConfigMacros, long ConfigMacrosLen, long IncludePath, long IncludePathLen, long APINotesFile, long APINotesFileLen) {
        long __functionAddress = Functions.DIBuilderCreateModule;
        if (CHECKS) {
            check(Builder);
            check(ParentScope);
        }
        return invokePPPPPPPPPPP(Builder, ParentScope, Name, NameLen, ConfigMacros, ConfigMacrosLen, IncludePath, IncludePathLen, APINotesFile, APINotesFileLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateModule(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentScope, char const * Name, size_t NameLen, char const * ConfigMacros, size_t ConfigMacrosLen, char const * IncludePath, size_t IncludePathLen, char const * APINotesFile, size_t APINotesFileLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateModule(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentScope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer ConfigMacros, @NativeType("char const *") ByteBuffer IncludePath, @NativeType("char const *") ByteBuffer APINotesFile) {
        return nLLVMDIBuilderCreateModule(Builder, ParentScope, memAddress(Name), Name.remaining(), memAddress(ConfigMacros), ConfigMacros.remaining(), memAddress(IncludePath), IncludePath.remaining(), memAddress(APINotesFile), APINotesFile.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateModule(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentScope, char const * Name, size_t NameLen, char const * ConfigMacros, size_t ConfigMacrosLen, char const * IncludePath, size_t IncludePathLen, char const * APINotesFile, size_t APINotesFileLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateModule(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentScope, @NativeType("char const *") CharSequence Name, @NativeType("char const *") CharSequence ConfigMacros, @NativeType("char const *") CharSequence IncludePath, @NativeType("char const *") CharSequence APINotesFile) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int ConfigMacrosEncodedLength = stack.nUTF8(ConfigMacros, false);
            long ConfigMacrosEncoded = stack.getPointerAddress();
            int IncludePathEncodedLength = stack.nUTF8(IncludePath, false);
            long IncludePathEncoded = stack.getPointerAddress();
            int APINotesFileEncodedLength = stack.nUTF8(APINotesFile, false);
            long APINotesFileEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateModule(Builder, ParentScope, NameEncoded, NameEncodedLength, ConfigMacrosEncoded, ConfigMacrosEncodedLength, IncludePathEncoded, IncludePathEncodedLength, APINotesFileEncoded, APINotesFileEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateNameSpace ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateNameSpace(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentScope, char const * Name, size_t NameLen, LLVMBool ExportSymbols)} */
    public static long nLLVMDIBuilderCreateNameSpace(long Builder, long ParentScope, long Name, long NameLen, int ExportSymbols) {
        long __functionAddress = Functions.DIBuilderCreateNameSpace;
        if (CHECKS) {
            check(Builder);
            check(ParentScope);
        }
        return invokePPPPP(Builder, ParentScope, Name, NameLen, ExportSymbols, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateNameSpace(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentScope, char const * Name, size_t NameLen, LLVMBool ExportSymbols)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateNameSpace(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentScope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMBool") boolean ExportSymbols) {
        return nLLVMDIBuilderCreateNameSpace(Builder, ParentScope, memAddress(Name), Name.remaining(), ExportSymbols ? 1 : 0);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateNameSpace(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentScope, char const * Name, size_t NameLen, LLVMBool ExportSymbols)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateNameSpace(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentScope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMBool") boolean ExportSymbols) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateNameSpace(Builder, ParentScope, NameEncoded, NameEncodedLength, ExportSymbols ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateFunction ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateFunction(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * LinkageName, size_t LinkageNameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool IsLocalToUnit, LLVMBool IsDefinition, unsigned int ScopeLine, LLVMDIFlags Flags, LLVMBool IsOptimized)} */
    public static long nLLVMDIBuilderCreateFunction(long Builder, long Scope, long Name, long NameLen, long LinkageName, long LinkageNameLen, long File, int LineNo, long Ty, int IsLocalToUnit, int IsDefinition, int ScopeLine, int Flags, int IsOptimized) {
        long __functionAddress = Functions.DIBuilderCreateFunction;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Ty);
        }
        return invokePPPPPPPPP(Builder, Scope, Name, NameLen, LinkageName, LinkageNameLen, File, LineNo, Ty, IsLocalToUnit, IsDefinition, ScopeLine, Flags, IsOptimized, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateFunction(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * LinkageName, size_t LinkageNameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool IsLocalToUnit, LLVMBool IsDefinition, unsigned int ScopeLine, LLVMDIFlags Flags, LLVMBool IsOptimized)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateFunction(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer LinkageName, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean IsLocalToUnit, @NativeType("LLVMBool") boolean IsDefinition, @NativeType("unsigned int") int ScopeLine, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMBool") boolean IsOptimized) {
        return nLLVMDIBuilderCreateFunction(Builder, Scope, memAddress(Name), Name.remaining(), memAddress(LinkageName), LinkageName.remaining(), File, LineNo, Ty, IsLocalToUnit ? 1 : 0, IsDefinition ? 1 : 0, ScopeLine, Flags, IsOptimized ? 1 : 0);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateFunction(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * LinkageName, size_t LinkageNameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool IsLocalToUnit, LLVMBool IsDefinition, unsigned int ScopeLine, LLVMDIFlags Flags, LLVMBool IsOptimized)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateFunction(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("char const *") CharSequence LinkageName, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean IsLocalToUnit, @NativeType("LLVMBool") boolean IsDefinition, @NativeType("unsigned int") int ScopeLine, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMBool") boolean IsOptimized) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int LinkageNameEncodedLength = stack.nUTF8(LinkageName, false);
            long LinkageNameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateFunction(Builder, Scope, NameEncoded, NameEncodedLength, LinkageNameEncoded, LinkageNameEncodedLength, File, LineNo, Ty, IsLocalToUnit ? 1 : 0, IsDefinition ? 1 : 0, ScopeLine, Flags, IsOptimized ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateLexicalBlock ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateLexicalBlock(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Line, unsigned int Column)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateLexicalBlock(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int Column) {
        long __functionAddress = Functions.DIBuilderCreateLexicalBlock;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPP(Builder, Scope, File, Line, Column, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateLexicalBlockFile ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateLexicalBlockFile(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Discriminator)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateLexicalBlockFile(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Discriminator) {
        long __functionAddress = Functions.DIBuilderCreateLexicalBlockFile;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPP(Builder, Scope, File, Discriminator, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateImportedModuleFromNamespace ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedModuleFromNamespace(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef NS, LLVMMetadataRef File, unsigned int Line)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedModuleFromNamespace(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long NS, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line) {
        long __functionAddress = Functions.DIBuilderCreateImportedModuleFromNamespace;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(NS);
            check(File);
        }
        return invokePPPPP(Builder, Scope, NS, File, Line, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateImportedModuleFromAlias ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedModuleFromAlias(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef ImportedEntity, LLVMMetadataRef File, unsigned int Line, LLVMMetadataRef * Elements, unsigned NumElements)} */
    public static long nLLVMDIBuilderCreateImportedModuleFromAlias(long Builder, long Scope, long ImportedEntity, long File, int Line, long Elements, int NumElements) {
        long __functionAddress = Functions.DIBuilderCreateImportedModuleFromAlias;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(ImportedEntity);
            check(File);
        }
        return invokePPPPPP(Builder, Scope, ImportedEntity, File, Line, Elements, NumElements, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedModuleFromAlias(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef ImportedEntity, LLVMMetadataRef File, unsigned int Line, LLVMMetadataRef * Elements, unsigned NumElements)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedModuleFromAlias(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long ImportedEntity, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("LLVMMetadataRef *") @Nullable PointerBuffer Elements) {
        return nLLVMDIBuilderCreateImportedModuleFromAlias(Builder, Scope, ImportedEntity, File, Line, memAddressSafe(Elements), remainingSafe(Elements));
    }

    // --- [ LLVMDIBuilderCreateImportedModuleFromModule ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedModuleFromModule(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef M, LLVMMetadataRef File, unsigned int Line, LLVMMetadataRef * Elements, unsigned NumElements)} */
    public static long nLLVMDIBuilderCreateImportedModuleFromModule(long Builder, long Scope, long M, long File, int Line, long Elements, int NumElements) {
        long __functionAddress = Functions.DIBuilderCreateImportedModuleFromModule;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(M);
            check(File);
        }
        return invokePPPPPP(Builder, Scope, M, File, Line, Elements, NumElements, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedModuleFromModule(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef M, LLVMMetadataRef File, unsigned int Line, LLVMMetadataRef * Elements, unsigned NumElements)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedModuleFromModule(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long M, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("LLVMMetadataRef *") @Nullable PointerBuffer Elements) {
        return nLLVMDIBuilderCreateImportedModuleFromModule(Builder, Scope, M, File, Line, memAddressSafe(Elements), remainingSafe(Elements));
    }

    // --- [ LLVMDIBuilderCreateImportedDeclaration ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedDeclaration(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef Decl, LLVMMetadataRef File, unsigned int Line, char const * Name, size_t NameLen, LLVMMetadataRef * Elements, unsigned NumElements)} */
    public static long nLLVMDIBuilderCreateImportedDeclaration(long Builder, long Scope, long Decl, long File, int Line, long Name, long NameLen, long Elements, int NumElements) {
        long __functionAddress = Functions.DIBuilderCreateImportedDeclaration;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(Decl);
            check(File);
        }
        return invokePPPPPPPP(Builder, Scope, Decl, File, Line, Name, NameLen, Elements, NumElements, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedDeclaration(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef Decl, LLVMMetadataRef File, unsigned int Line, char const * Name, size_t NameLen, LLVMMetadataRef * Elements, unsigned NumElements)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedDeclaration(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long Decl, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef *") @Nullable PointerBuffer Elements) {
        return nLLVMDIBuilderCreateImportedDeclaration(Builder, Scope, Decl, File, Line, memAddress(Name), Name.remaining(), memAddressSafe(Elements), remainingSafe(Elements));
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateImportedDeclaration(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, LLVMMetadataRef Decl, LLVMMetadataRef File, unsigned int Line, char const * Name, size_t NameLen, LLVMMetadataRef * Elements, unsigned NumElements)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedDeclaration(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long Decl, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef *") @Nullable PointerBuffer Elements) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateImportedDeclaration(Builder, Scope, Decl, File, Line, NameEncoded, NameEncodedLength, memAddressSafe(Elements), remainingSafe(Elements));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateDebugLocation ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateDebugLocation(LLVMContextRef Ctx, unsigned int Line, unsigned int Column, LLVMMetadataRef Scope, LLVMMetadataRef InlinedAt)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateDebugLocation(@NativeType("LLVMContextRef") long Ctx, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int Column, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long InlinedAt) {
        long __functionAddress = Functions.DIBuilderCreateDebugLocation;
        if (CHECKS) {
            check(Ctx);
            check(Scope);
            check(InlinedAt);
        }
        return invokePPPP(Ctx, Line, Column, Scope, InlinedAt, __functionAddress);
    }

    // --- [ LLVMDILocationGetLine ] ---

    /** {@code unsigned int LLVMDILocationGetLine(LLVMMetadataRef Location)} */
    @NativeType("unsigned int")
    public static int LLVMDILocationGetLine(@NativeType("LLVMMetadataRef") long Location) {
        long __functionAddress = Functions.DILocationGetLine;
        if (CHECKS) {
            check(Location);
        }
        return invokePI(Location, __functionAddress);
    }

    // --- [ LLVMDILocationGetColumn ] ---

    /** {@code unsigned int LLVMDILocationGetColumn(LLVMMetadataRef Location)} */
    @NativeType("unsigned int")
    public static int LLVMDILocationGetColumn(@NativeType("LLVMMetadataRef") long Location) {
        long __functionAddress = Functions.DILocationGetColumn;
        if (CHECKS) {
            check(Location);
        }
        return invokePI(Location, __functionAddress);
    }

    // --- [ LLVMDILocationGetScope ] ---

    /** {@code LLVMMetadataRef LLVMDILocationGetScope(LLVMMetadataRef Location)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDILocationGetScope(@NativeType("LLVMMetadataRef") long Location) {
        long __functionAddress = Functions.DILocationGetScope;
        if (CHECKS) {
            check(Location);
        }
        return invokePP(Location, __functionAddress);
    }

    // --- [ LLVMDILocationGetInlinedAt ] ---

    /** {@code LLVMMetadataRef LLVMDILocationGetInlinedAt(LLVMMetadataRef Location)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDILocationGetInlinedAt(@NativeType("LLVMMetadataRef") long Location) {
        long __functionAddress = Functions.DILocationGetInlinedAt;
        if (CHECKS) {
            check(__functionAddress);
            check(Location);
        }
        return invokePP(Location, __functionAddress);
    }

    // --- [ LLVMDIScopeGetFile ] ---

    /** {@code LLVMMetadataRef LLVMDIScopeGetFile(LLVMMetadataRef Scope)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIScopeGetFile(@NativeType("LLVMMetadataRef") long Scope) {
        long __functionAddress = Functions.DIScopeGetFile;
        if (CHECKS) {
            check(__functionAddress);
            check(Scope);
        }
        return invokePP(Scope, __functionAddress);
    }

    // --- [ LLVMDIFileGetDirectory ] ---

    /** {@code char const * LLVMDIFileGetDirectory(LLVMMetadataRef File, unsigned * Len)} */
    public static long nLLVMDIFileGetDirectory(long File, long Len) {
        long __functionAddress = Functions.DIFileGetDirectory;
        if (CHECKS) {
            check(__functionAddress);
            check(File);
        }
        return invokePPP(File, Len, __functionAddress);
    }

    /** {@code char const * LLVMDIFileGetDirectory(LLVMMetadataRef File, unsigned * Len)} */
    @NativeType("char const *")
    public static @Nullable String LLVMDIFileGetDirectory(@NativeType("LLVMMetadataRef") long File) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Len = stack.callocInt(1);
            long __result = nLLVMDIFileGetDirectory(File, memAddress(Len));
            return memUTF8Safe(__result, Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIFileGetFilename ] ---

    /** {@code char const * LLVMDIFileGetFilename(LLVMMetadataRef File, unsigned * Len)} */
    public static long nLLVMDIFileGetFilename(long File, long Len) {
        long __functionAddress = Functions.DIFileGetFilename;
        if (CHECKS) {
            check(__functionAddress);
            check(File);
        }
        return invokePPP(File, Len, __functionAddress);
    }

    /** {@code char const * LLVMDIFileGetFilename(LLVMMetadataRef File, unsigned * Len)} */
    @NativeType("char const *")
    public static @Nullable String LLVMDIFileGetFilename(@NativeType("LLVMMetadataRef") long File) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Len = stack.callocInt(1);
            long __result = nLLVMDIFileGetFilename(File, memAddress(Len));
            return memUTF8Safe(__result, Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIFileGetSource ] ---

    /** {@code char const * LLVMDIFileGetSource(LLVMMetadataRef File, unsigned * Len)} */
    public static long nLLVMDIFileGetSource(long File, long Len) {
        long __functionAddress = Functions.DIFileGetSource;
        if (CHECKS) {
            check(__functionAddress);
            check(File);
        }
        return invokePPP(File, Len, __functionAddress);
    }

    /** {@code char const * LLVMDIFileGetSource(LLVMMetadataRef File, unsigned * Len)} */
    @NativeType("char const *")
    public static @Nullable String LLVMDIFileGetSource(@NativeType("LLVMMetadataRef") long File) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Len = stack.callocInt(1);
            long __result = nLLVMDIFileGetSource(File, memAddress(Len));
            return memUTF8Safe(__result, Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderGetOrCreateTypeArray ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderGetOrCreateTypeArray(LLVMDIBuilderRef Builder, LLVMMetadataRef * Data, size_t NumElements)} */
    public static long nLLVMDIBuilderGetOrCreateTypeArray(long Builder, long Data, long NumElements) {
        long __functionAddress = Functions.DIBuilderGetOrCreateTypeArray;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Data, NumElements, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderGetOrCreateTypeArray(LLVMDIBuilderRef Builder, LLVMMetadataRef * Data, size_t NumElements)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderGetOrCreateTypeArray(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef *") PointerBuffer Data) {
        return nLLVMDIBuilderGetOrCreateTypeArray(Builder, memAddress(Data), Data.remaining());
    }

    // --- [ LLVMDIBuilderCreateSubroutineType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateSubroutineType(LLVMDIBuilderRef Builder, LLVMMetadataRef File, LLVMMetadataRef * ParameterTypes, unsigned int NumParameterTypes, LLVMDIFlags Flags)} */
    public static long nLLVMDIBuilderCreateSubroutineType(long Builder, long File, long ParameterTypes, int NumParameterTypes, int Flags) {
        long __functionAddress = Functions.DIBuilderCreateSubroutineType;
        if (CHECKS) {
            check(Builder);
            check(File);
        }
        return invokePPPP(Builder, File, ParameterTypes, NumParameterTypes, Flags, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateSubroutineType(LLVMDIBuilderRef Builder, LLVMMetadataRef File, LLVMMetadataRef * ParameterTypes, unsigned int NumParameterTypes, LLVMDIFlags Flags)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateSubroutineType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long File, @NativeType("LLVMMetadataRef *") PointerBuffer ParameterTypes, @NativeType("LLVMDIFlags") int Flags) {
        return nLLVMDIBuilderCreateSubroutineType(Builder, File, memAddress(ParameterTypes), ParameterTypes.remaining(), Flags);
    }

    // --- [ LLVMDIBuilderCreateMacro ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateMacro(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentMacroFile, unsigned Line, LLVMDWARFMacinfoRecordType RecordType, char const * Name, size_t NameLen, char const * Value, size_t ValueLen)} */
    public static long nLLVMDIBuilderCreateMacro(long Builder, long ParentMacroFile, int Line, int RecordType, long Name, long NameLen, long Value, long ValueLen) {
        long __functionAddress = Functions.DIBuilderCreateMacro;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        return invokePPPPPPP(Builder, ParentMacroFile, Line, RecordType, Name, NameLen, Value, ValueLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateMacro(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentMacroFile, unsigned Line, LLVMDWARFMacinfoRecordType RecordType, char const * Name, size_t NameLen, char const * Value, size_t ValueLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateMacro(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentMacroFile, @NativeType("unsigned") int Line, @NativeType("LLVMDWARFMacinfoRecordType") int RecordType, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer Value) {
        return nLLVMDIBuilderCreateMacro(Builder, ParentMacroFile, Line, RecordType, memAddress(Name), Name.remaining(), memAddress(Value), Value.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateMacro(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentMacroFile, unsigned Line, LLVMDWARFMacinfoRecordType RecordType, char const * Name, size_t NameLen, char const * Value, size_t ValueLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateMacro(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentMacroFile, @NativeType("unsigned") int Line, @NativeType("LLVMDWARFMacinfoRecordType") int RecordType, @NativeType("char const *") CharSequence Name, @NativeType("char const *") CharSequence Value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int ValueEncodedLength = stack.nUTF8(Value, false);
            long ValueEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateMacro(Builder, ParentMacroFile, Line, RecordType, NameEncoded, NameEncodedLength, ValueEncoded, ValueEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateTempMacroFile ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateTempMacroFile(LLVMDIBuilderRef Builder, LLVMMetadataRef ParentMacroFile, unsigned Line, LLVMMetadataRef File)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateTempMacroFile(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentMacroFile, @NativeType("unsigned") int Line, @NativeType("LLVMMetadataRef") long File) {
        long __functionAddress = Functions.DIBuilderCreateTempMacroFile;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(ParentMacroFile);
            check(File);
        }
        return invokePPPP(Builder, ParentMacroFile, Line, File, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateEnumerator ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateEnumerator(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, int64_t Value, LLVMBool IsUnsigned)} */
    public static long nLLVMDIBuilderCreateEnumerator(long Builder, long Name, long NameLen, long Value, int IsUnsigned) {
        long __functionAddress = Functions.DIBuilderCreateEnumerator;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        return invokePPPJP(Builder, Name, NameLen, Value, IsUnsigned, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateEnumerator(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, int64_t Value, LLVMBool IsUnsigned)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateEnumerator(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("int64_t") long Value, @NativeType("LLVMBool") boolean IsUnsigned) {
        return nLLVMDIBuilderCreateEnumerator(Builder, memAddress(Name), Name.remaining(), Value, IsUnsigned ? 1 : 0);
    }

    // --- [ LLVMDIBuilderCreateEnumerationType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateEnumerationType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMMetadataRef * Elements, unsigned int NumElements, LLVMMetadataRef ClassTy)} */
    public static long nLLVMDIBuilderCreateEnumerationType(long Builder, long Scope, long Name, long NameLen, long File, int LineNumber, long SizeInBits, int AlignInBits, long Elements, int NumElements, long ClassTy) {
        long __functionAddress = Functions.DIBuilderCreateEnumerationType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(ClassTy);
        }
        return invokePPPPPJPPP(Builder, Scope, Name, NameLen, File, LineNumber, SizeInBits, AlignInBits, Elements, NumElements, ClassTy, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateEnumerationType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMMetadataRef * Elements, unsigned int NumElements, LLVMMetadataRef ClassTy)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateEnumerationType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("LLVMMetadataRef") long ClassTy) {
        return nLLVMDIBuilderCreateEnumerationType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, memAddress(Elements), Elements.remaining(), ClassTy);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateEnumerationType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMMetadataRef * Elements, unsigned int NumElements, LLVMMetadataRef ClassTy)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateEnumerationType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("LLVMMetadataRef") long ClassTy) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateEnumerationType(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNumber, SizeInBits, AlignInBits, memAddress(Elements), Elements.remaining(), ClassTy);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateUnionType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateUnionType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, LLVMMetadataRef * Elements, unsigned int NumElements, unsigned int RunTimeLang, char const * UniqueId, size_t UniqueIdLen)} */
    public static long nLLVMDIBuilderCreateUnionType(long Builder, long Scope, long Name, long NameLen, long File, int LineNumber, long SizeInBits, int AlignInBits, int Flags, long Elements, int NumElements, int RunTimeLang, long UniqueId, long UniqueIdLen) {
        long __functionAddress = Functions.DIBuilderCreateUnionType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPPPJPPPP(Builder, Scope, Name, NameLen, File, LineNumber, SizeInBits, AlignInBits, Flags, Elements, NumElements, RunTimeLang, UniqueId, UniqueIdLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateUnionType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, LLVMMetadataRef * Elements, unsigned int NumElements, unsigned int RunTimeLang, char const * UniqueId, size_t UniqueIdLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateUnionType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("unsigned int") int RunTimeLang, @NativeType("char const *") ByteBuffer UniqueId) {
        return nLLVMDIBuilderCreateUnionType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, Flags, memAddress(Elements), Elements.remaining(), RunTimeLang, memAddress(UniqueId), UniqueId.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateUnionType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, LLVMMetadataRef * Elements, unsigned int NumElements, unsigned int RunTimeLang, char const * UniqueId, size_t UniqueIdLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateUnionType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("unsigned int") int RunTimeLang, @NativeType("char const *") CharSequence UniqueId) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int UniqueIdEncodedLength = stack.nUTF8(UniqueId, false);
            long UniqueIdEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateUnionType(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNumber, SizeInBits, AlignInBits, Flags, memAddress(Elements), Elements.remaining(), RunTimeLang, UniqueIdEncoded, UniqueIdEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateArrayType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateArrayType(LLVMDIBuilderRef Builder, uint64_t Size, uint32_t AlignInBits, LLVMMetadataRef Ty, LLVMMetadataRef * Subscripts, unsigned int NumSubscripts)} */
    public static long nLLVMDIBuilderCreateArrayType(long Builder, long Size, int AlignInBits, long Ty, long Subscripts, int NumSubscripts) {
        long __functionAddress = Functions.DIBuilderCreateArrayType;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePJPPP(Builder, Size, AlignInBits, Ty, Subscripts, NumSubscripts, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateArrayType(LLVMDIBuilderRef Builder, uint64_t Size, uint32_t AlignInBits, LLVMMetadataRef Ty, LLVMMetadataRef * Subscripts, unsigned int NumSubscripts)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateArrayType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("uint64_t") long Size, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef *") PointerBuffer Subscripts) {
        return nLLVMDIBuilderCreateArrayType(Builder, Size, AlignInBits, Ty, memAddress(Subscripts), Subscripts.remaining());
    }

    // --- [ LLVMDIBuilderCreateVectorType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateVectorType(LLVMDIBuilderRef Builder, uint64_t Size, uint32_t AlignInBits, LLVMMetadataRef Ty, LLVMMetadataRef * Subscripts, unsigned int NumSubscripts)} */
    public static long nLLVMDIBuilderCreateVectorType(long Builder, long Size, int AlignInBits, long Ty, long Subscripts, int NumSubscripts) {
        long __functionAddress = Functions.DIBuilderCreateVectorType;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePJPPP(Builder, Size, AlignInBits, Ty, Subscripts, NumSubscripts, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateVectorType(LLVMDIBuilderRef Builder, uint64_t Size, uint32_t AlignInBits, LLVMMetadataRef Ty, LLVMMetadataRef * Subscripts, unsigned int NumSubscripts)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateVectorType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("uint64_t") long Size, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef *") PointerBuffer Subscripts) {
        return nLLVMDIBuilderCreateVectorType(Builder, Size, AlignInBits, Ty, memAddress(Subscripts), Subscripts.remaining());
    }

    // --- [ LLVMDIBuilderCreateUnspecifiedType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateUnspecifiedType(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen)} */
    public static long nLLVMDIBuilderCreateUnspecifiedType(long Builder, long Name, long NameLen) {
        long __functionAddress = Functions.DIBuilderCreateUnspecifiedType;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Name, NameLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateUnspecifiedType(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateUnspecifiedType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMDIBuilderCreateUnspecifiedType(Builder, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateUnspecifiedType(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateUnspecifiedType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateUnspecifiedType(Builder, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateBasicType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateBasicType(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, uint64_t SizeInBits, LLVMDWARFTypeEncoding Encoding, LLVMDIFlags Flags)} */
    public static long nLLVMDIBuilderCreateBasicType(long Builder, long Name, long NameLen, long SizeInBits, int Encoding, int Flags) {
        long __functionAddress = Functions.DIBuilderCreateBasicType;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPJP(Builder, Name, NameLen, SizeInBits, Encoding, Flags, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateBasicType(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, uint64_t SizeInBits, LLVMDWARFTypeEncoding Encoding, LLVMDIFlags Flags)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateBasicType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("uint64_t") long SizeInBits, @NativeType("LLVMDWARFTypeEncoding") int Encoding, @NativeType("LLVMDIFlags") int Flags) {
        return nLLVMDIBuilderCreateBasicType(Builder, memAddress(Name), Name.remaining(), SizeInBits, Encoding, Flags);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateBasicType(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, uint64_t SizeInBits, LLVMDWARFTypeEncoding Encoding, LLVMDIFlags Flags)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateBasicType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") CharSequence Name, @NativeType("uint64_t") long SizeInBits, @NativeType("LLVMDWARFTypeEncoding") int Encoding, @NativeType("LLVMDIFlags") int Flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateBasicType(Builder, NameEncoded, NameEncodedLength, SizeInBits, Encoding, Flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreatePointerType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreatePointerType(LLVMDIBuilderRef Builder, LLVMMetadataRef PointeeTy, uint64_t SizeInBits, uint32_t AlignInBits, unsigned int AddressSpace, char const * Name, size_t NameLen)} */
    public static long nLLVMDIBuilderCreatePointerType(long Builder, long PointeeTy, long SizeInBits, int AlignInBits, int AddressSpace, long Name, long NameLen) {
        long __functionAddress = Functions.DIBuilderCreatePointerType;
        if (CHECKS) {
            check(Builder);
            check(PointeeTy);
        }
        return invokePPJPPP(Builder, PointeeTy, SizeInBits, AlignInBits, AddressSpace, Name, NameLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreatePointerType(LLVMDIBuilderRef Builder, LLVMMetadataRef PointeeTy, uint64_t SizeInBits, uint32_t AlignInBits, unsigned int AddressSpace, char const * Name, size_t NameLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreatePointerType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long PointeeTy, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("unsigned int") int AddressSpace, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMDIBuilderCreatePointerType(Builder, PointeeTy, SizeInBits, AlignInBits, AddressSpace, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreatePointerType(LLVMDIBuilderRef Builder, LLVMMetadataRef PointeeTy, uint64_t SizeInBits, uint32_t AlignInBits, unsigned int AddressSpace, char const * Name, size_t NameLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreatePointerType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long PointeeTy, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("unsigned int") int AddressSpace, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreatePointerType(Builder, PointeeTy, SizeInBits, AlignInBits, AddressSpace, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateStructType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateStructType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, LLVMMetadataRef DerivedFrom, LLVMMetadataRef * Elements, unsigned int NumElements, unsigned int RunTimeLang, LLVMMetadataRef VTableHolder, char const * UniqueId, size_t UniqueIdLen)} */
    public static long nLLVMDIBuilderCreateStructType(long Builder, long Scope, long Name, long NameLen, long File, int LineNumber, long SizeInBits, int AlignInBits, int Flags, long DerivedFrom, long Elements, int NumElements, int RunTimeLang, long VTableHolder, long UniqueId, long UniqueIdLen) {
        long __functionAddress = Functions.DIBuilderCreateStructType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(DerivedFrom);
            check(VTableHolder);
        }
        return invokePPPPPJPPPPPP(Builder, Scope, Name, NameLen, File, LineNumber, SizeInBits, AlignInBits, Flags, DerivedFrom, Elements, NumElements, RunTimeLang, VTableHolder, UniqueId, UniqueIdLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateStructType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, LLVMMetadataRef DerivedFrom, LLVMMetadataRef * Elements, unsigned int NumElements, unsigned int RunTimeLang, LLVMMetadataRef VTableHolder, char const * UniqueId, size_t UniqueIdLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateStructType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long DerivedFrom, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("unsigned int") int RunTimeLang, @NativeType("LLVMMetadataRef") long VTableHolder, @NativeType("char const *") ByteBuffer UniqueId) {
        return nLLVMDIBuilderCreateStructType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, Flags, DerivedFrom, memAddress(Elements), Elements.remaining(), RunTimeLang, VTableHolder, memAddress(UniqueId), UniqueId.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateStructType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, LLVMMetadataRef DerivedFrom, LLVMMetadataRef * Elements, unsigned int NumElements, unsigned int RunTimeLang, LLVMMetadataRef VTableHolder, char const * UniqueId, size_t UniqueIdLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateStructType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long DerivedFrom, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("unsigned int") int RunTimeLang, @NativeType("LLVMMetadataRef") long VTableHolder, @NativeType("char const *") CharSequence UniqueId) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int UniqueIdEncodedLength = stack.nUTF8(UniqueId, false);
            long UniqueIdEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateStructType(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNumber, SizeInBits, AlignInBits, Flags, DerivedFrom, memAddress(Elements), Elements.remaining(), RunTimeLang, VTableHolder, UniqueIdEncoded, UniqueIdEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateMemberType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Ty)} */
    public static long nLLVMDIBuilderCreateMemberType(long Builder, long Scope, long Name, long NameLen, long File, int LineNo, long SizeInBits, int AlignInBits, long OffsetInBits, int Flags, long Ty) {
        long __functionAddress = Functions.DIBuilderCreateMemberType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Ty);
        }
        return invokePPPPPJJPP(Builder, Scope, Name, NameLen, File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Ty)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Ty) {
        return nLLVMDIBuilderCreateMemberType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Ty)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Ty) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateMemberType(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateStaticMemberType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateStaticMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, LLVMMetadataRef Type, LLVMDIFlags Flags, LLVMValueRef ConstantVal, uint32_t AlignInBits)} */
    public static long nLLVMDIBuilderCreateStaticMemberType(long Builder, long Scope, long Name, long NameLen, long File, int LineNumber, long Type, int Flags, long ConstantVal, int AlignInBits) {
        long __functionAddress = Functions.DIBuilderCreateStaticMemberType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Type);
            check(ConstantVal);
        }
        return invokePPPPPPPP(Builder, Scope, Name, NameLen, File, LineNumber, Type, Flags, ConstantVal, AlignInBits, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateStaticMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, LLVMMetadataRef Type, LLVMDIFlags Flags, LLVMValueRef ConstantVal, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateStaticMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("LLVMMetadataRef") long Type, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateStaticMemberType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, Type, Flags, ConstantVal, AlignInBits);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateStaticMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, LLVMMetadataRef Type, LLVMDIFlags Flags, LLVMValueRef ConstantVal, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateStaticMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("LLVMMetadataRef") long Type, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("uint32_t") int AlignInBits) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateStaticMemberType(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNumber, Type, Flags, ConstantVal, AlignInBits);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateMemberPointerType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateMemberPointerType(LLVMDIBuilderRef Builder, LLVMMetadataRef PointeeType, LLVMMetadataRef ClassType, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateMemberPointerType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long PointeeType, @NativeType("LLVMMetadataRef") long ClassType, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags) {
        long __functionAddress = Functions.DIBuilderCreateMemberPointerType;
        if (CHECKS) {
            check(Builder);
            check(PointeeType);
            check(ClassType);
        }
        return invokePPPJP(Builder, PointeeType, ClassType, SizeInBits, AlignInBits, Flags, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateObjCIVar ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateObjCIVar(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Ty, LLVMMetadataRef PropertyNode)} */
    public static long nLLVMDIBuilderCreateObjCIVar(long Builder, long Name, long NameLen, long File, int LineNo, long SizeInBits, int AlignInBits, long OffsetInBits, int Flags, long Ty, long PropertyNode) {
        long __functionAddress = Functions.DIBuilderCreateObjCIVar;
        if (CHECKS) {
            check(Builder);
            check(File);
            check(Ty);
            check(PropertyNode);
        }
        return invokePPPPJJPPP(Builder, Name, NameLen, File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty, PropertyNode, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateObjCIVar(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Ty, LLVMMetadataRef PropertyNode)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjCIVar(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef") long PropertyNode) {
        return nLLVMDIBuilderCreateObjCIVar(Builder, memAddress(Name), Name.remaining(), File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty, PropertyNode);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateObjCIVar(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Ty, LLVMMetadataRef PropertyNode)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjCIVar(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef") long PropertyNode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateObjCIVar(Builder, NameEncoded, NameEncodedLength, File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty, PropertyNode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateObjCProperty ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateObjCProperty(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, char const * GetterName, size_t GetterNameLen, char const * SetterName, size_t SetterNameLen, unsigned int PropertyAttributes, LLVMMetadataRef Ty)} */
    public static long nLLVMDIBuilderCreateObjCProperty(long Builder, long Name, long NameLen, long File, int LineNo, long GetterName, long GetterNameLen, long SetterName, long SetterNameLen, int PropertyAttributes, long Ty) {
        long __functionAddress = Functions.DIBuilderCreateObjCProperty;
        if (CHECKS) {
            check(Builder);
            check(File);
            check(Ty);
        }
        return invokePPPPPPPPPP(Builder, Name, NameLen, File, LineNo, GetterName, GetterNameLen, SetterName, SetterNameLen, PropertyAttributes, Ty, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateObjCProperty(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, char const * GetterName, size_t GetterNameLen, char const * SetterName, size_t SetterNameLen, unsigned int PropertyAttributes, LLVMMetadataRef Ty)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjCProperty(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("char const *") ByteBuffer GetterName, @NativeType("char const *") ByteBuffer SetterName, @NativeType("unsigned int") int PropertyAttributes, @NativeType("LLVMMetadataRef") long Ty) {
        return nLLVMDIBuilderCreateObjCProperty(Builder, memAddress(Name), Name.remaining(), File, LineNo, memAddress(GetterName), GetterName.remaining(), memAddress(SetterName), SetterName.remaining(), PropertyAttributes, Ty);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateObjCProperty(LLVMDIBuilderRef Builder, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, char const * GetterName, size_t GetterNameLen, char const * SetterName, size_t SetterNameLen, unsigned int PropertyAttributes, LLVMMetadataRef Ty)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjCProperty(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("char const *") CharSequence GetterName, @NativeType("char const *") CharSequence SetterName, @NativeType("unsigned int") int PropertyAttributes, @NativeType("LLVMMetadataRef") long Ty) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int GetterNameEncodedLength = stack.nUTF8(GetterName, false);
            long GetterNameEncoded = stack.getPointerAddress();
            int SetterNameEncodedLength = stack.nUTF8(SetterName, false);
            long SetterNameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateObjCProperty(Builder, NameEncoded, NameEncodedLength, File, LineNo, GetterNameEncoded, GetterNameEncodedLength, SetterNameEncoded, SetterNameEncodedLength, PropertyAttributes, Ty);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateObjectPointerType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateObjectPointerType(LLVMDIBuilderRef Builder, LLVMMetadataRef Type, LLVMBool Implicit)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjectPointerType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Type, @NativeType("LLVMBool") boolean Implicit) {
        long __functionAddress = Functions.DIBuilderCreateObjectPointerType;
        if (CHECKS) {
            check(Builder);
            check(Type);
        }
        return invokePPP(Builder, Type, Implicit ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateQualifiedType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateQualifiedType(LLVMDIBuilderRef Builder, unsigned int Tag, LLVMMetadataRef Type)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateQualifiedType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("LLVMMetadataRef") long Type) {
        long __functionAddress = Functions.DIBuilderCreateQualifiedType;
        if (CHECKS) {
            check(Builder);
            check(Type);
        }
        return invokePPP(Builder, Tag, Type, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateReferenceType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateReferenceType(LLVMDIBuilderRef Builder, unsigned int Tag, LLVMMetadataRef Type)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateReferenceType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("LLVMMetadataRef") long Type) {
        long __functionAddress = Functions.DIBuilderCreateReferenceType;
        if (CHECKS) {
            check(Builder);
            check(Type);
        }
        return invokePPP(Builder, Tag, Type, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateNullPtrType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateNullPtrType(LLVMDIBuilderRef Builder)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateNullPtrType(@NativeType("LLVMDIBuilderRef") long Builder) {
        long __functionAddress = Functions.DIBuilderCreateNullPtrType;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateTypedef ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateTypedef(LLVMDIBuilderRef Builder, LLVMMetadataRef Type, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Scope, uint32_t AlignInBits)} */
    public static long nLLVMDIBuilderCreateTypedef(long Builder, long Type, long Name, long NameLen, long File, int LineNo, long Scope, int AlignInBits) {
        long __functionAddress = Functions.DIBuilderCreateTypedef;
        if (CHECKS) {
            check(Builder);
            check(Type);
            check(File);
            check(Scope);
        }
        return invokePPPPPPP(Builder, Type, Name, NameLen, File, LineNo, Scope, AlignInBits, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateTypedef(LLVMDIBuilderRef Builder, LLVMMetadataRef Type, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Scope, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateTypedef(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Type, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Scope, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateTypedef(Builder, Type, memAddress(Name), Name.remaining(), File, LineNo, Scope, AlignInBits);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateTypedef(LLVMDIBuilderRef Builder, LLVMMetadataRef Type, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Scope, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateTypedef(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Type, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Scope, @NativeType("uint32_t") int AlignInBits) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateTypedef(Builder, Type, NameEncoded, NameEncodedLength, File, LineNo, Scope, AlignInBits);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateInheritance ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateInheritance(LLVMDIBuilderRef Builder, LLVMMetadataRef Ty, LLVMMetadataRef BaseTy, uint64_t BaseOffset, uint32_t VBPtrOffset, LLVMDIFlags Flags)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateInheritance(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef") long BaseTy, @NativeType("uint64_t") long BaseOffset, @NativeType("uint32_t") int VBPtrOffset, @NativeType("LLVMDIFlags") int Flags) {
        long __functionAddress = Functions.DIBuilderCreateInheritance;
        if (CHECKS) {
            check(Builder);
            check(Ty);
            check(BaseTy);
        }
        return invokePPPJP(Builder, Ty, BaseTy, BaseOffset, VBPtrOffset, Flags, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateForwardDecl ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateForwardDecl(LLVMDIBuilderRef Builder, unsigned int Tag, char const * Name, size_t NameLen, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Line, unsigned int RuntimeLang, uint64_t SizeInBits, uint32_t AlignInBits, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    public static long nLLVMDIBuilderCreateForwardDecl(long Builder, int Tag, long Name, long NameLen, long Scope, long File, int Line, int RuntimeLang, long SizeInBits, int AlignInBits, long UniqueIdentifier, long UniqueIdentifierLen) {
        long __functionAddress = Functions.DIBuilderCreateForwardDecl;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPPPJPPP(Builder, Tag, Name, NameLen, Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, UniqueIdentifier, UniqueIdentifierLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateForwardDecl(LLVMDIBuilderRef Builder, unsigned int Tag, char const * Name, size_t NameLen, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Line, unsigned int RuntimeLang, uint64_t SizeInBits, uint32_t AlignInBits, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateForwardDecl(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int RuntimeLang, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("char const *") ByteBuffer UniqueIdentifier) {
        return nLLVMDIBuilderCreateForwardDecl(Builder, Tag, memAddress(Name), Name.remaining(), Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, memAddress(UniqueIdentifier), UniqueIdentifier.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateForwardDecl(LLVMDIBuilderRef Builder, unsigned int Tag, char const * Name, size_t NameLen, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Line, unsigned int RuntimeLang, uint64_t SizeInBits, uint32_t AlignInBits, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateForwardDecl(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int RuntimeLang, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("char const *") CharSequence UniqueIdentifier) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int UniqueIdentifierEncodedLength = stack.nUTF8(UniqueIdentifier, false);
            long UniqueIdentifierEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateForwardDecl(Builder, Tag, NameEncoded, NameEncodedLength, Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, UniqueIdentifierEncoded, UniqueIdentifierEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateReplaceableCompositeType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateReplaceableCompositeType(LLVMDIBuilderRef Builder, unsigned int Tag, char const * Name, size_t NameLen, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Line, unsigned int RuntimeLang, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    public static long nLLVMDIBuilderCreateReplaceableCompositeType(long Builder, int Tag, long Name, long NameLen, long Scope, long File, int Line, int RuntimeLang, long SizeInBits, int AlignInBits, int Flags, long UniqueIdentifier, long UniqueIdentifierLen) {
        long __functionAddress = Functions.DIBuilderCreateReplaceableCompositeType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPPPJPPP(Builder, Tag, Name, NameLen, Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, Flags, UniqueIdentifier, UniqueIdentifierLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateReplaceableCompositeType(LLVMDIBuilderRef Builder, unsigned int Tag, char const * Name, size_t NameLen, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Line, unsigned int RuntimeLang, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateReplaceableCompositeType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int RuntimeLang, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("char const *") ByteBuffer UniqueIdentifier) {
        return nLLVMDIBuilderCreateReplaceableCompositeType(Builder, Tag, memAddress(Name), Name.remaining(), Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, Flags, memAddress(UniqueIdentifier), UniqueIdentifier.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateReplaceableCompositeType(LLVMDIBuilderRef Builder, unsigned int Tag, char const * Name, size_t NameLen, LLVMMetadataRef Scope, LLVMMetadataRef File, unsigned int Line, unsigned int RuntimeLang, uint64_t SizeInBits, uint32_t AlignInBits, LLVMDIFlags Flags, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateReplaceableCompositeType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int RuntimeLang, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("char const *") CharSequence UniqueIdentifier) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int UniqueIdentifierEncodedLength = stack.nUTF8(UniqueIdentifier, false);
            long UniqueIdentifierEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateReplaceableCompositeType(Builder, Tag, NameEncoded, NameEncodedLength, Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, Flags, UniqueIdentifierEncoded, UniqueIdentifierEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateBitFieldMemberType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateBitFieldMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint64_t OffsetInBits, uint64_t StorageOffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Type)} */
    public static long nLLVMDIBuilderCreateBitFieldMemberType(long Builder, long Scope, long Name, long NameLen, long File, int LineNumber, long SizeInBits, long OffsetInBits, long StorageOffsetInBits, int Flags, long Type) {
        long __functionAddress = Functions.DIBuilderCreateBitFieldMemberType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Type);
        }
        return invokePPPPPJJJPP(Builder, Scope, Name, NameLen, File, LineNumber, SizeInBits, OffsetInBits, StorageOffsetInBits, Flags, Type, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateBitFieldMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint64_t OffsetInBits, uint64_t StorageOffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Type)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateBitFieldMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("uint64_t") long StorageOffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Type) {
        return nLLVMDIBuilderCreateBitFieldMemberType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, OffsetInBits, StorageOffsetInBits, Flags, Type);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateBitFieldMemberType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint64_t OffsetInBits, uint64_t StorageOffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef Type)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateBitFieldMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("uint64_t") long StorageOffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Type) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateBitFieldMemberType(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNumber, SizeInBits, OffsetInBits, StorageOffsetInBits, Flags, Type);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateClassType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateClassType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef DerivedFrom, LLVMMetadataRef * Elements, unsigned int NumElements, LLVMMetadataRef VTableHolder, LLVMMetadataRef TemplateParamsNode, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    public static long nLLVMDIBuilderCreateClassType(long Builder, long Scope, long Name, long NameLen, long File, int LineNumber, long SizeInBits, int AlignInBits, long OffsetInBits, int Flags, long DerivedFrom, long Elements, int NumElements, long VTableHolder, long TemplateParamsNode, long UniqueIdentifier, long UniqueIdentifierLen) {
        long __functionAddress = Functions.DIBuilderCreateClassType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(DerivedFrom);
            check(VTableHolder);
            check(TemplateParamsNode);
        }
        return invokePPPPPJJPPPPPPP(Builder, Scope, Name, NameLen, File, LineNumber, SizeInBits, AlignInBits, OffsetInBits, Flags, DerivedFrom, Elements, NumElements, VTableHolder, TemplateParamsNode, UniqueIdentifier, UniqueIdentifierLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateClassType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef DerivedFrom, LLVMMetadataRef * Elements, unsigned int NumElements, LLVMMetadataRef VTableHolder, LLVMMetadataRef TemplateParamsNode, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateClassType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long DerivedFrom, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("LLVMMetadataRef") long VTableHolder, @NativeType("LLVMMetadataRef") long TemplateParamsNode, @NativeType("char const *") ByteBuffer UniqueIdentifier) {
        return nLLVMDIBuilderCreateClassType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, OffsetInBits, Flags, DerivedFrom, memAddress(Elements), Elements.remaining(), VTableHolder, TemplateParamsNode, memAddress(UniqueIdentifier), UniqueIdentifier.remaining());
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateClassType(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNumber, uint64_t SizeInBits, uint32_t AlignInBits, uint64_t OffsetInBits, LLVMDIFlags Flags, LLVMMetadataRef DerivedFrom, LLVMMetadataRef * Elements, unsigned int NumElements, LLVMMetadataRef VTableHolder, LLVMMetadataRef TemplateParamsNode, char const * UniqueIdentifier, size_t UniqueIdentifierLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateClassType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long DerivedFrom, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("LLVMMetadataRef") long VTableHolder, @NativeType("LLVMMetadataRef") long TemplateParamsNode, @NativeType("char const *") CharSequence UniqueIdentifier) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int UniqueIdentifierEncodedLength = stack.nUTF8(UniqueIdentifier, false);
            long UniqueIdentifierEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateClassType(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNumber, SizeInBits, AlignInBits, OffsetInBits, Flags, DerivedFrom, memAddress(Elements), Elements.remaining(), VTableHolder, TemplateParamsNode, UniqueIdentifierEncoded, UniqueIdentifierEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateArtificialType ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateArtificialType(LLVMDIBuilderRef Builder, LLVMMetadataRef Type)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateArtificialType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Type) {
        long __functionAddress = Functions.DIBuilderCreateArtificialType;
        if (CHECKS) {
            check(Builder);
            check(Type);
        }
        return invokePPP(Builder, Type, __functionAddress);
    }

    // --- [ LLVMDITypeGetName ] ---

    /** {@code char const * LLVMDITypeGetName(LLVMMetadataRef DType, size_t * Length)} */
    public static long nLLVMDITypeGetName(long DType, long Length) {
        long __functionAddress = Functions.DITypeGetName;
        if (CHECKS) {
            check(DType);
        }
        return invokePPP(DType, Length, __functionAddress);
    }

    /** {@code char const * LLVMDITypeGetName(LLVMMetadataRef DType, size_t * Length)} */
    @NativeType("char const *")
    public static @Nullable String LLVMDITypeGetName(@NativeType("LLVMMetadataRef") long DType) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Length = stack.callocPointer(1);
            long __result = nLLVMDITypeGetName(DType, memAddress(Length));
            return memUTF8Safe(__result, (int)Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDITypeGetSizeInBits ] ---

    /** {@code uint64_t LLVMDITypeGetSizeInBits(LLVMMetadataRef DType)} */
    @NativeType("uint64_t")
    public static long LLVMDITypeGetSizeInBits(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetSizeInBits;
        if (CHECKS) {
            check(DType);
        }
        return invokePJ(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetOffsetInBits ] ---

    /** {@code uint64_t LLVMDITypeGetOffsetInBits(LLVMMetadataRef DType)} */
    @NativeType("uint64_t")
    public static long LLVMDITypeGetOffsetInBits(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetOffsetInBits;
        if (CHECKS) {
            check(DType);
        }
        return invokePJ(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetAlignInBits ] ---

    /** {@code uint32_t LLVMDITypeGetAlignInBits(LLVMMetadataRef DType)} */
    @NativeType("uint32_t")
    public static int LLVMDITypeGetAlignInBits(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetAlignInBits;
        if (CHECKS) {
            check(DType);
        }
        return invokePI(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetLine ] ---

    /** {@code unsigned int LLVMDITypeGetLine(LLVMMetadataRef DType)} */
    @NativeType("unsigned int")
    public static int LLVMDITypeGetLine(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetLine;
        if (CHECKS) {
            check(DType);
        }
        return invokePI(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetFlags ] ---

    /** {@code LLVMDIFlags LLVMDITypeGetFlags(LLVMMetadataRef DType)} */
    @NativeType("LLVMDIFlags")
    public static int LLVMDITypeGetFlags(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetFlags;
        if (CHECKS) {
            check(DType);
        }
        return invokePI(DType, __functionAddress);
    }

    // --- [ LLVMDIBuilderGetOrCreateSubrange ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderGetOrCreateSubrange(LLVMDIBuilderRef Builder, int64_t LowerBound, int64_t Count)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderGetOrCreateSubrange(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("int64_t") long LowerBound, @NativeType("int64_t") long Count) {
        long __functionAddress = Functions.DIBuilderGetOrCreateSubrange;
        if (CHECKS) {
            check(Builder);
        }
        return invokePJJP(Builder, LowerBound, Count, __functionAddress);
    }

    // --- [ LLVMDIBuilderGetOrCreateArray ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderGetOrCreateArray(LLVMDIBuilderRef Builder, LLVMMetadataRef * Data, size_t NumElements)} */
    public static long nLLVMDIBuilderGetOrCreateArray(long Builder, long Data, long NumElements) {
        long __functionAddress = Functions.DIBuilderGetOrCreateArray;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Data, NumElements, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderGetOrCreateArray(LLVMDIBuilderRef Builder, LLVMMetadataRef * Data, size_t NumElements)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderGetOrCreateArray(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef *") PointerBuffer Data) {
        return nLLVMDIBuilderGetOrCreateArray(Builder, memAddress(Data), Data.remaining());
    }

    // --- [ LLVMDIBuilderCreateExpression ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateExpression(LLVMDIBuilderRef Builder, uint64_t * Addr, size_t Length)} */
    public static long nLLVMDIBuilderCreateExpression(long Builder, long Addr, long Length) {
        long __functionAddress = Functions.DIBuilderCreateExpression;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Addr, Length, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateExpression(LLVMDIBuilderRef Builder, uint64_t * Addr, size_t Length)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateExpression(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("uint64_t *") LongBuffer Addr) {
        return nLLVMDIBuilderCreateExpression(Builder, memAddress(Addr), Addr.remaining());
    }

    // --- [ LLVMDIBuilderCreateConstantValueExpression ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateConstantValueExpression(LLVMDIBuilderRef Builder, uint64_t Value)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateConstantValueExpression(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("uint64_t") long Value) {
        long __functionAddress = Functions.DIBuilderCreateConstantValueExpression;
        if (CHECKS) {
            check(Builder);
        }
        return invokePJP(Builder, Value, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateGlobalVariableExpression ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateGlobalVariableExpression(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * Linkage, size_t LinkLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool LocalToUnit, LLVMMetadataRef Expr, LLVMMetadataRef Decl, uint32_t AlignInBits)} */
    public static long nLLVMDIBuilderCreateGlobalVariableExpression(long Builder, long Scope, long Name, long NameLen, long Linkage, long LinkLen, long File, int LineNo, long Ty, int LocalToUnit, long Expr, long Decl, int AlignInBits) {
        long __functionAddress = Functions.DIBuilderCreateGlobalVariableExpression;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Ty);
            check(Expr);
            check(Decl);
        }
        return invokePPPPPPPPPPP(Builder, Scope, Name, NameLen, Linkage, LinkLen, File, LineNo, Ty, LocalToUnit, Expr, Decl, AlignInBits, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateGlobalVariableExpression(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * Linkage, size_t LinkLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool LocalToUnit, LLVMMetadataRef Expr, LLVMMetadataRef Decl, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateGlobalVariableExpression(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer Linkage, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean LocalToUnit, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long Decl, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateGlobalVariableExpression(Builder, Scope, memAddress(Name), Name.remaining(), memAddress(Linkage), Linkage.remaining(), File, LineNo, Ty, LocalToUnit ? 1 : 0, Expr, Decl, AlignInBits);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateGlobalVariableExpression(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * Linkage, size_t LinkLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool LocalToUnit, LLVMMetadataRef Expr, LLVMMetadataRef Decl, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateGlobalVariableExpression(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("char const *") CharSequence Linkage, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean LocalToUnit, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long Decl, @NativeType("uint32_t") int AlignInBits) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int LinkageEncodedLength = stack.nUTF8(Linkage, false);
            long LinkageEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateGlobalVariableExpression(Builder, Scope, NameEncoded, NameEncodedLength, LinkageEncoded, LinkageEncodedLength, File, LineNo, Ty, LocalToUnit ? 1 : 0, Expr, Decl, AlignInBits);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetDINodeTag ] ---

    /** {@code uint16_t LLVMGetDINodeTag(LLVMMetadataRef MD)} */
    @NativeType("uint16_t")
    public static short LLVMGetDINodeTag(@NativeType("LLVMMetadataRef") long MD) {
        long __functionAddress = Functions.GetDINodeTag;
        if (CHECKS) {
            check(__functionAddress);
            check(MD);
        }
        return invokePC(MD, __functionAddress);
    }

    // --- [ LLVMDIGlobalVariableExpressionGetVariable ] ---

    /** {@code LLVMMetadataRef LLVMDIGlobalVariableExpressionGetVariable(LLVMMetadataRef GVE)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIGlobalVariableExpressionGetVariable(@NativeType("LLVMMetadataRef") long GVE) {
        long __functionAddress = Functions.DIGlobalVariableExpressionGetVariable;
        if (CHECKS) {
            check(__functionAddress);
            check(GVE);
        }
        return invokePP(GVE, __functionAddress);
    }

    // --- [ LLVMDIGlobalVariableExpressionGetExpression ] ---

    /** {@code LLVMMetadataRef LLVMDIGlobalVariableExpressionGetExpression(LLVMMetadataRef GVE)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIGlobalVariableExpressionGetExpression(@NativeType("LLVMMetadataRef") long GVE) {
        long __functionAddress = Functions.DIGlobalVariableExpressionGetExpression;
        if (CHECKS) {
            check(__functionAddress);
            check(GVE);
        }
        return invokePP(GVE, __functionAddress);
    }

    // --- [ LLVMDIVariableGetFile ] ---

    /** {@code LLVMMetadataRef LLVMDIVariableGetFile(LLVMMetadataRef Var)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIVariableGetFile(@NativeType("LLVMMetadataRef") long Var) {
        long __functionAddress = Functions.DIVariableGetFile;
        if (CHECKS) {
            check(__functionAddress);
            check(Var);
        }
        return invokePP(Var, __functionAddress);
    }

    // --- [ LLVMDIVariableGetScope ] ---

    /** {@code LLVMMetadataRef LLVMDIVariableGetScope(LLVMMetadataRef Var)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIVariableGetScope(@NativeType("LLVMMetadataRef") long Var) {
        long __functionAddress = Functions.DIVariableGetScope;
        if (CHECKS) {
            check(__functionAddress);
            check(Var);
        }
        return invokePP(Var, __functionAddress);
    }

    // --- [ LLVMDIVariableGetLine ] ---

    /** {@code unsigned LLVMDIVariableGetLine(LLVMMetadataRef Var)} */
    @NativeType("unsigned")
    public static int LLVMDIVariableGetLine(@NativeType("LLVMMetadataRef") long Var) {
        long __functionAddress = Functions.DIVariableGetLine;
        if (CHECKS) {
            check(__functionAddress);
            check(Var);
        }
        return invokePI(Var, __functionAddress);
    }

    // --- [ LLVMTemporaryMDNode ] ---

    /** {@code LLVMMetadataRef LLVMTemporaryMDNode(LLVMContextRef Ctx, LLVMMetadataRef * Data, size_t NumElements)} */
    public static long nLLVMTemporaryMDNode(long Ctx, long Data, long NumElements) {
        long __functionAddress = Functions.TemporaryMDNode;
        if (CHECKS) {
            check(Ctx);
        }
        return invokePPPP(Ctx, Data, NumElements, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMTemporaryMDNode(LLVMContextRef Ctx, LLVMMetadataRef * Data, size_t NumElements)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMTemporaryMDNode(@NativeType("LLVMContextRef") long Ctx, @NativeType("LLVMMetadataRef *") PointerBuffer Data) {
        return nLLVMTemporaryMDNode(Ctx, memAddress(Data), Data.remaining());
    }

    // --- [ LLVMDisposeTemporaryMDNode ] ---

    /** {@code void LLVMDisposeTemporaryMDNode(LLVMMetadataRef TempNode)} */
    public static void LLVMDisposeTemporaryMDNode(@NativeType("LLVMMetadataRef") long TempNode) {
        long __functionAddress = Functions.DisposeTemporaryMDNode;
        if (CHECKS) {
            check(TempNode);
        }
        invokePV(TempNode, __functionAddress);
    }

    // --- [ LLVMMetadataReplaceAllUsesWith ] ---

    /** {@code void LLVMMetadataReplaceAllUsesWith(LLVMMetadataRef TempTargetMetadata, LLVMMetadataRef Replacement)} */
    public static void LLVMMetadataReplaceAllUsesWith(@NativeType("LLVMMetadataRef") long TempTargetMetadata, @NativeType("LLVMMetadataRef") long Replacement) {
        long __functionAddress = Functions.MetadataReplaceAllUsesWith;
        if (CHECKS) {
            check(TempTargetMetadata);
            check(Replacement);
        }
        invokePPV(TempTargetMetadata, Replacement, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateTempGlobalVariableFwdDecl ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateTempGlobalVariableFwdDecl(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * Linkage, size_t LnkLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool LocalToUnit, LLVMMetadataRef Decl, uint32_t AlignInBits)} */
    public static long nLLVMDIBuilderCreateTempGlobalVariableFwdDecl(long Builder, long Scope, long Name, long NameLen, long Linkage, long LnkLen, long File, int LineNo, long Ty, int LocalToUnit, long Decl, int AlignInBits) {
        long __functionAddress = Functions.DIBuilderCreateTempGlobalVariableFwdDecl;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Ty);
            check(Decl);
        }
        return invokePPPPPPPPPP(Builder, Scope, Name, NameLen, Linkage, LnkLen, File, LineNo, Ty, LocalToUnit, Decl, AlignInBits, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateTempGlobalVariableFwdDecl(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * Linkage, size_t LnkLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool LocalToUnit, LLVMMetadataRef Decl, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateTempGlobalVariableFwdDecl(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer Linkage, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean LocalToUnit, @NativeType("LLVMMetadataRef") long Decl, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateTempGlobalVariableFwdDecl(Builder, Scope, memAddress(Name), Name.remaining(), memAddress(Linkage), Linkage.remaining(), File, LineNo, Ty, LocalToUnit ? 1 : 0, Decl, AlignInBits);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateTempGlobalVariableFwdDecl(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, char const * Linkage, size_t LnkLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool LocalToUnit, LLVMMetadataRef Decl, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateTempGlobalVariableFwdDecl(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("char const *") CharSequence Linkage, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean LocalToUnit, @NativeType("LLVMMetadataRef") long Decl, @NativeType("uint32_t") int AlignInBits) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            int LinkageEncodedLength = stack.nUTF8(Linkage, false);
            long LinkageEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateTempGlobalVariableFwdDecl(Builder, Scope, NameEncoded, NameEncodedLength, LinkageEncoded, LinkageEncodedLength, File, LineNo, Ty, LocalToUnit ? 1 : 0, Decl, AlignInBits);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderInsertDeclareBefore ] ---

    /** {@code LLVMValueRef LLVMDIBuilderInsertDeclareBefore(LLVMDIBuilderRef Builder, LLVMValueRef Storage, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMValueRef Instr)} */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDeclareBefore(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Storage, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.DIBuilderInsertDeclareBefore;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Storage);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Instr);
        }
        return invokePPPPPPP(Builder, Storage, VarInfo, Expr, DebugLoc, Instr, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertDeclareAtEnd ] ---

    /** {@code LLVMValueRef LLVMDIBuilderInsertDeclareAtEnd(LLVMDIBuilderRef Builder, LLVMValueRef Storage, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMBasicBlockRef Block)} */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDeclareAtEnd(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Storage, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.DIBuilderInsertDeclareAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Storage);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Block);
        }
        return invokePPPPPPP(Builder, Storage, VarInfo, Expr, DebugLoc, Block, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertDbgValueBefore ] ---

    /** {@code LLVMValueRef LLVMDIBuilderInsertDbgValueBefore(LLVMDIBuilderRef Builder, LLVMValueRef Val, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMValueRef Instr)} */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDbgValueBefore(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.DIBuilderInsertDbgValueBefore;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Val);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Instr);
        }
        return invokePPPPPPP(Builder, Val, VarInfo, Expr, DebugLoc, Instr, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertDbgValueAtEnd ] ---

    /** {@code LLVMValueRef LLVMDIBuilderInsertDbgValueAtEnd(LLVMDIBuilderRef Builder, LLVMValueRef Val, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMBasicBlockRef Block)} */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDbgValueAtEnd(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.DIBuilderInsertDbgValueAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Val);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Block);
        }
        return invokePPPPPPP(Builder, Val, VarInfo, Expr, DebugLoc, Block, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertDeclareRecordBefore ] ---

    /** {@code LLVMDbgRecordRef LLVMDIBuilderInsertDeclareRecordBefore(LLVMDIBuilderRef Builder, LLVMValueRef Storage, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMValueRef Instr)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMDIBuilderInsertDeclareRecordBefore(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Storage, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.DIBuilderInsertDeclareRecordBefore;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Storage);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Instr);
        }
        return invokePPPPPPP(Builder, Storage, VarInfo, Expr, DebugLoc, Instr, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertDeclareRecordAtEnd ] ---

    /** {@code LLVMDbgRecordRef LLVMDIBuilderInsertDeclareRecordAtEnd(LLVMDIBuilderRef Builder, LLVMValueRef Storage, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMBasicBlockRef Block)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMDIBuilderInsertDeclareRecordAtEnd(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Storage, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.DIBuilderInsertDeclareRecordAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Storage);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Block);
        }
        return invokePPPPPPP(Builder, Storage, VarInfo, Expr, DebugLoc, Block, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertDbgValueRecordBefore ] ---

    /** {@code LLVMDbgRecordRef LLVMDIBuilderInsertDbgValueRecordBefore(LLVMDIBuilderRef Builder, LLVMValueRef Val, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMValueRef Instr)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMDIBuilderInsertDbgValueRecordBefore(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.DIBuilderInsertDbgValueRecordBefore;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Val);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Instr);
        }
        return invokePPPPPPP(Builder, Val, VarInfo, Expr, DebugLoc, Instr, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertDbgValueRecordAtEnd ] ---

    /** {@code LLVMDbgRecordRef LLVMDIBuilderInsertDbgValueRecordAtEnd(LLVMDIBuilderRef Builder, LLVMValueRef Val, LLVMMetadataRef VarInfo, LLVMMetadataRef Expr, LLVMMetadataRef DebugLoc, LLVMBasicBlockRef Block)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMDIBuilderInsertDbgValueRecordAtEnd(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.DIBuilderInsertDbgValueRecordAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Val);
            check(VarInfo);
            check(Expr);
            check(DebugLoc);
            check(Block);
        }
        return invokePPPPPPP(Builder, Val, VarInfo, Expr, DebugLoc, Block, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateAutoVariable ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateAutoVariable(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool AlwaysPreserve, LLVMDIFlags Flags, uint32_t AlignInBits)} */
    public static long nLLVMDIBuilderCreateAutoVariable(long Builder, long Scope, long Name, long NameLen, long File, int LineNo, long Ty, int AlwaysPreserve, int Flags, int AlignInBits) {
        long __functionAddress = Functions.DIBuilderCreateAutoVariable;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Ty);
        }
        return invokePPPPPPP(Builder, Scope, Name, NameLen, File, LineNo, Ty, AlwaysPreserve, Flags, AlignInBits, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateAutoVariable(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool AlwaysPreserve, LLVMDIFlags Flags, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateAutoVariable(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean AlwaysPreserve, @NativeType("LLVMDIFlags") int Flags, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateAutoVariable(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNo, Ty, AlwaysPreserve ? 1 : 0, Flags, AlignInBits);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateAutoVariable(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool AlwaysPreserve, LLVMDIFlags Flags, uint32_t AlignInBits)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateAutoVariable(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean AlwaysPreserve, @NativeType("LLVMDIFlags") int Flags, @NativeType("uint32_t") int AlignInBits) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateAutoVariable(Builder, Scope, NameEncoded, NameEncodedLength, File, LineNo, Ty, AlwaysPreserve ? 1 : 0, Flags, AlignInBits);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateParameterVariable ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateParameterVariable(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, unsigned int ArgNo, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool AlwaysPreserve, LLVMDIFlags Flags)} */
    public static long nLLVMDIBuilderCreateParameterVariable(long Builder, long Scope, long Name, long NameLen, int ArgNo, long File, int LineNo, long Ty, int AlwaysPreserve, int Flags) {
        long __functionAddress = Functions.DIBuilderCreateParameterVariable;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
            check(Ty);
        }
        return invokePPPPPPP(Builder, Scope, Name, NameLen, ArgNo, File, LineNo, Ty, AlwaysPreserve, Flags, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateParameterVariable(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, unsigned int ArgNo, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool AlwaysPreserve, LLVMDIFlags Flags)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateParameterVariable(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("unsigned int") int ArgNo, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean AlwaysPreserve, @NativeType("LLVMDIFlags") int Flags) {
        return nLLVMDIBuilderCreateParameterVariable(Builder, Scope, memAddress(Name), Name.remaining(), ArgNo, File, LineNo, Ty, AlwaysPreserve ? 1 : 0, Flags);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateParameterVariable(LLVMDIBuilderRef Builder, LLVMMetadataRef Scope, char const * Name, size_t NameLen, unsigned int ArgNo, LLVMMetadataRef File, unsigned int LineNo, LLVMMetadataRef Ty, LLVMBool AlwaysPreserve, LLVMDIFlags Flags)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateParameterVariable(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") CharSequence Name, @NativeType("unsigned int") int ArgNo, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean AlwaysPreserve, @NativeType("LLVMDIFlags") int Flags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateParameterVariable(Builder, Scope, NameEncoded, NameEncodedLength, ArgNo, File, LineNo, Ty, AlwaysPreserve ? 1 : 0, Flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetSubprogram ] ---

    /** {@code LLVMMetadataRef LLVMGetSubprogram(LLVMValueRef Func)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMGetSubprogram(@NativeType("LLVMValueRef") long Func) {
        long __functionAddress = Functions.GetSubprogram;
        if (CHECKS) {
            check(Func);
        }
        return invokePP(Func, __functionAddress);
    }

    // --- [ LLVMSetSubprogram ] ---

    /** {@code void LLVMSetSubprogram(LLVMValueRef Func, LLVMMetadataRef SP)} */
    public static void LLVMSetSubprogram(@NativeType("LLVMValueRef") long Func, @NativeType("LLVMMetadataRef") long SP) {
        long __functionAddress = Functions.SetSubprogram;
        if (CHECKS) {
            check(Func);
            check(SP);
        }
        invokePPV(Func, SP, __functionAddress);
    }

    // --- [ LLVMDISubprogramGetLine ] ---

    /** {@code unsigned LLVMDISubprogramGetLine(LLVMMetadataRef Subprogram)} */
    @NativeType("unsigned")
    public static int LLVMDISubprogramGetLine(@NativeType("LLVMMetadataRef") long Subprogram) {
        long __functionAddress = Functions.DISubprogramGetLine;
        if (CHECKS) {
            check(__functionAddress);
            check(Subprogram);
        }
        return invokePI(Subprogram, __functionAddress);
    }

    // --- [ LLVMInstructionGetDebugLoc ] ---

    /** {@code unsigned LLVMInstructionGetDebugLoc(LLVMValueRef Inst)} */
    @NativeType("unsigned")
    public static int LLVMInstructionGetDebugLoc(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.InstructionGetDebugLoc;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        return invokePI(Inst, __functionAddress);
    }

    // --- [ LLVMInstructionSetDebugLoc ] ---

    /** {@code void LLVMInstructionSetDebugLoc(LLVMValueRef Inst, LLVMMetadataRef Loc)} */
    public static void LLVMInstructionSetDebugLoc(@NativeType("LLVMValueRef") long Inst, @NativeType("LLVMMetadataRef") long Loc) {
        long __functionAddress = Functions.InstructionSetDebugLoc;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        invokePPV(Inst, Loc, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateLabel ] ---

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateLabel(LLVMDIBuilderRef Builder, LLVMMetadataRef Context, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned LineNo, LLVMBool AlwaysPreserve)} */
    public static long nLLVMDIBuilderCreateLabel(long Builder, long Context, long Name, long NameLen, long File, int LineNo, int AlwaysPreserve) {
        long __functionAddress = Functions.DIBuilderCreateLabel;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Context);
            check(File);
        }
        return invokePPPPPP(Builder, Context, Name, NameLen, File, LineNo, AlwaysPreserve, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateLabel(LLVMDIBuilderRef Builder, LLVMMetadataRef Context, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned LineNo, LLVMBool AlwaysPreserve)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateLabel(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Context, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned") int LineNo, @NativeType("LLVMBool") boolean AlwaysPreserve) {
        return nLLVMDIBuilderCreateLabel(Builder, Context, memAddress(Name), Name.remaining(), File, LineNo, AlwaysPreserve ? 1 : 0);
    }

    /** {@code LLVMMetadataRef LLVMDIBuilderCreateLabel(LLVMDIBuilderRef Builder, LLVMMetadataRef Context, char const * Name, size_t NameLen, LLVMMetadataRef File, unsigned LineNo, LLVMBool AlwaysPreserve)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateLabel(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Context, @NativeType("char const *") CharSequence Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned") int LineNo, @NativeType("LLVMBool") boolean AlwaysPreserve) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateLabel(Builder, Context, NameEncoded, NameEncodedLength, File, LineNo, AlwaysPreserve ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderInsertLabelBefore ] ---

    /** {@code LLVMDbgRecordRef LLVMDIBuilderInsertLabelBefore(LLVMDIBuilderRef Builder, LLVMMetadataRef LabelInfo, LLVMMetadataRef Location, LLVMValueRef InsertBefore)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMDIBuilderInsertLabelBefore(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long LabelInfo, @NativeType("LLVMMetadataRef") long Location, @NativeType("LLVMValueRef") long InsertBefore) {
        long __functionAddress = Functions.DIBuilderInsertLabelBefore;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(LabelInfo);
            check(Location);
            check(InsertBefore);
        }
        return invokePPPPP(Builder, LabelInfo, Location, InsertBefore, __functionAddress);
    }

    // --- [ LLVMDIBuilderInsertLabelAtEnd ] ---

    /** {@code LLVMDbgRecordRef LLVMDIBuilderInsertLabelAtEnd(LLVMDIBuilderRef Builder, LLVMMetadataRef LabelInfo, LLVMMetadataRef Location, LLVMBasicBlockRef InsertAtEnd)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMDIBuilderInsertLabelAtEnd(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long LabelInfo, @NativeType("LLVMMetadataRef") long Location, @NativeType("LLVMBasicBlockRef") long InsertAtEnd) {
        long __functionAddress = Functions.DIBuilderInsertLabelAtEnd;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(LabelInfo);
            check(Location);
            check(InsertAtEnd);
        }
        return invokePPPPP(Builder, LabelInfo, Location, InsertAtEnd, __functionAddress);
    }

    // --- [ LLVMGetMetadataKind ] ---

    /** {@code LLVMMetadataKind LLVMGetMetadataKind(LLVMMetadataRef Metadata)} */
    @NativeType("LLVMMetadataKind")
    public static int LLVMGetMetadataKind(@NativeType("LLVMMetadataRef") long Metadata) {
        long __functionAddress = Functions.GetMetadataKind;
        if (CHECKS) {
            check(__functionAddress);
            check(Metadata);
        }
        return invokePI(Metadata, __functionAddress);
    }

}