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
 * Structure describing tile image features supported by the implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceShaderTileImageFeaturesEXT} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTShaderTileImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceShaderTileImageFeaturesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #shaderTileImageColorReadAccess};
 *     VkBool32 {@link #shaderTileImageDepthReadAccess};
 *     VkBool32 {@link #shaderTileImageStencilReadAccess};
 * }</code></pre>
 */
public class VkPhysicalDeviceShaderTileImageFeaturesEXT extends Struct<VkPhysicalDeviceShaderTileImageFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERTILEIMAGECOLORREADACCESS,
        SHADERTILEIMAGEDEPTHREADACCESS,
        SHADERTILEIMAGESTENCILREADACCESS;

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
        SHADERTILEIMAGECOLORREADACCESS = layout.offsetof(2);
        SHADERTILEIMAGEDEPTHREADACCESS = layout.offsetof(3);
        SHADERTILEIMAGESTENCILREADACCESS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceShaderTileImageFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceShaderTileImageFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceShaderTileImageFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT(ByteBuffer container) {
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
    /** indicates that the implementation supports the {@code TileImageColorReadAccessEXT} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean shaderTileImageColorReadAccess() { return nshaderTileImageColorReadAccess(address()) != 0; }
    /** indicates that the implementation supports the {@code TileImageDepthReadAccessEXT} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean shaderTileImageDepthReadAccess() { return nshaderTileImageDepthReadAccess(address()) != 0; }
    /** indicates that the implementation supports the {@code TileImageStencilReadAccessEXT} SPIR-V capability. */
    @NativeType("VkBool32")
    public boolean shaderTileImageStencilReadAccess() { return nshaderTileImageStencilReadAccess(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderTileImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT sType$Default() { return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #shaderTileImageColorReadAccess} field. */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageColorReadAccess(@NativeType("VkBool32") boolean value) { nshaderTileImageColorReadAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderTileImageDepthReadAccess} field. */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageDepthReadAccess(@NativeType("VkBool32") boolean value) { nshaderTileImageDepthReadAccess(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #shaderTileImageStencilReadAccess} field. */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT shaderTileImageStencilReadAccess(@NativeType("VkBool32") boolean value) { nshaderTileImageStencilReadAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT set(
        int sType,
        long pNext,
        boolean shaderTileImageColorReadAccess,
        boolean shaderTileImageDepthReadAccess,
        boolean shaderTileImageStencilReadAccess
    ) {
        sType(sType);
        pNext(pNext);
        shaderTileImageColorReadAccess(shaderTileImageColorReadAccess);
        shaderTileImageDepthReadAccess(shaderTileImageDepthReadAccess);
        shaderTileImageStencilReadAccess(shaderTileImageStencilReadAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceShaderTileImageFeaturesEXT set(VkPhysicalDeviceShaderTileImageFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceShaderTileImageFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT malloc() {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTileImageFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT calloc() {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTileImageFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceShaderTileImageFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT create(long address) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceShaderTileImageFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTileImageFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceShaderTileImageFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderTileImageFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #shaderTileImageColorReadAccess}. */
    public static int nshaderTileImageColorReadAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.SHADERTILEIMAGECOLORREADACCESS); }
    /** Unsafe version of {@link #shaderTileImageDepthReadAccess}. */
    public static int nshaderTileImageDepthReadAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.SHADERTILEIMAGEDEPTHREADACCESS); }
    /** Unsafe version of {@link #shaderTileImageStencilReadAccess}. */
    public static int nshaderTileImageStencilReadAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.SHADERTILEIMAGESTENCILREADACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderTileImageColorReadAccess(boolean) shaderTileImageColorReadAccess}. */
    public static void nshaderTileImageColorReadAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.SHADERTILEIMAGECOLORREADACCESS, value); }
    /** Unsafe version of {@link #shaderTileImageDepthReadAccess(boolean) shaderTileImageDepthReadAccess}. */
    public static void nshaderTileImageDepthReadAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.SHADERTILEIMAGEDEPTHREADACCESS, value); }
    /** Unsafe version of {@link #shaderTileImageStencilReadAccess(boolean) shaderTileImageStencilReadAccess}. */
    public static void nshaderTileImageStencilReadAccess(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceShaderTileImageFeaturesEXT.SHADERTILEIMAGESTENCILREADACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceShaderTileImageFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderTileImageFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceShaderTileImageFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderTileImageFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceShaderTileImageFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#shaderTileImageColorReadAccess} field. */
        @NativeType("VkBool32")
        public boolean shaderTileImageColorReadAccess() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageColorReadAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#shaderTileImageDepthReadAccess} field. */
        @NativeType("VkBool32")
        public boolean shaderTileImageDepthReadAccess() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageDepthReadAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#shaderTileImageStencilReadAccess} field. */
        @NativeType("VkBool32")
        public boolean shaderTileImageStencilReadAccess() { return VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageStencilReadAccess(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#sType} field. */
        public VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderTileImage#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT} value to the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#sType} field. */
        public VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer sType$Default() { return sType(EXTShaderTileImage.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_TILE_IMAGE_FEATURES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#pNext} field. */
        public VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#shaderTileImageColorReadAccess} field. */
        public VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer shaderTileImageColorReadAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageColorReadAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#shaderTileImageDepthReadAccess} field. */
        public VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer shaderTileImageDepthReadAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageDepthReadAccess(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceShaderTileImageFeaturesEXT#shaderTileImageStencilReadAccess} field. */
        public VkPhysicalDeviceShaderTileImageFeaturesEXT.Buffer shaderTileImageStencilReadAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceShaderTileImageFeaturesEXT.nshaderTileImageStencilReadAccess(address(), value ? 1 : 0); return this; }

    }

}