/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.llvm;

import org.lwjgl.*;
import org.lwjgl.llvm.*;
import org.lwjgl.system.*;

import java.util.concurrent.*;

import static org.lwjgl.llvm.LLVMAnalysis.*;
import static org.lwjgl.llvm.LLVMBitWriter.*;
import static org.lwjgl.llvm.LLVMCore.*;
import static org.lwjgl.llvm.LLVMExecutionEngine.*;
import static org.lwjgl.llvm.LLVMTargetX86.*;
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

            PointerBuffer pp    = stack.callocPointer(1);
            PointerBuffer error = stack.callocPointer(1);

            check(LLVMVerifyModule(module, LLVMReturnStatusAction, error), error);

            LLVMLinkInMCJIT();
            LLVMInitializeX86Target();

            check(LLVMCreateExecutionEngineForModule(pp, module, error), error);

            long engine = pp.get(0);

            // Test
            ThreadLocalRandom rand = ThreadLocalRandom.current();
            for (int i = 0; i < 100; i++) {
                int x = rand.nextInt();
                int y = rand.nextInt();

                long gvX = LLVMCreateGenericValueOfInt(LLVMInt32Type(), x, false);
                long gvY = LLVMCreateGenericValueOfInt(LLVMInt32Type(), y, false);

                long gvResult = LLVMRunFunction(engine, sum, stack.pointers(gvX, gvY));

                assertEquals((int)LLVMGenericValueToInt(gvResult, false), x + y);

                LLVMDisposeGenericValue(gvResult);
                LLVMDisposeGenericValue(gvY);
                LLVMDisposeGenericValue(gvX);
            }

            // Clean-up
            LLVMRemoveModule(engine, module, pp, error);
            LLVMDisposeExecutionEngine(engine);

            // Write out bitcode to file
            if (LLVMWriteBitcodeToFile(module, "sum.bc") != 0) {
                System.err.println("error writing bitcode to file, skipping");
            }

            // Print LLVM IR
            System.out.println(LLVMPrintModuleToString(module));
        } finally {
            LLVMDisposeModule(module);
        }
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

}
