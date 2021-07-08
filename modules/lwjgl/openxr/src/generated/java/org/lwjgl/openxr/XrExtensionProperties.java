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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrExtensionProperties {
 *     XrStructureType type;
 *     void * next;
 *     char extensionName[XR_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t extensionVersion;
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

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return a {@link ByteBuffer} view of the {@code extensionName} field. */
    @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
    public ByteBuffer extensionName() { return nextensionName(address()); }
    /** @return the null-terminated string stored in the {@code extensionName} field. */
    @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
    public String extensionNameString() { return nextensionNameString(address()); }
    /** @return the value of the {@code extensionVersion} field. */
    @NativeType("uint32_t")
    public int extensionVersion() { return nextensionVersion(address()); }

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

    // -----------------------------------

    /** Returns a new {@code XrExtensionProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static XrExtensionProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XrExtensionProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XrExtensionProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XrExtensionProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtensionProperties mallocStack(MemoryStack stack) {
        return wrap(XrExtensionProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrExtensionProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrExtensionProperties callocStack(MemoryStack stack) {
        return wrap(XrExtensionProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrExtensionProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrExtensionProperties.Buffer callocStack(int capacity, MemoryStack stack) {
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

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrExtensionProperties.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrExtensionProperties.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the {@code extensionName} field. */
        @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
        public ByteBuffer extensionName() { return XrExtensionProperties.nextensionName(address()); }
        /** @return the null-terminated string stored in the {@code extensionName} field. */
        @NativeType("char[XR_MAX_EXTENSION_NAME_SIZE]")
        public String extensionNameString() { return XrExtensionProperties.nextensionNameString(address()); }
        /** @return the value of the {@code extensionVersion} field. */
        @NativeType("uint32_t")
        public int extensionVersion() { return XrExtensionProperties.nextensionVersion(address()); }

    }

}