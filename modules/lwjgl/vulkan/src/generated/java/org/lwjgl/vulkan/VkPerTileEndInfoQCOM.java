/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPerTileEndInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 * }}</pre>
 */
public class VkPerTileEndInfoQCOM extends Struct<VkPerTileEndInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
    }

    protected VkPerTileEndInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerTileEndInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPerTileEndInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkPerTileEndInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerTileEndInfoQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPerTileEndInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM} value to the {@code sType} field. */
    public VkPerTileEndInfoQCOM sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPerTileEndInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerTileEndInfoQCOM set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPerTileEndInfoQCOM set(VkPerTileEndInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerTileEndInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerTileEndInfoQCOM malloc() {
        return new VkPerTileEndInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerTileEndInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerTileEndInfoQCOM calloc() {
        return new VkPerTileEndInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerTileEndInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPerTileEndInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerTileEndInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPerTileEndInfoQCOM} instance for the specified memory address. */
    public static VkPerTileEndInfoQCOM create(long address) {
        return new VkPerTileEndInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPerTileEndInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkPerTileEndInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPerTileEndInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerTileEndInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerTileEndInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerTileEndInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerTileEndInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerTileEndInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerTileEndInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerTileEndInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPerTileEndInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPerTileEndInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerTileEndInfoQCOM malloc(MemoryStack stack) {
        return new VkPerTileEndInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerTileEndInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerTileEndInfoQCOM calloc(MemoryStack stack) {
        return new VkPerTileEndInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerTileEndInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerTileEndInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerTileEndInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerTileEndInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPerTileEndInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerTileEndInfoQCOM.PNEXT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPerTileEndInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerTileEndInfoQCOM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPerTileEndInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPerTileEndInfoQCOM, Buffer> implements NativeResource {

        private static final VkPerTileEndInfoQCOM ELEMENT_FACTORY = VkPerTileEndInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkPerTileEndInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerTileEndInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPerTileEndInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerTileEndInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerTileEndInfoQCOM.npNext(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPerTileEndInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPerTileEndInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM} value to the {@code sType} field. */
        public VkPerTileEndInfoQCOM.Buffer sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PER_TILE_END_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPerTileEndInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkPerTileEndInfoQCOM.npNext(address(), value); return this; }

    }

}