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

/**
 * <pre>{@code
 * struct XrGraphicsRequirementsVulkanKHR {
 *     XrStructureType type;
 *     void * next;
 *     XrVersion minApiVersionSupported;
 *     XrVersion maxApiVersionSupported;
 * }}</pre>
 */
public class XrGraphicsRequirementsVulkanKHR extends Struct<XrGraphicsRequirementsVulkanKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MINAPIVERSIONSUPPORTED,
        MAXAPIVERSIONSUPPORTED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MINAPIVERSIONSUPPORTED = layout.offsetof(2);
        MAXAPIVERSIONSUPPORTED = layout.offsetof(3);
    }

    protected XrGraphicsRequirementsVulkanKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGraphicsRequirementsVulkanKHR create(long address, @Nullable ByteBuffer container) {
        return new XrGraphicsRequirementsVulkanKHR(address, container);
    }

    /**
     * Creates a {@code XrGraphicsRequirementsVulkanKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGraphicsRequirementsVulkanKHR(ByteBuffer container) {
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
    /** @return the value of the {@code minApiVersionSupported} field. */
    @NativeType("XrVersion")
    public long minApiVersionSupported() { return nminApiVersionSupported(address()); }
    /** @return the value of the {@code maxApiVersionSupported} field. */
    @NativeType("XrVersion")
    public long maxApiVersionSupported() { return nmaxApiVersionSupported(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGraphicsRequirementsVulkanKHR type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link KHRVulkanEnable#XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR} value to the {@code type} field. */
    public XrGraphicsRequirementsVulkanKHR type$Default() { return type(KHRVulkanEnable.XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR); }
    /** Sets the specified value to the {@code next} field. */
    public XrGraphicsRequirementsVulkanKHR next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code minApiVersionSupported} field. */
    public XrGraphicsRequirementsVulkanKHR minApiVersionSupported(@NativeType("XrVersion") long value) { nminApiVersionSupported(address(), value); return this; }
    /** Sets the specified value to the {@code maxApiVersionSupported} field. */
    public XrGraphicsRequirementsVulkanKHR maxApiVersionSupported(@NativeType("XrVersion") long value) { nmaxApiVersionSupported(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGraphicsRequirementsVulkanKHR set(
        int type,
        long next,
        long minApiVersionSupported,
        long maxApiVersionSupported
    ) {
        type(type);
        next(next);
        minApiVersionSupported(minApiVersionSupported);
        maxApiVersionSupported(maxApiVersionSupported);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGraphicsRequirementsVulkanKHR set(XrGraphicsRequirementsVulkanKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGraphicsRequirementsVulkanKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGraphicsRequirementsVulkanKHR malloc() {
        return new XrGraphicsRequirementsVulkanKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsRequirementsVulkanKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGraphicsRequirementsVulkanKHR calloc() {
        return new XrGraphicsRequirementsVulkanKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGraphicsRequirementsVulkanKHR} instance allocated with {@link BufferUtils}. */
    public static XrGraphicsRequirementsVulkanKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGraphicsRequirementsVulkanKHR(memAddress(container), container);
    }

    /** Returns a new {@code XrGraphicsRequirementsVulkanKHR} instance for the specified memory address. */
    public static XrGraphicsRequirementsVulkanKHR create(long address) {
        return new XrGraphicsRequirementsVulkanKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGraphicsRequirementsVulkanKHR createSafe(long address) {
        return address == NULL ? null : new XrGraphicsRequirementsVulkanKHR(address, null);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsVulkanKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsVulkanKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsVulkanKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsVulkanKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsVulkanKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsVulkanKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGraphicsRequirementsVulkanKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsVulkanKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGraphicsRequirementsVulkanKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrGraphicsRequirementsVulkanKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsRequirementsVulkanKHR malloc(MemoryStack stack) {
        return new XrGraphicsRequirementsVulkanKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGraphicsRequirementsVulkanKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGraphicsRequirementsVulkanKHR calloc(MemoryStack stack) {
        return new XrGraphicsRequirementsVulkanKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsVulkanKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsVulkanKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGraphicsRequirementsVulkanKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGraphicsRequirementsVulkanKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGraphicsRequirementsVulkanKHR.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGraphicsRequirementsVulkanKHR.NEXT); }
    /** Unsafe version of {@link #minApiVersionSupported}. */
    public static long nminApiVersionSupported(long struct) { return memGetLong(struct + XrGraphicsRequirementsVulkanKHR.MINAPIVERSIONSUPPORTED); }
    /** Unsafe version of {@link #maxApiVersionSupported}. */
    public static long nmaxApiVersionSupported(long struct) { return memGetLong(struct + XrGraphicsRequirementsVulkanKHR.MAXAPIVERSIONSUPPORTED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGraphicsRequirementsVulkanKHR.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGraphicsRequirementsVulkanKHR.NEXT, value); }
    /** Unsafe version of {@link #minApiVersionSupported(long) minApiVersionSupported}. */
    public static void nminApiVersionSupported(long struct, long value) { memPutLong(struct + XrGraphicsRequirementsVulkanKHR.MINAPIVERSIONSUPPORTED, value); }
    /** Unsafe version of {@link #maxApiVersionSupported(long) maxApiVersionSupported}. */
    public static void nmaxApiVersionSupported(long struct, long value) { memPutLong(struct + XrGraphicsRequirementsVulkanKHR.MAXAPIVERSIONSUPPORTED, value); }

    // -----------------------------------

    /** An array of {@link XrGraphicsRequirementsVulkanKHR} structs. */
    public static class Buffer extends StructBuffer<XrGraphicsRequirementsVulkanKHR, Buffer> implements NativeResource {

        private static final XrGraphicsRequirementsVulkanKHR ELEMENT_FACTORY = XrGraphicsRequirementsVulkanKHR.create(-1L);

        /**
         * Creates a new {@code XrGraphicsRequirementsVulkanKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGraphicsRequirementsVulkanKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGraphicsRequirementsVulkanKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGraphicsRequirementsVulkanKHR.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrGraphicsRequirementsVulkanKHR.nnext(address()); }
        /** @return the value of the {@code minApiVersionSupported} field. */
        @NativeType("XrVersion")
        public long minApiVersionSupported() { return XrGraphicsRequirementsVulkanKHR.nminApiVersionSupported(address()); }
        /** @return the value of the {@code maxApiVersionSupported} field. */
        @NativeType("XrVersion")
        public long maxApiVersionSupported() { return XrGraphicsRequirementsVulkanKHR.nmaxApiVersionSupported(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGraphicsRequirementsVulkanKHR.Buffer type(@NativeType("XrStructureType") int value) { XrGraphicsRequirementsVulkanKHR.ntype(address(), value); return this; }
        /** Sets the {@link KHRVulkanEnable#XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR} value to the {@code type} field. */
        public XrGraphicsRequirementsVulkanKHR.Buffer type$Default() { return type(KHRVulkanEnable.XR_TYPE_GRAPHICS_REQUIREMENTS_VULKAN_KHR); }
        /** Sets the specified value to the {@code next} field. */
        public XrGraphicsRequirementsVulkanKHR.Buffer next(@NativeType("void *") long value) { XrGraphicsRequirementsVulkanKHR.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code minApiVersionSupported} field. */
        public XrGraphicsRequirementsVulkanKHR.Buffer minApiVersionSupported(@NativeType("XrVersion") long value) { XrGraphicsRequirementsVulkanKHR.nminApiVersionSupported(address(), value); return this; }
        /** Sets the specified value to the {@code maxApiVersionSupported} field. */
        public XrGraphicsRequirementsVulkanKHR.Buffer maxApiVersionSupported(@NativeType("XrVersion") long value) { XrGraphicsRequirementsVulkanKHR.nmaxApiVersionSupported(address(), value); return this; }

    }

}