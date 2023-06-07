/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.util.freetype.FreeType.*;

/**
 * A structure to model the axes and space of a Multiple Masters font.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Multi_Master {
 *     FT_UInt num_axis;
 *     FT_UInt num_designs;
 *     {@link FT_MM_Axis FT_MM_Axis} axis[T1_MAX_MM_AXIS];
 * }</code></pre>
 */
public class FT_Multi_Master extends Struct<FT_Multi_Master> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_AXIS,
        NUM_DESIGNS,
        AXIS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __array(FT_MM_Axis.SIZEOF, FT_MM_Axis.ALIGNOF, T1_MAX_MM_AXIS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_AXIS = layout.offsetof(0);
        NUM_DESIGNS = layout.offsetof(1);
        AXIS = layout.offsetof(2);
    }

    protected FT_Multi_Master(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Multi_Master create(long address, @Nullable ByteBuffer container) {
        return new FT_Multi_Master(address, container);
    }

    /**
     * Creates a {@code FT_Multi_Master} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Multi_Master(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_axis} field. */
    @NativeType("FT_UInt")
    public int num_axis() { return nnum_axis(address()); }
    /** @return the value of the {@code num_designs} field. */
    @NativeType("FT_UInt")
    public int num_designs() { return nnum_designs(address()); }
    /** @return a {@link FT_MM_Axis}.Buffer view of the {@code axis} field. */
    @NativeType("FT_MM_Axis[T1_MAX_MM_AXIS]")
    public FT_MM_Axis.Buffer axis() { return naxis(address()); }
    /** @return a {@link FT_MM_Axis} view of the struct at the specified index of the {@code axis} field. */
    public FT_MM_Axis axis(int index) { return naxis(address(), index); }

    // -----------------------------------

    /** Returns a new {@code FT_Multi_Master} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Multi_Master malloc() {
        return new FT_Multi_Master(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Multi_Master} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Multi_Master calloc() {
        return new FT_Multi_Master(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Multi_Master} instance allocated with {@link BufferUtils}. */
    public static FT_Multi_Master create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Multi_Master(memAddress(container), container);
    }

    /** Returns a new {@code FT_Multi_Master} instance for the specified memory address. */
    public static FT_Multi_Master create(long address) {
        return new FT_Multi_Master(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Multi_Master createSafe(long address) {
        return address == NULL ? null : new FT_Multi_Master(address, null);
    }

    /**
     * Returns a new {@link FT_Multi_Master.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Multi_Master.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Multi_Master.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Multi_Master.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Multi_Master.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Multi_Master.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Multi_Master.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Multi_Master.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Multi_Master.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Multi_Master} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Multi_Master malloc(MemoryStack stack) {
        return new FT_Multi_Master(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Multi_Master} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Multi_Master calloc(MemoryStack stack) {
        return new FT_Multi_Master(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Multi_Master.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Multi_Master.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Multi_Master.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Multi_Master.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_axis}. */
    public static int nnum_axis(long struct) { return UNSAFE.getInt(null, struct + FT_Multi_Master.NUM_AXIS); }
    /** Unsafe version of {@link #num_designs}. */
    public static int nnum_designs(long struct) { return UNSAFE.getInt(null, struct + FT_Multi_Master.NUM_DESIGNS); }
    /** Unsafe version of {@link #axis}. */
    public static FT_MM_Axis.Buffer naxis(long struct) { return FT_MM_Axis.create(struct + FT_Multi_Master.AXIS, T1_MAX_MM_AXIS); }
    /** Unsafe version of {@link #axis(int) axis}. */
    public static FT_MM_Axis naxis(long struct, int index) {
        return FT_MM_Axis.create(struct + FT_Multi_Master.AXIS + check(index, T1_MAX_MM_AXIS) * FT_MM_Axis.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link FT_Multi_Master} structs. */
    public static class Buffer extends StructBuffer<FT_Multi_Master, Buffer> implements NativeResource {

        private static final FT_Multi_Master ELEMENT_FACTORY = FT_Multi_Master.create(-1L);

        /**
         * Creates a new {@code FT_Multi_Master.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Multi_Master#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Multi_Master getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_axis} field. */
        @NativeType("FT_UInt")
        public int num_axis() { return FT_Multi_Master.nnum_axis(address()); }
        /** @return the value of the {@code num_designs} field. */
        @NativeType("FT_UInt")
        public int num_designs() { return FT_Multi_Master.nnum_designs(address()); }
        /** @return a {@link FT_MM_Axis}.Buffer view of the {@code axis} field. */
        @NativeType("FT_MM_Axis[T1_MAX_MM_AXIS]")
        public FT_MM_Axis.Buffer axis() { return FT_Multi_Master.naxis(address()); }
        /** @return a {@link FT_MM_Axis} view of the struct at the specified index of the {@code axis} field. */
        public FT_MM_Axis axis(int index) { return FT_Multi_Master.naxis(address(), index); }

    }

}