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
 * Structure describing the video encode quality level properties.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkVideoEncodeH264QualityLevelPropertiesEXT} or {@link VkVideoEncodeH265QualityLevelPropertiesEXT}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHRVideoEncodeQueue#vkGetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR GetPhysicalDeviceVideoEncodeQualityLevelPropertiesKHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkVideoEncodeQualityLevelPropertiesKHR {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkVideoEncodeRateControlModeFlagBitsKHR {@link #preferredRateControlMode};
 *     uint32_t {@link #preferredRateControlLayerCount};
 * }</code></pre>
 */
public class VkVideoEncodeQualityLevelPropertiesKHR extends Struct<VkVideoEncodeQualityLevelPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PREFERREDRATECONTROLMODE,
        PREFERREDRATECONTROLLAYERCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERREDRATECONTROLMODE = layout.offsetof(2);
        PREFERREDRATECONTROLLAYERCOUNT = layout.offsetof(3);
    }

    protected VkVideoEncodeQualityLevelPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkVideoEncodeQualityLevelPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkVideoEncodeQualityLevelPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkVideoEncodeQualityLevelPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkVideoEncodeRateControlModeFlagBitsKHR} value indicating the preferred rate control mode to use with the video encode quality level. */
    @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
    public int preferredRateControlMode() { return npreferredRateControlMode(address()); }
    /** indicates the preferred number of rate control layers to use with the quality level. */
    @NativeType("uint32_t")
    public int preferredRateControlLayerCount() { return npreferredRateControlLayerCount(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkVideoEncodeQualityLevelPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR} value to the {@link #sType} field. */
    public VkVideoEncodeQualityLevelPropertiesKHR sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkVideoEncodeQualityLevelPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkVideoEncodeH264QualityLevelPropertiesEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeQualityLevelPropertiesKHR pNext(VkVideoEncodeH264QualityLevelPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkVideoEncodeH265QualityLevelPropertiesEXT} value to the {@code pNext} chain. */
    public VkVideoEncodeQualityLevelPropertiesKHR pNext(VkVideoEncodeH265QualityLevelPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkVideoEncodeQualityLevelPropertiesKHR set(
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
    public VkVideoEncodeQualityLevelPropertiesKHR set(VkVideoEncodeQualityLevelPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkVideoEncodeQualityLevelPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQualityLevelPropertiesKHR malloc() {
        return new VkVideoEncodeQualityLevelPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQualityLevelPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkVideoEncodeQualityLevelPropertiesKHR calloc() {
        return new VkVideoEncodeQualityLevelPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkVideoEncodeQualityLevelPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkVideoEncodeQualityLevelPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeQualityLevelPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkVideoEncodeQualityLevelPropertiesKHR} instance for the specified memory address. */
    public static VkVideoEncodeQualityLevelPropertiesKHR create(long address) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeQualityLevelPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkVideoEncodeQualityLevelPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkVideoEncodeQualityLevelPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkVideoEncodeQualityLevelPropertiesKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkVideoEncodeQualityLevelPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkVideoEncodeQualityLevelPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeQualityLevelPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkVideoEncodeQualityLevelPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkVideoEncodeQualityLevelPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeQualityLevelPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkVideoEncodeQualityLevelPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #preferredRateControlMode}. */
    public static int npreferredRateControlMode(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeQualityLevelPropertiesKHR.PREFERREDRATECONTROLMODE); }
    /** Unsafe version of {@link #preferredRateControlLayerCount}. */
    public static int npreferredRateControlLayerCount(long struct) { return UNSAFE.getInt(null, struct + VkVideoEncodeQualityLevelPropertiesKHR.PREFERREDRATECONTROLLAYERCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkVideoEncodeQualityLevelPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkVideoEncodeQualityLevelPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkVideoEncodeQualityLevelPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkVideoEncodeQualityLevelPropertiesKHR, Buffer> implements NativeResource {

        private static final VkVideoEncodeQualityLevelPropertiesKHR ELEMENT_FACTORY = VkVideoEncodeQualityLevelPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkVideoEncodeQualityLevelPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkVideoEncodeQualityLevelPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkVideoEncodeQualityLevelPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkVideoEncodeQualityLevelPropertiesKHR#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkVideoEncodeQualityLevelPropertiesKHR.nsType(address()); }
        /** @return the value of the {@link VkVideoEncodeQualityLevelPropertiesKHR#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkVideoEncodeQualityLevelPropertiesKHR.npNext(address()); }
        /** @return the value of the {@link VkVideoEncodeQualityLevelPropertiesKHR#preferredRateControlMode} field. */
        @NativeType("VkVideoEncodeRateControlModeFlagBitsKHR")
        public int preferredRateControlMode() { return VkVideoEncodeQualityLevelPropertiesKHR.npreferredRateControlMode(address()); }
        /** @return the value of the {@link VkVideoEncodeQualityLevelPropertiesKHR#preferredRateControlLayerCount} field. */
        @NativeType("uint32_t")
        public int preferredRateControlLayerCount() { return VkVideoEncodeQualityLevelPropertiesKHR.npreferredRateControlLayerCount(address()); }

        /** Sets the specified value to the {@link VkVideoEncodeQualityLevelPropertiesKHR#sType} field. */
        public VkVideoEncodeQualityLevelPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkVideoEncodeQualityLevelPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRVideoEncodeQueue#VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR} value to the {@link VkVideoEncodeQualityLevelPropertiesKHR#sType} field. */
        public VkVideoEncodeQualityLevelPropertiesKHR.Buffer sType$Default() { return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_VIDEO_ENCODE_QUALITY_LEVEL_PROPERTIES_KHR); }
        /** Sets the specified value to the {@link VkVideoEncodeQualityLevelPropertiesKHR#pNext} field. */
        public VkVideoEncodeQualityLevelPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkVideoEncodeQualityLevelPropertiesKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkVideoEncodeH264QualityLevelPropertiesEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeQualityLevelPropertiesKHR.Buffer pNext(VkVideoEncodeH264QualityLevelPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkVideoEncodeH265QualityLevelPropertiesEXT} value to the {@code pNext} chain. */
        public VkVideoEncodeQualityLevelPropertiesKHR.Buffer pNext(VkVideoEncodeH265QualityLevelPropertiesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}