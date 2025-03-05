/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.llvm;

import org.lwjgl.*;
import org.lwjgl.llvm.*;
import org.lwjgl.system.*;

import java.lang.reflect.*;
import java.util.concurrent.*;

import static org.lwjgl.llvm.LLVMAnalysis.*;
import static org.lwjgl.llvm.LLVMBitWriter.*;
import static org.lwjgl.llvm.LLVMCore.*;
import static org.lwjgl.llvm.LLVMExecutionEngine.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

public class HelloLLVM {

    public static void main(String[] args) {
        try {
            LLVMCore.getLibrary();
        } catch (UnsatisfiedLinkError e) {
            throw new IllegalStateException(
                "Please configure the LLVM shared libraries path with:\n" +
                "\t-Dorg.lwjgl.llvm.libname=<LLVM shared library path> or\n" +
                "\t-Dorg.lwjgl.librarypath=<path that contains LLVM shared libraries>", e);
        }

        long module = LLVMModuleCreateWithName("LWJGL");
        if (LLVMCore.Functions.SetSourceFileName != NULL) { // LLVM 7+
            LLVMSetSourceFileName(module, "lwjgl.c");
        }

        try (MemoryStack stack = stackPush()) {
            long functionType = LLVMFunctionType(
                LLVMInt32Type(),
                stack.pointers(
                    LLVMInt32Type(),
                    LLVMInt32Type()
                ),
                false
            );
            long sum = LLVMAddFunction(module, "sum", functionType);

            long builder = LLVMCreateBuilder();
            try {
                long entry = LLVMAppendBasicBlock(sum, "entry");
                LLVMPositionBuilderAtEnd(builder, entry);

                long tmp = LLVMBuildAdd(
                    builder,
                    LLVMGetParam(sum, 0),
                    LLVMGetParam(sum, 1),
                    "tmp"
                );
                LLVMBuildRet(builder, tmp);
            } finally {
                LLVMDisposeBuilder(builder);
            }

            PointerBuffer error = stack.callocPointer(1);

            check(LLVMVerifyModule(module, LLVMReturnStatusAction, error), error);

            // Write out bitcode to file
            if (LLVMWriteBitcodeToFile(module, "sum.bc") != 0) {
                System.err.println("error writing bitcode to file, skipping");
            }

            // Print LLVM IR
            System.out.println(LLVMPrintModuleToString(module));

            // Test execution engines
            PointerBuffer pp = stack.callocPointer(1);

            testExecutionEngineInterpreter(module, sum, pp, error, stack);
            testExecutionEngineMCJIT(module, "sum", pp, error);
        } finally {
            LLVMDisposeModule(module);
        }
    }


    private static void testExecutionEngineInterpreter(long module, long sum, PointerBuffer pp, PointerBuffer error, MemoryStack stack) {
        LLVMLinkInInterpreter();

        check(LLVMCreateInterpreterForModule(pp, module, error), error);

        long interpreter = pp.get(0);

        // Test
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt();
            int y = rand.nextInt();

            long gvX = LLVMCreateGenericValueOfInt(LLVMInt32Type(), x, false);
            long gvY = LLVMCreateGenericValueOfInt(LLVMInt32Type(), y, false);

            long gvResult;
            try (MemoryStack frame = stack.push()) {
                gvResult = LLVMRunFunction(interpreter, sum, frame.pointers(gvX, gvY));
            }

            assertEquals((int)LLVMGenericValueToInt(gvResult, false), x + y);

            LLVMDisposeGenericValue(gvResult);
            LLVMDisposeGenericValue(gvY);
            LLVMDisposeGenericValue(gvX);
        }

        // Clean-up
        LLVMRemoveModule(interpreter, module, pp, error);
        LLVMDisposeExecutionEngine(interpreter);
    }

    private static void testExecutionEngineMCJIT(long module, String functionName, PointerBuffer pp, PointerBuffer error) {
        LLVMLinkInMCJIT();
        LLVMInitializeAllTargetInfos();
        LLVMInitializeAllTargets();
        LLVMInitializeAllTargetMCs();
        //LLVMInitializeAllAsmParsers();
        LLVMInitializeAllAsmPrinters();
        //LLVMInitializeAllDisassemblers();

        check(LLVMCreateExecutionEngineForModule(pp, module, error), error);

        long engine = pp.get(0);

        long functionAddress = LLVMGetFunctionAddress(engine, functionName);

        // Test
        ThreadLocalRandom rand = ThreadLocalRandom.current();
        for (int i = 0; i < 100; i++) {
            int x = rand.nextInt();
            int y = rand.nextInt();

            int result = JNI.invokeI(x, y, functionAddress);

            assertEquals(result, x + y);
        }

        // Clean-up
        LLVMRemoveModule(engine, module, pp, error);
        LLVMDisposeExecutionEngine(engine);
    }

    private static void check(boolean result, PointerBuffer error) {
        if (error.get(0) != NULL) {
            String message = error.getStringUTF8(0);
            if (!message.isEmpty()) {
                System.err.println("Error: " + message);
            }
            nLLVMDisposeMessage(error.get(0));
            error.put(0, NULL);
        }
        if (result) {
            throw new IllegalStateException();
        }
    }

    public static void LLVMInitializeAllTargetInfos()   { LLVMInitialize("TargetInfo"); }
    public static void LLVMInitializeAllTargets()       { LLVMInitialize("Target"); }
    public static void LLVMInitializeAllTargetMCs()     { LLVMInitialize("TargetMC"); }
    public static void LLVMInitializeAllAsmPrinters()   { LLVMInitialize("AsmPrinter"); }
    public static void LLVMInitializeAllAsmParsers()    { LLVMInitialize("AsmParser"); }
    public static void LLVMInitializeAllDisassemblers() { LLVMInitialize("Disassembler"); }

    private static void LLVMInitialize(String type) {
        for (String target : new String[] {
            "AArch64",
            "AMDGPU",
            "ARM",
            "Mips",
            "PowerPC",
            "RISCV",
            "WebAssembly",
            "X86"
        }) {
            String functionName = "LLVMInitialize" + target + type;
            if (LLVMCore.getLibrary().getFunctionAddress(functionName) == NULL) {
                continue;
            }

            try {
                Method m = Class
                    .forName("org.lwjgl.llvm.LLVMTarget" + target)
                    .getDeclaredMethod(functionName);

                if (m.getReturnType() != void.class) {
                    continue;
                }

                int modifiers = m.getModifiers();
                if (!(Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers))) {
                    continue;
                }

                m.invoke(null);
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
