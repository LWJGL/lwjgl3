/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Creation info for a swapchain.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_SWAPCHAIN_CREATE_INFO TYPE_SWAPCHAIN_CREATE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT}, {@link XrSwapchainCreateInfoFoveationFB}</li>
 * <li>{@code createFlags} <b>must</b> be 0 or a valid combination of {@code XrSwapchainCreateFlagBits} values</li>
 * <li>{@code usageFlags} <b>must</b> be 0 or a valid combination of {@code XrSwapchainUsageFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrCreateSession CreateSession}, {@link XR10#xrCreateSwapchain CreateSwapchain}, {@link XR10#xrEnumerateSwapchainFormats EnumerateSwapchainFormats}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSwapchainCreateInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSwapchainCreateFlags {@link #createFlags};
 *     XrSwapchainUsageFlags {@link #usageFlags};
 *     int64_t {@link #format};
 *     uint32_t {@link #sampleCount};
 *     uint32_t {@link #width};
 *     uint32_t {@link #height};
 *     uint32_t {@link #faceCount};
 *     uint32_t {@link #arraySize};
 *     uint32_t {@link #mipCount};
 * }</code></pre>
 */
public class XrSwapchainCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CREATEFLAGS,
        USAGEFLAGS,
        FORMAT,
        SAMPLECOUNT,
        WIDTH,
        HEIGHT,
        FACECOUNT,
        ARRAYSIZE,
        MIPCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        USAGEFLAGS = layout.offsetof(3);
        FORMAT = layout.offsetof(4);
        SAMPLECOUNT = layout.offsetof(5);
        WIDTH = layout.offsetof(6);
        HEIGHT = layout.offsetof(7);
        FACECOUNT = layout.offsetof(8);
        ARRAYSIZE = layout.offsetof(9);
        MIPCOUNT = layout.offsetof(10);
    }

    /**
     * Creates a {@code XrSwapchainCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrSwapchainCreateFlagBits} describing additional properties of the swapchain. */
    @NativeType("XrSwapchainCreateFlags")
    public long createFlags() { return ncreateFlags(address()); }
    /** a bitmask of {@code XrSwapchainUsageFlagBits} describing the intended usage of the swapchain’s images. The usage flags define how the corresponding graphics API objects are created. A mismatch <b>may</b> result in swapchain images that do not support the application’s usage. */
    @NativeType("XrSwapchainUsageFlags")
    public long usageFlags() { return nusageFlags(address()); }
    /** a graphics API-specific texture format identifier. For example, if the graphics API specified in {@link XR10#xrCreateSession CreateSession} is Vulkan, then this format is a Vulkan format such as {@code VK_FORMAT_R8G8B8A8_SRGB}. The format identifies the format that the runtime will interpret the texture as upon submission. Valid formats are indicated by {@link XR10#xrEnumerateSwapchainFormats EnumerateSwapchainFormats}. */
    @NativeType("int64_t")
    public long format() { return nformat(address()); }
    /** the number of sub-data element samples in the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit. */
    @NativeType("uint32_t")
    public int sampleCount() { return nsampleCount(address()); }
    /** the width of the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit. */
    @NativeType("uint32_t")
    public int width() { return nwidth(address()); }
    /** the height of the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit. */
    @NativeType("uint32_t")
    public int height() { return nheight(address()); }
    /** the number of faces, which can be either 6 (for cubemaps) or 1. */
    @NativeType("uint32_t")
    public int faceCount() { return nfaceCount(address()); }
    /** the number of array layers in the image or 1 for a 2D image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit. */
    @NativeType("uint32_t")
    public int arraySize() { return narraySize(address()); }
    /** describes the number of levels of detail available for minified sampling of the image, <b>must</b> not be 0 or greater than the graphics API’s maximum limit. */
    @NativeType("uint32_t")
    public int mipCount() { return nmipCount(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSwapchainCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_SWAPCHAIN_CREATE_INFO TYPE_SWAPCHAIN_CREATE_INFO} value to the {@link #type} field. */
    public XrSwapchainCreateInfo type$Default() { return type(XR10.XR_TYPE_SWAPCHAIN_CREATE_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSwapchainCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} value to the {@code next} chain. */
    public XrSwapchainCreateInfo next(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSwapchainCreateInfoFoveationFB} value to the {@code next} chain. */
    public XrSwapchainCreateInfo next(XrSwapchainCreateInfoFoveationFB value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #createFlags} field. */
    public XrSwapchainCreateInfo createFlags(@NativeType("XrSwapchainCreateFlags") long value) { ncreateFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #usageFlags} field. */
    public XrSwapchainCreateInfo usageFlags(@NativeType("XrSwapchainUsageFlags") long value) { nusageFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public XrSwapchainCreateInfo format(@NativeType("int64_t") long value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #sampleCount} field. */
    public XrSwapchainCreateInfo sampleCount(@NativeType("uint32_t") int value) { nsampleCount(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public XrSwapchainCreateInfo width(@NativeType("uint32_t") int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public XrSwapchainCreateInfo height(@NativeType("uint32_t") int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #faceCount} field. */
    public XrSwapchainCreateInfo faceCount(@NativeType("uint32_t") int value) { nfaceCount(address(), value); return this; }
    /** Sets the specified value to the {@link #arraySize} field. */
    public XrSwapchainCreateInfo arraySize(@NativeType("uint32_t") int value) { narraySize(address(), value); return this; }
    /** Sets the specified value to the {@link #mipCount} field. */
    public XrSwapchainCreateInfo mipCount(@NativeType("uint32_t") int value) { nmipCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainCreateInfo set(
        int type,
        long next,
        long createFlags,
        long usageFlags,
        long format,
        int sampleCount,
        int width,
        int height,
        int faceCount,
        int arraySize,
        int mipCount
    ) {
        type(type);
        next(next);
        createFlags(createFlags);
        usageFlags(usageFlags);
        format(format);
        sampleCount(sampleCount);
        width(width);
        height(height);
        faceCount(faceCount);
        arraySize(arraySize);
        mipCount(mipCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainCreateInfo set(XrSwapchainCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainCreateInfo malloc() {
        return wrap(XrSwapchainCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSwapchainCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainCreateInfo calloc() {
        return wrap(XrSwapchainCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSwapchainCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSwapchainCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainCreateInfo} instance for the specified memory address. */
    public static XrSwapchainCreateInfo create(long address) {
        return wrap(XrSwapchainCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrSwapchainCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSwapchainCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSwapchainCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSwapchainCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainCreateInfo malloc(MemoryStack stack) {
        return wrap(XrSwapchainCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSwapchainCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainCreateInfo calloc(MemoryStack stack) {
        return wrap(XrSwapchainCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainCreateInfo.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrSwapchainCreateInfo.CREATEFLAGS); }
    /** Unsafe version of {@link #usageFlags}. */
    public static long nusageFlags(long struct) { return UNSAFE.getLong(null, struct + XrSwapchainCreateInfo.USAGEFLAGS); }
    /** Unsafe version of {@link #format}. */
    public static long nformat(long struct) { return UNSAFE.getLong(null, struct + XrSwapchainCreateInfo.FORMAT); }
    /** Unsafe version of {@link #sampleCount}. */
    public static int nsampleCount(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainCreateInfo.SAMPLECOUNT); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainCreateInfo.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainCreateInfo.HEIGHT); }
    /** Unsafe version of {@link #faceCount}. */
    public static int nfaceCount(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainCreateInfo.FACECOUNT); }
    /** Unsafe version of {@link #arraySize}. */
    public static int narraySize(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainCreateInfo.ARRAYSIZE); }
    /** Unsafe version of {@link #mipCount}. */
    public static int nmipCount(long struct) { return UNSAFE.getInt(null, struct + XrSwapchainCreateInfo.MIPCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSwapchainCreateInfo.CREATEFLAGS, value); }
    /** Unsafe version of {@link #usageFlags(long) usageFlags}. */
    public static void nusageFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrSwapchainCreateInfo.USAGEFLAGS, value); }
    /** Unsafe version of {@link #format(long) format}. */
    public static void nformat(long struct, long value) { UNSAFE.putLong(null, struct + XrSwapchainCreateInfo.FORMAT, value); }
    /** Unsafe version of {@link #sampleCount(int) sampleCount}. */
    public static void nsampleCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainCreateInfo.SAMPLECOUNT, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainCreateInfo.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainCreateInfo.HEIGHT, value); }
    /** Unsafe version of {@link #faceCount(int) faceCount}. */
    public static void nfaceCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainCreateInfo.FACECOUNT, value); }
    /** Unsafe version of {@link #arraySize(int) arraySize}. */
    public static void narraySize(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainCreateInfo.ARRAYSIZE, value); }
    /** Unsafe version of {@link #mipCount(int) mipCount}. */
    public static void nmipCount(long struct, int value) { UNSAFE.putInt(null, struct + XrSwapchainCreateInfo.MIPCOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrSwapchainCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainCreateInfo, Buffer> implements NativeResource {

        private static final XrSwapchainCreateInfo ELEMENT_FACTORY = XrSwapchainCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrSwapchainCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrSwapchainCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSwapchainCreateInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainCreateInfo.ntype(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrSwapchainCreateInfo.nnext(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#createFlags} field. */
        @NativeType("XrSwapchainCreateFlags")
        public long createFlags() { return XrSwapchainCreateInfo.ncreateFlags(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#usageFlags} field. */
        @NativeType("XrSwapchainUsageFlags")
        public long usageFlags() { return XrSwapchainCreateInfo.nusageFlags(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#format} field. */
        @NativeType("int64_t")
        public long format() { return XrSwapchainCreateInfo.nformat(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#sampleCount} field. */
        @NativeType("uint32_t")
        public int sampleCount() { return XrSwapchainCreateInfo.nsampleCount(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#width} field. */
        @NativeType("uint32_t")
        public int width() { return XrSwapchainCreateInfo.nwidth(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#height} field. */
        @NativeType("uint32_t")
        public int height() { return XrSwapchainCreateInfo.nheight(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#faceCount} field. */
        @NativeType("uint32_t")
        public int faceCount() { return XrSwapchainCreateInfo.nfaceCount(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#arraySize} field. */
        @NativeType("uint32_t")
        public int arraySize() { return XrSwapchainCreateInfo.narraySize(address()); }
        /** @return the value of the {@link XrSwapchainCreateInfo#mipCount} field. */
        @NativeType("uint32_t")
        public int mipCount() { return XrSwapchainCreateInfo.nmipCount(address()); }

        /** Sets the specified value to the {@link XrSwapchainCreateInfo#type} field. */
        public XrSwapchainCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_SWAPCHAIN_CREATE_INFO TYPE_SWAPCHAIN_CREATE_INFO} value to the {@link XrSwapchainCreateInfo#type} field. */
        public XrSwapchainCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_SWAPCHAIN_CREATE_INFO); }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#next} field. */
        public XrSwapchainCreateInfo.Buffer next(@NativeType("void const *") long value) { XrSwapchainCreateInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSecondaryViewConfigurationSwapchainCreateInfoMSFT} value to the {@code next} chain. */
        public XrSwapchainCreateInfo.Buffer next(XrSecondaryViewConfigurationSwapchainCreateInfoMSFT value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSwapchainCreateInfoFoveationFB} value to the {@code next} chain. */
        public XrSwapchainCreateInfo.Buffer next(XrSwapchainCreateInfoFoveationFB value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#createFlags} field. */
        public XrSwapchainCreateInfo.Buffer createFlags(@NativeType("XrSwapchainCreateFlags") long value) { XrSwapchainCreateInfo.ncreateFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#usageFlags} field. */
        public XrSwapchainCreateInfo.Buffer usageFlags(@NativeType("XrSwapchainUsageFlags") long value) { XrSwapchainCreateInfo.nusageFlags(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#format} field. */
        public XrSwapchainCreateInfo.Buffer format(@NativeType("int64_t") long value) { XrSwapchainCreateInfo.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#sampleCount} field. */
        public XrSwapchainCreateInfo.Buffer sampleCount(@NativeType("uint32_t") int value) { XrSwapchainCreateInfo.nsampleCount(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#width} field. */
        public XrSwapchainCreateInfo.Buffer width(@NativeType("uint32_t") int value) { XrSwapchainCreateInfo.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#height} field. */
        public XrSwapchainCreateInfo.Buffer height(@NativeType("uint32_t") int value) { XrSwapchainCreateInfo.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#faceCount} field. */
        public XrSwapchainCreateInfo.Buffer faceCount(@NativeType("uint32_t") int value) { XrSwapchainCreateInfo.nfaceCount(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#arraySize} field. */
        public XrSwapchainCreateInfo.Buffer arraySize(@NativeType("uint32_t") int value) { XrSwapchainCreateInfo.narraySize(address(), value); return this; }
        /** Sets the specified value to the {@link XrSwapchainCreateInfo#mipCount} field. */
        public XrSwapchainCreateInfo.Buffer mipCount(@NativeType("uint32_t") int value) { XrSwapchainCreateInfo.nmipCount(address(), value); return this; }

    }

}