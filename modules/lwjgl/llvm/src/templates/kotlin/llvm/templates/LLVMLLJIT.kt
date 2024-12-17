/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMLLJIT = "LLVMLLJIT".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    LLVMOrcLLJITBuilderRef(
        "OrcCreateLLJITBuilder",

        void()
    )

    void(
        "OrcDisposeLLJITBuilder",

        LLVMOrcLLJITBuilderRef("Builder")
    )

    void(
        "OrcLLJITBuilderSetJITTargetMachineBuilder",

        LLVMOrcLLJITBuilderRef("Builder"),
        LLVMOrcJITTargetMachineBuilderRef("JTMB")
    )

    void(
        "OrcLLJITBuilderSetObjectLinkingLayerCreator",

        LLVMOrcLLJITBuilderRef("Builder"),
        LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunction("F"),
        opaque_p("Ctx")
    )

    LLVMErrorRef(
        "OrcCreateLLJIT",

        Check(1)..LLVMOrcLLJITRef.p("Result"),
        LLVMOrcLLJITBuilderRef("Builder")
    )

    LLVMErrorRef(
        "OrcDisposeLLJIT",

        LLVMOrcLLJITRef("J")
    )

    LLVMOrcExecutionSessionRef(
        "OrcLLJITGetExecutionSession",

        LLVMOrcLLJITRef("J")
    )

    LLVMOrcJITDylibRef(
        "OrcLLJITGetMainJITDylib",

        LLVMOrcLLJITRef("J")
    )

    charUTF8.const.p(
        "OrcLLJITGetTripleString",

        LLVMOrcLLJITRef("J")
    )

    char(
        "OrcLLJITGetGlobalPrefix",

        LLVMOrcLLJITRef("J")
    )

    LLVMOrcSymbolStringPoolEntryRef(
        "OrcLLJITMangleAndIntern",

        LLVMOrcLLJITRef("J"),
        charUTF8.const.p("UnmangledName")
    )

    LLVMErrorRef(
        "OrcLLJITAddObjectFile",

        LLVMOrcLLJITRef("J"),
        LLVMOrcJITDylibRef("JD"),
        LLVMMemoryBufferRef("ObjBuffer")
    )

    LLVMErrorRef(
        "OrcLLJITAddObjectFileWithRT",

        LLVMOrcLLJITRef("J"),
        LLVMOrcResourceTrackerRef("RT"),
        LLVMMemoryBufferRef("ObjBuffer")
    )

    LLVMErrorRef(
        "OrcLLJITAddLLVMIRModule",

        LLVMOrcLLJITRef("J"),
        LLVMOrcJITDylibRef("JD"),
        LLVMOrcThreadSafeModuleRef("TSM")
    )

    LLVMErrorRef(
        "OrcLLJITAddLLVMIRModuleWithRT",

        LLVMOrcLLJITRef("J"),
        LLVMOrcResourceTrackerRef("JD"),
        LLVMOrcThreadSafeModuleRef("TSM")
    )

    LLVMErrorRef(
        "OrcLLJITLookup",

        LLVMOrcLLJITRef("J"),
        Check(1)..LLVMOrcExecutorAddress.p("Result"),
        charUTF8.const.p("Name")
    )

    LLVMOrcObjectLayerRef(
        "OrcLLJITGetObjLinkingLayer",

        LLVMOrcLLJITRef("J")
    )

    LLVMOrcObjectTransformLayerRef(
        "OrcLLJITGetObjTransformLayer",

        LLVMOrcLLJITRef("J")
    )

    LLVMOrcIRTransformLayerRef(
        "OrcLLJITGetIRTransformLayer",

        LLVMOrcLLJITRef("J")
    )

    charUTF8.const.p(
        "OrcLLJITGetDataLayoutStr",

        LLVMOrcLLJITRef("J")
    )
}