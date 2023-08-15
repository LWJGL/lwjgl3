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
 * Structure specifying video decode usage information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR}</li>
 * <li>{@code videoUsageHints} <b>must</b> be a valid combination of {@code VkVideoDecodeUsageFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoDecodeUsageInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoDecodeUsageFlagsKHR {@link #videoUsageHints};
 * }</code></pre>
 */
public class VkVideoDecodeUsageInfoKHR extends Struct<VkVideoDecodeUsageInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOUSAGEHINTS;

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
        VIDEOUSAGEHINTS = layout.offsetof(2);
    }

    protected VkVideoDecodeUsageInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoDecodeUsageInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoDecodeUsageInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoDecodeUsageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoDecodeUsageInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoDecodeUsageFlagBitsKHR} specifying hints about the intended use of the video decode profile. */
    @NativeType("VkVideoDecodeUsageFlagsKHR")
    public int videoUsageHints() { return nvideoUsageHints(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoDecodeUsageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoDecodeUsageInfoKHR sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoDecodeUsageInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #videoUsageHints} field. */
    public VkVideoDecodeUsageInfoKHR videoUsageHints(@NativeType("VkVideoDecodeUsageFlagsKHR") int value) { nvideoUsageHints(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoDecodeUsageInfoKHR set(
        int sType,
        long pNext,
        int videoUsageHints
    ) {
        sType(sType);
        pNext(pNext);
        videoUsageHints(videoUsageHints);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoDecodeUsageInfoKHR set(VkVideoDecodeUsageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoDecodeUsageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeUsageInfoKHR malloc() {
        return new VkVideoDecodeUsageInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeUsageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoDecodeUsageInfoKHR calloc() {
        return new VkVideoDecodeUsageInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoDecodeUsageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoDecodeUsageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoDecodeUsageInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoDecodeUsageInfoKHR} instance for the specified memory address. */
    public static VkVideoDecodeUsageInfoKHR create(long address) {
        return new VkVideoDecodeUsageInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeUsageInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoDecodeUsageInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoDecodeUsageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeUsageInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeUsageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeUsageInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeUsageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeUsageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoDecodeUsageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeUsageInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoDecodeUsageInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoDecodeUsageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeUsageInfoKHR malloc(MemoryStack stack) {
        return new VkVideoDecodeUsageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoDecodeUsageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoDecodeUsageInfoKHR calloc(MemoryStack stack) {
        return new VkVideoDecodeUsageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoDecodeUsageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeUsageInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoDecodeUsageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoDecodeUsageInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeUsageInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoDecodeUsageInfoKHR.PNEXT); }
    /** Unsafe version of {@link #videoUsageHints}. */
    public static int nvideoUsageHints(long struct) { return UNSAFE.getInt(null, struct + VkVideoDecodeUsageInfoKHR.VIDEOUSAGEHINTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeUsageInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoDecodeUsageInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoUsageHints(int) videoUsageHints}. */
    public static void nvideoUsageHints(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoDecodeUsageInfoKHR.VIDEOUSAGEHINTS, value); }

    // -----------------------------------

    /** An array of {@link VkVideoDecodeUsageInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoDecodeUsageInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoDecodeUsageInfoKHR ELEMENT_FACTORY = VkVideoDecodeUsageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoDecodeUsageInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoDecodeUsageInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoDecodeUsageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoDecodeUsageInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoDecodeUsageInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoDecodeUsageInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoDecodeUsageInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoDecodeUsageInfoKHR#videoUsageHints} field. */
        @NativeType("VkVideoDecodeUsageFlagsKHR")
        public int videoUsageHints() { return VkVideoDecodeUsageInfoKHR.nvideoUsageHints(address()); }

        /** Sets the specified value to the {@link VkVideoDecodeUsageInfoKHR#sType} field. */
        public VkVideoDecodeUsageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoDecodeUsageInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoDecodeQueue#VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR} value to the {@link VkVideoDecodeUsageInfoKHR#sType} field. */
        public VkVideoDecodeUsageInfoKHR.Buffer sType$Default() { return sType(KHRVideoDecodeQueue.VK_STRUCTURE_TYPE_VIDEO_DECODE_USAGE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoDecodeUsageInfoKHR#pNext} field. */
        public VkVideoDecodeUsageInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoDecodeUsageInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoDecodeUsageInfoKHR#videoUsageHints} field. */
        public VkVideoDecodeUsageInfoKHR.Buffer videoUsageHints(@NativeType("VkVideoDecodeUsageFlagsKHR") int value) { VkVideoDecodeUsageInfoKHR.nvideoUsageHints(address(), value); return this; }

    }

}