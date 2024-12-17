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
 * struct VkPhysicalDeviceShaderTileImagePropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 shaderTileImageCoherentReadAccelerated;
 *     VkBool32 shaderTileImageReadSampleFromPixelRateInvocation;
 *     VkBool32 shaderTileImageReadFromHelperInvocation;
 * }}</pre>
 */
public class VkPhysicalDeviceShaderTileImagePropertiesEXT extends Struct<VkPhysicalDeviceShaderTileImagePropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERTILEIMAGECOHERENTREADACCELERATED,
        SHADERTILEIMAGEREADSAMPLEFROMPIXELRATEINVOCATION,
        SHADERTILEIMAGEREADFROMHELPERINVOCATION;

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
        SHADERTILEIMAGECOHERENTREADACCELERATED = layout.offsetof(2);
        SHADERTILEIMAGEREADSAMPLEFROMPIXELRATEINVOCATION = layout.offsetof(3);
        SHADERTILEIMAGEREADFROMHELPERINVOCATION = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderTileImagePropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderTileImagePropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderTileImagePropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderTileImagePropertiesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderTileImageCoherentReadAccelerated} field. */
    @NativeType("VkBool32")
    public boolean shaderTileImageCoherentReadAccelerated() { return nshaderTileImageCoherentReadAccelerated(address()) != 0; }
    /** @return the value of the {@code shaderTileImageReadSampleFromPixelRateInvocation} field. */
    @NativeType("VkBool32")
    public boolean shaderTileImageReadSampleFromPixelRateInvocation() { return nshaderTileImageReadSampleFromPixelRateInvocation(address()) != 0; }
    /** @return the value of the {@code shaderTileImageReadFromHelperInvocation} field. */
    @NativeType("VkBool32")
    public boolean shaderTileImageReadFromHelperInvocation() { return nshaderTileImageReadFromHelperInvocation(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderTileImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceShaderTileImagePropertiesEXT sType$Default() { return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceShaderTileImagePropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderTileImagePropertiesEXT set(
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
    public VkPhysicalDeviceShaderTileImagePropertiesEXT set(VkPhysicalDeviceShaderTileImagePropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderTileImagePropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT malloc() {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTileImagePropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT calloc() {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTileImagePropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTileImagePropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT create(long address) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceShaderTileImagePropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderTileImagePropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTileImagePropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTileImagePropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImagePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderTileImagePropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderTileImagePropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderTileImageCoherentReadAccelerated}. */
    public static int nshaderTileImageCoherentReadAccelerated(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderTileImagePropertiesEXT.SHADERTILEIMAGECOHERENTREADACCELERATED); }
    /** Unsafe version of {@link #shaderTileImageReadSampleFromPixelRateInvocation}. */
    public static int nshaderTileImageReadSampleFromPixelRateInvocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderTileImagePropertiesEXT.SHADERTILEIMAGEREADSAMPLEFROMPIXELRATEINVOCATION); }
    /** Unsafe version of {@link #shaderTileImageReadFromHelperInvocation}. */
    public static int nshaderTileImageReadFromHelperInvocation(long struct) { return memGetInt(struct + VkPhysicalDeviceShaderTileImagePropertiesEXT.SHADERTILEIMAGEREADFROMHELPERINVOCATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceShaderTileImagePropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderTileImagePropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderTileImagePropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderTileImagePropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderTileImagePropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderTileImagePropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderTileImagePropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderTileImagePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.npNext(address()); }
        /** @return the value of the {@code shaderTileImageCoherentReadAccelerated} field. */
        @NativeType("VkBool32")
        public boolean shaderTileImageCoherentReadAccelerated() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.nshaderTileImageCoherentReadAccelerated(address()) != 0; }
        /** @return the value of the {@code shaderTileImageReadSampleFromPixelRateInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderTileImageReadSampleFromPixelRateInvocation() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.nshaderTileImageReadSampleFromPixelRateInvocation(address()) != 0; }
        /** @return the value of the {@code shaderTileImageReadFromHelperInvocation} field. */
        @NativeType("VkBool32")
        public boolean shaderTileImageReadFromHelperInvocation() { return VkPhysicalDeviceShaderTileImagePropertiesEXT.nshaderTileImageReadFromHelperInvocation(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderTileImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer sType$Default() { return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceShaderTileImagePropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderTileImagePropertiesEXT.npNext(address(), value); return this; }

    }

}