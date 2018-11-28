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

public class LLVMCore {

    /**
     * {@code LLVMOpcode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMRet Ret} - Terminator Instructions</li>
     * <li>{@link #LLVMBr Br} - Terminator Instructions</li>
     * <li>{@link #LLVMSwitch Switch} - Terminator Instructions</li>
     * <li>{@link #LLVMIndirectBr IndirectBr} - Terminator Instructions</li>
     * <li>{@link #LLVMInvoke Invoke} - Terminator Instructions</li>
     * <li>{@link #LLVMUnreachable Unreachable} - removed 6 due to API changes</li>
     * <li>{@link #LLVMAdd Add} - Standard Binary Operators</li>
     * <li>{@link #LLVMFAdd FAdd} - Standard Binary Operators</li>
     * <li>{@link #LLVMSub Sub} - Standard Binary Operators</li>
     * <li>{@link #LLVMFSub FSub} - Standard Binary Operators</li>
     * <li>{@link #LLVMMul Mul} - Standard Binary Operators</li>
     * <li>{@link #LLVMFMul FMul} - Standard Binary Operators</li>
     * <li>{@link #LLVMUDiv UDiv} - Standard Binary Operators</li>
     * <li>{@link #LLVMSDiv SDiv} - Standard Binary Operators</li>
     * <li>{@link #LLVMFDiv FDiv} - Standard Binary Operators</li>
     * <li>{@link #LLVMURem URem} - Standard Binary Operators</li>
     * <li>{@link #LLVMSRem SRem} - Standard Binary Operators</li>
     * <li>{@link #LLVMFRem FRem} - Standard Binary Operators</li>
     * <li>{@link #LLVMShl Shl} - Logical Operators</li>
     * <li>{@link #LLVMLShr LShr} - Logical Operators</li>
     * <li>{@link #LLVMAShr AShr} - Logical Operators</li>
     * <li>{@link #LLVMAnd And} - Logical Operators</li>
     * <li>{@link #LLVMOr Or} - Logical Operators</li>
     * <li>{@link #LLVMXor Xor} - Logical Operators</li>
     * <li>{@link #LLVMAlloca Alloca} - Memory Operators</li>
     * <li>{@link #LLVMLoad Load} - Memory Operators</li>
     * <li>{@link #LLVMStore Store} - Memory Operators</li>
     * <li>{@link #LLVMGetElementPtr GetElementPtr} - Memory Operators</li>
     * <li>{@link #LLVMTrunc Trunc} - Cast Operators</li>
     * <li>{@link #LLVMZExt ZExt} - Cast Operators</li>
     * <li>{@link #LLVMSExt SExt} - Cast Operators</li>
     * <li>{@link #LLVMFPToUI FPToUI} - Cast Operators</li>
     * <li>{@link #LLVMFPToSI FPToSI} - Cast Operators</li>
     * <li>{@link #LLVMUIToFP UIToFP} - Cast Operators</li>
     * <li>{@link #LLVMSIToFP SIToFP} - Cast Operators</li>
     * <li>{@link #LLVMFPTrunc FPTrunc} - Cast Operators</li>
     * <li>{@link #LLVMFPExt FPExt} - Cast Operators</li>
     * <li>{@link #LLVMPtrToInt PtrToInt} - Cast Operators</li>
     * <li>{@link #LLVMIntToPtr IntToPtr} - Cast Operators</li>
     * <li>{@link #LLVMBitCast BitCast} - Cast Operators</li>
     * <li>{@link #LLVMAddrSpaceCast AddrSpaceCast} - Cast Operators</li>
     * <li>{@link #LLVMICmp ICmp} - Other Operators</li>
     * <li>{@link #LLVMFCmp FCmp} - Other Operators</li>
     * <li>{@link #LLVMPHI PHI} - Other Operators</li>
     * <li>{@link #LLVMCall Call} - Other Operators</li>
     * <li>{@link #LLVMSelect Select} - Other Operators</li>
     * <li>{@link #LLVMUserOp1 UserOp1} - Other Operators</li>
     * <li>{@link #LLVMUserOp2 UserOp2} - Other Operators</li>
     * <li>{@link #LLVMVAArg VAArg} - Other Operators</li>
     * <li>{@link #LLVMExtractElement ExtractElement} - Other Operators</li>
     * <li>{@link #LLVMInsertElement InsertElement} - Other Operators</li>
     * <li>{@link #LLVMShuffleVector ShuffleVector} - Other Operators</li>
     * <li>{@link #LLVMExtractValue ExtractValue} - Other Operators</li>
     * <li>{@link #LLVMInsertValue InsertValue} - Other Operators</li>
     * <li>{@link #LLVMFence Fence} - Atomic operators</li>
     * <li>{@link #LLVMAtomicCmpXchg AtomicCmpXchg} - Atomic operators</li>
     * <li>{@link #LLVMAtomicRMW AtomicRMW} - Atomic operators</li>
     * <li>{@link #LLVMResume Resume} - Exception Handling Operators</li>
     * <li>{@link #LLVMLandingPad LandingPad} - Exception Handling Operators</li>
     * <li>{@link #LLVMCleanupRet CleanupRet} - Exception Handling Operators</li>
     * <li>{@link #LLVMCatchRet CatchRet} - Exception Handling Operators</li>
     * <li>{@link #LLVMCatchPad CatchPad} - Exception Handling Operators</li>
     * <li>{@link #LLVMCleanupPad CleanupPad} - Exception Handling Operators</li>
     * <li>{@link #LLVMCatchSwitch CatchSwitch} - Exception Handling Operators</li>
     * </ul>
     */
    public static final int
        LLVMRet            = 1,
        LLVMBr             = 2,
        LLVMSwitch         = 3,
        LLVMIndirectBr     = 4,
        LLVMInvoke         = 5,
        LLVMUnreachable    = 7,
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

    /**
     * {@code LLVMTypeKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMVoidTypeKind VoidTypeKind} - type with no size</li>
     * <li>{@link #LLVMHalfTypeKind HalfTypeKind} - 16 bit floating point type</li>
     * <li>{@link #LLVMFloatTypeKind FloatTypeKind} - 32 bit floating point type</li>
     * <li>{@link #LLVMDoubleTypeKind DoubleTypeKind} - 64 bit floating point type</li>
     * <li>{@link #LLVMX86_FP80TypeKind X86_FP80TypeKind} - 80 bit floating point type (X87)</li>
     * <li>{@link #LLVMFP128TypeKind FP128TypeKind} - 128 bit floating point type (112-bit mantissa)</li>
     * <li>{@link #LLVMPPC_FP128TypeKind PPC_FP128TypeKind} - 128 bit floating point type (two 64-bits)</li>
     * <li>{@link #LLVMLabelTypeKind LabelTypeKind} - Labels</li>
     * <li>{@link #LLVMIntegerTypeKind IntegerTypeKind} - Arbitrary bit width integers</li>
     * <li>{@link #LLVMFunctionTypeKind FunctionTypeKind} - Functions</li>
     * <li>{@link #LLVMStructTypeKind StructTypeKind} - Structures</li>
     * <li>{@link #LLVMArrayTypeKind ArrayTypeKind} - Arrays</li>
     * <li>{@link #LLVMPointerTypeKind PointerTypeKind} - Pointers</li>
     * <li>{@link #LLVMVectorTypeKind VectorTypeKind} - SIMD 'packed' format, or other vector type</li>
     * <li>{@link #LLVMMetadataTypeKind MetadataTypeKind} - Metadata</li>
     * <li>{@link #LLVMX86_MMXTypeKind X86_MMXTypeKind} - X86 MMX</li>
     * <li>{@link #LLVMTokenTypeKind TokenTypeKind} - Tokens</li>
     * </ul>
     */
    public static final int
        LLVMVoidTypeKind      = 0,
        LLVMHalfTypeKind      = 1,
        LLVMFloatTypeKind     = 2,
        LLVMDoubleTypeKind    = 3,
        LLVMX86_FP80TypeKind  = 4,
        LLVMFP128TypeKind     = 5,
        LLVMPPC_FP128TypeKind = 6,
        LLVMLabelTypeKind     = 7,
        LLVMIntegerTypeKind   = 8,
        LLVMFunctionTypeKind  = 9,
        LLVMStructTypeKind    = 10,
        LLVMArrayTypeKind     = 11,
        LLVMPointerTypeKind   = 12,
        LLVMVectorTypeKind    = 13,
        LLVMMetadataTypeKind  = 14,
        LLVMX86_MMXTypeKind   = 15,
        LLVMTokenTypeKind     = 16;

    /**
     * {@code LLVMLinkage}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMExternalLinkage ExternalLinkage} - Externally visible function</li>
     * <li>{@link #LLVMAvailableExternallyLinkage AvailableExternallyLinkage}</li>
     * <li>{@link #LLVMLinkOnceAnyLinkage LinkOnceAnyLinkage} - Keep one copy of function when linking (inline)</li>
     * <li>{@link #LLVMLinkOnceODRLinkage LinkOnceODRLinkage} - Same, but only replaced by something equivalent.</li>
     * <li>{@link #LLVMLinkOnceODRAutoHideLinkage LinkOnceODRAutoHideLinkage} - Obsolete</li>
     * <li>{@link #LLVMWeakAnyLinkage WeakAnyLinkage} - Keep one copy of function when linking (weak)</li>
     * <li>{@link #LLVMWeakODRLinkage WeakODRLinkage} - Same, but only replaced by something equivalent.</li>
     * <li>{@link #LLVMAppendingLinkage AppendingLinkage} - Special purpose, only applies to global arrays</li>
     * <li>{@link #LLVMInternalLinkage InternalLinkage} - Rename collisions when linking (static functions)</li>
     * <li>{@link #LLVMPrivateLinkage PrivateLinkage} - Like Internal, but omit from symbol table</li>
     * <li>{@link #LLVMDLLImportLinkage DLLImportLinkage} - Obsolete</li>
     * <li>{@link #LLVMDLLExportLinkage DLLExportLinkage} - Obsolete</li>
     * <li>{@link #LLVMExternalWeakLinkage ExternalWeakLinkage} - ExternalWeak linkage description</li>
     * <li>{@link #LLVMGhostLinkage GhostLinkage} - Obsolete</li>
     * <li>{@link #LLVMCommonLinkage CommonLinkage} - Tentative definitions</li>
     * <li>{@link #LLVMLinkerPrivateLinkage LinkerPrivateLinkage} - Like Private, but linker removes.</li>
     * <li>{@link #LLVMLinkerPrivateWeakLinkage LinkerPrivateWeakLinkage} - Like LinkerPrivate, but is weak.</li>
     * </ul>
     */
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

    /**
     * {@code LLVMVisibility}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMDefaultVisibility DefaultVisibility} - The GV is visible</li>
     * <li>{@link #LLVMHiddenVisibility HiddenVisibility} - The GV is hidden</li>
     * <li>{@link #LLVMProtectedVisibility ProtectedVisibility} - The GV is protected</li>
     * </ul>
     */
    public static final int
        LLVMDefaultVisibility   = 0,
        LLVMHiddenVisibility    = 1,
        LLVMProtectedVisibility = 2;

    /**
     * {@code LLVMUnnamedAddr}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMNoUnnamedAddr NoUnnamedAddr} - Address of the GV is significant.</li>
     * <li>{@link #LLVMLocalUnnamedAddr LocalUnnamedAddr} - Address of the GV is locally insignificant.</li>
     * <li>{@link #LLVMGlobalUnnamedAddr GlobalUnnamedAddr} - Address of the GV is globally insignificant.</li>
     * </ul>
     */
    public static final int
        LLVMNoUnnamedAddr     = 0,
        LLVMLocalUnnamedAddr  = 1,
        LLVMGlobalUnnamedAddr = 2;

    /**
     * {@code LLVMDLLStorageClass}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMDefaultStorageClass DefaultStorageClass}</li>
     * <li>{@link #LLVMDLLImportStorageClass DLLImportStorageClass} - Function to be imported from DLL.</li>
     * <li>{@link #LLVMDLLExportStorageClass DLLExportStorageClass} - Function to be accessible from DLL.</li>
     * </ul>
     */
    public static final int
        LLVMDefaultStorageClass   = 0,
        LLVMDLLImportStorageClass = 1,
        LLVMDLLExportStorageClass = 2;

    /**
     * {@code LLVMCallConv}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMCCallConv CCallConv}</li>
     * <li>{@link #LLVMFastCallConv FastCallConv}</li>
     * <li>{@link #LLVMColdCallConv ColdCallConv}</li>
     * <li>{@link #LLVMGHCCallConv GHCCallConv}</li>
     * <li>{@link #LLVMHiPECallConv HiPECallConv}</li>
     * <li>{@link #LLVMWebKitJSCallConv WebKitJSCallConv}</li>
     * <li>{@link #LLVMAnyRegCallConv AnyRegCallConv}</li>
     * <li>{@link #LLVMPreserveMostCallConv PreserveMostCallConv}</li>
     * <li>{@link #LLVMPreserveAllCallConv PreserveAllCallConv}</li>
     * <li>{@link #LLVMSwiftCallConv SwiftCallConv}</li>
     * <li>{@link #LLVMCXXFASTTLSCallConv CXXFASTTLSCallConv}</li>
     * <li>{@link #LLVMX86StdcallCallConv X86StdcallCallConv}</li>
     * <li>{@link #LLVMX86FastcallCallConv X86FastcallCallConv}</li>
     * <li>{@link #LLVMARMAPCSCallConv ARMAPCSCallConv}</li>
     * <li>{@link #LLVMARMAAPCSCallConv ARMAAPCSCallConv}</li>
     * <li>{@link #LLVMARMAAPCSVFPCallConv ARMAAPCSVFPCallConv}</li>
     * <li>{@link #LLVMMSP430INTRCallConv MSP430INTRCallConv}</li>
     * <li>{@link #LLVMX86ThisCallCallConv X86ThisCallCallConv}</li>
     * <li>{@link #LLVMPTXKernelCallConv PTXKernelCallConv}</li>
     * <li>{@link #LLVMPTXDeviceCallConv PTXDeviceCallConv}</li>
     * <li>{@link #LLVMSPIRFUNCCallConv SPIRFUNCCallConv}</li>
     * <li>{@link #LLVMSPIRKERNELCallConv SPIRKERNELCallConv}</li>
     * <li>{@link #LLVMIntelOCLBICallConv IntelOCLBICallConv}</li>
     * <li>{@link #LLVMX8664SysVCallConv X8664SysVCallConv}</li>
     * <li>{@link #LLVMWin64CallConv Win64CallConv}</li>
     * <li>{@link #LLVMX86VectorCallCallConv X86VectorCallCallConv}</li>
     * <li>{@link #LLVMHHVMCallConv HHVMCallConv}</li>
     * <li>{@link #LLVMHHVMCCallConv HHVMCCallConv}</li>
     * <li>{@link #LLVMX86INTRCallConv X86INTRCallConv}</li>
     * <li>{@link #LLVMAVRINTRCallConv AVRINTRCallConv}</li>
     * <li>{@link #LLVMAVRSIGNALCallConv AVRSIGNALCallConv}</li>
     * <li>{@link #LLVMAVRBUILTINCallConv AVRBUILTINCallConv}</li>
     * <li>{@link #LLVMAMDGPUVSCallConv AMDGPUVSCallConv}</li>
     * <li>{@link #LLVMAMDGPUGSCallConv AMDGPUGSCallConv}</li>
     * <li>{@link #LLVMAMDGPUPSCallConv AMDGPUPSCallConv}</li>
     * <li>{@link #LLVMAMDGPUCSCallConv AMDGPUCSCallConv}</li>
     * <li>{@link #LLVMAMDGPUKERNELCallConv AMDGPUKERNELCallConv}</li>
     * <li>{@link #LLVMX86RegCallCallConv X86RegCallCallConv}</li>
     * <li>{@link #LLVMAMDGPUHSCallConv AMDGPUHSCallConv}</li>
     * <li>{@link #LLVMMSP430BUILTINCallConv MSP430BUILTINCallConv}</li>
     * <li>{@link #LLVMAMDGPULSCallConv AMDGPULSCallConv}</li>
     * <li>{@link #LLVMAMDGPUESCallConv AMDGPUESCallConv}</li>
     * </ul>
     */
    public static final int
        LLVMCCallConv             = 0,
        LLVMFastCallConv          = 8,
        LLVMColdCallConv          = 9,
        LLVMGHCCallConv           = 10,
        LLVMHiPECallConv          = 11,
        LLVMWebKitJSCallConv      = 12,
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

    /**
     * {@code LLVMValueKind}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMArgumentValueKind ArgumentValueKind}</li>
     * <li>{@link #LLVMBasicBlockValueKind BasicBlockValueKind}</li>
     * <li>{@link #LLVMMemoryUseValueKind MemoryUseValueKind}</li>
     * <li>{@link #LLVMMemoryDefValueKind MemoryDefValueKind}</li>
     * <li>{@link #LLVMMemoryPhiValueKind MemoryPhiValueKind}</li>
     * <li>{@link #LLVMFunctionValueKind FunctionValueKind}</li>
     * <li>{@link #LLVMGlobalAliasValueKind GlobalAliasValueKind}</li>
     * <li>{@link #LLVMGlobalIFuncValueKind GlobalIFuncValueKind}</li>
     * <li>{@link #LLVMGlobalVariableValueKind GlobalVariableValueKind}</li>
     * <li>{@link #LLVMBlockAddressValueKind BlockAddressValueKind}</li>
     * <li>{@link #LLVMConstantExprValueKind ConstantExprValueKind}</li>
     * <li>{@link #LLVMConstantArrayValueKind ConstantArrayValueKind}</li>
     * <li>{@link #LLVMConstantStructValueKind ConstantStructValueKind}</li>
     * <li>{@link #LLVMConstantVectorValueKind ConstantVectorValueKind}</li>
     * <li>{@link #LLVMUndefValueValueKind UndefValueValueKind}</li>
     * <li>{@link #LLVMConstantAggregateZeroValueKind ConstantAggregateZeroValueKind}</li>
     * <li>{@link #LLVMConstantDataArrayValueKind ConstantDataArrayValueKind}</li>
     * <li>{@link #LLVMConstantDataVectorValueKind ConstantDataVectorValueKind}</li>
     * <li>{@link #LLVMConstantIntValueKind ConstantIntValueKind}</li>
     * <li>{@link #LLVMConstantFPValueKind ConstantFPValueKind}</li>
     * <li>{@link #LLVMConstantPointerNullValueKind ConstantPointerNullValueKind}</li>
     * <li>{@link #LLVMConstantTokenNoneValueKind ConstantTokenNoneValueKind}</li>
     * <li>{@link #LLVMMetadataAsValueValueKind MetadataAsValueValueKind}</li>
     * <li>{@link #LLVMInlineAsmValueKind InlineAsmValueKind}</li>
     * <li>{@link #LLVMInstructionValueKind InstructionValueKind}</li>
     * </ul>
     */
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
        LLVMInstructionValueKind           = 24;

    /**
     * {@code LLVMIntPredicate}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMIntEQ IntEQ} - equal</li>
     * <li>{@link #LLVMIntNE IntNE} - not equal</li>
     * <li>{@link #LLVMIntUGT IntUGT} - unsigned greater than</li>
     * <li>{@link #LLVMIntUGE IntUGE} - unsigned greater or equal</li>
     * <li>{@link #LLVMIntULT IntULT} - unsigned less than</li>
     * <li>{@link #LLVMIntULE IntULE} - unsigned less or equal</li>
     * <li>{@link #LLVMIntSGT IntSGT} - signed greater than</li>
     * <li>{@link #LLVMIntSGE IntSGE} - signed greater or equal</li>
     * <li>{@link #LLVMIntSLT IntSLT} - signed less than</li>
     * <li>{@link #LLVMIntSLE IntSLE} - signed less or equal</li>
     * </ul>
     */
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

    /**
     * {@code LLVMRealPredicate}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMRealPredicateFalse RealPredicateFalse} - Always false (always folded)</li>
     * <li>{@link #LLVMRealOEQ RealOEQ} - True if ordered and equal</li>
     * <li>{@link #LLVMRealOGT RealOGT} - True if ordered and greater than</li>
     * <li>{@link #LLVMRealOGE RealOGE} - True if ordered and greater than or equal</li>
     * <li>{@link #LLVMRealOLT RealOLT} - True if ordered and less than</li>
     * <li>{@link #LLVMRealOLE RealOLE} - True if ordered and less than or equal</li>
     * <li>{@link #LLVMRealONE RealONE} - True if ordered and operands are unequal</li>
     * <li>{@link #LLVMRealORD RealORD} - True if ordered (no nans)</li>
     * <li>{@link #LLVMRealUNO RealUNO} - True if unordered: isnan(X) | isnan(Y)</li>
     * <li>{@link #LLVMRealUEQ RealUEQ} - True if unordered or equal</li>
     * <li>{@link #LLVMRealUGT RealUGT} - True if unordered or greater than</li>
     * <li>{@link #LLVMRealUGE RealUGE} - True if unordered, greater than, or equal</li>
     * <li>{@link #LLVMRealULT RealULT} - True if unordered or less than</li>
     * <li>{@link #LLVMRealULE RealULE} - True if unordered, less than, or equal</li>
     * <li>{@link #LLVMRealUNE RealUNE} - True if unordered or not equal</li>
     * <li>{@link #LLVMRealPredicateTrue RealPredicateTrue} - Always true (always folded)</li>
     * </ul>
     */
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

    /**
     * {@code LLVMLandingPadClauseTy}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMLandingPadCatch LandingPadCatch} - A catch clause</li>
     * <li>{@link #LLVMLandingPadFilter LandingPadFilter} - A filter clause</li>
     * </ul>
     */
    public static final int
        LLVMLandingPadCatch  = 0,
        LLVMLandingPadFilter = 1;

    /**
     * {@code LLVMThreadLocalMode}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMNotThreadLocal NotThreadLocal}</li>
     * <li>{@link #LLVMGeneralDynamicTLSModel GeneralDynamicTLSModel}</li>
     * <li>{@link #LLVMLocalDynamicTLSModel LocalDynamicTLSModel}</li>
     * <li>{@link #LLVMInitialExecTLSModel InitialExecTLSModel}</li>
     * <li>{@link #LLVMLocalExecTLSModel LocalExecTLSModel}</li>
     * </ul>
     */
    public static final int
        LLVMNotThreadLocal         = 0,
        LLVMGeneralDynamicTLSModel = 1,
        LLVMLocalDynamicTLSModel   = 2,
        LLVMInitialExecTLSModel    = 3,
        LLVMLocalExecTLSModel      = 4;

    /**
     * {@code LLVMAtomicOrdering}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMAtomicOrderingNotAtomic AtomicOrderingNotAtomic} - A load or store which is not atomic</li>
     * <li>{@link #LLVMAtomicOrderingUnordered AtomicOrderingUnordered} - Lowest level of atomicity, guarantees somewhat sane results, lock free.</li>
     * <li>{@link #LLVMAtomicOrderingMonotonic AtomicOrderingMonotonic} - guarantees that if you take all the operations affecting a specific address, a consistent ordering exists</li>
     * <li>{@link #LLVMAtomicOrderingAcquire AtomicOrderingAcquire} - Acquire provides a barrier of the sort necessary to acquire a lock to access other memory with normal loads and stores.</li>
     * <li>{@link #LLVMAtomicOrderingRelease AtomicOrderingRelease} - Release is similar to Acquire, but with a barrier of the sort necessary to release a lock.</li>
     * <li>{@link #LLVMAtomicOrderingAcquireRelease AtomicOrderingAcquireRelease} - provides both an Acquire and a Release barrier (for fences and operations which both read and write memory).</li>
     * <li>{@link #LLVMAtomicOrderingSequentiallyConsistent AtomicOrderingSequentiallyConsistent} - 
     * provides Acquire semantics for loads and Release semantics for stores. Additionally, it guarantees that a total ordering exists between all
     * SequentiallyConsistent operations.
     * </li>
     * </ul>
     */
    public static final int
        LLVMAtomicOrderingNotAtomic              = 0,
        LLVMAtomicOrderingUnordered              = 1,
        LLVMAtomicOrderingMonotonic              = 2,
        LLVMAtomicOrderingAcquire                = 4,
        LLVMAtomicOrderingRelease                = 5,
        LLVMAtomicOrderingAcquireRelease         = 6,
        LLVMAtomicOrderingSequentiallyConsistent = 7;

    /**
     * {@code LLVMAtomicRMWBinOp}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMAtomicRMWBinOpXchg AtomicRMWBinOpXchg} - Set the new value and return the one old</li>
     * <li>{@link #LLVMAtomicRMWBinOpAdd AtomicRMWBinOpAdd} - Add a value and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpSub AtomicRMWBinOpSub} - Subtract a value and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpAnd AtomicRMWBinOpAnd} - And a value and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpNand AtomicRMWBinOpNand} - Not-And a value and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpOr AtomicRMWBinOpOr} - OR a value and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpXor AtomicRMWBinOpXor} - Xor a value and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpMax AtomicRMWBinOpMax} - Sets the value if it's greater than the original using a signed comparison and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpMin AtomicRMWBinOpMin} - Sets the value if it's Smaller than the original using a signed comparison and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpUMax AtomicRMWBinOpUMax} - Sets the value if it's greater than the original using an unsigned comparison and return the old one</li>
     * <li>{@link #LLVMAtomicRMWBinOpUMin AtomicRMWBinOpUMin} - Sets the value if it's greater than the original using an unsigned comparison  and return the old one</li>
     * </ul>
     */
    public static final int
        LLVMAtomicRMWBinOpXchg = 0,
        LLVMAtomicRMWBinOpAdd  = 1,
        LLVMAtomicRMWBinOpSub  = 2,
        LLVMAtomicRMWBinOpAnd  = 3,
        LLVMAtomicRMWBinOpNand = 4,
        LLVMAtomicRMWBinOpOr   = 5,
        LLVMAtomicRMWBinOpXor  = 6,
        LLVMAtomicRMWBinOpMax  = 7,
        LLVMAtomicRMWBinOpMin  = 8,
        LLVMAtomicRMWBinOpUMax = 9,
        LLVMAtomicRMWBinOpUMin = 10;

    /**
     * {@code LLVMDiagnosticSeverity}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMDSError DSError}</li>
     * <li>{@link #LLVMDSWarning DSWarning}</li>
     * <li>{@link #LLVMDSRemark DSRemark}</li>
     * <li>{@link #LLVMDSNote DSNote}</li>
     * </ul>
     */
    public static final int
        LLVMDSError   = 0,
        LLVMDSWarning = 1,
        LLVMDSRemark  = 2,
        LLVMDSNote    = 3;

    /**
     * {@code LLVMInlineAsmDialect}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMInlineAsmDialectATT InlineAsmDialectATT}</li>
     * <li>{@link #LLVMInlineAsmDialectIntel InlineAsmDialectIntel}</li>
     * </ul>
     */
    public static final int
        LLVMInlineAsmDialectATT   = 0,
        LLVMInlineAsmDialectIntel = 1;

    /**
     * {@code LLVMModuleFlagBehavior}
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMModuleFlagBehaviorError ModuleFlagBehaviorError} - Emits an error if two values disagree, otherwise the resulting value is that of the operands.</li>
     * <li>{@link #LLVMModuleFlagBehaviorWarning ModuleFlagBehaviorWarning} - Emits a warning if two values disagree. The result value will be the operand for the flag from the first module being linked.</li>
     * <li>{@link #LLVMModuleFlagBehaviorRequire ModuleFlagBehaviorRequire} - 
     * Adds a requirement that another module flag be present and have a specified value after linking is performed. The value must be a metadata pair,
     * where the first element of the pair is the ID of the module flag to be restricted, and the second element of the pair is the value the module flag
     * should be restricted to. This behavior can be used to restrict the allowable results (via triggering of an error) of linking IDs with the
            **Override** behavior.
     * </li>
     * <li>{@link #LLVMModuleFlagBehaviorOverride ModuleFlagBehaviorOverride} - 
     * Uses the specified value, regardless of the behavior or value of the other module. If both modules specify **Override**, but the values differ, an
     * error will be emitted.
     * </li>
     * <li>{@link #LLVMModuleFlagBehaviorAppend ModuleFlagBehaviorAppend} - Appends the two values, which are required to be metadata nodes.</li>
     * <li>{@link #LLVMModuleFlagBehaviorAppendUnique ModuleFlagBehaviorAppendUnique} - 
     * Appends the two values, which are required to be metadata nodes. However, duplicate entries in the second list are dropped during the append
     * operation.
     * </li>
     * </ul>
     */
    public static final int
        LLVMModuleFlagBehaviorError        = 0,
        LLVMModuleFlagBehaviorWarning      = 1,
        LLVMModuleFlagBehaviorRequire      = 2,
        LLVMModuleFlagBehaviorOverride     = 3,
        LLVMModuleFlagBehaviorAppend       = 4,
        LLVMModuleFlagBehaviorAppendUnique = 5;

    /**
     * Attribute index are either {@code LLVMAttributeReturnIndex}, {@code LLVMAttributeFunctionIndex} or a parameter number from 1 to N.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #LLVMAttributeReturnIndex AttributeReturnIndex}</li>
     * <li>{@link #LLVMAttributeFunctionIndex AttributeFunctionIndex} - ISO C restricts enumerator values to range of 'int' (4294967295 is too large)</li>
     * </ul>
     */
    public static final int
        LLVMAttributeReturnIndex   = 0,
        LLVMAttributeFunctionIndex = -1;

    protected LLVMCore() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary LLVM = Library.loadNative(LLVMCore.class, Configuration.LLVM_LIBRARY_NAME, "libLLVM");

    /** Contains the function pointers loaded from the LLVM {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitializeCore                             = apiGetFunctionAddress(LLVM, "LLVMInitializeCore"),
            Shutdown                                   = apiGetFunctionAddress(LLVM, "LLVMShutdown"),
            CreateMessage                              = apiGetFunctionAddress(LLVM, "LLVMCreateMessage"),
            DisposeMessage                             = apiGetFunctionAddress(LLVM, "LLVMDisposeMessage"),
            ContextCreate                              = apiGetFunctionAddress(LLVM, "LLVMContextCreate"),
            GetGlobalContext                           = apiGetFunctionAddress(LLVM, "LLVMGetGlobalContext"),
            ContextSetDiagnosticHandler                = apiGetFunctionAddress(LLVM, "LLVMContextSetDiagnosticHandler"),
            ContextGetDiagnosticHandler                = apiGetFunctionAddress(LLVM, "LLVMContextGetDiagnosticHandler"),
            ContextGetDiagnosticContext                = apiGetFunctionAddress(LLVM, "LLVMContextGetDiagnosticContext"),
            ContextSetYieldCallback                    = apiGetFunctionAddress(LLVM, "LLVMContextSetYieldCallback"),
            ContextDispose                             = apiGetFunctionAddress(LLVM, "LLVMContextDispose"),
            GetDiagInfoDescription                     = apiGetFunctionAddress(LLVM, "LLVMGetDiagInfoDescription"),
            GetDiagInfoSeverity                        = apiGetFunctionAddress(LLVM, "LLVMGetDiagInfoSeverity"),
            GetMDKindIDInContext                       = apiGetFunctionAddress(LLVM, "LLVMGetMDKindIDInContext"),
            GetMDKindID                                = apiGetFunctionAddress(LLVM, "LLVMGetMDKindID"),
            GetEnumAttributeKindForName                = apiGetFunctionAddress(LLVM, "LLVMGetEnumAttributeKindForName"),
            GetLastEnumAttributeKind                   = apiGetFunctionAddress(LLVM, "LLVMGetLastEnumAttributeKind"),
            CreateEnumAttribute                        = apiGetFunctionAddress(LLVM, "LLVMCreateEnumAttribute"),
            GetEnumAttributeKind                       = apiGetFunctionAddress(LLVM, "LLVMGetEnumAttributeKind"),
            GetEnumAttributeValue                      = apiGetFunctionAddress(LLVM, "LLVMGetEnumAttributeValue"),
            CreateStringAttribute                      = apiGetFunctionAddress(LLVM, "LLVMCreateStringAttribute"),
            GetStringAttributeKind                     = apiGetFunctionAddress(LLVM, "LLVMGetStringAttributeKind"),
            GetStringAttributeValue                    = apiGetFunctionAddress(LLVM, "LLVMGetStringAttributeValue"),
            IsEnumAttribute                            = apiGetFunctionAddress(LLVM, "LLVMIsEnumAttribute"),
            IsStringAttribute                          = apiGetFunctionAddress(LLVM, "LLVMIsStringAttribute"),
            ModuleCreateWithName                       = apiGetFunctionAddress(LLVM, "LLVMModuleCreateWithName"),
            ModuleCreateWithNameInContext              = apiGetFunctionAddress(LLVM, "LLVMModuleCreateWithNameInContext"),
            CloneModule                                = apiGetFunctionAddress(LLVM, "LLVMCloneModule"),
            DisposeModule                              = apiGetFunctionAddress(LLVM, "LLVMDisposeModule"),
            GetModuleIdentifier                        = apiGetFunctionAddress(LLVM, "LLVMGetModuleIdentifier"),
            SetModuleIdentifier                        = apiGetFunctionAddress(LLVM, "LLVMSetModuleIdentifier"),
            GetSourceFileName                          = apiGetFunctionAddress(LLVM, "LLVMGetSourceFileName"),
            SetSourceFileName                          = apiGetFunctionAddress(LLVM, "LLVMSetSourceFileName"),
            GetDataLayoutStr                           = apiGetFunctionAddress(LLVM, "LLVMGetDataLayoutStr"),
            GetDataLayout                              = apiGetFunctionAddress(LLVM, "LLVMGetDataLayout"),
            SetDataLayout                              = apiGetFunctionAddress(LLVM, "LLVMSetDataLayout"),
            GetTarget                                  = apiGetFunctionAddress(LLVM, "LLVMGetTarget"),
            SetTarget                                  = apiGetFunctionAddress(LLVM, "LLVMSetTarget"),
            CopyModuleFlagsMetadata                    = apiGetFunctionAddress(LLVM, "LLVMCopyModuleFlagsMetadata"),
            DisposeModuleFlagsMetadata                 = apiGetFunctionAddress(LLVM, "LLVMDisposeModuleFlagsMetadata"),
            ModuleFlagEntriesGetFlagBehavior           = apiGetFunctionAddress(LLVM, "LLVMModuleFlagEntriesGetFlagBehavior"),
            ModuleFlagEntriesGetKey                    = apiGetFunctionAddress(LLVM, "LLVMModuleFlagEntriesGetKey"),
            ModuleFlagEntriesGetMetadata               = apiGetFunctionAddress(LLVM, "LLVMModuleFlagEntriesGetMetadata"),
            GetModuleFlag                              = apiGetFunctionAddress(LLVM, "LLVMGetModuleFlag"),
            AddModuleFlag                              = apiGetFunctionAddress(LLVM, "LLVMAddModuleFlag"),
            DumpModule                                 = apiGetFunctionAddress(LLVM, "LLVMDumpModule"),
            PrintModuleToFile                          = apiGetFunctionAddress(LLVM, "LLVMPrintModuleToFile"),
            PrintModuleToString                        = apiGetFunctionAddress(LLVM, "LLVMPrintModuleToString"),
            GetModuleInlineAsm                         = apiGetFunctionAddress(LLVM, "LLVMGetModuleInlineAsm"),
            SetModuleInlineAsm2                        = apiGetFunctionAddress(LLVM, "LLVMSetModuleInlineAsm2"),
            AppendModuleInlineAsm                      = apiGetFunctionAddress(LLVM, "LLVMAppendModuleInlineAsm"),
            GetInlineAsm                               = apiGetFunctionAddress(LLVM, "LLVMGetInlineAsm"),
            GetModuleContext                           = apiGetFunctionAddress(LLVM, "LLVMGetModuleContext"),
            GetTypeByName                              = apiGetFunctionAddress(LLVM, "LLVMGetTypeByName"),
            GetFirstNamedMetadata                      = apiGetFunctionAddress(LLVM, "LLVMGetFirstNamedMetadata"),
            GetLastNamedMetadata                       = apiGetFunctionAddress(LLVM, "LLVMGetLastNamedMetadata"),
            GetNextNamedMetadata                       = apiGetFunctionAddress(LLVM, "LLVMGetNextNamedMetadata"),
            GetPreviousNamedMetadata                   = apiGetFunctionAddress(LLVM, "LLVMGetPreviousNamedMetadata"),
            GetNamedMetadata                           = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadata"),
            GetOrInsertNamedMetadata                   = apiGetFunctionAddress(LLVM, "LLVMGetOrInsertNamedMetadata"),
            GetNamedMetadataName                       = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadataName"),
            GetNamedMetadataNumOperands                = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadataNumOperands"),
            GetNamedMetadataOperands                   = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadataOperands"),
            AddNamedMetadataOperand                    = apiGetFunctionAddress(LLVM, "LLVMAddNamedMetadataOperand"),
            GetDebugLocDirectory                       = apiGetFunctionAddress(LLVM, "LLVMGetDebugLocDirectory"),
            GetDebugLocFilename                        = apiGetFunctionAddress(LLVM, "LLVMGetDebugLocFilename"),
            GetDebugLocLine                            = apiGetFunctionAddress(LLVM, "LLVMGetDebugLocLine"),
            GetDebugLocColumn                          = apiGetFunctionAddress(LLVM, "LLVMGetDebugLocColumn"),
            AddFunction                                = apiGetFunctionAddress(LLVM, "LLVMAddFunction"),
            GetNamedFunction                           = apiGetFunctionAddress(LLVM, "LLVMGetNamedFunction"),
            GetFirstFunction                           = apiGetFunctionAddress(LLVM, "LLVMGetFirstFunction"),
            GetLastFunction                            = apiGetFunctionAddress(LLVM, "LLVMGetLastFunction"),
            GetNextFunction                            = apiGetFunctionAddress(LLVM, "LLVMGetNextFunction"),
            GetPreviousFunction                        = apiGetFunctionAddress(LLVM, "LLVMGetPreviousFunction"),
            SetModuleInlineAsm                         = apiGetFunctionAddress(LLVM, "LLVMSetModuleInlineAsm"),
            GetTypeKind                                = apiGetFunctionAddress(LLVM, "LLVMGetTypeKind"),
            TypeIsSized                                = apiGetFunctionAddress(LLVM, "LLVMTypeIsSized"),
            GetTypeContext                             = apiGetFunctionAddress(LLVM, "LLVMGetTypeContext"),
            DumpType                                   = apiGetFunctionAddress(LLVM, "LLVMDumpType"),
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
            FloatTypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMFloatTypeInContext"),
            DoubleTypeInContext                        = apiGetFunctionAddress(LLVM, "LLVMDoubleTypeInContext"),
            X86FP80TypeInContext                       = apiGetFunctionAddress(LLVM, "LLVMX86FP80TypeInContext"),
            FP128TypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMFP128TypeInContext"),
            PPCFP128TypeInContext                      = apiGetFunctionAddress(LLVM, "LLVMPPCFP128TypeInContext"),
            HalfType                                   = apiGetFunctionAddress(LLVM, "LLVMHalfType"),
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
            IsLiteralStruct                            = apiGetFunctionAddress(LLVM, "LLVMIsLiteralStruct"),
            GetElementType                             = apiGetFunctionAddress(LLVM, "LLVMGetElementType"),
            GetSubtypes                                = apiGetFunctionAddress(LLVM, "LLVMGetSubtypes"),
            GetNumContainedTypes                       = apiGetFunctionAddress(LLVM, "LLVMGetNumContainedTypes"),
            ArrayType                                  = apiGetFunctionAddress(LLVM, "LLVMArrayType"),
            GetArrayLength                             = apiGetFunctionAddress(LLVM, "LLVMGetArrayLength"),
            PointerType                                = apiGetFunctionAddress(LLVM, "LLVMPointerType"),
            GetPointerAddressSpace                     = apiGetFunctionAddress(LLVM, "LLVMGetPointerAddressSpace"),
            VectorType                                 = apiGetFunctionAddress(LLVM, "LLVMVectorType"),
            GetVectorSize                              = apiGetFunctionAddress(LLVM, "LLVMGetVectorSize"),
            VoidTypeInContext                          = apiGetFunctionAddress(LLVM, "LLVMVoidTypeInContext"),
            LabelTypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMLabelTypeInContext"),
            X86MMXTypeInContext                        = apiGetFunctionAddress(LLVM, "LLVMX86MMXTypeInContext"),
            TokenTypeInContext                         = apiGetFunctionAddress(LLVM, "LLVMTokenTypeInContext"),
            MetadataTypeInContext                      = apiGetFunctionAddress(LLVM, "LLVMMetadataTypeInContext"),
            VoidType                                   = apiGetFunctionAddress(LLVM, "LLVMVoidType"),
            LabelType                                  = apiGetFunctionAddress(LLVM, "LLVMLabelType"),
            X86MMXType                                 = apiGetFunctionAddress(LLVM, "LLVMX86MMXType"),
            TypeOf                                     = apiGetFunctionAddress(LLVM, "LLVMTypeOf"),
            GetValueKind                               = apiGetFunctionAddress(LLVM, "LLVMGetValueKind"),
            GetValueName2                              = apiGetFunctionAddress(LLVM, "LLVMGetValueName2"),
            SetValueName2                              = apiGetFunctionAddress(LLVM, "LLVMSetValueName2"),
            DumpValue                                  = apiGetFunctionAddress(LLVM, "LLVMDumpValue"),
            PrintValueToString                         = apiGetFunctionAddress(LLVM, "LLVMPrintValueToString"),
            ReplaceAllUsesWith                         = apiGetFunctionAddress(LLVM, "LLVMReplaceAllUsesWith"),
            IsConstant                                 = apiGetFunctionAddress(LLVM, "LLVMIsConstant"),
            IsUndef                                    = apiGetFunctionAddress(LLVM, "LLVMIsUndef"),
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
            IsAGlobalIFunc                             = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalIFunc"),
            IsAGlobalObject                            = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalObject"),
            IsAFunction                                = apiGetFunctionAddress(LLVM, "LLVMIsAFunction"),
            IsAGlobalVariable                          = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalVariable"),
            IsAUndefValue                              = apiGetFunctionAddress(LLVM, "LLVMIsAUndefValue"),
            IsAInstruction                             = apiGetFunctionAddress(LLVM, "LLVMIsAInstruction"),
            IsABinaryOperator                          = apiGetFunctionAddress(LLVM, "LLVMIsABinaryOperator"),
            IsACallInst                                = apiGetFunctionAddress(LLVM, "LLVMIsACallInst"),
            IsAIntrinsicInst                           = apiGetFunctionAddress(LLVM, "LLVMIsAIntrinsicInst"),
            IsADbgInfoIntrinsic                        = apiGetFunctionAddress(LLVM, "LLVMIsADbgInfoIntrinsic"),
            IsADbgVariableIntrinsic                    = apiGetFunctionAddress(LLVM, "LLVMIsADbgVariableIntrinsic"),
            IsADbgDeclareInst                          = apiGetFunctionAddress(LLVM, "LLVMIsADbgDeclareInst"),
            IsADbgLabelInst                            = apiGetFunctionAddress(LLVM, "LLVMIsADbgLabelInst"),
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
            IsAMDNode                                  = apiGetFunctionAddress(LLVM, "LLVMIsAMDNode"),
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
            ConstString                                = apiGetFunctionAddress(LLVM, "LLVMConstString"),
            IsConstantString                           = apiGetFunctionAddress(LLVM, "LLVMIsConstantString"),
            GetAsString                                = apiGetFunctionAddress(LLVM, "LLVMGetAsString"),
            ConstStructInContext                       = apiGetFunctionAddress(LLVM, "LLVMConstStructInContext"),
            ConstStruct                                = apiGetFunctionAddress(LLVM, "LLVMConstStruct"),
            ConstArray                                 = apiGetFunctionAddress(LLVM, "LLVMConstArray"),
            ConstNamedStruct                           = apiGetFunctionAddress(LLVM, "LLVMConstNamedStruct"),
            GetElementAsConstant                       = apiGetFunctionAddress(LLVM, "LLVMGetElementAsConstant"),
            ConstVector                                = apiGetFunctionAddress(LLVM, "LLVMConstVector"),
            GetConstOpcode                             = apiGetFunctionAddress(LLVM, "LLVMGetConstOpcode"),
            AlignOf                                    = apiGetFunctionAddress(LLVM, "LLVMAlignOf"),
            SizeOf                                     = apiGetFunctionAddress(LLVM, "LLVMSizeOf"),
            ConstNeg                                   = apiGetFunctionAddress(LLVM, "LLVMConstNeg"),
            ConstNSWNeg                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWNeg"),
            ConstNUWNeg                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWNeg"),
            ConstFNeg                                  = apiGetFunctionAddress(LLVM, "LLVMConstFNeg"),
            ConstNot                                   = apiGetFunctionAddress(LLVM, "LLVMConstNot"),
            ConstAdd                                   = apiGetFunctionAddress(LLVM, "LLVMConstAdd"),
            ConstNSWAdd                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWAdd"),
            ConstNUWAdd                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWAdd"),
            ConstFAdd                                  = apiGetFunctionAddress(LLVM, "LLVMConstFAdd"),
            ConstSub                                   = apiGetFunctionAddress(LLVM, "LLVMConstSub"),
            ConstNSWSub                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWSub"),
            ConstNUWSub                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWSub"),
            ConstFSub                                  = apiGetFunctionAddress(LLVM, "LLVMConstFSub"),
            ConstMul                                   = apiGetFunctionAddress(LLVM, "LLVMConstMul"),
            ConstNSWMul                                = apiGetFunctionAddress(LLVM, "LLVMConstNSWMul"),
            ConstNUWMul                                = apiGetFunctionAddress(LLVM, "LLVMConstNUWMul"),
            ConstFMul                                  = apiGetFunctionAddress(LLVM, "LLVMConstFMul"),
            ConstUDiv                                  = apiGetFunctionAddress(LLVM, "LLVMConstUDiv"),
            ConstExactUDiv                             = apiGetFunctionAddress(LLVM, "LLVMConstExactUDiv"),
            ConstSDiv                                  = apiGetFunctionAddress(LLVM, "LLVMConstSDiv"),
            ConstExactSDiv                             = apiGetFunctionAddress(LLVM, "LLVMConstExactSDiv"),
            ConstFDiv                                  = apiGetFunctionAddress(LLVM, "LLVMConstFDiv"),
            ConstURem                                  = apiGetFunctionAddress(LLVM, "LLVMConstURem"),
            ConstSRem                                  = apiGetFunctionAddress(LLVM, "LLVMConstSRem"),
            ConstFRem                                  = apiGetFunctionAddress(LLVM, "LLVMConstFRem"),
            ConstAnd                                   = apiGetFunctionAddress(LLVM, "LLVMConstAnd"),
            ConstOr                                    = apiGetFunctionAddress(LLVM, "LLVMConstOr"),
            ConstXor                                   = apiGetFunctionAddress(LLVM, "LLVMConstXor"),
            ConstICmp                                  = apiGetFunctionAddress(LLVM, "LLVMConstICmp"),
            ConstFCmp                                  = apiGetFunctionAddress(LLVM, "LLVMConstFCmp"),
            ConstShl                                   = apiGetFunctionAddress(LLVM, "LLVMConstShl"),
            ConstLShr                                  = apiGetFunctionAddress(LLVM, "LLVMConstLShr"),
            ConstAShr                                  = apiGetFunctionAddress(LLVM, "LLVMConstAShr"),
            ConstGEP                                   = apiGetFunctionAddress(LLVM, "LLVMConstGEP"),
            ConstInBoundsGEP                           = apiGetFunctionAddress(LLVM, "LLVMConstInBoundsGEP"),
            ConstTrunc                                 = apiGetFunctionAddress(LLVM, "LLVMConstTrunc"),
            ConstSExt                                  = apiGetFunctionAddress(LLVM, "LLVMConstSExt"),
            ConstZExt                                  = apiGetFunctionAddress(LLVM, "LLVMConstZExt"),
            ConstFPTrunc                               = apiGetFunctionAddress(LLVM, "LLVMConstFPTrunc"),
            ConstFPExt                                 = apiGetFunctionAddress(LLVM, "LLVMConstFPExt"),
            ConstUIToFP                                = apiGetFunctionAddress(LLVM, "LLVMConstUIToFP"),
            ConstSIToFP                                = apiGetFunctionAddress(LLVM, "LLVMConstSIToFP"),
            ConstFPToUI                                = apiGetFunctionAddress(LLVM, "LLVMConstFPToUI"),
            ConstFPToSI                                = apiGetFunctionAddress(LLVM, "LLVMConstFPToSI"),
            ConstPtrToInt                              = apiGetFunctionAddress(LLVM, "LLVMConstPtrToInt"),
            ConstIntToPtr                              = apiGetFunctionAddress(LLVM, "LLVMConstIntToPtr"),
            ConstBitCast                               = apiGetFunctionAddress(LLVM, "LLVMConstBitCast"),
            ConstAddrSpaceCast                         = apiGetFunctionAddress(LLVM, "LLVMConstAddrSpaceCast"),
            ConstZExtOrBitCast                         = apiGetFunctionAddress(LLVM, "LLVMConstZExtOrBitCast"),
            ConstSExtOrBitCast                         = apiGetFunctionAddress(LLVM, "LLVMConstSExtOrBitCast"),
            ConstTruncOrBitCast                        = apiGetFunctionAddress(LLVM, "LLVMConstTruncOrBitCast"),
            ConstPointerCast                           = apiGetFunctionAddress(LLVM, "LLVMConstPointerCast"),
            ConstIntCast                               = apiGetFunctionAddress(LLVM, "LLVMConstIntCast"),
            ConstFPCast                                = apiGetFunctionAddress(LLVM, "LLVMConstFPCast"),
            ConstSelect                                = apiGetFunctionAddress(LLVM, "LLVMConstSelect"),
            ConstExtractElement                        = apiGetFunctionAddress(LLVM, "LLVMConstExtractElement"),
            ConstInsertElement                         = apiGetFunctionAddress(LLVM, "LLVMConstInsertElement"),
            ConstShuffleVector                         = apiGetFunctionAddress(LLVM, "LLVMConstShuffleVector"),
            ConstExtractValue                          = apiGetFunctionAddress(LLVM, "LLVMConstExtractValue"),
            ConstInsertValue                           = apiGetFunctionAddress(LLVM, "LLVMConstInsertValue"),
            BlockAddress                               = apiGetFunctionAddress(LLVM, "LLVMBlockAddress"),
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
            GetUnnamedAddress                          = apiGetFunctionAddress(LLVM, "LLVMGetUnnamedAddress"),
            SetUnnamedAddress                          = apiGetFunctionAddress(LLVM, "LLVMSetUnnamedAddress"),
            GlobalGetValueType                         = apiGetFunctionAddress(LLVM, "LLVMGlobalGetValueType"),
            HasUnnamedAddr                             = apiGetFunctionAddress(LLVM, "LLVMHasUnnamedAddr"),
            SetUnnamedAddr                             = apiGetFunctionAddress(LLVM, "LLVMSetUnnamedAddr"),
            GetAlignment                               = apiGetFunctionAddress(LLVM, "LLVMGetAlignment"),
            SetAlignment                               = apiGetFunctionAddress(LLVM, "LLVMSetAlignment"),
            GlobalSetMetadata                          = apiGetFunctionAddress(LLVM, "LLVMGlobalSetMetadata"),
            GlobalEraseMetadata                        = apiGetFunctionAddress(LLVM, "LLVMGlobalEraseMetadata"),
            GlobalClearMetadata                        = apiGetFunctionAddress(LLVM, "LLVMGlobalClearMetadata"),
            GlobalCopyAllMetadata                      = apiGetFunctionAddress(LLVM, "LLVMGlobalCopyAllMetadata"),
            DisposeValueMetadataEntries                = apiGetFunctionAddress(LLVM, "LLVMDisposeValueMetadataEntries"),
            ValueMetadataEntriesGetKind                = apiGetFunctionAddress(LLVM, "LLVMValueMetadataEntriesGetKind"),
            ValueMetadataEntriesGetMetadata            = apiGetFunctionAddress(LLVM, "LLVMValueMetadataEntriesGetMetadata"),
            AddGlobal                                  = apiGetFunctionAddress(LLVM, "LLVMAddGlobal"),
            AddGlobalInAddressSpace                    = apiGetFunctionAddress(LLVM, "LLVMAddGlobalInAddressSpace"),
            GetNamedGlobal                             = apiGetFunctionAddress(LLVM, "LLVMGetNamedGlobal"),
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
            AddAlias                                   = apiGetFunctionAddress(LLVM, "LLVMAddAlias"),
            GetNamedGlobalAlias                        = apiGetFunctionAddress(LLVM, "LLVMGetNamedGlobalAlias"),
            GetFirstGlobalAlias                        = apiGetFunctionAddress(LLVM, "LLVMGetFirstGlobalAlias"),
            GetLastGlobalAlias                         = apiGetFunctionAddress(LLVM, "LLVMGetLastGlobalAlias"),
            GetNextGlobalAlias                         = apiGetFunctionAddress(LLVM, "LLVMGetNextGlobalAlias"),
            GetPreviousGlobalAlias                     = apiGetFunctionAddress(LLVM, "LLVMGetPreviousGlobalAlias"),
            AliasGetAliasee                            = apiGetFunctionAddress(LLVM, "LLVMAliasGetAliasee"),
            AliasSetAliasee                            = apiGetFunctionAddress(LLVM, "LLVMAliasSetAliasee"),
            DeleteFunction                             = apiGetFunctionAddress(LLVM, "LLVMDeleteFunction"),
            HasPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMHasPersonalityFn"),
            GetPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMGetPersonalityFn"),
            SetPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMSetPersonalityFn"),
            GetIntrinsicID                             = apiGetFunctionAddress(LLVM, "LLVMGetIntrinsicID"),
            GetFunctionCallConv                        = apiGetFunctionAddress(LLVM, "LLVMGetFunctionCallConv"),
            SetFunctionCallConv                        = apiGetFunctionAddress(LLVM, "LLVMSetFunctionCallConv"),
            GetGC                                      = apiGetFunctionAddress(LLVM, "LLVMGetGC"),
            SetGC                                      = apiGetFunctionAddress(LLVM, "LLVMSetGC"),
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
            MDStringInContext                          = apiGetFunctionAddress(LLVM, "LLVMMDStringInContext"),
            MDString                                   = apiGetFunctionAddress(LLVM, "LLVMMDString"),
            MDNodeInContext                            = apiGetFunctionAddress(LLVM, "LLVMMDNodeInContext"),
            MDNode                                     = apiGetFunctionAddress(LLVM, "LLVMMDNode"),
            MetadataAsValue                            = apiGetFunctionAddress(LLVM, "LLVMMetadataAsValue"),
            ValueAsMetadata                            = apiGetFunctionAddress(LLVM, "LLVMValueAsMetadata"),
            GetMDString                                = apiGetFunctionAddress(LLVM, "LLVMGetMDString"),
            GetMDNodeNumOperands                       = apiGetFunctionAddress(LLVM, "LLVMGetMDNodeNumOperands"),
            GetMDNodeOperands                          = apiGetFunctionAddress(LLVM, "LLVMGetMDNodeOperands"),
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
            InstructionGetAllMetadataOtherThanDebugLoc = apiGetFunctionAddress(LLVM, "LLVMInstructionGetAllMetadataOtherThanDebugLoc"),
            GetInstructionParent                       = apiGetFunctionAddress(LLVM, "LLVMGetInstructionParent"),
            GetNextInstruction                         = apiGetFunctionAddress(LLVM, "LLVMGetNextInstruction"),
            GetPreviousInstruction                     = apiGetFunctionAddress(LLVM, "LLVMGetPreviousInstruction"),
            InstructionRemoveFromParent                = apiGetFunctionAddress(LLVM, "LLVMInstructionRemoveFromParent"),
            InstructionEraseFromParent                 = apiGetFunctionAddress(LLVM, "LLVMInstructionEraseFromParent"),
            GetInstructionOpcode                       = apiGetFunctionAddress(LLVM, "LLVMGetInstructionOpcode"),
            GetICmpPredicate                           = apiGetFunctionAddress(LLVM, "LLVMGetICmpPredicate"),
            GetFCmpPredicate                           = apiGetFunctionAddress(LLVM, "LLVMGetFCmpPredicate"),
            InstructionClone                           = apiGetFunctionAddress(LLVM, "LLVMInstructionClone"),
            IsATerminatorInst                          = apiGetFunctionAddress(LLVM, "LLVMIsATerminatorInst"),
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
            GetCalledValue                             = apiGetFunctionAddress(LLVM, "LLVMGetCalledValue"),
            IsTailCall                                 = apiGetFunctionAddress(LLVM, "LLVMIsTailCall"),
            SetTailCall                                = apiGetFunctionAddress(LLVM, "LLVMSetTailCall"),
            GetNormalDest                              = apiGetFunctionAddress(LLVM, "LLVMGetNormalDest"),
            GetUnwindDest                              = apiGetFunctionAddress(LLVM, "LLVMGetUnwindDest"),
            SetNormalDest                              = apiGetFunctionAddress(LLVM, "LLVMSetNormalDest"),
            SetUnwindDest                              = apiGetFunctionAddress(LLVM, "LLVMSetUnwindDest"),
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
            AddIncoming                                = apiGetFunctionAddress(LLVM, "LLVMAddIncoming"),
            CountIncoming                              = apiGetFunctionAddress(LLVM, "LLVMCountIncoming"),
            GetIncomingValue                           = apiGetFunctionAddress(LLVM, "LLVMGetIncomingValue"),
            GetIncomingBlock                           = apiGetFunctionAddress(LLVM, "LLVMGetIncomingBlock"),
            GetNumIndices                              = apiGetFunctionAddress(LLVM, "LLVMGetNumIndices"),
            GetIndices                                 = apiGetFunctionAddress(LLVM, "LLVMGetIndices"),
            CreateBuilderInContext                     = apiGetFunctionAddress(LLVM, "LLVMCreateBuilderInContext"),
            CreateBuilder                              = apiGetFunctionAddress(LLVM, "LLVMCreateBuilder"),
            PositionBuilder                            = apiGetFunctionAddress(LLVM, "LLVMPositionBuilder"),
            PositionBuilderBefore                      = apiGetFunctionAddress(LLVM, "LLVMPositionBuilderBefore"),
            PositionBuilderAtEnd                       = apiGetFunctionAddress(LLVM, "LLVMPositionBuilderAtEnd"),
            GetInsertBlock                             = apiGetFunctionAddress(LLVM, "LLVMGetInsertBlock"),
            ClearInsertionPosition                     = apiGetFunctionAddress(LLVM, "LLVMClearInsertionPosition"),
            InsertIntoBuilder                          = apiGetFunctionAddress(LLVM, "LLVMInsertIntoBuilder"),
            InsertIntoBuilderWithName                  = apiGetFunctionAddress(LLVM, "LLVMInsertIntoBuilderWithName"),
            DisposeBuilder                             = apiGetFunctionAddress(LLVM, "LLVMDisposeBuilder"),
            SetCurrentDebugLocation                    = apiGetFunctionAddress(LLVM, "LLVMSetCurrentDebugLocation"),
            GetCurrentDebugLocation                    = apiGetFunctionAddress(LLVM, "LLVMGetCurrentDebugLocation"),
            SetInstDebugLocation                       = apiGetFunctionAddress(LLVM, "LLVMSetInstDebugLocation"),
            BuildRetVoid                               = apiGetFunctionAddress(LLVM, "LLVMBuildRetVoid"),
            BuildRet                                   = apiGetFunctionAddress(LLVM, "LLVMBuildRet"),
            BuildAggregateRet                          = apiGetFunctionAddress(LLVM, "LLVMBuildAggregateRet"),
            BuildBr                                    = apiGetFunctionAddress(LLVM, "LLVMBuildBr"),
            BuildCondBr                                = apiGetFunctionAddress(LLVM, "LLVMBuildCondBr"),
            BuildSwitch                                = apiGetFunctionAddress(LLVM, "LLVMBuildSwitch"),
            BuildIndirectBr                            = apiGetFunctionAddress(LLVM, "LLVMBuildIndirectBr"),
            BuildInvoke                                = apiGetFunctionAddress(LLVM, "LLVMBuildInvoke"),
            BuildUnreachable                           = apiGetFunctionAddress(LLVM, "LLVMBuildUnreachable"),
            BuildResume                                = apiGetFunctionAddress(LLVM, "LLVMBuildResume"),
            BuildLandingPad                            = apiGetFunctionAddress(LLVM, "LLVMBuildLandingPad"),
            BuildCleanupRet                            = apiGetFunctionAddress(LLVM, "LLVMBuildCleanupRet"),
            BuildCatchRet                              = apiGetFunctionAddress(LLVM, "LLVMBuildCatchRet"),
            BuildCatchPad                              = apiGetFunctionAddress(LLVM, "LLVMBuildCatchPad"),
            BuildCleanupPad                            = apiGetFunctionAddress(LLVM, "LLVMBuildCleanupPad"),
            BuildCatchSwitch                           = apiGetFunctionAddress(LLVM, "LLVMBuildCatchSwitch"),
            AddCase                                    = apiGetFunctionAddress(LLVM, "LLVMAddCase"),
            AddDestination                             = apiGetFunctionAddress(LLVM, "LLVMAddDestination"),
            GetNumClauses                              = apiGetFunctionAddress(LLVM, "LLVMGetNumClauses"),
            GetClause                                  = apiGetFunctionAddress(LLVM, "LLVMGetClause"),
            AddClause                                  = apiGetFunctionAddress(LLVM, "LLVMAddClause"),
            IsCleanup                                  = apiGetFunctionAddress(LLVM, "LLVMIsCleanup"),
            SetCleanup                                 = apiGetFunctionAddress(LLVM, "LLVMSetCleanup"),
            AddHandler                                 = apiGetFunctionAddress(LLVM, "LLVMAddHandler"),
            GetNumHandlers                             = apiGetFunctionAddress(LLVM, "LLVMGetNumHandlers"),
            GetHandlers                                = apiGetFunctionAddress(LLVM, "LLVMGetHandlers"),
            GetArgOperand                              = apiGetFunctionAddress(LLVM, "LLVMGetArgOperand"),
            SetArgOperand                              = apiGetFunctionAddress(LLVM, "LLVMSetArgOperand"),
            GetParentCatchSwitch                       = apiGetFunctionAddress(LLVM, "LLVMGetParentCatchSwitch"),
            SetParentCatchSwitch                       = apiGetFunctionAddress(LLVM, "LLVMSetParentCatchSwitch"),
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
            BuildNot                                   = apiGetFunctionAddress(LLVM, "LLVMBuildNot"),
            BuildMalloc                                = apiGetFunctionAddress(LLVM, "LLVMBuildMalloc"),
            BuildArrayMalloc                           = apiGetFunctionAddress(LLVM, "LLVMBuildArrayMalloc"),
            BuildAlloca                                = apiGetFunctionAddress(LLVM, "LLVMBuildAlloca"),
            BuildArrayAlloca                           = apiGetFunctionAddress(LLVM, "LLVMBuildArrayAlloca"),
            BuildFree                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFree"),
            BuildLoad                                  = apiGetFunctionAddress(LLVM, "LLVMBuildLoad"),
            BuildStore                                 = apiGetFunctionAddress(LLVM, "LLVMBuildStore"),
            BuildGEP                                   = apiGetFunctionAddress(LLVM, "LLVMBuildGEP"),
            BuildInBoundsGEP                           = apiGetFunctionAddress(LLVM, "LLVMBuildInBoundsGEP"),
            BuildStructGEP                             = apiGetFunctionAddress(LLVM, "LLVMBuildStructGEP"),
            BuildGlobalString                          = apiGetFunctionAddress(LLVM, "LLVMBuildGlobalString"),
            BuildGlobalStringPtr                       = apiGetFunctionAddress(LLVM, "LLVMBuildGlobalStringPtr"),
            GetVolatile                                = apiGetFunctionAddress(LLVM, "LLVMGetVolatile"),
            SetVolatile                                = apiGetFunctionAddress(LLVM, "LLVMSetVolatile"),
            GetOrdering                                = apiGetFunctionAddress(LLVM, "LLVMGetOrdering"),
            SetOrdering                                = apiGetFunctionAddress(LLVM, "LLVMSetOrdering"),
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
            BuildIntCast                               = apiGetFunctionAddress(LLVM, "LLVMBuildIntCast"),
            BuildFPCast                                = apiGetFunctionAddress(LLVM, "LLVMBuildFPCast"),
            BuildICmp                                  = apiGetFunctionAddress(LLVM, "LLVMBuildICmp"),
            BuildFCmp                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFCmp"),
            BuildPhi                                   = apiGetFunctionAddress(LLVM, "LLVMBuildPhi"),
            BuildCall                                  = apiGetFunctionAddress(LLVM, "LLVMBuildCall"),
            BuildSelect                                = apiGetFunctionAddress(LLVM, "LLVMBuildSelect"),
            BuildVAArg                                 = apiGetFunctionAddress(LLVM, "LLVMBuildVAArg"),
            BuildExtractElement                        = apiGetFunctionAddress(LLVM, "LLVMBuildExtractElement"),
            BuildInsertElement                         = apiGetFunctionAddress(LLVM, "LLVMBuildInsertElement"),
            BuildShuffleVector                         = apiGetFunctionAddress(LLVM, "LLVMBuildShuffleVector"),
            BuildExtractValue                          = apiGetFunctionAddress(LLVM, "LLVMBuildExtractValue"),
            BuildInsertValue                           = apiGetFunctionAddress(LLVM, "LLVMBuildInsertValue"),
            BuildIsNull                                = apiGetFunctionAddress(LLVM, "LLVMBuildIsNull"),
            BuildIsNotNull                             = apiGetFunctionAddress(LLVM, "LLVMBuildIsNotNull"),
            BuildPtrDiff                               = apiGetFunctionAddress(LLVM, "LLVMBuildPtrDiff"),
            BuildFence                                 = apiGetFunctionAddress(LLVM, "LLVMBuildFence"),
            BuildAtomicRMW                             = apiGetFunctionAddress(LLVM, "LLVMBuildAtomicRMW"),
            BuildAtomicCmpXchg                         = apiGetFunctionAddress(LLVM, "LLVMBuildAtomicCmpXchg"),
            IsAtomicSingleThread                       = apiGetFunctionAddress(LLVM, "LLVMIsAtomicSingleThread"),
            SetAtomicSingleThread                      = apiGetFunctionAddress(LLVM, "LLVMSetAtomicSingleThread"),
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
            GetGlobalPassRegistry                      = apiGetFunctionAddress(LLVM, "LLVMGetGlobalPassRegistry"),
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

    // --- [ LLVMInitializeCore ] ---

    public static void LLVMInitializeCore(@NativeType("LLVMPassRegistryRef") long R) {
        long __functionAddress = Functions.InitializeCore;
        if (CHECKS) {
            check(R);
        }
        invokePV(__functionAddress, R);
    }

    // --- [ LLVMShutdown ] ---

    /** Deallocate and destroy all {@code ManagedStatic} variables. */
    public static void LLVMShutdown() {
        long __functionAddress = Functions.Shutdown;
        invokeV(__functionAddress);
    }

    // --- [ LLVMCreateMessage ] ---

    public static long nLLVMCreateMessage(long Message) {
        long __functionAddress = Functions.CreateMessage;
        return invokePP(__functionAddress, Message);
    }

    @NativeType("char *")
    public static String LLVMCreateMessage(@NativeType("char const *") ByteBuffer Message) {
        if (CHECKS) {
            checkNT1(Message);
        }
        long __result = nLLVMCreateMessage(memAddress(Message));
        return memUTF8(__result);
    }

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

    public static void nLLVMDisposeMessage(long Message) {
        long __functionAddress = Functions.DisposeMessage;
        invokePV(__functionAddress, Message);
    }

    public static void LLVMDisposeMessage(@NativeType("char *") ByteBuffer Message) {
        if (CHECKS) {
            checkNT1(Message);
        }
        nLLVMDisposeMessage(memAddress(Message));
    }

    // --- [ LLVMContextCreate ] ---

    /**
     * Create a new context.
     * 
     * <p>Every call to this function should be paired with a call to {@link #LLVMContextDispose ContextDispose} or the context will leak memory.</p>
     */
    @NativeType("LLVMContextRef")
    public static long LLVMContextCreate() {
        long __functionAddress = Functions.ContextCreate;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMGetGlobalContext ] ---

    /** Obtain the global context instance. */
    @NativeType("LLVMContextRef")
    public static long LLVMGetGlobalContext() {
        long __functionAddress = Functions.GetGlobalContext;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMContextSetDiagnosticHandler ] ---

    /** Unsafe version of: {@link #LLVMContextSetDiagnosticHandler ContextSetDiagnosticHandler} */
    public static void nLLVMContextSetDiagnosticHandler(long C, long Handler, long DiagnosticContext) {
        long __functionAddress = Functions.ContextSetDiagnosticHandler;
        if (CHECKS) {
            check(C);
        }
        invokePPPV(__functionAddress, C, Handler, DiagnosticContext);
    }

    /** Set the diagnostic handler for this context. */
    public static void LLVMContextSetDiagnosticHandler(@NativeType("LLVMContextRef") long C, @Nullable @NativeType("void (*) (LLVMDiagnosticInfoRef, void *)") LLVMDiagnosticHandlerI Handler, @NativeType("void *") long DiagnosticContext) {
        nLLVMContextSetDiagnosticHandler(C, memAddressSafe(Handler), DiagnosticContext);
    }

    // --- [ LLVMContextGetDiagnosticHandler ] ---

    /** Unsafe version of: {@link #LLVMContextGetDiagnosticHandler ContextGetDiagnosticHandler} */
    public static long nLLVMContextGetDiagnosticHandler(long C) {
        long __functionAddress = Functions.ContextGetDiagnosticHandler;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    /** Get the diagnostic handler of this context. */
    @Nullable
    @NativeType("void (*) (LLVMDiagnosticInfoRef, void *)")
    public static LLVMDiagnosticHandler LLVMContextGetDiagnosticHandler(@NativeType("LLVMContextRef") long C) {
        return LLVMDiagnosticHandler.createSafe(nLLVMContextGetDiagnosticHandler(C));
    }

    // --- [ LLVMContextGetDiagnosticContext ] ---

    /** Get the diagnostic context of this context. */
    @NativeType("void *")
    public static long LLVMContextGetDiagnosticContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.ContextGetDiagnosticContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMContextSetYieldCallback ] ---

    /** Unsafe version of: {@link #LLVMContextSetYieldCallback ContextSetYieldCallback} */
    public static void nLLVMContextSetYieldCallback(long C, long Callback, long OpaqueHandle) {
        long __functionAddress = Functions.ContextSetYieldCallback;
        if (CHECKS) {
            check(C);
        }
        invokePPPV(__functionAddress, C, Callback, OpaqueHandle);
    }

    /** Set the yield callback function for this context. */
    public static void LLVMContextSetYieldCallback(@NativeType("LLVMContextRef") long C, @Nullable @NativeType("void (*) (LLVMContextRef, void *)") LLVMYieldCallbackI Callback, @NativeType("void *") long OpaqueHandle) {
        nLLVMContextSetYieldCallback(C, memAddressSafe(Callback), OpaqueHandle);
    }

    // --- [ LLVMContextDispose ] ---

    /**
     * Destroy a context instance.
     * 
     * <p>This should be called for every call to {@link #LLVMContextCreate ContextCreate} or memory will be leaked.</p>
     */
    public static void LLVMContextDispose(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.ContextDispose;
        if (CHECKS) {
            check(C);
        }
        invokePV(__functionAddress, C);
    }

    // --- [ LLVMGetDiagInfoDescription ] ---

    /** Unsafe version of: {@link #LLVMGetDiagInfoDescription GetDiagInfoDescription} */
    public static long nLLVMGetDiagInfoDescription(long DI) {
        long __functionAddress = Functions.GetDiagInfoDescription;
        if (CHECKS) {
            check(DI);
        }
        return invokePP(__functionAddress, DI);
    }

    /** Return a string representation of the {@code DiagnosticInfo}. Use {@link #LLVMDisposeMessage DisposeMessage} to free the string. */
    @NativeType("char *")
    public static String LLVMGetDiagInfoDescription(@NativeType("LLVMDiagnosticInfoRef") long DI) {
        long __result = nLLVMGetDiagInfoDescription(DI);
        return memUTF8(__result);
    }

    // --- [ LLVMGetDiagInfoSeverity ] ---

    /** Return an {@code enum LLVMDiagnosticSeverity}. */
    @NativeType("LLVMDiagnosticSeverity")
    public static int LLVMGetDiagInfoSeverity(@NativeType("LLVMDiagnosticInfoRef") long DI) {
        long __functionAddress = Functions.GetDiagInfoSeverity;
        if (CHECKS) {
            check(DI);
        }
        return invokePI(__functionAddress, DI);
    }

    // --- [ LLVMGetMDKindIDInContext ] ---

    public static int nLLVMGetMDKindIDInContext(long C, long Name, int SLen) {
        long __functionAddress = Functions.GetMDKindIDInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPI(__functionAddress, C, Name, SLen);
    }

    @NativeType("unsigned int")
    public static int LLVMGetMDKindIDInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetMDKindIDInContext(C, memAddress(Name), Name.remaining());
    }

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

    // --- [ LLVMGetMDKindID ] ---

    public static int nLLVMGetMDKindID(long Name, int SLen) {
        long __functionAddress = Functions.GetMDKindID;
        return invokePI(__functionAddress, Name, SLen);
    }

    @NativeType("unsigned int")
    public static int LLVMGetMDKindID(@NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetMDKindID(memAddress(Name), Name.remaining());
    }

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

    /** Unsafe version of: {@link #LLVMGetEnumAttributeKindForName GetEnumAttributeKindForName} */
    public static int nLLVMGetEnumAttributeKindForName(long Name, long SLen) {
        long __functionAddress = Functions.GetEnumAttributeKindForName;
        return invokePPI(__functionAddress, Name, SLen);
    }

    /**
     * Return an unique id given the name of a enum attribute, or 0 if no attribute by that name exists.
     * 
     * <p>See <a target="_blank" href="http://llvm.org/docs/LangRef.html#parameter-attributes">http://llvm.org/docs/LangRef.html#parameter-attributes</a> and <a target="_blank" href="http://llvm.org/docs/LangRef.html#function-attributes">http://llvm.org/docs/LangRef.html#function-attributes</a> for the
     * list of available attributes.</p>
     * 
     * <p>NB: Attribute names and/or id are subject to change without going through the C API deprecation cycle.</p>
     */
    @NativeType("unsigned int")
    public static int LLVMGetEnumAttributeKindForName(@NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetEnumAttributeKindForName(memAddress(Name), Name.remaining());
    }

    /**
     * Return an unique id given the name of a enum attribute, or 0 if no attribute by that name exists.
     * 
     * <p>See <a target="_blank" href="http://llvm.org/docs/LangRef.html#parameter-attributes">http://llvm.org/docs/LangRef.html#parameter-attributes</a> and <a target="_blank" href="http://llvm.org/docs/LangRef.html#function-attributes">http://llvm.org/docs/LangRef.html#function-attributes</a> for the
     * list of available attributes.</p>
     * 
     * <p>NB: Attribute names and/or id are subject to change without going through the C API deprecation cycle.</p>
     */
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

    @NativeType("unsigned int")
    public static int LLVMGetLastEnumAttributeKind() {
        long __functionAddress = Functions.GetLastEnumAttributeKind;
        return invokeI(__functionAddress);
    }

    // --- [ LLVMCreateEnumAttribute ] ---

    /** Create an enum attribute. */
    @NativeType("LLVMAttributeRef")
    public static long LLVMCreateEnumAttribute(@NativeType("LLVMContextRef") long C, @NativeType("unsigned int") int KindID, @NativeType("uint64_t") long Val) {
        long __functionAddress = Functions.CreateEnumAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePJP(__functionAddress, C, KindID, Val);
    }

    // --- [ LLVMGetEnumAttributeKind ] ---

    /** Get the unique id corresponding to the enum attribute passed as argument. */
    @NativeType("unsigned int")
    public static int LLVMGetEnumAttributeKind(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.GetEnumAttributeKind;
        if (CHECKS) {
            check(A);
        }
        return invokePI(__functionAddress, A);
    }

    // --- [ LLVMGetEnumAttributeValue ] ---

    /** Get the enum attribute's value. 0 is returned if none exists. */
    @NativeType("uint64_t")
    public static long LLVMGetEnumAttributeValue(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.GetEnumAttributeValue;
        if (CHECKS) {
            check(A);
        }
        return invokePJ(__functionAddress, A);
    }

    // --- [ LLVMCreateStringAttribute ] ---

    /** Unsafe version of: {@link #LLVMCreateStringAttribute CreateStringAttribute} */
    public static long nLLVMCreateStringAttribute(long C, long K, int KLength, long V, int VLength) {
        long __functionAddress = Functions.CreateStringAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePPPP(__functionAddress, C, K, KLength, V, VLength);
    }

    /** Create a string attribute. */
    @NativeType("LLVMAttributeRef")
    public static long LLVMCreateStringAttribute(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer K, @NativeType("char const *") ByteBuffer V) {
        return nLLVMCreateStringAttribute(C, memAddress(K), K.remaining(), memAddress(V), V.remaining());
    }

    /** Create a string attribute. */
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

    /** Unsafe version of: {@link #LLVMGetStringAttributeKind GetStringAttributeKind} */
    public static long nLLVMGetStringAttributeKind(long A, long Length) {
        long __functionAddress = Functions.GetStringAttributeKind;
        if (CHECKS) {
            check(A);
        }
        return invokePPP(__functionAddress, A, Length);
    }

    /** Get the string attribute's kind. */
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

    /** Unsafe version of: {@link #LLVMGetStringAttributeValue GetStringAttributeValue} */
    public static long nLLVMGetStringAttributeValue(long A, long Length) {
        long __functionAddress = Functions.GetStringAttributeValue;
        if (CHECKS) {
            check(A);
        }
        return invokePPP(__functionAddress, A, Length);
    }

    /** Get the string attribute's value. */
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

    @NativeType("LLVMBool")
    public static boolean LLVMIsEnumAttribute(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.IsEnumAttribute;
        if (CHECKS) {
            check(A);
        }
        return invokePI(__functionAddress, A) != 0;
    }

    // --- [ LLVMIsStringAttribute ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsStringAttribute(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.IsStringAttribute;
        if (CHECKS) {
            check(A);
        }
        return invokePI(__functionAddress, A) != 0;
    }

    // --- [ LLVMModuleCreateWithName ] ---

    /** Unsafe version of: {@link #LLVMModuleCreateWithName ModuleCreateWithName} */
    public static long nLLVMModuleCreateWithName(long ModuleID) {
        long __functionAddress = Functions.ModuleCreateWithName;
        return invokePP(__functionAddress, ModuleID);
    }

    /**
     * Create a new, empty module in the global context.
     * 
     * <p>This is equivalent to calling {@link #LLVMModuleCreateWithNameInContext ModuleCreateWithNameInContext} with {@link #LLVMGetGlobalContext GetGlobalContext} as the context parameter.</p>
     * 
     * <p>Every invocation should be paired with {@link #LLVMDisposeModule DisposeModule} or memory will be leaked.</p>
     */
    @NativeType("LLVMModuleRef")
    public static long LLVMModuleCreateWithName(@NativeType("char const *") ByteBuffer ModuleID) {
        if (CHECKS) {
            checkNT1(ModuleID);
        }
        return nLLVMModuleCreateWithName(memAddress(ModuleID));
    }

    /**
     * Create a new, empty module in the global context.
     * 
     * <p>This is equivalent to calling {@link #LLVMModuleCreateWithNameInContext ModuleCreateWithNameInContext} with {@link #LLVMGetGlobalContext GetGlobalContext} as the context parameter.</p>
     * 
     * <p>Every invocation should be paired with {@link #LLVMDisposeModule DisposeModule} or memory will be leaked.</p>
     */
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

    /** Unsafe version of: {@link #LLVMModuleCreateWithNameInContext ModuleCreateWithNameInContext} */
    public static long nLLVMModuleCreateWithNameInContext(long ModuleID, long C) {
        long __functionAddress = Functions.ModuleCreateWithNameInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, ModuleID, C);
    }

    /**
     * Create a new, empty module in a specific context.
     * 
     * <p>Every invocation should be paired with {@link #LLVMDisposeModule DisposeModule} or memory will be leaked.</p>
     */
    @NativeType("LLVMModuleRef")
    public static long LLVMModuleCreateWithNameInContext(@NativeType("char const *") ByteBuffer ModuleID, @NativeType("LLVMContextRef") long C) {
        if (CHECKS) {
            checkNT1(ModuleID);
        }
        return nLLVMModuleCreateWithNameInContext(memAddress(ModuleID), C);
    }

    /**
     * Create a new, empty module in a specific context.
     * 
     * <p>Every invocation should be paired with {@link #LLVMDisposeModule DisposeModule} or memory will be leaked.</p>
     */
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

    /** Return an exact copy of the specified module. */
    @NativeType("LLVMModuleRef")
    public static long LLVMCloneModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CloneModule;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMDisposeModule ] ---

    /**
     * Destroy a module instance.
     * 
     * <p>This must be called for every created module or memory will be leaked.</p>
     */
    public static void LLVMDisposeModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.DisposeModule;
        if (CHECKS) {
            check(M);
        }
        invokePV(__functionAddress, M);
    }

    // --- [ LLVMGetModuleIdentifier ] ---

    /**
     * Unsafe version of: {@link #LLVMGetModuleIdentifier GetModuleIdentifier}
     *
     * @param Len out parameter which holds the length of the returned string
     */
    public static long nLLVMGetModuleIdentifier(long M, long Len) {
        long __functionAddress = Functions.GetModuleIdentifier;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(__functionAddress, M, Len);
    }

    /**
     * Obtain the identifier of a module.
     *
     * @param M module to obtain identifier of
     *
     * @return the identifier of {@code M}
     */
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

    /**
     * Unsafe version of: {@link #LLVMSetModuleIdentifier SetModuleIdentifier}
     *
     * @param Len length of {@code Ident}
     */
    public static void nLLVMSetModuleIdentifier(long M, long Ident, long Len) {
        long __functionAddress = Functions.SetModuleIdentifier;
        if (CHECKS) {
            check(M);
        }
        invokePPPV(__functionAddress, M, Ident, Len);
    }

    /**
     * Set the identifier of a module to a string {@code Ident} with length {@code Len}.
     *
     * @param M     the module to set identifier
     * @param Ident the string to set {@code M}'s identifier to
     */
    public static void LLVMSetModuleIdentifier(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Ident) {
        nLLVMSetModuleIdentifier(M, memAddress(Ident), Ident.remaining());
    }

    /**
     * Set the identifier of a module to a string {@code Ident} with length {@code Len}.
     *
     * @param M     the module to set identifier
     * @param Ident the string to set {@code M}'s identifier to
     */
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

    /**
     * Unsafe version of: {@link #LLVMGetSourceFileName GetSourceFileName}
     *
     * @param Len out parameter which holds the length of the returned string
     */
    public static long nLLVMGetSourceFileName(long M, long Len) {
        long __functionAddress = Functions.GetSourceFileName;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(__functionAddress, M, Len);
    }

    /**
     * Obtain the module's original source file name.
     *
     * @param M module to obtain the name of
     *
     * @return the original source file name of {@code M}
     */
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

    /**
     * Unsafe version of: {@link #LLVMSetSourceFileName SetSourceFileName}
     *
     * @param Len length of {@code Name}
     */
    public static void nLLVMSetSourceFileName(long M, long Name, long Len) {
        long __functionAddress = Functions.SetSourceFileName;
        if (CHECKS) {
            check(M);
        }
        invokePPPV(__functionAddress, M, Name, Len);
    }

    /**
     * Set the original source file name of a module to a string {@code Name} with length {@code Len}.
     *
     * @param M    the module to set the source file name of
     * @param Name the string to set {@code M}'s source file name to
     */
    public static void LLVMSetSourceFileName(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        nLLVMSetSourceFileName(M, memAddress(Name), Name.remaining());
    }

    /**
     * Set the original source file name of a module to a string {@code Name} with length {@code Len}.
     *
     * @param M    the module to set the source file name of
     * @param Name the string to set {@code M}'s source file name to
     */
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

    /** Unsafe version of: {@link #LLVMGetDataLayoutStr GetDataLayoutStr} */
    public static long nLLVMGetDataLayoutStr(long M) {
        long __functionAddress = Functions.GetDataLayoutStr;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    /**
     * Obtain the data layout for a module.
     * 
     * <p>{@link #LLVMGetDataLayout GetDataLayout} is DEPRECATED, as the name is not only incorrect, but match the name of another method on the module. Prefer the use of
     * {@code LLVMGetDataLayoutStr}, which is not ambiguous.</p>
     */
    @NativeType("char const *")
    public static String LLVMGetDataLayoutStr(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMGetDataLayoutStr(M);
        return memUTF8(__result);
    }

    // --- [ LLVMGetDataLayout ] ---

    public static long nLLVMGetDataLayout(long M) {
        long __functionAddress = Functions.GetDataLayout;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    @NativeType("char const *")
    public static String LLVMGetDataLayout(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMGetDataLayout(M);
        return memUTF8(__result);
    }

    // --- [ LLVMSetDataLayout ] ---

    /** Unsafe version of: {@link #LLVMSetDataLayout SetDataLayout} */
    public static void nLLVMSetDataLayout(long M, long DataLayoutStr) {
        long __functionAddress = Functions.SetDataLayout;
        if (CHECKS) {
            check(M);
        }
        invokePPV(__functionAddress, M, DataLayoutStr);
    }

    /** Set the data layout for a module. */
    public static void LLVMSetDataLayout(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer DataLayoutStr) {
        if (CHECKS) {
            checkNT1(DataLayoutStr);
        }
        nLLVMSetDataLayout(M, memAddress(DataLayoutStr));
    }

    /** Set the data layout for a module. */
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

    /** Unsafe version of: {@link #LLVMGetTarget GetTarget} */
    public static long nLLVMGetTarget(long M) {
        long __functionAddress = Functions.GetTarget;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    /** Obtain the target triple for a module. */
    @NativeType("char const *")
    public static String LLVMGetTarget(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMGetTarget(M);
        return memUTF8(__result);
    }

    // --- [ LLVMSetTarget ] ---

    /** Unsafe version of: {@link #LLVMSetTarget SetTarget} */
    public static void nLLVMSetTarget(long M, long Triple) {
        long __functionAddress = Functions.SetTarget;
        if (CHECKS) {
            check(M);
        }
        invokePPV(__functionAddress, M, Triple);
    }

    /** Set the target triple for a module. */
    public static void LLVMSetTarget(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Triple) {
        if (CHECKS) {
            checkNT1(Triple);
        }
        nLLVMSetTarget(M, memAddress(Triple));
    }

    /** Set the target triple for a module. */
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

    /** Unsafe version of: {@link #LLVMCopyModuleFlagsMetadata CopyModuleFlagsMetadata} */
    public static long nLLVMCopyModuleFlagsMetadata(long M, long Len) {
        long __functionAddress = Functions.CopyModuleFlagsMetadata;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(__functionAddress, M, Len);
    }

    /**
     * Returns the module flags as an array of flag-key-value triples. The caller is responsible for freeing this array by calling {@code
     * {@link #LLVMDisposeModuleFlagsMetadata DisposeModuleFlagsMetadata}}.
     */
    @NativeType("LLVMModuleFlagEntry *")
    public static long LLVMCopyModuleFlagsMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("size_t *") PointerBuffer Len) {
        if (CHECKS) {
            check(Len, 1);
        }
        return nLLVMCopyModuleFlagsMetadata(M, memAddress(Len));
    }

    // --- [ LLVMDisposeModuleFlagsMetadata ] ---

    /** Destroys module flags metadata entries. */
    public static void LLVMDisposeModuleFlagsMetadata(@NativeType("LLVMModuleFlagEntry *") long Entries) {
        long __functionAddress = Functions.DisposeModuleFlagsMetadata;
        if (CHECKS) {
            check(Entries);
        }
        invokePV(__functionAddress, Entries);
    }

    // --- [ LLVMModuleFlagEntriesGetFlagBehavior ] ---

    /** Returns the flag behavior for a module flag entry at a specific index. */
    @NativeType("LLVMModuleFlagBehavior")
    public static int LLVMModuleFlagEntriesGetFlagBehavior(@NativeType("LLVMModuleFlagEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ModuleFlagEntriesGetFlagBehavior;
        if (CHECKS) {
            check(Entries);
        }
        return invokePI(__functionAddress, Entries, Index);
    }

    // --- [ LLVMModuleFlagEntriesGetKey ] ---

    /** Unsafe version of: {@link #LLVMModuleFlagEntriesGetKey ModuleFlagEntriesGetKey} */
    public static long nLLVMModuleFlagEntriesGetKey(long Entries, int Index, long Len) {
        long __functionAddress = Functions.ModuleFlagEntriesGetKey;
        if (CHECKS) {
            check(Entries);
        }
        return invokePPP(__functionAddress, Entries, Index, Len);
    }

    /** Returns the key for a module flag entry at a specific index. */
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

    /** Returns the metadata for a module flag entry at a specific index. */
    @NativeType("LLVMMetadataRef")
    public static long LLVMModuleFlagEntriesGetMetadata(@NativeType("LLVMModuleFlagEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ModuleFlagEntriesGetMetadata;
        if (CHECKS) {
            check(Entries);
        }
        return invokePP(__functionAddress, Entries, Index);
    }

    // --- [ LLVMGetModuleFlag ] ---

    /** Unsafe version of: {@link #LLVMGetModuleFlag GetModuleFlag} */
    public static long nLLVMGetModuleFlag(long M, long Key, long KeyLen) {
        long __functionAddress = Functions.GetModuleFlag;
        if (CHECKS) {
            check(M);
        }
        return invokePPPP(__functionAddress, M, Key, KeyLen);
    }

    /** Add a module-level flag to the module-level flags metadata if it doesn't already exist. */
    @NativeType("LLVMMetadataRef")
    public static long LLVMGetModuleFlag(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Key) {
        return nLLVMGetModuleFlag(M, memAddress(Key), Key.remaining());
    }

    /** Add a module-level flag to the module-level flags metadata if it doesn't already exist. */
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

    /** Unsafe version of: {@link #LLVMAddModuleFlag AddModuleFlag} */
    public static void nLLVMAddModuleFlag(long M, int Behavior, long Key, long KeyLen, long Val) {
        long __functionAddress = Functions.AddModuleFlag;
        if (CHECKS) {
            check(M);
            check(Val);
        }
        invokePPPPV(__functionAddress, M, Behavior, Key, KeyLen, Val);
    }

    /** Add a module-level flag to the module-level flags metadata if it doesn't already exist. */
    public static void LLVMAddModuleFlag(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMModuleFlagBehavior") int Behavior, @NativeType("char const *") ByteBuffer Key, @NativeType("LLVMMetadataRef") long Val) {
        nLLVMAddModuleFlag(M, Behavior, memAddress(Key), Key.remaining(), Val);
    }

    /** Add a module-level flag to the module-level flags metadata if it doesn't already exist. */
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

    /** Dump a representation of a module to {@code stderr}. */
    public static void LLVMDumpModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.DumpModule;
        if (CHECKS) {
            check(M);
        }
        invokePV(__functionAddress, M);
    }

    // --- [ LLVMPrintModuleToFile ] ---

    /** Unsafe version of: {@link #LLVMPrintModuleToFile PrintModuleToFile} */
    public static int nLLVMPrintModuleToFile(long M, long Filename, long ErrorMessage) {
        long __functionAddress = Functions.PrintModuleToFile;
        if (CHECKS) {
            check(M);
        }
        return invokePPPI(__functionAddress, M, Filename, ErrorMessage);
    }

    /**
     * Print a representation of a module to a file. The {@code ErrorMessage} needs to be disposed with {@link #LLVMDisposeMessage DisposeMessage}.
     *
     * @return 0 on success, 1 otherwise
     */
    @NativeType("LLVMBool")
    public static boolean LLVMPrintModuleToFile(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Filename, @NativeType("char **") PointerBuffer ErrorMessage) {
        if (CHECKS) {
            checkNT1(Filename);
            check(ErrorMessage, 1);
        }
        return nLLVMPrintModuleToFile(M, memAddress(Filename), memAddress(ErrorMessage)) != 0;
    }

    /**
     * Print a representation of a module to a file. The {@code ErrorMessage} needs to be disposed with {@link #LLVMDisposeMessage DisposeMessage}.
     *
     * @return 0 on success, 1 otherwise
     */
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

    /** Unsafe version of: {@link #LLVMPrintModuleToString PrintModuleToString} */
    public static long nLLVMPrintModuleToString(long M) {
        long __functionAddress = Functions.PrintModuleToString;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    /** Return a string representation of the module. Use {@link #LLVMDisposeMessage DisposeMessage} to free the string. */
    @NativeType("char *")
    public static String LLVMPrintModuleToString(@NativeType("LLVMModuleRef") long M) {
        long __result = nLLVMPrintModuleToString(M);
        return memUTF8(__result);
    }

    // --- [ LLVMGetModuleInlineAsm ] ---

    /** Unsafe version of: {@link #LLVMGetModuleInlineAsm GetModuleInlineAsm} */
    public static long nLLVMGetModuleInlineAsm(long M, long Len) {
        long __functionAddress = Functions.GetModuleInlineAsm;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(__functionAddress, M, Len);
    }

    /** Get inline assembly for a module. */
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

    /** Unsafe version of: {@link #LLVMSetModuleInlineAsm2 SetModuleInlineAsm2} */
    public static void nLLVMSetModuleInlineAsm2(long M, long Asm, long Len) {
        long __functionAddress = Functions.SetModuleInlineAsm2;
        if (CHECKS) {
            check(M);
        }
        invokePPPV(__functionAddress, M, Asm, Len);
    }

    /** Set inline assembly for a module. */
    public static void LLVMSetModuleInlineAsm2(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Asm) {
        nLLVMSetModuleInlineAsm2(M, memAddress(Asm), Asm.remaining());
    }

    /** Set inline assembly for a module. */
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

    /** Unsafe version of: {@link #LLVMAppendModuleInlineAsm AppendModuleInlineAsm} */
    public static void nLLVMAppendModuleInlineAsm(long M, long Asm, long Len) {
        long __functionAddress = Functions.AppendModuleInlineAsm;
        if (CHECKS) {
            check(M);
        }
        invokePPPV(__functionAddress, M, Asm, Len);
    }

    /** Append inline assembly to a module. */
    public static void LLVMAppendModuleInlineAsm(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Asm) {
        nLLVMAppendModuleInlineAsm(M, memAddress(Asm), Asm.remaining());
    }

    /** Append inline assembly to a module. */
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

    /** Unsafe version of: {@link #LLVMGetInlineAsm GetInlineAsm} */
    public static long nLLVMGetInlineAsm(long Ty, long AsmString, long AsmStringSize, long Constraints, long ConstraintsSize, int HasSideEffects, int IsAlignStack, int Dialect) {
        long __functionAddress = Functions.GetInlineAsm;
        if (CHECKS) {
            check(Ty);
        }
        return invokePPPPPP(__functionAddress, Ty, AsmString, AsmStringSize, Constraints, ConstraintsSize, HasSideEffects, IsAlignStack, Dialect);
    }

    /** Create the specified uniqued inline asm string. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetInlineAsm(@NativeType("LLVMTypeRef") long Ty, @NativeType("char *") ByteBuffer AsmString, @NativeType("char *") ByteBuffer Constraints, @NativeType("LLVMBool") boolean HasSideEffects, @NativeType("LLVMBool") boolean IsAlignStack, @NativeType("LLVMInlineAsmDialect") int Dialect) {
        return nLLVMGetInlineAsm(Ty, memAddress(AsmString), AsmString.remaining(), memAddress(Constraints), Constraints.remaining(), HasSideEffects ? 1 : 0, IsAlignStack ? 1 : 0, Dialect);
    }

    // --- [ LLVMGetModuleContext ] ---

    /** Obtain the context to which this module is associated. */
    @NativeType("LLVMContextRef")
    public static long LLVMGetModuleContext(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetModuleContext;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetTypeByName ] ---

    /** Unsafe version of: {@link #LLVMGetTypeByName GetTypeByName} */
    public static long nLLVMGetTypeByName(long M, long Name) {
        long __functionAddress = Functions.GetTypeByName;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(__functionAddress, M, Name);
    }

    /** Obtain a Type from a module by its registered name. */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetTypeByName(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetTypeByName(M, memAddress(Name));
    }

    /** Obtain a Type from a module by its registered name. */
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

    /** Obtain an iterator to the first {@code NamedMDNode} in a {@code Module}. */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetFirstNamedMetadata(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstNamedMetadata;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetLastNamedMetadata ] ---

    /** Obtain an iterator to the last {@code NamedMDNode} in a {@code Module}. */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetLastNamedMetadata(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastNamedMetadata;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetNextNamedMetadata ] ---

    /**
     * Advance a {@code NamedMDNode} iterator to the next {@code NamedMDNode}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the end and there are no more named metadata nodes.</p>
     */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetNextNamedMetadata(@NativeType("LLVMNamedMDNodeRef") long NamedMDNode) {
        long __functionAddress = Functions.GetNextNamedMetadata;
        if (CHECKS) {
            check(NamedMDNode);
        }
        return invokePP(__functionAddress, NamedMDNode);
    }

    // --- [ LLVMGetPreviousNamedMetadata ] ---

    /**
     * Decrement a {@code NamedMDNode} iterator to the previous {@code NamedMDNode}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the beginning and there are no previous named metadata nodes.</p>
     */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetPreviousNamedMetadata(@NativeType("LLVMNamedMDNodeRef") long NamedMDNode) {
        long __functionAddress = Functions.GetPreviousNamedMetadata;
        if (CHECKS) {
            check(NamedMDNode);
        }
        return invokePP(__functionAddress, NamedMDNode);
    }

    // --- [ LLVMGetNamedMetadata ] ---

    /** Unsafe version of: {@link #LLVMGetNamedMetadata GetNamedMetadata} */
    public static long nLLVMGetNamedMetadata(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetNamedMetadata;
        if (CHECKS) {
            check(M);
        }
        return invokePPPP(__functionAddress, M, Name, NameLen);
    }

    /** Retrieve a {@code NamedMDNode} with the given name, returning {@code NULL} if no such node exists. */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetNamedMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetNamedMetadata(M, memAddress(Name), Name.remaining());
    }

    /** Retrieve a {@code NamedMDNode} with the given name, returning {@code NULL} if no such node exists. */
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

    /** Unsafe version of: {@link #LLVMGetOrInsertNamedMetadata GetOrInsertNamedMetadata} */
    public static long nLLVMGetOrInsertNamedMetadata(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetOrInsertNamedMetadata;
        if (CHECKS) {
            check(M);
        }
        return invokePPPP(__functionAddress, M, Name, NameLen);
    }

    /** Retrieve a {@code NamedMDNode} with the given name, creating a new node if no such node exists. */
    @NativeType("LLVMNamedMDNodeRef")
    public static long LLVMGetOrInsertNamedMetadata(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetOrInsertNamedMetadata(M, memAddress(Name), Name.remaining());
    }

    /** Retrieve a {@code NamedMDNode} with the given name, creating a new node if no such node exists. */
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

    /** Unsafe version of: {@link #LLVMGetNamedMetadataName GetNamedMetadataName} */
    public static long nLLVMGetNamedMetadataName(long NamedMD, long NameLen) {
        long __functionAddress = Functions.GetNamedMetadataName;
        if (CHECKS) {
            check(NamedMD);
        }
        return invokePPP(__functionAddress, NamedMD, NameLen);
    }

    /** Retrieve the name of a {@code NamedMDNode}. */
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

    /** Unsafe version of: {@link #LLVMGetNamedMetadataNumOperands GetNamedMetadataNumOperands} */
    public static int nLLVMGetNamedMetadataNumOperands(long M, long Name) {
        long __functionAddress = Functions.GetNamedMetadataNumOperands;
        if (CHECKS) {
            check(M);
        }
        return invokePPI(__functionAddress, M, Name);
    }

    /** Obtain the number of operands for named metadata in a module. */
    @NativeType("unsigned int")
    public static int LLVMGetNamedMetadataNumOperands(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetNamedMetadataNumOperands(M, memAddress(Name));
    }

    /** Obtain the number of operands for named metadata in a module. */
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

    /** Unsafe version of: {@link #LLVMGetNamedMetadataOperands GetNamedMetadataOperands} */
    public static void nLLVMGetNamedMetadataOperands(long M, long Name, long Dest) {
        long __functionAddress = Functions.GetNamedMetadataOperands;
        if (CHECKS) {
            check(M);
        }
        invokePPPV(__functionAddress, M, Name, Dest);
    }

    /**
     * Obtain the named metadata operands for a module.
     * 
     * <p>The passed {@code LLVMValueRef} pointer should refer to an array of {@code LLVMValueRef} at least {@link #LLVMGetNamedMetadataNumOperands GetNamedMetadataNumOperands} long. This array will
     * be populated with the {@code LLVMValueRef} instances. Each instance corresponds to a {@code llvm::MDNode}.</p>
     */
    public static void LLVMGetNamedMetadataOperands(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMValueRef *") PointerBuffer Dest) {
        if (CHECKS) {
            checkNT1(Name);
            if (DEBUG) {
                check(Dest, LLVMGetNamedMetadataNumOperands(M, Name));
            }
        }
        nLLVMGetNamedMetadataOperands(M, memAddress(Name), memAddress(Dest));
    }

    /**
     * Obtain the named metadata operands for a module.
     * 
     * <p>The passed {@code LLVMValueRef} pointer should refer to an array of {@code LLVMValueRef} at least {@link #LLVMGetNamedMetadataNumOperands GetNamedMetadataNumOperands} long. This array will
     * be populated with the {@code LLVMValueRef} instances. Each instance corresponds to a {@code llvm::MDNode}.</p>
     */
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

    /** Unsafe version of: {@link #LLVMAddNamedMetadataOperand AddNamedMetadataOperand} */
    public static void nLLVMAddNamedMetadataOperand(long M, long Name, long Val) {
        long __functionAddress = Functions.AddNamedMetadataOperand;
        if (CHECKS) {
            check(M);
            check(Val);
        }
        invokePPPV(__functionAddress, M, Name, Val);
    }

    /** Add an operand to named metadata. */
    public static void LLVMAddNamedMetadataOperand(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMValueRef") long Val) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMAddNamedMetadataOperand(M, memAddress(Name), Val);
    }

    /** Add an operand to named metadata. */
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

    /** Unsafe version of: {@link #LLVMGetDebugLocDirectory GetDebugLocDirectory} */
    public static long nLLVMGetDebugLocDirectory(long Val, long Length) {
        long __functionAddress = Functions.GetDebugLocDirectory;
        if (CHECKS) {
            check(Val);
        }
        return invokePPP(__functionAddress, Val, Length);
    }

    /**
     * Return the directory of the debug location for this value, which must be an {@code llvm::Instruction}, {@code llvm::GlobalVariable}, or
     * {@code llvm::Function}.
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetDebugLocDirectory(@NativeType("LLVMValueRef") long Val) {
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

    /** Unsafe version of: {@link #LLVMGetDebugLocFilename GetDebugLocFilename} */
    public static long nLLVMGetDebugLocFilename(long Val, long Length) {
        long __functionAddress = Functions.GetDebugLocFilename;
        if (CHECKS) {
            check(Val);
        }
        return invokePPP(__functionAddress, Val, Length);
    }

    /**
     * Return the filename of the debug location for this value, which must be an {@code llvm::Instruction}, {@code llvm::GlobalVariable}, or
     * {@code llvm::Function}.
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetDebugLocFilename(@NativeType("LLVMValueRef") long Val) {
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

    /**
     * Return the line number of the debug location for this value, which must be an {@code llvm::Instruction}, {@code llvm::GlobalVariable}, or
     * {@code llvm::Function}.
     */
    @NativeType("unsigned int")
    public static int LLVMGetDebugLocLine(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetDebugLocLine;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val);
    }

    // --- [ LLVMGetDebugLocColumn ] ---

    /** Return the column number of the debug location for this value, which must be an {@code llvm::Instruction}. */
    @NativeType("unsigned int")
    public static int LLVMGetDebugLocColumn(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetDebugLocColumn;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val);
    }

    // --- [ LLVMAddFunction ] ---

    /** Unsafe version of: {@link #LLVMAddFunction AddFunction} */
    public static long nLLVMAddFunction(long M, long Name, long FunctionTy) {
        long __functionAddress = Functions.AddFunction;
        if (CHECKS) {
            check(M);
            check(FunctionTy);
        }
        return invokePPPP(__functionAddress, M, Name, FunctionTy);
    }

    /** Add a function to a module under a specified name. */
    @NativeType("LLVMValueRef")
    public static long LLVMAddFunction(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name, @NativeType("LLVMTypeRef") long FunctionTy) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddFunction(M, memAddress(Name), FunctionTy);
    }

    /** Add a function to a module under a specified name. */
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

    /** Unsafe version of: {@link #LLVMGetNamedFunction GetNamedFunction} */
    public static long nLLVMGetNamedFunction(long M, long Name) {
        long __functionAddress = Functions.GetNamedFunction;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(__functionAddress, M, Name);
    }

    /**
     * Obtain a {@code Function} value from a {@code Module} by its name.
     * 
     * <p>The returned value corresponds to a {@code llvm::Function} value.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedFunction(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetNamedFunction(M, memAddress(Name));
    }

    /**
     * Obtain a {@code Function} value from a {@code Module} by its name.
     * 
     * <p>The returned value corresponds to a {@code llvm::Function} value.</p>
     */
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

    // --- [ LLVMGetFirstFunction ] ---

    /** Obtain an iterator to the first {@code Function} in a {@code Module}. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstFunction(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstFunction;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetLastFunction ] ---

    /** Obtain an iterator to the last {@code Function} in a {@code Module}. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastFunction(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastFunction;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetNextFunction ] ---

    /**
     * Advance a {@code Function} iterator to the next {@code Function}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the end and there are no more functions.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextFunction(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetNextFunction;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMGetPreviousFunction ] ---

    /**
     * Decrement a {@code Function} iterator to the previous {@code Function}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the beginning and there are no previous functions.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousFunction(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetPreviousFunction;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMSetModuleInlineAsm ] ---

    /** Unsafe version of: {@link #LLVMSetModuleInlineAsm SetModuleInlineAsm} */
    public static void nLLVMSetModuleInlineAsm(long M, long Asm) {
        long __functionAddress = Functions.SetModuleInlineAsm;
        if (CHECKS) {
            check(M);
        }
        invokePPV(__functionAddress, M, Asm);
    }

    /** Deprecated: Use {@link #LLVMSetModuleInlineAsm2 SetModuleInlineAsm2} instead. */
    public static void LLVMSetModuleInlineAsm(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Asm) {
        if (CHECKS) {
            checkNT1(Asm);
        }
        nLLVMSetModuleInlineAsm(M, memAddress(Asm));
    }

    /** Deprecated: Use {@link #LLVMSetModuleInlineAsm2 SetModuleInlineAsm2} instead. */
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

    /** Obtain the enumerated type of a {@code Type} instance. */
    @NativeType("LLVMTypeKind")
    public static int LLVMGetTypeKind(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetTypeKind;
        if (CHECKS) {
            check(Ty);
        }
        return invokePI(__functionAddress, Ty);
    }

    // --- [ LLVMTypeIsSized ] ---

    /**
     * Whether the type has a known size.
     * 
     * <p>Things that don't have a size are abstract types, labels, and void.</p>
     */
    @NativeType("LLVMBool")
    public static boolean LLVMTypeIsSized(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.TypeIsSized;
        if (CHECKS) {
            check(Ty);
        }
        return invokePI(__functionAddress, Ty) != 0;
    }

    // --- [ LLVMGetTypeContext ] ---

    /** Obtain the context to which this type instance is associated. */
    @NativeType("LLVMContextRef")
    public static long LLVMGetTypeContext(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetTypeContext;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMDumpType ] ---

    /** Dump a representation of a type to {@code stderr}. */
    public static void LLVMDumpType(@NativeType("LLVMTypeRef") long Val) {
        long __functionAddress = Functions.DumpType;
        if (CHECKS) {
            check(Val);
        }
        invokePV(__functionAddress, Val);
    }

    // --- [ LLVMPrintTypeToString ] ---

    /** Unsafe version of: {@link #LLVMPrintTypeToString PrintTypeToString} */
    public static long nLLVMPrintTypeToString(long Val) {
        long __functionAddress = Functions.PrintTypeToString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    /** Return a string representation of the type. Use {@link #LLVMDisposeMessage DisposeMessage} to free the string. */
    @NativeType("char *")
    public static String LLVMPrintTypeToString(@NativeType("LLVMTypeRef") long Val) {
        long __result = nLLVMPrintTypeToString(Val);
        return memUTF8(__result);
    }

    // --- [ LLVMInt1TypeInContext ] ---

    /** Obtain an integer type from a context with specified bit width. */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt1TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int1TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMInt8TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt8TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int8TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMInt16TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt16TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int16TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMInt32TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt32TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int32TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMInt64TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt64TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int64TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMInt128TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMIntTypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMIntTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("unsigned int") int NumBits) {
        long __functionAddress = Functions.IntTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C, NumBits);
    }

    // --- [ LLVMInt1Type ] ---

    /** Obtain an integer type from the global context with a specified bit width. */
    @NativeType("LLVMTypeRef")
    public static long LLVMInt1Type() {
        long __functionAddress = Functions.Int1Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt8Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt8Type() {
        long __functionAddress = Functions.Int8Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt16Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt16Type() {
        long __functionAddress = Functions.Int16Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt32Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt32Type() {
        long __functionAddress = Functions.Int32Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt64Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt64Type() {
        long __functionAddress = Functions.Int64Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMInt128Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt128Type() {
        long __functionAddress = Functions.Int128Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMIntType ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMIntType(@NativeType("unsigned int") int NumBits) {
        long __functionAddress = Functions.IntType;
        return invokeP(__functionAddress, NumBits);
    }

    // --- [ LLVMGetIntTypeWidth ] ---

    @NativeType("unsigned int")
    public static int LLVMGetIntTypeWidth(@NativeType("LLVMTypeRef") long IntegerTy) {
        long __functionAddress = Functions.GetIntTypeWidth;
        if (CHECKS) {
            check(IntegerTy);
        }
        return invokePI(__functionAddress, IntegerTy);
    }

    // --- [ LLVMHalfTypeInContext ] ---

    /** Obtain a 16-bit floating point type from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMHalfTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.HalfTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMFloatTypeInContext ] ---

    /** Obtain a 32-bit floating point type from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMFloatTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.FloatTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMDoubleTypeInContext ] ---

    /** Obtain a 64-bit floating point type from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMDoubleTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.DoubleTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMX86FP80TypeInContext ] ---

    /** Obtain a 80-bit floating point type (X87) from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86FP80TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.X86FP80TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMFP128TypeInContext ] ---

    /** Obtain a 128-bit floating point type (112-bit mantissa) from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMFP128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.FP128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMPPCFP128TypeInContext ] ---

    /** Obtain a 128-bit floating point type (two 64-bits) from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMPPCFP128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.PPCFP128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMHalfType ] ---

    /**
     * Obtain a floating point type from the global context.
     * 
     * <p>These map to the functions in this group of the same name.</p>
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMHalfType() {
        long __functionAddress = Functions.HalfType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMFloatType ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMFloatType() {
        long __functionAddress = Functions.FloatType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMDoubleType ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMDoubleType() {
        long __functionAddress = Functions.DoubleType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMX86FP80Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMX86FP80Type() {
        long __functionAddress = Functions.X86FP80Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMFP128Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMFP128Type() {
        long __functionAddress = Functions.FP128Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMPPCFP128Type ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMPPCFP128Type() {
        long __functionAddress = Functions.PPCFP128Type;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMFunctionType ] ---

    /** Unsafe version of: {@link #LLVMFunctionType FunctionType} */
    public static long nLLVMFunctionType(long ReturnType, long ParamTypes, int ParamCount, int IsVarArg) {
        long __functionAddress = Functions.FunctionType;
        if (CHECKS) {
            check(ReturnType);
        }
        return invokePPP(__functionAddress, ReturnType, ParamTypes, ParamCount, IsVarArg);
    }

    /**
     * Obtain a function type consisting of a specified signature.
     * 
     * <p>The function is defined as a tuple of a return {@code Type}, a list of parameter types, and whether the function is variadic.</p>
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMFunctionType(@NativeType("LLVMTypeRef") long ReturnType, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes, @NativeType("LLVMBool") boolean IsVarArg) {
        return nLLVMFunctionType(ReturnType, memAddress(ParamTypes), ParamTypes.remaining(), IsVarArg ? 1 : 0);
    }

    // --- [ LLVMIsFunctionVarArg ] ---

    /** Returns whether a function type is variadic. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsFunctionVarArg(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.IsFunctionVarArg;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePI(__functionAddress, FunctionTy) != 0;
    }

    // --- [ LLVMGetReturnType ] ---

    /** Obtain the Type this function Type returns. */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetReturnType(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.GetReturnType;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePP(__functionAddress, FunctionTy);
    }

    // --- [ LLVMCountParamTypes ] ---

    /** Obtain the number of parameters this function accepts. */
    @NativeType("unsigned int")
    public static int LLVMCountParamTypes(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.CountParamTypes;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePI(__functionAddress, FunctionTy);
    }

    // --- [ LLVMGetParamTypes ] ---

    /** Unsafe version of: {@link #LLVMGetParamTypes GetParamTypes} */
    public static void nLLVMGetParamTypes(long FunctionTy, long Dest) {
        long __functionAddress = Functions.GetParamTypes;
        if (CHECKS) {
            check(FunctionTy);
        }
        invokePPV(__functionAddress, FunctionTy, Dest);
    }

    /**
     * Obtain the types of a function's parameters.
     * 
     * <p>The {@code Dest} parameter should point to a pre-allocated array of {@code LLVMTypeRef} at least {@link #LLVMCountParamTypes CountParamTypes} large. On return, the first
     * {@code LLVMCountParamTypes()} entries in the array will be populated with {@code LLVMTypeRef} instances.</p>
     *
     * @param FunctionTy the function type to operate on
     * @param Dest       memory address of an array to be filled with result
     */
    public static void LLVMGetParamTypes(@NativeType("LLVMTypeRef") long FunctionTy, @NativeType("LLVMTypeRef *") PointerBuffer Dest) {
        if (CHECKS) {
            if (DEBUG) {
                check(Dest, LLVMCountParamTypes(FunctionTy));
            }
        }
        nLLVMGetParamTypes(FunctionTy, memAddress(Dest));
    }

    // --- [ LLVMStructTypeInContext ] ---

    /** Unsafe version of: {@link #LLVMStructTypeInContext StructTypeInContext} */
    public static long nLLVMStructTypeInContext(long C, long ElementTypes, int ElementCount, int Packed) {
        long __functionAddress = Functions.StructTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, C, ElementTypes, ElementCount, Packed);
    }

    /**
     * Create a new structure type in a context.
     * 
     * <p>A structure is specified by a list of inner elements/types and whether these can be packed together.</p>
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMTypeRef *") PointerBuffer ElementTypes, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMStructTypeInContext(C, memAddress(ElementTypes), ElementTypes.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMStructType ] ---

    /** Unsafe version of: {@link #LLVMStructType StructType} */
    public static long nLLVMStructType(long ElementTypes, int ElementCount, int Packed) {
        long __functionAddress = Functions.StructType;
        return invokePP(__functionAddress, ElementTypes, ElementCount, Packed);
    }

    /** Create a new structure type in the global context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructType(@NativeType("LLVMTypeRef *") PointerBuffer ElementTypes, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMStructType(memAddress(ElementTypes), ElementTypes.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMStructCreateNamed ] ---

    /** Unsafe version of: {@link #LLVMStructCreateNamed StructCreateNamed} */
    public static long nLLVMStructCreateNamed(long C, long Name) {
        long __functionAddress = Functions.StructCreateNamed;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, C, Name);
    }

    /** Create an empty structure in a context having a specified name. */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructCreateNamed(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMStructCreateNamed(C, memAddress(Name));
    }

    /** Create an empty structure in a context having a specified name. */
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

    /** Unsafe version of: {@link #LLVMGetStructName GetStructName} */
    public static long nLLVMGetStructName(long Ty) {
        long __functionAddress = Functions.GetStructName;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    /** Obtain the name of a structure. */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetStructName(@NativeType("LLVMTypeRef") long Ty) {
        long __result = nLLVMGetStructName(Ty);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMStructSetBody ] ---

    /** Unsafe version of: {@link #LLVMStructSetBody StructSetBody} */
    public static void nLLVMStructSetBody(long StructTy, long ElementTypes, int ElementCount, int Packed) {
        long __functionAddress = Functions.StructSetBody;
        if (CHECKS) {
            check(StructTy);
        }
        invokePPV(__functionAddress, StructTy, ElementTypes, ElementCount, Packed);
    }

    /** Set the contents of a structure type. */
    public static void LLVMStructSetBody(@NativeType("LLVMTypeRef") long StructTy, @NativeType("LLVMTypeRef *") PointerBuffer ElementTypes, @NativeType("LLVMBool") boolean Packed) {
        nLLVMStructSetBody(StructTy, memAddress(ElementTypes), ElementTypes.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMCountStructElementTypes ] ---

    /** Get the number of elements defined inside the structure. */
    @NativeType("unsigned int")
    public static int LLVMCountStructElementTypes(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.CountStructElementTypes;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(__functionAddress, StructTy);
    }

    // --- [ LLVMGetStructElementTypes ] ---

    /** Unsafe version of: {@link #LLVMGetStructElementTypes GetStructElementTypes} */
    public static void nLLVMGetStructElementTypes(long StructTy, long Dest) {
        long __functionAddress = Functions.GetStructElementTypes;
        if (CHECKS) {
            check(StructTy);
        }
        invokePPV(__functionAddress, StructTy, Dest);
    }

    /**
     * Get the elements within a structure.
     * 
     * <p>The function is passed the address of a pre-allocated array of {@code LLVMTypeRef} at least {@link #LLVMCountStructElementTypes CountStructElementTypes} long. After invocation, this
     * array will be populated with the structure's elements. The objects in the destination array will have a lifetime of the structure type itself, which is
     * the lifetime of the context it is contained in.</p>
     */
    public static void LLVMGetStructElementTypes(@NativeType("LLVMTypeRef") long StructTy, @NativeType("LLVMTypeRef *") PointerBuffer Dest) {
        if (CHECKS) {
            if (DEBUG) {
                check(Dest, LLVMCountStructElementTypes(StructTy));
            }
        }
        nLLVMGetStructElementTypes(StructTy, memAddress(Dest));
    }

    // --- [ LLVMStructGetTypeAtIndex ] ---

    /** Get the type of the element at a given index in the structure. */
    @NativeType("LLVMTypeRef")
    public static long LLVMStructGetTypeAtIndex(@NativeType("LLVMTypeRef") long StructTy, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.StructGetTypeAtIndex;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePP(__functionAddress, StructTy, i);
    }

    // --- [ LLVMIsPackedStruct ] ---

    /** Determine whether a structure is packed. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsPackedStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsPackedStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(__functionAddress, StructTy) != 0;
    }

    // --- [ LLVMIsOpaqueStruct ] ---

    /** Determine whether a structure is opaque. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsOpaqueStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsOpaqueStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(__functionAddress, StructTy) != 0;
    }

    // --- [ LLVMIsLiteralStruct ] ---

    /** Determine whether a structure is literal. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsLiteralStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsLiteralStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(__functionAddress, StructTy) != 0;
    }

    // --- [ LLVMGetElementType ] ---

    /**
     * Obtain the type of elements within a sequential type.
     * 
     * <p>This works on array, vector, and pointer types.</p>
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetElementType(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetElementType;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMGetSubtypes ] ---

    /** Unsafe version of: {@link #LLVMGetSubtypes GetSubtypes} */
    public static void nLLVMGetSubtypes(long Tp, long Arr) {
        long __functionAddress = Functions.GetSubtypes;
        if (CHECKS) {
            check(Tp);
        }
        invokePPV(__functionAddress, Tp, Arr);
    }

    /** Returns type's subtypes */
    public static void LLVMGetSubtypes(@NativeType("LLVMTypeRef") long Tp, @NativeType("LLVMTypeRef *") PointerBuffer Arr) {
        nLLVMGetSubtypes(Tp, memAddress(Arr));
    }

    // --- [ LLVMGetNumContainedTypes ] ---

    /** Return the number of types in the derived type. */
    @NativeType("unsigned int")
    public static int LLVMGetNumContainedTypes(@NativeType("LLVMTypeRef") long Tp) {
        long __functionAddress = Functions.GetNumContainedTypes;
        if (CHECKS) {
            check(Tp);
        }
        return invokePI(__functionAddress, Tp);
    }

    // --- [ LLVMArrayType ] ---

    /**
     * Create a fixed size array type that refers to a specific type.
     * 
     * <p>The created type will exist in the context that its element type exists in.</p>
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMArrayType(@NativeType("LLVMTypeRef") long ElementType, @NativeType("unsigned int") int ElementCount) {
        long __functionAddress = Functions.ArrayType;
        if (CHECKS) {
            check(ElementType);
        }
        return invokePP(__functionAddress, ElementType, ElementCount);
    }

    // --- [ LLVMGetArrayLength ] ---

    /**
     * Obtain the length of an array type.
     * 
     * <p>This only works on types that represent arrays.</p>
     */
    @NativeType("unsigned int")
    public static int LLVMGetArrayLength(@NativeType("LLVMTypeRef") long ArrayTy) {
        long __functionAddress = Functions.GetArrayLength;
        if (CHECKS) {
            check(ArrayTy);
        }
        return invokePI(__functionAddress, ArrayTy);
    }

    // --- [ LLVMPointerType ] ---

    /**
     * Create a pointer type that points to a defined type.
     * 
     * <p>The created type will exist in the context that its pointee type exists in.</p>
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMPointerType(@NativeType("LLVMTypeRef") long ElementType, @NativeType("unsigned int") int AddressSpace) {
        long __functionAddress = Functions.PointerType;
        if (CHECKS) {
            check(ElementType);
        }
        return invokePP(__functionAddress, ElementType, AddressSpace);
    }

    // --- [ LLVMGetPointerAddressSpace ] ---

    /**
     * Obtain the address space of a pointer type.
     * 
     * <p>This only works on types that represent pointers.</p>
     */
    @NativeType("unsigned int")
    public static int LLVMGetPointerAddressSpace(@NativeType("LLVMTypeRef") long PointerTy) {
        long __functionAddress = Functions.GetPointerAddressSpace;
        if (CHECKS) {
            check(PointerTy);
        }
        return invokePI(__functionAddress, PointerTy);
    }

    // --- [ LLVMVectorType ] ---

    /**
     * Create a vector type that contains a defined type and has a specific number of elements.
     * 
     * <p>The created type will exist in the context thats its element type exists in.</p>
     */
    @NativeType("LLVMTypeRef")
    public static long LLVMVectorType(@NativeType("LLVMTypeRef") long ElementType, @NativeType("unsigned int") int ElementCount) {
        long __functionAddress = Functions.VectorType;
        if (CHECKS) {
            check(ElementType);
        }
        return invokePP(__functionAddress, ElementType, ElementCount);
    }

    // --- [ LLVMGetVectorSize ] ---

    /**
     * Obtain the number of elements in a vector type.
     * 
     * <p>This only works on types that represent vectors.</p>
     */
    @NativeType("unsigned int")
    public static int LLVMGetVectorSize(@NativeType("LLVMTypeRef") long VectorTy) {
        long __functionAddress = Functions.GetVectorSize;
        if (CHECKS) {
            check(VectorTy);
        }
        return invokePI(__functionAddress, VectorTy);
    }

    // --- [ LLVMVoidTypeInContext ] ---

    /** Create a void type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMVoidTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.VoidTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMLabelTypeInContext ] ---

    /** Create a label type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMLabelTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.LabelTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMX86MMXTypeInContext ] ---

    /** Create a X86 MMX type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86MMXTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.X86MMXTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMTokenTypeInContext ] ---

    /** Create a token type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMTokenTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.TokenTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMMetadataTypeInContext ] ---

    /** Create a metadata type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMMetadataTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.MetadataTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMVoidType ] ---

    /** These are similar to the above functions except they operate on the global context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMVoidType() {
        long __functionAddress = Functions.VoidType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMLabelType ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMLabelType() {
        long __functionAddress = Functions.LabelType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMX86MMXType ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMX86MMXType() {
        long __functionAddress = Functions.X86MMXType;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMTypeOf ] ---

    /** Obtain the type of a value. */
    @NativeType("LLVMTypeRef")
    public static long LLVMTypeOf(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.TypeOf;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMGetValueKind ] ---

    /** Obtain the enumerated type of a Value instance. */
    @NativeType("LLVMValueKind")
    public static int LLVMGetValueKind(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetValueKind;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val);
    }

    // --- [ LLVMGetValueName2 ] ---

    /** Unsafe version of: {@link #LLVMGetValueName2 GetValueName2} */
    public static long nLLVMGetValueName2(long Val, long Length) {
        long __functionAddress = Functions.GetValueName2;
        if (CHECKS) {
            check(Val);
        }
        return invokePPP(__functionAddress, Val, Length);
    }

    /** Obtain the string name of a value. */
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

    /** Unsafe version of: {@link #LLVMSetValueName2 SetValueName2} */
    public static void nLLVMSetValueName2(long Val, long Name, long NameLen) {
        long __functionAddress = Functions.SetValueName2;
        if (CHECKS) {
            check(Val);
        }
        invokePPPV(__functionAddress, Val, Name, NameLen);
    }

    /** Set the string name of a value. */
    public static void LLVMSetValueName2(@NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        nLLVMSetValueName2(Val, memAddress(Name), Name.remaining());
    }

    /** Set the string name of a value. */
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

    /** Dump a representation of a value to stderr. */
    public static void LLVMDumpValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.DumpValue;
        if (CHECKS) {
            check(Val);
        }
        invokePV(__functionAddress, Val);
    }

    // --- [ LLVMPrintValueToString ] ---

    /** Unsafe version of: {@link #LLVMPrintValueToString PrintValueToString} */
    public static long nLLVMPrintValueToString(long Val) {
        long __functionAddress = Functions.PrintValueToString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    /** Return a string representation of the value. Use {@link #LLVMDisposeMessage DisposeMessage} to free the string. */
    @NativeType("char *")
    public static String LLVMPrintValueToString(@NativeType("LLVMValueRef") long Val) {
        long __result = nLLVMPrintValueToString(Val);
        return memUTF8(__result);
    }

    // --- [ LLVMReplaceAllUsesWith ] ---

    /** Replace all uses of a value with another one. */
    public static void LLVMReplaceAllUsesWith(@NativeType("LLVMValueRef") long OldVal, @NativeType("LLVMValueRef") long NewVal) {
        long __functionAddress = Functions.ReplaceAllUsesWith;
        if (CHECKS) {
            check(OldVal);
            check(NewVal);
        }
        invokePPV(__functionAddress, OldVal, NewVal);
    }

    // --- [ LLVMIsConstant ] ---

    /** Determine whether the specified value instance is constant. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsConstant(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsConstant;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val) != 0;
    }

    // --- [ LLVMIsUndef ] ---

    /** Determine whether a value instance is undefined. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsUndef(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsUndef;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val) != 0;
    }

    // --- [ LLVMIsAArgument ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAArgument(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAArgument;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsABasicBlock ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAInlineAsm ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInlineAsm(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInlineAsm;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAUser ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUser(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUser;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstant ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstant(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstant;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsABlockAddress ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABlockAddress(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABlockAddress;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantAggregateZero ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantAggregateZero(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantAggregateZero;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantArray ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantArray(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantArray;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantDataSequential ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataSequential(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataSequential;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantDataArray ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataArray(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataArray;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantDataVector ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataVector(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataVector;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantExpr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantExpr(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantExpr;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantFP ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantFP(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantFP;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantInt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantInt(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantInt;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantPointerNull ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantPointerNull(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantPointerNull;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantStruct ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantStruct(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantStruct;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantTokenNone ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantTokenNone(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantTokenNone;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAConstantVector ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantVector(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantVector;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAGlobalValue ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalValue;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAGlobalAlias ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalAlias(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalAlias;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAGlobalIFunc ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalIFunc(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalIFunc;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAGlobalObject ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalObject(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalObject;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAFunction ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFunction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFunction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAGlobalVariable ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalVariable(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalVariable;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAUndefValue ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUndefValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUndefValue;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAInstruction ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInstruction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInstruction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsABinaryOperator ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABinaryOperator(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABinaryOperator;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsACallInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACallInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACallInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAIntrinsicInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAIntrinsicInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIntrinsicInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsADbgInfoIntrinsic ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgInfoIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgInfoIntrinsic;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsADbgVariableIntrinsic ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgVariableIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgVariableIntrinsic;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsADbgDeclareInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgDeclareInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgDeclareInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsADbgLabelInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgLabelInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgLabelInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAMemIntrinsic ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemIntrinsic;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAMemCpyInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemCpyInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemCpyInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAMemMoveInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemMoveInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemMoveInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAMemSetInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemSetInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemSetInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsACmpInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAFCmpInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFCmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFCmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAICmpInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAICmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAICmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAExtractElementInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAExtractElementInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAExtractElementInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAGetElementPtrInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGetElementPtrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGetElementPtrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAInsertElementInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInsertElementInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInsertElementInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAInsertValueInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInsertValueInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInsertValueInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsALandingPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsALandingPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsALandingPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAPHINode ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAPHINode(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAPHINode;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsASelectInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASelectInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASelectInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAShuffleVectorInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAShuffleVectorInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAShuffleVectorInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAStoreInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAStoreInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAStoreInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsABranchInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABranchInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABranchInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAIndirectBrInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAIndirectBrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIndirectBrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAInvokeInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInvokeInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInvokeInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAReturnInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsASwitchInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASwitchInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASwitchInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAUnreachableInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUnreachableInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUnreachableInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAResumeInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAResumeInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAResumeInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsACleanupReturnInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACleanupReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACleanupReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsACatchReturnInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACatchReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACatchReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAFuncletPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFuncletPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFuncletPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsACatchPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACatchPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACatchPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsACleanupPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACleanupPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACleanupPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAUnaryInstruction ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUnaryInstruction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUnaryInstruction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAAllocaInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAAllocaInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAllocaInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsACastInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAAddrSpaceCastInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAAddrSpaceCastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAddrSpaceCastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsABitCastInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABitCastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABitCastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAFPExtInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAFPToSIInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPToSIInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPToSIInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAFPToUIInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPToUIInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPToUIInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAFPTruncInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPTruncInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPTruncInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAIntToPtrInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAIntToPtrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIntToPtrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAPtrToIntInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAPtrToIntInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAPtrToIntInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsASExtInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsASIToFPInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASIToFPInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASIToFPInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsATruncInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsATruncInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsATruncInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAUIToFPInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUIToFPInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUIToFPInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAZExtInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAZExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAZExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAExtractValueInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAExtractValueInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAExtractValueInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsALoadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsALoadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsALoadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAVAArgInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAVAArgInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAVAArgInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAMDNode ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMDNode(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMDNode;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMIsAMDString ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMDString(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMDString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMGetValueName ] ---

    /** Unsafe version of: {@link #LLVMGetValueName GetValueName} */
    public static long nLLVMGetValueName(long Val) {
        long __functionAddress = Functions.GetValueName;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    /** Deprecated: Use {@link #LLVMGetValueName2 GetValueName2} instead. */
    @NativeType("char const *")
    public static String LLVMGetValueName(@NativeType("LLVMValueRef") long Val) {
        long __result = nLLVMGetValueName(Val);
        return memUTF8(__result);
    }

    // --- [ LLVMSetValueName ] ---

    /** Unsafe version of: {@link #LLVMSetValueName SetValueName} */
    public static void nLLVMSetValueName(long Val, long Name) {
        long __functionAddress = Functions.SetValueName;
        if (CHECKS) {
            check(Val);
        }
        invokePPV(__functionAddress, Val, Name);
    }

    /** Deprecated: Use {@link #LLVMSetValueName2 SetValueName2} instead. */
    public static void LLVMSetValueName(@NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMSetValueName(Val, memAddress(Name));
    }

    /** Deprecated: Use {@link #LLVMSetValueName2 SetValueName2} instead. */
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

    /**
     * Obtain the first use of a value.
     * 
     * <p>Uses are obtained in an iterator fashion. First, call this function to obtain a reference to the first use. Then, call {@link #LLVMGetNextUse GetNextUse} on that instance
     * and all subsequently obtained instances until {@link #LLVMGetNextUse GetNextUse} returns {@code NULL}.</p>
     */
    @NativeType("LLVMUseRef")
    public static long LLVMGetFirstUse(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetFirstUse;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMGetNextUse ] ---

    /**
     * Obtain the next use of a value.
     * 
     * <p>This effectively advances the iterator. It returns {@code NULL} if you are on the final use and no more are available.</p>
     */
    @NativeType("LLVMUseRef")
    public static long LLVMGetNextUse(@NativeType("LLVMUseRef") long U) {
        long __functionAddress = Functions.GetNextUse;
        if (CHECKS) {
            check(U);
        }
        return invokePP(__functionAddress, U);
    }

    // --- [ LLVMGetUser ] ---

    /**
     * Obtain the user value for a user.
     * 
     * <p>The returned value corresponds to a {@code llvm::User} type.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUser(@NativeType("LLVMUseRef") long U) {
        long __functionAddress = Functions.GetUser;
        if (CHECKS) {
            check(U);
        }
        return invokePP(__functionAddress, U);
    }

    // --- [ LLVMGetUsedValue ] ---

    /** Obtain the value this use corresponds to. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUsedValue(@NativeType("LLVMUseRef") long U) {
        long __functionAddress = Functions.GetUsedValue;
        if (CHECKS) {
            check(U);
        }
        return invokePP(__functionAddress, U);
    }

    // --- [ LLVMGetOperand ] ---

    /** Obtain an operand at a specific index in a {@code llvm::User} value. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetOperand(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetOperand;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val, Index);
    }

    // --- [ LLVMGetOperandUse ] ---

    /** Obtain the use of an operand at a specific index in a {@code llvm::User} value. */
    @NativeType("LLVMUseRef")
    public static long LLVMGetOperandUse(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetOperandUse;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val, Index);
    }

    // --- [ LLVMSetOperand ] ---

    /** Set an operand at a specific index in a {@code llvm::User} value. */
    public static void LLVMSetOperand(@NativeType("LLVMValueRef") long User, @NativeType("unsigned int") int Index, @NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.SetOperand;
        if (CHECKS) {
            check(User);
            check(Val);
        }
        invokePPV(__functionAddress, User, Index, Val);
    }

    // --- [ LLVMGetNumOperands ] ---

    /** Obtain the number of operands in a {@code llvm::User} value. */
    public static int LLVMGetNumOperands(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetNumOperands;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val);
    }

    // --- [ LLVMConstNull ] ---

    /** Obtain a constant value referring to the null instance of a type. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNull(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstNull;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMConstAllOnes ] ---

    /**
     * Obtain a constant value referring to the instance of a type consisting of all ones.
     * 
     * <p>This is only valid for integer types.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMConstAllOnes(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstAllOnes;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMGetUndef ] ---

    /** Obtain a constant value referring to an undefined value of a type. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUndef(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetUndef;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMIsNull ] ---

    /** Determine whether a value instance is null. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsNull(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsNull;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val) != 0;
    }

    // --- [ LLVMConstPointerNull ] ---

    /** Obtain a constant that is a constant pointer pointing to NULL for a specified type. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstPointerNull(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstPointerNull;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMConstInt ] ---

    /**
     * Obtain a constant value for an integer type.
     * 
     * <p>The returned value corresponds to a {@code llvm::ConstantInt}.</p>
     *
     * @param IntTy      integer type to obtain value of
     * @param N          the value the returned instance should refer to
     * @param SignExtend whether to sign extend the produced value
     */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInt(@NativeType("LLVMTypeRef") long IntTy, @NativeType("unsigned long long") long N, @NativeType("LLVMBool") boolean SignExtend) {
        long __functionAddress = Functions.ConstInt;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePJP(__functionAddress, IntTy, N, SignExtend ? 1 : 0);
    }

    // --- [ LLVMConstIntOfArbitraryPrecision ] ---

    /** Unsafe version of: {@link #LLVMConstIntOfArbitraryPrecision ConstIntOfArbitraryPrecision} */
    public static long nLLVMConstIntOfArbitraryPrecision(long IntTy, int NumWords, long Words) {
        long __functionAddress = Functions.ConstIntOfArbitraryPrecision;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePPP(__functionAddress, IntTy, NumWords, Words);
    }

    /** Obtain a constant value for an integer of arbitrary precision. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfArbitraryPrecision(@NativeType("LLVMTypeRef") long IntTy, @NativeType("uint64_t const *") LongBuffer Words) {
        return nLLVMConstIntOfArbitraryPrecision(IntTy, Words.remaining(), memAddress(Words));
    }

    // --- [ LLVMConstIntOfString ] ---

    /** Unsafe version of: {@link #LLVMConstIntOfString ConstIntOfString} */
    public static long nLLVMConstIntOfString(long IntTy, long Text, byte Radix) {
        long __functionAddress = Functions.ConstIntOfString;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePPP(__functionAddress, IntTy, Text, Radix);
    }

    /**
     * Obtain a constant value for an integer parsed from a string.
     * 
     * <p>A similar API, {@link #LLVMConstIntOfStringAndSize ConstIntOfStringAndSize} is also available. If the string's length is available, it is preferred to call that function instead.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfString(@NativeType("LLVMTypeRef") long IntTy, @NativeType("char const *") ByteBuffer Text, @NativeType("uint8_t") byte Radix) {
        if (CHECKS) {
            checkNT1(Text);
        }
        return nLLVMConstIntOfString(IntTy, memAddress(Text), Radix);
    }

    /**
     * Obtain a constant value for an integer parsed from a string.
     * 
     * <p>A similar API, {@link #LLVMConstIntOfStringAndSize ConstIntOfStringAndSize} is also available. If the string's length is available, it is preferred to call that function instead.</p>
     */
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

    /** Unsafe version of: {@link #LLVMConstIntOfStringAndSize ConstIntOfStringAndSize} */
    public static long nLLVMConstIntOfStringAndSize(long IntTy, long Text, int SLen, byte Radix) {
        long __functionAddress = Functions.ConstIntOfStringAndSize;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePPP(__functionAddress, IntTy, Text, SLen, Radix);
    }

    /** Obtain a constant value for an integer parsed from a string with specified length. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstIntOfStringAndSize(@NativeType("LLVMTypeRef") long IntTy, @NativeType("char const *") ByteBuffer Text, @NativeType("uint8_t") byte Radix) {
        return nLLVMConstIntOfStringAndSize(IntTy, memAddress(Text), Text.remaining(), Radix);
    }

    /** Obtain a constant value for an integer parsed from a string with specified length. */
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

    /** Obtain a constant value referring to a double floating point value. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstReal(@NativeType("LLVMTypeRef") long RealTy, double N) {
        long __functionAddress = Functions.ConstReal;
        if (CHECKS) {
            check(RealTy);
        }
        return invokePP(__functionAddress, RealTy, N);
    }

    // --- [ LLVMConstRealOfString ] ---

    /** Unsafe version of: {@link #LLVMConstRealOfString ConstRealOfString} */
    public static long nLLVMConstRealOfString(long RealTy, long Text) {
        long __functionAddress = Functions.ConstRealOfString;
        if (CHECKS) {
            check(RealTy);
        }
        return invokePPP(__functionAddress, RealTy, Text);
    }

    /**
     * Obtain a constant for a floating point value parsed from a string.
     * 
     * <p>A similar API, {@link #LLVMConstRealOfStringAndSize ConstRealOfStringAndSize} is also available. It should be used if the input string's length is known.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMConstRealOfString(@NativeType("LLVMTypeRef") long RealTy, @NativeType("char const *") ByteBuffer Text) {
        if (CHECKS) {
            checkNT1(Text);
        }
        return nLLVMConstRealOfString(RealTy, memAddress(Text));
    }

    /**
     * Obtain a constant for a floating point value parsed from a string.
     * 
     * <p>A similar API, {@link #LLVMConstRealOfStringAndSize ConstRealOfStringAndSize} is also available. It should be used if the input string's length is known.</p>
     */
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

    /** Unsafe version of: {@link #LLVMConstRealOfStringAndSize ConstRealOfStringAndSize} */
    public static long nLLVMConstRealOfStringAndSize(long RealTy, long Text, int SLen) {
        long __functionAddress = Functions.ConstRealOfStringAndSize;
        if (CHECKS) {
            check(RealTy);
        }
        return invokePPP(__functionAddress, RealTy, Text, SLen);
    }

    /** Obtain a constant for a floating point value parsed from a string. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstRealOfStringAndSize(@NativeType("LLVMTypeRef") long RealTy, @NativeType("char const *") ByteBuffer Text) {
        return nLLVMConstRealOfStringAndSize(RealTy, memAddress(Text), Text.remaining());
    }

    /** Obtain a constant for a floating point value parsed from a string. */
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

    /** Obtain the zero extended value for an integer constant value. */
    @NativeType("unsigned long long")
    public static long LLVMConstIntGetZExtValue(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstIntGetZExtValue;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePJ(__functionAddress, ConstantVal);
    }

    // --- [ LLVMConstIntGetSExtValue ] ---

    /** Obtain the sign extended value for an integer constant value. */
    @NativeType("long long")
    public static long LLVMConstIntGetSExtValue(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstIntGetSExtValue;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePJ(__functionAddress, ConstantVal);
    }

    // --- [ LLVMConstRealGetDouble ] ---

    /** Unsafe version of: {@link #LLVMConstRealGetDouble ConstRealGetDouble} */
    public static double nLLVMConstRealGetDouble(long ConstantVal, long losesInfo) {
        long __functionAddress = Functions.ConstRealGetDouble;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePPD(__functionAddress, ConstantVal, losesInfo);
    }

    /** Obtain the double value for an floating point constant value. {@code losesInfo} indicates if some precision was lost in the conversion. */
    public static double LLVMConstRealGetDouble(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMBool *") IntBuffer losesInfo) {
        if (CHECKS) {
            check(losesInfo, 1);
        }
        return nLLVMConstRealGetDouble(ConstantVal, memAddress(losesInfo));
    }

    // --- [ LLVMConstStringInContext ] ---

    /** Unsafe version of: {@link #LLVMConstStringInContext ConstStringInContext} */
    public static long nLLVMConstStringInContext(long C, long Str, int Length, int DontNullTerminate) {
        long __functionAddress = Functions.ConstStringInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, C, Str, Length, DontNullTerminate);
    }

    /** Create a {@code ConstantDataSequential} and initialize it with a string. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStringInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        return nLLVMConstStringInContext(C, memAddress(Str), Str.remaining(), DontNullTerminate ? 1 : 0);
    }

    /** Create a {@code ConstantDataSequential} and initialize it with a string. */
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

    // --- [ LLVMConstString ] ---

    /** Unsafe version of: {@link #LLVMConstString ConstString} */
    public static long nLLVMConstString(long Str, int Length, int DontNullTerminate) {
        long __functionAddress = Functions.ConstString;
        return invokePP(__functionAddress, Str, Length, DontNullTerminate);
    }

    /**
     * Create a {@code ConstantDataSequential} with string content in the global context.
     * 
     * <p>This is the same as {@link #LLVMConstStringInContext ConstStringInContext} except it operates on the global context.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMConstString(@NativeType("char const *") ByteBuffer Str, @NativeType("LLVMBool") boolean DontNullTerminate) {
        return nLLVMConstString(memAddress(Str), Str.remaining(), DontNullTerminate ? 1 : 0);
    }

    /**
     * Create a {@code ConstantDataSequential} with string content in the global context.
     * 
     * <p>This is the same as {@link #LLVMConstStringInContext ConstStringInContext} except it operates on the global context.</p>
     */
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

    /** Returns true if the specified constant is an array of {@code i8}. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsConstantString(@NativeType("LLVMValueRef") long c) {
        long __functionAddress = Functions.IsConstantString;
        if (CHECKS) {
            check(c);
        }
        return invokePI(__functionAddress, c) != 0;
    }

    // --- [ LLVMGetAsString ] ---

    /** Unsafe version of: {@link #LLVMGetAsString GetAsString} */
    public static long nLLVMGetAsString(long c, long Length) {
        long __functionAddress = Functions.GetAsString;
        if (CHECKS) {
            check(c);
        }
        return invokePPP(__functionAddress, c, Length);
    }

    /** Get the given constant data sequential as a string. */
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

    /** Unsafe version of: {@link #LLVMConstStructInContext ConstStructInContext} */
    public static long nLLVMConstStructInContext(long C, long ConstantVals, int Count, int Packed) {
        long __functionAddress = Functions.ConstStructInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, C, ConstantVals, Count, Packed);
    }

    /** Create an anonymous {@code ConstantStruct} with the specified values. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStructInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMValueRef *") PointerBuffer ConstantVals, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMConstStructInContext(C, memAddress(ConstantVals), ConstantVals.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMConstStruct ] ---

    /** Unsafe version of: {@link #LLVMConstStruct ConstStruct} */
    public static long nLLVMConstStruct(long ConstantVals, int Count, int Packed) {
        long __functionAddress = Functions.ConstStruct;
        return invokePP(__functionAddress, ConstantVals, Count, Packed);
    }

    /**
     * Create a {@code ConstantStruct} in the global Context.
     * 
     * <p>This is the same as {@link #LLVMConstStructInContext ConstStructInContext} except it operates on the global Context.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMConstStruct(@NativeType("LLVMValueRef *") PointerBuffer ConstantVals, @NativeType("LLVMBool") boolean Packed) {
        return nLLVMConstStruct(memAddress(ConstantVals), ConstantVals.remaining(), Packed ? 1 : 0);
    }

    // --- [ LLVMConstArray ] ---

    /** Unsafe version of: {@link #LLVMConstArray ConstArray} */
    public static long nLLVMConstArray(long ElementTy, long ConstantVals, int Length) {
        long __functionAddress = Functions.ConstArray;
        if (CHECKS) {
            check(ElementTy);
        }
        return invokePPP(__functionAddress, ElementTy, ConstantVals, Length);
    }

    /** Create a {@code ConstantArray} from values. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstArray(@NativeType("LLVMTypeRef") long ElementTy, @NativeType("LLVMValueRef *") PointerBuffer ConstantVals) {
        return nLLVMConstArray(ElementTy, memAddress(ConstantVals), ConstantVals.remaining());
    }

    // --- [ LLVMConstNamedStruct ] ---

    /** Unsafe version of: {@link #LLVMConstNamedStruct ConstNamedStruct} */
    public static long nLLVMConstNamedStruct(long StructTy, long ConstantVals, int Count) {
        long __functionAddress = Functions.ConstNamedStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePPP(__functionAddress, StructTy, ConstantVals, Count);
    }

    /** Create a non-anonymous {@code ConstantStruct} from values. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNamedStruct(@NativeType("LLVMTypeRef") long StructTy, @NativeType("LLVMValueRef *") PointerBuffer ConstantVals) {
        return nLLVMConstNamedStruct(StructTy, memAddress(ConstantVals), ConstantVals.remaining());
    }

    // --- [ LLVMGetElementAsConstant ] ---

    /** Get an element at specified index as a constant. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetElementAsConstant(@NativeType("LLVMValueRef") long C, @NativeType("unsigned int") int idx) {
        long __functionAddress = Functions.GetElementAsConstant;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C, idx);
    }

    // --- [ LLVMConstVector ] ---

    /** Unsafe version of: {@link #LLVMConstVector ConstVector} */
    public static long nLLVMConstVector(long ScalarConstantVals, int Size) {
        long __functionAddress = Functions.ConstVector;
        return invokePP(__functionAddress, ScalarConstantVals, Size);
    }

    /** Create a {@code ConstantVector} from values. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstVector(@NativeType("LLVMValueRef *") PointerBuffer ScalarConstantVals) {
        return nLLVMConstVector(memAddress(ScalarConstantVals), ScalarConstantVals.remaining());
    }

    // --- [ LLVMGetConstOpcode ] ---

    @NativeType("LLVMOpcode")
    public static int LLVMGetConstOpcode(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.GetConstOpcode;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePI(__functionAddress, ConstantVal);
    }

    // --- [ LLVMAlignOf ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMAlignOf(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.AlignOf;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMSizeOf ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMSizeOf(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.SizeOf;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(__functionAddress, Ty);
    }

    // --- [ LLVMConstNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(__functionAddress, ConstantVal);
    }

    // --- [ LLVMConstNSWNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNSWNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(__functionAddress, ConstantVal);
    }

    // --- [ LLVMConstNUWNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNUWNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(__functionAddress, ConstantVal);
    }

    // --- [ LLVMConstFNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstFNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(__functionAddress, ConstantVal);
    }

    // --- [ LLVMConstNot ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNot(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNot;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(__functionAddress, ConstantVal);
    }

    // --- [ LLVMConstAdd ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstNSWAdd ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNSWAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstNUWAdd ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNUWAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstFAdd ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstSub ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstNSWSub ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNSWSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstNUWSub ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNUWSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstFSub ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstMul ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstNSWMul ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNSWMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstNUWMul ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstNUWMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstFMul ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstUDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstUDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstUDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstExactUDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstExactUDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstExactUDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstSDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstExactSDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstExactSDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstExactSDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstFDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstURem ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstURem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstURem;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstSRem ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSRem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSRem;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstFRem ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFRem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFRem;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstAnd ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstAnd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAnd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstOr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstOr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstOr;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstXor ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstXor(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstXor;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstICmp ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstICmp(@NativeType("LLVMIntPredicate") int Predicate, @NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstICmp;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, Predicate, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstFCmp ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFCmp(@NativeType("LLVMRealPredicate") int Predicate, @NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFCmp;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, Predicate, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstShl ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstShl(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstShl;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstLShr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstLShr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstLShr;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstAShr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstAShr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAShr;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(__functionAddress, LHSConstant, RHSConstant);
    }

    // --- [ LLVMConstGEP ] ---

    public static long nLLVMConstGEP(long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstGEP;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePPP(__functionAddress, ConstantVal, ConstantIndices, NumIndices);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMConstGEP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstGEP(ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstInBoundsGEP ] ---

    public static long nLLVMConstInBoundsGEP(long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstInBoundsGEP;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePPP(__functionAddress, ConstantVal, ConstantIndices, NumIndices);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMConstInBoundsGEP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstInBoundsGEP(ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstTrunc ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstTrunc(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstTrunc;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstSExt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSExt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstZExt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstZExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstZExt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstFPTrunc ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPTrunc(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPTrunc;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstFPExt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPExt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstUIToFP ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstUIToFP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstUIToFP;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstSIToFP ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSIToFP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSIToFP;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstFPToUI ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPToUI(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPToUI;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstFPToSI ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPToSI(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPToSI;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstPtrToInt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstPtrToInt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstPtrToInt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstIntToPtr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstIntToPtr(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstIntToPtr;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstBitCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstAddrSpaceCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstAddrSpaceCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstAddrSpaceCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstZExtOrBitCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstZExtOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstZExtOrBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstSExtOrBitCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSExtOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSExtOrBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstTruncOrBitCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstTruncOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstTruncOrBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstPointerCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstPointerCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstPointerCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstIntCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstIntCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType, @NativeType("LLVMBool") boolean isSigned) {
        long __functionAddress = Functions.ConstIntCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType, isSigned ? 1 : 0);
    }

    // --- [ LLVMConstFPCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(__functionAddress, ConstantVal, ToType);
    }

    // --- [ LLVMConstSelect ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSelect(@NativeType("LLVMValueRef") long ConstantCondition, @NativeType("LLVMValueRef") long ConstantIfTrue, @NativeType("LLVMValueRef") long ConstantIfFalse) {
        long __functionAddress = Functions.ConstSelect;
        if (CHECKS) {
            check(ConstantCondition);
            check(ConstantIfTrue);
            check(ConstantIfFalse);
        }
        return invokePPPP(__functionAddress, ConstantCondition, ConstantIfTrue, ConstantIfFalse);
    }

    // --- [ LLVMConstExtractElement ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstExtractElement(@NativeType("LLVMValueRef") long VectorConstant, @NativeType("LLVMValueRef") long IndexConstant) {
        long __functionAddress = Functions.ConstExtractElement;
        if (CHECKS) {
            check(VectorConstant);
            check(IndexConstant);
        }
        return invokePPP(__functionAddress, VectorConstant, IndexConstant);
    }

    // --- [ LLVMConstInsertElement ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstInsertElement(@NativeType("LLVMValueRef") long VectorConstant, @NativeType("LLVMValueRef") long ElementValueConstant, @NativeType("LLVMValueRef") long IndexConstant) {
        long __functionAddress = Functions.ConstInsertElement;
        if (CHECKS) {
            check(VectorConstant);
            check(ElementValueConstant);
            check(IndexConstant);
        }
        return invokePPPP(__functionAddress, VectorConstant, ElementValueConstant, IndexConstant);
    }

    // --- [ LLVMConstShuffleVector ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstShuffleVector(@NativeType("LLVMValueRef") long VectorAConstant, @NativeType("LLVMValueRef") long VectorBConstant, @NativeType("LLVMValueRef") long MaskConstant) {
        long __functionAddress = Functions.ConstShuffleVector;
        if (CHECKS) {
            check(VectorAConstant);
            check(VectorBConstant);
            check(MaskConstant);
        }
        return invokePPPP(__functionAddress, VectorAConstant, VectorBConstant, MaskConstant);
    }

    // --- [ LLVMConstExtractValue ] ---

    public static long nLLVMConstExtractValue(long AggConstant, long IdxList, int NumIdx) {
        long __functionAddress = Functions.ConstExtractValue;
        if (CHECKS) {
            check(AggConstant);
        }
        return invokePPP(__functionAddress, AggConstant, IdxList, NumIdx);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMConstExtractValue(@NativeType("LLVMValueRef") long AggConstant, @NativeType("unsigned int *") IntBuffer IdxList) {
        return nLLVMConstExtractValue(AggConstant, memAddress(IdxList), IdxList.remaining());
    }

    // --- [ LLVMConstInsertValue ] ---

    public static long nLLVMConstInsertValue(long AggConstant, long ElementValueConstant, long IdxList, int NumIdx) {
        long __functionAddress = Functions.ConstInsertValue;
        if (CHECKS) {
            check(AggConstant);
            check(ElementValueConstant);
        }
        return invokePPPP(__functionAddress, AggConstant, ElementValueConstant, IdxList, NumIdx);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMConstInsertValue(@NativeType("LLVMValueRef") long AggConstant, @NativeType("LLVMValueRef") long ElementValueConstant, @NativeType("unsigned int *") IntBuffer IdxList) {
        return nLLVMConstInsertValue(AggConstant, ElementValueConstant, memAddress(IdxList), IdxList.remaining());
    }

    // --- [ LLVMBlockAddress ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBlockAddress(@NativeType("LLVMValueRef") long F, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BlockAddress;
        if (CHECKS) {
            check(F);
            check(BB);
        }
        return invokePPP(__functionAddress, F, BB);
    }

    // --- [ LLVMConstInlineAsm ] ---

    /** Unsafe version of: {@link #LLVMConstInlineAsm ConstInlineAsm} */
    public static long nLLVMConstInlineAsm(long Ty, long AsmString, long Constraints, int HasSideEffects, int IsAlignStack) {
        long __functionAddress = Functions.ConstInlineAsm;
        if (CHECKS) {
            check(Ty);
        }
        return invokePPPP(__functionAddress, Ty, AsmString, Constraints, HasSideEffects, IsAlignStack);
    }

    /** Deprecated: Use {@link #LLVMGetInlineAsm GetInlineAsm} instead. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInlineAsm(@NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer AsmString, @NativeType("char const *") ByteBuffer Constraints, @NativeType("LLVMBool") boolean HasSideEffects, @NativeType("LLVMBool") boolean IsAlignStack) {
        if (CHECKS) {
            checkNT1(AsmString);
            checkNT1(Constraints);
        }
        return nLLVMConstInlineAsm(Ty, memAddress(AsmString), memAddress(Constraints), HasSideEffects ? 1 : 0, IsAlignStack ? 1 : 0);
    }

    /** Deprecated: Use {@link #LLVMGetInlineAsm GetInlineAsm} instead. */
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

    @NativeType("LLVMModuleRef")
    public static long LLVMGetGlobalParent(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetGlobalParent;
        if (CHECKS) {
            check(Global);
        }
        return invokePP(__functionAddress, Global);
    }

    // --- [ LLVMIsDeclaration ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsDeclaration(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.IsDeclaration;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(__functionAddress, Global) != 0;
    }

    // --- [ LLVMGetLinkage ] ---

    @NativeType("LLVMLinkage")
    public static int LLVMGetLinkage(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetLinkage;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(__functionAddress, Global);
    }

    // --- [ LLVMSetLinkage ] ---

    public static void LLVMSetLinkage(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMLinkage") int Linkage) {
        long __functionAddress = Functions.SetLinkage;
        if (CHECKS) {
            check(Global);
        }
        invokePV(__functionAddress, Global, Linkage);
    }

    // --- [ LLVMGetSection ] ---

    public static long nLLVMGetSection(long Global) {
        long __functionAddress = Functions.GetSection;
        if (CHECKS) {
            check(Global);
        }
        return invokePP(__functionAddress, Global);
    }

    @NativeType("char const *")
    public static String LLVMGetSection(@NativeType("LLVMValueRef") long Global) {
        long __result = nLLVMGetSection(Global);
        return memUTF8(__result);
    }

    // --- [ LLVMSetSection ] ---

    public static void nLLVMSetSection(long Global, long Section) {
        long __functionAddress = Functions.SetSection;
        if (CHECKS) {
            check(Global);
        }
        invokePPV(__functionAddress, Global, Section);
    }

    public static void LLVMSetSection(@NativeType("LLVMValueRef") long Global, @NativeType("char const *") ByteBuffer Section) {
        if (CHECKS) {
            checkNT1(Section);
        }
        nLLVMSetSection(Global, memAddress(Section));
    }

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

    @NativeType("LLVMVisibility")
    public static int LLVMGetVisibility(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetVisibility;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(__functionAddress, Global);
    }

    // --- [ LLVMSetVisibility ] ---

    public static void LLVMSetVisibility(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMVisibility") int Viz) {
        long __functionAddress = Functions.SetVisibility;
        if (CHECKS) {
            check(Global);
        }
        invokePV(__functionAddress, Global, Viz);
    }

    // --- [ LLVMGetDLLStorageClass ] ---

    @NativeType("LLVMDLLStorageClass")
    public static int LLVMGetDLLStorageClass(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetDLLStorageClass;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(__functionAddress, Global);
    }

    // --- [ LLVMSetDLLStorageClass ] ---

    public static void LLVMSetDLLStorageClass(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMDLLStorageClass") int Class) {
        long __functionAddress = Functions.SetDLLStorageClass;
        if (CHECKS) {
            check(Global);
        }
        invokePV(__functionAddress, Global, Class);
    }

    // --- [ LLVMGetUnnamedAddress ] ---

    @NativeType("LLVMUnnamedAddr")
    public static int LLVMGetUnnamedAddress(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetUnnamedAddress;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(__functionAddress, Global);
    }

    // --- [ LLVMSetUnnamedAddress ] ---

    public static void LLVMSetUnnamedAddress(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMUnnamedAddr") int UnnamedAddr) {
        long __functionAddress = Functions.SetUnnamedAddress;
        if (CHECKS) {
            check(Global);
        }
        invokePV(__functionAddress, Global, UnnamedAddr);
    }

    // --- [ LLVMGlobalGetValueType ] ---

    /** Returns the "value type" of a global value.  This differs from the formal type of a global value which is always a pointer type. */
    @NativeType("LLVMTypeRef")
    public static long LLVMGlobalGetValueType(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GlobalGetValueType;
        if (CHECKS) {
            check(Global);
        }
        return invokePP(__functionAddress, Global);
    }

    // --- [ LLVMHasUnnamedAddr ] ---

    /** Deprecated: Use {@link #LLVMGetUnnamedAddress GetUnnamedAddress} instead. */
    @NativeType("LLVMBool")
    public static boolean LLVMHasUnnamedAddr(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.HasUnnamedAddr;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(__functionAddress, Global) != 0;
    }

    // --- [ LLVMSetUnnamedAddr ] ---

    /** Deprecated: Use {@link #LLVMSetUnnamedAddress SetUnnamedAddress} instead. */
    public static void LLVMSetUnnamedAddr(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMBool") boolean HasUnnamedAddr) {
        long __functionAddress = Functions.SetUnnamedAddr;
        if (CHECKS) {
            check(Global);
        }
        invokePV(__functionAddress, Global, HasUnnamedAddr ? 1 : 0);
    }

    // --- [ LLVMGetAlignment ] ---

    /** Obtain the preferred alignment of the value. */
    @NativeType("unsigned int")
    public static int LLVMGetAlignment(@NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.GetAlignment;
        if (CHECKS) {
            check(V);
        }
        return invokePI(__functionAddress, V);
    }

    // --- [ LLVMSetAlignment ] ---

    /** Set the preferred alignment of the value. */
    public static void LLVMSetAlignment(@NativeType("LLVMValueRef") long V, @NativeType("unsigned int") int Bytes) {
        long __functionAddress = Functions.SetAlignment;
        if (CHECKS) {
            check(V);
        }
        invokePV(__functionAddress, V, Bytes);
    }

    // --- [ LLVMGlobalSetMetadata ] ---

    /** Sets a metadata attachment, erasing the existing metadata attachment if it already exists for the given kind. */
    public static void LLVMGlobalSetMetadata(@NativeType("LLVMValueRef") long Global, @NativeType("unsigned int") int Kind, @NativeType("LLVMMetadataRef") long MD) {
        long __functionAddress = Functions.GlobalSetMetadata;
        if (CHECKS) {
            check(Global);
            check(MD);
        }
        invokePPV(__functionAddress, Global, Kind, MD);
    }

    // --- [ LLVMGlobalEraseMetadata ] ---

    /** Erases a metadata attachment of the given kind if it exists. */
    public static void LLVMGlobalEraseMetadata(@NativeType("LLVMValueRef") long Global, @NativeType("unsigned int") int Kind) {
        long __functionAddress = Functions.GlobalEraseMetadata;
        if (CHECKS) {
            check(Global);
        }
        invokePV(__functionAddress, Global, Kind);
    }

    // --- [ LLVMGlobalClearMetadata ] ---

    /** Removes all metadata attachments from this value. */
    public static void LLVMGlobalClearMetadata(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GlobalClearMetadata;
        if (CHECKS) {
            check(Global);
        }
        invokePV(__functionAddress, Global);
    }

    // --- [ LLVMGlobalCopyAllMetadata ] ---

    /** Unsafe version of: {@link #LLVMGlobalCopyAllMetadata GlobalCopyAllMetadata} */
    public static long nLLVMGlobalCopyAllMetadata(long Value, long NumEntries) {
        long __functionAddress = Functions.GlobalCopyAllMetadata;
        if (CHECKS) {
            check(Value);
        }
        return invokePPP(__functionAddress, Value, NumEntries);
    }

    /**
     * Retrieves an array of metadata entries representing the metadata attached to this value. The caller is responsible for freeing this array by calling
     * {@link #LLVMDisposeValueMetadataEntries DisposeValueMetadataEntries}.
     */
    @NativeType("LLVMValueMetadataEntry *")
    public static long LLVMGlobalCopyAllMetadata(@NativeType("LLVMValueRef") long Value, @NativeType("size_t *") PointerBuffer NumEntries) {
        if (CHECKS) {
            check(NumEntries, 1);
        }
        return nLLVMGlobalCopyAllMetadata(Value, memAddress(NumEntries));
    }

    // --- [ LLVMDisposeValueMetadataEntries ] ---

    /** Destroys value metadata entries. */
    public static void LLVMDisposeValueMetadataEntries(@NativeType("LLVMValueMetadataEntry *") long Entries) {
        long __functionAddress = Functions.DisposeValueMetadataEntries;
        if (CHECKS) {
            check(Entries);
        }
        invokePV(__functionAddress, Entries);
    }

    // --- [ LLVMValueMetadataEntriesGetKind ] ---

    /** Returns the kind of a value metadata entry at a specific index. */
    @NativeType("unsigned int")
    public static int LLVMValueMetadataEntriesGetKind(@NativeType("LLVMValueMetadataEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ValueMetadataEntriesGetKind;
        if (CHECKS) {
            check(Entries);
        }
        return invokePI(__functionAddress, Entries, Index);
    }

    // --- [ LLVMValueMetadataEntriesGetMetadata ] ---

    /** Returns the underlying metadata node of a value metadata entry at a specific index. */
    @NativeType("LLVMMetadataRef")
    public static long LLVMValueMetadataEntriesGetMetadata(@NativeType("LLVMValueMetadataEntry *") long Entries, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.ValueMetadataEntriesGetMetadata;
        if (CHECKS) {
            check(Entries);
        }
        return invokePP(__functionAddress, Entries, Index);
    }

    // --- [ LLVMAddGlobal ] ---

    public static long nLLVMAddGlobal(long M, long Ty, long Name) {
        long __functionAddress = Functions.AddGlobal;
        if (CHECKS) {
            check(M);
            check(Ty);
        }
        return invokePPPP(__functionAddress, M, Ty, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobal(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddGlobal(M, Ty, memAddress(Name));
    }

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

    public static long nLLVMAddGlobalInAddressSpace(long M, long Ty, long Name, int AddressSpace) {
        long __functionAddress = Functions.AddGlobalInAddressSpace;
        if (CHECKS) {
            check(M);
            check(Ty);
        }
        return invokePPPP(__functionAddress, M, Ty, Name, AddressSpace);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMAddGlobalInAddressSpace(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name, @NativeType("unsigned int") int AddressSpace) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddGlobalInAddressSpace(M, Ty, memAddress(Name), AddressSpace);
    }

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

    public static long nLLVMGetNamedGlobal(long M, long Name) {
        long __functionAddress = Functions.GetNamedGlobal;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(__functionAddress, M, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobal(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMGetNamedGlobal(M, memAddress(Name));
    }

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

    // --- [ LLVMGetFirstGlobal ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstGlobal(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstGlobal;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetLastGlobal ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetLastGlobal(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastGlobal;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetNextGlobal ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetNextGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetNextGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(__functionAddress, GlobalVar);
    }

    // --- [ LLVMGetPreviousGlobal ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetPreviousGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(__functionAddress, GlobalVar);
    }

    // --- [ LLVMDeleteGlobal ] ---

    public static void LLVMDeleteGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.DeleteGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(__functionAddress, GlobalVar);
    }

    // --- [ LLVMGetInitializer ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetInitializer(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetInitializer;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(__functionAddress, GlobalVar);
    }

    // --- [ LLVMSetInitializer ] ---

    public static void LLVMSetInitializer(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.SetInitializer;
        if (CHECKS) {
            check(GlobalVar);
            check(ConstantVal);
        }
        invokePPV(__functionAddress, GlobalVar, ConstantVal);
    }

    // --- [ LLVMIsThreadLocal ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsThreadLocal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsThreadLocal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(__functionAddress, GlobalVar) != 0;
    }

    // --- [ LLVMSetThreadLocal ] ---

    public static void LLVMSetThreadLocal(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsThreadLocal) {
        long __functionAddress = Functions.SetThreadLocal;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(__functionAddress, GlobalVar, IsThreadLocal ? 1 : 0);
    }

    // --- [ LLVMIsGlobalConstant ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsGlobalConstant(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsGlobalConstant;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(__functionAddress, GlobalVar) != 0;
    }

    // --- [ LLVMSetGlobalConstant ] ---

    public static void LLVMSetGlobalConstant(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsConstant) {
        long __functionAddress = Functions.SetGlobalConstant;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(__functionAddress, GlobalVar, IsConstant ? 1 : 0);
    }

    // --- [ LLVMGetThreadLocalMode ] ---

    @NativeType("LLVMThreadLocalMode")
    public static int LLVMGetThreadLocalMode(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetThreadLocalMode;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(__functionAddress, GlobalVar);
    }

    // --- [ LLVMSetThreadLocalMode ] ---

    public static void LLVMSetThreadLocalMode(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMThreadLocalMode") int Mode) {
        long __functionAddress = Functions.SetThreadLocalMode;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(__functionAddress, GlobalVar, Mode);
    }

    // --- [ LLVMIsExternallyInitialized ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsExternallyInitialized(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsExternallyInitialized;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(__functionAddress, GlobalVar) != 0;
    }

    // --- [ LLVMSetExternallyInitialized ] ---

    public static void LLVMSetExternallyInitialized(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsExtInit) {
        long __functionAddress = Functions.SetExternallyInitialized;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(__functionAddress, GlobalVar, IsExtInit ? 1 : 0);
    }

    // --- [ LLVMAddAlias ] ---

    public static long nLLVMAddAlias(long M, long Ty, long Aliasee, long Name) {
        long __functionAddress = Functions.AddAlias;
        if (CHECKS) {
            check(M);
            check(Ty);
            check(Aliasee);
        }
        return invokePPPPP(__functionAddress, M, Ty, Aliasee, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMAddAlias(@NativeType("LLVMModuleRef") long M, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Aliasee, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAddAlias(M, Ty, Aliasee, memAddress(Name));
    }

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

    // --- [ LLVMGetNamedGlobalAlias ] ---

    /** Unsafe version of: {@link #LLVMGetNamedGlobalAlias GetNamedGlobalAlias} */
    public static long nLLVMGetNamedGlobalAlias(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetNamedGlobalAlias;
        if (CHECKS) {
            check(M);
        }
        return invokePPPP(__functionAddress, M, Name, NameLen);
    }

    /**
     * Obtain a GlobalAlias value from a Module by its name.
     * 
     * <p>The returned value corresponds to a {@code llvm::GlobalAlias} value.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNamedGlobalAlias(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Name) {
        return nLLVMGetNamedGlobalAlias(M, memAddress(Name), Name.remaining());
    }

    /**
     * Obtain a GlobalAlias value from a Module by its name.
     * 
     * <p>The returned value corresponds to a {@code llvm::GlobalAlias} value.</p>
     */
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

    /** Obtain an iterator to the first GlobalAlias in a Module. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstGlobalAlias(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetFirstGlobalAlias;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetLastGlobalAlias ] ---

    /** Obtain an iterator to the last GlobalAlias in a Module. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastGlobalAlias(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastGlobalAlias;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMGetNextGlobalAlias ] ---

    /**
     * Advance a {@code GlobalAlias} iterator to the next {@code GlobalAlias}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the end and there are no more global aliases.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextGlobalAlias(@NativeType("LLVMValueRef") long GA) {
        long __functionAddress = Functions.GetNextGlobalAlias;
        if (CHECKS) {
            check(GA);
        }
        return invokePP(__functionAddress, GA);
    }

    // --- [ LLVMGetPreviousGlobalAlias ] ---

    /**
     * Decrement a {@code GlobalAlias} iterator to the previous {@code GlobalAlias}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the beginning and there are no previous global aliases.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousGlobalAlias(@NativeType("LLVMValueRef") long GA) {
        long __functionAddress = Functions.GetPreviousGlobalAlias;
        if (CHECKS) {
            check(GA);
        }
        return invokePP(__functionAddress, GA);
    }

    // --- [ LLVMAliasGetAliasee ] ---

    /** Retrieve the target value of an alias. */
    @NativeType("LLVMValueRef")
    public static long LLVMAliasGetAliasee(@NativeType("LLVMValueRef") long Alias) {
        long __functionAddress = Functions.AliasGetAliasee;
        if (CHECKS) {
            check(Alias);
        }
        return invokePP(__functionAddress, Alias);
    }

    // --- [ LLVMAliasSetAliasee ] ---

    /** Set the target value of an alias. */
    public static void LLVMAliasSetAliasee(@NativeType("LLVMValueRef") long Alias, @NativeType("LLVMValueRef") long Aliasee) {
        long __functionAddress = Functions.AliasSetAliasee;
        if (CHECKS) {
            check(Alias);
            check(Aliasee);
        }
        invokePPV(__functionAddress, Alias, Aliasee);
    }

    // --- [ LLVMDeleteFunction ] ---

    /** Remove a function from its containing module and deletes it. */
    public static void LLVMDeleteFunction(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.DeleteFunction;
        if (CHECKS) {
            check(Fn);
        }
        invokePV(__functionAddress, Fn);
    }

    // --- [ LLVMHasPersonalityFn ] ---

    /** Check whether the given function has a personality function. */
    @NativeType("LLVMBool")
    public static boolean LLVMHasPersonalityFn(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.HasPersonalityFn;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(__functionAddress, Fn) != 0;
    }

    // --- [ LLVMGetPersonalityFn ] ---

    /** Obtain the personality function attached to the function. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPersonalityFn(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetPersonalityFn;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMSetPersonalityFn ] ---

    /** Set the personality function attached to the function. */
    public static void LLVMSetPersonalityFn(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef") long PersonalityFn) {
        long __functionAddress = Functions.SetPersonalityFn;
        if (CHECKS) {
            check(Fn);
            check(PersonalityFn);
        }
        invokePPV(__functionAddress, Fn, PersonalityFn);
    }

    // --- [ LLVMGetIntrinsicID ] ---

    /** Obtain the ID number from a function instance. */
    @NativeType("unsigned int")
    public static int LLVMGetIntrinsicID(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetIntrinsicID;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(__functionAddress, Fn);
    }

    // --- [ LLVMGetFunctionCallConv ] ---

    /**
     * Obtain the calling function of a function.
     * 
     * <p>The returned value corresponds to the {@code LLVMCallConv} enumeration.</p>
     */
    @NativeType("unsigned int")
    public static int LLVMGetFunctionCallConv(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetFunctionCallConv;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(__functionAddress, Fn);
    }

    // --- [ LLVMSetFunctionCallConv ] ---

    /**
     * Set the calling convention of a function.
     *
     * @param Fn function to operate on
     * @param CC {@code LLVMCallConv} to set calling convention to
     */
    public static void LLVMSetFunctionCallConv(@NativeType("LLVMValueRef") long Fn, @NativeType("unsigned int") int CC) {
        long __functionAddress = Functions.SetFunctionCallConv;
        if (CHECKS) {
            check(Fn);
        }
        invokePV(__functionAddress, Fn, CC);
    }

    // --- [ LLVMGetGC ] ---

    /** Unsafe version of: {@link #LLVMGetGC GetGC} */
    public static long nLLVMGetGC(long Fn) {
        long __functionAddress = Functions.GetGC;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    /** Obtain the name of the garbage collector to use during code generation. */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetGC(@NativeType("LLVMValueRef") long Fn) {
        long __result = nLLVMGetGC(Fn);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMSetGC ] ---

    /** Unsafe version of: {@link #LLVMSetGC SetGC} */
    public static void nLLVMSetGC(long Fn, long Name) {
        long __functionAddress = Functions.SetGC;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(__functionAddress, Fn, Name);
    }

    /** Define the garbage collector to use during code generation. */
    public static void LLVMSetGC(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMSetGC(Fn, memAddress(Name));
    }

    /** Define the garbage collector to use during code generation. */
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

    // --- [ LLVMAddAttributeAtIndex ] ---

    /** Add an attribute to a function. */
    public static void LLVMAddAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.AddAttributeAtIndex;
        if (CHECKS) {
            check(F);
            check(A);
        }
        invokePPV(__functionAddress, F, Idx, A);
    }

    // --- [ LLVMGetAttributeCountAtIndex ] ---

    @NativeType("unsigned int")
    public static int LLVMGetAttributeCountAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx) {
        long __functionAddress = Functions.GetAttributeCountAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePI(__functionAddress, F, Idx);
    }

    // --- [ LLVMGetAttributesAtIndex ] ---

    public static void nLLVMGetAttributesAtIndex(long F, int Idx, long Attrs) {
        long __functionAddress = Functions.GetAttributesAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePPV(__functionAddress, F, Idx, Attrs);
    }

    public static void LLVMGetAttributesAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef *") PointerBuffer Attrs) {
        if (CHECKS) {
            if (DEBUG) {
                check(Attrs, LLVMGetAttributeCountAtIndex(F, Idx));
            }
        }
        nLLVMGetAttributesAtIndex(F, Idx, memAddress(Attrs));
    }

    // --- [ LLVMGetEnumAttributeAtIndex ] ---

    @NativeType("LLVMAttributeRef")
    public static long LLVMGetEnumAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.GetEnumAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePP(__functionAddress, F, Idx, KindID);
    }

    // --- [ LLVMGetStringAttributeAtIndex ] ---

    public static long nLLVMGetStringAttributeAtIndex(long F, int Idx, long K, int KLen) {
        long __functionAddress = Functions.GetStringAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePPP(__functionAddress, F, Idx, K, KLen);
    }

    @NativeType("LLVMAttributeRef")
    public static long LLVMGetStringAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        return nLLVMGetStringAttributeAtIndex(F, Idx, memAddress(K), K.remaining());
    }

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

    public static void LLVMRemoveEnumAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.RemoveEnumAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePV(__functionAddress, F, Idx, KindID);
    }

    // --- [ LLVMRemoveStringAttributeAtIndex ] ---

    public static void nLLVMRemoveStringAttributeAtIndex(long F, int Idx, long K, int KLen) {
        long __functionAddress = Functions.RemoveStringAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePPV(__functionAddress, F, Idx, K, KLen);
    }

    public static void LLVMRemoveStringAttributeAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        nLLVMRemoveStringAttributeAtIndex(F, Idx, memAddress(K), K.remaining());
    }

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

    /** Unsafe version of: {@link #LLVMAddTargetDependentFunctionAttr AddTargetDependentFunctionAttr} */
    public static void nLLVMAddTargetDependentFunctionAttr(long Fn, long A, long V) {
        long __functionAddress = Functions.AddTargetDependentFunctionAttr;
        if (CHECKS) {
            check(Fn);
        }
        invokePPPV(__functionAddress, Fn, A, V);
    }

    /** Add a target-dependent attribute to a function */
    public static void LLVMAddTargetDependentFunctionAttr(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer A, @NativeType("char const *") ByteBuffer V) {
        if (CHECKS) {
            checkNT1(A);
            checkNT1(V);
        }
        nLLVMAddTargetDependentFunctionAttr(Fn, memAddress(A), memAddress(V));
    }

    /** Add a target-dependent attribute to a function */
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

    /** Obtain the number of parameters in a function. */
    @NativeType("unsigned int")
    public static int LLVMCountParams(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.CountParams;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(__functionAddress, Fn);
    }

    // --- [ LLVMGetParams ] ---

    /** Unsafe version of: {@link #LLVMGetParams GetParams} */
    public static void nLLVMGetParams(long Fn, long Params) {
        long __functionAddress = Functions.GetParams;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(__functionAddress, Fn, Params);
    }

    /**
     * Obtain the parameters in a function.
     * 
     * <p>The takes a pointer to a pre-allocated array of {@code LLVMValueRef} that is at least {@link #LLVMCountParams CountParams} long. This array will be filled with
     * {@code LLVMValueRef} instances which correspond to the parameters the function receives. Each {@code LLVMValueRef} corresponds to a
     * {@code llvm::Argument} instance.</p>
     */
    public static void LLVMGetParams(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Params) {
        if (CHECKS) {
            if (DEBUG) {
                check(Params, LLVMCountParams(Fn));
            }
        }
        nLLVMGetParams(Fn, memAddress(Params));
    }

    // --- [ LLVMGetParam ] ---

    /**
     * Obtain the parameter at the specified index.
     * 
     * <p>Parameters are indexed from 0.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetParam(@NativeType("LLVMValueRef") long Fn, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn, Index);
    }

    // --- [ LLVMGetParamParent ] ---

    /**
     * Obtain the function to which this argument belongs.
     * 
     * <p>Unlike other functions in this group, this one takes an {@code LLVMValueRef} that corresponds to a {@code llvm::Attribute}.</p>
     * 
     * <p>The returned {@code LLVMValueRef} is the {@code llvm::Function} to which this argument belongs.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetParamParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetParamParent;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(__functionAddress, Inst);
    }

    // --- [ LLVMGetFirstParam ] ---

    /** Obtain the first parameter to a function. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstParam(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetFirstParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMGetLastParam ] ---

    /** Obtain the last parameter to a function. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastParam(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetLastParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMGetNextParam ] ---

    /**
     * Obtain the next parameter to a function.
     * 
     * <p>This takes an {@code LLVMValueRef} obtained from {@link #LLVMGetFirstParam GetFirstParam} (which is actually a wrapped iterator) and obtains the next parameter from the
     * underlying iterator.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextParam(@NativeType("LLVMValueRef") long Arg) {
        long __functionAddress = Functions.GetNextParam;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(__functionAddress, Arg);
    }

    // --- [ LLVMGetPreviousParam ] ---

    /**
     * Obtain the previous parameter to a function.
     * 
     * <p>This is the opposite of {@link #LLVMGetNextParam GetNextParam}.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousParam(@NativeType("LLVMValueRef") long Arg) {
        long __functionAddress = Functions.GetPreviousParam;
        if (CHECKS) {
            check(Arg);
        }
        return invokePP(__functionAddress, Arg);
    }

    // --- [ LLVMSetParamAlignment ] ---

    /** Set the alignment for a function parameter. */
    public static void LLVMSetParamAlignment(@NativeType("LLVMValueRef") long Arg, @NativeType("unsigned int") int Align) {
        long __functionAddress = Functions.SetParamAlignment;
        if (CHECKS) {
            check(Arg);
        }
        invokePV(__functionAddress, Arg, Align);
    }

    // --- [ LLVMMDStringInContext ] ---

    /** Unsafe version of: {@link #LLVMMDStringInContext MDStringInContext} */
    public static long nLLVMMDStringInContext(long C, long Str, int SLen) {
        long __functionAddress = Functions.MDStringInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, C, Str, SLen);
    }

    /**
     * Obtain a {@code MDString} value from a context.
     * 
     * <p>The returned instance corresponds to the {@code llvm::MDString} class.</p>
     * 
     * <p>The instance is specified by string data of a specified length. The string content is copied, so the backing memory can be freed after this function
     * returns.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMMDStringInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Str) {
        return nLLVMMDStringInContext(C, memAddress(Str), Str.remaining());
    }

    /**
     * Obtain a {@code MDString} value from a context.
     * 
     * <p>The returned instance corresponds to the {@code llvm::MDString} class.</p>
     * 
     * <p>The instance is specified by string data of a specified length. The string content is copied, so the backing memory can be freed after this function
     * returns.</p>
     */
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

    /** Unsafe version of: {@link #LLVMMDString MDString} */
    public static long nLLVMMDString(long Str, int SLen) {
        long __functionAddress = Functions.MDString;
        return invokePP(__functionAddress, Str, SLen);
    }

    /** Obtain a {@code MDString} value from the global context. */
    @NativeType("LLVMValueRef")
    public static long LLVMMDString(@NativeType("char const *") ByteBuffer Str) {
        return nLLVMMDString(memAddress(Str), Str.remaining());
    }

    /** Obtain a {@code MDString} value from the global context. */
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

    /** Unsafe version of: {@link #LLVMMDNodeInContext MDNodeInContext} */
    public static long nLLVMMDNodeInContext(long C, long Vals, int Count) {
        long __functionAddress = Functions.MDNodeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, C, Vals, Count);
    }

    /**
     * Obtain a {@code MDNode} value from a context.
     * 
     * <p>The returned value corresponds to the {@code llvm::MDNode} class.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMMDNodeInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMValueRef *") PointerBuffer Vals) {
        return nLLVMMDNodeInContext(C, memAddress(Vals), Vals.remaining());
    }

    // --- [ LLVMMDNode ] ---

    /** Unsafe version of: {@link #LLVMMDNode MDNode} */
    public static long nLLVMMDNode(long Vals, int Count) {
        long __functionAddress = Functions.MDNode;
        return invokePP(__functionAddress, Vals, Count);
    }

    /** Obtain a {@code MDNode} value from the global context. */
    @NativeType("LLVMValueRef")
    public static long LLVMMDNode(@NativeType("LLVMValueRef *") PointerBuffer Vals) {
        return nLLVMMDNode(memAddress(Vals), Vals.remaining());
    }

    // --- [ LLVMMetadataAsValue ] ---

    /** Obtain a {@code Metadata} as a Value. */
    @NativeType("LLVMValueRef")
    public static long LLVMMetadataAsValue(@NativeType("LLVMContextRef") long C, @NativeType("LLVMMetadataRef") long MD) {
        long __functionAddress = Functions.MetadataAsValue;
        if (CHECKS) {
            check(C);
            check(MD);
        }
        return invokePPP(__functionAddress, C, MD);
    }

    // --- [ LLVMValueAsMetadata ] ---

    /** Obtain a {@code Value} as a {@code Metadata}. */
    @NativeType("LLVMMetadataRef")
    public static long LLVMValueAsMetadata(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueAsMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMGetMDString ] ---

    /**
     * Unsafe version of: {@link #LLVMGetMDString GetMDString}
     *
     * @param Length memory address which will hold length of returned string
     */
    public static long nLLVMGetMDString(long V, long Length) {
        long __functionAddress = Functions.GetMDString;
        if (CHECKS) {
            check(V);
        }
        return invokePPP(__functionAddress, V, Length);
    }

    /**
     * Obtain the underlying string from a {@code MDString} value.
     *
     * @param V instance to obtain string from
     *
     * @return string data in {@code MDString}
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMGetMDString(@NativeType("LLVMValueRef") long V) {
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

    /**
     * Obtain the number of operands from an {@code MDNode} value.
     *
     * @param V {@code MDNode} to get number of operands from
     *
     * @return number of operands of the {@code MDNode}
     */
    @NativeType("unsigned int")
    public static int LLVMGetMDNodeNumOperands(@NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.GetMDNodeNumOperands;
        if (CHECKS) {
            check(V);
        }
        return invokePI(__functionAddress, V);
    }

    // --- [ LLVMGetMDNodeOperands ] ---

    /** Unsafe version of: {@link #LLVMGetMDNodeOperands GetMDNodeOperands} */
    public static void nLLVMGetMDNodeOperands(long V, long Dest) {
        long __functionAddress = Functions.GetMDNodeOperands;
        if (CHECKS) {
            check(V);
        }
        invokePPV(__functionAddress, V, Dest);
    }

    /**
     * Obtain the given {@code MDNode}'s operands.
     * 
     * <p>The passed {@code LLVMValueRef} pointer should point to enough memory to hold all of the operands of the given {@code MDNode} (see
     * {@link #LLVMGetMDNodeNumOperands GetMDNodeNumOperands}) as {@code LLVMValueRefs}. This memory will be populated with the {@code LLVMValueRefs} of the {@code MDNode}'s operands.</p>
     *
     * @param V    MDNode to get the operands from
     * @param Dest destination array for operands
     */
    public static void LLVMGetMDNodeOperands(@NativeType("LLVMValueRef") long V, @NativeType("LLVMValueRef *") PointerBuffer Dest) {
        if (CHECKS) {
            if (DEBUG) {
                check(Dest, LLVMGetMDNodeNumOperands(V));
            }
        }
        nLLVMGetMDNodeOperands(V, memAddress(Dest));
    }

    // --- [ LLVMBasicBlockAsValue ] ---

    /** Convert a basic block instance to a value type. */
    @NativeType("LLVMValueRef")
    public static long LLVMBasicBlockAsValue(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BasicBlockAsValue;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    // --- [ LLVMValueIsBasicBlock ] ---

    /** Determine whether an {@code LLVMValueRef} is itself a basic block. */
    @NativeType("LLVMBool")
    public static boolean LLVMValueIsBasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueIsBasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val) != 0;
    }

    // --- [ LLVMValueAsBasicBlock ] ---

    /** Convert an {@code LLVMValueRef} to an {@code LLVMBasicBlockRef} instance. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMValueAsBasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueAsBasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val);
    }

    // --- [ LLVMGetBasicBlockName ] ---

    /** Unsafe version of: {@link #LLVMGetBasicBlockName GetBasicBlockName} */
    public static long nLLVMGetBasicBlockName(long BB) {
        long __functionAddress = Functions.GetBasicBlockName;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    /** Obtain the string name of a basic block. */
    @NativeType("char const *")
    public static String LLVMGetBasicBlockName(@NativeType("LLVMBasicBlockRef") long BB) {
        long __result = nLLVMGetBasicBlockName(BB);
        return memUTF8(__result);
    }

    // --- [ LLVMGetBasicBlockParent ] ---

    /** Obtain the function to which a basic block belongs. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetBasicBlockParent(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetBasicBlockParent;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    // --- [ LLVMGetBasicBlockTerminator ] ---

    /**
     * Obtain the terminator instruction for a basic block.
     * 
     * <p>If the basic block does not have a terminator (it is not well-formed if it doesn't), then {@code NULL} is returned.</p>
     * 
     * <p>The returned {@code LLVMValueRef} corresponds to an {@code llvm::Instruction}.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetBasicBlockTerminator(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetBasicBlockTerminator;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    // --- [ LLVMCountBasicBlocks ] ---

    /**
     * Obtain the number of basic blocks in a function.
     *
     * @param Fn function value to operate on
     */
    @NativeType("unsigned int")
    public static int LLVMCountBasicBlocks(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.CountBasicBlocks;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(__functionAddress, Fn);
    }

    // --- [ LLVMGetBasicBlocks ] ---

    /** Unsafe version of: {@link #LLVMGetBasicBlocks GetBasicBlocks} */
    public static void nLLVMGetBasicBlocks(long Fn, long BasicBlocks) {
        long __functionAddress = Functions.GetBasicBlocks;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(__functionAddress, Fn, BasicBlocks);
    }

    /**
     * Obtain all of the basic blocks in a function.
     * 
     * <p>This operates on a function value. The {@code BasicBlocks} parameter is a pointer to a pre-allocated array of {@code LLVMBasicBlockRef} of at least
     * {@link #LLVMCountBasicBlocks CountBasicBlocks} in length. This array is populated with {@code LLVMBasicBlockRef} instances.</p>
     */
    public static void LLVMGetBasicBlocks(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMBasicBlockRef *") PointerBuffer BasicBlocks) {
        if (CHECKS) {
            if (DEBUG) {
                check(BasicBlocks, LLVMCountBasicBlocks(Fn));
            }
        }
        nLLVMGetBasicBlocks(Fn, memAddress(BasicBlocks));
    }

    // --- [ LLVMGetFirstBasicBlock ] ---

    /**
     * Obtain the first basic block in a function.
     * 
     * <p>The returned basic block can be used as an iterator. You will likely eventually call into {@link #LLVMGetNextBasicBlock GetNextBasicBlock} with it.</p>
     */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetFirstBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetFirstBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMGetLastBasicBlock ] ---

    /** Obtain the last basic block in a function. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetLastBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetLastBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMGetNextBasicBlock ] ---

    /** Advance a basic block iterator. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetNextBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetNextBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    // --- [ LLVMGetPreviousBasicBlock ] ---

    /** Go backwards in a basic block iterator. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetPreviousBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetPreviousBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    // --- [ LLVMGetEntryBasicBlock ] ---

    /** Obtain the basic block that corresponds to the entry point of a function. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetEntryBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetEntryBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(__functionAddress, Fn);
    }

    // --- [ LLVMAppendBasicBlockInContext ] ---

    /** Unsafe version of: {@link #LLVMAppendBasicBlockInContext AppendBasicBlockInContext} */
    public static long nLLVMAppendBasicBlockInContext(long C, long Fn, long Name) {
        long __functionAddress = Functions.AppendBasicBlockInContext;
        if (CHECKS) {
            check(C);
            check(Fn);
        }
        return invokePPPP(__functionAddress, C, Fn, Name);
    }

    /** Append a basic block to the end of a function. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMAppendBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAppendBasicBlockInContext(C, Fn, memAddress(Name));
    }

    /** Append a basic block to the end of a function. */
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

    /** Unsafe version of: {@link #LLVMAppendBasicBlock AppendBasicBlock} */
    public static long nLLVMAppendBasicBlock(long Fn, long Name) {
        long __functionAddress = Functions.AppendBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePPP(__functionAddress, Fn, Name);
    }

    /** Append a basic block to the end of a function using the global context. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMAppendBasicBlock(@NativeType("LLVMValueRef") long Fn, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMAppendBasicBlock(Fn, memAddress(Name));
    }

    /** Append a basic block to the end of a function using the global context. */
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

    /** Unsafe version of: {@link #LLVMInsertBasicBlockInContext InsertBasicBlockInContext} */
    public static long nLLVMInsertBasicBlockInContext(long C, long BB, long Name) {
        long __functionAddress = Functions.InsertBasicBlockInContext;
        if (CHECKS) {
            check(C);
            check(BB);
        }
        return invokePPPP(__functionAddress, C, BB, Name);
    }

    /**
     * Insert a basic block in a function before another basic block.
     * 
     * <p>The function to add to is determined by the function of the passed basic block.</p>
     */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMInsertBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("LLVMBasicBlockRef") long BB, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMInsertBasicBlockInContext(C, BB, memAddress(Name));
    }

    /**
     * Insert a basic block in a function before another basic block.
     * 
     * <p>The function to add to is determined by the function of the passed basic block.</p>
     */
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

    /** Unsafe version of: {@link #LLVMInsertBasicBlock InsertBasicBlock} */
    public static long nLLVMInsertBasicBlock(long InsertBeforeBB, long Name) {
        long __functionAddress = Functions.InsertBasicBlock;
        if (CHECKS) {
            check(InsertBeforeBB);
        }
        return invokePPP(__functionAddress, InsertBeforeBB, Name);
    }

    /** Insert a basic block in a function using the global context. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMInsertBasicBlock(@NativeType("LLVMBasicBlockRef") long InsertBeforeBB, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMInsertBasicBlock(InsertBeforeBB, memAddress(Name));
    }

    /** Insert a basic block in a function using the global context. */
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

    /**
     * Remove a basic block from a function and delete it.
     * 
     * <p>This deletes the basic block from its containing function and deletes the basic block itself.</p>
     */
    public static void LLVMDeleteBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.DeleteBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        invokePV(__functionAddress, BB);
    }

    // --- [ LLVMRemoveBasicBlockFromParent ] ---

    /**
     * Remove a basic block from a function.
     * 
     * <p>This deletes the basic block from its containing function but keep the basic block alive.</p>
     */
    public static void LLVMRemoveBasicBlockFromParent(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.RemoveBasicBlockFromParent;
        if (CHECKS) {
            check(BB);
        }
        invokePV(__functionAddress, BB);
    }

    // --- [ LLVMMoveBasicBlockBefore ] ---

    /** Move a basic block to before another one. */
    public static void LLVMMoveBasicBlockBefore(@NativeType("LLVMBasicBlockRef") long BB, @NativeType("LLVMBasicBlockRef") long MovePos) {
        long __functionAddress = Functions.MoveBasicBlockBefore;
        if (CHECKS) {
            check(BB);
            check(MovePos);
        }
        invokePPV(__functionAddress, BB, MovePos);
    }

    // --- [ LLVMMoveBasicBlockAfter ] ---

    /** Move a basic block to after another one. */
    public static void LLVMMoveBasicBlockAfter(@NativeType("LLVMBasicBlockRef") long BB, @NativeType("LLVMBasicBlockRef") long MovePos) {
        long __functionAddress = Functions.MoveBasicBlockAfter;
        if (CHECKS) {
            check(BB);
            check(MovePos);
        }
        invokePPV(__functionAddress, BB, MovePos);
    }

    // --- [ LLVMGetFirstInstruction ] ---

    /**
     * Obtain the first instruction in a basic block.
     * 
     * <p>The returned {@code LLVMValueRef} corresponds to a {@code llvm::Instruction} instance.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstInstruction(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetFirstInstruction;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    // --- [ LLVMGetLastInstruction ] ---

    /**
     * Obtain the last instruction in a basic block.
     * 
     * <p>The returned {@code LLVMValueRef} corresponds to an {@code LLVM::Instruction}.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastInstruction(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetLastInstruction;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(__functionAddress, BB);
    }

    // --- [ LLVMHasMetadata ] ---

    /** Determine whether an instruction has any metadata attached. */
    @NativeType("int")
    public static boolean LLVMHasMetadata(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.HasMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(__functionAddress, Val) != 0;
    }

    // --- [ LLVMGetMetadata ] ---

    /** Return metadata associated with an instruction value. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetMetadata(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.GetMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(__functionAddress, Val, KindID);
    }

    // --- [ LLVMSetMetadata ] ---

    /** Set metadata associated with an instruction value. */
    public static void LLVMSetMetadata(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int KindID, @NativeType("LLVMValueRef") long Node) {
        long __functionAddress = Functions.SetMetadata;
        if (CHECKS) {
            check(Val);
            check(Node);
        }
        invokePPV(__functionAddress, Val, KindID, Node);
    }

    // --- [ LLVMInstructionGetAllMetadataOtherThanDebugLoc ] ---

    /** Unsafe version of: {@link #LLVMInstructionGetAllMetadataOtherThanDebugLoc InstructionGetAllMetadataOtherThanDebugLoc} */
    public static long nLLVMInstructionGetAllMetadataOtherThanDebugLoc(long Instr, long NumEntries) {
        long __functionAddress = Functions.InstructionGetAllMetadataOtherThanDebugLoc;
        if (CHECKS) {
            check(Instr);
        }
        return invokePPP(__functionAddress, Instr, NumEntries);
    }

    /** Returns the metadata associated with an instruction value, but filters out all the debug locations. */
    @NativeType("LLVMValueMetadataEntry *")
    public static long LLVMInstructionGetAllMetadataOtherThanDebugLoc(@NativeType("LLVMValueRef") long Instr, @NativeType("size_t *") PointerBuffer NumEntries) {
        if (CHECKS) {
            check(NumEntries, 1);
        }
        return nLLVMInstructionGetAllMetadataOtherThanDebugLoc(Instr, memAddress(NumEntries));
    }

    // --- [ LLVMGetInstructionParent ] ---

    /** Obtain the basic block to which an instruction belongs. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetInstructionParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetInstructionParent;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(__functionAddress, Inst);
    }

    // --- [ LLVMGetNextInstruction ] ---

    /**
     * Obtain the instruction that occurs after the one specified.
     * 
     * <p>The next instruction will be from the same basic block.</p>
     * 
     * <p>If this is the last instruction in a basic block, {@code NULL} will be returned.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetNextInstruction(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetNextInstruction;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(__functionAddress, Inst);
    }

    // --- [ LLVMGetPreviousInstruction ] ---

    /**
     * Obtain the instruction that occurred before this one.
     * 
     * <p>If the instruction is the first instruction in a basic block, {@code NULL} will be returned.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousInstruction(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetPreviousInstruction;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(__functionAddress, Inst);
    }

    // --- [ LLVMInstructionRemoveFromParent ] ---

    /**
     * Remove and delete an instruction.
     * 
     * <p>The instruction specified is removed from its containing building block but is kept alive.</p>
     */
    public static void LLVMInstructionRemoveFromParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.InstructionRemoveFromParent;
        if (CHECKS) {
            check(Inst);
        }
        invokePV(__functionAddress, Inst);
    }

    // --- [ LLVMInstructionEraseFromParent ] ---

    /**
     * Remove and delete an instruction.
     * 
     * <p>The instruction specified is removed from its containing building block and then deleted.</p>
     */
    public static void LLVMInstructionEraseFromParent(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.InstructionEraseFromParent;
        if (CHECKS) {
            check(Inst);
        }
        invokePV(__functionAddress, Inst);
    }

    // --- [ LLVMGetInstructionOpcode ] ---

    /** Obtain the code opcode for an individual instruction. */
    @NativeType("LLVMOpcode")
    public static int LLVMGetInstructionOpcode(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetInstructionOpcode;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(__functionAddress, Inst);
    }

    // --- [ LLVMGetICmpPredicate ] ---

    /**
     * Obtain the predicate of an instruction.
     * 
     * <p>This is only valid for instructions that correspond to {@code llvm::ICmpInst} or {@code llvm::ConstantExpr} whose opcode is
     * {@code llvm::Instruction::ICmp}.</p>
     */
    @NativeType("LLVMIntPredicate")
    public static int LLVMGetICmpPredicate(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetICmpPredicate;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(__functionAddress, Inst);
    }

    // --- [ LLVMGetFCmpPredicate ] ---

    /**
     * Obtain the float predicate of an instruction.
     * 
     * <p>This is only valid for instructions that correspond to {@code llvm::FCmpInst} or {@code llvm::ConstantExpr} whose opcode is
     * {@code llvm::Instruction::FCmp}.</p>
     */
    @NativeType("LLVMRealPredicate")
    public static int LLVMGetFCmpPredicate(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetFCmpPredicate;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(__functionAddress, Inst);
    }

    // --- [ LLVMInstructionClone ] ---

    /**
     * Create a copy of 'this' instruction that is identical in all ways except the following:
     * 
     * <ul>
     * <li>The instruction has no parent</li>
     * <li>The instruction has no name</li>
     * </ul>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMInstructionClone(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.InstructionClone;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(__functionAddress, Inst);
    }

    // --- [ LLVMIsATerminatorInst ] ---

    /**
     * Determine whether an instruction is a terminator. This routine is named to be compatible with historical functions that did this by querying the
     * underlying C++ type.
     */
    @NativeType("LLVMValueRef")
    public static long LLVMIsATerminatorInst(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.IsATerminatorInst;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(__functionAddress, Inst);
    }

    // --- [ LLVMGetNumArgOperands ] ---

    /**
     * Obtain the argument count for a call instruction.
     * 
     * <p>This expects an {@code LLVMValueRef} that corresponds to a {@code llvm::CallInst}, {@code llvm::InvokeInst}, or {@code llvm::FuncletPadInst}.</p>
     */
    @NativeType("unsigned int")
    public static int LLVMGetNumArgOperands(@NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.GetNumArgOperands;
        if (CHECKS) {
            check(Instr);
        }
        return invokePI(__functionAddress, Instr);
    }

    // --- [ LLVMSetInstructionCallConv ] ---

    /**
     * Set the calling convention for a call instruction.
     * 
     * <p>This expects an {@code LLVMValueRef} that corresponds to a {@code llvm::CallInst} or {@code llvm::InvokeInst}.</p>
     */
    public static void LLVMSetInstructionCallConv(@NativeType("LLVMValueRef") long Instr, @NativeType("unsigned int") int CC) {
        long __functionAddress = Functions.SetInstructionCallConv;
        if (CHECKS) {
            check(Instr);
        }
        invokePV(__functionAddress, Instr, CC);
    }

    // --- [ LLVMGetInstructionCallConv ] ---

    /**
     * Obtain the calling convention for a call instruction.
     * 
     * <p>This is the opposite of {@link #LLVMSetInstructionCallConv SetInstructionCallConv}. Reads its usage.</p>
     */
    @NativeType("unsigned int")
    public static int LLVMGetInstructionCallConv(@NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.GetInstructionCallConv;
        if (CHECKS) {
            check(Instr);
        }
        return invokePI(__functionAddress, Instr);
    }

    // --- [ LLVMSetInstrParamAlignment ] ---

    public static void LLVMSetInstrParamAlignment(@NativeType("LLVMValueRef") long Instr, @NativeType("unsigned int") int index, @NativeType("unsigned int") int Align) {
        long __functionAddress = Functions.SetInstrParamAlignment;
        if (CHECKS) {
            check(Instr);
        }
        invokePV(__functionAddress, Instr, index, Align);
    }

    // --- [ LLVMAddCallSiteAttribute ] ---

    public static void LLVMAddCallSiteAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.AddCallSiteAttribute;
        if (CHECKS) {
            check(C);
            check(A);
        }
        invokePPV(__functionAddress, C, Idx, A);
    }

    // --- [ LLVMGetCallSiteAttributeCount ] ---

    @NativeType("unsigned int")
    public static int LLVMGetCallSiteAttributeCount(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx) {
        long __functionAddress = Functions.GetCallSiteAttributeCount;
        if (CHECKS) {
            check(C);
        }
        return invokePI(__functionAddress, C, Idx);
    }

    // --- [ LLVMGetCallSiteAttributes ] ---

    public static void nLLVMGetCallSiteAttributes(long C, int Idx, long Attrs) {
        long __functionAddress = Functions.GetCallSiteAttributes;
        if (CHECKS) {
            check(C);
        }
        invokePPV(__functionAddress, C, Idx, Attrs);
    }

    public static void LLVMGetCallSiteAttributes(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef *") PointerBuffer Attrs) {
        if (CHECKS) {
            if (DEBUG) {
                check(Attrs, LLVMGetCallSiteAttributeCount(C, Idx));
            }
        }
        nLLVMGetCallSiteAttributes(C, Idx, memAddress(Attrs));
    }

    // --- [ LLVMGetCallSiteEnumAttribute ] ---

    @NativeType("LLVMAttributeRef")
    public static long LLVMGetCallSiteEnumAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.GetCallSiteEnumAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C, Idx, KindID);
    }

    // --- [ LLVMGetCallSiteStringAttribute ] ---

    public static long nLLVMGetCallSiteStringAttribute(long C, int Idx, long K, int KLen) {
        long __functionAddress = Functions.GetCallSiteStringAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(__functionAddress, C, Idx, K, KLen);
    }

    @NativeType("LLVMAttributeRef")
    public static long LLVMGetCallSiteStringAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        return nLLVMGetCallSiteStringAttribute(C, Idx, memAddress(K), K.remaining());
    }

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

    public static void LLVMRemoveCallSiteEnumAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.RemoveCallSiteEnumAttribute;
        if (CHECKS) {
            check(C);
        }
        invokePV(__functionAddress, C, Idx, KindID);
    }

    // --- [ LLVMRemoveCallSiteStringAttribute ] ---

    public static void nLLVMRemoveCallSiteStringAttribute(long C, int Idx, long K, int KLen) {
        long __functionAddress = Functions.RemoveCallSiteStringAttribute;
        if (CHECKS) {
            check(C);
        }
        invokePPV(__functionAddress, C, Idx, K, KLen);
    }

    public static void LLVMRemoveCallSiteStringAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("char const *") ByteBuffer K) {
        nLLVMRemoveCallSiteStringAttribute(C, Idx, memAddress(K), K.remaining());
    }

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

    // --- [ LLVMGetCalledValue ] ---

    /**
     * Obtain the pointer to the function invoked by this instruction.
     * 
     * <p>This expects an {@code LLVMValueRef} that corresponds to a {@code llvm::CallInst} or {@code llvm::InvokeInst}.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetCalledValue(@NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.GetCalledValue;
        if (CHECKS) {
            check(Instr);
        }
        return invokePP(__functionAddress, Instr);
    }

    // --- [ LLVMIsTailCall ] ---

    /**
     * Obtain whether a call instruction is a tail call.
     * 
     * <p>This only works on {@code llvm::CallInst} instructions.</p>
     */
    @NativeType("LLVMBool")
    public static boolean LLVMIsTailCall(@NativeType("LLVMValueRef") long CallInst) {
        long __functionAddress = Functions.IsTailCall;
        if (CHECKS) {
            check(CallInst);
        }
        return invokePI(__functionAddress, CallInst) != 0;
    }

    // --- [ LLVMSetTailCall ] ---

    /**
     * Set whether a call instruction is a tail call.
     * 
     * <p>This only works on {@code llvm::CallInst} instructions.</p>
     */
    public static void LLVMSetTailCall(@NativeType("LLVMValueRef") long CallInst, @NativeType("LLVMBool") boolean IsTailCall) {
        long __functionAddress = Functions.SetTailCall;
        if (CHECKS) {
            check(CallInst);
        }
        invokePV(__functionAddress, CallInst, IsTailCall ? 1 : 0);
    }

    // --- [ LLVMGetNormalDest ] ---

    /**
     * Return the normal destination basic block.
     * 
     * <p>This only works on {@code llvm::InvokeInst} instructions.</p>
     */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetNormalDest(@NativeType("LLVMValueRef") long InvokeInst) {
        long __functionAddress = Functions.GetNormalDest;
        if (CHECKS) {
            check(InvokeInst);
        }
        return invokePP(__functionAddress, InvokeInst);
    }

    // --- [ LLVMGetUnwindDest ] ---

    /**
     * Return the unwind destination basic block.
     * 
     * <p>Works on {@code llvm::InvokeInst}, {@code llvm::CleanupReturnInst}, and {@code llvm::CatchSwitchInst} instructions.</p>
     */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetUnwindDest(@NativeType("LLVMValueRef") long InvokeInst) {
        long __functionAddress = Functions.GetUnwindDest;
        if (CHECKS) {
            check(InvokeInst);
        }
        return invokePP(__functionAddress, InvokeInst);
    }

    // --- [ LLVMSetNormalDest ] ---

    /**
     * Set the normal destination basic block.
     * 
     * <p>This only works on {@code llvm::InvokeInst} instructions.</p>
     */
    public static void LLVMSetNormalDest(@NativeType("LLVMValueRef") long InvokeInst, @NativeType("LLVMBasicBlockRef") long B) {
        long __functionAddress = Functions.SetNormalDest;
        if (CHECKS) {
            check(InvokeInst);
            check(B);
        }
        invokePPV(__functionAddress, InvokeInst, B);
    }

    // --- [ LLVMSetUnwindDest ] ---

    /**
     * Set the unwind destination basic block.
     * 
     * <p>Works on {@code llvm::InvokeInst}, {@code llvm::CleanupReturnInst}, and {@code llvm::CatchSwitchInst} instructions.</p>
     */
    public static void LLVMSetUnwindDest(@NativeType("LLVMValueRef") long InvokeInst, @NativeType("LLVMBasicBlockRef") long B) {
        long __functionAddress = Functions.SetUnwindDest;
        if (CHECKS) {
            check(InvokeInst);
            check(B);
        }
        invokePPV(__functionAddress, InvokeInst, B);
    }

    // --- [ LLVMGetNumSuccessors ] ---

    /** Return the number of successors that this terminator has. */
    @NativeType("unsigned int")
    public static int LLVMGetNumSuccessors(@NativeType("LLVMValueRef") long Term) {
        long __functionAddress = Functions.GetNumSuccessors;
        if (CHECKS) {
            check(Term);
        }
        return invokePI(__functionAddress, Term);
    }

    // --- [ LLVMGetSuccessor ] ---

    /** Return the specified successor. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetSuccessor(@NativeType("LLVMValueRef") long Term, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.GetSuccessor;
        if (CHECKS) {
            check(Term);
        }
        return invokePP(__functionAddress, Term, i);
    }

    // --- [ LLVMSetSuccessor ] ---

    /** Update the specified successor to point at the provided block. */
    public static void LLVMSetSuccessor(@NativeType("LLVMValueRef") long Term, @NativeType("unsigned int") int i, @NativeType("LLVMBasicBlockRef") long block) {
        long __functionAddress = Functions.SetSuccessor;
        if (CHECKS) {
            check(Term);
            check(block);
        }
        invokePPV(__functionAddress, Term, i, block);
    }

    // --- [ LLVMIsConditional ] ---

    /**
     * Return if a branch is conditional.
     * 
     * <p>This only works on {@code llvm::BranchInst} instructions.</p>
     */
    @NativeType("LLVMBool")
    public static boolean LLVMIsConditional(@NativeType("LLVMValueRef") long Branch) {
        long __functionAddress = Functions.IsConditional;
        if (CHECKS) {
            check(Branch);
        }
        return invokePI(__functionAddress, Branch) != 0;
    }

    // --- [ LLVMGetCondition ] ---

    /**
     * Return the condition of a branch instruction.
     * 
     * <p>This only works on {@code llvm::BranchInst} instructions.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetCondition(@NativeType("LLVMValueRef") long Branch) {
        long __functionAddress = Functions.GetCondition;
        if (CHECKS) {
            check(Branch);
        }
        return invokePP(__functionAddress, Branch);
    }

    // --- [ LLVMSetCondition ] ---

    /**
     * Set the condition of a branch instruction.
     * 
     * <p>This only works on {@code llvm::BranchInst} instructions.</p>
     */
    public static void LLVMSetCondition(@NativeType("LLVMValueRef") long Branch, @NativeType("LLVMValueRef") long Cond) {
        long __functionAddress = Functions.SetCondition;
        if (CHECKS) {
            check(Branch);
            check(Cond);
        }
        invokePPV(__functionAddress, Branch, Cond);
    }

    // --- [ LLVMGetSwitchDefaultDest ] ---

    /**
     * Obtain the default destination basic block of a switch instruction.
     * 
     * <p>This only works on {@code llvm::SwitchInst} instructions.</p>
     */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetSwitchDefaultDest(@NativeType("LLVMValueRef") long SwitchInstr) {
        long __functionAddress = Functions.GetSwitchDefaultDest;
        if (CHECKS) {
            check(SwitchInstr);
        }
        return invokePP(__functionAddress, SwitchInstr);
    }

    // --- [ LLVMGetAllocatedType ] ---

    /** Obtain the type that is being allocated by the {@code alloca} instruction. */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetAllocatedType(@NativeType("LLVMValueRef") long Alloca) {
        long __functionAddress = Functions.GetAllocatedType;
        if (CHECKS) {
            check(Alloca);
        }
        return invokePP(__functionAddress, Alloca);
    }

    // --- [ LLVMIsInBounds ] ---

    /** Check whether the given {@code GEP} instruction is inbounds. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsInBounds(@NativeType("LLVMValueRef") long GEP) {
        long __functionAddress = Functions.IsInBounds;
        if (CHECKS) {
            check(GEP);
        }
        return invokePI(__functionAddress, GEP) != 0;
    }

    // --- [ LLVMSetIsInBounds ] ---

    /** Set the given {@code GEP} instruction to be inbounds or not. */
    public static void LLVMSetIsInBounds(@NativeType("LLVMValueRef") long GEP, @NativeType("LLVMBool") boolean InBounds) {
        long __functionAddress = Functions.SetIsInBounds;
        if (CHECKS) {
            check(GEP);
        }
        invokePV(__functionAddress, GEP, InBounds ? 1 : 0);
    }

    // --- [ LLVMAddIncoming ] ---

    /** Unsafe version of: {@link #LLVMAddIncoming AddIncoming} */
    public static void nLLVMAddIncoming(long PhiNode, long IncomingValues, long IncomingBlocks, int Count) {
        long __functionAddress = Functions.AddIncoming;
        if (CHECKS) {
            check(PhiNode);
        }
        invokePPPV(__functionAddress, PhiNode, IncomingValues, IncomingBlocks, Count);
    }

    /** Add an incoming value to the end of a PHI list. */
    public static void LLVMAddIncoming(@NativeType("LLVMValueRef") long PhiNode, @NativeType("LLVMValueRef *") PointerBuffer IncomingValues, @NativeType("LLVMBasicBlockRef *") PointerBuffer IncomingBlocks) {
        if (CHECKS) {
            check(IncomingBlocks, IncomingValues.remaining());
        }
        nLLVMAddIncoming(PhiNode, memAddress(IncomingValues), memAddress(IncomingBlocks), IncomingValues.remaining());
    }

    // --- [ LLVMCountIncoming ] ---

    /** Obtain the number of incoming basic blocks to a PHI node. */
    @NativeType("unsigned int")
    public static int LLVMCountIncoming(@NativeType("LLVMValueRef") long PhiNode) {
        long __functionAddress = Functions.CountIncoming;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePI(__functionAddress, PhiNode);
    }

    // --- [ LLVMGetIncomingValue ] ---

    /** Obtain an incoming value to a PHI node as an {@code LLVMValueRef}. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetIncomingValue(@NativeType("LLVMValueRef") long PhiNode, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetIncomingValue;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePP(__functionAddress, PhiNode, Index);
    }

    // --- [ LLVMGetIncomingBlock ] ---

    /** Obtain an incoming value to a PHI node as an {@code LLVMBasicBlockRef}. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetIncomingBlock(@NativeType("LLVMValueRef") long PhiNode, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetIncomingBlock;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePP(__functionAddress, PhiNode, Index);
    }

    // --- [ LLVMGetNumIndices ] ---

    /** Obtain the number of indices. NB: This also works on {@code GEP}. */
    @NativeType("unsigned int")
    public static int LLVMGetNumIndices(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetNumIndices;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(__functionAddress, Inst);
    }

    // --- [ LLVMGetIndices ] ---

    /** Unsafe version of: {@link #LLVMGetIndices GetIndices} */
    public static long nLLVMGetIndices(long Inst) {
        long __functionAddress = Functions.GetIndices;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(__functionAddress, Inst);
    }

    /**
     * Obtain the indices as an array.
     *
     * @param Count LWJGL: virtual parameter, should pass {@link #LLVMGetNumIndices GetNumIndices}
     */
    @NativeType("unsigned int const *")
    public static IntBuffer LLVMGetIndices(@NativeType("LLVMValueRef") long Inst, @NativeType("unsigned int") int Count) {
        long __result = nLLVMGetIndices(Inst);
        return memIntBuffer(__result, Count);
    }

    // --- [ LLVMCreateBuilderInContext ] ---

    @NativeType("LLVMBuilderRef")
    public static long LLVMCreateBuilderInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.CreateBuilderInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(__functionAddress, C);
    }

    // --- [ LLVMCreateBuilder ] ---

    @NativeType("LLVMBuilderRef")
    public static long LLVMCreateBuilder() {
        long __functionAddress = Functions.CreateBuilder;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMPositionBuilder ] ---

    public static void LLVMPositionBuilder(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Block, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.PositionBuilder;
        if (CHECKS) {
            check(Builder);
            check(Block);
            check(Instr);
        }
        invokePPPV(__functionAddress, Builder, Block, Instr);
    }

    // --- [ LLVMPositionBuilderBefore ] ---

    public static void LLVMPositionBuilderBefore(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.PositionBuilderBefore;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPV(__functionAddress, Builder, Instr);
    }

    // --- [ LLVMPositionBuilderAtEnd ] ---

    public static void LLVMPositionBuilderAtEnd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.PositionBuilderAtEnd;
        if (CHECKS) {
            check(Builder);
            check(Block);
        }
        invokePPV(__functionAddress, Builder, Block);
    }

    // --- [ LLVMGetInsertBlock ] ---

    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetInsertBlock(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetInsertBlock;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(__functionAddress, Builder);
    }

    // --- [ LLVMClearInsertionPosition ] ---

    public static void LLVMClearInsertionPosition(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.ClearInsertionPosition;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(__functionAddress, Builder);
    }

    // --- [ LLVMInsertIntoBuilder ] ---

    public static void LLVMInsertIntoBuilder(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.InsertIntoBuilder;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPV(__functionAddress, Builder, Instr);
    }

    // --- [ LLVMInsertIntoBuilderWithName ] ---

    public static void nLLVMInsertIntoBuilderWithName(long Builder, long Instr, long Name) {
        long __functionAddress = Functions.InsertIntoBuilderWithName;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPPV(__functionAddress, Builder, Instr, Name);
    }

    public static void LLVMInsertIntoBuilderWithName(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        nLLVMInsertIntoBuilderWithName(Builder, Instr, memAddress(Name));
    }

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

    public static void LLVMDisposeBuilder(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.DisposeBuilder;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(__functionAddress, Builder);
    }

    // --- [ LLVMSetCurrentDebugLocation ] ---

    /** Metadata */
    public static void LLVMSetCurrentDebugLocation(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long L) {
        long __functionAddress = Functions.SetCurrentDebugLocation;
        if (CHECKS) {
            check(Builder);
            check(L);
        }
        invokePPV(__functionAddress, Builder, L);
    }

    // --- [ LLVMGetCurrentDebugLocation ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetCurrentDebugLocation(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetCurrentDebugLocation;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(__functionAddress, Builder);
    }

    // --- [ LLVMSetInstDebugLocation ] ---

    public static void LLVMSetInstDebugLocation(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.SetInstDebugLocation;
        if (CHECKS) {
            check(Builder);
            check(Inst);
        }
        invokePPV(__functionAddress, Builder, Inst);
    }

    // --- [ LLVMBuildRetVoid ] ---

    /** Terminators */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildRetVoid(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.BuildRetVoid;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(__functionAddress, Builder);
    }

    // --- [ LLVMBuildRet ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildRet(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.BuildRet;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPP(__functionAddress, Builder, V);
    }

    // --- [ LLVMBuildAggregateRet ] ---

    public static long nLLVMBuildAggregateRet(long Builder, long RetVals, int N) {
        long __functionAddress = Functions.BuildAggregateRet;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPP(__functionAddress, Builder, RetVals, N);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildAggregateRet(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef *") PointerBuffer RetVals) {
        return nLLVMBuildAggregateRet(Builder, memAddress(RetVals), RetVals.remaining());
    }

    // --- [ LLVMBuildBr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildBr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.BuildBr;
        if (CHECKS) {
            check(Builder);
            check(Dest);
        }
        return invokePPP(__functionAddress, Builder, Dest);
    }

    // --- [ LLVMBuildCondBr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCondBr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long If, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Else) {
        long __functionAddress = Functions.BuildCondBr;
        if (CHECKS) {
            check(Builder);
            check(If);
            check(Then);
            check(Else);
        }
        return invokePPPPP(__functionAddress, Builder, If, Then, Else);
    }

    // --- [ LLVMBuildSwitch ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSwitch(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("LLVMBasicBlockRef") long Else, @NativeType("unsigned int") int NumCases) {
        long __functionAddress = Functions.BuildSwitch;
        if (CHECKS) {
            check(Builder);
            check(V);
            check(Else);
        }
        return invokePPPP(__functionAddress, Builder, V, Else, NumCases);
    }

    // --- [ LLVMBuildIndirectBr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildIndirectBr(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Addr, @NativeType("unsigned int") int NumDests) {
        long __functionAddress = Functions.BuildIndirectBr;
        if (CHECKS) {
            check(B);
            check(Addr);
        }
        return invokePPP(__functionAddress, B, Addr, NumDests);
    }

    // --- [ LLVMBuildInvoke ] ---

    public static long nLLVMBuildInvoke(long Builder, long Fn, long Args, int NumArgs, long Then, long Catch, long Name) {
        long __functionAddress = Functions.BuildInvoke;
        if (CHECKS) {
            check(Builder);
            check(Fn);
            check(Then);
            check(Catch);
        }
        return invokePPPPPPP(__functionAddress, Builder, Fn, Args, NumArgs, Then, Catch, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvoke(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInvoke(Builder, Fn, memAddress(Args), Args.remaining(), Then, Catch, memAddress(Name));
    }

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

    // --- [ LLVMBuildUnreachable ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildUnreachable(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.BuildUnreachable;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(__functionAddress, Builder);
    }

    // --- [ LLVMBuildResume ] ---

    /** Exception Handling */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildResume(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Exn) {
        long __functionAddress = Functions.BuildResume;
        if (CHECKS) {
            check(B);
            check(Exn);
        }
        return invokePPP(__functionAddress, B, Exn);
    }

    // --- [ LLVMBuildLandingPad ] ---

    public static long nLLVMBuildLandingPad(long B, long Ty, long PersFn, int NumClauses, long Name) {
        long __functionAddress = Functions.BuildLandingPad;
        if (CHECKS) {
            check(B);
            check(Ty);
            check(PersFn);
        }
        return invokePPPPP(__functionAddress, B, Ty, PersFn, NumClauses, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildLandingPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long PersFn, @NativeType("unsigned int") int NumClauses, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLandingPad(B, Ty, PersFn, NumClauses, memAddress(Name));
    }

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

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCleanupRet(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long CatchPad, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BuildCleanupRet;
        if (CHECKS) {
            check(B);
            check(CatchPad);
            check(BB);
        }
        return invokePPPP(__functionAddress, B, CatchPad, BB);
    }

    // --- [ LLVMBuildCatchRet ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchRet(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long CatchPad, @NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.BuildCatchRet;
        if (CHECKS) {
            check(B);
            check(CatchPad);
            check(BB);
        }
        return invokePPPP(__functionAddress, B, CatchPad, BB);
    }

    // --- [ LLVMBuildCatchPad ] ---

    public static long nLLVMBuildCatchPad(long B, long ParentPad, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCatchPad;
        if (CHECKS) {
            check(B);
            check(ParentPad);
        }
        return invokePPPPP(__functionAddress, B, ParentPad, Args, NumArgs, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCatchPad(B, ParentPad, memAddress(Args), Args.remaining(), memAddress(Name));
    }

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

    public static long nLLVMBuildCleanupPad(long B, long ParentPad, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCleanupPad;
        if (CHECKS) {
            check(B);
            check(ParentPad);
        }
        return invokePPPPP(__functionAddress, B, ParentPad, Args, NumArgs, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCleanupPad(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCleanupPad(B, ParentPad, memAddress(Args), Args.remaining(), memAddress(Name));
    }

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

    public static long nLLVMBuildCatchSwitch(long B, long ParentPad, long UnwindBB, int NumHandlers, long Name) {
        long __functionAddress = Functions.BuildCatchSwitch;
        if (CHECKS) {
            check(B);
            check(ParentPad);
            check(UnwindBB);
        }
        return invokePPPPP(__functionAddress, B, ParentPad, UnwindBB, NumHandlers, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCatchSwitch(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long ParentPad, @NativeType("LLVMBasicBlockRef") long UnwindBB, @NativeType("unsigned int") int NumHandlers, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCatchSwitch(B, ParentPad, UnwindBB, NumHandlers, memAddress(Name));
    }

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

    /** Add a case to the {@code switch} instruction */
    public static void LLVMAddCase(@NativeType("LLVMValueRef") long Switch, @NativeType("LLVMValueRef") long OnVal, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.AddCase;
        if (CHECKS) {
            check(Switch);
            check(OnVal);
            check(Dest);
        }
        invokePPPV(__functionAddress, Switch, OnVal, Dest);
    }

    // --- [ LLVMAddDestination ] ---

    /** Add a destination to the {@code indirectbr} instruction */
    public static void LLVMAddDestination(@NativeType("LLVMValueRef") long IndirectBr, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.AddDestination;
        if (CHECKS) {
            check(IndirectBr);
            check(Dest);
        }
        invokePPV(__functionAddress, IndirectBr, Dest);
    }

    // --- [ LLVMGetNumClauses ] ---

    /** Get the number of clauses on the {@code landingpad} instruction */
    @NativeType("unsigned int")
    public static int LLVMGetNumClauses(@NativeType("LLVMValueRef") long LandingPad) {
        long __functionAddress = Functions.GetNumClauses;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePI(__functionAddress, LandingPad);
    }

    // --- [ LLVMGetClause ] ---

    /** Get the value of the clause at index {@code Idx} on the {@code landingpad} instruction */
    @NativeType("LLVMValueRef")
    public static long LLVMGetClause(@NativeType("LLVMValueRef") long LandingPad, @NativeType("unsigned int") int Idx) {
        long __functionAddress = Functions.GetClause;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePP(__functionAddress, LandingPad, Idx);
    }

    // --- [ LLVMAddClause ] ---

    /** Add a {@code catch} or {@code filter} clause to the {@code landingpad} instruction */
    public static void LLVMAddClause(@NativeType("LLVMValueRef") long LandingPad, @NativeType("LLVMValueRef") long ClauseVal) {
        long __functionAddress = Functions.AddClause;
        if (CHECKS) {
            check(LandingPad);
            check(ClauseVal);
        }
        invokePPV(__functionAddress, LandingPad, ClauseVal);
    }

    // --- [ LLVMIsCleanup ] ---

    /** Get the 'cleanup' flag in the {@code landingpad} instruction */
    @NativeType("LLVMBool")
    public static boolean LLVMIsCleanup(@NativeType("LLVMValueRef") long LandingPad) {
        long __functionAddress = Functions.IsCleanup;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePI(__functionAddress, LandingPad) != 0;
    }

    // --- [ LLVMSetCleanup ] ---

    /** Set the 'cleanup' flag in the {@code landingpad} instruction */
    public static void LLVMSetCleanup(@NativeType("LLVMValueRef") long LandingPad, @NativeType("LLVMBool") boolean Val) {
        long __functionAddress = Functions.SetCleanup;
        if (CHECKS) {
            check(LandingPad);
        }
        invokePV(__functionAddress, LandingPad, Val ? 1 : 0);
    }

    // --- [ LLVMAddHandler ] ---

    /** Add a destination to the {@code catchswitch} instruction */
    public static void LLVMAddHandler(@NativeType("LLVMValueRef") long CatchSwitch, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.AddHandler;
        if (CHECKS) {
            check(CatchSwitch);
            check(Dest);
        }
        invokePPV(__functionAddress, CatchSwitch, Dest);
    }

    // --- [ LLVMGetNumHandlers ] ---

    /** Get the number of handlers on the {@code catchswitch} instruction */
    @NativeType("unsigned int")
    public static int LLVMGetNumHandlers(@NativeType("LLVMValueRef") long CatchSwitch) {
        long __functionAddress = Functions.GetNumHandlers;
        if (CHECKS) {
            check(CatchSwitch);
        }
        return invokePI(__functionAddress, CatchSwitch);
    }

    // --- [ LLVMGetHandlers ] ---

    /** Unsafe version of: {@link #LLVMGetHandlers GetHandlers} */
    public static void nLLVMGetHandlers(long CatchSwitch, long Handlers) {
        long __functionAddress = Functions.GetHandlers;
        if (CHECKS) {
            check(CatchSwitch);
        }
        invokePPV(__functionAddress, CatchSwitch, Handlers);
    }

    /**
     * Obtain the basic blocks acting as handlers for a {@code catchswitch} instruction.
     * 
     * <p>The {@code Handlers} parameter should point to a pre-allocated array of {@code LLVMBasicBlockRefs} at least {@link #LLVMGetNumHandlers GetNumHandlers} large. On return, the
     * first {@code LLVMGetNumHandlers()} entries in the array will be populated with {@code LLVMBasicBlockRef} instances.</p>
     *
     * @param CatchSwitch the {@code catchswitch} instruction to operate on
     * @param Handlers    memory address of an array to be filled with basic blocks
     */
    public static void LLVMGetHandlers(@NativeType("LLVMValueRef") long CatchSwitch, @NativeType("LLVMBasicBlockRef *") PointerBuffer Handlers) {
        if (CHECKS) {
            if (DEBUG) {
                check(Handlers, LLVMGetNumHandlers(CatchSwitch));
            }
        }
        nLLVMGetHandlers(CatchSwitch, memAddress(Handlers));
    }

    // --- [ LLVMGetArgOperand ] ---

    /** Get the number of {@code funcletpad} arguments. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetArgOperand(@NativeType("LLVMValueRef") long Funclet, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.GetArgOperand;
        if (CHECKS) {
            check(Funclet);
        }
        return invokePP(__functionAddress, Funclet, i);
    }

    // --- [ LLVMSetArgOperand ] ---

    /** Set a {@code funcletpad} argument at the given index. */
    public static void LLVMSetArgOperand(@NativeType("LLVMValueRef") long Funclet, @NativeType("unsigned int") int i, @NativeType("LLVMValueRef") long value) {
        long __functionAddress = Functions.SetArgOperand;
        if (CHECKS) {
            check(Funclet);
            check(value);
        }
        invokePPV(__functionAddress, Funclet, i, value);
    }

    // --- [ LLVMGetParentCatchSwitch ] ---

    /**
     * Get the parent {@code catchswitch} instruction of a {@code catchpad} instruction.
     * 
     * <p>This only works on {@code llvm::CatchPadInst} instructions.</p>
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetParentCatchSwitch(@NativeType("LLVMValueRef") long CatchPad) {
        long __functionAddress = Functions.GetParentCatchSwitch;
        if (CHECKS) {
            check(CatchPad);
        }
        return invokePP(__functionAddress, CatchPad);
    }

    // --- [ LLVMSetParentCatchSwitch ] ---

    /**
     * Set the parent {@code catchswitch} instruction of a {@code catchpad} instruction.
     * 
     * <p>This only works on {@code llvm::CatchPadInst} instructions.</p>
     */
    public static void LLVMSetParentCatchSwitch(@NativeType("LLVMValueRef") long CatchPad, @NativeType("LLVMValueRef") long CatchSwitch) {
        long __functionAddress = Functions.SetParentCatchSwitch;
        if (CHECKS) {
            check(CatchPad);
            check(CatchSwitch);
        }
        invokePPV(__functionAddress, CatchPad, CatchSwitch);
    }

    // --- [ LLVMBuildAdd ] ---

    /** Unsafe version of: {@link #LLVMBuildAdd BuildAdd} */
    public static long nLLVMBuildAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    /** Arithmetic */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAdd(Builder, LHS, RHS, memAddress(Name));
    }

    /** Arithmetic */
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

    public static long nLLVMBuildNSWAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNSWAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWAdd(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildNUWAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNUWAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWAdd(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildFAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFAdd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFAdd(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSub(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildNSWSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNSWSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWSub(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildNUWSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNUWSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWSub(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildFSub(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFSub;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFSub(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFSub(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildMul(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildNSWMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNSWMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWMul(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildNUWMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildNUWMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWMul(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildFMul(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFMul;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFMul(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFMul(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildUDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildUDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildUDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildUDiv(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildExactUDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildExactUDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildExactUDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExactUDiv(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildSDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildSDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSDiv(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildExactSDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildExactSDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildExactSDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExactSDiv(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildFDiv(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFDiv;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFDiv(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFDiv(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildURem(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildURem;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildURem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildURem(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildSRem(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildSRem;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSRem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSRem(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildFRem(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFRem;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFRem(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFRem(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildShl(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildShl;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildShl(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildShl(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildLShr(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildLShr;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildLShr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLShr(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildAShr(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildAShr;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildAShr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAShr(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildAnd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildAnd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildAnd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAnd(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildOr(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildOr;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildOr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildOr(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildXor(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildXor;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildXor(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildXor(Builder, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildBinOp(long B, int Op, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildBinOp;
        if (CHECKS) {
            check(B);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, B, Op, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildBinOp(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMOpcode") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildBinOp(B, Op, LHS, RHS, memAddress(Name));
    }

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

    public static long nLLVMBuildNeg(long Builder, long V, long Name) {
        long __functionAddress = Functions.BuildNeg;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPPP(__functionAddress, Builder, V, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNeg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNeg(Builder, V, memAddress(Name));
    }

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

    public static long nLLVMBuildNSWNeg(long B, long V, long Name) {
        long __functionAddress = Functions.BuildNSWNeg;
        if (CHECKS) {
            check(B);
            check(V);
        }
        return invokePPPP(__functionAddress, B, V, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNSWNeg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNSWNeg(B, V, memAddress(Name));
    }

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

    public static long nLLVMBuildNUWNeg(long B, long V, long Name) {
        long __functionAddress = Functions.BuildNUWNeg;
        if (CHECKS) {
            check(B);
            check(V);
        }
        return invokePPPP(__functionAddress, B, V, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNUWNeg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNUWNeg(B, V, memAddress(Name));
    }

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

    public static long nLLVMBuildFNeg(long Builder, long V, long Name) {
        long __functionAddress = Functions.BuildFNeg;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPPP(__functionAddress, Builder, V, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFNeg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFNeg(Builder, V, memAddress(Name));
    }

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

    // --- [ LLVMBuildNot ] ---

    public static long nLLVMBuildNot(long Builder, long V, long Name) {
        long __functionAddress = Functions.BuildNot;
        if (CHECKS) {
            check(Builder);
            check(V);
        }
        return invokePPPP(__functionAddress, Builder, V, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildNot(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildNot(Builder, V, memAddress(Name));
    }

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

    /** Unsafe version of: {@link #LLVMBuildMalloc BuildMalloc} */
    public static long nLLVMBuildMalloc(long Builder, long Ty, long Name) {
        long __functionAddress = Functions.BuildMalloc;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePPPP(__functionAddress, Builder, Ty, Name);
    }

    /** Memory */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildMalloc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildMalloc(Builder, Ty, memAddress(Name));
    }

    /** Memory */
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

    public static long nLLVMBuildArrayMalloc(long Builder, long Ty, long Val, long Name) {
        long __functionAddress = Functions.BuildArrayMalloc;
        if (CHECKS) {
            check(Builder);
            check(Ty);
            check(Val);
        }
        return invokePPPPP(__functionAddress, Builder, Ty, Val, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildArrayMalloc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildArrayMalloc(Builder, Ty, Val, memAddress(Name));
    }

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

    // --- [ LLVMBuildAlloca ] ---

    public static long nLLVMBuildAlloca(long Builder, long Ty, long Name) {
        long __functionAddress = Functions.BuildAlloca;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePPPP(__functionAddress, Builder, Ty, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildAlloca(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAlloca(Builder, Ty, memAddress(Name));
    }

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

    public static long nLLVMBuildArrayAlloca(long Builder, long Ty, long Val, long Name) {
        long __functionAddress = Functions.BuildArrayAlloca;
        if (CHECKS) {
            check(Builder);
            check(Ty);
            check(Val);
        }
        return invokePPPPP(__functionAddress, Builder, Ty, Val, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildArrayAlloca(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildArrayAlloca(Builder, Ty, Val, memAddress(Name));
    }

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

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFree(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long PointerVal) {
        long __functionAddress = Functions.BuildFree;
        if (CHECKS) {
            check(Builder);
            check(PointerVal);
        }
        return invokePPP(__functionAddress, Builder, PointerVal);
    }

    // --- [ LLVMBuildLoad ] ---

    public static long nLLVMBuildLoad(long Builder, long PointerVal, long Name) {
        long __functionAddress = Functions.BuildLoad;
        if (CHECKS) {
            check(Builder);
            check(PointerVal);
        }
        return invokePPPP(__functionAddress, Builder, PointerVal, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildLoad(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long PointerVal, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLoad(Builder, PointerVal, memAddress(Name));
    }

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

    // --- [ LLVMBuildStore ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildStore(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMValueRef") long Ptr) {
        long __functionAddress = Functions.BuildStore;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(Ptr);
        }
        return invokePPPP(__functionAddress, Builder, Val, Ptr);
    }

    // --- [ LLVMBuildGEP ] ---

    public static long nLLVMBuildGEP(long B, long Pointer, long Indices, int NumIndices, long Name) {
        long __functionAddress = Functions.BuildGEP;
        if (CHECKS) {
            check(B);
            check(Pointer);
        }
        return invokePPPPP(__functionAddress, B, Pointer, Indices, NumIndices, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildGEP(B, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

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

    public static long nLLVMBuildInBoundsGEP(long B, long Pointer, long Indices, int NumIndices, long Name) {
        long __functionAddress = Functions.BuildInBoundsGEP;
        if (CHECKS) {
            check(B);
            check(Pointer);
        }
        return invokePPPPP(__functionAddress, B, Pointer, Indices, NumIndices, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildInBoundsGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInBoundsGEP(B, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

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

    public static long nLLVMBuildStructGEP(long B, long Pointer, int Idx, long Name) {
        long __functionAddress = Functions.BuildStructGEP;
        if (CHECKS) {
            check(B);
            check(Pointer);
        }
        return invokePPPP(__functionAddress, B, Pointer, Idx, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildStructGEP(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Pointer, @NativeType("unsigned int") int Idx, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildStructGEP(B, Pointer, Idx, memAddress(Name));
    }

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

    // --- [ LLVMBuildGlobalString ] ---

    public static long nLLVMBuildGlobalString(long B, long Str, long Name) {
        long __functionAddress = Functions.BuildGlobalString;
        if (CHECKS) {
            check(B);
        }
        return invokePPPP(__functionAddress, B, Str, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildGlobalString(@NativeType("LLVMBuilderRef") long B, @NativeType("char const *") ByteBuffer Str, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Str);
            checkNT1(Name);
        }
        return nLLVMBuildGlobalString(B, memAddress(Str), memAddress(Name));
    }

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

    public static long nLLVMBuildGlobalStringPtr(long B, long Str, long Name) {
        long __functionAddress = Functions.BuildGlobalStringPtr;
        if (CHECKS) {
            check(B);
        }
        return invokePPPP(__functionAddress, B, Str, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildGlobalStringPtr(@NativeType("LLVMBuilderRef") long B, @NativeType("char const *") ByteBuffer Str, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Str);
            checkNT1(Name);
        }
        return nLLVMBuildGlobalStringPtr(B, memAddress(Str), memAddress(Name));
    }

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

    @NativeType("LLVMBool")
    public static boolean LLVMGetVolatile(@NativeType("LLVMValueRef") long MemoryAccessInst) {
        long __functionAddress = Functions.GetVolatile;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        return invokePI(__functionAddress, MemoryAccessInst) != 0;
    }

    // --- [ LLVMSetVolatile ] ---

    public static void LLVMSetVolatile(@NativeType("LLVMValueRef") long MemoryAccessInst, @NativeType("LLVMBool") boolean IsVolatile) {
        long __functionAddress = Functions.SetVolatile;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        invokePV(__functionAddress, MemoryAccessInst, IsVolatile ? 1 : 0);
    }

    // --- [ LLVMGetOrdering ] ---

    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetOrdering(@NativeType("LLVMValueRef") long MemoryAccessInst) {
        long __functionAddress = Functions.GetOrdering;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        return invokePI(__functionAddress, MemoryAccessInst);
    }

    // --- [ LLVMSetOrdering ] ---

    public static void LLVMSetOrdering(@NativeType("LLVMValueRef") long MemoryAccessInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetOrdering;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        invokePV(__functionAddress, MemoryAccessInst, Ordering);
    }

    // --- [ LLVMBuildTrunc ] ---

    /** Unsafe version of: {@link #LLVMBuildTrunc BuildTrunc} */
    public static long nLLVMBuildTrunc(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildTrunc;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    /** Casts */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildTrunc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildTrunc(Builder, Val, DestTy, memAddress(Name));
    }

    /** Casts */
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

    public static long nLLVMBuildZExt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildZExt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildZExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildZExt(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildSExt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildSExt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSExt(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildFPToUI(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPToUI;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPToUI(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPToUI(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildFPToSI(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPToSI;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPToSI(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPToSI(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildUIToFP(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildUIToFP;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildUIToFP(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildUIToFP(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildSIToFP(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildSIToFP;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSIToFP(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSIToFP(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildFPTrunc(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPTrunc;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPTrunc(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPTrunc(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildFPExt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPExt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPExt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPExt(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildPtrToInt(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildPtrToInt;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrToInt(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPtrToInt(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildIntToPtr(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildIntToPtr;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntToPtr(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIntToPtr(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildBitCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildAddrSpaceCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildAddrSpaceCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildAddrSpaceCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildAddrSpaceCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildZExtOrBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildZExtOrBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildZExtOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildZExtOrBitCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildSExtOrBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildSExtOrBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSExtOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSExtOrBitCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildTruncOrBitCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildTruncOrBitCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildTruncOrBitCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildTruncOrBitCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildCast(long B, int Op, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildCast;
        if (CHECKS) {
            check(B);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, B, Op, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCast(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMOpcode") int Op, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCast(B, Op, Val, DestTy, memAddress(Name));
    }

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

    public static long nLLVMBuildPointerCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildPointerCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildPointerCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPointerCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    // --- [ LLVMBuildIntCast ] ---

    public static long nLLVMBuildIntCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildIntCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildIntCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIntCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    // --- [ LLVMBuildFPCast ] ---

    public static long nLLVMBuildFPCast(long Builder, long Val, long DestTy, long Name) {
        long __functionAddress = Functions.BuildFPCast;
        if (CHECKS) {
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(__functionAddress, Builder, Val, DestTy, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFPCast(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFPCast(Builder, Val, DestTy, memAddress(Name));
    }

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

    /** Unsafe version of: {@link #LLVMBuildICmp BuildICmp} */
    public static long nLLVMBuildICmp(long Builder, int Op, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildICmp;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, Op, LHS, RHS, Name);
    }

    /** Comparisons */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildICmp(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMIntPredicate") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildICmp(Builder, Op, LHS, RHS, memAddress(Name));
    }

    /** Comparisons */
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

    public static long nLLVMBuildFCmp(long Builder, int Op, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildFCmp;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, Op, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFCmp(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMRealPredicate") int Op, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFCmp(Builder, Op, LHS, RHS, memAddress(Name));
    }

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

    /** Unsafe version of: {@link #LLVMBuildPhi BuildPhi} */
    public static long nLLVMBuildPhi(long Builder, long Ty, long Name) {
        long __functionAddress = Functions.BuildPhi;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePPPP(__functionAddress, Builder, Ty, Name);
    }

    /** Miscellaneous instructions */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPhi(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPhi(Builder, Ty, memAddress(Name));
    }

    /** Miscellaneous instructions */
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

    public static long nLLVMBuildCall(long Builder, long Fn, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCall;
        if (CHECKS) {
            check(Builder);
            check(Fn);
        }
        return invokePPPPP(__functionAddress, Builder, Fn, Args, NumArgs, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildCall(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCall(Builder, Fn, memAddress(Args), Args.remaining(), memAddress(Name));
    }

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

    // --- [ LLVMBuildSelect ] ---

    public static long nLLVMBuildSelect(long Builder, long If, long Then, long Else, long Name) {
        long __functionAddress = Functions.BuildSelect;
        if (CHECKS) {
            check(Builder);
            check(If);
            check(Then);
            check(Else);
        }
        return invokePPPPPP(__functionAddress, Builder, If, Then, Else, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildSelect(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long If, @NativeType("LLVMValueRef") long Then, @NativeType("LLVMValueRef") long Else, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildSelect(Builder, If, Then, Else, memAddress(Name));
    }

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

    public static long nLLVMBuildVAArg(long Builder, long List, long Ty, long Name) {
        long __functionAddress = Functions.BuildVAArg;
        if (CHECKS) {
            check(Builder);
            check(List);
            check(Ty);
        }
        return invokePPPPP(__functionAddress, Builder, List, Ty, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildVAArg(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long List, @NativeType("LLVMTypeRef") long Ty, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildVAArg(Builder, List, Ty, memAddress(Name));
    }

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

    public static long nLLVMBuildExtractElement(long Builder, long VecVal, long Index, long Name) {
        long __functionAddress = Functions.BuildExtractElement;
        if (CHECKS) {
            check(Builder);
            check(VecVal);
            check(Index);
        }
        return invokePPPPP(__functionAddress, Builder, VecVal, Index, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildExtractElement(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long VecVal, @NativeType("LLVMValueRef") long Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExtractElement(Builder, VecVal, Index, memAddress(Name));
    }

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

    public static long nLLVMBuildInsertElement(long Builder, long VecVal, long EltVal, long Index, long Name) {
        long __functionAddress = Functions.BuildInsertElement;
        if (CHECKS) {
            check(Builder);
            check(VecVal);
            check(EltVal);
            check(Index);
        }
        return invokePPPPPP(__functionAddress, Builder, VecVal, EltVal, Index, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildInsertElement(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long VecVal, @NativeType("LLVMValueRef") long EltVal, @NativeType("LLVMValueRef") long Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInsertElement(Builder, VecVal, EltVal, Index, memAddress(Name));
    }

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

    public static long nLLVMBuildShuffleVector(long Builder, long V1, long V2, long Mask, long Name) {
        long __functionAddress = Functions.BuildShuffleVector;
        if (CHECKS) {
            check(Builder);
            check(V1);
            check(V2);
            check(Mask);
        }
        return invokePPPPPP(__functionAddress, Builder, V1, V2, Mask, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildShuffleVector(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long V1, @NativeType("LLVMValueRef") long V2, @NativeType("LLVMValueRef") long Mask, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildShuffleVector(Builder, V1, V2, Mask, memAddress(Name));
    }

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

    public static long nLLVMBuildExtractValue(long Builder, long AggVal, int Index, long Name) {
        long __functionAddress = Functions.BuildExtractValue;
        if (CHECKS) {
            check(Builder);
            check(AggVal);
        }
        return invokePPPP(__functionAddress, Builder, AggVal, Index, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildExtractValue(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long AggVal, @NativeType("unsigned int") int Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildExtractValue(Builder, AggVal, Index, memAddress(Name));
    }

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

    public static long nLLVMBuildInsertValue(long Builder, long AggVal, long EltVal, int Index, long Name) {
        long __functionAddress = Functions.BuildInsertValue;
        if (CHECKS) {
            check(Builder);
            check(AggVal);
            check(EltVal);
        }
        return invokePPPPP(__functionAddress, Builder, AggVal, EltVal, Index, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildInsertValue(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long AggVal, @NativeType("LLVMValueRef") long EltVal, @NativeType("unsigned int") int Index, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInsertValue(Builder, AggVal, EltVal, Index, memAddress(Name));
    }

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

    // --- [ LLVMBuildIsNull ] ---

    public static long nLLVMBuildIsNull(long Builder, long Val, long Name) {
        long __functionAddress = Functions.BuildIsNull;
        if (CHECKS) {
            check(Builder);
            check(Val);
        }
        return invokePPPP(__functionAddress, Builder, Val, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildIsNull(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIsNull(Builder, Val, memAddress(Name));
    }

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

    public static long nLLVMBuildIsNotNull(long Builder, long Val, long Name) {
        long __functionAddress = Functions.BuildIsNotNull;
        if (CHECKS) {
            check(Builder);
            check(Val);
        }
        return invokePPPP(__functionAddress, Builder, Val, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildIsNotNull(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildIsNotNull(Builder, Val, memAddress(Name));
    }

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

    public static long nLLVMBuildPtrDiff(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildPtrDiff;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(__functionAddress, Builder, LHS, RHS, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildPtrDiff(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long LHS, @NativeType("LLVMValueRef") long RHS, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPtrDiff(Builder, LHS, RHS, memAddress(Name));
    }

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

    // --- [ LLVMBuildFence ] ---

    public static long nLLVMBuildFence(long B, int ordering, int singleThread, long Name) {
        long __functionAddress = Functions.BuildFence;
        if (CHECKS) {
            check(B);
        }
        return invokePPP(__functionAddress, B, ordering, singleThread, Name);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMBuildFence(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("LLVMBool") boolean singleThread, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildFence(B, ordering, singleThread ? 1 : 0, memAddress(Name));
    }

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

    // --- [ LLVMBuildAtomicRMW ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildAtomicRMW(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMAtomicRMWBinOp") int op, @NativeType("LLVMValueRef") long PTR, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMAtomicOrdering") int ordering, @NativeType("LLVMBool") boolean singleThread) {
        long __functionAddress = Functions.BuildAtomicRMW;
        if (CHECKS) {
            check(B);
            check(PTR);
            check(Val);
        }
        return invokePPPP(__functionAddress, B, op, PTR, Val, ordering, singleThread ? 1 : 0);
    }

    // --- [ LLVMBuildAtomicCmpXchg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildAtomicCmpXchg(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Ptr, @NativeType("LLVMValueRef") long Cmp, @NativeType("LLVMValueRef") long New, @NativeType("LLVMAtomicOrdering") int SuccessOrdering, @NativeType("LLVMAtomicOrdering") int FailureOrdering, @NativeType("LLVMBool") boolean SingleThread) {
        long __functionAddress = Functions.BuildAtomicCmpXchg;
        if (CHECKS) {
            check(B);
            check(Ptr);
            check(Cmp);
            check(New);
        }
        return invokePPPPP(__functionAddress, B, Ptr, Cmp, New, SuccessOrdering, FailureOrdering, SingleThread ? 1 : 0);
    }

    // --- [ LLVMIsAtomicSingleThread ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsAtomicSingleThread(@NativeType("LLVMValueRef") long AtomicInst) {
        long __functionAddress = Functions.IsAtomicSingleThread;
        if (CHECKS) {
            check(AtomicInst);
        }
        return invokePI(__functionAddress, AtomicInst) != 0;
    }

    // --- [ LLVMSetAtomicSingleThread ] ---

    public static void LLVMSetAtomicSingleThread(@NativeType("LLVMValueRef") long AtomicInst, @NativeType("LLVMBool") boolean SingleThread) {
        long __functionAddress = Functions.SetAtomicSingleThread;
        if (CHECKS) {
            check(AtomicInst);
        }
        invokePV(__functionAddress, AtomicInst, SingleThread ? 1 : 0);
    }

    // --- [ LLVMGetCmpXchgSuccessOrdering ] ---

    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetCmpXchgSuccessOrdering(@NativeType("LLVMValueRef") long CmpXchgInst) {
        long __functionAddress = Functions.GetCmpXchgSuccessOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        return invokePI(__functionAddress, CmpXchgInst);
    }

    // --- [ LLVMSetCmpXchgSuccessOrdering ] ---

    public static void LLVMSetCmpXchgSuccessOrdering(@NativeType("LLVMValueRef") long CmpXchgInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetCmpXchgSuccessOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        invokePV(__functionAddress, CmpXchgInst, Ordering);
    }

    // --- [ LLVMGetCmpXchgFailureOrdering ] ---

    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetCmpXchgFailureOrdering(@NativeType("LLVMValueRef") long CmpXchgInst) {
        long __functionAddress = Functions.GetCmpXchgFailureOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        return invokePI(__functionAddress, CmpXchgInst);
    }

    // --- [ LLVMSetCmpXchgFailureOrdering ] ---

    public static void LLVMSetCmpXchgFailureOrdering(@NativeType("LLVMValueRef") long CmpXchgInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetCmpXchgFailureOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        invokePV(__functionAddress, CmpXchgInst, Ordering);
    }

    // --- [ LLVMCreateModuleProviderForExistingModule ] ---

    /**
     * Changes the type of {@code M} so it can be passed to {@code FunctionPassManagers} and the JIT.  They take {@code ModuleProviders} for historical
     * reasons.
     */
    @NativeType("LLVMModuleProviderRef")
    public static long LLVMCreateModuleProviderForExistingModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateModuleProviderForExistingModule;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMDisposeModuleProvider ] ---

    /** Destroys the module {@code M}. */
    public static void LLVMDisposeModuleProvider(@NativeType("LLVMModuleProviderRef") long M) {
        long __functionAddress = Functions.DisposeModuleProvider;
        if (CHECKS) {
            check(M);
        }
        invokePV(__functionAddress, M);
    }

    // --- [ LLVMCreateMemoryBufferWithContentsOfFile ] ---

    public static int nLLVMCreateMemoryBufferWithContentsOfFile(long Path, long OutMemBuf, long OutMessage) {
        long __functionAddress = Functions.CreateMemoryBufferWithContentsOfFile;
        return invokePPPI(__functionAddress, Path, OutMemBuf, OutMessage);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMCreateMemoryBufferWithContentsOfFile(@NativeType("char const *") ByteBuffer Path, @NativeType("LLVMMemoryBufferRef *") PointerBuffer OutMemBuf, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            checkNT1(Path);
            check(OutMemBuf, 1);
            check(OutMessage, 1);
        }
        return nLLVMCreateMemoryBufferWithContentsOfFile(memAddress(Path), memAddress(OutMemBuf), memAddress(OutMessage)) != 0;
    }

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

    public static int nLLVMCreateMemoryBufferWithSTDIN(long OutMemBuf, long OutMessage) {
        long __functionAddress = Functions.CreateMemoryBufferWithSTDIN;
        return invokePPI(__functionAddress, OutMemBuf, OutMessage);
    }

    @NativeType("LLVMBool")
    public static boolean LLVMCreateMemoryBufferWithSTDIN(@NativeType("LLVMMemoryBufferRef *") PointerBuffer OutMemBuf, @NativeType("char **") PointerBuffer OutMessage) {
        if (CHECKS) {
            check(OutMemBuf, 1);
            check(OutMessage, 1);
        }
        return nLLVMCreateMemoryBufferWithSTDIN(memAddress(OutMemBuf), memAddress(OutMessage)) != 0;
    }

    // --- [ LLVMCreateMemoryBufferWithMemoryRange ] ---

    public static long nLLVMCreateMemoryBufferWithMemoryRange(long InputData, long InputDataLength, long BufferName, int RequiresNullTerminator) {
        long __functionAddress = Functions.CreateMemoryBufferWithMemoryRange;
        return invokePPPP(__functionAddress, InputData, InputDataLength, BufferName, RequiresNullTerminator);
    }

    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMCreateMemoryBufferWithMemoryRange(@NativeType("char const *") ByteBuffer InputData, @NativeType("char const *") ByteBuffer BufferName, @NativeType("LLVMBool") boolean RequiresNullTerminator) {
        if (CHECKS) {
            checkNT1(BufferName);
        }
        return nLLVMCreateMemoryBufferWithMemoryRange(memAddress(InputData), InputData.remaining(), memAddress(BufferName), RequiresNullTerminator ? 1 : 0);
    }

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

    public static long nLLVMCreateMemoryBufferWithMemoryRangeCopy(long InputData, long InputDataLength, long BufferName) {
        long __functionAddress = Functions.CreateMemoryBufferWithMemoryRangeCopy;
        return invokePPPP(__functionAddress, InputData, InputDataLength, BufferName);
    }

    @NativeType("LLVMMemoryBufferRef")
    public static long LLVMCreateMemoryBufferWithMemoryRangeCopy(@NativeType("char const *") ByteBuffer InputData, @NativeType("char const *") ByteBuffer BufferName) {
        if (CHECKS) {
            checkNT1(BufferName);
        }
        return nLLVMCreateMemoryBufferWithMemoryRangeCopy(memAddress(InputData), InputData.remaining(), memAddress(BufferName));
    }

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

    public static long nLLVMGetBufferStart(long MemBuf) {
        long __functionAddress = Functions.GetBufferStart;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePP(__functionAddress, MemBuf);
    }

    @Nullable
    @NativeType("char const *")
    public static String LLVMGetBufferStart(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __result = nLLVMGetBufferStart(MemBuf);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMGetBufferSize ] ---

    @NativeType("size_t")
    public static long LLVMGetBufferSize(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __functionAddress = Functions.GetBufferSize;
        if (CHECKS) {
            check(MemBuf);
        }
        return invokePP(__functionAddress, MemBuf);
    }

    // --- [ LLVMDisposeMemoryBuffer ] ---

    public static void LLVMDisposeMemoryBuffer(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __functionAddress = Functions.DisposeMemoryBuffer;
        if (CHECKS) {
            check(MemBuf);
        }
        invokePV(__functionAddress, MemBuf);
    }

    // --- [ LLVMGetGlobalPassRegistry ] ---

    /** Return the global pass registry, for use with initialization functions. */
    @NativeType("LLVMPassRegistryRef")
    public static long LLVMGetGlobalPassRegistry() {
        long __functionAddress = Functions.GetGlobalPassRegistry;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreatePassManager ] ---

    /** Constructs a new whole-module pass pipeline. This type of pipeline is suitable for link-time optimization and whole-module transformations. */
    @NativeType("LLVMPassManagerRef")
    public static long LLVMCreatePassManager() {
        long __functionAddress = Functions.CreatePassManager;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMCreateFunctionPassManagerForModule ] ---

    /**
     * Constructs a new function-by-function pass pipeline over the module provider. It does not take ownership of the module provider. This type of pipeline
     * is suitable for code generation and JIT compilation tasks.
     */
    @NativeType("LLVMPassManagerRef")
    public static long LLVMCreateFunctionPassManagerForModule(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.CreateFunctionPassManagerForModule;
        if (CHECKS) {
            check(M);
        }
        return invokePP(__functionAddress, M);
    }

    // --- [ LLVMCreateFunctionPassManager ] ---

    /** Deprecated: Use {@link #LLVMCreateFunctionPassManagerForModule CreateFunctionPassManagerForModule} instead. */
    @NativeType("LLVMPassManagerRef")
    public static long LLVMCreateFunctionPassManager(@NativeType("LLVMModuleProviderRef") long MP) {
        long __functionAddress = Functions.CreateFunctionPassManager;
        if (CHECKS) {
            check(MP);
        }
        return invokePP(__functionAddress, MP);
    }

    // --- [ LLVMRunPassManager ] ---

    /**
     * Initializes, executes on the provided module, and finalizes all of the passes scheduled in the pass manager. Returns 1 if any of the passes modified
     * the module, 0 otherwise.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMRunPassManager(@NativeType("LLVMPassManagerRef") long PM, @NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.RunPassManager;
        if (CHECKS) {
            check(PM);
            check(M);
        }
        return invokePPI(__functionAddress, PM, M) != 0;
    }

    // --- [ LLVMInitializeFunctionPassManager ] ---

    /** Initializes all of the function passes scheduled in the function pass manager. Returns 1 if any of the passes modified the module, 0 otherwise. */
    @NativeType("LLVMBool")
    public static boolean LLVMInitializeFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM) {
        long __functionAddress = Functions.InitializeFunctionPassManager;
        if (CHECKS) {
            check(FPM);
        }
        return invokePI(__functionAddress, FPM) != 0;
    }

    // --- [ LLVMRunFunctionPassManager ] ---

    /**
     * Executes all of the function passes scheduled in the function pass manager on the provided function. Returns 1 if any of the passes modified the
     * function, false otherwise.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMRunFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM, @NativeType("LLVMValueRef") long F) {
        long __functionAddress = Functions.RunFunctionPassManager;
        if (CHECKS) {
            check(FPM);
            check(F);
        }
        return invokePPI(__functionAddress, FPM, F) != 0;
    }

    // --- [ LLVMFinalizeFunctionPassManager ] ---

    /** Finalizes all of the function passes scheduled in the function pass manager. Returns 1 if any of the passes modified the module, 0 otherwise. */
    @NativeType("LLVMBool")
    public static boolean LLVMFinalizeFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM) {
        long __functionAddress = Functions.FinalizeFunctionPassManager;
        if (CHECKS) {
            check(FPM);
        }
        return invokePI(__functionAddress, FPM) != 0;
    }

    // --- [ LLVMDisposePassManager ] ---

    /** Frees the memory of a pass pipeline. For function pipelines, does not free the module provider. */
    public static void LLVMDisposePassManager(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.DisposePassManager;
        if (CHECKS) {
            check(PM);
        }
        invokePV(__functionAddress, PM);
    }

    // --- [ LLVMStartMultithreaded ] ---

    /**
     * Deprecated: Multi-threading can only be enabled/disabled with the compile time define {@code LLVM_ENABLE_THREADS}. This function always returns
     * {@link #LLVMIsMultithreaded IsMultithreaded}.
     */
    @NativeType("LLVMBool")
    public static boolean LLVMStartMultithreaded() {
        long __functionAddress = Functions.StartMultithreaded;
        return invokeI(__functionAddress) != 0;
    }

    // --- [ LLVMStopMultithreaded ] ---

    /** Deprecated: Multi-threading can only be enabled/disabled with the compile time define {@code LLVM_ENABLE_THREADS}. */
    public static void LLVMStopMultithreaded() {
        long __functionAddress = Functions.StopMultithreaded;
        invokeV(__functionAddress);
    }

    // --- [ LLVMIsMultithreaded ] ---

    /** Check whether LLVM is executing in thread-safe mode or not. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsMultithreaded() {
        long __functionAddress = Functions.IsMultithreaded;
        return invokeI(__functionAddress) != 0;
    }

}