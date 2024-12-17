/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceTextureCompressionASTCHDRFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 textureCompressionASTC_HDR;
 * }}</pre>
 */
public class VkPhysicalDeviceTextureCompressionASTCHDRFeatures extends Struct<VkPhysicalDeviceTextureCompressionASTCHDRFeatures> implements NativeResource {

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

    protected VkPhysicalDeviceTextureCompressionASTCHDRFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTextureCompressionASTCHDRFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code textureCompressionASTC_HDR} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_HDR() { return ntextureCompressionASTC_HDR(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTextureCompressionASTCHDRFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code textureCompressionASTC_HDR} field. */
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
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures calloc() {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures create(long address) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTextureCompressionASTCHDRFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.PNEXT); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR}. */
    public static int ntextureCompressionASTC_HDR(long struct) { return memGetInt(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.TEXTURECOMPRESSIONASTC_HDR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.PNEXT, value); }
    /** Unsafe version of {@link #textureCompressionASTC_HDR(boolean) textureCompressionASTC_HDR}. */
    public static void ntextureCompressionASTC_HDR(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTextureCompressionASTCHDRFeatures.TEXTURECOMPRESSIONASTC_HDR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTextureCompressionASTCHDRFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTextureCompressionASTCHDRFeatures ELEMENT_FACTORY = VkPhysicalDeviceTextureCompressionASTCHDRFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTextureCompressionASTCHDRFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceTextureCompressionASTCHDRFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.npNext(address()); }
        /** @return the value of the {@code textureCompressionASTC_HDR} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_HDR() { return VkPhysicalDeviceTextureCompressionASTCHDRFeatures.ntextureCompressionASTC_HDR(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTextureCompressionASTCHDRFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_HDR_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTextureCompressionASTCHDRFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code textureCompressionASTC_HDR} field. */
        public VkPhysicalDeviceTextureCompressionASTCHDRFeatures.Buffer textureCompressionASTC_HDR(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTextureCompressionASTCHDRFeatures.ntextureCompressionASTC_HDR(address(), value ? 1 : 0); return this; }

    }

}