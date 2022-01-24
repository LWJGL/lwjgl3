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

import static org.lwjgl.openxr.XR10.*;

/**
 * Returns properties of available instance extensions.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_EXTENSION_PROPERTIES TYPE_EXTENSION_PROPERTIES}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExtensionProperties {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     char {@link #extensionName}[XR_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t {@link #extensionVersion};
 * }</code></pre>
 */
public class XrExtensionProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        EXTENSIONNAME,
        EXTENSIONVERSION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(1, XR_MAX_EXTENSION_NAME_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        EXTENSIONNAME = layout.offsetof(2);
        EXTENSIONVERSION = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrExtensionProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrExtensionProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** a {@code NULL} terminated string specifying the name of the extension. */
    @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer extensionName() { return nextensionName(address()); }
    /** a {@code NULL} terminated string specifying the name of the extension. */
    @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
    public String extensionNameString() { return nextensionNameString(address()); }
    /** the version of this extension. It is an integer, incremented with backward compatible changes. */
    @NativeType("uint32_t")
    public int extensionVersion() { return nextensionVersion(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrExtensionProperties type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EXTENSION_PROPERTIES TYPE_EXTENSION_PROPERTIES} value to the {@link #type} field. */
    public XrExtensionProperties type$Default() { return type(XR10.XR_TYPE_EXTENSION_PROPERTIES); }
    /** Sets the specified value to the {@link #next} field. */
    public XrExtensionProperties next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrExtensionProperties set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrExtensionProperties set(XrExtensionProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrExtensionProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrExtensionProperties malloc() {
        return wrap(XrExtensionProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrExtensionProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrExtensionProperties calloc() {
        return wrap(XrExtensionProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrExtensionProperties} instance allocated with {@link BufferUtils}. */
    public static XrExtensionProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrExtensionProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code XrExtensionProperties} instance for the specified memory address. */
    public static XrExtensionProperties create(long address) {
        return wrap(XrExtensionProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtensionProperties createSafe(long address) {
        return address == NULL ? null : wrap(XrExtensionProperties.class, address);
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrExtensionProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrExtensionProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrExtensionProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtensionProperties malloc(MemoryStack stack) {
        return wrap(XrExtensionProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrExtensionProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtensionProperties calloc(MemoryStack stack) {
        return wrap(XrExtensionProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrExtensionProperties.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrExtensionProperties.NEXT); }
    /** Unsafe version of {@link #extensionName}. */
    public static ByteBuffer nextensionName(long struct) { return memByteBuffer(struct + XrExtensionProperties.EXTENSIONNAME, XR_MAX_EXTENSION_NAME_SIZE); }
    /** Unsafe version of {@link #extensionNameString}. */
    public static String nextensionNameString(long struct) { return memUTF8(struct + XrExtensionProperties.EXTENSIONNAME); }
    /** Unsafe version of {@link #extensionVersion}. */
    public static int nextensionVersion(long struct) { return UNSAFE.getInt(null, struct + XrExtensionProperties.EXTENSIONVERSION); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrExtensionProperties.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrExtensionProperties.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrExtensionProperties} structs. */
    public static class Buffer extends StructBuffer<XrExtensionProperties, Buffer> implements NativeResource {

        private static final XrExtensionProperties ELEMENT_FACTORY = XrExtensionProperties.create(-1L);

        /**
         * Creates a new {@code XrExtensionProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrExtensionProperties#SIZEOF}, and its mark will be undefined.
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
        protected XrExtensionProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrExtensionProperties#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrExtensionProperties.ntype(address()); }
        /** @return the value of the {@link XrExtensionProperties#next} field. */
        @NativeType("void *")
        public long next() { return XrExtensionProperties.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrExtensionProperties#extensionName} field. */
        @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer extensionName() { return XrExtensionProperties.nextensionName(address()); }
        /** @return the null-terminated string stored in the {@link XrExtensionProperties#extensionName} field. */
        @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
        public String extensionNameString() { return XrExtensionProperties.nextensionNameString(address()); }
        /** @return the value of the {@link XrExtensionProperties#extensionVersion} field. */
        @NativeType("uint32_t")
        public int extensionVersion() { return XrExtensionProperties.nextensionVersion(address()); }

        /** Sets the specified value to the {@link XrExtensionProperties#type} field. */
        public XrExtensionProperties.Buffer type(@NativeType("XrStructureType") int value) { XrExtensionProperties.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EXTENSION_PROPERTIES TYPE_EXTENSION_PROPERTIES} value to the {@link XrExtensionProperties#type} field. */
        public XrExtensionProperties.Buffer type$Default() { return type(XR10.XR_TYPE_EXTENSION_PROPERTIES); }
        /** Sets the specified value to the {@link XrExtensionProperties#next} field. */
        public XrExtensionProperties.Buffer next(@NativeType("void *") long value) { XrExtensionProperties.nnext(address(), value); return this; }

    }

}