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
 * Structure specifying opaque capture descriptor data.
 * 
 * <h5>Description</h5>
 * 
 * <p>During replay, opaque descriptor capture data <b>can</b> be specified by adding a {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} structure to the relevant {@code pNext} chain of a {@link VkBufferCreateInfo}, {@link VkImageCreateInfo}, {@link VkImageViewCreateInfo}, {@link VkSamplerCreateInfo}, {@link VkAccelerationStructureCreateInfoNV} or {@link VkAccelerationStructureCreateInfoKHR} structure.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT}</li>
 * <li>{@code opaqueCaptureDescriptorData} <b>must</b> be a pointer value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkOpaqueCaptureDescriptorDataCreateInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     void const * {@link #opaqueCaptureDescriptorData};
 * }</code></pre>
 */
public class VkOpaqueCaptureDescriptorDataCreateInfoEXT extends Struct<VkOpaqueCaptureDescriptorDataCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPAQUECAPTUREDESCRIPTORDATA;

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
        OPAQUECAPTUREDESCRIPTORDATA = layout.offsetof(2);
    }

    protected VkOpaqueCaptureDescriptorDataCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOpaqueCaptureDescriptorDataCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT(ByteBuffer container) {
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
    /** a pointer to a user-allocated buffer containing opaque capture data retrieved using {@link EXTDescriptorBuffer#vkGetBufferOpaqueCaptureDescriptorDataEXT GetBufferOpaqueCaptureDescriptorDataEXT}, {@link EXTDescriptorBuffer#vkGetImageOpaqueCaptureDescriptorDataEXT GetImageOpaqueCaptureDescriptorDataEXT}, {@link EXTDescriptorBuffer#vkGetImageViewOpaqueCaptureDescriptorDataEXT GetImageViewOpaqueCaptureDescriptorDataEXT}, {@link EXTDescriptorBuffer#vkGetSamplerOpaqueCaptureDescriptorDataEXT GetSamplerOpaqueCaptureDescriptorDataEXT}, or {@link EXTDescriptorBuffer#vkGetAccelerationStructureOpaqueCaptureDescriptorDataEXT GetAccelerationStructureOpaqueCaptureDescriptorDataEXT}. */
    @NativeType("void const *")
    public long opaqueCaptureDescriptorData() { return nopaqueCaptureDescriptorData(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT} value to the {@link #sType} field. */
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #opaqueCaptureDescriptorData} field. */
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT opaqueCaptureDescriptorData(@NativeType("void const *") long value) { nopaqueCaptureDescriptorData(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT set(
        int sType,
        long pNext,
        long opaqueCaptureDescriptorData
    ) {
        sType(sType);
        pNext(pNext);
        opaqueCaptureDescriptorData(opaqueCaptureDescriptorData);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkOpaqueCaptureDescriptorDataCreateInfoEXT set(VkOpaqueCaptureDescriptorDataCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT malloc() {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT calloc() {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT} instance for the specified memory address. */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT create(long address) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkOpaqueCaptureDescriptorDataCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT malloc(MemoryStack stack) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT calloc(MemoryStack stack) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkOpaqueCaptureDescriptorDataCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOpaqueCaptureDescriptorDataCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #opaqueCaptureDescriptorData}. */
    public static long nopaqueCaptureDescriptorData(long struct) { return memGetAddress(struct + VkOpaqueCaptureDescriptorDataCreateInfoEXT.OPAQUECAPTUREDESCRIPTORDATA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkOpaqueCaptureDescriptorDataCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOpaqueCaptureDescriptorDataCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #opaqueCaptureDescriptorData(long) opaqueCaptureDescriptorData}. */
    public static void nopaqueCaptureDescriptorData(long struct, long value) { memPutAddress(struct + VkOpaqueCaptureDescriptorDataCreateInfoEXT.OPAQUECAPTUREDESCRIPTORDATA, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkOpaqueCaptureDescriptorDataCreateInfoEXT.OPAQUECAPTUREDESCRIPTORDATA));
    }

    // -----------------------------------

    /** An array of {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkOpaqueCaptureDescriptorDataCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkOpaqueCaptureDescriptorDataCreateInfoEXT ELEMENT_FACTORY = VkOpaqueCaptureDescriptorDataCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOpaqueCaptureDescriptorDataCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOpaqueCaptureDescriptorDataCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkOpaqueCaptureDescriptorDataCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#opaqueCaptureDescriptorData} field. */
        @NativeType("void const *")
        public long opaqueCaptureDescriptorData() { return VkOpaqueCaptureDescriptorDataCreateInfoEXT.nopaqueCaptureDescriptorData(address()); }

        /** Sets the specified value to the {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#sType} field. */
        public VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkOpaqueCaptureDescriptorDataCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDescriptorBuffer#VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT} value to the {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#sType} field. */
        public VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer sType$Default() { return sType(EXTDescriptorBuffer.VK_STRUCTURE_TYPE_OPAQUE_CAPTURE_DESCRIPTOR_DATA_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#pNext} field. */
        public VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkOpaqueCaptureDescriptorDataCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkOpaqueCaptureDescriptorDataCreateInfoEXT#opaqueCaptureDescriptorData} field. */
        public VkOpaqueCaptureDescriptorDataCreateInfoEXT.Buffer opaqueCaptureDescriptorData(@NativeType("void const *") long value) { VkOpaqueCaptureDescriptorDataCreateInfoEXT.nopaqueCaptureDescriptorData(address(), value); return this; }

    }

}