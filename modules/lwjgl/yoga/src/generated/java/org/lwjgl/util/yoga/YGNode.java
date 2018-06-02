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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGNode {
 *     void * context;
 *     {@link YGPrintFuncI YGPrintFunc} print;
 *     bool hasNewLayout;
 *     YGNodeType nodeType;
 *     {@link YGMeasureFuncI YGMeasureFunc} measure;
 *     {@link YGBaselineFuncI YGBaselineFunc} baseline;
 *     {@link YGDirtiedFuncI YGDirtiedFunc} dirtied;
 *     {@link YGStyle YGStyle} style;
 *     {@link YGLayout YGLayout} layout;
 *     uint32_t lineIndex;
 *     YGNodeRef owner;
 *     YGNodeListRef children;
 *     {@link YGNode YGNode} * nextChild;
 *     YGConfigRef config;
 *     bool isDirty;
 *     {@link YGValue YGValue} * resolvedDimensions[2];
 * }</code></pre>
 */
public class YGNode extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CONTEXT,
        PRINT,
        HASNEWLAYOUT,
        NODETYPE,
        MEASURE,
        BASELINE,
        DIRTIED,
        STYLE,
        LAYOUT,
        LINEINDEX,
        OWNER,
        CHILDREN,
        NEXTCHILD,
        CONFIG,
        ISDIRTY,
        RESOLVEDDIMENSIONS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(YGStyle.SIZEOF, YGStyle.ALIGNOF),
            __member(YGLayout.SIZEOF, YGLayout.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(1),
            __array(POINTER_SIZE, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CONTEXT = layout.offsetof(0);
        PRINT = layout.offsetof(1);
        HASNEWLAYOUT = layout.offsetof(2);
        NODETYPE = layout.offsetof(3);
        MEASURE = layout.offsetof(4);
        BASELINE = layout.offsetof(5);
        DIRTIED = layout.offsetof(6);
        STYLE = layout.offsetof(7);
        LAYOUT = layout.offsetof(8);
        LINEINDEX = layout.offsetof(9);
        OWNER = layout.offsetof(10);
        CHILDREN = layout.offsetof(11);
        NEXTCHILD = layout.offsetof(12);
        CONFIG = layout.offsetof(13);
        ISDIRTY = layout.offsetof(14);
        RESOLVEDDIMENSIONS = layout.offsetof(15);
    }

    YGNode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link YGNode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGNode(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code context} field. */
    @NativeType("void *")
    public long context() { return ncontext(address()); }
    /** Returns the value of the {@code print} field. */
    @Nullable
    public YGPrintFunc print() { return nprint(address()); }
    /** Returns the value of the {@code hasNewLayout} field. */
    @NativeType("bool")
    public boolean hasNewLayout() { return nhasNewLayout(address()); }
    /** Returns the value of the {@code nodeType} field. */
    @NativeType("YGNodeType")
    public int nodeType() { return nnodeType(address()); }
    /** Returns the value of the {@code measure} field. */
    @Nullable
    public YGMeasureFunc measure() { return nmeasure(address()); }
    /** Returns the value of the {@code baseline} field. */
    @Nullable
    public YGBaselineFunc baseline() { return nbaseline(address()); }
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
    /** Returns the value of the {@code children} field. */
    @NativeType("YGNodeListRef")
    public long children() { return nchildren(address()); }
    /** Returns a {@link YGNode} view of the struct pointed to by the {@code nextChild} field. */
    @Nullable
    @NativeType("YGNode *")
    public YGNode nextChild() { return nnextChild(address()); }
    /** Returns the value of the {@code config} field. */
    @NativeType("YGConfigRef")
    public long config() { return nconfig(address()); }
    /** Returns the value of the {@code isDirty} field. */
    @NativeType("bool")
    public boolean isDirty() { return nisDirty(address()); }
    /** Returns a {@link PointerBuffer} view of the {@code resolvedDimensions} field. */
    @NativeType("YGValue *[2]")
    public PointerBuffer resolvedDimensions() { return nresolvedDimensions(address()); }
    /** Returns a {@link YGValue} view of the pointer at the specified index of the {@code resolvedDimensions} field. */
    @NativeType("YGValue *")
    public YGValue resolvedDimensions(int index) { return nresolvedDimensions(address(), index); }

    /** Sets the specified value to the {@code context} field. */
    public YGNode context(@NativeType("void *") long value) { ncontext(address(), value); return this; }
    /** Sets the specified value to the {@code print} field. */
    public YGNode print(@Nullable @NativeType("YGPrintFunc") YGPrintFuncI value) { nprint(address(), value); return this; }
    /** Sets the specified value to the {@code hasNewLayout} field. */
    public YGNode hasNewLayout(@NativeType("bool") boolean value) { nhasNewLayout(address(), value); return this; }
    /** Sets the specified value to the {@code nodeType} field. */
    public YGNode nodeType(@NativeType("YGNodeType") int value) { nnodeType(address(), value); return this; }
    /** Sets the specified value to the {@code measure} field. */
    public YGNode measure(@Nullable @NativeType("YGMeasureFunc") YGMeasureFuncI value) { nmeasure(address(), value); return this; }
    /** Sets the specified value to the {@code baseline} field. */
    public YGNode baseline(@Nullable @NativeType("YGBaselineFunc") YGBaselineFuncI value) { nbaseline(address(), value); return this; }
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
    /** Sets the specified value to the {@code children} field. */
    public YGNode children(@NativeType("YGNodeListRef") long value) { nchildren(address(), value); return this; }
    /** Sets the address of the specified {@link YGNode} to the {@code nextChild} field. */
    public YGNode nextChild(@Nullable @NativeType("YGNode *") YGNode value) { nnextChild(address(), value); return this; }
    /** Sets the specified value to the {@code config} field. */
    public YGNode config(@NativeType("YGConfigRef") long value) { nconfig(address(), value); return this; }
    /** Sets the specified value to the {@code isDirty} field. */
    public YGNode isDirty(@NativeType("bool") boolean value) { nisDirty(address(), value); return this; }
    /** Copies the specified {@link PointerBuffer} to the {@code resolvedDimensions} field. */
    public YGNode resolvedDimensions(@NativeType("YGValue *[2]") PointerBuffer value) { nresolvedDimensions(address(), value); return this; }
    /** Copies the address of the specified {@link YGValue} at the specified index of the {@code resolvedDimensions} field. */
    public YGNode resolvedDimensions(int index, @NativeType("YGValue *") YGValue value) { nresolvedDimensions(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public YGNode set(
        long context,
        @Nullable YGPrintFuncI print,
        boolean hasNewLayout,
        int nodeType,
        @Nullable YGMeasureFuncI measure,
        @Nullable YGBaselineFuncI baseline,
        @Nullable YGDirtiedFuncI dirtied,
        YGStyle style,
        YGLayout layout,
        int lineIndex,
        long owner,
        long children,
        @Nullable YGNode nextChild,
        long config,
        boolean isDirty,
        PointerBuffer resolvedDimensions
    ) {
        context(context);
        print(print);
        hasNewLayout(hasNewLayout);
        nodeType(nodeType);
        measure(measure);
        baseline(baseline);
        dirtied(dirtied);
        style(style);
        layout(layout);
        lineIndex(lineIndex);
        owner(owner);
        children(children);
        nextChild(nextChild);
        config(config);
        isDirty(isDirty);
        resolvedDimensions(resolvedDimensions);

        return this;
    }

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

    /** Returns a new {@link YGNode} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static YGNode malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link YGNode} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static YGNode calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link YGNode} instance allocated with {@link BufferUtils}. */
    public static YGNode create() {
        return new YGNode(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link YGNode} instance for the specified memory address. */
    public static YGNode create(long address) {
        return new YGNode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGNode createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link YGNode} instance allocated on the thread-local {@link MemoryStack}. */
    public static YGNode mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link YGNode} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static YGNode callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link YGNode} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNode mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link YGNode} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNode callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
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
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNode.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGNode.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #context}. */
    public static long ncontext(long struct) { return memGetAddress(struct + YGNode.CONTEXT); }
    /** Unsafe version of {@link #print}. */
    @Nullable public static YGPrintFunc nprint(long struct) { return YGPrintFunc.createSafe(memGetAddress(struct + YGNode.PRINT)); }
    /** Unsafe version of {@link #hasNewLayout}. */
    public static boolean nhasNewLayout(long struct) { return memGetByte(struct + YGNode.HASNEWLAYOUT) != 0; }
    /** Unsafe version of {@link #nodeType}. */
    public static int nnodeType(long struct) { return memGetInt(struct + YGNode.NODETYPE); }
    /** Unsafe version of {@link #measure}. */
    @Nullable public static YGMeasureFunc nmeasure(long struct) { return YGMeasureFunc.createSafe(memGetAddress(struct + YGNode.MEASURE)); }
    /** Unsafe version of {@link #baseline}. */
    @Nullable public static YGBaselineFunc nbaseline(long struct) { return YGBaselineFunc.createSafe(memGetAddress(struct + YGNode.BASELINE)); }
    /** Unsafe version of {@link #dirtied}. */
    @Nullable public static YGDirtiedFunc ndirtied(long struct) { return YGDirtiedFunc.createSafe(memGetAddress(struct + YGNode.DIRTIED)); }
    /** Unsafe version of {@link #style}. */
    public static YGStyle nstyle(long struct) { return YGStyle.create(struct + YGNode.STYLE); }
    /** Unsafe version of {@link #layout}. */
    public static YGLayout nlayout(long struct) { return YGLayout.create(struct + YGNode.LAYOUT); }
    /** Unsafe version of {@link #lineIndex}. */
    public static int nlineIndex(long struct) { return memGetInt(struct + YGNode.LINEINDEX); }
    /** Unsafe version of {@link #owner}. */
    public static long nowner(long struct) { return memGetAddress(struct + YGNode.OWNER); }
    /** Unsafe version of {@link #children}. */
    public static long nchildren(long struct) { return memGetAddress(struct + YGNode.CHILDREN); }
    /** Unsafe version of {@link #nextChild}. */
    @Nullable public static YGNode nnextChild(long struct) { return YGNode.createSafe(memGetAddress(struct + YGNode.NEXTCHILD)); }
    /** Unsafe version of {@link #config}. */
    public static long nconfig(long struct) { return memGetAddress(struct + YGNode.CONFIG); }
    /** Unsafe version of {@link #isDirty}. */
    public static boolean nisDirty(long struct) { return memGetByte(struct + YGNode.ISDIRTY) != 0; }
    /** Unsafe version of {@link #resolvedDimensions}. */
    public static PointerBuffer nresolvedDimensions(long struct) { return memPointerBuffer(struct + YGNode.RESOLVEDDIMENSIONS, 2); }
    /** Unsafe version of {@link #resolvedDimensions(int) resolvedDimensions}. */
    public static YGValue nresolvedDimensions(long struct, int index) {
        return YGValue.create(memGetAddress(struct + YGNode.RESOLVEDDIMENSIONS + check(index, 2) * POINTER_SIZE));
    }

    /** Unsafe version of {@link #context(long) context}. */
    public static void ncontext(long struct, long value) { memPutAddress(struct + YGNode.CONTEXT, value); }
    /** Unsafe version of {@link #print(YGPrintFuncI) print}. */
    public static void nprint(long struct, @Nullable YGPrintFuncI value) { memPutAddress(struct + YGNode.PRINT, memAddressSafe(value)); }
    /** Unsafe version of {@link #hasNewLayout(boolean) hasNewLayout}. */
    public static void nhasNewLayout(long struct, boolean value) { memPutByte(struct + YGNode.HASNEWLAYOUT, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #nodeType(int) nodeType}. */
    public static void nnodeType(long struct, int value) { memPutInt(struct + YGNode.NODETYPE, value); }
    /** Unsafe version of {@link #measure(YGMeasureFuncI) measure}. */
    public static void nmeasure(long struct, @Nullable YGMeasureFuncI value) { memPutAddress(struct + YGNode.MEASURE, memAddressSafe(value)); }
    /** Unsafe version of {@link #baseline(YGBaselineFuncI) baseline}. */
    public static void nbaseline(long struct, @Nullable YGBaselineFuncI value) { memPutAddress(struct + YGNode.BASELINE, memAddressSafe(value)); }
    /** Unsafe version of {@link #dirtied(YGDirtiedFuncI) dirtied}. */
    public static void ndirtied(long struct, @Nullable YGDirtiedFuncI value) { memPutAddress(struct + YGNode.DIRTIED, memAddressSafe(value)); }
    /** Unsafe version of {@link #style(YGStyle) style}. */
    public static void nstyle(long struct, YGStyle value) { memCopy(value.address(), struct + YGNode.STYLE, YGStyle.SIZEOF); }
    /** Unsafe version of {@link #layout(YGLayout) layout}. */
    public static void nlayout(long struct, YGLayout value) { memCopy(value.address(), struct + YGNode.LAYOUT, YGLayout.SIZEOF); }
    /** Unsafe version of {@link #lineIndex(int) lineIndex}. */
    public static void nlineIndex(long struct, int value) { memPutInt(struct + YGNode.LINEINDEX, value); }
    /** Unsafe version of {@link #owner(long) owner}. */
    public static void nowner(long struct, long value) { memPutAddress(struct + YGNode.OWNER, value); }
    /** Unsafe version of {@link #children(long) children}. */
    public static void nchildren(long struct, long value) { memPutAddress(struct + YGNode.CHILDREN, value); }
    /** Unsafe version of {@link #nextChild(YGNode) nextChild}. */
    public static void nnextChild(long struct, @Nullable YGNode value) { memPutAddress(struct + YGNode.NEXTCHILD, memAddressSafe(value)); }
    /** Unsafe version of {@link #config(long) config}. */
    public static void nconfig(long struct, long value) { memPutAddress(struct + YGNode.CONFIG, value); }
    /** Unsafe version of {@link #isDirty(boolean) isDirty}. */
    public static void nisDirty(long struct, boolean value) { memPutByte(struct + YGNode.ISDIRTY, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #resolvedDimensions(PointerBuffer) resolvedDimensions}. */
    public static void nresolvedDimensions(long struct, PointerBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + YGNode.RESOLVEDDIMENSIONS, value.remaining() * POINTER_SIZE);
    }
    /** Unsafe version of {@link #resolvedDimensions(int, YGValue) resolvedDimensions}. */
    public static void nresolvedDimensions(long struct, int index, YGValue value) {
        memPutAddress(struct + YGNode.RESOLVEDDIMENSIONS + check(index, 2) * POINTER_SIZE, value.address());
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + YGNode.RESOLVEDDIMENSIONS));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link YGNode} structs. */
    public static class Buffer extends StructBuffer<YGNode, Buffer> implements NativeResource {

        /**
         * Creates a new {@link YGNode.Buffer} instance backed by the specified container.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected YGNode newInstance(long address) {
            return new YGNode(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code context} field. */
        @NativeType("void *")
        public long context() { return YGNode.ncontext(address()); }
        /** Returns the value of the {@code print} field. */
        @Nullable
        public YGPrintFunc print() { return YGNode.nprint(address()); }
        /** Returns the value of the {@code hasNewLayout} field. */
        @NativeType("bool")
        public boolean hasNewLayout() { return YGNode.nhasNewLayout(address()); }
        /** Returns the value of the {@code nodeType} field. */
        @NativeType("YGNodeType")
        public int nodeType() { return YGNode.nnodeType(address()); }
        /** Returns the value of the {@code measure} field. */
        @Nullable
        public YGMeasureFunc measure() { return YGNode.nmeasure(address()); }
        /** Returns the value of the {@code baseline} field. */
        @Nullable
        public YGBaselineFunc baseline() { return YGNode.nbaseline(address()); }
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
        /** Returns the value of the {@code children} field. */
        @NativeType("YGNodeListRef")
        public long children() { return YGNode.nchildren(address()); }
        /** Returns a {@link YGNode} view of the struct pointed to by the {@code nextChild} field. */
        @Nullable
        @NativeType("YGNode *")
        public YGNode nextChild() { return YGNode.nnextChild(address()); }
        /** Returns the value of the {@code config} field. */
        @NativeType("YGConfigRef")
        public long config() { return YGNode.nconfig(address()); }
        /** Returns the value of the {@code isDirty} field. */
        @NativeType("bool")
        public boolean isDirty() { return YGNode.nisDirty(address()); }
        /** Returns a {@link PointerBuffer} view of the {@code resolvedDimensions} field. */
        @NativeType("YGValue *[2]")
        public PointerBuffer resolvedDimensions() { return YGNode.nresolvedDimensions(address()); }
        /** Returns a {@link YGValue} view of the pointer at the specified index of the {@code resolvedDimensions} field. */
        @NativeType("YGValue *")
        public YGValue resolvedDimensions(int index) { return YGNode.nresolvedDimensions(address(), index); }

        /** Sets the specified value to the {@code context} field. */
        public YGNode.Buffer context(@NativeType("void *") long value) { YGNode.ncontext(address(), value); return this; }
        /** Sets the specified value to the {@code print} field. */
        public YGNode.Buffer print(@Nullable @NativeType("YGPrintFunc") YGPrintFuncI value) { YGNode.nprint(address(), value); return this; }
        /** Sets the specified value to the {@code hasNewLayout} field. */
        public YGNode.Buffer hasNewLayout(@NativeType("bool") boolean value) { YGNode.nhasNewLayout(address(), value); return this; }
        /** Sets the specified value to the {@code nodeType} field. */
        public YGNode.Buffer nodeType(@NativeType("YGNodeType") int value) { YGNode.nnodeType(address(), value); return this; }
        /** Sets the specified value to the {@code measure} field. */
        public YGNode.Buffer measure(@Nullable @NativeType("YGMeasureFunc") YGMeasureFuncI value) { YGNode.nmeasure(address(), value); return this; }
        /** Sets the specified value to the {@code baseline} field. */
        public YGNode.Buffer baseline(@Nullable @NativeType("YGBaselineFunc") YGBaselineFuncI value) { YGNode.nbaseline(address(), value); return this; }
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
        /** Sets the specified value to the {@code children} field. */
        public YGNode.Buffer children(@NativeType("YGNodeListRef") long value) { YGNode.nchildren(address(), value); return this; }
        /** Sets the address of the specified {@link YGNode} to the {@code nextChild} field. */
        public YGNode.Buffer nextChild(@Nullable @NativeType("YGNode *") YGNode value) { YGNode.nnextChild(address(), value); return this; }
        /** Sets the specified value to the {@code config} field. */
        public YGNode.Buffer config(@NativeType("YGConfigRef") long value) { YGNode.nconfig(address(), value); return this; }
        /** Sets the specified value to the {@code isDirty} field. */
        public YGNode.Buffer isDirty(@NativeType("bool") boolean value) { YGNode.nisDirty(address(), value); return this; }
        /** Copies the specified {@link PointerBuffer} to the {@code resolvedDimensions} field. */
        public YGNode.Buffer resolvedDimensions(@NativeType("YGValue *[2]") PointerBuffer value) { YGNode.nresolvedDimensions(address(), value); return this; }
        /** Copies the address of the specified {@link YGValue} at the specified index of the {@code resolvedDimensions} field. */
        public YGNode.Buffer resolvedDimensions(int index, @NativeType("YGValue *") YGValue value) { YGNode.nresolvedDimensions(address(), index, value); return this; }

    }

}