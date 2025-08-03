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

public class LLVMCore {

    private static final SharedLibrary LLVM = Library.loadNative(LLVMCore.class, "org.lwjgl.llvm", Configuration.LLVM_LIBRARY_NAME, "LLVM", "LLVM-C");

    /** Contains the function pointers loaded from the LLVM {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeCore                             = apiGetFunctionAddressOptional(LLVM, "LLVMInitializeCore"),
            Shutdown                                   = apiGetFunctionAddress(LLVM, "LLVMShutdown"),
            GetVersion                                 = apiGetFunctionAddressOptional(LLVM, "LLVMGetVersion"),
            CreateMessage                              = apiGetFunctionAddress(LLVM, "LLVMCreateMessage"),
            DisposeMessage                             = apiGetFunctionAddress(LLVM, "LLVMDisposeMessage"),
            ContextCreate                              = apiGetFunctionAddress(LLVM, "LLVMContextCreate"),
            GetGlobalContext                           = apiGetFunctionAddress(LLVM, "LLVMGetGlobalContext"),
            ContextSetDiagnosticHandler                = apiGetFunctionAddress(LLVM, "LLVMContextSetDiagnosticHandler"),
            ContextGetDiagnosticHandler                = apiGetFunctionAddress(LLVM, "LLVMContextGetDiagnosticHandler"),
            ContextGetDiagnosticContext                = apiGetFunctionAddress(LLVM, "LLVMContextGetDiagnosticContext"),
            ContextSetYieldCallback                    = apiGetFunctionAddress(LLVM, "LLVMContextSetYieldCallback"),
            ContextShouldDiscardValueNames             = apiGetFunctionAddressOptional(LLVM, "LLVMContextShouldDiscardValueNames"),
            ContextSetDiscardValueNames                = apiGetFunctionAddressOptional(LLVM, "LLVMContextSetDiscardValueNames"),
            ContextSetOpaquePointers                   = apiGetFunctionAddressOptional(LLVM, "LLVMContextSetOpaquePointers"),
            ContextDispose                             = apiGetFunctionAddress(LLVM, "LLVMContextDispose"),
            GetDiagInfoDescription                     = apiGetFunctionAddress(LLVM, "LLVMGetDiagInfoDescription"),
            GetDiagInfoSeverity                        = apiGetFunctionAddress(LLVM, "LLVMGetDiagInfoSeverity"),
            GetMDKindIDInContext                       = apiGetFunctionAddress(LLVM, "LLVMGetMDKindIDInContext"),
            GetSyncScopeID                             = apiGetFunctionAddressOptional(LLVM, "LLVMGetSyncScopeID"),
            GetMDKindID                                = apiGetFunctionAddress(LLVM, "LLVMGetMDKindID"),
            GetEnumAttributeKindForName                = apiGetFunctionAddress(LLVM, "LLVMGetEnumAttributeKindForName"),
            GetLastEnumAttributeKind                   = apiGetFunctionAddress(LLVM, "LLVMGetLastEnumAttributeKind"),
            CreateEnumAttribute                        = apiGetFunctionAddress(LLVM, "LLVMCreateEnumAttribute"),
            GetEnumAttributeKind                       = apiGetFunctionAddress(LLVM, "LLVMGetEnumAttributeKind"),
            GetEnumAttributeValue                      = apiGetFunctionAddress(LLVM, "LLVMGetEnumAttributeValue"),
            CreateTypeAttribute                        = apiGetFunctionAddressOptional(LLVM, "LLVMCreateTypeAttribute"),
            GetTypeAttributeValue                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetTypeAttributeValue"),
            CreateConstantRangeAttribute               = apiGetFunctionAddressOptional(LLVM, "LLVMCreateConstantRangeAttribute"),
            CreateStringAttribute                      = apiGetFunctionAddress(LLVM, "LLVMCreateStringAttribute"),
            GetStringAttributeKind                     = apiGetFunctionAddress(LLVM, "LLVMGetStringAttributeKind"),
            GetStringAttributeValue                    = apiGetFunctionAddress(LLVM, "LLVMGetStringAttributeValue"),
            IsEnumAttribute                            = apiGetFunctionAddress(LLVM, "LLVMIsEnumAttribute"),
            IsStringAttribute                          = apiGetFunctionAddress(LLVM, "LLVMIsStringAttribute"),
            IsTypeAttribute                            = apiGetFunctionAddressOptional(LLVM, "LLVMIsTypeAttribute"),
            GetTypeByName2                             = apiGetFunctionAddressOptional(LLVM, "LLVMGetTypeByName2"),
            ModuleCreateWithName                       = apiGetFunctionAddress(LLVM, "LLVMModuleCreateWithName"),
            ModuleCreateWithNameInContext              = apiGetFunctionAddress(LLVM, "LLVMModuleCreateWithNameInContext"),
            CloneModule                                = apiGetFunctionAddress(LLVM, "LLVMCloneModule"),
            DisposeModule                              = apiGetFunctionAddress(LLVM, "LLVMDisposeModule"),
            GetModuleIdentifier                        = apiGetFunctionAddress(LLVM, "LLVMGetModuleIdentifier"),
            SetModuleIdentifier                        = apiGetFunctionAddress(LLVM, "LLVMSetModuleIdentifier"),
            GetSourceFileName                          = apiGetFunctionAddressOptional(LLVM, "LLVMGetSourceFileName"),
            SetSourceFileName                          = apiGetFunctionAddressOptional(LLVM, "LLVMSetSourceFileName"),
            GetDataLayoutStr                           = apiGetFunctionAddress(LLVM, "LLVMGetDataLayoutStr"),
            GetDataLayout                              = apiGetFunctionAddress(LLVM, "LLVMGetDataLayout"),
            SetDataLayout                              = apiGetFunctionAddress(LLVM, "LLVMSetDataLayout"),
            GetTarget                                  = apiGetFunctionAddress(LLVM, "LLVMGetTarget"),
            SetTarget                                  = apiGetFunctionAddress(LLVM, "LLVMSetTarget"),
            CopyModuleFlagsMetadata                    = apiGetFunctionAddressOptional(LLVM, "LLVMCopyModuleFlagsMetadata"),
            DisposeModuleFlagsMetadata                 = apiGetFunctionAddressOptional(LLVM, "LLVMDisposeModuleFlagsMetadata"),
            ModuleFlagEntriesGetFlagBehavior           = apiGetFunctionAddressOptional(LLVM, "LLVMModuleFlagEntriesGetFlagBehavior"),
            ModuleFlagEntriesGetKey                    = apiGetFunctionAddressOptional(LLVM, "LLVMModuleFlagEntriesGetKey"),
            ModuleFlagEntriesGetMetadata               = apiGetFunctionAddressOptional(LLVM, "LLVMModuleFlagEntriesGetMetadata"),
            GetModuleFlag                              = apiGetFunctionAddressOptional(LLVM, "LLVMGetModuleFlag"),
            AddModuleFlag                              = apiGetFunctionAddressOptional(LLVM, "LLVMAddModuleFlag"),
            DumpModule                                 = apiGetFunctionAddress(LLVM, "LLVMDumpModule"),
            PrintModuleToFile                          = apiGetFunctionAddress(LLVM, "LLVMPrintModuleToFile"),
            PrintModuleToString                        = apiGetFunctionAddress(LLVM, "LLVMPrintModuleToString"),
            GetModuleInlineAsm                         = apiGetFunctionAddressOptional(LLVM, "LLVMGetModuleInlineAsm"),
            SetModuleInlineAsm2                        = apiGetFunctionAddressOptional(LLVM, "LLVMSetModuleInlineAsm2"),
            AppendModuleInlineAsm                      = apiGetFunctionAddressOptional(LLVM, "LLVMAppendModuleInlineAsm"),
            GetInlineAsm                               = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsm"),
            GetInlineAsmAsmString                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsmAsmString"),
            GetInlineAsmConstraintString               = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsmConstraintString"),
            GetInlineAsmDialect                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsmDialect"),
            GetInlineAsmFunctionType                   = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsmFunctionType"),
            GetInlineAsmHasSideEffects                 = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsmHasSideEffects"),
            GetInlineAsmNeedsAlignedStack              = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsmNeedsAlignedStack"),
            GetInlineAsmCanUnwind                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetInlineAsmCanUnwind"),
            GetModuleContext                           = apiGetFunctionAddress(LLVM, "LLVMGetModuleContext"),
            GetTypeByName                              = apiGetFunctionAddress(LLVM, "LLVMGetTypeByName"),
            GetFirstNamedMetadata                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetFirstNamedMetadata"),
            GetLastNamedMetadata                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetLastNamedMetadata"),
            GetNextNamedMetadata                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetNextNamedMetadata"),
            GetPreviousNamedMetadata                   = apiGetFunctionAddressOptional(LLVM, "LLVMGetPreviousNamedMetadata"),
            GetNamedMetadata                           = apiGetFunctionAddressOptional(LLVM, "LLVMGetNamedMetadata"),
            GetOrInsertNamedMetadata                   = apiGetFunctionAddressOptional(LLVM, "LLVMGetOrInsertNamedMetadata"),
            GetNamedMetadataName                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetNamedMetadataName"),
            GetNamedMetadataNumOperands                = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadataNumOperands"),
            GetNamedMetadataOperands                   = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadataOperands"),
            AddNamedMetadataOperand                    = apiGetFunctionAddress(LLVM, "LLVMAddNamedMetadataOperand"),
            GetDebugLocDirectory                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetDebugLocDirectory"),
            GetDebugLocFilename                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetDebugLocFilename"),
            GetDebugLocLine                            = apiGetFunctionAddressOptional(LLVM, "LLVMGetDebugLocLine"),
            GetDebugLocColumn                          = apiGetFunctionAddressOptional(LLVM, "LLVMGetDebugLocColumn"),
            AddFunction                                = apiGetFunctionAddress(LLVM, "LLVMAddFunction"),
            GetNamedFunction                           = apiGetFunctionAddress(LLVM, "LLVMGetNamedFunction"),
            GetNamedFunctionWithLength                 = apiGetFunctionAddressOptional(LLVM, "LLVMGetNamedFunctionWithLength"),
            GetFirstFunction                           = apiGetFunctionAddress(LLVM, "LLVMGetFirstFunction"),
            GetLastFunction                            = apiGetFunctionAddress(LLVM, "LLVMGetLastFunction"),
            GetNextFunction                            = apiGetFunctionAddress(LLVM, "LLVMGetNextFunction"),
            GetPreviousFunction                        = apiGetFunctionAddress(LLVM, "LLVMGetPreviousFunction"),
            SetModuleInlineAsm                         = apiGetFunctionAddressOptional(LLVM, "LLVMSetModuleInlineAsm"),
            GetTypeKind                                = apiGetFunctionAddress(LLVM, "LLVMGetTypeKind"),
            TypeIsSized                                = apiGetFunctionAddress(LLVM, "LLVMTypeIsSized"),
            GetTypeContext                             = apiGetFunctionAddress(LLVM, "LLVMGetTypeContext"),
            DumpType                                   = apiGetFunctionAddressOptional(LLVM, "LLVMDumpType"),
            PrintTypeToString                          = apiGetFunctionAddress(LLVM, "LLVMPrintTypeToString"),
            Int1TypeInContext                          = apiGetFunctionAddress(LLVM, "LLVMInt1TypeInContext"),
            Int8TypeInContext                          = apiGetFunctionAddress(LLVM, "LLVMInt8TypeInContext"),
            Int16TypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMInt16TypeInContext"),
            Int32TypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMInt32TypeInContext"),
            Int64TypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMInt64TypeInContext"),
            Int128TypeInContext                        = apiGetFunctionAddress(LLVM, "LLVMInt128TypeInContext"),
            IntTypeInContext                           = apiGetFunctionAddress(LLVM, "LLVMIntTypeInContext"),
            Int1Type                                   = apiGetFunctionAddress(LLVM, "LLVMInt1Type"),
            Int8Type                                   = apiGetFunctionAddress(LLVM, "LLVMInt8Type"),
            Int16Type                                  = apiGetFunctionAddress(LLVM, "LLVMInt16Type"),
            Int32Type                                  = apiGetFunctionAddress(LLVM, "LLVMInt32Type"),
            Int64Type                                  = apiGetFunctionAddress(LLVM, "LLVMInt64Type"),
            Int128Type                                 = apiGetFunctionAddress(LLVM, "LLVMInt128Type"),
            IntType                                    = apiGetFunctionAddress(LLVM, "LLVMIntType"),
            GetIntTypeWidth                            = apiGetFunctionAddress(LLVM, "LLVMGetIntTypeWidth"),
            HalfTypeInContext                          = apiGetFunctionAddress(LLVM, "LLVMHalfTypeInContext"),
            BFloatTypeInContext                        = apiGetFunctionAddressOptional(LLVM, "LLVMBFloatTypeInContext"),
            FloatTypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMFloatTypeInContext"),
            DoubleTypeInContext                        = apiGetFunctionAddress(LLVM, "LLVMDoubleTypeInContext"),
            X86FP80TypeInContext                       = apiGetFunctionAddress(LLVM, "LLVMX86FP80TypeInContext"),
            FP128TypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMFP128TypeInContext"),
            PPCFP128TypeInContext                      = apiGetFunctionAddress(LLVM, "LLVMPPCFP128TypeInContext"),
            HalfType                                   = apiGetFunctionAddress(LLVM, "LLVMHalfType"),
            BFloatType                                 = apiGetFunctionAddressOptional(LLVM, "LLVMBFloatType"),
            FloatType                                  = apiGetFunctionAddress(LLVM, "LLVMFloatType"),
            DoubleType                                 = apiGetFunctionAddress(LLVM, "LLVMDoubleType"),
            X86FP80Type                                = apiGetFunctionAddress(LLVM, "LLVMX86FP80Type"),
            FP128Type                                  = apiGetFunctionAddress(LLVM, "LLVMFP128Type"),
            PPCFP128Type                               = apiGetFunctionAddress(LLVM, "LLVMPPCFP128Type"),
            FunctionType                               = apiGetFunctionAddress(LLVM, "LLVMFunctionType"),
            IsFunctionVarArg                           = apiGetFunctionAddress(LLVM, "LLVMIsFunctionVarArg"),
            GetReturnType                              = apiGetFunctionAddress(LLVM, "LLVMGetReturnType"),
            CountParamTypes                            = apiGetFunctionAddress(LLVM, "LLVMCountParamTypes"),
            GetParamTypes                              = apiGetFunctionAddress(LLVM, "LLVMGetParamTypes"),
            StructTypeInContext                        = apiGetFunctionAddress(LLVM, "LLVMStructTypeInContext"),
            StructType                                 = apiGetFunctionAddress(LLVM, "LLVMStructType"),
            StructCreateNamed                          = apiGetFunctionAddress(LLVM, "LLVMStructCreateNamed"),
            GetStructName                              = apiGetFunctionAddress(LLVM, "LLVMGetStructName"),
            StructSetBody                              = apiGetFunctionAddress(LLVM, "LLVMStructSetBody"),
            CountStructElementTypes                    = apiGetFunctionAddress(LLVM, "LLVMCountStructElementTypes"),
            GetStructElementTypes                      = apiGetFunctionAddress(LLVM, "LLVMGetStructElementTypes"),
            StructGetTypeAtIndex                       = apiGetFunctionAddress(LLVM, "LLVMStructGetTypeAtIndex"),
            IsPackedStruct                             = apiGetFunctionAddress(LLVM, "LLVMIsPackedStruct"),
            IsOpaqueStruct                             = apiGetFunctionAddress(LLVM, "LLVMIsOpaqueStruct"),
            IsLiteralStruct                            = apiGetFunctionAddressOptional(LLVM, "LLVMIsLiteralStruct"),
            GetElementType                             = apiGetFunctionAddress(LLVM, "LLVMGetElementType"),
            GetSubtypes                                = apiGetFunctionAddress(LLVM, "LLVMGetSubtypes"),
            GetNumContainedTypes                       = apiGetFunctionAddress(LLVM, "LLVMGetNumContainedTypes"),
            ArrayType                                  = apiGetFunctionAddress(LLVM, "LLVMArrayType"),
            ArrayType2                                 = apiGetFunctionAddress(LLVM, "LLVMArrayType2"),
            GetArrayLength                             = apiGetFunctionAddress(LLVM, "LLVMGetArrayLength"),
            GetArrayLength2                            = apiGetFunctionAddress(LLVM, "LLVMGetArrayLength2"),
            PointerType                                = apiGetFunctionAddress(LLVM, "LLVMPointerType"),
            PointerTypeIsOpaque                        = apiGetFunctionAddressOptional(LLVM, "LLVMPointerTypeIsOpaque"),
            PointerTypeInContext                       = apiGetFunctionAddressOptional(LLVM, "LLVMPointerTypeInContext"),
            GetPointerAddressSpace                     = apiGetFunctionAddress(LLVM, "LLVMGetPointerAddressSpace"),
            VectorType                                 = apiGetFunctionAddress(LLVM, "LLVMVectorType"),
            ScalableVectorType                         = apiGetFunctionAddressOptional(LLVM, "LLVMScalableVectorType"),
            GetVectorSize                              = apiGetFunctionAddress(LLVM, "LLVMGetVectorSize"),
            GetConstantPtrAuthPointer                  = apiGetFunctionAddressOptional(LLVM, "LLVMGetConstantPtrAuthPointer"),
            GetConstantPtrAuthKey                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetConstantPtrAuthKey"),
            GetConstantPtrAuthDiscriminator            = apiGetFunctionAddressOptional(LLVM, "LLVMGetConstantPtrAuthDiscriminator"),
            GetConstantPtrAuthAddrDiscriminator        = apiGetFunctionAddressOptional(LLVM, "LLVMGetConstantPtrAuthAddrDiscriminator"),
            VoidTypeInContext                          = apiGetFunctionAddress(LLVM, "LLVMVoidTypeInContext"),
            LabelTypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMLabelTypeInContext"),
            X86MMXTypeInContext                        = apiGetFunctionAddressOptional(LLVM, "LLVMX86MMXTypeInContext"),
            X86AMXTypeInContext                        = apiGetFunctionAddressOptional(LLVM, "LLVMX86AMXTypeInContext"),
            TokenTypeInContext                         = apiGetFunctionAddressOptional(LLVM, "LLVMTokenTypeInContext"),
            MetadataTypeInContext                      = apiGetFunctionAddressOptional(LLVM, "LLVMMetadataTypeInContext"),
            VoidType                                   = apiGetFunctionAddress(LLVM, "LLVMVoidType"),
            LabelType                                  = apiGetFunctionAddress(LLVM, "LLVMLabelType"),
            X86MMXType                                 = apiGetFunctionAddressOptional(LLVM, "LLVMX86MMXType"),
            X86AMXType                                 = apiGetFunctionAddressOptional(LLVM, "LLVMX86AMXType"),
            TargetExtTypeInContext                     = apiGetFunctionAddressOptional(LLVM, "LLVMTargetExtTypeInContext"),
            GetTargetExtTypeName                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetTargetExtTypeName"),
            GetTargetExtTypeNumTypeParams              = apiGetFunctionAddressOptional(LLVM, "LLVMGetTargetExtTypeNumTypeParams"),
            GetTargetExtTypeTypeParam                  = apiGetFunctionAddressOptional(LLVM, "LLVMGetTargetExtTypeTypeParam"),
            GetTargetExtTypeNumIntParams               = apiGetFunctionAddressOptional(LLVM, "LLVMGetTargetExtTypeNumIntParams"),
            GetTargetExtTypeIntParam                   = apiGetFunctionAddressOptional(LLVM, "LLVMGetTargetExtTypeIntParam"),
            TypeOf                                     = apiGetFunctionAddress(LLVM, "LLVMTypeOf"),
            GetValueKind                               = apiGetFunctionAddress(LLVM, "LLVMGetValueKind"),
            GetValueName2                              = apiGetFunctionAddressOptional(LLVM, "LLVMGetValueName2"),
            SetValueName2                              = apiGetFunctionAddressOptional(LLVM, "LLVMSetValueName2"),
            DumpValue                                  = apiGetFunctionAddress(LLVM, "LLVMDumpValue"),
            PrintValueToString                         = apiGetFunctionAddress(LLVM, "LLVMPrintValueToString"),
            GetValueContext                            = apiGetFunctionAddressOptional(LLVM, "LLVMGetValueContext"),
            PrintDbgRecordToString                     = apiGetFunctionAddressOptional(LLVM, "LLVMPrintDbgRecordToString"),
            ReplaceAllUsesWith                         = apiGetFunctionAddress(LLVM, "LLVMReplaceAllUsesWith"),
            IsConstant                                 = apiGetFunctionAddress(LLVM, "LLVMIsConstant"),
            IsUndef                                    = apiGetFunctionAddress(LLVM, "LLVMIsUndef"),
            IsPoison                                   = apiGetFunctionAddressOptional(LLVM, "LLVMIsPoison"),
            IsAArgument                                = apiGetFunctionAddress(LLVM, "LLVMIsAArgument"),
            IsABasicBlock                              = apiGetFunctionAddress(LLVM, "LLVMIsABasicBlock"),
            IsAInlineAsm                               = apiGetFunctionAddress(LLVM, "LLVMIsAInlineAsm"),
            IsAUser                                    = apiGetFunctionAddress(LLVM, "LLVMIsAUser"),
            IsAConstant                                = apiGetFunctionAddress(LLVM, "LLVMIsAConstant"),
            IsABlockAddress                            = apiGetFunctionAddress(LLVM, "LLVMIsABlockAddress"),
            IsAConstantAggregateZero                   = apiGetFunctionAddress(LLVM, "LLVMIsAConstantAggregateZero"),
            IsAConstantArray                           = apiGetFunctionAddress(LLVM, "LLVMIsAConstantArray"),
            IsAConstantDataSequential                  = apiGetFunctionAddress(LLVM, "LLVMIsAConstantDataSequential"),
            IsAConstantDataArray                       = apiGetFunctionAddress(LLVM, "LLVMIsAConstantDataArray"),
            IsAConstantDataVector                      = apiGetFunctionAddress(LLVM, "LLVMIsAConstantDataVector"),
            IsAConstantExpr                            = apiGetFunctionAddress(LLVM, "LLVMIsAConstantExpr"),
            IsAConstantFP                              = apiGetFunctionAddress(LLVM, "LLVMIsAConstantFP"),
            IsAConstantInt                             = apiGetFunctionAddress(LLVM, "LLVMIsAConstantInt"),
            IsAConstantPointerNull                     = apiGetFunctionAddress(LLVM, "LLVMIsAConstantPointerNull"),
            IsAConstantStruct                          = apiGetFunctionAddress(LLVM, "LLVMIsAConstantStruct"),
            IsAConstantTokenNone                       = apiGetFunctionAddress(LLVM, "LLVMIsAConstantTokenNone"),
            IsAConstantVector                          = apiGetFunctionAddress(LLVM, "LLVMIsAConstantVector"),
            IsAGlobalValue                             = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalValue"),
            IsAGlobalAlias                             = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalAlias"),
            IsAGlobalObject                            = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalObject"),
            IsAFunction                                = apiGetFunctionAddress(LLVM, "LLVMIsAFunction"),
            IsAGlobalVariable                          = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalVariable"),
            IsAGlobalIFunc                             = apiGetFunctionAddressOptional(LLVM, "LLVMIsAGlobalIFunc"),
            IsAUndefValue                              = apiGetFunctionAddress(LLVM, "LLVMIsAUndefValue"),
            IsAPoisonValue                             = apiGetFunctionAddressOptional(LLVM, "LLVMIsAPoisonValue"),
            IsAInstruction                             = apiGetFunctionAddress(LLVM, "LLVMIsAInstruction"),
            IsAUnaryOperator                           = apiGetFunctionAddressOptional(LLVM, "LLVMIsAUnaryOperator"),
            IsABinaryOperator                          = apiGetFunctionAddress(LLVM, "LLVMIsABinaryOperator"),
            IsACallInst                                = apiGetFunctionAddress(LLVM, "LLVMIsACallInst"),
            IsAIntrinsicInst                           = apiGetFunctionAddress(LLVM, "LLVMIsAIntrinsicInst"),
            IsADbgInfoIntrinsic                        = apiGetFunctionAddress(LLVM, "LLVMIsADbgInfoIntrinsic"),
            IsADbgVariableIntrinsic                    = apiGetFunctionAddressOptional(LLVM, "LLVMIsADbgVariableIntrinsic"),
            IsADbgDeclareInst                          = apiGetFunctionAddress(LLVM, "LLVMIsADbgDeclareInst"),
            IsADbgLabelInst                            = apiGetFunctionAddressOptional(LLVM, "LLVMIsADbgLabelInst"),
            IsAMemIntrinsic                            = apiGetFunctionAddress(LLVM, "LLVMIsAMemIntrinsic"),
            IsAMemCpyInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAMemCpyInst"),
            IsAMemMoveInst                             = apiGetFunctionAddress(LLVM, "LLVMIsAMemMoveInst"),
            IsAMemSetInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAMemSetInst"),
            IsACmpInst                                 = apiGetFunctionAddress(LLVM, "LLVMIsACmpInst"),
            IsAFCmpInst                                = apiGetFunctionAddress(LLVM, "LLVMIsAFCmpInst"),
            IsAICmpInst                                = apiGetFunctionAddress(LLVM, "LLVMIsAICmpInst"),
            IsAExtractElementInst                      = apiGetFunctionAddress(LLVM, "LLVMIsAExtractElementInst"),
            IsAGetElementPtrInst                       = apiGetFunctionAddress(LLVM, "LLVMIsAGetElementPtrInst"),
            IsAInsertElementInst                       = apiGetFunctionAddress(LLVM, "LLVMIsAInsertElementInst"),
            IsAInsertValueInst                         = apiGetFunctionAddress(LLVM, "LLVMIsAInsertValueInst"),
            IsALandingPadInst                          = apiGetFunctionAddress(LLVM, "LLVMIsALandingPadInst"),
            IsAPHINode                                 = apiGetFunctionAddress(LLVM, "LLVMIsAPHINode"),
            IsASelectInst                              = apiGetFunctionAddress(LLVM, "LLVMIsASelectInst"),
            IsAShuffleVectorInst                       = apiGetFunctionAddress(LLVM, "LLVMIsAShuffleVectorInst"),
            IsAStoreInst                               = apiGetFunctionAddress(LLVM, "LLVMIsAStoreInst"),
            IsABranchInst                              = apiGetFunctionAddress(LLVM, "LLVMIsABranchInst"),
            IsAIndirectBrInst                          = apiGetFunctionAddress(LLVM, "LLVMIsAIndirectBrInst"),
            IsAInvokeInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAInvokeInst"),
            IsAReturnInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAReturnInst"),
            IsASwitchInst                              = apiGetFunctionAddress(LLVM, "LLVMIsASwitchInst"),
            IsAUnreachableInst                         = apiGetFunctionAddress(LLVM, "LLVMIsAUnreachableInst"),
            IsAResumeInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAResumeInst"),
            IsACleanupReturnInst                       = apiGetFunctionAddress(LLVM, "LLVMIsACleanupReturnInst"),
            IsACatchReturnInst                         = apiGetFunctionAddress(LLVM, "LLVMIsACatchReturnInst"),
            IsACatchSwitchInst                         = apiGetFunctionAddressOptional(LLVM, "LLVMIsACatchSwitchInst"),
            IsACallBrInst                              = apiGetFunctionAddressOptional(LLVM, "LLVMIsACallBrInst"),
            IsAFuncletPadInst                          = apiGetFunctionAddress(LLVM, "LLVMIsAFuncletPadInst"),
            IsACatchPadInst                            = apiGetFunctionAddress(LLVM, "LLVMIsACatchPadInst"),
            IsACleanupPadInst                          = apiGetFunctionAddress(LLVM, "LLVMIsACleanupPadInst"),
            IsAUnaryInstruction                        = apiGetFunctionAddress(LLVM, "LLVMIsAUnaryInstruction"),
            IsAAllocaInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAAllocaInst"),
            IsACastInst                                = apiGetFunctionAddress(LLVM, "LLVMIsACastInst"),
            IsAAddrSpaceCastInst                       = apiGetFunctionAddress(LLVM, "LLVMIsAAddrSpaceCastInst"),
            IsABitCastInst                             = apiGetFunctionAddress(LLVM, "LLVMIsABitCastInst"),
            IsAFPExtInst                               = apiGetFunctionAddress(LLVM, "LLVMIsAFPExtInst"),
            IsAFPToSIInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAFPToSIInst"),
            IsAFPToUIInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAFPToUIInst"),
            IsAFPTruncInst                             = apiGetFunctionAddress(LLVM, "LLVMIsAFPTruncInst"),
            IsAIntToPtrInst                            = apiGetFunctionAddress(LLVM, "LLVMIsAIntToPtrInst"),
            IsAPtrToIntInst                            = apiGetFunctionAddress(LLVM, "LLVMIsAPtrToIntInst"),
            IsASExtInst                                = apiGetFunctionAddress(LLVM, "LLVMIsASExtInst"),
            IsASIToFPInst                              = apiGetFunctionAddress(LLVM, "LLVMIsASIToFPInst"),
            IsATruncInst                               = apiGetFunctionAddress(LLVM, "LLVMIsATruncInst"),
            IsAUIToFPInst                              = apiGetFunctionAddress(LLVM, "LLVMIsAUIToFPInst"),
            IsAZExtInst                                = apiGetFunctionAddress(LLVM, "LLVMIsAZExtInst"),
            IsAExtractValueInst                        = apiGetFunctionAddress(LLVM, "LLVMIsAExtractValueInst"),
            IsALoadInst                                = apiGetFunctionAddress(LLVM, "LLVMIsALoadInst"),
            IsAVAArgInst                               = apiGetFunctionAddress(LLVM, "LLVMIsAVAArgInst"),
            IsAFreezeInst                              = apiGetFunctionAddressOptional(LLVM, "LLVMIsAFreezeInst"),
            IsAAtomicCmpXchgInst                       = apiGetFunctionAddressOptional(LLVM, "LLVMIsAAtomicCmpXchgInst"),
            IsAAtomicRMWInst                           = apiGetFunctionAddressOptional(LLVM, "LLVMIsAAtomicRMWInst"),
            IsAFenceInst                               = apiGetFunctionAddressOptional(LLVM, "LLVMIsAFenceInst"),
            IsAMDNode                                  = apiGetFunctionAddress(LLVM, "LLVMIsAMDNode"),
            IsAValueAsMetadata                         = apiGetFunctionAddressOptional(LLVM, "LLVMIsAValueAsMetadata"),
            IsAMDString                                = apiGetFunctionAddress(LLVM, "LLVMIsAMDString"),
            GetValueName                               = apiGetFunctionAddress(LLVM, "LLVMGetValueName"),
            SetValueName                               = apiGetFunctionAddress(LLVM, "LLVMSetValueName"),
            GetFirstUse                                = apiGetFunctionAddress(LLVM, "LLVMGetFirstUse"),
            GetNextUse                                 = apiGetFunctionAddress(LLVM, "LLVMGetNextUse"),
            GetUser                                    = apiGetFunctionAddress(LLVM, "LLVMGetUser"),
            GetUsedValue                               = apiGetFunctionAddress(LLVM, "LLVMGetUsedValue"),
            GetOperand                                 = apiGetFunctionAddress(LLVM, "LLVMGetOperand"),
            GetOperandUse                              = apiGetFunctionAddress(LLVM, "LLVMGetOperandUse"),
            SetOperand                                 = apiGetFunctionAddress(LLVM, "LLVMSetOperand"),
            GetNumOperands                             = apiGetFunctionAddress(LLVM, "LLVMGetNumOperands"),
            ConstNull                                  = apiGetFunctionAddress(LLVM, "LLVMConstNull"),
            ConstAllOnes                               = apiGetFunctionAddress(LLVM, "LLVMConstAllOnes"),
            GetUndef                                   = apiGetFunctionAddress(LLVM, "LLVMGetUndef"),
            GetPoison                                  = apiGetFunctionAddressOptional(LLVM, "LLVMGetPoison"),
            IsNull                                     = apiGetFunctionAddress(LLVM, "LLVMIsNull"),
            ConstPointerNull                           = apiGetFunctionAddress(LLVM, "LLVMConstPointerNull"),
            ConstInt                                   = apiGetFunctionAddress(LLVM, "LLVMConstInt"),
            ConstIntOfArbitraryPrecision               = apiGetFunctionAddress(LLVM, "LLVMConstIntOfArbitraryPrecision"),
            ConstIntOfString                           = apiGetFunctionAddress(LLVM, "LLVMConstIntOfString"),
            ConstIntOfStringAndSize                    = apiGetFunctionAddress(LLVM, "LLVMConstIntOfStringAndSize"),
            ConstReal                                  = apiGetFunctionAddress(LLVM, "LLVMConstReal"),
            ConstRealOfString                          = apiGetFunctionAddress(LLVM, "LLVMConstRealOfString"),
            ConstRealOfStringAndSize                   = apiGetFunctionAddress(LLVM, "LLVMConstRealOfStringAndSize"),
            ConstIntGetZExtValue                       = apiGetFunctionAddress(LLVM, "LLVMConstIntGetZExtValue"),
            ConstIntGetSExtValue                       = apiGetFunctionAddress(LLVM, "LLVMConstIntGetSExtValue"),
            ConstRealGetDouble                         = apiGetFunctionAddress(LLVM, "LLVMConstRealGetDouble"),
            ConstStringInContext                       = apiGetFunctionAddress(LLVM, "LLVMConstStringInContext"),
            ConstStringInContext2                      = apiGetFunctionAddressOptional(LLVM, "LLVMConstStringInContext2"),
            ConstString                                = apiGetFunctionAddress(LLVM, "LLVMConstString"),
            IsConstantString                           = apiGetFunctionAddress(LLVM, "LLVMIsConstantString"),
            GetAsString                                = apiGetFunctionAddress(LLVM, "LLVMGetAsString"),
            ConstStructInContext                       = apiGetFunctionAddress(LLVM, "LLVMConstStructInContext"),
            ConstStruct                                = apiGetFunctionAddress(LLVM, "LLVMConstStruct"),
            ConstArray                                 = apiGetFunctionAddress(LLVM, "LLVMConstArray"),
            ConstArray2                                = apiGetFunctionAddress(LLVM, "LLVMConstArray2"),
            ConstNamedStruct                           = apiGetFunctionAddress(LLVM, "LLVMConstNamedStruct"),
            GetAggregateElement                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetAggregateElement"),
            GetElementAsConstant                       = apiGetFunctionAddress(LLVM, "LLVMGetElementAsConstant"),
            ConstVector                                = apiGetFunctionAddress(LLVM, "LLVMConstVector"),
            ConstantPtrAuth                            = apiGetFunctionAddressOptional(LLVM, "LLVMConstantPtrAuth"),
            GetConstOpcode                             = apiGetFunctionAddress(LLVM, "LLVMGetConstOpcode"),
            AlignOf                                    = apiGetFunctionAddress(LLVM, "LLVMAlignOf"),
            SizeOf                                     = apiGetFunctionAddress(LLVM, "LLVMSizeOf"),
            ConstNeg                                   = apiGetFunctionAddress(LLVM, "LLVMConstNeg"),
            ConstNSWNeg                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWNeg"),
            ConstNUWNeg                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWNeg"),
            ConstFNeg                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstFNeg"),
            ConstNot                                   = apiGetFunctionAddress(LLVM, "LLVMConstNot"),
            ConstAdd                                   = apiGetFunctionAddress(LLVM, "LLVMConstAdd"),
            ConstNSWAdd                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWAdd"),
            ConstNUWAdd                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWAdd"),
            ConstFAdd                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstFAdd"),
            ConstSub                                   = apiGetFunctionAddress(LLVM, "LLVMConstSub"),
            ConstNSWSub                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWSub"),
            ConstNUWSub                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWSub"),
            ConstFSub                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstFSub"),
            ConstMul                                   = apiGetFunctionAddress(LLVM, "LLVMConstMul"),
            ConstNSWMul                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWMul"),
            ConstNUWMul                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWMul"),
            ConstFMul                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstFMul"),
            ConstUDiv                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstUDiv"),
            ConstExactUDiv                             = apiGetFunctionAddressOptional(LLVM, "LLVMConstExactUDiv"),
            ConstSDiv                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstSDiv"),
            ConstExactSDiv                             = apiGetFunctionAddressOptional(LLVM, "LLVMConstExactSDiv"),
            ConstFDiv                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstFDiv"),
            ConstURem                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstURem"),
            ConstSRem                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstSRem"),
            ConstFRem                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstFRem"),
            ConstAnd                                   = apiGetFunctionAddressOptional(LLVM, "LLVMConstAnd"),
            ConstOr                                    = apiGetFunctionAddressOptional(LLVM, "LLVMConstOr"),
            ConstXor                                   = apiGetFunctionAddress(LLVM, "LLVMConstXor"),
            ConstICmp                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstICmp"),
            ConstFCmp                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstFCmp"),
            ConstShl                                   = apiGetFunctionAddressOptional(LLVM, "LLVMConstShl"),
            ConstLShr                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstLShr"),
            ConstAShr                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstAShr"),
            ConstGEP                                   = apiGetFunctionAddressOptional(LLVM, "LLVMConstGEP"),
            ConstGEP2                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstGEP2"),
            ConstInBoundsGEP                           = apiGetFunctionAddressOptional(LLVM, "LLVMConstInBoundsGEP"),
            ConstInBoundsGEP2                          = apiGetFunctionAddressOptional(LLVM, "LLVMConstInBoundsGEP2"),
            ConstInBoundsGEPWithNoWrapFlags            = apiGetFunctionAddressOptional(LLVM, "LLVMConstInBoundsGEPWithNoWrapFlags"),
            ConstTrunc                                 = apiGetFunctionAddress(LLVM, "LLVMConstTrunc"),
            ConstSExt                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstSExt"),
            ConstZExt                                  = apiGetFunctionAddressOptional(LLVM, "LLVMConstZExt"),
            ConstFPTrunc                               = apiGetFunctionAddressOptional(LLVM, "LLVMConstFPTrunc"),
            ConstFPExt                                 = apiGetFunctionAddressOptional(LLVM, "LLVMConstFPExt"),
            ConstUIToFP                                = apiGetFunctionAddressOptional(LLVM, "LLVMConstUIToFP"),
            ConstSIToFP                                = apiGetFunctionAddressOptional(LLVM, "LLVMConstSIToFP"),
            ConstFPToUI                                = apiGetFunctionAddressOptional(LLVM, "LLVMConstFPToUI"),
            ConstFPToSI                                = apiGetFunctionAddressOptional(LLVM, "LLVMConstFPToSI"),
            ConstPtrToInt                              = apiGetFunctionAddress(LLVM, "LLVMConstPtrToInt"),
            ConstIntToPtr                              = apiGetFunctionAddress(LLVM, "LLVMConstIntToPtr"),
            ConstBitCast                               = apiGetFunctionAddress(LLVM, "LLVMConstBitCast"),
            ConstAddrSpaceCast                         = apiGetFunctionAddress(LLVM, "LLVMConstAddrSpaceCast"),
            ConstZExtOrBitCast                         = apiGetFunctionAddressOptional(LLVM, "LLVMConstZExtOrBitCast"),
            ConstSExtOrBitCast                         = apiGetFunctionAddressOptional(LLVM, "LLVMConstSExtOrBitCast"),
            ConstTruncOrBitCast                        = apiGetFunctionAddress(LLVM, "LLVMConstTruncOrBitCast"),
            ConstPointerCast                           = apiGetFunctionAddress(LLVM, "LLVMConstPointerCast"),
            ConstIntCast                               = apiGetFunctionAddressOptional(LLVM, "LLVMConstIntCast"),
            ConstFPCast                                = apiGetFunctionAddressOptional(LLVM, "LLVMConstFPCast"),
            ConstSelect                                = apiGetFunctionAddressOptional(LLVM, "LLVMConstSelect"),
            ConstExtractElement                        = apiGetFunctionAddress(LLVM, "LLVMConstExtractElement"),
            ConstInsertElement                         = apiGetFunctionAddress(LLVM, "LLVMConstInsertElement"),
            ConstShuffleVector                         = apiGetFunctionAddress(LLVM, "LLVMConstShuffleVector"),
            ConstExtractValue                          = apiGetFunctionAddressOptional(LLVM, "LLVMConstExtractValue"),
            ConstInsertValue                           = apiGetFunctionAddressOptional(LLVM, "LLVMConstInsertValue"),
            BlockAddress                               = apiGetFunctionAddressOptional(LLVM, "LLVMBlockAddress"),
            GetBlockAddressFunction                    = apiGetFunctionAddressOptional(LLVM, "LLVMGetBlockAddressFunction"),
            GetBlockAddressBasicBlock                  = apiGetFunctionAddressOptional(LLVM, "LLVMGetBlockAddressBasicBlock"),
            ConstInlineAsm                             = apiGetFunctionAddress(LLVM, "LLVMConstInlineAsm"),
            GetGlobalParent                            = apiGetFunctionAddress(LLVM, "LLVMGetGlobalParent"),
            IsDeclaration                              = apiGetFunctionAddress(LLVM, "LLVMIsDeclaration"),
            GetLinkage                                 = apiGetFunctionAddress(LLVM, "LLVMGetLinkage"),
            SetLinkage                                 = apiGetFunctionAddress(LLVM, "LLVMSetLinkage"),
            GetSection                                 = apiGetFunctionAddress(LLVM, "LLVMGetSection"),
            SetSection                                 = apiGetFunctionAddress(LLVM, "LLVMSetSection"),
            GetVisibility                              = apiGetFunctionAddress(LLVM, "LLVMGetVisibility"),
            SetVisibility                              = apiGetFunctionAddress(LLVM, "LLVMSetVisibility"),
            GetDLLStorageClass                         = apiGetFunctionAddress(LLVM, "LLVMGetDLLStorageClass"),
            SetDLLStorageClass                         = apiGetFunctionAddress(LLVM, "LLVMSetDLLStorageClass"),
            GetUnnamedAddress                          = apiGetFunctionAddressOptional(LLVM, "LLVMGetUnnamedAddress"),
            SetUnnamedAddress                          = apiGetFunctionAddressOptional(LLVM, "LLVMSetUnnamedAddress"),
            GlobalGetValueType                         = apiGetFunctionAddressOptional(LLVM, "LLVMGlobalGetValueType"),
            HasUnnamedAddr                             = apiGetFunctionAddress(LLVM, "LLVMHasUnnamedAddr"),
            SetUnnamedAddr                             = apiGetFunctionAddress(LLVM, "LLVMSetUnnamedAddr"),
            GetAlignment                               = apiGetFunctionAddress(LLVM, "LLVMGetAlignment"),
            SetAlignment                               = apiGetFunctionAddress(LLVM, "LLVMSetAlignment"),
            GlobalSetMetadata                          = apiGetFunctionAddressOptional(LLVM, "LLVMGlobalSetMetadata"),
            GlobalEraseMetadata                        = apiGetFunctionAddressOptional(LLVM, "LLVMGlobalEraseMetadata"),
            GlobalClearMetadata                        = apiGetFunctionAddressOptional(LLVM, "LLVMGlobalClearMetadata"),
            GlobalCopyAllMetadata                      = apiGetFunctionAddressOptional(LLVM, "LLVMGlobalCopyAllMetadata"),
            DisposeValueMetadataEntries                = apiGetFunctionAddressOptional(LLVM, "LLVMDisposeValueMetadataEntries"),
            ValueMetadataEntriesGetKind                = apiGetFunctionAddressOptional(LLVM, "LLVMValueMetadataEntriesGetKind"),
            ValueMetadataEntriesGetMetadata            = apiGetFunctionAddressOptional(LLVM, "LLVMValueMetadataEntriesGetMetadata"),
            AddGlobal                                  = apiGetFunctionAddress(LLVM, "LLVMAddGlobal"),
            AddGlobalInAddressSpace                    = apiGetFunctionAddress(LLVM, "LLVMAddGlobalInAddressSpace"),
            GetNamedGlobal                             = apiGetFunctionAddress(LLVM, "LLVMGetNamedGlobal"),
            GetNamedGlobalWithLength                   = apiGetFunctionAddressOptional(LLVM, "LLVMGetNamedGlobalWithLength"),
            GetFirstGlobal                             = apiGetFunctionAddress(LLVM, "LLVMGetFirstGlobal"),
            GetLastGlobal                              = apiGetFunctionAddress(LLVM, "LLVMGetLastGlobal"),
            GetNextGlobal                              = apiGetFunctionAddress(LLVM, "LLVMGetNextGlobal"),
            GetPreviousGlobal                          = apiGetFunctionAddress(LLVM, "LLVMGetPreviousGlobal"),
            DeleteGlobal                               = apiGetFunctionAddress(LLVM, "LLVMDeleteGlobal"),
            GetInitializer                             = apiGetFunctionAddress(LLVM, "LLVMGetInitializer"),
            SetInitializer                             = apiGetFunctionAddress(LLVM, "LLVMSetInitializer"),
            IsThreadLocal                              = apiGetFunctionAddress(LLVM, "LLVMIsThreadLocal"),
            SetThreadLocal                             = apiGetFunctionAddress(LLVM, "LLVMSetThreadLocal"),
            IsGlobalConstant                           = apiGetFunctionAddress(LLVM, "LLVMIsGlobalConstant"),
            SetGlobalConstant                          = apiGetFunctionAddress(LLVM, "LLVMSetGlobalConstant"),
            GetThreadLocalMode                         = apiGetFunctionAddress(LLVM, "LLVMGetThreadLocalMode"),
            SetThreadLocalMode                         = apiGetFunctionAddress(LLVM, "LLVMSetThreadLocalMode"),
            IsExternallyInitialized                    = apiGetFunctionAddress(LLVM, "LLVMIsExternallyInitialized"),
            SetExternallyInitialized                   = apiGetFunctionAddress(LLVM, "LLVMSetExternallyInitialized"),
            AddAlias                                   = apiGetFunctionAddressOptional(LLVM, "LLVMAddAlias"),
            AddAlias2                                  = apiGetFunctionAddressOptional(LLVM, "LLVMAddAlias2"),
            GetNamedGlobalAlias                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetNamedGlobalAlias"),
            GetFirstGlobalAlias                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetFirstGlobalAlias"),
            GetLastGlobalAlias                         = apiGetFunctionAddressOptional(LLVM, "LLVMGetLastGlobalAlias"),
            GetNextGlobalAlias                         = apiGetFunctionAddressOptional(LLVM, "LLVMGetNextGlobalAlias"),
            GetPreviousGlobalAlias                     = apiGetFunctionAddressOptional(LLVM, "LLVMGetPreviousGlobalAlias"),
            AliasGetAliasee                            = apiGetFunctionAddressOptional(LLVM, "LLVMAliasGetAliasee"),
            AliasSetAliasee                            = apiGetFunctionAddressOptional(LLVM, "LLVMAliasSetAliasee"),
            DeleteFunction                             = apiGetFunctionAddress(LLVM, "LLVMDeleteFunction"),
            HasPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMHasPersonalityFn"),
            GetPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMGetPersonalityFn"),
            SetPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMSetPersonalityFn"),
            LookupIntrinsicID                          = apiGetFunctionAddressOptional(LLVM, "LLVMLookupIntrinsicID"),
            GetIntrinsicID                             = apiGetFunctionAddress(LLVM, "LLVMGetIntrinsicID"),
            GetIntrinsicDeclaration                    = apiGetFunctionAddressOptional(LLVM, "LLVMGetIntrinsicDeclaration"),
            IntrinsicGetType                           = apiGetFunctionAddressOptional(LLVM, "LLVMIntrinsicGetType"),
            IntrinsicGetName                           = apiGetFunctionAddressOptional(LLVM, "LLVMIntrinsicGetName"),
            IntrinsicCopyOverloadedName                = apiGetFunctionAddressOptional(LLVM, "LLVMIntrinsicCopyOverloadedName"),
            IntrinsicCopyOverloadedName2               = apiGetFunctionAddressOptional(LLVM, "LLVMIntrinsicCopyOverloadedName2"),
            IntrinsicIsOverloaded                      = apiGetFunctionAddressOptional(LLVM, "LLVMIntrinsicIsOverloaded"),
            GetFunctionCallConv                        = apiGetFunctionAddress(LLVM, "LLVMGetFunctionCallConv"),
            SetFunctionCallConv                        = apiGetFunctionAddress(LLVM, "LLVMSetFunctionCallConv"),
            GetGC                                      = apiGetFunctionAddress(LLVM, "LLVMGetGC"),
            SetGC                                      = apiGetFunctionAddress(LLVM, "LLVMSetGC"),
            GetPrefixData                              = apiGetFunctionAddressOptional(LLVM, "LLVMGetPrefixData"),
            HasPrefixData                              = apiGetFunctionAddressOptional(LLVM, "LLVMHasPrefixData"),
            SetPrefixData                              = apiGetFunctionAddressOptional(LLVM, "LLVMSetPrefixData"),
            GetPrologueData                            = apiGetFunctionAddressOptional(LLVM, "LLVMGetPrologueData"),
            HasPrologueData                            = apiGetFunctionAddressOptional(LLVM, "LLVMHasPrologueData"),
            SetPrologueData                            = apiGetFunctionAddressOptional(LLVM, "LLVMSetPrologueData"),
            AddAttributeAtIndex                        = apiGetFunctionAddress(LLVM, "LLVMAddAttributeAtIndex"),
            GetAttributeCountAtIndex                   = apiGetFunctionAddress(LLVM, "LLVMGetAttributeCountAtIndex"),
            GetAttributesAtIndex                       = apiGetFunctionAddress(LLVM, "LLVMGetAttributesAtIndex"),
            GetEnumAttributeAtIndex                    = apiGetFunctionAddress(LLVM, "LLVMGetEnumAttributeAtIndex"),
            GetStringAttributeAtIndex                  = apiGetFunctionAddress(LLVM, "LLVMGetStringAttributeAtIndex"),
            RemoveEnumAttributeAtIndex                 = apiGetFunctionAddress(LLVM, "LLVMRemoveEnumAttributeAtIndex"),
            RemoveStringAttributeAtIndex               = apiGetFunctionAddress(LLVM, "LLVMRemoveStringAttributeAtIndex"),
            AddTargetDependentFunctionAttr             = apiGetFunctionAddress(LLVM, "LLVMAddTargetDependentFunctionAttr"),
            CountParams                                = apiGetFunctionAddress(LLVM, "LLVMCountParams"),
            GetParams                                  = apiGetFunctionAddress(LLVM, "LLVMGetParams"),
            GetParam                                   = apiGetFunctionAddress(LLVM, "LLVMGetParam"),
            GetParamParent                             = apiGetFunctionAddress(LLVM, "LLVMGetParamParent"),
            GetFirstParam                              = apiGetFunctionAddress(LLVM, "LLVMGetFirstParam"),
            GetLastParam                               = apiGetFunctionAddress(LLVM, "LLVMGetLastParam"),
            GetNextParam                               = apiGetFunctionAddress(LLVM, "LLVMGetNextParam"),
            GetPreviousParam                           = apiGetFunctionAddress(LLVM, "LLVMGetPreviousParam"),
            SetParamAlignment                          = apiGetFunctionAddress(LLVM, "LLVMSetParamAlignment"),
            AddGlobalIFunc                             = apiGetFunctionAddressOptional(LLVM, "LLVMAddGlobalIFunc"),
            GetNamedGlobalIFunc                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetNamedGlobalIFunc"),
            GetFirstGlobalIFunc                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetFirstGlobalIFunc"),
            GetLastGlobalIFunc                         = apiGetFunctionAddressOptional(LLVM, "LLVMGetLastGlobalIFunc"),
            GetNextGlobalIFunc                         = apiGetFunctionAddressOptional(LLVM, "LLVMGetNextGlobalIFunc"),
            GetPreviousGlobalIFunc                     = apiGetFunctionAddressOptional(LLVM, "LLVMGetPreviousGlobalIFunc"),
            GetGlobalIFuncResolver                     = apiGetFunctionAddressOptional(LLVM, "LLVMGetGlobalIFuncResolver"),
            SetGlobalIFuncResolver                     = apiGetFunctionAddressOptional(LLVM, "LLVMSetGlobalIFuncResolver"),
            EraseGlobalIFunc                           = apiGetFunctionAddressOptional(LLVM, "LLVMEraseGlobalIFunc"),
            RemoveGlobalIFunc                          = apiGetFunctionAddressOptional(LLVM, "LLVMRemoveGlobalIFunc"),
            MDStringInContext2                         = apiGetFunctionAddressOptional(LLVM, "LLVMMDStringInContext2"),
            MDNodeInContext2                           = apiGetFunctionAddressOptional(LLVM, "LLVMMDNodeInContext2"),
            MDStringInContext                          = apiGetFunctionAddress(LLVM, "LLVMMDStringInContext"),
            MDString                                   = apiGetFunctionAddress(LLVM, "LLVMMDString"),
            MDNodeInContext                            = apiGetFunctionAddress(LLVM, "LLVMMDNodeInContext"),
            MDNode                                     = apiGetFunctionAddress(LLVM, "LLVMMDNode"),
            CreateOperandBundle                        = apiGetFunctionAddressOptional(LLVM, "LLVMCreateOperandBundle"),
            DisposeOperandBundle                       = apiGetFunctionAddressOptional(LLVM, "LLVMDisposeOperandBundle"),
            GetOperandBundleTag                        = apiGetFunctionAddressOptional(LLVM, "LLVMGetOperandBundleTag"),
            GetNumOperandBundleArgs                    = apiGetFunctionAddressOptional(LLVM, "LLVMGetNumOperandBundleArgs"),
            GetOperandBundleArgAtIndex                 = apiGetFunctionAddressOptional(LLVM, "LLVMGetOperandBundleArgAtIndex"),
            MetadataAsValue                            = apiGetFunctionAddress(LLVM, "LLVMMetadataAsValue"),
            ValueAsMetadata                            = apiGetFunctionAddress(LLVM, "LLVMValueAsMetadata"),
            GetMDString                                = apiGetFunctionAddress(LLVM, "LLVMGetMDString"),
            GetMDNodeNumOperands                       = apiGetFunctionAddress(LLVM, "LLVMGetMDNodeNumOperands"),
            GetMDNodeOperands                          = apiGetFunctionAddress(LLVM, "LLVMGetMDNodeOperands"),
            ReplaceMDNodeOperandWith                   = apiGetFunctionAddress(LLVM, "LLVMReplaceMDNodeOperandWith"),
            BasicBlockAsValue                          = apiGetFunctionAddress(LLVM, "LLVMBasicBlockAsValue"),
            ValueIsBasicBlock                          = apiGetFunctionAddress(LLVM, "LLVMValueIsBasicBlock"),
            ValueAsBasicBlock                          = apiGetFunctionAddress(LLVM, "LLVMValueAsBasicBlock"),
            GetBasicBlockName                          = apiGetFunctionAddress(LLVM, "LLVMGetBasicBlockName"),
            GetBasicBlockParent                        = apiGetFunctionAddress(LLVM, "LLVMGetBasicBlockParent"),
            GetBasicBlockTerminator                    = apiGetFunctionAddress(LLVM, "LLVMGetBasicBlockTerminator"),
            CountBasicBlocks                           = apiGetFunctionAddress(LLVM, "LLVMCountBasicBlocks"),
            GetBasicBlocks                             = apiGetFunctionAddress(LLVM, "LLVMGetBasicBlocks"),
            GetFirstBasicBlock                         = apiGetFunctionAddress(LLVM, "LLVMGetFirstBasicBlock"),
            GetLastBasicBlock                          = apiGetFunctionAddress(LLVM, "LLVMGetLastBasicBlock"),
            GetNextBasicBlock                          = apiGetFunctionAddress(LLVM, "LLVMGetNextBasicBlock"),
            GetPreviousBasicBlock                      = apiGetFunctionAddress(LLVM, "LLVMGetPreviousBasicBlock"),
            GetEntryBasicBlock                         = apiGetFunctionAddress(LLVM, "LLVMGetEntryBasicBlock"),
            InsertExistingBasicBlockAfterInsertBlock   = apiGetFunctionAddressOptional(LLVM, "LLVMInsertExistingBasicBlockAfterInsertBlock"),
            AppendExistingBasicBlock                   = apiGetFunctionAddressOptional(LLVM, "LLVMAppendExistingBasicBlock"),
            CreateBasicBlockInContext                  = apiGetFunctionAddressOptional(LLVM, "LLVMCreateBasicBlockInContext"),
            AppendBasicBlockInContext                  = apiGetFunctionAddress(LLVM, "LLVMAppendBasicBlockInContext"),
            AppendBasicBlock                           = apiGetFunctionAddress(LLVM, "LLVMAppendBasicBlock"),
            InsertBasicBlockInContext                  = apiGetFunctionAddress(LLVM, "LLVMInsertBasicBlockInContext"),
            InsertBasicBlock                           = apiGetFunctionAddress(LLVM, "LLVMInsertBasicBlock"),
            DeleteBasicBlock                           = apiGetFunctionAddress(LLVM, "LLVMDeleteBasicBlock"),
            RemoveBasicBlockFromParent                 = apiGetFunctionAddress(LLVM, "LLVMRemoveBasicBlockFromParent"),
            MoveBasicBlockBefore                       = apiGetFunctionAddress(LLVM, "LLVMMoveBasicBlockBefore"),
            MoveBasicBlockAfter                        = apiGetFunctionAddress(LLVM, "LLVMMoveBasicBlockAfter"),
            GetFirstInstruction                        = apiGetFunctionAddress(LLVM, "LLVMGetFirstInstruction"),
            GetLastInstruction                         = apiGetFunctionAddress(LLVM, "LLVMGetLastInstruction"),
            HasMetadata                                = apiGetFunctionAddress(LLVM, "LLVMHasMetadata"),
            GetMetadata                                = apiGetFunctionAddress(LLVM, "LLVMGetMetadata"),
            SetMetadata                                = apiGetFunctionAddress(LLVM, "LLVMSetMetadata"),
            InstructionGetAllMetadataOtherThanDebugLoc = apiGetFunctionAddressOptional(LLVM, "LLVMInstructionGetAllMetadataOtherThanDebugLoc"),
            GetInstructionParent                       = apiGetFunctionAddress(LLVM, "LLVMGetInstructionParent"),
            GetNextInstruction                         = apiGetFunctionAddress(LLVM, "LLVMGetNextInstruction"),
            GetPreviousInstruction                     = apiGetFunctionAddress(LLVM, "LLVMGetPreviousInstruction"),
            InstructionRemoveFromParent                = apiGetFunctionAddress(LLVM, "LLVMInstructionRemoveFromParent"),
            InstructionEraseFromParent                 = apiGetFunctionAddress(LLVM, "LLVMInstructionEraseFromParent"),
            DeleteInstruction                          = apiGetFunctionAddressOptional(LLVM, "LLVMDeleteInstruction"),
            GetInstructionOpcode                       = apiGetFunctionAddress(LLVM, "LLVMGetInstructionOpcode"),
            GetICmpPredicate                           = apiGetFunctionAddress(LLVM, "LLVMGetICmpPredicate"),
            GetFCmpPredicate                           = apiGetFunctionAddress(LLVM, "LLVMGetFCmpPredicate"),
            InstructionClone                           = apiGetFunctionAddress(LLVM, "LLVMInstructionClone"),
            IsATerminatorInst                          = apiGetFunctionAddress(LLVM, "LLVMIsATerminatorInst"),
            GetFirstDbgRecord                          = apiGetFunctionAddressOptional(LLVM, "LLVMGetFirstDbgRecord"),
            GetLastDbgRecord                           = apiGetFunctionAddressOptional(LLVM, "LLVMGetLastDbgRecord"),
            GetNextDbgRecord                           = apiGetFunctionAddressOptional(LLVM, "LLVMGetNextDbgRecord"),
            GetPreviousDbgRecord                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetPreviousDbgRecord"),
            GetNumArgOperands                          = apiGetFunctionAddress(LLVM, "LLVMGetNumArgOperands"),
            SetInstructionCallConv                     = apiGetFunctionAddress(LLVM, "LLVMSetInstructionCallConv"),
            GetInstructionCallConv                     = apiGetFunctionAddress(LLVM, "LLVMGetInstructionCallConv"),
            SetInstrParamAlignment                     = apiGetFunctionAddress(LLVM, "LLVMSetInstrParamAlignment"),
            AddCallSiteAttribute                       = apiGetFunctionAddress(LLVM, "LLVMAddCallSiteAttribute"),
            GetCallSiteAttributeCount                  = apiGetFunctionAddress(LLVM, "LLVMGetCallSiteAttributeCount"),
            GetCallSiteAttributes                      = apiGetFunctionAddress(LLVM, "LLVMGetCallSiteAttributes"),
            GetCallSiteEnumAttribute                   = apiGetFunctionAddress(LLVM, "LLVMGetCallSiteEnumAttribute"),
            GetCallSiteStringAttribute                 = apiGetFunctionAddress(LLVM, "LLVMGetCallSiteStringAttribute"),
            RemoveCallSiteEnumAttribute                = apiGetFunctionAddress(LLVM, "LLVMRemoveCallSiteEnumAttribute"),
            RemoveCallSiteStringAttribute              = apiGetFunctionAddress(LLVM, "LLVMRemoveCallSiteStringAttribute"),
            GetCalledFunctionType                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetCalledFunctionType"),
            GetCalledValue                             = apiGetFunctionAddress(LLVM, "LLVMGetCalledValue"),
            GetNumOperandBundles                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetNumOperandBundles"),
            GetOperandBundleAtIndex                    = apiGetFunctionAddressOptional(LLVM, "LLVMGetOperandBundleAtIndex"),
            IsTailCall                                 = apiGetFunctionAddress(LLVM, "LLVMIsTailCall"),
            SetTailCall                                = apiGetFunctionAddress(LLVM, "LLVMSetTailCall"),
            GetTailCallKind                            = apiGetFunctionAddressOptional(LLVM, "LLVMGetTailCallKind"),
            SetTailCallKind                            = apiGetFunctionAddressOptional(LLVM, "LLVMSetTailCallKind"),
            GetNormalDest                              = apiGetFunctionAddress(LLVM, "LLVMGetNormalDest"),
            GetUnwindDest                              = apiGetFunctionAddress(LLVM, "LLVMGetUnwindDest"),
            SetNormalDest                              = apiGetFunctionAddress(LLVM, "LLVMSetNormalDest"),
            SetUnwindDest                              = apiGetFunctionAddress(LLVM, "LLVMSetUnwindDest"),
            GetCallBrDefaultDest                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetCallBrDefaultDest"),
            GetCallBrNumIndirectDests                  = apiGetFunctionAddressOptional(LLVM, "LLVMGetCallBrNumIndirectDests"),
            GetCallBrIndirectDest                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetCallBrIndirectDest"),
            GetNumSuccessors                           = apiGetFunctionAddress(LLVM, "LLVMGetNumSuccessors"),
            GetSuccessor                               = apiGetFunctionAddress(LLVM, "LLVMGetSuccessor"),
            SetSuccessor                               = apiGetFunctionAddress(LLVM, "LLVMSetSuccessor"),
            IsConditional                              = apiGetFunctionAddress(LLVM, "LLVMIsConditional"),
            GetCondition                               = apiGetFunctionAddress(LLVM, "LLVMGetCondition"),
            SetCondition                               = apiGetFunctionAddress(LLVM, "LLVMSetCondition"),
            GetSwitchDefaultDest                       = apiGetFunctionAddress(LLVM, "LLVMGetSwitchDefaultDest"),
            GetAllocatedType                           = apiGetFunctionAddress(LLVM, "LLVMGetAllocatedType"),
            IsInBounds                                 = apiGetFunctionAddress(LLVM, "LLVMIsInBounds"),
            SetIsInBounds                              = apiGetFunctionAddress(LLVM, "LLVMSetIsInBounds"),
            GetGEPSourceElementType                    = apiGetFunctionAddressOptional(LLVM, "LLVMGetGEPSourceElementType"),
            GEPGetNoWrapFlags                          = apiGetFunctionAddressOptional(LLVM, "LLVMGEPGetNoWrapFlags"),
            GEPSetNoWrapFlags                          = apiGetFunctionAddressOptional(LLVM, "LLVMGEPSetNoWrapFlags"),
            AddIncoming                                = apiGetFunctionAddress(LLVM, "LLVMAddIncoming"),
            CountIncoming                              = apiGetFunctionAddress(LLVM, "LLVMCountIncoming"),
            GetIncomingValue                           = apiGetFunctionAddress(LLVM, "LLVMGetIncomingValue"),
            GetIncomingBlock                           = apiGetFunctionAddress(LLVM, "LLVMGetIncomingBlock"),
            GetNumIndices                              = apiGetFunctionAddress(LLVM, "LLVMGetNumIndices"),
            GetIndices                                 = apiGetFunctionAddress(LLVM, "LLVMGetIndices"),
            CreateBuilderInContext                     = apiGetFunctionAddress(LLVM, "LLVMCreateBuilderInContext"),
            CreateBuilder                              = apiGetFunctionAddress(LLVM, "LLVMCreateBuilder"),
            PositionBuilder                            = apiGetFunctionAddress(LLVM, "LLVMPositionBuilder"),
            PositionBuilderBeforeDbgRecords            = apiGetFunctionAddressOptional(LLVM, "LLVMPositionBuilderBeforeDbgRecords"),
            PositionBuilderBefore                      = apiGetFunctionAddress(LLVM, "LLVMPositionBuilderBefore"),
            PositionBuilderBeforeInstrAndDbgRecords    = apiGetFunctionAddressOptional(LLVM, "LLVMPositionBuilderBeforeInstrAndDbgRecords"),
            PositionBuilderAtEnd                       = apiGetFunctionAddress(LLVM, "LLVMPositionBuilderAtEnd"),
            GetInsertBlock                             = apiGetFunctionAddress(LLVM, "LLVMGetInsertBlock"),
            ClearInsertionPosition                     = apiGetFunctionAddress(LLVM, "LLVMClearInsertionPosition"),
            InsertIntoBuilder                          = apiGetFunctionAddress(LLVM, "LLVMInsertIntoBuilder"),
            InsertIntoBuilderWithName                  = apiGetFunctionAddress(LLVM, "LLVMInsertIntoBuilderWithName"),
            DisposeBuilder                             = apiGetFunctionAddress(LLVM, "LLVMDisposeBuilder"),
            GetCurrentDebugLocation2                   = apiGetFunctionAddressOptional(LLVM, "LLVMGetCurrentDebugLocation2"),
            SetCurrentDebugLocation2                   = apiGetFunctionAddressOptional(LLVM, "LLVMSetCurrentDebugLocation2"),
            SetInstDebugLocation                       = apiGetFunctionAddressOptional(LLVM, "LLVMSetInstDebugLocation"),
            AddMetadataToInst                          = apiGetFunctionAddressOptional(LLVM, "LLVMAddMetadataToInst"),
            BuilderGetDefaultFPMathTag                 = apiGetFunctionAddressOptional(LLVM, "LLVMBuilderGetDefaultFPMathTag"),
            BuilderSetDefaultFPMathTag                 = apiGetFunctionAddressOptional(LLVM, "LLVMBuilderSetDefaultFPMathTag"),
            GetBuilderContext                          = apiGetFunctionAddressOptional(LLVM, "LLVMGetBuilderContext"),
            SetCurrentDebugLocation                    = apiGetFunctionAddress(LLVM, "LLVMSetCurrentDebugLocation"),
            GetCurrentDebugLocation                    = apiGetFunctionAddress(LLVM, "LLVMGetCurrentDebugLocation"),
            BuildRetVoid                               = apiGetFunctionAddress(LLVM, "LLVMBuildRetVoid"),
            BuildRet                                   = apiGetFunctionAddress(LLVM, "LLVMBuildRet"),
            BuildAggregateRet                          = apiGetFunctionAddress(LLVM, "LLVMBuildAggregateRet"),
            BuildBr                                    = apiGetFunctionAddress(LLVM, "LLVMBuildBr"),
            BuildCondBr                                = apiGetFunctionAddress(LLVM, "LLVMBuildCondBr"),
            BuildSwitch                                = apiGetFunctionAddress(LLVM, "LLVMBuildSwitch"),
            BuildIndirectBr                            = apiGetFunctionAddress(LLVM, "LLVMBuildIndirectBr"),
            BuildCallBr                                = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCallBr"),
            BuildInvoke                                = apiGetFunctionAddressOptional(LLVM, "LLVMBuildInvoke"),
            BuildInvoke2                               = apiGetFunctionAddressOptional(LLVM, "LLVMBuildInvoke2"),
            BuildInvokeWithOperandBundles              = apiGetFunctionAddressOptional(LLVM, "LLVMBuildInvokeWithOperandBundles"),
            BuildUnreachable                           = apiGetFunctionAddress(LLVM, "LLVMBuildUnreachable"),
            BuildResume                                = apiGetFunctionAddress(LLVM, "LLVMBuildResume"),
            BuildLandingPad                            = apiGetFunctionAddress(LLVM, "LLVMBuildLandingPad"),
            BuildCleanupRet                            = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCleanupRet"),
            BuildCatchRet                              = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCatchRet"),
            BuildCatchPad                              = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCatchPad"),
            BuildCleanupPad                            = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCleanupPad"),
            BuildCatchSwitch                           = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCatchSwitch"),
            AddCase                                    = apiGetFunctionAddress(LLVM, "LLVMAddCase"),
            AddDestination                             = apiGetFunctionAddress(LLVM, "LLVMAddDestination"),
            GetNumClauses                              = apiGetFunctionAddress(LLVM, "LLVMGetNumClauses"),
            GetClause                                  = apiGetFunctionAddress(LLVM, "LLVMGetClause"),
            AddClause                                  = apiGetFunctionAddress(LLVM, "LLVMAddClause"),
            IsCleanup                                  = apiGetFunctionAddress(LLVM, "LLVMIsCleanup"),
            SetCleanup                                 = apiGetFunctionAddress(LLVM, "LLVMSetCleanup"),
            AddHandler                                 = apiGetFunctionAddressOptional(LLVM, "LLVMAddHandler"),
            GetNumHandlers                             = apiGetFunctionAddressOptional(LLVM, "LLVMGetNumHandlers"),
            GetHandlers                                = apiGetFunctionAddressOptional(LLVM, "LLVMGetHandlers"),
            GetArgOperand                              = apiGetFunctionAddressOptional(LLVM, "LLVMGetArgOperand"),
            SetArgOperand                              = apiGetFunctionAddressOptional(LLVM, "LLVMSetArgOperand"),
            GetParentCatchSwitch                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetParentCatchSwitch"),
            SetParentCatchSwitch                       = apiGetFunctionAddressOptional(LLVM, "LLVMSetParentCatchSwitch"),
            BuildAdd                                   = apiGetFunctionAddress(LLVM, "LLVMBuildAdd"),
            BuildNSWAdd                                = apiGetFunctionAddress(LLVM, "LLVMBuildNSWAdd"),
            BuildNUWAdd                                = apiGetFunctionAddress(LLVM, "LLVMBuildNUWAdd"),
            BuildFAdd                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFAdd"),
            BuildSub                                   = apiGetFunctionAddress(LLVM, "LLVMBuildSub"),
            BuildNSWSub                                = apiGetFunctionAddress(LLVM, "LLVMBuildNSWSub"),
            BuildNUWSub                                = apiGetFunctionAddress(LLVM, "LLVMBuildNUWSub"),
            BuildFSub                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFSub"),
            BuildMul                                   = apiGetFunctionAddress(LLVM, "LLVMBuildMul"),
            BuildNSWMul                                = apiGetFunctionAddress(LLVM, "LLVMBuildNSWMul"),
            BuildNUWMul                                = apiGetFunctionAddress(LLVM, "LLVMBuildNUWMul"),
            BuildFMul                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFMul"),
            BuildUDiv                                  = apiGetFunctionAddress(LLVM, "LLVMBuildUDiv"),
            BuildExactUDiv                             = apiGetFunctionAddress(LLVM, "LLVMBuildExactUDiv"),
            BuildSDiv                                  = apiGetFunctionAddress(LLVM, "LLVMBuildSDiv"),
            BuildExactSDiv                             = apiGetFunctionAddress(LLVM, "LLVMBuildExactSDiv"),
            BuildFDiv                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFDiv"),
            BuildURem                                  = apiGetFunctionAddress(LLVM, "LLVMBuildURem"),
            BuildSRem                                  = apiGetFunctionAddress(LLVM, "LLVMBuildSRem"),
            BuildFRem                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFRem"),
            BuildShl                                   = apiGetFunctionAddress(LLVM, "LLVMBuildShl"),
            BuildLShr                                  = apiGetFunctionAddress(LLVM, "LLVMBuildLShr"),
            BuildAShr                                  = apiGetFunctionAddress(LLVM, "LLVMBuildAShr"),
            BuildAnd                                   = apiGetFunctionAddress(LLVM, "LLVMBuildAnd"),
            BuildOr                                    = apiGetFunctionAddress(LLVM, "LLVMBuildOr"),
            BuildXor                                   = apiGetFunctionAddress(LLVM, "LLVMBuildXor"),
            BuildBinOp                                 = apiGetFunctionAddress(LLVM, "LLVMBuildBinOp"),
            BuildNeg                                   = apiGetFunctionAddress(LLVM, "LLVMBuildNeg"),
            BuildNSWNeg                                = apiGetFunctionAddress(LLVM, "LLVMBuildNSWNeg"),
            BuildNUWNeg                                = apiGetFunctionAddress(LLVM, "LLVMBuildNUWNeg"),
            BuildFNeg                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFNeg"),
            GetNUW                                     = apiGetFunctionAddress(LLVM, "LLVMGetNUW"),
            SetNUW                                     = apiGetFunctionAddress(LLVM, "LLVMSetNUW"),
            GetNSW                                     = apiGetFunctionAddress(LLVM, "LLVMGetNSW"),
            SetNSW                                     = apiGetFunctionAddress(LLVM, "LLVMSetNSW"),
            GetExact                                   = apiGetFunctionAddress(LLVM, "LLVMGetExact"),
            SetExact                                   = apiGetFunctionAddress(LLVM, "LLVMSetExact"),
            GetNNeg                                    = apiGetFunctionAddressOptional(LLVM, "LLVMGetNNeg"),
            SetNNeg                                    = apiGetFunctionAddressOptional(LLVM, "LLVMSetNNeg"),
            GetFastMathFlags                           = apiGetFunctionAddressOptional(LLVM, "LLVMGetFastMathFlags"),
            SetFastMathFlags                           = apiGetFunctionAddressOptional(LLVM, "LLVMSetFastMathFlags"),
            CanValueUseFastMathFlags                   = apiGetFunctionAddressOptional(LLVM, "LLVMCanValueUseFastMathFlags"),
            GetIsDisjoint                              = apiGetFunctionAddressOptional(LLVM, "LLVMGetIsDisjoint"),
            SetIsDisjoint                              = apiGetFunctionAddressOptional(LLVM, "LLVMSetIsDisjoint"),
            BuildNot                                   = apiGetFunctionAddress(LLVM, "LLVMBuildNot"),
            BuildMalloc                                = apiGetFunctionAddress(LLVM, "LLVMBuildMalloc"),
            BuildArrayMalloc                           = apiGetFunctionAddress(LLVM, "LLVMBuildArrayMalloc"),
            BuildMemSet                                = apiGetFunctionAddressOptional(LLVM, "LLVMBuildMemSet"),
            BuildMemCpy                                = apiGetFunctionAddressOptional(LLVM, "LLVMBuildMemCpy"),
            BuildMemMove                               = apiGetFunctionAddressOptional(LLVM, "LLVMBuildMemMove"),
            BuildAlloca                                = apiGetFunctionAddress(LLVM, "LLVMBuildAlloca"),
            BuildArrayAlloca                           = apiGetFunctionAddress(LLVM, "LLVMBuildArrayAlloca"),
            BuildFree                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFree"),
            BuildLoad                                  = apiGetFunctionAddressOptional(LLVM, "LLVMBuildLoad"),
            BuildLoad2                                 = apiGetFunctionAddressOptional(LLVM, "LLVMBuildLoad2"),
            BuildStore                                 = apiGetFunctionAddress(LLVM, "LLVMBuildStore"),
            BuildGEP                                   = apiGetFunctionAddressOptional(LLVM, "LLVMBuildGEP"),
            BuildInBoundsGEP                           = apiGetFunctionAddressOptional(LLVM, "LLVMBuildInBoundsGEP"),
            BuildStructGEP                             = apiGetFunctionAddressOptional(LLVM, "LLVMBuildStructGEP"),
            BuildGEP2                                  = apiGetFunctionAddressOptional(LLVM, "LLVMBuildGEP2"),
            BuildInBoundsGEP2                          = apiGetFunctionAddressOptional(LLVM, "LLVMBuildInBoundsGEP2"),
            BuildGEPWithNoWrapFlags                    = apiGetFunctionAddressOptional(LLVM, "LLVMBuildGEPWithNoWrapFlags"),
            BuildStructGEP2                            = apiGetFunctionAddressOptional(LLVM, "LLVMBuildStructGEP2"),
            BuildGlobalString                          = apiGetFunctionAddress(LLVM, "LLVMBuildGlobalString"),
            BuildGlobalStringPtr                       = apiGetFunctionAddress(LLVM, "LLVMBuildGlobalStringPtr"),
            GetVolatile                                = apiGetFunctionAddress(LLVM, "LLVMGetVolatile"),
            SetVolatile                                = apiGetFunctionAddress(LLVM, "LLVMSetVolatile"),
            GetWeak                                    = apiGetFunctionAddressOptional(LLVM, "LLVMGetWeak"),
            SetWeak                                    = apiGetFunctionAddressOptional(LLVM, "LLVMSetWeak"),
            GetOrdering                                = apiGetFunctionAddress(LLVM, "LLVMGetOrdering"),
            SetOrdering                                = apiGetFunctionAddressOptional(LLVM, "LLVMSetOrdering"),
            GetAtomicRMWBinOp                          = apiGetFunctionAddressOptional(LLVM, "LLVMGetAtomicRMWBinOp"),
            SetAtomicRMWBinOp                          = apiGetFunctionAddressOptional(LLVM, "LLVMSetAtomicRMWBinOp"),
            BuildTrunc                                 = apiGetFunctionAddress(LLVM, "LLVMBuildTrunc"),
            BuildZExt                                  = apiGetFunctionAddress(LLVM, "LLVMBuildZExt"),
            BuildSExt                                  = apiGetFunctionAddress(LLVM, "LLVMBuildSExt"),
            BuildFPToUI                                = apiGetFunctionAddress(LLVM, "LLVMBuildFPToUI"),
            BuildFPToSI                                = apiGetFunctionAddress(LLVM, "LLVMBuildFPToSI"),
            BuildUIToFP                                = apiGetFunctionAddress(LLVM, "LLVMBuildUIToFP"),
            BuildSIToFP                                = apiGetFunctionAddress(LLVM, "LLVMBuildSIToFP"),
            BuildFPTrunc                               = apiGetFunctionAddress(LLVM, "LLVMBuildFPTrunc"),
            BuildFPExt                                 = apiGetFunctionAddress(LLVM, "LLVMBuildFPExt"),
            BuildPtrToInt                              = apiGetFunctionAddress(LLVM, "LLVMBuildPtrToInt"),
            BuildIntToPtr                              = apiGetFunctionAddress(LLVM, "LLVMBuildIntToPtr"),
            BuildBitCast                               = apiGetFunctionAddress(LLVM, "LLVMBuildBitCast"),
            BuildAddrSpaceCast                         = apiGetFunctionAddress(LLVM, "LLVMBuildAddrSpaceCast"),
            BuildZExtOrBitCast                         = apiGetFunctionAddress(LLVM, "LLVMBuildZExtOrBitCast"),
            BuildSExtOrBitCast                         = apiGetFunctionAddress(LLVM, "LLVMBuildSExtOrBitCast"),
            BuildTruncOrBitCast                        = apiGetFunctionAddress(LLVM, "LLVMBuildTruncOrBitCast"),
            BuildCast                                  = apiGetFunctionAddress(LLVM, "LLVMBuildCast"),
            BuildPointerCast                           = apiGetFunctionAddress(LLVM, "LLVMBuildPointerCast"),
            BuildIntCast2                              = apiGetFunctionAddressOptional(LLVM, "LLVMBuildIntCast2"),
            BuildIntCast                               = apiGetFunctionAddress(LLVM, "LLVMBuildIntCast"),
            GetCastOpcode                              = apiGetFunctionAddressOptional(LLVM, "LLVMGetCastOpcode"),
            BuildFPCast                                = apiGetFunctionAddress(LLVM, "LLVMBuildFPCast"),
            BuildICmp                                  = apiGetFunctionAddress(LLVM, "LLVMBuildICmp"),
            BuildFCmp                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFCmp"),
            BuildPhi                                   = apiGetFunctionAddress(LLVM, "LLVMBuildPhi"),
            BuildCall                                  = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCall"),
            BuildCall2                                 = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCall2"),
            BuildCallWithOperandBundles                = apiGetFunctionAddressOptional(LLVM, "LLVMBuildCallWithOperandBundles"),
            BuildSelect                                = apiGetFunctionAddress(LLVM, "LLVMBuildSelect"),
            BuildVAArg                                 = apiGetFunctionAddress(LLVM, "LLVMBuildVAArg"),
            BuildExtractElement                        = apiGetFunctionAddress(LLVM, "LLVMBuildExtractElement"),
            BuildInsertElement                         = apiGetFunctionAddress(LLVM, "LLVMBuildInsertElement"),
            BuildShuffleVector                         = apiGetFunctionAddress(LLVM, "LLVMBuildShuffleVector"),
            BuildExtractValue                          = apiGetFunctionAddress(LLVM, "LLVMBuildExtractValue"),
            BuildInsertValue                           = apiGetFunctionAddress(LLVM, "LLVMBuildInsertValue"),
            BuildFreeze                                = apiGetFunctionAddressOptional(LLVM, "LLVMBuildFreeze"),
            BuildIsNull                                = apiGetFunctionAddress(LLVM, "LLVMBuildIsNull"),
            BuildIsNotNull                             = apiGetFunctionAddress(LLVM, "LLVMBuildIsNotNull"),
            BuildPtrDiff                               = apiGetFunctionAddressOptional(LLVM, "LLVMBuildPtrDiff"),
            BuildPtrDiff2                              = apiGetFunctionAddressOptional(LLVM, "LLVMBuildPtrDiff2"),
            BuildFence                                 = apiGetFunctionAddress(LLVM, "LLVMBuildFence"),
            BuildFenceSyncScope                        = apiGetFunctionAddressOptional(LLVM, "LLVMBuildFenceSyncScope"),
            BuildAtomicRMW                             = apiGetFunctionAddress(LLVM, "LLVMBuildAtomicRMW"),
            BuildAtomicRMWSyncScope                    = apiGetFunctionAddressOptional(LLVM, "LLVMBuildAtomicRMWSyncScope"),
            BuildAtomicCmpXchg                         = apiGetFunctionAddress(LLVM, "LLVMBuildAtomicCmpXchg"),
            BuildAtomicCmpXchgSyncScope                = apiGetFunctionAddressOptional(LLVM, "LLVMBuildAtomicCmpXchgSyncScope"),
            GetNumMaskElements                         = apiGetFunctionAddressOptional(LLVM, "LLVMGetNumMaskElements"),
            GetUndefMaskElem                           = apiGetFunctionAddressOptional(LLVM, "LLVMGetUndefMaskElem"),
            GetMaskValue                               = apiGetFunctionAddressOptional(LLVM, "LLVMGetMaskValue"),
            IsAtomicSingleThread                       = apiGetFunctionAddress(LLVM, "LLVMIsAtomicSingleThread"),
            SetAtomicSingleThread                      = apiGetFunctionAddress(LLVM, "LLVMSetAtomicSingleThread"),
            IsAtomic                                   = apiGetFunctionAddressOptional(LLVM, "LLVMIsAtomic"),
            GetAtomicSyncScopeID                       = apiGetFunctionAddressOptional(LLVM, "LLVMGetAtomicSyncScopeID"),
            SetAtomicSyncScopeID                       = apiGetFunctionAddressOptional(LLVM, "LLVMSetAtomicSyncScopeID"),
            GetCmpXchgSuccessOrdering                  = apiGetFunctionAddress(LLVM, "LLVMGetCmpXchgSuccessOrdering"),
            SetCmpXchgSuccessOrdering                  = apiGetFunctionAddress(LLVM, "LLVMSetCmpXchgSuccessOrdering"),
            GetCmpXchgFailureOrdering                  = apiGetFunctionAddress(LLVM, "LLVMGetCmpXchgFailureOrdering"),
            SetCmpXchgFailureOrdering                  = apiGetFunctionAddress(LLVM, "LLVMSetCmpXchgFailureOrdering"),
            CreateModuleProviderForExistingModule      = apiGetFunctionAddress(LLVM, "LLVMCreateModuleProviderForExistingModule"),
            DisposeModuleProvider                      = apiGetFunctionAddress(LLVM, "LLVMDisposeModuleProvider"),
            CreateMemoryBufferWithContentsOfFile       = apiGetFunctionAddress(LLVM, "LLVMCreateMemoryBufferWithContentsOfFile"),
            CreateMemoryBufferWithSTDIN                = apiGetFunctionAddress(LLVM, "LLVMCreateMemoryBufferWithSTDIN"),
            CreateMemoryBufferWithMemoryRange          = apiGetFunctionAddress(LLVM, "LLVMCreateMemoryBufferWithMemoryRange"),
            CreateMemoryBufferWithMemoryRangeCopy      = apiGetFunctionAddress(LLVM, "LLVMCreateMemoryBufferWithMemoryRangeCopy"),
            GetBufferStart                             = apiGetFunctionAddress(LLVM, "LLVMGetBufferStart"),
            GetBufferSize                              = apiGetFunctionAddress(LLVM, "LLVMGetBufferSize"),
            DisposeMemoryBuffer                        = apiGetFunctionAddress(LLVM, "LLVMDisposeMemoryBuffer"),
            GetGlobalPassRegistry                      = apiGetFunctionAddressOptional(LLVM, "LLVMGetGlobalPassRegistry"),
            CreatePassManager                          = apiGetFunctionAddress(LLVM, "LLVMCreatePassManager"),
            CreateFunctionPassManagerForModule         = apiGetFunctionAddress(LLVM, "LLVMCreateFunctionPassManagerForModule"),
            CreateFunctionPassManager                  = apiGetFunctionAddress(LLVM, "LLVMCreateFunctionPassManager"),
            RunPassManager                             = apiGetFunctionAddress(LLVM, "LLVMRunPassManager"),
            InitializeFunctionPassManager              = apiGetFunctionAddress(LLVM, "LLVMInitializeFunctionPassManager"),
            RunFunctionPassManager                     = apiGetFunctionAddress(LLVM, "LLVMRunFunctionPassManager"),
            FinalizeFunctionPassManager                = apiGetFunctionAddress(LLVM, "LLVMFinalizeFunctionPassManager"),
            DisposePassManager                         = apiGetFunctionAddress(LLVM, "LLVMDisposePassManager"),
            StartMultithreaded                         = apiGetFunctionAddress(LLVM, "LLVMStartMultithreaded"),
            StopMultithreaded                          = apiGetFunctionAddress(LLVM, "LLVMStopMultithreaded"),
            IsMultithreaded                            = apiGetFunctionAddress(LLVM, "LLVMIsMultithreaded");

    }

    /** Returns the LLVM {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return LLVM;
    }

    public static final int
        LLVMRet            = 1,
        LLVMBr             = 2,
        LLVMSwitch         = 3,
        LLVMIndirectBr     = 4,
        LLVMInvoke         = 5,
        LLVMUnreachable    = 7,
        LLVMCallBr         = 67,
        LLVMFNeg           = 66,
        LLVMAdd            = 8,
        LLVMFAdd           = 9,
        LLVMSub            = 10,
        LLVMFSub           = 11,
        LLVMMul            = 12,
        LLVMFMul           = 13,
        LLVMUDiv           = 14,
        LLVMSDiv           = 15,
        LLVMFDiv           = 16,
        LLVMURem           = 17,
        LLVMSRem           = 18,
        LLVMFRem           = 19,
        LLVMShl            = 20,
        LLVMLShr           = 21,
        LLVMAShr           = 22,
        LLVMAnd            = 23,
        LLVMOr             = 24,
        LLVMXor            = 25,
        LLVMAlloca         = 26,
        LLVMLoad           = 27,
        LLVMStore          = 28,
        LLVMGetElementPtr  = 29,
        LLVMTrunc          = 30,
        LLVMZExt           = 31,
        LLVMSExt           = 32,
        LLVMFPToUI         = 33,
        LLVMFPToSI         = 34,
        LLVMUIToFP         = 35,
        LLVMSIToFP         = 36,
        LLVMFPTrunc        = 37,
        LLVMFPExt          = 38,
        LLVMPtrToInt       = 39,
        LLVMIntToPtr       = 40,
        LLVMBitCast        = 41,
        LLVMAddrSpaceCast  = 60,
        LLVMICmp           = 42,
        LLVMFCmp           = 43,
        LLVMPHI            = 44,
        LLVMCall           = 45,
        LLVMSelect         = 46,
        LLVMUserOp1        = 47,
        LLVMUserOp2        = 48,
        LLVMVAArg          = 49,
        LLVMExtractElement = 50,
        LLVMInsertElement  = 51,
        LLVMShuffleVector  = 52,
        LLVMExtractValue   = 53,
        LLVMInsertValue    = 54,
        LLVMFreeze         = 68,
        LLVMFence          = 55,
        LLVMAtomicCmpXchg  = 56,
        LLVMAtomicRMW      = 57,
        LLVMResume         = 58,
        LLVMLandingPad     = 59,
        LLVMCleanupRet     = 61,
        LLVMCatchRet       = 62,
        LLVMCatchPad       = 63,
        LLVMCleanupPad     = 64,
        LLVMCatchSwitch    = 65;

    public static final int
        LLVMVoidTypeKind           = 0,
        LLVMHalfTypeKind           = 1,
        LLVMFloatTypeKind          = 2,
        LLVMDoubleTypeKind         = 3,
        LLVMX86_FP80TypeKind       = 4,
        LLVMFP128TypeKind          = 5,
        LLVMPPC_FP128TypeKind      = 6,
        LLVMLabelTypeKind          = 7,
        LLVMIntegerTypeKind        = 8,
        LLVMFunctionTypeKind       = 9,
        LLVMStructTypeKind         = 10,
        LLVMArrayTypeKind          = 11,
        LLVMPointerTypeKind        = 12,
        LLVMVectorTypeKind         = 13,
        LLVMMetadataTypeKind       = 14,
        LLVMTokenTypeKind          = 16,
        LLVMScalableVectorTypeKind = 17,
        LLVMBFloatTypeKind         = 18,
        LLVMX86_AMXTypeKind        = 19,
        LLVMTargetExtTypeKind      = 20;

    public static final int
        LLVMExternalLinkage            = 0,
        LLVMAvailableExternallyLinkage = 1,
        LLVMLinkOnceAnyLinkage         = 2,
        LLVMLinkOnceODRLinkage         = 3,
        LLVMLinkOnceODRAutoHideLinkage = 4,
        LLVMWeakAnyLinkage             = 5,
        LLVMWeakODRLinkage             = 6,
        LLVMAppendingLinkage           = 7,
        LLVMInternalLinkage            = 8,
        LLVMPrivateLinkage             = 9,
        LLVMDLLImportLinkage           = 10,
        LLVMDLLExportLinkage           = 11,
        LLVMExternalWeakLinkage        = 12,
        LLVMGhostLinkage               = 13,
        LLVMCommonLinkage              = 14,
        LLVMLinkerPrivateLinkage       = 15,
        LLVMLinkerPrivateWeakLinkage   = 16;

    public static final int
        LLVMDefaultVisibility   = 0,
        LLVMHiddenVisibility    = 1,
        LLVMProtectedVisibility = 2;

    public static final int
        LLVMNoUnnamedAddr     = 0,
        LLVMLocalUnnamedAddr  = 1,
        LLVMGlobalUnnamedAddr = 2;

    public static final int
        LLVMDefaultStorageClass   = 0,
        LLVMDLLImportStorageClass = 1,
        LLVMDLLExportStorageClass = 2;

    public static final int
        LLVMCCallConv             = 0,
        LLVMFastCallConv          = 8,
        LLVMColdCallConv          = 9,
        LLVMGHCCallConv           = 10,
        LLVMHiPECallConv          = 11,
        LLVMAnyRegCallConv        = 13,
        LLVMPreserveMostCallConv  = 14,
        LLVMPreserveAllCallConv   = 15,
        LLVMSwiftCallConv         = 16,
        LLVMCXXFASTTLSCallConv    = 17,
        LLVMX86StdcallCallConv    = 64,
        LLVMX86FastcallCallConv   = 65,
        LLVMARMAPCSCallConv       = 66,
        LLVMARMAAPCSCallConv      = 67,
        LLVMARMAAPCSVFPCallConv   = 68,
        LLVMMSP430INTRCallConv    = 69,
        LLVMX86ThisCallCallConv   = 70,
        LLVMPTXKernelCallConv     = 71,
        LLVMPTXDeviceCallConv     = 72,
        LLVMSPIRFUNCCallConv      = 75,
        LLVMSPIRKERNELCallConv    = 76,
        LLVMIntelOCLBICallConv    = 77,
        LLVMX8664SysVCallConv     = 78,
        LLVMWin64CallConv         = 79,
        LLVMX86VectorCallCallConv = 80,
        LLVMHHVMCallConv          = 81,
        LLVMHHVMCCallConv         = 82,
        LLVMX86INTRCallConv       = 83,
        LLVMAVRINTRCallConv       = 84,
        LLVMAVRSIGNALCallConv     = 85,
        LLVMAVRBUILTINCallConv    = 86,
        LLVMAMDGPUVSCallConv      = 87,
        LLVMAMDGPUGSCallConv      = 88,
        LLVMAMDGPUPSCallConv      = 89,
        LLVMAMDGPUCSCallConv      = 90,
        LLVMAMDGPUKERNELCallConv  = 91,
        LLVMX86RegCallCallConv    = 92,
        LLVMAMDGPUHSCallConv      = 93,
        LLVMMSP430BUILTINCallConv = 94,
        LLVMAMDGPULSCallConv      = 95,
        LLVMAMDGPUESCallConv      = 96;

    public static final int
        LLVMArgumentValueKind              = 0,
        LLVMBasicBlockValueKind            = 1,
        LLVMMemoryUseValueKind             = 2,
        LLVMMemoryDefValueKind             = 3,
        LLVMMemoryPhiValueKind             = 4,
        LLVMFunctionValueKind              = 5,
        LLVMGlobalAliasValueKind           = 6,
        LLVMGlobalIFuncValueKind           = 7,
        LLVMGlobalVariableValueKind        = 8,
        LLVMBlockAddressValueKind          = 9,
        LLVMConstantExprValueKind          = 10,
        LLVMConstantArrayValueKind         = 11,
        LLVMConstantStructValueKind        = 12,
        LLVMConstantVectorValueKind        = 13,
        LLVMUndefValueValueKind            = 14,
        LLVMConstantAggregateZeroValueKind = 15,
        LLVMConstantDataArrayValueKind     = 16,
        LLVMConstantDataVectorValueKind    = 17,
        LLVMConstantIntValueKind           = 18,
        LLVMConstantFPValueKind            = 19,
        LLVMConstantPointerNullValueKind   = 20,
        LLVMConstantTokenNoneValueKind     = 21,
        LLVMMetadataAsValueValueKind       = 22,
        LLVMInlineAsmValueKind             = 23,
        LLVMInstructionValueKind           = 24,
        LLVMPoisonValueValueKind           = 25,
        LLVMConstantTargetNoneValueKind    = 26,
        LLVMConstantPtrAuthValueKind       = 27;

    public static final int
        LLVMIntEQ  = 32,
        LLVMIntNE  = 33,
        LLVMIntUGT = 34,
        LLVMIntUGE = 35,
        LLVMIntULT = 36,
        LLVMIntULE = 37,
        LLVMIntSGT = 38,
        LLVMIntSGE = 39,
        LLVMIntSLT = 40,
        LLVMIntSLE = 41;

    public static final int
        LLVMRealPredicateFalse = 0,
        LLVMRealOEQ            = 1,
        LLVMRealOGT            = 2,
        LLVMRealOGE            = 3,
        LLVMRealOLT            = 4,
        LLVMRealOLE            = 5,
        LLVMRealONE            = 6,
        LLVMRealORD            = 7,
        LLVMRealUNO            = 8,
        LLVMRealUEQ            = 9,
        LLVMRealUGT            = 10,
        LLVMRealUGE            = 11,
        LLVMRealULT            = 12,
        LLVMRealULE            = 13,
        LLVMRealUNE            = 14,
        LLVMRealPredicateTrue  = 15;

    public static final int
        LLVMLandingPadCatch  = 0,
        LLVMLandingPadFilter = 1;

    public static final int
        LLVMNotThreadLocal         = 0,
        LLVMGeneralDynamicTLSModel = 1,
        LLVMLocalDynamicTLSModel   = 2,
        LLVMInitialExecTLSModel    = 3,
        LLVMLocalExecTLSModel      = 4;

    public static final int
        LLVMAtomicOrderingNotAtomic              = 0,
        LLVMAtomicOrderingUnordered              = 1,
        LLVMAtomicOrderingMonotonic              = 2,
        LLVMAtomicOrderingAcquire                = 4,
        LLVMAtomicOrderingRelease                = 5,
        LLVMAtomicOrderingAcquireRelease         = 6,
        LLVMAtomicOrderingSequentiallyConsistent = 7;

    public static final int
        LLVMAtomicRMWBinOpXchg     = 0,
        LLVMAtomicRMWBinOpAdd      = 1,
        LLVMAtomicRMWBinOpSub      = 2,
        LLVMAtomicRMWBinOpAnd      = 3,
        LLVMAtomicRMWBinOpNand     = 4,
        LLVMAtomicRMWBinOpOr       = 5,
        LLVMAtomicRMWBinOpXor      = 6,
        LLVMAtomicRMWBinOpMax      = 7,
        LLVMAtomicRMWBinOpMin      = 8,
        LLVMAtomicRMWBinOpUMax     = 9,
        LLVMAtomicRMWBinOpUMin     = 10,
        LLVMAtomicRMWBinOpFAdd     = 11,
        LLVMAtomicRMWBinOpFSub     = 12,
        LLVMAtomicRMWBinOpFMax     = 13,
        LLVMAtomicRMWBinOpFMin     = 14,
        LLVMAtomicRMWBinOpUIncWrap = 15,
        LLVMAtomicRMWBinOpUDecWrap = 16,
        LLVMAtomicRMWBinOpUSubCond = 17,
        LLVMAtomicRMWBinOpUSubSat  = 18;

    public static final int
        LLVMDSError   = 0,
        LLVMDSWarning = 1,
        LLVMDSRemark  = 2,
        LLVMDSNote    = 3;

    public static final int
        LLVMInlineAsmDialectATT   = 0,
        LLVMInlineAsmDialectIntel = 1;

    public static final int
        LLVMModuleFlagBehaviorError        = 0,
        LLVMModuleFlagBehaviorWarning      = 1,
        LLVMModuleFlagBehaviorRequire      = 2,
        LLVMModuleFlagBehaviorOverride     = 3,
        LLVMModuleFlagBehaviorAppend       = 4,
        LLVMModuleFlagBehaviorAppendUnique = 5;

    public static final int
        LLVMAttributeReturnIndex   = 0,
        LLVMAttributeFunctionIndex = -1;

    public static final int
        LLVMTailCallKindNone     = 0,
        LLVMTailCallKindTail     = 1,
        LLVMTailCallKindMustTail = 2,
        LLVMTailCallKindNoTail   = 3;

    public static final int
        LLVMFastMathAllowReassoc    = 1 << 0,
        LLVMFastMathNoNaNs          = 1 << 1,
        LLVMFastMathNoInfs          = 1 << 2,
        LLVMFastMathNoSignedZeros   = 1 << 3,
        LLVMFastMathAllowReciprocal = 1 << 4,
        LLVMFastMathAllowContract   = 1 << 5,
        LLVMFastMathApproxFunc      = 1 << 6,
        LLVMFastMathNone            = 0,
        LLVMFastMathAll             = 
            LLVMFastMathAllowReassoc | LLVMFastMathNoNaNs |
            LLVMFastMathNoInfs | LLVMFastMathNoSignedZeros |
            LLVMFastMathAllowReciprocal | LLVMFastMathAllowContract |
            LLVMFastMathApproxFunc;

    public static final int
        LLVMGEPFlagInBounds = 1 << 0,
        LLVMGEPFlagNUSW     = 1 << 1,
        LLVMGEPFlagNUW      = 1 << 2;

    protected LLVMCore() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMInitializeCore ] ---

    /** {@code void LLVMInitializeCore(LLVMPassRegistryRef R)} */
    public static void LLVMInitializeCore(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCore;
        if (CHECKS) {
            check(__functionAddress);
            check(R);
        }
        invokePV(R, __functionAddress);
    }

    // --- [ LLVMShutdown ] ---

    /** {@code void LLVMShutdown(void)} */
    public static void LLVMShutdown() {
        long __functionAddress = Functions.Shutdown;
        invokeV(__functionAddress);
    }

    // --- [ LLVMGetVersion ] ---

    /** {@code void LLVMGetVersion(unsigned * Major, unsigned * Minor, unsigned * Patch)} */
    public static void nLLVMGetVersion(long Major, long Minor, long Patch) {
        long __functionAddress = Functions.GetVersion;
        if (CHECKS) {
            check(__functionAddress);
        }
        invokePPPV(Major, Minor, Patch, __functionAddress);
    }

    /** {@code void LLVMGetVersion(unsigned * Major, unsigned * Minor, unsigned * Patch)} */
    public static void LLVMGetVersion(@NativeType("unsigned *") @Nullable IntBuffer Major, @NativeType("unsigned *") @Nullable IntBuffer Minor, @NativeType("unsigned *") @Nullable IntBuffer Patch) {
        if (CHECKS) {
            checkSafe(Major, 1);
            checkSafe(Minor, 1);
            checkSafe(Patch, 1);
        }
        nLLVMGetVersion(memAddressSafe(Major), memAddressSafe(Minor), memAddressSafe(Patch));
    }

    // --- [ LLVMCreateMessage ] ---

    /** {@code char * LLVMCreateMessage(char const * Message)} */
    public static long nLLVMCreateMessage(long Message) {
        long __functionAddress = Functions.CreateMessage;
        return invokePP(Message, __functionAddress);
    }

    /** {@code char * LLVMCreateMessage(char const * Message)} */
    @NativeType("char *")
    public static String LLVMCreateMessage(@NativeType("char const *") ByteBuffer Message) {
        if (CHECKS) {
            checkNT1(Message);
        }
        long __result = nLLVMCreateMessage(memAddress(Message));
        return memUTF8(__result);
    }

    /** {@code char * LLVMCreateMessage(char const * Message)} */
    @NativeType("char *")
    public static String LLVMCreateMessage(@NativeType("char const *") CharSequence Message) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Message, true);
            long MessageEncoded = stack.getPointerAddress();
            long __result = nLLVMCreateMessage(MessageEncoded);
            return memUTF8(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDisposeMessage ] ---

    /** {@code void LLVMDisposeMessage(char * Message)} */
    public static void nLLVMDisposeMessage(long Message) {
        long __functionAddress = Functions.DisposeMessage;
        invokePV(Message, __functionAddress);
    }

    /** {@code void LLVMDisposeMessage(char * Message)} */
    public static void LLVMDisposeMessage(@NativeType("char *") ByteBuffer Message) {
        if (CHECKS) {
            checkNT1(Message);
        }
        nLLVMDisposeMessage(memAddress(Message));
    }

    // --- [ LLVMContextCreate ] ---

    /** {@code LLVMContextRef LLVMContextCreate(void)} */
    @NativeType("LLVMContextRef")
    public static long LLVMContextCreate() {
        long __functionAddress = Functions.ContextCreate;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMGetGlobalContext ] ---

    /** {@code LLVMContextRef LLVMGetGlobalContext(void)} */
    @NativeType("LLVMContextRef")
    public static long LLVMGetGlobalContext() {
        long __functionAddress = Functions.GetGlobalContext;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMContextSetDiagnosticHandler ] ---

    /** {@code void LLVMContextSetDiagnosticHandler(LLVMContextRef C, void (*) (LLVMDiagnosticInfoRef, void *) Handler, void * DiagnosticContext)} */
    public static void nLLVMContextSetDiagnosticHandler(long C, long Handler, long DiagnosticContext) {
        long __functionAddress = Functions.ContextSetDiagnosticHandler;
        if (CHECKS) {
            check(C);
        }
        invokePPPV(C, Handler, DiagnosticContext, __functionAddress);
    }

    /** {@code void LLVMContextSetDiagnosticHandler(LLVMContextRef C, void (*) (LLVMDiagnosticInfoRef, void *) Handler, void * DiagnosticContext)} */
    public static void LLVMContextSetDiagnosticHandler(@NativeType("LLVMContextRef") long C, @NativeType("void (*) (LLVMDiagnosticInfoRef, void *)") @Nullable LLVMDiagnosticHandlerI Handler, @NativeType("void *") long DiagnosticContext) {
        nLLVMContextSetDiagnosticHandler(C, memAddressSafe(Handler), DiagnosticContext);
    }

    // --- [ LLVMContextGetDiagnosticHandler ] ---

    /** {@code void (*) (LLVMDiagnosticInfoRef, void *) LLVMContextGetDiagnosticHandler(LLVMContextRef C)} */
    public static long nLLVMContextGetDiagnosticHandler(long C) {
        long __functionAddress = Functions.ContextGetDiagnosticHandler;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    /** {@code void (*) (LLVMDiagnosticInfoRef, void *) LLVMContextGetDiagnosticHandler(LLVMContextRef C)} */
    @NativeType("void (*) (LLVMDiagnosticInfoRef, void *)")
    public static @Nullable LLVMDiagnosticHandler LLVMContextGetDiagnosticHandler(@NativeType("LLVMContextRef") long C) {
        return LLVMDiagnosticHandler.createSafe(nLLVMContextGetDiagnosticHandler(C));
    }

    // --- [ LLVMContextGetDiagnosticContext ] ---

    /** {@code void * LLVMContextGetDiagnosticContext(LLVMContextRef C)} */
    @NativeType("void *")
    public static long LLVMContextGetDiagnosticContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.ContextGetDiagnosticContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMContextSetYieldCallback ] ---

    /** {@code void LLVMContextSetYieldCallback(LLVMContextRef C, void (*) (LLVMContextRef, void *) Callback, void * OpaqueHandle)} */
    public static void nLLVMContextSetYieldCallback(long C, long Callback, long OpaqueHandle) {
        long __functionAddress = Functions.ContextSetYieldCallback;
        if (CHECKS) {
            check(C);
        }
        invokePPPV(C, Callback, OpaqueHandle, __functionAddress);
    }

    /** {@code void LLVMContextSetYieldCallback(LLVMContextRef C, void (*) (LLVMContextRef, void *) Callback, void * OpaqueHandle)} */
    public static void LLVMContextSetYieldCallback(@NativeType("LLVMContextRef") long C, @NativeType("void (*) (LLVMContextRef, void *)") @Nullable LLVMYieldCallbackI Callback, @NativeType("void *") long OpaqueHandle) {
        nLLVMContextSetYieldCallback(C, memAddressSafe(Callback), OpaqueHandle);
    }

    // --- [ LLVMContextShouldDiscardValueNames ] ---

    /** {@code LLVMBool LLVMContextShouldDiscardValueNames(LLVMContextRef C)} */
    @NativeType("LLVMBool")
    public static boolean LLVMContextShouldDiscardValueNames(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.ContextShouldDiscardValueNames;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePI(C, __functionAddress) != 0;
    }

    // --- [ LLVMContextSetDiscardValueNames ] ---

    /** {@code void LLVMContextSetDiscardValueNames(LLVMContextRef C, LLVMBool Discard)} */
    public static void LLVMContextSetDiscardValueNames(@NativeType("LLVMContextRef") long C, @NativeType("LLVMBool") boolean Discard) {
        long __functionAddress = Functions.ContextSetDiscardValueNames;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        invokePV(C, Discard ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMContextSetOpaquePointers ] ---

    /** {@code void LLVMContextSetOpaquePointers(LLVMContextRef C, LLVMBool OpaquePointers)} */
    public static void LLVMContextSetOpaquePointers(@NativeType("LLVMContextRef") long C, @NativeType("LLVMBool") boolean OpaquePointers) {
        long __functionAddress = Functions.ContextSetOpaquePointers;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        invokePV(C, OpaquePointers ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMContextDispose ] ---

    /** {@code void LLVMContextDispose(LLVMContextRef C)} */
    public static void LLVMContextDispose(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.ContextDispose;
        if (CHECKS) {
            check(C);
        }
        invokePV(C, __functionAddress);
    }

    // --- [ LLVMGetDiagInfoDescription ] ---

    /** {@code char * LLVMGetDiagInfoDescription(LLVMDiagnosticInfoRef DI)} */
    public static long nLLVMGetDiagInfoDescription(long DI) {
        long __functionAddress = Functions.GetDiagInfoDescription;
        if (CHECKS) {
            check(DI);
        }
        return invokePP(DI, __functionAddress);
    }

    /** {@code char * LLVMGetDiagInfoDescription(LLVMDiagnosticInfoRef DI)} */
    @NativeType("char *")
    public static String LLVMGetDiagInfoDescription(@NativeType("LLVMDiagnosticInfoRef") long DI) {
        long __result = nLLVMGetDiagInfoDescription(DI);
        return memUTF8(__result);
    }

    // --- [ LLVMGetDiagInfoSeverity ] ---

    /** {@code LLVMDiagnosticSeverity LLVMGetDiagInfoSeverity(LLVMDiagnosticInfoRef DI)} */
    @NativeType("LLVMDiagnosticSeverity")
    public static int LLVMGetDiagInfoSeverity(@NativeType("LLVMDiagnosticInfoRef") long DI) {
        long __functionAddress = Functions.GetDiagInfoSeverity;
        if (CHECKS) {
            check(DI);
        }
        return invokePI(DI, __functionAddress);
    }

    // --- [ LLVMGetMDKindIDInContext ] ---

    /** {@code unsigned int LLVMGetMDKindIDInContext(LLVMContextRef C, char const * Name, unsigned int SLen)} */
    public static int nLLVMGetMDKindIDInContext(long C, long Name, int SLen) {
        long __functionAddress = Functions.GetMDKindIDInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPI(C, Name, SLen, __functionAddress);
    }

    /** {@code unsigned int LLVMGetMDKindIDInContext(LLVMContextRef C, char const * Name, unsigned int SLen)} */
    @NativeType("unsigned int")
    public static int LLVMGetMDKindIDInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetMDKindIDInContext(C, memAddress(Name), Name.remaining());
    }

    /** {@code unsigned int LLVMGetMDKindIDInContext(LLVMContextRef C, char const * Name, unsigned int SLen)} */
    @NativeType("unsigned int")
    public static int LLVMGetMDKindIDInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetMDKindIDInContext(C, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetSyncScopeID ] ---

    /** {@code unsigned LLVMGetSyncScopeID(LLVMContextRef C, char const * Name, size_t SLen)} */
    public static int nLLVMGetSyncScopeID(long C, long Name, long SLen) {
        long __functionAddress = Functions.GetSyncScopeID;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPPI(C, Name, SLen, __functionAddress);
    }

    /** {@code unsigned LLVMGetSyncScopeID(LLVMContextRef C, char const * Name, size_t SLen)} */
    @NativeType("unsigned")
    public static int LLVMGetSyncScopeID(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetSyncScopeID(C, memAddress(Name), Name.remaining());
    }

    /** {@code unsigned LLVMGetSyncScopeID(LLVMContextRef C, char const * Name, size_t SLen)} */
    @NativeType("unsigned")
    public static int LLVMGetSyncScopeID(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetSyncScopeID(C, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetMDKindID ] ---

    /** {@code unsigned int LLVMGetMDKindID(char const * Name, unsigned int SLen)} */
    public static int nLLVMGetMDKindID(long Name, int SLen) {
        long __functionAddress = Functions.GetMDKindID;
        return invokePI(Name, SLen, __functionAddress);
    }

    /** {@code unsigned int LLVMGetMDKindID(char const * Name, unsigned int SLen)} */
    @NativeType("unsigned int")
    public static int LLVMGetMDKindID(@NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetMDKindID(memAddress(Name), Name.remaining());
    }

    /** {@code unsigned int LLVMGetMDKindID(char const * Name, unsigned int SLen)} */
    @NativeType("unsigned int")
    public static int LLVMGetMDKindID(@NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetMDKindID(NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetEnumAttributeKindForName ] ---

    /** {@code unsigned int LLVMGetEnumAttributeKindForName(char const * Name, size_t SLen)} */
    public static int nLLVMGetEnumAttributeKindForName(long Name, long SLen) {
        long __functionAddress = Functions.GetEnumAttributeKindForName;
        return invokePPI(Name, SLen, __functionAddress);
    }

    /** {@code unsigned int LLVMGetEnumAttributeKindForName(char const * Name, size_t SLen)} */
    @NativeType("unsigned int")
    public static int LLVMGetEnumAttributeKindForName(@NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetEnumAttributeKindForName(memAddress(Name), Name.remaining());
    }

    /** {@code unsigned int LLVMGetEnumAttributeKindForName(char const * Name, size_t SLen)} */
    @NativeType("unsigned int")
    public static int LLVMGetEnumAttributeKindForName(@NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetEnumAttributeKindForName(NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetLastEnumAttributeKind ] ---

    /** {@code unsigned int LLVMGetLastEnumAttributeKind(void)} */
    @NativeType("unsigned int")
    public static int LLVMGetLastEnumAttributeKind() {
        long __functionAddress = Functions.GetLastEnumAttributeKind;
        return invokeI(__functionAddress);
    }

    // --- [ LLVMCreateEnumAttribute ] ---

    /** {@code LLVMAttributeRef LLVMCreateEnumAttribute(LLVMContextRef C, unsigned int KindID, uint64_t Val)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMCreateEnumAttribute(@NativeType("LLVMContextRef") long C, @NativeType("unsigned int") int KindID, @NativeType("uint64_t") long Val) {
        long __functionAddress = Functions.CreateEnumAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePJP(C, KindID, Val, __functionAddress);
    }

    // --- [ LLVMGetEnumAttributeKind ] ---

    /** {@code unsigned int LLVMGetEnumAttributeKind(LLVMAttributeRef A)} */
    @NativeType("unsigned int")
    public static int LLVMGetEnumAttributeKind(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.GetEnumAttributeKind;
        if (CHECKS) {
            check(A);
        }
        return invokePI(A, __functionAddress);
    }

    // --- [ LLVMGetEnumAttributeValue ] ---

    /** {@code uint64_t LLVMGetEnumAttributeValue(LLVMAttributeRef A)} */
    @NativeType("uint64_t")
    public static long LLVMGetEnumAttributeValue(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.GetEnumAttributeValue;
        if (CHECKS) {
            check(A);
        }
        return invokePJ(A, __functionAddress);
    }

    // --- [ LLVMCreateTypeAttribute ] ---

    /** {@code LLVMAttributeRef LLVMCreateTypeAttribute(LLVMContextRef C, unsigned KindID, LLVMTypeRef type_ref)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMCreateTypeAttribute(@NativeType("LLVMContextRef") long C, @NativeType("unsigned") int KindID, @NativeType("LLVMTypeRef") long type_ref) {
        long __functionAddress = Functions.CreateTypeAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
            check(type_ref);
        }
        return invokePPP(C, KindID, type_ref, __functionAddress);
    }

    // --- [ LLVMGetTypeAttributeValue ] ---

    /** {@code LLVMTypeRef LLVMGetTypeAttributeValue(LLVMAttributeRef A)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetTypeAttributeValue(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.GetTypeAttributeValue;
        if (CHECKS) {
            check(__functionAddress);
            check(A);
        }
        return invokePP(A, __functionAddress);
    }

    // --- [ LLVMCreateConstantRangeAttribute ] ---

    /** {@code LLVMAttributeRef LLVMCreateConstantRangeAttribute(LLVMContextRef C, unsigned KindID, unsigned NumBits, uint64_t const * LowerWords, uint64_t const * UpperWords)} */
    public static long nLLVMCreateConstantRangeAttribute(long C, int KindID, int NumBits, long LowerWords, long UpperWords) {
        long __functionAddress = Functions.CreateConstantRangeAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPPP(C, KindID, NumBits, LowerWords, UpperWords, __functionAddress);
    }

    /** {@code LLVMAttributeRef LLVMCreateConstantRangeAttribute(LLVMContextRef C, unsigned KindID, unsigned NumBits, uint64_t const * LowerWords, uint64_t const * UpperWords)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMCreateConstantRangeAttribute(@NativeType("LLVMContextRef") long C, @NativeType("unsigned") int KindID, @NativeType("unsigned") int NumBits, @NativeType("uint64_t const *") LongBuffer LowerWords, @NativeType("uint64_t const *") LongBuffer UpperWords) {
        return nLLVMCreateConstantRangeAttribute(C, KindID, NumBits, memAddress(LowerWords), memAddress(UpperWords));
    }

    // --- [ LLVMCreateStringAttribute ] ---

    /** {@code LLVMAttributeRef LLVMCreateStringAttribute(LLVMContextRef C, char const * K, unsigned int KLength, char const * V, unsigned int VLength)} */
    public static long nLLVMCreateStringAttribute(long C, long K, int KLength, long V, int VLength) {
        long __functionAddress = Functions.CreateStringAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePPPP(C, K, KLength, V, VLength, __functionAddress);
    }

    /** {@code LLVMAttributeRef LLVMCreateStringAttribute(LLVMContextRef C, char const * K, unsigned int KLength, char const * V, unsigned int VLength)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMCreateStringAttribute(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer K, @NativeType("char const *") ByteBuffer V) {
        return nLLVMCreateStringAttribute(C, memAddress(K), K.remaining(), memAddress(V), V.remaining());
    }

    /** {@code LLVMAttributeRef LLVMCreateStringAttribute(LLVMContextRef C, char const * K, unsigned int KLength, char const * V, unsigned int VLength)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMCreateStringAttribute(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence K, @NativeType("char const *") CharSequence V) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int KEncodedLength = stack.nUTF8(K, false);
            long KEncoded = stack.getPointerAddress();
            int VEncodedLength = stack.nUTF8(V, false);
            long VEncoded = stack.getPointerAddress();
            return nLLVMCreateStringAttribute(C, KEncoded, KEncodedLength, VEncoded, VEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetStringAttributeKind ] ---

    /** {@code char const * LLVMGetStringAttributeKind(LLVMAttributeRef A, unsigned int * Length)} */
    public static long nLLVMGetStringAttributeKind(long A, long Length) {
        long __functionAddress = Functions.GetStringAttributeKind;
        if (CHECKS) {
            check(A);
        }
        return invokePPP(A, Length, __functionAddress);
    }

    /** {@code char const * LLVMGetStringAttributeKind(LLVMAttributeRef A, unsigned int * Length)} */
    @NativeType("char const *")
    public static String LLVMGetStringAttributeKind(@NativeType("LLVMAttributeRef") long A) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Length = stack.callocInt(1);
            long __result = nLLVMGetStringAttributeKind(A, memAddress(Length));
            return memUTF8(__result, Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetStringAttributeValue ] ---

    /** {@code char const * LLVMGetStringAttributeValue(LLVMAttributeRef A, unsigned int * Length)} */
    public static long nLLVMGetStringAttributeValue(long A, long Length) {
        long __functionAddress = Functions.GetStringAttributeValue;
        if (CHECKS) {
            check(A);
        }
        return invokePPP(A, Length, __functionAddress);
    }

    /** {@code char const * LLVMGetStringAttributeValue(LLVMAttributeRef A, unsigned int * Length)} */
    @NativeType("char const *")
    public static String LLVMGetStringAttributeValue(@NativeType("LLVMAttributeRef") long A) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Length = stack.callocInt(1);
            long __result = nLLVMGetStringAttributeValue(A, memAddress(Length));
            return memUTF8(__result, Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMIsEnumAttribute ] ---

    /** {@code LLVMBool LLVMIsEnumAttribute(LLVMAttributeRef A)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsEnumAttribute(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.IsEnumAttribute;
        if (CHECKS) {
            check(A);
        }
        return invokePI(A, __functionAddress) != 0;
    }

    // --- [ LLVMIsStringAttribute ] ---

    /** {@code LLVMBool LLVMIsStringAttribute(LLVMAttributeRef A)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsStringAttribute(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.IsStringAttribute;
        if (CHECKS) {
            check(A);
        }
        return invokePI(A, __functionAddress) != 0;
    }

    // --- [ LLVMIsTypeAttribute ] ---

    /** {@code LLVMBool LLVMIsTypeAttribute(LLVMAttributeRef A)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsTypeAttribute(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.IsTypeAttribute;
        if (CHECKS) {
            check(__functionAddress);
            check(A);
        }
        return invokePI(A, __functionAddress) != 0;
    }

    // --- [ LLVMGetTypeByName2 ] ---

    /** {@code LLVMTypeRef LLVMGetTypeByName2(LLVMContextRef C, char const * Name)} */
    public static long nLLVMGetTypeByName2(long C, long Name) {
        long __functionAddress = Functions.GetTypeByName2;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPP(C, Name, __functionAddress);
    }

    /** {@code LLVMTypeRef LLVMGetTypeByName2(LLVMContextRef C, char const * Name)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetTypeByName2(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetTypeByName2(C, memAddress(Name));
    }

    /** {@code LLVMTypeRef LLVMGetTypeByName2(LLVMContextRef C, char const * Name)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetTypeByName2(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetTypeByName2(C, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMModuleCreateWithName ] ---

    /** {@code LLVMModuleRef LLVMModuleCreateWithName(char const * ModuleID)} */
    public static long nLLVMModuleCreateWithName(long ModuleID) {
        long __functionAddress = Functions.ModuleCreateWithName;
        return invokePP(ModuleID, __functionAddress);
    }

    /** {@code LLVMModuleRef LLVMModuleCreateWithName(char const * ModuleID)} */
    @NativeType("LLVMModuleRef")
    public static long LLVMModuleCreateWithName(@NativeType("char const *") ByteBuffer ModuleID) {
        if (CHECKS) {
            checkNT1(ModuleID);
        }
        return nLLVMModuleCreateWithName(memAddress(ModuleID));
    }

    /** {@code LLVMModuleRef LLVMModuleCreateWithName(char const * ModuleID)} */
    @NativeType("LLVMModuleRef")
    public static long LLVMModuleCreateWithName(@NativeType("char const *") CharSequence ModuleID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ModuleID, true);
            long ModuleIDEncoded = stack.getPointerAddress();
            return nLLVMModuleCreateWithName(ModuleIDEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMModuleCreateWithNameInContext ] ---

    /** {@code LLVMModuleRef LLVMModuleCreateWithNameInContext(char const * ModuleID, LLVMContextRef C)} */
    public static long nLLVMModuleCreateWithNameInContext(long ModuleID, long C) {
        long __functionAddress = Functions.ModuleCreateWithNameInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(ModuleID, C, __functionAddress);
    }

    /** {@code LLVMModuleRef LLVMModuleCreateWithNameInContext(char const * ModuleID, LLVMContextRef C)} */
    @NativeType("LLVMModuleRef")
    public static long LLVMModuleCreateWithNameInContext(@NativeType("char const *") ByteBuffer ModuleID, @NativeType("LLVMContextRef") long C) {
        if (CHECKS) {
            checkNT1(ModuleID);
        }
        return nLLVMModuleCreateWithNameInContext(memAddress(ModuleID), C);
    }

    /** {@code LLVMModuleRef LLVMModuleCreateWithNameInContext(char const * ModuleID, LLVMContextRef C)} */
    @NativeType("LLVMModuleRef")
    public static long LLVMModuleCreateWithNameInContext(@NativeType("char const *") CharSequence ModuleID, @NativeType("LLVMContextRef") long C) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(ModuleID, true);
            long ModuleIDEncoded = stack.getPointerAddress();
            return nLLVMModuleCreateWithNameInContext(ModuleIDEncoded, C);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCloneModule ] ---

    /** {@code LLVMModuleRef LLVMCloneModule(LLVMModuleRef M)} */
    @NativeType("LLVMModuleRef")
    public static long LLVMCloneModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CloneModule;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMDisposeModule ] ---

    /** {@code void LLVMDisposeModule(LLVMModuleRef M)} */
    public static void LLVMDisposeModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.DisposeModule;
        if (CHECKS) {
            check(M);
        }
        invokePV(M, __functionAddress);
    }

    // --- [ LLVMGetModuleIdentifier ] ---

    /** {@code char const * LLVMGetModuleIdentifier(LLVMModuleRef M, size_t * Len)} */
    public static long nLLVMGetModuleIdentifier(long M, long Len) {
        long __functionAddress = Functions.GetModuleIdentifier;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(M, Len, __functionAddress);
    }

    /** {@code char const * LLVMGetModuleIdentifier(LLVMModuleRef M, size_t * Len)} */
    @NativeType("char const *")
    public static String LLVMGetModuleIdentifier(@NativeType("LLVMModuleRef") long M) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Len = stack.callocPointer(1);
            long __result = nLLVMGetModuleIdentifier(M, memAddress(Len));
            return memUTF8(__result, (int)Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMSetModuleIdentifier ] ---

    /** {@code void LLVMSetModuleIdentifier(LLVMModuleRef M, char const * Ident, size_t Len)} */
    public static void nLLVMSetModuleIdentifier(long M, long Ident, long Len) {
        long __functionAddress = Functions.SetModuleIdentifier;
        if (CHECKS) {
            check(M);
        }
        invokePPPV(M, Ident, Len, __functionAddress);
    }

    /** {@code void LLVMSetModuleIdentifier(LLVMModuleRef M, char const * Ident, size_t Len)} */
    public static void LLVMSetModuleIdentifier(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Ident) {
        nLLVMSetModuleIdentifier(M, memAddress(Ident), Ident.remaining());
    }

    /** {@code void LLVMSetModuleIdentifier(LLVMModuleRef M, char const * Ident, size_t Len)} */
    public static void LLVMSetModuleIdentifier(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Ident) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int IdentEncodedLength = stack.nUTF8(Ident, false);
            long IdentEncoded = stack.getPointerAddress();
            nLLVMSetModuleIdentifier(M, IdentEncoded, IdentEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetSourceFileName ] ---

    /** {@code char const * LLVMGetSourceFileName(LLVMModuleRef M, size_t * Len)} */
    public static long nLLVMGetSourceFileName(long M, long Len) {
        long __functionAddress = Functions.GetSourceFileName;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPP(M, Len, __functionAddress);
    }

    /** {@code char const * LLVMGetSourceFileName(LLVMModuleRef M, size_t * Len)} */
    @NativeType("char const *")
    public static String LLVMGetSourceFileName(@NativeType("LLVMModuleRef") long M) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Len = stack.callocPointer(1);
            long __result = nLLVMGetSourceFileName(M, memAddress(Len));
            return memUTF8(__result, (int)Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMSetSourceFileName ] ---

    /** {@code void LLVMSetSourceFileName(LLVMModuleRef M, char const * Name, size_t Len)} */
    public static void nLLVMSetSourceFileName(long M, long Name, long Len) {
        long __functionAddress = Functions.SetSourceFileName;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        invokePPPV(M, Name, Len, __functionAddress);
    }

    /** {@code void LLVMSetSourceFileName(LLVMModuleRef M, char const * Name, size_t Len)} */
    public static void LLVMSetSourceFileName(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        nLLVMSetSourceFileName(M, memAddress(Name), Name.remaining());
    }

    /** {@code void LLVMSetSourceFileName(LLVMModuleRef M, char const * Name, size_t Len)} */
    public static void LLVMSetSourceFileName(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            nLLVMSetSourceFileName(M, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetDataLayoutStr ] ---

    /** {@code char const * LLVMGetDataLayoutStr(LLVMModuleRef M)} */
    public static long nLLVMGetDataLayoutStr(long M) {
        long __functionAddress = Functions.GetDataLayoutStr;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    /** {@code char const * LLVMGetDataLayoutStr(LLVMModuleRef M)} */
    @NativeType("char const *")
    public static String LLVMGetDataLayoutStr(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMGetDataLayoutStr(M);
        return memUTF8(__result);
    }

    // --- [ LLVMGetDataLayout ] ---

    /** {@code char const * LLVMGetDataLayout(LLVMModuleRef M)} */
    public static long nLLVMGetDataLayout(long M) {
        long __functionAddress = Functions.GetDataLayout;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    /** {@code char const * LLVMGetDataLayout(LLVMModuleRef M)} */
    @NativeType("char const *")
    public static String LLVMGetDataLayout(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMGetDataLayout(M);
        return memUTF8(__result);
    }

    // --- [ LLVMSetDataLayout ] ---

    /** {@code void LLVMSetDataLayout(LLVMModuleRef M, char const * DataLayoutStr)} */
    public static void nLLVMSetDataLayout(long M, long DataLayoutStr) {
        long __functionAddress = Functions.SetDataLayout;
        if (CHECKS) {
            check(M);
        }
        invokePPV(M, DataLayoutStr, __functionAddress);
    }

    /** {@code void LLVMSetDataLayout(LLVMModuleRef M, char const * DataLayoutStr)} */
    public static void LLVMSetDataLayout(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer DataLayoutStr) {
        if (CHECKS) {
            checkNT1(DataLayoutStr);
        }
        nLLVMSetDataLayout(M, memAddress(DataLayoutStr));
    }

    /** {@code void LLVMSetDataLayout(LLVMModuleRef M, char const * DataLayoutStr)} */
    public static void LLVMSetDataLayout(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence DataLayoutStr) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(DataLayoutStr, true);
            long DataLayoutStrEncoded = stack.getPointerAddress();
            nLLVMSetDataLayout(M, DataLayoutStrEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetTarget ] ---

    /** {@code char const * LLVMGetTarget(LLVMModuleRef M)} */
    public static long nLLVMGetTarget(long M) {
        long __functionAddress = Functions.GetTarget;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    /** {@code char const * LLVMGetTarget(LLVMModuleRef M)} */
    @NativeType("char const *")
    public static String LLVMGetTarget(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMGetTarget(M);
        return memUTF8(__result);
    }

    // --- [ LLVMSetTarget ] ---

    /** {@code void LLVMSetTarget(LLVMModuleRef M, char const * Triple)} */
    public static void nLLVMSetTarget(long M, long Triple) {
        long __functionAddress = Functions.SetTarget;
        if (CHECKS) {
            check(M);
        }
        invokePPV(M, Triple, __functionAddress);
    }

    /** {@code void LLVMSetTarget(LLVMModuleRef M, char const * Triple)} */
    public static void LLVMSetTarget(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Triple) {
        if (CHECKS) {
            checkNT1(Triple);
        }
        nLLVMSetTarget(M, memAddress(Triple));
    }

    /** {@code void LLVMSetTarget(LLVMModuleRef M, char const * Triple)} */
    public static void LLVMSetTarget(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Triple) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Triple, true);
            long TripleEncoded = stack.getPointerAddress();
            nLLVMSetTarget(M, TripleEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCopyModuleFlagsMetadata ] ---

    /** {@code LLVMModuleFlagEntry * LLVMCopyModuleFlagsMetadata(LLVMModuleRef M, size_t * Len)} */
    public static long nLLVMCopyModuleFlagsMetadata(long M, long Len) {
        long __functionAddress = Functions.CopyModuleFlagsMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPP(M, Len, __functionAddress);
    }

    /** {@code LLVMModuleFlagEntry * LLVMCopyModuleFlagsMetadata(LLVMModuleRef M, size_t * Len)} */
    @NativeType("LLVMModuleFlagEntry *")
    public static long LLVMCopyModuleFlagsMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("size_t *") PointerBuffer Len) {
        if (CHECKS) {
            check(Len, 1);
        }
        return nLLVMCopyModuleFlagsMetadata(M, memAddress(Len));
    }

    // --- [ LLVMDisposeModuleFlagsMetadata ] ---

    /** {@code void LLVMDisposeModuleFlagsMetadata(LLVMModuleFlagEntry * Entries)} */
    public static void LLVMDisposeModuleFlagsMetadata(@NativeType("LLVMModuleFlagEntry *") long Entries) {
        long __functionAddress = Functions.DisposeModuleFlagsMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        invokePV(Entries, __functionAddress);
    }

    // --- [ LLVMModuleFlagEntriesGetFlagBehavior ] ---

    /** {@code LLVMModuleFlagBehavior LLVMModuleFlagEntriesGetFlagBehavior(LLVMModuleFlagEntry * Entries, unsigned int Index)} */
    @NativeType("LLVMModuleFlagBehavior")
    public static int LLVMModuleFlagEntriesGetFlagBehavior(@NativeType("LLVMModuleFlagEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ModuleFlagEntriesGetFlagBehavior;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        return invokePI(Entries, Index, __functionAddress);
    }

    // --- [ LLVMModuleFlagEntriesGetKey ] ---

    /** {@code char const * LLVMModuleFlagEntriesGetKey(LLVMModuleFlagEntry * Entries, unsigned int Index, size_t * Len)} */
    public static long nLLVMModuleFlagEntriesGetKey(long Entries, int Index, long Len) {
        long __functionAddress = Functions.ModuleFlagEntriesGetKey;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        return invokePPP(Entries, Index, Len, __functionAddress);
    }

    /** {@code char const * LLVMModuleFlagEntriesGetKey(LLVMModuleFlagEntry * Entries, unsigned int Index, size_t * Len)} */
    @NativeType("char const *")
    public static String LLVMModuleFlagEntriesGetKey(@NativeType("LLVMModuleFlagEntry *") long Entries, @NativeType("unsigned int") int Index) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Len = stack.callocPointer(1);
            long __result = nLLVMModuleFlagEntriesGetKey(Entries, Index, memAddress(Len));
            return memUTF8(__result, (int)Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMModuleFlagEntriesGetMetadata ] ---

    /** {@code LLVMMetadataRef LLVMModuleFlagEntriesGetMetadata(LLVMModuleFlagEntry * Entries, unsigned int Index)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMModuleFlagEntriesGetMetadata(@NativeType("LLVMModuleFlagEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ModuleFlagEntriesGetMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        return invokePP(Entries, Index, __functionAddress);
    }

    // --- [ LLVMGetModuleFlag ] ---

    /** {@code LLVMMetadataRef LLVMGetModuleFlag(LLVMModuleRef M, char const * Key, size_t KeyLen)} */
    public static long nLLVMGetModuleFlag(long M, long Key, long KeyLen) {
        long __functionAddress = Functions.GetModuleFlag;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Key, KeyLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMGetModuleFlag(LLVMModuleRef M, char const * Key, size_t KeyLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMGetModuleFlag(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Key) {
        return nLLVMGetModuleFlag(M, memAddress(Key), Key.remaining());
    }

    /** {@code LLVMMetadataRef LLVMGetModuleFlag(LLVMModuleRef M, char const * Key, size_t KeyLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMGetModuleFlag(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Key) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int KeyEncodedLength = stack.nUTF8(Key, false);
            long KeyEncoded = stack.getPointerAddress();
            return nLLVMGetModuleFlag(M, KeyEncoded, KeyEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAddModuleFlag ] ---

    /** {@code void LLVMAddModuleFlag(LLVMModuleRef M, LLVMModuleFlagBehavior Behavior, char const * Key, size_t KeyLen, LLVMMetadataRef Val)} */
    public static void nLLVMAddModuleFlag(long M, int Behavior, long Key, long KeyLen, long Val) {
        long __functionAddress = Functions.AddModuleFlag;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
            check(Val);
        }
        invokePPPPV(M, Behavior, Key, KeyLen, Val, __functionAddress);
    }

    /** {@code void LLVMAddModuleFlag(LLVMModuleRef M, LLVMModuleFlagBehavior Behavior, char const * Key, size_t KeyLen, LLVMMetadataRef Val)} */
    public static void LLVMAddModuleFlag(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMModuleFlagBehavior") int Behavior, @NativeType("char const *") ByteBuffer Key, @NativeType("LLVMMetadataRef") long Val) {
        nLLVMAddModuleFlag(M, Behavior, memAddress(Key), Key.remaining(), Val);
    }

    /** {@code void LLVMAddModuleFlag(LLVMModuleRef M, LLVMModuleFlagBehavior Behavior, char const * Key, size_t KeyLen, LLVMMetadataRef Val)} */
    public static void LLVMAddModuleFlag(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMModuleFlagBehavior") int Behavior, @NativeType("char const *") CharSequence Key, @NativeType("LLVMMetadataRef") long Val) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int KeyEncodedLength = stack.nUTF8(Key, false);
            long KeyEncoded = stack.getPointerAddress();
            nLLVMAddModuleFlag(M, Behavior, KeyEncoded, KeyEncodedLength, Val);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDumpModule ] ---

    /** {@code void LLVMDumpModule(LLVMModuleRef M)} */
    public static void LLVMDumpModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.DumpModule;
        if (CHECKS) {
            check(M);
        }
        invokePV(M, __functionAddress);
    }

    // --- [ LLVMPrintModuleToFile ] ---

    /** {@code LLVMBool LLVMPrintModuleToFile(LLVMModuleRef M, char const * Filename, char ** ErrorMessage)} */
    public static int nLLVMPrintModuleToFile(long M, long Filename, long ErrorMessage) {
        long __functionAddress = Functions.PrintModuleToFile;
        if (CHECKS) {
            check(M);
        }
        return invokePPPI(M, Filename, ErrorMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMPrintModuleToFile(LLVMModuleRef M, char const * Filename, char ** ErrorMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMPrintModuleToFile(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Filename, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            checkNT1(Filename);
            check(ErrorMessage, 1);
        }
        return nLLVMPrintModuleToFile(M, memAddress(Filename), memAddress(ErrorMessage)) != 0;
    }

    /** {@code LLVMBool LLVMPrintModuleToFile(LLVMModuleRef M, char const * Filename, char ** ErrorMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMPrintModuleToFile(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Filename, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            check(ErrorMessage, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Filename, true);
            long FilenameEncoded = stack.getPointerAddress();
            return nLLVMPrintModuleToFile(M, FilenameEncoded, memAddress(ErrorMessage)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMPrintModuleToString ] ---

    /** {@code char * LLVMPrintModuleToString(LLVMModuleRef M)} */
    public static long nLLVMPrintModuleToString(long M) {
        long __functionAddress = Functions.PrintModuleToString;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    /** {@code char * LLVMPrintModuleToString(LLVMModuleRef M)} */
    @NativeType("char *")
    public static String LLVMPrintModuleToString(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMPrintModuleToString(M);
        return memUTF8(__result);
    }

    // --- [ LLVMGetModuleInlineAsm ] ---

    /** {@code char const * LLVMGetModuleInlineAsm(LLVMModuleRef M, size_t * Len)} */
    public static long nLLVMGetModuleInlineAsm(long M, long Len) {
        long __functionAddress = Functions.GetModuleInlineAsm;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPP(M, Len, __functionAddress);
    }

    /** {@code char const * LLVMGetModuleInlineAsm(LLVMModuleRef M, size_t * Len)} */
    @NativeType("char const *")
    public static String LLVMGetModuleInlineAsm(@NativeType("LLVMModuleRef") long M) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Len = stack.callocPointer(1);
            long __result = nLLVMGetModuleInlineAsm(M, memAddress(Len));
            return memUTF8(__result, (int)Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMSetModuleInlineAsm2 ] ---

    /** {@code void LLVMSetModuleInlineAsm2(LLVMModuleRef M, char const * Asm, size_t Len)} */
    public static void nLLVMSetModuleInlineAsm2(long M, long Asm, long Len) {
        long __functionAddress = Functions.SetModuleInlineAsm2;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        invokePPPV(M, Asm, Len, __functionAddress);
    }

    /** {@code void LLVMSetModuleInlineAsm2(LLVMModuleRef M, char const * Asm, size_t Len)} */
    public static void LLVMSetModuleInlineAsm2(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Asm) {
        nLLVMSetModuleInlineAsm2(M, memAddress(Asm), Asm.remaining());
    }

    /** {@code void LLVMSetModuleInlineAsm2(LLVMModuleRef M, char const * Asm, size_t Len)} */
    public static void LLVMSetModuleInlineAsm2(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Asm) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int AsmEncodedLength = stack.nUTF8(Asm, false);
            long AsmEncoded = stack.getPointerAddress();
            nLLVMSetModuleInlineAsm2(M, AsmEncoded, AsmEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAppendModuleInlineAsm ] ---

    /** {@code void LLVMAppendModuleInlineAsm(LLVMModuleRef M, char const * Asm, size_t Len)} */
    public static void nLLVMAppendModuleInlineAsm(long M, long Asm, long Len) {
        long __functionAddress = Functions.AppendModuleInlineAsm;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        invokePPPV(M, Asm, Len, __functionAddress);
    }

    /** {@code void LLVMAppendModuleInlineAsm(LLVMModuleRef M, char const * Asm, size_t Len)} */
    public static void LLVMAppendModuleInlineAsm(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Asm) {
        nLLVMAppendModuleInlineAsm(M, memAddress(Asm), Asm.remaining());
    }

    /** {@code void LLVMAppendModuleInlineAsm(LLVMModuleRef M, char const * Asm, size_t Len)} */
    public static void LLVMAppendModuleInlineAsm(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Asm) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int AsmEncodedLength = stack.nUTF8(Asm, false);
            long AsmEncoded = stack.getPointerAddress();
            nLLVMAppendModuleInlineAsm(M, AsmEncoded, AsmEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetInlineAsm ] ---

    /** {@code LLVMValueRef LLVMGetInlineAsm(LLVMTypeRef Ty, char const * AsmString, size_t AsmStringSize, char const * Constraints, size_t ConstraintsSize, LLVMBool HasSideEffects, LLVMBool IsAlignStack, LLVMInlineAsmDialect Dialect, LLVMBool CanThrow)} */
    public static long nLLVMGetInlineAsm(long Ty, long AsmString, long AsmStringSize, long Constraints, long ConstraintsSize, int HasSideEffects, int IsAlignStack, int Dialect, int CanThrow) {
        long __functionAddress = Functions.GetInlineAsm;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
        }
        return invokePPPPPP(Ty, AsmString, AsmStringSize, Constraints, ConstraintsSize, HasSideEffects, IsAlignStack, Dialect, CanThrow, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetInlineAsm(LLVMTypeRef Ty, char const * AsmString, size_t AsmStringSize, char const * Constraints, size_t ConstraintsSize, LLVMBool HasSideEffects, LLVMBool IsAlignStack, LLVMInlineAsmDialect Dialect, LLVMBool CanThrow)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetInlineAsm(@NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer AsmString, @NativeType("char const *") ByteBuffer Constraints, @NativeType("LLVMBool") boolean HasSideEffects, @NativeType("LLVMBool") boolean IsAlignStack, @NativeType("LLVMInlineAsmDialect") int Dialect, @NativeType("LLVMBool") boolean CanThrow) {
        return nLLVMGetInlineAsm(Ty, memAddress(AsmString), AsmString.remaining(), memAddress(Constraints), Constraints.remaining(), HasSideEffects ? 1 : 0, IsAlignStack ? 1 : 0, Dialect, CanThrow ? 1 : 0);
    }

    /** {@code LLVMValueRef LLVMGetInlineAsm(LLVMTypeRef Ty, char const * AsmString, size_t AsmStringSize, char const * Constraints, size_t ConstraintsSize, LLVMBool HasSideEffects, LLVMBool IsAlignStack, LLVMInlineAsmDialect Dialect, LLVMBool CanThrow)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetInlineAsm(@NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence AsmString, @NativeType("char const *") CharSequence Constraints, @NativeType("LLVMBool") boolean HasSideEffects, @NativeType("LLVMBool") boolean IsAlignStack, @NativeType("LLVMInlineAsmDialect") int Dialect, @NativeType("LLVMBool") boolean CanThrow) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int AsmStringEncodedLength = stack.nUTF8(AsmString, false);
            long AsmStringEncoded = stack.getPointerAddress();
            int ConstraintsEncodedLength = stack.nUTF8(Constraints, false);
            long ConstraintsEncoded = stack.getPointerAddress();
            return nLLVMGetInlineAsm(Ty, AsmStringEncoded, AsmStringEncodedLength, ConstraintsEncoded, ConstraintsEncodedLength, HasSideEffects ? 1 : 0, IsAlignStack ? 1 : 0, Dialect, CanThrow ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetInlineAsmAsmString ] ---

    /** {@code char const * LLVMGetInlineAsmAsmString(LLVMValueRef InlineAsmVal, size_t * Len)} */
    public static long nLLVMGetInlineAsmAsmString(long InlineAsmVal, long Len) {
        long __functionAddress = Functions.GetInlineAsmAsmString;
        if (CHECKS) {
            check(__functionAddress);
            check(InlineAsmVal);
        }
        return invokePPP(InlineAsmVal, Len, __functionAddress);
    }

    /** {@code char const * LLVMGetInlineAsmAsmString(LLVMValueRef InlineAsmVal, size_t * Len)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetInlineAsmAsmString(@NativeType("LLVMValueRef") long InlineAsmVal) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Len = stack.callocPointer(1);
            long __result = nLLVMGetInlineAsmAsmString(InlineAsmVal, memAddress(Len));
            return memUTF8Safe(__result, (int)Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetInlineAsmConstraintString ] ---

    /** {@code char const * LLVMGetInlineAsmConstraintString(LLVMValueRef InlineAsmVal, size_t * Len)} */
    public static long nLLVMGetInlineAsmConstraintString(long InlineAsmVal, long Len) {
        long __functionAddress = Functions.GetInlineAsmConstraintString;
        if (CHECKS) {
            check(__functionAddress);
            check(InlineAsmVal);
        }
        return invokePPP(InlineAsmVal, Len, __functionAddress);
    }

    /** {@code char const * LLVMGetInlineAsmConstraintString(LLVMValueRef InlineAsmVal, size_t * Len)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetInlineAsmConstraintString(@NativeType("LLVMValueRef") long InlineAsmVal) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Len = stack.callocPointer(1);
            long __result = nLLVMGetInlineAsmConstraintString(InlineAsmVal, memAddress(Len));
            return memUTF8Safe(__result, (int)Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetInlineAsmDialect ] ---

    /** {@code LLVMInlineAsmDialect LLVMGetInlineAsmDialect(LLVMValueRef InlineAsmVal)} */
    @NativeType("LLVMInlineAsmDialect")
    public static int LLVMGetInlineAsmDialect(@NativeType("LLVMValueRef") long InlineAsmVal) {
        long __functionAddress = Functions.GetInlineAsmDialect;
        if (CHECKS) {
            check(__functionAddress);
            check(InlineAsmVal);
        }
        return invokePI(InlineAsmVal, __functionAddress);
    }

    // --- [ LLVMGetInlineAsmFunctionType ] ---

    /** {@code LLVMTypeRef LLVMGetInlineAsmFunctionType(LLVMValueRef InlineAsmVal)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetInlineAsmFunctionType(@NativeType("LLVMValueRef") long InlineAsmVal) {
        long __functionAddress = Functions.GetInlineAsmFunctionType;
        if (CHECKS) {
            check(__functionAddress);
            check(InlineAsmVal);
        }
        return invokePP(InlineAsmVal, __functionAddress);
    }

    // --- [ LLVMGetInlineAsmHasSideEffects ] ---

    /** {@code LLVMBool LLVMGetInlineAsmHasSideEffects(LLVMValueRef InlineAsmVal)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetInlineAsmHasSideEffects(@NativeType("LLVMValueRef") long InlineAsmVal) {
        long __functionAddress = Functions.GetInlineAsmHasSideEffects;
        if (CHECKS) {
            check(__functionAddress);
            check(InlineAsmVal);
        }
        return invokePI(InlineAsmVal, __functionAddress) != 0;
    }

    // --- [ LLVMGetInlineAsmNeedsAlignedStack ] ---

    /** {@code LLVMBool LLVMGetInlineAsmNeedsAlignedStack(LLVMValueRef InlineAsmVal)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetInlineAsmNeedsAlignedStack(@NativeType("LLVMValueRef") long InlineAsmVal) {
        long __functionAddress = Functions.GetInlineAsmNeedsAlignedStack;
        if (CHECKS) {
            check(__functionAddress);
            check(InlineAsmVal);
        }
        return invokePI(InlineAsmVal, __functionAddress) != 0;
    }

    // --- [ LLVMGetInlineAsmCanUnwind ] ---

    /** {@code LLVMBool LLVMGetInlineAsmCanUnwind(LLVMValueRef InlineAsmVal)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetInlineAsmCanUnwind(@NativeType("LLVMValueRef") long InlineAsmVal) {
        long __functionAddress = Functions.GetInlineAsmCanUnwind;
        if (CHECKS) {
            check(__functionAddress);
            check(InlineAsmVal);
        }
        return invokePI(InlineAsmVal, __functionAddress) != 0;
    }

    // --- [ LLVMGetModuleContext ] ---

    /** {@code LLVMContextRef LLVMGetModuleContext(LLVMModuleRef M)} */
    @NativeType("LLVMContextRef")
    public static long LLVMGetModuleContext(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetModuleContext;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetTypeByName ] ---

    /** {@code LLVMTypeRef LLVMGetTypeByName(LLVMModuleRef M, char const * Name)} */
    public static long nLLVMGetTypeByName(long M, long Name) {
        long __functionAddress = Functions.GetTypeByName;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(M, Name, __functionAddress);
    }

    /** {@code LLVMTypeRef LLVMGetTypeByName(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetTypeByName(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetTypeByName(M, memAddress(Name));
    }

    /** {@code LLVMTypeRef LLVMGetTypeByName(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetTypeByName(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetTypeByName(M, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetFirstNamedMetadata ] ---

    /** {@code LLVMNamedMDNodeRef LLVMGetFirstNamedMetadata(LLVMModuleRef M)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetFirstNamedMetadata(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstNamedMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastNamedMetadata ] ---

    /** {@code LLVMNamedMDNodeRef LLVMGetLastNamedMetadata(LLVMModuleRef M)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetLastNamedMetadata(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastNamedMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetNextNamedMetadata ] ---

    /** {@code LLVMNamedMDNodeRef LLVMGetNextNamedMetadata(LLVMNamedMDNodeRef NamedMDNode)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetNextNamedMetadata(@NativeType("LLVMNamedMDNodeRef") long NamedMDNode) {
        long __functionAddress = Functions.GetNextNamedMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(NamedMDNode);
        }
        return invokePP(NamedMDNode, __functionAddress);
    }

    // --- [ LLVMGetPreviousNamedMetadata ] ---

    /** {@code LLVMNamedMDNodeRef LLVMGetPreviousNamedMetadata(LLVMNamedMDNodeRef NamedMDNode)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetPreviousNamedMetadata(@NativeType("LLVMNamedMDNodeRef") long NamedMDNode) {
        long __functionAddress = Functions.GetPreviousNamedMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(NamedMDNode);
        }
        return invokePP(NamedMDNode, __functionAddress);
    }

    // --- [ LLVMGetNamedMetadata ] ---

    /** {@code LLVMNamedMDNodeRef LLVMGetNamedMetadata(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    public static long nLLVMGetNamedMetadata(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetNamedMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, NameLen, __functionAddress);
    }

    /** {@code LLVMNamedMDNodeRef LLVMGetNamedMetadata(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetNamedMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetNamedMetadata(M, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMNamedMDNodeRef LLVMGetNamedMetadata(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetNamedMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedMetadata(M, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetOrInsertNamedMetadata ] ---

    /** {@code LLVMNamedMDNodeRef LLVMGetOrInsertNamedMetadata(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    public static long nLLVMGetOrInsertNamedMetadata(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetOrInsertNamedMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, NameLen, __functionAddress);
    }

    /** {@code LLVMNamedMDNodeRef LLVMGetOrInsertNamedMetadata(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetOrInsertNamedMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetOrInsertNamedMetadata(M, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMNamedMDNodeRef LLVMGetOrInsertNamedMetadata(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetOrInsertNamedMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetOrInsertNamedMetadata(M, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedMetadataName ] ---

    /** {@code char const * LLVMGetNamedMetadataName(LLVMNamedMDNodeRef NamedMD, size_t * NameLen)} */
    public static long nLLVMGetNamedMetadataName(long NamedMD, long NameLen) {
        long __functionAddress = Functions.GetNamedMetadataName;
        if (CHECKS) {
            check(__functionAddress);
            check(NamedMD);
        }
        return invokePPP(NamedMD, NameLen, __functionAddress);
    }

    /** {@code char const * LLVMGetNamedMetadataName(LLVMNamedMDNodeRef NamedMD, size_t * NameLen)} */
    @NativeType("char const *")
    public static String LLVMGetNamedMetadataName(@NativeType("LLVMNamedMDNodeRef") long NamedMD) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer NameLen = stack.callocPointer(1);
            long __result = nLLVMGetNamedMetadataName(NamedMD, memAddress(NameLen));
            return memUTF8(__result, (int)NameLen.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedMetadataNumOperands ] ---

    /** {@code unsigned int LLVMGetNamedMetadataNumOperands(LLVMModuleRef M, char const * Name)} */
    public static int nLLVMGetNamedMetadataNumOperands(long M, long Name) {
        long __functionAddress = Functions.GetNamedMetadataNumOperands;
        if (CHECKS) {
            check(M);
        }
        return invokePPI(M, Name, __functionAddress);
    }

    /** {@code unsigned int LLVMGetNamedMetadataNumOperands(LLVMModuleRef M, char const * Name)} */
    @NativeType("unsigned int")
    public static int LLVMGetNamedMetadataNumOperands(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetNamedMetadataNumOperands(M, memAddress(Name));
    }

    /** {@code unsigned int LLVMGetNamedMetadataNumOperands(LLVMModuleRef M, char const * Name)} */
    @NativeType("unsigned int")
    public static int LLVMGetNamedMetadataNumOperands(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedMetadataNumOperands(M, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedMetadataOperands ] ---

    /** {@code void LLVMGetNamedMetadataOperands(LLVMModuleRef M, char const * Name, LLVMValueRef * Dest)} */
    public static void nLLVMGetNamedMetadataOperands(long M, long Name, long Dest) {
        long __functionAddress = Functions.GetNamedMetadataOperands;
        if (CHECKS) {
            check(M);
        }
        invokePPPV(M, Name, Dest, __functionAddress);
    }

    /** {@code void LLVMGetNamedMetadataOperands(LLVMModuleRef M, char const * Name, LLVMValueRef * Dest)} */
    public static void LLVMGetNamedMetadataOperands(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMValueRef *") PointerBuffer Dest) {
        if (CHECKS) {
            checkNT1(Name);
            if (DEBUG) {
                check(Dest, LLVMGetNamedMetadataNumOperands(M, Name));
            }
        }
        nLLVMGetNamedMetadataOperands(M, memAddress(Name), memAddress(Dest));
    }

    /** {@code void LLVMGetNamedMetadataOperands(LLVMModuleRef M, char const * Name, LLVMValueRef * Dest)} */
    public static void LLVMGetNamedMetadataOperands(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name, @NativeType("LLVMValueRef *") PointerBuffer Dest) {
        if (CHECKS) {
            if (DEBUG) {
                check(Dest, LLVMGetNamedMetadataNumOperands(M, Name));
            }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            nLLVMGetNamedMetadataOperands(M, NameEncoded, memAddress(Dest));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAddNamedMetadataOperand ] ---

    /** {@code void LLVMAddNamedMetadataOperand(LLVMModuleRef M, char const * Name, LLVMValueRef Val)} */
    public static void nLLVMAddNamedMetadataOperand(long M, long Name, long Val) {
        long __functionAddress = Functions.AddNamedMetadataOperand;
        if (CHECKS) {
            check(M);
            check(Val);
        }
        invokePPPV(M, Name, Val, __functionAddress);
    }

    /** {@code void LLVMAddNamedMetadataOperand(LLVMModuleRef M, char const * Name, LLVMValueRef Val)} */
    public static void LLVMAddNamedMetadataOperand(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMValueRef") long Val) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMAddNamedMetadataOperand(M, memAddress(Name), Val);
    }

    /** {@code void LLVMAddNamedMetadataOperand(LLVMModuleRef M, char const * Name, LLVMValueRef Val)} */
    public static void LLVMAddNamedMetadataOperand(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name, @NativeType("LLVMValueRef") long Val) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            nLLVMAddNamedMetadataOperand(M, NameEncoded, Val);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetDebugLocDirectory ] ---

    /** {@code char const * LLVMGetDebugLocDirectory(LLVMValueRef Val, unsigned int * Length)} */
    public static long nLLVMGetDebugLocDirectory(long Val, long Length) {
        long __functionAddress = Functions.GetDebugLocDirectory;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePPP(Val, Length, __functionAddress);
    }

    /** {@code char const * LLVMGetDebugLocDirectory(LLVMValueRef Val, unsigned int * Length)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetDebugLocDirectory(@NativeType("LLVMValueRef") long Val) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Length = stack.callocInt(1);
            long __result = nLLVMGetDebugLocDirectory(Val, memAddress(Length));
            return memUTF8Safe(__result, Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetDebugLocFilename ] ---

    /** {@code char const * LLVMGetDebugLocFilename(LLVMValueRef Val, unsigned int * Length)} */
    public static long nLLVMGetDebugLocFilename(long Val, long Length) {
        long __functionAddress = Functions.GetDebugLocFilename;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePPP(Val, Length, __functionAddress);
    }

    /** {@code char const * LLVMGetDebugLocFilename(LLVMValueRef Val, unsigned int * Length)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetDebugLocFilename(@NativeType("LLVMValueRef") long Val) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Length = stack.callocInt(1);
            long __result = nLLVMGetDebugLocFilename(Val, memAddress(Length));
            return memUTF8Safe(__result, Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetDebugLocLine ] ---

    /** {@code unsigned int LLVMGetDebugLocLine(LLVMValueRef Val)} */
    @NativeType("unsigned int")
    public static int LLVMGetDebugLocLine(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetDebugLocLine;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePI(Val, __functionAddress);
    }

    // --- [ LLVMGetDebugLocColumn ] ---

    /** {@code unsigned int LLVMGetDebugLocColumn(LLVMValueRef Val)} */
    @NativeType("unsigned int")
    public static int LLVMGetDebugLocColumn(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetDebugLocColumn;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePI(Val, __functionAddress);
    }

    // --- [ LLVMAddFunction ] ---

    /** {@code LLVMValueRef LLVMAddFunction(LLVMModuleRef M, char const * Name, LLVMTypeRef FunctionTy)} */
    public static long nLLVMAddFunction(long M, long Name, long FunctionTy) {
        long __functionAddress = Functions.AddFunction;
        if (CHECKS) {
            check(M);
            check(FunctionTy);
        }
        return invokePPPP(M, Name, FunctionTy, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMAddFunction(LLVMModuleRef M, char const * Name, LLVMTypeRef FunctionTy)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddFunction(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMTypeRef") long FunctionTy) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddFunction(M, memAddress(Name), FunctionTy);
    }

    /** {@code LLVMValueRef LLVMAddFunction(LLVMModuleRef M, char const * Name, LLVMTypeRef FunctionTy)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddFunction(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name, @NativeType("LLVMTypeRef") long FunctionTy) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAddFunction(M, NameEncoded, FunctionTy);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedFunction ] ---

    /** {@code LLVMValueRef LLVMGetNamedFunction(LLVMModuleRef M, char const * Name)} */
    public static long nLLVMGetNamedFunction(long M, long Name) {
        long __functionAddress = Functions.GetNamedFunction;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(M, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetNamedFunction(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedFunction(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetNamedFunction(M, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMGetNamedFunction(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedFunction(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedFunction(M, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedFunctionWithLength ] ---

    /** {@code LLVMValueRef LLVMGetNamedFunctionWithLength(LLVMModuleRef M, char const * Name, size_t Length)} */
    public static long nLLVMGetNamedFunctionWithLength(long M, long Name, long Length) {
        long __functionAddress = Functions.GetNamedFunctionWithLength;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, Length, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetNamedFunctionWithLength(LLVMModuleRef M, char const * Name, size_t Length)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedFunctionWithLength(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetNamedFunctionWithLength(M, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMValueRef LLVMGetNamedFunctionWithLength(LLVMModuleRef M, char const * Name, size_t Length)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedFunctionWithLength(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedFunctionWithLength(M, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetFirstFunction ] ---

    /** {@code LLVMValueRef LLVMGetFirstFunction(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstFunction(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstFunction;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastFunction ] ---

    /** {@code LLVMValueRef LLVMGetLastFunction(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastFunction(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastFunction;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetNextFunction ] ---

    /** {@code LLVMValueRef LLVMGetNextFunction(LLVMValueRef Fn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextFunction(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetNextFunction;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetPreviousFunction ] ---

    /** {@code LLVMValueRef LLVMGetPreviousFunction(LLVMValueRef Fn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousFunction(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetPreviousFunction;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMSetModuleInlineAsm ] ---

    /** {@code void LLVMSetModuleInlineAsm(LLVMModuleRef M, char const * Asm)} */
    public static void nLLVMSetModuleInlineAsm(long M, long Asm) {
        long __functionAddress = Functions.SetModuleInlineAsm;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        invokePPV(M, Asm, __functionAddress);
    }

    /** {@code void LLVMSetModuleInlineAsm(LLVMModuleRef M, char const * Asm)} */
    public static void LLVMSetModuleInlineAsm(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Asm) {
        if (CHECKS) {
            checkNT1(Asm);
        }
        nLLVMSetModuleInlineAsm(M, memAddress(Asm));
    }

    /** {@code void LLVMSetModuleInlineAsm(LLVMModuleRef M, char const * Asm)} */
    public static void LLVMSetModuleInlineAsm(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Asm) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Asm, true);
            long AsmEncoded = stack.getPointerAddress();
            nLLVMSetModuleInlineAsm(M, AsmEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetTypeKind ] ---

    /** {@code LLVMTypeKind LLVMGetTypeKind(LLVMTypeRef Ty)} */
    @NativeType("LLVMTypeKind")
    public static int LLVMGetTypeKind(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetTypeKind;
        if (CHECKS) {
            check(Ty);
        }
        return invokePI(Ty, __functionAddress);
    }

    // --- [ LLVMTypeIsSized ] ---

    /** {@code LLVMBool LLVMTypeIsSized(LLVMTypeRef Ty)} */
    @NativeType("LLVMBool")
    public static boolean LLVMTypeIsSized(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.TypeIsSized;
        if (CHECKS) {
            check(Ty);
        }
        return invokePI(Ty, __functionAddress) != 0;
    }

    // --- [ LLVMGetTypeContext ] ---

    /** {@code LLVMContextRef LLVMGetTypeContext(LLVMTypeRef Ty)} */
    @NativeType("LLVMContextRef")
    public static long LLVMGetTypeContext(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetTypeContext;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMDumpType ] ---

    /** {@code void LLVMDumpType(LLVMTypeRef Val)} */
    public static void LLVMDumpType(@NativeType("LLVMTypeRef") long Val) {
        long __functionAddress = Functions.DumpType;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        invokePV(Val, __functionAddress);
    }

    // --- [ LLVMPrintTypeToString ] ---

    /** {@code char * LLVMPrintTypeToString(LLVMTypeRef Val)} */
    public static long nLLVMPrintTypeToString(long Val) {
        long __functionAddress = Functions.PrintTypeToString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    /** {@code char * LLVMPrintTypeToString(LLVMTypeRef Val)} */
    @NativeType("char *")
    public static String LLVMPrintTypeToString(@NativeType("LLVMTypeRef") long Val) {
        long __result = nLLVMPrintTypeToString(Val);
        return memUTF8(__result);
    }

    // --- [ LLVMInt1TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMInt1TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt1TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int1TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt8TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMInt8TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt8TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int8TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt16TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMInt16TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt16TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int16TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt32TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMInt32TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt32TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int32TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt64TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMInt64TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt64TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int64TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt128TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMInt128TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMIntTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMIntTypeInContext(LLVMContextRef C, unsigned int NumBits)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("unsigned int") int NumBits) {
        long __functionAddress = Functions.IntTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, NumBits, __functionAddress);
    }

    // --- [ LLVMInt1Type ] ---

    /** {@code LLVMTypeRef LLVMInt1Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt1Type() {
        long __functionAddress = Functions.Int1Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt8Type ] ---

    /** {@code LLVMTypeRef LLVMInt8Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt8Type() {
        long __functionAddress = Functions.Int8Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt16Type ] ---

    /** {@code LLVMTypeRef LLVMInt16Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt16Type() {
        long __functionAddress = Functions.Int16Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt32Type ] ---

    /** {@code LLVMTypeRef LLVMInt32Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt32Type() {
        long __functionAddress = Functions.Int32Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt64Type ] ---

    /** {@code LLVMTypeRef LLVMInt64Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt64Type() {
        long __functionAddress = Functions.Int64Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt128Type ] ---

    /** {@code LLVMTypeRef LLVMInt128Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt128Type() {
        long __functionAddress = Functions.Int128Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMIntType ] ---

    /** {@code LLVMTypeRef LLVMIntType(unsigned int NumBits)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMIntType(@NativeType("unsigned int") int NumBits) {
        long __functionAddress = Functions.IntType;
        return invokeP(NumBits, __functionAddress);
    }

    // --- [ LLVMGetIntTypeWidth ] ---

    /** {@code unsigned int LLVMGetIntTypeWidth(LLVMTypeRef IntegerTy)} */
    @NativeType("unsigned int")
    public static int LLVMGetIntTypeWidth(@NativeType("LLVMTypeRef") long IntegerTy) {
        long __functionAddress = Functions.GetIntTypeWidth;
        if (CHECKS) {
            check(IntegerTy);
        }
        return invokePI(IntegerTy, __functionAddress);
    }

    // --- [ LLVMHalfTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMHalfTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMHalfTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.HalfTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMBFloatTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMBFloatTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMBFloatTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.BFloatTypeInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMFloatTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMFloatTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMFloatTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.FloatTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMDoubleTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMDoubleTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMDoubleTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.DoubleTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMX86FP80TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMX86FP80TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86FP80TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.X86FP80TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMFP128TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMFP128TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMFP128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.FP128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMPPCFP128TypeInContext ] ---

    /** {@code LLVMTypeRef LLVMPPCFP128TypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMPPCFP128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.PPCFP128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMHalfType ] ---

    /** {@code LLVMTypeRef LLVMHalfType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMHalfType() {
        long __functionAddress = Functions.HalfType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMBFloatType ] ---

    /** {@code LLVMTypeRef LLVMBFloatType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMBFloatType() {
        long __functionAddress = Functions.BFloatType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMFloatType ] ---

    /** {@code LLVMTypeRef LLVMFloatType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMFloatType() {
        long __functionAddress = Functions.FloatType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMDoubleType ] ---

    /** {@code LLVMTypeRef LLVMDoubleType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMDoubleType() {
        long __functionAddress = Functions.DoubleType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMX86FP80Type ] ---

    /** {@code LLVMTypeRef LLVMX86FP80Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86FP80Type() {
        long __functionAddress = Functions.X86FP80Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMFP128Type ] ---

    /** {@code LLVMTypeRef LLVMFP128Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMFP128Type() {
        long __functionAddress = Functions.FP128Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMPPCFP128Type ] ---

    /** {@code LLVMTypeRef LLVMPPCFP128Type(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMPPCFP128Type() {
        long __functionAddress = Functions.PPCFP128Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMFunctionType ] ---

    /** {@code LLVMTypeRef LLVMFunctionType(LLVMTypeRef ReturnType, LLVMTypeRef * ParamTypes, unsigned int ParamCount, LLVMBool IsVarArg)} */
    public static long nLLVMFunctionType(long ReturnType, long ParamTypes, int ParamCount, int IsVarArg) {
        long __functionAddress = Functions.FunctionType;
        if (CHECKS) {
            check(ReturnType);
        }
        return invokePPP(ReturnType, ParamTypes, ParamCount, IsVarArg, __functionAddress);
    }

    /** {@code LLVMTypeRef LLVMFunctionType(LLVMTypeRef ReturnType, LLVMTypeRef * ParamTypes, unsigned int ParamCount, LLVMBool IsVarArg)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMFunctionType(@NativeType("LLVMTypeRef") long ReturnType, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes, @NativeType("LLVMBool") boolean IsVarArg) {
        return nLLVMFunctionType(ReturnType, memAddress(ParamTypes), ParamTypes.remaining(), IsVarArg ? 1 : 0);
    }

    // --- [ LLVMIsFunctionVarArg ] ---

    /** {@code LLVMBool LLVMIsFunctionVarArg(LLVMTypeRef FunctionTy)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsFunctionVarArg(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.IsFunctionVarArg;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePI(FunctionTy, __functionAddress) != 0;
    }

    // --- [ LLVMGetReturnType ] ---

    /** {@code LLVMTypeRef LLVMGetReturnType(LLVMTypeRef FunctionTy)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetReturnType(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.GetReturnType;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePP(FunctionTy, __functionAddress);
    }

    // --- [ LLVMCountParamTypes ] ---

    /** {@code unsigned int LLVMCountParamTypes(LLVMTypeRef FunctionTy)} */
    @NativeType("unsigned int")
    public static int LLVMCountParamTypes(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.CountParamTypes;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePI(FunctionTy, __functionAddress);
    }

    // --- [ LLVMGetParamTypes ] ---

    /** {@code void LLVMGetParamTypes(LLVMTypeRef FunctionTy, LLVMTypeRef * Dest)} */
    public static void nLLVMGetParamTypes(long FunctionTy, long Dest) {
        long __functionAddress = Functions.GetParamTypes;
        if (CHECKS) {
            check(FunctionTy);
        }
        invokePPV(FunctionTy, Dest, __functionAddress);
    }

    /** {@code void LLVMGetParamTypes(LLVMTypeRef FunctionTy, LLVMTypeRef * Dest)} */
    public static void LLVMGetParamTypes(@NativeType("LLVMTypeRef") long FunctionTy, @NativeType("LLVMTypeRef *") PointerBuffer Dest) {
        if (CHECKS) {
            if (DEBUG) {
                check(Dest, LLVMCountParamTypes(FunctionTy));
            }
        }
        nLLVMGetParamTypes(FunctionTy, memAddress(Dest));
    }

    // --- [ LLVMStructTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMStructTypeInContext(LLVMContextRef C, LLVMTypeRef * ElementTypes, unsigned int ElementCount, LLVMBool Packed)} */
    public static long nLLVMStructTypeInContext(long C, long ElementTypes, int ElementCount, int Packed) {
        long __functionAddress = Functions.StructTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, ElementTypes, ElementCount, Packed, __functionAddress);
    }

    /** {@code LLVMTypeRef LLVMStructTypeInContext(LLVMContextRef C, LLVMTypeRef * ElementTypes, unsigned int ElementCount, LLVMBool Packed)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMTypeRef *") PointerBuffer ElementTypes, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMStructTypeInContext(C, memAddress(ElementTypes), ElementTypes.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMStructType ] ---

    /** {@code LLVMTypeRef LLVMStructType(LLVMTypeRef * ElementTypes, unsigned int ElementCount, LLVMBool Packed)} */
    public static long nLLVMStructType(long ElementTypes, int ElementCount, int Packed) {
        long __functionAddress = Functions.StructType;
        return invokePP(ElementTypes, ElementCount, Packed, __functionAddress);
    }

    /** {@code LLVMTypeRef LLVMStructType(LLVMTypeRef * ElementTypes, unsigned int ElementCount, LLVMBool Packed)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructType(@NativeType("LLVMTypeRef *") PointerBuffer ElementTypes, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMStructType(memAddress(ElementTypes), ElementTypes.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMStructCreateNamed ] ---

    /** {@code LLVMTypeRef LLVMStructCreateNamed(LLVMContextRef C, char const * Name)} */
    public static long nLLVMStructCreateNamed(long C, long Name) {
        long __functionAddress = Functions.StructCreateNamed;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, Name, __functionAddress);
    }

    /** {@code LLVMTypeRef LLVMStructCreateNamed(LLVMContextRef C, char const * Name)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructCreateNamed(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMStructCreateNamed(C, memAddress(Name));
    }

    /** {@code LLVMTypeRef LLVMStructCreateNamed(LLVMContextRef C, char const * Name)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructCreateNamed(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMStructCreateNamed(C, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetStructName ] ---

    /** {@code char const * LLVMGetStructName(LLVMTypeRef Ty)} */
    public static long nLLVMGetStructName(long Ty) {
        long __functionAddress = Functions.GetStructName;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    /** {@code char const * LLVMGetStructName(LLVMTypeRef Ty)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetStructName(@NativeType("LLVMTypeRef") long Ty) {
        long __result = nLLVMGetStructName(Ty);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMStructSetBody ] ---

    /** {@code void LLVMStructSetBody(LLVMTypeRef StructTy, LLVMTypeRef * ElementTypes, unsigned int ElementCount, LLVMBool Packed)} */
    public static void nLLVMStructSetBody(long StructTy, long ElementTypes, int ElementCount, int Packed) {
        long __functionAddress = Functions.StructSetBody;
        if (CHECKS) {
            check(StructTy);
        }
        invokePPV(StructTy, ElementTypes, ElementCount, Packed, __functionAddress);
    }

    /** {@code void LLVMStructSetBody(LLVMTypeRef StructTy, LLVMTypeRef * ElementTypes, unsigned int ElementCount, LLVMBool Packed)} */
    public static void LLVMStructSetBody(@NativeType("LLVMTypeRef") long StructTy, @NativeType("LLVMTypeRef *") PointerBuffer ElementTypes, @NativeType("LLVMBool") boolean Packed) {
        nLLVMStructSetBody(StructTy, memAddress(ElementTypes), ElementTypes.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMCountStructElementTypes ] ---

    /** {@code unsigned int LLVMCountStructElementTypes(LLVMTypeRef StructTy)} */
    @NativeType("unsigned int")
    public static int LLVMCountStructElementTypes(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.CountStructElementTypes;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(StructTy, __functionAddress);
    }

    // --- [ LLVMGetStructElementTypes ] ---

    /** {@code void LLVMGetStructElementTypes(LLVMTypeRef StructTy, LLVMTypeRef * Dest)} */
    public static void nLLVMGetStructElementTypes(long StructTy, long Dest) {
        long __functionAddress = Functions.GetStructElementTypes;
        if (CHECKS) {
            check(StructTy);
        }
        invokePPV(StructTy, Dest, __functionAddress);
    }

    /** {@code void LLVMGetStructElementTypes(LLVMTypeRef StructTy, LLVMTypeRef * Dest)} */
    public static void LLVMGetStructElementTypes(@NativeType("LLVMTypeRef") long StructTy, @NativeType("LLVMTypeRef *") PointerBuffer Dest) {
        if (CHECKS) {
            if (DEBUG) {
                check(Dest, LLVMCountStructElementTypes(StructTy));
            }
        }
        nLLVMGetStructElementTypes(StructTy, memAddress(Dest));
    }

    // --- [ LLVMStructGetTypeAtIndex ] ---

    /** {@code LLVMTypeRef LLVMStructGetTypeAtIndex(LLVMTypeRef StructTy, unsigned int i)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructGetTypeAtIndex(@NativeType("LLVMTypeRef") long StructTy, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.StructGetTypeAtIndex;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePP(StructTy, i, __functionAddress);
    }

    // --- [ LLVMIsPackedStruct ] ---

    /** {@code LLVMBool LLVMIsPackedStruct(LLVMTypeRef StructTy)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsPackedStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsPackedStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(StructTy, __functionAddress) != 0;
    }

    // --- [ LLVMIsOpaqueStruct ] ---

    /** {@code LLVMBool LLVMIsOpaqueStruct(LLVMTypeRef StructTy)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsOpaqueStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsOpaqueStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(StructTy, __functionAddress) != 0;
    }

    // --- [ LLVMIsLiteralStruct ] ---

    /** {@code LLVMBool LLVMIsLiteralStruct(LLVMTypeRef StructTy)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsLiteralStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsLiteralStruct;
        if (CHECKS) {
            check(__functionAddress);
            check(StructTy);
        }
        return invokePI(StructTy, __functionAddress) != 0;
    }

    // --- [ LLVMGetElementType ] ---

    /** {@code LLVMTypeRef LLVMGetElementType(LLVMTypeRef Ty)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetElementType(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetElementType;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMGetSubtypes ] ---

    /** {@code void LLVMGetSubtypes(LLVMTypeRef Tp, LLVMTypeRef * Arr)} */
    public static void nLLVMGetSubtypes(long Tp, long Arr) {
        long __functionAddress = Functions.GetSubtypes;
        if (CHECKS) {
            check(Tp);
        }
        invokePPV(Tp, Arr, __functionAddress);
    }

    /** {@code void LLVMGetSubtypes(LLVMTypeRef Tp, LLVMTypeRef * Arr)} */
    public static void LLVMGetSubtypes(@NativeType("LLVMTypeRef") long Tp, @NativeType("LLVMTypeRef *") PointerBuffer Arr) {
        nLLVMGetSubtypes(Tp, memAddress(Arr));
    }

    // --- [ LLVMGetNumContainedTypes ] ---

    /** {@code unsigned int LLVMGetNumContainedTypes(LLVMTypeRef Tp)} */
    @NativeType("unsigned int")
    public static int LLVMGetNumContainedTypes(@NativeType("LLVMTypeRef") long Tp) {
        long __functionAddress = Functions.GetNumContainedTypes;
        if (CHECKS) {
            check(Tp);
        }
        return invokePI(Tp, __functionAddress);
    }

    // --- [ LLVMArrayType ] ---

    /** {@code LLVMTypeRef LLVMArrayType(LLVMTypeRef ElementType, unsigned int ElementCount)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMArrayType(@NativeType("LLVMTypeRef") long ElementType, @NativeType("unsigned int") int ElementCount) {
        long __functionAddress = Functions.ArrayType;
        if (CHECKS) {
            check(ElementType);
        }
        return invokePP(ElementType, ElementCount, __functionAddress);
    }

    // --- [ LLVMArrayType2 ] ---

    /** {@code LLVMTypeRef LLVMArrayType2(LLVMTypeRef ElementType, uint64_t ElementCount)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMArrayType2(@NativeType("LLVMTypeRef") long ElementType, @NativeType("uint64_t") long ElementCount) {
        long __functionAddress = Functions.ArrayType2;
        if (CHECKS) {
            check(ElementType);
        }
        return invokePJP(ElementType, ElementCount, __functionAddress);
    }

    // --- [ LLVMGetArrayLength ] ---

    /** {@code unsigned int LLVMGetArrayLength(LLVMTypeRef ArrayTy)} */
    @NativeType("unsigned int")
    public static int LLVMGetArrayLength(@NativeType("LLVMTypeRef") long ArrayTy) {
        long __functionAddress = Functions.GetArrayLength;
        if (CHECKS) {
            check(ArrayTy);
        }
        return invokePI(ArrayTy, __functionAddress);
    }

    // --- [ LLVMGetArrayLength2 ] ---

    /** {@code uint64_t LLVMGetArrayLength2(LLVMTypeRef ArrayTy)} */
    @NativeType("uint64_t")
    public static long LLVMGetArrayLength2(@NativeType("LLVMTypeRef") long ArrayTy) {
        long __functionAddress = Functions.GetArrayLength2;
        if (CHECKS) {
            check(ArrayTy);
        }
        return invokePJ(ArrayTy, __functionAddress);
    }

    // --- [ LLVMPointerType ] ---

    /** {@code LLVMTypeRef LLVMPointerType(LLVMTypeRef ElementType, unsigned int AddressSpace)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMPointerType(@NativeType("LLVMTypeRef") long ElementType, @NativeType("unsigned int") int AddressSpace) {
        long __functionAddress = Functions.PointerType;
        if (CHECKS) {
            check(ElementType);
        }
        return invokePP(ElementType, AddressSpace, __functionAddress);
    }

    // --- [ LLVMPointerTypeIsOpaque ] ---

    /** {@code LLVMBool LLVMPointerTypeIsOpaque(LLVMTypeRef Ty)} */
    @NativeType("LLVMBool")
    public static boolean LLVMPointerTypeIsOpaque(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.PointerTypeIsOpaque;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
        }
        return invokePI(Ty, __functionAddress) != 0;
    }

    // --- [ LLVMPointerTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMPointerTypeInContext(LLVMContextRef C, unsigned AddressSpace)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMPointerTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("unsigned") int AddressSpace) {
        long __functionAddress = Functions.PointerTypeInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, AddressSpace, __functionAddress);
    }

    // --- [ LLVMGetPointerAddressSpace ] ---

    /** {@code unsigned int LLVMGetPointerAddressSpace(LLVMTypeRef PointerTy)} */
    @NativeType("unsigned int")
    public static int LLVMGetPointerAddressSpace(@NativeType("LLVMTypeRef") long PointerTy) {
        long __functionAddress = Functions.GetPointerAddressSpace;
        if (CHECKS) {
            check(PointerTy);
        }
        return invokePI(PointerTy, __functionAddress);
    }

    // --- [ LLVMVectorType ] ---

    /** {@code LLVMTypeRef LLVMVectorType(LLVMTypeRef ElementType, unsigned int ElementCount)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMVectorType(@NativeType("LLVMTypeRef") long ElementType, @NativeType("unsigned int") int ElementCount) {
        long __functionAddress = Functions.VectorType;
        if (CHECKS) {
            check(ElementType);
        }
        return invokePP(ElementType, ElementCount, __functionAddress);
    }

    // --- [ LLVMScalableVectorType ] ---

    /** {@code LLVMTypeRef LLVMScalableVectorType(LLVMTypeRef ElementType, unsigned ElementCount)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMScalableVectorType(@NativeType("LLVMTypeRef") long ElementType, @NativeType("unsigned") int ElementCount) {
        long __functionAddress = Functions.ScalableVectorType;
        if (CHECKS) {
            check(__functionAddress);
            check(ElementType);
        }
        return invokePP(ElementType, ElementCount, __functionAddress);
    }

    // --- [ LLVMGetVectorSize ] ---

    /** {@code unsigned int LLVMGetVectorSize(LLVMTypeRef VectorTy)} */
    @NativeType("unsigned int")
    public static int LLVMGetVectorSize(@NativeType("LLVMTypeRef") long VectorTy) {
        long __functionAddress = Functions.GetVectorSize;
        if (CHECKS) {
            check(VectorTy);
        }
        return invokePI(VectorTy, __functionAddress);
    }

    // --- [ LLVMGetConstantPtrAuthPointer ] ---

    /** {@code LLVMValueRef LLVMGetConstantPtrAuthPointer(LLVMValueRef PtrAuth)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetConstantPtrAuthPointer(@NativeType("LLVMValueRef") long PtrAuth) {
        long __functionAddress = Functions.GetConstantPtrAuthPointer;
        if (CHECKS) {
            check(__functionAddress);
            check(PtrAuth);
        }
        return invokePP(PtrAuth, __functionAddress);
    }

    // --- [ LLVMGetConstantPtrAuthKey ] ---

    /** {@code LLVMValueRef LLVMGetConstantPtrAuthKey(LLVMValueRef PtrAuth)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetConstantPtrAuthKey(@NativeType("LLVMValueRef") long PtrAuth) {
        long __functionAddress = Functions.GetConstantPtrAuthKey;
        if (CHECKS) {
            check(__functionAddress);
            check(PtrAuth);
        }
        return invokePP(PtrAuth, __functionAddress);
    }

    // --- [ LLVMGetConstantPtrAuthDiscriminator ] ---

    /** {@code LLVMValueRef LLVMGetConstantPtrAuthDiscriminator(LLVMValueRef PtrAuth)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetConstantPtrAuthDiscriminator(@NativeType("LLVMValueRef") long PtrAuth) {
        long __functionAddress = Functions.GetConstantPtrAuthDiscriminator;
        if (CHECKS) {
            check(__functionAddress);
            check(PtrAuth);
        }
        return invokePP(PtrAuth, __functionAddress);
    }

    // --- [ LLVMGetConstantPtrAuthAddrDiscriminator ] ---

    /** {@code LLVMValueRef LLVMGetConstantPtrAuthAddrDiscriminator(LLVMValueRef PtrAuth)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetConstantPtrAuthAddrDiscriminator(@NativeType("LLVMValueRef") long PtrAuth) {
        long __functionAddress = Functions.GetConstantPtrAuthAddrDiscriminator;
        if (CHECKS) {
            check(__functionAddress);
            check(PtrAuth);
        }
        return invokePP(PtrAuth, __functionAddress);
    }

    // --- [ LLVMVoidTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMVoidTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMVoidTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.VoidTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMLabelTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMLabelTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMLabelTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.LabelTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMX86MMXTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMX86MMXTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86MMXTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.X86MMXTypeInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMX86AMXTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMX86AMXTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86AMXTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.X86AMXTypeInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMTokenTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMTokenTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMTokenTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.TokenTypeInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMMetadataTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMMetadataTypeInContext(LLVMContextRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMMetadataTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.MetadataTypeInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMVoidType ] ---

    /** {@code LLVMTypeRef LLVMVoidType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMVoidType() {
        long __functionAddress = Functions.VoidType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMLabelType ] ---

    /** {@code LLVMTypeRef LLVMLabelType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMLabelType() {
        long __functionAddress = Functions.LabelType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMX86MMXType ] ---

    /** {@code LLVMTypeRef LLVMX86MMXType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86MMXType() {
        long __functionAddress = Functions.X86MMXType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMX86AMXType ] ---

    /** {@code LLVMTypeRef LLVMX86AMXType(void)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86AMXType() {
        long __functionAddress = Functions.X86AMXType;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMTargetExtTypeInContext ] ---

    /** {@code LLVMTypeRef LLVMTargetExtTypeInContext(LLVMContextRef C, char const * Name, LLVMTypeRef * TypeParams, unsigned TypeParamCount, unsigned * IntParams, unsigned IntParamCount)} */
    public static long nLLVMTargetExtTypeInContext(long C, long Name, long TypeParams, int TypeParamCount, long IntParams, int IntParamCount) {
        long __functionAddress = Functions.TargetExtTypeInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPPPP(C, Name, TypeParams, TypeParamCount, IntParams, IntParamCount, __functionAddress);
    }

    /** {@code LLVMTypeRef LLVMTargetExtTypeInContext(LLVMContextRef C, char const * Name, LLVMTypeRef * TypeParams, unsigned TypeParamCount, unsigned * IntParams, unsigned IntParamCount)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMTargetExtTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMTypeRef *") @Nullable PointerBuffer TypeParams, @NativeType("unsigned *") @Nullable IntBuffer IntParams) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMTargetExtTypeInContext(C, memAddress(Name), memAddressSafe(TypeParams), remainingSafe(TypeParams), memAddressSafe(IntParams), remainingSafe(IntParams));
    }

    /** {@code LLVMTypeRef LLVMTargetExtTypeInContext(LLVMContextRef C, char const * Name, LLVMTypeRef * TypeParams, unsigned TypeParamCount, unsigned * IntParams, unsigned IntParamCount)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMTargetExtTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Name, @NativeType("LLVMTypeRef *") @Nullable PointerBuffer TypeParams, @NativeType("unsigned *") @Nullable IntBuffer IntParams) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMTargetExtTypeInContext(C, NameEncoded, memAddressSafe(TypeParams), remainingSafe(TypeParams), memAddressSafe(IntParams), remainingSafe(IntParams));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetTargetExtTypeName ] ---

    /** {@code char const * LLVMGetTargetExtTypeName(LLVMTypeRef TargetExtTy)} */
    public static long nLLVMGetTargetExtTypeName(long TargetExtTy) {
        long __functionAddress = Functions.GetTargetExtTypeName;
        if (CHECKS) {
            check(__functionAddress);
            check(TargetExtTy);
        }
        return invokePP(TargetExtTy, __functionAddress);
    }

    /** {@code char const * LLVMGetTargetExtTypeName(LLVMTypeRef TargetExtTy)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetTargetExtTypeName(@NativeType("LLVMTypeRef") long TargetExtTy) {
        long __result = nLLVMGetTargetExtTypeName(TargetExtTy);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetTargetExtTypeNumTypeParams ] ---

    /** {@code unsigned LLVMGetTargetExtTypeNumTypeParams(LLVMTypeRef TargetExtTy)} */
    @NativeType("unsigned")
    public static int LLVMGetTargetExtTypeNumTypeParams(@NativeType("LLVMTypeRef") long TargetExtTy) {
        long __functionAddress = Functions.GetTargetExtTypeNumTypeParams;
        if (CHECKS) {
            check(__functionAddress);
            check(TargetExtTy);
        }
        return invokePI(TargetExtTy, __functionAddress);
    }

    // --- [ LLVMGetTargetExtTypeTypeParam ] ---

    /** {@code LLVMTypeRef LLVMGetTargetExtTypeTypeParam(LLVMTypeRef TargetExtTy, unsigned Idx)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetTargetExtTypeTypeParam(@NativeType("LLVMTypeRef") long TargetExtTy, @NativeType("unsigned") int Idx) {
        long __functionAddress = Functions.GetTargetExtTypeTypeParam;
        if (CHECKS) {
            check(__functionAddress);
            check(TargetExtTy);
        }
        return invokePP(TargetExtTy, Idx, __functionAddress);
    }

    // --- [ LLVMGetTargetExtTypeNumIntParams ] ---

    /** {@code unsigned LLVMGetTargetExtTypeNumIntParams(LLVMTypeRef TargetExtTy)} */
    @NativeType("unsigned")
    public static int LLVMGetTargetExtTypeNumIntParams(@NativeType("LLVMTypeRef") long TargetExtTy) {
        long __functionAddress = Functions.GetTargetExtTypeNumIntParams;
        if (CHECKS) {
            check(__functionAddress);
            check(TargetExtTy);
        }
        return invokePI(TargetExtTy, __functionAddress);
    }

    // --- [ LLVMGetTargetExtTypeIntParam ] ---

    /** {@code unsigned LLVMGetTargetExtTypeIntParam(LLVMTypeRef TargetExtTy, unsigned Idx)} */
    @NativeType("unsigned")
    public static int LLVMGetTargetExtTypeIntParam(@NativeType("LLVMTypeRef") long TargetExtTy, @NativeType("unsigned") int Idx) {
        long __functionAddress = Functions.GetTargetExtTypeIntParam;
        if (CHECKS) {
            check(__functionAddress);
            check(TargetExtTy);
        }
        return invokePI(TargetExtTy, Idx, __functionAddress);
    }

    // --- [ LLVMTypeOf ] ---

    /** {@code LLVMTypeRef LLVMTypeOf(LLVMValueRef Val)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMTypeOf(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.TypeOf;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetValueKind ] ---

    /** {@code LLVMValueKind LLVMGetValueKind(LLVMValueRef Val)} */
    @NativeType("LLVMValueKind")
    public static int LLVMGetValueKind(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetValueKind;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress);
    }

    // --- [ LLVMGetValueName2 ] ---

    /** {@code char const * LLVMGetValueName2(LLVMValueRef Val, size_t * Length)} */
    public static long nLLVMGetValueName2(long Val, long Length) {
        long __functionAddress = Functions.GetValueName2;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePPP(Val, Length, __functionAddress);
    }

    /** {@code char const * LLVMGetValueName2(LLVMValueRef Val, size_t * Length)} */
    @NativeType("char const *")
    public static String LLVMGetValueName2(@NativeType("LLVMValueRef") long Val) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Length = stack.callocPointer(1);
            long __result = nLLVMGetValueName2(Val, memAddress(Length));
            return memUTF8(__result, (int)Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMSetValueName2 ] ---

    /** {@code void LLVMSetValueName2(LLVMValueRef Val, char const * Name, size_t NameLen)} */
    public static void nLLVMSetValueName2(long Val, long Name, long NameLen) {
        long __functionAddress = Functions.SetValueName2;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        invokePPPV(Val, Name, NameLen, __functionAddress);
    }

    /** {@code void LLVMSetValueName2(LLVMValueRef Val, char const * Name, size_t NameLen)} */
    public static void LLVMSetValueName2(@NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        nLLVMSetValueName2(Val, memAddress(Name), Name.remaining());
    }

    /** {@code void LLVMSetValueName2(LLVMValueRef Val, char const * Name, size_t NameLen)} */
    public static void LLVMSetValueName2(@NativeType("LLVMValueRef") long Val, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            nLLVMSetValueName2(Val, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDumpValue ] ---

    /** {@code void LLVMDumpValue(LLVMValueRef Val)} */
    public static void LLVMDumpValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.DumpValue;
        if (CHECKS) {
            check(Val);
        }
        invokePV(Val, __functionAddress);
    }

    // --- [ LLVMPrintValueToString ] ---

    /** {@code char * LLVMPrintValueToString(LLVMValueRef Val)} */
    public static long nLLVMPrintValueToString(long Val) {
        long __functionAddress = Functions.PrintValueToString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    /** {@code char * LLVMPrintValueToString(LLVMValueRef Val)} */
    @NativeType("char *")
    public static String LLVMPrintValueToString(@NativeType("LLVMValueRef") long Val) {
        long __result = nLLVMPrintValueToString(Val);
        return memUTF8(__result);
    }

    // --- [ LLVMGetValueContext ] ---

    /** {@code LLVMContextRef LLVMGetValueContext(LLVMValueRef Val)} */
    @NativeType("LLVMContextRef")
    public static long LLVMGetValueContext(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetValueContext;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMPrintDbgRecordToString ] ---

    /** {@code char * LLVMPrintDbgRecordToString(LLVMDbgRecordRef Record)} */
    public static long nLLVMPrintDbgRecordToString(long Record) {
        long __functionAddress = Functions.PrintDbgRecordToString;
        if (CHECKS) {
            check(__functionAddress);
            check(Record);
        }
        return invokePP(Record, __functionAddress);
    }

    /** {@code char * LLVMPrintDbgRecordToString(LLVMDbgRecordRef Record)} */
    @NativeType("char *")
    public static @Nullable String LLVMPrintDbgRecordToString(@NativeType("LLVMDbgRecordRef") long Record) {
        long __result = nLLVMPrintDbgRecordToString(Record);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMReplaceAllUsesWith ] ---

    /** {@code void LLVMReplaceAllUsesWith(LLVMValueRef OldVal, LLVMValueRef NewVal)} */
    public static void LLVMReplaceAllUsesWith(@NativeType("LLVMValueRef") long OldVal, @NativeType("LLVMValueRef") long NewVal) {
        long __functionAddress = Functions.ReplaceAllUsesWith;
        if (CHECKS) {
            check(OldVal);
            check(NewVal);
        }
        invokePPV(OldVal, NewVal, __functionAddress);
    }

    // --- [ LLVMIsConstant ] ---

    /** {@code LLVMBool LLVMIsConstant(LLVMValueRef Val)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsConstant(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsConstant;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMIsUndef ] ---

    /** {@code LLVMBool LLVMIsUndef(LLVMValueRef Val)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsUndef(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsUndef;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMIsPoison ] ---

    /** {@code LLVMBool LLVMIsPoison(LLVMValueRef Val)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsPoison(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsPoison;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMIsAArgument ] ---

    /** {@code LLVMValueRef LLVMIsAArgument(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAArgument(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAArgument;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABasicBlock ] ---

    /** {@code LLVMValueRef LLVMIsABasicBlock(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsABasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInlineAsm ] ---

    /** {@code LLVMValueRef LLVMIsAInlineAsm(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAInlineAsm(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInlineAsm;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUser ] ---

    /** {@code LLVMValueRef LLVMIsAUser(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAUser(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUser;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstant ] ---

    /** {@code LLVMValueRef LLVMIsAConstant(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstant(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstant;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABlockAddress ] ---

    /** {@code LLVMValueRef LLVMIsABlockAddress(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsABlockAddress(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABlockAddress;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantAggregateZero ] ---

    /** {@code LLVMValueRef LLVMIsAConstantAggregateZero(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantAggregateZero(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantAggregateZero;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantArray ] ---

    /** {@code LLVMValueRef LLVMIsAConstantArray(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantArray(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantArray;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantDataSequential ] ---

    /** {@code LLVMValueRef LLVMIsAConstantDataSequential(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataSequential(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataSequential;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantDataArray ] ---

    /** {@code LLVMValueRef LLVMIsAConstantDataArray(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataArray(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataArray;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantDataVector ] ---

    /** {@code LLVMValueRef LLVMIsAConstantDataVector(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataVector(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataVector;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantExpr ] ---

    /** {@code LLVMValueRef LLVMIsAConstantExpr(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantExpr(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantExpr;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantFP ] ---

    /** {@code LLVMValueRef LLVMIsAConstantFP(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantFP(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantFP;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantInt ] ---

    /** {@code LLVMValueRef LLVMIsAConstantInt(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantInt(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantInt;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantPointerNull ] ---

    /** {@code LLVMValueRef LLVMIsAConstantPointerNull(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantPointerNull(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantPointerNull;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantStruct ] ---

    /** {@code LLVMValueRef LLVMIsAConstantStruct(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantStruct(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantStruct;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantTokenNone ] ---

    /** {@code LLVMValueRef LLVMIsAConstantTokenNone(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantTokenNone(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantTokenNone;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantVector ] ---

    /** {@code LLVMValueRef LLVMIsAConstantVector(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantVector(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantVector;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalValue ] ---

    /** {@code LLVMValueRef LLVMIsAGlobalValue(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalValue;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalAlias ] ---

    /** {@code LLVMValueRef LLVMIsAGlobalAlias(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalAlias(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalAlias;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalObject ] ---

    /** {@code LLVMValueRef LLVMIsAGlobalObject(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalObject(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalObject;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFunction ] ---

    /** {@code LLVMValueRef LLVMIsAFunction(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFunction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFunction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalVariable ] ---

    /** {@code LLVMValueRef LLVMIsAGlobalVariable(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalVariable(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalVariable;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalIFunc ] ---

    /** {@code LLVMValueRef LLVMIsAGlobalIFunc(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalIFunc(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUndefValue ] ---

    /** {@code LLVMValueRef LLVMIsAUndefValue(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAUndefValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUndefValue;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAPoisonValue ] ---

    /** {@code LLVMValueRef LLVMIsAPoisonValue(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAPoisonValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAPoisonValue;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInstruction ] ---

    /** {@code LLVMValueRef LLVMIsAInstruction(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAInstruction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInstruction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUnaryOperator ] ---

    /** {@code LLVMValueRef LLVMIsAUnaryOperator(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAUnaryOperator(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUnaryOperator;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABinaryOperator ] ---

    /** {@code LLVMValueRef LLVMIsABinaryOperator(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsABinaryOperator(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABinaryOperator;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACallInst ] ---

    /** {@code LLVMValueRef LLVMIsACallInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACallInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACallInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAIntrinsicInst ] ---

    /** {@code LLVMValueRef LLVMIsAIntrinsicInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAIntrinsicInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIntrinsicInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsADbgInfoIntrinsic ] ---

    /** {@code LLVMValueRef LLVMIsADbgInfoIntrinsic(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgInfoIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgInfoIntrinsic;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsADbgVariableIntrinsic ] ---

    /** {@code LLVMValueRef LLVMIsADbgVariableIntrinsic(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgVariableIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgVariableIntrinsic;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsADbgDeclareInst ] ---

    /** {@code LLVMValueRef LLVMIsADbgDeclareInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgDeclareInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgDeclareInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsADbgLabelInst ] ---

    /** {@code LLVMValueRef LLVMIsADbgLabelInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgLabelInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgLabelInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMemIntrinsic ] ---

    /** {@code LLVMValueRef LLVMIsAMemIntrinsic(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemIntrinsic;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMemCpyInst ] ---

    /** {@code LLVMValueRef LLVMIsAMemCpyInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemCpyInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemCpyInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMemMoveInst ] ---

    /** {@code LLVMValueRef LLVMIsAMemMoveInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemMoveInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemMoveInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMemSetInst ] ---

    /** {@code LLVMValueRef LLVMIsAMemSetInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemSetInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemSetInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACmpInst ] ---

    /** {@code LLVMValueRef LLVMIsACmpInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFCmpInst ] ---

    /** {@code LLVMValueRef LLVMIsAFCmpInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFCmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFCmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAICmpInst ] ---

    /** {@code LLVMValueRef LLVMIsAICmpInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAICmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAICmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAExtractElementInst ] ---

    /** {@code LLVMValueRef LLVMIsAExtractElementInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAExtractElementInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAExtractElementInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGetElementPtrInst ] ---

    /** {@code LLVMValueRef LLVMIsAGetElementPtrInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAGetElementPtrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGetElementPtrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInsertElementInst ] ---

    /** {@code LLVMValueRef LLVMIsAInsertElementInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAInsertElementInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInsertElementInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInsertValueInst ] ---

    /** {@code LLVMValueRef LLVMIsAInsertValueInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAInsertValueInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInsertValueInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsALandingPadInst ] ---

    /** {@code LLVMValueRef LLVMIsALandingPadInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsALandingPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsALandingPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAPHINode ] ---

    /** {@code LLVMValueRef LLVMIsAPHINode(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAPHINode(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAPHINode;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASelectInst ] ---

    /** {@code LLVMValueRef LLVMIsASelectInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsASelectInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASelectInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAShuffleVectorInst ] ---

    /** {@code LLVMValueRef LLVMIsAShuffleVectorInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAShuffleVectorInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAShuffleVectorInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAStoreInst ] ---

    /** {@code LLVMValueRef LLVMIsAStoreInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAStoreInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAStoreInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABranchInst ] ---

    /** {@code LLVMValueRef LLVMIsABranchInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsABranchInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABranchInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAIndirectBrInst ] ---

    /** {@code LLVMValueRef LLVMIsAIndirectBrInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAIndirectBrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIndirectBrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInvokeInst ] ---

    /** {@code LLVMValueRef LLVMIsAInvokeInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAInvokeInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInvokeInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAReturnInst ] ---

    /** {@code LLVMValueRef LLVMIsAReturnInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASwitchInst ] ---

    /** {@code LLVMValueRef LLVMIsASwitchInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsASwitchInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASwitchInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUnreachableInst ] ---

    /** {@code LLVMValueRef LLVMIsAUnreachableInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAUnreachableInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUnreachableInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAResumeInst ] ---

    /** {@code LLVMValueRef LLVMIsAResumeInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAResumeInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAResumeInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACleanupReturnInst ] ---

    /** {@code LLVMValueRef LLVMIsACleanupReturnInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACleanupReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACleanupReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACatchReturnInst ] ---

    /** {@code LLVMValueRef LLVMIsACatchReturnInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACatchReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACatchReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACatchSwitchInst ] ---

    /** {@code LLVMValueRef LLVMIsACatchSwitchInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACatchSwitchInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACatchSwitchInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACallBrInst ] ---

    /** {@code LLVMValueRef LLVMIsACallBrInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACallBrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACallBrInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFuncletPadInst ] ---

    /** {@code LLVMValueRef LLVMIsAFuncletPadInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFuncletPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFuncletPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACatchPadInst ] ---

    /** {@code LLVMValueRef LLVMIsACatchPadInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACatchPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACatchPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACleanupPadInst ] ---

    /** {@code LLVMValueRef LLVMIsACleanupPadInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACleanupPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACleanupPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUnaryInstruction ] ---

    /** {@code LLVMValueRef LLVMIsAUnaryInstruction(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAUnaryInstruction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUnaryInstruction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAAllocaInst ] ---

    /** {@code LLVMValueRef LLVMIsAAllocaInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAAllocaInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAllocaInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACastInst ] ---

    /** {@code LLVMValueRef LLVMIsACastInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsACastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAAddrSpaceCastInst ] ---

    /** {@code LLVMValueRef LLVMIsAAddrSpaceCastInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAAddrSpaceCastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAddrSpaceCastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABitCastInst ] ---

    /** {@code LLVMValueRef LLVMIsABitCastInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsABitCastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABitCastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPExtInst ] ---

    /** {@code LLVMValueRef LLVMIsAFPExtInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPToSIInst ] ---

    /** {@code LLVMValueRef LLVMIsAFPToSIInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPToSIInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPToSIInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPToUIInst ] ---

    /** {@code LLVMValueRef LLVMIsAFPToUIInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPToUIInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPToUIInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPTruncInst ] ---

    /** {@code LLVMValueRef LLVMIsAFPTruncInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPTruncInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPTruncInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAIntToPtrInst ] ---

    /** {@code LLVMValueRef LLVMIsAIntToPtrInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAIntToPtrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIntToPtrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAPtrToIntInst ] ---

    /** {@code LLVMValueRef LLVMIsAPtrToIntInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAPtrToIntInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAPtrToIntInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASExtInst ] ---

    /** {@code LLVMValueRef LLVMIsASExtInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsASExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASIToFPInst ] ---

    /** {@code LLVMValueRef LLVMIsASIToFPInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsASIToFPInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASIToFPInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsATruncInst ] ---

    /** {@code LLVMValueRef LLVMIsATruncInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsATruncInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsATruncInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUIToFPInst ] ---

    /** {@code LLVMValueRef LLVMIsAUIToFPInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAUIToFPInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUIToFPInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAZExtInst ] ---

    /** {@code LLVMValueRef LLVMIsAZExtInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAZExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAZExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAExtractValueInst ] ---

    /** {@code LLVMValueRef LLVMIsAExtractValueInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAExtractValueInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAExtractValueInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsALoadInst ] ---

    /** {@code LLVMValueRef LLVMIsALoadInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsALoadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsALoadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAVAArgInst ] ---

    /** {@code LLVMValueRef LLVMIsAVAArgInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAVAArgInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAVAArgInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFreezeInst ] ---

    /** {@code LLVMValueRef LLVMIsAFreezeInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFreezeInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFreezeInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAAtomicCmpXchgInst ] ---

    /** {@code LLVMValueRef LLVMIsAAtomicCmpXchgInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAAtomicCmpXchgInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAtomicCmpXchgInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAAtomicRMWInst ] ---

    /** {@code LLVMValueRef LLVMIsAAtomicRMWInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAAtomicRMWInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAtomicRMWInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFenceInst ] ---

    /** {@code LLVMValueRef LLVMIsAFenceInst(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAFenceInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFenceInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMDNode ] ---

    /** {@code LLVMValueRef LLVMIsAMDNode(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAMDNode(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMDNode;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAValueAsMetadata ] ---

    /** {@code LLVMValueRef LLVMIsAValueAsMetadata(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAValueAsMetadata(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAValueAsMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMDString ] ---

    /** {@code LLVMValueRef LLVMIsAMDString(LLVMValueRef Val)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsAMDString(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMDString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetValueName ] ---

    /** {@code char const * LLVMGetValueName(LLVMValueRef Val)} */
    public static long nLLVMGetValueName(long Val) {
        long __functionAddress = Functions.GetValueName;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    /** {@code char const * LLVMGetValueName(LLVMValueRef Val)} */
    @NativeType("char const *")
    public static String LLVMGetValueName(@NativeType("LLVMValueRef") long Val) {
        long __result = nLLVMGetValueName(Val);
        return memUTF8(__result);
    }

    // --- [ LLVMSetValueName ] ---

    /** {@code void LLVMSetValueName(LLVMValueRef Val, char const * Name)} */
    public static void nLLVMSetValueName(long Val, long Name) {
        long __functionAddress = Functions.SetValueName;
        if (CHECKS) {
            check(Val);
        }
        invokePPV(Val, Name, __functionAddress);
    }

    /** {@code void LLVMSetValueName(LLVMValueRef Val, char const * Name)} */
    public static void LLVMSetValueName(@NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMSetValueName(Val, memAddress(Name));
    }

    /** {@code void LLVMSetValueName(LLVMValueRef Val, char const * Name)} */
    public static void LLVMSetValueName(@NativeType("LLVMValueRef") long Val, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            nLLVMSetValueName(Val, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetFirstUse ] ---

    /** {@code LLVMUseRef LLVMGetFirstUse(LLVMValueRef Val)} */
    @NativeType("LLVMUseRef")
    public static long LLVMGetFirstUse(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetFirstUse;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetNextUse ] ---

    /** {@code LLVMUseRef LLVMGetNextUse(LLVMUseRef U)} */
    @NativeType("LLVMUseRef")
    public static long LLVMGetNextUse(@NativeType("LLVMUseRef") long U) {
        long __functionAddress = Functions.GetNextUse;
        if (CHECKS) {
            check(U);
        }
        return invokePP(U, __functionAddress);
    }

    // --- [ LLVMGetUser ] ---

    /** {@code LLVMValueRef LLVMGetUser(LLVMUseRef U)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUser(@NativeType("LLVMUseRef") long U) {
        long __functionAddress = Functions.GetUser;
        if (CHECKS) {
            check(U);
        }
        return invokePP(U, __functionAddress);
    }

    // --- [ LLVMGetUsedValue ] ---

    /** {@code LLVMValueRef LLVMGetUsedValue(LLVMUseRef U)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUsedValue(@NativeType("LLVMUseRef") long U) {
        long __functionAddress = Functions.GetUsedValue;
        if (CHECKS) {
            check(U);
        }
        return invokePP(U, __functionAddress);
    }

    // --- [ LLVMGetOperand ] ---

    /** {@code LLVMValueRef LLVMGetOperand(LLVMValueRef Val, unsigned int Index)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetOperand(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetOperand;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, Index, __functionAddress);
    }

    // --- [ LLVMGetOperandUse ] ---

    /** {@code LLVMUseRef LLVMGetOperandUse(LLVMValueRef Val, unsigned int Index)} */
    @NativeType("LLVMUseRef")
    public static long LLVMGetOperandUse(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetOperandUse;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, Index, __functionAddress);
    }

    // --- [ LLVMSetOperand ] ---

    /** {@code void LLVMSetOperand(LLVMValueRef User, unsigned int Index, LLVMValueRef Val)} */
    public static void LLVMSetOperand(@NativeType("LLVMValueRef") long User, @NativeType("unsigned int") int Index, @NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.SetOperand;
        if (CHECKS) {
            check(User);
            check(Val);
        }
        invokePPV(User, Index, Val, __functionAddress);
    }

    // --- [ LLVMGetNumOperands ] ---

    /** {@code int LLVMGetNumOperands(LLVMValueRef Val)} */
    public static int LLVMGetNumOperands(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetNumOperands;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress);
    }

    // --- [ LLVMConstNull ] ---

    /** {@code LLVMValueRef LLVMConstNull(LLVMTypeRef Ty)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNull(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstNull;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMConstAllOnes ] ---

    /** {@code LLVMValueRef LLVMConstAllOnes(LLVMTypeRef Ty)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstAllOnes(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstAllOnes;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMGetUndef ] ---

    /** {@code LLVMValueRef LLVMGetUndef(LLVMTypeRef Ty)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUndef(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetUndef;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMGetPoison ] ---

    /** {@code LLVMValueRef LLVMGetPoison(LLVMTypeRef Ty)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPoison(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetPoison;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMIsNull ] ---

    /** {@code LLVMBool LLVMIsNull(LLVMValueRef Val)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsNull(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsNull;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMConstPointerNull ] ---

    /** {@code LLVMValueRef LLVMConstPointerNull(LLVMTypeRef Ty)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstPointerNull(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstPointerNull;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMConstInt ] ---

    /** {@code LLVMValueRef LLVMConstInt(LLVMTypeRef IntTy, unsigned long long N, LLVMBool SignExtend)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInt(@NativeType("LLVMTypeRef") long IntTy, @NativeType("unsigned long long") long N, @NativeType("LLVMBool") boolean SignExtend) {
        long __functionAddress = Functions.ConstInt;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePJP(IntTy, N, SignExtend ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMConstIntOfArbitraryPrecision ] ---

    /** {@code LLVMValueRef LLVMConstIntOfArbitraryPrecision(LLVMTypeRef IntTy, unsigned int NumWords, uint64_t const * Words)} */
    public static long nLLVMConstIntOfArbitraryPrecision(long IntTy, int NumWords, long Words) {
        long __functionAddress = Functions.ConstIntOfArbitraryPrecision;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePPP(IntTy, NumWords, Words, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstIntOfArbitraryPrecision(LLVMTypeRef IntTy, unsigned int NumWords, uint64_t const * Words)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfArbitraryPrecision(@NativeType("LLVMTypeRef") long IntTy, @NativeType("uint64_t const *") LongBuffer Words) {
        return nLLVMConstIntOfArbitraryPrecision(IntTy, Words.remaining(), memAddress(Words));
    }

    // --- [ LLVMConstIntOfString ] ---

    /** {@code LLVMValueRef LLVMConstIntOfString(LLVMTypeRef IntTy, char const * Text, uint8_t Radix)} */
    public static long nLLVMConstIntOfString(long IntTy, long Text, byte Radix) {
        long __functionAddress = Functions.ConstIntOfString;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePPUP(IntTy, Text, Radix, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstIntOfString(LLVMTypeRef IntTy, char const * Text, uint8_t Radix)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfString(@NativeType("LLVMTypeRef") long IntTy, @NativeType("char const *") ByteBuffer Text, @NativeType("uint8_t") byte Radix) {
        if (CHECKS) {
            checkNT1(Text);
        }
        return nLLVMConstIntOfString(IntTy, memAddress(Text), Radix);
    }

    /** {@code LLVMValueRef LLVMConstIntOfString(LLVMTypeRef IntTy, char const * Text, uint8_t Radix)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfString(@NativeType("LLVMTypeRef") long IntTy, @NativeType("char const *") CharSequence Text, @NativeType("uint8_t") byte Radix) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Text, true);
            long TextEncoded = stack.getPointerAddress();
            return nLLVMConstIntOfString(IntTy, TextEncoded, Radix);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMConstIntOfStringAndSize ] ---

    /** {@code LLVMValueRef LLVMConstIntOfStringAndSize(LLVMTypeRef IntTy, char const * Text, unsigned int SLen, uint8_t Radix)} */
    public static long nLLVMConstIntOfStringAndSize(long IntTy, long Text, int SLen, byte Radix) {
        long __functionAddress = Functions.ConstIntOfStringAndSize;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePPUP(IntTy, Text, SLen, Radix, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstIntOfStringAndSize(LLVMTypeRef IntTy, char const * Text, unsigned int SLen, uint8_t Radix)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfStringAndSize(@NativeType("LLVMTypeRef") long IntTy, @NativeType("char const *") ByteBuffer Text, @NativeType("uint8_t") byte Radix) {
        return nLLVMConstIntOfStringAndSize(IntTy, memAddress(Text), Text.remaining(), Radix);
    }

    /** {@code LLVMValueRef LLVMConstIntOfStringAndSize(LLVMTypeRef IntTy, char const * Text, unsigned int SLen, uint8_t Radix)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfStringAndSize(@NativeType("LLVMTypeRef") long IntTy, @NativeType("char const *") CharSequence Text, @NativeType("uint8_t") byte Radix) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int TextEncodedLength = stack.nUTF8(Text, false);
            long TextEncoded = stack.getPointerAddress();
            return nLLVMConstIntOfStringAndSize(IntTy, TextEncoded, TextEncodedLength, Radix);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMConstReal ] ---

    /** {@code LLVMValueRef LLVMConstReal(LLVMTypeRef RealTy, double N)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstReal(@NativeType("LLVMTypeRef") long RealTy, double N) {
        long __functionAddress = Functions.ConstReal;
        if (CHECKS) {
            check(RealTy);
        }
        return invokePP(RealTy, N, __functionAddress);
    }

    // --- [ LLVMConstRealOfString ] ---

    /** {@code LLVMValueRef LLVMConstRealOfString(LLVMTypeRef RealTy, char const * Text)} */
    public static long nLLVMConstRealOfString(long RealTy, long Text) {
        long __functionAddress = Functions.ConstRealOfString;
        if (CHECKS) {
            check(RealTy);
        }
        return invokePPP(RealTy, Text, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstRealOfString(LLVMTypeRef RealTy, char const * Text)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstRealOfString(@NativeType("LLVMTypeRef") long RealTy, @NativeType("char const *") ByteBuffer Text) {
        if (CHECKS) {
            checkNT1(Text);
        }
        return nLLVMConstRealOfString(RealTy, memAddress(Text));
    }

    /** {@code LLVMValueRef LLVMConstRealOfString(LLVMTypeRef RealTy, char const * Text)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstRealOfString(@NativeType("LLVMTypeRef") long RealTy, @NativeType("char const *") CharSequence Text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Text, true);
            long TextEncoded = stack.getPointerAddress();
            return nLLVMConstRealOfString(RealTy, TextEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMConstRealOfStringAndSize ] ---

    /** {@code LLVMValueRef LLVMConstRealOfStringAndSize(LLVMTypeRef RealTy, char const * Text, unsigned int SLen)} */
    public static long nLLVMConstRealOfStringAndSize(long RealTy, long Text, int SLen) {
        long __functionAddress = Functions.ConstRealOfStringAndSize;
        if (CHECKS) {
            check(RealTy);
        }
        return invokePPP(RealTy, Text, SLen, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstRealOfStringAndSize(LLVMTypeRef RealTy, char const * Text, unsigned int SLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstRealOfStringAndSize(@NativeType("LLVMTypeRef") long RealTy, @NativeType("char const *") ByteBuffer Text) {
        return nLLVMConstRealOfStringAndSize(RealTy, memAddress(Text), Text.remaining());
    }

    /** {@code LLVMValueRef LLVMConstRealOfStringAndSize(LLVMTypeRef RealTy, char const * Text, unsigned int SLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstRealOfStringAndSize(@NativeType("LLVMTypeRef") long RealTy, @NativeType("char const *") CharSequence Text) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int TextEncodedLength = stack.nUTF8(Text, false);
            long TextEncoded = stack.getPointerAddress();
            return nLLVMConstRealOfStringAndSize(RealTy, TextEncoded, TextEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMConstIntGetZExtValue ] ---

    /** {@code unsigned long long LLVMConstIntGetZExtValue(LLVMValueRef ConstantVal)} */
    @NativeType("unsigned long long")
    public static long LLVMConstIntGetZExtValue(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstIntGetZExtValue;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePJ(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstIntGetSExtValue ] ---

    /** {@code long long LLVMConstIntGetSExtValue(LLVMValueRef ConstantVal)} */
    @NativeType("long long")
    public static long LLVMConstIntGetSExtValue(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstIntGetSExtValue;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePJ(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstRealGetDouble ] ---

    /** {@code double LLVMConstRealGetDouble(LLVMValueRef ConstantVal, LLVMBool * losesInfo)} */
    public static double nLLVMConstRealGetDouble(long ConstantVal, long losesInfo) {
        long __functionAddress = Functions.ConstRealGetDouble;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePPD(ConstantVal, losesInfo, __functionAddress);
    }

    /** {@code double LLVMConstRealGetDouble(LLVMValueRef ConstantVal, LLVMBool * losesInfo)} */
    public static double LLVMConstRealGetDouble(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMBool *") IntBuffer losesInfo) {
        if (CHECKS) {
            check(losesInfo, 1);
        }
        return nLLVMConstRealGetDouble(ConstantVal, memAddress(losesInfo));
    }

    // --- [ LLVMConstStringInContext ] ---

    /** {@code LLVMValueRef LLVMConstStringInContext(LLVMContextRef C, char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    public static long nLLVMConstStringInContext(long C, long Str, int Length, int DontNullTerminate) {
        long __functionAddress = Functions.ConstStringInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, Str, Length, DontNullTerminate, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstStringInContext(LLVMContextRef C, char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStringInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        return nLLVMConstStringInContext(C, memAddress(Str), Str.remaining(), DontNullTerminate ? 1 : 0);
    }

    /** {@code LLVMValueRef LLVMConstStringInContext(LLVMContextRef C, char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStringInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StrEncodedLength = stack.nUTF8(Str, false);
            long StrEncoded = stack.getPointerAddress();
            return nLLVMConstStringInContext(C, StrEncoded, StrEncodedLength, DontNullTerminate ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMConstStringInContext2 ] ---

    /** {@code LLVMValueRef LLVMConstStringInContext2(LLVMContextRef C, char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    public static long nLLVMConstStringInContext2(long C, long Str, int Length, int DontNullTerminate) {
        long __functionAddress = Functions.ConstStringInContext2;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPP(C, Str, Length, DontNullTerminate, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstStringInContext2(LLVMContextRef C, char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStringInContext2(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        return nLLVMConstStringInContext2(C, memAddress(Str), Str.remaining(), DontNullTerminate ? 1 : 0);
    }

    /** {@code LLVMValueRef LLVMConstStringInContext2(LLVMContextRef C, char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStringInContext2(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StrEncodedLength = stack.nUTF8(Str, false);
            long StrEncoded = stack.getPointerAddress();
            return nLLVMConstStringInContext2(C, StrEncoded, StrEncodedLength, DontNullTerminate ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMConstString ] ---

    /** {@code LLVMValueRef LLVMConstString(char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    public static long nLLVMConstString(long Str, int Length, int DontNullTerminate) {
        long __functionAddress = Functions.ConstString;
        return invokePP(Str, Length, DontNullTerminate, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstString(char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstString(@NativeType("char const *") ByteBuffer Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        return nLLVMConstString(memAddress(Str), Str.remaining(), DontNullTerminate ? 1 : 0);
    }

    /** {@code LLVMValueRef LLVMConstString(char const * Str, unsigned int Length, LLVMBool DontNullTerminate)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstString(@NativeType("char const *") CharSequence Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StrEncodedLength = stack.nUTF8(Str, false);
            long StrEncoded = stack.getPointerAddress();
            return nLLVMConstString(StrEncoded, StrEncodedLength, DontNullTerminate ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMIsConstantString ] ---

    /** {@code LLVMBool LLVMIsConstantString(LLVMValueRef c)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsConstantString(@NativeType("LLVMValueRef") long c) {
        long __functionAddress = Functions.IsConstantString;
        if (CHECKS) {
            check(c);
        }
        return invokePI(c, __functionAddress) != 0;
    }

    // --- [ LLVMGetAsString ] ---

    /** {@code char const * LLVMGetAsString(LLVMValueRef c, size_t * Length)} */
    public static long nLLVMGetAsString(long c, long Length) {
        long __functionAddress = Functions.GetAsString;
        if (CHECKS) {
            check(c);
        }
        return invokePPP(c, Length, __functionAddress);
    }

    /** {@code char const * LLVMGetAsString(LLVMValueRef c, size_t * Length)} */
    @NativeType("char const *")
    public static String LLVMGetAsString(@NativeType("LLVMValueRef") long c) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Length = stack.callocPointer(1);
            long __result = nLLVMGetAsString(c, memAddress(Length));
            return memUTF8(__result, (int)Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMConstStructInContext ] ---

    /** {@code LLVMValueRef LLVMConstStructInContext(LLVMContextRef C, LLVMValueRef * ConstantVals, unsigned int Count, LLVMBool Packed)} */
    public static long nLLVMConstStructInContext(long C, long ConstantVals, int Count, int Packed) {
        long __functionAddress = Functions.ConstStructInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, ConstantVals, Count, Packed, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstStructInContext(LLVMContextRef C, LLVMValueRef * ConstantVals, unsigned int Count, LLVMBool Packed)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStructInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMValueRef *") PointerBuffer ConstantVals, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMConstStructInContext(C, memAddress(ConstantVals), ConstantVals.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMConstStruct ] ---

    /** {@code LLVMValueRef LLVMConstStruct(LLVMValueRef * ConstantVals, unsigned int Count, LLVMBool Packed)} */
    public static long nLLVMConstStruct(long ConstantVals, int Count, int Packed) {
        long __functionAddress = Functions.ConstStruct;
        return invokePP(ConstantVals, Count, Packed, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstStruct(LLVMValueRef * ConstantVals, unsigned int Count, LLVMBool Packed)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStruct(@NativeType("LLVMValueRef *") PointerBuffer ConstantVals, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMConstStruct(memAddress(ConstantVals), ConstantVals.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMConstArray ] ---

    /** {@code LLVMValueRef LLVMConstArray(LLVMTypeRef ElementTy, LLVMValueRef * ConstantVals, unsigned int Length)} */
    public static long nLLVMConstArray(long ElementTy, long ConstantVals, int Length) {
        long __functionAddress = Functions.ConstArray;
        if (CHECKS) {
            check(ElementTy);
        }
        return invokePPP(ElementTy, ConstantVals, Length, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstArray(LLVMTypeRef ElementTy, LLVMValueRef * ConstantVals, unsigned int Length)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstArray(@NativeType("LLVMTypeRef") long ElementTy, @NativeType("LLVMValueRef *") PointerBuffer ConstantVals) {
        return nLLVMConstArray(ElementTy, memAddress(ConstantVals), ConstantVals.remaining());
    }

    // --- [ LLVMConstArray2 ] ---

    /** {@code LLVMValueRef LLVMConstArray2(LLVMTypeRef ElementTy, LLVMValueRef * ConstantVals, uint64_t Length)} */
    public static long nLLVMConstArray2(long ElementTy, long ConstantVals, long Length) {
        long __functionAddress = Functions.ConstArray2;
        if (CHECKS) {
            check(ElementTy);
        }
        return invokePPJP(ElementTy, ConstantVals, Length, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstArray2(LLVMTypeRef ElementTy, LLVMValueRef * ConstantVals, uint64_t Length)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstArray2(@NativeType("LLVMTypeRef") long ElementTy, @NativeType("LLVMValueRef *") PointerBuffer ConstantVals) {
        return nLLVMConstArray2(ElementTy, memAddress(ConstantVals), ConstantVals.remaining());
    }

    // --- [ LLVMConstNamedStruct ] ---

    /** {@code LLVMValueRef LLVMConstNamedStruct(LLVMTypeRef StructTy, LLVMValueRef * ConstantVals, unsigned int Count)} */
    public static long nLLVMConstNamedStruct(long StructTy, long ConstantVals, int Count) {
        long __functionAddress = Functions.ConstNamedStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePPP(StructTy, ConstantVals, Count, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstNamedStruct(LLVMTypeRef StructTy, LLVMValueRef * ConstantVals, unsigned int Count)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNamedStruct(@NativeType("LLVMTypeRef") long StructTy, @NativeType("LLVMValueRef *") PointerBuffer ConstantVals) {
        return nLLVMConstNamedStruct(StructTy, memAddress(ConstantVals), ConstantVals.remaining());
    }

    // --- [ LLVMGetAggregateElement ] ---

    /** {@code LLVMValueRef LLVMGetAggregateElement(LLVMValueRef C, unsigned Idx)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetAggregateElement(@NativeType("LLVMValueRef") long C, @NativeType("unsigned") int Idx) {
        long __functionAddress = Functions.GetAggregateElement;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, Idx, __functionAddress);
    }

    // --- [ LLVMGetElementAsConstant ] ---

    /** {@code LLVMValueRef LLVMGetElementAsConstant(LLVMValueRef C, unsigned int idx)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetElementAsConstant(@NativeType("LLVMValueRef") long C, @NativeType("unsigned int") int idx) {
        long __functionAddress = Functions.GetElementAsConstant;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, idx, __functionAddress);
    }

    // --- [ LLVMConstVector ] ---

    /** {@code LLVMValueRef LLVMConstVector(LLVMValueRef * ScalarConstantVals, unsigned int Size)} */
    public static long nLLVMConstVector(long ScalarConstantVals, int Size) {
        long __functionAddress = Functions.ConstVector;
        return invokePP(ScalarConstantVals, Size, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstVector(LLVMValueRef * ScalarConstantVals, unsigned int Size)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstVector(@NativeType("LLVMValueRef *") PointerBuffer ScalarConstantVals) {
        return nLLVMConstVector(memAddress(ScalarConstantVals), ScalarConstantVals.remaining());
    }

    // --- [ LLVMConstantPtrAuth ] ---

    /** {@code LLVMValueRef LLVMConstantPtrAuth(LLVMValueRef Ptr, LLVMValueRef Key, LLVMValueRef Disc, LLVMValueRef AddrDisc)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstantPtrAuth(@NativeType("LLVMValueRef") long Ptr, @NativeType("LLVMValueRef") long Key, @NativeType("LLVMValueRef") long Disc, @NativeType("LLVMValueRef") long AddrDisc) {
        long __functionAddress = Functions.ConstantPtrAuth;
        if (CHECKS) {
            check(__functionAddress);
            check(Ptr);
            check(Key);
            check(Disc);
            check(AddrDisc);
        }
        return invokePPPPP(Ptr, Key, Disc, AddrDisc, __functionAddress);
    }

    // --- [ LLVMGetConstOpcode ] ---

    /** {@code LLVMOpcode LLVMGetConstOpcode(LLVMValueRef ConstantVal)} */
    @NativeType("LLVMOpcode")
    public static int LLVMGetConstOpcode(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.GetConstOpcode;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePI(ConstantVal, __functionAddress);
    }

    // --- [ LLVMAlignOf ] ---

    /** {@code LLVMValueRef LLVMAlignOf(LLVMTypeRef Ty)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAlignOf(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.AlignOf;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMSizeOf ] ---

    /** {@code LLVMValueRef LLVMSizeOf(LLVMTypeRef Ty)} */
    @NativeType("LLVMValueRef")
    public static long LLVMSizeOf(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.SizeOf;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMConstNeg ] ---

    /** {@code LLVMValueRef LLVMConstNeg(LLVMValueRef ConstantVal)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstNSWNeg ] ---

    /** {@code LLVMValueRef LLVMConstNSWNeg(LLVMValueRef ConstantVal)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNSWNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstNUWNeg ] ---

    /** {@code LLVMValueRef LLVMConstNUWNeg(LLVMValueRef ConstantVal)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNUWNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstFNeg ] ---

    /** {@code LLVMValueRef LLVMConstFNeg(LLVMValueRef ConstantVal)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstFNeg;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstNot ] ---

    /** {@code LLVMValueRef LLVMConstNot(LLVMValueRef ConstantVal)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNot(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNot;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstAdd ] ---

    /** {@code LLVMValueRef LLVMConstAdd(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstNSWAdd ] ---

    /** {@code LLVMValueRef LLVMConstNSWAdd(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNSWAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstNUWAdd ] ---

    /** {@code LLVMValueRef LLVMConstNUWAdd(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNUWAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFAdd ] ---

    /** {@code LLVMValueRef LLVMConstFAdd(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFAdd;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstSub ] ---

    /** {@code LLVMValueRef LLVMConstSub(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstNSWSub ] ---

    /** {@code LLVMValueRef LLVMConstNSWSub(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNSWSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstNUWSub ] ---

    /** {@code LLVMValueRef LLVMConstNUWSub(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNUWSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFSub ] ---

    /** {@code LLVMValueRef LLVMConstFSub(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFSub;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstMul ] ---

    /** {@code LLVMValueRef LLVMConstMul(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstNSWMul ] ---

    /** {@code LLVMValueRef LLVMConstNSWMul(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNSWMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstNUWMul ] ---

    /** {@code LLVMValueRef LLVMConstNUWMul(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNUWMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFMul ] ---

    /** {@code LLVMValueRef LLVMConstFMul(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFMul;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstUDiv ] ---

    /** {@code LLVMValueRef LLVMConstUDiv(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstUDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstUDiv;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstExactUDiv ] ---

    /** {@code LLVMValueRef LLVMConstExactUDiv(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstExactUDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstExactUDiv;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstSDiv ] ---

    /** {@code LLVMValueRef LLVMConstSDiv(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstSDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSDiv;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstExactSDiv ] ---

    /** {@code LLVMValueRef LLVMConstExactSDiv(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstExactSDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstExactSDiv;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFDiv ] ---

    /** {@code LLVMValueRef LLVMConstFDiv(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFDiv;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstURem ] ---

    /** {@code LLVMValueRef LLVMConstURem(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstURem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstURem;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstSRem ] ---

    /** {@code LLVMValueRef LLVMConstSRem(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstSRem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSRem;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFRem ] ---

    /** {@code LLVMValueRef LLVMConstFRem(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFRem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFRem;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstAnd ] ---

    /** {@code LLVMValueRef LLVMConstAnd(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstAnd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAnd;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstOr ] ---

    /** {@code LLVMValueRef LLVMConstOr(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstOr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstOr;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstXor ] ---

    /** {@code LLVMValueRef LLVMConstXor(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstXor(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstXor;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstICmp ] ---

    /** {@code LLVMValueRef LLVMConstICmp(LLVMIntPredicate Predicate, LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstICmp(@NativeType("LLVMIntPredicate") int Predicate, @NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstICmp;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(Predicate, LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFCmp ] ---

    /** {@code LLVMValueRef LLVMConstFCmp(LLVMRealPredicate Predicate, LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFCmp(@NativeType("LLVMRealPredicate") int Predicate, @NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFCmp;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(Predicate, LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstShl ] ---

    /** {@code LLVMValueRef LLVMConstShl(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstShl(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstShl;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstLShr ] ---

    /** {@code LLVMValueRef LLVMConstLShr(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstLShr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstLShr;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstAShr ] ---

    /** {@code LLVMValueRef LLVMConstAShr(LLVMValueRef LHSConstant, LLVMValueRef RHSConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstAShr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAShr;
        if (CHECKS) {
            check(__functionAddress);
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstGEP ] ---

    /** {@code LLVMValueRef LLVMConstGEP(LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    public static long nLLVMConstGEP(long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstGEP;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
        }
        return invokePPP(ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstGEP(LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstGEP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstGEP(ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstGEP2 ] ---

    /** {@code LLVMValueRef LLVMConstGEP2(LLVMTypeRef Ty, LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    public static long nLLVMConstGEP2(long Ty, long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstGEP2;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
            check(ConstantVal);
        }
        return invokePPPP(Ty, ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstGEP2(LLVMTypeRef Ty, LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstGEP2(@NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstGEP2(Ty, ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstInBoundsGEP ] ---

    /** {@code LLVMValueRef LLVMConstInBoundsGEP(LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    public static long nLLVMConstInBoundsGEP(long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstInBoundsGEP;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
        }
        return invokePPP(ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstInBoundsGEP(LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInBoundsGEP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstInBoundsGEP(ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstInBoundsGEP2 ] ---

    /** {@code LLVMValueRef LLVMConstInBoundsGEP2(LLVMTypeRef Ty, LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    public static long nLLVMConstInBoundsGEP2(long Ty, long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstInBoundsGEP2;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
            check(ConstantVal);
        }
        return invokePPPP(Ty, ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstInBoundsGEP2(LLVMTypeRef Ty, LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned int NumIndices)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInBoundsGEP2(@NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstInBoundsGEP2(Ty, ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstInBoundsGEPWithNoWrapFlags ] ---

    /** {@code LLVMValueRef LLVMConstInBoundsGEPWithNoWrapFlags(LLVMTypeRef Ty, LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned NumIndices, LLVMGEPNoWrapFlags NoWrapFlags)} */
    public static long nLLVMConstInBoundsGEPWithNoWrapFlags(long Ty, long ConstantVal, long ConstantIndices, int NumIndices, int NoWrapFlags) {
        long __functionAddress = Functions.ConstInBoundsGEPWithNoWrapFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
            check(ConstantVal);
        }
        return invokePPPP(Ty, ConstantVal, ConstantIndices, NumIndices, NoWrapFlags, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstInBoundsGEPWithNoWrapFlags(LLVMTypeRef Ty, LLVMValueRef ConstantVal, LLVMValueRef * ConstantIndices, unsigned NumIndices, LLVMGEPNoWrapFlags NoWrapFlags)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInBoundsGEPWithNoWrapFlags(@NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices, @NativeType("LLVMGEPNoWrapFlags") int NoWrapFlags) {
        return nLLVMConstInBoundsGEPWithNoWrapFlags(Ty, ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining(), NoWrapFlags);
    }

    // --- [ LLVMConstTrunc ] ---

    /** {@code LLVMValueRef LLVMConstTrunc(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstTrunc(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstTrunc;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstSExt ] ---

    /** {@code LLVMValueRef LLVMConstSExt(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstSExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSExt;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstZExt ] ---

    /** {@code LLVMValueRef LLVMConstZExt(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstZExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstZExt;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPTrunc ] ---

    /** {@code LLVMValueRef LLVMConstFPTrunc(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFPTrunc(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPTrunc;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPExt ] ---

    /** {@code LLVMValueRef LLVMConstFPExt(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFPExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPExt;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstUIToFP ] ---

    /** {@code LLVMValueRef LLVMConstUIToFP(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstUIToFP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstUIToFP;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstSIToFP ] ---

    /** {@code LLVMValueRef LLVMConstSIToFP(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstSIToFP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSIToFP;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPToUI ] ---

    /** {@code LLVMValueRef LLVMConstFPToUI(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFPToUI(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPToUI;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPToSI ] ---

    /** {@code LLVMValueRef LLVMConstFPToSI(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFPToSI(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPToSI;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstPtrToInt ] ---

    /** {@code LLVMValueRef LLVMConstPtrToInt(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstPtrToInt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstPtrToInt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstIntToPtr ] ---

    /** {@code LLVMValueRef LLVMConstIntToPtr(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntToPtr(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstIntToPtr;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstBitCast ] ---

    /** {@code LLVMValueRef LLVMConstBitCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstAddrSpaceCast ] ---

    /** {@code LLVMValueRef LLVMConstAddrSpaceCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstAddrSpaceCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstAddrSpaceCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstZExtOrBitCast ] ---

    /** {@code LLVMValueRef LLVMConstZExtOrBitCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstZExtOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstZExtOrBitCast;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstSExtOrBitCast ] ---

    /** {@code LLVMValueRef LLVMConstSExtOrBitCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstSExtOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSExtOrBitCast;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstTruncOrBitCast ] ---

    /** {@code LLVMValueRef LLVMConstTruncOrBitCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstTruncOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstTruncOrBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstPointerCast ] ---

    /** {@code LLVMValueRef LLVMConstPointerCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstPointerCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstPointerCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstIntCast ] ---

    /** {@code LLVMValueRef LLVMConstIntCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType, LLVMBool isSigned)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType, @NativeType("LLVMBool") boolean isSigned) {
        long __functionAddress = Functions.ConstIntCast;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, isSigned ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMConstFPCast ] ---

    /** {@code LLVMValueRef LLVMConstFPCast(LLVMValueRef ConstantVal, LLVMTypeRef ToType)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstFPCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPCast;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstSelect ] ---

    /** {@code LLVMValueRef LLVMConstSelect(LLVMValueRef ConstantCondition, LLVMValueRef ConstantIfTrue, LLVMValueRef ConstantIfFalse)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstSelect(@NativeType("LLVMValueRef") long ConstantCondition, @NativeType("LLVMValueRef") long ConstantIfTrue, @NativeType("LLVMValueRef") long ConstantIfFalse) {
        long __functionAddress = Functions.ConstSelect;
        if (CHECKS) {
            check(__functionAddress);
            check(ConstantCondition);
            check(ConstantIfTrue);
            check(ConstantIfFalse);
        }
        return invokePPPP(ConstantCondition, ConstantIfTrue, ConstantIfFalse, __functionAddress);
    }

    // --- [ LLVMConstExtractElement ] ---

    /** {@code LLVMValueRef LLVMConstExtractElement(LLVMValueRef VectorConstant, LLVMValueRef IndexConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstExtractElement(@NativeType("LLVMValueRef") long VectorConstant, @NativeType("LLVMValueRef") long IndexConstant) {
        long __functionAddress = Functions.ConstExtractElement;
        if (CHECKS) {
            check(VectorConstant);
            check(IndexConstant);
        }
        return invokePPP(VectorConstant, IndexConstant, __functionAddress);
    }

    // --- [ LLVMConstInsertElement ] ---

    /** {@code LLVMValueRef LLVMConstInsertElement(LLVMValueRef VectorConstant, LLVMValueRef ElementValueConstant, LLVMValueRef IndexConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInsertElement(@NativeType("LLVMValueRef") long VectorConstant, @NativeType("LLVMValueRef") long ElementValueConstant, @NativeType("LLVMValueRef") long IndexConstant) {
        long __functionAddress = Functions.ConstInsertElement;
        if (CHECKS) {
            check(VectorConstant);
            check(ElementValueConstant);
            check(IndexConstant);
        }
        return invokePPPP(VectorConstant, ElementValueConstant, IndexConstant, __functionAddress);
    }

    // --- [ LLVMConstShuffleVector ] ---

    /** {@code LLVMValueRef LLVMConstShuffleVector(LLVMValueRef VectorAConstant, LLVMValueRef VectorBConstant, LLVMValueRef MaskConstant)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstShuffleVector(@NativeType("LLVMValueRef") long VectorAConstant, @NativeType("LLVMValueRef") long VectorBConstant, @NativeType("LLVMValueRef") long MaskConstant) {
        long __functionAddress = Functions.ConstShuffleVector;
        if (CHECKS) {
            check(VectorAConstant);
            check(VectorBConstant);
            check(MaskConstant);
        }
        return invokePPPP(VectorAConstant, VectorBConstant, MaskConstant, __functionAddress);
    }

    // --- [ LLVMConstExtractValue ] ---

    /** {@code LLVMValueRef LLVMConstExtractValue(LLVMValueRef AggConstant, unsigned int * IdxList, unsigned int NumIdx)} */
    public static long nLLVMConstExtractValue(long AggConstant, long IdxList, int NumIdx) {
        long __functionAddress = Functions.ConstExtractValue;
        if (CHECKS) {
            check(__functionAddress);
            check(AggConstant);
        }
        return invokePPP(AggConstant, IdxList, NumIdx, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstExtractValue(LLVMValueRef AggConstant, unsigned int * IdxList, unsigned int NumIdx)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstExtractValue(@NativeType("LLVMValueRef") long AggConstant, @NativeType("unsigned int *") IntBuffer IdxList) {
        return nLLVMConstExtractValue(AggConstant, memAddress(IdxList), IdxList.remaining());
    }

    // --- [ LLVMConstInsertValue ] ---

    /** {@code LLVMValueRef LLVMConstInsertValue(LLVMValueRef AggConstant, LLVMValueRef ElementValueConstant, unsigned int * IdxList, unsigned int NumIdx)} */
    public static long nLLVMConstInsertValue(long AggConstant, long ElementValueConstant, long IdxList, int NumIdx) {
        long __functionAddress = Functions.ConstInsertValue;
        if (CHECKS) {
            check(__functionAddress);
            check(AggConstant);
            check(ElementValueConstant);
        }
        return invokePPPP(AggConstant, ElementValueConstant, IdxList, NumIdx, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstInsertValue(LLVMValueRef AggConstant, LLVMValueRef ElementValueConstant, unsigned int * IdxList, unsigned int NumIdx)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInsertValue(@NativeType("LLVMValueRef") long AggConstant, @NativeType("LLVMValueRef") long ElementValueConstant, @NativeType("unsigned int *") IntBuffer IdxList) {
        return nLLVMConstInsertValue(AggConstant, ElementValueConstant, memAddress(IdxList), IdxList.remaining());
    }

    // --- [ LLVMBlockAddress ] ---

    /** {@code LLVMValueRef LLVMBlockAddress(LLVMValueRef F, LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBlockAddress(@NativeType("LLVMValueRef") long F, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BlockAddress;
        if (CHECKS) {
            check(__functionAddress);
            check(F);
            check(BB);
        }
        return invokePPP(F, BB, __functionAddress);
    }

    // --- [ LLVMGetBlockAddressFunction ] ---

    /** {@code LLVMValueRef LLVMGetBlockAddressFunction(LLVMValueRef BlockAddr)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetBlockAddressFunction(@NativeType("LLVMValueRef") long BlockAddr) {
        long __functionAddress = Functions.GetBlockAddressFunction;
        if (CHECKS) {
            check(__functionAddress);
            check(BlockAddr);
        }
        return invokePP(BlockAddr, __functionAddress);
    }

    // --- [ LLVMGetBlockAddressBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetBlockAddressBasicBlock(LLVMValueRef BlockAddr)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetBlockAddressBasicBlock(@NativeType("LLVMValueRef") long BlockAddr) {
        long __functionAddress = Functions.GetBlockAddressBasicBlock;
        if (CHECKS) {
            check(__functionAddress);
            check(BlockAddr);
        }
        return invokePP(BlockAddr, __functionAddress);
    }

    // --- [ LLVMConstInlineAsm ] ---

    /** {@code LLVMValueRef LLVMConstInlineAsm(LLVMTypeRef Ty, char const * AsmString, char const * Constraints, LLVMBool HasSideEffects, LLVMBool IsAlignStack)} */
    public static long nLLVMConstInlineAsm(long Ty, long AsmString, long Constraints, int HasSideEffects, int IsAlignStack) {
        long __functionAddress = Functions.ConstInlineAsm;
        if (CHECKS) {
            check(Ty);
        }
        return invokePPPP(Ty, AsmString, Constraints, HasSideEffects, IsAlignStack, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMConstInlineAsm(LLVMTypeRef Ty, char const * AsmString, char const * Constraints, LLVMBool HasSideEffects, LLVMBool IsAlignStack)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInlineAsm(@NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer AsmString, @NativeType("char const *") ByteBuffer Constraints, @NativeType("LLVMBool") boolean HasSideEffects, @NativeType("LLVMBool") boolean IsAlignStack) {
        if (CHECKS) {
            checkNT1(AsmString);
            checkNT1(Constraints);
        }
        return nLLVMConstInlineAsm(Ty, memAddress(AsmString), memAddress(Constraints), HasSideEffects ? 1 : 0, IsAlignStack ? 1 : 0);
    }

    /** {@code LLVMValueRef LLVMConstInlineAsm(LLVMTypeRef Ty, char const * AsmString, char const * Constraints, LLVMBool HasSideEffects, LLVMBool IsAlignStack)} */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInlineAsm(@NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence AsmString, @NativeType("char const *") CharSequence Constraints, @NativeType("LLVMBool") boolean HasSideEffects, @NativeType("LLVMBool") boolean IsAlignStack) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(AsmString, true);
            long AsmStringEncoded = stack.getPointerAddress();
            stack.nUTF8(Constraints, true);
            long ConstraintsEncoded = stack.getPointerAddress();
            return nLLVMConstInlineAsm(Ty, AsmStringEncoded, ConstraintsEncoded, HasSideEffects ? 1 : 0, IsAlignStack ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetGlobalParent ] ---

    /** {@code LLVMModuleRef LLVMGetGlobalParent(LLVMValueRef Global)} */
    @NativeType("LLVMModuleRef")
    public static long LLVMGetGlobalParent(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetGlobalParent;
        if (CHECKS) {
            check(Global);
        }
        return invokePP(Global, __functionAddress);
    }

    // --- [ LLVMIsDeclaration ] ---

    /** {@code LLVMBool LLVMIsDeclaration(LLVMValueRef Global)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsDeclaration(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.IsDeclaration;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress) != 0;
    }

    // --- [ LLVMGetLinkage ] ---

    /** {@code LLVMLinkage LLVMGetLinkage(LLVMValueRef Global)} */
    @NativeType("LLVMLinkage")
    public static int LLVMGetLinkage(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetLinkage;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress);
    }

    // --- [ LLVMSetLinkage ] ---

    /** {@code void LLVMSetLinkage(LLVMValueRef Global, LLVMLinkage Linkage)} */
    public static void LLVMSetLinkage(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMLinkage") int Linkage) {
        long __functionAddress = Functions.SetLinkage;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, Linkage, __functionAddress);
    }

    // --- [ LLVMGetSection ] ---

    /** {@code char const * LLVMGetSection(LLVMValueRef Global)} */
    public static long nLLVMGetSection(long Global) {
        long __functionAddress = Functions.GetSection;
        if (CHECKS) {
            check(Global);
        }
        return invokePP(Global, __functionAddress);
    }

    /** {@code char const * LLVMGetSection(LLVMValueRef Global)} */
    @NativeType("char const *")
    public static String LLVMGetSection(@NativeType("LLVMValueRef") long Global) {
        long __result = nLLVMGetSection(Global);
        return memUTF8(__result);
    }

    // --- [ LLVMSetSection ] ---

    /** {@code void LLVMSetSection(LLVMValueRef Global, char const * Section)} */
    public static void nLLVMSetSection(long Global, long Section) {
        long __functionAddress = Functions.SetSection;
        if (CHECKS) {
            check(Global);
        }
        invokePPV(Global, Section, __functionAddress);
    }

    /** {@code void LLVMSetSection(LLVMValueRef Global, char const * Section)} */
    public static void LLVMSetSection(@NativeType("LLVMValueRef") long Global, @NativeType("char const *") ByteBuffer Section) {
        if (CHECKS) {
            checkNT1(Section);
        }
        nLLVMSetSection(Global, memAddress(Section));
    }

    /** {@code void LLVMSetSection(LLVMValueRef Global, char const * Section)} */
    public static void LLVMSetSection(@NativeType("LLVMValueRef") long Global, @NativeType("char const *") CharSequence Section) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Section, true);
            long SectionEncoded = stack.getPointerAddress();
            nLLVMSetSection(Global, SectionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetVisibility ] ---

    /** {@code LLVMVisibility LLVMGetVisibility(LLVMValueRef Global)} */
    @NativeType("LLVMVisibility")
    public static int LLVMGetVisibility(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetVisibility;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress);
    }

    // --- [ LLVMSetVisibility ] ---

    /** {@code void LLVMSetVisibility(LLVMValueRef Global, LLVMVisibility Viz)} */
    public static void LLVMSetVisibility(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMVisibility") int Viz) {
        long __functionAddress = Functions.SetVisibility;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, Viz, __functionAddress);
    }

    // --- [ LLVMGetDLLStorageClass ] ---

    /** {@code LLVMDLLStorageClass LLVMGetDLLStorageClass(LLVMValueRef Global)} */
    @NativeType("LLVMDLLStorageClass")
    public static int LLVMGetDLLStorageClass(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetDLLStorageClass;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress);
    }

    // --- [ LLVMSetDLLStorageClass ] ---

    /** {@code void LLVMSetDLLStorageClass(LLVMValueRef Global, LLVMDLLStorageClass Class)} */
    public static void LLVMSetDLLStorageClass(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMDLLStorageClass") int Class) {
        long __functionAddress = Functions.SetDLLStorageClass;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, Class, __functionAddress);
    }

    // --- [ LLVMGetUnnamedAddress ] ---

    /** {@code LLVMUnnamedAddr LLVMGetUnnamedAddress(LLVMValueRef Global)} */
    @NativeType("LLVMUnnamedAddr")
    public static int LLVMGetUnnamedAddress(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetUnnamedAddress;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        return invokePI(Global, __functionAddress);
    }

    // --- [ LLVMSetUnnamedAddress ] ---

    /** {@code void LLVMSetUnnamedAddress(LLVMValueRef Global, LLVMUnnamedAddr UnnamedAddr)} */
    public static void LLVMSetUnnamedAddress(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMUnnamedAddr") int UnnamedAddr) {
        long __functionAddress = Functions.SetUnnamedAddress;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        invokePV(Global, UnnamedAddr, __functionAddress);
    }

    // --- [ LLVMGlobalGetValueType ] ---

    /** {@code LLVMTypeRef LLVMGlobalGetValueType(LLVMValueRef Global)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGlobalGetValueType(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GlobalGetValueType;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        return invokePP(Global, __functionAddress);
    }

    // --- [ LLVMHasUnnamedAddr ] ---

    /** {@code LLVMBool LLVMHasUnnamedAddr(LLVMValueRef Global)} */
    @NativeType("LLVMBool")
    public static boolean LLVMHasUnnamedAddr(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.HasUnnamedAddr;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress) != 0;
    }

    // --- [ LLVMSetUnnamedAddr ] ---

    /** {@code void LLVMSetUnnamedAddr(LLVMValueRef Global, LLVMBool HasUnnamedAddr)} */
    public static void LLVMSetUnnamedAddr(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMBool") boolean HasUnnamedAddr) {
        long __functionAddress = Functions.SetUnnamedAddr;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, HasUnnamedAddr ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetAlignment ] ---

    /** {@code unsigned int LLVMGetAlignment(LLVMValueRef V)} */
    @NativeType("unsigned int")
    public static int LLVMGetAlignment(@NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.GetAlignment;
        if (CHECKS) {
            check(V);
        }
        return invokePI(V, __functionAddress);
    }

    // --- [ LLVMSetAlignment ] ---

    /** {@code void LLVMSetAlignment(LLVMValueRef V, unsigned int Bytes)} */
    public static void LLVMSetAlignment(@NativeType("LLVMValueRef") long V, @NativeType("unsigned int") int Bytes) {
        long __functionAddress = Functions.SetAlignment;
        if (CHECKS) {
            check(V);
        }
        invokePV(V, Bytes, __functionAddress);
    }

    // --- [ LLVMGlobalSetMetadata ] ---

    /** {@code void LLVMGlobalSetMetadata(LLVMValueRef Global, unsigned int Kind, LLVMMetadataRef MD)} */
    public static void LLVMGlobalSetMetadata(@NativeType("LLVMValueRef") long Global, @NativeType("unsigned int") int Kind, @NativeType("LLVMMetadataRef") long MD) {
        long __functionAddress = Functions.GlobalSetMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
            check(MD);
        }
        invokePPV(Global, Kind, MD, __functionAddress);
    }

    // --- [ LLVMGlobalEraseMetadata ] ---

    /** {@code void LLVMGlobalEraseMetadata(LLVMValueRef Global, unsigned int Kind)} */
    public static void LLVMGlobalEraseMetadata(@NativeType("LLVMValueRef") long Global, @NativeType("unsigned int") int Kind) {
        long __functionAddress = Functions.GlobalEraseMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        invokePV(Global, Kind, __functionAddress);
    }

    // --- [ LLVMGlobalClearMetadata ] ---

    /** {@code void LLVMGlobalClearMetadata(LLVMValueRef Global)} */
    public static void LLVMGlobalClearMetadata(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GlobalClearMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        invokePV(Global, __functionAddress);
    }

    // --- [ LLVMGlobalCopyAllMetadata ] ---

    /** {@code LLVMValueMetadataEntry * LLVMGlobalCopyAllMetadata(LLVMValueRef Value, size_t * NumEntries)} */
    public static long nLLVMGlobalCopyAllMetadata(long Value, long NumEntries) {
        long __functionAddress = Functions.GlobalCopyAllMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Value);
        }
        return invokePPP(Value, NumEntries, __functionAddress);
    }

    /** {@code LLVMValueMetadataEntry * LLVMGlobalCopyAllMetadata(LLVMValueRef Value, size_t * NumEntries)} */
    @NativeType("LLVMValueMetadataEntry *")
    public static long LLVMGlobalCopyAllMetadata(@NativeType("LLVMValueRef") long Value, @NativeType("size_t *") PointerBuffer NumEntries) {
        if (CHECKS) {
            check(NumEntries, 1);
        }
        return nLLVMGlobalCopyAllMetadata(Value, memAddress(NumEntries));
    }

    // --- [ LLVMDisposeValueMetadataEntries ] ---

    /** {@code void LLVMDisposeValueMetadataEntries(LLVMValueMetadataEntry * Entries)} */
    public static void LLVMDisposeValueMetadataEntries(@NativeType("LLVMValueMetadataEntry *") long Entries) {
        long __functionAddress = Functions.DisposeValueMetadataEntries;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        invokePV(Entries, __functionAddress);
    }

    // --- [ LLVMValueMetadataEntriesGetKind ] ---

    /** {@code unsigned int LLVMValueMetadataEntriesGetKind(LLVMValueMetadataEntry * Entries, unsigned int Index)} */
    @NativeType("unsigned int")
    public static int LLVMValueMetadataEntriesGetKind(@NativeType("LLVMValueMetadataEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ValueMetadataEntriesGetKind;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        return invokePI(Entries, Index, __functionAddress);
    }

    // --- [ LLVMValueMetadataEntriesGetMetadata ] ---

    /** {@code LLVMMetadataRef LLVMValueMetadataEntriesGetMetadata(LLVMValueMetadataEntry * Entries, unsigned int Index)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMValueMetadataEntriesGetMetadata(@NativeType("LLVMValueMetadataEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ValueMetadataEntriesGetMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        return invokePP(Entries, Index, __functionAddress);
    }

    // --- [ LLVMAddGlobal ] ---

    /** {@code LLVMValueRef LLVMAddGlobal(LLVMModuleRef M, LLVMTypeRef Ty, char const * Name)} */
    public static long nLLVMAddGlobal(long M, long Ty, long Name) {
        long __functionAddress = Functions.AddGlobal;
        if (CHECKS) {
            check(M);
            check(Ty);
        }
        return invokePPPP(M, Ty, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMAddGlobal(LLVMModuleRef M, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobal(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddGlobal(M, Ty, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMAddGlobal(LLVMModuleRef M, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobal(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAddGlobal(M, Ty, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAddGlobalInAddressSpace ] ---

    /** {@code LLVMValueRef LLVMAddGlobalInAddressSpace(LLVMModuleRef M, LLVMTypeRef Ty, char const * Name, unsigned int AddressSpace)} */
    public static long nLLVMAddGlobalInAddressSpace(long M, long Ty, long Name, int AddressSpace) {
        long __functionAddress = Functions.AddGlobalInAddressSpace;
        if (CHECKS) {
            check(M);
            check(Ty);
        }
        return invokePPPP(M, Ty, Name, AddressSpace, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMAddGlobalInAddressSpace(LLVMModuleRef M, LLVMTypeRef Ty, char const * Name, unsigned int AddressSpace)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobalInAddressSpace(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name, @NativeType("unsigned int") int AddressSpace) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddGlobalInAddressSpace(M, Ty, memAddress(Name), AddressSpace);
    }

    /** {@code LLVMValueRef LLVMAddGlobalInAddressSpace(LLVMModuleRef M, LLVMTypeRef Ty, char const * Name, unsigned int AddressSpace)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobalInAddressSpace(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence Name, @NativeType("unsigned int") int AddressSpace) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAddGlobalInAddressSpace(M, Ty, NameEncoded, AddressSpace);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedGlobal ] ---

    /** {@code LLVMValueRef LLVMGetNamedGlobal(LLVMModuleRef M, char const * Name)} */
    public static long nLLVMGetNamedGlobal(long M, long Name) {
        long __functionAddress = Functions.GetNamedGlobal;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(M, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobal(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobal(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetNamedGlobal(M, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobal(LLVMModuleRef M, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobal(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedGlobal(M, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedGlobalWithLength ] ---

    /** {@code LLVMValueRef LLVMGetNamedGlobalWithLength(LLVMModuleRef M, char const * Name, size_t Length)} */
    public static long nLLVMGetNamedGlobalWithLength(long M, long Name, long Length) {
        long __functionAddress = Functions.GetNamedGlobalWithLength;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, Length, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobalWithLength(LLVMModuleRef M, char const * Name, size_t Length)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobalWithLength(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetNamedGlobalWithLength(M, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobalWithLength(LLVMModuleRef M, char const * Name, size_t Length)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobalWithLength(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedGlobalWithLength(M, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetFirstGlobal ] ---

    /** {@code LLVMValueRef LLVMGetFirstGlobal(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstGlobal(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstGlobal;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastGlobal ] ---

    /** {@code LLVMValueRef LLVMGetLastGlobal(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastGlobal(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastGlobal;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetNextGlobal ] ---

    /** {@code LLVMValueRef LLVMGetNextGlobal(LLVMValueRef GlobalVar)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetNextGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(GlobalVar, __functionAddress);
    }

    // --- [ LLVMGetPreviousGlobal ] ---

    /** {@code LLVMValueRef LLVMGetPreviousGlobal(LLVMValueRef GlobalVar)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetPreviousGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(GlobalVar, __functionAddress);
    }

    // --- [ LLVMDeleteGlobal ] ---

    /** {@code void LLVMDeleteGlobal(LLVMValueRef GlobalVar)} */
    public static void LLVMDeleteGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.DeleteGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, __functionAddress);
    }

    // --- [ LLVMGetInitializer ] ---

    /** {@code LLVMValueRef LLVMGetInitializer(LLVMValueRef GlobalVar)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetInitializer(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetInitializer;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(GlobalVar, __functionAddress);
    }

    // --- [ LLVMSetInitializer ] ---

    /** {@code void LLVMSetInitializer(LLVMValueRef GlobalVar, LLVMValueRef ConstantVal)} */
    public static void LLVMSetInitializer(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.SetInitializer;
        if (CHECKS) {
            check(GlobalVar);
            check(ConstantVal);
        }
        invokePPV(GlobalVar, ConstantVal, __functionAddress);
    }

    // --- [ LLVMIsThreadLocal ] ---

    /** {@code LLVMBool LLVMIsThreadLocal(LLVMValueRef GlobalVar)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsThreadLocal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsThreadLocal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress) != 0;
    }

    // --- [ LLVMSetThreadLocal ] ---

    /** {@code void LLVMSetThreadLocal(LLVMValueRef GlobalVar, LLVMBool IsThreadLocal)} */
    public static void LLVMSetThreadLocal(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsThreadLocal) {
        long __functionAddress = Functions.SetThreadLocal;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, IsThreadLocal ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMIsGlobalConstant ] ---

    /** {@code LLVMBool LLVMIsGlobalConstant(LLVMValueRef GlobalVar)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsGlobalConstant(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsGlobalConstant;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress) != 0;
    }

    // --- [ LLVMSetGlobalConstant ] ---

    /** {@code void LLVMSetGlobalConstant(LLVMValueRef GlobalVar, LLVMBool IsConstant)} */
    public static void LLVMSetGlobalConstant(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsConstant) {
        long __functionAddress = Functions.SetGlobalConstant;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, IsConstant ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetThreadLocalMode ] ---

    /** {@code LLVMThreadLocalMode LLVMGetThreadLocalMode(LLVMValueRef GlobalVar)} */
    @NativeType("LLVMThreadLocalMode")
    public static int LLVMGetThreadLocalMode(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetThreadLocalMode;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress);
    }

    // --- [ LLVMSetThreadLocalMode ] ---

    /** {@code void LLVMSetThreadLocalMode(LLVMValueRef GlobalVar, LLVMThreadLocalMode Mode)} */
    public static void LLVMSetThreadLocalMode(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMThreadLocalMode") int Mode) {
        long __functionAddress = Functions.SetThreadLocalMode;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, Mode, __functionAddress);
    }

    // --- [ LLVMIsExternallyInitialized ] ---

    /** {@code LLVMBool LLVMIsExternallyInitialized(LLVMValueRef GlobalVar)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsExternallyInitialized(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsExternallyInitialized;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress) != 0;
    }

    // --- [ LLVMSetExternallyInitialized ] ---

    /** {@code void LLVMSetExternallyInitialized(LLVMValueRef GlobalVar, LLVMBool IsExtInit)} */
    public static void LLVMSetExternallyInitialized(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsExtInit) {
        long __functionAddress = Functions.SetExternallyInitialized;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, IsExtInit ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMAddAlias ] ---

    /** {@code LLVMValueRef LLVMAddAlias(LLVMModuleRef M, LLVMTypeRef Ty, LLVMValueRef Aliasee, char const * Name)} */
    public static long nLLVMAddAlias(long M, long Ty, long Aliasee, long Name) {
        long __functionAddress = Functions.AddAlias;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
            check(Ty);
            check(Aliasee);
        }
        return invokePPPPP(M, Ty, Aliasee, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMAddAlias(LLVMModuleRef M, LLVMTypeRef Ty, LLVMValueRef Aliasee, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddAlias(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Aliasee, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddAlias(M, Ty, Aliasee, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMAddAlias(LLVMModuleRef M, LLVMTypeRef Ty, LLVMValueRef Aliasee, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddAlias(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Aliasee, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAddAlias(M, Ty, Aliasee, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAddAlias2 ] ---

    /** {@code LLVMValueRef LLVMAddAlias2(LLVMModuleRef M, LLVMTypeRef ValueTy, unsigned AddrSpace, LLVMValueRef Aliasee, char const * Name)} */
    public static long nLLVMAddAlias2(long M, long ValueTy, int AddrSpace, long Aliasee, long Name) {
        long __functionAddress = Functions.AddAlias2;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
            check(ValueTy);
            check(Aliasee);
        }
        return invokePPPPP(M, ValueTy, AddrSpace, Aliasee, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMAddAlias2(LLVMModuleRef M, LLVMTypeRef ValueTy, unsigned AddrSpace, LLVMValueRef Aliasee, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddAlias2(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long ValueTy, @NativeType("unsigned") int AddrSpace, @NativeType("LLVMValueRef") long Aliasee, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddAlias2(M, ValueTy, AddrSpace, Aliasee, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMAddAlias2(LLVMModuleRef M, LLVMTypeRef ValueTy, unsigned AddrSpace, LLVMValueRef Aliasee, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddAlias2(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long ValueTy, @NativeType("unsigned") int AddrSpace, @NativeType("LLVMValueRef") long Aliasee, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAddAlias2(M, ValueTy, AddrSpace, Aliasee, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedGlobalAlias ] ---

    /** {@code LLVMValueRef LLVMGetNamedGlobalAlias(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    public static long nLLVMGetNamedGlobalAlias(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetNamedGlobalAlias;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, NameLen, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobalAlias(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobalAlias(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetNamedGlobalAlias(M, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobalAlias(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobalAlias(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedGlobalAlias(M, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetFirstGlobalAlias ] ---

    /** {@code LLVMValueRef LLVMGetFirstGlobalAlias(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstGlobalAlias(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstGlobalAlias;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastGlobalAlias ] ---

    /** {@code LLVMValueRef LLVMGetLastGlobalAlias(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastGlobalAlias(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastGlobalAlias;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetNextGlobalAlias ] ---

    /** {@code LLVMValueRef LLVMGetNextGlobalAlias(LLVMValueRef GA)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextGlobalAlias(@NativeType("LLVMValueRef") long GA) {
        long __functionAddress = Functions.GetNextGlobalAlias;
        if (CHECKS) {
            check(__functionAddress);
            check(GA);
        }
        return invokePP(GA, __functionAddress);
    }

    // --- [ LLVMGetPreviousGlobalAlias ] ---

    /** {@code LLVMValueRef LLVMGetPreviousGlobalAlias(LLVMValueRef GA)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousGlobalAlias(@NativeType("LLVMValueRef") long GA) {
        long __functionAddress = Functions.GetPreviousGlobalAlias;
        if (CHECKS) {
            check(__functionAddress);
            check(GA);
        }
        return invokePP(GA, __functionAddress);
    }

    // --- [ LLVMAliasGetAliasee ] ---

    /** {@code LLVMValueRef LLVMAliasGetAliasee(LLVMValueRef Alias)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAliasGetAliasee(@NativeType("LLVMValueRef") long Alias) {
        long __functionAddress = Functions.AliasGetAliasee;
        if (CHECKS) {
            check(__functionAddress);
            check(Alias);
        }
        return invokePP(Alias, __functionAddress);
    }

    // --- [ LLVMAliasSetAliasee ] ---

    /** {@code void LLVMAliasSetAliasee(LLVMValueRef Alias, LLVMValueRef Aliasee)} */
    public static void LLVMAliasSetAliasee(@NativeType("LLVMValueRef") long Alias, @NativeType("LLVMValueRef") long Aliasee) {
        long __functionAddress = Functions.AliasSetAliasee;
        if (CHECKS) {
            check(__functionAddress);
            check(Alias);
            check(Aliasee);
        }
        invokePPV(Alias, Aliasee, __functionAddress);
    }

    // --- [ LLVMDeleteFunction ] ---

    /** {@code void LLVMDeleteFunction(LLVMValueRef Fn)} */
    public static void LLVMDeleteFunction(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.DeleteFunction;
        if (CHECKS) {
            check(Fn);
        }
        invokePV(Fn, __functionAddress);
    }

    // --- [ LLVMHasPersonalityFn ] ---

    /** {@code LLVMBool LLVMHasPersonalityFn(LLVMValueRef Fn)} */
    @NativeType("LLVMBool")
    public static boolean LLVMHasPersonalityFn(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.HasPersonalityFn;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, __functionAddress) != 0;
    }

    // --- [ LLVMGetPersonalityFn ] ---

    /** {@code LLVMValueRef LLVMGetPersonalityFn(LLVMValueRef Fn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPersonalityFn(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetPersonalityFn;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMSetPersonalityFn ] ---

    /** {@code void LLVMSetPersonalityFn(LLVMValueRef Fn, LLVMValueRef PersonalityFn)} */
    public static void LLVMSetPersonalityFn(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef") long PersonalityFn) {
        long __functionAddress = Functions.SetPersonalityFn;
        if (CHECKS) {
            check(Fn);
            check(PersonalityFn);
        }
        invokePPV(Fn, PersonalityFn, __functionAddress);
    }

    // --- [ LLVMLookupIntrinsicID ] ---

    /** {@code unsigned int LLVMLookupIntrinsicID(char const * Name, size_t NameLen)} */
    public static int nLLVMLookupIntrinsicID(long Name, long NameLen) {
        long __functionAddress = Functions.LookupIntrinsicID;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPI(Name, NameLen, __functionAddress);
    }

    /** {@code unsigned int LLVMLookupIntrinsicID(char const * Name, size_t NameLen)} */
    @NativeType("unsigned int")
    public static int LLVMLookupIntrinsicID(@NativeType("char const *") ByteBuffer Name) {
        return nLLVMLookupIntrinsicID(memAddress(Name), Name.remaining());
    }

    /** {@code unsigned int LLVMLookupIntrinsicID(char const * Name, size_t NameLen)} */
    @NativeType("unsigned int")
    public static int LLVMLookupIntrinsicID(@NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMLookupIntrinsicID(NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetIntrinsicID ] ---

    /** {@code unsigned int LLVMGetIntrinsicID(LLVMValueRef Fn)} */
    @NativeType("unsigned int")
    public static int LLVMGetIntrinsicID(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetIntrinsicID;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, __functionAddress);
    }

    // --- [ LLVMGetIntrinsicDeclaration ] ---

    /** {@code LLVMValueRef LLVMGetIntrinsicDeclaration(LLVMModuleRef Mod, unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount)} */
    public static long nLLVMGetIntrinsicDeclaration(long Mod, int ID, long ParamTypes, long ParamCount) {
        long __functionAddress = Functions.GetIntrinsicDeclaration;
        if (CHECKS) {
            check(__functionAddress);
            check(Mod);
        }
        return invokePPPP(Mod, ID, ParamTypes, ParamCount, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetIntrinsicDeclaration(LLVMModuleRef Mod, unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetIntrinsicDeclaration(@NativeType("LLVMModuleRef") long Mod, @NativeType("unsigned") int ID, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes) {
        return nLLVMGetIntrinsicDeclaration(Mod, ID, memAddress(ParamTypes), ParamTypes.remaining());
    }

    // --- [ LLVMIntrinsicGetType ] ---

    /** {@code LLVMValueRef LLVMIntrinsicGetType(LLVMContextRef Ctx, unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount)} */
    public static long nLLVMIntrinsicGetType(long Ctx, int ID, long ParamTypes, long ParamCount) {
        long __functionAddress = Functions.IntrinsicGetType;
        if (CHECKS) {
            check(__functionAddress);
            check(Ctx);
        }
        return invokePPPP(Ctx, ID, ParamTypes, ParamCount, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMIntrinsicGetType(LLVMContextRef Ctx, unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIntrinsicGetType(@NativeType("LLVMContextRef") long Ctx, @NativeType("unsigned") int ID, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes) {
        return nLLVMIntrinsicGetType(Ctx, ID, memAddress(ParamTypes), ParamTypes.remaining());
    }

    // --- [ LLVMIntrinsicGetName ] ---

    /** {@code char const * LLVMIntrinsicGetName(unsigned ID, size_t * NameLength)} */
    public static long nLLVMIntrinsicGetName(int ID, long NameLength) {
        long __functionAddress = Functions.IntrinsicGetName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(ID, NameLength, __functionAddress);
    }

    /** {@code char const * LLVMIntrinsicGetName(unsigned ID, size_t * NameLength)} */
    @NativeType("char const *")
    public static @Nullable String LLVMIntrinsicGetName(@NativeType("unsigned") int ID) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer NameLength = stack.callocPointer(1);
            long __result = nLLVMIntrinsicGetName(ID, memAddress(NameLength));
            return memUTF8Safe(__result, (int)NameLength.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMIntrinsicCopyOverloadedName ] ---

    /** {@code char * LLVMIntrinsicCopyOverloadedName(unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount, size_t * NameLength)} */
    public static long nLLVMIntrinsicCopyOverloadedName(int ID, long ParamTypes, long ParamCount, long NameLength) {
        long __functionAddress = Functions.IntrinsicCopyOverloadedName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPP(ID, ParamTypes, ParamCount, NameLength, __functionAddress);
    }

    /** {@code char * LLVMIntrinsicCopyOverloadedName(unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount, size_t * NameLength)} */
    @NativeType("char *")
    public static @Nullable String LLVMIntrinsicCopyOverloadedName(@NativeType("unsigned") int ID, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer NameLength = stack.callocPointer(1);
            long __result = nLLVMIntrinsicCopyOverloadedName(ID, memAddress(ParamTypes), ParamTypes.remaining(), memAddress(NameLength));
            return memUTF8Safe(__result, (int)NameLength.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMIntrinsicCopyOverloadedName2 ] ---

    /** {@code char * LLVMIntrinsicCopyOverloadedName2(LLVMModuleRef Mod, unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount, size_t * NameLength)} */
    public static long nLLVMIntrinsicCopyOverloadedName2(long Mod, int ID, long ParamTypes, long ParamCount, long NameLength) {
        long __functionAddress = Functions.IntrinsicCopyOverloadedName2;
        if (CHECKS) {
            check(__functionAddress);
            check(Mod);
        }
        return invokePPPPP(Mod, ID, ParamTypes, ParamCount, NameLength, __functionAddress);
    }

    /** {@code char * LLVMIntrinsicCopyOverloadedName2(LLVMModuleRef Mod, unsigned ID, LLVMTypeRef * ParamTypes, size_t ParamCount, size_t * NameLength)} */
    @NativeType("char *")
    public static @Nullable String LLVMIntrinsicCopyOverloadedName2(@NativeType("LLVMModuleRef") long Mod, @NativeType("unsigned") int ID, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer NameLength = stack.callocPointer(1);
            long __result = nLLVMIntrinsicCopyOverloadedName2(Mod, ID, memAddress(ParamTypes), ParamTypes.remaining(), memAddress(NameLength));
            return memUTF8Safe(__result, (int)NameLength.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMIntrinsicIsOverloaded ] ---

    /** {@code LLVMBool LLVMIntrinsicIsOverloaded(unsigned ID)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIntrinsicIsOverloaded(@NativeType("unsigned") int ID) {
        long __functionAddress = Functions.IntrinsicIsOverloaded;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(ID, __functionAddress) != 0;
    }

    // --- [ LLVMGetFunctionCallConv ] ---

    /** {@code unsigned int LLVMGetFunctionCallConv(LLVMValueRef Fn)} */
    @NativeType("unsigned int")
    public static int LLVMGetFunctionCallConv(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetFunctionCallConv;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, __functionAddress);
    }

    // --- [ LLVMSetFunctionCallConv ] ---

    /** {@code void LLVMSetFunctionCallConv(LLVMValueRef Fn, unsigned int CC)} */
    public static void LLVMSetFunctionCallConv(@NativeType("LLVMValueRef") long Fn, @NativeType("unsigned int") int CC) {
        long __functionAddress = Functions.SetFunctionCallConv;
        if (CHECKS) {
            check(Fn);
        }
        invokePV(Fn, CC, __functionAddress);
    }

    // --- [ LLVMGetGC ] ---

    /** {@code char const * LLVMGetGC(LLVMValueRef Fn)} */
    public static long nLLVMGetGC(long Fn) {
        long __functionAddress = Functions.GetGC;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    /** {@code char const * LLVMGetGC(LLVMValueRef Fn)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetGC(@NativeType("LLVMValueRef") long Fn) {
        long __result = nLLVMGetGC(Fn);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMSetGC ] ---

    /** {@code void LLVMSetGC(LLVMValueRef Fn, char const * Name)} */
    public static void nLLVMSetGC(long Fn, long Name) {
        long __functionAddress = Functions.SetGC;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(Fn, Name, __functionAddress);
    }

    /** {@code void LLVMSetGC(LLVMValueRef Fn, char const * Name)} */
    public static void LLVMSetGC(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMSetGC(Fn, memAddress(Name));
    }

    /** {@code void LLVMSetGC(LLVMValueRef Fn, char const * Name)} */
    public static void LLVMSetGC(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            nLLVMSetGC(Fn, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetPrefixData ] ---

    /** {@code LLVMValueRef LLVMGetPrefixData(LLVMValueRef Fn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPrefixData(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetPrefixData;
        if (CHECKS) {
            check(__functionAddress);
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMHasPrefixData ] ---

    /** {@code LLVMBool LLVMHasPrefixData(LLVMValueRef Fn)} */
    @NativeType("LLVMBool")
    public static boolean LLVMHasPrefixData(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.HasPrefixData;
        if (CHECKS) {
            check(__functionAddress);
            check(Fn);
        }
        return invokePI(Fn, __functionAddress) != 0;
    }

    // --- [ LLVMSetPrefixData ] ---

    /** {@code void LLVMSetPrefixData(LLVMValueRef Fn, LLVMValueRef prefixData)} */
    public static void LLVMSetPrefixData(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef") long prefixData) {
        long __functionAddress = Functions.SetPrefixData;
        if (CHECKS) {
            check(__functionAddress);
            check(Fn);
            check(prefixData);
        }
        invokePPV(Fn, prefixData, __functionAddress);
    }

    // --- [ LLVMGetPrologueData ] ---

    /** {@code LLVMValueRef LLVMGetPrologueData(LLVMValueRef Fn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPrologueData(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetPrologueData;
        if (CHECKS) {
            check(__functionAddress);
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMHasPrologueData ] ---

    /** {@code LLVMBool LLVMHasPrologueData(LLVMValueRef Fn)} */
    @NativeType("LLVMBool")
    public static boolean LLVMHasPrologueData(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.HasPrologueData;
        if (CHECKS) {
            check(__functionAddress);
            check(Fn);
        }
        return invokePI(Fn, __functionAddress) != 0;
    }

    // --- [ LLVMSetPrologueData ] ---

    /** {@code void LLVMSetPrologueData(LLVMValueRef Fn, LLVMValueRef prologueData)} */
    public static void LLVMSetPrologueData(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef") long prologueData) {
        long __functionAddress = Functions.SetPrologueData;
        if (CHECKS) {
            check(__functionAddress);
            check(Fn);
            check(prologueData);
        }
        invokePPV(Fn, prologueData, __functionAddress);
    }

    // --- [ LLVMAddAttributeAtIndex ] ---

    /** {@code void LLVMAddAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, LLVMAttributeRef A)} */
    public static void LLVMAddAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.AddAttributeAtIndex;
        if (CHECKS) {
            check(F);
            check(A);
        }
        invokePPV(F, Idx, A, __functionAddress);
    }

    // --- [ LLVMGetAttributeCountAtIndex ] ---

    /** {@code unsigned int LLVMGetAttributeCountAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx)} */
    @NativeType("unsigned int")
    public static int LLVMGetAttributeCountAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx) {
        long __functionAddress = Functions.GetAttributeCountAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePI(F, Idx, __functionAddress);
    }

    // --- [ LLVMGetAttributesAtIndex ] ---

    /** {@code void LLVMGetAttributesAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, LLVMAttributeRef * Attrs)} */
    public static void nLLVMGetAttributesAtIndex(long F, int Idx, long Attrs) {
        long __functionAddress = Functions.GetAttributesAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePPV(F, Idx, Attrs, __functionAddress);
    }

    /** {@code void LLVMGetAttributesAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, LLVMAttributeRef * Attrs)} */
    public static void LLVMGetAttributesAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef *") PointerBuffer Attrs) {
        if (CHECKS) {
            if (DEBUG) {
                check(Attrs, LLVMGetAttributeCountAtIndex(F, Idx));
            }
        }
        nLLVMGetAttributesAtIndex(F, Idx, memAddress(Attrs));
    }

    // --- [ LLVMGetEnumAttributeAtIndex ] ---

    /** {@code LLVMAttributeRef LLVMGetEnumAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, unsigned int KindID)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMGetEnumAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.GetEnumAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePP(F, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMGetStringAttributeAtIndex ] ---

    /** {@code LLVMAttributeRef LLVMGetStringAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static long nLLVMGetStringAttributeAtIndex(long F, int Idx, long K, int KLen) {
        long __functionAddress = Functions.GetStringAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePPP(F, Idx, K, KLen, __functionAddress);
    }

    /** {@code LLVMAttributeRef LLVMGetStringAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMGetStringAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        return nLLVMGetStringAttributeAtIndex(F, Idx, memAddress(K), K.remaining());
    }

    /** {@code LLVMAttributeRef LLVMGetStringAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMGetStringAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") CharSequence K) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int KEncodedLength = stack.nUTF8(K, false);
            long KEncoded = stack.getPointerAddress();
            return nLLVMGetStringAttributeAtIndex(F, Idx, KEncoded, KEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMRemoveEnumAttributeAtIndex ] ---

    /** {@code void LLVMRemoveEnumAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, unsigned int KindID)} */
    public static void LLVMRemoveEnumAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.RemoveEnumAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePV(F, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMRemoveStringAttributeAtIndex ] ---

    /** {@code void LLVMRemoveStringAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static void nLLVMRemoveStringAttributeAtIndex(long F, int Idx, long K, int KLen) {
        long __functionAddress = Functions.RemoveStringAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePPV(F, Idx, K, KLen, __functionAddress);
    }

    /** {@code void LLVMRemoveStringAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static void LLVMRemoveStringAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        nLLVMRemoveStringAttributeAtIndex(F, Idx, memAddress(K), K.remaining());
    }

    /** {@code void LLVMRemoveStringAttributeAtIndex(LLVMValueRef F, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static void LLVMRemoveStringAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") CharSequence K) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int KEncodedLength = stack.nUTF8(K, false);
            long KEncoded = stack.getPointerAddress();
            nLLVMRemoveStringAttributeAtIndex(F, Idx, KEncoded, KEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAddTargetDependentFunctionAttr ] ---

    /** {@code void LLVMAddTargetDependentFunctionAttr(LLVMValueRef Fn, char const * A, char const * V)} */
    public static void nLLVMAddTargetDependentFunctionAttr(long Fn, long A, long V) {
        long __functionAddress = Functions.AddTargetDependentFunctionAttr;
        if (CHECKS) {
            check(Fn);
        }
        invokePPPV(Fn, A, V, __functionAddress);
    }

    /** {@code void LLVMAddTargetDependentFunctionAttr(LLVMValueRef Fn, char const * A, char const * V)} */
    public static void LLVMAddTargetDependentFunctionAttr(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer A, @NativeType("char const *") ByteBuffer V) {
        if (CHECKS) {
            checkNT1(A);
            checkNT1(V);
        }
        nLLVMAddTargetDependentFunctionAttr(Fn, memAddress(A), memAddress(V));
    }

    /** {@code void LLVMAddTargetDependentFunctionAttr(LLVMValueRef Fn, char const * A, char const * V)} */
    public static void LLVMAddTargetDependentFunctionAttr(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") CharSequence A, @NativeType("char const *") CharSequence V) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(A, true);
            long AEncoded = stack.getPointerAddress();
            stack.nUTF8(V, true);
            long VEncoded = stack.getPointerAddress();
            nLLVMAddTargetDependentFunctionAttr(Fn, AEncoded, VEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCountParams ] ---

    /** {@code unsigned int LLVMCountParams(LLVMValueRef Fn)} */
    @NativeType("unsigned int")
    public static int LLVMCountParams(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.CountParams;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, __functionAddress);
    }

    // --- [ LLVMGetParams ] ---

    /** {@code void LLVMGetParams(LLVMValueRef Fn, LLVMValueRef * Params)} */
    public static void nLLVMGetParams(long Fn, long Params) {
        long __functionAddress = Functions.GetParams;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(Fn, Params, __functionAddress);
    }

    /** {@code void LLVMGetParams(LLVMValueRef Fn, LLVMValueRef * Params)} */
    public static void LLVMGetParams(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Params) {
        if (CHECKS) {
            if (DEBUG) {
                check(Params, LLVMCountParams(Fn));
            }
        }
        nLLVMGetParams(Fn, memAddress(Params));
    }

    // --- [ LLVMGetParam ] ---

    /** {@code LLVMValueRef LLVMGetParam(LLVMValueRef Fn, unsigned int Index)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetParam(@NativeType("LLVMValueRef") long Fn, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, Index, __functionAddress);
    }

    // --- [ LLVMGetParamParent ] ---

    /** {@code LLVMValueRef LLVMGetParamParent(LLVMValueRef Inst)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetParamParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetParamParent;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMGetFirstParam ] ---

    /** {@code LLVMValueRef LLVMGetFirstParam(LLVMValueRef Fn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstParam(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetFirstParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetLastParam ] ---

    /** {@code LLVMValueRef LLVMGetLastParam(LLVMValueRef Fn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastParam(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetLastParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetNextParam ] ---

    /** {@code LLVMValueRef LLVMGetNextParam(LLVMValueRef Arg)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextParam(@NativeType("LLVMValueRef") long Arg) {
        long __functionAddress = Functions.GetNextParam;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMGetPreviousParam ] ---

    /** {@code LLVMValueRef LLVMGetPreviousParam(LLVMValueRef Arg)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousParam(@NativeType("LLVMValueRef") long Arg) {
        long __functionAddress = Functions.GetPreviousParam;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMSetParamAlignment ] ---

    /** {@code void LLVMSetParamAlignment(LLVMValueRef Arg, unsigned int Align)} */
    public static void LLVMSetParamAlignment(@NativeType("LLVMValueRef") long Arg, @NativeType("unsigned int") int Align) {
        long __functionAddress = Functions.SetParamAlignment;
        if (CHECKS) {
            check(Arg);
        }
        invokePV(Arg, Align, __functionAddress);
    }

    // --- [ LLVMAddGlobalIFunc ] ---

    /** {@code LLVMValueRef LLVMAddGlobalIFunc(LLVMModuleRef M, char const * Name, size_t NameLen, LLVMTypeRef Ty, unsigned AddrSpace, LLVMValueRef Resolver)} */
    public static long nLLVMAddGlobalIFunc(long M, long Name, long NameLen, long Ty, int AddrSpace, long Resolver) {
        long __functionAddress = Functions.AddGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
            check(Ty);
            check(Resolver);
        }
        return invokePPPPPP(M, Name, NameLen, Ty, AddrSpace, Resolver, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMAddGlobalIFunc(LLVMModuleRef M, char const * Name, size_t NameLen, LLVMTypeRef Ty, unsigned AddrSpace, LLVMValueRef Resolver)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobalIFunc(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMTypeRef") long Ty, @NativeType("unsigned") int AddrSpace, @NativeType("LLVMValueRef") long Resolver) {
        return nLLVMAddGlobalIFunc(M, memAddress(Name), Name.remaining(), Ty, AddrSpace, Resolver);
    }

    /** {@code LLVMValueRef LLVMAddGlobalIFunc(LLVMModuleRef M, char const * Name, size_t NameLen, LLVMTypeRef Ty, unsigned AddrSpace, LLVMValueRef Resolver)} */
    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobalIFunc(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name, @NativeType("LLVMTypeRef") long Ty, @NativeType("unsigned") int AddrSpace, @NativeType("LLVMValueRef") long Resolver) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAddGlobalIFunc(M, NameEncoded, NameEncodedLength, Ty, AddrSpace, Resolver);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNamedGlobalIFunc ] ---

    /** {@code LLVMValueRef LLVMGetNamedGlobalIFunc(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    public static long nLLVMGetNamedGlobalIFunc(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetNamedGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, NameLen, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobalIFunc(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobalIFunc(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetNamedGlobalIFunc(M, memAddress(Name), Name.remaining());
    }

    /** {@code LLVMValueRef LLVMGetNamedGlobalIFunc(LLVMModuleRef M, char const * Name, size_t NameLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobalIFunc(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int NameEncodedLength = stack.nUTF8(Name, false);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMGetNamedGlobalIFunc(M, NameEncoded, NameEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetFirstGlobalIFunc ] ---

    /** {@code LLVMValueRef LLVMGetFirstGlobalIFunc(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstGlobalIFunc(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastGlobalIFunc ] ---

    /** {@code LLVMValueRef LLVMGetLastGlobalIFunc(LLVMModuleRef M)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastGlobalIFunc(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetNextGlobalIFunc ] ---

    /** {@code LLVMValueRef LLVMGetNextGlobalIFunc(LLVMValueRef IFunc)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextGlobalIFunc(@NativeType("LLVMValueRef") long IFunc) {
        long __functionAddress = Functions.GetNextGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(IFunc);
        }
        return invokePP(IFunc, __functionAddress);
    }

    // --- [ LLVMGetPreviousGlobalIFunc ] ---

    /** {@code LLVMValueRef LLVMGetPreviousGlobalIFunc(LLVMValueRef IFunc)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousGlobalIFunc(@NativeType("LLVMValueRef") long IFunc) {
        long __functionAddress = Functions.GetPreviousGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(IFunc);
        }
        return invokePP(IFunc, __functionAddress);
    }

    // --- [ LLVMGetGlobalIFuncResolver ] ---

    /** {@code LLVMValueRef LLVMGetGlobalIFuncResolver(LLVMValueRef IFunc)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetGlobalIFuncResolver(@NativeType("LLVMValueRef") long IFunc) {
        long __functionAddress = Functions.GetGlobalIFuncResolver;
        if (CHECKS) {
            check(__functionAddress);
            check(IFunc);
        }
        return invokePP(IFunc, __functionAddress);
    }

    // --- [ LLVMSetGlobalIFuncResolver ] ---

    /** {@code void LLVMSetGlobalIFuncResolver(LLVMValueRef IFunc, LLVMValueRef Resolver)} */
    public static void LLVMSetGlobalIFuncResolver(@NativeType("LLVMValueRef") long IFunc, @NativeType("LLVMValueRef") long Resolver) {
        long __functionAddress = Functions.SetGlobalIFuncResolver;
        if (CHECKS) {
            check(__functionAddress);
            check(IFunc);
            check(Resolver);
        }
        invokePPV(IFunc, Resolver, __functionAddress);
    }

    // --- [ LLVMEraseGlobalIFunc ] ---

    /** {@code void LLVMEraseGlobalIFunc(LLVMValueRef IFunc)} */
    public static void LLVMEraseGlobalIFunc(@NativeType("LLVMValueRef") long IFunc) {
        long __functionAddress = Functions.EraseGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(IFunc);
        }
        invokePV(IFunc, __functionAddress);
    }

    // --- [ LLVMRemoveGlobalIFunc ] ---

    /** {@code void LLVMRemoveGlobalIFunc(LLVMValueRef IFunc)} */
    public static void LLVMRemoveGlobalIFunc(@NativeType("LLVMValueRef") long IFunc) {
        long __functionAddress = Functions.RemoveGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(IFunc);
        }
        invokePV(IFunc, __functionAddress);
    }

    // --- [ LLVMMDStringInContext2 ] ---

    /** {@code LLVMMetadataRef LLVMMDStringInContext2(LLVMContextRef C, char const * Str, size_t SLen)} */
    public static long nLLVMMDStringInContext2(long C, long Str, long SLen) {
        long __functionAddress = Functions.MDStringInContext2;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPPP(C, Str, SLen, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMMDStringInContext2(LLVMContextRef C, char const * Str, size_t SLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMMDStringInContext2(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Str) {
        return nLLVMMDStringInContext2(C, memAddress(Str), Str.remaining());
    }

    /** {@code LLVMMetadataRef LLVMMDStringInContext2(LLVMContextRef C, char const * Str, size_t SLen)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMMDStringInContext2(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StrEncodedLength = stack.nUTF8(Str, false);
            long StrEncoded = stack.getPointerAddress();
            return nLLVMMDStringInContext2(C, StrEncoded, StrEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMMDNodeInContext2 ] ---

    /** {@code LLVMMetadataRef LLVMMDNodeInContext2(LLVMContextRef C, LLVMMetadataRef * MDs, size_t Count)} */
    public static long nLLVMMDNodeInContext2(long C, long MDs, long Count) {
        long __functionAddress = Functions.MDNodeInContext2;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPPP(C, MDs, Count, __functionAddress);
    }

    /** {@code LLVMMetadataRef LLVMMDNodeInContext2(LLVMContextRef C, LLVMMetadataRef * MDs, size_t Count)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMMDNodeInContext2(@NativeType("LLVMContextRef") long C, @NativeType("LLVMMetadataRef *") PointerBuffer MDs) {
        return nLLVMMDNodeInContext2(C, memAddress(MDs), MDs.remaining());
    }

    // --- [ LLVMMDStringInContext ] ---

    /** {@code LLVMValueRef LLVMMDStringInContext(LLVMContextRef C, char const * Str, unsigned int SLen)} */
    public static long nLLVMMDStringInContext(long C, long Str, int SLen) {
        long __functionAddress = Functions.MDStringInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, Str, SLen, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMMDStringInContext(LLVMContextRef C, char const * Str, unsigned int SLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMMDStringInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Str) {
        return nLLVMMDStringInContext(C, memAddress(Str), Str.remaining());
    }

    /** {@code LLVMValueRef LLVMMDStringInContext(LLVMContextRef C, char const * Str, unsigned int SLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMMDStringInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StrEncodedLength = stack.nUTF8(Str, false);
            long StrEncoded = stack.getPointerAddress();
            return nLLVMMDStringInContext(C, StrEncoded, StrEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMMDString ] ---

    /** {@code LLVMValueRef LLVMMDString(char const * Str, unsigned int SLen)} */
    public static long nLLVMMDString(long Str, int SLen) {
        long __functionAddress = Functions.MDString;
        return invokePP(Str, SLen, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMMDString(char const * Str, unsigned int SLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMMDString(@NativeType("char const *") ByteBuffer Str) {
        return nLLVMMDString(memAddress(Str), Str.remaining());
    }

    /** {@code LLVMValueRef LLVMMDString(char const * Str, unsigned int SLen)} */
    @NativeType("LLVMValueRef")
    public static long LLVMMDString(@NativeType("char const *") CharSequence Str) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StrEncodedLength = stack.nUTF8(Str, false);
            long StrEncoded = stack.getPointerAddress();
            return nLLVMMDString(StrEncoded, StrEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMMDNodeInContext ] ---

    /** {@code LLVMValueRef LLVMMDNodeInContext(LLVMContextRef C, LLVMValueRef * Vals, unsigned int Count)} */
    public static long nLLVMMDNodeInContext(long C, long Vals, int Count) {
        long __functionAddress = Functions.MDNodeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, Vals, Count, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMMDNodeInContext(LLVMContextRef C, LLVMValueRef * Vals, unsigned int Count)} */
    @NativeType("LLVMValueRef")
    public static long LLVMMDNodeInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMValueRef *") PointerBuffer Vals) {
        return nLLVMMDNodeInContext(C, memAddress(Vals), Vals.remaining());
    }

    // --- [ LLVMMDNode ] ---

    /** {@code LLVMValueRef LLVMMDNode(LLVMValueRef * Vals, unsigned int Count)} */
    public static long nLLVMMDNode(long Vals, int Count) {
        long __functionAddress = Functions.MDNode;
        return invokePP(Vals, Count, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMMDNode(LLVMValueRef * Vals, unsigned int Count)} */
    @NativeType("LLVMValueRef")
    public static long LLVMMDNode(@NativeType("LLVMValueRef *") PointerBuffer Vals) {
        return nLLVMMDNode(memAddress(Vals), Vals.remaining());
    }

    // --- [ LLVMCreateOperandBundle ] ---

    /** {@code LLVMOperandBundleRef LLVMCreateOperandBundle(char const * Tag, size_t TagLen, LLVMValueRef * Args, unsigned NumArgs)} */
    public static long nLLVMCreateOperandBundle(long Tag, long TagLen, long Args, int NumArgs) {
        long __functionAddress = Functions.CreateOperandBundle;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPP(Tag, TagLen, Args, NumArgs, __functionAddress);
    }

    /** {@code LLVMOperandBundleRef LLVMCreateOperandBundle(char const * Tag, size_t TagLen, LLVMValueRef * Args, unsigned NumArgs)} */
    @NativeType("LLVMOperandBundleRef")
    public static long LLVMCreateOperandBundle(@NativeType("char const *") ByteBuffer Tag, @NativeType("LLVMValueRef *") PointerBuffer Args) {
        return nLLVMCreateOperandBundle(memAddress(Tag), Tag.remaining(), memAddress(Args), Args.remaining());
    }

    /** {@code LLVMOperandBundleRef LLVMCreateOperandBundle(char const * Tag, size_t TagLen, LLVMValueRef * Args, unsigned NumArgs)} */
    @NativeType("LLVMOperandBundleRef")
    public static long LLVMCreateOperandBundle(@NativeType("char const *") CharSequence Tag, @NativeType("LLVMValueRef *") PointerBuffer Args) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int TagEncodedLength = stack.nUTF8(Tag, false);
            long TagEncoded = stack.getPointerAddress();
            return nLLVMCreateOperandBundle(TagEncoded, TagEncodedLength, memAddress(Args), Args.remaining());
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDisposeOperandBundle ] ---

    /** {@code void LLVMDisposeOperandBundle(LLVMOperandBundleRef Bundle)} */
    public static void LLVMDisposeOperandBundle(@NativeType("LLVMOperandBundleRef") long Bundle) {
        long __functionAddress = Functions.DisposeOperandBundle;
        if (CHECKS) {
            check(__functionAddress);
            check(Bundle);
        }
        invokePV(Bundle, __functionAddress);
    }

    // --- [ LLVMGetOperandBundleTag ] ---

    /** {@code char const * LLVMGetOperandBundleTag(LLVMOperandBundleRef Bundle, size_t * Len)} */
    public static long nLLVMGetOperandBundleTag(long Bundle, long Len) {
        long __functionAddress = Functions.GetOperandBundleTag;
        if (CHECKS) {
            check(__functionAddress);
            check(Bundle);
        }
        return invokePPP(Bundle, Len, __functionAddress);
    }

    /** {@code char const * LLVMGetOperandBundleTag(LLVMOperandBundleRef Bundle, size_t * Len)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetOperandBundleTag(@NativeType("LLVMOperandBundleRef") long Bundle) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer Len = stack.callocPointer(1);
            long __result = nLLVMGetOperandBundleTag(Bundle, memAddress(Len));
            return memUTF8Safe(__result, (int)Len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNumOperandBundleArgs ] ---

    /** {@code unsigned LLVMGetNumOperandBundleArgs(LLVMOperandBundleRef Bundle)} */
    @NativeType("unsigned")
    public static int LLVMGetNumOperandBundleArgs(@NativeType("LLVMOperandBundleRef") long Bundle) {
        long __functionAddress = Functions.GetNumOperandBundleArgs;
        if (CHECKS) {
            check(__functionAddress);
            check(Bundle);
        }
        return invokePI(Bundle, __functionAddress);
    }

    // --- [ LLVMGetOperandBundleArgAtIndex ] ---

    /** {@code LLVMValueRef LLVMGetOperandBundleArgAtIndex(LLVMOperandBundleRef Bundle, unsigned Index)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetOperandBundleArgAtIndex(@NativeType("LLVMOperandBundleRef") long Bundle, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.GetOperandBundleArgAtIndex;
        if (CHECKS) {
            check(__functionAddress);
            check(Bundle);
        }
        return invokePP(Bundle, Index, __functionAddress);
    }

    // --- [ LLVMMetadataAsValue ] ---

    /** {@code LLVMValueRef LLVMMetadataAsValue(LLVMContextRef C, LLVMMetadataRef MD)} */
    @NativeType("LLVMValueRef")
    public static long LLVMMetadataAsValue(@NativeType("LLVMContextRef") long C, @NativeType("LLVMMetadataRef") long MD) {
        long __functionAddress = Functions.MetadataAsValue;
        if (CHECKS) {
            check(C);
            check(MD);
        }
        return invokePPP(C, MD, __functionAddress);
    }

    // --- [ LLVMValueAsMetadata ] ---

    /** {@code LLVMMetadataRef LLVMValueAsMetadata(LLVMValueRef Val)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMValueAsMetadata(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueAsMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetMDString ] ---

    /** {@code char const * LLVMGetMDString(LLVMValueRef V, unsigned int * Length)} */
    public static long nLLVMGetMDString(long V, long Length) {
        long __functionAddress = Functions.GetMDString;
        if (CHECKS) {
            check(V);
        }
        return invokePPP(V, Length, __functionAddress);
    }

    /** {@code char const * LLVMGetMDString(LLVMValueRef V, unsigned int * Length)} */
    @NativeType("char const *")
    public static @Nullable String LLVMGetMDString(@NativeType("LLVMValueRef") long V) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer Length = stack.callocInt(1);
            long __result = nLLVMGetMDString(V, memAddress(Length));
            return memUTF8Safe(__result, Length.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetMDNodeNumOperands ] ---

    /** {@code unsigned int LLVMGetMDNodeNumOperands(LLVMValueRef V)} */
    @NativeType("unsigned int")
    public static int LLVMGetMDNodeNumOperands(@NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.GetMDNodeNumOperands;
        if (CHECKS) {
            check(V);
        }
        return invokePI(V, __functionAddress);
    }

    // --- [ LLVMGetMDNodeOperands ] ---

    /** {@code void LLVMGetMDNodeOperands(LLVMValueRef V, LLVMValueRef * Dest)} */
    public static void nLLVMGetMDNodeOperands(long V, long Dest) {
        long __functionAddress = Functions.GetMDNodeOperands;
        if (CHECKS) {
            check(V);
        }
        invokePPV(V, Dest, __functionAddress);
    }

    /** {@code void LLVMGetMDNodeOperands(LLVMValueRef V, LLVMValueRef * Dest)} */
    public static void LLVMGetMDNodeOperands(@NativeType("LLVMValueRef") long V, @NativeType("LLVMValueRef *") PointerBuffer Dest) {
        if (CHECKS) {
            if (DEBUG) {
                check(Dest, LLVMGetMDNodeNumOperands(V));
            }
        }
        nLLVMGetMDNodeOperands(V, memAddress(Dest));
    }

    // --- [ LLVMReplaceMDNodeOperandWith ] ---

    /** {@code void LLVMReplaceMDNodeOperandWith(LLVMValueRef V, unsigned int Index, LLVMMetadataRef Replacement)} */
    public static void LLVMReplaceMDNodeOperandWith(@NativeType("LLVMValueRef") long V, @NativeType("unsigned int") int Index, @NativeType("LLVMMetadataRef") long Replacement) {
        long __functionAddress = Functions.ReplaceMDNodeOperandWith;
        if (CHECKS) {
            check(V);
        }
        invokePPV(V, Index, Replacement, __functionAddress);
    }

    // --- [ LLVMBasicBlockAsValue ] ---

    /** {@code LLVMValueRef LLVMBasicBlockAsValue(LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBasicBlockAsValue(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BasicBlockAsValue;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMValueIsBasicBlock ] ---

    /** {@code LLVMBool LLVMValueIsBasicBlock(LLVMValueRef Val)} */
    @NativeType("LLVMBool")
    public static boolean LLVMValueIsBasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueIsBasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMValueAsBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMValueAsBasicBlock(LLVMValueRef Val)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMValueAsBasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueAsBasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetBasicBlockName ] ---

    /** {@code char const * LLVMGetBasicBlockName(LLVMBasicBlockRef BB)} */
    public static long nLLVMGetBasicBlockName(long BB) {
        long __functionAddress = Functions.GetBasicBlockName;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    /** {@code char const * LLVMGetBasicBlockName(LLVMBasicBlockRef BB)} */
    @NativeType("char const *")
    public static String LLVMGetBasicBlockName(@NativeType("LLVMBasicBlockRef") long BB) {
        long __result = nLLVMGetBasicBlockName(BB);
        return memUTF8(__result);
    }

    // --- [ LLVMGetBasicBlockParent ] ---

    /** {@code LLVMValueRef LLVMGetBasicBlockParent(LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetBasicBlockParent(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetBasicBlockParent;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMGetBasicBlockTerminator ] ---

    /** {@code LLVMValueRef LLVMGetBasicBlockTerminator(LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetBasicBlockTerminator(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetBasicBlockTerminator;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMCountBasicBlocks ] ---

    /** {@code unsigned int LLVMCountBasicBlocks(LLVMValueRef Fn)} */
    @NativeType("unsigned int")
    public static int LLVMCountBasicBlocks(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.CountBasicBlocks;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, __functionAddress);
    }

    // --- [ LLVMGetBasicBlocks ] ---

    /** {@code void LLVMGetBasicBlocks(LLVMValueRef Fn, LLVMBasicBlockRef * BasicBlocks)} */
    public static void nLLVMGetBasicBlocks(long Fn, long BasicBlocks) {
        long __functionAddress = Functions.GetBasicBlocks;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(Fn, BasicBlocks, __functionAddress);
    }

    /** {@code void LLVMGetBasicBlocks(LLVMValueRef Fn, LLVMBasicBlockRef * BasicBlocks)} */
    public static void LLVMGetBasicBlocks(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMBasicBlockRef *") PointerBuffer BasicBlocks) {
        if (CHECKS) {
            if (DEBUG) {
                check(BasicBlocks, LLVMCountBasicBlocks(Fn));
            }
        }
        nLLVMGetBasicBlocks(Fn, memAddress(BasicBlocks));
    }

    // --- [ LLVMGetFirstBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetFirstBasicBlock(LLVMValueRef Fn)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetFirstBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetFirstBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetLastBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetLastBasicBlock(LLVMValueRef Fn)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetLastBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetLastBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetNextBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetNextBasicBlock(LLVMBasicBlockRef BB)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetNextBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetNextBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMGetPreviousBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetPreviousBasicBlock(LLVMBasicBlockRef BB)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetPreviousBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetPreviousBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMGetEntryBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetEntryBasicBlock(LLVMValueRef Fn)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetEntryBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetEntryBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMInsertExistingBasicBlockAfterInsertBlock ] ---

    /** {@code void LLVMInsertExistingBasicBlockAfterInsertBlock(LLVMBuilderRef Builder, LLVMBasicBlockRef BB)} */
    public static void LLVMInsertExistingBasicBlockAfterInsertBlock(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.InsertExistingBasicBlockAfterInsertBlock;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(BB);
        }
        invokePPV(Builder, BB, __functionAddress);
    }

    // --- [ LLVMAppendExistingBasicBlock ] ---

    /** {@code void LLVMAppendExistingBasicBlock(LLVMValueRef Fn, LLVMBasicBlockRef BB)} */
    public static void LLVMAppendExistingBasicBlock(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.AppendExistingBasicBlock;
        if (CHECKS) {
            check(__functionAddress);
            check(Fn);
            check(BB);
        }
        invokePPV(Fn, BB, __functionAddress);
    }

    // --- [ LLVMCreateBasicBlockInContext ] ---

    /** {@code LLVMBasicBlockRef LLVMCreateBasicBlockInContext(LLVMContextRef C, char const * Name)} */
    public static long nLLVMCreateBasicBlockInContext(long C, long Name) {
        long __functionAddress = Functions.CreateBasicBlockInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPP(C, Name, __functionAddress);
    }

    /** {@code LLVMBasicBlockRef LLVMCreateBasicBlockInContext(LLVMContextRef C, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMCreateBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMCreateBasicBlockInContext(C, memAddress(Name));
    }

    /** {@code LLVMBasicBlockRef LLVMCreateBasicBlockInContext(LLVMContextRef C, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMCreateBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMCreateBasicBlockInContext(C, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAppendBasicBlockInContext ] ---

    /** {@code LLVMBasicBlockRef LLVMAppendBasicBlockInContext(LLVMContextRef C, LLVMValueRef Fn, char const * Name)} */
    public static long nLLVMAppendBasicBlockInContext(long C, long Fn, long Name) {
        long __functionAddress = Functions.AppendBasicBlockInContext;
        if (CHECKS) {
            check(C);
            check(Fn);
        }
        return invokePPPP(C, Fn, Name, __functionAddress);
    }

    /** {@code LLVMBasicBlockRef LLVMAppendBasicBlockInContext(LLVMContextRef C, LLVMValueRef Fn, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMAppendBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAppendBasicBlockInContext(C, Fn, memAddress(Name));
    }

    /** {@code LLVMBasicBlockRef LLVMAppendBasicBlockInContext(LLVMContextRef C, LLVMValueRef Fn, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMAppendBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMValueRef") long Fn, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAppendBasicBlockInContext(C, Fn, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAppendBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMAppendBasicBlock(LLVMValueRef Fn, char const * Name)} */
    public static long nLLVMAppendBasicBlock(long Fn, long Name) {
        long __functionAddress = Functions.AppendBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePPP(Fn, Name, __functionAddress);
    }

    /** {@code LLVMBasicBlockRef LLVMAppendBasicBlock(LLVMValueRef Fn, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMAppendBasicBlock(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAppendBasicBlock(Fn, memAddress(Name));
    }

    /** {@code LLVMBasicBlockRef LLVMAppendBasicBlock(LLVMValueRef Fn, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMAppendBasicBlock(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMAppendBasicBlock(Fn, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMInsertBasicBlockInContext ] ---

    /** {@code LLVMBasicBlockRef LLVMInsertBasicBlockInContext(LLVMContextRef C, LLVMBasicBlockRef BB, char const * Name)} */
    public static long nLLVMInsertBasicBlockInContext(long C, long BB, long Name) {
        long __functionAddress = Functions.InsertBasicBlockInContext;
        if (CHECKS) {
            check(C);
            check(BB);
        }
        return invokePPPP(C, BB, Name, __functionAddress);
    }

    /** {@code LLVMBasicBlockRef LLVMInsertBasicBlockInContext(LLVMContextRef C, LLVMBasicBlockRef BB, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMInsertBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMBasicBlockRef") long BB, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMInsertBasicBlockInContext(C, BB, memAddress(Name));
    }

    /** {@code LLVMBasicBlockRef LLVMInsertBasicBlockInContext(LLVMContextRef C, LLVMBasicBlockRef BB, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMInsertBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMBasicBlockRef") long BB, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMInsertBasicBlockInContext(C, BB, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMInsertBasicBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMInsertBasicBlock(LLVMBasicBlockRef InsertBeforeBB, char const * Name)} */
    public static long nLLVMInsertBasicBlock(long InsertBeforeBB, long Name) {
        long __functionAddress = Functions.InsertBasicBlock;
        if (CHECKS) {
            check(InsertBeforeBB);
        }
        return invokePPP(InsertBeforeBB, Name, __functionAddress);
    }

    /** {@code LLVMBasicBlockRef LLVMInsertBasicBlock(LLVMBasicBlockRef InsertBeforeBB, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMInsertBasicBlock(@NativeType("LLVMBasicBlockRef") long InsertBeforeBB, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMInsertBasicBlock(InsertBeforeBB, memAddress(Name));
    }

    /** {@code LLVMBasicBlockRef LLVMInsertBasicBlock(LLVMBasicBlockRef InsertBeforeBB, char const * Name)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMInsertBasicBlock(@NativeType("LLVMBasicBlockRef") long InsertBeforeBB, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMInsertBasicBlock(InsertBeforeBB, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDeleteBasicBlock ] ---

    /** {@code void LLVMDeleteBasicBlock(LLVMBasicBlockRef BB)} */
    public static void LLVMDeleteBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.DeleteBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        invokePV(BB, __functionAddress);
    }

    // --- [ LLVMRemoveBasicBlockFromParent ] ---

    /** {@code void LLVMRemoveBasicBlockFromParent(LLVMBasicBlockRef BB)} */
    public static void LLVMRemoveBasicBlockFromParent(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.RemoveBasicBlockFromParent;
        if (CHECKS) {
            check(BB);
        }
        invokePV(BB, __functionAddress);
    }

    // --- [ LLVMMoveBasicBlockBefore ] ---

    /** {@code void LLVMMoveBasicBlockBefore(LLVMBasicBlockRef BB, LLVMBasicBlockRef MovePos)} */
    public static void LLVMMoveBasicBlockBefore(@NativeType("LLVMBasicBlockRef") long BB, @NativeType("LLVMBasicBlockRef") long MovePos) {
        long __functionAddress = Functions.MoveBasicBlockBefore;
        if (CHECKS) {
            check(BB);
            check(MovePos);
        }
        invokePPV(BB, MovePos, __functionAddress);
    }

    // --- [ LLVMMoveBasicBlockAfter ] ---

    /** {@code void LLVMMoveBasicBlockAfter(LLVMBasicBlockRef BB, LLVMBasicBlockRef MovePos)} */
    public static void LLVMMoveBasicBlockAfter(@NativeType("LLVMBasicBlockRef") long BB, @NativeType("LLVMBasicBlockRef") long MovePos) {
        long __functionAddress = Functions.MoveBasicBlockAfter;
        if (CHECKS) {
            check(BB);
            check(MovePos);
        }
        invokePPV(BB, MovePos, __functionAddress);
    }

    // --- [ LLVMGetFirstInstruction ] ---

    /** {@code LLVMValueRef LLVMGetFirstInstruction(LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstInstruction(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetFirstInstruction;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMGetLastInstruction ] ---

    /** {@code LLVMValueRef LLVMGetLastInstruction(LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastInstruction(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetLastInstruction;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMHasMetadata ] ---

    /** {@code int LLVMHasMetadata(LLVMValueRef Val)} */
    @NativeType("int")
    public static boolean LLVMHasMetadata(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.HasMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMGetMetadata ] ---

    /** {@code LLVMValueRef LLVMGetMetadata(LLVMValueRef Val, unsigned int KindID)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetMetadata(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.GetMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, KindID, __functionAddress);
    }

    // --- [ LLVMSetMetadata ] ---

    /** {@code void LLVMSetMetadata(LLVMValueRef Val, unsigned int KindID, LLVMValueRef Node)} */
    public static void LLVMSetMetadata(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int KindID, @NativeType("LLVMValueRef") long Node) {
        long __functionAddress = Functions.SetMetadata;
        if (CHECKS) {
            check(Val);
            check(Node);
        }
        invokePPV(Val, KindID, Node, __functionAddress);
    }

    // --- [ LLVMInstructionGetAllMetadataOtherThanDebugLoc ] ---

    /** {@code LLVMValueMetadataEntry * LLVMInstructionGetAllMetadataOtherThanDebugLoc(LLVMValueRef Instr, size_t * NumEntries)} */
    public static long nLLVMInstructionGetAllMetadataOtherThanDebugLoc(long Instr, long NumEntries) {
        long __functionAddress = Functions.InstructionGetAllMetadataOtherThanDebugLoc;
        if (CHECKS) {
            check(__functionAddress);
            check(Instr);
        }
        return invokePPP(Instr, NumEntries, __functionAddress);
    }

    /** {@code LLVMValueMetadataEntry * LLVMInstructionGetAllMetadataOtherThanDebugLoc(LLVMValueRef Instr, size_t * NumEntries)} */
    @NativeType("LLVMValueMetadataEntry *")
    public static long LLVMInstructionGetAllMetadataOtherThanDebugLoc(@NativeType("LLVMValueRef") long Instr, @NativeType("size_t *") PointerBuffer NumEntries) {
        if (CHECKS) {
            check(NumEntries, 1);
        }
        return nLLVMInstructionGetAllMetadataOtherThanDebugLoc(Instr, memAddress(NumEntries));
    }

    // --- [ LLVMGetInstructionParent ] ---

    /** {@code LLVMBasicBlockRef LLVMGetInstructionParent(LLVMValueRef Inst)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetInstructionParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetInstructionParent;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMGetNextInstruction ] ---

    /** {@code LLVMValueRef LLVMGetNextInstruction(LLVMValueRef Inst)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextInstruction(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetNextInstruction;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMGetPreviousInstruction ] ---

    /** {@code LLVMValueRef LLVMGetPreviousInstruction(LLVMValueRef Inst)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousInstruction(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetPreviousInstruction;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMInstructionRemoveFromParent ] ---

    /** {@code void LLVMInstructionRemoveFromParent(LLVMValueRef Inst)} */
    public static void LLVMInstructionRemoveFromParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.InstructionRemoveFromParent;
        if (CHECKS) {
            check(Inst);
        }
        invokePV(Inst, __functionAddress);
    }

    // --- [ LLVMInstructionEraseFromParent ] ---

    /** {@code void LLVMInstructionEraseFromParent(LLVMValueRef Inst)} */
    public static void LLVMInstructionEraseFromParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.InstructionEraseFromParent;
        if (CHECKS) {
            check(Inst);
        }
        invokePV(Inst, __functionAddress);
    }

    // --- [ LLVMDeleteInstruction ] ---

    /** {@code void LLVMDeleteInstruction(LLVMValueRef Inst)} */
    public static void LLVMDeleteInstruction(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.DeleteInstruction;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        invokePV(Inst, __functionAddress);
    }

    // --- [ LLVMGetInstructionOpcode ] ---

    /** {@code LLVMOpcode LLVMGetInstructionOpcode(LLVMValueRef Inst)} */
    @NativeType("LLVMOpcode")
    public static int LLVMGetInstructionOpcode(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetInstructionOpcode;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(Inst, __functionAddress);
    }

    // --- [ LLVMGetICmpPredicate ] ---

    /** {@code LLVMIntPredicate LLVMGetICmpPredicate(LLVMValueRef Inst)} */
    @NativeType("LLVMIntPredicate")
    public static int LLVMGetICmpPredicate(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetICmpPredicate;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(Inst, __functionAddress);
    }

    // --- [ LLVMGetFCmpPredicate ] ---

    /** {@code LLVMRealPredicate LLVMGetFCmpPredicate(LLVMValueRef Inst)} */
    @NativeType("LLVMRealPredicate")
    public static int LLVMGetFCmpPredicate(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetFCmpPredicate;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(Inst, __functionAddress);
    }

    // --- [ LLVMInstructionClone ] ---

    /** {@code LLVMValueRef LLVMInstructionClone(LLVMValueRef Inst)} */
    @NativeType("LLVMValueRef")
    public static long LLVMInstructionClone(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.InstructionClone;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMIsATerminatorInst ] ---

    /** {@code LLVMValueRef LLVMIsATerminatorInst(LLVMValueRef Inst)} */
    @NativeType("LLVMValueRef")
    public static long LLVMIsATerminatorInst(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.IsATerminatorInst;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMGetFirstDbgRecord ] ---

    /** {@code LLVMDbgRecordRef LLVMGetFirstDbgRecord(LLVMValueRef Inst)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMGetFirstDbgRecord(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetFirstDbgRecord;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMGetLastDbgRecord ] ---

    /** {@code LLVMDbgRecordRef LLVMGetLastDbgRecord(LLVMValueRef Inst)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMGetLastDbgRecord(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetLastDbgRecord;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMGetNextDbgRecord ] ---

    /** {@code LLVMDbgRecordRef LLVMGetNextDbgRecord(LLVMDbgRecordRef DbgRecord)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMGetNextDbgRecord(@NativeType("LLVMDbgRecordRef") long DbgRecord) {
        long __functionAddress = Functions.GetNextDbgRecord;
        if (CHECKS) {
            check(__functionAddress);
            check(DbgRecord);
        }
        return invokePP(DbgRecord, __functionAddress);
    }

    // --- [ LLVMGetPreviousDbgRecord ] ---

    /** {@code LLVMDbgRecordRef LLVMGetPreviousDbgRecord(LLVMDbgRecordRef DbgRecord)} */
    @NativeType("LLVMDbgRecordRef")
    public static long LLVMGetPreviousDbgRecord(@NativeType("LLVMDbgRecordRef") long DbgRecord) {
        long __functionAddress = Functions.GetPreviousDbgRecord;
        if (CHECKS) {
            check(__functionAddress);
            check(DbgRecord);
        }
        return invokePP(DbgRecord, __functionAddress);
    }

    // --- [ LLVMGetNumArgOperands ] ---

    /** {@code unsigned int LLVMGetNumArgOperands(LLVMValueRef Instr)} */
    @NativeType("unsigned int")
    public static int LLVMGetNumArgOperands(@NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.GetNumArgOperands;
        if (CHECKS) {
            check(Instr);
        }
        return invokePI(Instr, __functionAddress);
    }

    // --- [ LLVMSetInstructionCallConv ] ---

    /** {@code void LLVMSetInstructionCallConv(LLVMValueRef Instr, unsigned int CC)} */
    public static void LLVMSetInstructionCallConv(@NativeType("LLVMValueRef") long Instr, @NativeType("unsigned int") int CC) {
        long __functionAddress = Functions.SetInstructionCallConv;
        if (CHECKS) {
            check(Instr);
        }
        invokePV(Instr, CC, __functionAddress);
    }

    // --- [ LLVMGetInstructionCallConv ] ---

    /** {@code unsigned int LLVMGetInstructionCallConv(LLVMValueRef Instr)} */
    @NativeType("unsigned int")
    public static int LLVMGetInstructionCallConv(@NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.GetInstructionCallConv;
        if (CHECKS) {
            check(Instr);
        }
        return invokePI(Instr, __functionAddress);
    }

    // --- [ LLVMSetInstrParamAlignment ] ---

    /** {@code void LLVMSetInstrParamAlignment(LLVMValueRef Instr, LLVMAttributeIndex index, unsigned int Align)} */
    public static void LLVMSetInstrParamAlignment(@NativeType("LLVMValueRef") long Instr, @NativeType("LLVMAttributeIndex") int index, @NativeType("unsigned int") int Align) {
        long __functionAddress = Functions.SetInstrParamAlignment;
        if (CHECKS) {
            check(Instr);
        }
        invokePV(Instr, index, Align, __functionAddress);
    }

    // --- [ LLVMAddCallSiteAttribute ] ---

    /** {@code void LLVMAddCallSiteAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, LLVMAttributeRef A)} */
    public static void LLVMAddCallSiteAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.AddCallSiteAttribute;
        if (CHECKS) {
            check(C);
            check(A);
        }
        invokePPV(C, Idx, A, __functionAddress);
    }

    // --- [ LLVMGetCallSiteAttributeCount ] ---

    /** {@code unsigned int LLVMGetCallSiteAttributeCount(LLVMValueRef C, LLVMAttributeIndex Idx)} */
    @NativeType("unsigned int")
    public static int LLVMGetCallSiteAttributeCount(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx) {
        long __functionAddress = Functions.GetCallSiteAttributeCount;
        if (CHECKS) {
            check(C);
        }
        return invokePI(C, Idx, __functionAddress);
    }

    // --- [ LLVMGetCallSiteAttributes ] ---

    /** {@code void LLVMGetCallSiteAttributes(LLVMValueRef C, LLVMAttributeIndex Idx, LLVMAttributeRef * Attrs)} */
    public static void nLLVMGetCallSiteAttributes(long C, int Idx, long Attrs) {
        long __functionAddress = Functions.GetCallSiteAttributes;
        if (CHECKS) {
            check(C);
        }
        invokePPV(C, Idx, Attrs, __functionAddress);
    }

    /** {@code void LLVMGetCallSiteAttributes(LLVMValueRef C, LLVMAttributeIndex Idx, LLVMAttributeRef * Attrs)} */
    public static void LLVMGetCallSiteAttributes(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef *") PointerBuffer Attrs) {
        if (CHECKS) {
            if (DEBUG) {
                check(Attrs, LLVMGetCallSiteAttributeCount(C, Idx));
            }
        }
        nLLVMGetCallSiteAttributes(C, Idx, memAddress(Attrs));
    }

    // --- [ LLVMGetCallSiteEnumAttribute ] ---

    /** {@code LLVMAttributeRef LLVMGetCallSiteEnumAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, unsigned int KindID)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMGetCallSiteEnumAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.GetCallSiteEnumAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMGetCallSiteStringAttribute ] ---

    /** {@code LLVMAttributeRef LLVMGetCallSiteStringAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static long nLLVMGetCallSiteStringAttribute(long C, int Idx, long K, int KLen) {
        long __functionAddress = Functions.GetCallSiteStringAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, Idx, K, KLen, __functionAddress);
    }

    /** {@code LLVMAttributeRef LLVMGetCallSiteStringAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMGetCallSiteStringAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        return nLLVMGetCallSiteStringAttribute(C, Idx, memAddress(K), K.remaining());
    }

    /** {@code LLVMAttributeRef LLVMGetCallSiteStringAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    @NativeType("LLVMAttributeRef")
    public static long LLVMGetCallSiteStringAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") CharSequence K) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int KEncodedLength = stack.nUTF8(K, false);
            long KEncoded = stack.getPointerAddress();
            return nLLVMGetCallSiteStringAttribute(C, Idx, KEncoded, KEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMRemoveCallSiteEnumAttribute ] ---

    /** {@code void LLVMRemoveCallSiteEnumAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, unsigned int KindID)} */
    public static void LLVMRemoveCallSiteEnumAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.RemoveCallSiteEnumAttribute;
        if (CHECKS) {
            check(C);
        }
        invokePV(C, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMRemoveCallSiteStringAttribute ] ---

    /** {@code void LLVMRemoveCallSiteStringAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static void nLLVMRemoveCallSiteStringAttribute(long C, int Idx, long K, int KLen) {
        long __functionAddress = Functions.RemoveCallSiteStringAttribute;
        if (CHECKS) {
            check(C);
        }
        invokePPV(C, Idx, K, KLen, __functionAddress);
    }

    /** {@code void LLVMRemoveCallSiteStringAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static void LLVMRemoveCallSiteStringAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        nLLVMRemoveCallSiteStringAttribute(C, Idx, memAddress(K), K.remaining());
    }

    /** {@code void LLVMRemoveCallSiteStringAttribute(LLVMValueRef C, LLVMAttributeIndex Idx, char const * K, unsigned int KLen)} */
    public static void LLVMRemoveCallSiteStringAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") CharSequence K) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int KEncodedLength = stack.nUTF8(K, false);
            long KEncoded = stack.getPointerAddress();
            nLLVMRemoveCallSiteStringAttribute(C, Idx, KEncoded, KEncodedLength);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetCalledFunctionType ] ---

    /** {@code LLVMTypeRef LLVMGetCalledFunctionType(LLVMValueRef C)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetCalledFunctionType(@NativeType("LLVMValueRef") long C) {
        long __functionAddress = Functions.GetCalledFunctionType;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMGetCalledValue ] ---

    /** {@code LLVMValueRef LLVMGetCalledValue(LLVMValueRef Instr)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetCalledValue(@NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.GetCalledValue;
        if (CHECKS) {
            check(Instr);
        }
        return invokePP(Instr, __functionAddress);
    }

    // --- [ LLVMGetNumOperandBundles ] ---

    /** {@code unsigned LLVMGetNumOperandBundles(LLVMValueRef C)} */
    @NativeType("unsigned")
    public static int LLVMGetNumOperandBundles(@NativeType("LLVMValueRef") long C) {
        long __functionAddress = Functions.GetNumOperandBundles;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePI(C, __functionAddress);
    }

    // --- [ LLVMGetOperandBundleAtIndex ] ---

    /** {@code LLVMOperandBundleRef LLVMGetOperandBundleAtIndex(LLVMValueRef C, unsigned Index)} */
    @NativeType("LLVMOperandBundleRef")
    public static long LLVMGetOperandBundleAtIndex(@NativeType("LLVMValueRef") long C, @NativeType("unsigned") int Index) {
        long __functionAddress = Functions.GetOperandBundleAtIndex;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePP(C, Index, __functionAddress);
    }

    // --- [ LLVMIsTailCall ] ---

    /** {@code LLVMBool LLVMIsTailCall(LLVMValueRef CallInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsTailCall(@NativeType("LLVMValueRef") long CallInst) {
        long __functionAddress = Functions.IsTailCall;
        if (CHECKS) {
            check(CallInst);
        }
        return invokePI(CallInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetTailCall ] ---

    /** {@code void LLVMSetTailCall(LLVMValueRef CallInst, LLVMBool IsTailCall)} */
    public static void LLVMSetTailCall(@NativeType("LLVMValueRef") long CallInst, @NativeType("LLVMBool") boolean IsTailCall) {
        long __functionAddress = Functions.SetTailCall;
        if (CHECKS) {
            check(CallInst);
        }
        invokePV(CallInst, IsTailCall ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetTailCallKind ] ---

    /** {@code LLVMTailCallKind LLVMGetTailCallKind(LLVMValueRef CallInst)} */
    @NativeType("LLVMTailCallKind")
    public static int LLVMGetTailCallKind(@NativeType("LLVMValueRef") long CallInst) {
        long __functionAddress = Functions.GetTailCallKind;
        if (CHECKS) {
            check(__functionAddress);
            check(CallInst);
        }
        return invokePI(CallInst, __functionAddress);
    }

    // --- [ LLVMSetTailCallKind ] ---

    /** {@code void LLVMSetTailCallKind(LLVMValueRef CallInst, LLVMTailCallKind kind)} */
    public static void LLVMSetTailCallKind(@NativeType("LLVMValueRef") long CallInst, @NativeType("LLVMTailCallKind") int kind) {
        long __functionAddress = Functions.SetTailCallKind;
        if (CHECKS) {
            check(__functionAddress);
            check(CallInst);
        }
        invokePV(CallInst, kind, __functionAddress);
    }

    // --- [ LLVMGetNormalDest ] ---

    /** {@code LLVMBasicBlockRef LLVMGetNormalDest(LLVMValueRef InvokeInst)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetNormalDest(@NativeType("LLVMValueRef") long InvokeInst) {
        long __functionAddress = Functions.GetNormalDest;
        if (CHECKS) {
            check(InvokeInst);
        }
        return invokePP(InvokeInst, __functionAddress);
    }

    // --- [ LLVMGetUnwindDest ] ---

    /** {@code LLVMBasicBlockRef LLVMGetUnwindDest(LLVMValueRef InvokeInst)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetUnwindDest(@NativeType("LLVMValueRef") long InvokeInst) {
        long __functionAddress = Functions.GetUnwindDest;
        if (CHECKS) {
            check(InvokeInst);
        }
        return invokePP(InvokeInst, __functionAddress);
    }

    // --- [ LLVMSetNormalDest ] ---

    /** {@code void LLVMSetNormalDest(LLVMValueRef InvokeInst, LLVMBasicBlockRef B)} */
    public static void LLVMSetNormalDest(@NativeType("LLVMValueRef") long InvokeInst, @NativeType("LLVMBasicBlockRef") long B) {
        long __functionAddress = Functions.SetNormalDest;
        if (CHECKS) {
            check(InvokeInst);
            check(B);
        }
        invokePPV(InvokeInst, B, __functionAddress);
    }

    // --- [ LLVMSetUnwindDest ] ---

    /** {@code void LLVMSetUnwindDest(LLVMValueRef InvokeInst, LLVMBasicBlockRef B)} */
    public static void LLVMSetUnwindDest(@NativeType("LLVMValueRef") long InvokeInst, @NativeType("LLVMBasicBlockRef") long B) {
        long __functionAddress = Functions.SetUnwindDest;
        if (CHECKS) {
            check(InvokeInst);
            check(B);
        }
        invokePPV(InvokeInst, B, __functionAddress);
    }

    // --- [ LLVMGetCallBrDefaultDest ] ---

    /** {@code LLVMBasicBlockRef LLVMGetCallBrDefaultDest(LLVMValueRef CallBr)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetCallBrDefaultDest(@NativeType("LLVMValueRef") long CallBr) {
        long __functionAddress = Functions.GetCallBrDefaultDest;
        if (CHECKS) {
            check(__functionAddress);
            check(CallBr);
        }
        return invokePP(CallBr, __functionAddress);
    }

    // --- [ LLVMGetCallBrNumIndirectDests ] ---

    /** {@code unsigned LLVMGetCallBrNumIndirectDests(LLVMValueRef CallBr)} */
    @NativeType("unsigned")
    public static int LLVMGetCallBrNumIndirectDests(@NativeType("LLVMValueRef") long CallBr) {
        long __functionAddress = Functions.GetCallBrNumIndirectDests;
        if (CHECKS) {
            check(__functionAddress);
            check(CallBr);
        }
        return invokePI(CallBr, __functionAddress);
    }

    // --- [ LLVMGetCallBrIndirectDest ] ---

    /** {@code LLVMBasicBlockRef LLVMGetCallBrIndirectDest(LLVMValueRef CallBr, unsigned Idx)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetCallBrIndirectDest(@NativeType("LLVMValueRef") long CallBr, @NativeType("unsigned") int Idx) {
        long __functionAddress = Functions.GetCallBrIndirectDest;
        if (CHECKS) {
            check(__functionAddress);
            check(CallBr);
        }
        return invokePP(CallBr, Idx, __functionAddress);
    }

    // --- [ LLVMGetNumSuccessors ] ---

    /** {@code unsigned int LLVMGetNumSuccessors(LLVMValueRef Term)} */
    @NativeType("unsigned int")
    public static int LLVMGetNumSuccessors(@NativeType("LLVMValueRef") long Term) {
        long __functionAddress = Functions.GetNumSuccessors;
        if (CHECKS) {
            check(Term);
        }
        return invokePI(Term, __functionAddress);
    }

    // --- [ LLVMGetSuccessor ] ---

    /** {@code LLVMBasicBlockRef LLVMGetSuccessor(LLVMValueRef Term, unsigned int i)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetSuccessor(@NativeType("LLVMValueRef") long Term, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.GetSuccessor;
        if (CHECKS) {
            check(Term);
        }
        return invokePP(Term, i, __functionAddress);
    }

    // --- [ LLVMSetSuccessor ] ---

    /** {@code void LLVMSetSuccessor(LLVMValueRef Term, unsigned int i, LLVMBasicBlockRef block)} */
    public static void LLVMSetSuccessor(@NativeType("LLVMValueRef") long Term, @NativeType("unsigned int") int i, @NativeType("LLVMBasicBlockRef") long block) {
        long __functionAddress = Functions.SetSuccessor;
        if (CHECKS) {
            check(Term);
            check(block);
        }
        invokePPV(Term, i, block, __functionAddress);
    }

    // --- [ LLVMIsConditional ] ---

    /** {@code LLVMBool LLVMIsConditional(LLVMValueRef Branch)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsConditional(@NativeType("LLVMValueRef") long Branch) {
        long __functionAddress = Functions.IsConditional;
        if (CHECKS) {
            check(Branch);
        }
        return invokePI(Branch, __functionAddress) != 0;
    }

    // --- [ LLVMGetCondition ] ---

    /** {@code LLVMValueRef LLVMGetCondition(LLVMValueRef Branch)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetCondition(@NativeType("LLVMValueRef") long Branch) {
        long __functionAddress = Functions.GetCondition;
        if (CHECKS) {
            check(Branch);
        }
        return invokePP(Branch, __functionAddress);
    }

    // --- [ LLVMSetCondition ] ---

    /** {@code void LLVMSetCondition(LLVMValueRef Branch, LLVMValueRef Cond)} */
    public static void LLVMSetCondition(@NativeType("LLVMValueRef") long Branch, @NativeType("LLVMValueRef") long Cond) {
        long __functionAddress = Functions.SetCondition;
        if (CHECKS) {
            check(Branch);
            check(Cond);
        }
        invokePPV(Branch, Cond, __functionAddress);
    }

    // --- [ LLVMGetSwitchDefaultDest ] ---

    /** {@code LLVMBasicBlockRef LLVMGetSwitchDefaultDest(LLVMValueRef SwitchInstr)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetSwitchDefaultDest(@NativeType("LLVMValueRef") long SwitchInstr) {
        long __functionAddress = Functions.GetSwitchDefaultDest;
        if (CHECKS) {
            check(SwitchInstr);
        }
        return invokePP(SwitchInstr, __functionAddress);
    }

    // --- [ LLVMGetAllocatedType ] ---

    /** {@code LLVMTypeRef LLVMGetAllocatedType(LLVMValueRef Alloca)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetAllocatedType(@NativeType("LLVMValueRef") long Alloca) {
        long __functionAddress = Functions.GetAllocatedType;
        if (CHECKS) {
            check(Alloca);
        }
        return invokePP(Alloca, __functionAddress);
    }

    // --- [ LLVMIsInBounds ] ---

    /** {@code LLVMBool LLVMIsInBounds(LLVMValueRef GEP)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsInBounds(@NativeType("LLVMValueRef") long GEP) {
        long __functionAddress = Functions.IsInBounds;
        if (CHECKS) {
            check(GEP);
        }
        return invokePI(GEP, __functionAddress) != 0;
    }

    // --- [ LLVMSetIsInBounds ] ---

    /** {@code void LLVMSetIsInBounds(LLVMValueRef GEP, LLVMBool InBounds)} */
    public static void LLVMSetIsInBounds(@NativeType("LLVMValueRef") long GEP, @NativeType("LLVMBool") boolean InBounds) {
        long __functionAddress = Functions.SetIsInBounds;
        if (CHECKS) {
            check(GEP);
        }
        invokePV(GEP, InBounds ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetGEPSourceElementType ] ---

    /** {@code LLVMTypeRef LLVMGetGEPSourceElementType(LLVMValueRef GEP)} */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetGEPSourceElementType(@NativeType("LLVMValueRef") long GEP) {
        long __functionAddress = Functions.GetGEPSourceElementType;
        if (CHECKS) {
            check(__functionAddress);
            check(GEP);
        }
        return invokePP(GEP, __functionAddress);
    }

    // --- [ LLVMGEPGetNoWrapFlags ] ---

    /** {@code LLVMGEPNoWrapFlags LLVMGEPGetNoWrapFlags(LLVMValueRef GEP)} */
    @NativeType("LLVMGEPNoWrapFlags")
    public static int LLVMGEPGetNoWrapFlags(@NativeType("LLVMValueRef") long GEP) {
        long __functionAddress = Functions.GEPGetNoWrapFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(GEP);
        }
        return invokePI(GEP, __functionAddress);
    }

    // --- [ LLVMGEPSetNoWrapFlags ] ---

    /** {@code void LLVMGEPSetNoWrapFlags(LLVMValueRef GEP, LLVMGEPNoWrapFlags NoWrapFlags)} */
    public static void LLVMGEPSetNoWrapFlags(@NativeType("LLVMValueRef") long GEP, @NativeType("LLVMGEPNoWrapFlags") int NoWrapFlags) {
        long __functionAddress = Functions.GEPSetNoWrapFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(GEP);
        }
        invokePV(GEP, NoWrapFlags, __functionAddress);
    }

    // --- [ LLVMAddIncoming ] ---

    /** {@code void LLVMAddIncoming(LLVMValueRef PhiNode, LLVMValueRef * IncomingValues, LLVMBasicBlockRef * IncomingBlocks, unsigned int Count)} */
    public static void nLLVMAddIncoming(long PhiNode, long IncomingValues, long IncomingBlocks, int Count) {
        long __functionAddress = Functions.AddIncoming;
        if (CHECKS) {
            check(PhiNode);
        }
        invokePPPV(PhiNode, IncomingValues, IncomingBlocks, Count, __functionAddress);
    }

    /** {@code void LLVMAddIncoming(LLVMValueRef PhiNode, LLVMValueRef * IncomingValues, LLVMBasicBlockRef * IncomingBlocks, unsigned int Count)} */
    public static void LLVMAddIncoming(@NativeType("LLVMValueRef") long PhiNode, @NativeType("LLVMValueRef *") PointerBuffer IncomingValues, @NativeType("LLVMBasicBlockRef *") PointerBuffer IncomingBlocks) {
        if (CHECKS) {
            check(IncomingBlocks, IncomingValues.remaining());
        }
        nLLVMAddIncoming(PhiNode, memAddress(IncomingValues), memAddress(IncomingBlocks), IncomingValues.remaining());
    }

    // --- [ LLVMCountIncoming ] ---

    /** {@code unsigned int LLVMCountIncoming(LLVMValueRef PhiNode)} */
    @NativeType("unsigned int")
    public static int LLVMCountIncoming(@NativeType("LLVMValueRef") long PhiNode) {
        long __functionAddress = Functions.CountIncoming;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePI(PhiNode, __functionAddress);
    }

    // --- [ LLVMGetIncomingValue ] ---

    /** {@code LLVMValueRef LLVMGetIncomingValue(LLVMValueRef PhiNode, unsigned int Index)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetIncomingValue(@NativeType("LLVMValueRef") long PhiNode, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetIncomingValue;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePP(PhiNode, Index, __functionAddress);
    }

    // --- [ LLVMGetIncomingBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetIncomingBlock(LLVMValueRef PhiNode, unsigned int Index)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetIncomingBlock(@NativeType("LLVMValueRef") long PhiNode, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetIncomingBlock;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePP(PhiNode, Index, __functionAddress);
    }

    // --- [ LLVMGetNumIndices ] ---

    /** {@code unsigned int LLVMGetNumIndices(LLVMValueRef Inst)} */
    @NativeType("unsigned int")
    public static int LLVMGetNumIndices(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetNumIndices;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(Inst, __functionAddress);
    }

    // --- [ LLVMGetIndices ] ---

    /** {@code unsigned int const * LLVMGetIndices(LLVMValueRef Inst, unsigned int Count)} */
    public static long nLLVMGetIndices(long Inst) {
        long __functionAddress = Functions.GetIndices;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
    }

    /** {@code unsigned int const * LLVMGetIndices(LLVMValueRef Inst, unsigned int Count)} */
    @NativeType("unsigned int const *")
    public static IntBuffer LLVMGetIndices(@NativeType("LLVMValueRef") long Inst, @NativeType("unsigned int") int Count) {
        long __result = nLLVMGetIndices(Inst);
        return memIntBuffer(__result, Count);
    }

    // --- [ LLVMCreateBuilderInContext ] ---

    /** {@code LLVMBuilderRef LLVMCreateBuilderInContext(LLVMContextRef C)} */
    @NativeType("LLVMBuilderRef")
    public static long LLVMCreateBuilderInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.CreateBuilderInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMCreateBuilder ] ---

    /** {@code LLVMBuilderRef LLVMCreateBuilder(void)} */
    @NativeType("LLVMBuilderRef")
    public static long LLVMCreateBuilder() {
        long __functionAddress = Functions.CreateBuilder;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMPositionBuilder ] ---

    /** {@code void LLVMPositionBuilder(LLVMBuilderRef Builder, LLVMBasicBlockRef Block, LLVMValueRef Instr)} */
    public static void LLVMPositionBuilder(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Block, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.PositionBuilder;
        if (CHECKS) {
            check(Builder);
            check(Block);
        }
        invokePPPV(Builder, Block, Instr, __functionAddress);
    }

    // --- [ LLVMPositionBuilderBeforeDbgRecords ] ---

    /** {@code void LLVMPositionBuilderBeforeDbgRecords(LLVMBuilderRef Builder, LLVMBasicBlockRef Block, LLVMValueRef Instr)} */
    public static void LLVMPositionBuilderBeforeDbgRecords(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Block, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.PositionBuilderBeforeDbgRecords;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Block);
        }
        invokePPPV(Builder, Block, Instr, __functionAddress);
    }

    // --- [ LLVMPositionBuilderBefore ] ---

    /** {@code void LLVMPositionBuilderBefore(LLVMBuilderRef Builder, LLVMValueRef Instr)} */
    public static void LLVMPositionBuilderBefore(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.PositionBuilderBefore;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPV(Builder, Instr, __functionAddress);
    }

    // --- [ LLVMPositionBuilderBeforeInstrAndDbgRecords ] ---

    /** {@code void LLVMPositionBuilderBeforeInstrAndDbgRecords(LLVMBuilderRef Builder, LLVMValueRef Instr)} */
    public static void LLVMPositionBuilderBeforeInstrAndDbgRecords(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.PositionBuilderBeforeInstrAndDbgRecords;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Instr);
        }
        invokePPV(Builder, Instr, __functionAddress);
    }

    // --- [ LLVMPositionBuilderAtEnd ] ---

    /** {@code void LLVMPositionBuilderAtEnd(LLVMBuilderRef Builder, LLVMBasicBlockRef Block)} */
    public static void LLVMPositionBuilderAtEnd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.PositionBuilderAtEnd;
        if (CHECKS) {
            check(Builder);
            check(Block);
        }
        invokePPV(Builder, Block, __functionAddress);
    }

    // --- [ LLVMGetInsertBlock ] ---

    /** {@code LLVMBasicBlockRef LLVMGetInsertBlock(LLVMBuilderRef Builder)} */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetInsertBlock(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetInsertBlock;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMClearInsertionPosition ] ---

    /** {@code void LLVMClearInsertionPosition(LLVMBuilderRef Builder)} */
    public static void LLVMClearInsertionPosition(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.ClearInsertionPosition;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMInsertIntoBuilder ] ---

    /** {@code void LLVMInsertIntoBuilder(LLVMBuilderRef Builder, LLVMValueRef Instr)} */
    public static void LLVMInsertIntoBuilder(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.InsertIntoBuilder;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPV(Builder, Instr, __functionAddress);
    }

    // --- [ LLVMInsertIntoBuilderWithName ] ---

    /** {@code void LLVMInsertIntoBuilderWithName(LLVMBuilderRef Builder, LLVMValueRef Instr, char const * Name)} */
    public static void nLLVMInsertIntoBuilderWithName(long Builder, long Instr, long Name) {
        long __functionAddress = Functions.InsertIntoBuilderWithName;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPPV(Builder, Instr, Name, __functionAddress);
    }

    /** {@code void LLVMInsertIntoBuilderWithName(LLVMBuilderRef Builder, LLVMValueRef Instr, char const * Name)} */
    public static void LLVMInsertIntoBuilderWithName(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMInsertIntoBuilderWithName(Builder, Instr, memAddress(Name));
    }

    /** {@code void LLVMInsertIntoBuilderWithName(LLVMBuilderRef Builder, LLVMValueRef Instr, char const * Name)} */
    public static void LLVMInsertIntoBuilderWithName(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            nLLVMInsertIntoBuilderWithName(Builder, Instr, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMDisposeBuilder ] ---

    /** {@code void LLVMDisposeBuilder(LLVMBuilderRef Builder)} */
    public static void LLVMDisposeBuilder(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.DisposeBuilder;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMGetCurrentDebugLocation2 ] ---

    /** {@code LLVMMetadataRef LLVMGetCurrentDebugLocation2(LLVMBuilderRef Builder)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMGetCurrentDebugLocation2(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetCurrentDebugLocation2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMSetCurrentDebugLocation2 ] ---

    /** {@code void LLVMSetCurrentDebugLocation2(LLVMBuilderRef Builder, LLVMMetadataRef Loc)} */
    public static void LLVMSetCurrentDebugLocation2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long Loc) {
        long __functionAddress = Functions.SetCurrentDebugLocation2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        invokePPV(Builder, Loc, __functionAddress);
    }

    // --- [ LLVMSetInstDebugLocation ] ---

    /** {@code void LLVMSetInstDebugLocation(LLVMBuilderRef Builder, LLVMValueRef Inst)} */
    public static void LLVMSetInstDebugLocation(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.SetInstDebugLocation;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Inst);
        }
        invokePPV(Builder, Inst, __functionAddress);
    }

    // --- [ LLVMAddMetadataToInst ] ---

    /** {@code void LLVMAddMetadataToInst(LLVMBuilderRef Builder, LLVMValueRef Inst)} */
    public static void LLVMAddMetadataToInst(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.AddMetadataToInst;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Inst);
        }
        invokePPV(Builder, Inst, __functionAddress);
    }

    // --- [ LLVMBuilderGetDefaultFPMathTag ] ---

    /** {@code LLVMMetadataRef LLVMBuilderGetDefaultFPMathTag(LLVMBuilderRef Builder)} */
    @NativeType("LLVMMetadataRef")
    public static long LLVMBuilderGetDefaultFPMathTag(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.BuilderGetDefaultFPMathTag;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMBuilderSetDefaultFPMathTag ] ---

    /** {@code void LLVMBuilderSetDefaultFPMathTag(LLVMBuilderRef Builder, LLVMMetadataRef FPMathTag)} */
    public static void LLVMBuilderSetDefaultFPMathTag(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMMetadataRef") long FPMathTag) {
        long __functionAddress = Functions.BuilderSetDefaultFPMathTag;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        invokePPV(Builder, FPMathTag, __functionAddress);
    }

    // --- [ LLVMGetBuilderContext ] ---

    /** {@code LLVMContextRef LLVMGetBuilderContext(LLVMBuilderRef Builder)} */
    @NativeType("LLVMContextRef")
    public static long LLVMGetBuilderContext(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetBuilderContext;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMSetCurrentDebugLocation ] ---

    /** {@code void LLVMSetCurrentDebugLocation(LLVMBuilderRef Builder, LLVMValueRef L)} */
    public static void LLVMSetCurrentDebugLocation(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long L) {
        long __functionAddress = Functions.SetCurrentDebugLocation;
        if (CHECKS) {
            check(Builder);
            check(L);
        }
        invokePPV(Builder, L, __functionAddress);
    }

    // --- [ LLVMGetCurrentDebugLocation ] ---

    /** {@code LLVMValueRef LLVMGetCurrentDebugLocation(LLVMBuilderRef Builder)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetCurrentDebugLocation(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetCurrentDebugLocation;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMBuildRetVoid ] ---

    /** {@code LLVMValueRef LLVMBuildRetVoid(LLVMBuilderRef Builder)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildRetVoid(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.BuildRetVoid;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMBuildRet ] ---

    /** {@code LLVMValueRef LLVMBuildRet(LLVMBuilderRef Builder, LLVMValueRef V)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildRet(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.BuildRet;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPP(Builder, V, __functionAddress);
    }

    // --- [ LLVMBuildAggregateRet ] ---

    /** {@code LLVMValueRef LLVMBuildAggregateRet(LLVMBuilderRef Builder, LLVMValueRef * RetVals, unsigned int N)} */
    public static long nLLVMBuildAggregateRet(long Builder, long RetVals, int N) {
        long __functionAddress = Functions.BuildAggregateRet;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPP(Builder, RetVals, N, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildAggregateRet(LLVMBuilderRef Builder, LLVMValueRef * RetVals, unsigned int N)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAggregateRet(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef *") PointerBuffer RetVals) {
        return nLLVMBuildAggregateRet(Builder, memAddress(RetVals), RetVals.remaining());
    }

    // --- [ LLVMBuildBr ] ---

    /** {@code LLVMValueRef LLVMBuildBr(LLVMBuilderRef Builder, LLVMBasicBlockRef Dest)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildBr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.BuildBr;
        if (CHECKS) {
            check(Builder);
            check(Dest);
        }
        return invokePPP(Builder, Dest, __functionAddress);
    }

    // --- [ LLVMBuildCondBr ] ---

    /** {@code LLVMValueRef LLVMBuildCondBr(LLVMBuilderRef Builder, LLVMValueRef If, LLVMBasicBlockRef Then, LLVMBasicBlockRef Else)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCondBr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long If, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Else) {
        long __functionAddress = Functions.BuildCondBr;
        if (CHECKS) {
            check(Builder);
            check(If);
            check(Then);
            check(Else);
        }
        return invokePPPPP(Builder, If, Then, Else, __functionAddress);
    }

    // --- [ LLVMBuildSwitch ] ---

    /** {@code LLVMValueRef LLVMBuildSwitch(LLVMBuilderRef Builder, LLVMValueRef V, LLVMBasicBlockRef Else, unsigned int NumCases)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSwitch(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("LLVMBasicBlockRef") long Else, @NativeType("unsigned int") int NumCases) {
        long __functionAddress = Functions.BuildSwitch;
        if (CHECKS) {
            check(Builder);
            check(V);
            check(Else);
        }
        return invokePPPP(Builder, V, Else, NumCases, __functionAddress);
    }

    // --- [ LLVMBuildIndirectBr ] ---

    /** {@code LLVMValueRef LLVMBuildIndirectBr(LLVMBuilderRef B, LLVMValueRef Addr, unsigned int NumDests)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIndirectBr(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Addr, @NativeType("unsigned int") int NumDests) {
        long __functionAddress = Functions.BuildIndirectBr;
        if (CHECKS) {
            check(B);
            check(Addr);
        }
        return invokePPP(B, Addr, NumDests, __functionAddress);
    }

    // --- [ LLVMBuildCallBr ] ---

    /** {@code LLVMValueRef LLVMBuildCallBr(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMBasicBlockRef DefaultDest, LLVMBasicBlockRef * IndirectDests, unsigned NumIndirectDests, LLVMValueRef * Args, unsigned NumArgs, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    public static long nLLVMBuildCallBr(long B, long Ty, long Fn, long DefaultDest, long IndirectDests, int NumIndirectDests, long Args, int NumArgs, long Bundles, int NumBundles, long Name) {
        long __functionAddress = Functions.BuildCallBr;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Ty);
            check(Fn);
            check(DefaultDest);
        }
        return invokePPPPPPPPP(B, Ty, Fn, DefaultDest, IndirectDests, NumIndirectDests, Args, NumArgs, Bundles, NumBundles, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCallBr(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMBasicBlockRef DefaultDest, LLVMBasicBlockRef * IndirectDests, unsigned NumIndirectDests, LLVMValueRef * Args, unsigned NumArgs, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCallBr(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMBasicBlockRef") long DefaultDest, @NativeType("LLVMBasicBlockRef *") PointerBuffer IndirectDests, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMOperandBundleRef *") PointerBuffer Bundles, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCallBr(B, Ty, Fn, DefaultDest, memAddress(IndirectDests), IndirectDests.remaining(), memAddress(Args), Args.remaining(), memAddress(Bundles), Bundles.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCallBr(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMBasicBlockRef DefaultDest, LLVMBasicBlockRef * IndirectDests, unsigned NumIndirectDests, LLVMValueRef * Args, unsigned NumArgs, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCallBr(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMBasicBlockRef") long DefaultDest, @NativeType("LLVMBasicBlockRef *") PointerBuffer IndirectDests, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMOperandBundleRef *") PointerBuffer Bundles, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCallBr(B, Ty, Fn, DefaultDest, memAddress(IndirectDests), IndirectDests.remaining(), memAddress(Args), Args.remaining(), memAddress(Bundles), Bundles.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildInvoke ] ---

    /** {@code LLVMValueRef LLVMBuildInvoke(LLVMBuilderRef Builder, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, char const * Name)} */
    public static long nLLVMBuildInvoke(long Builder, long Fn, long Args, int NumArgs, long Then, long Catch, long Name) {
        long __functionAddress = Functions.BuildInvoke;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Fn);
            check(Then);
            check(Catch);
        }
        return invokePPPPPPP(Builder, Fn, Args, NumArgs, Then, Catch, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildInvoke(LLVMBuilderRef Builder, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvoke(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInvoke(Builder, Fn, memAddress(Args), Args.remaining(), Then, Catch, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildInvoke(LLVMBuilderRef Builder, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvoke(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildInvoke(Builder, Fn, memAddress(Args), Args.remaining(), Then, Catch, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildInvoke2 ] ---

    /** {@code LLVMValueRef LLVMBuildInvoke2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, char const * Name)} */
    public static long nLLVMBuildInvoke2(long Builder, long Ty, long Fn, long Args, int NumArgs, long Then, long Catch, long Name) {
        long __functionAddress = Functions.BuildInvoke2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Ty);
            check(Fn);
            check(Then);
            check(Catch);
        }
        return invokePPPPPPPP(Builder, Ty, Fn, Args, NumArgs, Then, Catch, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildInvoke2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvoke2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInvoke2(Builder, Ty, Fn, memAddress(Args), Args.remaining(), Then, Catch, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildInvoke2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvoke2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildInvoke2(Builder, Ty, Fn, memAddress(Args), Args.remaining(), Then, Catch, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildInvokeWithOperandBundles ] ---

    /** {@code LLVMValueRef LLVMBuildInvokeWithOperandBundles(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    public static long nLLVMBuildInvokeWithOperandBundles(long Builder, long Ty, long Fn, long Args, int NumArgs, long Then, long Catch, long Bundles, int NumBundles, long Name) {
        long __functionAddress = Functions.BuildInvokeWithOperandBundles;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Ty);
            check(Fn);
            check(Then);
            check(Catch);
        }
        return invokePPPPPPPPP(Builder, Ty, Fn, Args, NumArgs, Then, Catch, Bundles, NumBundles, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildInvokeWithOperandBundles(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvokeWithOperandBundles(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("LLVMOperandBundleRef *") PointerBuffer Bundles, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInvokeWithOperandBundles(Builder, Ty, Fn, memAddress(Args), Args.remaining(), Then, Catch, memAddress(Bundles), Bundles.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildInvokeWithOperandBundles(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned NumArgs, LLVMBasicBlockRef Then, LLVMBasicBlockRef Catch, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvokeWithOperandBundles(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("LLVMOperandBundleRef *") PointerBuffer Bundles, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildInvokeWithOperandBundles(Builder, Ty, Fn, memAddress(Args), Args.remaining(), Then, Catch, memAddress(Bundles), Bundles.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildUnreachable ] ---

    /** {@code LLVMValueRef LLVMBuildUnreachable(LLVMBuilderRef Builder)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildUnreachable(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.BuildUnreachable;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMBuildResume ] ---

    /** {@code LLVMValueRef LLVMBuildResume(LLVMBuilderRef B, LLVMValueRef Exn)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildResume(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Exn) {
        long __functionAddress = Functions.BuildResume;
        if (CHECKS) {
            check(B);
            check(Exn);
        }
        return invokePPP(B, Exn, __functionAddress);
    }

    // --- [ LLVMBuildLandingPad ] ---

    /** {@code LLVMValueRef LLVMBuildLandingPad(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef PersFn, unsigned int NumClauses, char const * Name)} */
    public static long nLLVMBuildLandingPad(long B, long Ty, long PersFn, int NumClauses, long Name) {
        long __functionAddress = Functions.BuildLandingPad;
        if (CHECKS) {
            check(B);
            check(Ty);
            check(PersFn);
        }
        return invokePPPPP(B, Ty, PersFn, NumClauses, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildLandingPad(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef PersFn, unsigned int NumClauses, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLandingPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long PersFn, @NativeType("unsigned int") int NumClauses, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLandingPad(B, Ty, PersFn, NumClauses, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildLandingPad(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef PersFn, unsigned int NumClauses, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLandingPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long PersFn, @NativeType("unsigned int") int NumClauses, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildLandingPad(B, Ty, PersFn, NumClauses, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildCleanupRet ] ---

    /** {@code LLVMValueRef LLVMBuildCleanupRet(LLVMBuilderRef B, LLVMValueRef CatchPad, LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCleanupRet(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long CatchPad, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BuildCleanupRet;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(CatchPad);
            check(BB);
        }
        return invokePPPP(B, CatchPad, BB, __functionAddress);
    }

    // --- [ LLVMBuildCatchRet ] ---

    /** {@code LLVMValueRef LLVMBuildCatchRet(LLVMBuilderRef B, LLVMValueRef CatchPad, LLVMBasicBlockRef BB)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchRet(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long CatchPad, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BuildCatchRet;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(CatchPad);
            check(BB);
        }
        return invokePPPP(B, CatchPad, BB, __functionAddress);
    }

    // --- [ LLVMBuildCatchPad ] ---

    /** {@code LLVMValueRef LLVMBuildCatchPad(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    public static long nLLVMBuildCatchPad(long B, long ParentPad, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCatchPad;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(ParentPad);
        }
        return invokePPPPP(B, ParentPad, Args, NumArgs, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCatchPad(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCatchPad(B, ParentPad, memAddress(Args), Args.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCatchPad(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCatchPad(B, ParentPad, memAddress(Args), Args.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildCleanupPad ] ---

    /** {@code LLVMValueRef LLVMBuildCleanupPad(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    public static long nLLVMBuildCleanupPad(long B, long ParentPad, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCleanupPad;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(ParentPad);
        }
        return invokePPPPP(B, ParentPad, Args, NumArgs, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCleanupPad(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCleanupPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCleanupPad(B, ParentPad, memAddress(Args), Args.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCleanupPad(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCleanupPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCleanupPad(B, ParentPad, memAddress(Args), Args.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildCatchSwitch ] ---

    /** {@code LLVMValueRef LLVMBuildCatchSwitch(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMBasicBlockRef UnwindBB, unsigned int NumHandlers, char const * Name)} */
    public static long nLLVMBuildCatchSwitch(long B, long ParentPad, long UnwindBB, int NumHandlers, long Name) {
        long __functionAddress = Functions.BuildCatchSwitch;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(ParentPad);
            check(UnwindBB);
        }
        return invokePPPPP(B, ParentPad, UnwindBB, NumHandlers, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCatchSwitch(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMBasicBlockRef UnwindBB, unsigned int NumHandlers, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchSwitch(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMBasicBlockRef") long UnwindBB, @NativeType("unsigned int") int NumHandlers, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCatchSwitch(B, ParentPad, UnwindBB, NumHandlers, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCatchSwitch(LLVMBuilderRef B, LLVMValueRef ParentPad, LLVMBasicBlockRef UnwindBB, unsigned int NumHandlers, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchSwitch(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMBasicBlockRef") long UnwindBB, @NativeType("unsigned int") int NumHandlers, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCatchSwitch(B, ParentPad, UnwindBB, NumHandlers, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMAddCase ] ---

    /** {@code void LLVMAddCase(LLVMValueRef Switch, LLVMValueRef OnVal, LLVMBasicBlockRef Dest)} */
    public static void LLVMAddCase(@NativeType("LLVMValueRef") long Switch, @NativeType("LLVMValueRef") long OnVal, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.AddCase;
        if (CHECKS) {
            check(Switch);
            check(OnVal);
            check(Dest);
        }
        invokePPPV(Switch, OnVal, Dest, __functionAddress);
    }

    // --- [ LLVMAddDestination ] ---

    /** {@code void LLVMAddDestination(LLVMValueRef IndirectBr, LLVMBasicBlockRef Dest)} */
    public static void LLVMAddDestination(@NativeType("LLVMValueRef") long IndirectBr, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.AddDestination;
        if (CHECKS) {
            check(IndirectBr);
            check(Dest);
        }
        invokePPV(IndirectBr, Dest, __functionAddress);
    }

    // --- [ LLVMGetNumClauses ] ---

    /** {@code unsigned int LLVMGetNumClauses(LLVMValueRef LandingPad)} */
    @NativeType("unsigned int")
    public static int LLVMGetNumClauses(@NativeType("LLVMValueRef") long LandingPad) {
        long __functionAddress = Functions.GetNumClauses;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePI(LandingPad, __functionAddress);
    }

    // --- [ LLVMGetClause ] ---

    /** {@code LLVMValueRef LLVMGetClause(LLVMValueRef LandingPad, unsigned int Idx)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetClause(@NativeType("LLVMValueRef") long LandingPad, @NativeType("unsigned int") int Idx) {
        long __functionAddress = Functions.GetClause;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePP(LandingPad, Idx, __functionAddress);
    }

    // --- [ LLVMAddClause ] ---

    /** {@code void LLVMAddClause(LLVMValueRef LandingPad, LLVMValueRef ClauseVal)} */
    public static void LLVMAddClause(@NativeType("LLVMValueRef") long LandingPad, @NativeType("LLVMValueRef") long ClauseVal) {
        long __functionAddress = Functions.AddClause;
        if (CHECKS) {
            check(LandingPad);
            check(ClauseVal);
        }
        invokePPV(LandingPad, ClauseVal, __functionAddress);
    }

    // --- [ LLVMIsCleanup ] ---

    /** {@code LLVMBool LLVMIsCleanup(LLVMValueRef LandingPad)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsCleanup(@NativeType("LLVMValueRef") long LandingPad) {
        long __functionAddress = Functions.IsCleanup;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePI(LandingPad, __functionAddress) != 0;
    }

    // --- [ LLVMSetCleanup ] ---

    /** {@code void LLVMSetCleanup(LLVMValueRef LandingPad, LLVMBool Val)} */
    public static void LLVMSetCleanup(@NativeType("LLVMValueRef") long LandingPad, @NativeType("LLVMBool") boolean Val) {
        long __functionAddress = Functions.SetCleanup;
        if (CHECKS) {
            check(LandingPad);
        }
        invokePV(LandingPad, Val ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMAddHandler ] ---

    /** {@code void LLVMAddHandler(LLVMValueRef CatchSwitch, LLVMBasicBlockRef Dest)} */
    public static void LLVMAddHandler(@NativeType("LLVMValueRef") long CatchSwitch, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.AddHandler;
        if (CHECKS) {
            check(__functionAddress);
            check(CatchSwitch);
            check(Dest);
        }
        invokePPV(CatchSwitch, Dest, __functionAddress);
    }

    // --- [ LLVMGetNumHandlers ] ---

    /** {@code unsigned int LLVMGetNumHandlers(LLVMValueRef CatchSwitch)} */
    @NativeType("unsigned int")
    public static int LLVMGetNumHandlers(@NativeType("LLVMValueRef") long CatchSwitch) {
        long __functionAddress = Functions.GetNumHandlers;
        if (CHECKS) {
            check(__functionAddress);
            check(CatchSwitch);
        }
        return invokePI(CatchSwitch, __functionAddress);
    }

    // --- [ LLVMGetHandlers ] ---

    /** {@code void LLVMGetHandlers(LLVMValueRef CatchSwitch, LLVMBasicBlockRef * Handlers)} */
    public static void nLLVMGetHandlers(long CatchSwitch, long Handlers) {
        long __functionAddress = Functions.GetHandlers;
        if (CHECKS) {
            check(__functionAddress);
            check(CatchSwitch);
        }
        invokePPV(CatchSwitch, Handlers, __functionAddress);
    }

    /** {@code void LLVMGetHandlers(LLVMValueRef CatchSwitch, LLVMBasicBlockRef * Handlers)} */
    public static void LLVMGetHandlers(@NativeType("LLVMValueRef") long CatchSwitch, @NativeType("LLVMBasicBlockRef *") PointerBuffer Handlers) {
        if (CHECKS) {
            if (DEBUG) {
                check(Handlers, LLVMGetNumHandlers(CatchSwitch));
            }
        }
        nLLVMGetHandlers(CatchSwitch, memAddress(Handlers));
    }

    // --- [ LLVMGetArgOperand ] ---

    /** {@code LLVMValueRef LLVMGetArgOperand(LLVMValueRef Funclet, unsigned int i)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetArgOperand(@NativeType("LLVMValueRef") long Funclet, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.GetArgOperand;
        if (CHECKS) {
            check(__functionAddress);
            check(Funclet);
        }
        return invokePP(Funclet, i, __functionAddress);
    }

    // --- [ LLVMSetArgOperand ] ---

    /** {@code void LLVMSetArgOperand(LLVMValueRef Funclet, unsigned int i, LLVMValueRef value)} */
    public static void LLVMSetArgOperand(@NativeType("LLVMValueRef") long Funclet, @NativeType("unsigned int") int i, @NativeType("LLVMValueRef") long value) {
        long __functionAddress = Functions.SetArgOperand;
        if (CHECKS) {
            check(__functionAddress);
            check(Funclet);
            check(value);
        }
        invokePPV(Funclet, i, value, __functionAddress);
    }

    // --- [ LLVMGetParentCatchSwitch ] ---

    /** {@code LLVMValueRef LLVMGetParentCatchSwitch(LLVMValueRef CatchPad)} */
    @NativeType("LLVMValueRef")
    public static long LLVMGetParentCatchSwitch(@NativeType("LLVMValueRef") long CatchPad) {
        long __functionAddress = Functions.GetParentCatchSwitch;
        if (CHECKS) {
            check(__functionAddress);
            check(CatchPad);
        }
        return invokePP(CatchPad, __functionAddress);
    }

    // --- [ LLVMSetParentCatchSwitch ] ---

    /** {@code void LLVMSetParentCatchSwitch(LLVMValueRef CatchPad, LLVMValueRef CatchSwitch)} */
    public static void LLVMSetParentCatchSwitch(@NativeType("LLVMValueRef") long CatchPad, @NativeType("LLVMValueRef") long CatchSwitch) {
        long __functionAddress = Functions.SetParentCatchSwitch;
        if (CHECKS) {
            check(__functionAddress);
            check(CatchPad);
            check(CatchSwitch);
        }
        invokePPV(CatchPad, CatchSwitch, __functionAddress);
    }

    // --- [ LLVMBuildAdd ] ---

    /** {@code LLVMValueRef LLVMBuildAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAdd(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildAdd(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNSWAdd ] ---

    /** {@code LLVMValueRef LLVMBuildNSWAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildNSWAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNSWAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNSWAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWAdd(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNSWAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNSWAdd(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNUWAdd ] ---

    /** {@code LLVMValueRef LLVMBuildNUWAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildNUWAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNUWAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNUWAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWAdd(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNUWAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNUWAdd(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFAdd ] ---

    /** {@code LLVMValueRef LLVMBuildFAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildFAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFAdd(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFAdd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFAdd(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildSub ] ---

    /** {@code LLVMValueRef LLVMBuildSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSub(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildSub(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNSWSub ] ---

    /** {@code LLVMValueRef LLVMBuildNSWSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildNSWSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNSWSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNSWSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWSub(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNSWSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNSWSub(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNUWSub ] ---

    /** {@code LLVMValueRef LLVMBuildNUWSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildNUWSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNUWSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNUWSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWSub(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNUWSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNUWSub(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFSub ] ---

    /** {@code LLVMValueRef LLVMBuildFSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildFSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFSub(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFSub(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFSub(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildMul ] ---

    /** {@code LLVMValueRef LLVMBuildMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildMul(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildMul(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNSWMul ] ---

    /** {@code LLVMValueRef LLVMBuildNSWMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildNSWMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNSWMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNSWMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWMul(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNSWMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNSWMul(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNUWMul ] ---

    /** {@code LLVMValueRef LLVMBuildNUWMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildNUWMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNUWMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNUWMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWMul(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNUWMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNUWMul(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFMul ] ---

    /** {@code LLVMValueRef LLVMBuildFMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildFMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFMul(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFMul(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFMul(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildUDiv ] ---

    /** {@code LLVMValueRef LLVMBuildUDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildUDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildUDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildUDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildUDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildUDiv(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildUDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildUDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildUDiv(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildExactUDiv ] ---

    /** {@code LLVMValueRef LLVMBuildExactUDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildExactUDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildExactUDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildExactUDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExactUDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExactUDiv(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildExactUDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExactUDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildExactUDiv(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildSDiv ] ---

    /** {@code LLVMValueRef LLVMBuildSDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildSDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildSDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildSDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSDiv(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildSDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildSDiv(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildExactSDiv ] ---

    /** {@code LLVMValueRef LLVMBuildExactSDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildExactSDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildExactSDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildExactSDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExactSDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExactSDiv(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildExactSDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExactSDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildExactSDiv(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFDiv ] ---

    /** {@code LLVMValueRef LLVMBuildFDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildFDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFDiv(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFDiv(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFDiv(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildURem ] ---

    /** {@code LLVMValueRef LLVMBuildURem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildURem(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildURem;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildURem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildURem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildURem(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildURem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildURem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildURem(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildSRem ] ---

    /** {@code LLVMValueRef LLVMBuildSRem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildSRem(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildSRem;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildSRem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSRem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSRem(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildSRem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSRem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildSRem(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFRem ] ---

    /** {@code LLVMValueRef LLVMBuildFRem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildFRem(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFRem;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFRem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFRem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFRem(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFRem(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFRem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFRem(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildShl ] ---

    /** {@code LLVMValueRef LLVMBuildShl(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildShl(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildShl;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildShl(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildShl(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildShl(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildShl(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildShl(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildShl(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildLShr ] ---

    /** {@code LLVMValueRef LLVMBuildLShr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildLShr(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildLShr;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildLShr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLShr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLShr(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildLShr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLShr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildLShr(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildAShr ] ---

    /** {@code LLVMValueRef LLVMBuildAShr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildAShr(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildAShr;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildAShr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAShr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAShr(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildAShr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAShr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildAShr(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildAnd ] ---

    /** {@code LLVMValueRef LLVMBuildAnd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildAnd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildAnd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildAnd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAnd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAnd(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildAnd(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAnd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildAnd(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildOr ] ---

    /** {@code LLVMValueRef LLVMBuildOr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildOr(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildOr;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildOr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildOr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildOr(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildOr(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildOr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildOr(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildXor ] ---

    /** {@code LLVMValueRef LLVMBuildXor(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildXor(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildXor;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildXor(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildXor(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildXor(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildXor(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildXor(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildXor(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildBinOp ] ---

    /** {@code LLVMValueRef LLVMBuildBinOp(LLVMBuilderRef B, LLVMOpcode Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildBinOp(long B, int Op, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildBinOp;
        if (CHECKS) {
            check(B);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(B, Op, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildBinOp(LLVMBuilderRef B, LLVMOpcode Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildBinOp(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMOpcode") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildBinOp(B, Op, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildBinOp(LLVMBuilderRef B, LLVMOpcode Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildBinOp(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMOpcode") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildBinOp(B, Op, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNeg ] ---

    /** {@code LLVMValueRef LLVMBuildNeg(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    public static long nLLVMBuildNeg(long Builder, long V, long Name) {
        long __functionAddress = Functions.BuildNeg;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPPP(Builder, V, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNeg(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNeg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNeg(Builder, V, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNeg(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNeg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNeg(Builder, V, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNSWNeg ] ---

    /** {@code LLVMValueRef LLVMBuildNSWNeg(LLVMBuilderRef B, LLVMValueRef V, char const * Name)} */
    public static long nLLVMBuildNSWNeg(long B, long V, long Name) {
        long __functionAddress = Functions.BuildNSWNeg;
        if (CHECKS) {
            check(B);
            check(V);
        }
        return invokePPPP(B, V, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNSWNeg(LLVMBuilderRef B, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWNeg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWNeg(B, V, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNSWNeg(LLVMBuilderRef B, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWNeg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long V, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNSWNeg(B, V, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildNUWNeg ] ---

    /** {@code LLVMValueRef LLVMBuildNUWNeg(LLVMBuilderRef B, LLVMValueRef V, char const * Name)} */
    public static long nLLVMBuildNUWNeg(long B, long V, long Name) {
        long __functionAddress = Functions.BuildNUWNeg;
        if (CHECKS) {
            check(B);
            check(V);
        }
        return invokePPPP(B, V, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNUWNeg(LLVMBuilderRef B, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWNeg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWNeg(B, V, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNUWNeg(LLVMBuilderRef B, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWNeg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long V, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNUWNeg(B, V, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFNeg ] ---

    /** {@code LLVMValueRef LLVMBuildFNeg(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    public static long nLLVMBuildFNeg(long Builder, long V, long Name) {
        long __functionAddress = Functions.BuildFNeg;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPPP(Builder, V, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFNeg(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFNeg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFNeg(Builder, V, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFNeg(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFNeg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFNeg(Builder, V, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetNUW ] ---

    /** {@code LLVMBool LLVMGetNUW(LLVMValueRef ArithInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetNUW(@NativeType("LLVMValueRef") long ArithInst) {
        long __functionAddress = Functions.GetNUW;
        if (CHECKS) {
            check(ArithInst);
        }
        return invokePI(ArithInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetNUW ] ---

    /** {@code void LLVMSetNUW(LLVMValueRef ArithInst, LLVMBool HasNUW)} */
    public static void LLVMSetNUW(@NativeType("LLVMValueRef") long ArithInst, @NativeType("LLVMBool") boolean HasNUW) {
        long __functionAddress = Functions.SetNUW;
        if (CHECKS) {
            check(ArithInst);
        }
        invokePV(ArithInst, HasNUW ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetNSW ] ---

    /** {@code LLVMBool LLVMGetNSW(LLVMValueRef ArithInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetNSW(@NativeType("LLVMValueRef") long ArithInst) {
        long __functionAddress = Functions.GetNSW;
        if (CHECKS) {
            check(ArithInst);
        }
        return invokePI(ArithInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetNSW ] ---

    /** {@code void LLVMSetNSW(LLVMValueRef ArithInst, LLVMBool HasNSW)} */
    public static void LLVMSetNSW(@NativeType("LLVMValueRef") long ArithInst, @NativeType("LLVMBool") boolean HasNSW) {
        long __functionAddress = Functions.SetNSW;
        if (CHECKS) {
            check(ArithInst);
        }
        invokePV(ArithInst, HasNSW ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetExact ] ---

    /** {@code LLVMBool LLVMGetExact(LLVMValueRef DivOrShrInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetExact(@NativeType("LLVMValueRef") long DivOrShrInst) {
        long __functionAddress = Functions.GetExact;
        if (CHECKS) {
            check(DivOrShrInst);
        }
        return invokePI(DivOrShrInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetExact ] ---

    /** {@code void LLVMSetExact(LLVMValueRef DivOrShrInst, LLVMBool IsExact)} */
    public static void LLVMSetExact(@NativeType("LLVMValueRef") long DivOrShrInst, @NativeType("LLVMBool") boolean IsExact) {
        long __functionAddress = Functions.SetExact;
        if (CHECKS) {
            check(DivOrShrInst);
        }
        invokePV(DivOrShrInst, IsExact ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetNNeg ] ---

    /** {@code LLVMBool LLVMGetNNeg(LLVMValueRef NonNegInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetNNeg(@NativeType("LLVMValueRef") long NonNegInst) {
        long __functionAddress = Functions.GetNNeg;
        if (CHECKS) {
            check(__functionAddress);
            check(NonNegInst);
        }
        return invokePI(NonNegInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetNNeg ] ---

    /** {@code void LLVMSetNNeg(LLVMValueRef NonNegInst, LLVMBool IsNonNeg)} */
    public static void LLVMSetNNeg(@NativeType("LLVMValueRef") long NonNegInst, @NativeType("LLVMBool") boolean IsNonNeg) {
        long __functionAddress = Functions.SetNNeg;
        if (CHECKS) {
            check(__functionAddress);
            check(NonNegInst);
        }
        invokePV(NonNegInst, IsNonNeg ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetFastMathFlags ] ---

    /** {@code LLVMFastMathFlags LLVMGetFastMathFlags(LLVMValueRef FPMathInst)} */
    @NativeType("LLVMFastMathFlags")
    public static int LLVMGetFastMathFlags(@NativeType("LLVMValueRef") long FPMathInst) {
        long __functionAddress = Functions.GetFastMathFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(FPMathInst);
        }
        return invokePI(FPMathInst, __functionAddress);
    }

    // --- [ LLVMSetFastMathFlags ] ---

    /** {@code void LLVMSetFastMathFlags(LLVMValueRef FPMathInst, LLVMFastMathFlags FMF)} */
    public static void LLVMSetFastMathFlags(@NativeType("LLVMValueRef") long FPMathInst, @NativeType("LLVMFastMathFlags") int FMF) {
        long __functionAddress = Functions.SetFastMathFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(FPMathInst);
        }
        invokePV(FPMathInst, FMF, __functionAddress);
    }

    // --- [ LLVMCanValueUseFastMathFlags ] ---

    /** {@code LLVMBool LLVMCanValueUseFastMathFlags(LLVMValueRef Inst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMCanValueUseFastMathFlags(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.CanValueUseFastMathFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        return invokePI(Inst, __functionAddress) != 0;
    }

    // --- [ LLVMGetIsDisjoint ] ---

    /** {@code LLVMBool LLVMGetIsDisjoint(LLVMValueRef Inst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetIsDisjoint(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetIsDisjoint;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        return invokePI(Inst, __functionAddress) != 0;
    }

    // --- [ LLVMSetIsDisjoint ] ---

    /** {@code void LLVMSetIsDisjoint(LLVMValueRef Inst, LLVMBool IsDisjoint)} */
    public static void LLVMSetIsDisjoint(@NativeType("LLVMValueRef") long Inst, @NativeType("LLVMBool") boolean IsDisjoint) {
        long __functionAddress = Functions.SetIsDisjoint;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        invokePV(Inst, IsDisjoint ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMBuildNot ] ---

    /** {@code LLVMValueRef LLVMBuildNot(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    public static long nLLVMBuildNot(long Builder, long V, long Name) {
        long __functionAddress = Functions.BuildNot;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPPP(Builder, V, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildNot(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNot(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNot(Builder, V, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildNot(LLVMBuilderRef Builder, LLVMValueRef V, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildNot(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildNot(Builder, V, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildMalloc ] ---

    /** {@code LLVMValueRef LLVMBuildMalloc(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    public static long nLLVMBuildMalloc(long Builder, long Ty, long Name) {
        long __functionAddress = Functions.BuildMalloc;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePPPP(Builder, Ty, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildMalloc(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMalloc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildMalloc(Builder, Ty, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildMalloc(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMalloc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildMalloc(Builder, Ty, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildArrayMalloc ] ---

    /** {@code LLVMValueRef LLVMBuildArrayMalloc(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Val, char const * Name)} */
    public static long nLLVMBuildArrayMalloc(long Builder, long Ty, long Val, long Name) {
        long __functionAddress = Functions.BuildArrayMalloc;
        if (CHECKS) {
            check(Builder);
            check(Ty);
            check(Val);
        }
        return invokePPPPP(Builder, Ty, Val, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildArrayMalloc(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildArrayMalloc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildArrayMalloc(Builder, Ty, Val, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildArrayMalloc(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildArrayMalloc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildArrayMalloc(Builder, Ty, Val, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildMemSet ] ---

    /** {@code LLVMValueRef LLVMBuildMemSet(LLVMBuilderRef B, LLVMValueRef Ptr, LLVMValueRef Val, LLVMValueRef Len, unsigned Align)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMemSet(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Ptr, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMValueRef") long Len, @NativeType("unsigned") int Align) {
        long __functionAddress = Functions.BuildMemSet;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Ptr);
            check(Val);
            check(Len);
        }
        return invokePPPPP(B, Ptr, Val, Len, Align, __functionAddress);
    }

    // --- [ LLVMBuildMemCpy ] ---

    /** {@code LLVMValueRef LLVMBuildMemCpy(LLVMBuilderRef B, LLVMValueRef Dst, unsigned DstAlign, LLVMValueRef Src, unsigned SrcAlign, LLVMValueRef Size)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMemCpy(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Dst, @NativeType("unsigned") int DstAlign, @NativeType("LLVMValueRef") long Src, @NativeType("unsigned") int SrcAlign, @NativeType("LLVMValueRef") long Size) {
        long __functionAddress = Functions.BuildMemCpy;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Dst);
            check(Src);
            check(Size);
        }
        return invokePPPPP(B, Dst, DstAlign, Src, SrcAlign, Size, __functionAddress);
    }

    // --- [ LLVMBuildMemMove ] ---

    /** {@code LLVMValueRef LLVMBuildMemMove(LLVMBuilderRef B, LLVMValueRef Dst, unsigned DstAlign, LLVMValueRef Src, unsigned SrcAlign, LLVMValueRef Size)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMemMove(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Dst, @NativeType("unsigned") int DstAlign, @NativeType("LLVMValueRef") long Src, @NativeType("unsigned") int SrcAlign, @NativeType("LLVMValueRef") long Size) {
        long __functionAddress = Functions.BuildMemMove;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Dst);
            check(Src);
            check(Size);
        }
        return invokePPPPP(B, Dst, DstAlign, Src, SrcAlign, Size, __functionAddress);
    }

    // --- [ LLVMBuildAlloca ] ---

    /** {@code LLVMValueRef LLVMBuildAlloca(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    public static long nLLVMBuildAlloca(long Builder, long Ty, long Name) {
        long __functionAddress = Functions.BuildAlloca;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePPPP(Builder, Ty, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildAlloca(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAlloca(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAlloca(Builder, Ty, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildAlloca(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAlloca(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildAlloca(Builder, Ty, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildArrayAlloca ] ---

    /** {@code LLVMValueRef LLVMBuildArrayAlloca(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Val, char const * Name)} */
    public static long nLLVMBuildArrayAlloca(long Builder, long Ty, long Val, long Name) {
        long __functionAddress = Functions.BuildArrayAlloca;
        if (CHECKS) {
            check(Builder);
            check(Ty);
            check(Val);
        }
        return invokePPPPP(Builder, Ty, Val, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildArrayAlloca(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildArrayAlloca(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildArrayAlloca(Builder, Ty, Val, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildArrayAlloca(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildArrayAlloca(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildArrayAlloca(Builder, Ty, Val, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFree ] ---

    /** {@code LLVMValueRef LLVMBuildFree(LLVMBuilderRef Builder, LLVMValueRef PointerVal)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFree(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long PointerVal) {
        long __functionAddress = Functions.BuildFree;
        if (CHECKS) {
            check(Builder);
            check(PointerVal);
        }
        return invokePPP(Builder, PointerVal, __functionAddress);
    }

    // --- [ LLVMBuildLoad ] ---

    /** {@code LLVMValueRef LLVMBuildLoad(LLVMBuilderRef Builder, LLVMValueRef PointerVal, char const * Name)} */
    public static long nLLVMBuildLoad(long Builder, long PointerVal, long Name) {
        long __functionAddress = Functions.BuildLoad;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(PointerVal);
        }
        return invokePPPP(Builder, PointerVal, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildLoad(LLVMBuilderRef Builder, LLVMValueRef PointerVal, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLoad(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long PointerVal, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLoad(Builder, PointerVal, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildLoad(LLVMBuilderRef Builder, LLVMValueRef PointerVal, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLoad(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long PointerVal, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildLoad(Builder, PointerVal, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildLoad2 ] ---

    /** {@code LLVMValueRef LLVMBuildLoad2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef PointerVal, char const * Name)} */
    public static long nLLVMBuildLoad2(long Builder, long Ty, long PointerVal, long Name) {
        long __functionAddress = Functions.BuildLoad2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Ty);
            check(PointerVal);
        }
        return invokePPPPP(Builder, Ty, PointerVal, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildLoad2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef PointerVal, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLoad2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long PointerVal, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLoad2(Builder, Ty, PointerVal, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildLoad2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef PointerVal, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLoad2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long PointerVal, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildLoad2(Builder, Ty, PointerVal, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildStore ] ---

    /** {@code LLVMValueRef LLVMBuildStore(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMValueRef Ptr)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildStore(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMValueRef") long Ptr) {
        long __functionAddress = Functions.BuildStore;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(Ptr);
        }
        return invokePPPP(Builder, Val, Ptr, __functionAddress);
    }

    // --- [ LLVMBuildGEP ] ---

    /** {@code LLVMValueRef LLVMBuildGEP(LLVMBuilderRef B, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    public static long nLLVMBuildGEP(long B, long Pointer, long Indices, int NumIndices, long Name) {
        long __functionAddress = Functions.BuildGEP;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Pointer);
        }
        return invokePPPPP(B, Pointer, Indices, NumIndices, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildGEP(LLVMBuilderRef B, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildGEP(B, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildGEP(LLVMBuilderRef B, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildGEP(B, Pointer, memAddress(Indices), Indices.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildInBoundsGEP ] ---

    /** {@code LLVMValueRef LLVMBuildInBoundsGEP(LLVMBuilderRef B, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    public static long nLLVMBuildInBoundsGEP(long B, long Pointer, long Indices, int NumIndices, long Name) {
        long __functionAddress = Functions.BuildInBoundsGEP;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Pointer);
        }
        return invokePPPPP(B, Pointer, Indices, NumIndices, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildInBoundsGEP(LLVMBuilderRef B, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInBoundsGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInBoundsGEP(B, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildInBoundsGEP(LLVMBuilderRef B, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInBoundsGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildInBoundsGEP(B, Pointer, memAddress(Indices), Indices.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildStructGEP ] ---

    /** {@code LLVMValueRef LLVMBuildStructGEP(LLVMBuilderRef B, LLVMValueRef Pointer, unsigned int Idx, char const * Name)} */
    public static long nLLVMBuildStructGEP(long B, long Pointer, int Idx, long Name) {
        long __functionAddress = Functions.BuildStructGEP;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Pointer);
        }
        return invokePPPP(B, Pointer, Idx, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildStructGEP(LLVMBuilderRef B, LLVMValueRef Pointer, unsigned int Idx, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildStructGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("unsigned int") int Idx, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildStructGEP(B, Pointer, Idx, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildStructGEP(LLVMBuilderRef B, LLVMValueRef Pointer, unsigned int Idx, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildStructGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("unsigned int") int Idx, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildStructGEP(B, Pointer, Idx, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildGEP2 ] ---

    /** {@code LLVMValueRef LLVMBuildGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    public static long nLLVMBuildGEP2(long B, long Ty, long Pointer, long Indices, int NumIndices, long Name) {
        long __functionAddress = Functions.BuildGEP2;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Ty);
            check(Pointer);
        }
        return invokePPPPPP(B, Ty, Pointer, Indices, NumIndices, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildGEP2(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildGEP2(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildInBoundsGEP2 ] ---

    /** {@code LLVMValueRef LLVMBuildInBoundsGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    public static long nLLVMBuildInBoundsGEP2(long B, long Ty, long Pointer, long Indices, int NumIndices, long Name) {
        long __functionAddress = Functions.BuildInBoundsGEP2;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Ty);
            check(Pointer);
        }
        return invokePPPPPP(B, Ty, Pointer, Indices, NumIndices, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildInBoundsGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInBoundsGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInBoundsGEP2(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildInBoundsGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned int NumIndices, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInBoundsGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildInBoundsGEP2(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildGEPWithNoWrapFlags ] ---

    /** {@code LLVMValueRef LLVMBuildGEPWithNoWrapFlags(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned NumIndices, char const * Name, LLVMGEPNoWrapFlags NoWrapFlags)} */
    public static long nLLVMBuildGEPWithNoWrapFlags(long B, long Ty, long Pointer, long Indices, int NumIndices, long Name, int NoWrapFlags) {
        long __functionAddress = Functions.BuildGEPWithNoWrapFlags;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Ty);
            check(Pointer);
        }
        return invokePPPPPP(B, Ty, Pointer, Indices, NumIndices, Name, NoWrapFlags, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildGEPWithNoWrapFlags(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned NumIndices, char const * Name, LLVMGEPNoWrapFlags NoWrapFlags)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEPWithNoWrapFlags(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMGEPNoWrapFlags") int NoWrapFlags) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildGEPWithNoWrapFlags(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name), NoWrapFlags);
    }

    /** {@code LLVMValueRef LLVMBuildGEPWithNoWrapFlags(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, LLVMValueRef * Indices, unsigned NumIndices, char const * Name, LLVMGEPNoWrapFlags NoWrapFlags)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEPWithNoWrapFlags(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") CharSequence Name, @NativeType("LLVMGEPNoWrapFlags") int NoWrapFlags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildGEPWithNoWrapFlags(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), NameEncoded, NoWrapFlags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildStructGEP2 ] ---

    /** {@code LLVMValueRef LLVMBuildStructGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, unsigned int Idx, char const * Name)} */
    public static long nLLVMBuildStructGEP2(long B, long Ty, long Pointer, int Idx, long Name) {
        long __functionAddress = Functions.BuildStructGEP2;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Ty);
            check(Pointer);
        }
        return invokePPPPP(B, Ty, Pointer, Idx, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildStructGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, unsigned int Idx, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildStructGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("unsigned int") int Idx, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildStructGEP2(B, Ty, Pointer, Idx, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildStructGEP2(LLVMBuilderRef B, LLVMTypeRef Ty, LLVMValueRef Pointer, unsigned int Idx, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildStructGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("unsigned int") int Idx, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildStructGEP2(B, Ty, Pointer, Idx, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildGlobalString ] ---

    /** {@code LLVMValueRef LLVMBuildGlobalString(LLVMBuilderRef B, char const * Str, char const * Name)} */
    public static long nLLVMBuildGlobalString(long B, long Str, long Name) {
        long __functionAddress = Functions.BuildGlobalString;
        if (CHECKS) {
            check(B);
        }
        return invokePPPP(B, Str, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildGlobalString(LLVMBuilderRef B, char const * Str, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGlobalString(@NativeType("LLVMBuilderRef") long B, @NativeType("char const *") ByteBuffer Str, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Str);
            checkNT1(Name);
        }
        return nLLVMBuildGlobalString(B, memAddress(Str), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildGlobalString(LLVMBuilderRef B, char const * Str, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGlobalString(@NativeType("LLVMBuilderRef") long B, @NativeType("char const *") CharSequence Str, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Str, true);
            long StrEncoded = stack.getPointerAddress();
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildGlobalString(B, StrEncoded, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildGlobalStringPtr ] ---

    /** {@code LLVMValueRef LLVMBuildGlobalStringPtr(LLVMBuilderRef B, char const * Str, char const * Name)} */
    public static long nLLVMBuildGlobalStringPtr(long B, long Str, long Name) {
        long __functionAddress = Functions.BuildGlobalStringPtr;
        if (CHECKS) {
            check(B);
        }
        return invokePPPP(B, Str, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildGlobalStringPtr(LLVMBuilderRef B, char const * Str, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGlobalStringPtr(@NativeType("LLVMBuilderRef") long B, @NativeType("char const *") ByteBuffer Str, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Str);
            checkNT1(Name);
        }
        return nLLVMBuildGlobalStringPtr(B, memAddress(Str), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildGlobalStringPtr(LLVMBuilderRef B, char const * Str, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGlobalStringPtr(@NativeType("LLVMBuilderRef") long B, @NativeType("char const *") CharSequence Str, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Str, true);
            long StrEncoded = stack.getPointerAddress();
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildGlobalStringPtr(B, StrEncoded, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetVolatile ] ---

    /** {@code LLVMBool LLVMGetVolatile(LLVMValueRef MemoryAccessInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetVolatile(@NativeType("LLVMValueRef") long MemoryAccessInst) {
        long __functionAddress = Functions.GetVolatile;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        return invokePI(MemoryAccessInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetVolatile ] ---

    /** {@code void LLVMSetVolatile(LLVMValueRef MemoryAccessInst, LLVMBool IsVolatile)} */
    public static void LLVMSetVolatile(@NativeType("LLVMValueRef") long MemoryAccessInst, @NativeType("LLVMBool") boolean IsVolatile) {
        long __functionAddress = Functions.SetVolatile;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        invokePV(MemoryAccessInst, IsVolatile ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetWeak ] ---

    /** {@code LLVMBool LLVMGetWeak(LLVMValueRef CmpXchgInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMGetWeak(@NativeType("LLVMValueRef") long CmpXchgInst) {
        long __functionAddress = Functions.GetWeak;
        if (CHECKS) {
            check(__functionAddress);
            check(CmpXchgInst);
        }
        return invokePI(CmpXchgInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetWeak ] ---

    /** {@code void LLVMSetWeak(LLVMValueRef CmpXchgInst, LLVMBool IsWeak)} */
    public static void LLVMSetWeak(@NativeType("LLVMValueRef") long CmpXchgInst, @NativeType("LLVMBool") boolean IsWeak) {
        long __functionAddress = Functions.SetWeak;
        if (CHECKS) {
            check(__functionAddress);
            check(CmpXchgInst);
        }
        invokePV(CmpXchgInst, IsWeak ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetOrdering ] ---

    /** {@code LLVMAtomicOrdering LLVMGetOrdering(LLVMValueRef MemoryAccessInst)} */
    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetOrdering(@NativeType("LLVMValueRef") long MemoryAccessInst) {
        long __functionAddress = Functions.GetOrdering;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        return invokePI(MemoryAccessInst, __functionAddress);
    }

    // --- [ LLVMSetOrdering ] ---

    /** {@code void LLVMSetOrdering(LLVMValueRef MemoryAccessInst, LLVMAtomicOrdering Ordering)} */
    public static void LLVMSetOrdering(@NativeType("LLVMValueRef") long MemoryAccessInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetOrdering;
        if (CHECKS) {
            check(__functionAddress);
            check(MemoryAccessInst);
        }
        invokePV(MemoryAccessInst, Ordering, __functionAddress);
    }

    // --- [ LLVMGetAtomicRMWBinOp ] ---

    /** {@code LLVMAtomicRMWBinOp LLVMGetAtomicRMWBinOp(LLVMValueRef AtomicRMWInst)} */
    @NativeType("LLVMAtomicRMWBinOp")
    public static int LLVMGetAtomicRMWBinOp(@NativeType("LLVMValueRef") long AtomicRMWInst) {
        long __functionAddress = Functions.GetAtomicRMWBinOp;
        if (CHECKS) {
            check(__functionAddress);
            check(AtomicRMWInst);
        }
        return invokePI(AtomicRMWInst, __functionAddress);
    }

    // --- [ LLVMSetAtomicRMWBinOp ] ---

    /** {@code void LLVMSetAtomicRMWBinOp(LLVMValueRef AtomicRMWInst, LLVMAtomicRMWBinOp BinOp)} */
    public static void LLVMSetAtomicRMWBinOp(@NativeType("LLVMValueRef") long AtomicRMWInst, @NativeType("LLVMAtomicRMWBinOp") int BinOp) {
        long __functionAddress = Functions.SetAtomicRMWBinOp;
        if (CHECKS) {
            check(__functionAddress);
            check(AtomicRMWInst);
        }
        invokePV(AtomicRMWInst, BinOp, __functionAddress);
    }

    // --- [ LLVMBuildTrunc ] ---

    /** {@code LLVMValueRef LLVMBuildTrunc(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildTrunc(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildTrunc;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildTrunc(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildTrunc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildTrunc(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildTrunc(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildTrunc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildTrunc(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildZExt ] ---

    /** {@code LLVMValueRef LLVMBuildZExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildZExt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildZExt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildZExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildZExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildZExt(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildZExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildZExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildZExt(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildSExt ] ---

    /** {@code LLVMValueRef LLVMBuildSExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildSExt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildSExt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildSExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSExt(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildSExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildSExt(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFPToUI ] ---

    /** {@code LLVMValueRef LLVMBuildFPToUI(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildFPToUI(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPToUI;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFPToUI(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPToUI(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPToUI(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFPToUI(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPToUI(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFPToUI(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFPToSI ] ---

    /** {@code LLVMValueRef LLVMBuildFPToSI(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildFPToSI(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPToSI;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFPToSI(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPToSI(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPToSI(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFPToSI(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPToSI(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFPToSI(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildUIToFP ] ---

    /** {@code LLVMValueRef LLVMBuildUIToFP(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildUIToFP(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildUIToFP;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildUIToFP(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildUIToFP(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildUIToFP(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildUIToFP(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildUIToFP(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildUIToFP(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildSIToFP ] ---

    /** {@code LLVMValueRef LLVMBuildSIToFP(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildSIToFP(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildSIToFP;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildSIToFP(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSIToFP(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSIToFP(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildSIToFP(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSIToFP(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildSIToFP(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFPTrunc ] ---

    /** {@code LLVMValueRef LLVMBuildFPTrunc(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildFPTrunc(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPTrunc;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFPTrunc(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPTrunc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPTrunc(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFPTrunc(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPTrunc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFPTrunc(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFPExt ] ---

    /** {@code LLVMValueRef LLVMBuildFPExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildFPExt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPExt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFPExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPExt(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFPExt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFPExt(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildPtrToInt ] ---

    /** {@code LLVMValueRef LLVMBuildPtrToInt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildPtrToInt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildPtrToInt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildPtrToInt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrToInt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPtrToInt(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildPtrToInt(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrToInt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildPtrToInt(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildIntToPtr ] ---

    /** {@code LLVMValueRef LLVMBuildIntToPtr(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildIntToPtr(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildIntToPtr;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildIntToPtr(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntToPtr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIntToPtr(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildIntToPtr(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntToPtr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildIntToPtr(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildBitCast ] ---

    /** {@code LLVMValueRef LLVMBuildBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildBitCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildBitCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildAddrSpaceCast ] ---

    /** {@code LLVMValueRef LLVMBuildAddrSpaceCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildAddrSpaceCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildAddrSpaceCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildAddrSpaceCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAddrSpaceCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAddrSpaceCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildAddrSpaceCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAddrSpaceCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildAddrSpaceCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildZExtOrBitCast ] ---

    /** {@code LLVMValueRef LLVMBuildZExtOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildZExtOrBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildZExtOrBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildZExtOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildZExtOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildZExtOrBitCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildZExtOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildZExtOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildZExtOrBitCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildSExtOrBitCast ] ---

    /** {@code LLVMValueRef LLVMBuildSExtOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildSExtOrBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildSExtOrBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildSExtOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSExtOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSExtOrBitCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildSExtOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSExtOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildSExtOrBitCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildTruncOrBitCast ] ---

    /** {@code LLVMValueRef LLVMBuildTruncOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildTruncOrBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildTruncOrBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildTruncOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildTruncOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildTruncOrBitCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildTruncOrBitCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildTruncOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildTruncOrBitCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildCast ] ---

    /** {@code LLVMValueRef LLVMBuildCast(LLVMBuilderRef B, LLVMOpcode Op, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildCast(long B, int Op, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildCast;
        if (CHECKS) {
            check(B);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(B, Op, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCast(LLVMBuilderRef B, LLVMOpcode Op, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCast(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMOpcode") int Op, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCast(B, Op, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCast(LLVMBuilderRef B, LLVMOpcode Op, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCast(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMOpcode") int Op, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCast(B, Op, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildPointerCast ] ---

    /** {@code LLVMValueRef LLVMBuildPointerCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildPointerCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildPointerCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildPointerCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPointerCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPointerCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildPointerCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPointerCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildPointerCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildIntCast2 ] ---

    /** {@code LLVMValueRef LLVMBuildIntCast2(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, LLVMBool IsSigned, char const * Name)} */
    public static long nLLVMBuildIntCast2(long Builder, long Val, long DestTy, int IsSigned, long Name) {
        long __functionAddress = Functions.BuildIntCast2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, IsSigned, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildIntCast2(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, LLVMBool IsSigned, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntCast2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("LLVMBool") boolean IsSigned, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIntCast2(Builder, Val, DestTy, IsSigned ? 1 : 0, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildIntCast2(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, LLVMBool IsSigned, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntCast2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("LLVMBool") boolean IsSigned, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildIntCast2(Builder, Val, DestTy, IsSigned ? 1 : 0, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildIntCast ] ---

    /** {@code LLVMValueRef LLVMBuildIntCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildIntCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildIntCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildIntCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIntCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildIntCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildIntCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetCastOpcode ] ---

    /** {@code LLVMOpcode LLVMGetCastOpcode(LLVMValueRef Src, LLVMBool SrcIsSigned, LLVMTypeRef DestTy, LLVMBool DestIsSigned)} */
    @NativeType("LLVMOpcode")
    public static int LLVMGetCastOpcode(@NativeType("LLVMValueRef") long Src, @NativeType("LLVMBool") boolean SrcIsSigned, @NativeType("LLVMTypeRef") long DestTy, @NativeType("LLVMBool") boolean DestIsSigned) {
        long __functionAddress = Functions.GetCastOpcode;
        if (CHECKS) {
            check(__functionAddress);
            check(Src);
            check(DestTy);
        }
        return invokePPI(Src, SrcIsSigned ? 1 : 0, DestTy, DestIsSigned ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMBuildFPCast ] ---

    /** {@code LLVMValueRef LLVMBuildFPCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    public static long nLLVMBuildFPCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFPCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPCast(Builder, Val, DestTy, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFPCast(LLVMBuilderRef Builder, LLVMValueRef Val, LLVMTypeRef DestTy, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFPCast(Builder, Val, DestTy, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildICmp ] ---

    /** {@code LLVMValueRef LLVMBuildICmp(LLVMBuilderRef Builder, LLVMIntPredicate Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildICmp(long Builder, int Op, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildICmp;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, Op, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildICmp(LLVMBuilderRef Builder, LLVMIntPredicate Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildICmp(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMIntPredicate") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildICmp(Builder, Op, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildICmp(LLVMBuilderRef Builder, LLVMIntPredicate Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildICmp(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMIntPredicate") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildICmp(Builder, Op, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFCmp ] ---

    /** {@code LLVMValueRef LLVMBuildFCmp(LLVMBuilderRef Builder, LLVMRealPredicate Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildFCmp(long Builder, int Op, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFCmp;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, Op, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFCmp(LLVMBuilderRef Builder, LLVMRealPredicate Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFCmp(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMRealPredicate") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFCmp(Builder, Op, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFCmp(LLVMBuilderRef Builder, LLVMRealPredicate Op, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFCmp(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMRealPredicate") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFCmp(Builder, Op, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildPhi ] ---

    /** {@code LLVMValueRef LLVMBuildPhi(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    public static long nLLVMBuildPhi(long Builder, long Ty, long Name) {
        long __functionAddress = Functions.BuildPhi;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePPPP(Builder, Ty, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildPhi(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPhi(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPhi(Builder, Ty, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildPhi(LLVMBuilderRef Builder, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPhi(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildPhi(Builder, Ty, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildCall ] ---

    /** {@code LLVMValueRef LLVMBuildCall(LLVMBuilderRef Builder, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    public static long nLLVMBuildCall(long Builder, long Fn, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCall;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Fn);
        }
        return invokePPPPP(Builder, Fn, Args, NumArgs, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCall(LLVMBuilderRef Builder, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCall(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCall(Builder, Fn, memAddress(Args), Args.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCall(LLVMBuilderRef Builder, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCall(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCall(Builder, Fn, memAddress(Args), Args.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildCall2 ] ---

    /** {@code LLVMValueRef LLVMBuildCall2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    public static long nLLVMBuildCall2(long Builder, long Ty, long Fn, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCall2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Ty);
            check(Fn);
        }
        return invokePPPPPP(Builder, Ty, Fn, Args, NumArgs, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCall2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCall2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCall2(Builder, Ty, Fn, memAddress(Args), Args.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCall2(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCall2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCall2(Builder, Ty, Fn, memAddress(Args), Args.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildCallWithOperandBundles ] ---

    /** {@code LLVMValueRef LLVMBuildCallWithOperandBundles(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    public static long nLLVMBuildCallWithOperandBundles(long Builder, long Ty, long Fn, long Args, int NumArgs, long Bundles, int NumBundles, long Name) {
        long __functionAddress = Functions.BuildCallWithOperandBundles;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Ty);
            check(Fn);
        }
        return invokePPPPPPP(Builder, Ty, Fn, Args, NumArgs, Bundles, NumBundles, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildCallWithOperandBundles(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCallWithOperandBundles(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMOperandBundleRef *") PointerBuffer Bundles, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCallWithOperandBundles(Builder, Ty, Fn, memAddress(Args), Args.remaining(), memAddress(Bundles), Bundles.remaining(), memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildCallWithOperandBundles(LLVMBuilderRef Builder, LLVMTypeRef Ty, LLVMValueRef Fn, LLVMValueRef * Args, unsigned int NumArgs, LLVMOperandBundleRef * Bundles, unsigned NumBundles, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCallWithOperandBundles(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMOperandBundleRef *") PointerBuffer Bundles, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildCallWithOperandBundles(Builder, Ty, Fn, memAddress(Args), Args.remaining(), memAddress(Bundles), Bundles.remaining(), NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildSelect ] ---

    /** {@code LLVMValueRef LLVMBuildSelect(LLVMBuilderRef Builder, LLVMValueRef If, LLVMValueRef Then, LLVMValueRef Else, char const * Name)} */
    public static long nLLVMBuildSelect(long Builder, long If, long Then, long Else, long Name) {
        long __functionAddress = Functions.BuildSelect;
        if (CHECKS) {
            check(Builder);
            check(If);
            check(Then);
            check(Else);
        }
        return invokePPPPPP(Builder, If, Then, Else, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildSelect(LLVMBuilderRef Builder, LLVMValueRef If, LLVMValueRef Then, LLVMValueRef Else, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSelect(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long If, @NativeType("LLVMValueRef") long Then, @NativeType("LLVMValueRef") long Else, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSelect(Builder, If, Then, Else, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildSelect(LLVMBuilderRef Builder, LLVMValueRef If, LLVMValueRef Then, LLVMValueRef Else, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildSelect(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long If, @NativeType("LLVMValueRef") long Then, @NativeType("LLVMValueRef") long Else, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildSelect(Builder, If, Then, Else, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildVAArg ] ---

    /** {@code LLVMValueRef LLVMBuildVAArg(LLVMBuilderRef Builder, LLVMValueRef List, LLVMTypeRef Ty, char const * Name)} */
    public static long nLLVMBuildVAArg(long Builder, long List, long Ty, long Name) {
        long __functionAddress = Functions.BuildVAArg;
        if (CHECKS) {
            check(Builder);
            check(List);
            check(Ty);
        }
        return invokePPPPP(Builder, List, Ty, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildVAArg(LLVMBuilderRef Builder, LLVMValueRef List, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildVAArg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long List, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildVAArg(Builder, List, Ty, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildVAArg(LLVMBuilderRef Builder, LLVMValueRef List, LLVMTypeRef Ty, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildVAArg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long List, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildVAArg(Builder, List, Ty, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildExtractElement ] ---

    /** {@code LLVMValueRef LLVMBuildExtractElement(LLVMBuilderRef Builder, LLVMValueRef VecVal, LLVMValueRef Index, char const * Name)} */
    public static long nLLVMBuildExtractElement(long Builder, long VecVal, long Index, long Name) {
        long __functionAddress = Functions.BuildExtractElement;
        if (CHECKS) {
            check(Builder);
            check(VecVal);
            check(Index);
        }
        return invokePPPPP(Builder, VecVal, Index, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildExtractElement(LLVMBuilderRef Builder, LLVMValueRef VecVal, LLVMValueRef Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExtractElement(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long VecVal, @NativeType("LLVMValueRef") long Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExtractElement(Builder, VecVal, Index, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildExtractElement(LLVMBuilderRef Builder, LLVMValueRef VecVal, LLVMValueRef Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExtractElement(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long VecVal, @NativeType("LLVMValueRef") long Index, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildExtractElement(Builder, VecVal, Index, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildInsertElement ] ---

    /** {@code LLVMValueRef LLVMBuildInsertElement(LLVMBuilderRef Builder, LLVMValueRef VecVal, LLVMValueRef EltVal, LLVMValueRef Index, char const * Name)} */
    public static long nLLVMBuildInsertElement(long Builder, long VecVal, long EltVal, long Index, long Name) {
        long __functionAddress = Functions.BuildInsertElement;
        if (CHECKS) {
            check(Builder);
            check(VecVal);
            check(EltVal);
            check(Index);
        }
        return invokePPPPPP(Builder, VecVal, EltVal, Index, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildInsertElement(LLVMBuilderRef Builder, LLVMValueRef VecVal, LLVMValueRef EltVal, LLVMValueRef Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInsertElement(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long VecVal, @NativeType("LLVMValueRef") long EltVal, @NativeType("LLVMValueRef") long Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInsertElement(Builder, VecVal, EltVal, Index, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildInsertElement(LLVMBuilderRef Builder, LLVMValueRef VecVal, LLVMValueRef EltVal, LLVMValueRef Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInsertElement(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long VecVal, @NativeType("LLVMValueRef") long EltVal, @NativeType("LLVMValueRef") long Index, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildInsertElement(Builder, VecVal, EltVal, Index, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildShuffleVector ] ---

    /** {@code LLVMValueRef LLVMBuildShuffleVector(LLVMBuilderRef Builder, LLVMValueRef V1, LLVMValueRef V2, LLVMValueRef Mask, char const * Name)} */
    public static long nLLVMBuildShuffleVector(long Builder, long V1, long V2, long Mask, long Name) {
        long __functionAddress = Functions.BuildShuffleVector;
        if (CHECKS) {
            check(Builder);
            check(V1);
            check(V2);
            check(Mask);
        }
        return invokePPPPPP(Builder, V1, V2, Mask, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildShuffleVector(LLVMBuilderRef Builder, LLVMValueRef V1, LLVMValueRef V2, LLVMValueRef Mask, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildShuffleVector(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V1, @NativeType("LLVMValueRef") long V2, @NativeType("LLVMValueRef") long Mask, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildShuffleVector(Builder, V1, V2, Mask, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildShuffleVector(LLVMBuilderRef Builder, LLVMValueRef V1, LLVMValueRef V2, LLVMValueRef Mask, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildShuffleVector(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V1, @NativeType("LLVMValueRef") long V2, @NativeType("LLVMValueRef") long Mask, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildShuffleVector(Builder, V1, V2, Mask, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildExtractValue ] ---

    /** {@code LLVMValueRef LLVMBuildExtractValue(LLVMBuilderRef Builder, LLVMValueRef AggVal, unsigned int Index, char const * Name)} */
    public static long nLLVMBuildExtractValue(long Builder, long AggVal, int Index, long Name) {
        long __functionAddress = Functions.BuildExtractValue;
        if (CHECKS) {
            check(Builder);
            check(AggVal);
        }
        return invokePPPP(Builder, AggVal, Index, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildExtractValue(LLVMBuilderRef Builder, LLVMValueRef AggVal, unsigned int Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExtractValue(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long AggVal, @NativeType("unsigned int") int Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExtractValue(Builder, AggVal, Index, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildExtractValue(LLVMBuilderRef Builder, LLVMValueRef AggVal, unsigned int Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildExtractValue(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long AggVal, @NativeType("unsigned int") int Index, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildExtractValue(Builder, AggVal, Index, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildInsertValue ] ---

    /** {@code LLVMValueRef LLVMBuildInsertValue(LLVMBuilderRef Builder, LLVMValueRef AggVal, LLVMValueRef EltVal, unsigned int Index, char const * Name)} */
    public static long nLLVMBuildInsertValue(long Builder, long AggVal, long EltVal, int Index, long Name) {
        long __functionAddress = Functions.BuildInsertValue;
        if (CHECKS) {
            check(Builder);
            check(AggVal);
            check(EltVal);
        }
        return invokePPPPP(Builder, AggVal, EltVal, Index, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildInsertValue(LLVMBuilderRef Builder, LLVMValueRef AggVal, LLVMValueRef EltVal, unsigned int Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInsertValue(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long AggVal, @NativeType("LLVMValueRef") long EltVal, @NativeType("unsigned int") int Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInsertValue(Builder, AggVal, EltVal, Index, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildInsertValue(LLVMBuilderRef Builder, LLVMValueRef AggVal, LLVMValueRef EltVal, unsigned int Index, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInsertValue(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long AggVal, @NativeType("LLVMValueRef") long EltVal, @NativeType("unsigned int") int Index, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildInsertValue(Builder, AggVal, EltVal, Index, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFreeze ] ---

    /** {@code LLVMValueRef LLVMBuildFreeze(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    public static long nLLVMBuildFreeze(long Builder, long Val, long Name) {
        long __functionAddress = Functions.BuildFreeze;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Val);
        }
        return invokePPPP(Builder, Val, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFreeze(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFreeze(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFreeze(Builder, Val, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFreeze(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFreeze(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFreeze(Builder, Val, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildIsNull ] ---

    /** {@code LLVMValueRef LLVMBuildIsNull(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    public static long nLLVMBuildIsNull(long Builder, long Val, long Name) {
        long __functionAddress = Functions.BuildIsNull;
        if (CHECKS) {
            check(Builder);
            check(Val);
        }
        return invokePPPP(Builder, Val, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildIsNull(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIsNull(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIsNull(Builder, Val, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildIsNull(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIsNull(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildIsNull(Builder, Val, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildIsNotNull ] ---

    /** {@code LLVMValueRef LLVMBuildIsNotNull(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    public static long nLLVMBuildIsNotNull(long Builder, long Val, long Name) {
        long __functionAddress = Functions.BuildIsNotNull;
        if (CHECKS) {
            check(Builder);
            check(Val);
        }
        return invokePPPP(Builder, Val, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildIsNotNull(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIsNotNull(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIsNotNull(Builder, Val, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildIsNotNull(LLVMBuilderRef Builder, LLVMValueRef Val, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildIsNotNull(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildIsNotNull(Builder, Val, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildPtrDiff ] ---

    /** {@code LLVMValueRef LLVMBuildPtrDiff(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildPtrDiff(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildPtrDiff;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildPtrDiff(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrDiff(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPtrDiff(Builder, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildPtrDiff(LLVMBuilderRef Builder, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrDiff(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildPtrDiff(Builder, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildPtrDiff2 ] ---

    /** {@code LLVMValueRef LLVMBuildPtrDiff2(LLVMBuilderRef Builder, LLVMTypeRef ElemTy, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    public static long nLLVMBuildPtrDiff2(long Builder, long ElemTy, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildPtrDiff2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(ElemTy);
            check(LHS);
            check(RHS);
        }
        return invokePPPPPP(Builder, ElemTy, LHS, RHS, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildPtrDiff2(LLVMBuilderRef Builder, LLVMTypeRef ElemTy, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrDiff2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long ElemTy, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPtrDiff2(Builder, ElemTy, LHS, RHS, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildPtrDiff2(LLVMBuilderRef Builder, LLVMTypeRef ElemTy, LLVMValueRef LHS, LLVMValueRef RHS, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrDiff2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long ElemTy, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildPtrDiff2(Builder, ElemTy, LHS, RHS, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFence ] ---

    /** {@code LLVMValueRef LLVMBuildFence(LLVMBuilderRef B, LLVMAtomicOrdering ordering, LLVMBool singleThread, char const * Name)} */
    public static long nLLVMBuildFence(long B, int ordering, int singleThread, long Name) {
        long __functionAddress = Functions.BuildFence;
        if (CHECKS) {
            check(B);
        }
        return invokePPP(B, ordering, singleThread, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFence(LLVMBuilderRef B, LLVMAtomicOrdering ordering, LLVMBool singleThread, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFence(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("LLVMBool") boolean singleThread, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFence(B, ordering, singleThread ? 1 : 0, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFence(LLVMBuilderRef B, LLVMAtomicOrdering ordering, LLVMBool singleThread, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFence(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("LLVMBool") boolean singleThread, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFence(B, ordering, singleThread ? 1 : 0, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildFenceSyncScope ] ---

    /** {@code LLVMValueRef LLVMBuildFenceSyncScope(LLVMBuilderRef B, LLVMAtomicOrdering ordering, unsigned SSID, char const * Name)} */
    public static long nLLVMBuildFenceSyncScope(long B, int ordering, int SSID, long Name) {
        long __functionAddress = Functions.BuildFenceSyncScope;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
        }
        return invokePPP(B, ordering, SSID, Name, __functionAddress);
    }

    /** {@code LLVMValueRef LLVMBuildFenceSyncScope(LLVMBuilderRef B, LLVMAtomicOrdering ordering, unsigned SSID, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFenceSyncScope(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("unsigned") int SSID, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFenceSyncScope(B, ordering, SSID, memAddress(Name));
    }

    /** {@code LLVMValueRef LLVMBuildFenceSyncScope(LLVMBuilderRef B, LLVMAtomicOrdering ordering, unsigned SSID, char const * Name)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildFenceSyncScope(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("unsigned") int SSID, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildFenceSyncScope(B, ordering, SSID, NameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMBuildAtomicRMW ] ---

    /** {@code LLVMValueRef LLVMBuildAtomicRMW(LLVMBuilderRef B, LLVMAtomicRMWBinOp op, LLVMValueRef PTR, LLVMValueRef Val, LLVMAtomicOrdering ordering, LLVMBool singleThread)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAtomicRMW(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicRMWBinOp") int op, @NativeType("LLVMValueRef") long PTR, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("LLVMBool") boolean singleThread) {
        long __functionAddress = Functions.BuildAtomicRMW;
        if (CHECKS) {
            check(B);
            check(PTR);
            check(Val);
        }
        return invokePPPP(B, op, PTR, Val, ordering, singleThread ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMBuildAtomicRMWSyncScope ] ---

    /** {@code LLVMValueRef LLVMBuildAtomicRMWSyncScope(LLVMBuilderRef B, LLVMAtomicRMWBinOp op, LLVMValueRef PTR, LLVMValueRef Val, LLVMAtomicOrdering ordering, unsigned SSID)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAtomicRMWSyncScope(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicRMWBinOp") int op, @NativeType("LLVMValueRef") long PTR, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("unsigned") int SSID) {
        long __functionAddress = Functions.BuildAtomicRMWSyncScope;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(PTR);
            check(Val);
        }
        return invokePPPP(B, op, PTR, Val, ordering, SSID, __functionAddress);
    }

    // --- [ LLVMBuildAtomicCmpXchg ] ---

    /** {@code LLVMValueRef LLVMBuildAtomicCmpXchg(LLVMBuilderRef B, LLVMValueRef Ptr, LLVMValueRef Cmp, LLVMValueRef New, LLVMAtomicOrdering SuccessOrdering, LLVMAtomicOrdering FailureOrdering, LLVMBool SingleThread)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAtomicCmpXchg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Ptr, @NativeType("LLVMValueRef") long Cmp, @NativeType("LLVMValueRef") long New, @NativeType("LLVMAtomicOrdering") int SuccessOrdering, @NativeType("LLVMAtomicOrdering") int FailureOrdering, @NativeType("LLVMBool") boolean SingleThread) {
        long __functionAddress = Functions.BuildAtomicCmpXchg;
        if (CHECKS) {
            check(B);
            check(Ptr);
            check(Cmp);
            check(New);
        }
        return invokePPPPP(B, Ptr, Cmp, New, SuccessOrdering, FailureOrdering, SingleThread ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMBuildAtomicCmpXchgSyncScope ] ---

    /** {@code LLVMValueRef LLVMBuildAtomicCmpXchgSyncScope(LLVMBuilderRef B, LLVMValueRef Ptr, LLVMValueRef Cmp, LLVMValueRef New, LLVMAtomicOrdering SuccessOrdering, LLVMAtomicOrdering FailureOrdering, unsigned SSID)} */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAtomicCmpXchgSyncScope(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Ptr, @NativeType("LLVMValueRef") long Cmp, @NativeType("LLVMValueRef") long New, @NativeType("LLVMAtomicOrdering") int SuccessOrdering, @NativeType("LLVMAtomicOrdering") int FailureOrdering, @NativeType("unsigned") int SSID) {
        long __functionAddress = Functions.BuildAtomicCmpXchgSyncScope;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(Ptr);
            check(Cmp);
            check(New);
        }
        return invokePPPPP(B, Ptr, Cmp, New, SuccessOrdering, FailureOrdering, SSID, __functionAddress);
    }

    // --- [ LLVMGetNumMaskElements ] ---

    /** {@code unsigned LLVMGetNumMaskElements(LLVMValueRef ShuffleVectorInst)} */
    @NativeType("unsigned")
    public static int LLVMGetNumMaskElements(@NativeType("LLVMValueRef") long ShuffleVectorInst) {
        long __functionAddress = Functions.GetNumMaskElements;
        if (CHECKS) {
            check(__functionAddress);
            check(ShuffleVectorInst);
        }
        return invokePI(ShuffleVectorInst, __functionAddress);
    }

    // --- [ LLVMGetUndefMaskElem ] ---

    /** {@code int LLVMGetUndefMaskElem(void)} */
    public static int LLVMGetUndefMaskElem() {
        long __functionAddress = Functions.GetUndefMaskElem;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(__functionAddress);
    }

    // --- [ LLVMGetMaskValue ] ---

    /** {@code int LLVMGetMaskValue(LLVMValueRef ShuffleVectorInst, unsigned Elt)} */
    public static int LLVMGetMaskValue(@NativeType("LLVMValueRef") long ShuffleVectorInst, @NativeType("unsigned") int Elt) {
        long __functionAddress = Functions.GetMaskValue;
        if (CHECKS) {
            check(__functionAddress);
            check(ShuffleVectorInst);
        }
        return invokePI(ShuffleVectorInst, Elt, __functionAddress);
    }

    // --- [ LLVMIsAtomicSingleThread ] ---

    /** {@code LLVMBool LLVMIsAtomicSingleThread(LLVMValueRef AtomicInst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsAtomicSingleThread(@NativeType("LLVMValueRef") long AtomicInst) {
        long __functionAddress = Functions.IsAtomicSingleThread;
        if (CHECKS) {
            check(AtomicInst);
        }
        return invokePI(AtomicInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetAtomicSingleThread ] ---

    /** {@code void LLVMSetAtomicSingleThread(LLVMValueRef AtomicInst, LLVMBool SingleThread)} */
    public static void LLVMSetAtomicSingleThread(@NativeType("LLVMValueRef") long AtomicInst, @NativeType("LLVMBool") boolean SingleThread) {
        long __functionAddress = Functions.SetAtomicSingleThread;
        if (CHECKS) {
            check(AtomicInst);
        }
        invokePV(AtomicInst, SingleThread ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMIsAtomic ] ---

    /** {@code LLVMBool LLVMIsAtomic(LLVMValueRef Inst)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsAtomic(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.IsAtomic;
        if (CHECKS) {
            check(__functionAddress);
            check(Inst);
        }
        return invokePI(Inst, __functionAddress) != 0;
    }

    // --- [ LLVMGetAtomicSyncScopeID ] ---

    /** {@code unsigned LLVMGetAtomicSyncScopeID(LLVMValueRef AtomicInst)} */
    @NativeType("unsigned")
    public static int LLVMGetAtomicSyncScopeID(@NativeType("LLVMValueRef") long AtomicInst) {
        long __functionAddress = Functions.GetAtomicSyncScopeID;
        if (CHECKS) {
            check(__functionAddress);
            check(AtomicInst);
        }
        return invokePI(AtomicInst, __functionAddress);
    }

    // --- [ LLVMSetAtomicSyncScopeID ] ---

    /** {@code void LLVMSetAtomicSyncScopeID(LLVMValueRef AtomicInst, unsigned SSID)} */
    public static void LLVMSetAtomicSyncScopeID(@NativeType("LLVMValueRef") long AtomicInst, @NativeType("unsigned") int SSID) {
        long __functionAddress = Functions.SetAtomicSyncScopeID;
        if (CHECKS) {
            check(__functionAddress);
            check(AtomicInst);
        }
        invokePV(AtomicInst, SSID, __functionAddress);
    }

    // --- [ LLVMGetCmpXchgSuccessOrdering ] ---

    /** {@code LLVMAtomicOrdering LLVMGetCmpXchgSuccessOrdering(LLVMValueRef CmpXchgInst)} */
    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetCmpXchgSuccessOrdering(@NativeType("LLVMValueRef") long CmpXchgInst) {
        long __functionAddress = Functions.GetCmpXchgSuccessOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        return invokePI(CmpXchgInst, __functionAddress);
    }

    // --- [ LLVMSetCmpXchgSuccessOrdering ] ---

    /** {@code void LLVMSetCmpXchgSuccessOrdering(LLVMValueRef CmpXchgInst, LLVMAtomicOrdering Ordering)} */
    public static void LLVMSetCmpXchgSuccessOrdering(@NativeType("LLVMValueRef") long CmpXchgInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetCmpXchgSuccessOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        invokePV(CmpXchgInst, Ordering, __functionAddress);
    }

    // --- [ LLVMGetCmpXchgFailureOrdering ] ---

    /** {@code LLVMAtomicOrdering LLVMGetCmpXchgFailureOrdering(LLVMValueRef CmpXchgInst)} */
    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetCmpXchgFailureOrdering(@NativeType("LLVMValueRef") long CmpXchgInst) {
        long __functionAddress = Functions.GetCmpXchgFailureOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        return invokePI(CmpXchgInst, __functionAddress);
    }

    // --- [ LLVMSetCmpXchgFailureOrdering ] ---

    /** {@code void LLVMSetCmpXchgFailureOrdering(LLVMValueRef CmpXchgInst, LLVMAtomicOrdering Ordering)} */
    public static void LLVMSetCmpXchgFailureOrdering(@NativeType("LLVMValueRef") long CmpXchgInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetCmpXchgFailureOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        invokePV(CmpXchgInst, Ordering, __functionAddress);
    }

    // --- [ LLVMCreateModuleProviderForExistingModule ] ---

    /** {@code LLVMModuleProviderRef LLVMCreateModuleProviderForExistingModule(LLVMModuleRef M)} */
    @NativeType("LLVMModuleProviderRef")
    public static long LLVMCreateModuleProviderForExistingModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateModuleProviderForExistingModule;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMDisposeModuleProvider ] ---

    /** {@code void LLVMDisposeModuleProvider(LLVMModuleProviderRef M)} */
    public static void LLVMDisposeModuleProvider(@NativeType("LLVMModuleProviderRef") long M) {
        long __functionAddress = Functions.DisposeModuleProvider;
        if (CHECKS) {
            check(M);
        }
        invokePV(M, __functionAddress);
    }

    // --- [ LLVMCreateMemoryBufferWithContentsOfFile ] ---

    /** {@code LLVMBool LLVMCreateMemoryBufferWithContentsOfFile(char const * Path, LLVMMemoryBufferRef * OutMemBuf, char ** OutMessage)} */
    public static int nLLVMCreateMemoryBufferWithContentsOfFile(long Path, long OutMemBuf, long OutMessage) {
        long __functionAddress = Functions.CreateMemoryBufferWithContentsOfFile;
        return invokePPPI(Path, OutMemBuf, OutMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMCreateMemoryBufferWithContentsOfFile(char const * Path, LLVMMemoryBufferRef * OutMemBuf, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMCreateMemoryBufferWithContentsOfFile(@NativeType("char const *") ByteBuffer Path, @NativeType("LLVMMemoryBufferRef *") PointerBuffer OutMemBuf, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            checkNT1(Path);
            check(OutMemBuf, 1);
            check(OutMessage, 1);
        }
        return nLLVMCreateMemoryBufferWithContentsOfFile(memAddress(Path), memAddress(OutMemBuf), memAddress(OutMessage)) != 0;
    }

    /** {@code LLVMBool LLVMCreateMemoryBufferWithContentsOfFile(char const * Path, LLVMMemoryBufferRef * OutMemBuf, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMCreateMemoryBufferWithContentsOfFile(@NativeType("char const *") CharSequence Path, @NativeType("LLVMMemoryBufferRef *") PointerBuffer OutMemBuf, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutMemBuf, 1);
            check(OutMessage, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Path, true);
            long PathEncoded = stack.getPointerAddress();
            return nLLVMCreateMemoryBufferWithContentsOfFile(PathEncoded, memAddress(OutMemBuf), memAddress(OutMessage)) != 0;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCreateMemoryBufferWithSTDIN ] ---

    /** {@code LLVMBool LLVMCreateMemoryBufferWithSTDIN(LLVMMemoryBufferRef * OutMemBuf, char ** OutMessage)} */
    public static int nLLVMCreateMemoryBufferWithSTDIN(long OutMemBuf, long OutMessage) {
        long __functionAddress = Functions.CreateMemoryBufferWithSTDIN;
        return invokePPI(OutMemBuf, OutMessage, __functionAddress);
    }

    /** {@code LLVMBool LLVMCreateMemoryBufferWithSTDIN(LLVMMemoryBufferRef * OutMemBuf, char ** OutMessage)} */
    @NativeType("LLVMBool")
    public static boolean LLVMCreateMemoryBufferWithSTDIN(@NativeType("LLVMMemoryBufferRef *") PointerBuffer OutMemBuf, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutMemBuf, 1);
            check(OutMessage, 1);
        }
        return nLLVMCreateMemoryBufferWithSTDIN(memAddress(OutMemBuf), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMCreateMemoryBufferWithMemoryRange ] ---

    /** {@code LLVMMemoryBufferRef LLVMCreateMemoryBufferWithMemoryRange(char const * InputData, size_t InputDataLength, char const * BufferName, LLVMBool RequiresNullTerminator)} */
    public static long nLLVMCreateMemoryBufferWithMemoryRange(long InputData, long InputDataLength, long BufferName, int RequiresNullTerminator) {
        long __functionAddress = Functions.CreateMemoryBufferWithMemoryRange;
        return invokePPPP(InputData, InputDataLength, BufferName, RequiresNullTerminator, __functionAddress);
    }

    /** {@code LLVMMemoryBufferRef LLVMCreateMemoryBufferWithMemoryRange(char const * InputData, size_t InputDataLength, char const * BufferName, LLVMBool RequiresNullTerminator)} */
    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMCreateMemoryBufferWithMemoryRange(@NativeType("char const *") ByteBuffer InputData, @NativeType("char const *") ByteBuffer BufferName, @NativeType("LLVMBool") boolean RequiresNullTerminator) {
        if (CHECKS) {
            checkNT1(BufferName);
        }
        return nLLVMCreateMemoryBufferWithMemoryRange(memAddress(InputData), InputData.remaining(), memAddress(BufferName), RequiresNullTerminator ? 1 : 0);
    }

    /** {@code LLVMMemoryBufferRef LLVMCreateMemoryBufferWithMemoryRange(char const * InputData, size_t InputDataLength, char const * BufferName, LLVMBool RequiresNullTerminator)} */
    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMCreateMemoryBufferWithMemoryRange(@NativeType("char const *") ByteBuffer InputData, @NativeType("char const *") CharSequence BufferName, @NativeType("LLVMBool") boolean RequiresNullTerminator) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(BufferName, true);
            long BufferNameEncoded = stack.getPointerAddress();
            return nLLVMCreateMemoryBufferWithMemoryRange(memAddress(InputData), InputData.remaining(), BufferNameEncoded, RequiresNullTerminator ? 1 : 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCreateMemoryBufferWithMemoryRangeCopy ] ---

    /** {@code LLVMMemoryBufferRef LLVMCreateMemoryBufferWithMemoryRangeCopy(char const * InputData, size_t InputDataLength, char const * BufferName)} */
    public static long nLLVMCreateMemoryBufferWithMemoryRangeCopy(long InputData, long InputDataLength, long BufferName) {
        long __functionAddress = Functions.CreateMemoryBufferWithMemoryRangeCopy;
        return invokePPPP(InputData, InputDataLength, BufferName, __functionAddress);
    }

    /** {@code LLVMMemoryBufferRef LLVMCreateMemoryBufferWithMemoryRangeCopy(char const * InputData, size_t InputDataLength, char const * BufferName)} */
    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMCreateMemoryBufferWithMemoryRangeCopy(@NativeType("char const *") ByteBuffer InputData, @NativeType("char const *") ByteBuffer BufferName) {
        if (CHECKS) {
            checkNT1(BufferName);
        }
        return nLLVMCreateMemoryBufferWithMemoryRangeCopy(memAddress(InputData), InputData.remaining(), memAddress(BufferName));
    }

    /** {@code LLVMMemoryBufferRef LLVMCreateMemoryBufferWithMemoryRangeCopy(char const * InputData, size_t InputDataLength, char const * BufferName)} */
    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMCreateMemoryBufferWithMemoryRangeCopy(@NativeType("char const *") ByteBuffer InputData, @NativeType("char const *") CharSequence BufferName) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(BufferName, true);
            long BufferNameEncoded = stack.getPointerAddress();
            return nLLVMCreateMemoryBufferWithMemoryRangeCopy(memAddress(InputData), InputData.remaining(), BufferNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMGetBufferStart ] ---

    /** {@code char const * LLVMGetBufferStart(LLVMMemoryBufferRef MemBuf)} */
    public static long nLLVMGetBufferStart(long MemBuf) {
        long __functionAddress = Functions.GetBufferStart;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePP(MemBuf, __functionAddress);
    }

    /** {@code char const * LLVMGetBufferStart(LLVMMemoryBufferRef MemBuf)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer LLVMGetBufferStart(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __result = nLLVMGetBufferStart(MemBuf);
        return memByteBufferSafe(__result, (int)LLVMGetBufferSize(MemBuf));
    }

    /** {@code char const * LLVMGetBufferStart(LLVMMemoryBufferRef MemBuf)} */
    @NativeType("char const *")
    public static @Nullable ByteBuffer LLVMGetBufferStart(@NativeType("LLVMMemoryBufferRef") long MemBuf, long length) {
        long __result = nLLVMGetBufferStart(MemBuf);
        return memByteBufferSafe(__result, (int)length);
    }

    // --- [ LLVMGetBufferSize ] ---

    /** {@code size_t LLVMGetBufferSize(LLVMMemoryBufferRef MemBuf)} */
    @NativeType("size_t")
    public static long LLVMGetBufferSize(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __functionAddress = Functions.GetBufferSize;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePP(MemBuf, __functionAddress);
    }

    // --- [ LLVMDisposeMemoryBuffer ] ---

    /** {@code void LLVMDisposeMemoryBuffer(LLVMMemoryBufferRef MemBuf)} */
    public static void LLVMDisposeMemoryBuffer(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __functionAddress = Functions.DisposeMemoryBuffer;
        if (CHECKS) {
            check(MemBuf);
        }
        invokePV(MemBuf, __functionAddress);
    }

    // --- [ LLVMGetGlobalPassRegistry ] ---

    /** {@code LLVMPassRegistryRef LLVMGetGlobalPassRegistry(void)} */
    @NativeType("LLVMPassRegistryRef")
    public static long LLVMGetGlobalPassRegistry() {
        long __functionAddress = Functions.GetGlobalPassRegistry;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreatePassManager ] ---

    /** {@code LLVMPassManagerRef LLVMCreatePassManager(void)} */
    @NativeType("LLVMPassManagerRef")
    public static long LLVMCreatePassManager() {
        long __functionAddress = Functions.CreatePassManager;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreateFunctionPassManagerForModule ] ---

    /** {@code LLVMPassManagerRef LLVMCreateFunctionPassManagerForModule(LLVMModuleRef M)} */
    @NativeType("LLVMPassManagerRef")
    public static long LLVMCreateFunctionPassManagerForModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateFunctionPassManagerForModule;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMCreateFunctionPassManager ] ---

    /** {@code LLVMPassManagerRef LLVMCreateFunctionPassManager(LLVMModuleProviderRef MP)} */
    @NativeType("LLVMPassManagerRef")
    public static long LLVMCreateFunctionPassManager(@NativeType("LLVMModuleProviderRef") long MP) {
        long __functionAddress = Functions.CreateFunctionPassManager;
        if (CHECKS) {
            check(MP);
        }
        return invokePP(MP, __functionAddress);
    }

    // --- [ LLVMRunPassManager ] ---

    /** {@code LLVMBool LLVMRunPassManager(LLVMPassManagerRef PM, LLVMModuleRef M)} */
    @NativeType("LLVMBool")
    public static boolean LLVMRunPassManager(@NativeType("LLVMPassManagerRef") long PM, @NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.RunPassManager;
        if (CHECKS) {
            check(PM);
            check(M);
        }
        return invokePPI(PM, M, __functionAddress) != 0;
    }

    // --- [ LLVMInitializeFunctionPassManager ] ---

    /** {@code LLVMBool LLVMInitializeFunctionPassManager(LLVMPassManagerRef FPM)} */
    @NativeType("LLVMBool")
    public static boolean LLVMInitializeFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM) {
        long __functionAddress = Functions.InitializeFunctionPassManager;
        if (CHECKS) {
            check(FPM);
        }
        return invokePI(FPM, __functionAddress) != 0;
    }

    // --- [ LLVMRunFunctionPassManager ] ---

    /** {@code LLVMBool LLVMRunFunctionPassManager(LLVMPassManagerRef FPM, LLVMValueRef F)} */
    @NativeType("LLVMBool")
    public static boolean LLVMRunFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM, @NativeType("LLVMValueRef") long F) {
        long __functionAddress = Functions.RunFunctionPassManager;
        if (CHECKS) {
            check(FPM);
            check(F);
        }
        return invokePPI(FPM, F, __functionAddress) != 0;
    }

    // --- [ LLVMFinalizeFunctionPassManager ] ---

    /** {@code LLVMBool LLVMFinalizeFunctionPassManager(LLVMPassManagerRef FPM)} */
    @NativeType("LLVMBool")
    public static boolean LLVMFinalizeFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM) {
        long __functionAddress = Functions.FinalizeFunctionPassManager;
        if (CHECKS) {
            check(FPM);
        }
        return invokePI(FPM, __functionAddress) != 0;
    }

    // --- [ LLVMDisposePassManager ] ---

    /** {@code void LLVMDisposePassManager(LLVMPassManagerRef PM)} */
    public static void LLVMDisposePassManager(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.DisposePassManager;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMStartMultithreaded ] ---

    /** {@code LLVMBool LLVMStartMultithreaded(void)} */
    @NativeType("LLVMBool")
    public static boolean LLVMStartMultithreaded() {
        long __functionAddress = Functions.StartMultithreaded;
        return invokeI(__functionAddress) != 0;
    }

    // --- [ LLVMStopMultithreaded ] ---

    /** {@code void LLVMStopMultithreaded(void)} */
    public static void LLVMStopMultithreaded() {
        long __functionAddress = Functions.StopMultithreaded;
        invokeV(__functionAddress);
    }

    // --- [ LLVMIsMultithreaded ] ---

    /** {@code LLVMBool LLVMIsMultithreaded(void)} */
    @NativeType("LLVMBool")
    public static boolean LLVMIsMultithreaded() {
        long __functionAddress = Functions.IsMultithreaded;
        return invokeI(__functionAddress) != 0;
    }

}