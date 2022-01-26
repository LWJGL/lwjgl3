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
 * Structure describing ASTC HDR features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceTextureCompressionASTCHDRFeatures {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #textureCompressionASTC_HDR};
 * }</code></pre>
 */
public class VkPhysicalDeviceTextureCompressionASTCHDRFeatures extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TEXTURECOMPRESSIONASTC_HDR;

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
        TEXTURECOMPRESSIONASTC_HDR = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /**
     * indicates whether all of the ASTC HDR compressed texture formats are supported. If this feature is enabled, then the {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT FORMAT_FEATURE_SAMPLED_IMAGE_BIT}, {@link VK10#VK_FORMAT_FEATURE_BLIT_SRC_BIT FORMAT_FEATURE_BLIT_SRC_BIT} and {@link VK10#VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT} features <b>must</b> be supported in {@code optimalTilingFeatures} for the following formats:
     * 
     * <ul>
     * <li>{@link VK13#VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK FORMAT_ASTC_4x4_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_5x4_SFLOAT_BLOCK FORMAT_ASTC_5x4_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_5x5_SFLOAT_BLOCK FORMAT_ASTC_5x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_6x5_SFLOAT_BLOCK FORMAT_ASTC_6x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_6x6_SFLOAT_BLOCK FORMAT_ASTC_6x6_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_8x5_SFLOAT_BLOCK FORMAT_ASTC_8x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_8x6_SFLOAT_BLOCK FORMAT_ASTC_8x6_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_8x8_SFLOAT_BLOCK FORMAT_ASTC_8x8_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x5_SFLOAT_BLOCK FORMAT_ASTC_10x5_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x6_SFLOAT_BLOCK FORMAT_ASTC_10x6_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x8_SFLOAT_BLOCK FORMAT_ASTC_10x8_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_10x10_SFLOAT_BLOCK FORMAT_ASTC_10x10_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_12x10_SFLOAT_BLOCK FORMAT_ASTC_12x10_SFLOAT_BLOCK}</li>
     * <li>{@link VK13#VK_FORMAT_ASTC_12x12_SFLOAT_BLOCK FORMAT_ASTC_12x12_SFLOAT_BLOCK}</li>
     * </ul>
     * 
     * <p>To query for additional properties, or if the feature is not enabled, {@link VK10#vkGetPhysicalDeviceFormatProperties GetPhysicalDeviceFormatProperties} and {@link VK10#vkGetPhysicalDeviceImageFormatProperties GetPhysicalDeviceImageFormatProperties} <b>can</b> be used to check for supported properties of individual formats as normal.</p>
     */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_HDR() { return ntextureCompressionASTC_HDR(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES} value to the {@link #sType} field. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #textureCompressionASTC_HDR} field. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures set(
        int sType,
        long pNext,
        boolean textureCompressionASTC_HDR
    ) {
        sType(sType);
        pNext(pNext);
        textureCompressionASTC_HDR(textureCompressionASTC_HDR);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures set(VkPhysicalDeviceTextureCompressionASTCHDRFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures malloc() {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures calloc() {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures create(long address) {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceTextureCompressionASTCHDRFeatures.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.PNEXT); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR}. */
    public static int ntextureCompressionASTC_HDR(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.TEXTURECOMPRESSIONASTC_HDR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.PNEXT, value); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR(boolean) textureCompressionASTC_HDR}. */
    public static void ntextureCompressionASTC_HDR(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.TEXTURECOMPRESSIONASTC_HDR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTextureCompressionASTCHDRFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTextureCompressionASTCHDRFeatures ELEMENT_FACTORY = VkPhysicalDeviceTextureCompressionASTCHDRFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceTextureCompressionASTCHDRFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#textureCompressionASTC_HDR} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_HDR() { return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.ntextureCompressionASTC_HDR(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#sType} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTextureCompressionASTCHDRFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES} value to the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#sType} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#pNext} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTextureCompressionASTCHDRFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#textureCompressionASTC_HDR} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTextureCompressionASTCHDRFeatures.ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }

    }

}