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
 * struct VkMicromapCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkMicromapCreateFlagsEXT createFlags;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 *     VkMicromapTypeEXT type;
 *     VkDeviceAddress deviceAddress;
 * }}</pre>
 */
public class VkMicromapCreateInfoEXT extends Struct<VkMicromapCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CREATEFLAGS,
        BUFFER,
        OFFSET,
        SIZE,
        TYPE,
        DEVICEADDRESS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        BUFFER = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
        SIZE = layout.offsetof(5);
        TYPE = layout.offsetof(6);
        DEVICEADDRESS = layout.offsetof(7);
    }

    protected VkMicromapCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkMicromapCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkMicromapCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkMicromapCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMicromapCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code createFlags} field. */
    @NativeType("VkMicromapCreateFlagsEXT")
    public int createFlags() { return ncreateFlags(address()); }
    /** @return the value of the {@code buffer} field. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code type} field. */
    @NativeType("VkMicromapTypeEXT")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code deviceAddress} field. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkMicromapCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkMicromapCreateInfoEXT sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkMicromapCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code createFlags} field. */
    public VkMicromapCreateInfoEXT createFlags(@NativeType("VkMicromapCreateFlagsEXT") int value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkMicromapCreateInfoEXT buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkMicromapCreateInfoEXT offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkMicromapCreateInfoEXT size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkMicromapCreateInfoEXT type(@NativeType("VkMicromapTypeEXT") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code deviceAddress} field. */
    public VkMicromapCreateInfoEXT deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMicromapCreateInfoEXT set(
        int sType,
        long pNext,
        int createFlags,
        long buffer,
        long offset,
        long size,
        int type,
        long deviceAddress
    ) {
        sType(sType);
        pNext(pNext);
        createFlags(createFlags);
        buffer(buffer);
        offset(offset);
        size(size);
        type(type);
        deviceAddress(deviceAddress);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMicromapCreateInfoEXT set(VkMicromapCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMicromapCreateInfoEXT malloc() {
        return new VkMicromapCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMicromapCreateInfoEXT calloc() {
        return new VkMicromapCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMicromapCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkMicromapCreateInfoEXT} instance for the specified memory address. */
    public static VkMicromapCreateInfoEXT create(long address) {
        return new VkMicromapCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkMicromapCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkMicromapCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkMicromapCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkMicromapCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkMicromapCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapCreateInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkMicromapCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMicromapCreateInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMicromapCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMicromapCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkMicromapCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkMicromapCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static int ncreateFlags(long struct) { return memGetInt(struct + VkMicromapCreateInfoEXT.CREATEFLAGS); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkMicromapCreateInfoEXT.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkMicromapCreateInfoEXT.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkMicromapCreateInfoEXT.SIZE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkMicromapCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return memGetLong(struct + VkMicromapCreateInfoEXT.DEVICEADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkMicromapCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkMicromapCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #createFlags(int) createFlags}. */
    public static void ncreateFlags(long struct, int value) { memPutInt(struct + VkMicromapCreateInfoEXT.CREATEFLAGS, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkMicromapCreateInfoEXT.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkMicromapCreateInfoEXT.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkMicromapCreateInfoEXT.SIZE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkMicromapCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { memPutLong(struct + VkMicromapCreateInfoEXT.DEVICEADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkMicromapCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMicromapCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkMicromapCreateInfoEXT ELEMENT_FACTORY = VkMicromapCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMicromapCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMicromapCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkMicromapCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkMicromapCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkMicromapCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("VkMicromapCreateFlagsEXT")
        public int createFlags() { return VkMicromapCreateInfoEXT.ncreateFlags(address()); }
        /** @return the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkMicromapCreateInfoEXT.nbuffer(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkMicromapCreateInfoEXT.noffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkMicromapCreateInfoEXT.nsize(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkMicromapTypeEXT")
        public int type() { return VkMicromapCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@code deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkMicromapCreateInfoEXT.ndeviceAddress(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkMicromapCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkMicromapCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTOpacityMicromap#VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkMicromapCreateInfoEXT.Buffer sType$Default() { return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_MICROMAP_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkMicromapCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkMicromapCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code createFlags} field. */
        public VkMicromapCreateInfoEXT.Buffer createFlags(@NativeType("VkMicromapCreateFlagsEXT") int value) { VkMicromapCreateInfoEXT.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkMicromapCreateInfoEXT.Buffer buffer(@NativeType("VkBuffer") long value) { VkMicromapCreateInfoEXT.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkMicromapCreateInfoEXT.Buffer offset(@NativeType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkMicromapCreateInfoEXT.Buffer size(@NativeType("VkDeviceSize") long value) { VkMicromapCreateInfoEXT.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkMicromapCreateInfoEXT.Buffer type(@NativeType("VkMicromapTypeEXT") int value) { VkMicromapCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code deviceAddress} field. */
        public VkMicromapCreateInfoEXT.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkMicromapCreateInfoEXT.ndeviceAddress(address(), value); return this; }

    }

}