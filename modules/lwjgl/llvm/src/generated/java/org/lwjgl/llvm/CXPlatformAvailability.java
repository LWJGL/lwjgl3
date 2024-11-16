/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the availability of a given entity on a particular platform, e.g., a particular class might only be available on Mac OS 10.7 or newer.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CXPlatformAvailability {
 *     {@link CXString CXString} {@link #Platform};
 *     {@link CXVersion CXVersion} {@link #Introduced};
 *     {@link CXVersion CXVersion} {@link #Deprecated};
 *     {@link CXVersion CXVersion} {@link #Obsoleted};
 *     int {@link #Unavailable};
 *     {@link CXString CXString} {@link #Message};
 * }</code></pre>
 */
public class CXPlatformAvailability extends Struct<CXPlatformAvailability> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PLATFORM,
        INTRODUCED,
        DEPRECATED,
        OBSOLETED,
        UNAVAILABLE,
        MESSAGE;

    static {
        Layout layout = __struct(
            __member(CXString.SIZEOF, CXString.ALIGNOF),
            __member(CXVersion.SIZEOF, CXVersion.ALIGNOF),
            __member(CXVersion.SIZEOF, CXVersion.ALIGNOF),
            __member(CXVersion.SIZEOF, CXVersion.ALIGNOF),
            __member(4),
            __member(CXString.SIZEOF, CXString.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PLATFORM = layout.offsetof(0);
        INTRODUCED = layout.offsetof(1);
        DEPRECATED = layout.offsetof(2);
        OBSOLETED = layout.offsetof(3);
        UNAVAILABLE = layout.offsetof(4);
        MESSAGE = layout.offsetof(5);
    }

    protected CXPlatformAvailability(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CXPlatformAvailability create(long address, @Nullable ByteBuffer container) {
        return new CXPlatformAvailability(address, container);
    }

    /**
     * Creates a {@code CXPlatformAvailability} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CXPlatformAvailability(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * a string that describes the platform for which this structure provides availability information.
     * 
     * <p>Possible values are "ios" or "macos".</p>
     */
    public CXString Platform() { return nPlatform(address()); }
    /** the version number in which this entity was introduced */
    public CXVersion Introduced() { return nIntroduced(address()); }
    /** the version number in which this entity was deprecated (but is still available) */
    public CXVersion Deprecated() { return nDeprecated(address()); }
    /** the version number in which this entity was obsoleted, and therefore is no longer available */
    public CXVersion Obsoleted() { return nObsoleted(address()); }
    /** whether the entity is unconditionally unavailable on this platform */
    public int Unavailable() { return nUnavailable(address()); }
    /** an optional message to provide to a user of this API, e.g., to suggest replacement APIs */
    public CXString Message() { return nMessage(address()); }

    // -----------------------------------

    /** Returns a new {@code CXPlatformAvailability} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CXPlatformAvailability malloc() {
        return new CXPlatformAvailability(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CXPlatformAvailability} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXPlatformAvailability calloc() {
        return new CXPlatformAvailability(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CXPlatformAvailability} instance allocated with {@link BufferUtils}. */
    public static CXPlatformAvailability create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CXPlatformAvailability(memAddress(container), container);
    }

    /** Returns a new {@code CXPlatformAvailability} instance for the specified memory address. */
    public static CXPlatformAvailability create(long address) {
        return new CXPlatformAvailability(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CXPlatformAvailability createSafe(long address) {
        return address == NULL ? null : new CXPlatformAvailability(address, null);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CXPlatformAvailability.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CXPlatformAvailability.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static CXPlatformAvailability.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code CXPlatformAvailability} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CXPlatformAvailability malloc(MemoryStack stack) {
        return new CXPlatformAvailability(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CXPlatformAvailability} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXPlatformAvailability calloc(MemoryStack stack) {
        return new CXPlatformAvailability(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Platform}. */
    public static CXString nPlatform(long struct) { return CXString.create(struct + CXPlatformAvailability.PLATFORM); }
    /** Unsafe version of {@link #Introduced}. */
    public static CXVersion nIntroduced(long struct) { return CXVersion.create(struct + CXPlatformAvailability.INTRODUCED); }
    /** Unsafe version of {@link #Deprecated}. */
    public static CXVersion nDeprecated(long struct) { return CXVersion.create(struct + CXPlatformAvailability.DEPRECATED); }
    /** Unsafe version of {@link #Obsoleted}. */
    public static CXVersion nObsoleted(long struct) { return CXVersion.create(struct + CXPlatformAvailability.OBSOLETED); }
    /** Unsafe version of {@link #Unavailable}. */
    public static int nUnavailable(long struct) { return memGetInt(struct + CXPlatformAvailability.UNAVAILABLE); }
    /** Unsafe version of {@link #Message}. */
    public static CXString nMessage(long struct) { return CXString.create(struct + CXPlatformAvailability.MESSAGE); }

    // -----------------------------------

    /** An array of {@link CXPlatformAvailability} structs. */
    public static class Buffer extends StructBuffer<CXPlatformAvailability, Buffer> implements NativeResource {

        private static final CXPlatformAvailability ELEMENT_FACTORY = CXPlatformAvailability.create(-1L);

        /**
         * Creates a new {@code CXPlatformAvailability.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXPlatformAvailability#SIZEOF}, and its mark will be undefined.</p>
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
        protected CXPlatformAvailability getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link CXString} view of the {@link CXPlatformAvailability#Platform} field. */
        public CXString Platform() { return CXPlatformAvailability.nPlatform(address()); }
        /** @return a {@link CXVersion} view of the {@link CXPlatformAvailability#Introduced} field. */
        public CXVersion Introduced() { return CXPlatformAvailability.nIntroduced(address()); }
        /** @return a {@link CXVersion} view of the {@link CXPlatformAvailability#Deprecated} field. */
        public CXVersion Deprecated() { return CXPlatformAvailability.nDeprecated(address()); }
        /** @return a {@link CXVersion} view of the {@link CXPlatformAvailability#Obsoleted} field. */
        public CXVersion Obsoleted() { return CXPlatformAvailability.nObsoleted(address()); }
        /** @return the value of the {@link CXPlatformAvailability#Unavailable} field. */
        public int Unavailable() { return CXPlatformAvailability.nUnavailable(address()); }
        /** @return a {@link CXString} view of the {@link CXPlatformAvailability#Message} field. */
        public CXString Message() { return CXPlatformAvailability.nMessage(address()); }

    }

}