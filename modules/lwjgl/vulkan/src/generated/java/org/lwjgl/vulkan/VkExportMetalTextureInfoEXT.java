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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkExportMetalTextureInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImage image;
 *     VkImageView imageView;
 *     VkBufferView bufferView;
 *     VkImageAspectFlagBits plane;
 *     MTLTexture_id mtlTexture;
 * }}</pre>
 */
public class VkExportMetalTextureInfoEXT extends Struct<VkExportMetalTextureInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        IMAGEVIEW,
        BUFFERVIEW,
        PLANE,
        MTLTEXTURE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        IMAGEVIEW = layout.offsetof(3);
        BUFFERVIEW = layout.offsetof(4);
        PLANE = layout.offsetof(5);
        MTLTEXTURE = layout.offsetof(6);
    }

    protected VkExportMetalTextureInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalTextureInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalTextureInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalTextureInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalTextureInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code image} field. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** @return the value of the {@code imageView} field. */
    @NativeType("VkImageView")
    public long imageView() { return nimageView(address()); }
    /** @return the value of the {@code bufferView} field. */
    @NativeType("VkBufferView")
    public long bufferView() { return nbufferView(address()); }
    /** @return the value of the {@code plane} field. */
    @NativeType("VkImageAspectFlagBits")
    public int plane() { return nplane(address()); }
    /** @return the value of the {@code mtlTexture} field. */
    @NativeType("MTLTexture_id")
    public long mtlTexture() { return nmtlTexture(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExportMetalTextureInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT} value to the {@code sType} field. */
    public VkExportMetalTextureInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExportMetalTextureInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public VkExportMetalTextureInfoEXT image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@code imageView} field. */
    public VkExportMetalTextureInfoEXT imageView(@NativeType("VkImageView") long value) { nimageView(address(), value); return this; }
    /** Sets the specified value to the {@code bufferView} field. */
    public VkExportMetalTextureInfoEXT bufferView(@NativeType("VkBufferView") long value) { nbufferView(address(), value); return this; }
    /** Sets the specified value to the {@code plane} field. */
    public VkExportMetalTextureInfoEXT plane(@NativeType("VkImageAspectFlagBits") int value) { nplane(address(), value); return this; }
    /** Sets the specified value to the {@code mtlTexture} field. */
    public VkExportMetalTextureInfoEXT mtlTexture(@NativeType("MTLTexture_id") long value) { nmtlTexture(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMetalTextureInfoEXT set(
        int sType,
        long pNext,
        long image,
        long imageView,
        long bufferView,
        int plane,
        long mtlTexture
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        imageView(imageView);
        bufferView(bufferView);
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
    public VkExportMetalTextureInfoEXT set(VkExportMetalTextureInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalTextureInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalTextureInfoEXT malloc() {
        return new VkExportMetalTextureInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalTextureInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalTextureInfoEXT calloc() {
        return new VkExportMetalTextureInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalTextureInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalTextureInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalTextureInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalTextureInfoEXT} instance for the specified memory address. */
    public static VkExportMetalTextureInfoEXT create(long address) {
        return new VkExportMetalTextureInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExportMetalTextureInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalTextureInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalTextureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalTextureInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalTextureInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalTextureInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalTextureInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalTextureInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalTextureInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalTextureInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExportMetalTextureInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalTextureInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalTextureInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalTextureInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalTextureInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalTextureInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalTextureInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalTextureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalTextureInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalTextureInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalTextureInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportMetalTextureInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalTextureInfoEXT.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return memGetLong(struct + VkExportMetalTextureInfoEXT.IMAGE); }
    /** Unsafe version of {@link #imageView}. */
    public static long nimageView(long struct) { return memGetLong(struct + VkExportMetalTextureInfoEXT.IMAGEVIEW); }
    /** Unsafe version of {@link #bufferView}. */
    public static long nbufferView(long struct) { return memGetLong(struct + VkExportMetalTextureInfoEXT.BUFFERVIEW); }
    /** Unsafe version of {@link #plane}. */
    public static int nplane(long struct) { return memGetInt(struct + VkExportMetalTextureInfoEXT.PLANE); }
    /** Unsafe version of {@link #mtlTexture}. */
    public static long nmtlTexture(long struct) { return memGetAddress(struct + VkExportMetalTextureInfoEXT.MTLTEXTURE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportMetalTextureInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalTextureInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { memPutLong(struct + VkExportMetalTextureInfoEXT.IMAGE, value); }
    /** Unsafe version of {@link #imageView(long) imageView}. */
    public static void nimageView(long struct, long value) { memPutLong(struct + VkExportMetalTextureInfoEXT.IMAGEVIEW, value); }
    /** Unsafe version of {@link #bufferView(long) bufferView}. */
    public static void nbufferView(long struct, long value) { memPutLong(struct + VkExportMetalTextureInfoEXT.BUFFERVIEW, value); }
    /** Unsafe version of {@link #plane(int) plane}. */
    public static void nplane(long struct, int value) { memPutInt(struct + VkExportMetalTextureInfoEXT.PLANE, value); }
    /** Unsafe version of {@link #mtlTexture(long) mtlTexture}. */
    public static void nmtlTexture(long struct, long value) { memPutAddress(struct + VkExportMetalTextureInfoEXT.MTLTEXTURE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkExportMetalTextureInfoEXT.MTLTEXTURE));
    }

    // -----------------------------------

    /** An array of {@link VkExportMetalTextureInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalTextureInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalTextureInfoEXT ELEMENT_FACTORY = VkExportMetalTextureInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalTextureInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalTextureInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalTextureInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalTextureInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalTextureInfoEXT.npNext(address()); }
        /** @return the value of the {@code image} field. */
        @NativeType("VkImage")
        public long image() { return VkExportMetalTextureInfoEXT.nimage(address()); }
        /** @return the value of the {@code imageView} field. */
        @NativeType("VkImageView")
        public long imageView() { return VkExportMetalTextureInfoEXT.nimageView(address()); }
        /** @return the value of the {@code bufferView} field. */
        @NativeType("VkBufferView")
        public long bufferView() { return VkExportMetalTextureInfoEXT.nbufferView(address()); }
        /** @return the value of the {@code plane} field. */
        @NativeType("VkImageAspectFlagBits")
        public int plane() { return VkExportMetalTextureInfoEXT.nplane(address()); }
        /** @return the value of the {@code mtlTexture} field. */
        @NativeType("MTLTexture_id")
        public long mtlTexture() { return VkExportMetalTextureInfoEXT.nmtlTexture(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExportMetalTextureInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalTextureInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT} value to the {@code sType} field. */
        public VkExportMetalTextureInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_TEXTURE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExportMetalTextureInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalTextureInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public VkExportMetalTextureInfoEXT.Buffer image(@NativeType("VkImage") long value) { VkExportMetalTextureInfoEXT.nimage(address(), value); return this; }
        /** Sets the specified value to the {@code imageView} field. */
        public VkExportMetalTextureInfoEXT.Buffer imageView(@NativeType("VkImageView") long value) { VkExportMetalTextureInfoEXT.nimageView(address(), value); return this; }
        /** Sets the specified value to the {@code bufferView} field. */
        public VkExportMetalTextureInfoEXT.Buffer bufferView(@NativeType("VkBufferView") long value) { VkExportMetalTextureInfoEXT.nbufferView(address(), value); return this; }
        /** Sets the specified value to the {@code plane} field. */
        public VkExportMetalTextureInfoEXT.Buffer plane(@NativeType("VkImageAspectFlagBits") int value) { VkExportMetalTextureInfoEXT.nplane(address(), value); return this; }
        /** Sets the specified value to the {@code mtlTexture} field. */
        public VkExportMetalTextureInfoEXT.Buffer mtlTexture(@NativeType("MTLTexture_id") long value) { VkExportMetalTextureInfoEXT.nmtlTexture(address(), value); return this; }

    }

}