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
 * Contains information about the instance.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_INSTANCE_PROPERTIES TYPE_INSTANCE_PROPERTIES}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrGetInstanceProperties GetInstanceProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrInstanceProperties {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrVersion {@link #runtimeVersion};
 *     char {@link #runtimeName}[XR_MAX_RUNTIME_NAME_SIZE];
 * }</code></pre>
 */
public class XrInstanceProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RUNTIMEVERSION,
        RUNTIMENAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __array(1, XR_MAX_RUNTIME_NAME_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RUNTIMEVERSION = layout.offsetof(2);
        RUNTIMENAME = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrInstanceProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrInstanceProperties(ByteBuffer container) {
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
    /** the runtime’s version (not necessarily related to an OpenXR API version), expressed in the format of {@link XR10#XR_MAKE_VERSION}. */
    @NativeType("XrVersion")
    public long runtimeVersion() { return nruntimeVersion(address()); }
    /** the name of the runtime. */
    @NativeType("char[XR_MAX_RUNTIME_NAME_SIZE]")
    public ByteBuffer runtimeName() { return nruntimeName(address()); }
    /** the name of the runtime. */
    @NativeType("char[XR_MAX_RUNTIME_NAME_SIZE]")
    public String runtimeNameString() { return nruntimeNameString(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrInstanceProperties type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_INSTANCE_PROPERTIES TYPE_INSTANCE_PROPERTIES} value to the {@link #type} field. */
    public XrInstanceProperties type$Default() { return type(XR10.XR_TYPE_INSTANCE_PROPERTIES); }
    /** Sets the specified value to the {@link #next} field. */
    public XrInstanceProperties next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrInstanceProperties set(
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
    public XrInstanceProperties set(XrInstanceProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrInstanceProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrInstanceProperties malloc() {
        return wrap(XrInstanceProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrInstanceProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrInstanceProperties calloc() {
        return wrap(XrInstanceProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrInstanceProperties} instance allocated with {@link BufferUtils}. */
    public static XrInstanceProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrInstanceProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code XrInstanceProperties} instance for the specified memory address. */
    public static XrInstanceProperties create(long address) {
        return wrap(XrInstanceProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceProperties createSafe(long address) {
        return address == NULL ? null : wrap(XrInstanceProperties.class, address);
    }

    /**
     * Returns a new {@link XrInstanceProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrInstanceProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrInstanceProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrInstanceProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrInstanceProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrInstanceProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrInstanceProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceProperties malloc(MemoryStack stack) {
        return wrap(XrInstanceProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrInstanceProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrInstanceProperties calloc(MemoryStack stack) {
        return wrap(XrInstanceProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrInstanceProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrInstanceProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrInstanceProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrInstanceProperties.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrInstanceProperties.NEXT); }
    /** Unsafe version of {@link #runtimeVersion}. */
    public static long nruntimeVersion(long struct) { return UNSAFE.getLong(null, struct + XrInstanceProperties.RUNTIMEVERSION); }
    /** Unsafe version of {@link #runtimeName}. */
    public static ByteBuffer nruntimeName(long struct) { return memByteBuffer(struct + XrInstanceProperties.RUNTIMENAME, XR_MAX_RUNTIME_NAME_SIZE); }
    /** Unsafe version of {@link #runtimeNameString}. */
    public static String nruntimeNameString(long struct) { return memUTF8(struct + XrInstanceProperties.RUNTIMENAME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrInstanceProperties.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrInstanceProperties.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrInstanceProperties} structs. */
    public static class Buffer extends StructBuffer<XrInstanceProperties, Buffer> implements NativeResource {

        private static final XrInstanceProperties ELEMENT_FACTORY = XrInstanceProperties.create(-1L);

        /**
         * Creates a new {@code XrInstanceProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrInstanceProperties#SIZEOF}, and its mark will be undefined.
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
        protected XrInstanceProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrInstanceProperties#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrInstanceProperties.ntype(address()); }
        /** @return the value of the {@link XrInstanceProperties#next} field. */
        @NativeType("void *")
        public long next() { return XrInstanceProperties.nnext(address()); }
        /** @return the value of the {@link XrInstanceProperties#runtimeVersion} field. */
        @NativeType("XrVersion")
        public long runtimeVersion() { return XrInstanceProperties.nruntimeVersion(address()); }
        /** @return a {@link ByteBuffer} view of the {@link XrInstanceProperties#runtimeName} field. */
        @NativeType("char[XR_MAX_RUNTIME_NAME_SIZE]")
        public ByteBuffer runtimeName() { return XrInstanceProperties.nruntimeName(address()); }
        /** @return the null-terminated string stored in the {@link XrInstanceProperties#runtimeName} field. */
        @NativeType("char[XR_MAX_RUNTIME_NAME_SIZE]")
        public String runtimeNameString() { return XrInstanceProperties.nruntimeNameString(address()); }

        /** Sets the specified value to the {@link XrInstanceProperties#type} field. */
        public XrInstanceProperties.Buffer type(@NativeType("XrStructureType") int value) { XrInstanceProperties.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_INSTANCE_PROPERTIES TYPE_INSTANCE_PROPERTIES} value to the {@link XrInstanceProperties#type} field. */
        public XrInstanceProperties.Buffer type$Default() { return type(XR10.XR_TYPE_INSTANCE_PROPERTIES); }
        /** Sets the specified value to the {@link XrInstanceProperties#next} field. */
        public XrInstanceProperties.Buffer next(@NativeType("void *") long value) { XrInstanceProperties.nnext(address(), value); return this; }

    }

}