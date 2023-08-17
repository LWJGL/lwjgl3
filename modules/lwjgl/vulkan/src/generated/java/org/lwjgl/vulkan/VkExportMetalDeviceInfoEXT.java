/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure that identifies a VkDevice object and corresponding Metal MTLDevice object.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkExportMetalDeviceInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     MTLDevice_id {@link #mtlDevice};
 * }</code></pre>
 */
public class VkExportMetalDeviceInfoEXT extends Struct<VkExportMetalDeviceInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MTLDEVICE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MTLDEVICE = layout.offsetof(2);
    }

    protected VkExportMetalDeviceInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalDeviceInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalDeviceInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalDeviceInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalDeviceInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the Metal {@code id&lt;MTLDevice&gt;} object underlying the {@code VkPhysicalDevice} associated with the {@code VkDevice} object identified in the call. The implementation will return the {@code MTLDevice} in this member, or it will return {@code NULL} if no {@code MTLDevice} could be found underlying the {@code VkPhysicalDevice} object. */
    @NativeType("MTLDevice_id")
    public long mtlDevice() { return nmtlDevice(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkExportMetalDeviceInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT} value to the {@link #sType} field. */
    public VkExportMetalDeviceInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkExportMetalDeviceInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #mtlDevice} field. */
    public VkExportMetalDeviceInfoEXT mtlDevice(@NativeType("MTLDevice_id") long value) { nmtlDevice(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMetalDeviceInfoEXT set(
        int sType,
        long pNext,
        long mtlDevice
    ) {
        sType(sType);
        pNext(pNext);
        mtlDevice(mtlDevice);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMetalDeviceInfoEXT set(VkExportMetalDeviceInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalDeviceInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalDeviceInfoEXT malloc() {
        return new VkExportMetalDeviceInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalDeviceInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalDeviceInfoEXT calloc() {
        return new VkExportMetalDeviceInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalDeviceInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalDeviceInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalDeviceInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalDeviceInfoEXT} instance for the specified memory address. */
    public static VkExportMetalDeviceInfoEXT create(long address) {
        return new VkExportMetalDeviceInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalDeviceInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalDeviceInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalDeviceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalDeviceInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalDeviceInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalDeviceInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalDeviceInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalDeviceInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalDeviceInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalDeviceInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkExportMetalDeviceInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalDeviceInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalDeviceInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalDeviceInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalDeviceInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalDeviceInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalDeviceInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalDeviceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalDeviceInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalDeviceInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalDeviceInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkExportMetalDeviceInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalDeviceInfoEXT.PNEXT); }
    /** Unsafe version of {@link #mtlDevice}. */
    public static long nmtlDevice(long struct) { return memGetAddress(struct + VkExportMetalDeviceInfoEXT.MTLDEVICE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkExportMetalDeviceInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalDeviceInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #mtlDevice(long) mtlDevice}. */
    public static void nmtlDevice(long struct, long value) { memPutAddress(struct + VkExportMetalDeviceInfoEXT.MTLDEVICE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkExportMetalDeviceInfoEXT.MTLDEVICE));
    }

    // -----------------------------------

    /** An array of {@link VkExportMetalDeviceInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalDeviceInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalDeviceInfoEXT ELEMENT_FACTORY = VkExportMetalDeviceInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalDeviceInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalDeviceInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalDeviceInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkExportMetalDeviceInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalDeviceInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkExportMetalDeviceInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalDeviceInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkExportMetalDeviceInfoEXT#mtlDevice} field. */
        @NativeType("MTLDevice_id")
        public long mtlDevice() { return VkExportMetalDeviceInfoEXT.nmtlDevice(address()); }

        /** Sets the specified value to the {@link VkExportMetalDeviceInfoEXT#sType} field. */
        public VkExportMetalDeviceInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalDeviceInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT} value to the {@link VkExportMetalDeviceInfoEXT#sType} field. */
        public VkExportMetalDeviceInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT); }
        /** Sets the specified value to the {@link VkExportMetalDeviceInfoEXT#pNext} field. */
        public VkExportMetalDeviceInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalDeviceInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkExportMetalDeviceInfoEXT#mtlDevice} field. */
        public VkExportMetalDeviceInfoEXT.Buffer mtlDevice(@NativeType("MTLDevice_id") long value) { VkExportMetalDeviceInfoEXT.nmtlDevice(address(), value); return this; }

    }

}