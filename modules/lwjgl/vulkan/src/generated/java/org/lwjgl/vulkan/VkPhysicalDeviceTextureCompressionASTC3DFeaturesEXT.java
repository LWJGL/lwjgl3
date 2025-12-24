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
 * struct VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 textureCompressionASTC_3D;
 * }}</pre>
 */
public class VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT extends Struct<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TEXTURECOMPRESSIONASTC_3D;

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
        TEXTURECOMPRESSIONASTC_3D = layout.offsetof(2);
    }

    protected VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code textureCompressionASTC_3D} field. */
    @NativeType("VkBool32")
    public boolean textureCompressionASTC_3D() { return ntextureCompressionASTC_3D(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTTextureCompressionAstc3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_3D_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT sType$Default() { return sType(EXTTextureCompressionAstc3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_3D_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code textureCompressionASTC_3D} field. */
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT textureCompressionASTC_3D(@NativeType("VkBool32") boolean value) { ntextureCompressionASTC_3D(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT set(
        int sType,
        long pNext,
        boolean textureCompressionASTC_3D
    ) {
        sType(sType);
        pNext(pNext);
        textureCompressionASTC_3D(textureCompressionASTC_3D);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT set(VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT malloc() {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT calloc() {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT create(long address) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #textureCompressionASTC_3D}. */
    public static int ntextureCompressionASTC_3D(long struct) { return memGetInt(struct + VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.TEXTURECOMPRESSIONASTC_3D); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #textureCompressionASTC_3D(boolean) textureCompressionASTC_3D}. */
    public static void ntextureCompressionASTC_3D(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.TEXTURECOMPRESSIONASTC_3D, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code textureCompressionASTC_3D} field. */
        @NativeType("VkBool32")
        public boolean textureCompressionASTC_3D() { return VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.ntextureCompressionASTC_3D(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTTextureCompressionAstc3d#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_3D_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_3D_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer sType$Default() { return sType(EXTTextureCompressionAstc3d.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXTURE_COMPRESSION_ASTC_3D_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code textureCompressionASTC_3D} field. */
        public VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.Buffer textureCompressionASTC_3D(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceTextureCompressionASTC3DFeaturesEXT.ntextureCompressionASTC_3D(address(), value ? 1 : 0); return this; }

    }

}