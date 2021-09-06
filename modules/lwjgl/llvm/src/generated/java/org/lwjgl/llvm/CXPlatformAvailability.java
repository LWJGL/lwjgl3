/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import javax.annotation.*;

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
public class CXPlatformAvailability extends Struct implements NativeResource {

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
        return wrap(CXPlatformAvailability.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CXPlatformAvailability} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CXPlatformAvailability calloc() {
        return wrap(CXPlatformAvailability.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CXPlatformAvailability} instance allocated with {@link BufferUtils}. */
    public static CXPlatformAvailability create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CXPlatformAvailability.class, memAddress(container), container);
    }

    /** Returns a new {@code CXPlatformAvailability} instance for the specified memory address. */
    public static CXPlatformAvailability create(long address) {
        return wrap(CXPlatformAvailability.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXPlatformAvailability createSafe(long address) {
        return address == NULL ? null : wrap(CXPlatformAvailability.class, address);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CXPlatformAvailability.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CXPlatformAvailability.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(CXPlatformAvailability.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CXPlatformAvailability} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CXPlatformAvailability calloc(MemoryStack stack) {
        return wrap(CXPlatformAvailability.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CXPlatformAvailability.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CXPlatformAvailability.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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
    public static int nUnavailable(long struct) { return UNSAFE.getInt(null, struct + CXPlatformAvailability.UNAVAILABLE); }
    /** Unsafe version of {@link #Message}. */
    public static CXString nMessage(long struct) { return CXString.create(struct + CXPlatformAvailability.MESSAGE); }

    // -----------------------------------

    /** An array of {@link CXPlatformAvailability} structs. */
    public static class Buffer extends StructBuffer<CXPlatformAvailability, Buffer> implements NativeResource {

        private static final CXPlatformAvailability ELEMENT_FACTORY = CXPlatformAvailability.create(-1L);

        /**
         * Creates a new {@code CXPlatformAvailability.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CXPlatformAvailability#SIZEOF}, and its mark will be undefined.
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