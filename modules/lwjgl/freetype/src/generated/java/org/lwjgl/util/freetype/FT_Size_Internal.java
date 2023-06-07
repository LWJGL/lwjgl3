/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Size_Internal {
 *     void * module_data;
 *     FT_Render_Mode autohint_mode;
 *     {@link FT_Size_Metrics FT_Size_Metrics} autohint_metrics;
 * }</code></pre>
 */
public class FT_Size_Internal extends Struct<FT_Size_Internal> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MODULE_DATA,
        AUTOHINT_MODE,
        AUTOHINT_METRICS;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(FT_Size_Metrics.SIZEOF, FT_Size_Metrics.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MODULE_DATA = layout.offsetof(0);
        AUTOHINT_MODE = layout.offsetof(1);
        AUTOHINT_METRICS = layout.offsetof(2);
    }

    protected FT_Size_Internal(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Size_Internal create(long address, @Nullable ByteBuffer container) {
        return new FT_Size_Internal(address, container);
    }

    /**
     * Creates a {@code FT_Size_Internal} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Size_Internal(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code module_data} field. */
    @NativeType("void *")
    public long module_data() { return nmodule_data(address()); }
    /** @return the value of the {@code autohint_mode} field. */
    @NativeType("FT_Render_Mode")
    public int autohint_mode() { return nautohint_mode(address()); }
    /** @return a {@link FT_Size_Metrics} view of the {@code autohint_metrics} field. */
    public FT_Size_Metrics autohint_metrics() { return nautohint_metrics(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Size_Internal} instance for the specified memory address. */
    public static FT_Size_Internal create(long address) {
        return new FT_Size_Internal(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Size_Internal createSafe(long address) {
        return address == NULL ? null : new FT_Size_Internal(address, null);
    }

    /**
     * Create a {@link FT_Size_Internal.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Size_Internal.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Size_Internal.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #module_data}. */
    public static long nmodule_data(long struct) { return memGetAddress(struct + FT_Size_Internal.MODULE_DATA); }
    /** Unsafe version of {@link #autohint_mode}. */
    public static int nautohint_mode(long struct) { return UNSAFE.getInt(null, struct + FT_Size_Internal.AUTOHINT_MODE); }
    /** Unsafe version of {@link #autohint_metrics}. */
    public static FT_Size_Metrics nautohint_metrics(long struct) { return FT_Size_Metrics.create(struct + FT_Size_Internal.AUTOHINT_METRICS); }

    // -----------------------------------

    /** An array of {@link FT_Size_Internal} structs. */
    public static class Buffer extends StructBuffer<FT_Size_Internal, Buffer> {

        private static final FT_Size_Internal ELEMENT_FACTORY = FT_Size_Internal.create(-1L);

        /**
         * Creates a new {@code FT_Size_Internal.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Size_Internal#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Size_Internal getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code module_data} field. */
        @NativeType("void *")
        public long module_data() { return FT_Size_Internal.nmodule_data(address()); }
        /** @return the value of the {@code autohint_mode} field. */
        @NativeType("FT_Render_Mode")
        public int autohint_mode() { return FT_Size_Internal.nautohint_mode(address()); }
        /** @return a {@link FT_Size_Metrics} view of the {@code autohint_metrics} field. */
        public FT_Size_Metrics autohint_metrics() { return FT_Size_Internal.nautohint_metrics(address()); }

    }

}