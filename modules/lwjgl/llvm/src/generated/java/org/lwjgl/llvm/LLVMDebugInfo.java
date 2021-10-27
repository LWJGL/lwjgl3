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
            DILocationGetInlinedAt                     = LLVMCore.getLibrary().getFunctionAddress("LLVMDILocationGetInlinedAt"),
            DIScopeGetFile                             = LLVMCore.getLibrary().getFunctionAddress("LLVMDIScopeGetFile"),
            DIFileGetDirectory                         = LLVMCore.getLibrary().getFunctionAddress("LLVMDIFileGetDirectory"),
            DIFileGetFilename                          = LLVMCore.getLibrary().getFunctionAddress("LLVMDIFileGetFilename"),
            DIFileGetSource                            = LLVMCore.getLibrary().getFunctionAddress("LLVMDIFileGetSource"),
            DIBuilderGetOrCreateTypeArray              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderGetOrCreateTypeArray"),
            DIBuilderCreateSubroutineType              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateSubroutineType"),
            DIBuilderCreateMacro                       = LLVMCore.getLibrary().getFunctionAddress("LLVMDIBuilderCreateMacro"),
            DIBuilderCreateTempMacroFile               = LLVMCore.getLibrary().getFunctionAddress("LLVMDIBuilderCreateTempMacroFile"),
            DIBuilderCreateEnumerator                  = LLVMCore.getLibrary().getFunctionAddress("LLVMDIBuilderCreateEnumerator"),
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
            DIGlobalVariableExpressionGetVariable      = LLVMCore.getLibrary().getFunctionAddress("LLVMDIGlobalVariableExpressionGetVariable"),
            DIGlobalVariableExpressionGetExpression    = LLVMCore.getLibrary().getFunctionAddress("LLVMDIGlobalVariableExpressionGetExpression"),
            DIVariableGetFile                          = LLVMCore.getLibrary().getFunctionAddress("LLVMDIVariableGetFile"),
            DIVariableGetScope                         = LLVMCore.getLibrary().getFunctionAddress("LLVMDIVariableGetScope"),
            DIVariableGetLine                          = LLVMCore.getLibrary().getFunctionAddress("LLVMDIVariableGetLine"),
            TemporaryMDNode                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMTemporaryMDNode"),
            DisposeTemporaryMDNode                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDisposeTemporaryMDNode"),
            MetadataReplaceAllUsesWith                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMMetadataReplaceAllUsesWith"),
            DIBuilderCreateTempGlobalVariableFwdDecl   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateTempGlobalVariableFwdDecl"),
            DIBuilderInsertDeclareBefore               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDeclareBefore"),
            DIBuilderInsertDeclareAtEnd                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDeclareAtEnd"),
            DIBuilderInsertDbgValueBefore              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDbgValueBefore"),
            DIBuilderInsertDbgValueAtEnd               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderInsertDbgValueAtEnd"),
            DIBuilderCreateAutoVariable                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateAutoVariable"),
            DIBuilderCreateParameterVariable           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMDIBuilderCreateParameterVariable"),
            GetSubprogram                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMGetSubprogram"),
            SetSubprogram                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMSetSubprogram"),
            DISubprogramGetLine                        = LLVMCore.getLibrary().getFunctionAddress("LLVMDISubprogramGetLine"),
            InstructionGetDebugLoc                     = LLVMCore.getLibrary().getFunctionAddress("LLVMInstructionGetDebugLoc"),
            InstructionSetDebugLoc                     = LLVMCore.getLibrary().getFunctionAddress("LLVMInstructionSetDebugLoc"),
            GetMetadataKind                            = LLVMCore.getLibrary().getFunctionAddress("LLVMGetMetadataKind");

    }

    /**
     * Debug info flags.
     * 
     * <p>({@code LLVMDIFlags})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMDIFlagZero DIFlagZero}</li>
     * <li>{@link #LLVMDIFlagPrivate DIFlagPrivate}</li>
     * <li>{@link #LLVMDIFlagProtected DIFlagProtected}</li>
     * <li>{@link #LLVMDIFlagPublic DIFlagPublic}</li>
     * <li>{@link #LLVMDIFlagFwdDecl DIFlagFwdDecl}</li>
     * <li>{@link #LLVMDIFlagAppleBlock DIFlagAppleBlock}</li>
     * <li>{@link #LLVMDIFlagReservedBit4 DIFlagReservedBit4}</li>
     * <li>{@link #LLVMDIFlagVirtual DIFlagVirtual}</li>
     * <li>{@link #LLVMDIFlagArtificial DIFlagArtificial}</li>
     * <li>{@link #LLVMDIFlagExplicit DIFlagExplicit}</li>
     * <li>{@link #LLVMDIFlagPrototyped DIFlagPrototyped}</li>
     * <li>{@link #LLVMDIFlagObjcClassComplete DIFlagObjcClassComplete}</li>
     * <li>{@link #LLVMDIFlagObjectPointer DIFlagObjectPointer}</li>
     * <li>{@link #LLVMDIFlagVector DIFlagVector}</li>
     * <li>{@link #LLVMDIFlagStaticMember DIFlagStaticMember}</li>
     * <li>{@link #LLVMDIFlagLValueReference DIFlagLValueReference}</li>
     * <li>{@link #LLVMDIFlagRValueReference DIFlagRValueReference}</li>
     * <li>{@link #LLVMDIFlagReserved DIFlagReserved}</li>
     * <li>{@link #LLVMDIFlagSingleInheritance DIFlagSingleInheritance}</li>
     * <li>{@link #LLVMDIFlagMultipleInheritance DIFlagMultipleInheritance}</li>
     * <li>{@link #LLVMDIFlagVirtualInheritance DIFlagVirtualInheritance}</li>
     * <li>{@link #LLVMDIFlagIntroducedVirtual DIFlagIntroducedVirtual}</li>
     * <li>{@link #LLVMDIFlagBitField DIFlagBitField}</li>
     * <li>{@link #LLVMDIFlagNoReturn DIFlagNoReturn}</li>
     * <li>{@link #LLVMDIFlagTypePassByValue DIFlagTypePassByValue}</li>
     * <li>{@link #LLVMDIFlagTypePassByReference DIFlagTypePassByReference}</li>
     * <li>{@link #LLVMDIFlagEnumClass DIFlagEnumClass}</li>
     * <li>{@link #LLVMDIFlagFixedEnum DIFlagFixedEnum}</li>
     * <li>{@link #LLVMDIFlagThunk DIFlagThunk}</li>
     * <li>{@link #LLVMDIFlagNonTrivial DIFlagNonTrivial}</li>
     * <li>{@link #LLVMDIFlagBigEndian DIFlagBigEndian}</li>
     * <li>{@link #LLVMDIFlagLittleEndian DIFlagLittleEndian}</li>
     * <li>{@link #LLVMDIFlagIndirectVirtualBase DIFlagIndirectVirtualBase}</li>
     * <li>{@link #LLVMDIFlagAccessibility DIFlagAccessibility}</li>
     * <li>{@link #LLVMDIFlagPtrToMemberRep DIFlagPtrToMemberRep}</li>
     * </ul>
     */
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

    /**
     * Source languages known by DWARF.
     * 
     * <p>({@code LLVMDWARFSourceLanguage})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMDWARFSourceLanguageC89 DWARFSourceLanguageC89}</li>
     * <li>{@link #LLVMDWARFSourceLanguageC DWARFSourceLanguageC}</li>
     * <li>{@link #LLVMDWARFSourceLanguageAda83 DWARFSourceLanguageAda83}</li>
     * <li>{@link #LLVMDWARFSourceLanguageC_plus_plus DWARFSourceLanguageC_plus_plus}</li>
     * <li>{@link #LLVMDWARFSourceLanguageCobol74 DWARFSourceLanguageCobol74}</li>
     * <li>{@link #LLVMDWARFSourceLanguageCobol85 DWARFSourceLanguageCobol85}</li>
     * <li>{@link #LLVMDWARFSourceLanguageFortran77 DWARFSourceLanguageFortran77}</li>
     * <li>{@link #LLVMDWARFSourceLanguageFortran90 DWARFSourceLanguageFortran90}</li>
     * <li>{@link #LLVMDWARFSourceLanguagePascal83 DWARFSourceLanguagePascal83}</li>
     * <li>{@link #LLVMDWARFSourceLanguageModula2 DWARFSourceLanguageModula2}</li>
     * <li>{@link #LLVMDWARFSourceLanguageJava DWARFSourceLanguageJava} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguageC99 DWARFSourceLanguageC99} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguageAda95 DWARFSourceLanguageAda95} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguageFortran95 DWARFSourceLanguageFortran95} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguagePLI DWARFSourceLanguagePLI} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguageObjC DWARFSourceLanguageObjC} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguageObjC_plus_plus DWARFSourceLanguageObjC_plus_plus} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguageUPC DWARFSourceLanguageUPC} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguageD DWARFSourceLanguageD} - New in DWARF v3:</li>
     * <li>{@link #LLVMDWARFSourceLanguagePython DWARFSourceLanguagePython} - New in DWARF v4:</li>
     * <li>{@link #LLVMDWARFSourceLanguageOpenCL DWARFSourceLanguageOpenCL} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageGo DWARFSourceLanguageGo} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageModula3 DWARFSourceLanguageModula3} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageHaskell DWARFSourceLanguageHaskell} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageC_plus_plus_03 DWARFSourceLanguageC_plus_plus_03} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageC_plus_plus_11 DWARFSourceLanguageC_plus_plus_11} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageOCaml DWARFSourceLanguageOCaml} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageRust DWARFSourceLanguageRust} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageC11 DWARFSourceLanguageC11} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageSwift DWARFSourceLanguageSwift} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageJulia DWARFSourceLanguageJulia} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageDylan DWARFSourceLanguageDylan} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageC_plus_plus_14 DWARFSourceLanguageC_plus_plus_14} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageFortran03 DWARFSourceLanguageFortran03} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageFortran08 DWARFSourceLanguageFortran08} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageRenderScript DWARFSourceLanguageRenderScript} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageBLISS DWARFSourceLanguageBLISS} - New in DWARF v5:</li>
     * <li>{@link #LLVMDWARFSourceLanguageMips_Assembler DWARFSourceLanguageMips_Assembler} - Vendor extensions:</li>
     * <li>{@link #LLVMDWARFSourceLanguageGOOGLE_RenderScript DWARFSourceLanguageGOOGLE_RenderScript} - Vendor extensions:</li>
     * <li>{@link #LLVMDWARFSourceLanguageBORLAND_Delphi DWARFSourceLanguageBORLAND_Delphi} - Vendor extensions:</li>
     * </ul>
     */
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
        LLVMDWARFSourceLanguageMips_Assembler      = 37,
        LLVMDWARFSourceLanguageGOOGLE_RenderScript = 38,
        LLVMDWARFSourceLanguageBORLAND_Delphi      = 39;

    /**
     * The amount of debug information to emit.
     * 
     * <p>({@code LLVMDWARFEmissionKind})</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMDWARFEmissionNone DWARFEmissionNone}</li>
     * <li>{@link #LLVMDWARFEmissionFull DWARFEmissionFull}</li>
     * <li>{@link #LLVMDWARFEmissionLineTablesOnly DWARFEmissionLineTablesOnly}</li>
     * </ul>
     */
    public static final int
        LLVMDWARFEmissionNone           = 0,
        LLVMDWARFEmissionFull           = 1,
        LLVMDWARFEmissionLineTablesOnly = 2;

    /**
     * The kind of metadata nodes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMMDStringMetadataKind MDStringMetadataKind}</li>
     * <li>{@link #LLVMConstantAsMetadataMetadataKind ConstantAsMetadataMetadataKind}</li>
     * <li>{@link #LLVMLocalAsMetadataMetadataKind LocalAsMetadataMetadataKind}</li>
     * <li>{@link #LLVMDistinctMDOperandPlaceholderMetadataKind DistinctMDOperandPlaceholderMetadataKind}</li>
     * <li>{@link #LLVMMDTupleMetadataKind MDTupleMetadataKind}</li>
     * <li>{@link #LLVMDILocationMetadataKind DILocationMetadataKind}</li>
     * <li>{@link #LLVMDIExpressionMetadataKind DIExpressionMetadataKind}</li>
     * <li>{@link #LLVMDIGlobalVariableExpressionMetadataKind DIGlobalVariableExpressionMetadataKind}</li>
     * <li>{@link #LLVMGenericDINodeMetadataKind GenericDINodeMetadataKind}</li>
     * <li>{@link #LLVMDISubrangeMetadataKind DISubrangeMetadataKind}</li>
     * <li>{@link #LLVMDIEnumeratorMetadataKind DIEnumeratorMetadataKind}</li>
     * <li>{@link #LLVMDIBasicTypeMetadataKind DIBasicTypeMetadataKind}</li>
     * <li>{@link #LLVMDIDerivedTypeMetadataKind DIDerivedTypeMetadataKind}</li>
     * <li>{@link #LLVMDICompositeTypeMetadataKind DICompositeTypeMetadataKind}</li>
     * <li>{@link #LLVMDISubroutineTypeMetadataKind DISubroutineTypeMetadataKind}</li>
     * <li>{@link #LLVMDIFileMetadataKind DIFileMetadataKind}</li>
     * <li>{@link #LLVMDICompileUnitMetadataKind DICompileUnitMetadataKind}</li>
     * <li>{@link #LLVMDISubprogramMetadataKind DISubprogramMetadataKind}</li>
     * <li>{@link #LLVMDILexicalBlockMetadataKind DILexicalBlockMetadataKind}</li>
     * <li>{@link #LLVMDILexicalBlockFileMetadataKind DILexicalBlockFileMetadataKind}</li>
     * <li>{@link #LLVMDINamespaceMetadataKind DINamespaceMetadataKind}</li>
     * <li>{@link #LLVMDIModuleMetadataKind DIModuleMetadataKind}</li>
     * <li>{@link #LLVMDITemplateTypeParameterMetadataKind DITemplateTypeParameterMetadataKind}</li>
     * <li>{@link #LLVMDITemplateValueParameterMetadataKind DITemplateValueParameterMetadataKind}</li>
     * <li>{@link #LLVMDIGlobalVariableMetadataKind DIGlobalVariableMetadataKind}</li>
     * <li>{@link #LLVMDILocalVariableMetadataKind DILocalVariableMetadataKind}</li>
     * <li>{@link #LLVMDILabelMetadataKind DILabelMetadataKind}</li>
     * <li>{@link #LLVMDIObjCPropertyMetadataKind DIObjCPropertyMetadataKind}</li>
     * <li>{@link #LLVMDIImportedEntityMetadataKind DIImportedEntityMetadataKind}</li>
     * <li>{@link #LLVMDIMacroMetadataKind DIMacroMetadataKind}</li>
     * <li>{@link #LLVMDIMacroFileMetadataKind DIMacroFileMetadataKind}</li>
     * <li>{@link #LLVMDICommonBlockMetadataKind DICommonBlockMetadataKind}</li>
     * <li>{@link #LLVMDIStringTypeMetadataKind DIStringTypeMetadataKind}</li>
     * <li>{@link #LLVMDIGenericSubrangeMetadataKind DIGenericSubrangeMetadataKind}</li>
     * <li>{@link #LLVMDIArgListMetadataKind DIArgListMetadataKind}</li>
     * </ul>
     */
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
        LLVMDIArgListMetadataKind                    = 34;

    /**
     * Describes the kind of macro declaration used for {@code LLVMDIBuilderCreateMacro}. ({@code LLVMDWARFMacinfoRecordType})
     * 
     * <p>See {@code llvm::dwarf::MacinfoRecordType}.</p>
     * 
     * <p>Note: Values are from {@code DW_MACINFO_*} constants in the DWARF specification.</p>
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMDWARFMacinfoRecordTypeDefine DWARFMacinfoRecordTypeDefine}</li>
     * <li>{@link #LLVMDWARFMacinfoRecordTypeMacro DWARFMacinfoRecordTypeMacro}</li>
     * <li>{@link #LLVMDWARFMacinfoRecordTypeStartFile DWARFMacinfoRecordTypeStartFile}</li>
     * <li>{@link #LLVMDWARFMacinfoRecordTypeEndFile DWARFMacinfoRecordTypeEndFile}</li>
     * <li>{@link #LLVMDWARFMacinfoRecordTypeVendorExt DWARFMacinfoRecordTypeVendorExt}</li>
     * </ul>
     */
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

    /** The current debug metadata version number. */
    @NativeType("unsigned int")
    public static int LLVMDebugMetadataVersion() {
        long __functionAddress = Functions.DebugMetadataVersion;
        return invokeI(__functionAddress);
    }

    // --- [ LLVMGetModuleDebugMetadataVersion ] ---

    /** The version of debug metadata that's present in the provided {@code Module}. */
    @NativeType("unsigned int")
    public static int LLVMGetModuleDebugMetadataVersion(@NativeType("LLVMModuleRef") long Module) {
        long __functionAddress = Functions.GetModuleDebugMetadataVersion;
        if (CHECKS) {
            check(Module);
        }
        return invokePI(Module, __functionAddress);
    }

    // --- [ LLVMStripModuleDebugInfo ] ---

    /**
     * Strip debug info in the module if it exists. To do this, we remove all calls to the debugger intrinsics and any named metadata for debugging. We also
     * remove debug locations for instructions. Return true if module is modified.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMStripModuleDebugInfo(@NativeType("LLVMModuleRef") long Module) {
        long __functionAddress = Functions.StripModuleDebugInfo;
        if (CHECKS) {
            check(Module);
        }
        return invokePI(Module, __functionAddress) != 0;
    }

    // --- [ LLVMCreateDIBuilderDisallowUnresolved ] ---

    /** Construct a builder for a module, and do not allow for unresolved nodes attached to the module. */
    @NativeType("LLVMDIBuilderRef")
    public static long LLVMCreateDIBuilderDisallowUnresolved(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateDIBuilderDisallowUnresolved;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMCreateDIBuilder ] ---

    /**
     * Construct a builder for a module and collect unresolved nodes attached to the module in order to resolve cycles during a call to {@code
     * LLVMDIBuilderFinalize}.
     */
    @NativeType("LLVMDIBuilderRef")
    public static long LLVMCreateDIBuilder(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateDIBuilder;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMDisposeDIBuilder ] ---

    /**
     * Deallocates the {@code DIBuilder} and everything it owns.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>You must call {@code {@link #LLVMDIBuilderFinalize DIBuilderFinalize}} before this</p></div>
     */
    public static void LLVMDisposeDIBuilder(@NativeType("LLVMDIBuilderRef") long Builder) {
        long __functionAddress = Functions.DisposeDIBuilder;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMDIBuilderFinalize ] ---

    /** Construct any deferred debug info descriptors. */
    public static void LLVMDIBuilderFinalize(@NativeType("LLVMDIBuilderRef") long Builder) {
        long __functionAddress = Functions.DIBuilderFinalize;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateCompileUnit ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateCompileUnit DIBuilderCreateCompileUnit}
     *
     * @param ProducerLen  the length of the C string passed to {@code Producer}
     * @param FlagsLen     the length of the C string passed to {@code Flags}
     * @param SplitNameLen the length of the C string passed to {@code SplitName}
     * @param SysRootLen   the length of the C string passed to {@code SysRoot}
     * @param SDKLen       the length of the C string passed to {@code SDK}
     */
    public static long nLLVMDIBuilderCreateCompileUnit(long Builder, int Lang, long FileRef, long Producer, long ProducerLen, int isOptimized, long Flags, long FlagsLen, int RuntimeVer, long SplitName, long SplitNameLen, int Kind, int DWOId, int SplitDebugInlining, int DebugInfoForProfiling, long SysRoot, long SysRootLen, long SDK, long SDKLen) {
        long __functionAddress = Functions.DIBuilderCreateCompileUnit;
        if (CHECKS) {
            check(Builder);
            check(FileRef);
        }
        return invokePPPPPPPPPPPPP(Builder, Lang, FileRef, Producer, ProducerLen, isOptimized, Flags, FlagsLen, RuntimeVer, SplitName, SplitNameLen, Kind, DWOId, SplitDebugInlining, DebugInfoForProfiling, SysRoot, SysRootLen, SDK, SDKLen, __functionAddress);
    }

    /**
     * A {@code CompileUnit} provides an anchor for all debugging information generated during this instance of compilation.
     *
     * @param Lang                  source programming language, eg. {@code LLVMDWARFSourceLanguageC99}
     * @param FileRef               file info
     * @param Producer              identify the producer of debugging information and code.  Usually this is a compiler version string.
     * @param isOptimized           a boolean flag which indicates whether optimization is enabled or not
     * @param Flags                 this string lists command line options. This string is directly embedded in debug info output which may be used by a tool analyzing generated
     *                              debugging information.
     * @param RuntimeVer            this indicates runtime version for languages like Objective-C
     * @param SplitName             the name of the file that we'll split debug info out into
     * @param Kind                  the kind of debug information to generate
     * @param DWOId                 the DWOId if this is a split skeleton compile unit
     * @param SplitDebugInlining    whether to emit inline debug info
     * @param DebugInfoForProfiling whether to emit extra debug info for profile collection
     * @param SysRoot               the Clang system root (value of {@code -isysroot})
     * @param SDK                   the SDK. On Darwin, the last component of the {@code sysroot}.
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateCompileUnit(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMDWARFSourceLanguage") int Lang, @NativeType("LLVMMetadataRef") long FileRef, @NativeType("char const *") ByteBuffer Producer, @NativeType("LLVMBool") boolean isOptimized, @NativeType("char const *") ByteBuffer Flags, @NativeType("unsigned int") int RuntimeVer, @NativeType("char const *") ByteBuffer SplitName, @NativeType("LLVMDWARFEmissionKind") int Kind, @NativeType("unsigned int") int DWOId, @NativeType("LLVMBool") boolean SplitDebugInlining, @NativeType("LLVMBool") boolean DebugInfoForProfiling, @NativeType("char const *") ByteBuffer SysRoot, @NativeType("char const *") ByteBuffer SDK) {
        return nLLVMDIBuilderCreateCompileUnit(Builder, Lang, FileRef, memAddress(Producer), Producer.remaining(), isOptimized ? 1 : 0, memAddress(Flags), Flags.remaining(), RuntimeVer, memAddress(SplitName), SplitName.remaining(), Kind, DWOId, SplitDebugInlining ? 1 : 0, DebugInfoForProfiling ? 1 : 0, memAddress(SysRoot), SysRoot.remaining(), memAddress(SDK), SDK.remaining());
    }

    /**
     * A {@code CompileUnit} provides an anchor for all debugging information generated during this instance of compilation.
     *
     * @param Lang                  source programming language, eg. {@code LLVMDWARFSourceLanguageC99}
     * @param FileRef               file info
     * @param Producer              identify the producer of debugging information and code.  Usually this is a compiler version string.
     * @param isOptimized           a boolean flag which indicates whether optimization is enabled or not
     * @param Flags                 this string lists command line options. This string is directly embedded in debug info output which may be used by a tool analyzing generated
     *                              debugging information.
     * @param RuntimeVer            this indicates runtime version for languages like Objective-C
     * @param SplitName             the name of the file that we'll split debug info out into
     * @param Kind                  the kind of debug information to generate
     * @param DWOId                 the DWOId if this is a split skeleton compile unit
     * @param SplitDebugInlining    whether to emit inline debug info
     * @param DebugInfoForProfiling whether to emit extra debug info for profile collection
     * @param SysRoot               the Clang system root (value of {@code -isysroot})
     * @param SDK                   the SDK. On Darwin, the last component of the {@code sysroot}.
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateFile DIBuilderCreateFile}
     *
     * @param FilenameLen  the length of the C string passed to {@code Filename}
     * @param DirectoryLen the length of the C string passed to {@code Directory}
     */
    public static long nLLVMDIBuilderCreateFile(long Builder, long Filename, long FilenameLen, long Directory, long DirectoryLen) {
        long __functionAddress = Functions.DIBuilderCreateFile;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPPPP(Builder, Filename, FilenameLen, Directory, DirectoryLen, __functionAddress);
    }

    /**
     * Create a file descriptor to hold debugging information for a file.
     *
     * @param Builder   the {@code DIBuilder}
     * @param Filename  file name
     * @param Directory directory
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateFile(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Filename, @NativeType("char const *") ByteBuffer Directory) {
        return nLLVMDIBuilderCreateFile(Builder, memAddress(Filename), Filename.remaining(), memAddress(Directory), Directory.remaining());
    }

    /**
     * Create a file descriptor to hold debugging information for a file.
     *
     * @param Builder   the {@code DIBuilder}
     * @param Filename  file name
     * @param Directory directory
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateModule DIBuilderCreateModule}
     *
     * @param NameLen         the length of the C string passed to {@code Name}
     * @param ConfigMacrosLen the length of the C string passed to {@code ConfigMacros}
     * @param IncludePathLen  the length of the C string passed to {@code IncludePath}
     * @param APINotesFileLen he length of the C string passed to {@code APINotestFile}
     */
    public static long nLLVMDIBuilderCreateModule(long Builder, long ParentScope, long Name, long NameLen, long ConfigMacros, long ConfigMacrosLen, long IncludePath, long IncludePathLen, long APINotesFile, long APINotesFileLen) {
        long __functionAddress = Functions.DIBuilderCreateModule;
        if (CHECKS) {
            check(Builder);
            check(ParentScope);
        }
        return invokePPPPPPPPPPP(Builder, ParentScope, Name, NameLen, ConfigMacros, ConfigMacrosLen, IncludePath, IncludePathLen, APINotesFile, APINotesFileLen, __functionAddress);
    }

    /**
     * Creates a new descriptor for a module with the specified parent scope.
     *
     * @param Builder      the {@code DIBuilder}
     * @param ParentScope  the parent scope containing this module declaration
     * @param Name         module name
     * @param ConfigMacros a space-separated shell-quoted list of {@code -D} macro definitions as they would appear on a command line
     * @param IncludePath  the path to the module map file
     * @param APINotesFile the path to an API notes file for the module
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateModule(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentScope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer ConfigMacros, @NativeType("char const *") ByteBuffer IncludePath, @NativeType("char const *") ByteBuffer APINotesFile) {
        return nLLVMDIBuilderCreateModule(Builder, ParentScope, memAddress(Name), Name.remaining(), memAddress(ConfigMacros), ConfigMacros.remaining(), memAddress(IncludePath), IncludePath.remaining(), memAddress(APINotesFile), APINotesFile.remaining());
    }

    /**
     * Creates a new descriptor for a module with the specified parent scope.
     *
     * @param Builder      the {@code DIBuilder}
     * @param ParentScope  the parent scope containing this module declaration
     * @param Name         module name
     * @param ConfigMacros a space-separated shell-quoted list of {@code -D} macro definitions as they would appear on a command line
     * @param IncludePath  the path to the module map file
     * @param APINotesFile the path to an API notes file for the module
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateNameSpace DIBuilderCreateNameSpace}
     *
     * @param NameLen the length of the C string passed to {@code Name}
     */
    public static long nLLVMDIBuilderCreateNameSpace(long Builder, long ParentScope, long Name, long NameLen, int ExportSymbols) {
        long __functionAddress = Functions.DIBuilderCreateNameSpace;
        if (CHECKS) {
            check(Builder);
            check(ParentScope);
        }
        return invokePPPPP(Builder, ParentScope, Name, NameLen, ExportSymbols, __functionAddress);
    }

    /**
     * Creates a new descriptor for a namespace with the specified parent scope.
     *
     * @param Builder       the {@code DIBuilder}
     * @param ParentScope   the parent scope containing this module declaration
     * @param Name          nameSpace name
     * @param ExportSymbols whether or not the namespace exports symbols, e.g. this is true of C++ inline namespaces.
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateNameSpace(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentScope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMBool") boolean ExportSymbols) {
        return nLLVMDIBuilderCreateNameSpace(Builder, ParentScope, memAddress(Name), Name.remaining(), ExportSymbols ? 1 : 0);
    }

    /**
     * Creates a new descriptor for a namespace with the specified parent scope.
     *
     * @param Builder       the {@code DIBuilder}
     * @param ParentScope   the parent scope containing this module declaration
     * @param Name          nameSpace name
     * @param ExportSymbols whether or not the namespace exports symbols, e.g. this is true of C++ inline namespaces.
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateFunction DIBuilderCreateFunction}
     *
     * @param NameLen        length of enumeration name
     * @param LinkageNameLen length of linkage name
     */
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

    /**
     * Create a new descriptor for the specified subprogram.
     *
     * @param Builder       the {@code DIBuilder}
     * @param Scope         function scope
     * @param Name          function name
     * @param LinkageName   mangled function name
     * @param File          file where this variable is defined
     * @param LineNo        line number
     * @param Ty            function type
     * @param IsLocalToUnit true if this function is not externally visible
     * @param IsDefinition  true if this is a function definition
     * @param ScopeLine     set to the beginning of the scope this starts
     * @param Flags         e.g.: {@code LLVMDIFlagLValueReference}. These flags are used to emit dwarf attributes.
     * @param IsOptimized   true if optimization is ON
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateFunction(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer LinkageName, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean IsLocalToUnit, @NativeType("LLVMBool") boolean IsDefinition, @NativeType("unsigned int") int ScopeLine, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMBool") boolean IsOptimized) {
        return nLLVMDIBuilderCreateFunction(Builder, Scope, memAddress(Name), Name.remaining(), memAddress(LinkageName), LinkageName.remaining(), File, LineNo, Ty, IsLocalToUnit ? 1 : 0, IsDefinition ? 1 : 0, ScopeLine, Flags, IsOptimized ? 1 : 0);
    }

    /**
     * Create a new descriptor for the specified subprogram.
     *
     * @param Builder       the {@code DIBuilder}
     * @param Scope         function scope
     * @param Name          function name
     * @param LinkageName   mangled function name
     * @param File          file where this variable is defined
     * @param LineNo        line number
     * @param Ty            function type
     * @param IsLocalToUnit true if this function is not externally visible
     * @param IsDefinition  true if this is a function definition
     * @param ScopeLine     set to the beginning of the scope this starts
     * @param Flags         e.g.: {@code LLVMDIFlagLValueReference}. These flags are used to emit dwarf attributes.
     * @param IsOptimized   true if optimization is ON
     */
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

    /**
     * Create a descriptor for a lexical block with the specified parent context.
     *
     * @param Builder the {@code DIBuilder}
     * @param Scope   parent lexical block
     * @param File    source file
     * @param Line    the line in the source file
     * @param Column  the column in the source file
     */
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

    /**
     * Create a descriptor for a lexical block with a new file attached.
     *
     * @param Builder       the {@code DIBuilder}
     * @param Scope         lexical block
     * @param File          source file
     * @param Discriminator DWARF path discriminator value
     */
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

    /**
     * Create a descriptor for an imported namespace. Suitable for e.g. C++ using declarations.
     *
     * @param Builder the {@code DIBuilder}
     * @param Scope   the scope this module is imported into
     * @param File    file where the declaration is located
     * @param Line    line number of the declaration
     */
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

    /**
     * Create a descriptor for an imported module that aliases another imported entity descriptor.
     *
     * @param Builder        the {@code DIBuilder}
     * @param Scope          the scope this module is imported into
     * @param ImportedEntity previous imported entity to alias
     * @param File           file where the declaration is located
     * @param Line           line number of the declaration
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedModuleFromAlias(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long ImportedEntity, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line) {
        long __functionAddress = Functions.DIBuilderCreateImportedModuleFromAlias;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(ImportedEntity);
            check(File);
        }
        return invokePPPPP(Builder, Scope, ImportedEntity, File, Line, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateImportedModuleFromModule ] ---

    /**
     * Create a descriptor for an imported module.
     *
     * @param Builder the {@code DIBuilder}
     * @param Scope   the scope this module is imported into
     * @param M       the module being imported here
     * @param File    file where the declaration is located
     * @param Line    line number of the declaration
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedModuleFromModule(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long M, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line) {
        long __functionAddress = Functions.DIBuilderCreateImportedModuleFromModule;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(M);
            check(File);
        }
        return invokePPPPP(Builder, Scope, M, File, Line, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateImportedDeclaration ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateImportedDeclaration DIBuilderCreateImportedDeclaration}
     *
     * @param NameLen the length of the C string passed to {@code Name}
     */
    public static long nLLVMDIBuilderCreateImportedDeclaration(long Builder, long Scope, long Decl, long File, int Line, long Name, long NameLen) {
        long __functionAddress = Functions.DIBuilderCreateImportedDeclaration;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(Decl);
            check(File);
        }
        return invokePPPPPPP(Builder, Scope, Decl, File, Line, Name, NameLen, __functionAddress);
    }

    /**
     * Create a descriptor for an imported function, type, or variable.  Suitable for e.g. FORTRAN-style USE declarations.
     *
     * @param Builder the DIBuilder
     * @param Scope   the scope this module is imported into
     * @param Decl    the declaration (or definition) of a function, type, or variable
     * @param File    file where the declaration is located
     * @param Line    line number of the declaration
     * @param Name    a name that uniquely identifies this imported declaration
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedDeclaration(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long Decl, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMDIBuilderCreateImportedDeclaration(Builder, Scope, Decl, File, Line, memAddress(Name), Name.remaining());
    }

    /**
     * Create a descriptor for an imported function, type, or variable.  Suitable for e.g. FORTRAN-style USE declarations.
     *
     * @param Builder the DIBuilder
     * @param Scope   the scope this module is imported into
     * @param Decl    the declaration (or definition) of a function, type, or variable
     * @param File    file where the declaration is located
     * @param Line    line number of the declaration
     * @param Name    a name that uniquely identifies this imported declaration
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateImportedDeclaration(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long Decl, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMDIBuilderCreateImportedDeclaration(Builder, Scope, Decl, File, Line, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDIBuilderCreateDebugLocation ] ---

    /**
     * Creates a new DebugLocation that describes a source location.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>If the item to which this location is attached cannot be attributed to a source line, pass 0 for the line and column.</p></div>
     *
     * @param Line      the line in the source file
     * @param Column    the column in the source file
     * @param Scope     the scope in which the location resides
     * @param InlinedAt the scope where this location was inlined, if at all. (optional).
     */
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

    /**
     * Get the line number of this debug location.
     *
     * @param Location the debug location
     */
    @NativeType("unsigned int")
    public static int LLVMDILocationGetLine(@NativeType("LLVMMetadataRef") long Location) {
        long __functionAddress = Functions.DILocationGetLine;
        if (CHECKS) {
            check(Location);
        }
        return invokePI(Location, __functionAddress);
    }

    // --- [ LLVMDILocationGetColumn ] ---

    /**
     * Get the column number of this debug location.
     *
     * @param Location the debug location
     */
    @NativeType("unsigned int")
    public static int LLVMDILocationGetColumn(@NativeType("LLVMMetadataRef") long Location) {
        long __functionAddress = Functions.DILocationGetColumn;
        if (CHECKS) {
            check(Location);
        }
        return invokePI(Location, __functionAddress);
    }

    // --- [ LLVMDILocationGetScope ] ---

    /**
     * Get the local scope associated with this debug location.
     *
     * @param Location the debug location
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDILocationGetScope(@NativeType("LLVMMetadataRef") long Location) {
        long __functionAddress = Functions.DILocationGetScope;
        if (CHECKS) {
            check(Location);
        }
        return invokePP(Location, __functionAddress);
    }

    // --- [ LLVMDILocationGetInlinedAt ] ---

    /**
     * Get the "inline at" location associated with this debug location.
     * 
     * <p>See {@code DILocation::getInlinedAt()}.</p>
     *
     * @param Location the debug location
     *
     * @since 9
     */
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

    /**
     * Get the metadata of the file associated with a given scope.
     * 
     * <p>See {@code DIScope::getFile()}.</p>
     *
     * @param Scope the scope object
     *
     * @since 9
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIFileGetDirectory DIFileGetDirectory}
     *
     * @param Len the length of the returned string
     */
    public static long nLLVMDIFileGetDirectory(long File, long Len) {
        long __functionAddress = Functions.DIFileGetDirectory;
        if (CHECKS) {
            check(__functionAddress);
            check(File);
        }
        return invokePPP(File, Len, __functionAddress);
    }

    /**
     * Get the directory of a given file.
     * 
     * <p>See {@code DIFile::getDirectory()}</p>
     *
     * @param File the file object
     *
     * @since 9
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMDIFileGetDirectory(@NativeType("LLVMMetadataRef") long File) {
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

    /**
     * Unsafe version of: {@link #LLVMDIFileGetFilename DIFileGetFilename}
     *
     * @param Len the length of the returned string
     */
    public static long nLLVMDIFileGetFilename(long File, long Len) {
        long __functionAddress = Functions.DIFileGetFilename;
        if (CHECKS) {
            check(__functionAddress);
            check(File);
        }
        return invokePPP(File, Len, __functionAddress);
    }

    /**
     * Get the name of a given file.
     * 
     * <p>See {@code DIFile::getFilename()}.</p>
     *
     * @param File the file object
     *
     * @since 9
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMDIFileGetFilename(@NativeType("LLVMMetadataRef") long File) {
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

    /**
     * Unsafe version of: {@link #LLVMDIFileGetSource DIFileGetSource}
     *
     * @param Len the length of the returned string
     */
    public static long nLLVMDIFileGetSource(long File, long Len) {
        long __functionAddress = Functions.DIFileGetSource;
        if (CHECKS) {
            check(__functionAddress);
            check(File);
        }
        return invokePPP(File, Len, __functionAddress);
    }

    /**
     * Get the source of a given file.
     * 
     * <p>See {@code DIFile::getSource()}.</p>
     *
     * @param File the file object
     *
     * @since 9
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMDIFileGetSource(@NativeType("LLVMMetadataRef") long File) {
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderGetOrCreateTypeArray DIBuilderGetOrCreateTypeArray}
     *
     * @param NumElements number of type elements
     */
    public static long nLLVMDIBuilderGetOrCreateTypeArray(long Builder, long Data, long NumElements) {
        long __functionAddress = Functions.DIBuilderGetOrCreateTypeArray;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Data, NumElements, __functionAddress);
    }

    /**
     * Create a type array.
     *
     * @param Builder the DIBuilder
     * @param Data    the type elements
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderGetOrCreateTypeArray(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef *") PointerBuffer Data) {
        return nLLVMDIBuilderGetOrCreateTypeArray(Builder, memAddress(Data), Data.remaining());
    }

    // --- [ LLVMDIBuilderCreateSubroutineType ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateSubroutineType DIBuilderCreateSubroutineType}
     *
     * @param NumParameterTypes the number of parameter types in {@code ParameterTypes}
     */
    public static long nLLVMDIBuilderCreateSubroutineType(long Builder, long File, long ParameterTypes, int NumParameterTypes, int Flags) {
        long __functionAddress = Functions.DIBuilderCreateSubroutineType;
        if (CHECKS) {
            check(Builder);
            check(File);
        }
        return invokePPPP(Builder, File, ParameterTypes, NumParameterTypes, Flags, __functionAddress);
    }

    /**
     * Create subroutine type.
     *
     * @param Builder        the DIBuilder
     * @param File           the file in which the subroutine resides
     * @param ParameterTypes an array of subroutine parameter types. This includes return type at 0th index.
     * @param Flags          e.g.: {@code LLVMDIFlagLValueReference}. These flags are used to emit dwarf attributes.
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateSubroutineType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long File, @NativeType("LLVMMetadataRef *") PointerBuffer ParameterTypes, @NativeType("LLVMDIFlags") int Flags) {
        return nLLVMDIBuilderCreateSubroutineType(Builder, File, memAddress(ParameterTypes), ParameterTypes.remaining(), Flags);
    }

    // --- [ LLVMDIBuilderCreateMacro ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateMacro DIBuilderCreateMacro}
     *
     * @param NameLen  macro name length
     * @param ValueLen macro value length
     */
    public static long nLLVMDIBuilderCreateMacro(long Builder, long ParentMacroFile, int Line, int RecordType, long Name, long NameLen, long Value, long ValueLen) {
        long __functionAddress = Functions.DIBuilderCreateMacro;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        return invokePPPPPPP(Builder, ParentMacroFile, Line, RecordType, Name, NameLen, Value, ValueLen, __functionAddress);
    }

    /**
     * Create debugging information entry for a macro.
     *
     * @param Builder         the {@code DIBuilder}
     * @param ParentMacroFile macro parent (could be {@code NULL}).
     * @param Line            source line number where the macro is defined
     * @param RecordType      {@code DW_MACINFO_define} or {@code DW_MACINFO_undef}
     * @param Name            macro name
     * @param Value           macro value
     *
     * @since 10
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateMacro(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long ParentMacroFile, @NativeType("unsigned") int Line, @NativeType("LLVMDWARFMacinfoRecordType") int RecordType, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer Value) {
        return nLLVMDIBuilderCreateMacro(Builder, ParentMacroFile, Line, RecordType, memAddress(Name), Name.remaining(), memAddress(Value), Value.remaining());
    }

    /**
     * Create debugging information entry for a macro.
     *
     * @param Builder         the {@code DIBuilder}
     * @param ParentMacroFile macro parent (could be {@code NULL}).
     * @param Line            source line number where the macro is defined
     * @param RecordType      {@code DW_MACINFO_define} or {@code DW_MACINFO_undef}
     * @param Name            macro name
     * @param Value           macro value
     *
     * @since 10
     */
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

    /**
     * Create debugging information temporary entry for a macro file.
     * 
     * <p>List of macro node direct children will be calculated by {@code DIBuilder}, using the {@code ParentMacroFile} relationship.</p>
     *
     * @param Builder         the DIBuilder
     * @param ParentMacroFile macro parent (could be {@code NULL})
     * @param Line            source line number where the macro file is included
     * @param File            file descriptor containing the name of the macro file
     *
     * @since 10
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateEnumerator DIBuilderCreateEnumerator}
     *
     * @param NameLen length of enumerator name
     */
    public static long nLLVMDIBuilderCreateEnumerator(long Builder, long Name, long NameLen, long Value, int IsUnsigned) {
        long __functionAddress = Functions.DIBuilderCreateEnumerator;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        return invokePPPJP(Builder, Name, NameLen, Value, IsUnsigned, __functionAddress);
    }

    /**
     * Create debugging information entry for an enumerator.
     *
     * @param Builder    the DIBuilder
     * @param Name       enumerator name
     * @param Value      enumerator value
     * @param IsUnsigned true if the value is unsigned
     *
     * @since 10
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateEnumerator(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("int64_t") long Value, @NativeType("LLVMBool") boolean IsUnsigned) {
        return nLLVMDIBuilderCreateEnumerator(Builder, memAddress(Name), Name.remaining(), Value, IsUnsigned ? 1 : 0);
    }

    // --- [ LLVMDIBuilderCreateEnumerationType ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateEnumerationType DIBuilderCreateEnumerationType}
     *
     * @param NameLen     length of enumeration name
     * @param NumElements number of enumeration elements
     */
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

    /**
     * Create debugging information entry for an enumeration.
     *
     * @param Builder     the DIBuilder
     * @param Scope       scope in which this enumeration is defined
     * @param Name        enumeration name
     * @param File        file where this member is defined
     * @param LineNumber  line number
     * @param SizeInBits  member size
     * @param AlignInBits member alignment
     * @param Elements    enumeration elements
     * @param ClassTy     underlying type of a C++11/ObjC fixed enum
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateEnumerationType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("LLVMMetadataRef") long ClassTy) {
        return nLLVMDIBuilderCreateEnumerationType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, memAddress(Elements), Elements.remaining(), ClassTy);
    }

    /**
     * Create debugging information entry for an enumeration.
     *
     * @param Builder     the DIBuilder
     * @param Scope       scope in which this enumeration is defined
     * @param Name        enumeration name
     * @param File        file where this member is defined
     * @param LineNumber  line number
     * @param SizeInBits  member size
     * @param AlignInBits member alignment
     * @param Elements    enumeration elements
     * @param ClassTy     underlying type of a C++11/ObjC fixed enum
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateUnionType DIBuilderCreateUnionType}
     *
     * @param NameLen     length of union name
     * @param NumElements number of union elements
     * @param UniqueIdLen length of unique identifier
     */
    public static long nLLVMDIBuilderCreateUnionType(long Builder, long Scope, long Name, long NameLen, long File, int LineNumber, long SizeInBits, int AlignInBits, int Flags, long Elements, int NumElements, int RunTimeLang, long UniqueId, long UniqueIdLen) {
        long __functionAddress = Functions.DIBuilderCreateUnionType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPPPJPPPP(Builder, Scope, Name, NameLen, File, LineNumber, SizeInBits, AlignInBits, Flags, Elements, NumElements, RunTimeLang, UniqueId, UniqueIdLen, __functionAddress);
    }

    /**
     * Create debugging information entry for a union.
     *
     * @param Builder     the DIBuilder
     * @param Scope       scope in which this union is defined
     * @param Name        union name
     * @param File        file where this member is defined
     * @param LineNumber  line number
     * @param SizeInBits  member size
     * @param AlignInBits member alignment
     * @param Flags       flags to encode member attribute, e.g. private
     * @param Elements    union elements
     * @param RunTimeLang optional parameter, Objective-C runtime version
     * @param UniqueId    a unique identifier for the union
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateUnionType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("unsigned int") int RunTimeLang, @NativeType("char const *") ByteBuffer UniqueId) {
        return nLLVMDIBuilderCreateUnionType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, Flags, memAddress(Elements), Elements.remaining(), RunTimeLang, memAddress(UniqueId), UniqueId.remaining());
    }

    /**
     * Create debugging information entry for a union.
     *
     * @param Builder     the DIBuilder
     * @param Scope       scope in which this union is defined
     * @param Name        union name
     * @param File        file where this member is defined
     * @param LineNumber  line number
     * @param SizeInBits  member size
     * @param AlignInBits member alignment
     * @param Flags       flags to encode member attribute, e.g. private
     * @param Elements    union elements
     * @param RunTimeLang optional parameter, Objective-C runtime version
     * @param UniqueId    a unique identifier for the union
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateArrayType DIBuilderCreateArrayType}
     *
     * @param NumSubscripts number of subscripts
     */
    public static long nLLVMDIBuilderCreateArrayType(long Builder, long Size, int AlignInBits, long Ty, long Subscripts, int NumSubscripts) {
        long __functionAddress = Functions.DIBuilderCreateArrayType;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePJPPP(Builder, Size, AlignInBits, Ty, Subscripts, NumSubscripts, __functionAddress);
    }

    /**
     * Create debugging information entry for an array.
     *
     * @param Builder     the DIBuilder
     * @param Size        array size
     * @param AlignInBits alignment
     * @param Ty          element type
     * @param Subscripts  subscripts
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateArrayType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("uint64_t") long Size, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef *") PointerBuffer Subscripts) {
        return nLLVMDIBuilderCreateArrayType(Builder, Size, AlignInBits, Ty, memAddress(Subscripts), Subscripts.remaining());
    }

    // --- [ LLVMDIBuilderCreateVectorType ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateVectorType DIBuilderCreateVectorType}
     *
     * @param NumSubscripts number of subscripts
     */
    public static long nLLVMDIBuilderCreateVectorType(long Builder, long Size, int AlignInBits, long Ty, long Subscripts, int NumSubscripts) {
        long __functionAddress = Functions.DIBuilderCreateVectorType;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePJPPP(Builder, Size, AlignInBits, Ty, Subscripts, NumSubscripts, __functionAddress);
    }

    /**
     * Create debugging information entry for a vector type.
     *
     * @param Builder     the DIBuilder
     * @param Size        vector size
     * @param AlignInBits alignment
     * @param Ty          element type
     * @param Subscripts  subscripts
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateVectorType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("uint64_t") long Size, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef *") PointerBuffer Subscripts) {
        return nLLVMDIBuilderCreateVectorType(Builder, Size, AlignInBits, Ty, memAddress(Subscripts), Subscripts.remaining());
    }

    // --- [ LLVMDIBuilderCreateUnspecifiedType ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateUnspecifiedType DIBuilderCreateUnspecifiedType}
     *
     * @param NameLen length of type name
     */
    public static long nLLVMDIBuilderCreateUnspecifiedType(long Builder, long Name, long NameLen) {
        long __functionAddress = Functions.DIBuilderCreateUnspecifiedType;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Name, NameLen, __functionAddress);
    }

    /**
     * Create a DWARF unspecified type.
     *
     * @param Builder the DIBuilder
     * @param Name    the unspecified type's name
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateUnspecifiedType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMDIBuilderCreateUnspecifiedType(Builder, memAddress(Name), Name.remaining());
    }

    /**
     * Create a DWARF unspecified type.
     *
     * @param Builder the DIBuilder
     * @param Name    the unspecified type's name
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateBasicType DIBuilderCreateBasicType}
     *
     * @param NameLen length of type name
     */
    public static long nLLVMDIBuilderCreateBasicType(long Builder, long Name, long NameLen, long SizeInBits, int Encoding, int Flags) {
        long __functionAddress = Functions.DIBuilderCreateBasicType;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPJP(Builder, Name, NameLen, SizeInBits, Encoding, Flags, __functionAddress);
    }

    /**
     * Create debugging information entry for a basic type.
     *
     * @param Builder    the DIBuilder
     * @param Name       type name
     * @param SizeInBits size of the type
     * @param Encoding   DWARF encoding code, e.g. {@code LLVMDWARFTypeEncoding_float}.
     * @param Flags      flags to encode optional attribute like endianity
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateBasicType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("uint64_t") long SizeInBits, @NativeType("LLVMDWARFTypeEncoding") int Encoding, @NativeType("LLVMDIFlags") int Flags) {
        return nLLVMDIBuilderCreateBasicType(Builder, memAddress(Name), Name.remaining(), SizeInBits, Encoding, Flags);
    }

    /**
     * Create debugging information entry for a basic type.
     *
     * @param Builder    the DIBuilder
     * @param Name       type name
     * @param SizeInBits size of the type
     * @param Encoding   DWARF encoding code, e.g. {@code LLVMDWARFTypeEncoding_float}.
     * @param Flags      flags to encode optional attribute like endianity
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreatePointerType DIBuilderCreatePointerType}
     *
     * @param NameLen length of pointer type name. (optional)
     */
    public static long nLLVMDIBuilderCreatePointerType(long Builder, long PointeeTy, long SizeInBits, int AlignInBits, int AddressSpace, long Name, long NameLen) {
        long __functionAddress = Functions.DIBuilderCreatePointerType;
        if (CHECKS) {
            check(Builder);
            check(PointeeTy);
        }
        return invokePPJPPP(Builder, PointeeTy, SizeInBits, AlignInBits, AddressSpace, Name, NameLen, __functionAddress);
    }

    /**
     * Create debugging information entry for a pointer.
     *
     * @param Builder      the DIBuilder
     * @param PointeeTy    type pointed by this pointer
     * @param SizeInBits   size
     * @param AlignInBits  alignment. (optional, pass 0 to ignore)
     * @param AddressSpace DWARF address space. (optional, pass 0 to ignore)
     * @param Name         pointer type name. (optional)
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreatePointerType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long PointeeTy, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("unsigned int") int AddressSpace, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMDIBuilderCreatePointerType(Builder, PointeeTy, SizeInBits, AlignInBits, AddressSpace, memAddress(Name), Name.remaining());
    }

    /**
     * Create debugging information entry for a pointer.
     *
     * @param Builder      the DIBuilder
     * @param PointeeTy    type pointed by this pointer
     * @param SizeInBits   size
     * @param AlignInBits  alignment. (optional, pass 0 to ignore)
     * @param AddressSpace DWARF address space. (optional, pass 0 to ignore)
     * @param Name         pointer type name. (optional)
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateStructType DIBuilderCreateStructType}
     *
     * @param NameLen     struct name length
     * @param NumElements number of struct elements
     * @param UniqueIdLen length of the unique identifier for the struct
     */
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

    /**
     * Create debugging information entry for a struct.
     *
     * @param Builder      the DIBuilder
     * @param Scope        scope in which this struct is defined
     * @param Name         struct name
     * @param File         file where this member is defined
     * @param LineNumber   line number
     * @param SizeInBits   member size
     * @param AlignInBits  member alignment
     * @param Flags        flags to encode member attribute, e.g. private
     * @param Elements     struct elements
     * @param RunTimeLang  optional parameter, Objective-C runtime version
     * @param VTableHolder the object containing the vtable for the struct
     * @param UniqueId     a unique identifier for the struct
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateStructType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long DerivedFrom, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("unsigned int") int RunTimeLang, @NativeType("LLVMMetadataRef") long VTableHolder, @NativeType("char const *") ByteBuffer UniqueId) {
        return nLLVMDIBuilderCreateStructType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, Flags, DerivedFrom, memAddress(Elements), Elements.remaining(), RunTimeLang, VTableHolder, memAddress(UniqueId), UniqueId.remaining());
    }

    /**
     * Create debugging information entry for a struct.
     *
     * @param Builder      the DIBuilder
     * @param Scope        scope in which this struct is defined
     * @param Name         struct name
     * @param File         file where this member is defined
     * @param LineNumber   line number
     * @param SizeInBits   member size
     * @param AlignInBits  member alignment
     * @param Flags        flags to encode member attribute, e.g. private
     * @param Elements     struct elements
     * @param RunTimeLang  optional parameter, Objective-C runtime version
     * @param VTableHolder the object containing the vtable for the struct
     * @param UniqueId     a unique identifier for the struct
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateMemberType DIBuilderCreateMemberType}
     *
     * @param NameLen length of member name
     */
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

    /**
     * Create debugging information entry for a member.
     *
     * @param Builder      the DIBuilder
     * @param Scope        member scope
     * @param Name         member name
     * @param File         file where this member is defined
     * @param LineNo       line number
     * @param SizeInBits   member size
     * @param AlignInBits  member alignment
     * @param OffsetInBits member offset
     * @param Flags        flags to encode member attribute, e.g. private
     * @param Ty           parent type
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Ty) {
        return nLLVMDIBuilderCreateMemberType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty);
    }

    /**
     * Create debugging information entry for a member.
     *
     * @param Builder      the DIBuilder
     * @param Scope        member scope
     * @param Name         member name
     * @param File         file where this member is defined
     * @param LineNo       line number
     * @param SizeInBits   member size
     * @param AlignInBits  member alignment
     * @param OffsetInBits member offset
     * @param Flags        flags to encode member attribute, e.g. private
     * @param Ty           parent type
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateStaticMemberType DIBuilderCreateStaticMemberType}
     *
     * @param NameLen length of member name
     */
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

    /**
     * Create debugging information entry for a C++ static data member.
     *
     * @param Builder     the DIBuilder
     * @param Scope       member scope
     * @param Name        member name
     * @param File        file where this member is declared
     * @param LineNumber  line number
     * @param Type        type of the static member
     * @param Flags       flags to encode member attribute, e.g. private.
     * @param ConstantVal const initializer of the member
     * @param AlignInBits member alignment
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateStaticMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("LLVMMetadataRef") long Type, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateStaticMemberType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, Type, Flags, ConstantVal, AlignInBits);
    }

    /**
     * Create debugging information entry for a C++ static data member.
     *
     * @param Builder     the DIBuilder
     * @param Scope       member scope
     * @param Name        member name
     * @param File        file where this member is declared
     * @param LineNumber  line number
     * @param Type        type of the static member
     * @param Flags       flags to encode member attribute, e.g. private.
     * @param ConstantVal const initializer of the member
     * @param AlignInBits member alignment
     */
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

    /**
     * Create debugging information entry for a pointer to member.
     *
     * @param Builder     the DIBuilder
     * @param PointeeType type pointed to by this pointer
     * @param ClassType   type for which this pointer points to members of
     * @param SizeInBits  size
     * @param AlignInBits alignment
     * @param Flags       flags
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateObjCIVar DIBuilderCreateObjCIVar}
     *
     * @param NameLen the length of the C string passed to {@code Name}
     */
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

    /**
     * Create debugging information entry for Objective-C instance variable.
     *
     * @param Builder      the DIBuilder
     * @param Name         member name
     * @param File         file where this member is defined
     * @param LineNo       line number
     * @param SizeInBits   member size
     * @param AlignInBits  member alignment
     * @param OffsetInBits member offset
     * @param Flags        flags to encode member attribute, e.g. private
     * @param Ty           parent type
     * @param PropertyNode property associated with this ivar
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjCIVar(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMMetadataRef") long PropertyNode) {
        return nLLVMDIBuilderCreateObjCIVar(Builder, memAddress(Name), Name.remaining(), File, LineNo, SizeInBits, AlignInBits, OffsetInBits, Flags, Ty, PropertyNode);
    }

    /**
     * Create debugging information entry for Objective-C instance variable.
     *
     * @param Builder      the DIBuilder
     * @param Name         member name
     * @param File         file where this member is defined
     * @param LineNo       line number
     * @param SizeInBits   member size
     * @param AlignInBits  member alignment
     * @param OffsetInBits member offset
     * @param Flags        flags to encode member attribute, e.g. private
     * @param Ty           parent type
     * @param PropertyNode property associated with this ivar
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateObjCProperty DIBuilderCreateObjCProperty}
     *
     * @param NameLen       the length of the C string passed to {@code Name}
     * @param GetterNameLen the length of the C string passed to {@code GetterName}
     * @param SetterNameLen the length of the C string passed to {@code SetterName}
     */
    public static long nLLVMDIBuilderCreateObjCProperty(long Builder, long Name, long NameLen, long File, int LineNo, long GetterName, long GetterNameLen, long SetterName, long SetterNameLen, int PropertyAttributes, long Ty) {
        long __functionAddress = Functions.DIBuilderCreateObjCProperty;
        if (CHECKS) {
            check(Builder);
            check(File);
            check(Ty);
        }
        return invokePPPPPPPPPP(Builder, Name, NameLen, File, LineNo, GetterName, GetterNameLen, SetterName, SetterNameLen, PropertyAttributes, Ty, __functionAddress);
    }

    /**
     * Create debugging information entry for Objective-C property.
     *
     * @param Builder            the DIBuilder
     * @param Name               property name
     * @param File               file where this property is defined
     * @param LineNo             line number
     * @param GetterName         name of the Objective C property getter selector
     * @param SetterName         name of the Objective C property setter selector
     * @param PropertyAttributes objective C property attributes
     * @param Ty                 type
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjCProperty(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("char const *") ByteBuffer GetterName, @NativeType("char const *") ByteBuffer SetterName, @NativeType("unsigned int") int PropertyAttributes, @NativeType("LLVMMetadataRef") long Ty) {
        return nLLVMDIBuilderCreateObjCProperty(Builder, memAddress(Name), Name.remaining(), File, LineNo, memAddress(GetterName), GetterName.remaining(), memAddress(SetterName), SetterName.remaining(), PropertyAttributes, Ty);
    }

    /**
     * Create debugging information entry for Objective-C property.
     *
     * @param Builder            the DIBuilder
     * @param Name               property name
     * @param File               file where this property is defined
     * @param LineNo             line number
     * @param GetterName         name of the Objective C property getter selector
     * @param SetterName         name of the Objective C property setter selector
     * @param PropertyAttributes objective C property attributes
     * @param Ty                 type
     */
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

    /**
     * Create a uniqued DIType* clone with FlagObjectPointer and FlagArtificial set.
     *
     * @param Builder the DIBuilder
     * @param Type    the underlying type to which this pointer points
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateObjectPointerType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Type) {
        long __functionAddress = Functions.DIBuilderCreateObjectPointerType;
        if (CHECKS) {
            check(Builder);
            check(Type);
        }
        return invokePPP(Builder, Type, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateQualifiedType ] ---

    /**
     * Create debugging information entry for a qualified type, e.g. 'const int'.
     *
     * @param Builder the DIBuilder
     * @param Tag     tag identifying type, e.g. {@code LLVMDWARFTypeQualifier_volatile_type}
     * @param Type    base Type
     */
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

    /**
     * Create debugging information entry for a c++ style reference or {@code rvalue} reference type.
     *
     * @param Builder the DIBuilder
     * @param Tag     tag identifying type,
     * @param Type    base Type
     */
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

    /**
     * Create C++11 {@code nullptr} type.
     *
     * @param Builder the DIBuilder
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateNullPtrType(@NativeType("LLVMDIBuilderRef") long Builder) {
        long __functionAddress = Functions.DIBuilderCreateNullPtrType;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateTypedef ] ---

    /** Unsafe version of: {@link #LLVMDIBuilderCreateTypedef DIBuilderCreateTypedef} */
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

    /**
     * Create debugging information entry for a typedef.
     *
     * @param Builder the DIBuilder
     * @param Type    original type
     * @param Name    typedef name
     * @param File    file where this type is defined
     * @param LineNo  line number
     * @param Scope   the surrounding context for the typedef
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateTypedef(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Type, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Scope, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateTypedef(Builder, Type, memAddress(Name), Name.remaining(), File, LineNo, Scope, AlignInBits);
    }

    /**
     * Create debugging information entry for a typedef.
     *
     * @param Builder the DIBuilder
     * @param Type    original type
     * @param Name    typedef name
     * @param File    file where this type is defined
     * @param LineNo  line number
     * @param Scope   the surrounding context for the typedef
     */
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

    /**
     * Create debugging information entry to establish inheritance relationship between two types.
     *
     * @param Builder     the DIBuilder
     * @param Ty          original type
     * @param BaseTy      base type. Ty is inherits from base.
     * @param BaseOffset  base offset
     * @param VBPtrOffset virtual base pointer offset
     * @param Flags       flags to describe inheritance attribute, e.g. private
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateForwardDecl DIBuilderCreateForwardDecl}
     *
     * @param NameLen             length of type name
     * @param UniqueIdentifierLen length of the unique identifier
     */
    public static long nLLVMDIBuilderCreateForwardDecl(long Builder, int Tag, long Name, long NameLen, long Scope, long File, int Line, int RuntimeLang, long SizeInBits, int AlignInBits, long UniqueIdentifier, long UniqueIdentifierLen) {
        long __functionAddress = Functions.DIBuilderCreateForwardDecl;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPPPJPPP(Builder, Tag, Name, NameLen, Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, UniqueIdentifier, UniqueIdentifierLen, __functionAddress);
    }

    /**
     * Create a permanent forward-declared type.
     *
     * @param Builder          the DIBuilder
     * @param Tag              a unique tag for this type
     * @param Name             type name
     * @param Scope            type scope
     * @param File             file where this type is defined
     * @param Line             line number where this type is defined
     * @param RuntimeLang      indicates runtime version for languages like Objective-C
     * @param SizeInBits       member size
     * @param AlignInBits      member alignment
     * @param UniqueIdentifier a unique identifier for the type
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateForwardDecl(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int RuntimeLang, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("char const *") ByteBuffer UniqueIdentifier) {
        return nLLVMDIBuilderCreateForwardDecl(Builder, Tag, memAddress(Name), Name.remaining(), Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, memAddress(UniqueIdentifier), UniqueIdentifier.remaining());
    }

    /**
     * Create a permanent forward-declared type.
     *
     * @param Builder          the DIBuilder
     * @param Tag              a unique tag for this type
     * @param Name             type name
     * @param Scope            type scope
     * @param File             file where this type is defined
     * @param Line             line number where this type is defined
     * @param RuntimeLang      indicates runtime version for languages like Objective-C
     * @param SizeInBits       member size
     * @param AlignInBits      member alignment
     * @param UniqueIdentifier a unique identifier for the type
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateReplaceableCompositeType DIBuilderCreateReplaceableCompositeType}
     *
     * @param NameLen             length of type name
     * @param UniqueIdentifierLen length of the unique identifier
     */
    public static long nLLVMDIBuilderCreateReplaceableCompositeType(long Builder, int Tag, long Name, long NameLen, long Scope, long File, int Line, int RuntimeLang, long SizeInBits, int AlignInBits, int Flags, long UniqueIdentifier, long UniqueIdentifierLen) {
        long __functionAddress = Functions.DIBuilderCreateReplaceableCompositeType;
        if (CHECKS) {
            check(Builder);
            check(Scope);
            check(File);
        }
        return invokePPPPPJPPP(Builder, Tag, Name, NameLen, Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, Flags, UniqueIdentifier, UniqueIdentifierLen, __functionAddress);
    }

    /**
     * Create a temporary forward-declared type.
     *
     * @param Builder          the DIBuilder
     * @param Tag              a unique tag for this type
     * @param Name             type name
     * @param Scope            type scope
     * @param File             file where this type is defined
     * @param Line             line number where this type is defined
     * @param RuntimeLang      indicates runtime version for languages like Objective-C
     * @param SizeInBits       member size
     * @param AlignInBits      member alignment
     * @param Flags            flags
     * @param UniqueIdentifier a unique identifier for the type
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateReplaceableCompositeType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("unsigned int") int Tag, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long Scope, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int Line, @NativeType("unsigned int") int RuntimeLang, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("char const *") ByteBuffer UniqueIdentifier) {
        return nLLVMDIBuilderCreateReplaceableCompositeType(Builder, Tag, memAddress(Name), Name.remaining(), Scope, File, Line, RuntimeLang, SizeInBits, AlignInBits, Flags, memAddress(UniqueIdentifier), UniqueIdentifier.remaining());
    }

    /**
     * Create a temporary forward-declared type.
     *
     * @param Builder          the DIBuilder
     * @param Tag              a unique tag for this type
     * @param Name             type name
     * @param Scope            type scope
     * @param File             file where this type is defined
     * @param Line             line number where this type is defined
     * @param RuntimeLang      indicates runtime version for languages like Objective-C
     * @param SizeInBits       member size
     * @param AlignInBits      member alignment
     * @param Flags            flags
     * @param UniqueIdentifier a unique identifier for the type
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateBitFieldMemberType DIBuilderCreateBitFieldMemberType}
     *
     * @param NameLen length of member name
     */
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

    /**
     * Create debugging information entry for a bit field member.
     *
     * @param Builder             the DIBuilder
     * @param Scope               member scope
     * @param Name                member name
     * @param File                file where this member is defined
     * @param LineNumber          line number
     * @param SizeInBits          member size
     * @param OffsetInBits        member offset
     * @param StorageOffsetInBits member storage offset
     * @param Flags               flags to encode member attribute
     * @param Type                parent type
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateBitFieldMemberType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("uint64_t") long StorageOffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long Type) {
        return nLLVMDIBuilderCreateBitFieldMemberType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, OffsetInBits, StorageOffsetInBits, Flags, Type);
    }

    /**
     * Create debugging information entry for a bit field member.
     *
     * @param Builder             the DIBuilder
     * @param Scope               member scope
     * @param Name                member name
     * @param File                file where this member is defined
     * @param LineNumber          line number
     * @param SizeInBits          member size
     * @param OffsetInBits        member offset
     * @param StorageOffsetInBits member storage offset
     * @param Flags               flags to encode member attribute
     * @param Type                parent type
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateClassType DIBuilderCreateClassType}
     *
     * @param NameLen             the length of the C string passed to {@code Name}
     * @param NumElements         number of class elements
     * @param UniqueIdentifierLen length of the unique identifier
     */
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

    /**
     * Create debugging information entry for a class.
     *
     * @param Scope              scope in which this class is defined
     * @param Name               class name
     * @param File               file where this member is defined
     * @param LineNumber         line number
     * @param SizeInBits         member size
     * @param AlignInBits        member alignment
     * @param OffsetInBits       member offset
     * @param Flags              flags to encode member attribute, e.g. private.
     * @param DerivedFrom        debug info of the base class of this type
     * @param Elements           class members
     * @param VTableHolder       debug info of the base class that contains vtable for this type. This is used in DW_AT_containing_type. See DWARF documentation for more info.
     * @param TemplateParamsNode template type parameters
     * @param UniqueIdentifier   a unique identifier for the type
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateClassType(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNumber, @NativeType("uint64_t") long SizeInBits, @NativeType("uint32_t") int AlignInBits, @NativeType("uint64_t") long OffsetInBits, @NativeType("LLVMDIFlags") int Flags, @NativeType("LLVMMetadataRef") long DerivedFrom, @NativeType("LLVMMetadataRef *") PointerBuffer Elements, @NativeType("LLVMMetadataRef") long VTableHolder, @NativeType("LLVMMetadataRef") long TemplateParamsNode, @NativeType("char const *") ByteBuffer UniqueIdentifier) {
        return nLLVMDIBuilderCreateClassType(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNumber, SizeInBits, AlignInBits, OffsetInBits, Flags, DerivedFrom, memAddress(Elements), Elements.remaining(), VTableHolder, TemplateParamsNode, memAddress(UniqueIdentifier), UniqueIdentifier.remaining());
    }

    /**
     * Create debugging information entry for a class.
     *
     * @param Scope              scope in which this class is defined
     * @param Name               class name
     * @param File               file where this member is defined
     * @param LineNumber         line number
     * @param SizeInBits         member size
     * @param AlignInBits        member alignment
     * @param OffsetInBits       member offset
     * @param Flags              flags to encode member attribute, e.g. private.
     * @param DerivedFrom        debug info of the base class of this type
     * @param Elements           class members
     * @param VTableHolder       debug info of the base class that contains vtable for this type. This is used in DW_AT_containing_type. See DWARF documentation for more info.
     * @param TemplateParamsNode template type parameters
     * @param UniqueIdentifier   a unique identifier for the type
     */
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

    /**
     * Create a uniqued {@code DIType*} clone with {@code FlagArtificial} set.
     *
     * @param Builder the DIBuilder
     * @param Type    the underlying type
     */
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

    /**
     * Unsafe version of: {@link #LLVMDITypeGetName DITypeGetName}
     *
     * @param Length the length of the returned string
     */
    public static long nLLVMDITypeGetName(long DType, long Length) {
        long __functionAddress = Functions.DITypeGetName;
        if (CHECKS) {
            check(DType);
        }
        return invokePPP(DType, Length, __functionAddress);
    }

    /**
     * Get the name of this {@code DIType}.
     *
     * @param DType the DIType
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMDITypeGetName(@NativeType("LLVMMetadataRef") long DType) {
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

    /**
     * Get the size of this {@code DIType} in bits.
     *
     * @param DType the DIType
     */
    @NativeType("uint64_t")
    public static long LLVMDITypeGetSizeInBits(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetSizeInBits;
        if (CHECKS) {
            check(DType);
        }
        return invokePJ(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetOffsetInBits ] ---

    /**
     * Get the offset of this {@code DIType} in bits.
     *
     * @param DType the DIType
     */
    @NativeType("uint64_t")
    public static long LLVMDITypeGetOffsetInBits(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetOffsetInBits;
        if (CHECKS) {
            check(DType);
        }
        return invokePJ(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetAlignInBits ] ---

    /**
     * Get the alignment of this {@code DIType} in bits.
     *
     * @param DType the DIType
     */
    @NativeType("uint32_t")
    public static int LLVMDITypeGetAlignInBits(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetAlignInBits;
        if (CHECKS) {
            check(DType);
        }
        return invokePI(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetLine ] ---

    /**
     * Get the source line where this {@code DIType} is declared.
     *
     * @param DType the DIType
     */
    @NativeType("unsigned int")
    public static int LLVMDITypeGetLine(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetLine;
        if (CHECKS) {
            check(DType);
        }
        return invokePI(DType, __functionAddress);
    }

    // --- [ LLVMDITypeGetFlags ] ---

    /**
     * Get the flags associated with this {@code DIType}.
     *
     * @param DType the DIType
     */
    @NativeType("LLVMDIFlags")
    public static int LLVMDITypeGetFlags(@NativeType("LLVMMetadataRef") long DType) {
        long __functionAddress = Functions.DITypeGetFlags;
        if (CHECKS) {
            check(DType);
        }
        return invokePI(DType, __functionAddress);
    }

    // --- [ LLVMDIBuilderGetOrCreateSubrange ] ---

    /**
     * Create a descriptor for a value range.
     *
     * @param Builder    the DIBuilder
     * @param LowerBound lower bound of the subrange, e.g. 0 for C, 1 for Fortran.
     * @param Count      count of elements in the subrange
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderGetOrCreateSubrange(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("int64_t") long LowerBound, @NativeType("int64_t") long Count) {
        long __functionAddress = Functions.DIBuilderGetOrCreateSubrange;
        if (CHECKS) {
            check(Builder);
        }
        return invokePJJP(Builder, LowerBound, Count, __functionAddress);
    }

    // --- [ LLVMDIBuilderGetOrCreateArray ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderGetOrCreateArray DIBuilderGetOrCreateArray}
     *
     * @param NumElements number of DI Node elements
     */
    public static long nLLVMDIBuilderGetOrCreateArray(long Builder, long Data, long NumElements) {
        long __functionAddress = Functions.DIBuilderGetOrCreateArray;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Data, NumElements, __functionAddress);
    }

    /**
     * Create an array of {@code DI} Nodes.
     *
     * @param Builder the DIBuilder
     * @param Data    the DI Node elements
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderGetOrCreateArray(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef *") PointerBuffer Data) {
        return nLLVMDIBuilderGetOrCreateArray(Builder, memAddress(Data), Data.remaining());
    }

    // --- [ LLVMDIBuilderCreateExpression ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateExpression DIBuilderCreateExpression}
     *
     * @param Length length of the address operation array
     */
    public static long nLLVMDIBuilderCreateExpression(long Builder, long Addr, long Length) {
        long __functionAddress = Functions.DIBuilderCreateExpression;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPPP(Builder, Addr, Length, __functionAddress);
    }

    /**
     * Create a new descriptor for the specified variable which has a complex address expression for its address.
     *
     * @param Builder the DIBuilder
     * @param Addr    an array of complex address operations
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateExpression(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("int64_t *") LongBuffer Addr) {
        return nLLVMDIBuilderCreateExpression(Builder, memAddress(Addr), Addr.remaining());
    }

    // --- [ LLVMDIBuilderCreateConstantValueExpression ] ---

    /**
     * Create a new descriptor for the specified variable that does not have an address, but does have a constant value.
     *
     * @param Builder the DIBuilder
     * @param Value   the constant value
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateConstantValueExpression(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("int64_t") long Value) {
        long __functionAddress = Functions.DIBuilderCreateConstantValueExpression;
        if (CHECKS) {
            check(Builder);
        }
        return invokePJP(Builder, Value, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateGlobalVariableExpression ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateGlobalVariableExpression DIBuilderCreateGlobalVariableExpression}
     *
     * @param NameLen the length of the C string passed to {@code Name}
     * @param LinkLen the length of the C string passed to {@code Linkage}
     */
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

    /**
     * Create a new descriptor for the specified variable.
     *
     * @param Scope       variable scope
     * @param Name        name of the variable
     * @param Linkage     mangled  name of the variable
     * @param File        file where this variable is defined
     * @param LineNo      line number
     * @param Ty          variable Type
     * @param LocalToUnit boolean flag indicate whether this variable is externally visible or not
     * @param Expr        the location of the global relative to the attached GlobalVariable
     * @param Decl        reference to the corresponding declaration. variables.
     * @param AlignInBits variable alignment(or 0 if no alignment attr was specified)
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateGlobalVariableExpression(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer Linkage, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean LocalToUnit, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long Decl, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateGlobalVariableExpression(Builder, Scope, memAddress(Name), Name.remaining(), memAddress(Linkage), Linkage.remaining(), File, LineNo, Ty, LocalToUnit ? 1 : 0, Expr, Decl, AlignInBits);
    }

    /**
     * Create a new descriptor for the specified variable.
     *
     * @param Scope       variable scope
     * @param Name        name of the variable
     * @param Linkage     mangled  name of the variable
     * @param File        file where this variable is defined
     * @param LineNo      line number
     * @param Ty          variable Type
     * @param LocalToUnit boolean flag indicate whether this variable is externally visible or not
     * @param Expr        the location of the global relative to the attached GlobalVariable
     * @param Decl        reference to the corresponding declaration. variables.
     * @param AlignInBits variable alignment(or 0 if no alignment attr was specified)
     */
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

    // --- [ LLVMDIGlobalVariableExpressionGetVariable ] ---

    /**
     * Retrieves the {@code DIVariable} associated with this global variable expression.
     * 
     * <p>See {@code llvm::DIGlobalVariableExpression::getVariable()}.</p>
     *
     * @param GVE the global variable expression
     *
     * @since 9
     */
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

    /**
     * Retrieves the {@code DIExpression} associated with this global variable expression.
     * 
     * <p>See {@code llvm::DIGlobalVariableExpression::getExpression()}.</p>
     *
     * @param GVE the global variable expression
     *
     * @since 9
     */
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

    /**
     * Get the metadata of the file associated with a given variable.
     * 
     * <p>See {@code DIVariable::getFile()},</p>
     *
     * @param Var the variable object
     *
     * @since 9
     */
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

    /**
     * Get the metadata of the scope associated with a given variable.
     * 
     * <p>See {@code DIVariable::getScope()},</p>
     *
     * @param Var the variable object
     *
     * @since 9
     */
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

    /**
     * Get the source line where this {@code DIVariable} is declared.
     * 
     * <p>See {@code DIVariable::getLine()}.</p>
     *
     * @param Var the {@code DIVariable}
     *
     * @since 9
     */
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

    /**
     * Unsafe version of: {@link #LLVMTemporaryMDNode TemporaryMDNode}
     *
     * @param NumElements number of metadata elements
     */
    public static long nLLVMTemporaryMDNode(long Ctx, long Data, long NumElements) {
        long __functionAddress = Functions.TemporaryMDNode;
        if (CHECKS) {
            check(Ctx);
        }
        return invokePPPP(Ctx, Data, NumElements, __functionAddress);
    }

    /**
     * Create a new temporary {@code MDNode}. Suitable for use in constructing cyclic {@code MDNode} structures. A temporary {@code MDNode} is not uniqued,
     * may be RAUW'd, and must be manually deleted with {@code LLVMDisposeTemporaryMDNode}.
     *
     * @param Ctx  the context in which to construct the temporary node
     * @param Data the metadata elements
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMTemporaryMDNode(@NativeType("LLVMContextRef") long Ctx, @NativeType("LLVMMetadataRef *") PointerBuffer Data) {
        return nLLVMTemporaryMDNode(Ctx, memAddress(Data), Data.remaining());
    }

    // --- [ LLVMDisposeTemporaryMDNode ] ---

    /**
     * Deallocate a temporary node.
     * 
     * <p>Calls {@code replaceAllUsesWith(nullptr)} before deleting, so any remaining references will be reset.</p>
     *
     * @param TempNode the temporary metadata node
     */
    public static void LLVMDisposeTemporaryMDNode(@NativeType("LLVMMetadataRef") long TempNode) {
        long __functionAddress = Functions.DisposeTemporaryMDNode;
        if (CHECKS) {
            check(TempNode);
        }
        invokePV(TempNode, __functionAddress);
    }

    // --- [ LLVMMetadataReplaceAllUsesWith ] ---

    /**
     * Replace all uses of temporary metadata.
     *
     * @param TempTargetMetadata the temporary metadata node
     * @param Replacement        the replacement metadata node
     */
    public static void LLVMMetadataReplaceAllUsesWith(@NativeType("LLVMMetadataRef") long TempTargetMetadata, @NativeType("LLVMMetadataRef") long Replacement) {
        long __functionAddress = Functions.MetadataReplaceAllUsesWith;
        if (CHECKS) {
            check(TempTargetMetadata);
            check(Replacement);
        }
        invokePPV(TempTargetMetadata, Replacement, __functionAddress);
    }

    // --- [ LLVMDIBuilderCreateTempGlobalVariableFwdDecl ] ---

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateTempGlobalVariableFwdDecl DIBuilderCreateTempGlobalVariableFwdDecl}
     *
     * @param NameLen the length of the C string passed to {@code Name}
     * @param LnkLen  the length of the C string passed to {@code Linkage}
     */
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

    /**
     * Create a new descriptor for the specified global variable that is temporary and meant to be RAUWed.
     *
     * @param Scope       variable scope
     * @param Name        name of the variable
     * @param Linkage     mangled  name of the variable
     * @param File        file where this variable is defined
     * @param LineNo      line number
     * @param Ty          variable Type
     * @param LocalToUnit boolean flag indicate whether this variable is externally visible or not
     * @param Decl        reference to the corresponding declaration
     * @param AlignInBits variable alignment(or 0 if no alignment attr was specified)
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateTempGlobalVariableFwdDecl(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("char const *") ByteBuffer Linkage, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean LocalToUnit, @NativeType("LLVMMetadataRef") long Decl, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateTempGlobalVariableFwdDecl(Builder, Scope, memAddress(Name), Name.remaining(), memAddress(Linkage), Linkage.remaining(), File, LineNo, Ty, LocalToUnit ? 1 : 0, Decl, AlignInBits);
    }

    /**
     * Create a new descriptor for the specified global variable that is temporary and meant to be RAUWed.
     *
     * @param Scope       variable scope
     * @param Name        name of the variable
     * @param Linkage     mangled  name of the variable
     * @param File        file where this variable is defined
     * @param LineNo      line number
     * @param Ty          variable Type
     * @param LocalToUnit boolean flag indicate whether this variable is externally visible or not
     * @param Decl        reference to the corresponding declaration
     * @param AlignInBits variable alignment(or 0 if no alignment attr was specified)
     */
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

    /**
     * Insert a new {@code llvm.dbg.declare} intrinsic call before the given instruction.
     *
     * @param Builder  the {@code DIBuilder}
     * @param Storage  the storage of the variable to declare
     * @param VarInfo  the variable's debug info descriptor
     * @param Expr     a complex location expression for the variable
     * @param DebugLoc debug info location
     * @param Instr    instruction acting as a location for the new intrinsic
     */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDeclareBefore(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Storage, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.DIBuilderInsertDeclareBefore;
        if (CHECKS) {
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

    /**
     * Insert a new {@code llvm.dbg.declare} intrinsic call at the end of the given basic block. If the basic block has a terminator instruction, the
     * intrinsic is inserted before that terminator instruction.
     *
     * @param Builder  the {@code DIBuilder}
     * @param Storage  the storage of the variable to declare
     * @param VarInfo  the variable's debug info descriptor
     * @param Expr     a complex location expression for the variable
     * @param DebugLoc debug info location
     * @param Block    basic block acting as a location for the new intrinsic
     */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDeclareAtEnd(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Storage, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.DIBuilderInsertDeclareAtEnd;
        if (CHECKS) {
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

    /**
     * Insert a new {@code llvm.dbg.value} intrinsic call before the given instruction.
     *
     * @param Builder  the {@code DIBuilder}
     * @param Val      the value of the variable
     * @param VarInfo  the variable's debug info descriptor
     * @param Expr     a complex location expression for the variable
     * @param DebugLoc debug info location
     * @param Instr    instruction acting as a location for the new intrinsic
     */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDbgValueBefore(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.DIBuilderInsertDbgValueBefore;
        if (CHECKS) {
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

    /**
     * Insert a new {@code llvm.dbg.value} intrinsic call at the end of the given basic block. If the basic block has a terminator instruction, the intrinsic
     * is inserted before that terminator instruction.
     *
     * @param Builder  the {@code DIBuilder}
     * @param Val      the value of the variable
     * @param VarInfo  the variable's debug info descriptor
     * @param Expr     a complex location expression for the variable
     * @param DebugLoc debug info location
     * @param Block    basic block acting as a location for the new intrinsic
     */
    @NativeType("LLVMValueRef")
    public static long LLVMDIBuilderInsertDbgValueAtEnd(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMMetadataRef") long VarInfo, @NativeType("LLVMMetadataRef") long Expr, @NativeType("LLVMMetadataRef") long DebugLoc, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.DIBuilderInsertDbgValueAtEnd;
        if (CHECKS) {
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateAutoVariable DIBuilderCreateAutoVariable}
     *
     * @param NameLen length of variable name
     */
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

    /**
     * Create a new descriptor for a local auto variable.
     *
     * @param Builder        the {@code DIBuilder}
     * @param Scope          the local scope the variable is declared in
     * @param Name           variable name
     * @param File           file where this variable is defined
     * @param LineNo         line number
     * @param Ty             metadata describing the type of the variable
     * @param AlwaysPreserve if true, this descriptor will survive optimizations
     * @param Flags          flags
     * @param AlignInBits    variable alignment
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateAutoVariable(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean AlwaysPreserve, @NativeType("LLVMDIFlags") int Flags, @NativeType("uint32_t") int AlignInBits) {
        return nLLVMDIBuilderCreateAutoVariable(Builder, Scope, memAddress(Name), Name.remaining(), File, LineNo, Ty, AlwaysPreserve ? 1 : 0, Flags, AlignInBits);
    }

    /**
     * Create a new descriptor for a local auto variable.
     *
     * @param Builder        the {@code DIBuilder}
     * @param Scope          the local scope the variable is declared in
     * @param Name           variable name
     * @param File           file where this variable is defined
     * @param LineNo         line number
     * @param Ty             metadata describing the type of the variable
     * @param AlwaysPreserve if true, this descriptor will survive optimizations
     * @param Flags          flags
     * @param AlignInBits    variable alignment
     */
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

    /**
     * Unsafe version of: {@link #LLVMDIBuilderCreateParameterVariable DIBuilderCreateParameterVariable}
     *
     * @param NameLen length of variable name
     */
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

    /**
     * Create a new descriptor for a function parameter variable.
     *
     * @param Builder        the {@code DIBuilder}
     * @param Scope          the local scope the variable is declared in
     * @param Name           variable name
     * @param ArgNo          unique argument number for this variable; starts at 1
     * @param File           file where this variable is defined
     * @param LineNo         line number
     * @param Ty             metadata describing the type of the variable
     * @param AlwaysPreserve if true, this descriptor will survive optimizations
     * @param Flags          flags
     */
    @NativeType("LLVMMetadataRef")
    public static long LLVMDIBuilderCreateParameterVariable(@NativeType("LLVMDIBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Scope, @NativeType("char const *") ByteBuffer Name, @NativeType("unsigned int") int ArgNo, @NativeType("LLVMMetadataRef") long File, @NativeType("unsigned int") int LineNo, @NativeType("LLVMMetadataRef") long Ty, @NativeType("LLVMBool") boolean AlwaysPreserve, @NativeType("LLVMDIFlags") int Flags) {
        return nLLVMDIBuilderCreateParameterVariable(Builder, Scope, memAddress(Name), Name.remaining(), ArgNo, File, LineNo, Ty, AlwaysPreserve ? 1 : 0, Flags);
    }

    /**
     * Create a new descriptor for a function parameter variable.
     *
     * @param Builder        the {@code DIBuilder}
     * @param Scope          the local scope the variable is declared in
     * @param Name           variable name
     * @param ArgNo          unique argument number for this variable; starts at 1
     * @param File           file where this variable is defined
     * @param LineNo         line number
     * @param Ty             metadata describing the type of the variable
     * @param AlwaysPreserve if true, this descriptor will survive optimizations
     * @param Flags          flags
     */
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

    /** Get the metadata of the subprogram attached to a function. */
    @NativeType("LLVMMetadataRef")
    public static long LLVMGetSubprogram(@NativeType("LLVMValueRef") long Func) {
        long __functionAddress = Functions.GetSubprogram;
        if (CHECKS) {
            check(Func);
        }
        return invokePP(Func, __functionAddress);
    }

    // --- [ LLVMSetSubprogram ] ---

    /** Set the subprogram attached to a function. */
    public static void LLVMSetSubprogram(@NativeType("LLVMValueRef") long Func, @NativeType("LLVMMetadataRef") long SP) {
        long __functionAddress = Functions.SetSubprogram;
        if (CHECKS) {
            check(Func);
            check(SP);
        }
        invokePPV(Func, SP, __functionAddress);
    }

    // --- [ LLVMDISubprogramGetLine ] ---

    /**
     * Get the line associated with a given subprogram.
     * 
     * <p>See {@code DISubprogram::getLine()}.</p>
     *
     * @param Subprogram the subprogram object
     *
     * @since 9
     */
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

    /**
     * Get the debug location for the given instruction.
     * 
     * <p>See {@code llvm::Instruction::getDebugLoc()}</p>
     *
     * @since 9
     */
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

    /**
     * Set the debug location for the given instruction.
     * 
     * <p>To clear the location metadata of the given instruction, pass {@code NULL} to {@code Loc}.</p>
     * 
     * <p>See {@code llvm::Instruction::setDebugLoc()}</p>
     *
     * @since 9
     */
    public static void LLVMInstructionSetDebugLoc(@NativeType("LLVMValueRef") long Inst, @NativeType("LLVMMetadataRef") long Loc) {
        long __functionAddress = Functions.InstructionSetDebugLoc;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        invokePPV(Inst, Loc, __functionAddress);
    }

    // --- [ LLVMGetMetadataKind ] ---

    /** Obtain the enumerated type of a Metadata instance. */
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