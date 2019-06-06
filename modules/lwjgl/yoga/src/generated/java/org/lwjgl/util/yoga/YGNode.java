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
 * struct YGNodeLWJGL {
 *     void * context;
 *     bool hasNewLayout : 1;
 *     bool isReferenceBaseline : 1;
 *     bool isDirty : 1;
 *     YGNodeType nodeType : 1;
 *     bool measureUsesContext : 1;
 *     bool baselineUsesContext : 1;
 *     bool printUsesContext : 1;
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
@NativeType("struct YGNodeLWJGL")
public class YGNode extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTEXT,
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
        LibYoga.initialize();

        try (MemoryStack stack = stackPush()) {
            IntBuffer offsets = stack.mallocInt(19);
            SIZEOF = offsets(memAddress(offsets));

            CONTEXT = offsets.get(0);
            MEASURE = offsets.get(1);
                MEASURE_NOCONTEXT = offsets.get(2);
                MEASURE_WITHCONTEXT = offsets.get(3);
            BASELINE = offsets.get(4);
                BASELINE_NOCONTEXT = offsets.get(5);
                BASELINE_WITHCONTEXT = offsets.get(6);
            PRINT = offsets.get(7);
                PRINT_NOCONTEXT = offsets.get(8);
                PRINT_WITHCONTEXT = offsets.get(9);
            DIRTIED = offsets.get(10);
            STYLE = offsets.get(11);
            LAYOUT = offsets.get(12);
            LINEINDEX = offsets.get(13);
            OWNER = offsets.get(14);
            CHILDREN = offsets.get(15);
            CONFIG = offsets.get(16);
            RESOLVEDDIMENSIONS = offsets.get(17);

            ALIGNOF = offsets.get(18);
        }
    }

    private static native int offsets(long buffer);

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

    /** Returns the value of the {@code context} field. */
    @NativeType("void *")
    public long context() { return ncontext(address()); }
    /** Returns the value of the {@code hasNewLayout} field. */
    @NativeType("bool")
    public boolean hasNewLayout() { return nhasNewLayout(address()); }
    /** Returns the value of the {@code isReferenceBaseline} field. */
    @NativeType("bool")
    public boolean isReferenceBaseline() { return nisReferenceBaseline(address()); }
    /** Returns the value of the {@code isDirty} field. */
    @NativeType("bool")
    public boolean isDirty() { return nisDirty(address()); }
    /** Returns the value of the {@code nodeType} field. */
    @NativeType("YGNodeType")
    public int nodeType() { return nnodeType(address()); }
    /** Returns the value of the {@code measureUsesContext} field. */
    @NativeType("bool")
    public boolean measureUsesContext() { return nmeasureUsesContext(address()); }
    /** Returns the value of the {@code baselineUsesContext} field. */
    @NativeType("bool")
    public boolean baselineUsesContext() { return nbaselineUsesContext(address()); }
    /** Returns the value of the {@code printUsesContext} field. */
    @NativeType("bool")
    public boolean printUsesContext() { return nprintUsesContext(address()); }
    /** Returns the value of the {@code measure.noContext} field. */
    @Nullable
    public YGMeasureFunc measure_noContext() { return nmeasure_noContext(address()); }
    /** Returns the value of the {@code measure.withContext} field. */
    @NativeType("MeasureWithContextFn")
    public long measure_withContext() { return nmeasure_withContext(address()); }
    /** Returns the value of the {@code baseline.noContext} field. */
    @Nullable
    public YGBaselineFunc baseline_noContext() { return nbaseline_noContext(address()); }
    /** Returns the value of the {@code baseline.withContext} field. */
    @NativeType("BaselineWithContextFn")
    public long baseline_withContext() { return nbaseline_withContext(address()); }
    /** Returns the value of the {@code print.noContext} field. */
    @Nullable
    public YGPrintFunc print_noContext() { return nprint_noContext(address()); }
    /** Returns the value of the {@code print.withContext} field. */
    @NativeType("PrintWithContextFn")
    public long print_withContext() { return nprint_withContext(address()); }
    /** Returns the value of the {@code dirtied} field. */
    @Nullable
    public YGDirtiedFunc dirtied() { return ndirtied(address()); }
    /** Returns a {@link YGStyle} view of the {@code style} field. */
    public YGStyle style() { return nstyle(address()); }
    /** Returns a {@link YGLayout} view of the {@code layout} field. */
    public YGLayout layout() { return nlayout(address()); }
    /** Returns the value of the {@code lineIndex} field. */
    @NativeType("uint32_t")
    public int lineIndex() { return nlineIndex(address()); }
    /** Returns the value of the {@code owner} field. */
    @NativeType("YGNodeRef")
    public long owner() { return nowner(address()); }
    /** Returns the value of the {@code config} field. */
    @NativeType("YGConfigRef")
    public long config() { return nconfig(address()); }
    /** Returns a {@link YGValue}.Buffer view of the {@code resolvedDimensions} field. */
    @NativeType("YGValue[2]")
    public YGValue.Buffer resolvedDimensions() { return nresolvedDimensions(address()); }
    /** Returns a {@link YGValue} view of the struct at the specified index of the {@code resolvedDimensions} field. */
    public YGValue resolvedDimensions(int index) { return nresolvedDimensions(address(), index); }

    /** Sets the specified value to the {@code context} field. */
    public YGNode context(@NativeType("void *") long value) { ncontext(address(), value); return this; }
    /** Sets the specified value to the {@code hasNewLayout} field. */
    public YGNode hasNewLayout(@NativeType("bool") boolean value) { nhasNewLayout(address(), value); return this; }
    /** Sets the specified value to the {@code isReferenceBaseline} field. */
    public YGNode isReferenceBaseline(@NativeType("bool") boolean value) { nisReferenceBaseline(address(), value); return this; }
    /** Sets the specified value to the {@code isDirty} field. */
    public YGNode isDirty(@NativeType("bool") boolean value) { nisDirty(address(), value); return this; }
    /** Sets the specified value to the {@code nodeType} field. */
    public YGNode nodeType(@NativeType("YGNodeType") int value) { nnodeType(address(), value); return this; }
    /** Sets the specified value to the {@code measureUsesContext} field. */
    public YGNode measureUsesContext(@NativeType("bool") boolean value) { nmeasureUsesContext(address(), value); return this; }
    /** Sets the specified value to the {@code baselineUsesContext} field. */
    public YGNode baselineUsesContext(@NativeType("bool") boolean value) { nbaselineUsesContext(address(), value); return this; }
    /** Sets the specified value to the {@code printUsesContext} field. */
    public YGNode printUsesContext(@NativeType("bool") boolean value) { nprintUsesContext(address(), value); return this; }
    /** Sets the specified value to the {@code measure.noContext} field. */
    public YGNode measure_noContext(@Nullable @NativeType("YGMeasureFunc") YGMeasureFuncI value) { nmeasure_noContext(address(), value); return this; }
    /** Sets the specified value to the {@code measure.withContext} field. */
    public YGNode measure_withContext(@NativeType("MeasureWithContextFn") long value) { nmeasure_withContext(address(), value); return this; }
    /** Sets the specified value to the {@code baseline.noContext} field. */
    public YGNode baseline_noContext(@Nullable @NativeType("YGBaselineFunc") YGBaselineFuncI value) { nbaseline_noContext(address(), value); return this; }
    /** Sets the specified value to the {@code baseline.withContext} field. */
    public YGNode baseline_withContext(@NativeType("BaselineWithContextFn") long value) { nbaseline_withContext(address(), value); return this; }
    /** Sets the specified value to the {@code print.noContext} field. */
    public YGNode print_noContext(@Nullable @NativeType("YGPrintFunc") YGPrintFuncI value) { nprint_noContext(address(), value); return this; }
    /** Sets the specified value to the {@code print.withContext} field. */
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
        return wrap(YGNode.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code YGNode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static YGNode calloc() {
        return wrap(YGNode.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code YGNode} instance allocated with {@link BufferUtils}. */
    public static YGNode create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(YGNode.class, memAddress(container), container);
    }

    /** Returns a new {@code YGNode} instance for the specified memory address. */
    public static YGNode create(long address) {
        return wrap(YGNode.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGNode createSafe(long address) {
        return address == NULL ? null : wrap(YGNode.class, address);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link YGNode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGNode.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code YGNode} instance allocated on the thread-local {@link MemoryStack}. */
    public static YGNode mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code YGNode} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static YGNode callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code YGNode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNode mallocStack(MemoryStack stack) {
        return wrap(YGNode.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code YGNode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNode callocStack(MemoryStack stack) {
        return wrap(YGNode.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + YGNode.CONTEXT); }
    /** Unsafe version of {@link #hasNewLayout}. */
    public static native boolean nhasNewLayout(long struct);
    /** Unsafe version of {@link #isReferenceBaseline}. */
    public static native boolean nisReferenceBaseline(long struct);
    /** Unsafe version of {@link #isDirty}. */
    public static native boolean nisDirty(long struct);
    /** Unsafe version of {@link #nodeType}. */
    public static native int nnodeType(long struct);
    /** Unsafe version of {@link #measureUsesContext}. */
    public static native boolean nmeasureUsesContext(long struct);
    /** Unsafe version of {@link #baselineUsesContext}. */
    public static native boolean nbaselineUsesContext(long struct);
    /** Unsafe version of {@link #printUsesContext}. */
    public static native boolean nprintUsesContext(long struct);
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
    /** Unsafe version of {@link #hasNewLayout(boolean) hasNewLayout}. */
    public static native void nhasNewLayout(long struct, boolean value);
    /** Unsafe version of {@link #isReferenceBaseline(boolean) isReferenceBaseline}. */
    public static native void nisReferenceBaseline(long struct, boolean value);
    /** Unsafe version of {@link #isDirty(boolean) isDirty}. */
    public static native void nisDirty(long struct, boolean value);
    /** Unsafe version of {@link #nodeType(int) nodeType}. */
    public static native void nnodeType(long struct, int value);
    /** Unsafe version of {@link #measureUsesContext(boolean) measureUsesContext}. */
    public static native void nmeasureUsesContext(long struct, boolean value);
    /** Unsafe version of {@link #baselineUsesContext(boolean) baselineUsesContext}. */
    public static native void nbaselineUsesContext(long struct, boolean value);
    /** Unsafe version of {@link #printUsesContext(boolean) printUsesContext}. */
    public static native void nprintUsesContext(long struct, boolean value);
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGNode#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code context} field. */
        @NativeType("void *")
        public long context() { return YGNode.ncontext(address()); }
        /** Returns the value of the {@code hasNewLayout} field. */
        @NativeType("bool")
        public boolean hasNewLayout() { return YGNode.nhasNewLayout(address()); }
        /** Returns the value of the {@code isReferenceBaseline} field. */
        @NativeType("bool")
        public boolean isReferenceBaseline() { return YGNode.nisReferenceBaseline(address()); }
        /** Returns the value of the {@code isDirty} field. */
        @NativeType("bool")
        public boolean isDirty() { return YGNode.nisDirty(address()); }
        /** Returns the value of the {@code nodeType} field. */
        @NativeType("YGNodeType")
        public int nodeType() { return YGNode.nnodeType(address()); }
        /** Returns the value of the {@code measureUsesContext} field. */
        @NativeType("bool")
        public boolean measureUsesContext() { return YGNode.nmeasureUsesContext(address()); }
        /** Returns the value of the {@code baselineUsesContext} field. */
        @NativeType("bool")
        public boolean baselineUsesContext() { return YGNode.nbaselineUsesContext(address()); }
        /** Returns the value of the {@code printUsesContext} field. */
        @NativeType("bool")
        public boolean printUsesContext() { return YGNode.nprintUsesContext(address()); }
        /** Returns the value of the {@code measure.noContext} field. */
        @Nullable
        public YGMeasureFunc measure_noContext() { return YGNode.nmeasure_noContext(address()); }
        /** Returns the value of the {@code measure.withContext} field. */
        @NativeType("MeasureWithContextFn")
        public long measure_withContext() { return YGNode.nmeasure_withContext(address()); }
        /** Returns the value of the {@code baseline.noContext} field. */
        @Nullable
        public YGBaselineFunc baseline_noContext() { return YGNode.nbaseline_noContext(address()); }
        /** Returns the value of the {@code baseline.withContext} field. */
        @NativeType("BaselineWithContextFn")
        public long baseline_withContext() { return YGNode.nbaseline_withContext(address()); }
        /** Returns the value of the {@code print.noContext} field. */
        @Nullable
        public YGPrintFunc print_noContext() { return YGNode.nprint_noContext(address()); }
        /** Returns the value of the {@code print.withContext} field. */
        @NativeType("PrintWithContextFn")
        public long print_withContext() { return YGNode.nprint_withContext(address()); }
        /** Returns the value of the {@code dirtied} field. */
        @Nullable
        public YGDirtiedFunc dirtied() { return YGNode.ndirtied(address()); }
        /** Returns a {@link YGStyle} view of the {@code style} field. */
        public YGStyle style() { return YGNode.nstyle(address()); }
        /** Returns a {@link YGLayout} view of the {@code layout} field. */
        public YGLayout layout() { return YGNode.nlayout(address()); }
        /** Returns the value of the {@code lineIndex} field. */
        @NativeType("uint32_t")
        public int lineIndex() { return YGNode.nlineIndex(address()); }
        /** Returns the value of the {@code owner} field. */
        @NativeType("YGNodeRef")
        public long owner() { return YGNode.nowner(address()); }
        /** Returns the value of the {@code config} field. */
        @NativeType("YGConfigRef")
        public long config() { return YGNode.nconfig(address()); }
        /** Returns a {@link YGValue}.Buffer view of the {@code resolvedDimensions} field. */
        @NativeType("YGValue[2]")
        public YGValue.Buffer resolvedDimensions() { return YGNode.nresolvedDimensions(address()); }
        /** Returns a {@link YGValue} view of the struct at the specified index of the {@code resolvedDimensions} field. */
        public YGValue resolvedDimensions(int index) { return YGNode.nresolvedDimensions(address(), index); }

        /** Sets the specified value to the {@code context} field. */
        public YGNode.Buffer context(@NativeType("void *") long value) { YGNode.ncontext(address(), value); return this; }
        /** Sets the specified value to the {@code hasNewLayout} field. */
        public YGNode.Buffer hasNewLayout(@NativeType("bool") boolean value) { YGNode.nhasNewLayout(address(), value); return this; }
        /** Sets the specified value to the {@code isReferenceBaseline} field. */
        public YGNode.Buffer isReferenceBaseline(@NativeType("bool") boolean value) { YGNode.nisReferenceBaseline(address(), value); return this; }
        /** Sets the specified value to the {@code isDirty} field. */
        public YGNode.Buffer isDirty(@NativeType("bool") boolean value) { YGNode.nisDirty(address(), value); return this; }
        /** Sets the specified value to the {@code nodeType} field. */
        public YGNode.Buffer nodeType(@NativeType("YGNodeType") int value) { YGNode.nnodeType(address(), value); return this; }
        /** Sets the specified value to the {@code measureUsesContext} field. */
        public YGNode.Buffer measureUsesContext(@NativeType("bool") boolean value) { YGNode.nmeasureUsesContext(address(), value); return this; }
        /** Sets the specified value to the {@code baselineUsesContext} field. */
        public YGNode.Buffer baselineUsesContext(@NativeType("bool") boolean value) { YGNode.nbaselineUsesContext(address(), value); return this; }
        /** Sets the specified value to the {@code printUsesContext} field. */
        public YGNode.Buffer printUsesContext(@NativeType("bool") boolean value) { YGNode.nprintUsesContext(address(), value); return this; }
        /** Sets the specified value to the {@code measure.noContext} field. */
        public YGNode.Buffer measure_noContext(@Nullable @NativeType("YGMeasureFunc") YGMeasureFuncI value) { YGNode.nmeasure_noContext(address(), value); return this; }
        /** Sets the specified value to the {@code measure.withContext} field. */
        public YGNode.Buffer measure_withContext(@NativeType("MeasureWithContextFn") long value) { YGNode.nmeasure_withContext(address(), value); return this; }
        /** Sets the specified value to the {@code baseline.noContext} field. */
        public YGNode.Buffer baseline_noContext(@Nullable @NativeType("YGBaselineFunc") YGBaselineFuncI value) { YGNode.nbaseline_noContext(address(), value); return this; }
        /** Sets the specified value to the {@code baseline.withContext} field. */
        public YGNode.Buffer baseline_withContext(@NativeType("BaselineWithContextFn") long value) { YGNode.nbaseline_withContext(address(), value); return this; }
        /** Sets the specified value to the {@code print.noContext} field. */
        public YGNode.Buffer print_noContext(@Nullable @NativeType("YGPrintFunc") YGPrintFuncI value) { YGNode.nprint_noContext(address(), value); return this; }
        /** Sets the specified value to the {@code print.withContext} field. */
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