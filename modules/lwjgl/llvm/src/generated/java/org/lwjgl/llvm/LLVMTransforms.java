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

public class LLVMTransforms {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AddAggressiveInstCombinerPass                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddAggressiveInstCombinerPass"),
            AddCoroEarlyPass                                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddCoroEarlyPass"),
            AddCoroSplitPass                                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddCoroSplitPass"),
            AddCoroElidePass                                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddCoroElidePass"),
            AddCoroCleanupPass                                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddCoroCleanupPass"),
            PassManagerBuilderAddCoroutinePassesToExtensionPoints = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderAddCoroutinePassesToExtensionPoints"),
            AddInstructionCombiningPass                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddInstructionCombiningPass"),
            AddInstructionSimplifyPass                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddInstructionSimplifyPass"),
            AddArgumentPromotionPass                              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddArgumentPromotionPass"),
            AddConstantMergePass                                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddConstantMergePass"),
            AddMergeFunctionsPass                                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddMergeFunctionsPass"),
            AddCalledValuePropagationPass                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddCalledValuePropagationPass"),
            AddDeadArgEliminationPass                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddDeadArgEliminationPass"),
            AddFunctionAttrsPass                                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddFunctionAttrsPass"),
            AddFunctionInliningPass                               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddFunctionInliningPass"),
            AddAlwaysInlinerPass                                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddAlwaysInlinerPass"),
            AddGlobalDCEPass                                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddGlobalDCEPass"),
            AddGlobalOptimizerPass                                = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddGlobalOptimizerPass"),
            AddIPConstantPropagationPass                          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddIPConstantPropagationPass"),
            AddPruneEHPass                                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddPruneEHPass"),
            AddIPSCCPPass                                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddIPSCCPPass"),
            AddInternalizePass                                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddInternalizePass"),
            AddInternalizePassWithMustPreservePredicate           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddInternalizePassWithMustPreservePredicate"),
            AddStripDeadPrototypesPass                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddStripDeadPrototypesPass"),
            AddStripSymbolsPass                                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddStripSymbolsPass"),
            RunPasses                                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMRunPasses"),
            CreatePassBuilderOptions                              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMCreatePassBuilderOptions"),
            PassBuilderOptionsSetVerifyEach                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetVerifyEach"),
            PassBuilderOptionsSetDebugLogging                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetDebugLogging"),
            PassBuilderOptionsSetLoopInterleaving                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetLoopInterleaving"),
            PassBuilderOptionsSetLoopVectorization                = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetLoopVectorization"),
            PassBuilderOptionsSetSLPVectorization                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetSLPVectorization"),
            PassBuilderOptionsSetLoopUnrolling                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetLoopUnrolling"),
            PassBuilderOptionsSetForgetAllSCEVInLoopUnroll        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetForgetAllSCEVInLoopUnroll"),
            PassBuilderOptionsSetLicmMssaOptCap                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetLicmMssaOptCap"),
            PassBuilderOptionsSetLicmMssaNoAccForPromotionCap     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetLicmMssaNoAccForPromotionCap"),
            PassBuilderOptionsSetCallGraphProfile                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetCallGraphProfile"),
            PassBuilderOptionsSetMergeFunctions                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetMergeFunctions"),
            PassBuilderOptionsSetInlinerThreshold                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassBuilderOptionsSetInlinerThreshold"),
            DisposePassBuilderOptions                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMDisposePassBuilderOptions"),
            PassManagerBuilderCreate                              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderCreate"),
            PassManagerBuilderDispose                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderDispose"),
            PassManagerBuilderSetOptLevel                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetOptLevel"),
            PassManagerBuilderSetSizeLevel                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetSizeLevel"),
            PassManagerBuilderSetDisableUnitAtATime               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetDisableUnitAtATime"),
            PassManagerBuilderSetDisableUnrollLoops               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetDisableUnrollLoops"),
            PassManagerBuilderSetDisableSimplifyLibCalls          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetDisableSimplifyLibCalls"),
            PassManagerBuilderUseInlinerWithThreshold             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderUseInlinerWithThreshold"),
            PassManagerBuilderPopulateFunctionPassManager         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderPopulateFunctionPassManager"),
            PassManagerBuilderPopulateModulePassManager           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderPopulateModulePassManager"),
            PassManagerBuilderPopulateLTOPassManager              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMPassManagerBuilderPopulateLTOPassManager"),
            AddAggressiveDCEPass                                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddAggressiveDCEPass"),
            AddDCEPass                                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddDCEPass"),
            AddBitTrackingDCEPass                                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddBitTrackingDCEPass"),
            AddAlignmentFromAssumptionsPass                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddAlignmentFromAssumptionsPass"),
            AddCFGSimplificationPass                              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddCFGSimplificationPass"),
            AddDeadStoreEliminationPass                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddDeadStoreEliminationPass"),
            AddScalarizerPass                                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddScalarizerPass"),
            AddMergedLoadStoreMotionPass                          = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddMergedLoadStoreMotionPass"),
            AddGVNPass                                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddGVNPass"),
            AddNewGVNPass                                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddNewGVNPass"),
            AddIndVarSimplifyPass                                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddIndVarSimplifyPass"),
            AddJumpThreadingPass                                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddJumpThreadingPass"),
            AddLICMPass                                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLICMPass"),
            AddLoopDeletionPass                                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopDeletionPass"),
            AddLoopIdiomPass                                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopIdiomPass"),
            AddLoopRotatePass                                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopRotatePass"),
            AddLoopRerollPass                                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopRerollPass"),
            AddLoopUnrollPass                                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopUnrollPass"),
            AddLoopUnrollAndJamPass                               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopUnrollAndJamPass"),
            AddLoopUnswitchPass                                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopUnswitchPass"),
            AddLowerAtomicPass                                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLowerAtomicPass"),
            AddMemCpyOptPass                                      = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddMemCpyOptPass"),
            AddPartiallyInlineLibCallsPass                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddPartiallyInlineLibCallsPass"),
            AddReassociatePass                                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddReassociatePass"),
            AddSCCPPass                                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddSCCPPass"),
            AddScalarReplAggregatesPass                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddScalarReplAggregatesPass"),
            AddScalarReplAggregatesPassSSA                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddScalarReplAggregatesPassSSA"),
            AddScalarReplAggregatesPassWithThreshold              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddScalarReplAggregatesPassWithThreshold"),
            AddSimplifyLibCallsPass                               = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddSimplifyLibCallsPass"),
            AddTailCallEliminationPass                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddTailCallEliminationPass"),
            AddConstantPropagationPass                            = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddConstantPropagationPass"),
            AddDemoteMemoryToRegisterPass                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddDemoteMemoryToRegisterPass"),
            AddVerifierPass                                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddVerifierPass"),
            AddCorrelatedValuePropagationPass                     = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddCorrelatedValuePropagationPass"),
            AddEarlyCSEPass                                       = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddEarlyCSEPass"),
            AddEarlyCSEMemSSAPass                                 = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddEarlyCSEMemSSAPass"),
            AddLowerExpectIntrinsicPass                           = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLowerExpectIntrinsicPass"),
            AddLowerConstantIntrinsicsPass                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLowerConstantIntrinsicsPass"),
            AddTypeBasedAliasAnalysisPass                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddTypeBasedAliasAnalysisPass"),
            AddScopedNoAliasAAPass                                = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddScopedNoAliasAAPass"),
            AddBasicAliasAnalysisPass                             = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddBasicAliasAnalysisPass"),
            AddUnifyFunctionExitNodesPass                         = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddUnifyFunctionExitNodesPass"),
            AddLowerSwitchPass                                    = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLowerSwitchPass"),
            AddPromoteMemoryToRegisterPass                        = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddPromoteMemoryToRegisterPass"),
            AddAddDiscriminatorsPass                              = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddAddDiscriminatorsPass"),
            AddLoopVectorizePass                                  = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddLoopVectorizePass"),
            AddSLPVectorizePass                                   = apiGetFunctionAddressOptional(LLVMCore.getLibrary(), "LLVMAddSLPVectorizePass");

    }

    protected LLVMTransforms() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMAddAggressiveInstCombinerPass ] ---

    /** {@code void LLVMAddAggressiveInstCombinerPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddAggressiveInstCombinerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAggressiveInstCombinerPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroEarlyPass ] ---

    /** {@code void LLVMAddCoroEarlyPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddCoroEarlyPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroEarlyPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroSplitPass ] ---

    /** {@code void LLVMAddCoroSplitPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddCoroSplitPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroSplitPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroElidePass ] ---

    /** {@code void LLVMAddCoroElidePass(LLVMPassManagerRef PM)} */
    public static void LLVMAddCoroElidePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroElidePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroCleanupPass ] ---

    /** {@code void LLVMAddCoroCleanupPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddCoroCleanupPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroCleanupPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderAddCoroutinePassesToExtensionPoints ] ---

    /** {@code void LLVMPassManagerBuilderAddCoroutinePassesToExtensionPoints(LLVMPassManagerBuilderRef PMB)} */
    public static void LLVMPassManagerBuilderAddCoroutinePassesToExtensionPoints(@NativeType("LLVMPassManagerBuilderRef") long PMB) {
        long __functionAddress = Functions.PassManagerBuilderAddCoroutinePassesToExtensionPoints;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, __functionAddress);
    }

    // --- [ LLVMAddInstructionCombiningPass ] ---

    /** {@code void LLVMAddInstructionCombiningPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddInstructionCombiningPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddInstructionCombiningPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddInstructionSimplifyPass ] ---

    /** {@code void LLVMAddInstructionSimplifyPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddInstructionSimplifyPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddInstructionSimplifyPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddArgumentPromotionPass ] ---

    /** {@code void LLVMAddArgumentPromotionPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddArgumentPromotionPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddArgumentPromotionPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddConstantMergePass ] ---

    /** {@code void LLVMAddConstantMergePass(LLVMPassManagerRef PM)} */
    public static void LLVMAddConstantMergePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddConstantMergePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddMergeFunctionsPass ] ---

    /** {@code void LLVMAddMergeFunctionsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddMergeFunctionsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddMergeFunctionsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCalledValuePropagationPass ] ---

    /** {@code void LLVMAddCalledValuePropagationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddCalledValuePropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCalledValuePropagationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddDeadArgEliminationPass ] ---

    /** {@code void LLVMAddDeadArgEliminationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddDeadArgEliminationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddDeadArgEliminationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddFunctionAttrsPass ] ---

    /** {@code void LLVMAddFunctionAttrsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddFunctionAttrsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddFunctionAttrsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddFunctionInliningPass ] ---

    /** {@code void LLVMAddFunctionInliningPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddFunctionInliningPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddFunctionInliningPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddAlwaysInlinerPass ] ---

    /** {@code void LLVMAddAlwaysInlinerPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddAlwaysInlinerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAlwaysInlinerPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddGlobalDCEPass ] ---

    /** {@code void LLVMAddGlobalDCEPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddGlobalDCEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddGlobalDCEPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddGlobalOptimizerPass ] ---

    /** {@code void LLVMAddGlobalOptimizerPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddGlobalOptimizerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddGlobalOptimizerPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddIPConstantPropagationPass ] ---

    /** {@code void LLVMAddIPConstantPropagationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddIPConstantPropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddIPConstantPropagationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddPruneEHPass ] ---

    /** {@code void LLVMAddPruneEHPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddPruneEHPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddPruneEHPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddIPSCCPPass ] ---

    /** {@code void LLVMAddIPSCCPPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddIPSCCPPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddIPSCCPPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddInternalizePass ] ---

    /** {@code void LLVMAddInternalizePass(LLVMPassManagerRef PM, unsigned int AllButMain)} */
    public static void LLVMAddInternalizePass(@NativeType("LLVMPassManagerRef") long PM, @NativeType("unsigned int") int AllButMain) {
        long __functionAddress = Functions.AddInternalizePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, AllButMain, __functionAddress);
    }

    // --- [ LLVMAddInternalizePassWithMustPreservePredicate ] ---

    /** {@code void LLVMAddInternalizePassWithMustPreservePredicate(LLVMPassManagerRef PM, void * Context, LLVMBool (*) (LLVMValueRef, void *) MustPreserve)} */
    public static void nLLVMAddInternalizePassWithMustPreservePredicate(long PM, long Context, long MustPreserve) {
        long __functionAddress = Functions.AddInternalizePassWithMustPreservePredicate;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
            check(Context);
        }
        invokePPPV(PM, Context, MustPreserve, __functionAddress);
    }

    /** {@code void LLVMAddInternalizePassWithMustPreservePredicate(LLVMPassManagerRef PM, void * Context, LLVMBool (*) (LLVMValueRef, void *) MustPreserve)} */
    public static void LLVMAddInternalizePassWithMustPreservePredicate(@NativeType("LLVMPassManagerRef") long PM, @NativeType("void *") long Context, @NativeType("LLVMBool (*) (LLVMValueRef, void *)") LLVMMustPreserveI MustPreserve) {
        nLLVMAddInternalizePassWithMustPreservePredicate(PM, Context, MustPreserve.address());
    }

    // --- [ LLVMAddStripDeadPrototypesPass ] ---

    /** {@code void LLVMAddStripDeadPrototypesPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddStripDeadPrototypesPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddStripDeadPrototypesPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddStripSymbolsPass ] ---

    /** {@code void LLVMAddStripSymbolsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddStripSymbolsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddStripSymbolsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMRunPasses ] ---

    /** {@code LLVMErrorRef LLVMRunPasses(LLVMModuleRef M, char const * Passes, LLVMTargetMachineRef TM, LLVMPassBuilderOptionsRef Options)} */
    public static long nLLVMRunPasses(long M, long Passes, long TM, long Options) {
        long __functionAddress = Functions.RunPasses;
        if (CHECKS) {
            check(__functionAddress);
            check(M);
            check(TM);
            check(Options);
        }
        return invokePPPPP(M, Passes, TM, Options, __functionAddress);
    }

    /** {@code LLVMErrorRef LLVMRunPasses(LLVMModuleRef M, char const * Passes, LLVMTargetMachineRef TM, LLVMPassBuilderOptionsRef Options)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMRunPasses(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") ByteBuffer Passes, @NativeType("LLVMTargetMachineRef") long TM, @NativeType("LLVMPassBuilderOptionsRef") long Options) {
        if (CHECKS) {
            checkNT1(Passes);
        }
        return nLLVMRunPasses(M, memAddress(Passes), TM, Options);
    }

    /** {@code LLVMErrorRef LLVMRunPasses(LLVMModuleRef M, char const * Passes, LLVMTargetMachineRef TM, LLVMPassBuilderOptionsRef Options)} */
    @NativeType("LLVMErrorRef")
    public static long LLVMRunPasses(@NativeType("LLVMModuleRef") long M, @NativeType("char const *") CharSequence Passes, @NativeType("LLVMTargetMachineRef") long TM, @NativeType("LLVMPassBuilderOptionsRef") long Options) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Passes, true);
            long PassesEncoded = stack.getPointerAddress();
            return nLLVMRunPasses(M, PassesEncoded, TM, Options);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMCreatePassBuilderOptions ] ---

    /** {@code LLVMPassBuilderOptionsRef LLVMCreatePassBuilderOptions(void)} */
    @NativeType("LLVMPassBuilderOptionsRef")
    public static long LLVMCreatePassBuilderOptions() {
        long __functionAddress = Functions.CreatePassBuilderOptions;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetVerifyEach ] ---

    /** {@code void LLVMPassBuilderOptionsSetVerifyEach(LLVMPassBuilderOptionsRef Options, LLVMBool VerifyEach)} */
    public static void LLVMPassBuilderOptionsSetVerifyEach(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean VerifyEach) {
        long __functionAddress = Functions.PassBuilderOptionsSetVerifyEach;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, VerifyEach ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetDebugLogging ] ---

    /** {@code void LLVMPassBuilderOptionsSetDebugLogging(LLVMPassBuilderOptionsRef Options, LLVMBool DebugLogging)} */
    public static void LLVMPassBuilderOptionsSetDebugLogging(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean DebugLogging) {
        long __functionAddress = Functions.PassBuilderOptionsSetDebugLogging;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, DebugLogging ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetLoopInterleaving ] ---

    /** {@code void LLVMPassBuilderOptionsSetLoopInterleaving(LLVMPassBuilderOptionsRef Options, LLVMBool LoopInterleaving)} */
    public static void LLVMPassBuilderOptionsSetLoopInterleaving(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean LoopInterleaving) {
        long __functionAddress = Functions.PassBuilderOptionsSetLoopInterleaving;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, LoopInterleaving ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetLoopVectorization ] ---

    /** {@code void LLVMPassBuilderOptionsSetLoopVectorization(LLVMPassBuilderOptionsRef Options, LLVMBool LoopVectorization)} */
    public static void LLVMPassBuilderOptionsSetLoopVectorization(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean LoopVectorization) {
        long __functionAddress = Functions.PassBuilderOptionsSetLoopVectorization;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, LoopVectorization ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetSLPVectorization ] ---

    /** {@code void LLVMPassBuilderOptionsSetSLPVectorization(LLVMPassBuilderOptionsRef Options, LLVMBool SLPVectorization)} */
    public static void LLVMPassBuilderOptionsSetSLPVectorization(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean SLPVectorization) {
        long __functionAddress = Functions.PassBuilderOptionsSetSLPVectorization;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, SLPVectorization ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetLoopUnrolling ] ---

    /** {@code void LLVMPassBuilderOptionsSetLoopUnrolling(LLVMPassBuilderOptionsRef Options, LLVMBool LoopUnrolling)} */
    public static void LLVMPassBuilderOptionsSetLoopUnrolling(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean LoopUnrolling) {
        long __functionAddress = Functions.PassBuilderOptionsSetLoopUnrolling;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, LoopUnrolling ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetForgetAllSCEVInLoopUnroll ] ---

    /** {@code void LLVMPassBuilderOptionsSetForgetAllSCEVInLoopUnroll(LLVMPassBuilderOptionsRef Options, LLVMBool ForgetAllSCEVInLoopUnroll)} */
    public static void LLVMPassBuilderOptionsSetForgetAllSCEVInLoopUnroll(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean ForgetAllSCEVInLoopUnroll) {
        long __functionAddress = Functions.PassBuilderOptionsSetForgetAllSCEVInLoopUnroll;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, ForgetAllSCEVInLoopUnroll ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetLicmMssaOptCap ] ---

    /** {@code void LLVMPassBuilderOptionsSetLicmMssaOptCap(LLVMPassBuilderOptionsRef Options, unsigned LicmMssaOptCap)} */
    public static void LLVMPassBuilderOptionsSetLicmMssaOptCap(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("unsigned") int LicmMssaOptCap) {
        long __functionAddress = Functions.PassBuilderOptionsSetLicmMssaOptCap;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, LicmMssaOptCap, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetLicmMssaNoAccForPromotionCap ] ---

    /** {@code void LLVMPassBuilderOptionsSetLicmMssaNoAccForPromotionCap(LLVMPassBuilderOptionsRef Options, unsigned LicmMssaNoAccForPromotionCap)} */
    public static void LLVMPassBuilderOptionsSetLicmMssaNoAccForPromotionCap(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("unsigned") int LicmMssaNoAccForPromotionCap) {
        long __functionAddress = Functions.PassBuilderOptionsSetLicmMssaNoAccForPromotionCap;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, LicmMssaNoAccForPromotionCap, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetCallGraphProfile ] ---

    /** {@code void LLVMPassBuilderOptionsSetCallGraphProfile(LLVMPassBuilderOptionsRef Options, LLVMBool CallGraphProfile)} */
    public static void LLVMPassBuilderOptionsSetCallGraphProfile(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean CallGraphProfile) {
        long __functionAddress = Functions.PassBuilderOptionsSetCallGraphProfile;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, CallGraphProfile ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetMergeFunctions ] ---

    /** {@code void LLVMPassBuilderOptionsSetMergeFunctions(LLVMPassBuilderOptionsRef Options, LLVMBool MergeFunctions)} */
    public static void LLVMPassBuilderOptionsSetMergeFunctions(@NativeType("LLVMPassBuilderOptionsRef") long Options, @NativeType("LLVMBool") boolean MergeFunctions) {
        long __functionAddress = Functions.PassBuilderOptionsSetMergeFunctions;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, MergeFunctions ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassBuilderOptionsSetInlinerThreshold ] ---

    /** {@code void LLVMPassBuilderOptionsSetInlinerThreshold(LLVMPassBuilderOptionsRef Options, int Threshold)} */
    public static void LLVMPassBuilderOptionsSetInlinerThreshold(@NativeType("LLVMPassBuilderOptionsRef") long Options, int Threshold) {
        long __functionAddress = Functions.PassBuilderOptionsSetInlinerThreshold;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, Threshold, __functionAddress);
    }

    // --- [ LLVMDisposePassBuilderOptions ] ---

    /** {@code void LLVMDisposePassBuilderOptions(LLVMPassBuilderOptionsRef Options)} */
    public static void LLVMDisposePassBuilderOptions(@NativeType("LLVMPassBuilderOptionsRef") long Options) {
        long __functionAddress = Functions.DisposePassBuilderOptions;
        if (CHECKS) {
            check(__functionAddress);
            check(Options);
        }
        invokePV(Options, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderCreate ] ---

    /** {@code LLVMPassManagerBuilderRef LLVMPassManagerBuilderCreate(void)} */
    @NativeType("LLVMPassManagerBuilderRef")
    public static long LLVMPassManagerBuilderCreate() {
        long __functionAddress = Functions.PassManagerBuilderCreate;
        if (CHECKS) {
            check(__functionAddress);
        }
        return invokeP(__functionAddress);
    }

    // --- [ LLVMPassManagerBuilderDispose ] ---

    /** {@code void LLVMPassManagerBuilderDispose(LLVMPassManagerBuilderRef PMB)} */
    public static void LLVMPassManagerBuilderDispose(@NativeType("LLVMPassManagerBuilderRef") long PMB) {
        long __functionAddress = Functions.PassManagerBuilderDispose;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetOptLevel ] ---

    /** {@code void LLVMPassManagerBuilderSetOptLevel(LLVMPassManagerBuilderRef PMB, unsigned int OptLevel)} */
    public static void LLVMPassManagerBuilderSetOptLevel(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("unsigned int") int OptLevel) {
        long __functionAddress = Functions.PassManagerBuilderSetOptLevel;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, OptLevel, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetSizeLevel ] ---

    /** {@code void LLVMPassManagerBuilderSetSizeLevel(LLVMPassManagerBuilderRef PMB, unsigned int SizeLevel)} */
    public static void LLVMPassManagerBuilderSetSizeLevel(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("unsigned int") int SizeLevel) {
        long __functionAddress = Functions.PassManagerBuilderSetSizeLevel;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, SizeLevel, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetDisableUnitAtATime ] ---

    /** {@code void LLVMPassManagerBuilderSetDisableUnitAtATime(LLVMPassManagerBuilderRef PMB, LLVMBool Value)} */
    public static void LLVMPassManagerBuilderSetDisableUnitAtATime(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMBool") boolean Value) {
        long __functionAddress = Functions.PassManagerBuilderSetDisableUnitAtATime;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, Value ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetDisableUnrollLoops ] ---

    /** {@code void LLVMPassManagerBuilderSetDisableUnrollLoops(LLVMPassManagerBuilderRef PMB, LLVMBool Value)} */
    public static void LLVMPassManagerBuilderSetDisableUnrollLoops(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMBool") boolean Value) {
        long __functionAddress = Functions.PassManagerBuilderSetDisableUnrollLoops;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, Value ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetDisableSimplifyLibCalls ] ---

    /** {@code void LLVMPassManagerBuilderSetDisableSimplifyLibCalls(LLVMPassManagerBuilderRef PMB, LLVMBool Value)} */
    public static void LLVMPassManagerBuilderSetDisableSimplifyLibCalls(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMBool") boolean Value) {
        long __functionAddress = Functions.PassManagerBuilderSetDisableSimplifyLibCalls;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, Value ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderUseInlinerWithThreshold ] ---

    /** {@code void LLVMPassManagerBuilderUseInlinerWithThreshold(LLVMPassManagerBuilderRef PMB, unsigned int Threshold)} */
    public static void LLVMPassManagerBuilderUseInlinerWithThreshold(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("unsigned int") int Threshold) {
        long __functionAddress = Functions.PassManagerBuilderUseInlinerWithThreshold;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
        }
        invokePV(PMB, Threshold, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderPopulateFunctionPassManager ] ---

    /** {@code void LLVMPassManagerBuilderPopulateFunctionPassManager(LLVMPassManagerBuilderRef PMB, LLVMPassManagerRef PM)} */
    public static void LLVMPassManagerBuilderPopulateFunctionPassManager(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.PassManagerBuilderPopulateFunctionPassManager;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
            check(PM);
        }
        invokePPV(PMB, PM, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderPopulateModulePassManager ] ---

    /** {@code void LLVMPassManagerBuilderPopulateModulePassManager(LLVMPassManagerBuilderRef PMB, LLVMPassManagerRef PM)} */
    public static void LLVMPassManagerBuilderPopulateModulePassManager(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.PassManagerBuilderPopulateModulePassManager;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
            check(PM);
        }
        invokePPV(PMB, PM, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderPopulateLTOPassManager ] ---

    /** {@code void LLVMPassManagerBuilderPopulateLTOPassManager(LLVMPassManagerBuilderRef PMB, LLVMPassManagerRef PM, LLVMBool Internalize, LLVMBool RunInliner)} */
    public static void LLVMPassManagerBuilderPopulateLTOPassManager(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMPassManagerRef") long PM, @NativeType("LLVMBool") boolean Internalize, @NativeType("LLVMBool") boolean RunInliner) {
        long __functionAddress = Functions.PassManagerBuilderPopulateLTOPassManager;
        if (CHECKS) {
            check(__functionAddress);
            check(PMB);
            check(PM);
        }
        invokePPV(PMB, PM, Internalize ? 1 : 0, RunInliner ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMAddAggressiveDCEPass ] ---

    /** {@code void LLVMAddAggressiveDCEPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddAggressiveDCEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAggressiveDCEPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddDCEPass ] ---

    /** {@code void LLVMAddDCEPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddDCEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddDCEPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddBitTrackingDCEPass ] ---

    /** {@code void LLVMAddBitTrackingDCEPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddBitTrackingDCEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddBitTrackingDCEPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddAlignmentFromAssumptionsPass ] ---

    /** {@code void LLVMAddAlignmentFromAssumptionsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddAlignmentFromAssumptionsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAlignmentFromAssumptionsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCFGSimplificationPass ] ---

    /** {@code void LLVMAddCFGSimplificationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddCFGSimplificationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCFGSimplificationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddDeadStoreEliminationPass ] ---

    /** {@code void LLVMAddDeadStoreEliminationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddDeadStoreEliminationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddDeadStoreEliminationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarizerPass ] ---

    /** {@code void LLVMAddScalarizerPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddScalarizerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScalarizerPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddMergedLoadStoreMotionPass ] ---

    /** {@code void LLVMAddMergedLoadStoreMotionPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddMergedLoadStoreMotionPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddMergedLoadStoreMotionPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddGVNPass ] ---

    /** {@code void LLVMAddGVNPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddGVNPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddGVNPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddNewGVNPass ] ---

    /** {@code void LLVMAddNewGVNPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddNewGVNPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddNewGVNPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddIndVarSimplifyPass ] ---

    /** {@code void LLVMAddIndVarSimplifyPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddIndVarSimplifyPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddIndVarSimplifyPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddJumpThreadingPass ] ---

    /** {@code void LLVMAddJumpThreadingPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddJumpThreadingPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddJumpThreadingPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLICMPass ] ---

    /** {@code void LLVMAddLICMPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLICMPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLICMPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopDeletionPass ] ---

    /** {@code void LLVMAddLoopDeletionPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopDeletionPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopDeletionPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopIdiomPass ] ---

    /** {@code void LLVMAddLoopIdiomPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopIdiomPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopIdiomPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopRotatePass ] ---

    /** {@code void LLVMAddLoopRotatePass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopRotatePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopRotatePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopRerollPass ] ---

    /** {@code void LLVMAddLoopRerollPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopRerollPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopRerollPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopUnrollPass ] ---

    /** {@code void LLVMAddLoopUnrollPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopUnrollPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopUnrollPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopUnrollAndJamPass ] ---

    /** {@code void LLVMAddLoopUnrollAndJamPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopUnrollAndJamPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopUnrollAndJamPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopUnswitchPass ] ---

    /** {@code void LLVMAddLoopUnswitchPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopUnswitchPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopUnswitchPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLowerAtomicPass ] ---

    /** {@code void LLVMAddLowerAtomicPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLowerAtomicPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLowerAtomicPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddMemCpyOptPass ] ---

    /** {@code void LLVMAddMemCpyOptPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddMemCpyOptPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddMemCpyOptPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddPartiallyInlineLibCallsPass ] ---

    /** {@code void LLVMAddPartiallyInlineLibCallsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddPartiallyInlineLibCallsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddPartiallyInlineLibCallsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddReassociatePass ] ---

    /** {@code void LLVMAddReassociatePass(LLVMPassManagerRef PM)} */
    public static void LLVMAddReassociatePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddReassociatePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddSCCPPass ] ---

    /** {@code void LLVMAddSCCPPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddSCCPPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddSCCPPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarReplAggregatesPass ] ---

    /** {@code void LLVMAddScalarReplAggregatesPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddScalarReplAggregatesPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScalarReplAggregatesPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarReplAggregatesPassSSA ] ---

    /** {@code void LLVMAddScalarReplAggregatesPassSSA(LLVMPassManagerRef PM)} */
    public static void LLVMAddScalarReplAggregatesPassSSA(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScalarReplAggregatesPassSSA;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarReplAggregatesPassWithThreshold ] ---

    /** {@code void LLVMAddScalarReplAggregatesPassWithThreshold(LLVMPassManagerRef PM, int Threshold)} */
    public static void LLVMAddScalarReplAggregatesPassWithThreshold(@NativeType("LLVMPassManagerRef") long PM, int Threshold) {
        long __functionAddress = Functions.AddScalarReplAggregatesPassWithThreshold;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, Threshold, __functionAddress);
    }

    // --- [ LLVMAddSimplifyLibCallsPass ] ---

    /** {@code void LLVMAddSimplifyLibCallsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddSimplifyLibCallsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddSimplifyLibCallsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddTailCallEliminationPass ] ---

    /** {@code void LLVMAddTailCallEliminationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddTailCallEliminationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddTailCallEliminationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddConstantPropagationPass ] ---

    /** {@code void LLVMAddConstantPropagationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddConstantPropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddConstantPropagationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddDemoteMemoryToRegisterPass ] ---

    /** {@code void LLVMAddDemoteMemoryToRegisterPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddDemoteMemoryToRegisterPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddDemoteMemoryToRegisterPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddVerifierPass ] ---

    /** {@code void LLVMAddVerifierPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddVerifierPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddVerifierPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCorrelatedValuePropagationPass ] ---

    /** {@code void LLVMAddCorrelatedValuePropagationPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddCorrelatedValuePropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCorrelatedValuePropagationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddEarlyCSEPass ] ---

    /** {@code void LLVMAddEarlyCSEPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddEarlyCSEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddEarlyCSEPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddEarlyCSEMemSSAPass ] ---

    /** {@code void LLVMAddEarlyCSEMemSSAPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddEarlyCSEMemSSAPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddEarlyCSEMemSSAPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLowerExpectIntrinsicPass ] ---

    /** {@code void LLVMAddLowerExpectIntrinsicPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLowerExpectIntrinsicPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLowerExpectIntrinsicPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLowerConstantIntrinsicsPass ] ---

    /** {@code void LLVMAddLowerConstantIntrinsicsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLowerConstantIntrinsicsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLowerConstantIntrinsicsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddTypeBasedAliasAnalysisPass ] ---

    /** {@code void LLVMAddTypeBasedAliasAnalysisPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddTypeBasedAliasAnalysisPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddTypeBasedAliasAnalysisPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScopedNoAliasAAPass ] ---

    /** {@code void LLVMAddScopedNoAliasAAPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddScopedNoAliasAAPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScopedNoAliasAAPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddBasicAliasAnalysisPass ] ---

    /** {@code void LLVMAddBasicAliasAnalysisPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddBasicAliasAnalysisPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddBasicAliasAnalysisPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddUnifyFunctionExitNodesPass ] ---

    /** {@code void LLVMAddUnifyFunctionExitNodesPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddUnifyFunctionExitNodesPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddUnifyFunctionExitNodesPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLowerSwitchPass ] ---

    /** {@code void LLVMAddLowerSwitchPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLowerSwitchPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLowerSwitchPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddPromoteMemoryToRegisterPass ] ---

    /** {@code void LLVMAddPromoteMemoryToRegisterPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddPromoteMemoryToRegisterPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddPromoteMemoryToRegisterPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddAddDiscriminatorsPass ] ---

    /** {@code void LLVMAddAddDiscriminatorsPass(LLVMPassManagerRef PM)} */
    public static void LLVMAddAddDiscriminatorsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAddDiscriminatorsPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopVectorizePass ] ---

    /** {@code void LLVMAddLoopVectorizePass(LLVMPassManagerRef PM)} */
    public static void LLVMAddLoopVectorizePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopVectorizePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddSLPVectorizePass ] ---

    /** {@code void LLVMAddSLPVectorizePass(LLVMPassManagerRef PM)} */
    public static void LLVMAddSLPVectorizePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddSLPVectorizePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

}