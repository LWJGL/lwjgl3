/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import org.lwjgl.vulkan.*;

/**
 * <pre>{@code
 * struct XrSwapchainStateSamplerVulkanFB {
 *     XrStructureType type;
 *     void * next;
 *     VkFilter minFilter;
 *     VkFilter magFilter;
 *     VkSamplerMipmapMode mipmapMode;
 *     VkSamplerAddressMode wrapModeS;
 *     VkSamplerAddressMode wrapModeT;
 *     VkComponentSwizzle swizzleRed;
 *     VkComponentSwizzle swizzleGreen;
 *     VkComponentSwizzle swizzleBlue;
 *     VkComponentSwizzle swizzleAlpha;
 *     float maxAnisotropy;
 *     {@link XrColor4f XrColor4f} borderColor;
 * }}</pre>
 */
public class XrSwapchainStateSamplerVulkanFB extends Struct<XrSwapchainStateSamplerVulkanFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MINFILTER,
        MAGFILTER,
        MIPMAPMODE,
        WRAPMODES,
        WRAPMODET,
        SWIZZLERED,
        SWIZZLEGREEN,
        SWIZZLEBLUE,
        SWIZZLEALPHA,
        MAXANISOTROPY,
        BORDERCOLOR;

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
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(XrColor4f.SIZEOF, XrColor4f.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MINFILTER = layout.offsetof(2);
        MAGFILTER = layout.offsetof(3);
        MIPMAPMODE = layout.offsetof(4);
        WRAPMODES = layout.offsetof(5);
        WRAPMODET = layout.offsetof(6);
        SWIZZLERED = layout.offsetof(7);
        SWIZZLEGREEN = layout.offsetof(8);
        SWIZZLEBLUE = layout.offsetof(9);
        SWIZZLEALPHA = layout.offsetof(10);
        MAXANISOTROPY = layout.offsetof(11);
        BORDERCOLOR = layout.offsetof(12);
    }

    protected XrSwapchainStateSamplerVulkanFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSwapchainStateSamplerVulkanFB create(long address, @Nullable ByteBuffer container) {
        return new XrSwapchainStateSamplerVulkanFB(address, container);
    }

    /**
     * Creates a {@code XrSwapchainStateSamplerVulkanFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSwapchainStateSamplerVulkanFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code minFilter} field. */
    @NativeType("VkFilter")
    public int minFilter() { return nminFilter(address()); }
    /** @return the value of the {@code magFilter} field. */
    @NativeType("VkFilter")
    public int magFilter() { return nmagFilter(address()); }
    /** @return the value of the {@code mipmapMode} field. */
    @NativeType("VkSamplerMipmapMode")
    public int mipmapMode() { return nmipmapMode(address()); }
    /** @return the value of the {@code wrapModeS} field. */
    @NativeType("VkSamplerAddressMode")
    public int wrapModeS() { return nwrapModeS(address()); }
    /** @return the value of the {@code wrapModeT} field. */
    @NativeType("VkSamplerAddressMode")
    public int wrapModeT() { return nwrapModeT(address()); }
    /** @return the value of the {@code swizzleRed} field. */
    @NativeType("VkComponentSwizzle")
    public int swizzleRed() { return nswizzleRed(address()); }
    /** @return the value of the {@code swizzleGreen} field. */
    @NativeType("VkComponentSwizzle")
    public int swizzleGreen() { return nswizzleGreen(address()); }
    /** @return the value of the {@code swizzleBlue} field. */
    @NativeType("VkComponentSwizzle")
    public int swizzleBlue() { return nswizzleBlue(address()); }
    /** @return the value of the {@code swizzleAlpha} field. */
    @NativeType("VkComponentSwizzle")
    public int swizzleAlpha() { return nswizzleAlpha(address()); }
    /** @return the value of the {@code maxAnisotropy} field. */
    public float maxAnisotropy() { return nmaxAnisotropy(address()); }
    /** @return a {@link XrColor4f} view of the {@code borderColor} field. */
    public XrColor4f borderColor() { return nborderColor(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSwapchainStateSamplerVulkanFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBSwapchainUpdateStateVulkan#XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB} value to the {@code type} field. */
    public XrSwapchainStateSamplerVulkanFB type$Default() { return type(FBSwapchainUpdateStateVulkan.XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrSwapchainStateSamplerVulkanFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code minFilter} field. */
    public XrSwapchainStateSamplerVulkanFB minFilter(@NativeType("VkFilter") int value) { nminFilter(address(), value); return this; }
    /** Sets the specified value to the {@code magFilter} field. */
    public XrSwapchainStateSamplerVulkanFB magFilter(@NativeType("VkFilter") int value) { nmagFilter(address(), value); return this; }
    /** Sets the specified value to the {@code mipmapMode} field. */
    public XrSwapchainStateSamplerVulkanFB mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { nmipmapMode(address(), value); return this; }
    /** Sets the specified value to the {@code wrapModeS} field. */
    public XrSwapchainStateSamplerVulkanFB wrapModeS(@NativeType("VkSamplerAddressMode") int value) { nwrapModeS(address(), value); return this; }
    /** Sets the specified value to the {@code wrapModeT} field. */
    public XrSwapchainStateSamplerVulkanFB wrapModeT(@NativeType("VkSamplerAddressMode") int value) { nwrapModeT(address(), value); return this; }
    /** Sets the specified value to the {@code swizzleRed} field. */
    public XrSwapchainStateSamplerVulkanFB swizzleRed(@NativeType("VkComponentSwizzle") int value) { nswizzleRed(address(), value); return this; }
    /** Sets the specified value to the {@code swizzleGreen} field. */
    public XrSwapchainStateSamplerVulkanFB swizzleGreen(@NativeType("VkComponentSwizzle") int value) { nswizzleGreen(address(), value); return this; }
    /** Sets the specified value to the {@code swizzleBlue} field. */
    public XrSwapchainStateSamplerVulkanFB swizzleBlue(@NativeType("VkComponentSwizzle") int value) { nswizzleBlue(address(), value); return this; }
    /** Sets the specified value to the {@code swizzleAlpha} field. */
    public XrSwapchainStateSamplerVulkanFB swizzleAlpha(@NativeType("VkComponentSwizzle") int value) { nswizzleAlpha(address(), value); return this; }
    /** Sets the specified value to the {@code maxAnisotropy} field. */
    public XrSwapchainStateSamplerVulkanFB maxAnisotropy(float value) { nmaxAnisotropy(address(), value); return this; }
    /** Copies the specified {@link XrColor4f} to the {@code borderColor} field. */
    public XrSwapchainStateSamplerVulkanFB borderColor(XrColor4f value) { nborderColor(address(), value); return this; }
    /** Passes the {@code borderColor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSwapchainStateSamplerVulkanFB borderColor(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(borderColor()); return this; }

    /** Initializes this struct with the specified values. */
    public XrSwapchainStateSamplerVulkanFB set(
        int type,
        long next,
        int minFilter,
        int magFilter,
        int mipmapMode,
        int wrapModeS,
        int wrapModeT,
        int swizzleRed,
        int swizzleGreen,
        int swizzleBlue,
        int swizzleAlpha,
        float maxAnisotropy,
        XrColor4f borderColor
    ) {
        type(type);
        next(next);
        minFilter(minFilter);
        magFilter(magFilter);
        mipmapMode(mipmapMode);
        wrapModeS(wrapModeS);
        wrapModeT(wrapModeT);
        swizzleRed(swizzleRed);
        swizzleGreen(swizzleGreen);
        swizzleBlue(swizzleBlue);
        swizzleAlpha(swizzleAlpha);
        maxAnisotropy(maxAnisotropy);
        borderColor(borderColor);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSwapchainStateSamplerVulkanFB set(XrSwapchainStateSamplerVulkanFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSwapchainStateSamplerVulkanFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSwapchainStateSamplerVulkanFB malloc() {
        return new XrSwapchainStateSamplerVulkanFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainStateSamplerVulkanFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSwapchainStateSamplerVulkanFB calloc() {
        return new XrSwapchainStateSamplerVulkanFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSwapchainStateSamplerVulkanFB} instance allocated with {@link BufferUtils}. */
    public static XrSwapchainStateSamplerVulkanFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSwapchainStateSamplerVulkanFB(memAddress(container), container);
    }

    /** Returns a new {@code XrSwapchainStateSamplerVulkanFB} instance for the specified memory address. */
    public static XrSwapchainStateSamplerVulkanFB create(long address) {
        return new XrSwapchainStateSamplerVulkanFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSwapchainStateSamplerVulkanFB createSafe(long address) {
        return address == NULL ? null : new XrSwapchainStateSamplerVulkanFB(address, null);
    }

    /** Downcasts the specified {@code XrSwapchainStateBaseHeaderFB} instance to {@code XrSwapchainStateSamplerVulkanFB}. */
    public static XrSwapchainStateSamplerVulkanFB create(XrSwapchainStateBaseHeaderFB value) {
        return new XrSwapchainStateSamplerVulkanFB(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerVulkanFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerVulkanFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerVulkanFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerVulkanFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerVulkanFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerVulkanFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSwapchainStateSamplerVulkanFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerVulkanFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSwapchainStateSamplerVulkanFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrSwapchainStateBaseHeaderFB.Buffer} instance to {@code XrSwapchainStateSamplerVulkanFB.Buffer}. */
    public static XrSwapchainStateSamplerVulkanFB.Buffer create(XrSwapchainStateBaseHeaderFB.Buffer value) {
        return new XrSwapchainStateSamplerVulkanFB.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrSwapchainStateSamplerVulkanFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainStateSamplerVulkanFB malloc(MemoryStack stack) {
        return new XrSwapchainStateSamplerVulkanFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSwapchainStateSamplerVulkanFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSwapchainStateSamplerVulkanFB calloc(MemoryStack stack) {
        return new XrSwapchainStateSamplerVulkanFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerVulkanFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerVulkanFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSwapchainStateSamplerVulkanFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSwapchainStateSamplerVulkanFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSwapchainStateSamplerVulkanFB.NEXT); }
    /** Unsafe version of {@link #minFilter}. */
    public static int nminFilter(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.MINFILTER); }
    /** Unsafe version of {@link #magFilter}. */
    public static int nmagFilter(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.MAGFILTER); }
    /** Unsafe version of {@link #mipmapMode}. */
    public static int nmipmapMode(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.MIPMAPMODE); }
    /** Unsafe version of {@link #wrapModeS}. */
    public static int nwrapModeS(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.WRAPMODES); }
    /** Unsafe version of {@link #wrapModeT}. */
    public static int nwrapModeT(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.WRAPMODET); }
    /** Unsafe version of {@link #swizzleRed}. */
    public static int nswizzleRed(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLERED); }
    /** Unsafe version of {@link #swizzleGreen}. */
    public static int nswizzleGreen(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLEGREEN); }
    /** Unsafe version of {@link #swizzleBlue}. */
    public static int nswizzleBlue(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLEBLUE); }
    /** Unsafe version of {@link #swizzleAlpha}. */
    public static int nswizzleAlpha(long struct) { return memGetInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLEALPHA); }
    /** Unsafe version of {@link #maxAnisotropy}. */
    public static float nmaxAnisotropy(long struct) { return memGetFloat(struct + XrSwapchainStateSamplerVulkanFB.MAXANISOTROPY); }
    /** Unsafe version of {@link #borderColor}. */
    public static XrColor4f nborderColor(long struct) { return XrColor4f.create(struct + XrSwapchainStateSamplerVulkanFB.BORDERCOLOR); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSwapchainStateSamplerVulkanFB.NEXT, value); }
    /** Unsafe version of {@link #minFilter(int) minFilter}. */
    public static void nminFilter(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.MINFILTER, value); }
    /** Unsafe version of {@link #magFilter(int) magFilter}. */
    public static void nmagFilter(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.MAGFILTER, value); }
    /** Unsafe version of {@link #mipmapMode(int) mipmapMode}. */
    public static void nmipmapMode(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.MIPMAPMODE, value); }
    /** Unsafe version of {@link #wrapModeS(int) wrapModeS}. */
    public static void nwrapModeS(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.WRAPMODES, value); }
    /** Unsafe version of {@link #wrapModeT(int) wrapModeT}. */
    public static void nwrapModeT(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.WRAPMODET, value); }
    /** Unsafe version of {@link #swizzleRed(int) swizzleRed}. */
    public static void nswizzleRed(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLERED, value); }
    /** Unsafe version of {@link #swizzleGreen(int) swizzleGreen}. */
    public static void nswizzleGreen(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLEGREEN, value); }
    /** Unsafe version of {@link #swizzleBlue(int) swizzleBlue}. */
    public static void nswizzleBlue(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLEBLUE, value); }
    /** Unsafe version of {@link #swizzleAlpha(int) swizzleAlpha}. */
    public static void nswizzleAlpha(long struct, int value) { memPutInt(struct + XrSwapchainStateSamplerVulkanFB.SWIZZLEALPHA, value); }
    /** Unsafe version of {@link #maxAnisotropy(float) maxAnisotropy}. */
    public static void nmaxAnisotropy(long struct, float value) { memPutFloat(struct + XrSwapchainStateSamplerVulkanFB.MAXANISOTROPY, value); }
    /** Unsafe version of {@link #borderColor(XrColor4f) borderColor}. */
    public static void nborderColor(long struct, XrColor4f value) { memCopy(value.address(), struct + XrSwapchainStateSamplerVulkanFB.BORDERCOLOR, XrColor4f.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrSwapchainStateSamplerVulkanFB} structs. */
    public static class Buffer extends StructBuffer<XrSwapchainStateSamplerVulkanFB, Buffer> implements NativeResource {

        private static final XrSwapchainStateSamplerVulkanFB ELEMENT_FACTORY = XrSwapchainStateSamplerVulkanFB.create(-1L);

        /**
         * Creates a new {@code XrSwapchainStateSamplerVulkanFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSwapchainStateSamplerVulkanFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSwapchainStateSamplerVulkanFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSwapchainStateSamplerVulkanFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrSwapchainStateSamplerVulkanFB.nnext(address()); }
        /** @return the value of the {@code minFilter} field. */
        @NativeType("VkFilter")
        public int minFilter() { return XrSwapchainStateSamplerVulkanFB.nminFilter(address()); }
        /** @return the value of the {@code magFilter} field. */
        @NativeType("VkFilter")
        public int magFilter() { return XrSwapchainStateSamplerVulkanFB.nmagFilter(address()); }
        /** @return the value of the {@code mipmapMode} field. */
        @NativeType("VkSamplerMipmapMode")
        public int mipmapMode() { return XrSwapchainStateSamplerVulkanFB.nmipmapMode(address()); }
        /** @return the value of the {@code wrapModeS} field. */
        @NativeType("VkSamplerAddressMode")
        public int wrapModeS() { return XrSwapchainStateSamplerVulkanFB.nwrapModeS(address()); }
        /** @return the value of the {@code wrapModeT} field. */
        @NativeType("VkSamplerAddressMode")
        public int wrapModeT() { return XrSwapchainStateSamplerVulkanFB.nwrapModeT(address()); }
        /** @return the value of the {@code swizzleRed} field. */
        @NativeType("VkComponentSwizzle")
        public int swizzleRed() { return XrSwapchainStateSamplerVulkanFB.nswizzleRed(address()); }
        /** @return the value of the {@code swizzleGreen} field. */
        @NativeType("VkComponentSwizzle")
        public int swizzleGreen() { return XrSwapchainStateSamplerVulkanFB.nswizzleGreen(address()); }
        /** @return the value of the {@code swizzleBlue} field. */
        @NativeType("VkComponentSwizzle")
        public int swizzleBlue() { return XrSwapchainStateSamplerVulkanFB.nswizzleBlue(address()); }
        /** @return the value of the {@code swizzleAlpha} field. */
        @NativeType("VkComponentSwizzle")
        public int swizzleAlpha() { return XrSwapchainStateSamplerVulkanFB.nswizzleAlpha(address()); }
        /** @return the value of the {@code maxAnisotropy} field. */
        public float maxAnisotropy() { return XrSwapchainStateSamplerVulkanFB.nmaxAnisotropy(address()); }
        /** @return a {@link XrColor4f} view of the {@code borderColor} field. */
        public XrColor4f borderColor() { return XrSwapchainStateSamplerVulkanFB.nborderColor(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer type(@NativeType("XrStructureType") int value) { XrSwapchainStateSamplerVulkanFB.ntype(address(), value); return this; }
        /** Sets the {@link FBSwapchainUpdateStateVulkan#XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB} value to the {@code type} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer type$Default() { return type(FBSwapchainUpdateStateVulkan.XR_TYPE_SWAPCHAIN_STATE_SAMPLER_VULKAN_FB); }
        /** Sets the specified value to the {@code next} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer next(@NativeType("void *") long value) { XrSwapchainStateSamplerVulkanFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code minFilter} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer minFilter(@NativeType("VkFilter") int value) { XrSwapchainStateSamplerVulkanFB.nminFilter(address(), value); return this; }
        /** Sets the specified value to the {@code magFilter} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer magFilter(@NativeType("VkFilter") int value) { XrSwapchainStateSamplerVulkanFB.nmagFilter(address(), value); return this; }
        /** Sets the specified value to the {@code mipmapMode} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer mipmapMode(@NativeType("VkSamplerMipmapMode") int value) { XrSwapchainStateSamplerVulkanFB.nmipmapMode(address(), value); return this; }
        /** Sets the specified value to the {@code wrapModeS} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer wrapModeS(@NativeType("VkSamplerAddressMode") int value) { XrSwapchainStateSamplerVulkanFB.nwrapModeS(address(), value); return this; }
        /** Sets the specified value to the {@code wrapModeT} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer wrapModeT(@NativeType("VkSamplerAddressMode") int value) { XrSwapchainStateSamplerVulkanFB.nwrapModeT(address(), value); return this; }
        /** Sets the specified value to the {@code swizzleRed} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer swizzleRed(@NativeType("VkComponentSwizzle") int value) { XrSwapchainStateSamplerVulkanFB.nswizzleRed(address(), value); return this; }
        /** Sets the specified value to the {@code swizzleGreen} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer swizzleGreen(@NativeType("VkComponentSwizzle") int value) { XrSwapchainStateSamplerVulkanFB.nswizzleGreen(address(), value); return this; }
        /** Sets the specified value to the {@code swizzleBlue} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer swizzleBlue(@NativeType("VkComponentSwizzle") int value) { XrSwapchainStateSamplerVulkanFB.nswizzleBlue(address(), value); return this; }
        /** Sets the specified value to the {@code swizzleAlpha} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer swizzleAlpha(@NativeType("VkComponentSwizzle") int value) { XrSwapchainStateSamplerVulkanFB.nswizzleAlpha(address(), value); return this; }
        /** Sets the specified value to the {@code maxAnisotropy} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer maxAnisotropy(float value) { XrSwapchainStateSamplerVulkanFB.nmaxAnisotropy(address(), value); return this; }
        /** Copies the specified {@link XrColor4f} to the {@code borderColor} field. */
        public XrSwapchainStateSamplerVulkanFB.Buffer borderColor(XrColor4f value) { XrSwapchainStateSamplerVulkanFB.nborderColor(address(), value); return this; }
        /** Passes the {@code borderColor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSwapchainStateSamplerVulkanFB.Buffer borderColor(java.util.function.Consumer<XrColor4f> consumer) { consumer.accept(borderColor()); return this; }

    }

}