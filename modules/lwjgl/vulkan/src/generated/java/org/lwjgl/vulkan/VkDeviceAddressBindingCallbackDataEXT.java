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
 * struct VkDeviceAddressBindingCallbackDataEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceAddressBindingFlagsEXT flags;
 *     VkDeviceAddress baseAddress;
 *     VkDeviceSize size;
 *     VkDeviceAddressBindingTypeEXT bindingType;
 * }}</pre>
 */
public class VkDeviceAddressBindingCallbackDataEXT extends Struct<VkDeviceAddressBindingCallbackDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        BASEADDRESS,
        SIZE,
        BINDINGTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        BASEADDRESS = layout.offsetof(3);
        SIZE = layout.offsetof(4);
        BINDINGTYPE = layout.offsetof(5);
    }

    protected VkDeviceAddressBindingCallbackDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDeviceAddressBindingCallbackDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDeviceAddressBindingCallbackDataEXT(address, container);
    }

    /**
     * Creates a {@code VkDeviceAddressBindingCallbackDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDeviceAddressBindingCallbackDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkDeviceAddressBindingFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code baseAddress} field. */
    @NativeType("VkDeviceAddress")
    public long baseAddress() { return nbaseAddress(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code bindingType} field. */
    @NativeType("VkDeviceAddressBindingTypeEXT")
    public int bindingType() { return nbindingType(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDeviceAddressBindingCallbackDataEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceAddressBindingReport#VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT} value to the {@code sType} field. */
    public VkDeviceAddressBindingCallbackDataEXT sType$Default() { return sType(EXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDeviceAddressBindingCallbackDataEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkDeviceAddressBindingCallbackDataEXT flags(@NativeType("VkDeviceAddressBindingFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code baseAddress} field. */
    public VkDeviceAddressBindingCallbackDataEXT baseAddress(@NativeType("VkDeviceAddress") long value) { nbaseAddress(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkDeviceAddressBindingCallbackDataEXT size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code bindingType} field. */
    public VkDeviceAddressBindingCallbackDataEXT bindingType(@NativeType("VkDeviceAddressBindingTypeEXT") int value) { nbindingType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDeviceAddressBindingCallbackDataEXT set(
        int sType,
        long pNext,
        int flags,
        long baseAddress,
        long size,
        int bindingType
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        baseAddress(baseAddress);
        size(size);
        bindingType(bindingType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDeviceAddressBindingCallbackDataEXT set(VkDeviceAddressBindingCallbackDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDeviceAddressBindingCallbackDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDeviceAddressBindingCallbackDataEXT malloc() {
        return new VkDeviceAddressBindingCallbackDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceAddressBindingCallbackDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDeviceAddressBindingCallbackDataEXT calloc() {
        return new VkDeviceAddressBindingCallbackDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDeviceAddressBindingCallbackDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkDeviceAddressBindingCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceAddressBindingCallbackDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDeviceAddressBindingCallbackDataEXT} instance for the specified memory address. */
    public static VkDeviceAddressBindingCallbackDataEXT create(long address) {
        return new VkDeviceAddressBindingCallbackDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDeviceAddressBindingCallbackDataEXT createSafe(long address) {
        return address == NULL ? null : new VkDeviceAddressBindingCallbackDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkDeviceAddressBindingCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressBindingCallbackDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDeviceAddressBindingCallbackDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressBindingCallbackDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceAddressBindingCallbackDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressBindingCallbackDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDeviceAddressBindingCallbackDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressBindingCallbackDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDeviceAddressBindingCallbackDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDeviceAddressBindingCallbackDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceAddressBindingCallbackDataEXT malloc(MemoryStack stack) {
        return new VkDeviceAddressBindingCallbackDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDeviceAddressBindingCallbackDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDeviceAddressBindingCallbackDataEXT calloc(MemoryStack stack) {
        return new VkDeviceAddressBindingCallbackDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDeviceAddressBindingCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressBindingCallbackDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDeviceAddressBindingCallbackDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDeviceAddressBindingCallbackDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDeviceAddressBindingCallbackDataEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDeviceAddressBindingCallbackDataEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkDeviceAddressBindingCallbackDataEXT.FLAGS); }
    /** Unsafe version of {@link #baseAddress}. */
    public static long nbaseAddress(long struct) { return memGetLong(struct + VkDeviceAddressBindingCallbackDataEXT.BASEADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkDeviceAddressBindingCallbackDataEXT.SIZE); }
    /** Unsafe version of {@link #bindingType}. */
    public static int nbindingType(long struct) { return memGetInt(struct + VkDeviceAddressBindingCallbackDataEXT.BINDINGTYPE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceAddressBindingCallbackDataEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceAddressBindingCallbackDataEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkDeviceAddressBindingCallbackDataEXT.FLAGS, value); }
    /** Unsafe version of {@link #baseAddress(long) baseAddress}. */
    public static void nbaseAddress(long struct, long value) { memPutLong(struct + VkDeviceAddressBindingCallbackDataEXT.BASEADDRESS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkDeviceAddressBindingCallbackDataEXT.SIZE, value); }
    /** Unsafe version of {@link #bindingType(int) bindingType}. */
    public static void nbindingType(long struct, int value) { memPutInt(struct + VkDeviceAddressBindingCallbackDataEXT.BINDINGTYPE, value); }

    // -----------------------------------

    /** An array of {@link VkDeviceAddressBindingCallbackDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkDeviceAddressBindingCallbackDataEXT, Buffer> implements NativeResource {

        private static final VkDeviceAddressBindingCallbackDataEXT ELEMENT_FACTORY = VkDeviceAddressBindingCallbackDataEXT.create(-1L);

        /**
         * Creates a new {@code VkDeviceAddressBindingCallbackDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDeviceAddressBindingCallbackDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDeviceAddressBindingCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDeviceAddressBindingCallbackDataEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkDeviceAddressBindingCallbackDataEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkDeviceAddressBindingFlagsEXT")
        public int flags() { return VkDeviceAddressBindingCallbackDataEXT.nflags(address()); }
        /** @return the value of the {@code baseAddress} field. */
        @NativeType("VkDeviceAddress")
        public long baseAddress() { return VkDeviceAddressBindingCallbackDataEXT.nbaseAddress(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkDeviceAddressBindingCallbackDataEXT.nsize(address()); }
        /** @return the value of the {@code bindingType} field. */
        @NativeType("VkDeviceAddressBindingTypeEXT")
        public int bindingType() { return VkDeviceAddressBindingCallbackDataEXT.nbindingType(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDeviceAddressBindingCallbackDataEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkDeviceAddressBindingCallbackDataEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceAddressBindingReport#VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT} value to the {@code sType} field. */
        public VkDeviceAddressBindingCallbackDataEXT.Buffer sType$Default() { return sType(EXTDeviceAddressBindingReport.VK_STRUCTURE_TYPE_DEVICE_ADDRESS_BINDING_CALLBACK_DATA_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDeviceAddressBindingCallbackDataEXT.Buffer pNext(@NativeType("void *") long value) { VkDeviceAddressBindingCallbackDataEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkDeviceAddressBindingCallbackDataEXT.Buffer flags(@NativeType("VkDeviceAddressBindingFlagsEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code baseAddress} field. */
        public VkDeviceAddressBindingCallbackDataEXT.Buffer baseAddress(@NativeType("VkDeviceAddress") long value) { VkDeviceAddressBindingCallbackDataEXT.nbaseAddress(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkDeviceAddressBindingCallbackDataEXT.Buffer size(@NativeType("VkDeviceSize") long value) { VkDeviceAddressBindingCallbackDataEXT.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code bindingType} field. */
        public VkDeviceAddressBindingCallbackDataEXT.Buffer bindingType(@NativeType("VkDeviceAddressBindingTypeEXT") int value) { VkDeviceAddressBindingCallbackDataEXT.nbindingType(address(), value); return this; }

    }

}