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
 * <p>Images that <b>can</b> be used with the framebuffer when beginning a render pass, as specified by {@link VkRenderPassAttachmentBeginInfoKHR}, <b>must</b> be created with parameters that are identical to those specified here.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRImagelessFramebuffer#VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkImageCreateFlagBits} values</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkImageUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>If {@code viewFormatCount} is not 0, {@code pViewFormats} <b>must</b> be a valid pointer to an array of {@code viewFormatCount} valid {@code VkFormat} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkFramebufferAttachmentsCreateInfoKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkImageCreateFlagBits}, matching the value of {@link VkImageCreateInfo}{@code ::flags} used to create an image that will be used with this framebuffer.</li>
 * <li>{@code usage} &ndash; a bitmask of {@code VkImageUsageFlagBits}, matching the value of {@link VkImageCreateInfo}{@code ::usage} used to create an image used with this framebuffer.</li>
 * <li>{@code width} &ndash; the width of the image view used for rendering.</li>
 * <li>{@code height} &ndash; the height of the image view used for rendering.</li>
 * <li>{@code viewFormatCount} &ndash; the number of entries in the {@code pViewFormats} array, matching the value of {@link VkImageFormatListCreateInfoKHR}{@code ::viewFormatCount} used to create an image used with this framebuffer.</li>
 * <li>{@code pViewFormats} &ndash; an array which lists of all formats which <b>can</b> be used when creating views of the image, matching the value of {@link VkImageFormatListCreateInfoKHR}::pViewFormats used to create an image used with this framebuffer.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferAttachmentImageInfoKHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkImageCreateFlags flags;
 *     VkImageUsageFlags usage;
 *     uint32_t width;
 *     uint32_t height;
 *     uint32_t layerCount;
 *     uint32_t viewFormatCount;
 *     VkFormat const * pViewFormats;
 * }</code></pre>
 */
public class VkFramebufferAttachmentImageInfoKHR extends Struct implements NativeResource {

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
     * Creates a {@code VkFramebufferAttachmentImageInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferAttachmentImageInfoKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkImageCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code usage} field. */
    @NativeType("VkImageUsageFlags")
    public int usage() { return nusage(address()); }
    /** Returns the value of the {@code width} field. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** Returns the value of the {@code height} field. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** Returns the value of the {@code layerCount} field. */
    @NativeType("uint32_t")
    public int layerCount() { return nlayerCount(address()); }
    /** Returns the value of the {@code viewFormatCount} field. */
    @NativeType("uint32_t")
    public int viewFormatCount() { return nviewFormatCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
    @Nullable
    @NativeType("VkFormat const *")
    public IntBuffer pViewFormats() { return npViewFormats(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkFramebufferAttachmentImageInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkFramebufferAttachmentImageInfoKHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkFramebufferAttachmentImageInfoKHR flags(@NativeType("VkImageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkFramebufferAttachmentImageInfoKHR usage(@NativeType("VkImageUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public VkFramebufferAttachmentImageInfoKHR width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public VkFramebufferAttachmentImageInfoKHR height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code layerCount} field. */
    public VkFramebufferAttachmentImageInfoKHR layerCount(@NativeType("uint32_t") int value) { nlayerCount(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
    public VkFramebufferAttachmentImageInfoKHR pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { npViewFormats(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferAttachmentImageInfoKHR set(
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
    public VkFramebufferAttachmentImageInfoKHR set(VkFramebufferAttachmentImageInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentImageInfoKHR malloc() {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferAttachmentImageInfoKHR calloc() {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferAttachmentImageInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance for the specified memory address. */
    public static VkFramebufferAttachmentImageInfoKHR create(long address) {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentImageInfoKHR createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferAttachmentImageInfoKHR.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferAttachmentImageInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkFramebufferAttachmentImageInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkFramebufferAttachmentImageInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfoKHR mallocStack(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferAttachmentImageInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferAttachmentImageInfoKHR callocStack(MemoryStack stack) {
        return wrap(VkFramebufferAttachmentImageInfoKHR.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferAttachmentImageInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferAttachmentImageInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferAttachmentImageInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfoKHR.FLAGS); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfoKHR.USAGE); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfoKHR.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfoKHR.HEIGHT); }
    /** Unsafe version of {@link #layerCount}. */
    public static int nlayerCount(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfoKHR.LAYERCOUNT); }
    /** Unsafe version of {@link #viewFormatCount}. */
    public static int nviewFormatCount(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferAttachmentImageInfoKHR.VIEWFORMATCOUNT); }
    /** Unsafe version of {@link #pViewFormats() pViewFormats}. */
    @Nullable public static IntBuffer npViewFormats(long struct) { return memIntBufferSafe(memGetAddress(struct + VkFramebufferAttachmentImageInfoKHR.PVIEWFORMATS), nviewFormatCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferAttachmentImageInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfoKHR.USAGE, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfoKHR.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfoKHR.HEIGHT, value); }
    /** Unsafe version of {@link #layerCount(int) layerCount}. */
    public static void nlayerCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfoKHR.LAYERCOUNT, value); }
    /** Sets the specified value to the {@code viewFormatCount} field of the specified {@code struct}. */
    public static void nviewFormatCount(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferAttachmentImageInfoKHR.VIEWFORMATCOUNT, value); }
    /** Unsafe version of {@link #pViewFormats(IntBuffer) pViewFormats}. */
    public static void npViewFormats(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkFramebufferAttachmentImageInfoKHR.PVIEWFORMATS, memAddressSafe(value)); nviewFormatCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nviewFormatCount(struct) != 0) {
            check(memGetAddress(struct + VkFramebufferAttachmentImageInfoKHR.PVIEWFORMATS));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkFramebufferAttachmentImageInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferAttachmentImageInfoKHR, Buffer> implements NativeResource {

        private static final VkFramebufferAttachmentImageInfoKHR ELEMENT_FACTORY = VkFramebufferAttachmentImageInfoKHR.create(-1L);

        /**
         * Creates a new {@code VkFramebufferAttachmentImageInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferAttachmentImageInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferAttachmentImageInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferAttachmentImageInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkFramebufferAttachmentImageInfoKHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkImageCreateFlags")
        public int flags() { return VkFramebufferAttachmentImageInfoKHR.nflags(address()); }
        /** Returns the value of the {@code usage} field. */
        @NativeType("VkImageUsageFlags")
        public int usage() { return VkFramebufferAttachmentImageInfoKHR.nusage(address()); }
        /** Returns the value of the {@code width} field. */
        @NativeType("uint32_t")
        public int width() { return VkFramebufferAttachmentImageInfoKHR.nwidth(address()); }
        /** Returns the value of the {@code height} field. */
        @NativeType("uint32_t")
        public int height() { return VkFramebufferAttachmentImageInfoKHR.nheight(address()); }
        /** Returns the value of the {@code layerCount} field. */
        @NativeType("uint32_t")
        public int layerCount() { return VkFramebufferAttachmentImageInfoKHR.nlayerCount(address()); }
        /** Returns the value of the {@code viewFormatCount} field. */
        @NativeType("uint32_t")
        public int viewFormatCount() { return VkFramebufferAttachmentImageInfoKHR.nviewFormatCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewFormats} field. */
        @Nullable
        @NativeType("VkFormat const *")
        public IntBuffer pViewFormats() { return VkFramebufferAttachmentImageInfoKHR.npViewFormats(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferAttachmentImageInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer pNext(@NativeType("void const *") long value) { VkFramebufferAttachmentImageInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer flags(@NativeType("VkImageCreateFlags") int value) { VkFramebufferAttachmentImageInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer usage(@NativeType("VkImageUsageFlags") int value) { VkFramebufferAttachmentImageInfoKHR.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer width(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfoKHR.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer height(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfoKHR.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code layerCount} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer layerCount(@NativeType("uint32_t") int value) { VkFramebufferAttachmentImageInfoKHR.nlayerCount(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewFormats} field. */
        public VkFramebufferAttachmentImageInfoKHR.Buffer pViewFormats(@Nullable @NativeType("VkFormat const *") IntBuffer value) { VkFramebufferAttachmentImageInfoKHR.npViewFormats(address(), value); return this; }

    }

}