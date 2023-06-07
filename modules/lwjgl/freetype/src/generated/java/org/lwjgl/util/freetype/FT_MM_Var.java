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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure to model the axes and space of an Adobe MM, TrueType GX, or OpenType variation font.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_MM_Var {
 *     FT_UInt num_axis;
 *     FT_UInt num_designs;
 *     FT_UInt num_namedstyles;
 *     {@link FT_Var_Axis FT_Var_Axis} * axis;
 *     {@link FT_Var_Named_Style FT_Var_Named_Style} * namedstyle;
 * }</code></pre>
 */
public class FT_MM_Var extends Struct<FT_MM_Var> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_AXIS,
        NUM_DESIGNS,
        NUM_NAMEDSTYLES,
        AXIS,
        NAMEDSTYLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_AXIS = layout.offsetof(0);
        NUM_DESIGNS = layout.offsetof(1);
        NUM_NAMEDSTYLES = layout.offsetof(2);
        AXIS = layout.offsetof(3);
        NAMEDSTYLE = layout.offsetof(4);
    }

    protected FT_MM_Var(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_MM_Var create(long address, @Nullable ByteBuffer container) {
        return new FT_MM_Var(address, container);
    }

    /**
     * Creates a {@code FT_MM_Var} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_MM_Var(ByteBuffer container) {
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
    /** @return the value of the {@code num_namedstyles} field. */
    @NativeType("FT_UInt")
    public int num_namedstyles() { return nnum_namedstyles(address()); }
    /** @return a {@link FT_Var_Axis.Buffer} view of the struct array pointed to by the {@code axis} field. */
    @NativeType("FT_Var_Axis *")
    public FT_Var_Axis.Buffer axis() { return naxis(address()); }
    /** @return a {@link FT_Var_Named_Style.Buffer} view of the struct array pointed to by the {@code namedstyle} field. */
    @NativeType("FT_Var_Named_Style *")
    public FT_Var_Named_Style.Buffer namedstyle() { return nnamedstyle(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_MM_Var} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_MM_Var malloc() {
        return new FT_MM_Var(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_MM_Var} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_MM_Var calloc() {
        return new FT_MM_Var(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_MM_Var} instance allocated with {@link BufferUtils}. */
    public static FT_MM_Var create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_MM_Var(memAddress(container), container);
    }

    /** Returns a new {@code FT_MM_Var} instance for the specified memory address. */
    public static FT_MM_Var create(long address) {
        return new FT_MM_Var(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_MM_Var createSafe(long address) {
        return address == NULL ? null : new FT_MM_Var(address, null);
    }

    /**
     * Returns a new {@link FT_MM_Var.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_MM_Var.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_MM_Var.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_MM_Var.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_MM_Var.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_MM_Var.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_MM_Var.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_MM_Var.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_MM_Var.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_MM_Var} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_MM_Var malloc(MemoryStack stack) {
        return new FT_MM_Var(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_MM_Var} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_MM_Var calloc(MemoryStack stack) {
        return new FT_MM_Var(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_MM_Var.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_MM_Var.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_MM_Var.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_MM_Var.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_axis}. */
    public static int nnum_axis(long struct) { return UNSAFE.getInt(null, struct + FT_MM_Var.NUM_AXIS); }
    /** Unsafe version of {@link #num_designs}. */
    public static int nnum_designs(long struct) { return UNSAFE.getInt(null, struct + FT_MM_Var.NUM_DESIGNS); }
    /** Unsafe version of {@link #num_namedstyles}. */
    public static int nnum_namedstyles(long struct) { return UNSAFE.getInt(null, struct + FT_MM_Var.NUM_NAMEDSTYLES); }
    /** Unsafe version of {@link #axis}. */
    public static FT_Var_Axis.Buffer naxis(long struct) { return FT_Var_Axis.create(memGetAddress(struct + FT_MM_Var.AXIS), nnum_axis(struct)); }
    /** Unsafe version of {@link #namedstyle}. */
    public static FT_Var_Named_Style.Buffer nnamedstyle(long struct) { return FT_Var_Named_Style.create(memGetAddress(struct + FT_MM_Var.NAMEDSTYLE), nnum_namedstyles(struct)); }

    // -----------------------------------

    /** An array of {@link FT_MM_Var} structs. */
    public static class Buffer extends StructBuffer<FT_MM_Var, Buffer> implements NativeResource {

        private static final FT_MM_Var ELEMENT_FACTORY = FT_MM_Var.create(-1L);

        /**
         * Creates a new {@code FT_MM_Var.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_MM_Var#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_MM_Var getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_axis} field. */
        @NativeType("FT_UInt")
        public int num_axis() { return FT_MM_Var.nnum_axis(address()); }
        /** @return the value of the {@code num_designs} field. */
        @NativeType("FT_UInt")
        public int num_designs() { return FT_MM_Var.nnum_designs(address()); }
        /** @return the value of the {@code num_namedstyles} field. */
        @NativeType("FT_UInt")
        public int num_namedstyles() { return FT_MM_Var.nnum_namedstyles(address()); }
        /** @return a {@link FT_Var_Axis.Buffer} view of the struct array pointed to by the {@code axis} field. */
        @NativeType("FT_Var_Axis *")
        public FT_Var_Axis.Buffer axis() { return FT_MM_Var.naxis(address()); }
        /** @return a {@link FT_Var_Named_Style.Buffer} view of the struct array pointed to by the {@code namedstyle} field. */
        @NativeType("FT_Var_Named_Style *")
        public FT_Var_Named_Style.Buffer namedstyle() { return FT_MM_Var.nnamedstyle(address()); }

    }

}