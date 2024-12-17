/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMTargetMachine = "LLVMTargetMachine".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    EnumConstant(
        "CodeGenLevelNone".enum("0"),
        "CodeGenLevelLess".enum,
        "CodeGenLevelDefault".enum,
        "CodeGenLevelAggressive".enum
    )

    EnumConstant(
        "RelocDefault".enum("0"),
        "RelocStatic".enum,
        "RelocPIC".enum,
        "RelocDynamicNoPic".enum,
        "RelocROPI".enum,
        "RelocRWPI".enum,
        "RelocROPI_RWPI".enum
    )

    EnumConstant(
        "CodeModelDefault".enum("0"),
        "CodeModelJITDefault".enum,
        "CodeModelTiny".enum,
        "CodeModelSmall".enum,
        "CodeModelKernel".enum,
        "CodeModelMedium".enum,
        "CodeModelLarge".enum
    )

    EnumConstant(
        "AssemblyFile".enum("0"),
        "ObjectFile".enum
    )

    EnumConstant(
        "GlobalISelAbortEnable".enum("0"),
        "GlobalISelAbortDisable".enum,
        "GlobalISelAbortDisableWithDiag".enum
    )

    LLVMTargetRef(
        "GetFirstTarget",

        void()
    )

    LLVMTargetRef(
        "GetNextTarget",

        LLVMTargetRef("T")
    )

    LLVMTargetRef(
        "GetTargetFromName",

        charUTF8.const.p("Name")
    )

    LLVMBool(
        "GetTargetFromTriple",

        charUTF8.const.p("Triple"),
        Check(1)..LLVMTargetRef.p("T"),
        Check(1)..charUTF8.p.p("ErrorMessage")
    )

    charUTF8.const.p(
        "GetTargetName",

        LLVMTargetRef("T")
    )

    charUTF8.const.p(
        "GetTargetDescription",

        LLVMTargetRef("T")
    )

    LLVMBool(
        "TargetHasJIT",

        LLVMTargetRef("T")
    )

    LLVMBool(
        "TargetHasTargetMachine",

        LLVMTargetRef("T")
    )

    LLVMBool(
        "TargetHasAsmBackend",

        LLVMTargetRef("T")
    )

    IgnoreMissing..LLVMTargetMachineOptionsRef(
        "CreateTargetMachineOptions",

        void()
    )

    IgnoreMissing..void(
        "DisposeTargetMachineOptions",

        LLVMTargetMachineOptionsRef("Options")
    )

    IgnoreMissing..void(
        "TargetMachineOptionsSetCPU",

        LLVMTargetMachineOptionsRef("Options"),
        charUTF8.const.p("CPU")
    )

    IgnoreMissing..void(
        "TargetMachineOptionsSetFeatures",

        LLVMTargetMachineOptionsRef("Options"),
        charUTF8.const.p("Features")
    )

    IgnoreMissing..void(
        "TargetMachineOptionsSetABI",

        LLVMTargetMachineOptionsRef("Options"),
        charUTF8.const.p("ABI")
    )

    IgnoreMissing..void(
        "TargetMachineOptionsSetCodeGenOptLevel",

        LLVMTargetMachineOptionsRef("Options"),
        LLVMCodeGenOptLevel("Level")
    )

    IgnoreMissing..void(
        "TargetMachineOptionsSetRelocMode",

        LLVMTargetMachineOptionsRef("Options"),
        LLVMRelocMode("Reloc")
    )

    IgnoreMissing..void(
        "TargetMachineOptionsSetCodeModel",

        LLVMTargetMachineOptionsRef("Options"),
        LLVMCodeModel("CodeModel")
    )

    IgnoreMissing..LLVMTargetMachineRef(
        "CreateTargetMachineWithOptions",

        LLVMTargetRef("T"),
        charUTF8.const.p("Triple"),
        LLVMTargetMachineOptionsRef("Options")
    )

    LLVMTargetMachineRef(
        "CreateTargetMachine",

        LLVMTargetRef("T"),
        charUTF8.const.p("Triple"),
        charUTF8.const.p("CPU"),
        charUTF8.const.p("Features"),
        LLVMCodeGenOptLevel("Level"),
        LLVMRelocMode("Reloc"),
        LLVMCodeModel("CodeModel")
    )

    void(
        "DisposeTargetMachine",

        LLVMTargetMachineRef("T")
    )

    LLVMTargetRef(
        "GetTargetMachineTarget",

        LLVMTargetMachineRef("T")
    )

    charUTF8.p(
        "GetTargetMachineTriple",

        LLVMTargetMachineRef("T")
    )

    charUTF8.p(
        "GetTargetMachineCPU",

        LLVMTargetMachineRef("T")
    )

    charUTF8.p(
        "GetTargetMachineFeatureString",

        LLVMTargetMachineRef("T")
    )

    LLVMTargetDataRef(
        "CreateTargetDataLayout",

        LLVMTargetMachineRef("T")
    )

    void(
        "SetTargetMachineAsmVerbosity",

        LLVMTargetMachineRef("T"),
        LLVMBool("VerboseAsm")
    )

    IgnoreMissing..void(
        "SetTargetMachineFastISel",

        LLVMTargetMachineRef("T"),
        LLVMBool("Enable")
    )

    IgnoreMissing..void(
        "SetTargetMachineGlobalISel",

        LLVMTargetMachineRef("T"),
        LLVMBool("Enable")
    )

    IgnoreMissing..void(
        "SetTargetMachineGlobalISelAbort",

        LLVMTargetMachineRef("T"),
        LLVMGlobalISelAbortMode("Mode")
    )

    IgnoreMissing..void(
        "SetTargetMachineMachineOutliner",

        LLVMTargetMachineRef("T"),
        LLVMBool("Enable")
    )

    LLVMBool(
        "TargetMachineEmitToFile",

        LLVMTargetMachineRef("T"),
        LLVMModuleRef("M"),
        charUTF8.const.p("Filename"),
        LLVMCodeGenFileType("codegen"),
        Check(1)..charUTF8.p.p("ErrorMessage")
    )

    LLVMBool(
        "TargetMachineEmitToMemoryBuffer",

        LLVMTargetMachineRef("T"),
        LLVMModuleRef("M"),
        LLVMCodeGenFileType("codegen"),
        Check(1)..charUTF8.p.p("ErrorMessage"),
        Check(1)..LLVMMemoryBufferRef.p("OutMemBuf")
    )

    charUTF8.p(
        "GetDefaultTargetTriple",

        void()
    )

    IgnoreMissing..charUTF8.p(
        "NormalizeTargetTriple",

        charUTF8.const.p("triple")
    )

    IgnoreMissing..charUTF8.p(
        "GetHostCPUName",

        void()
    )

    IgnoreMissing..charUTF8.p(
        "GetHostCPUFeatures",

        void()
    )

    void(
        "AddAnalysisPasses",

        LLVMTargetMachineRef("T"),
        LLVMPassManagerRef("PM")
    )
}