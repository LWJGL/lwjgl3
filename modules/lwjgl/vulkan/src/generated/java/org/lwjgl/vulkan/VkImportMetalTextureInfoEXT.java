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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure that identifies Metal MTLTexture objects to use when creating a VkImage.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code pNext} chain <b>must</b> include one {@link VkImportMetalTextureInfoEXT} structure for each plane in the {@code VkImage}. The app <b>must</b> ensure that the configuration of the Metal {@code id&lt;MTLTexture&gt;} objects are compatible with the configuration of the {@code VkImage}. Failure to do so results in undefined behavior.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT}</li>
 * <li>{@code plane} <b>must</b> be a valid {@code VkImageAspectFlagBits} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImportMetalTextureInfoEXT {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageAspectFlagBits {@link #plane};
 *     MTLTexture_id {@link #mtlTexture};
 * }</code></pre>
 */
public class VkImportMetalTextureInfoEXT extends Struct<VkImportMetalTextureInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PLANE,
        MTLTEXTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PLANE = layout.offsetof(2);
        MTLTEXTURE = layout.offsetof(3);
    }

    protected VkImportMetalTextureInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImportMetalTextureInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkImportMetalTextureInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkImportMetalTextureInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImportMetalTextureInfoEXT(ByteBuffer container) {
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
    /** indicates the plane of the {@code VkImage} that the {@code id&lt;MTLTexture&gt;} object should be attached to. */
    @NativeType("VkImageAspectFlagBits")
    public int plane() { return nplane(address()); }
    /** a the Metal {@code id&lt;MTLTexture&gt;} object that is to underlie the {@code VkImage} plane. */
    @NativeType("MTLTexture_id")
    public long mtlTexture() { return nmtlTexture(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImportMetalTextureInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT} value to the {@link #sType} field. */
    public VkImportMetalTextureInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImportMetalTextureInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #plane} field. */
    public VkImportMetalTextureInfoEXT plane(@NativeType("VkImageAspectFlagBits") int value) { nplane(address(), value); return this; }
    /** Sets the specified value to the {@link #mtlTexture} field. */
    public VkImportMetalTextureInfoEXT mtlTexture(@NativeType("MTLTexture_id") long value) { nmtlTexture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImportMetalTextureInfoEXT set(
        int sType,
        long pNext,
        int plane,
        long mtlTexture
    ) {
        sType(sType);
        pNext(pNext);
        plane(plane);
        mtlTexture(mtlTexture);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImportMetalTextureInfoEXT set(VkImportMetalTextureInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImportMetalTextureInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImportMetalTextureInfoEXT malloc() {
        return new VkImportMetalTextureInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalTextureInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImportMetalTextureInfoEXT calloc() {
        return new VkImportMetalTextureInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImportMetalTextureInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkImportMetalTextureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImportMetalTextureInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkImportMetalTextureInfoEXT} instance for the specified memory address. */
    public static VkImportMetalTextureInfoEXT create(long address) {
        return new VkImportMetalTextureInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMetalTextureInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkImportMetalTextureInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkImportMetalTextureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalTextureInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalTextureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalTextureInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalTextureInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImportMetalTextureInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImportMetalTextureInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImportMetalTextureInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImportMetalTextureInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImportMetalTextureInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalTextureInfoEXT malloc(MemoryStack stack) {
        return new VkImportMetalTextureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImportMetalTextureInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImportMetalTextureInfoEXT calloc(MemoryStack stack) {
        return new VkImportMetalTextureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImportMetalTextureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalTextureInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImportMetalTextureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImportMetalTextureInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImportMetalTextureInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImportMetalTextureInfoEXT.PNEXT); }
    /** Unsafe version of {@link #plane}. */
    public static int nplane(long struct) { return UNSAFE.getInt(null, struct + VkImportMetalTextureInfoEXT.PLANE); }
    /** Unsafe version of {@link #mtlTexture}. */
    public static long nmtlTexture(long struct) { return memGetAddress(struct + VkImportMetalTextureInfoEXT.MTLTEXTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMetalTextureInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMetalTextureInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #plane(int) plane}. */
    public static void nplane(long struct, int value) { UNSAFE.putInt(null, struct + VkImportMetalTextureInfoEXT.PLANE, value); }
    /** Unsafe version of {@link #mtlTexture(long) mtlTexture}. */
    public static void nmtlTexture(long struct, long value) { memPutAddress(struct + VkImportMetalTextureInfoEXT.MTLTEXTURE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkImportMetalTextureInfoEXT.MTLTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link VkImportMetalTextureInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkImportMetalTextureInfoEXT, Buffer> implements NativeResource {

        private static final VkImportMetalTextureInfoEXT ELEMENT_FACTORY = VkImportMetalTextureInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkImportMetalTextureInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImportMetalTextureInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImportMetalTextureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImportMetalTextureInfoEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImportMetalTextureInfoEXT.nsType(address()); }
        /** @return the value of the {@link VkImportMetalTextureInfoEXT#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImportMetalTextureInfoEXT.npNext(address()); }
        /** @return the value of the {@link VkImportMetalTextureInfoEXT#plane} field. */
        @NativeType("VkImageAspectFlagBits")
        public int plane() { return VkImportMetalTextureInfoEXT.nplane(address()); }
        /** @return the value of the {@link VkImportMetalTextureInfoEXT#mtlTexture} field. */
        @NativeType("MTLTexture_id")
        public long mtlTexture() { return VkImportMetalTextureInfoEXT.nmtlTexture(address()); }

        /** Sets the specified value to the {@link VkImportMetalTextureInfoEXT#sType} field. */
        public VkImportMetalTextureInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkImportMetalTextureInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT} value to the {@link VkImportMetalTextureInfoEXT#sType} field. */
        public VkImportMetalTextureInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_IMPORT_METAL_TEXTURE_INFO_EXT); }
        /** Sets the specified value to the {@link VkImportMetalTextureInfoEXT#pNext} field. */
        public VkImportMetalTextureInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkImportMetalTextureInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMetalTextureInfoEXT#plane} field. */
        public VkImportMetalTextureInfoEXT.Buffer plane(@NativeType("VkImageAspectFlagBits") int value) { VkImportMetalTextureInfoEXT.nplane(address(), value); return this; }
        /** Sets the specified value to the {@link VkImportMetalTextureInfoEXT#mtlTexture} field. */
        public VkImportMetalTextureInfoEXT.Buffer mtlTexture(@NativeType("MTLTexture_id") long value) { VkImportMetalTextureInfoEXT.nmtlTexture(address(), value); return this; }

    }

}