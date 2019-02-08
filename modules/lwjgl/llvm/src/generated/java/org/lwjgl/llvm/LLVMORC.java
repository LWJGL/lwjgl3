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

public class LLVMORC {

    protected LLVMORC() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code LLVMCore.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            OrcCreateInstance             = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateInstance"),
            OrcGetErrorMsg                = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcGetErrorMsg"),
            OrcGetMangledSymbol           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcGetMangledSymbol"),
            OrcDisposeMangledSymbol       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeMangledSymbol"),
            OrcCreateLazyCompileCallback  = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateLazyCompileCallback"),
            OrcCreateIndirectStub         = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcCreateIndirectStub"),
            OrcSetIndirectStubPointer     = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcSetIndirectStubPointer"),
            OrcAddEagerlyCompiledIR       = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcAddEagerlyCompiledIR"),
            OrcAddLazilyCompiledIR        = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcAddLazilyCompiledIR"),
            OrcAddObjectFile              = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcAddObjectFile"),
            OrcRemoveModule               = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcRemoveModule"),
            OrcGetSymbolAddress           = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcGetSymbolAddress"),
            OrcGetSymbolAddressIn         = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcGetSymbolAddressIn"),
            OrcDisposeInstance            = apiGetFunctionAddress(LLVMCore.getLibrary(), "LLVMOrcDisposeInstance"),
            OrcRegisterJITEventListener   = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcRegisterJITEventListener"),
            OrcUnregisterJITEventListener = LLVMCore.getLibrary().getFunctionAddress("LLVMOrcUnregisterJITEventListener");

    }

    // --- [ LLVMOrcCreateInstance ] ---

    /**
     * Create an ORC JIT stack.
     * 
     * <p>The client owns the resulting stack, and must call {@link #LLVMOrcDisposeInstance OrcDisposeInstance} to destroy it and free its memory. The JIT stack will take ownership of the
     * {@code TargetMachine}, which will be destroyed when the stack is destroyed. The client should not attempt to dispose of the Target Machine, or it will
     * result in a double-free.</p>
     */
    @NativeType("LLVMOrcJITStackRef")
    public static long LLVMOrcCreateInstance(@NativeType("LLVMTargetMachineRef") long TM) {
        long __functionAddress = Functions.OrcCreateInstance;
        if (CHECKS) {
            check(TM);
        }
        return invokePP(TM, __functionAddress);
    }

    // --- [ LLVMOrcGetErrorMsg ] ---

    /** Unsafe version of: {@link #LLVMOrcGetErrorMsg OrcGetErrorMsg} */
    public static long nLLVMOrcGetErrorMsg(long JITStack) {
        long __functionAddress = Functions.OrcGetErrorMsg;
        if (CHECKS) {
            check(JITStack);
        }
        return invokePP(JITStack, __functionAddress);
    }

    /**
     * Get the error message for the most recent error (if any).
     * 
     * <p>This message is owned by the ORC JIT Stack and will be freed when the stack is disposed of by {@link #LLVMOrcDisposeInstance OrcDisposeInstance}.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String LLVMOrcGetErrorMsg(@NativeType("LLVMOrcJITStackRef") long JITStack) {
        long __result = nLLVMOrcGetErrorMsg(JITStack);
        return memUTF8Safe(__result);
    }

    // --- [ LLVMOrcGetMangledSymbol ] ---

    /** Unsafe version of: {@link #LLVMOrcGetMangledSymbol OrcGetMangledSymbol} */
    public static void nLLVMOrcGetMangledSymbol(long JITStack, long MangledSymbol, long Symbol) {
        long __functionAddress = Functions.OrcGetMangledSymbol;
        if (CHECKS) {
            check(JITStack);
        }
        invokePPPV(JITStack, MangledSymbol, Symbol, __functionAddress);
    }

    /** Mangle the given symbol. Memory will be allocated for {@code MangledSymbol} to hold the result. */
    public static void LLVMOrcGetMangledSymbol(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("char **") PointerBuffer MangledSymbol, @NativeType("char const *") ByteBuffer Symbol) {
        if (CHECKS) {
            check(MangledSymbol, 1);
            checkNT1(Symbol);
        }
        nLLVMOrcGetMangledSymbol(JITStack, memAddress(MangledSymbol), memAddress(Symbol));
    }

    /** Mangle the given symbol. Memory will be allocated for {@code MangledSymbol} to hold the result. */
    public static void LLVMOrcGetMangledSymbol(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("char **") PointerBuffer MangledSymbol, @NativeType("char const *") CharSequence Symbol) {
        if (CHECKS) {
            check(MangledSymbol, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(Symbol, true);
            long SymbolEncoded = stack.getPointerAddress();
            nLLVMOrcGetMangledSymbol(JITStack, memAddress(MangledSymbol), SymbolEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcDisposeMangledSymbol ] ---

    /** Unsafe version of: {@link #LLVMOrcDisposeMangledSymbol OrcDisposeMangledSymbol} */
    public static void nLLVMOrcDisposeMangledSymbol(long MangledSymbol) {
        long __functionAddress = Functions.OrcDisposeMangledSymbol;
        invokePV(MangledSymbol, __functionAddress);
    }

    /** Dispose of a mangled symbol. */
    public static void LLVMOrcDisposeMangledSymbol(@NativeType("char *") ByteBuffer MangledSymbol) {
        nLLVMOrcDisposeMangledSymbol(memAddress(MangledSymbol));
    }

    // --- [ LLVMOrcCreateLazyCompileCallback ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateLazyCompileCallback OrcCreateLazyCompileCallback} */
    public static long nLLVMOrcCreateLazyCompileCallback(long JITStack, long RetAddr, long Callback, long CallbackCtx) {
        long __functionAddress = Functions.OrcCreateLazyCompileCallback;
        if (CHECKS) {
            check(JITStack);
            check(CallbackCtx);
        }
        return invokePPPPP(JITStack, RetAddr, Callback, CallbackCtx, __functionAddress);
    }

    /** Create a lazy compile callback. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateLazyCompileCallback(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcTargetAddress *") LongBuffer RetAddr, @NativeType("uint64_t (*) (LLVMOrcJITStackRef, void *)") LLVMOrcLazyCompileCallbackFnI Callback, @NativeType("void *") long CallbackCtx) {
        if (CHECKS) {
            check(RetAddr, 1);
        }
        return nLLVMOrcCreateLazyCompileCallback(JITStack, memAddress(RetAddr), Callback.address(), CallbackCtx);
    }

    // --- [ LLVMOrcCreateIndirectStub ] ---

    /** Unsafe version of: {@link #LLVMOrcCreateIndirectStub OrcCreateIndirectStub} */
    public static long nLLVMOrcCreateIndirectStub(long JITStack, long StubName, long InitAddr) {
        long __functionAddress = Functions.OrcCreateIndirectStub;
        if (CHECKS) {
            check(JITStack);
        }
        return invokePPJP(JITStack, StubName, InitAddr, __functionAddress);
    }

    /** Create a named indirect call stub. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateIndirectStub(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("char const *") ByteBuffer StubName, @NativeType("LLVMOrcTargetAddress") long InitAddr) {
        if (CHECKS) {
            checkNT1(StubName);
        }
        return nLLVMOrcCreateIndirectStub(JITStack, memAddress(StubName), InitAddr);
    }

    /** Create a named indirect call stub. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcCreateIndirectStub(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("char const *") CharSequence StubName, @NativeType("LLVMOrcTargetAddress") long InitAddr) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(StubName, true);
            long StubNameEncoded = stack.getPointerAddress();
            return nLLVMOrcCreateIndirectStub(JITStack, StubNameEncoded, InitAddr);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcSetIndirectStubPointer ] ---

    /** Unsafe version of: {@link #LLVMOrcSetIndirectStubPointer OrcSetIndirectStubPointer} */
    public static long nLLVMOrcSetIndirectStubPointer(long JITStack, long StubName, long NewAddr) {
        long __functionAddress = Functions.OrcSetIndirectStubPointer;
        if (CHECKS) {
            check(JITStack);
        }
        return invokePPJP(JITStack, StubName, NewAddr, __functionAddress);
    }

    /** Set the pointer for the given indirect stub. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcSetIndirectStubPointer(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("char const *") ByteBuffer StubName, @NativeType("LLVMOrcTargetAddress") long NewAddr) {
        if (CHECKS) {
            checkNT1(StubName);
        }
        return nLLVMOrcSetIndirectStubPointer(JITStack, memAddress(StubName), NewAddr);
    }

    /** Set the pointer for the given indirect stub. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcSetIndirectStubPointer(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("char const *") CharSequence StubName, @NativeType("LLVMOrcTargetAddress") long NewAddr) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(StubName, true);
            long StubNameEncoded = stack.getPointerAddress();
            return nLLVMOrcSetIndirectStubPointer(JITStack, StubNameEncoded, NewAddr);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcAddEagerlyCompiledIR ] ---

    /** Unsafe version of: {@link #LLVMOrcAddEagerlyCompiledIR OrcAddEagerlyCompiledIR} */
    public static long nLLVMOrcAddEagerlyCompiledIR(long JITStack, long RetHandle, long Mod, long SymbolResolver, long SymbolResolverCtx) {
        long __functionAddress = Functions.OrcAddEagerlyCompiledIR;
        if (CHECKS) {
            check(JITStack);
            check(Mod);
            check(SymbolResolverCtx);
        }
        return invokePPPPPP(JITStack, RetHandle, Mod, SymbolResolver, SymbolResolverCtx, __functionAddress);
    }

    /** Add module to be eagerly compiled. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcAddEagerlyCompiledIR(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcModuleHandle *") LongBuffer RetHandle, @NativeType("LLVMModuleRef") long Mod, @NativeType("uint64_t (*) (char const *, void *)") LLVMOrcSymbolResolverFnI SymbolResolver, @NativeType("void *") long SymbolResolverCtx) {
        if (CHECKS) {
            check(RetHandle, 1);
        }
        return nLLVMOrcAddEagerlyCompiledIR(JITStack, memAddress(RetHandle), Mod, SymbolResolver.address(), SymbolResolverCtx);
    }

    // --- [ LLVMOrcAddLazilyCompiledIR ] ---

    /** Unsafe version of: {@link #LLVMOrcAddLazilyCompiledIR OrcAddLazilyCompiledIR} */
    public static long nLLVMOrcAddLazilyCompiledIR(long JITStack, long RetHandle, long Mod, long SymbolResolver, long SymbolResolverCtx) {
        long __functionAddress = Functions.OrcAddLazilyCompiledIR;
        if (CHECKS) {
            check(JITStack);
            check(Mod);
            check(SymbolResolverCtx);
        }
        return invokePPPPPP(JITStack, RetHandle, Mod, SymbolResolver, SymbolResolverCtx, __functionAddress);
    }

    /** Add module to be lazily compiled one function at a time. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcAddLazilyCompiledIR(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcModuleHandle *") LongBuffer RetHandle, @NativeType("LLVMModuleRef") long Mod, @NativeType("uint64_t (*) (char const *, void *)") LLVMOrcSymbolResolverFnI SymbolResolver, @NativeType("void *") long SymbolResolverCtx) {
        if (CHECKS) {
            check(RetHandle, 1);
        }
        return nLLVMOrcAddLazilyCompiledIR(JITStack, memAddress(RetHandle), Mod, SymbolResolver.address(), SymbolResolverCtx);
    }

    // --- [ LLVMOrcAddObjectFile ] ---

    /** Unsafe version of: {@link #LLVMOrcAddObjectFile OrcAddObjectFile} */
    public static long nLLVMOrcAddObjectFile(long JITStack, long RetHandle, long Obj, long SymbolResolver, long SymbolResolverCtx) {
        long __functionAddress = Functions.OrcAddObjectFile;
        if (CHECKS) {
            check(__functionAddress);
            check(JITStack);
            check(Obj);
            check(SymbolResolverCtx);
        }
        return invokePPPPPP(JITStack, RetHandle, Obj, SymbolResolver, SymbolResolverCtx, __functionAddress);
    }

    /**
     * Add an object file.
     * 
     * <p>This method takes ownership of the given memory buffer and attempts to add it to the JIT as an object file. Clients should <b>not</b> dispose of the
     * {@code Obj} argument: the JIT will manage it from this call onwards.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcAddObjectFile(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcModuleHandle *") LongBuffer RetHandle, @NativeType("LLVMMemoryBufferRef") long Obj, @NativeType("uint64_t (*) (char const *, void *)") LLVMOrcSymbolResolverFnI SymbolResolver, @NativeType("void *") long SymbolResolverCtx) {
        if (CHECKS) {
            check(RetHandle, 1);
        }
        return nLLVMOrcAddObjectFile(JITStack, memAddress(RetHandle), Obj, SymbolResolver.address(), SymbolResolverCtx);
    }

    // --- [ LLVMOrcRemoveModule ] ---

    /**
     * Remove a module set from the JIT.
     * 
     * <p>This works for all modules that can be added via {@code OrcAdd*}, including object files.</p>
     */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcRemoveModule(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcModuleHandle") long H) {
        long __functionAddress = Functions.OrcRemoveModule;
        if (CHECKS) {
            check(JITStack);
        }
        return invokePJP(JITStack, H, __functionAddress);
    }

    // --- [ LLVMOrcGetSymbolAddress ] ---

    /** Unsafe version of: {@link #LLVMOrcGetSymbolAddress OrcGetSymbolAddress} */
    public static long nLLVMOrcGetSymbolAddress(long JITStack, long RetAddr, long SymbolName) {
        long __functionAddress = Functions.OrcGetSymbolAddress;
        if (CHECKS) {
            check(JITStack);
        }
        return invokePPPP(JITStack, RetAddr, SymbolName, __functionAddress);
    }

    /** Get symbol address from JIT instance. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcGetSymbolAddress(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcTargetAddress *") LongBuffer RetAddr, @NativeType("char const *") ByteBuffer SymbolName) {
        if (CHECKS) {
            check(RetAddr, 1);
            checkNT1(SymbolName);
        }
        return nLLVMOrcGetSymbolAddress(JITStack, memAddress(RetAddr), memAddress(SymbolName));
    }

    /** Get symbol address from JIT instance. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcGetSymbolAddress(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcTargetAddress *") LongBuffer RetAddr, @NativeType("char const *") CharSequence SymbolName) {
        if (CHECKS) {
            check(RetAddr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(SymbolName, true);
            long SymbolNameEncoded = stack.getPointerAddress();
            return nLLVMOrcGetSymbolAddress(JITStack, memAddress(RetAddr), SymbolNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcGetSymbolAddressIn ] ---

    /** Unsafe version of: {@link #LLVMOrcGetSymbolAddressIn OrcGetSymbolAddressIn} */
    public static long nLLVMOrcGetSymbolAddressIn(long JITStack, long RetAddr, long H, long SymbolName) {
        long __functionAddress = Functions.OrcGetSymbolAddressIn;
        if (CHECKS) {
            check(__functionAddress);
            check(JITStack);
        }
        return invokePPJPP(JITStack, RetAddr, H, SymbolName, __functionAddress);
    }

    /** Get symbol address from JIT instance, searching only the specified handle. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcGetSymbolAddressIn(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcTargetAddress *") LongBuffer RetAddr, @NativeType("LLVMOrcModuleHandle") long H, @NativeType("char const *") ByteBuffer SymbolName) {
        if (CHECKS) {
            check(RetAddr, 1);
            checkNT1(SymbolName);
        }
        return nLLVMOrcGetSymbolAddressIn(JITStack, memAddress(RetAddr), H, memAddress(SymbolName));
    }

    /** Get symbol address from JIT instance, searching only the specified handle. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcGetSymbolAddressIn(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMOrcTargetAddress *") LongBuffer RetAddr, @NativeType("LLVMOrcModuleHandle") long H, @NativeType("char const *") CharSequence SymbolName) {
        if (CHECKS) {
            check(RetAddr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(SymbolName, true);
            long SymbolNameEncoded = stack.getPointerAddress();
            return nLLVMOrcGetSymbolAddressIn(JITStack, memAddress(RetAddr), H, SymbolNameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ LLVMOrcDisposeInstance ] ---

    /** Dispose of an ORC JIT stack. */
    @NativeType("LLVMErrorRef")
    public static long LLVMOrcDisposeInstance(@NativeType("LLVMOrcJITStackRef") long JITStack) {
        long __functionAddress = Functions.OrcDisposeInstance;
        if (CHECKS) {
            check(JITStack);
        }
        return invokePP(JITStack, __functionAddress);
    }

    // --- [ LLVMOrcRegisterJITEventListener ] ---

    /**
     * Register a JIT Event Listener.
     * 
     * <p>A {@code NULL} listener is ignored.</p>
     */
    public static void LLVMOrcRegisterJITEventListener(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMJITEventListenerRef") long L) {
        long __functionAddress = Functions.OrcRegisterJITEventListener;
        if (CHECKS) {
            check(__functionAddress);
            check(JITStack);
        }
        invokePPV(JITStack, L, __functionAddress);
    }

    // --- [ LLVMOrcUnregisterJITEventListener ] ---

    /**
     * Unegister a JIT Event Listener.
     * 
     * <p>A {@code NULL} listener is ignored.</p>
     */
    public static void LLVMOrcUnregisterJITEventListener(@NativeType("LLVMOrcJITStackRef") long JITStack, @NativeType("LLVMJITEventListenerRef") long L) {
        long __functionAddress = Functions.OrcUnregisterJITEventListener;
        if (CHECKS) {
            check(__functionAddress);
            check(JITStack);
        }
        invokePPV(JITStack, L, __functionAddress);
    }

}