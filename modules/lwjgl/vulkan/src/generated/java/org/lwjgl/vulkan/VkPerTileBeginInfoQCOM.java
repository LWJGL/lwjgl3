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
 * struct VkPerTileBeginInfoQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 * }}</pre>
 */
public class VkPerTileBeginInfoQCOM extends Struct<VkPerTileBeginInfoQCOM> implements NativeResource {

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

    protected VkPerTileBeginInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerTileBeginInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPerTileBeginInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkPerTileBeginInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerTileBeginInfoQCOM(ByteBuffer container) {
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
    public VkPerTileBeginInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM} value to the {@code sType} field. */
    public VkPerTileBeginInfoQCOM sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPerTileBeginInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPerTileBeginInfoQCOM set(
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
    public VkPerTileBeginInfoQCOM set(VkPerTileBeginInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPerTileBeginInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerTileBeginInfoQCOM malloc() {
        return new VkPerTileBeginInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerTileBeginInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerTileBeginInfoQCOM calloc() {
        return new VkPerTileBeginInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerTileBeginInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPerTileBeginInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerTileBeginInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPerTileBeginInfoQCOM} instance for the specified memory address. */
    public static VkPerTileBeginInfoQCOM create(long address) {
        return new VkPerTileBeginInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPerTileBeginInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkPerTileBeginInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPerTileBeginInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerTileBeginInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerTileBeginInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerTileBeginInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerTileBeginInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerTileBeginInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerTileBeginInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerTileBeginInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPerTileBeginInfoQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPerTileBeginInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerTileBeginInfoQCOM malloc(MemoryStack stack) {
        return new VkPerTileBeginInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerTileBeginInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerTileBeginInfoQCOM calloc(MemoryStack stack) {
        return new VkPerTileBeginInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerTileBeginInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerTileBeginInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerTileBeginInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerTileBeginInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPerTileBeginInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPerTileBeginInfoQCOM.PNEXT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPerTileBeginInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPerTileBeginInfoQCOM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPerTileBeginInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPerTileBeginInfoQCOM, Buffer> implements NativeResource {

        private static final VkPerTileBeginInfoQCOM ELEMENT_FACTORY = VkPerTileBeginInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkPerTileBeginInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerTileBeginInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPerTileBeginInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPerTileBeginInfoQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPerTileBeginInfoQCOM.npNext(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPerTileBeginInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPerTileBeginInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM} value to the {@code sType} field. */
        public VkPerTileBeginInfoQCOM.Buffer sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PER_TILE_BEGIN_INFO_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPerTileBeginInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkPerTileBeginInfoQCOM.npNext(address(), value); return this; }

    }

}