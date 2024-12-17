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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrInstanceCreateInfo {
 *     XrStructureType type;
 *     void const * next;
 *     XrInstanceCreateFlags createFlags;
 *     {@link XrApplicationInfo XrApplicationInfo} applicationInfo;
 *     uint32_t enabledApiLayerCount;
 *     char const * const * enabledApiLayerNames;
 *     uint32_t enabledExtensionCount;
 *     char const * const * enabledExtensionNames;
 * }}</pre>
 */
public class XrInstanceCreateInfo extends Struct<XrInstanceCreateInfo> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        CREATEFLAGS,
        APPLICATIONINFO,
        ENABLEDAPILAYERCOUNT,
        ENABLEDAPILAYERNAMES,
        ENABLEDEXTENSIONCOUNT,
        ENABLEDEXTENSIONNAMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrApplicationInfo.SIZEOF, XrApplicationInfo.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        CREATEFLAGS = layout.offsetof(2);
        APPLICATIONINFO = layout.offsetof(3);
        ENABLEDAPILAYERCOUNT = layout.offsetof(4);
        ENABLEDAPILAYERNAMES = layout.offsetof(5);
        ENABLEDEXTENSIONCOUNT = layout.offsetof(6);
        ENABLEDEXTENSIONNAMES = layout.offsetof(7);
    }

    protected XrInstanceCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrInstanceCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new XrInstanceCreateInfo(address, container);
    }

    /**
     * Creates a {@code XrInstanceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInstanceCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code createFlags} field. */
    @NativeType("XrInstanceCreateFlags")
    public long createFlags() { return ncreateFlags(address()); }
    /** @return a {@link XrApplicationInfo} view of the {@code applicationInfo} field. */
    public XrApplicationInfo applicationInfo() { return napplicationInfo(address()); }
    /** @return the value of the {@code enabledApiLayerCount} field. */
    @NativeType("uint32_t")
    public int enabledApiLayerCount() { return nenabledApiLayerCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code enabledApiLayerNames} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer enabledApiLayerNames() { return nenabledApiLayerNames(address()); }
    /** @return the value of the {@code enabledExtensionCount} field. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** @return a {@link PointerBuffer} view of the data pointed to by the {@code enabledExtensionNames} field. */
    @NativeType("char const * const *")
    public @Nullable PointerBuffer enabledExtensionNames() { return nenabledExtensionNames(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrInstanceCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO} value to the {@code type} field. */
    public XrInstanceCreateInfo type$Default() { return type(XR10.XR_TYPE_INSTANCE_CREATE_INFO); }
    /** Sets the specified value to the {@code next} field. */
    public XrInstanceCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrDebugUtilsMessengerCreateInfoEXT} value to the {@code next} chain. */
    public XrInstanceCreateInfo next(XrDebugUtilsMessengerCreateInfoEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code createFlags} field. */
    public XrInstanceCreateInfo createFlags(@NativeType("XrInstanceCreateFlags") long value) { ncreateFlags(address(), value); return this; }
    /** Copies the specified {@link XrApplicationInfo} to the {@code applicationInfo} field. */
    public XrInstanceCreateInfo applicationInfo(XrApplicationInfo value) { napplicationInfo(address(), value); return this; }
    /** Passes the {@code applicationInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrInstanceCreateInfo applicationInfo(java.util.function.Consumer<XrApplicationInfo> consumer) { consumer.accept(applicationInfo()); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code enabledApiLayerNames} field. */
    public XrInstanceCreateInfo enabledApiLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nenabledApiLayerNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@code enabledExtensionNames} field. */
    public XrInstanceCreateInfo enabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nenabledExtensionNames(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInstanceCreateInfo set(
        int type,
        long next,
        long createFlags,
        XrApplicationInfo applicationInfo,
        @Nullable PointerBuffer enabledApiLayerNames,
        @Nullable PointerBuffer enabledExtensionNames
    ) {
        type(type);
        next(next);
        createFlags(createFlags);
        applicationInfo(applicationInfo);
        enabledApiLayerNames(enabledApiLayerNames);
        enabledExtensionNames(enabledExtensionNames);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrInstanceCreateInfo set(XrInstanceCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInstanceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInstanceCreateInfo malloc() {
        return new XrInstanceCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrInstanceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInstanceCreateInfo calloc() {
        return new XrInstanceCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrInstanceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrInstanceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrInstanceCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code XrInstanceCreateInfo} instance for the specified memory address. */
    public static XrInstanceCreateInfo create(long address) {
        return new XrInstanceCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrInstanceCreateInfo createSafe(long address) {
        return address == NULL ? null : new XrInstanceCreateInfo(address, null);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrInstanceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrInstanceCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrInstanceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfo malloc(MemoryStack stack) {
        return new XrInstanceCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrInstanceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfo calloc(MemoryStack stack) {
        return new XrInstanceCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrInstanceCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInstanceCreateInfo.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return memGetLong(struct + XrInstanceCreateInfo.CREATEFLAGS); }
    /** Unsafe version of {@link #applicationInfo}. */
    public static XrApplicationInfo napplicationInfo(long struct) { return XrApplicationInfo.create(struct + XrInstanceCreateInfo.APPLICATIONINFO); }
    /** Unsafe version of {@link #enabledApiLayerCount}. */
    public static int nenabledApiLayerCount(long struct) { return memGetInt(struct + XrInstanceCreateInfo.ENABLEDAPILAYERCOUNT); }
    /** Unsafe version of {@link #enabledApiLayerNames() enabledApiLayerNames}. */
    public static @Nullable PointerBuffer nenabledApiLayerNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrInstanceCreateInfo.ENABLEDAPILAYERNAMES), nenabledApiLayerCount(struct)); }
    /** Unsafe version of {@link #enabledExtensionCount}. */
    public static int nenabledExtensionCount(long struct) { return memGetInt(struct + XrInstanceCreateInfo.ENABLEDEXTENSIONCOUNT); }
    /** Unsafe version of {@link #enabledExtensionNames() enabledExtensionNames}. */
    public static @Nullable PointerBuffer nenabledExtensionNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrInstanceCreateInfo.ENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrInstanceCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { memPutLong(struct + XrInstanceCreateInfo.CREATEFLAGS, value); }
    /** Unsafe version of {@link #applicationInfo(XrApplicationInfo) applicationInfo}. */
    public static void napplicationInfo(long struct, XrApplicationInfo value) { memCopy(value.address(), struct + XrInstanceCreateInfo.APPLICATIONINFO, XrApplicationInfo.SIZEOF); }
    /** Sets the specified value to the {@code enabledApiLayerCount} field of the specified {@code struct}. */
    public static void nenabledApiLayerCount(long struct, int value) { memPutInt(struct + XrInstanceCreateInfo.ENABLEDAPILAYERCOUNT, value); }
    /** Unsafe version of {@link #enabledApiLayerNames(PointerBuffer) enabledApiLayerNames}. */
    public static void nenabledApiLayerNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrInstanceCreateInfo.ENABLEDAPILAYERNAMES, memAddressSafe(value)); nenabledApiLayerCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code enabledExtensionCount} field of the specified {@code struct}. */
    public static void nenabledExtensionCount(long struct, int value) { memPutInt(struct + XrInstanceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
    /** Unsafe version of {@link #enabledExtensionNames(PointerBuffer) enabledExtensionNames}. */
    public static void nenabledExtensionNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrInstanceCreateInfo.ENABLEDEXTENSIONNAMES, memAddressSafe(value)); nenabledExtensionCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nenabledApiLayerCount(struct) != 0) {
            check(memGetAddress(struct + XrInstanceCreateInfo.ENABLEDAPILAYERNAMES));
        }
        if (nenabledExtensionCount(struct) != 0) {
            check(memGetAddress(struct + XrInstanceCreateInfo.ENABLEDEXTENSIONNAMES));
        }
    }

    // -----------------------------------

    /** An array of {@link XrInstanceCreateInfo} structs. */
    public static class Buffer extends StructBuffer<XrInstanceCreateInfo, Buffer> implements NativeResource {

        private static final XrInstanceCreateInfo ELEMENT_FACTORY = XrInstanceCreateInfo.create(-1L);

        /**
         * Creates a new {@code XrInstanceCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInstanceCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrInstanceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInstanceCreateInfo.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrInstanceCreateInfo.nnext(address()); }
        /** @return the value of the {@code createFlags} field. */
        @NativeType("XrInstanceCreateFlags")
        public long createFlags() { return XrInstanceCreateInfo.ncreateFlags(address()); }
        /** @return a {@link XrApplicationInfo} view of the {@code applicationInfo} field. */
        public XrApplicationInfo applicationInfo() { return XrInstanceCreateInfo.napplicationInfo(address()); }
        /** @return the value of the {@code enabledApiLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledApiLayerCount() { return XrInstanceCreateInfo.nenabledApiLayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code enabledApiLayerNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer enabledApiLayerNames() { return XrInstanceCreateInfo.nenabledApiLayerNames(address()); }
        /** @return the value of the {@code enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return XrInstanceCreateInfo.nenabledExtensionCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@code enabledExtensionNames} field. */
        @NativeType("char const * const *")
        public @Nullable PointerBuffer enabledExtensionNames() { return XrInstanceCreateInfo.nenabledExtensionNames(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrInstanceCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrInstanceCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO} value to the {@code type} field. */
        public XrInstanceCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_INSTANCE_CREATE_INFO); }
        /** Sets the specified value to the {@code next} field. */
        public XrInstanceCreateInfo.Buffer next(@NativeType("void const *") long value) { XrInstanceCreateInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrDebugUtilsMessengerCreateInfoEXT} value to the {@code next} chain. */
        public XrInstanceCreateInfo.Buffer next(XrDebugUtilsMessengerCreateInfoEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code createFlags} field. */
        public XrInstanceCreateInfo.Buffer createFlags(@NativeType("XrInstanceCreateFlags") long value) { XrInstanceCreateInfo.ncreateFlags(address(), value); return this; }
        /** Copies the specified {@link XrApplicationInfo} to the {@code applicationInfo} field. */
        public XrInstanceCreateInfo.Buffer applicationInfo(XrApplicationInfo value) { XrInstanceCreateInfo.napplicationInfo(address(), value); return this; }
        /** Passes the {@code applicationInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrInstanceCreateInfo.Buffer applicationInfo(java.util.function.Consumer<XrApplicationInfo> consumer) { consumer.accept(applicationInfo()); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code enabledApiLayerNames} field. */
        public XrInstanceCreateInfo.Buffer enabledApiLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { XrInstanceCreateInfo.nenabledApiLayerNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@code enabledExtensionNames} field. */
        public XrInstanceCreateInfo.Buffer enabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { XrInstanceCreateInfo.nenabledExtensionNames(address(), value); return this; }

    }

}