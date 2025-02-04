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
 * struct VkClusterAccelerationStructureInstantiateClusterInfoNV {
 *     uint32_t clusterIdOffset;
 *     uint32_t geometryIndexOffset : 24;
 *     uint32_t reserved : 8;
 *     VkDeviceAddress clusterTemplateAddress;
 *     {@link VkStridedDeviceAddressNV VkStridedDeviceAddressNV} vertexBuffer;
 * }}</pre>
 */
public class VkClusterAccelerationStructureInstantiateClusterInfoNV extends Struct<VkClusterAccelerationStructureInstantiateClusterInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLUSTERIDOFFSET,
        BITFIELD0,
        CLUSTERTEMPLATEADDRESS,
        VERTEXBUFFER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(VkStridedDeviceAddressNV.SIZEOF, VkStridedDeviceAddressNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLUSTERIDOFFSET = layout.offsetof(0);
        BITFIELD0 = layout.offsetof(1);
        CLUSTERTEMPLATEADDRESS = layout.offsetof(2);
        VERTEXBUFFER = layout.offsetof(3);
    }

    protected VkClusterAccelerationStructureInstantiateClusterInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkClusterAccelerationStructureInstantiateClusterInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(address, container);
    }

    /**
     * Creates a {@code VkClusterAccelerationStructureInstantiateClusterInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code clusterIdOffset} field. */
    @NativeType("uint32_t")
    public int clusterIdOffset() { return nclusterIdOffset(address()); }
    /** @return the value of the {@code geometryIndexOffset} field. */
    @NativeType("uint32_t")
    public int geometryIndexOffset() { return ngeometryIndexOffset(address()); }
    /** @return the value of the {@code reserved} field. */
    @NativeType("uint32_t")
    public int reserved() { return nreserved(address()); }
    /** @return the value of the {@code clusterTemplateAddress} field. */
    @NativeType("VkDeviceAddress")
    public long clusterTemplateAddress() { return nclusterTemplateAddress(address()); }
    /** @return a {@link VkStridedDeviceAddressNV} view of the {@code vertexBuffer} field. */
    public VkStridedDeviceAddressNV vertexBuffer() { return nvertexBuffer(address()); }

    /** Sets the specified value to the {@code clusterIdOffset} field. */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterIdOffset(@NativeType("uint32_t") int value) { nclusterIdOffset(address(), value); return this; }
    /** Sets the specified value to the {@code geometryIndexOffset} field. */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV geometryIndexOffset(@NativeType("uint32_t") int value) { ngeometryIndexOffset(address(), value); return this; }
    /** Sets the specified value to the {@code reserved} field. */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV reserved(@NativeType("uint32_t") int value) { nreserved(address(), value); return this; }
    /** Sets the specified value to the {@code clusterTemplateAddress} field. */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) { nclusterTemplateAddress(address(), value); return this; }
    /** Copies the specified {@link VkStridedDeviceAddressNV} to the {@code vertexBuffer} field. */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(VkStridedDeviceAddressNV value) { nvertexBuffer(address(), value); return this; }
    /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV vertexBuffer(java.util.function.Consumer<VkStridedDeviceAddressNV> consumer) { consumer.accept(vertexBuffer()); return this; }

    /** Initializes this struct with the specified values. */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV set(
        int clusterIdOffset,
        int geometryIndexOffset,
        int reserved,
        long clusterTemplateAddress,
        VkStridedDeviceAddressNV vertexBuffer
    ) {
        clusterIdOffset(clusterIdOffset);
        geometryIndexOffset(geometryIndexOffset);
        reserved(reserved);
        clusterTemplateAddress(clusterTemplateAddress);
        vertexBuffer(vertexBuffer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkClusterAccelerationStructureInstantiateClusterInfoNV set(VkClusterAccelerationStructureInstantiateClusterInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkClusterAccelerationStructureInstantiateClusterInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV malloc() {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureInstantiateClusterInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV calloc() {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkClusterAccelerationStructureInstantiateClusterInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkClusterAccelerationStructureInstantiateClusterInfoNV} instance for the specified memory address. */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV create(long address) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkClusterAccelerationStructureInstantiateClusterInfoNV createSafe(long address) {
        return address == NULL ? null : new VkClusterAccelerationStructureInstantiateClusterInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureInstantiateClusterInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV malloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkClusterAccelerationStructureInstantiateClusterInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV calloc(MemoryStack stack) {
        return new VkClusterAccelerationStructureInstantiateClusterInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clusterIdOffset}. */
    public static int nclusterIdOffset(long struct) { return memGetInt(struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERIDOFFSET); }
    public static int nbitfield0(long struct) { return memGetInt(struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.BITFIELD0); }
    /** Unsafe version of {@link #geometryIndexOffset}. */
    public static int ngeometryIndexOffset(long struct) { return nbitfield0(struct) & 0x00_FF_FF_FF; }
    /** Unsafe version of {@link #reserved}. */
    public static int nreserved(long struct) { return nbitfield0(struct) >>> 24; }
    /** Unsafe version of {@link #clusterTemplateAddress}. */
    public static long nclusterTemplateAddress(long struct) { return memGetLong(struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERTEMPLATEADDRESS); }
    /** Unsafe version of {@link #vertexBuffer}. */
    public static VkStridedDeviceAddressNV nvertexBuffer(long struct) { return VkStridedDeviceAddressNV.create(struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.VERTEXBUFFER); }

    /** Unsafe version of {@link #clusterIdOffset(int) clusterIdOffset}. */
    public static void nclusterIdOffset(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERIDOFFSET, value); }
    public static void nbitfield0(long struct, int value) { memPutInt(struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.BITFIELD0, value); }
    /** Unsafe version of {@link #geometryIndexOffset(int) geometryIndexOffset}. */
    public static void ngeometryIndexOffset(long struct, int value) { nbitfield0(struct, (nbitfield0(struct) & 0xFF_00_00_00) | (value & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static void nreserved(long struct, int value) { nbitfield0(struct, (value << 24) | (nbitfield0(struct) & 0x00_FF_FF_FF)); }
    /** Unsafe version of {@link #clusterTemplateAddress(long) clusterTemplateAddress}. */
    public static void nclusterTemplateAddress(long struct, long value) { memPutLong(struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.CLUSTERTEMPLATEADDRESS, value); }
    /** Unsafe version of {@link #vertexBuffer(VkStridedDeviceAddressNV) vertexBuffer}. */
    public static void nvertexBuffer(long struct, VkStridedDeviceAddressNV value) { memCopy(value.address(), struct + VkClusterAccelerationStructureInstantiateClusterInfoNV.VERTEXBUFFER, VkStridedDeviceAddressNV.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkClusterAccelerationStructureInstantiateClusterInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkClusterAccelerationStructureInstantiateClusterInfoNV, Buffer> implements NativeResource {

        private static final VkClusterAccelerationStructureInstantiateClusterInfoNV ELEMENT_FACTORY = VkClusterAccelerationStructureInstantiateClusterInfoNV.create(-1L);

        /**
         * Creates a new {@code VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkClusterAccelerationStructureInstantiateClusterInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkClusterAccelerationStructureInstantiateClusterInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code clusterIdOffset} field. */
        @NativeType("uint32_t")
        public int clusterIdOffset() { return VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterIdOffset(address()); }
        /** @return the value of the {@code geometryIndexOffset} field. */
        @NativeType("uint32_t")
        public int geometryIndexOffset() { return VkClusterAccelerationStructureInstantiateClusterInfoNV.ngeometryIndexOffset(address()); }
        /** @return the value of the {@code reserved} field. */
        @NativeType("uint32_t")
        public int reserved() { return VkClusterAccelerationStructureInstantiateClusterInfoNV.nreserved(address()); }
        /** @return the value of the {@code clusterTemplateAddress} field. */
        @NativeType("VkDeviceAddress")
        public long clusterTemplateAddress() { return VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterTemplateAddress(address()); }
        /** @return a {@link VkStridedDeviceAddressNV} view of the {@code vertexBuffer} field. */
        public VkStridedDeviceAddressNV vertexBuffer() { return VkClusterAccelerationStructureInstantiateClusterInfoNV.nvertexBuffer(address()); }

        /** Sets the specified value to the {@code clusterIdOffset} field. */
        public VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer clusterIdOffset(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterIdOffset(address(), value); return this; }
        /** Sets the specified value to the {@code geometryIndexOffset} field. */
        public VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer geometryIndexOffset(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureInstantiateClusterInfoNV.ngeometryIndexOffset(address(), value); return this; }
        /** Sets the specified value to the {@code reserved} field. */
        public VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer reserved(@NativeType("uint32_t") int value) { VkClusterAccelerationStructureInstantiateClusterInfoNV.nreserved(address(), value); return this; }
        /** Sets the specified value to the {@code clusterTemplateAddress} field. */
        public VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer clusterTemplateAddress(@NativeType("VkDeviceAddress") long value) { VkClusterAccelerationStructureInstantiateClusterInfoNV.nclusterTemplateAddress(address(), value); return this; }
        /** Copies the specified {@link VkStridedDeviceAddressNV} to the {@code vertexBuffer} field. */
        public VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer vertexBuffer(VkStridedDeviceAddressNV value) { VkClusterAccelerationStructureInstantiateClusterInfoNV.nvertexBuffer(address(), value); return this; }
        /** Passes the {@code vertexBuffer} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkClusterAccelerationStructureInstantiateClusterInfoNV.Buffer vertexBuffer(java.util.function.Consumer<VkStridedDeviceAddressNV> consumer) { consumer.accept(vertexBuffer()); return this; }

    }

}