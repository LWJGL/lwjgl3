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
 * struct VkFramebufferAttachmentImageInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageCreateFlags flags;
 *     VkImageUsageFlags usage;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t layerCount;
 *     uint32_t viewFormatCount;
 *     VkFormat const * pViewFormats;
 * }}</pre>
 */
public class VkFramebufferAttachmentImageInfo extends Struct<VkFramebufferAttachmentImageInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        USAGE,
        WIDTH,
        HEIGHT,
        LAYERCOUNT,
        VIEWFORMATCOUNT,
        PVIEWFORMATS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        USAGE = layout.offsetof(3);
        WIDTH = layout.offsetof(4);
        HEIGHT = layout.offsetof(5);
        LAYERCOUNT = layout.offsetof(6);
        VIEWFORMATCOUNT = layout.offsetof(7);
        PVIEWFORMATS = layout.offsetof(8);
    }

    protected VkFramebufferAttachmentImageInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkFramebufferAttachmentImageInfo create(long address, @Nullable ByteBuffer container) {
        return new VkFramebufferAttachmentImageInfo(address, container);
    }

    /**
     * Creates a {@code VkFramebufferAttachmentImageInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferAttachmentImageInfo(ByteBuffer container) {
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
    /** @return the value of the {@code flags} field. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code usage} field. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** @return the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** @return the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** @return the value of the {@code viewFormatCount} field. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
    @NativeType("VkFormat const *")
    public @Nullable IntBuffer pViewFormats() { return npViewFormats(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFramebufferAttachmentImageInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO} value to the {@code sType} field. */
    public VkFramebufferAttachmentImageInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFramebufferAttachmentImageInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkFramebufferAttachmentImageInfo flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkFramebufferAttachmentImageInfo usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public VkFramebufferAttachmentImageInfo width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkFramebufferAttachmentImageInfo height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    public VkFramebufferAttachmentImageInfo layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
    public VkFramebufferAttachmentImageInfo pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npViewFormats(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferAttachmentImageInfo set(
        int sType,
        long pNext,
        int flags,
        int usage,
        int width,
        int height,
        int layerCount,
        @Nullable IntBuffer pViewFormats
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        usage(usage);
        width(width);
        height(height);
        layerCount(layerCount);
        pViewFormats(pViewFormats);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkFramebufferAttachmentImageInfo set(VkFramebufferAttachmentImageInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentImageInfo malloc() {
        return new VkFramebufferAttachmentImageInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentImageInfo calloc() {
        return new VkFramebufferAttachmentImageInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferAttachmentImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkFramebufferAttachmentImageInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfo} instance for the specified memory address. */
    public static VkFramebufferAttachmentImageInfo create(long address) {
        return new VkFramebufferAttachmentImageInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkFramebufferAttachmentImageInfo createSafe(long address) {
        return address == NULL ? null : new VkFramebufferAttachmentImageInfo(address, null);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkFramebufferAttachmentImageInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkFramebufferAttachmentImageInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfo malloc(MemoryStack stack) {
        return new VkFramebufferAttachmentImageInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfo calloc(MemoryStack stack) {
        return new VkFramebufferAttachmentImageInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkFramebufferAttachmentImageInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferAttachmentImageInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkFramebufferAttachmentImageInfo.FLAGS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkFramebufferAttachmentImageInfo.USAGE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return memGetInt(struct + VkFramebufferAttachmentImageInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return memGetInt(struct + VkFramebufferAttachmentImageInfo.HEIGHT); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return memGetInt(struct + VkFramebufferAttachmentImageInfo.LAYERCOUNT); }
    /** Unsafe version of {@link #viewFormatCount}. */
    public static int nviewFormatCount(long struct) { return memGetInt(struct + VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT); }
    /** Unsafe version of {@link #pViewFormats() pViewFormats}. */
    public static @Nullable IntBuffer npViewFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkFramebufferAttachmentImageInfo.PVIEWFORMATS), nviewFormatCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkFramebufferAttachmentImageInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferAttachmentImageInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkFramebufferAttachmentImageInfo.FLAGS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkFramebufferAttachmentImageInfo.USAGE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { memPutInt(struct + VkFramebufferAttachmentImageInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { memPutInt(struct + VkFramebufferAttachmentImageInfo.HEIGHT, value); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { memPutInt(struct + VkFramebufferAttachmentImageInfo.LAYERCOUNT, value); }
    /** Sets the specified value to the {@code viewFormatCount} field of the specified {@code struct}. */
    public static void nviewFormatCount(long struct, int value) { memPutInt(struct + VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT, value); }
    /** Unsafe version of {@link #pViewFormats(IntBuffer) pViewFormats}. */
    public static void npViewFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkFramebufferAttachmentImageInfo.PVIEWFORMATS, memAddressSafe(value)); nviewFormatCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nviewFormatCount(struct) != 0) {
            check(memGetAddress(struct + VkFramebufferAttachmentImageInfo.PVIEWFORMATS));
        }
    }

    // -----------------------------------

    /** An array of {@link VkFramebufferAttachmentImageInfo} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferAttachmentImageInfo, Buffer> implements NativeResource {

        private static final VkFramebufferAttachmentImageInfo ELEMENT_FACTORY = VkFramebufferAttachmentImageInfo.create(-1L);

        /**
         * Creates a new {@code VkFramebufferAttachmentImageInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferAttachmentImageInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkFramebufferAttachmentImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferAttachmentImageInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferAttachmentImageInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkFramebufferAttachmentImageInfo.nflags(address()); }
        /** @return the value of the {@code usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkFramebufferAttachmentImageInfo.nusage(address()); }
        /** @return the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkFramebufferAttachmentImageInfo.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkFramebufferAttachmentImageInfo.nheight(address()); }
        /** @return the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkFramebufferAttachmentImageInfo.nlayerCount(address()); }
        /** @return the value of the {@code viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return VkFramebufferAttachmentImageInfo.nviewFormatCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
        @NativeType("VkFormat const *")
        public @Nullable IntBuffer pViewFormats() { return VkFramebufferAttachmentImageInfo.npViewFormats(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFramebufferAttachmentImageInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferAttachmentImageInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO} value to the {@code sType} field. */
        public VkFramebufferAttachmentImageInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFramebufferAttachmentImageInfo.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferAttachmentImageInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkFramebufferAttachmentImageInfo.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkFramebufferAttachmentImageInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkFramebufferAttachmentImageInfo.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkFramebufferAttachmentImageInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public VkFramebufferAttachmentImageInfo.Buffer width(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkFramebufferAttachmentImageInfo.Buffer height(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        public VkFramebufferAttachmentImageInfo.Buffer layerCount(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.nlayerCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
        public VkFramebufferAttachmentImageInfo.Buffer pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkFramebufferAttachmentImageInfo.npViewFormats(address(), value); return this; }

    }

}