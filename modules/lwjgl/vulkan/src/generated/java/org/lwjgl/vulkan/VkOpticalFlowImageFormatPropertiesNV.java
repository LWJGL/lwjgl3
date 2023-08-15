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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing properties of an optical flow image format.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVOpticalFlow#vkGetPhysicalDeviceOpticalFlowImageFormatsNV GetPhysicalDeviceOpticalFlowImageFormatsNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkOpticalFlowImageFormatPropertiesNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkFormat {@link #format};
 * }</code></pre>
 */
public class VkOpticalFlowImageFormatPropertiesNV extends Struct<VkOpticalFlowImageFormatPropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
    }

    protected VkOpticalFlowImageFormatPropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOpticalFlowImageFormatPropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkOpticalFlowImageFormatPropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkOpticalFlowImageFormatPropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOpticalFlowImageFormatPropertiesNV(ByteBuffer container) {
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
    /** a {@code VkFormat} that specifies the format that can be used with the specified optical flow image usages. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkOpticalFlowImageFormatPropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV} value to the {@link #sType} field. */
    public VkOpticalFlowImageFormatPropertiesNV sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkOpticalFlowImageFormatPropertiesNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOpticalFlowImageFormatPropertiesNV set(
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
    public VkOpticalFlowImageFormatPropertiesNV set(VkOpticalFlowImageFormatPropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOpticalFlowImageFormatPropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowImageFormatPropertiesNV malloc() {
        return new VkOpticalFlowImageFormatPropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowImageFormatPropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowImageFormatPropertiesNV calloc() {
        return new VkOpticalFlowImageFormatPropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowImageFormatPropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkOpticalFlowImageFormatPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowImageFormatPropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkOpticalFlowImageFormatPropertiesNV} instance for the specified memory address. */
    public static VkOpticalFlowImageFormatPropertiesNV create(long address) {
        return new VkOpticalFlowImageFormatPropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpticalFlowImageFormatPropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkOpticalFlowImageFormatPropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatPropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatPropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatPropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatPropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatPropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOpticalFlowImageFormatPropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatPropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpticalFlowImageFormatPropertiesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOpticalFlowImageFormatPropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowImageFormatPropertiesNV malloc(MemoryStack stack) {
        return new VkOpticalFlowImageFormatPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOpticalFlowImageFormatPropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowImageFormatPropertiesNV calloc(MemoryStack stack) {
        return new VkOpticalFlowImageFormatPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatPropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatPropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatPropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkOpticalFlowImageFormatPropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOpticalFlowImageFormatPropertiesNV.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + VkOpticalFlowImageFormatPropertiesNV.FORMAT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkOpticalFlowImageFormatPropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOpticalFlowImageFormatPropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkOpticalFlowImageFormatPropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkOpticalFlowImageFormatPropertiesNV, Buffer> implements NativeResource {

        private static final VkOpticalFlowImageFormatPropertiesNV ELEMENT_FACTORY = VkOpticalFlowImageFormatPropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkOpticalFlowImageFormatPropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOpticalFlowImageFormatPropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOpticalFlowImageFormatPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkOpticalFlowImageFormatPropertiesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOpticalFlowImageFormatPropertiesNV.nsType(address()); }
        /** @return the value of the {@link VkOpticalFlowImageFormatPropertiesNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkOpticalFlowImageFormatPropertiesNV.npNext(address()); }
        /** @return the value of the {@link VkOpticalFlowImageFormatPropertiesNV#format} field. */
        @NativeType("VkFormat")
        public int format() { return VkOpticalFlowImageFormatPropertiesNV.nformat(address()); }

        /** Sets the specified value to the {@link VkOpticalFlowImageFormatPropertiesNV#sType} field. */
        public VkOpticalFlowImageFormatPropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkOpticalFlowImageFormatPropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV} value to the {@link VkOpticalFlowImageFormatPropertiesNV#sType} field. */
        public VkOpticalFlowImageFormatPropertiesNV.Buffer sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_PROPERTIES_NV); }
        /** Sets the specified value to the {@link VkOpticalFlowImageFormatPropertiesNV#pNext} field. */
        public VkOpticalFlowImageFormatPropertiesNV.Buffer pNext(@NativeType("void const *") long value) { VkOpticalFlowImageFormatPropertiesNV.npNext(address(), value); return this; }

    }

}