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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkPipelineCacheHeaderVersionOne {
 *     uint32_t headerSize;
 *     VkPipelineCacheHeaderVersion headerVersion;
 *     uint32_t vendorID;
 *     uint32_t deviceID;
 *     uint8_t pipelineCacheUUID[VK_UUID_SIZE];
 * }}</pre>
 */
public class VkPipelineCacheHeaderVersionOne extends Struct<VkPipelineCacheHeaderVersionOne> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADERSIZE,
        HEADERVERSION,
        VENDORID,
        DEVICEID,
        PIPELINECACHEUUID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(1, VK_UUID_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADERSIZE = layout.offsetof(0);
        HEADERVERSION = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        PIPELINECACHEUUID = layout.offsetof(4);
    }

    protected VkPipelineCacheHeaderVersionOne(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineCacheHeaderVersionOne create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineCacheHeaderVersionOne(address, container);
    }

    /**
     * Creates a {@code VkPipelineCacheHeaderVersionOne} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCacheHeaderVersionOne(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code headerSize} field. */
    @NativeType("uint32_t")
    public int headerSize() { return nheaderSize(address()); }
    /** @return the value of the {@code headerVersion} field. */
    @NativeType("VkPipelineCacheHeaderVersion")
    public int headerVersion() { return nheaderVersion(address()); }
    /** @return the value of the {@code vendorID} field. */
    @NativeType("uint32_t")
    public int vendorID() { return nvendorID(address()); }
    /** @return the value of the {@code deviceID} field. */
    @NativeType("uint32_t")
    public int deviceID() { return ndeviceID(address()); }
    /** @return a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer pipelineCacheUUID() { return npipelineCacheUUID(address()); }
    /** @return the value at the specified index of the {@code pipelineCacheUUID} field. */
    @NativeType("uint8_t")
    public byte pipelineCacheUUID(int index) { return npipelineCacheUUID(address(), index); }

    /** Sets the specified value to the {@code headerSize} field. */
    public VkPipelineCacheHeaderVersionOne headerSize(@NativeType("uint32_t") int value) { nheaderSize(address(), value); return this; }
    /** Sets the specified value to the {@code headerVersion} field. */
    public VkPipelineCacheHeaderVersionOne headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) { nheaderVersion(address(), value); return this; }
    /** Sets the specified value to the {@code vendorID} field. */
    public VkPipelineCacheHeaderVersionOne vendorID(@NativeType("uint32_t") int value) { nvendorID(address(), value); return this; }
    /** Sets the specified value to the {@code deviceID} field. */
    public VkPipelineCacheHeaderVersionOne deviceID(@NativeType("uint32_t") int value) { ndeviceID(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code pipelineCacheUUID} field. */
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { npipelineCacheUUID(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code pipelineCacheUUID} field. */
    public VkPipelineCacheHeaderVersionOne pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { npipelineCacheUUID(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCacheHeaderVersionOne set(
        int headerSize,
        int headerVersion,
        int vendorID,
        int deviceID,
        ByteBuffer pipelineCacheUUID
    ) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        vendorID(vendorID);
        deviceID(deviceID);
        pipelineCacheUUID(pipelineCacheUUID);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCacheHeaderVersionOne set(VkPipelineCacheHeaderVersionOne src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheHeaderVersionOne malloc() {
        return new VkPipelineCacheHeaderVersionOne(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCacheHeaderVersionOne calloc() {
        return new VkPipelineCacheHeaderVersionOne(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCacheHeaderVersionOne create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCacheHeaderVersionOne(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCacheHeaderVersionOne} instance for the specified memory address. */
    public static VkPipelineCacheHeaderVersionOne create(long address) {
        return new VkPipelineCacheHeaderVersionOne(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineCacheHeaderVersionOne createSafe(long address) {
        return address == NULL ? null : new VkPipelineCacheHeaderVersionOne(address, null);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineCacheHeaderVersionOne.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineCacheHeaderVersionOne.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheHeaderVersionOne malloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionOne(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineCacheHeaderVersionOne} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCacheHeaderVersionOne calloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionOne(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCacheHeaderVersionOne.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCacheHeaderVersionOne.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #headerSize}. */
    public static int nheaderSize(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionOne.HEADERSIZE); }
    /** Unsafe version of {@link #headerVersion}. */
    public static int nheaderVersion(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionOne.HEADERVERSION); }
    /** Unsafe version of {@link #vendorID}. */
    public static int nvendorID(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionOne.VENDORID); }
    /** Unsafe version of {@link #deviceID}. */
    public static int ndeviceID(long struct) { return memGetInt(struct + VkPipelineCacheHeaderVersionOne.DEVICEID); }
    /** Unsafe version of {@link #pipelineCacheUUID}. */
    public static ByteBuffer npipelineCacheUUID(long struct) { return memByteBuffer(struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID, VK_UUID_SIZE); }
    /** Unsafe version of {@link #pipelineCacheUUID(int) pipelineCacheUUID}. */
    public static byte npipelineCacheUUID(long struct, int index) {
        return memGetByte(struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1);
    }

    /** Unsafe version of {@link #headerSize(int) headerSize}. */
    public static void nheaderSize(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionOne.HEADERSIZE, value); }
    /** Unsafe version of {@link #headerVersion(int) headerVersion}. */
    public static void nheaderVersion(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionOne.HEADERVERSION, value); }
    /** Unsafe version of {@link #vendorID(int) vendorID}. */
    public static void nvendorID(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionOne.VENDORID, value); }
    /** Unsafe version of {@link #deviceID(int) deviceID}. */
    public static void ndeviceID(long struct, int value) { memPutInt(struct + VkPipelineCacheHeaderVersionOne.DEVICEID, value); }
    /** Unsafe version of {@link #pipelineCacheUUID(ByteBuffer) pipelineCacheUUID}. */
    public static void npipelineCacheUUID(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, VK_UUID_SIZE); }
        memCopy(memAddress(value), struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID, value.remaining() * 1);
    }
    /** Unsafe version of {@link #pipelineCacheUUID(int, byte) pipelineCacheUUID}. */
    public static void npipelineCacheUUID(long struct, int index, byte value) {
        memPutByte(struct + VkPipelineCacheHeaderVersionOne.PIPELINECACHEUUID + check(index, VK_UUID_SIZE) * 1, value);
    }

    // -----------------------------------

    /** An array of {@link VkPipelineCacheHeaderVersionOne} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCacheHeaderVersionOne, Buffer> implements NativeResource {

        private static final VkPipelineCacheHeaderVersionOne ELEMENT_FACTORY = VkPipelineCacheHeaderVersionOne.create(-1L);

        /**
         * Creates a new {@code VkPipelineCacheHeaderVersionOne.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCacheHeaderVersionOne#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineCacheHeaderVersionOne getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code headerSize} field. */
        @NativeType("uint32_t")
        public int headerSize() { return VkPipelineCacheHeaderVersionOne.nheaderSize(address()); }
        /** @return the value of the {@code headerVersion} field. */
        @NativeType("VkPipelineCacheHeaderVersion")
        public int headerVersion() { return VkPipelineCacheHeaderVersionOne.nheaderVersion(address()); }
        /** @return the value of the {@code vendorID} field. */
        @NativeType("uint32_t")
        public int vendorID() { return VkPipelineCacheHeaderVersionOne.nvendorID(address()); }
        /** @return the value of the {@code deviceID} field. */
        @NativeType("uint32_t")
        public int deviceID() { return VkPipelineCacheHeaderVersionOne.ndeviceID(address()); }
        /** @return a {@link ByteBuffer} view of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer pipelineCacheUUID() { return VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address()); }
        /** @return the value at the specified index of the {@code pipelineCacheUUID} field. */
        @NativeType("uint8_t")
        public byte pipelineCacheUUID(int index) { return VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), index); }

        /** Sets the specified value to the {@code headerSize} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer headerSize(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.nheaderSize(address(), value); return this; }
        /** Sets the specified value to the {@code headerVersion} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) { VkPipelineCacheHeaderVersionOne.nheaderVersion(address(), value); return this; }
        /** Sets the specified value to the {@code vendorID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer vendorID(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.nvendorID(address(), value); return this; }
        /** Sets the specified value to the {@code deviceID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer deviceID(@NativeType("uint32_t") int value) { VkPipelineCacheHeaderVersionOne.ndeviceID(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code pipelineCacheUUID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer pipelineCacheUUID(@NativeType("uint8_t[VK_UUID_SIZE]") ByteBuffer value) { VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code pipelineCacheUUID} field. */
        public VkPipelineCacheHeaderVersionOne.Buffer pipelineCacheUUID(int index, @NativeType("uint8_t") byte value) { VkPipelineCacheHeaderVersionOne.npipelineCacheUUID(address(), index, value); return this; }

    }

}