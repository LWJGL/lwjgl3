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
 * Structure informing whether or not texture gather bias/LOD functionality is supported for a given image format and a given physical device.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link AMDTextureGatherBiasLod#VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkTextureLODGatherFormatPropertiesAMD {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #supportsTextureGatherLODBiasAMD};
 * }</code></pre>
 */
public class VkTextureLODGatherFormatPropertiesAMD extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUPPORTSTEXTUREGATHERLODBIASAMD;

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
        SUPPORTSTEXTUREGATHERLODBIASAMD = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkTextureLODGatherFormatPropertiesAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTextureLODGatherFormatPropertiesAMD(ByteBuffer container) {
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
    /** tells if the image format can be used with texture gather bias/LOD functions, as introduced by the {@link AMDTextureGatherBiasLod VK_AMD_texture_gather_bias_lod} extension. This field is set by the implementation. User-specified value is ignored. */
    @NativeType("VkBool32")
    public boolean supportsTextureGatherLODBiasAMD() { return nsupportsTextureGatherLODBiasAMD(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkTextureLODGatherFormatPropertiesAMD sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDTextureGatherBiasLod#VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD} value to the {@link #sType} field. */
    public VkTextureLODGatherFormatPropertiesAMD sType$Default() { return sType(AMDTextureGatherBiasLod.VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkTextureLODGatherFormatPropertiesAMD pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTextureLODGatherFormatPropertiesAMD set(
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
    public VkTextureLODGatherFormatPropertiesAMD set(VkTextureLODGatherFormatPropertiesAMD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTextureLODGatherFormatPropertiesAMD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTextureLODGatherFormatPropertiesAMD malloc() {
        return wrap(VkTextureLODGatherFormatPropertiesAMD.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkTextureLODGatherFormatPropertiesAMD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTextureLODGatherFormatPropertiesAMD calloc() {
        return wrap(VkTextureLODGatherFormatPropertiesAMD.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkTextureLODGatherFormatPropertiesAMD} instance allocated with {@link BufferUtils}. */
    public static VkTextureLODGatherFormatPropertiesAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkTextureLODGatherFormatPropertiesAMD.class, memAddress(container), container);
    }

    /** Returns a new {@code VkTextureLODGatherFormatPropertiesAMD} instance for the specified memory address. */
    public static VkTextureLODGatherFormatPropertiesAMD create(long address) {
        return wrap(VkTextureLODGatherFormatPropertiesAMD.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTextureLODGatherFormatPropertiesAMD createSafe(long address) {
        return address == NULL ? null : wrap(VkTextureLODGatherFormatPropertiesAMD.class, address);
    }

    /**
     * Returns a new {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkTextureLODGatherFormatPropertiesAMD.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkTextureLODGatherFormatPropertiesAMD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTextureLODGatherFormatPropertiesAMD malloc(MemoryStack stack) {
        return wrap(VkTextureLODGatherFormatPropertiesAMD.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkTextureLODGatherFormatPropertiesAMD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTextureLODGatherFormatPropertiesAMD calloc(MemoryStack stack) {
        return wrap(VkTextureLODGatherFormatPropertiesAMD.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTextureLODGatherFormatPropertiesAMD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTextureLODGatherFormatPropertiesAMD.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkTextureLODGatherFormatPropertiesAMD.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTextureLODGatherFormatPropertiesAMD.PNEXT); }
    /** Unsafe version of {@link #supportsTextureGatherLODBiasAMD}. */
    public static int nsupportsTextureGatherLODBiasAMD(long struct) { return UNSAFE.getInt(null, struct + VkTextureLODGatherFormatPropertiesAMD.SUPPORTSTEXTUREGATHERLODBIASAMD); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkTextureLODGatherFormatPropertiesAMD.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTextureLODGatherFormatPropertiesAMD.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkTextureLODGatherFormatPropertiesAMD} structs. */
    public static class Buffer extends StructBuffer<VkTextureLODGatherFormatPropertiesAMD, Buffer> implements NativeResource {

        private static final VkTextureLODGatherFormatPropertiesAMD ELEMENT_FACTORY = VkTextureLODGatherFormatPropertiesAMD.create(-1L);

        /**
         * Creates a new {@code VkTextureLODGatherFormatPropertiesAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTextureLODGatherFormatPropertiesAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkTextureLODGatherFormatPropertiesAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkTextureLODGatherFormatPropertiesAMD#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTextureLODGatherFormatPropertiesAMD.nsType(address()); }
        /** @return the value of the {@link VkTextureLODGatherFormatPropertiesAMD#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkTextureLODGatherFormatPropertiesAMD.npNext(address()); }
        /** @return the value of the {@link VkTextureLODGatherFormatPropertiesAMD#supportsTextureGatherLODBiasAMD} field. */
        @NativeType("VkBool32")
        public boolean supportsTextureGatherLODBiasAMD() { return VkTextureLODGatherFormatPropertiesAMD.nsupportsTextureGatherLODBiasAMD(address()) != 0; }

        /** Sets the specified value to the {@link VkTextureLODGatherFormatPropertiesAMD#sType} field. */
        public VkTextureLODGatherFormatPropertiesAMD.Buffer sType(@NativeType("VkStructureType") int value) { VkTextureLODGatherFormatPropertiesAMD.nsType(address(), value); return this; }
        /** Sets the {@link AMDTextureGatherBiasLod#VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD} value to the {@link VkTextureLODGatherFormatPropertiesAMD#sType} field. */
        public VkTextureLODGatherFormatPropertiesAMD.Buffer sType$Default() { return sType(AMDTextureGatherBiasLod.VK_STRUCTURE_TYPE_TEXTURE_LOD_GATHER_FORMAT_PROPERTIES_AMD); }
        /** Sets the specified value to the {@link VkTextureLODGatherFormatPropertiesAMD#pNext} field. */
        public VkTextureLODGatherFormatPropertiesAMD.Buffer pNext(@NativeType("void *") long value) { VkTextureLODGatherFormatPropertiesAMD.npNext(address(), value); return this; }

    }

}