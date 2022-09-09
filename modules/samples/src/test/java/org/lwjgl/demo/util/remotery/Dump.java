/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.remotery;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.remotery.*;
import org.openjdk.jmh.infra.*;

import java.nio.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.remotery.Remotery.*;

/** This sample was ported to Java/LWJGL from {@code sample/dump.c} in the Remotery repository. */
public class Dump {

    private static final ReentrantLock LOCK = new ReentrantLock();

    private static void aggregateFunction() {
        rmt_BeginCPUSample("aggregate", RMTSF_Aggregate, null);

        Blackhole.consumeCPU(1_000);

        rmt_EndCPUSample();
    }

    private static void recursiveFunction(int depth, RMTProperty recursiveDepth) {
        rmt_PropertySet_U32(recursiveDepth, depth);
        rmt_BeginCPUSample("recursive", RMTSF_Recursive, null);

        Blackhole.consumeCPU(1_000);
        if (depth + 1 < 100) {
            recursiveFunction(depth + 1, recursiveDepth);
        }

        rmt_EndCPUSample();
    }

    private static void root(MemoryStack stack, long tokens, RMTProperty recursiveDepth, RMTProperty accumulated) {
        rmt_BeginCPUSample("root", RMTSF_Root, null);

        for (int i = 0; i < tokens; ++i) {
            float v = (float)Math.sin(i);
            try (MemoryStack frame = stack.push()) {
                rmt_PropertyAdd_F32(accumulated, v, frame);
            }
        }

        recursiveFunction(0, recursiveDepth);
        for (int i = 0; i < 100; i++) {
            aggregateFunction();
        }

        rmt_EndCPUSample();
    }

    private static void printIndent(int indent) {
        for (int i = 0; i < indent; ++i) {
            System.out.print("  ");
        }
    }

    private static void printSample(MemoryStack stack, long sample, int indent) {
        try (MemoryStack frame = stack.push()) {
            ByteBuffer r = frame.malloc(1);
            ByteBuffer g = frame.malloc(1);
            ByteBuffer b = frame.malloc(1);

            rmt_SampleGetColour(sample, r, g, b);

            printIndent(indent);
            System.out.format(
                "%s %d  time: %d  self: %d type: %d  color: 0x%02x%02x%02x\n",
                rmt_SampleGetName(sample),
                rmt_SampleGetCallCount(sample) & 0xFFFF_FFFFL,
                rmt_SampleGetTime(sample),
                rmt_SampleGetSelfTime(sample),
                rmt_SampleGetType(sample),
                r.get(0),
                g.get(0),
                b.get(0)
            );
        }
    }

    private static void printTree(long sample, int indent) {
        try (MemoryStack stack = stackPush()) {
            printSample(stack, sample, indent);

            RMTSampleIterator iter = RMTSampleIterator.malloc(stack);

            rmt_IterateChildren(iter, sample);
            while (rmt_IterateNext(iter)) {
                printTree(iter.sample(), indent + 1);
            }
        }
    }

    private static void dumpTree(long ctx, long sample_tree) {
        try {
            LOCK.lock();

            String threadName = rmt_SampleTreeGetThreadName(sample_tree);
            if ("Remotery".equals(threadName)) {
                return; // to minimize the verbosity in this example
            }

            System.out.format("// ********************   DUMP TREE: %s   ************************\n", threadName);
            printTree(rmt_SampleTreeGetRootSample(sample_tree), 0);
        } finally {
            LOCK.unlock();
        }
    }

    private static void printProperty(MemoryStack stack, RMTProperty property, int indent) {
        try (MemoryStack frame = stack.push()) {
            RMTPropertyValue value = RMTPropertyValue.malloc(frame);
            rmt_PropertyGetValue(property, value);

            printIndent(indent);
            System.out.format("%s: ", rmt_PropertyGetName(property));
            switch (rmt_PropertyGetType(property)) {
                case RMT_PropertyType_rmtBool:
                    System.out.format("%s\n", value.Bool() ? "true" : "false");
                    break;
                case RMT_PropertyType_rmtS32:
                    System.out.format("%d\n", value.S32());
                    break;
                case RMT_PropertyType_rmtU32:
                    System.out.format("%d\n", value.U32() & 0xFFFF_FFFFL);
                    break;
                case RMT_PropertyType_rmtF32:
                    System.out.format("%f\n", value.F32());
                    break;
                case RMT_PropertyType_rmtS64:
                    System.out.format("%d\n", value.S64());
                    break;
                case RMT_PropertyType_rmtU64:
                    System.out.format("%d\n", value.U64());
                    break;
                case RMT_PropertyType_rmtF64:
                    System.out.format("%g\n", value.F64());
                    break;
                case RMT_PropertyType_rmtGroup:
                    System.out.println();
                    break;
                default:
                    break;
            }

            RMTPropertyIterator iter = RMTPropertyIterator.malloc(stack);

            rmt_PropertyIterateChildren(iter, property);
            while (rmt_PropertyIterateNext(iter)) {
                printProperty(stack, iter.property(), indent + 1);
            }
        }
    }

    private static void dumpProperties(long ctx, long root) {
        try {
            LOCK.lock();
            System.out.println("// ********************   DUMP PROPERTIES:      ************************");
            try (MemoryStack stack = stackPush()) {
                RMTPropertyIterator iter = RMTPropertyIterator.malloc(stack);

                rmt_PropertyIterateChildren(iter, RMTProperty.create(root));
                while (rmt_PropertyIterateNext(iter)) {
                    printProperty(stack, iter.property(), 0);
                }
            }
        } finally {
            LOCK.unlock();
        }
    }

    public static void main(String[] args) {
        CountDownLatch shutdownSignal = new CountDownLatch(1);
        CountDownLatch cleanupSignal  = new CountDownLatch(1);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            shutdownSignal.countDown();
            try {
                cleanupSignal.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }));

        Objects.requireNonNull(rmt_Settings())
            .reuse_open_port(true)
            .sampletree_handler(Dump::dumpTree)
            .sampletree_context(NULL)
            .snapshot_callback(Dump::dumpProperties)
            .snapshot_context(NULL);

        long rmt = NULL;
        try {
            try (MemoryStack stack = stackPush()) {
                PointerBuffer pp = stack.mallocPointer(1);

                int error = rmt_CreateGlobalInstance(pp);
                if (RMT_ERROR_NONE != error) {
                    throw new IllegalStateException("Error launching Remotery [" + error + "]: " + rmt_GetLastErrorMessage());
                }

                rmt = pp.get(0);
            }

            rmt_SetCurrentThreadName("Dump - Main Thread");

            try (MemoryStack stack = stackPush()) {
                RMTProperty game           = rmt_PropertyDefine_Group("Game", "Game Properties", null, stack);
                RMTProperty wasUpdated     = rmt_PropertyDefine_Bool("WasUpdated", false, RMT_PropertyFlags_FrameReset, "Was the game updated this frame?", game, stack);
                RMTProperty recursiveDepth = rmt_PropertyDefine_U32("RecursiveDepth", 0, RMT_PropertyFlags_FrameReset, "How deep did we go in recursiveFunction?", game, stack);
                RMTProperty accumulated    = rmt_PropertyDefine_F32("Accumulated", 0.0f, RMT_PropertyFlags_FrameReset, "What was the latest value?", game, stack);
                RMTProperty frameCounter   = rmt_PropertyDefine_U32("FrameCounter", 0, RMT_PropertyFlags_NoFlags, "What is the current frame number?", game, stack);

                int MAX_COUNT = 5;
                while (shutdownSignal.getCount() != 0 && --MAX_COUNT > 0) {
                    long tokens = ThreadLocalRandom.current().nextLong(10_000L, 100_000L);

                    rmt_LogText("root begin - " + tokens);
                    root(stack, tokens, recursiveDepth, accumulated);
                    rmt_LogText("root end");

                    rmt_PropertySet_Bool(wasUpdated, true);
                    try (MemoryStack frame = stackPush()) {
                        rmt_PropertyAdd_U32(frameCounter, 1, frame);
                    }

                    rmt_PropertySnapshotAll();
                    rmt_PropertyFrameResetAll();
                }
            }
        } finally {
            if (rmt != NULL) {
                rmt_DestroyGlobalInstance(rmt);
            }

            RMTSettings settings = rmt_Settings();

            Objects.requireNonNull(settings.sampletree_handler()).free();
            Objects.requireNonNull(settings.snapshot_callback()).free();

            System.out.println("Cleaned up and quit");

            cleanupSignal.countDown();
        }
    }

}
