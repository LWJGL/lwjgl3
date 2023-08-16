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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct YGNodeFlags {
 *     bool hasNewLayout : 1;
 *     bool isReferenceBaseline : 1;
 *     bool isDirty : 1;
 *     YGNodeType nodeType : 1;
 *     bool measureUsesContext : 1;
 *     bool baselineUsesContext : 1;
 *     bool printUsesContext : 1;
 * }</code></pre>
 */
public class YGNodeFlags extends Struct<YGNodeFlags> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
    }

    protected YGNodeFlags(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected YGNodeFlags create(long address, @Nullable ByteBuffer container) {
        return new YGNodeFlags(address, container);
    }

    /**
     * Creates a {@code YGNodeFlags} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public YGNodeFlags(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code hasNewLayout} field. */
    @NativeType("bool")
    public boolean hasNewLayout() { return nhasNewLayout(address()); }
    /** @return the value of the {@code isReferenceBaseline} field. */
    @NativeType("bool")
    public boolean isReferenceBaseline() { return nisReferenceBaseline(address()); }
    /** @return the value of the {@code isDirty} field. */
    @NativeType("bool")
    public boolean isDirty() { return nisDirty(address()); }
    /** @return the value of the {@code nodeType} field. */
    @NativeType("YGNodeType")
    public int nodeType() { return nnodeType(address()); }
    /** @return the value of the {@code measureUsesContext} field. */
    @NativeType("bool")
    public boolean measureUsesContext() { return nmeasureUsesContext(address()); }
    /** @return the value of the {@code baselineUsesContext} field. */
    @NativeType("bool")
    public boolean baselineUsesContext() { return nbaselineUsesContext(address()); }
    /** @return the value of the {@code printUsesContext} field. */
    @NativeType("bool")
    public boolean printUsesContext() { return nprintUsesContext(address()); }

    /** Sets the specified value to the {@code hasNewLayout} field. */
    public YGNodeFlags hasNewLayout(@NativeType("bool") boolean value) { nhasNewLayout(address(), value); return this; }
    /** Sets the specified value to the {@code isReferenceBaseline} field. */
    public YGNodeFlags isReferenceBaseline(@NativeType("bool") boolean value) { nisReferenceBaseline(address(), value); return this; }
    /** Sets the specified value to the {@code isDirty} field. */
    public YGNodeFlags isDirty(@NativeType("bool") boolean value) { nisDirty(address(), value); return this; }
    /** Sets the specified value to the {@code nodeType} field. */
    public YGNodeFlags nodeType(@NativeType("YGNodeType") int value) { nnodeType(address(), value); return this; }
    /** Sets the specified value to the {@code measureUsesContext} field. */
    public YGNodeFlags measureUsesContext(@NativeType("bool") boolean value) { nmeasureUsesContext(address(), value); return this; }
    /** Sets the specified value to the {@code baselineUsesContext} field. */
    public YGNodeFlags baselineUsesContext(@NativeType("bool") boolean value) { nbaselineUsesContext(address(), value); return this; }
    /** Sets the specified value to the {@code printUsesContext} field. */
    public YGNodeFlags printUsesContext(@NativeType("bool") boolean value) { nprintUsesContext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public YGNodeFlags set(
        boolean hasNewLayout,
        boolean isReferenceBaseline,
        boolean isDirty,
        int nodeType,
        boolean measureUsesContext,
        boolean baselineUsesContext,
        boolean printUsesContext
    ) {
        hasNewLayout(hasNewLayout);
        isReferenceBaseline(isReferenceBaseline);
        isDirty(isDirty);
        nodeType(nodeType);
        measureUsesContext(measureUsesContext);
        baselineUsesContext(baselineUsesContext);
        printUsesContext(printUsesContext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public YGNodeFlags set(YGNodeFlags src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code YGNodeFlags} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static YGNodeFlags malloc() {
        return new YGNodeFlags(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code YGNodeFlags} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static YGNodeFlags calloc() {
        return new YGNodeFlags(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code YGNodeFlags} instance allocated with {@link BufferUtils}. */
    public static YGNodeFlags create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new YGNodeFlags(memAddress(container), container);
    }

    /** Returns a new {@code YGNodeFlags} instance for the specified memory address. */
    public static YGNodeFlags create(long address) {
        return new YGNodeFlags(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGNodeFlags createSafe(long address) {
        return address == NULL ? null : new YGNodeFlags(address, null);
    }

    /**
     * Returns a new {@link YGNodeFlags.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNodeFlags.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link YGNodeFlags.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static YGNodeFlags.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNodeFlags.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static YGNodeFlags.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link YGNodeFlags.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static YGNodeFlags.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static YGNodeFlags.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code YGNodeFlags} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNodeFlags malloc(MemoryStack stack) {
        return new YGNodeFlags(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code YGNodeFlags} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static YGNodeFlags calloc(MemoryStack stack) {
        return new YGNodeFlags(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link YGNodeFlags.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGNodeFlags.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link YGNodeFlags.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static YGNodeFlags.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static byte nflags(long struct) { return UNSAFE.getByte(null, struct + YGNodeFlags.FLAGS); }
    /** Unsafe version of {@link #hasNewLayout}. */
    public static boolean nhasNewLayout(long struct) { return (nflags(struct) & 0b1) != 0; }
    /** Unsafe version of {@link #isReferenceBaseline}. */
    public static boolean nisReferenceBaseline(long struct) { return ((nflags(struct) >>> 1) & 0b1) != 0; }
    /** Unsafe version of {@link #isDirty}. */
    public static boolean nisDirty(long struct) { return ((nflags(struct) >>> 2) & 0b1) != 0; }
    /** Unsafe version of {@link #nodeType}. */
    public static int nnodeType(long struct) { return (nflags(struct) >>> 3) & 0b1; }
    /** Unsafe version of {@link #measureUsesContext}. */
    public static boolean nmeasureUsesContext(long struct) { return ((nflags(struct) >>> 4) & 0b1) != 0; }
    /** Unsafe version of {@link #baselineUsesContext}. */
    public static boolean nbaselineUsesContext(long struct) { return ((nflags(struct) >>> 5) & 0b1) != 0; }
    /** Unsafe version of {@link #printUsesContext}. */
    public static boolean nprintUsesContext(long struct) { return ((nflags(struct) >>> 6) & 0b1) != 0; }

    public static void nflags(long struct, byte value) { UNSAFE.putByte(null, struct + YGNodeFlags.FLAGS, value); }
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

    // -----------------------------------

    /** An array of {@link YGNodeFlags} structs. */
    public static class Buffer extends StructBuffer<YGNodeFlags, Buffer> implements NativeResource {

        private static final YGNodeFlags ELEMENT_FACTORY = YGNodeFlags.create(-1L);

        /**
         * Creates a new {@code YGNodeFlags.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link YGNodeFlags#SIZEOF}, and its mark will be undefined.</p>
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
        protected YGNodeFlags getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code hasNewLayout} field. */
        @NativeType("bool")
        public boolean hasNewLayout() { return YGNodeFlags.nhasNewLayout(address()); }
        /** @return the value of the {@code isReferenceBaseline} field. */
        @NativeType("bool")
        public boolean isReferenceBaseline() { return YGNodeFlags.nisReferenceBaseline(address()); }
        /** @return the value of the {@code isDirty} field. */
        @NativeType("bool")
        public boolean isDirty() { return YGNodeFlags.nisDirty(address()); }
        /** @return the value of the {@code nodeType} field. */
        @NativeType("YGNodeType")
        public int nodeType() { return YGNodeFlags.nnodeType(address()); }
        /** @return the value of the {@code measureUsesContext} field. */
        @NativeType("bool")
        public boolean measureUsesContext() { return YGNodeFlags.nmeasureUsesContext(address()); }
        /** @return the value of the {@code baselineUsesContext} field. */
        @NativeType("bool")
        public boolean baselineUsesContext() { return YGNodeFlags.nbaselineUsesContext(address()); }
        /** @return the value of the {@code printUsesContext} field. */
        @NativeType("bool")
        public boolean printUsesContext() { return YGNodeFlags.nprintUsesContext(address()); }

        /** Sets the specified value to the {@code hasNewLayout} field. */
        public YGNodeFlags.Buffer hasNewLayout(@NativeType("bool") boolean value) { YGNodeFlags.nhasNewLayout(address(), value); return this; }
        /** Sets the specified value to the {@code isReferenceBaseline} field. */
        public YGNodeFlags.Buffer isReferenceBaseline(@NativeType("bool") boolean value) { YGNodeFlags.nisReferenceBaseline(address(), value); return this; }
        /** Sets the specified value to the {@code isDirty} field. */
        public YGNodeFlags.Buffer isDirty(@NativeType("bool") boolean value) { YGNodeFlags.nisDirty(address(), value); return this; }
        /** Sets the specified value to the {@code nodeType} field. */
        public YGNodeFlags.Buffer nodeType(@NativeType("YGNodeType") int value) { YGNodeFlags.nnodeType(address(), value); return this; }
        /** Sets the specified value to the {@code measureUsesContext} field. */
        public YGNodeFlags.Buffer measureUsesContext(@NativeType("bool") boolean value) { YGNodeFlags.nmeasureUsesContext(address(), value); return this; }
        /** Sets the specified value to the {@code baselineUsesContext} field. */
        public YGNodeFlags.Buffer baselineUsesContext(@NativeType("bool") boolean value) { YGNodeFlags.nbaselineUsesContext(address(), value); return this; }
        /** Sets the specified value to the {@code printUsesContext} field. */
        public YGNodeFlags.Buffer printUsesContext(@NativeType("bool") boolean value) { YGNodeFlags.nprintUsesContext(address(), value); return this; }

    }

}