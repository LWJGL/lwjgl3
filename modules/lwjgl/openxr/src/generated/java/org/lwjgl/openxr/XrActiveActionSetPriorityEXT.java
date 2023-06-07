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
 * Action set priority mapping.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTActiveActionSetPriority XR_EXT_active_action_set_priority} extension <b>must</b> be enabled prior to using {@link XrActiveActionSetPriorityEXT}</li>
 * <li>{@code actionSet} <b>must</b> be a valid {@code XrActionSet} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrActionsSyncInfo}, {@link XrActiveActionSetPrioritiesEXT}, {@link XR10#xrSyncActions SyncActions}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrActiveActionSetPriorityEXT {
 *     XrActionSet {@link #actionSet};
 *     uint32_t {@link #priorityOverride};
 * }</code></pre>
 */
public class XrActiveActionSetPriorityEXT extends Struct<XrActiveActionSetPriorityEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACTIONSET,
        PRIORITYOVERRIDE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACTIONSET = layout.offsetof(0);
        PRIORITYOVERRIDE = layout.offsetof(1);
    }

    protected XrActiveActionSetPriorityEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrActiveActionSetPriorityEXT create(long address, @Nullable ByteBuffer container) {
        return new XrActiveActionSetPriorityEXT(address, container);
    }

    /**
     * Creates a {@code XrActiveActionSetPriorityEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrActiveActionSetPriorityEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the handle of the {@code XrActionSet} to set the priority number for. */
    @NativeType("XrActionSet")
    public long actionSet() { return nactionSet(address()); }
    /** an integer specifying the priority of the action set while it is active. */
    @NativeType("uint32_t")
    public int priorityOverride() { return npriorityOverride(address()); }

    /** Sets the specified value to the {@link #actionSet} field. */
    public XrActiveActionSetPriorityEXT actionSet(XrActionSet value) { nactionSet(address(), value); return this; }
    /** Sets the specified value to the {@link #priorityOverride} field. */
    public XrActiveActionSetPriorityEXT priorityOverride(@NativeType("uint32_t") int value) { npriorityOverride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrActiveActionSetPriorityEXT set(
        XrActionSet actionSet,
        int priorityOverride
    ) {
        actionSet(actionSet);
        priorityOverride(priorityOverride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrActiveActionSetPriorityEXT set(XrActiveActionSetPriorityEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrActiveActionSetPriorityEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrActiveActionSetPriorityEXT malloc() {
        return new XrActiveActionSetPriorityEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSetPriorityEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrActiveActionSetPriorityEXT calloc() {
        return new XrActiveActionSetPriorityEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrActiveActionSetPriorityEXT} instance allocated with {@link BufferUtils}. */
    public static XrActiveActionSetPriorityEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrActiveActionSetPriorityEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrActiveActionSetPriorityEXT} instance for the specified memory address. */
    public static XrActiveActionSetPriorityEXT create(long address) {
        return new XrActiveActionSetPriorityEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActiveActionSetPriorityEXT createSafe(long address) {
        return address == NULL ? null : new XrActiveActionSetPriorityEXT(address, null);
    }

    /**
     * Returns a new {@link XrActiveActionSetPriorityEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPriorityEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPriorityEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPriorityEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPriorityEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPriorityEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrActiveActionSetPriorityEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPriorityEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrActiveActionSetPriorityEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrActiveActionSetPriorityEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSetPriorityEXT malloc(MemoryStack stack) {
        return new XrActiveActionSetPriorityEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrActiveActionSetPriorityEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrActiveActionSetPriorityEXT calloc(MemoryStack stack) {
        return new XrActiveActionSetPriorityEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrActiveActionSetPriorityEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPriorityEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrActiveActionSetPriorityEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrActiveActionSetPriorityEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #actionSet}. */
    public static long nactionSet(long struct) { return memGetAddress(struct + XrActiveActionSetPriorityEXT.ACTIONSET); }
    /** Unsafe version of {@link #priorityOverride}. */
    public static int npriorityOverride(long struct) { return UNSAFE.getInt(null, struct + XrActiveActionSetPriorityEXT.PRIORITYOVERRIDE); }

    /** Unsafe version of {@link #actionSet(XrActionSet) actionSet}. */
    public static void nactionSet(long struct, XrActionSet value) { memPutAddress(struct + XrActiveActionSetPriorityEXT.ACTIONSET, value.address()); }
    /** Unsafe version of {@link #priorityOverride(int) priorityOverride}. */
    public static void npriorityOverride(long struct, int value) { UNSAFE.putInt(null, struct + XrActiveActionSetPriorityEXT.PRIORITYOVERRIDE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrActiveActionSetPriorityEXT.ACTIONSET));
    }

    // -----------------------------------

    /** An array of {@link XrActiveActionSetPriorityEXT} structs. */
    public static class Buffer extends StructBuffer<XrActiveActionSetPriorityEXT, Buffer> implements NativeResource {

        private static final XrActiveActionSetPriorityEXT ELEMENT_FACTORY = XrActiveActionSetPriorityEXT.create(-1L);

        /**
         * Creates a new {@code XrActiveActionSetPriorityEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrActiveActionSetPriorityEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrActiveActionSetPriorityEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrActiveActionSetPriorityEXT#actionSet} field. */
        @NativeType("XrActionSet")
        public long actionSet() { return XrActiveActionSetPriorityEXT.nactionSet(address()); }
        /** @return the value of the {@link XrActiveActionSetPriorityEXT#priorityOverride} field. */
        @NativeType("uint32_t")
        public int priorityOverride() { return XrActiveActionSetPriorityEXT.npriorityOverride(address()); }

        /** Sets the specified value to the {@link XrActiveActionSetPriorityEXT#actionSet} field. */
        public XrActiveActionSetPriorityEXT.Buffer actionSet(XrActionSet value) { XrActiveActionSetPriorityEXT.nactionSet(address(), value); return this; }
        /** Sets the specified value to the {@link XrActiveActionSetPriorityEXT#priorityOverride} field. */
        public XrActiveActionSetPriorityEXT.Buffer priorityOverride(@NativeType("uint32_t") int value) { XrActiveActionSetPriorityEXT.npriorityOverride(address(), value); return this; }

    }

}