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
 * Returns the system capability whether it supports user presence.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>can</b> use the {@link XrSystemUserPresencePropertiesEXT} event in {@link XR10#xrGetSystemProperties GetSystemProperties} to detect if the given system supports the sensing of user presence.</p>
 * 
 * <p>If the system does not support user presence sensing, the runtime <b>must</b> return {@link XR10#XR_FALSE FALSE} for {@code supportsUserPresence} and <b>must</b> not queue the {@link XrEventDataUserPresenceChangedEXT} event for any session on this system.</p>
 * 
 * <p>In this case, an application typically assumes that the user is always present, as the runtime is unable to detect changes in user presence.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTUserPresence XR_EXT_user_presence} extension <b>must</b> be enabled prior to using {@link XrSystemUserPresencePropertiesEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTUserPresence#XR_TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemUserPresencePropertiesEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsUserPresence};
 * }</code></pre>
 */
public class XrSystemUserPresencePropertiesEXT extends Struct<XrSystemUserPresencePropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSUSERPRESENCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        SUPPORTSUSERPRESENCE = layout.offsetof(2);
    }

    protected XrSystemUserPresencePropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemUserPresencePropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSystemUserPresencePropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrSystemUserPresencePropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemUserPresencePropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an {@code XrBool32} value that indicates whether the system supports user presence sensing. */
    @NativeType("XrBool32")
    public boolean supportsUserPresence() { return nsupportsUserPresence(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemUserPresencePropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTUserPresence#XR_TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT} value to the {@link #type} field. */
    public XrSystemUserPresencePropertiesEXT type$Default() { return type(EXTUserPresence.XR_TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemUserPresencePropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemUserPresencePropertiesEXT set(
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
    public XrSystemUserPresencePropertiesEXT set(XrSystemUserPresencePropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemUserPresencePropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemUserPresencePropertiesEXT malloc() {
        return new XrSystemUserPresencePropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemUserPresencePropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemUserPresencePropertiesEXT calloc() {
        return new XrSystemUserPresencePropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemUserPresencePropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrSystemUserPresencePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemUserPresencePropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemUserPresencePropertiesEXT} instance for the specified memory address. */
    public static XrSystemUserPresencePropertiesEXT create(long address) {
        return new XrSystemUserPresencePropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemUserPresencePropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrSystemUserPresencePropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrSystemUserPresencePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemUserPresencePropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemUserPresencePropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemUserPresencePropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemUserPresencePropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemUserPresencePropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemUserPresencePropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemUserPresencePropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemUserPresencePropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemUserPresencePropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemUserPresencePropertiesEXT malloc(MemoryStack stack) {
        return new XrSystemUserPresencePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemUserPresencePropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemUserPresencePropertiesEXT calloc(MemoryStack stack) {
        return new XrSystemUserPresencePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemUserPresencePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemUserPresencePropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemUserPresencePropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemUserPresencePropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemUserPresencePropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemUserPresencePropertiesEXT.NEXT); }
    /** Unsafe version of {@link #supportsUserPresence}. */
    public static int nsupportsUserPresence(long struct) { return UNSAFE.getInt(null, struct + XrSystemUserPresencePropertiesEXT.SUPPORTSUSERPRESENCE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemUserPresencePropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemUserPresencePropertiesEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemUserPresencePropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrSystemUserPresencePropertiesEXT, Buffer> implements NativeResource {

        private static final XrSystemUserPresencePropertiesEXT ELEMENT_FACTORY = XrSystemUserPresencePropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrSystemUserPresencePropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemUserPresencePropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemUserPresencePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemUserPresencePropertiesEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemUserPresencePropertiesEXT.ntype(address()); }
        /** @return the value of the {@link XrSystemUserPresencePropertiesEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemUserPresencePropertiesEXT.nnext(address()); }
        /** @return the value of the {@link XrSystemUserPresencePropertiesEXT#supportsUserPresence} field. */
        @NativeType("XrBool32")
        public boolean supportsUserPresence() { return XrSystemUserPresencePropertiesEXT.nsupportsUserPresence(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemUserPresencePropertiesEXT#type} field. */
        public XrSystemUserPresencePropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemUserPresencePropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTUserPresence#XR_TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT} value to the {@link XrSystemUserPresencePropertiesEXT#type} field. */
        public XrSystemUserPresencePropertiesEXT.Buffer type$Default() { return type(EXTUserPresence.XR_TYPE_SYSTEM_USER_PRESENCE_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link XrSystemUserPresencePropertiesEXT#next} field. */
        public XrSystemUserPresencePropertiesEXT.Buffer next(@NativeType("void *") long value) { XrSystemUserPresencePropertiesEXT.nnext(address(), value); return this; }

    }

}