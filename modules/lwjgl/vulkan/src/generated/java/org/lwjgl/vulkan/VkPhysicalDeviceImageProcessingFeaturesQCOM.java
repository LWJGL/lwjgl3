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
 * Structure describing image processing features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceImageProcessingFeaturesQCOM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceImageProcessingFeaturesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #textureSampleWeighted};
 *     VkBool32 {@link #textureBoxFilter};
 *     VkBool32 {@link #textureBlockMatch};
 * }</code></pre>
 */
public class VkPhysicalDeviceImageProcessingFeaturesQCOM extends Struct<VkPhysicalDeviceImageProcessingFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TEXTURESAMPLEWEIGHTED,
        TEXTUREBOXFILTER,
        TEXTUREBLOCKMATCH;

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
        TEXTURESAMPLEWEIGHTED = layout.offsetof(2);
        TEXTUREBOXFILTER = layout.offsetof(3);
        TEXTUREBLOCKMATCH = layout.offsetof(4);
    }

    protected VkPhysicalDeviceImageProcessingFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceImageProcessingFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceImageProcessingFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM(ByteBuffer container) {
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
    /** indicates that the implementation supports shader modules that declare the {@code TextureSampleWeightedQCOM} capability. */
    @NativeType("VkBool32")
    public boolean textureSampleWeighted() { return ntextureSampleWeighted(address()) != 0; }
    /** indicates that the implementation supports shader modules that declare the {@code TextureBoxFilterQCOM} capability. */
    @NativeType("VkBool32")
    public boolean textureBoxFilter() { return ntextureBoxFilter(address()) != 0; }
    /** indicates that the implementation supports shader modules that declare the {@code TextureBlockMatchQCOM} capability. */
    @NativeType("VkBool32")
    public boolean textureBlockMatch() { return ntextureBlockMatch(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM} value to the {@link #sType} field. */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM sType$Default() { return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #textureSampleWeighted} field. */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureSampleWeighted(@NativeType("VkBool32") boolean value) { ntextureSampleWeighted(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #textureBoxFilter} field. */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBoxFilter(@NativeType("VkBool32") boolean value) { ntextureBoxFilter(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #textureBlockMatch} field. */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM textureBlockMatch(@NativeType("VkBool32") boolean value) { ntextureBlockMatch(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM set(
        int sType,
        long pNext,
        boolean textureSampleWeighted,
        boolean textureBoxFilter,
        boolean textureBlockMatch
    ) {
        sType(sType);
        pNext(pNext);
        textureSampleWeighted(textureSampleWeighted);
        textureBoxFilter(textureBoxFilter);
        textureBlockMatch(textureBlockMatch);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceImageProcessingFeaturesQCOM set(VkPhysicalDeviceImageProcessingFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceImageProcessingFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM malloc() {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessingFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM calloc() {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessingFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceImageProcessingFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceImageProcessingFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessingFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceImageProcessingFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceImageProcessingFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #textureSampleWeighted}. */
    public static int ntextureSampleWeighted(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.TEXTURESAMPLEWEIGHTED); }
    /** Unsafe version of {@link #textureBoxFilter}. */
    public static int ntextureBoxFilter(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.TEXTUREBOXFILTER); }
    /** Unsafe version of {@link #textureBlockMatch}. */
    public static int ntextureBlockMatch(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.TEXTUREBLOCKMATCH); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #textureSampleWeighted(boolean) textureSampleWeighted}. */
    public static void ntextureSampleWeighted(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.TEXTURESAMPLEWEIGHTED, value); }
    /** Unsafe version of {@link #textureBoxFilter(boolean) textureBoxFilter}. */
    public static void ntextureBoxFilter(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.TEXTUREBOXFILTER, value); }
    /** Unsafe version of {@link #textureBlockMatch(boolean) textureBlockMatch}. */
    public static void ntextureBlockMatch(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceImageProcessingFeaturesQCOM.TEXTUREBLOCKMATCH, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceImageProcessingFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceImageProcessingFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceImageProcessingFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceImageProcessingFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceImageProcessingFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#textureSampleWeighted} field. */
        @NativeType("VkBool32")
        public boolean textureSampleWeighted() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureSampleWeighted(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#textureBoxFilter} field. */
        @NativeType("VkBool32")
        public boolean textureBoxFilter() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBoxFilter(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#textureBlockMatch} field. */
        @NativeType("VkBool32")
        public boolean textureBlockMatch() { return VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBlockMatch(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM} value to the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer sType$Default() { return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_FEATURES_QCOM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#pNext} field. */
        public VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#textureSampleWeighted} field. */
        public VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer textureSampleWeighted(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureSampleWeighted(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#textureBoxFilter} field. */
        public VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer textureBoxFilter(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBoxFilter(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceImageProcessingFeaturesQCOM#textureBlockMatch} field. */
        public VkPhysicalDeviceImageProcessingFeaturesQCOM.Buffer textureBlockMatch(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceImageProcessingFeaturesQCOM.ntextureBlockMatch(address(), value ? 1 : 0); return this; }

    }

}