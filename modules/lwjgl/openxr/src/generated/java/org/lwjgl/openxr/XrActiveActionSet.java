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
 * Describes an active action set.
 * 
 * <h5>Description</h5>
 * 
 * <p>This structure defines a single active action set and subaction path combination. Applications <b>can</b> provide a list of these structures to the {@link XR10#xrSyncActions SyncActions} function.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrActionsSyncInfo}, {@link XR10#xrSyncActions SyncActions}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActiveActionSet {
 *     XrActionSet {@link #actionSet};
 *     XrPath {@link #subactionPath};
 * }</code></pre>
 */
public class XrActiveActionSet extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACTIONSET,
        SUBACTIONPATH;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACTIONSET = layout.offsetof(0);
        SUBACTIONPATH = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrActiveActionSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActiveActionSet(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the handle of the action set to activate. */
    @NativeType("XrActionSet")
    public long actionSet() { return nactionSet(address()); }
    /** a subaction path that was declared when one or more actions in the action set was created or {@link XR10#XR_NULL_PATH NULL_PATH}. If the application wants to activate the action set on more than one subaction path, it <b>can</b> include additional {@link XrActiveActionSet} structs with the other {@code subactionPath} values. Using {@link XR10#XR_NULL_PATH NULL_PATH} as the value for {@code subactionPath}, acts as a wildcard for all subaction paths on the actions in the action set. If the subaction path was not specified on any of the actions in the actionSet when that action was created, the runtime <b>must</b> return {@link XR10#XR_ERROR_PATH_UNSUPPORTED ERROR_PATH_UNSUPPORTED}. */
    @NativeType("XrPath")
    public long subactionPath() { return nsubactionPath(address()); }

    /** Sets the specified value to the {@link #actionSet} field. */
    public XrActiveActionSet actionSet(XrActionSet value) { nactionSet(address(), value); return this; }
    /** Sets the specified value to the {@link #subactionPath} field. */
    public XrActiveActionSet subactionPath(@NativeType("XrPath") long value) { nsubactionPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActiveActionSet set(
        XrActionSet actionSet,
        long subactionPath
    ) {
        actionSet(actionSet);
        subactionPath(subactionPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActiveActionSet set(XrActiveActionSet src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActiveActionSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActiveActionSet malloc() {
        return wrap(XrActiveActionSet.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrActiveActionSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActiveActionSet calloc() {
        return wrap(XrActiveActionSet.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrActiveActionSet} instance allocated with {@link BufferUtils}. */
    public static XrActiveActionSet create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrActiveActionSet.class, memAddress(container), container);
    }

    /** Returns a new {@code XrActiveActionSet} instance for the specified memory address. */
    public static XrActiveActionSet create(long address) {
        return wrap(XrActiveActionSet.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActiveActionSet createSafe(long address) {
        return address == NULL ? null : wrap(XrActiveActionSet.class, address);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrActiveActionSet.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActiveActionSet.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrActiveActionSet} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSet malloc(MemoryStack stack) {
        return wrap(XrActiveActionSet.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrActiveActionSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSet calloc(MemoryStack stack) {
        return wrap(XrActiveActionSet.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSet.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #actionSet}. */
    public static long nactionSet(long struct) { return memGetAddress(struct + XrActiveActionSet.ACTIONSET); }
    /** Unsafe version of {@link #subactionPath}. */
    public static long nsubactionPath(long struct) { return UNSAFE.getLong(null, struct + XrActiveActionSet.SUBACTIONPATH); }

    /** Unsafe version of {@link #actionSet(XrActionSet) actionSet}. */
    public static void nactionSet(long struct, XrActionSet value) { memPutAddress(struct + XrActiveActionSet.ACTIONSET, value.address()); }
    /** Unsafe version of {@link #subactionPath(long) subactionPath}. */
    public static void nsubactionPath(long struct, long value) { UNSAFE.putLong(null, struct + XrActiveActionSet.SUBACTIONPATH, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrActiveActionSet.ACTIONSET));
    }

    // -----------------------------------

    /** An array of {@link XrActiveActionSet} structs. */
    public static class Buffer extends StructBuffer<XrActiveActionSet, Buffer> implements NativeResource {

        private static final XrActiveActionSet ELEMENT_FACTORY = XrActiveActionSet.create(-1L);

        /**
         * Creates a new {@code XrActiveActionSet.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActiveActionSet#SIZEOF}, and its mark will be undefined.
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
        protected XrActiveActionSet getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActiveActionSet#actionSet} field. */
        @NativeType("XrActionSet")
        public long actionSet() { return XrActiveActionSet.nactionSet(address()); }
        /** @return the value of the {@link XrActiveActionSet#subactionPath} field. */
        @NativeType("XrPath")
        public long subactionPath() { return XrActiveActionSet.nsubactionPath(address()); }

        /** Sets the specified value to the {@link XrActiveActionSet#actionSet} field. */
        public XrActiveActionSet.Buffer actionSet(XrActionSet value) { XrActiveActionSet.nactionSet(address(), value); return this; }
        /** Sets the specified value to the {@link XrActiveActionSet#subactionPath} field. */
        public XrActiveActionSet.Buffer subactionPath(@NativeType("XrPath") long value) { XrActiveActionSet.nsubactionPath(address(), value); return this; }

    }

}