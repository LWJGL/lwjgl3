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
 * Structure specifying used video encode quality level.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure <b>can</b> be specified in the following places:</p>
 * 
 * <ul>
 * <li>In the {@code pNext} chain of {@link VkVideoSessionParametersCreateInfoKHR} to specify the video encode quality level to use for a video session parameters object created for a video encode session. If no instance of this structure is included in the {@code pNext} chain of {@link VkVideoSessionParametersCreateInfoKHR}, then the video session parameters object is created with a video encode quality level of zero.</li>
 * <li>In the {@code pNext} chain of {@link VkVideoCodingControlInfoKHR} to change the video encode quality level state of the bound video session.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeQualityLevelInfoKHR {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     uint32_t {@link #qualityLevel};
 * }</code></pre>
 */
public class VkVideoEncodeQualityLevelInfoKHR extends Struct<VkVideoEncodeQualityLevelInfoKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUALITYLEVEL;

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
        QUALITYLEVEL = layout.offsetof(2);
    }

    protected VkVideoEncodeQualityLevelInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeQualityLevelInfoKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeQualityLevelInfoKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeQualityLevelInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeQualityLevelInfoKHR(ByteBuffer container) {
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
    /** the used video encode quality level. */
    @NativeType("uint32_t")
    public int qualityLevel() { return nqualityLevel(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeQualityLevelInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeQualityLevelInfoKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeQualityLevelInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #qualityLevel} field. */
    public VkVideoEncodeQualityLevelInfoKHR qualityLevel(@NativeType("uint32_t") int value) { nqualityLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeQualityLevelInfoKHR set(
        int sType,
        long pNext,
        int qualityLevel
    ) {
        sType(sType);
        pNext(pNext);
        qualityLevel(qualityLevel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkVideoEncodeQualityLevelInfoKHR set(VkVideoEncodeQualityLevelInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeQualityLevelInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQualityLevelInfoKHR malloc() {
        return new VkVideoEncodeQualityLevelInfoKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQualityLevelInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQualityLevelInfoKHR calloc() {
        return new VkVideoEncodeQualityLevelInfoKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQualityLevelInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeQualityLevelInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeQualityLevelInfoKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeQualityLevelInfoKHR} instance for the specified memory address. */
    public static VkVideoEncodeQualityLevelInfoKHR create(long address) {
        return new VkVideoEncodeQualityLevelInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeQualityLevelInfoKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeQualityLevelInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelInfoKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelInfoKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeQualityLevelInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeQualityLevelInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeQualityLevelInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQualityLevelInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeQualityLevelInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeQualityLevelInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQualityLevelInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeQualityLevelInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelInfoKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelInfoKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeQualityLevelInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeQualityLevelInfoKHR.PNEXT); }
    /** Unsafe version of {@link #qualityLevel}. */
    public static int nqualityLevel(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeQualityLevelInfoKHR.QUALITYLEVEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeQualityLevelInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeQualityLevelInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #qualityLevel(int) qualityLevel}. */
    public static void nqualityLevel(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeQualityLevelInfoKHR.QUALITYLEVEL, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeQualityLevelInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeQualityLevelInfoKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeQualityLevelInfoKHR ELEMENT_FACTORY = VkVideoEncodeQualityLevelInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeQualityLevelInfoKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeQualityLevelInfoKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeQualityLevelInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeQualityLevelInfoKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeQualityLevelInfoKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeQualityLevelInfoKHR#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkVideoEncodeQualityLevelInfoKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeQualityLevelInfoKHR#qualityLevel} field. */
        @NativeType("uint32_t")
        public int qualityLevel() { return VkVideoEncodeQualityLevelInfoKHR.nqualityLevel(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeQualityLevelInfoKHR#sType} field. */
        public VkVideoEncodeQualityLevelInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeQualityLevelInfoKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR} value to the {@link VkVideoEncodeQualityLevelInfoKHR#sType} field. */
        public VkVideoEncodeQualityLevelInfoKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeQualityLevelInfoKHR#pNext} field. */
        public VkVideoEncodeQualityLevelInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkVideoEncodeQualityLevelInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkVideoEncodeQualityLevelInfoKHR#qualityLevel} field. */
        public VkVideoEncodeQualityLevelInfoKHR.Buffer qualityLevel(@NativeType("uint32_t") int value) { VkVideoEncodeQualityLevelInfoKHR.nqualityLevel(address(), value); return this; }

    }

}