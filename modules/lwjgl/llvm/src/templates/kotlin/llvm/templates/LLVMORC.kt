/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package llvm.templates

import llvm.*
import org.lwjgl.generator.*

val LLVMORC = "LLVMORC".nativeClass(
    Module.LLVM,
    prefixConstant = "LLVM",
    prefixMethod = "LLVM",
    binding = LLVM_BINDING_DELEGATE
) {
    documentation = ""

    LLVMOrcJITStackRef(
        "OrcCreateInstance",
        """
        Create an ORC JIT stack.

        The client owns the resulting stack, and must call #OrcDisposeInstance() to destroy it and free its memory. The JIT stack will take ownership of the
        {@code TargetMachine}, which will be destroyed when the stack is destroyed. The client should not attempt to dispose of the Target Machine, or it will
        result in a double-free.
        """,

        LLVMTargetMachineRef("TM", "")
    )

    charUTF8.const.p(
        "OrcGetErrorMsg",
        """
        Get the error message for the most recent error (if any).

        This message is owned by the ORC JIT Stack and will be freed when the stack is disposed of by #OrcDisposeInstance().
        """,

        LLVMOrcJITStackRef("JITStack", "")
    )

    void(
        "OrcGetMangledSymbol",
        "Mangle the given symbol. Memory will be allocated for {@code MangledSymbol} to hold the result.",

        LLVMOrcJITStackRef("JITStack", ""),
        Check(1)..char.p.p("MangledSymbol", ""),
        charUTF8.const.p("Symbol", "")
    )

    void(
        "OrcDisposeMangledSymbol",
        "Dispose of a mangled symbol.",

        Unsafe..char.p("MangledSymbol", "")
    )

    LLVMErrorRef(
        "OrcCreateLazyCompileCallback",
        "Create a lazy compile callback.",

        LLVMOrcJITStackRef("JITStack", ""),
        Check(1)..LLVMOrcTargetAddress.p("RetAddr", ""),
        LLVMOrcLazyCompileCallbackFn("Callback", ""),
        opaque_p("CallbackCtx", "")
    )

    LLVMErrorRef(
        "OrcCreateIndirectStub",
        "Create a named indirect call stub.",

        LLVMOrcJITStackRef("JITStack", ""),
        charUTF8.const.p("StubName", ""),
        LLVMOrcTargetAddress("InitAddr", "")
    )

    LLVMErrorRef(
        "OrcSetIndirectStubPointer",
        "Set the pointer for the given indirect stub.",

        LLVMOrcJITStackRef("JITStack", ""),
        charUTF8.const.p("StubName", ""),
        LLVMOrcTargetAddress("NewAddr", "")
    )

    LLVMErrorRef(
        "OrcAddEagerlyCompiledIR",
        "Add module to be eagerly compiled.",

        LLVMOrcJITStackRef("JITStack", ""),
        Check(1)..LLVMOrcModuleHandle.p("RetHandle", ""),
        LLVMModuleRef("Mod", ""),
        LLVMOrcSymbolResolverFn("SymbolResolver", ""),
        opaque_p("SymbolResolverCtx", "")
    )

    LLVMErrorRef(
        "OrcAddLazilyCompiledIR",
        "Add module to be lazily compiled one function at a time.",

        LLVMOrcJITStackRef("JITStack", ""),
        Check(1)..LLVMOrcModuleHandle.p("RetHandle", ""),
        LLVMModuleRef("Mod", ""),
        LLVMOrcSymbolResolverFn("SymbolResolver", ""),
        opaque_p("SymbolResolverCtx", "")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcAddObjectFile",
        """
        Add an object file.

        This method takes ownership of the given memory buffer and attempts to add it to the JIT as an object file. Clients should <b>not</b> dispose of the
        {@code Obj} argument: the JIT will manage it from this call onwards.
        """,

        LLVMOrcJITStackRef("JITStack", ""),
        Check(1)..LLVMOrcModuleHandle.p("RetHandle", ""),
        LLVMMemoryBufferRef("Obj", ""),
        LLVMOrcSymbolResolverFn("SymbolResolver", ""),
        opaque_p("SymbolResolverCtx", "")
    )

    LLVMErrorRef(
        "OrcRemoveModule",
        """
        Remove a module set from the JIT.

        This works for all modules that can be added via {@code OrcAdd*}, including object files.
        """,

        LLVMOrcJITStackRef("JITStack", ""),
        LLVMOrcModuleHandle("H", "")
    )

    LLVMErrorRef(
        "OrcGetSymbolAddress",
        "Get symbol address from JIT instance.",

        LLVMOrcJITStackRef("JITStack", ""),
        Check(1)..LLVMOrcTargetAddress.p("RetAddr", ""),
        charUTF8.const.p("SymbolName", "")
    )

    IgnoreMissing..LLVMErrorRef(
        "OrcGetSymbolAddressIn",
        "Get symbol address from JIT instance, searching only the specified handle.",

        LLVMOrcJITStackRef("JITStack", ""),
        Check(1)..LLVMOrcTargetAddress.p("RetAddr", ""),
        LLVMOrcModuleHandle("H", ""),
        charUTF8.const.p("SymbolName", "")
    )

    LLVMErrorRef(
        "OrcDisposeInstance",
        "Dispose of an ORC JIT stack.",

        LLVMOrcJITStackRef("JITStack", "")
    )

    IgnoreMissing..void(
        "OrcRegisterJITEventListener",
        """
        Register a JIT Event Listener.

        A #NULL listener is ignored.
        """,

        LLVMOrcJITStackRef("JITStack", ""),
        nullable..LLVMJITEventListenerRef("L", "")
    )

    IgnoreMissing..void(
        "OrcUnregisterJITEventListener",
        """
        Unegister a JIT Event Listener.

        A #NULL listener is ignored.
        """,

        LLVMOrcJITStackRef("JITStack", ""),
        nullable..LLVMJITEventListenerRef("L", "")
    )
}