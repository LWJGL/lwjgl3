/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.shaderc;

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
 * struct shaderc_spvc_workgroup_size {
 *     uint32_t x;
 *     uint32_t y;
 *     uint32_t z;
 *     uint32_t constant;
 * }</code></pre>
 */
@NativeType("struct shaderc_spvc_workgroup_size")
public class ShadercSPVCWorkgroupSize extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        Z,
        CONSTANT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
        CONSTANT = layout.offsetof(3);
    }

    /**
     * Creates a {@code ShadercSPVCWorkgroupSize} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ShadercSPVCWorkgroupSize(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    @NativeType("uint32_t")
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("uint32_t")
    public int y() { return ny(address()); }
    /** Returns the value of the {@code z} field. */
    @NativeType("uint32_t")
    public int z() { return nz(address()); }
    /** Returns the value of the {@code constant} field. */
    @NativeType("uint32_t")
    public int constant() { return nconstant(address()); }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCWorkgroupSize} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ShadercSPVCWorkgroupSize malloc() {
        return wrap(ShadercSPVCWorkgroupSize.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCWorkgroupSize} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ShadercSPVCWorkgroupSize calloc() {
        return wrap(ShadercSPVCWorkgroupSize.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ShadercSPVCWorkgroupSize} instance allocated with {@link BufferUtils}. */
    public static ShadercSPVCWorkgroupSize create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ShadercSPVCWorkgroupSize.class, memAddress(container), container);
    }

    /** Returns a new {@code ShadercSPVCWorkgroupSize} instance for the specified memory address. */
    public static ShadercSPVCWorkgroupSize create(long address) {
        return wrap(ShadercSPVCWorkgroupSize.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCWorkgroupSize createSafe(long address) {
        return address == NULL ? null : wrap(ShadercSPVCWorkgroupSize.class, address);
    }

    /**
     * Returns a new {@link ShadercSPVCWorkgroupSize.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCWorkgroupSize.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCWorkgroupSize.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ShadercSPVCWorkgroupSize.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ShadercSPVCWorkgroupSize.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code ShadercSPVCWorkgroupSize} instance allocated on the thread-local {@link MemoryStack}. */
    public static ShadercSPVCWorkgroupSize mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code ShadercSPVCWorkgroupSize} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static ShadercSPVCWorkgroupSize callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code ShadercSPVCWorkgroupSize} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCWorkgroupSize mallocStack(MemoryStack stack) {
        return wrap(ShadercSPVCWorkgroupSize.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ShadercSPVCWorkgroupSize} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ShadercSPVCWorkgroupSize callocStack(MemoryStack stack) {
        return wrap(ShadercSPVCWorkgroupSize.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ShadercSPVCWorkgroupSize.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCWorkgroupSize.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link ShadercSPVCWorkgroupSize.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ShadercSPVCWorkgroupSize.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ShadercSPVCWorkgroupSize.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCWorkgroupSize.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCWorkgroupSize.Y); }
    /** Unsafe version of {@link #z}. */
    public static int nz(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCWorkgroupSize.Z); }
    /** Unsafe version of {@link #constant}. */
    public static int nconstant(long struct) { return UNSAFE.getInt(null, struct + ShadercSPVCWorkgroupSize.CONSTANT); }

    // -----------------------------------

    /** An array of {@link ShadercSPVCWorkgroupSize} structs. */
    public static class Buffer extends StructBuffer<ShadercSPVCWorkgroupSize, Buffer> implements NativeResource {

        private static final ShadercSPVCWorkgroupSize ELEMENT_FACTORY = ShadercSPVCWorkgroupSize.create(-1L);

        /**
         * Creates a new {@code ShadercSPVCWorkgroupSize.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ShadercSPVCWorkgroupSize#SIZEOF}, and its mark will be undefined.
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
        protected ShadercSPVCWorkgroupSize getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        @NativeType("uint32_t")
        public int x() { return ShadercSPVCWorkgroupSize.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("uint32_t")
        public int y() { return ShadercSPVCWorkgroupSize.ny(address()); }
        /** Returns the value of the {@code z} field. */
        @NativeType("uint32_t")
        public int z() { return ShadercSPVCWorkgroupSize.nz(address()); }
        /** Returns the value of the {@code constant} field. */
        @NativeType("uint32_t")
        public int constant() { return ShadercSPVCWorkgroupSize.nconstant(address()); }

    }

}