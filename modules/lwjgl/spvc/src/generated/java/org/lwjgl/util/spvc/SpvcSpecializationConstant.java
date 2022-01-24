/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

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
 * struct spvc_specialization_constant {
 *     spvc_constant_id {@link #id};
 *     unsigned int {@link #constant_id};
 * }</code></pre>
 */
@NativeType("struct spvc_specialization_constant")
public class SpvcSpecializationConstant extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ID,
        CONSTANT_ID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ID = layout.offsetof(0);
        CONSTANT_ID = layout.offsetof(1);
    }

    /**
     * Creates a {@code SpvcSpecializationConstant} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcSpecializationConstant(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the ID of the specialization constant */
    @NativeType("spvc_constant_id")
    public int id() { return nid(address()); }
    /** the constant ID of the constant, used in Vulkan during pipeline creation */
    @NativeType("unsigned int")
    public int constant_id() { return nconstant_id(address()); }

    /** Sets the specified value to the {@link #id} field. */
    public SpvcSpecializationConstant id(@NativeType("spvc_constant_id") int value) { nid(address(), value); return this; }
    /** Sets the specified value to the {@link #constant_id} field. */
    public SpvcSpecializationConstant constant_id(@NativeType("unsigned int") int value) { nconstant_id(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcSpecializationConstant set(
        int id,
        int constant_id
    ) {
        id(id);
        constant_id(constant_id);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcSpecializationConstant set(SpvcSpecializationConstant src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcSpecializationConstant} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcSpecializationConstant malloc() {
        return wrap(SpvcSpecializationConstant.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code SpvcSpecializationConstant} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcSpecializationConstant calloc() {
        return wrap(SpvcSpecializationConstant.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code SpvcSpecializationConstant} instance allocated with {@link BufferUtils}. */
    public static SpvcSpecializationConstant create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(SpvcSpecializationConstant.class, memAddress(container), container);
    }

    /** Returns a new {@code SpvcSpecializationConstant} instance for the specified memory address. */
    public static SpvcSpecializationConstant create(long address) {
        return wrap(SpvcSpecializationConstant.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcSpecializationConstant createSafe(long address) {
        return address == NULL ? null : wrap(SpvcSpecializationConstant.class, address);
    }

    /**
     * Returns a new {@link SpvcSpecializationConstant.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcSpecializationConstant.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcSpecializationConstant.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcSpecializationConstant.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcSpecializationConstant.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcSpecializationConstant.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link SpvcSpecializationConstant.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcSpecializationConstant.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static SpvcSpecializationConstant.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code SpvcSpecializationConstant} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcSpecializationConstant malloc(MemoryStack stack) {
        return wrap(SpvcSpecializationConstant.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code SpvcSpecializationConstant} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcSpecializationConstant calloc(MemoryStack stack) {
        return wrap(SpvcSpecializationConstant.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link SpvcSpecializationConstant.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcSpecializationConstant.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcSpecializationConstant.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcSpecializationConstant.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #id}. */
    public static int nid(long struct) { return UNSAFE.getInt(null, struct + SpvcSpecializationConstant.ID); }
    /** Unsafe version of {@link #constant_id}. */
    public static int nconstant_id(long struct) { return UNSAFE.getInt(null, struct + SpvcSpecializationConstant.CONSTANT_ID); }

    /** Unsafe version of {@link #id(int) id}. */
    public static void nid(long struct, int value) { UNSAFE.putInt(null, struct + SpvcSpecializationConstant.ID, value); }
    /** Unsafe version of {@link #constant_id(int) constant_id}. */
    public static void nconstant_id(long struct, int value) { UNSAFE.putInt(null, struct + SpvcSpecializationConstant.CONSTANT_ID, value); }

    // -----------------------------------

    /** An array of {@link SpvcSpecializationConstant} structs. */
    public static class Buffer extends StructBuffer<SpvcSpecializationConstant, Buffer> implements NativeResource {

        private static final SpvcSpecializationConstant ELEMENT_FACTORY = SpvcSpecializationConstant.create(-1L);

        /**
         * Creates a new {@code SpvcSpecializationConstant.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcSpecializationConstant#SIZEOF}, and its mark will be undefined.
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
        protected SpvcSpecializationConstant getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link SpvcSpecializationConstant#id} field. */
        @NativeType("spvc_constant_id")
        public int id() { return SpvcSpecializationConstant.nid(address()); }
        /** @return the value of the {@link SpvcSpecializationConstant#constant_id} field. */
        @NativeType("unsigned int")
        public int constant_id() { return SpvcSpecializationConstant.nconstant_id(address()); }

        /** Sets the specified value to the {@link SpvcSpecializationConstant#id} field. */
        public SpvcSpecializationConstant.Buffer id(@NativeType("spvc_constant_id") int value) { SpvcSpecializationConstant.nid(address(), value); return this; }
        /** Sets the specified value to the {@link SpvcSpecializationConstant#constant_id} field. */
        public SpvcSpecializationConstant.Buffer constant_id(@NativeType("unsigned int") int value) { SpvcSpecializationConstant.nconstant_id(address(), value); return this; }

    }

}