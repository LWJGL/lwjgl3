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
     * <li>{@link #LLVMFNeg FNeg} - Standard Unary Operators</li>
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

    private static final SharedLibrary LLVM = Library.loadNative(LLVMCore.class, "org.lwjgl.llvm", Configuration.LLVM_LIBRARY_NAME, "libLLVM");

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
            ContextShouldDiscardValueNames             = LLVM.getFunctionAddress("LLVMContextShouldDiscardValueNames"),
            ContextSetDiscardValueNames                = LLVM.getFunctionAddress("LLVMContextSetDiscardValueNames"),
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
            GetSourceFileName                          = LLVM.getFunctionAddress("LLVMGetSourceFileName"),
            SetSourceFileName                          = LLVM.getFunctionAddress("LLVMSetSourceFileName"),
            GetDataLayoutStr                           = apiGetFunctionAddress(LLVM, "LLVMGetDataLayoutStr"),
            GetDataLayout                              = apiGetFunctionAddress(LLVM, "LLVMGetDataLayout"),
            SetDataLayout                              = apiGetFunctionAddress(LLVM, "LLVMSetDataLayout"),
            GetTarget                                  = apiGetFunctionAddress(LLVM, "LLVMGetTarget"),
            SetTarget                                  = apiGetFunctionAddress(LLVM, "LLVMSetTarget"),
            CopyModuleFlagsMetadata                    = LLVM.getFunctionAddress("LLVMCopyModuleFlagsMetadata"),
            DisposeModuleFlagsMetadata                 = LLVM.getFunctionAddress("LLVMDisposeModuleFlagsMetadata"),
            ModuleFlagEntriesGetFlagBehavior           = LLVM.getFunctionAddress("LLVMModuleFlagEntriesGetFlagBehavior"),
            ModuleFlagEntriesGetKey                    = LLVM.getFunctionAddress("LLVMModuleFlagEntriesGetKey"),
            ModuleFlagEntriesGetMetadata               = LLVM.getFunctionAddress("LLVMModuleFlagEntriesGetMetadata"),
            GetModuleFlag                              = LLVM.getFunctionAddress("LLVMGetModuleFlag"),
            AddModuleFlag                              = LLVM.getFunctionAddress("LLVMAddModuleFlag"),
            DumpModule                                 = apiGetFunctionAddress(LLVM, "LLVMDumpModule"),
            PrintModuleToFile                          = apiGetFunctionAddress(LLVM, "LLVMPrintModuleToFile"),
            PrintModuleToString                        = apiGetFunctionAddress(LLVM, "LLVMPrintModuleToString"),
            GetModuleInlineAsm                         = LLVM.getFunctionAddress("LLVMGetModuleInlineAsm"),
            SetModuleInlineAsm2                        = LLVM.getFunctionAddress("LLVMSetModuleInlineAsm2"),
            AppendModuleInlineAsm                      = LLVM.getFunctionAddress("LLVMAppendModuleInlineAsm"),
            GetInlineAsm                               = LLVM.getFunctionAddress("LLVMGetInlineAsm"),
            GetModuleContext                           = apiGetFunctionAddress(LLVM, "LLVMGetModuleContext"),
            GetTypeByName                              = apiGetFunctionAddress(LLVM, "LLVMGetTypeByName"),
            GetFirstNamedMetadata                      = LLVM.getFunctionAddress("LLVMGetFirstNamedMetadata"),
            GetLastNamedMetadata                       = LLVM.getFunctionAddress("LLVMGetLastNamedMetadata"),
            GetNextNamedMetadata                       = LLVM.getFunctionAddress("LLVMGetNextNamedMetadata"),
            GetPreviousNamedMetadata                   = LLVM.getFunctionAddress("LLVMGetPreviousNamedMetadata"),
            GetNamedMetadata                           = LLVM.getFunctionAddress("LLVMGetNamedMetadata"),
            GetOrInsertNamedMetadata                   = LLVM.getFunctionAddress("LLVMGetOrInsertNamedMetadata"),
            GetNamedMetadataName                       = LLVM.getFunctionAddress("LLVMGetNamedMetadataName"),
            GetNamedMetadataNumOperands                = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadataNumOperands"),
            GetNamedMetadataOperands                   = apiGetFunctionAddress(LLVM, "LLVMGetNamedMetadataOperands"),
            AddNamedMetadataOperand                    = apiGetFunctionAddress(LLVM, "LLVMAddNamedMetadataOperand"),
            GetDebugLocDirectory                       = LLVM.getFunctionAddress("LLVMGetDebugLocDirectory"),
            GetDebugLocFilename                        = LLVM.getFunctionAddress("LLVMGetDebugLocFilename"),
            GetDebugLocLine                            = LLVM.getFunctionAddress("LLVMGetDebugLocLine"),
            GetDebugLocColumn                          = LLVM.getFunctionAddress("LLVMGetDebugLocColumn"),
            AddFunction                                = apiGetFunctionAddress(LLVM, "LLVMAddFunction"),
            GetNamedFunction                           = apiGetFunctionAddress(LLVM, "LLVMGetNamedFunction"),
            GetFirstFunction                           = apiGetFunctionAddress(LLVM, "LLVMGetFirstFunction"),
            GetLastFunction                            = apiGetFunctionAddress(LLVM, "LLVMGetLastFunction"),
            GetNextFunction                            = apiGetFunctionAddress(LLVM, "LLVMGetNextFunction"),
            GetPreviousFunction                        = apiGetFunctionAddress(LLVM, "LLVMGetPreviousFunction"),
            SetModuleInlineAsm                         = LLVM.getFunctionAddress("LLVMSetModuleInlineAsm"),
            GetTypeKind                                = apiGetFunctionAddress(LLVM, "LLVMGetTypeKind"),
            TypeIsSized                                = apiGetFunctionAddress(LLVM, "LLVMTypeIsSized"),
            GetTypeContext                             = apiGetFunctionAddress(LLVM, "LLVMGetTypeContext"),
            DumpType                                   = LLVM.getFunctionAddress("LLVMDumpType"),
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
            IsLiteralStruct                            = LLVM.getFunctionAddress("LLVMIsLiteralStruct"),
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
            TokenTypeInContext                         = LLVM.getFunctionAddress("LLVMTokenTypeInContext"),
            MetadataTypeInContext                      = LLVM.getFunctionAddress("LLVMMetadataTypeInContext"),
            VoidType                                   = apiGetFunctionAddress(LLVM, "LLVMVoidType"),
            LabelType                                  = apiGetFunctionAddress(LLVM, "LLVMLabelType"),
            X86MMXType                                 = apiGetFunctionAddress(LLVM, "LLVMX86MMXType"),
            TypeOf                                     = apiGetFunctionAddress(LLVM, "LLVMTypeOf"),
            GetValueKind                               = apiGetFunctionAddress(LLVM, "LLVMGetValueKind"),
            GetValueName2                              = LLVM.getFunctionAddress("LLVMGetValueName2"),
            SetValueName2                              = LLVM.getFunctionAddress("LLVMSetValueName2"),
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
            IsAGlobalIFunc                             = LLVM.getFunctionAddress("LLVMIsAGlobalIFunc"),
            IsAGlobalObject                            = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalObject"),
            IsAFunction                                = apiGetFunctionAddress(LLVM, "LLVMIsAFunction"),
            IsAGlobalVariable                          = apiGetFunctionAddress(LLVM, "LLVMIsAGlobalVariable"),
            IsAUndefValue                              = apiGetFunctionAddress(LLVM, "LLVMIsAUndefValue"),
            IsAInstruction                             = apiGetFunctionAddress(LLVM, "LLVMIsAInstruction"),
            IsABinaryOperator                          = apiGetFunctionAddress(LLVM, "LLVMIsABinaryOperator"),
            IsACallInst                                = apiGetFunctionAddress(LLVM, "LLVMIsACallInst"),
            IsAIntrinsicInst                           = apiGetFunctionAddress(LLVM, "LLVMIsAIntrinsicInst"),
            IsADbgInfoIntrinsic                        = apiGetFunctionAddress(LLVM, "LLVMIsADbgInfoIntrinsic"),
            IsADbgVariableIntrinsic                    = LLVM.getFunctionAddress("LLVMIsADbgVariableIntrinsic"),
            IsADbgDeclareInst                          = apiGetFunctionAddress(LLVM, "LLVMIsADbgDeclareInst"),
            IsADbgLabelInst                            = LLVM.getFunctionAddress("LLVMIsADbgLabelInst"),
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
            ConstGEP2                                  = LLVM.getFunctionAddress("LLVMConstGEP2"),
            ConstInBoundsGEP                           = apiGetFunctionAddress(LLVM, "LLVMConstInBoundsGEP"),
            ConstInBoundsGEP2                          = LLVM.getFunctionAddress("LLVMConstInBoundsGEP2"),
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
            BlockAddress                               = LLVM.getFunctionAddress("LLVMBlockAddress"),
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
            GetUnnamedAddress                          = LLVM.getFunctionAddress("LLVMGetUnnamedAddress"),
            SetUnnamedAddress                          = LLVM.getFunctionAddress("LLVMSetUnnamedAddress"),
            GlobalGetValueType                         = LLVM.getFunctionAddress("LLVMGlobalGetValueType"),
            HasUnnamedAddr                             = apiGetFunctionAddress(LLVM, "LLVMHasUnnamedAddr"),
            SetUnnamedAddr                             = apiGetFunctionAddress(LLVM, "LLVMSetUnnamedAddr"),
            GetAlignment                               = apiGetFunctionAddress(LLVM, "LLVMGetAlignment"),
            SetAlignment                               = apiGetFunctionAddress(LLVM, "LLVMSetAlignment"),
            GlobalSetMetadata                          = LLVM.getFunctionAddress("LLVMGlobalSetMetadata"),
            GlobalEraseMetadata                        = LLVM.getFunctionAddress("LLVMGlobalEraseMetadata"),
            GlobalClearMetadata                        = LLVM.getFunctionAddress("LLVMGlobalClearMetadata"),
            GlobalCopyAllMetadata                      = LLVM.getFunctionAddress("LLVMGlobalCopyAllMetadata"),
            DisposeValueMetadataEntries                = LLVM.getFunctionAddress("LLVMDisposeValueMetadataEntries"),
            ValueMetadataEntriesGetKind                = LLVM.getFunctionAddress("LLVMValueMetadataEntriesGetKind"),
            ValueMetadataEntriesGetMetadata            = LLVM.getFunctionAddress("LLVMValueMetadataEntriesGetMetadata"),
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
            GetNamedGlobalAlias                        = LLVM.getFunctionAddress("LLVMGetNamedGlobalAlias"),
            GetFirstGlobalAlias                        = LLVM.getFunctionAddress("LLVMGetFirstGlobalAlias"),
            GetLastGlobalAlias                         = LLVM.getFunctionAddress("LLVMGetLastGlobalAlias"),
            GetNextGlobalAlias                         = LLVM.getFunctionAddress("LLVMGetNextGlobalAlias"),
            GetPreviousGlobalAlias                     = LLVM.getFunctionAddress("LLVMGetPreviousGlobalAlias"),
            AliasGetAliasee                            = LLVM.getFunctionAddress("LLVMAliasGetAliasee"),
            AliasSetAliasee                            = LLVM.getFunctionAddress("LLVMAliasSetAliasee"),
            DeleteFunction                             = apiGetFunctionAddress(LLVM, "LLVMDeleteFunction"),
            HasPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMHasPersonalityFn"),
            GetPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMGetPersonalityFn"),
            SetPersonalityFn                           = apiGetFunctionAddress(LLVM, "LLVMSetPersonalityFn"),
            GetIntrinsicID                             = apiGetFunctionAddress(LLVM, "LLVMGetIntrinsicID"),
            GetIntrinsicDeclaration                    = LLVM.getFunctionAddress("LLVMGetIntrinsicDeclaration"),
            IntrinsicGetType                           = LLVM.getFunctionAddress("LLVMIntrinsicGetType"),
            IntrinsicGetName                           = LLVM.getFunctionAddress("LLVMIntrinsicGetName"),
            IntrinsicCopyOverloadedName                = LLVM.getFunctionAddress("LLVMIntrinsicCopyOverloadedName"),
            IntrinsicIsOverloaded                      = LLVM.getFunctionAddress("LLVMIntrinsicIsOverloaded"),
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
            CreateBasicBlockInContext                  = LLVM.getFunctionAddress("LLVMCreateBasicBlockInContext"),
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
            InstructionGetAllMetadataOtherThanDebugLoc = LLVM.getFunctionAddress("LLVMInstructionGetAllMetadataOtherThanDebugLoc"),
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
            GetCalledFunctionType                      = LLVM.getFunctionAddress("LLVMGetCalledFunctionType"),
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
            BuildInvoke2                               = LLVM.getFunctionAddress("LLVMBuildInvoke2"),
            BuildUnreachable                           = apiGetFunctionAddress(LLVM, "LLVMBuildUnreachable"),
            BuildResume                                = apiGetFunctionAddress(LLVM, "LLVMBuildResume"),
            BuildLandingPad                            = apiGetFunctionAddress(LLVM, "LLVMBuildLandingPad"),
            BuildCleanupRet                            = LLVM.getFunctionAddress("LLVMBuildCleanupRet"),
            BuildCatchRet                              = LLVM.getFunctionAddress("LLVMBuildCatchRet"),
            BuildCatchPad                              = LLVM.getFunctionAddress("LLVMBuildCatchPad"),
            BuildCleanupPad                            = LLVM.getFunctionAddress("LLVMBuildCleanupPad"),
            BuildCatchSwitch                           = LLVM.getFunctionAddress("LLVMBuildCatchSwitch"),
            AddCase                                    = apiGetFunctionAddress(LLVM, "LLVMAddCase"),
            AddDestination                             = apiGetFunctionAddress(LLVM, "LLVMAddDestination"),
            GetNumClauses                              = apiGetFunctionAddress(LLVM, "LLVMGetNumClauses"),
            GetClause                                  = apiGetFunctionAddress(LLVM, "LLVMGetClause"),
            AddClause                                  = apiGetFunctionAddress(LLVM, "LLVMAddClause"),
            IsCleanup                                  = apiGetFunctionAddress(LLVM, "LLVMIsCleanup"),
            SetCleanup                                 = apiGetFunctionAddress(LLVM, "LLVMSetCleanup"),
            AddHandler                                 = LLVM.getFunctionAddress("LLVMAddHandler"),
            GetNumHandlers                             = LLVM.getFunctionAddress("LLVMGetNumHandlers"),
            GetHandlers                                = LLVM.getFunctionAddress("LLVMGetHandlers"),
            GetArgOperand                              = LLVM.getFunctionAddress("LLVMGetArgOperand"),
            SetArgOperand                              = LLVM.getFunctionAddress("LLVMSetArgOperand"),
            GetParentCatchSwitch                       = LLVM.getFunctionAddress("LLVMGetParentCatchSwitch"),
            SetParentCatchSwitch                       = LLVM.getFunctionAddress("LLVMSetParentCatchSwitch"),
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
            BuildMemSet                                = LLVM.getFunctionAddress("LLVMBuildMemSet"),
            BuildMemCpy                                = LLVM.getFunctionAddress("LLVMBuildMemCpy"),
            BuildMemMove                               = LLVM.getFunctionAddress("LLVMBuildMemMove"),
            BuildAlloca                                = apiGetFunctionAddress(LLVM, "LLVMBuildAlloca"),
            BuildArrayAlloca                           = apiGetFunctionAddress(LLVM, "LLVMBuildArrayAlloca"),
            BuildFree                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFree"),
            BuildLoad                                  = apiGetFunctionAddress(LLVM, "LLVMBuildLoad"),
            BuildLoad2                                 = LLVM.getFunctionAddress("LLVMBuildLoad2"),
            BuildStore                                 = apiGetFunctionAddress(LLVM, "LLVMBuildStore"),
            BuildGEP                                   = apiGetFunctionAddress(LLVM, "LLVMBuildGEP"),
            BuildInBoundsGEP                           = apiGetFunctionAddress(LLVM, "LLVMBuildInBoundsGEP"),
            BuildStructGEP                             = apiGetFunctionAddress(LLVM, "LLVMBuildStructGEP"),
            BuildGEP2                                  = LLVM.getFunctionAddress("LLVMBuildGEP2"),
            BuildInBoundsGEP2                          = LLVM.getFunctionAddress("LLVMBuildInBoundsGEP2"),
            BuildStructGEP2                            = LLVM.getFunctionAddress("LLVMBuildStructGEP2"),
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
            BuildPointerCast2                          = LLVM.getFunctionAddress("LLVMBuildPointerCast2"),
            BuildIntCast                               = apiGetFunctionAddress(LLVM, "LLVMBuildIntCast"),
            BuildFPCast                                = apiGetFunctionAddress(LLVM, "LLVMBuildFPCast"),
            BuildICmp                                  = apiGetFunctionAddress(LLVM, "LLVMBuildICmp"),
            BuildFCmp                                  = apiGetFunctionAddress(LLVM, "LLVMBuildFCmp"),
            BuildPhi                                   = apiGetFunctionAddress(LLVM, "LLVMBuildPhi"),
            BuildCall                                  = apiGetFunctionAddress(LLVM, "LLVMBuildCall"),
            BuildCall2                                 = LLVM.getFunctionAddress("LLVMBuildCall2"),
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
        invokePV(R, __functionAddress);
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
        return invokePP(Message, __functionAddress);
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
        invokePV(Message, __functionAddress);
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
        invokePPPV(C, Handler, DiagnosticContext, __functionAddress);
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
        return invokePP(C, __functionAddress);
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
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMContextSetYieldCallback ] ---

    /** Unsafe version of: {@link #LLVMContextSetYieldCallback ContextSetYieldCallback} */
    public static void nLLVMContextSetYieldCallback(long C, long Callback, long OpaqueHandle) {
        long __functionAddress = Functions.ContextSetYieldCallback;
        if (CHECKS) {
            check(C);
        }
        invokePPPV(C, Callback, OpaqueHandle, __functionAddress);
    }

    /** Set the yield callback function for this context. */
    public static void LLVMContextSetYieldCallback(@NativeType("LLVMContextRef") long C, @Nullable @NativeType("void (*) (LLVMContextRef, void *)") LLVMYieldCallbackI Callback, @NativeType("void *") long OpaqueHandle) {
        nLLVMContextSetYieldCallback(C, memAddressSafe(Callback), OpaqueHandle);
    }

    // --- [ LLVMContextShouldDiscardValueNames ] ---

    /**
     * Retrieve whether the given context is set to discard all value names.
     *
     * @since 8.0
     */
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

    /**
     * Set whether the given context discards all value names.
     * 
     * <p>If true, only the names of {@code GlobalValue} objects will be available in the IR. This can be used to save memory and runtime, especially in release
     * mode.</p>
     *
     * @since 8.0
     */
    public static void LLVMContextSetDiscardValueNames(@NativeType("LLVMContextRef") long C, @NativeType("LLVMBool") boolean Discard) {
        long __functionAddress = Functions.ContextSetDiscardValueNames;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        invokePV(C, Discard ? 1 : 0, __functionAddress);
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
        invokePV(C, __functionAddress);
    }

    // --- [ LLVMGetDiagInfoDescription ] ---

    /** Unsafe version of: {@link #LLVMGetDiagInfoDescription GetDiagInfoDescription} */
    public static long nLLVMGetDiagInfoDescription(long DI) {
        long __functionAddress = Functions.GetDiagInfoDescription;
        if (CHECKS) {
            check(DI);
        }
        return invokePP(DI, __functionAddress);
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
        return invokePI(DI, __functionAddress);
    }

    // --- [ LLVMGetMDKindIDInContext ] ---

    public static int nLLVMGetMDKindIDInContext(long C, long Name, int SLen) {
        long __functionAddress = Functions.GetMDKindIDInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPI(C, Name, SLen, __functionAddress);
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
        return invokePI(Name, SLen, __functionAddress);
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
        return invokePPI(Name, SLen, __functionAddress);
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
        return invokePJP(C, KindID, Val, __functionAddress);
    }

    // --- [ LLVMGetEnumAttributeKind ] ---

    /** Get the unique id corresponding to the enum attribute passed as argument. */
    @NativeType("unsigned int")
    public static int LLVMGetEnumAttributeKind(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.GetEnumAttributeKind;
        if (CHECKS) {
            check(A);
        }
        return invokePI(A, __functionAddress);
    }

    // --- [ LLVMGetEnumAttributeValue ] ---

    /** Get the enum attribute's value. 0 is returned if none exists. */
    @NativeType("uint64_t")
    public static long LLVMGetEnumAttributeValue(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.GetEnumAttributeValue;
        if (CHECKS) {
            check(A);
        }
        return invokePJ(A, __functionAddress);
    }

    // --- [ LLVMCreateStringAttribute ] ---

    /** Unsafe version of: {@link #LLVMCreateStringAttribute CreateStringAttribute} */
    public static long nLLVMCreateStringAttribute(long C, long K, int KLength, long V, int VLength) {
        long __functionAddress = Functions.CreateStringAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePPPP(C, K, KLength, V, VLength, __functionAddress);
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
        return invokePPP(A, Length, __functionAddress);
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
        return invokePPP(A, Length, __functionAddress);
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
        return invokePI(A, __functionAddress) != 0;
    }

    // --- [ LLVMIsStringAttribute ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsStringAttribute(@NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.IsStringAttribute;
        if (CHECKS) {
            check(A);
        }
        return invokePI(A, __functionAddress) != 0;
    }

    // --- [ LLVMModuleCreateWithName ] ---

    /** Unsafe version of: {@link #LLVMModuleCreateWithName ModuleCreateWithName} */
    public static long nLLVMModuleCreateWithName(long ModuleID) {
        long __functionAddress = Functions.ModuleCreateWithName;
        return invokePP(ModuleID, __functionAddress);
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
        return invokePPP(ModuleID, C, __functionAddress);
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
        return invokePP(M, __functionAddress);
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
        invokePV(M, __functionAddress);
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
        return invokePPP(M, Len, __functionAddress);
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
        invokePPPV(M, Ident, Len, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        return invokePPP(M, Len, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        invokePPPV(M, Name, Len, __functionAddress);
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
        return invokePP(M, __functionAddress);
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
        return invokePP(M, __functionAddress);
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
        invokePPV(M, DataLayoutStr, __functionAddress);
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
        return invokePP(M, __functionAddress);
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
        invokePPV(M, Triple, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        return invokePPP(M, Len, __functionAddress);
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
            check(__functionAddress);
            check(Entries);
        }
        invokePV(Entries, __functionAddress);
    }

    // --- [ LLVMModuleFlagEntriesGetFlagBehavior ] ---

    /** Returns the flag behavior for a module flag entry at a specific index. */
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

    /** Unsafe version of: {@link #LLVMModuleFlagEntriesGetKey ModuleFlagEntriesGetKey} */
    public static long nLLVMModuleFlagEntriesGetKey(long Entries, int Index, long Len) {
        long __functionAddress = Functions.ModuleFlagEntriesGetKey;
        if (CHECKS) {
            check(__functionAddress);
            check(Entries);
        }
        return invokePPP(Entries, Index, Len, __functionAddress);
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
            check(__functionAddress);
            check(Entries);
        }
        return invokePP(Entries, Index, __functionAddress);
    }

    // --- [ LLVMGetModuleFlag ] ---

    /** Unsafe version of: {@link #LLVMGetModuleFlag GetModuleFlag} */
    public static long nLLVMGetModuleFlag(long M, long Key, long KeyLen) {
        long __functionAddress = Functions.GetModuleFlag;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Key, KeyLen, __functionAddress);
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
            check(__functionAddress);
            check(M);
            check(Val);
        }
        invokePPPPV(M, Behavior, Key, KeyLen, Val, __functionAddress);
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
        invokePV(M, __functionAddress);
    }

    // --- [ LLVMPrintModuleToFile ] ---

    /** Unsafe version of: {@link #LLVMPrintModuleToFile PrintModuleToFile} */
    public static int nLLVMPrintModuleToFile(long M, long Filename, long ErrorMessage) {
        long __functionAddress = Functions.PrintModuleToFile;
        if (CHECKS) {
            check(M);
        }
        return invokePPPI(M, Filename, ErrorMessage, __functionAddress);
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
        return invokePP(M, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        return invokePPP(M, Len, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        invokePPPV(M, Asm, Len, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        invokePPPV(M, Asm, Len, __functionAddress);
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
            check(__functionAddress);
            check(Ty);
        }
        return invokePPPPPP(Ty, AsmString, AsmStringSize, Constraints, ConstraintsSize, HasSideEffects, IsAlignStack, Dialect, __functionAddress);
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
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetTypeByName ] ---

    /** Unsafe version of: {@link #LLVMGetTypeByName GetTypeByName} */
    public static long nLLVMGetTypeByName(long M, long Name) {
        long __functionAddress = Functions.GetTypeByName;
        if (CHECKS) {
            check(M);
        }
        return invokePPP(M, Name, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastNamedMetadata ] ---

    /** Obtain an iterator to the last {@code NamedMDNode} in a {@code Module}. */
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

    /**
     * Advance a {@code NamedMDNode} iterator to the next {@code NamedMDNode}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the end and there are no more named metadata nodes.</p>
     */
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

    /**
     * Decrement a {@code NamedMDNode} iterator to the previous {@code NamedMDNode}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the beginning and there are no previous named metadata nodes.</p>
     */
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

    /** Unsafe version of: {@link #LLVMGetNamedMetadata GetNamedMetadata} */
    public static long nLLVMGetNamedMetadata(long M, long Name, long NameLen) {
        long __functionAddress = Functions.GetNamedMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, NameLen, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, NameLen, __functionAddress);
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
            check(__functionAddress);
            check(NamedMD);
        }
        return invokePPP(NamedMD, NameLen, __functionAddress);
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
        return invokePPI(M, Name, __functionAddress);
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
        invokePPPV(M, Name, Dest, __functionAddress);
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
        invokePPPV(M, Name, Val, __functionAddress);
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
            check(__functionAddress);
            check(Val);
        }
        return invokePPP(Val, Length, __functionAddress);
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
            check(__functionAddress);
            check(Val);
        }
        return invokePPP(Val, Length, __functionAddress);
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
            check(__functionAddress);
            check(Val);
        }
        return invokePI(Val, __functionAddress);
    }

    // --- [ LLVMGetDebugLocColumn ] ---

    /** Return the column number of the debug location for this value, which must be an {@code llvm::Instruction}. */
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

    /** Unsafe version of: {@link #LLVMAddFunction AddFunction} */
    public static long nLLVMAddFunction(long M, long Name, long FunctionTy) {
        long __functionAddress = Functions.AddFunction;
        if (CHECKS) {
            check(M);
            check(FunctionTy);
        }
        return invokePPPP(M, Name, FunctionTy, __functionAddress);
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
        return invokePPP(M, Name, __functionAddress);
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
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastFunction ] ---

    /** Obtain an iterator to the last {@code Function} in a {@code Module}. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastFunction(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastFunction;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
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
        return invokePP(Fn, __functionAddress);
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
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMSetModuleInlineAsm ] ---

    /** Unsafe version of: {@link #LLVMSetModuleInlineAsm SetModuleInlineAsm} */
    public static void nLLVMSetModuleInlineAsm(long M, long Asm) {
        long __functionAddress = Functions.SetModuleInlineAsm;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
        }
        invokePPV(M, Asm, __functionAddress);
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
        return invokePI(Ty, __functionAddress);
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
        return invokePI(Ty, __functionAddress) != 0;
    }

    // --- [ LLVMGetTypeContext ] ---

    /** Obtain the context to which this type instance is associated. */
    @NativeType("LLVMContextRef")
    public static long LLVMGetTypeContext(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetTypeContext;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMDumpType ] ---

    /** Dump a representation of a type to {@code stderr}. */
    public static void LLVMDumpType(@NativeType("LLVMTypeRef") long Val) {
        long __functionAddress = Functions.DumpType;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        invokePV(Val, __functionAddress);
    }

    // --- [ LLVMPrintTypeToString ] ---

    /** Unsafe version of: {@link #LLVMPrintTypeToString PrintTypeToString} */
    public static long nLLVMPrintTypeToString(long Val) {
        long __functionAddress = Functions.PrintTypeToString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
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
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt8TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt8TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int8TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt16TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt16TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int16TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt32TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt32TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int32TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt64TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt64TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int64TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMInt128TypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMInt128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.Int128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMIntTypeInContext ] ---

    @NativeType("LLVMTypeRef")
    public static long LLVMIntTypeInContext(@NativeType("LLVMContextRef") long C, @NativeType("unsigned int") int NumBits) {
        long __functionAddress = Functions.IntTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, NumBits, __functionAddress);
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
        return invokeP(NumBits, __functionAddress);
    }

    // --- [ LLVMGetIntTypeWidth ] ---

    @NativeType("unsigned int")
    public static int LLVMGetIntTypeWidth(@NativeType("LLVMTypeRef") long IntegerTy) {
        long __functionAddress = Functions.GetIntTypeWidth;
        if (CHECKS) {
            check(IntegerTy);
        }
        return invokePI(IntegerTy, __functionAddress);
    }

    // --- [ LLVMHalfTypeInContext ] ---

    /** Obtain a 16-bit floating point type from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMHalfTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.HalfTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMFloatTypeInContext ] ---

    /** Obtain a 32-bit floating point type from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMFloatTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.FloatTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMDoubleTypeInContext ] ---

    /** Obtain a 64-bit floating point type from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMDoubleTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.DoubleTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMX86FP80TypeInContext ] ---

    /** Obtain a 80-bit floating point type (X87) from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86FP80TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.X86FP80TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMFP128TypeInContext ] ---

    /** Obtain a 128-bit floating point type (112-bit mantissa) from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMFP128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.FP128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMPPCFP128TypeInContext ] ---

    /** Obtain a 128-bit floating point type (two 64-bits) from a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMPPCFP128TypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.PPCFP128TypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
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
        return invokePPP(ReturnType, ParamTypes, ParamCount, IsVarArg, __functionAddress);
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
        return invokePI(FunctionTy, __functionAddress) != 0;
    }

    // --- [ LLVMGetReturnType ] ---

    /** Obtain the Type this function Type returns. */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetReturnType(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.GetReturnType;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePP(FunctionTy, __functionAddress);
    }

    // --- [ LLVMCountParamTypes ] ---

    /** Obtain the number of parameters this function accepts. */
    @NativeType("unsigned int")
    public static int LLVMCountParamTypes(@NativeType("LLVMTypeRef") long FunctionTy) {
        long __functionAddress = Functions.CountParamTypes;
        if (CHECKS) {
            check(FunctionTy);
        }
        return invokePI(FunctionTy, __functionAddress);
    }

    // --- [ LLVMGetParamTypes ] ---

    /** Unsafe version of: {@link #LLVMGetParamTypes GetParamTypes} */
    public static void nLLVMGetParamTypes(long FunctionTy, long Dest) {
        long __functionAddress = Functions.GetParamTypes;
        if (CHECKS) {
            check(FunctionTy);
        }
        invokePPV(FunctionTy, Dest, __functionAddress);
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
        return invokePPP(C, ElementTypes, ElementCount, Packed, __functionAddress);
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
        return invokePP(ElementTypes, ElementCount, Packed, __functionAddress);
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
        return invokePPP(C, Name, __functionAddress);
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
        return invokePP(Ty, __functionAddress);
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
        invokePPV(StructTy, ElementTypes, ElementCount, Packed, __functionAddress);
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
        return invokePI(StructTy, __functionAddress);
    }

    // --- [ LLVMGetStructElementTypes ] ---

    /** Unsafe version of: {@link #LLVMGetStructElementTypes GetStructElementTypes} */
    public static void nLLVMGetStructElementTypes(long StructTy, long Dest) {
        long __functionAddress = Functions.GetStructElementTypes;
        if (CHECKS) {
            check(StructTy);
        }
        invokePPV(StructTy, Dest, __functionAddress);
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
        return invokePP(StructTy, i, __functionAddress);
    }

    // --- [ LLVMIsPackedStruct ] ---

    /** Determine whether a structure is packed. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsPackedStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsPackedStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(StructTy, __functionAddress) != 0;
    }

    // --- [ LLVMIsOpaqueStruct ] ---

    /** Determine whether a structure is opaque. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsOpaqueStruct(@NativeType("LLVMTypeRef") long StructTy) {
        long __functionAddress = Functions.IsOpaqueStruct;
        if (CHECKS) {
            check(StructTy);
        }
        return invokePI(StructTy, __functionAddress) != 0;
    }

    // --- [ LLVMIsLiteralStruct ] ---

    /** Determine whether a structure is literal. */
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
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMGetSubtypes ] ---

    /** Unsafe version of: {@link #LLVMGetSubtypes GetSubtypes} */
    public static void nLLVMGetSubtypes(long Tp, long Arr) {
        long __functionAddress = Functions.GetSubtypes;
        if (CHECKS) {
            check(Tp);
        }
        invokePPV(Tp, Arr, __functionAddress);
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
        return invokePI(Tp, __functionAddress);
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
        return invokePP(ElementType, ElementCount, __functionAddress);
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
        return invokePI(ArrayTy, __functionAddress);
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
        return invokePP(ElementType, AddressSpace, __functionAddress);
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
        return invokePI(PointerTy, __functionAddress);
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
        return invokePP(ElementType, ElementCount, __functionAddress);
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
        return invokePI(VectorTy, __functionAddress);
    }

    // --- [ LLVMVoidTypeInContext ] ---

    /** Create a void type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMVoidTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.VoidTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMLabelTypeInContext ] ---

    /** Create a label type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMLabelTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.LabelTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMX86MMXTypeInContext ] ---

    /** Create a X86 MMX type in a context. */
    @NativeType("LLVMTypeRef")
    public static long LLVMX86MMXTypeInContext(@NativeType("LLVMContextRef") long C) {
        long __functionAddress = Functions.X86MMXTypeInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePP(C, __functionAddress);
    }

    // --- [ LLVMTokenTypeInContext ] ---

    /** Create a token type in a context. */
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

    /** Create a metadata type in a context. */
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
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetValueKind ] ---

    /** Obtain the enumerated type of a Value instance. */
    @NativeType("LLVMValueKind")
    public static int LLVMGetValueKind(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetValueKind;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress);
    }

    // --- [ LLVMGetValueName2 ] ---

    /** Unsafe version of: {@link #LLVMGetValueName2 GetValueName2} */
    public static long nLLVMGetValueName2(long Val, long Length) {
        long __functionAddress = Functions.GetValueName2;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePPP(Val, Length, __functionAddress);
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
            check(__functionAddress);
            check(Val);
        }
        invokePPPV(Val, Name, NameLen, __functionAddress);
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
        invokePV(Val, __functionAddress);
    }

    // --- [ LLVMPrintValueToString ] ---

    /** Unsafe version of: {@link #LLVMPrintValueToString PrintValueToString} */
    public static long nLLVMPrintValueToString(long Val) {
        long __functionAddress = Functions.PrintValueToString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
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
        invokePPV(OldVal, NewVal, __functionAddress);
    }

    // --- [ LLVMIsConstant ] ---

    /** Determine whether the specified value instance is constant. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsConstant(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsConstant;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMIsUndef ] ---

    /** Determine whether a value instance is undefined. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsUndef(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsUndef;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMIsAArgument ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAArgument(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAArgument;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABasicBlock ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInlineAsm ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInlineAsm(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInlineAsm;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUser ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUser(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUser;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstant ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstant(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstant;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABlockAddress ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABlockAddress(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABlockAddress;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantAggregateZero ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantAggregateZero(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantAggregateZero;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantArray ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantArray(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantArray;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantDataSequential ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataSequential(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataSequential;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantDataArray ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataArray(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataArray;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantDataVector ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantDataVector(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantDataVector;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantExpr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantExpr(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantExpr;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantFP ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantFP(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantFP;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantInt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantInt(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantInt;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantPointerNull ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantPointerNull(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantPointerNull;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantStruct ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantStruct(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantStruct;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantTokenNone ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantTokenNone(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantTokenNone;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAConstantVector ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAConstantVector(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAConstantVector;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalValue ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalValue;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalAlias ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalAlias(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalAlias;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalIFunc ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalIFunc(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalIFunc;
        if (CHECKS) {
            check(__functionAddress);
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalObject ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalObject(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalObject;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFunction ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFunction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFunction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGlobalVariable ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGlobalVariable(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGlobalVariable;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUndefValue ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUndefValue(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUndefValue;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInstruction ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInstruction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInstruction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABinaryOperator ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABinaryOperator(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABinaryOperator;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACallInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACallInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACallInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAIntrinsicInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAIntrinsicInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIntrinsicInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsADbgInfoIntrinsic ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgInfoIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgInfoIntrinsic;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsADbgVariableIntrinsic ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMIsADbgDeclareInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsADbgDeclareInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsADbgLabelInst ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemIntrinsic(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemIntrinsic;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMemCpyInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemCpyInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemCpyInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMemMoveInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemMoveInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemMoveInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMemSetInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMemSetInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMemSetInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACmpInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFCmpInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFCmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFCmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAICmpInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAICmpInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAICmpInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAExtractElementInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAExtractElementInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAExtractElementInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAGetElementPtrInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAGetElementPtrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAGetElementPtrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInsertElementInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInsertElementInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInsertElementInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInsertValueInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInsertValueInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInsertValueInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsALandingPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsALandingPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsALandingPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAPHINode ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAPHINode(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAPHINode;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASelectInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASelectInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASelectInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAShuffleVectorInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAShuffleVectorInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAShuffleVectorInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAStoreInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAStoreInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAStoreInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABranchInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABranchInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABranchInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAIndirectBrInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAIndirectBrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIndirectBrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAInvokeInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAInvokeInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAInvokeInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAReturnInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASwitchInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASwitchInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASwitchInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUnreachableInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUnreachableInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUnreachableInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAResumeInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAResumeInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAResumeInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACleanupReturnInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACleanupReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACleanupReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACatchReturnInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACatchReturnInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACatchReturnInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFuncletPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFuncletPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFuncletPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACatchPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACatchPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACatchPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACleanupPadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACleanupPadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACleanupPadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUnaryInstruction ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUnaryInstruction(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUnaryInstruction;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAAllocaInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAAllocaInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAllocaInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsACastInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsACastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsACastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAAddrSpaceCastInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAAddrSpaceCastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAAddrSpaceCastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsABitCastInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsABitCastInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsABitCastInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPExtInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPToSIInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPToSIInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPToSIInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPToUIInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPToUIInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPToUIInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAFPTruncInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAFPTruncInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAFPTruncInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAIntToPtrInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAIntToPtrInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAIntToPtrInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAPtrToIntInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAPtrToIntInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAPtrToIntInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASExtInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsASIToFPInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsASIToFPInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsASIToFPInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsATruncInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsATruncInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsATruncInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAUIToFPInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAUIToFPInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAUIToFPInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAZExtInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAZExtInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAZExtInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAExtractValueInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAExtractValueInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAExtractValueInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsALoadInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsALoadInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsALoadInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAVAArgInst ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAVAArgInst(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAVAArgInst;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMDNode ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMDNode(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMDNode;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMIsAMDString ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMIsAMDString(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsAMDString;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetValueName ] ---

    /** Unsafe version of: {@link #LLVMGetValueName GetValueName} */
    public static long nLLVMGetValueName(long Val) {
        long __functionAddress = Functions.GetValueName;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
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
        invokePPV(Val, Name, __functionAddress);
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
        return invokePP(Val, __functionAddress);
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
        return invokePP(U, __functionAddress);
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
        return invokePP(U, __functionAddress);
    }

    // --- [ LLVMGetUsedValue ] ---

    /** Obtain the value this use corresponds to. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUsedValue(@NativeType("LLVMUseRef") long U) {
        long __functionAddress = Functions.GetUsedValue;
        if (CHECKS) {
            check(U);
        }
        return invokePP(U, __functionAddress);
    }

    // --- [ LLVMGetOperand ] ---

    /** Obtain an operand at a specific index in a {@code llvm::User} value. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetOperand(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetOperand;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, Index, __functionAddress);
    }

    // --- [ LLVMGetOperandUse ] ---

    /** Obtain the use of an operand at a specific index in a {@code llvm::User} value. */
    @NativeType("LLVMUseRef")
    public static long LLVMGetOperandUse(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetOperandUse;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, Index, __functionAddress);
    }

    // --- [ LLVMSetOperand ] ---

    /** Set an operand at a specific index in a {@code llvm::User} value. */
    public static void LLVMSetOperand(@NativeType("LLVMValueRef") long User, @NativeType("unsigned int") int Index, @NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.SetOperand;
        if (CHECKS) {
            check(User);
            check(Val);
        }
        invokePPV(User, Index, Val, __functionAddress);
    }

    // --- [ LLVMGetNumOperands ] ---

    /** Obtain the number of operands in a {@code llvm::User} value. */
    public static int LLVMGetNumOperands(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.GetNumOperands;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress);
    }

    // --- [ LLVMConstNull ] ---

    /** Obtain a constant value referring to the null instance of a type. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstNull(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstNull;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
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
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMGetUndef ] ---

    /** Obtain a constant value referring to an undefined value of a type. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetUndef(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.GetUndef;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMIsNull ] ---

    /** Determine whether a value instance is null. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsNull(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.IsNull;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMConstPointerNull ] ---

    /** Obtain a constant that is a constant pointer pointing to NULL for a specified type. */
    @NativeType("LLVMValueRef")
    public static long LLVMConstPointerNull(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.ConstPointerNull;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
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
        return invokePJP(IntTy, N, SignExtend ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMConstIntOfArbitraryPrecision ] ---

    /** Unsafe version of: {@link #LLVMConstIntOfArbitraryPrecision ConstIntOfArbitraryPrecision} */
    public static long nLLVMConstIntOfArbitraryPrecision(long IntTy, int NumWords, long Words) {
        long __functionAddress = Functions.ConstIntOfArbitraryPrecision;
        if (CHECKS) {
            check(IntTy);
        }
        return invokePPP(IntTy, NumWords, Words, __functionAddress);
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
        return invokePPP(IntTy, Text, Radix, __functionAddress);
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
        return invokePPP(IntTy, Text, SLen, Radix, __functionAddress);
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
        return invokePP(RealTy, N, __functionAddress);
    }

    // --- [ LLVMConstRealOfString ] ---

    /** Unsafe version of: {@link #LLVMConstRealOfString ConstRealOfString} */
    public static long nLLVMConstRealOfString(long RealTy, long Text) {
        long __functionAddress = Functions.ConstRealOfString;
        if (CHECKS) {
            check(RealTy);
        }
        return invokePPP(RealTy, Text, __functionAddress);
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
        return invokePPP(RealTy, Text, SLen, __functionAddress);
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
        return invokePJ(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstIntGetSExtValue ] ---

    /** Obtain the sign extended value for an integer constant value. */
    @NativeType("long long")
    public static long LLVMConstIntGetSExtValue(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstIntGetSExtValue;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePJ(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstRealGetDouble ] ---

    /** Unsafe version of: {@link #LLVMConstRealGetDouble ConstRealGetDouble} */
    public static double nLLVMConstRealGetDouble(long ConstantVal, long losesInfo) {
        long __functionAddress = Functions.ConstRealGetDouble;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePPD(ConstantVal, losesInfo, __functionAddress);
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
        return invokePPP(C, Str, Length, DontNullTerminate, __functionAddress);
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
        return invokePP(Str, Length, DontNullTerminate, __functionAddress);
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
        return invokePI(c, __functionAddress) != 0;
    }

    // --- [ LLVMGetAsString ] ---

    /** Unsafe version of: {@link #LLVMGetAsString GetAsString} */
    public static long nLLVMGetAsString(long c, long Length) {
        long __functionAddress = Functions.GetAsString;
        if (CHECKS) {
            check(c);
        }
        return invokePPP(c, Length, __functionAddress);
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
        return invokePPP(C, ConstantVals, Count, Packed, __functionAddress);
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
        return invokePP(ConstantVals, Count, Packed, __functionAddress);
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
        return invokePPP(ElementTy, ConstantVals, Length, __functionAddress);
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
        return invokePPP(StructTy, ConstantVals, Count, __functionAddress);
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
        return invokePP(C, idx, __functionAddress);
    }

    // --- [ LLVMConstVector ] ---

    /** Unsafe version of: {@link #LLVMConstVector ConstVector} */
    public static long nLLVMConstVector(long ScalarConstantVals, int Size) {
        long __functionAddress = Functions.ConstVector;
        return invokePP(ScalarConstantVals, Size, __functionAddress);
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
        return invokePI(ConstantVal, __functionAddress);
    }

    // --- [ LLVMAlignOf ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMAlignOf(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.AlignOf;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMSizeOf ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMSizeOf(@NativeType("LLVMTypeRef") long Ty) {
        long __functionAddress = Functions.SizeOf;
        if (CHECKS) {
            check(Ty);
        }
        return invokePP(Ty, __functionAddress);
    }

    // --- [ LLVMConstNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstNSWNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNSWNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNSWNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstNUWNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNUWNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNUWNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstFNeg ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFNeg(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstFNeg;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstNot ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstNot(@NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.ConstNot;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePP(ConstantVal, __functionAddress);
    }

    // --- [ LLVMConstAdd ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMConstFAdd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFAdd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstSub ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMConstFSub(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFSub;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstMul ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMConstFMul(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFMul;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstUDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstUDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstUDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstExactUDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstExactUDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstExactUDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstSDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstExactSDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstExactSDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstExactSDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFDiv ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFDiv(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFDiv;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstURem ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstURem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstURem;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstSRem ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSRem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstSRem;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFRem ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFRem(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFRem;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstAnd ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstAnd(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAnd;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstOr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstOr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstOr;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstXor ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMConstICmp(@NativeType("LLVMIntPredicate") int Predicate, @NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstICmp;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(Predicate, LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstFCmp ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFCmp(@NativeType("LLVMRealPredicate") int Predicate, @NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstFCmp;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(Predicate, LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstShl ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstShl(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstShl;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstLShr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstLShr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstLShr;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstAShr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstAShr(@NativeType("LLVMValueRef") long LHSConstant, @NativeType("LLVMValueRef") long RHSConstant) {
        long __functionAddress = Functions.ConstAShr;
        if (CHECKS) {
            check(LHSConstant);
            check(RHSConstant);
        }
        return invokePPP(LHSConstant, RHSConstant, __functionAddress);
    }

    // --- [ LLVMConstGEP ] ---

    public static long nLLVMConstGEP(long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstGEP;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePPP(ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMConstGEP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstGEP(ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstGEP2 ] ---

    /** Unsafe version of: {@link #LLVMConstGEP2 ConstGEP2} */
    public static long nLLVMConstGEP2(long Ty, long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstGEP2;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
            check(ConstantVal);
        }
        return invokePPPP(Ty, ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMConstGEP2(@NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstGEP2(Ty, ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstInBoundsGEP ] ---

    public static long nLLVMConstInBoundsGEP(long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstInBoundsGEP;
        if (CHECKS) {
            check(ConstantVal);
        }
        return invokePPP(ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    @NativeType("LLVMValueRef")
    public static long LLVMConstInBoundsGEP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstInBoundsGEP(ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstInBoundsGEP2 ] ---

    /** Unsafe version of: {@link #LLVMConstInBoundsGEP2 ConstInBoundsGEP2} */
    public static long nLLVMConstInBoundsGEP2(long Ty, long ConstantVal, long ConstantIndices, int NumIndices) {
        long __functionAddress = Functions.ConstInBoundsGEP2;
        if (CHECKS) {
            check(__functionAddress);
            check(Ty);
            check(ConstantVal);
        }
        return invokePPPP(Ty, ConstantVal, ConstantIndices, NumIndices, __functionAddress);
    }

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMConstInBoundsGEP2(@NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMValueRef *") PointerBuffer ConstantIndices) {
        return nLLVMConstInBoundsGEP2(Ty, ConstantVal, memAddress(ConstantIndices), ConstantIndices.remaining());
    }

    // --- [ LLVMConstTrunc ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMConstSExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSExt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstZExt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstZExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstZExt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPTrunc ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPTrunc(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPTrunc;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPExt ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPExt(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPExt;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstUIToFP ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstUIToFP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstUIToFP;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstSIToFP ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSIToFP(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSIToFP;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPToUI ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPToUI(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPToUI;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstFPToSI ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPToSI(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPToSI;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstPtrToInt ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMConstZExtOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstZExtOrBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstSExtOrBitCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstSExtOrBitCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstSExtOrBitCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
    }

    // --- [ LLVMConstTruncOrBitCast ] ---

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

    @NativeType("LLVMValueRef")
    public static long LLVMConstIntCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType, @NativeType("LLVMBool") boolean isSigned) {
        long __functionAddress = Functions.ConstIntCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, isSigned ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMConstFPCast ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMConstFPCast(@NativeType("LLVMValueRef") long ConstantVal, @NativeType("LLVMTypeRef") long ToType) {
        long __functionAddress = Functions.ConstFPCast;
        if (CHECKS) {
            check(ConstantVal);
            check(ToType);
        }
        return invokePPP(ConstantVal, ToType, __functionAddress);
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
        return invokePPPP(ConstantCondition, ConstantIfTrue, ConstantIfFalse, __functionAddress);
    }

    // --- [ LLVMConstExtractElement ] ---

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

    public static long nLLVMConstExtractValue(long AggConstant, long IdxList, int NumIdx) {
        long __functionAddress = Functions.ConstExtractValue;
        if (CHECKS) {
            check(AggConstant);
        }
        return invokePPP(AggConstant, IdxList, NumIdx, __functionAddress);
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
        return invokePPPP(AggConstant, ElementValueConstant, IdxList, NumIdx, __functionAddress);
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
            check(__functionAddress);
            check(F);
            check(BB);
        }
        return invokePPP(F, BB, __functionAddress);
    }

    // --- [ LLVMConstInlineAsm ] ---

    /** Unsafe version of: {@link #LLVMConstInlineAsm ConstInlineAsm} */
    public static long nLLVMConstInlineAsm(long Ty, long AsmString, long Constraints, int HasSideEffects, int IsAlignStack) {
        long __functionAddress = Functions.ConstInlineAsm;
        if (CHECKS) {
            check(Ty);
        }
        return invokePPPP(Ty, AsmString, Constraints, HasSideEffects, IsAlignStack, __functionAddress);
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
        return invokePP(Global, __functionAddress);
    }

    // --- [ LLVMIsDeclaration ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsDeclaration(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.IsDeclaration;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress) != 0;
    }

    // --- [ LLVMGetLinkage ] ---

    @NativeType("LLVMLinkage")
    public static int LLVMGetLinkage(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetLinkage;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress);
    }

    // --- [ LLVMSetLinkage ] ---

    public static void LLVMSetLinkage(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMLinkage") int Linkage) {
        long __functionAddress = Functions.SetLinkage;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, Linkage, __functionAddress);
    }

    // --- [ LLVMGetSection ] ---

    public static long nLLVMGetSection(long Global) {
        long __functionAddress = Functions.GetSection;
        if (CHECKS) {
            check(Global);
        }
        return invokePP(Global, __functionAddress);
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
        invokePPV(Global, Section, __functionAddress);
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
        return invokePI(Global, __functionAddress);
    }

    // --- [ LLVMSetVisibility ] ---

    public static void LLVMSetVisibility(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMVisibility") int Viz) {
        long __functionAddress = Functions.SetVisibility;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, Viz, __functionAddress);
    }

    // --- [ LLVMGetDLLStorageClass ] ---

    @NativeType("LLVMDLLStorageClass")
    public static int LLVMGetDLLStorageClass(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GetDLLStorageClass;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress);
    }

    // --- [ LLVMSetDLLStorageClass ] ---

    public static void LLVMSetDLLStorageClass(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMDLLStorageClass") int Class) {
        long __functionAddress = Functions.SetDLLStorageClass;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, Class, __functionAddress);
    }

    // --- [ LLVMGetUnnamedAddress ] ---

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

    public static void LLVMSetUnnamedAddress(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMUnnamedAddr") int UnnamedAddr) {
        long __functionAddress = Functions.SetUnnamedAddress;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        invokePV(Global, UnnamedAddr, __functionAddress);
    }

    // --- [ LLVMGlobalGetValueType ] ---

    /** Returns the "value type" of a global value.  This differs from the formal type of a global value which is always a pointer type. */
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

    /** Deprecated: Use {@link #LLVMGetUnnamedAddress GetUnnamedAddress} instead. */
    @NativeType("LLVMBool")
    public static boolean LLVMHasUnnamedAddr(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.HasUnnamedAddr;
        if (CHECKS) {
            check(Global);
        }
        return invokePI(Global, __functionAddress) != 0;
    }

    // --- [ LLVMSetUnnamedAddr ] ---

    /** Deprecated: Use {@link #LLVMSetUnnamedAddress SetUnnamedAddress} instead. */
    public static void LLVMSetUnnamedAddr(@NativeType("LLVMValueRef") long Global, @NativeType("LLVMBool") boolean HasUnnamedAddr) {
        long __functionAddress = Functions.SetUnnamedAddr;
        if (CHECKS) {
            check(Global);
        }
        invokePV(Global, HasUnnamedAddr ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetAlignment ] ---

    /** Obtain the preferred alignment of the value. */
    @NativeType("unsigned int")
    public static int LLVMGetAlignment(@NativeType("LLVMValueRef") long V) {
        long __functionAddress = Functions.GetAlignment;
        if (CHECKS) {
            check(V);
        }
        return invokePI(V, __functionAddress);
    }

    // --- [ LLVMSetAlignment ] ---

    /** Set the preferred alignment of the value. */
    public static void LLVMSetAlignment(@NativeType("LLVMValueRef") long V, @NativeType("unsigned int") int Bytes) {
        long __functionAddress = Functions.SetAlignment;
        if (CHECKS) {
            check(V);
        }
        invokePV(V, Bytes, __functionAddress);
    }

    // --- [ LLVMGlobalSetMetadata ] ---

    /** Sets a metadata attachment, erasing the existing metadata attachment if it already exists for the given kind. */
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

    /** Erases a metadata attachment of the given kind if it exists. */
    public static void LLVMGlobalEraseMetadata(@NativeType("LLVMValueRef") long Global, @NativeType("unsigned int") int Kind) {
        long __functionAddress = Functions.GlobalEraseMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        invokePV(Global, Kind, __functionAddress);
    }

    // --- [ LLVMGlobalClearMetadata ] ---

    /** Removes all metadata attachments from this value. */
    public static void LLVMGlobalClearMetadata(@NativeType("LLVMValueRef") long Global) {
        long __functionAddress = Functions.GlobalClearMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Global);
        }
        invokePV(Global, __functionAddress);
    }

    // --- [ LLVMGlobalCopyAllMetadata ] ---

    /** Unsafe version of: {@link #LLVMGlobalCopyAllMetadata GlobalCopyAllMetadata} */
    public static long nLLVMGlobalCopyAllMetadata(long Value, long NumEntries) {
        long __functionAddress = Functions.GlobalCopyAllMetadata;
        if (CHECKS) {
            check(__functionAddress);
            check(Value);
        }
        return invokePPP(Value, NumEntries, __functionAddress);
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
            check(__functionAddress);
            check(Entries);
        }
        invokePV(Entries, __functionAddress);
    }

    // --- [ LLVMValueMetadataEntriesGetKind ] ---

    /** Returns the kind of a value metadata entry at a specific index. */
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

    /** Returns the underlying metadata node of a value metadata entry at a specific index. */
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

    public static long nLLVMAddGlobal(long M, long Ty, long Name) {
        long __functionAddress = Functions.AddGlobal;
        if (CHECKS) {
            check(M);
            check(Ty);
        }
        return invokePPPP(M, Ty, Name, __functionAddress);
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
        return invokePPPP(M, Ty, Name, AddressSpace, __functionAddress);
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
        return invokePPP(M, Name, __functionAddress);
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
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastGlobal ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetLastGlobal(@NativeType("LLVMModuleRef") long M) {
        long __functionAddress = Functions.GetLastGlobal;
        if (CHECKS) {
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetNextGlobal ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetNextGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetNextGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(GlobalVar, __functionAddress);
    }

    // --- [ LLVMGetPreviousGlobal ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetPreviousGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetPreviousGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(GlobalVar, __functionAddress);
    }

    // --- [ LLVMDeleteGlobal ] ---

    public static void LLVMDeleteGlobal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.DeleteGlobal;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, __functionAddress);
    }

    // --- [ LLVMGetInitializer ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetInitializer(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetInitializer;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePP(GlobalVar, __functionAddress);
    }

    // --- [ LLVMSetInitializer ] ---

    public static void LLVMSetInitializer(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMValueRef") long ConstantVal) {
        long __functionAddress = Functions.SetInitializer;
        if (CHECKS) {
            check(GlobalVar);
            check(ConstantVal);
        }
        invokePPV(GlobalVar, ConstantVal, __functionAddress);
    }

    // --- [ LLVMIsThreadLocal ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsThreadLocal(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsThreadLocal;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress) != 0;
    }

    // --- [ LLVMSetThreadLocal ] ---

    public static void LLVMSetThreadLocal(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsThreadLocal) {
        long __functionAddress = Functions.SetThreadLocal;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, IsThreadLocal ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMIsGlobalConstant ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsGlobalConstant(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsGlobalConstant;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress) != 0;
    }

    // --- [ LLVMSetGlobalConstant ] ---

    public static void LLVMSetGlobalConstant(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsConstant) {
        long __functionAddress = Functions.SetGlobalConstant;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, IsConstant ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetThreadLocalMode ] ---

    @NativeType("LLVMThreadLocalMode")
    public static int LLVMGetThreadLocalMode(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.GetThreadLocalMode;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress);
    }

    // --- [ LLVMSetThreadLocalMode ] ---

    public static void LLVMSetThreadLocalMode(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMThreadLocalMode") int Mode) {
        long __functionAddress = Functions.SetThreadLocalMode;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, Mode, __functionAddress);
    }

    // --- [ LLVMIsExternallyInitialized ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsExternallyInitialized(@NativeType("LLVMValueRef") long GlobalVar) {
        long __functionAddress = Functions.IsExternallyInitialized;
        if (CHECKS) {
            check(GlobalVar);
        }
        return invokePI(GlobalVar, __functionAddress) != 0;
    }

    // --- [ LLVMSetExternallyInitialized ] ---

    public static void LLVMSetExternallyInitialized(@NativeType("LLVMValueRef") long GlobalVar, @NativeType("LLVMBool") boolean IsExtInit) {
        long __functionAddress = Functions.SetExternallyInitialized;
        if (CHECKS) {
            check(GlobalVar);
        }
        invokePV(GlobalVar, IsExtInit ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMAddAlias ] ---

    public static long nLLVMAddAlias(long M, long Ty, long Aliasee, long Name) {
        long __functionAddress = Functions.AddAlias;
        if (CHECKS) {
            check(M);
            check(Ty);
            check(Aliasee);
        }
        return invokePPPPP(M, Ty, Aliasee, Name, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        return invokePPPP(M, Name, NameLen, __functionAddress);
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
            check(__functionAddress);
            check(M);
        }
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMGetLastGlobalAlias ] ---

    /** Obtain an iterator to the last GlobalAlias in a Module. */
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

    /**
     * Advance a {@code GlobalAlias} iterator to the next {@code GlobalAlias}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the end and there are no more global aliases.</p>
     */
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

    /**
     * Decrement a {@code GlobalAlias} iterator to the previous {@code GlobalAlias}.
     * 
     * <p>Returns {@code NULL} if the iterator was already at the beginning and there are no previous global aliases.</p>
     */
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

    /** Retrieve the target value of an alias. */
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

    /** Set the target value of an alias. */
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

    /** Remove a function from its containing module and deletes it. */
    public static void LLVMDeleteFunction(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.DeleteFunction;
        if (CHECKS) {
            check(Fn);
        }
        invokePV(Fn, __functionAddress);
    }

    // --- [ LLVMHasPersonalityFn ] ---

    /** Check whether the given function has a personality function. */
    @NativeType("LLVMBool")
    public static boolean LLVMHasPersonalityFn(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.HasPersonalityFn;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, __functionAddress) != 0;
    }

    // --- [ LLVMGetPersonalityFn ] ---

    /** Obtain the personality function attached to the function. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetPersonalityFn(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetPersonalityFn;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMSetPersonalityFn ] ---

    /** Set the personality function attached to the function. */
    public static void LLVMSetPersonalityFn(@NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef") long PersonalityFn) {
        long __functionAddress = Functions.SetPersonalityFn;
        if (CHECKS) {
            check(Fn);
            check(PersonalityFn);
        }
        invokePPV(Fn, PersonalityFn, __functionAddress);
    }

    // --- [ LLVMGetIntrinsicID ] ---

    /** Obtain the ID number from a function instance. */
    @NativeType("unsigned int")
    public static int LLVMGetIntrinsicID(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetIntrinsicID;
        if (CHECKS) {
            check(Fn);
        }
        return invokePI(Fn, __functionAddress);
    }

    // --- [ LLVMGetIntrinsicDeclaration ] ---

    /** Unsafe version of: {@link #LLVMGetIntrinsicDeclaration GetIntrinsicDeclaration} */
    public static long nLLVMGetIntrinsicDeclaration(long Mod, int ID, long ParamTypes, long ParamCount) {
        long __functionAddress = Functions.GetIntrinsicDeclaration;
        if (CHECKS) {
            check(__functionAddress);
            check(Mod);
        }
        return invokePPPP(Mod, ID, ParamTypes, ParamCount, __functionAddress);
    }

    /**
     * Create or insert the declaration of an intrinsic.
     * 
     * <p>For overloaded intrinsics, parameter types must be provided to uniquely identify an overload.</p>
     *
     * @since 8.0
     */
    @NativeType("LLVMValueRef")
    public static long LLVMGetIntrinsicDeclaration(@NativeType("LLVMModuleRef") long Mod, @NativeType("unsigned") int ID, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes) {
        return nLLVMGetIntrinsicDeclaration(Mod, ID, memAddress(ParamTypes), ParamTypes.remaining());
    }

    // --- [ LLVMIntrinsicGetType ] ---

    /** Unsafe version of: {@link #LLVMIntrinsicGetType IntrinsicGetType} */
    public static long nLLVMIntrinsicGetType(long Ctx, int ID, long ParamTypes, long ParamCount) {
        long __functionAddress = Functions.IntrinsicGetType;
        if (CHECKS) {
            check(__functionAddress);
            check(Ctx);
        }
        return invokePPPP(Ctx, ID, ParamTypes, ParamCount, __functionAddress);
    }

    /**
     * Retrieves the type of an intrinsic.
     * 
     * <p>For overloaded intrinsics, parameter types must be provided to uniquely identify an overload.</p>
     *
     * @since 8.0
     */
    @NativeType("LLVMValueRef")
    public static long LLVMIntrinsicGetType(@NativeType("LLVMContextRef") long Ctx, @NativeType("unsigned") int ID, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes) {
        return nLLVMIntrinsicGetType(Ctx, ID, memAddress(ParamTypes), ParamTypes.remaining());
    }

    // --- [ LLVMIntrinsicGetName ] ---

    /** Unsafe version of: {@link #LLVMIntrinsicGetName IntrinsicGetName} */
    public static long nLLVMIntrinsicGetName(int ID, long NameLength) {
        long __functionAddress = Functions.IntrinsicGetName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePP(ID, NameLength, __functionAddress);
    }

    /**
     * Retrieves the name of an intrinsic.
     *
     * @since 8.0
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMIntrinsicGetName(@NativeType("unsigned") int ID) {
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

    /** Unsafe version of: {@link #LLVMIntrinsicCopyOverloadedName IntrinsicCopyOverloadedName} */
    public static long nLLVMIntrinsicCopyOverloadedName(int ID, long ParamTypes, long ParamCount, long NameLength) {
        long __functionAddress = Functions.IntrinsicCopyOverloadedName;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokePPPP(ID, ParamTypes, ParamCount, NameLength, __functionAddress);
    }

    /**
     * Copies the name of an overloaded intrinsic identified by a given list of parameter types.
     * 
     * <p>Unlike {@link #LLVMIntrinsicGetName IntrinsicGetName}, the caller is responsible for freeing the returned string.</p>
     *
     * @since 8.0
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMIntrinsicCopyOverloadedName(@NativeType("unsigned") int ID, @NativeType("LLVMTypeRef *") PointerBuffer ParamTypes) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer NameLength = stack.callocPointer(1);
            long __result = nLLVMIntrinsicCopyOverloadedName(ID, memAddress(ParamTypes), ParamTypes.remaining(), memAddress(NameLength));
            return memUTF8Safe(__result, (int)NameLength.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMIntrinsicIsOverloaded ] ---

    /**
     * Obtain if the intrinsic identified by the given ID is overloaded.
     *
     * @since 8.0
     */
    @NativeType("LLVMBool")
    public static boolean LLVMIntrinsicIsOverloaded(@NativeType("unsigned") int ID) {
        long __functionAddress = Functions.IntrinsicIsOverloaded;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeI(ID, __functionAddress) != 0;
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
        return invokePI(Fn, __functionAddress);
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
        invokePV(Fn, CC, __functionAddress);
    }

    // --- [ LLVMGetGC ] ---

    /** Unsafe version of: {@link #LLVMGetGC GetGC} */
    public static long nLLVMGetGC(long Fn) {
        long __functionAddress = Functions.GetGC;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
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
        invokePPV(Fn, Name, __functionAddress);
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
        invokePPV(F, Idx, A, __functionAddress);
    }

    // --- [ LLVMGetAttributeCountAtIndex ] ---

    @NativeType("unsigned int")
    public static int LLVMGetAttributeCountAtIndex(@NativeType("LLVMValueRef") long F, @NativeType("LLVMAttributeIndex") int Idx) {
        long __functionAddress = Functions.GetAttributeCountAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePI(F, Idx, __functionAddress);
    }

    // --- [ LLVMGetAttributesAtIndex ] ---

    public static void nLLVMGetAttributesAtIndex(long F, int Idx, long Attrs) {
        long __functionAddress = Functions.GetAttributesAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePPV(F, Idx, Attrs, __functionAddress);
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
        return invokePP(F, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMGetStringAttributeAtIndex ] ---

    public static long nLLVMGetStringAttributeAtIndex(long F, int Idx, long K, int KLen) {
        long __functionAddress = Functions.GetStringAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        return invokePPP(F, Idx, K, KLen, __functionAddress);
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
        invokePV(F, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMRemoveStringAttributeAtIndex ] ---

    public static void nLLVMRemoveStringAttributeAtIndex(long F, int Idx, long K, int KLen) {
        long __functionAddress = Functions.RemoveStringAttributeAtIndex;
        if (CHECKS) {
            check(F);
        }
        invokePPV(F, Idx, K, KLen, __functionAddress);
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
        invokePPPV(Fn, A, V, __functionAddress);
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
        return invokePI(Fn, __functionAddress);
    }

    // --- [ LLVMGetParams ] ---

    /** Unsafe version of: {@link #LLVMGetParams GetParams} */
    public static void nLLVMGetParams(long Fn, long Params) {
        long __functionAddress = Functions.GetParams;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(Fn, Params, __functionAddress);
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
        return invokePP(Fn, Index, __functionAddress);
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
        return invokePP(Inst, __functionAddress);
    }

    // --- [ LLVMGetFirstParam ] ---

    /** Obtain the first parameter to a function. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetFirstParam(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetFirstParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetLastParam ] ---

    /** Obtain the last parameter to a function. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetLastParam(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetLastParam;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
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
        return invokePP(Arg, __functionAddress);
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
        return invokePP(Arg, __functionAddress);
    }

    // --- [ LLVMSetParamAlignment ] ---

    /** Set the alignment for a function parameter. */
    public static void LLVMSetParamAlignment(@NativeType("LLVMValueRef") long Arg, @NativeType("unsigned int") int Align) {
        long __functionAddress = Functions.SetParamAlignment;
        if (CHECKS) {
            check(Arg);
        }
        invokePV(Arg, Align, __functionAddress);
    }

    // --- [ LLVMMDStringInContext ] ---

    /** Unsafe version of: {@link #LLVMMDStringInContext MDStringInContext} */
    public static long nLLVMMDStringInContext(long C, long Str, int SLen) {
        long __functionAddress = Functions.MDStringInContext;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, Str, SLen, __functionAddress);
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
        return invokePP(Str, SLen, __functionAddress);
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
        return invokePPP(C, Vals, Count, __functionAddress);
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
        return invokePP(Vals, Count, __functionAddress);
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
        return invokePPP(C, MD, __functionAddress);
    }

    // --- [ LLVMValueAsMetadata ] ---

    /** Obtain a {@code Value} as a {@code Metadata}. */
    @NativeType("LLVMMetadataRef")
    public static long LLVMValueAsMetadata(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueAsMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
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
        return invokePPP(V, Length, __functionAddress);
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
        return invokePI(V, __functionAddress);
    }

    // --- [ LLVMGetMDNodeOperands ] ---

    /** Unsafe version of: {@link #LLVMGetMDNodeOperands GetMDNodeOperands} */
    public static void nLLVMGetMDNodeOperands(long V, long Dest) {
        long __functionAddress = Functions.GetMDNodeOperands;
        if (CHECKS) {
            check(V);
        }
        invokePPV(V, Dest, __functionAddress);
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
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMValueIsBasicBlock ] ---

    /** Determine whether an {@code LLVMValueRef} is itself a basic block. */
    @NativeType("LLVMBool")
    public static boolean LLVMValueIsBasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueIsBasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMValueAsBasicBlock ] ---

    /** Convert an {@code LLVMValueRef} to an {@code LLVMBasicBlockRef} instance. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMValueAsBasicBlock(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.ValueAsBasicBlock;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, __functionAddress);
    }

    // --- [ LLVMGetBasicBlockName ] ---

    /** Unsafe version of: {@link #LLVMGetBasicBlockName GetBasicBlockName} */
    public static long nLLVMGetBasicBlockName(long BB) {
        long __functionAddress = Functions.GetBasicBlockName;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
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
        return invokePP(BB, __functionAddress);
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
        return invokePP(BB, __functionAddress);
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
        return invokePI(Fn, __functionAddress);
    }

    // --- [ LLVMGetBasicBlocks ] ---

    /** Unsafe version of: {@link #LLVMGetBasicBlocks GetBasicBlocks} */
    public static void nLLVMGetBasicBlocks(long Fn, long BasicBlocks) {
        long __functionAddress = Functions.GetBasicBlocks;
        if (CHECKS) {
            check(Fn);
        }
        invokePPV(Fn, BasicBlocks, __functionAddress);
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
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetLastBasicBlock ] ---

    /** Obtain the last basic block in a function. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetLastBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetLastBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMGetNextBasicBlock ] ---

    /** Advance a basic block iterator. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetNextBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetNextBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMGetPreviousBasicBlock ] ---

    /** Go backwards in a basic block iterator. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetPreviousBasicBlock(@NativeType("LLVMBasicBlockRef") long BB) {
        long __functionAddress = Functions.GetPreviousBasicBlock;
        if (CHECKS) {
            check(BB);
        }
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMGetEntryBasicBlock ] ---

    /** Obtain the basic block that corresponds to the entry point of a function. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetEntryBasicBlock(@NativeType("LLVMValueRef") long Fn) {
        long __functionAddress = Functions.GetEntryBasicBlock;
        if (CHECKS) {
            check(Fn);
        }
        return invokePP(Fn, __functionAddress);
    }

    // --- [ LLVMCreateBasicBlockInContext ] ---

    /** Unsafe version of: {@link #LLVMCreateBasicBlockInContext CreateBasicBlockInContext} */
    public static long nLLVMCreateBasicBlockInContext(long C, long Name) {
        long __functionAddress = Functions.CreateBasicBlockInContext;
        if (CHECKS) {
            check(__functionAddress);
            check(C);
        }
        return invokePPP(C, Name, __functionAddress);
    }

    /**
     * Create a new basic block without inserting it into a function.
     *
     * @since 8.0
     */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMCreateBasicBlockInContext(@NativeType("LLVMContextRef") long C, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMCreateBasicBlockInContext(C, memAddress(Name));
    }

    /**
     * Create a new basic block without inserting it into a function.
     *
     * @since 8.0
     */
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

    /** Unsafe version of: {@link #LLVMAppendBasicBlockInContext AppendBasicBlockInContext} */
    public static long nLLVMAppendBasicBlockInContext(long C, long Fn, long Name) {
        long __functionAddress = Functions.AppendBasicBlockInContext;
        if (CHECKS) {
            check(C);
            check(Fn);
        }
        return invokePPPP(C, Fn, Name, __functionAddress);
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
        return invokePPP(Fn, Name, __functionAddress);
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
        return invokePPPP(C, BB, Name, __functionAddress);
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
        return invokePPP(InsertBeforeBB, Name, __functionAddress);
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
        invokePV(BB, __functionAddress);
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
        invokePV(BB, __functionAddress);
    }

    // --- [ LLVMMoveBasicBlockBefore ] ---

    /** Move a basic block to before another one. */
    public static void LLVMMoveBasicBlockBefore(@NativeType("LLVMBasicBlockRef") long BB, @NativeType("LLVMBasicBlockRef") long MovePos) {
        long __functionAddress = Functions.MoveBasicBlockBefore;
        if (CHECKS) {
            check(BB);
            check(MovePos);
        }
        invokePPV(BB, MovePos, __functionAddress);
    }

    // --- [ LLVMMoveBasicBlockAfter ] ---

    /** Move a basic block to after another one. */
    public static void LLVMMoveBasicBlockAfter(@NativeType("LLVMBasicBlockRef") long BB, @NativeType("LLVMBasicBlockRef") long MovePos) {
        long __functionAddress = Functions.MoveBasicBlockAfter;
        if (CHECKS) {
            check(BB);
            check(MovePos);
        }
        invokePPV(BB, MovePos, __functionAddress);
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
        return invokePP(BB, __functionAddress);
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
        return invokePP(BB, __functionAddress);
    }

    // --- [ LLVMHasMetadata ] ---

    /** Determine whether an instruction has any metadata attached. */
    @NativeType("int")
    public static boolean LLVMHasMetadata(@NativeType("LLVMValueRef") long Val) {
        long __functionAddress = Functions.HasMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePI(Val, __functionAddress) != 0;
    }

    // --- [ LLVMGetMetadata ] ---

    /** Return metadata associated with an instruction value. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetMetadata(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int KindID) {
        long __functionAddress = Functions.GetMetadata;
        if (CHECKS) {
            check(Val);
        }
        return invokePP(Val, KindID, __functionAddress);
    }

    // --- [ LLVMSetMetadata ] ---

    /** Set metadata associated with an instruction value. */
    public static void LLVMSetMetadata(@NativeType("LLVMValueRef") long Val, @NativeType("unsigned int") int KindID, @NativeType("LLVMValueRef") long Node) {
        long __functionAddress = Functions.SetMetadata;
        if (CHECKS) {
            check(Val);
            check(Node);
        }
        invokePPV(Val, KindID, Node, __functionAddress);
    }

    // --- [ LLVMInstructionGetAllMetadataOtherThanDebugLoc ] ---

    /** Unsafe version of: {@link #LLVMInstructionGetAllMetadataOtherThanDebugLoc InstructionGetAllMetadataOtherThanDebugLoc} */
    public static long nLLVMInstructionGetAllMetadataOtherThanDebugLoc(long Instr, long NumEntries) {
        long __functionAddress = Functions.InstructionGetAllMetadataOtherThanDebugLoc;
        if (CHECKS) {
            check(__functionAddress);
            check(Instr);
        }
        return invokePPP(Instr, NumEntries, __functionAddress);
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
        return invokePP(Inst, __functionAddress);
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
        return invokePP(Inst, __functionAddress);
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
        return invokePP(Inst, __functionAddress);
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
        invokePV(Inst, __functionAddress);
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
        invokePV(Inst, __functionAddress);
    }

    // --- [ LLVMGetInstructionOpcode ] ---

    /** Obtain the code opcode for an individual instruction. */
    @NativeType("LLVMOpcode")
    public static int LLVMGetInstructionOpcode(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetInstructionOpcode;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(Inst, __functionAddress);
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
        return invokePI(Inst, __functionAddress);
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
        return invokePI(Inst, __functionAddress);
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
        return invokePP(Inst, __functionAddress);
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
        return invokePP(Inst, __functionAddress);
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
        return invokePI(Instr, __functionAddress);
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
        invokePV(Instr, CC, __functionAddress);
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
        return invokePI(Instr, __functionAddress);
    }

    // --- [ LLVMSetInstrParamAlignment ] ---

    public static void LLVMSetInstrParamAlignment(@NativeType("LLVMValueRef") long Instr, @NativeType("unsigned int") int index, @NativeType("unsigned int") int Align) {
        long __functionAddress = Functions.SetInstrParamAlignment;
        if (CHECKS) {
            check(Instr);
        }
        invokePV(Instr, index, Align, __functionAddress);
    }

    // --- [ LLVMAddCallSiteAttribute ] ---

    public static void LLVMAddCallSiteAttribute(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx, @NativeType("LLVMAttributeRef") long A) {
        long __functionAddress = Functions.AddCallSiteAttribute;
        if (CHECKS) {
            check(C);
            check(A);
        }
        invokePPV(C, Idx, A, __functionAddress);
    }

    // --- [ LLVMGetCallSiteAttributeCount ] ---

    @NativeType("unsigned int")
    public static int LLVMGetCallSiteAttributeCount(@NativeType("LLVMValueRef") long C, @NativeType("LLVMAttributeIndex") int Idx) {
        long __functionAddress = Functions.GetCallSiteAttributeCount;
        if (CHECKS) {
            check(C);
        }
        return invokePI(C, Idx, __functionAddress);
    }

    // --- [ LLVMGetCallSiteAttributes ] ---

    public static void nLLVMGetCallSiteAttributes(long C, int Idx, long Attrs) {
        long __functionAddress = Functions.GetCallSiteAttributes;
        if (CHECKS) {
            check(C);
        }
        invokePPV(C, Idx, Attrs, __functionAddress);
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
        return invokePP(C, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMGetCallSiteStringAttribute ] ---

    public static long nLLVMGetCallSiteStringAttribute(long C, int Idx, long K, int KLen) {
        long __functionAddress = Functions.GetCallSiteStringAttribute;
        if (CHECKS) {
            check(C);
        }
        return invokePPP(C, Idx, K, KLen, __functionAddress);
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
        invokePV(C, Idx, KindID, __functionAddress);
    }

    // --- [ LLVMRemoveCallSiteStringAttribute ] ---

    public static void nLLVMRemoveCallSiteStringAttribute(long C, int Idx, long K, int KLen) {
        long __functionAddress = Functions.RemoveCallSiteStringAttribute;
        if (CHECKS) {
            check(C);
        }
        invokePPV(C, Idx, K, KLen, __functionAddress);
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

    // --- [ LLVMGetCalledFunctionType ] ---

    /**
     * Obtain the function type called by this instruction.
     *
     * @since 8.0
     */
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
        return invokePP(Instr, __functionAddress);
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
        return invokePI(CallInst, __functionAddress) != 0;
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
        invokePV(CallInst, IsTailCall ? 1 : 0, __functionAddress);
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
        return invokePP(InvokeInst, __functionAddress);
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
        return invokePP(InvokeInst, __functionAddress);
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
        invokePPV(InvokeInst, B, __functionAddress);
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
        invokePPV(InvokeInst, B, __functionAddress);
    }

    // --- [ LLVMGetNumSuccessors ] ---

    /** Return the number of successors that this terminator has. */
    @NativeType("unsigned int")
    public static int LLVMGetNumSuccessors(@NativeType("LLVMValueRef") long Term) {
        long __functionAddress = Functions.GetNumSuccessors;
        if (CHECKS) {
            check(Term);
        }
        return invokePI(Term, __functionAddress);
    }

    // --- [ LLVMGetSuccessor ] ---

    /** Return the specified successor. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetSuccessor(@NativeType("LLVMValueRef") long Term, @NativeType("unsigned int") int i) {
        long __functionAddress = Functions.GetSuccessor;
        if (CHECKS) {
            check(Term);
        }
        return invokePP(Term, i, __functionAddress);
    }

    // --- [ LLVMSetSuccessor ] ---

    /** Update the specified successor to point at the provided block. */
    public static void LLVMSetSuccessor(@NativeType("LLVMValueRef") long Term, @NativeType("unsigned int") int i, @NativeType("LLVMBasicBlockRef") long block) {
        long __functionAddress = Functions.SetSuccessor;
        if (CHECKS) {
            check(Term);
            check(block);
        }
        invokePPV(Term, i, block, __functionAddress);
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
        return invokePI(Branch, __functionAddress) != 0;
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
        return invokePP(Branch, __functionAddress);
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
        invokePPV(Branch, Cond, __functionAddress);
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
        return invokePP(SwitchInstr, __functionAddress);
    }

    // --- [ LLVMGetAllocatedType ] ---

    /** Obtain the type that is being allocated by the {@code alloca} instruction. */
    @NativeType("LLVMTypeRef")
    public static long LLVMGetAllocatedType(@NativeType("LLVMValueRef") long Alloca) {
        long __functionAddress = Functions.GetAllocatedType;
        if (CHECKS) {
            check(Alloca);
        }
        return invokePP(Alloca, __functionAddress);
    }

    // --- [ LLVMIsInBounds ] ---

    /** Check whether the given {@code GEP} instruction is inbounds. */
    @NativeType("LLVMBool")
    public static boolean LLVMIsInBounds(@NativeType("LLVMValueRef") long GEP) {
        long __functionAddress = Functions.IsInBounds;
        if (CHECKS) {
            check(GEP);
        }
        return invokePI(GEP, __functionAddress) != 0;
    }

    // --- [ LLVMSetIsInBounds ] ---

    /** Set the given {@code GEP} instruction to be inbounds or not. */
    public static void LLVMSetIsInBounds(@NativeType("LLVMValueRef") long GEP, @NativeType("LLVMBool") boolean InBounds) {
        long __functionAddress = Functions.SetIsInBounds;
        if (CHECKS) {
            check(GEP);
        }
        invokePV(GEP, InBounds ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMAddIncoming ] ---

    /** Unsafe version of: {@link #LLVMAddIncoming AddIncoming} */
    public static void nLLVMAddIncoming(long PhiNode, long IncomingValues, long IncomingBlocks, int Count) {
        long __functionAddress = Functions.AddIncoming;
        if (CHECKS) {
            check(PhiNode);
        }
        invokePPPV(PhiNode, IncomingValues, IncomingBlocks, Count, __functionAddress);
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
        return invokePI(PhiNode, __functionAddress);
    }

    // --- [ LLVMGetIncomingValue ] ---

    /** Obtain an incoming value to a PHI node as an {@code LLVMValueRef}. */
    @NativeType("LLVMValueRef")
    public static long LLVMGetIncomingValue(@NativeType("LLVMValueRef") long PhiNode, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetIncomingValue;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePP(PhiNode, Index, __functionAddress);
    }

    // --- [ LLVMGetIncomingBlock ] ---

    /** Obtain an incoming value to a PHI node as an {@code LLVMBasicBlockRef}. */
    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetIncomingBlock(@NativeType("LLVMValueRef") long PhiNode, @NativeType("unsigned int") int Index) {
        long __functionAddress = Functions.GetIncomingBlock;
        if (CHECKS) {
            check(PhiNode);
        }
        return invokePP(PhiNode, Index, __functionAddress);
    }

    // --- [ LLVMGetNumIndices ] ---

    /** Obtain the number of indices. NB: This also works on {@code GEP}. */
    @NativeType("unsigned int")
    public static int LLVMGetNumIndices(@NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.GetNumIndices;
        if (CHECKS) {
            check(Inst);
        }
        return invokePI(Inst, __functionAddress);
    }

    // --- [ LLVMGetIndices ] ---

    /** Unsafe version of: {@link #LLVMGetIndices GetIndices} */
    public static long nLLVMGetIndices(long Inst) {
        long __functionAddress = Functions.GetIndices;
        if (CHECKS) {
            check(Inst);
        }
        return invokePP(Inst, __functionAddress);
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
        return invokePP(C, __functionAddress);
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
        invokePPPV(Builder, Block, Instr, __functionAddress);
    }

    // --- [ LLVMPositionBuilderBefore ] ---

    public static void LLVMPositionBuilderBefore(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.PositionBuilderBefore;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPV(Builder, Instr, __functionAddress);
    }

    // --- [ LLVMPositionBuilderAtEnd ] ---

    public static void LLVMPositionBuilderAtEnd(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMBasicBlockRef") long Block) {
        long __functionAddress = Functions.PositionBuilderAtEnd;
        if (CHECKS) {
            check(Builder);
            check(Block);
        }
        invokePPV(Builder, Block, __functionAddress);
    }

    // --- [ LLVMGetInsertBlock ] ---

    @NativeType("LLVMBasicBlockRef")
    public static long LLVMGetInsertBlock(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetInsertBlock;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMClearInsertionPosition ] ---

    public static void LLVMClearInsertionPosition(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.ClearInsertionPosition;
        if (CHECKS) {
            check(Builder);
        }
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMInsertIntoBuilder ] ---

    public static void LLVMInsertIntoBuilder(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Instr) {
        long __functionAddress = Functions.InsertIntoBuilder;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPV(Builder, Instr, __functionAddress);
    }

    // --- [ LLVMInsertIntoBuilderWithName ] ---

    public static void nLLVMInsertIntoBuilderWithName(long Builder, long Instr, long Name) {
        long __functionAddress = Functions.InsertIntoBuilderWithName;
        if (CHECKS) {
            check(Builder);
            check(Instr);
        }
        invokePPPV(Builder, Instr, Name, __functionAddress);
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
        invokePV(Builder, __functionAddress);
    }

    // --- [ LLVMSetCurrentDebugLocation ] ---

    /** Metadata */
    public static void LLVMSetCurrentDebugLocation(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long L) {
        long __functionAddress = Functions.SetCurrentDebugLocation;
        if (CHECKS) {
            check(Builder);
            check(L);
        }
        invokePPV(Builder, L, __functionAddress);
    }

    // --- [ LLVMGetCurrentDebugLocation ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMGetCurrentDebugLocation(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.GetCurrentDebugLocation;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMSetInstDebugLocation ] ---

    public static void LLVMSetInstDebugLocation(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Inst) {
        long __functionAddress = Functions.SetInstDebugLocation;
        if (CHECKS) {
            check(Builder);
            check(Inst);
        }
        invokePPV(Builder, Inst, __functionAddress);
    }

    // --- [ LLVMBuildRetVoid ] ---

    /** Terminators */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildRetVoid(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.BuildRetVoid;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
    }

    // --- [ LLVMBuildRet ] ---

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

    public static long nLLVMBuildAggregateRet(long Builder, long RetVals, int N) {
        long __functionAddress = Functions.BuildAggregateRet;
        if (CHECKS) {
            check(Builder);
        }
        return invokePPP(Builder, RetVals, N, __functionAddress);
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
        return invokePPP(Builder, Dest, __functionAddress);
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
        return invokePPPPP(Builder, If, Then, Else, __functionAddress);
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
        return invokePPPP(Builder, V, Else, NumCases, __functionAddress);
    }

    // --- [ LLVMBuildIndirectBr ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildIndirectBr(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMValueRef") long Addr, @NativeType("unsigned int") int NumDests) {
        long __functionAddress = Functions.BuildIndirectBr;
        if (CHECKS) {
            check(B);
            check(Addr);
        }
        return invokePPP(B, Addr, NumDests, __functionAddress);
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
        return invokePPPPPPP(Builder, Fn, Args, NumArgs, Then, Catch, Name, __functionAddress);
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

    // --- [ LLVMBuildInvoke2 ] ---

    /** Unsafe version of: {@link #LLVMBuildInvoke2 BuildInvoke2} */
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

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInvoke2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("LLVMBasicBlockRef") long Then, @NativeType("LLVMBasicBlockRef") long Catch, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInvoke2(Builder, Ty, Fn, memAddress(Args), Args.remaining(), Then, Catch, memAddress(Name));
    }

    /** @since 8.0 */
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

    // --- [ LLVMBuildUnreachable ] ---

    @NativeType("LLVMValueRef")
    public static long LLVMBuildUnreachable(@NativeType("LLVMBuilderRef") long Builder) {
        long __functionAddress = Functions.BuildUnreachable;
        if (CHECKS) {
            check(Builder);
        }
        return invokePP(Builder, __functionAddress);
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
        return invokePPP(B, Exn, __functionAddress);
    }

    // --- [ LLVMBuildLandingPad ] ---

    public static long nLLVMBuildLandingPad(long B, long Ty, long PersFn, int NumClauses, long Name) {
        long __functionAddress = Functions.BuildLandingPad;
        if (CHECKS) {
            check(B);
            check(Ty);
            check(PersFn);
        }
        return invokePPPPP(B, Ty, PersFn, NumClauses, Name, __functionAddress);
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
            check(__functionAddress);
            check(B);
            check(CatchPad);
            check(BB);
        }
        return invokePPPP(B, CatchPad, BB, __functionAddress);
    }

    // --- [ LLVMBuildCatchRet ] ---

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

    public static long nLLVMBuildCatchPad(long B, long ParentPad, long Args, int NumArgs, long Name) {
        long __functionAddress = Functions.BuildCatchPad;
        if (CHECKS) {
            check(__functionAddress);
            check(B);
            check(ParentPad);
        }
        return invokePPPPP(B, ParentPad, Args, NumArgs, Name, __functionAddress);
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
            check(__functionAddress);
            check(B);
            check(ParentPad);
        }
        return invokePPPPP(B, ParentPad, Args, NumArgs, Name, __functionAddress);
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
            check(__functionAddress);
            check(B);
            check(ParentPad);
            check(UnwindBB);
        }
        return invokePPPPP(B, ParentPad, UnwindBB, NumHandlers, Name, __functionAddress);
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
        invokePPPV(Switch, OnVal, Dest, __functionAddress);
    }

    // --- [ LLVMAddDestination ] ---

    /** Add a destination to the {@code indirectbr} instruction */
    public static void LLVMAddDestination(@NativeType("LLVMValueRef") long IndirectBr, @NativeType("LLVMBasicBlockRef") long Dest) {
        long __functionAddress = Functions.AddDestination;
        if (CHECKS) {
            check(IndirectBr);
            check(Dest);
        }
        invokePPV(IndirectBr, Dest, __functionAddress);
    }

    // --- [ LLVMGetNumClauses ] ---

    /** Get the number of clauses on the {@code landingpad} instruction */
    @NativeType("unsigned int")
    public static int LLVMGetNumClauses(@NativeType("LLVMValueRef") long LandingPad) {
        long __functionAddress = Functions.GetNumClauses;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePI(LandingPad, __functionAddress);
    }

    // --- [ LLVMGetClause ] ---

    /** Get the value of the clause at index {@code Idx} on the {@code landingpad} instruction */
    @NativeType("LLVMValueRef")
    public static long LLVMGetClause(@NativeType("LLVMValueRef") long LandingPad, @NativeType("unsigned int") int Idx) {
        long __functionAddress = Functions.GetClause;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePP(LandingPad, Idx, __functionAddress);
    }

    // --- [ LLVMAddClause ] ---

    /** Add a {@code catch} or {@code filter} clause to the {@code landingpad} instruction */
    public static void LLVMAddClause(@NativeType("LLVMValueRef") long LandingPad, @NativeType("LLVMValueRef") long ClauseVal) {
        long __functionAddress = Functions.AddClause;
        if (CHECKS) {
            check(LandingPad);
            check(ClauseVal);
        }
        invokePPV(LandingPad, ClauseVal, __functionAddress);
    }

    // --- [ LLVMIsCleanup ] ---

    /** Get the 'cleanup' flag in the {@code landingpad} instruction */
    @NativeType("LLVMBool")
    public static boolean LLVMIsCleanup(@NativeType("LLVMValueRef") long LandingPad) {
        long __functionAddress = Functions.IsCleanup;
        if (CHECKS) {
            check(LandingPad);
        }
        return invokePI(LandingPad, __functionAddress) != 0;
    }

    // --- [ LLVMSetCleanup ] ---

    /** Set the 'cleanup' flag in the {@code landingpad} instruction */
    public static void LLVMSetCleanup(@NativeType("LLVMValueRef") long LandingPad, @NativeType("LLVMBool") boolean Val) {
        long __functionAddress = Functions.SetCleanup;
        if (CHECKS) {
            check(LandingPad);
        }
        invokePV(LandingPad, Val ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMAddHandler ] ---

    /** Add a destination to the {@code catchswitch} instruction */
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

    /** Get the number of handlers on the {@code catchswitch} instruction */
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

    /** Unsafe version of: {@link #LLVMGetHandlers GetHandlers} */
    public static void nLLVMGetHandlers(long CatchSwitch, long Handlers) {
        long __functionAddress = Functions.GetHandlers;
        if (CHECKS) {
            check(__functionAddress);
            check(CatchSwitch);
        }
        invokePPV(CatchSwitch, Handlers, __functionAddress);
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
            check(__functionAddress);
            check(Funclet);
        }
        return invokePP(Funclet, i, __functionAddress);
    }

    // --- [ LLVMSetArgOperand ] ---

    /** Set a {@code funcletpad} argument at the given index. */
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

    /**
     * Get the parent {@code catchswitch} instruction of a {@code catchpad} instruction.
     * 
     * <p>This only works on {@code llvm::CatchPadInst} instructions.</p>
     */
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

    /**
     * Set the parent {@code catchswitch} instruction of a {@code catchpad} instruction.
     * 
     * <p>This only works on {@code llvm::CatchPadInst} instructions.</p>
     */
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

    /** Unsafe version of: {@link #LLVMBuildAdd BuildAdd} */
    public static long nLLVMBuildAdd(long Builder, long LHS, long RHS, long Name) {
        long __functionAddress = Functions.BuildAdd;
        if (CHECKS) {
            check(Builder);
            check(LHS);
            check(RHS);
        }
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(B, Op, LHS, RHS, Name, __functionAddress);
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
        return invokePPPP(Builder, V, Name, __functionAddress);
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
        return invokePPPP(B, V, Name, __functionAddress);
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
        return invokePPPP(B, V, Name, __functionAddress);
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
        return invokePPPP(Builder, V, Name, __functionAddress);
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
        return invokePPPP(Builder, V, Name, __functionAddress);
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
        return invokePPPP(Builder, Ty, Name, __functionAddress);
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
        return invokePPPPP(Builder, Ty, Val, Name, __functionAddress);
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

    // --- [ LLVMBuildMemSet ] ---

    /**
     * Creates and inserts a memset to the specified pointer and the specified value.
     *
     * @since 8.0
     */
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

    /**
     * Creates and inserts a memcpy between the specified pointers.
     *
     * @since 8.0
     */
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

    /**
     * Creates and inserts a memmove between the specified pointers.
     *
     * @since 8.0
     */
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

    public static long nLLVMBuildAlloca(long Builder, long Ty, long Name) {
        long __functionAddress = Functions.BuildAlloca;
        if (CHECKS) {
            check(Builder);
            check(Ty);
        }
        return invokePPPP(Builder, Ty, Name, __functionAddress);
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
        return invokePPPPP(Builder, Ty, Val, Name, __functionAddress);
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
        return invokePPP(Builder, PointerVal, __functionAddress);
    }

    // --- [ LLVMBuildLoad ] ---

    public static long nLLVMBuildLoad(long Builder, long PointerVal, long Name) {
        long __functionAddress = Functions.BuildLoad;
        if (CHECKS) {
            check(Builder);
            check(PointerVal);
        }
        return invokePPPP(Builder, PointerVal, Name, __functionAddress);
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

    // --- [ LLVMBuildLoad2 ] ---

    /** Unsafe version of: {@link #LLVMBuildLoad2 BuildLoad2} */
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

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildLoad2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long PointerVal, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildLoad2(Builder, Ty, PointerVal, memAddress(Name));
    }

    /** @since 8.0 */
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

    public static long nLLVMBuildGEP(long B, long Pointer, long Indices, int NumIndices, long Name) {
        long __functionAddress = Functions.BuildGEP;
        if (CHECKS) {
            check(B);
            check(Pointer);
        }
        return invokePPPPP(B, Pointer, Indices, NumIndices, Name, __functionAddress);
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
        return invokePPPPP(B, Pointer, Indices, NumIndices, Name, __functionAddress);
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
        return invokePPPP(B, Pointer, Idx, Name, __functionAddress);
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

    // --- [ LLVMBuildGEP2 ] ---

    /** Unsafe version of: {@link #LLVMBuildGEP2 BuildGEP2} */
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

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildGEP2(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

    /** @since 8.0 */
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

    /** Unsafe version of: {@link #LLVMBuildInBoundsGEP2 BuildInBoundsGEP2} */
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

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildInBoundsGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("LLVMValueRef *") PointerBuffer Indices, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildInBoundsGEP2(B, Ty, Pointer, memAddress(Indices), Indices.remaining(), memAddress(Name));
    }

    /** @since 8.0 */
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

    // --- [ LLVMBuildStructGEP2 ] ---

    /** Unsafe version of: {@link #LLVMBuildStructGEP2 BuildStructGEP2} */
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

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildStructGEP2(@NativeType("LLVMBuilderRef") long B, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Pointer, @NativeType("unsigned int") int Idx, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildStructGEP2(B, Ty, Pointer, Idx, memAddress(Name));
    }

    /** @since 8.0 */
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

    public static long nLLVMBuildGlobalString(long B, long Str, long Name) {
        long __functionAddress = Functions.BuildGlobalString;
        if (CHECKS) {
            check(B);
        }
        return invokePPPP(B, Str, Name, __functionAddress);
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
        return invokePPPP(B, Str, Name, __functionAddress);
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
        return invokePI(MemoryAccessInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetVolatile ] ---

    public static void LLVMSetVolatile(@NativeType("LLVMValueRef") long MemoryAccessInst, @NativeType("LLVMBool") boolean IsVolatile) {
        long __functionAddress = Functions.SetVolatile;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        invokePV(MemoryAccessInst, IsVolatile ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetOrdering ] ---

    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetOrdering(@NativeType("LLVMValueRef") long MemoryAccessInst) {
        long __functionAddress = Functions.GetOrdering;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        return invokePI(MemoryAccessInst, __functionAddress);
    }

    // --- [ LLVMSetOrdering ] ---

    public static void LLVMSetOrdering(@NativeType("LLVMValueRef") long MemoryAccessInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetOrdering;
        if (CHECKS) {
            check(MemoryAccessInst);
        }
        invokePV(MemoryAccessInst, Ordering, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(B, Op, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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

    // --- [ LLVMBuildPointerCast2 ] ---

    /** Unsafe version of: {@link #LLVMBuildPointerCast2 BuildPointerCast2} */
    public static long nLLVMBuildPointerCast2(long Builder, long Val, long DestTy, int IsSigned, long Name) {
        long __functionAddress = Functions.BuildPointerCast2;
        if (CHECKS) {
            check(__functionAddress);
            check(Builder);
            check(Val);
            check(DestTy);
        }
        return invokePPPPP(Builder, Val, DestTy, IsSigned, Name, __functionAddress);
    }

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPointerCast2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("LLVMBool") boolean IsSigned, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildPointerCast2(Builder, Val, DestTy, IsSigned ? 1 : 0, memAddress(Name));
    }

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildPointerCast2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMValueRef") long Val, @NativeType("LLVMTypeRef") long DestTy, @NativeType("LLVMBool") boolean IsSigned, @NativeType("char const *") CharSequence Name) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Name, true);
            long NameEncoded = stack.getPointerAddress();
            return nLLVMBuildPointerCast2(Builder, Val, DestTy, IsSigned ? 1 : 0, NameEncoded);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Val, DestTy, Name, __functionAddress);
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
        return invokePPPPP(Builder, Op, LHS, RHS, Name, __functionAddress);
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
        return invokePPPPP(Builder, Op, LHS, RHS, Name, __functionAddress);
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
        return invokePPPP(Builder, Ty, Name, __functionAddress);
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
        return invokePPPPP(Builder, Fn, Args, NumArgs, Name, __functionAddress);
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

    // --- [ LLVMBuildCall2 ] ---

    /** Unsafe version of: {@link #LLVMBuildCall2 BuildCall2} */
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

    /** @since 8.0 */
    @NativeType("LLVMValueRef")
    public static long LLVMBuildCall2(@NativeType("LLVMBuilderRef") long Builder, @NativeType("LLVMTypeRef") long Ty, @NativeType("LLVMValueRef") long Fn, @NativeType("LLVMValueRef *") PointerBuffer Args, @NativeType("char const *") ByteBuffer Name) {
        if (CHECKS) {
            checkNT1(Name);
        }
        return nLLVMBuildCall2(Builder, Ty, Fn, memAddress(Args), Args.remaining(), memAddress(Name));
    }

    /** @since 8.0 */
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

    // --- [ LLVMBuildSelect ] ---

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
        return invokePPPPP(Builder, List, Ty, Name, __functionAddress);
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
        return invokePPPPP(Builder, VecVal, Index, Name, __functionAddress);
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
        return invokePPPPPP(Builder, VecVal, EltVal, Index, Name, __functionAddress);
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
        return invokePPPPPP(Builder, V1, V2, Mask, Name, __functionAddress);
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
        return invokePPPP(Builder, AggVal, Index, Name, __functionAddress);
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
        return invokePPPPP(Builder, AggVal, EltVal, Index, Name, __functionAddress);
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
        return invokePPPP(Builder, Val, Name, __functionAddress);
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
        return invokePPPP(Builder, Val, Name, __functionAddress);
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
        return invokePPPPP(Builder, LHS, RHS, Name, __functionAddress);
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
        return invokePPP(B, ordering, singleThread, Name, __functionAddress);
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
        return invokePPPP(B, op, PTR, Val, ordering, singleThread ? 1 : 0, __functionAddress);
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
        return invokePPPPP(B, Ptr, Cmp, New, SuccessOrdering, FailureOrdering, SingleThread ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMIsAtomicSingleThread ] ---

    @NativeType("LLVMBool")
    public static boolean LLVMIsAtomicSingleThread(@NativeType("LLVMValueRef") long AtomicInst) {
        long __functionAddress = Functions.IsAtomicSingleThread;
        if (CHECKS) {
            check(AtomicInst);
        }
        return invokePI(AtomicInst, __functionAddress) != 0;
    }

    // --- [ LLVMSetAtomicSingleThread ] ---

    public static void LLVMSetAtomicSingleThread(@NativeType("LLVMValueRef") long AtomicInst, @NativeType("LLVMBool") boolean SingleThread) {
        long __functionAddress = Functions.SetAtomicSingleThread;
        if (CHECKS) {
            check(AtomicInst);
        }
        invokePV(AtomicInst, SingleThread ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMGetCmpXchgSuccessOrdering ] ---

    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetCmpXchgSuccessOrdering(@NativeType("LLVMValueRef") long CmpXchgInst) {
        long __functionAddress = Functions.GetCmpXchgSuccessOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        return invokePI(CmpXchgInst, __functionAddress);
    }

    // --- [ LLVMSetCmpXchgSuccessOrdering ] ---

    public static void LLVMSetCmpXchgSuccessOrdering(@NativeType("LLVMValueRef") long CmpXchgInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetCmpXchgSuccessOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        invokePV(CmpXchgInst, Ordering, __functionAddress);
    }

    // --- [ LLVMGetCmpXchgFailureOrdering ] ---

    @NativeType("LLVMAtomicOrdering")
    public static int LLVMGetCmpXchgFailureOrdering(@NativeType("LLVMValueRef") long CmpXchgInst) {
        long __functionAddress = Functions.GetCmpXchgFailureOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        return invokePI(CmpXchgInst, __functionAddress);
    }

    // --- [ LLVMSetCmpXchgFailureOrdering ] ---

    public static void LLVMSetCmpXchgFailureOrdering(@NativeType("LLVMValueRef") long CmpXchgInst, @NativeType("LLVMAtomicOrdering") int Ordering) {
        long __functionAddress = Functions.SetCmpXchgFailureOrdering;
        if (CHECKS) {
            check(CmpXchgInst);
        }
        invokePV(CmpXchgInst, Ordering, __functionAddress);
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
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMDisposeModuleProvider ] ---

    /** Destroys the module {@code M}. */
    public static void LLVMDisposeModuleProvider(@NativeType("LLVMModuleProviderRef") long M) {
        long __functionAddress = Functions.DisposeModuleProvider;
        if (CHECKS) {
            check(M);
        }
        invokePV(M, __functionAddress);
    }

    // --- [ LLVMCreateMemoryBufferWithContentsOfFile ] ---

    public static int nLLVMCreateMemoryBufferWithContentsOfFile(long Path, long OutMemBuf, long OutMessage) {
        long __functionAddress = Functions.CreateMemoryBufferWithContentsOfFile;
        return invokePPPI(Path, OutMemBuf, OutMessage, __functionAddress);
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
        return invokePPI(OutMemBuf, OutMessage, __functionAddress);
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
        return invokePPPP(InputData, InputDataLength, BufferName, RequiresNullTerminator, __functionAddress);
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
        return invokePPPP(InputData, InputDataLength, BufferName, __functionAddress);
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
        return invokePP(MemBuf, __functionAddress);
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
        return invokePP(MemBuf, __functionAddress);
    }

    // --- [ LLVMDisposeMemoryBuffer ] ---

    public static void LLVMDisposeMemoryBuffer(@NativeType("LLVMMemoryBufferRef") long MemBuf) {
        long __functionAddress = Functions.DisposeMemoryBuffer;
        if (CHECKS) {
            check(MemBuf);
        }
        invokePV(MemBuf, __functionAddress);
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
        return invokePP(M, __functionAddress);
    }

    // --- [ LLVMCreateFunctionPassManager ] ---

    /** Deprecated: Use {@link #LLVMCreateFunctionPassManagerForModule CreateFunctionPassManagerForModule} instead. */
    @NativeType("LLVMPassManagerRef")
    public static long LLVMCreateFunctionPassManager(@NativeType("LLVMModuleProviderRef") long MP) {
        long __functionAddress = Functions.CreateFunctionPassManager;
        if (CHECKS) {
            check(MP);
        }
        return invokePP(MP, __functionAddress);
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
        return invokePPI(PM, M, __functionAddress) != 0;
    }

    // --- [ LLVMInitializeFunctionPassManager ] ---

    /** Initializes all of the function passes scheduled in the function pass manager. Returns 1 if any of the passes modified the module, 0 otherwise. */
    @NativeType("LLVMBool")
    public static boolean LLVMInitializeFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM) {
        long __functionAddress = Functions.InitializeFunctionPassManager;
        if (CHECKS) {
            check(FPM);
        }
        return invokePI(FPM, __functionAddress) != 0;
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
        return invokePPI(FPM, F, __functionAddress) != 0;
    }

    // --- [ LLVMFinalizeFunctionPassManager ] ---

    /** Finalizes all of the function passes scheduled in the function pass manager. Returns 1 if any of the passes modified the module, 0 otherwise. */
    @NativeType("LLVMBool")
    public static boolean LLVMFinalizeFunctionPassManager(@NativeType("LLVMPassManagerRef") long FPM) {
        long __functionAddress = Functions.FinalizeFunctionPassManager;
        if (CHECKS) {
            check(FPM);
        }
        return invokePI(FPM, __functionAddress) != 0;
    }

    // --- [ LLVMDisposePassManager ] ---

    /** Frees the memory of a pass pipeline. For function pipelines, does not free the module provider. */
    public static void LLVMDisposePassManager(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.DisposePassManager;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
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