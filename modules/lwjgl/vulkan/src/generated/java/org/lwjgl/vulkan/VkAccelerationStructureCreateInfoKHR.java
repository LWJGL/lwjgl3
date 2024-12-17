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
 * struct VkAccelerationStructureCreateInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkAccelerationStructureCreateFlagsKHR createFlags;
 *     VkBuffer buffer;
 *     VkDeviceSize offset;
 *     VkDeviceSize size;
 *     VkAccelerationStructureTypeKHR type;
 *     VkDeviceAddress deviceAddress;
 * }}</pre>
 */
public class VkAccelerationStructureCreateInfoKHR extends Struct<VkAccelerationStructureCreateInfoKHR> implements NativeResource {

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

    protected VkAccelerationStructureCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureCreateInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureCreateInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureCreateInfoKHR(ByteBuffer container) {
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
    @NativeType("VkAccelerationStructureCreateFlagsKHR")
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
    @NativeType("VkAccelerationStructureTypeKHR")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code deviceAddress} field. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkAccelerationStructureCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR} value to the {@code sType} field. */
    public VkAccelerationStructureCreateInfoKHR sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkAccelerationStructureCreateInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkAccelerationStructureMotionInfoNV} value to the {@code pNext} chain. */
    public VkAccelerationStructureCreateInfoKHR pNext(VkAccelerationStructureMotionInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
    public VkAccelerationStructureCreateInfoKHR pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code createFlags} field. */
    public VkAccelerationStructureCreateInfoKHR createFlags(@NativeType("VkAccelerationStructureCreateFlagsKHR") int value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@code buffer} field. */
    public VkAccelerationStructureCreateInfoKHR buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkAccelerationStructureCreateInfoKHR offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkAccelerationStructureCreateInfoKHR size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkAccelerationStructureCreateInfoKHR type(@NativeType("VkAccelerationStructureTypeKHR") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code deviceAddress} field. */
    public VkAccelerationStructureCreateInfoKHR deviceAddress(@NativeType("VkDeviceAddress") long value) { ndeviceAddress(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureCreateInfoKHR set(
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
    public VkAccelerationStructureCreateInfoKHR set(VkAccelerationStructureCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoKHR malloc() {
        return new VkAccelerationStructureCreateInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureCreateInfoKHR calloc() {
        return new VkAccelerationStructureCreateInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureCreateInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance for the specified memory address. */
    public static VkAccelerationStructureCreateInfoKHR create(long address) {
        return new VkAccelerationStructureCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureCreateInfoKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoKHR malloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureCreateInfoKHR calloc(MemoryStack stack) {
        return new VkAccelerationStructureCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureCreateInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkAccelerationStructureCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkAccelerationStructureCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static int ncreateFlags(long struct) { return memGetInt(struct + VkAccelerationStructureCreateInfoKHR.CREATEFLAGS); }
    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.SIZE); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkAccelerationStructureCreateInfoKHR.TYPE); }
    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return memGetLong(struct + VkAccelerationStructureCreateInfoKHR.DEVICEADDRESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkAccelerationStructureCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkAccelerationStructureCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #createFlags(int) createFlags}. */
    public static void ncreateFlags(long struct, int value) { memPutInt(struct + VkAccelerationStructureCreateInfoKHR.CREATEFLAGS, value); }
    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.OFFSET, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.SIZE, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkAccelerationStructureCreateInfoKHR.TYPE, value); }
    /** Unsafe version of {@link #deviceAddress(long) deviceAddress}. */
    public static void ndeviceAddress(long struct, long value) { memPutLong(struct + VkAccelerationStructureCreateInfoKHR.DEVICEADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureCreateInfoKHR, Buffer> implements NativeResource {

        private static final VkAccelerationStructureCreateInfoKHR ELEMENT_FACTORY = VkAccelerationStructureCreateInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureCreateInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkAccelerationStructureCreateInfoKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkAccelerationStructureCreateInfoKHR.npNext(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("VkAccelerationStructureCreateFlagsKHR")
        public int createFlags() { return VkAccelerationStructureCreateInfoKHR.ncreateFlags(address()); }
        /** @return the value of the {@code buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkAccelerationStructureCreateInfoKHR.nbuffer(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkAccelerationStructureCreateInfoKHR.noffset(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkAccelerationStructureCreateInfoKHR.nsize(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkAccelerationStructureTypeKHR")
        public int type() { return VkAccelerationStructureCreateInfoKHR.ntype(address()); }
        /** @return the value of the {@code deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkAccelerationStructureCreateInfoKHR.ndeviceAddress(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkAccelerationStructureCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRAccelerationStructure#VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR} value to the {@code sType} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer sType$Default() { return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkAccelerationStructureCreateInfoKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkAccelerationStructureMotionInfoNV} value to the {@code pNext} chain. */
        public VkAccelerationStructureCreateInfoKHR.Buffer pNext(VkAccelerationStructureMotionInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} value to the {@code pNext} chain. */
        public VkAccelerationStructureCreateInfoKHR.Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code createFlags} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer createFlags(@NativeType("VkAccelerationStructureCreateFlagsKHR") int value) { VkAccelerationStructureCreateInfoKHR.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@code buffer} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer buffer(@NativeType("VkBuffer") long value) { VkAccelerationStructureCreateInfoKHR.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer offset(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer size(@NativeType("VkDeviceSize") long value) { VkAccelerationStructureCreateInfoKHR.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer type(@NativeType("VkAccelerationStructureTypeKHR") int value) { VkAccelerationStructureCreateInfoKHR.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code deviceAddress} field. */
        public VkAccelerationStructureCreateInfoKHR.Buffer deviceAddress(@NativeType("VkDeviceAddress") long value) { VkAccelerationStructureCreateInfoKHR.ndeviceAddress(address(), value); return this; }

    }

}