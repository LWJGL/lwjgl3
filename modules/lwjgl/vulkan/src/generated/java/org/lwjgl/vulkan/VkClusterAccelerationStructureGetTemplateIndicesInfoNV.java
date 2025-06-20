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
 * struct VkClusterAccelerationStructureGetTemplateIndicesInfoNV {
 *     VkDeviceAddress clusterTemplateAddress;
 * }}</pre>
 */
public class VkClusterAccelerationStructureGetTemplateIndicesInfoNV extends Struct<VkClusterAccelerationStructureGetTemplateIndicesInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLUSTERTEMPLATEADDRESS;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLUSTERTEMPLATEADDRESS = layout.offsetof(0);
    }

    protected VkClusterAccelerationStructureGetTemplateIndicesInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureGetTemplateIndicesInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code clusterTemplateAddress} field. */
    @NativeType("VkDeviceAddress")
    public long clusterTemplateAddress() { return nclusterTemplateAddress(address()); }

    /** Sets the specified value to the {@code clusterTemplateAddress} field. */
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) { nclusterTemplateAddress(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureGetTemplateIndicesInfoNV set(VkClusterAccelerationStructureGetTemplateIndicesInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV malloc() {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV calloc() {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV create(long address) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureGetTemplateIndicesInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureGetTemplateIndicesInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clusterTemplateAddress}. */
    public static long nclusterTemplateAddress(long struct) { return memGetLong(struct + VkClusterAccelerationStructureGetTemplateIndicesInfoNV.CLUSTERTEMPLATEADDRESS); }

    /** Unsafe version of {@link #clusterTemplateAddress(long) clusterTemplateAddress}. */
    public static void nclusterTemplateAddress(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureGetTemplateIndicesInfoNV.CLUSTERTEMPLATEADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureGetTemplateIndicesInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureGetTemplateIndicesInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureGetTemplateIndicesInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureGetTemplateIndicesInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureGetTemplateIndicesInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code clusterTemplateAddress} field. */
        @NativeType("VkDeviceAddress")
        public long clusterTemplateAddress() { return VkClusterAccelerationStructureGetTemplateIndicesInfoNV.nclusterTemplateAddress(address()); }

        /** Sets the specified value to the {@code clusterTemplateAddress} field. */
        public VkClusterAccelerationStructureGetTemplateIndicesInfoNV.Buffer clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureGetTemplateIndicesInfoNV.nclusterTemplateAddress(address(), value); return this; }

    }

}