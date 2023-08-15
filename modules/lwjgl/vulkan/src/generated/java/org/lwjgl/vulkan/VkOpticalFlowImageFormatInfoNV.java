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
 * Structure describing optical flow image format info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV}</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkOpticalFlowUsageFlagBitsNV} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVOpticalFlow#vkGetPhysicalDeviceOpticalFlowImageFormatsNV GetPhysicalDeviceOpticalFlowImageFormatsNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkOpticalFlowImageFormatInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkOpticalFlowUsageFlagsNV {@link #usage};
 * }</code></pre>
 */
public class VkOpticalFlowImageFormatInfoNV extends Struct<VkOpticalFlowImageFormatInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        USAGE;

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
        USAGE = layout.offsetof(2);
    }

    protected VkOpticalFlowImageFormatInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkOpticalFlowImageFormatInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkOpticalFlowImageFormatInfoNV(address, container);
    }

    /**
     * Creates a {@code VkOpticalFlowImageFormatInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkOpticalFlowImageFormatInfoNV(ByteBuffer container) {
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
    /** a bitmask of {@code VkOpticalFlowUsageFlagBitsNV} describing the intended optical flow usage of the image. */
    @NativeType("VkOpticalFlowUsageFlagsNV")
    public int usage() { return nusage(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkOpticalFlowImageFormatInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV} value to the {@link #sType} field. */
    public VkOpticalFlowImageFormatInfoNV sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkOpticalFlowImageFormatInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkOpticalFlowImageFormatInfoNV usage(@NativeType("VkOpticalFlowUsageFlagsNV") int value) { nusage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkOpticalFlowImageFormatInfoNV set(
        int sType,
        long pNext,
        int usage
    ) {
        sType(sType);
        pNext(pNext);
        usage(usage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkOpticalFlowImageFormatInfoNV set(VkOpticalFlowImageFormatInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkOpticalFlowImageFormatInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowImageFormatInfoNV malloc() {
        return new VkOpticalFlowImageFormatInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowImageFormatInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkOpticalFlowImageFormatInfoNV calloc() {
        return new VkOpticalFlowImageFormatInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkOpticalFlowImageFormatInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkOpticalFlowImageFormatInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowImageFormatInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkOpticalFlowImageFormatInfoNV} instance for the specified memory address. */
    public static VkOpticalFlowImageFormatInfoNV create(long address) {
        return new VkOpticalFlowImageFormatInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpticalFlowImageFormatInfoNV createSafe(long address) {
        return address == NULL ? null : new VkOpticalFlowImageFormatInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkOpticalFlowImageFormatInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkOpticalFlowImageFormatInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkOpticalFlowImageFormatInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowImageFormatInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowImageFormatInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkOpticalFlowImageFormatInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkOpticalFlowImageFormatInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowImageFormatInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkOpticalFlowImageFormatInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkOpticalFlowImageFormatInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkOpticalFlowImageFormatInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkOpticalFlowImageFormatInfoNV.PNEXT); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkOpticalFlowImageFormatInfoNV.USAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkOpticalFlowImageFormatInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkOpticalFlowImageFormatInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkOpticalFlowImageFormatInfoNV.USAGE, value); }

    // -----------------------------------

    /** An array of {@link VkOpticalFlowImageFormatInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkOpticalFlowImageFormatInfoNV, Buffer> implements NativeResource {

        private static final VkOpticalFlowImageFormatInfoNV ELEMENT_FACTORY = VkOpticalFlowImageFormatInfoNV.create(-1L);

        /**
         * Creates a new {@code VkOpticalFlowImageFormatInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkOpticalFlowImageFormatInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkOpticalFlowImageFormatInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkOpticalFlowImageFormatInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkOpticalFlowImageFormatInfoNV.nsType(address()); }
        /** @return the value of the {@link VkOpticalFlowImageFormatInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkOpticalFlowImageFormatInfoNV.npNext(address()); }
        /** @return the value of the {@link VkOpticalFlowImageFormatInfoNV#usage} field. */
        @NativeType("VkOpticalFlowUsageFlagsNV")
        public int usage() { return VkOpticalFlowImageFormatInfoNV.nusage(address()); }

        /** Sets the specified value to the {@link VkOpticalFlowImageFormatInfoNV#sType} field. */
        public VkOpticalFlowImageFormatInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkOpticalFlowImageFormatInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV} value to the {@link VkOpticalFlowImageFormatInfoNV#sType} field. */
        public VkOpticalFlowImageFormatInfoNV.Buffer sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_IMAGE_FORMAT_INFO_NV); }
        /** Sets the specified value to the {@link VkOpticalFlowImageFormatInfoNV#pNext} field. */
        public VkOpticalFlowImageFormatInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkOpticalFlowImageFormatInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkOpticalFlowImageFormatInfoNV#usage} field. */
        public VkOpticalFlowImageFormatInfoNV.Buffer usage(@NativeType("VkOpticalFlowUsageFlagsNV") int value) { VkOpticalFlowImageFormatInfoNV.nusage(address(), value); return this; }

    }

}