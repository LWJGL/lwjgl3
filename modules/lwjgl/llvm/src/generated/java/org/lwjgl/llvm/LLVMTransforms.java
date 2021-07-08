/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

public class LLVMTransforms {

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AddAggressiveInstCombinerPass                 = LLVMCore.getLibrary().getFunctionAddress("LLVMAddAggressiveInstCombinerPass"),
            AddCoroEarlyPass                              = LLVMCore.getLibrary().getFunctionAddress("LLVMAddCoroEarlyPass"),
            AddCoroSplitPass                              = LLVMCore.getLibrary().getFunctionAddress("LLVMAddCoroSplitPass"),
            AddCoroElidePass                              = LLVMCore.getLibrary().getFunctionAddress("LLVMAddCoroElidePass"),
            AddCoroCleanupPass                            = LLVMCore.getLibrary().getFunctionAddress("LLVMAddCoroCleanupPass"),
            AddInstructionCombiningPass                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddInstructionCombiningPass"),
            AddArgumentPromotionPass                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddArgumentPromotionPass"),
            AddConstantMergePass                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddConstantMergePass"),
            AddCalledValuePropagationPass                 = LLVMCore.getLibrary().getFunctionAddress("LLVMAddCalledValuePropagationPass"),
            AddDeadArgEliminationPass                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddDeadArgEliminationPass"),
            AddFunctionAttrsPass                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddFunctionAttrsPass"),
            AddFunctionInliningPass                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddFunctionInliningPass"),
            AddAlwaysInlinerPass                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddAlwaysInlinerPass"),
            AddGlobalDCEPass                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddGlobalDCEPass"),
            AddGlobalOptimizerPass                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddGlobalOptimizerPass"),
            AddIPConstantPropagationPass                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddIPConstantPropagationPass"),
            AddPruneEHPass                                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddPruneEHPass"),
            AddIPSCCPPass                                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddIPSCCPPass"),
            AddInternalizePass                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddInternalizePass"),
            AddStripDeadPrototypesPass                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddStripDeadPrototypesPass"),
            AddStripSymbolsPass                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddStripSymbolsPass"),
            PassManagerBuilderCreate                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderCreate"),
            PassManagerBuilderDispose                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderDispose"),
            PassManagerBuilderSetOptLevel                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetOptLevel"),
            PassManagerBuilderSetSizeLevel                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetSizeLevel"),
            PassManagerBuilderSetDisableUnitAtATime       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetDisableUnitAtATime"),
            PassManagerBuilderSetDisableUnrollLoops       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetDisableUnrollLoops"),
            PassManagerBuilderSetDisableSimplifyLibCalls  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderSetDisableSimplifyLibCalls"),
            PassManagerBuilderUseInlinerWithThreshold     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderUseInlinerWithThreshold"),
            PassManagerBuilderPopulateFunctionPassManager = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderPopulateFunctionPassManager"),
            PassManagerBuilderPopulateModulePassManager   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderPopulateModulePassManager"),
            PassManagerBuilderPopulateLTOPassManager      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMPassManagerBuilderPopulateLTOPassManager"),
            AddAggressiveDCEPass                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddAggressiveDCEPass"),
            AddBitTrackingDCEPass                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddBitTrackingDCEPass"),
            AddAlignmentFromAssumptionsPass               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddAlignmentFromAssumptionsPass"),
            AddCFGSimplificationPass                      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddCFGSimplificationPass"),
            AddDeadStoreEliminationPass                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddDeadStoreEliminationPass"),
            AddScalarizerPass                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddScalarizerPass"),
            AddMergedLoadStoreMotionPass                  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddMergedLoadStoreMotionPass"),
            AddGVNPass                                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddGVNPass"),
            AddNewGVNPass                                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddNewGVNPass"),
            AddIndVarSimplifyPass                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddIndVarSimplifyPass"),
            AddJumpThreadingPass                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddJumpThreadingPass"),
            AddLICMPass                                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLICMPass"),
            AddLoopDeletionPass                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLoopDeletionPass"),
            AddLoopIdiomPass                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLoopIdiomPass"),
            AddLoopRotatePass                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLoopRotatePass"),
            AddLoopRerollPass                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLoopRerollPass"),
            AddLoopUnrollPass                             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLoopUnrollPass"),
            AddLoopUnrollAndJamPass                       = LLVMCore.getLibrary().getFunctionAddress("LLVMAddLoopUnrollAndJamPass"),
            AddLoopUnswitchPass                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLoopUnswitchPass"),
            AddLowerAtomicPass                            = LLVMCore.getLibrary().getFunctionAddress("LLVMAddLowerAtomicPass"),
            AddMemCpyOptPass                              = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddMemCpyOptPass"),
            AddPartiallyInlineLibCallsPass                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddPartiallyInlineLibCallsPass"),
            AddReassociatePass                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddReassociatePass"),
            AddSCCPPass                                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddSCCPPass"),
            AddScalarReplAggregatesPass                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddScalarReplAggregatesPass"),
            AddScalarReplAggregatesPassSSA                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddScalarReplAggregatesPassSSA"),
            AddScalarReplAggregatesPassWithThreshold      = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddScalarReplAggregatesPassWithThreshold"),
            AddSimplifyLibCallsPass                       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddSimplifyLibCallsPass"),
            AddTailCallEliminationPass                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddTailCallEliminationPass"),
            AddConstantPropagationPass                    = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddConstantPropagationPass"),
            AddDemoteMemoryToRegisterPass                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddDemoteMemoryToRegisterPass"),
            AddVerifierPass                               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddVerifierPass"),
            AddCorrelatedValuePropagationPass             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddCorrelatedValuePropagationPass"),
            AddEarlyCSEPass                               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddEarlyCSEPass"),
            AddEarlyCSEMemSSAPass                         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddEarlyCSEMemSSAPass"),
            AddLowerExpectIntrinsicPass                   = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLowerExpectIntrinsicPass"),
            AddTypeBasedAliasAnalysisPass                 = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddTypeBasedAliasAnalysisPass"),
            AddScopedNoAliasAAPass                        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddScopedNoAliasAAPass"),
            AddBasicAliasAnalysisPass                     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddBasicAliasAnalysisPass"),
            AddUnifyFunctionExitNodesPass                 = LLVMCore.getLibrary().getFunctionAddress("LLVMAddUnifyFunctionExitNodesPass"),
            AddLowerSwitchPass                            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLowerSwitchPass"),
            AddPromoteMemoryToRegisterPass                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddPromoteMemoryToRegisterPass"),
            AddLoopVectorizePass                          = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddLoopVectorizePass"),
            AddSLPVectorizePass                           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMAddSLPVectorizePass");

    }

    protected LLVMTransforms() {
        throw new UnsupportedOperationException();
    }

    // --- [ LLVMAddAggressiveInstCombinerPass ] ---

    /** See {@code llvm::createAggressiveInstCombinerPass} function. */
    public static void LLVMAddAggressiveInstCombinerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAggressiveInstCombinerPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroEarlyPass ] ---

    /** See {@code llvm::createCoroEarlyPass} function. */
    public static void LLVMAddCoroEarlyPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroEarlyPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroSplitPass ] ---

    /** See {@code llvm::createCoroSplitPass} function. */
    public static void LLVMAddCoroSplitPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroSplitPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroElidePass ] ---

    /** See {@code llvm::createCoroElidePass} function. */
    public static void LLVMAddCoroElidePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroElidePass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCoroCleanupPass ] ---

    /** See {@code llvm::createCoroCleanupPass} function. */
    public static void LLVMAddCoroCleanupPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCoroCleanupPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddInstructionCombiningPass ] ---

    /** See {@code llvm::createInstructionCombiningPass} function. */
    public static void LLVMAddInstructionCombiningPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddInstructionCombiningPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddArgumentPromotionPass ] ---

    /** See {@code llvm::createArgumentPromotionPass} function. */
    public static void LLVMAddArgumentPromotionPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddArgumentPromotionPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddConstantMergePass ] ---

    /** See {@code llvm::createConstantMergePass} function. */
    public static void LLVMAddConstantMergePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddConstantMergePass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCalledValuePropagationPass ] ---

    /** See {@code llvm::createCalledValuePropagationPass} function. */
    public static void LLVMAddCalledValuePropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCalledValuePropagationPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddDeadArgEliminationPass ] ---

    /** See {@code llvm::createDeadArgEliminationPass} function. */
    public static void LLVMAddDeadArgEliminationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddDeadArgEliminationPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddFunctionAttrsPass ] ---

    /** See {@code llvm::createFunctionAttrsPass} function. */
    public static void LLVMAddFunctionAttrsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddFunctionAttrsPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddFunctionInliningPass ] ---

    /** See {@code llvm::createFunctionInliningPass} function. */
    public static void LLVMAddFunctionInliningPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddFunctionInliningPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddAlwaysInlinerPass ] ---

    /** See {@code llvm::createAlwaysInlinerPass} function. */
    public static void LLVMAddAlwaysInlinerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAlwaysInlinerPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddGlobalDCEPass ] ---

    /** See {@code llvm::createGlobalDCEPass} function. */
    public static void LLVMAddGlobalDCEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddGlobalDCEPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddGlobalOptimizerPass ] ---

    /** See {@code llvm::createGlobalOptimizerPass} function. */
    public static void LLVMAddGlobalOptimizerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddGlobalOptimizerPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddIPConstantPropagationPass ] ---

    /** See {@code llvm::createIPConstantPropagationPass} function. */
    public static void LLVMAddIPConstantPropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddIPConstantPropagationPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddPruneEHPass ] ---

    /** See {@code llvm::createPruneEHPass} function. */
    public static void LLVMAddPruneEHPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddPruneEHPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddIPSCCPPass ] ---

    /** See {@code llvm::createIPSCCPPass} function. */
    public static void LLVMAddIPSCCPPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddIPSCCPPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddInternalizePass ] ---

    /** See {@code llvm::createInternalizePass} function. */
    public static void LLVMAddInternalizePass(@NativeType("LLVMPassManagerRef") long PM, @NativeType("unsigned int") int AllButMain) {
        long __functionAddress = Functions.AddInternalizePass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, AllButMain, __functionAddress);
    }

    // --- [ LLVMAddStripDeadPrototypesPass ] ---

    /** See {@code llvm::createStripDeadPrototypesPass} function. */
    public static void LLVMAddStripDeadPrototypesPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddStripDeadPrototypesPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddStripSymbolsPass ] ---

    /** See {@code llvm::createStripSymbolsPass} function. */
    public static void LLVMAddStripSymbolsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddStripSymbolsPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderCreate ] ---

    /** See {@code llvm::PassManagerBuilder}. */
    @NativeType("LLVMPassManagerBuilderRef")
    public static long LLVMPassManagerBuilderCreate() {
        long __functionAddress = Functions.PassManagerBuilderCreate;
        return invokeP(__functionAddress);
    }

    // --- [ LLVMPassManagerBuilderDispose ] ---

    public static void LLVMPassManagerBuilderDispose(@NativeType("LLVMPassManagerBuilderRef") long PMB) {
        long __functionAddress = Functions.PassManagerBuilderDispose;
        if (CHECKS) {
            check(PMB);
        }
        invokePV(PMB, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetOptLevel ] ---

    /** See {@code llvm::PassManagerBuilder::OptLevel}. */
    public static void LLVMPassManagerBuilderSetOptLevel(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("unsigned int") int OptLevel) {
        long __functionAddress = Functions.PassManagerBuilderSetOptLevel;
        if (CHECKS) {
            check(PMB);
        }
        invokePV(PMB, OptLevel, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetSizeLevel ] ---

    /** See {@code llvm::PassManagerBuilder::SizeLevel}. */
    public static void LLVMPassManagerBuilderSetSizeLevel(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("unsigned int") int SizeLevel) {
        long __functionAddress = Functions.PassManagerBuilderSetSizeLevel;
        if (CHECKS) {
            check(PMB);
        }
        invokePV(PMB, SizeLevel, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetDisableUnitAtATime ] ---

    /** See {@code llvm::PassManagerBuilder::DisableUnitAtATime}. */
    public static void LLVMPassManagerBuilderSetDisableUnitAtATime(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMBool") boolean Value) {
        long __functionAddress = Functions.PassManagerBuilderSetDisableUnitAtATime;
        if (CHECKS) {
            check(PMB);
        }
        invokePV(PMB, Value ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetDisableUnrollLoops ] ---

    /** See {@code llvm::PassManagerBuilder::DisableUnrollLoops}. */
    public static void LLVMPassManagerBuilderSetDisableUnrollLoops(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMBool") boolean Value) {
        long __functionAddress = Functions.PassManagerBuilderSetDisableUnrollLoops;
        if (CHECKS) {
            check(PMB);
        }
        invokePV(PMB, Value ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderSetDisableSimplifyLibCalls ] ---

    /** See {@code llvm::PassManagerBuilder::DisableSimplifyLibCalls} */
    public static void LLVMPassManagerBuilderSetDisableSimplifyLibCalls(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMBool") boolean Value) {
        long __functionAddress = Functions.PassManagerBuilderSetDisableSimplifyLibCalls;
        if (CHECKS) {
            check(PMB);
        }
        invokePV(PMB, Value ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderUseInlinerWithThreshold ] ---

    /** See {@code llvm::PassManagerBuilder::Inliner}. */
    public static void LLVMPassManagerBuilderUseInlinerWithThreshold(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("unsigned int") int Threshold) {
        long __functionAddress = Functions.PassManagerBuilderUseInlinerWithThreshold;
        if (CHECKS) {
            check(PMB);
        }
        invokePV(PMB, Threshold, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderPopulateFunctionPassManager ] ---

    /** See {@code llvm::PassManagerBuilder::populateFunctionPassManager}. */
    public static void LLVMPassManagerBuilderPopulateFunctionPassManager(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.PassManagerBuilderPopulateFunctionPassManager;
        if (CHECKS) {
            check(PMB);
            check(PM);
        }
        invokePPV(PMB, PM, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderPopulateModulePassManager ] ---

    /** See {@code llvm::PassManagerBuilder::populateModulePassManager}. */
    public static void LLVMPassManagerBuilderPopulateModulePassManager(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.PassManagerBuilderPopulateModulePassManager;
        if (CHECKS) {
            check(PMB);
            check(PM);
        }
        invokePPV(PMB, PM, __functionAddress);
    }

    // --- [ LLVMPassManagerBuilderPopulateLTOPassManager ] ---

    /** See {@code llvm::PassManagerBuilder::populateLTOPassManager}. */
    public static void LLVMPassManagerBuilderPopulateLTOPassManager(@NativeType("LLVMPassManagerBuilderRef") long PMB, @NativeType("LLVMPassManagerRef") long PM, @NativeType("LLVMBool") boolean Internalize, @NativeType("LLVMBool") boolean RunInliner) {
        long __functionAddress = Functions.PassManagerBuilderPopulateLTOPassManager;
        if (CHECKS) {
            check(PMB);
            check(PM);
        }
        invokePPV(PMB, PM, Internalize ? 1 : 0, RunInliner ? 1 : 0, __functionAddress);
    }

    // --- [ LLVMAddAggressiveDCEPass ] ---

    /** See {@code llvm::createAggressiveDCEPass} function. */
    public static void LLVMAddAggressiveDCEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAggressiveDCEPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddBitTrackingDCEPass ] ---

    /** See {@code llvm::createBitTrackingDCEPass} function. */
    public static void LLVMAddBitTrackingDCEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddBitTrackingDCEPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddAlignmentFromAssumptionsPass ] ---

    /** See {@code llvm::createAlignmentFromAssumptionsPass} function. */
    public static void LLVMAddAlignmentFromAssumptionsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddAlignmentFromAssumptionsPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCFGSimplificationPass ] ---

    /** See {@code llvm::createCFGSimplificationPass} function. */
    public static void LLVMAddCFGSimplificationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCFGSimplificationPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddDeadStoreEliminationPass ] ---

    /** See {@code llvm::createDeadStoreEliminationPass} function. */
    public static void LLVMAddDeadStoreEliminationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddDeadStoreEliminationPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarizerPass ] ---

    /** See {@code llvm::createScalarizerPass} function. */
    public static void LLVMAddScalarizerPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScalarizerPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddMergedLoadStoreMotionPass ] ---

    /** See {@code llvm::createMergedLoadStoreMotionPass} function. */
    public static void LLVMAddMergedLoadStoreMotionPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddMergedLoadStoreMotionPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddGVNPass ] ---

    /** See {@code llvm::createGVNPass} function. */
    public static void LLVMAddGVNPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddGVNPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddNewGVNPass ] ---

    /** See {@code llvm::createGVNPass} function. */
    public static void LLVMAddNewGVNPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddNewGVNPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddIndVarSimplifyPass ] ---

    /** See {@code llvm::createIndVarSimplifyPass} function. */
    public static void LLVMAddIndVarSimplifyPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddIndVarSimplifyPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddJumpThreadingPass ] ---

    /** See {@code llvm::createJumpThreadingPass} function. */
    public static void LLVMAddJumpThreadingPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddJumpThreadingPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLICMPass ] ---

    /** See {@code llvm::createLICMPass} function. */
    public static void LLVMAddLICMPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLICMPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopDeletionPass ] ---

    /** See {@code llvm::createLoopDeletionPass} function. */
    public static void LLVMAddLoopDeletionPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopDeletionPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopIdiomPass ] ---

    /** See {@code llvm::createLoopIdiomPass} function */
    public static void LLVMAddLoopIdiomPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopIdiomPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopRotatePass ] ---

    /** See {@code llvm::createLoopRotatePass} function. */
    public static void LLVMAddLoopRotatePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopRotatePass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopRerollPass ] ---

    /** See {@code llvm::createLoopRerollPass} function. */
    public static void LLVMAddLoopRerollPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopRerollPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopUnrollPass ] ---

    /** See {@code llvm::createLoopUnrollPass} function. */
    public static void LLVMAddLoopUnrollPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopUnrollPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopUnrollAndJamPass ] ---

    /** See {@code llvm::createLoopUnrollAndJamPass} function. */
    public static void LLVMAddLoopUnrollAndJamPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopUnrollAndJamPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopUnswitchPass ] ---

    /** See {@code llvm::createLoopUnswitchPass} function. */
    public static void LLVMAddLoopUnswitchPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopUnswitchPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLowerAtomicPass ] ---

    /** See {@code llvm::createLowerAtomicPass} function. */
    public static void LLVMAddLowerAtomicPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLowerAtomicPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddMemCpyOptPass ] ---

    /** See {@code llvm::createMemCpyOptPass} function. */
    public static void LLVMAddMemCpyOptPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddMemCpyOptPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddPartiallyInlineLibCallsPass ] ---

    /** See {@code llvm::createPartiallyInlineLibCallsPass} function. */
    public static void LLVMAddPartiallyInlineLibCallsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddPartiallyInlineLibCallsPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddReassociatePass ] ---

    /** See {@code llvm::createReassociatePass} function. */
    public static void LLVMAddReassociatePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddReassociatePass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddSCCPPass ] ---

    /** See {@code llvm::createSCCPPass} function. */
    public static void LLVMAddSCCPPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddSCCPPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarReplAggregatesPass ] ---

    /** See {@code llvm::createSROAPass} function. */
    public static void LLVMAddScalarReplAggregatesPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScalarReplAggregatesPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarReplAggregatesPassSSA ] ---

    /** See {@code llvm::createSROAPass} function. */
    public static void LLVMAddScalarReplAggregatesPassSSA(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScalarReplAggregatesPassSSA;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScalarReplAggregatesPassWithThreshold ] ---

    /** See {@code llvm::createSROAPass} function. */
    public static void LLVMAddScalarReplAggregatesPassWithThreshold(@NativeType("LLVMPassManagerRef") long PM, int Threshold) {
        long __functionAddress = Functions.AddScalarReplAggregatesPassWithThreshold;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, Threshold, __functionAddress);
    }

    // --- [ LLVMAddSimplifyLibCallsPass ] ---

    /** See {@code llvm::createSimplifyLibCallsPass} function. */
    public static void LLVMAddSimplifyLibCallsPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddSimplifyLibCallsPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddTailCallEliminationPass ] ---

    /** See {@code llvm::createTailCallEliminationPass} function. */
    public static void LLVMAddTailCallEliminationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddTailCallEliminationPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddConstantPropagationPass ] ---

    /** See {@code llvm::createConstantPropagationPass} function. */
    public static void LLVMAddConstantPropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddConstantPropagationPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddDemoteMemoryToRegisterPass ] ---

    /** See {@code llvm::demotePromoteMemoryToRegisterPass} function. */
    public static void LLVMAddDemoteMemoryToRegisterPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddDemoteMemoryToRegisterPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddVerifierPass ] ---

    /** See {@code llvm::createVerifierPass} function. */
    public static void LLVMAddVerifierPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddVerifierPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddCorrelatedValuePropagationPass ] ---

    /** See {@code llvm::createCorrelatedValuePropagationPass} function */
    public static void LLVMAddCorrelatedValuePropagationPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddCorrelatedValuePropagationPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddEarlyCSEPass ] ---

    /** See {@code llvm::createEarlyCSEPass} function */
    public static void LLVMAddEarlyCSEPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddEarlyCSEPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddEarlyCSEMemSSAPass ] ---

    /** See {@code llvm::createEarlyCSEPass} function */
    public static void LLVMAddEarlyCSEMemSSAPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddEarlyCSEMemSSAPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLowerExpectIntrinsicPass ] ---

    /** See {@code llvm::createLowerExpectIntrinsicPass} function */
    public static void LLVMAddLowerExpectIntrinsicPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLowerExpectIntrinsicPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddTypeBasedAliasAnalysisPass ] ---

    /** See {@code llvm::createTypeBasedAliasAnalysisPass} function */
    public static void LLVMAddTypeBasedAliasAnalysisPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddTypeBasedAliasAnalysisPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddScopedNoAliasAAPass ] ---

    /** See {@code llvm::createScopedNoAliasAAPass} function */
    public static void LLVMAddScopedNoAliasAAPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddScopedNoAliasAAPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddBasicAliasAnalysisPass ] ---

    /** See {@code llvm::createBasicAliasAnalysisPass} function */
    public static void LLVMAddBasicAliasAnalysisPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddBasicAliasAnalysisPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddUnifyFunctionExitNodesPass ] ---

    /** See {@code llvm::createUnifyFunctionExitNodesPass} function */
    public static void LLVMAddUnifyFunctionExitNodesPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddUnifyFunctionExitNodesPass;
        if (CHECKS) {
            check(__functionAddress);
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLowerSwitchPass ] ---

    /** See {@code llvm::createLowerSwitchPass} function. */
    public static void LLVMAddLowerSwitchPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLowerSwitchPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddPromoteMemoryToRegisterPass ] ---

    /** See {@code llvm::createPromoteMemoryToRegisterPass} function. */
    public static void LLVMAddPromoteMemoryToRegisterPass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddPromoteMemoryToRegisterPass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddLoopVectorizePass ] ---

    /** See {@code llvm::createLoopVectorizePass} function. */
    public static void LLVMAddLoopVectorizePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddLoopVectorizePass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

    // --- [ LLVMAddSLPVectorizePass ] ---

    /** See {@code llvm::createSLPVectorizerPass} function. */
    public static void LLVMAddSLPVectorizePass(@NativeType("LLVMPassManagerRef") long PM) {
        long __functionAddress = Functions.AddSLPVectorizePass;
        if (CHECKS) {
            check(PM);
        }
        invokePV(PM, __functionAddress);
    }

}