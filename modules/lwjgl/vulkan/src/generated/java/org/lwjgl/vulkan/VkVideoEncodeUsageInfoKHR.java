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
 * Structure specifying video encode usage information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR}</li>
 * <li>{@code videoUsageHints} <b>must</b> be a valid combination of {@code VkVideoEncodeUsageFlagBitsKHR} values</li>
 * <li>{@code videoContentHints} <b>must</b> be a valid combination of {@code VkVideoEncodeContentFlagBitsKHR} values</li>
 * <li>If {@code tuningMode} is not 0, {@code tuningMode} <b>must</b> be a valid {@code VkVideoEncodeTuningModeKHR} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeUsageInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkVideoEncodeUsageFlagsKHR {@link #videoUsageHints};
 *     VkVideoEncodeContentFlagsKHR {@link #videoContentHints};
 *     VkVideoEncodeTuningModeKHR {@link #tuningMode};
 * }</code></pre>
 */
public class VkVideoEncodeUsageInfoKHR extends Struct<VkVideoEncodeUsageInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VIDEOUSAGEHINTS,
        VIDEOCONTENTHINTS,
        TUNINGMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VIDEOUSAGEHINTS = layout.offsetof(2);
        VIDEOCONTENTHINTS = layout.offsetof(3);
        TUNINGMODE = layout.offsetof(4);
    }

    protected VkVideoEncodeUsageInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeUsageInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeUsageInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeUsageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeUsageInfoKHR(ByteBuffer container) {
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
    /** a bitmask of {@code VkVideoEncodeUsageFlagBitsKHR} specifying hints about the intended use of the video encode profile. */
    @NativeType("VkVideoEncodeUsageFlagsKHR")
    public int videoUsageHints() { return nvideoUsageHints(address()); }
    /** a bitmask of {@code VkVideoEncodeContentFlagBitsKHR} specifying hints about the content to be encoded using the video encode profile. */
    @NativeType("VkVideoEncodeContentFlagsKHR")
    public int videoContentHints() { return nvideoContentHints(address()); }
    /** a {@code VkVideoEncodeTuningModeKHR} value specifying the tuning mode to use when encoding with the video profile. */
    @NativeType("VkVideoEncodeTuningModeKHR")
    public int tuningMode() { return ntuningMode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeUsageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeUsageInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeUsageInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #videoUsageHints} field. */
    public VkVideoEncodeUsageInfoKHR videoUsageHints(@NativeType("VkVideoEncodeUsageFlagsKHR") int value) { nvideoUsageHints(address(), value); return this; }
    /** Sets the specified value to the {@link #videoContentHints} field. */
    public VkVideoEncodeUsageInfoKHR videoContentHints(@NativeType("VkVideoEncodeContentFlagsKHR") int value) { nvideoContentHints(address(), value); return this; }
    /** Sets the specified value to the {@link #tuningMode} field. */
    public VkVideoEncodeUsageInfoKHR tuningMode(@NativeType("VkVideoEncodeTuningModeKHR") int value) { ntuningMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeUsageInfoKHR set(
        int sType,
        long pNext,
        int videoUsageHints,
        int videoContentHints,
        int tuningMode
    ) {
        sType(sType);
        pNext(pNext);
        videoUsageHints(videoUsageHints);
        videoContentHints(videoContentHints);
        tuningMode(tuningMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeUsageInfoKHR set(VkVideoEncodeUsageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeUsageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeUsageInfoKHR malloc() {
        return new VkVideoEncodeUsageInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeUsageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeUsageInfoKHR calloc() {
        return new VkVideoEncodeUsageInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeUsageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeUsageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeUsageInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeUsageInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeUsageInfoKHR create(long address) {
        return new VkVideoEncodeUsageInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeUsageInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeUsageInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeUsageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeUsageInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeUsageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeUsageInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeUsageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeUsageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeUsageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeUsageInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeUsageInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeUsageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeUsageInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeUsageInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeUsageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeUsageInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeUsageInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeUsageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeUsageInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeUsageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeUsageInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeUsageInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeUsageInfoKHR.PNEXT); }
    /** Unsafe version of {@link #videoUsageHints}. */
    public static int nvideoUsageHints(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeUsageInfoKHR.VIDEOUSAGEHINTS); }
    /** Unsafe version of {@link #videoContentHints}. */
    public static int nvideoContentHints(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeUsageInfoKHR.VIDEOCONTENTHINTS); }
    /** Unsafe version of {@link #tuningMode}. */
    public static int ntuningMode(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeUsageInfoKHR.TUNINGMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeUsageInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeUsageInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #videoUsageHints(int) videoUsageHints}. */
    public static void nvideoUsageHints(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeUsageInfoKHR.VIDEOUSAGEHINTS, value); }
    /** Unsafe version of {@link #videoContentHints(int) videoContentHints}. */
    public static void nvideoContentHints(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeUsageInfoKHR.VIDEOCONTENTHINTS, value); }
    /** Unsafe version of {@link #tuningMode(int) tuningMode}. */
    public static void ntuningMode(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeUsageInfoKHR.TUNINGMODE, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeUsageInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeUsageInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeUsageInfoKHR ELEMENT_FACTORY = VkVideoEncodeUsageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeUsageInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeUsageInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeUsageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeUsageInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeUsageInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeUsageInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeUsageInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeUsageInfoKHR#videoUsageHints} field. */
        @NativeType("VkVideoEncodeUsageFlagsKHR")
        public int videoUsageHints() { return VkVideoEncodeUsageInfoKHR.nvideoUsageHints(address()); }
        /** @return the value of the {@link VkVideoEncodeUsageInfoKHR#videoContentHints} field. */
        @NativeType("VkVideoEncodeContentFlagsKHR")
        public int videoContentHints() { return VkVideoEncodeUsageInfoKHR.nvideoContentHints(address()); }
        /** @return the value of the {@link VkVideoEncodeUsageInfoKHR#tuningMode} field. */
        @NativeType("VkVideoEncodeTuningModeKHR")
        public int tuningMode() { return VkVideoEncodeUsageInfoKHR.ntuningMode(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeUsageInfoKHR#sType} field. */
        public VkVideoEncodeUsageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeUsageInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR} value to the {@link VkVideoEncodeUsageInfoKHR#sType} field. */
        public VkVideoEncodeUsageInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_USAGE_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeUsageInfoKHR#pNext} field. */
        public VkVideoEncodeUsageInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeUsageInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeUsageInfoKHR#videoUsageHints} field. */
        public VkVideoEncodeUsageInfoKHR.Buffer videoUsageHints(@NativeType("VkVideoEncodeUsageFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.nvideoUsageHints(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeUsageInfoKHR#videoContentHints} field. */
        public VkVideoEncodeUsageInfoKHR.Buffer videoContentHints(@NativeType("VkVideoEncodeContentFlagsKHR") int value) { VkVideoEncodeUsageInfoKHR.nvideoContentHints(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeUsageInfoKHR#tuningMode} field. */
        public VkVideoEncodeUsageInfoKHR.Buffer tuningMode(@NativeType("VkVideoEncodeTuningModeKHR") int value) { VkVideoEncodeUsageInfoKHR.ntuningMode(address(), value); return this; }

    }

}