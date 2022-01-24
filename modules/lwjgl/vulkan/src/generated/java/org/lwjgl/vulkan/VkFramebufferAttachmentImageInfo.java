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
 * Structure specifying parameters of an image that will be used with a framebuffer.
 * 
 * <h5>Description</h5>
 * 
 * <p>Images that <b>can</b> be used with the framebuffer when beginning a render pass, as specified by {@link VkRenderPassAttachmentBeginInfo}, <b>must</b> be created with parameters that are identical to those specified here.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>If {@code viewFormatCount} is not 0, {@code pViewFormats} <b>must</b> be a valid pointer to an array of {@code viewFormatCount} valid {@code VkFormat} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkFramebufferAttachmentsCreateInfo}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferAttachmentImageInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImageCreateFlags {@link #flags};
 *     VkImageUsageFlags {@link #usage};
 *     uint32_t {@link #width};
 *     uint32_t {@link #height};
 *     uint32_t {@link #layerCount};
 *     uint32_t {@link #viewFormatCount};
 *     VkFormat const * {@link #pViewFormats};
 * }</code></pre>
 */
public class VkFramebufferAttachmentImageInfo extends Struct implements NativeResource {

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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a bitmask of {@code VkImageCreateFlagBits}, matching the value of {@link VkImageCreateInfo}{@code ::flags} used to create an image that will be used with this framebuffer. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }
    /** a bitmask of {@code VkImageUsageFlagBits}, matching the value of {@link VkImageCreateInfo}{@code ::usage} used to create an image used with this framebuffer. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** the width of the image view used for rendering. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** the height of the image view used for rendering. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** the number of array layers of the image view used for rendering. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** the number of entries in the {@code pViewFormats} array, matching the value of {@link VkImageFormatListCreateInfo}{@code ::viewFormatCount} used to create an image used with this framebuffer. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** a pointer to an array of {@code VkFormat} values specifying all of the formats which <b>can</b> be used when creating views of the image, matching the value of {@link VkImageFormatListCreateInfo}{@code ::pViewFormats} used to create an image used with this framebuffer. */
    @Nullable
    @NativeType("VkFormat const *")
    public IntBuffer pViewFormats() { return npViewFormats(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFramebufferAttachmentImageInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO} value to the {@link #sType} field. */
    public VkFramebufferAttachmentImageInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFramebufferAttachmentImageInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkFramebufferAttachmentImageInfo flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #usage} field. */
    public VkFramebufferAttachmentImageInfo usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public VkFramebufferAttachmentImageInfo width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public VkFramebufferAttachmentImageInfo height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #layerCount} field. */
    public VkFramebufferAttachmentImageInfo layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@link #pViewFormats} field. */
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
        return wrap(VkFramebufferAttachmentImageInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentImageInfo calloc() {
        return wrap(VkFramebufferAttachmentImageInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferAttachmentImageInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferAttachmentImageInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfo} instance for the specified memory address. */
    public static VkFramebufferAttachmentImageInfo create(long address) {
        return wrap(VkFramebufferAttachmentImageInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentImageInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferAttachmentImageInfo.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferAttachmentImageInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentImageInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfo malloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentImageInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfo calloc(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentImageInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferAttachmentImageInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfo.FLAGS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfo.USAGE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfo.HEIGHT); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfo.LAYERCOUNT); }
    /** Unsafe version of {@link #viewFormatCount}. */
    public static int nviewFormatCount(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT); }
    /** Unsafe version of {@link #pViewFormats() pViewFormats}. */
    @Nullable public static IntBuffer npViewFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkFramebufferAttachmentImageInfo.PVIEWFORMATS), nviewFormatCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferAttachmentImageInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfo.FLAGS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfo.USAGE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfo.HEIGHT, value); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfo.LAYERCOUNT, value); }
    /** Sets the specified value to the {@code viewFormatCount} field of the specified {@code struct}. */
    public static void nviewFormatCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfo.VIEWFORMATCOUNT, value); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferAttachmentImageInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferAttachmentImageInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferAttachmentImageInfo.nsType(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferAttachmentImageInfo.npNext(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkFramebufferAttachmentImageInfo.nflags(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkFramebufferAttachmentImageInfo.nusage(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#width} field. */
        @NativeType("uint32_t")
        public int width() { return VkFramebufferAttachmentImageInfo.nwidth(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#height} field. */
        @NativeType("uint32_t")
        public int height() { return VkFramebufferAttachmentImageInfo.nheight(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkFramebufferAttachmentImageInfo.nlayerCount(address()); }
        /** @return the value of the {@link VkFramebufferAttachmentImageInfo#viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return VkFramebufferAttachmentImageInfo.nviewFormatCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@link VkFramebufferAttachmentImageInfo#pViewFormats} field. */
        @Nullable
        @NativeType("VkFormat const *")
        public IntBuffer pViewFormats() { return VkFramebufferAttachmentImageInfo.npViewFormats(address()); }

        /** Sets the specified value to the {@link VkFramebufferAttachmentImageInfo#sType} field. */
        public VkFramebufferAttachmentImageInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferAttachmentImageInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO} value to the {@link VkFramebufferAttachmentImageInfo#sType} field. */
        public VkFramebufferAttachmentImageInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO); }
        /** Sets the specified value to the {@link VkFramebufferAttachmentImageInfo#pNext} field. */
        public VkFramebufferAttachmentImageInfo.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferAttachmentImageInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferAttachmentImageInfo#flags} field. */
        public VkFramebufferAttachmentImageInfo.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkFramebufferAttachmentImageInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferAttachmentImageInfo#usage} field. */
        public VkFramebufferAttachmentImageInfo.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkFramebufferAttachmentImageInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferAttachmentImageInfo#width} field. */
        public VkFramebufferAttachmentImageInfo.Buffer width(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferAttachmentImageInfo#height} field. */
        public VkFramebufferAttachmentImageInfo.Buffer height(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link VkFramebufferAttachmentImageInfo#layerCount} field. */
        public VkFramebufferAttachmentImageInfo.Buffer layerCount(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfo.nlayerCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@link VkFramebufferAttachmentImageInfo#pViewFormats} field. */
        public VkFramebufferAttachmentImageInfo.Buffer pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkFramebufferAttachmentImageInfo.npViewFormats(address(), value); return this; }

    }

}