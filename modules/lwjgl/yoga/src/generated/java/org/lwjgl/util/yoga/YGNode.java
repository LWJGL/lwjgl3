/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Unstable/private API.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGNode {
 *     void * context;
 *     {@link YGNodeFlags YGNodeFlags} flags;
 *     union {
 *         {@link YGMeasureFuncI YGMeasureFunc} noContext;
 *         MeasureWithContextFn withContext;
 *     } measure;
 *     union {
 *         {@link YGBaselineFuncI YGBaselineFunc} noContext;
 *         BaselineWithContextFn withContext;
 *     } baseline;
 *     union {
 *         {@link YGPrintFuncI YGPrintFunc} noContext;
 *         PrintWithContextFn withContext;
 *     } print;
 *     {@link YGDirtiedFuncI YGDirtiedFunc} dirtied;
 *     {@link YGStyle YGStyle} style;
 *     {@link YGLayout YGLayout} layout;
 *     uint32_t lineIndex;
 *     YGNodeRef owner;
 *     YGVector children;
 *     YGConfigRef config;
 *     {@link YGValue YGValue} resolvedDimensions[2];
 * }</code></pre>
 */
public class YGNode extends Struct<YGNode> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTEXT,
        FLAGS,
        MEASURE,
            MEASURE_NOCONTEXT,
            MEASURE_WITHCONTEXT,
        BASELINE,
            BASELINE_NOCONTEXT,
            BASELINE_WITHCONTEXT,
        PRINT,
            PRINT_NOCONTEXT,
            PRINT_WITHCONTEXT,
        DIRTIED,
        STYLE,
        LAYOUT,
        LINEINDEX,
        OWNER,
        CHILDREN,
        CONFIG,
        RESOLVEDDIMENSIONS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(YGNodeFlags.SIZEOF, YGNodeFlags.ALIGNOF),
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            ),
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            ),
            __union(
                __member(POINTER_SIZE),
                __member(POINTER_SIZE)
            ),
            __member(POINTER_SIZE),
            __member(YGStyle.SIZEOF, YGStyle.ALIGNOF),
            __member(YGLayout.SIZEOF, YGLayout.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __array(YGValue.SIZEOF, YGValue.ALIGNOF, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTEXT = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        MEASURE = layout.offsetof(2);
            MEASURE_NOCONTEXT = layout.offsetof(3);
            MEASURE_WITHCONTEXT = layout.offsetof(4);
        BASELINE = layout.offsetof(5);
            BASELINE_NOCONTEXT = layout.offsetof(6);
            BASELINE_WITHCONTEXT = layout.offsetof(7);
        PRINT = layout.offsetof(8);
            PRINT_NOCONTEXT = layout.offsetof(9);
            PRINT_WITHCONTEXT = layout.offsetof(10);
        DIRTIED = layout.offsetof(11);
        STYLE = layout.offsetof(12);
        LAYOUT = layout.offsetof(13);
        LINEINDEX = layout.offsetof(14);
        OWNER = layout.offsetof(15);
        CHILDREN = layout.offsetof(16);
        CONFIG = layout.offsetof(17);
        RESOLVEDDIMENSIONS = layout.offsetof(18);
    }

    protected YGNode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected YGNode create(long address, @Nullable ByteBuffer container) {
        return new YGNode(address, container);
    }

    /**
     * Creates a {@code YGNode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGNode(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code context} field. */
    @NativeType("void *")
    public long context() { return ncontext(address()); }
    /** @return a {@link YGNodeFlags} view of the {@code flags} field. */
    public YGNodeFlags flags() { return nflags(address()); }
    /** @return the value of the {@code measure.noContext} field. */
    @Nullable
    public YGMeasureFunc measure_noContext() { return nmeasure_noContext(address()); }
    /** @return the value of the {@code measure.withContext} field. */
    @NativeType("MeasureWithContextFn")
    public long measure_withContext() { return nmeasure_withContext(address()); }
    /** @return the value of the {@code baseline.noContext} field. */
    @Nullable
    public YGBaselineFunc baseline_noContext() { return nbaseline_noContext(address()); }
    /** @return the value of the {@code baseline.withContext} field. */
    @NativeType("BaselineWithContextFn")
    public long baseline_withContext() { return nbaseline_withContext(address()); }
    /** @return the value of the {@code print.noContext} field. */
    @Nullable
    public YGPrintFunc print_noContext() { return nprint_noContext(address()); }
    /** @return the value of the {@code print.withContext} field. */
    @NativeType("PrintWithContextFn")
    public long print_withContext() { return nprint_withContext(address()); }
    /** @return the value of the {@code dirtied} field. */
    @Nullable
    public YGDirtiedFunc dirtied() { return ndirtied(address()); }
    /** @return a {@link YGStyle} view of the {@code style} field. */
    public YGStyle style() { return nstyle(address()); }
    /** @return a {@link YGLayout} view of the {@code layout} field. */
    public YGLayout layout() { return nlayout(address()); }
    /** @return the value of the {@code lineIndex} field. */
    @NativeType("uint32_t")
    public int lineIndex() { return nlineIndex(address()); }
    /** @return the value of the {@code owner} field. */
    @NativeType("YGNodeRef")
    public long owner() { return nowner(address()); }
    /** @return the value of the {@code config} field. */
    @NativeType("YGConfigRef")
    public long config() { return nconfig(address()); }
    /** @return a {@link YGValue}.Buffer view of the {@code resolvedDimensions} field. */
    @NativeType("YGValue[2]")
    public YGValue.Buffer resolvedDimensions() { return nresolvedDimensions(address()); }
    /** @return a {@link YGValue} view of the struct at the specified index of the {@code resolvedDimensions} field. */
    public YGValue resolvedDimensions(int index) { return nresolvedDimensions(address(), index); }

    /** Sets the specified value to the {@code context} field. */
    public YGNode context(@NativeType("void *") long value) { ncontext(address(), value); return this; }
    /** Copies the specified {@link YGNodeFlags} to the {@code flags} field. */
    public YGNode flags(YGNodeFlags value) { nflags(address(), value); return this; }
    /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
    public YGNode flags(java.util.function.Consumer<YGNodeFlags> consumer) { consumer.accept(flags()); return this; }
    /** Sets the specified value to the {@code noContext} field. */
    public YGNode measure_noContext(@Nullable @NativeType("YGMeasureFunc") YGMeasureFuncI value) { nmeasure_noContext(address(), value); return this; }
    /** Sets the specified value to the {@code withContext} field. */
    public YGNode measure_withContext(@NativeType("MeasureWithContextFn") long value) { nmeasure_withContext(address(), value); return this; }
    /** Sets the specified value to the {@code noContext} field. */
    public YGNode baseline_noContext(@Nullable @NativeType("YGBaselineFunc") YGBaselineFuncI value) { nbaseline_noContext(address(), value); return this; }
    /** Sets the specified value to the {@code withContext} field. */
    public YGNode baseline_withContext(@NativeType("BaselineWithContextFn") long value) { nbaseline_withContext(address(), value); return this; }
    /** Sets the specified value to the {@code noContext} field. */
    public YGNode print_noContext(@Nullable @NativeType("YGPrintFunc") YGPrintFuncI value) { nprint_noContext(address(), value); return this; }
    /** Sets the specified value to the {@code withContext} field. */
    public YGNode print_withContext(@NativeType("PrintWithContextFn") long value) { nprint_withContext(address(), value); return this; }
    /** Sets the specified value to the {@code dirtied} field. */
    public YGNode dirtied(@Nullable @NativeType("YGDirtiedFunc") YGDirtiedFuncI value) { ndirtied(address(), value); return this; }
    /** Copies the specified {@link YGStyle} to the {@code style} field. */
    public YGNode style(YGStyle value) { nstyle(address(), value); return this; }
    /** Copies the specified {@link YGLayout} to the {@code layout} field. */
    public YGNode layout(YGLayout value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code lineIndex} field. */
    public YGNode lineIndex(@NativeType("uint32_t") int value) { nlineIndex(address(), value); return this; }
    /** Sets the specified value to the {@code owner} field. */
    public YGNode owner(@NativeType("YGNodeRef") long value) { nowner(address(), value); return this; }
    /** Sets the specified value to the {@code config} field. */
    public YGNode config(@NativeType("YGConfigRef") long value) { nconfig(address(), value); return this; }
    /** Copies the specified {@link YGValue.Buffer} to the {@code resolvedDimensions} field. */
    public YGNode resolvedDimensions(@NativeType("YGValue[2]") YGValue.Buffer value) { nresolvedDimensions(address(), value); return this; }
    /** Copies the specified {@link YGValue} at the specified index of the {@code resolvedDimensions} field. */
    public YGNode resolvedDimensions(int index, YGValue value) { nresolvedDimensions(address(), index, value); return this; }
    /** Passes the {@code resolvedDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
    public YGNode resolvedDimensions(java.util.function.Consumer<YGValue.Buffer> consumer) { consumer.accept(resolvedDimensions()); return this; }
    /** Passes the element at {@code index} of the {@code resolvedDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
    public YGNode resolvedDimensions(int index, java.util.function.Consumer<YGValue> consumer) { consumer.accept(resolvedDimensions(index)); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public YGNode set(YGNode src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code YGNode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static YGNode malloc() {
        return new YGNode(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code YGNode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static YGNode calloc() {
        return new YGNode(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code YGNode} instance allocated with {@link BufferUtils}. */
    public static YGNode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new YGNode(memAddress(container), container);
    }

    /** Returns a new {@code YGNode} instance for the specified memory address. */
    public static YGNode create(long address) {
        return new YGNode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGNode createSafe(long address) {
        return address == NULL ? null : new YGNode(address, null);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link YGNode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGNode.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static YGNode mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static YGNode callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static YGNode mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static YGNode callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static YGNode.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static YGNode.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static YGNode.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static YGNode.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code YGNode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNode malloc(MemoryStack stack) {
        return new YGNode(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code YGNode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNode calloc(MemoryStack stack) {
        return new YGNode(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + YGNode.CONTEXT); }
    /** Unsafe version of {@link #flags}. */
    public static YGNodeFlags nflags(long struct) { return YGNodeFlags.create(struct + YGNode.FLAGS); }
    /** Unsafe version of {@link #measure_noContext}. */
    @Nullable public static YGMeasureFunc nmeasure_noContext(long struct) { return YGMeasureFunc.createSafe(memGetAddress(struct + YGNode.MEASURE_NOCONTEXT)); }
    /** Unsafe version of {@link #measure_withContext}. */
    public static long nmeasure_withContext(long struct) { return memGetAddress(struct + YGNode.MEASURE_WITHCONTEXT); }
    /** Unsafe version of {@link #baseline_noContext}. */
    @Nullable public static YGBaselineFunc nbaseline_noContext(long struct) { return YGBaselineFunc.createSafe(memGetAddress(struct + YGNode.BASELINE_NOCONTEXT)); }
    /** Unsafe version of {@link #baseline_withContext}. */
    public static long nbaseline_withContext(long struct) { return memGetAddress(struct + YGNode.BASELINE_WITHCONTEXT); }
    /** Unsafe version of {@link #print_noContext}. */
    @Nullable public static YGPrintFunc nprint_noContext(long struct) { return YGPrintFunc.createSafe(memGetAddress(struct + YGNode.PRINT_NOCONTEXT)); }
    /** Unsafe version of {@link #print_withContext}. */
    public static long nprint_withContext(long struct) { return memGetAddress(struct + YGNode.PRINT_WITHCONTEXT); }
    /** Unsafe version of {@link #dirtied}. */
    @Nullable public static YGDirtiedFunc ndirtied(long struct) { return YGDirtiedFunc.createSafe(memGetAddress(struct + YGNode.DIRTIED)); }
    /** Unsafe version of {@link #style}. */
    public static YGStyle nstyle(long struct) { return YGStyle.create(struct + YGNode.STYLE); }
    /** Unsafe version of {@link #layout}. */
    public static YGLayout nlayout(long struct) { return YGLayout.create(struct + YGNode.LAYOUT); }
    /** Unsafe version of {@link #lineIndex}. */
    public static int nlineIndex(long struct) { return UNSAFE.getInt(null, struct + YGNode.LINEINDEX); }
    /** Unsafe version of {@link #owner}. */
    public static long nowner(long struct) { return memGetAddress(struct + YGNode.OWNER); }
    public static long nchildren(long struct) { return memGetAddress(struct + YGNode.CHILDREN); }
    /** Unsafe version of {@link #config}. */
    public static long nconfig(long struct) { return memGetAddress(struct + YGNode.CONFIG); }
    /** Unsafe version of {@link #resolvedDimensions}. */
    public static YGValue.Buffer nresolvedDimensions(long struct) { return YGValue.create(struct + YGNode.RESOLVEDDIMENSIONS, 2); }
    /** Unsafe version of {@link #resolvedDimensions(int) resolvedDimensions}. */
    public static YGValue nresolvedDimensions(long struct, int index) {
        return YGValue.create(struct + YGNode.RESOLVEDDIMENSIONS + check(index, 2) * YGValue.SIZEOF);
    }

    /** Unsafe version of {@link #context(long) context}. */
    public static void ncontext(long struct, long value) { memPutAddress(struct + YGNode.CONTEXT, value); }
    /** Unsafe version of {@link #flags(YGNodeFlags) flags}. */
    public static void nflags(long struct, YGNodeFlags value) { memCopy(value.address(), struct + YGNode.FLAGS, YGNodeFlags.SIZEOF); }
    /** Unsafe version of {@link #measure_noContext(YGMeasureFuncI) measure_noContext}. */
    public static void nmeasure_noContext(long struct, @Nullable YGMeasureFuncI value) { memPutAddress(struct + YGNode.MEASURE_NOCONTEXT, memAddressSafe(value)); }
    /** Unsafe version of {@link #measure_withContext(long) measure_withContext}. */
    public static void nmeasure_withContext(long struct, long value) { memPutAddress(struct + YGNode.MEASURE_WITHCONTEXT, value); }
    /** Unsafe version of {@link #baseline_noContext(YGBaselineFuncI) baseline_noContext}. */
    public static void nbaseline_noContext(long struct, @Nullable YGBaselineFuncI value) { memPutAddress(struct + YGNode.BASELINE_NOCONTEXT, memAddressSafe(value)); }
    /** Unsafe version of {@link #baseline_withContext(long) baseline_withContext}. */
    public static void nbaseline_withContext(long struct, long value) { memPutAddress(struct + YGNode.BASELINE_WITHCONTEXT, value); }
    /** Unsafe version of {@link #print_noContext(YGPrintFuncI) print_noContext}. */
    public static void nprint_noContext(long struct, @Nullable YGPrintFuncI value) { memPutAddress(struct + YGNode.PRINT_NOCONTEXT, memAddressSafe(value)); }
    /** Unsafe version of {@link #print_withContext(long) print_withContext}. */
    public static void nprint_withContext(long struct, long value) { memPutAddress(struct + YGNode.PRINT_WITHCONTEXT, value); }
    /** Unsafe version of {@link #dirtied(YGDirtiedFuncI) dirtied}. */
    public static void ndirtied(long struct, @Nullable YGDirtiedFuncI value) { memPutAddress(struct + YGNode.DIRTIED, memAddressSafe(value)); }
    /** Unsafe version of {@link #style(YGStyle) style}. */
    public static void nstyle(long struct, YGStyle value) { memCopy(value.address(), struct + YGNode.STYLE, YGStyle.SIZEOF); }
    /** Unsafe version of {@link #layout(YGLayout) layout}. */
    public static void nlayout(long struct, YGLayout value) { memCopy(value.address(), struct + YGNode.LAYOUT, YGLayout.SIZEOF); }
    /** Unsafe version of {@link #lineIndex(int) lineIndex}. */
    public static void nlineIndex(long struct, int value) { UNSAFE.putInt(null, struct + YGNode.LINEINDEX, value); }
    /** Unsafe version of {@link #owner(long) owner}. */
    public static void nowner(long struct, long value) { memPutAddress(struct + YGNode.OWNER, value); }
    public static void nchildren(long struct, long value) { memPutAddress(struct + YGNode.CHILDREN, value); }
    /** Unsafe version of {@link #config(long) config}. */
    public static void nconfig(long struct, long value) { memPutAddress(struct + YGNode.CONFIG, value); }
    /** Unsafe version of {@link #resolvedDimensions(YGValue.Buffer) resolvedDimensions}. */
    public static void nresolvedDimensions(long struct, YGValue.Buffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(value.address(), struct + YGNode.RESOLVEDDIMENSIONS, value.remaining() * YGValue.SIZEOF);
    }
    /** Unsafe version of {@link #resolvedDimensions(int, YGValue) resolvedDimensions}. */
    public static void nresolvedDimensions(long struct, int index, YGValue value) {
        memCopy(value.address(), struct + YGNode.RESOLVEDDIMENSIONS + check(index, 2) * YGValue.SIZEOF, YGValue.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link YGNode} structs. */
    public static class Buffer extends StructBuffer<YGNode, Buffer> implements NativeResource {

        private static final YGNode ELEMENT_FACTORY = YGNode.create(-1L);

        /**
         * Creates a new {@code YGNode.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGNode#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected YGNode getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code context} field. */
        @NativeType("void *")
        public long context() { return YGNode.ncontext(address()); }
        /** @return a {@link YGNodeFlags} view of the {@code flags} field. */
        public YGNodeFlags flags() { return YGNode.nflags(address()); }
        /** @return the value of the {@code measure.noContext} field. */
        @Nullable
        public YGMeasureFunc measure_noContext() { return YGNode.nmeasure_noContext(address()); }
        /** @return the value of the {@code measure.withContext} field. */
        @NativeType("MeasureWithContextFn")
        public long measure_withContext() { return YGNode.nmeasure_withContext(address()); }
        /** @return the value of the {@code baseline.noContext} field. */
        @Nullable
        public YGBaselineFunc baseline_noContext() { return YGNode.nbaseline_noContext(address()); }
        /** @return the value of the {@code baseline.withContext} field. */
        @NativeType("BaselineWithContextFn")
        public long baseline_withContext() { return YGNode.nbaseline_withContext(address()); }
        /** @return the value of the {@code print.noContext} field. */
        @Nullable
        public YGPrintFunc print_noContext() { return YGNode.nprint_noContext(address()); }
        /** @return the value of the {@code print.withContext} field. */
        @NativeType("PrintWithContextFn")
        public long print_withContext() { return YGNode.nprint_withContext(address()); }
        /** @return the value of the {@code dirtied} field. */
        @Nullable
        public YGDirtiedFunc dirtied() { return YGNode.ndirtied(address()); }
        /** @return a {@link YGStyle} view of the {@code style} field. */
        public YGStyle style() { return YGNode.nstyle(address()); }
        /** @return a {@link YGLayout} view of the {@code layout} field. */
        public YGLayout layout() { return YGNode.nlayout(address()); }
        /** @return the value of the {@code lineIndex} field. */
        @NativeType("uint32_t")
        public int lineIndex() { return YGNode.nlineIndex(address()); }
        /** @return the value of the {@code owner} field. */
        @NativeType("YGNodeRef")
        public long owner() { return YGNode.nowner(address()); }
        /** @return the value of the {@code config} field. */
        @NativeType("YGConfigRef")
        public long config() { return YGNode.nconfig(address()); }
        /** @return a {@link YGValue}.Buffer view of the {@code resolvedDimensions} field. */
        @NativeType("YGValue[2]")
        public YGValue.Buffer resolvedDimensions() { return YGNode.nresolvedDimensions(address()); }
        /** @return a {@link YGValue} view of the struct at the specified index of the {@code resolvedDimensions} field. */
        public YGValue resolvedDimensions(int index) { return YGNode.nresolvedDimensions(address(), index); }

        /** Sets the specified value to the {@code context} field. */
        public YGNode.Buffer context(@NativeType("void *") long value) { YGNode.ncontext(address(), value); return this; }
        /** Copies the specified {@link YGNodeFlags} to the {@code flags} field. */
        public YGNode.Buffer flags(YGNodeFlags value) { YGNode.nflags(address(), value); return this; }
        /** Passes the {@code flags} field to the specified {@link java.util.function.Consumer Consumer}. */
        public YGNode.Buffer flags(java.util.function.Consumer<YGNodeFlags> consumer) { consumer.accept(flags()); return this; }
        /** Sets the specified value to the {@code noContext} field. */
        public YGNode.Buffer measure_noContext(@Nullable @NativeType("YGMeasureFunc") YGMeasureFuncI value) { YGNode.nmeasure_noContext(address(), value); return this; }
        /** Sets the specified value to the {@code withContext} field. */
        public YGNode.Buffer measure_withContext(@NativeType("MeasureWithContextFn") long value) { YGNode.nmeasure_withContext(address(), value); return this; }
        /** Sets the specified value to the {@code noContext} field. */
        public YGNode.Buffer baseline_noContext(@Nullable @NativeType("YGBaselineFunc") YGBaselineFuncI value) { YGNode.nbaseline_noContext(address(), value); return this; }
        /** Sets the specified value to the {@code withContext} field. */
        public YGNode.Buffer baseline_withContext(@NativeType("BaselineWithContextFn") long value) { YGNode.nbaseline_withContext(address(), value); return this; }
        /** Sets the specified value to the {@code noContext} field. */
        public YGNode.Buffer print_noContext(@Nullable @NativeType("YGPrintFunc") YGPrintFuncI value) { YGNode.nprint_noContext(address(), value); return this; }
        /** Sets the specified value to the {@code withContext} field. */
        public YGNode.Buffer print_withContext(@NativeType("PrintWithContextFn") long value) { YGNode.nprint_withContext(address(), value); return this; }
        /** Sets the specified value to the {@code dirtied} field. */
        public YGNode.Buffer dirtied(@Nullable @NativeType("YGDirtiedFunc") YGDirtiedFuncI value) { YGNode.ndirtied(address(), value); return this; }
        /** Copies the specified {@link YGStyle} to the {@code style} field. */
        public YGNode.Buffer style(YGStyle value) { YGNode.nstyle(address(), value); return this; }
        /** Copies the specified {@link YGLayout} to the {@code layout} field. */
        public YGNode.Buffer layout(YGLayout value) { YGNode.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code lineIndex} field. */
        public YGNode.Buffer lineIndex(@NativeType("uint32_t") int value) { YGNode.nlineIndex(address(), value); return this; }
        /** Sets the specified value to the {@code owner} field. */
        public YGNode.Buffer owner(@NativeType("YGNodeRef") long value) { YGNode.nowner(address(), value); return this; }
        /** Sets the specified value to the {@code config} field. */
        public YGNode.Buffer config(@NativeType("YGConfigRef") long value) { YGNode.nconfig(address(), value); return this; }
        /** Copies the specified {@link YGValue.Buffer} to the {@code resolvedDimensions} field. */
        public YGNode.Buffer resolvedDimensions(@NativeType("YGValue[2]") YGValue.Buffer value) { YGNode.nresolvedDimensions(address(), value); return this; }
        /** Copies the specified {@link YGValue} at the specified index of the {@code resolvedDimensions} field. */
        public YGNode.Buffer resolvedDimensions(int index, YGValue value) { YGNode.nresolvedDimensions(address(), index, value); return this; }
        /** Passes the {@code resolvedDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
        public YGNode.Buffer resolvedDimensions(java.util.function.Consumer<YGValue.Buffer> consumer) { consumer.accept(resolvedDimensions()); return this; }
        /** Passes the element at {@code index} of the {@code resolvedDimensions} field to the specified {@link java.util.function.Consumer Consumer}. */
        public YGNode.Buffer resolvedDimensions(int index, java.util.function.Consumer<YGValue> consumer) { consumer.accept(resolvedDimensions(index)); return this; }

    }

}