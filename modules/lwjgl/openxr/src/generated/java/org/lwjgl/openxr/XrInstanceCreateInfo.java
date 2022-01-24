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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying params of a newly created instance.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrDebugUtilsMessengerCreateInfoEXT}</li>
 * <li>{@code createFlags} <b>must</b> be 0</li>
 * <li>{@code applicationInfo} <b>must</b> be a valid {@link XrApplicationInfo} structure</li>
 * <li>If {@code enabledApiLayerCount} is not 0, {@code enabledApiLayerNames} <b>must</b> be a pointer to an array of {@code enabledApiLayerCount} null-terminated UTF-8 strings</li>
 * <li>If {@code enabledExtensionCount} is not 0, {@code enabledExtensionNames} <b>must</b> be a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrApplicationInfo}, {@link XR10#xrCreateInstance CreateInstance}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrInstanceCreateInfo {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrInstanceCreateFlags {@link #createFlags};
 *     {@link XrApplicationInfo XrApplicationInfo} {@link #applicationInfo};
 *     uint32_t {@link #enabledApiLayerCount};
 *     char const * const * {@link #enabledApiLayerNames};
 *     uint32_t {@link #enabledExtensionCount};
 *     char const * const * {@link #enabledExtensionNames};
 * }</code></pre>
 */
public class XrInstanceCreateInfo extends Struct implements NativeResource {

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

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** a bitmask of {@code XrInstanceCreateFlags} that identifies options that apply to the creation. */
    @NativeType("XrInstanceCreateFlags")
    public long createFlags() { return ncreateFlags(address()); }
    /** an instance of {@link XrApplicationInfo}. This information helps runtimes recognize behavior inherent to classes of applications. {@link XrApplicationInfo} is defined in detail below. */
    public XrApplicationInfo applicationInfo() { return napplicationInfo(address()); }
    /** the number of global API layers to enable. */
    @NativeType("uint32_t")
    public int enabledApiLayerCount() { return nenabledApiLayerCount(address()); }
    /** a pointer to an array of {@code enabledApiLayerCount} strings containing the names of API layers to enable for the created instance. See the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#api-layers-and-extensions">API Layers And Extensions</a> section for further details. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer enabledApiLayerNames() { return nenabledApiLayerNames(address()); }
    /** the number of global extensions to enable. */
    @NativeType("uint32_t")
    public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
    /** a pointer to an array of {@code enabledExtensionCount} strings containing the names of extensions to enable. */
    @Nullable
    @NativeType("char const * const *")
    public PointerBuffer enabledExtensionNames() { return nenabledExtensionNames(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrInstanceCreateInfo type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO} value to the {@link #type} field. */
    public XrInstanceCreateInfo type$Default() { return type(XR10.XR_TYPE_INSTANCE_CREATE_INFO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrInstanceCreateInfo next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrDebugUtilsMessengerCreateInfoEXT} value to the {@code next} chain. */
    public XrInstanceCreateInfo next(XrDebugUtilsMessengerCreateInfoEXT value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #createFlags} field. */
    public XrInstanceCreateInfo createFlags(@NativeType("XrInstanceCreateFlags") long value) { ncreateFlags(address(), value); return this; }
    /** Copies the specified {@link XrApplicationInfo} to the {@link #applicationInfo} field. */
    public XrInstanceCreateInfo applicationInfo(XrApplicationInfo value) { napplicationInfo(address(), value); return this; }
    /** Passes the {@link #applicationInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrInstanceCreateInfo applicationInfo(java.util.function.Consumer<XrApplicationInfo> consumer) { consumer.accept(applicationInfo()); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #enabledApiLayerNames} field. */
    public XrInstanceCreateInfo enabledApiLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { nenabledApiLayerNames(address(), value); return this; }
    /** Sets the address of the specified {@link PointerBuffer} to the {@link #enabledExtensionNames} field. */
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
        return wrap(XrInstanceCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrInstanceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInstanceCreateInfo calloc() {
        return wrap(XrInstanceCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrInstanceCreateInfo} instance allocated with {@link BufferUtils}. */
    public static XrInstanceCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrInstanceCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code XrInstanceCreateInfo} instance for the specified memory address. */
    public static XrInstanceCreateInfo create(long address) {
        return wrap(XrInstanceCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(XrInstanceCreateInfo.class, address);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrInstanceCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrInstanceCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfo malloc(MemoryStack stack) {
        return wrap(XrInstanceCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrInstanceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceCreateInfo calloc(MemoryStack stack) {
        return wrap(XrInstanceCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrInstanceCreateInfo.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInstanceCreateInfo.NEXT); }
    /** Unsafe version of {@link #createFlags}. */
    public static long ncreateFlags(long struct) { return UNSAFE.getLong(null, struct + XrInstanceCreateInfo.CREATEFLAGS); }
    /** Unsafe version of {@link #applicationInfo}. */
    public static XrApplicationInfo napplicationInfo(long struct) { return XrApplicationInfo.create(struct + XrInstanceCreateInfo.APPLICATIONINFO); }
    /** Unsafe version of {@link #enabledApiLayerCount}. */
    public static int nenabledApiLayerCount(long struct) { return UNSAFE.getInt(null, struct + XrInstanceCreateInfo.ENABLEDAPILAYERCOUNT); }
    /** Unsafe version of {@link #enabledApiLayerNames() enabledApiLayerNames}. */
    @Nullable public static PointerBuffer nenabledApiLayerNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrInstanceCreateInfo.ENABLEDAPILAYERNAMES), nenabledApiLayerCount(struct)); }
    /** Unsafe version of {@link #enabledExtensionCount}. */
    public static int nenabledExtensionCount(long struct) { return UNSAFE.getInt(null, struct + XrInstanceCreateInfo.ENABLEDEXTENSIONCOUNT); }
    /** Unsafe version of {@link #enabledExtensionNames() enabledExtensionNames}. */
    @Nullable public static PointerBuffer nenabledExtensionNames(long struct) { return memPointerBufferSafe(memGetAddress(struct + XrInstanceCreateInfo.ENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrInstanceCreateInfo.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInstanceCreateInfo.NEXT, value); }
    /** Unsafe version of {@link #createFlags(long) createFlags}. */
    public static void ncreateFlags(long struct, long value) { UNSAFE.putLong(null, struct + XrInstanceCreateInfo.CREATEFLAGS, value); }
    /** Unsafe version of {@link #applicationInfo(XrApplicationInfo) applicationInfo}. */
    public static void napplicationInfo(long struct, XrApplicationInfo value) { memCopy(value.address(), struct + XrInstanceCreateInfo.APPLICATIONINFO, XrApplicationInfo.SIZEOF); }
    /** Sets the specified value to the {@code enabledApiLayerCount} field of the specified {@code struct}. */
    public static void nenabledApiLayerCount(long struct, int value) { UNSAFE.putInt(null, struct + XrInstanceCreateInfo.ENABLEDAPILAYERCOUNT, value); }
    /** Unsafe version of {@link #enabledApiLayerNames(PointerBuffer) enabledApiLayerNames}. */
    public static void nenabledApiLayerNames(long struct, @Nullable PointerBuffer value) { memPutAddress(struct + XrInstanceCreateInfo.ENABLEDAPILAYERNAMES, memAddressSafe(value)); nenabledApiLayerCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code enabledExtensionCount} field of the specified {@code struct}. */
    public static void nenabledExtensionCount(long struct, int value) { UNSAFE.putInt(null, struct + XrInstanceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInstanceCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected XrInstanceCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrInstanceCreateInfo#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInstanceCreateInfo.ntype(address()); }
        /** @return the value of the {@link XrInstanceCreateInfo#next} field. */
        @NativeType("void const *")
        public long next() { return XrInstanceCreateInfo.nnext(address()); }
        /** @return the value of the {@link XrInstanceCreateInfo#createFlags} field. */
        @NativeType("XrInstanceCreateFlags")
        public long createFlags() { return XrInstanceCreateInfo.ncreateFlags(address()); }
        /** @return a {@link XrApplicationInfo} view of the {@link XrInstanceCreateInfo#applicationInfo} field. */
        public XrApplicationInfo applicationInfo() { return XrInstanceCreateInfo.napplicationInfo(address()); }
        /** @return the value of the {@link XrInstanceCreateInfo#enabledApiLayerCount} field. */
        @NativeType("uint32_t")
        public int enabledApiLayerCount() { return XrInstanceCreateInfo.nenabledApiLayerCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link XrInstanceCreateInfo#enabledApiLayerNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer enabledApiLayerNames() { return XrInstanceCreateInfo.nenabledApiLayerNames(address()); }
        /** @return the value of the {@link XrInstanceCreateInfo#enabledExtensionCount} field. */
        @NativeType("uint32_t")
        public int enabledExtensionCount() { return XrInstanceCreateInfo.nenabledExtensionCount(address()); }
        /** @return a {@link PointerBuffer} view of the data pointed to by the {@link XrInstanceCreateInfo#enabledExtensionNames} field. */
        @Nullable
        @NativeType("char const * const *")
        public PointerBuffer enabledExtensionNames() { return XrInstanceCreateInfo.nenabledExtensionNames(address()); }

        /** Sets the specified value to the {@link XrInstanceCreateInfo#type} field. */
        public XrInstanceCreateInfo.Buffer type(@NativeType("XrStructureType") int value) { XrInstanceCreateInfo.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_INSTANCE_CREATE_INFO TYPE_INSTANCE_CREATE_INFO} value to the {@link XrInstanceCreateInfo#type} field. */
        public XrInstanceCreateInfo.Buffer type$Default() { return type(XR10.XR_TYPE_INSTANCE_CREATE_INFO); }
        /** Sets the specified value to the {@link XrInstanceCreateInfo#next} field. */
        public XrInstanceCreateInfo.Buffer next(@NativeType("void const *") long value) { XrInstanceCreateInfo.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrDebugUtilsMessengerCreateInfoEXT} value to the {@code next} chain. */
        public XrInstanceCreateInfo.Buffer next(XrDebugUtilsMessengerCreateInfoEXT value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrInstanceCreateInfo#createFlags} field. */
        public XrInstanceCreateInfo.Buffer createFlags(@NativeType("XrInstanceCreateFlags") long value) { XrInstanceCreateInfo.ncreateFlags(address(), value); return this; }
        /** Copies the specified {@link XrApplicationInfo} to the {@link XrInstanceCreateInfo#applicationInfo} field. */
        public XrInstanceCreateInfo.Buffer applicationInfo(XrApplicationInfo value) { XrInstanceCreateInfo.napplicationInfo(address(), value); return this; }
        /** Passes the {@link XrInstanceCreateInfo#applicationInfo} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrInstanceCreateInfo.Buffer applicationInfo(java.util.function.Consumer<XrApplicationInfo> consumer) { consumer.accept(applicationInfo()); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link XrInstanceCreateInfo#enabledApiLayerNames} field. */
        public XrInstanceCreateInfo.Buffer enabledApiLayerNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { XrInstanceCreateInfo.nenabledApiLayerNames(address(), value); return this; }
        /** Sets the address of the specified {@link PointerBuffer} to the {@link XrInstanceCreateInfo#enabledExtensionNames} field. */
        public XrInstanceCreateInfo.Buffer enabledExtensionNames(@Nullable @NativeType("char const * const *") PointerBuffer value) { XrInstanceCreateInfo.nenabledExtensionNames(address(), value); return this; }

    }

}